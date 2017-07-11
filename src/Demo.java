import static com.config.ConfigurationUtils.GRAMMAR_FOLDER;
import static com.config.ConfigurationUtils.INPUT_FOLDER;
import static com.config.ConfigurationUtils.GRAMMAR_NAME;
import static com.config.ConfigurationUtils.GRAMMAR_RULE_NAME;
import static com.config.ConfigurationUtils.getProperty;
import static com.config.ConfigurationUtils.loadConfiguration;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.Tool;
import org.antlr.v4.tool.ErrorType;

public class Demo {

	

	

	public static void main(String[] args) throws Exception {
		loadConfiguration(args);
		generateJavaFiles();
        compileJavaFiles();
        generateOuput();
		
		
	}

	private static void generateJavaFiles() throws Exception {
		String[] toolInputArgs = getToolInputArgs();
		Tool antlr = new Tool(toolInputArgs);
		if (toolInputArgs.length == 0) {
			antlr.help();
			antlr.exit(0);
		}

		try {
			antlr.processGrammarsOnCommandLine();
		} finally {
			if (antlr.log) {
				try {
					String logname = antlr.logMgr.save();
					System.out.println("wrote " + logname);
				} catch (IOException ioe) {
					antlr.errMgr.toolError(ErrorType.INTERNAL_ERROR, ioe);
				}
			}
		}
	}
//private static String path =  "antlr-4.7-complete.jar";
	private static String path = "/usr/local/lib/" + File.separator + "antlr-4.7-complete.jar";

	private static void generateOuput() throws Exception {
		try {
			String ruleName = getProperty(GRAMMAR_RULE_NAME);
			String grammarName = getProperty(GRAMMAR_NAME);

			Runtime rt = Runtime.getRuntime();
			List<String> cmd = new ArrayList<String>();

			cmd.add("java");
			// cmd.add("-cp");
			// cmd.add("." + File.pathSeparator + path + File.pathSeparator+
			// getProperty(GRAMMAR_FOLDER) + File.separator);
			cmd.add("org.antlr.v4.gui.TestRig");
			cmd.add(grammarName);
			cmd.add(ruleName);

			cmd.add(getProperty(INPUT_FOLDER) + File.separator + "input.txt");
			cmd.add("-tree");
			Process proc = rt.exec(cmd.toArray(new String[cmd.size()]));// rt.exec("javac
																		// -cp
																		// .:/usr/local/lib/antlr-4.5.3-complete.jar
																		// /home/synerzip/source-code/pankaj-repos/antlr_io/grammar/MONGOParser.java");
			int exitVal = proc.waitFor();
			System.out.println("Process exitValue: " + exitVal);
			int len;
			if ((len = proc.getErrorStream().available()) > 0) {
				byte[] buf = new byte[len];
				proc.getErrorStream().read(buf);
				System.err.println("Command error:\t\"" + new String(buf) + "\"");
			}
			InputStream is = proc.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader buff = new BufferedReader(isr);

			String line;
			while ((line = buff.readLine()) != null)
				System.out.print(line);

		} catch (Throwable t) {
			t.printStackTrace();
			throw t;
		}
	}

	private static void compileJavaFiles() throws Exception {
		List<String> javaFiles = getJavaFilesForCompilation();
		try {
			Runtime rt = Runtime.getRuntime();
			List<String> cmd = new ArrayList<String>();
			// cmd.add("export");

			cmd.add("javac");
			cmd.add("-cp");
			cmd.add("." + File.pathSeparator + path);
			for (String file : javaFiles) {
				cmd.add(file.trim());

			}
			// cmd.add("/home/synerzip/source-code/pankaj-repos/antlr_io/grammar/MONGOLexer.java");
			// cmd.add("/home/synerzip/source-code/pankaj-repos/antlr_io/grammar/MONGOParser.java");

			// cmd.add("/home/synerzip/source-code/pankaj-repos/antlr_io/grammar/MONGOParserBaseListener.java");

			Process proc = rt.exec(cmd.toArray(new String[cmd.size()]));// rt.exec("javac
																		// -cp
																		// .:/usr/local/lib/antlr-4.5.3-complete.jar
																		// /home/synerzip/source-code/pankaj-repos/antlr_io/grammar/MONGOParser.java");
			int exitVal = proc.waitFor();
			System.out.println("Process exitValue: " + exitVal);
			int len;
			if ((len = proc.getErrorStream().available()) > 0) {
				byte[] buf = new byte[len];
				proc.getErrorStream().read(buf);
				System.err.println("Command error:\t\"" + new String(buf) + "\"");
			}
		} catch (Throwable t) {
			t.printStackTrace();
			throw t;
		}

	}
	private static List<String> getJavaFilesForCompilation() throws Exception {
		List<String> javaFiles = new ArrayList<>();
		Files.find(Paths.get(getProperty(GRAMMAR_FOLDER)), 999, (p, bfa) -> bfa.isRegularFile()).forEach(f -> {

			String path = f.toAbsolutePath().toString();
			
			String fileName = f.getFileName().toString();
			String extension = fileName.substring(fileName.lastIndexOf(".") + 1, fileName.length());
			if ("java".equals(extension)) {
				System.out.println("java file : " + path);
				javaFiles.add(path);
			}
		});
		return javaFiles;
	}

	private static String[] getToolInputArgs() throws Exception {
		String grammarPath = getProperty(GRAMMAR_FOLDER);
		List<String> arguments = new ArrayList<>();
		arguments.add("-o");
		arguments.add(grammarPath);

		

		Files.find(Paths.get(grammarPath), 999, (p, bfa) -> bfa.isRegularFile()).forEach(f -> {

			String path = f.toAbsolutePath().toString();
			System.out.println(path);
			String fileName = f.getFileName().toString();
			String extension = fileName.substring(fileName.lastIndexOf(".") + 1, fileName.length());
			if ("g4".equals(extension)) {
				arguments.add(path);
			}
		});
		int argLength = 0;
		String[] input = new String[arguments.size()];
		for (String item : arguments) {
			input[argLength++] = item;
		}

		return input;
	}
}
