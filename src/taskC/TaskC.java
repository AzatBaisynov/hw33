package taskC;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TaskC {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("task_C.txt");
        fileWriter.write("1. Как вы понимаете Error? RuntimeException? CheckedException?\n" +
                "Error - это исключение которое не видно компилятором и не всегда его нужно предупреждать.\n" +
                "RuntimeException - непроверенное исключение возникающие во время выполнения программы.\n" +
                "это ошибки допущенные самим программистом\n" +
                "CheckedException - это ошибки которые должны проверяться try - catch обязательно.\n" +
                "2. Для чего применяется throw?\n" +
                "переводится как кинуть, бросить. То есть используется для вывода ошибки.\n" +
                "3. Разница между Unchecked Exceptions & Checked Exceptions?\n" +
                "Checked обязаны быть обработаны блоком try catch и должны быть указаны в сигнатуре,\n" +
                "а unchecked не всегда должны быть обработаны, unchecked наследуется от RuntimeExcpetion\n" +
                "checked от Exception\n" +
                "4. Как вы понимаете блоки try, catch, finally?\n" +
                "Трай нужен чтобы указать в чем мы будем искать ошибку, Кетч ловит эту ошибку и выводит, то что мы зададим\n" +
                "файнелли производит те действия что мы зададим даже если программа выдаст ошибку\n" +
                "5. Почему при множественном catch, сначала используем более детальные Exceptions, и только\n" +
                "потом переходим к родителям?\n" +
                "Наверное чтобы точно понять в чем заключается ошибка, если указать что то не точное, то теряется смысл");
        fileWriter.close();

        FileReader fileReader = new FileReader("task_C.txt");
        Scanner sc = new Scanner(fileReader);
        while(sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }
    }
}
