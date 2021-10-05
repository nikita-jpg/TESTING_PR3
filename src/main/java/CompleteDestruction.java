import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;

public class CompleteDestruction {
    public static void main(String[] args) {
        
    }

    public void recursiveDelete(File file){
        //если это папка, то идем внутрь этой папки и вызываем рекурсивное удаление всего, что там есть
        if (file.isDirectory()) {
            for (File f : file.listFiles()) {
                recursiveDelete(f);
            }
        }

        if(file.isDirectory())
            file.delete();
        else {
            deleteFile(file);
        }
    }

    public void deleteFile(File file){

        overwriteFile(file, "1516516565468");
        overwriteFile(file, "ergkjkregvrekgrek");
        overwriteFile(file, "wef1ew65f4ew6rv4r8e9vg46f");

        file.delete();
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
