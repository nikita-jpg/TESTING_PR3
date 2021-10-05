import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;

public class CompleteDestruction {
    public static void main(String[] args) {

    }

    public void recursiveDelete(File file){

    }

    public void deleteFile(File file){

    }

    public void overwriteFile(File file, String str){
        // Создание объекта FileWriter
        FileWriter writer = null;
        try {
            writer = new FileWriter(file);

            // Запись содержимого в файл
            writer.write(str);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
