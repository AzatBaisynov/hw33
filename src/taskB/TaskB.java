package taskB;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TaskB {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("task_B.txt");
        fileWriter.write("1. Как вы понимаете исключения(exception)?\nЭто способ научить прогу правильно реагиро-\n" +
                "вать на ошибки. Как я понял это может понадобиться в будущем чтобы ошибки вписывались в логи и т.д.\n" +
                "2. Какие исключения вы встречали?\n" +
                "NullPointerException, IOException и др.\n" +
                "3. Что вы знаете о классе Exception\n" +
                "это базовый класс от которого наследуются исключения.\n" +
                "4. Что будет если не обработать исключение?\n" +
                "Если не обработать контролируемые исключения, то программа не сможет скомпилироваться, чтобы пользова-\n" +
                "тель понимал в чем ошибка, чтобы в логи высвечивало в чем ошибка.\n" +
                "5. Объясните, как работает структура try - catch\n" +
                "try {метод или объект} дает понять какой именно участок нужно проверить, а catch {ошибка или исключение}\n" +
                "дает понять какую именно ошибку мы ищем.");
        fileWriter.close();

        FileReader fileReader = new FileReader("task_B.txt");
        Scanner sc = new Scanner(fileReader);
        while (sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }
    }
}
