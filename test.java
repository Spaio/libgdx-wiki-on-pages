

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {


	// TO-DO строки надо транковать для ссылок
	// Сделать для смежных |


	public static void main(String[] args) {
		File[] files = new File("wiki_src/").listFiles();
		for (File file : files) {
			if (file.isFile()) {
				if (file.getName().matches(".*\\.md")) {
					try {
						System.out.println("Processing " + file.getName());

						String content = new String(Files.readAllBytes(Paths.get(file.getPath())));
						Pattern p = Pattern.compile("\\[\\[(.*?)\\|(.*?)\\]\\]");
						Matcher m = p.matcher(content);
						StringBuffer sb = new StringBuffer();

						while (m.find()) {
							// Source format:
							// [[Top Article]]

							// Target format:
							// [Top Article](top-article)

							// There could be links with extra spaces at sides
							// Actual files dont have it
							// Title is a file link
							String title = m.group(1).trim();

							// All files force lowercased.
							// There were different formats used like [[Top Article]]
							// meanwhile file is Top-article
							String link = m.group(2).trim().toLowerCase();

							// Replacing spaces from title to dashes
							link = link.replaceAll(" ", "-");

							m.appendReplacement(sb, "[" + title + "](" + link + ")");
						}
						m.appendTail(sb);

						content = sb.toString();

						p = Pattern.compile("\\[\\[(.((?!\\|).)*)\\]\\]");
						m = p.matcher(content);
						sb = new StringBuffer();

						while (m.find()) {
							// Source format:
							// [[Top Article]]

							// Target format:
							// [Top Article](top-article)

							// There could be links with extra spaces at sides
							// Actual files dont have it
							// Title is a file link
							String title = m.group(1).trim();

							// All files force lowercased.
							// There were different formats used like [[Top Article]]
							// meanwhile file is Top-article
							String link = title.toLowerCase();

							// Replacing spaces from title to dashes
							link = link.replaceAll(" ", "-");

							m.appendReplacement(sb, "[" + title + "](" + link + ")");
						}
						m.appendTail(sb);

						byte[] strToBytes = sb.toString().getBytes();

						String filename = file.getName();

						if (filename.equals("Home.md")) {
							filename = "index.md";
						}

						if (filename.startsWith("_")) {
							filename = filename.substring(1).toLowerCase();
							Files.write(Paths.get("_includes/" + filename), strToBytes);
						} else {
							Files.write(Paths.get("wiki/" + filename.toLowerCase()), strToBytes);
						}

					} catch (IOException e) {
						e.printStackTrace();
					}
					//break;
				}
			}
		}

	}


}