package classwork.task004;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//public class FileReaderExample {
//    // не верно!!
//        public static void main(String[] args) {
//        try {
//            DataProcessor.processData("data.txt");
//        } catch (Exception e) {
//            System.out.println("Ошибка: " + e.getMessage());
//        }
//    }
//}
//
//class DataProcessor {
//    public static void processData(String filename) {
//        try {
//            String data = FileReader.readFile(filename);
//            if (data == null) {
//                throw new Exception("Ошибка обработки данных: неверный формат");
//            }
//            System.out.println("Данные успешно обработаны");
//        } catch (FileNotFoundException e) {
//            System.out.println("Ошибка чтения файла: файл не найден");
//        } catch (IOException e) {
//            System.out.println("Ошибка чтения файла: ошибка ввода-вывода");
//        } catch (Exception e) {
//            System.out.println("Ошибка обработки данных: " + e.getMessage());
//        }
//    }
//}
//
//class FileReader {
//    public static String readFile(String filename) throws FileNotFoundException, IOException {
//        String data = null;
//        BufferedReader reader = null;
//        try {
//            reader = new BufferedReader(new FileReader(filename));
//            data = reader.readLine();
//        } finally {
//            if (reader != null) {
//                reader.close();
//            }
//        }
//        return data;
//    }
//
//}
