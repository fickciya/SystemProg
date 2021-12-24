import java.io.*;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class DownloadImage {
    private static final String picture = "src\\inFile.jpg";
    private static final String picture1 = "src\\com\\company\\file.txt";

    public static void main(String[] args) throws IOException {
        InputStream url = new URL("http://risovach.ru/upload/2015/05/mem/v-mire-grustit-odin-kotik_81461258_orig_.jpg").openStream();
        Files.copy(url, Path.of(picture), StandardCopyOption.REPLACE_EXISTING);
    }
}