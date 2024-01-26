import org.apache.commons.codec.binary.Base64;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import java.io.File;

public class Main {
    public static void main(String[] args) throws IOException {

        byte[] fileContent = FileUtils.readFileToByteArray(new File("Spiderman.jpg"));
        String encodedString = Base64.encodeBase64String(fileContent);
        System.out.println(encodedString);

        String base64String = encodedString;
        if(Base64.isBase64(base64String)){
            byte[] decodedBytes = Base64.decodeBase64(base64String);
            FileOutputStream fos = new FileOutputStream("imageDecodificiada.jpeg");
            fos.write(decodedBytes);
            fos.close();
        }


    }
}