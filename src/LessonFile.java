import java.io.*;

public class LessonFile {
    public static void main(String[] args) throws IOException {
        File file = new File("temp.txt");
        if (!file.exists())
            //file.mkdir();
            file.createNewFile();

        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write("str1\n");
        fileWriter.write("str2\n");
        fileWriter.flush();
//        fileWriter.close();
//
        FileReader fileReader = new FileReader(file);
//        char [] chars = new char[20];
//        fileReader.read(chars);
//        System.out.println(chars);

        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("");
        bufferedWriter.newLine();
        bufferedWriter.write("str4");
        bufferedWriter.flush();
        bufferedWriter.close();

        BufferedReader bufferedReader = new BufferedReader(fileReader);
        while (bufferedReader.ready()){
            System.out.println(bufferedReader.readLine());
        }


    }
}
