package decode;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Random;

public class randomLetterGenerator {

  public static void main(String[] args) {
    char[] alphabet = { '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    String text = "";
    Random r = new Random();
    String s = "";

    try {
      Path file = Path.of("D:\\home\\jee\\Decode\\src\\textFiles\\chiffreCode");
      for (int i = 0; i < 100; i++) {
        for (int j = 0; j < 100; j++) {
          text = text + alphabet[r.nextInt(9)];
          System.out.println(text);
        }
        s = Files.readString(file);
        Files.writeString(file, text + "\n" + s);
        text = "";
      }
    } catch (Exception e) {
      System.out.println(e);
    }
  }

}
