package youtube;

import java.io.*;

public class LessonSerializacion {
    public static void main(String[] args) throws Exception{
        UserChild user = new UserChild();
        user.liveLevel = 55;
        Sord sord = new Sord();
        sord.level = 5;
        user.sord = sord;
        user.childLevel = 65;


        FileOutputStream fileOutputStream = new FileOutputStream("tempFile");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(user);
        objectOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream("tempFile");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        UserChild newUser = (UserChild) objectInputStream.readObject();
        objectInputStream.close();
        System.out.println(newUser.liveLevel);
        System.out.println(newUser.sord);
        System.out.println(newUser.childLevel);
    }
}
