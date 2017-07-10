import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.antlr.v4.Tool;

public class Demo {

	static final Properties configProperties = new Properties();
	static final String GRAMMAR_FOLDER_INPUT = "antlr.grammar.folder";

	private static void loadConfiguration(String[] args) throws Exception {
		String file = null;;
		for (int i = 0; i < (args.length - 1); i++) {
			if (args[i].equals("--configpath")) {
				if (args[i + 1] != null && new File(args[i + 1].trim()).isFile()) {
					file = args[i + 1] ;

				}
				break;
			}
		}
		if (file==null || file.trim() == "") {

			throw new Exception(
					"specify --configpath as command line argument followed by path to configuration file..\n e.g --configpath /home/filename.properties");
		}
		InputStream inputStream = null;

		try {

			inputStream = new FileInputStream(file);

			// load a properties file
			configProperties.load(inputStream);

			// get the property value and print it out
			System.out.println(configProperties.getProperty(GRAMMAR_FOLDER_INPUT));

		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (inputStream != null) {
				try {
					inputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static void main(String[] args) throws Exception {
		loadConfiguration(args);
		String[] input = new String[4];
		String outputPath = "/home/synerzip/antlr4-ws/antlr4-dev";
		input[0] = "-o";
		input[1] = outputPath;
		input[2] = "/home/synerzip/source-code/pankaj-repos/ANTLR/MONGOLexer.g4";
		input[3] = "/home/synerzip/source-code/pankaj-repos/ANTLR/MONGOParser.g4";
		Tool.main(input);
	}
}
