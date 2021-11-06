

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {




	public static void main(String[] args) {
		File[] files = new File("wiki_src/").listFiles();
		for (File file : files) {
			if (file.isFile()) {
				if (file.getName().matches(".*\\.md")) {
					try {
						System.out.println("Processing " + file.getName());
						String content = new String(Files.readAllBytes(Paths.get(file.getPath())));
						Pattern p = Pattern.compile("(?<=\\[\\[)(.((?!\\|).)*)(?=\\]\\])");
						Matcher m = p.matcher(content);
						StringBuffer sb = new StringBuffer();
						while (m.find()) {
							String title = m.group(1);
							String link = m.group(1);
							link = link.replaceAll(" ", "-");
							m.appendReplacement(sb, title + "|" + link);
						}
						m.appendTail(sb);
						//System.out.println(sb.toString());

						byte[] strToBytes = sb.toString().getBytes();

						Files.write(Paths.get("wiki/" + file.getName()), strToBytes);

					} catch (IOException e) {
						e.printStackTrace();
					}
					//break;
				}
			}
		}

	}


}