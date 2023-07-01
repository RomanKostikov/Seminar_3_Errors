package classwork.task004;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//public class FileReaderExample1 {
//    // То как нужно
//        public static void main(String[] args) {
//        try {
//            DataProcessor.processData("data.txt");
//        } catch (FileReadException e) {
//            System.out.println("Ошибка чтения файла: " + e.getMessage());
//        } catch (DataProcessingException e) {
//            System.out.println("Ошибка обработки данных: " + e.getMessage());
//            sendErrorReportToAdmin();
//        }
//    }
//
//    public static void sendErrorReportToAdmin() {
//        System.out.println("Отправка отчета об ошибке администратору");
//        // Логика отправки отчета об ошибке администратору
//    }
//}

//class DataProcessor {
//    public static void processData(String filename) throws FileReadException, DataProcessingException {
//        try {
//            String data = FileReader.readFile(filename);
//            // Обработка данных
//            if (data == null) {
//                throw new DataProcessingException("Ошибка обработки данных: неверный формат");
//            }
//            System.out.println("Данные успешно обработаны");
//        } catch (FileReadException e) {
//            throw e;
//        } catch (DataProcessingException e) {
//            throw e;
//        }
//    }
//}
//
//class FileReader {
//    public static String readFile(String filename) throws FileReadException {
//        String data = null;
//        BufferedReader reader = null;
//        try {
//            reader = new BufferedReader(new FileReader(filename));
//            data = reader.readLine();
//        } catch (FileNotFoundException e) {
//            throw new FileReadException("Ошибка чтения файла: файл не найден");
//        } catch (IOException e) {
//            throw new FileReadException("Ошибка чтения файла: ошибка ввода-вывода");
//        } finally {
//            try {
//                if (reader != null) {
//                    reader.close();
//                }
//            } catch (IOException e) {
//                throw new FileReadException("Ошибка закрытия файла: ошибка ввода-вывода");
//            }
//        }
//        return data;
//    }
//}
//
//class FileReadException extends Exception {
//    public FileReadException(String message) {
//        super(message);
//    }
//}
//
//class DataProcessingException extends Exception {
//    public DataProcessingException(String message) {
//        super(message);
//    }
//}
