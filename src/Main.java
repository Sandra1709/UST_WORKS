//import java.io.*;
//import java.lang.String;
//
////TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
//// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//public class Main {
//    public static void main(String[] args) {
//        String content= args[0];
//
//try
//{
//    FileWriter write = new FileWriter("info.txt");
//    BufferedWriter wr = new BufferedWriter(write);
//    wr.write(content);
//
//    char ch1 = 'a';
//    while(content ==  ch1)
//        try{
//            FileReader rea = new FileReader("info.txt");
//            BufferedReader buff = new BufferedReader(rea);
//            String line =buff.readLine();
//            while(line!=null)
//            {
//                System.out.print(line);
//                line =buff.readLine();
//            }
//
//        }
//    catch(IOException e)
//    {
//        throw new RuntimeException(e);
//    }
//}
//   catch(IOException e)
//   {
//   throw new RuntimeException( e);
//   }
//    }
//}
import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" Type 'a' to stop");
        StringBuilder input = new StringBuilder();
        String content;


        while (true) {
            content = sc.nextLine();
            if ("a".equals(content)) {
                break;
            }
            input.append(content).append("\n");
        }

        sc.close();

        try {

            FileWriter writer = new FileWriter("info.txt");
            BufferedWriter wr = new BufferedWriter(writer);
            wr.write(input.toString());
            wr.close();


            FileReader reader = new FileReader("info.txt");
            BufferedReader buff = new BufferedReader(reader);

            String line = buff.readLine();
            while (line != null) {
                System.out.println(line);
                line = buff.readLine();
            }

            buff.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
