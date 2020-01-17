package taskA;
import org.w3c.dom.Text;

import java.io.*;
import java.util.Scanner;

public class TextClass {
    public static String writeWithoutSpace(String fileName) throws IOException {
        FileReader fileReader = new FileReader(fileName);
        Scanner sc = new Scanner(fileReader);
        String something = sc.nextLine().replace( " ", "");
        fileReader.close();
        return something;
    }

    public static void isWeightOver100(File file){
        if(file.length() >= 100){
            System.out.println("Код слишком большой");
            throw new IllegalStateException();
        }
    }

    public static void isThereSuchFile(File file){
        if(file.exists()){
        } else {
            try {
                throw new FileNotFoundException();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("task_A_1.txt");
        fileWriter.write("Я не понял    какой текущий код должен был вписать :(");
        fileWriter.close();



        File file = new File("D:/hw33/task_A_1.txt");
        isThereSuchFile(file);
        isWeightOver100(file);

        FileWriter fileWriter1 = new FileWriter("task_A_2.txt");
        fileWriter1.write(writeWithoutSpace("task_A_1.txt"));
        fileWriter1.close();
    }
}