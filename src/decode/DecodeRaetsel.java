package decode;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class DecodeRaetsel {

  public static void main(String[] args) {
    int key = 0; // Hier Fehlenden Schlüssel eingeben
    // Ab hier nichts mehr Anfassen!!
    decode(key);
  }

  public static void decode(int key) {
    ArrayList<Integer> arrToDecode = new ArrayList<>();
    String line;
    String text = "";
    try {
      BufferedReader reader =
          new BufferedReader(new FileReader("C:\\Users\\workspace\\EscapeRoomFI24\\src\\textFiles\\chiffreCode"));
      while (null != (line = reader.readLine())) {
        text = line;
        for (int i = 0; i < text.toCharArray().length; i++) {
          char a = text.toCharArray()[i];
          arrToDecode.add(a - 48);

        }
      }
    } catch (IOException e) {
      e.printStackTrace();
    }

    DecoderRaetsel decoder = new DecoderRaetsel(key, arrToDecode);

    System.out.println(decoder.decodeNrOne());
    System.out.println(decoder.decodeNrTwo());
    System.out.println(decoder.decodeNrThree());
    System.out.println(decoder.decodeNrFour());
    System.err.println(arrToDecode);
  }
}
