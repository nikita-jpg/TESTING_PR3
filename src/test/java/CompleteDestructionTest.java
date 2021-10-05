import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class CompleteDestructionTest {

    @Test
    void main() {
    }

    @Test
    void recursiveDelete() {
    }

    @Test
    void deleteFile() {
    }

    @Test
    void overwriteFile() {

        // Символы для перезаписи
        String str = "1234";

        // Создаём временный файл для тестирования
        try {
            File file = File.createTempFile("testFile",".txt");
            FileWriter fileWriter = new FileWriter(file, false);

            fileWriter.write(str);
            fileWriter.close();

            Assertions.assertEquals(str, (new FileReader(file).read()));

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}