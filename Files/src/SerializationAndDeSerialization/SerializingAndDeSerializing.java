package SerializationAndDeSerialization;

import java.io.*;

class Print implements Serializable{
    volatile String message;
    transient String message1;
}

public class SerializingAndDeSerializing {
    public static void main(String[] args){
        try{
            FileOutputStream fout = new FileOutputStream("R:\\JavaFolders\\IO\\ProgramsDoneByMe\\SerializingAndDeserializing\\SerializationAndDeSerialization.txt");
            ObjectOutputStream objOut = new ObjectOutputStream(fout);
            Print msg = new Print();
            msg.message = "Hello!";
            msg.message1 = "World";
            objOut.writeObject(msg);
            System.out.println("Successfully saved the state of the object.");
            fout.close();
            msg.message= "Rohith";  // Here message has been changed but the saved state still has the message Hello!
        }catch(Exception exception){
            exception.printStackTrace();
        }

        try{
            FileInputStream fin = new FileInputStream("R:\\JavaFolders\\IO\\ProgramsDoneByMe\\SerializingAndDeserializing\\SerializationAndDeSerialization.txt");
            ObjectInputStream objIn = new ObjectInputStream(fin);
            Print msg = (Print)objIn.readObject();
            System.out.println(msg.message);
            System.out.println(msg.message1);   // transient variables aren't serialized
        }catch (IOException | ClassNotFoundException exception){
            System.out.println(exception);
        }
    }
}
