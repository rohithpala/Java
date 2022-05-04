package Week10And11;

import java.io.*;
import java.util.*;
import java.util.Map.Entry;

public class DateDemo implements Serializable {
    String name;

    public DateDemo(String name) {
        this.name = name;
    }

    public String toString() {
        return this.name;
    }

    public static void main(String[] args) throws IOException {
        System.out.print("Enter name: ");
        String name = (new Scanner(System.in)).next();
        DateDemo d = new DateDemo(name);
        Date d1 = new Date();
        System.out.println("Date the object created: " + d1);
        Properties storeObject = new Properties();
        String filename = (String.valueOf(d1)).replaceAll(" ", "").replaceAll(":", "").strip();
        File file = new File("R:\\" + filename + ".txt");
        file.createNewFile();
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(d);
        oos.flush();
        oos.close();
        BufferedReader f1 = new BufferedReader(new FileReader("R:/DateClass.txt"));
        String line;
        while ((line = f1.readLine()) != null && !line.isBlank()) {
            String[] words = line.split("-");
            storeObject.put(words[0], words[1]);
        }
        f1.close();
        storeObject.put(d1, "R:\\" + filename + ".txt");
        FileOutputStream os = new FileOutputStream("R:/DateClass.txt");
        String data = "";
        Set<Entry<Object, Object>> entries = storeObject.entrySet();
        for (Entry<Object, Object> entry : entries) {
            Object str = entry.getKey();
            Object value = entry.getValue();
            data += str + "-" + value + "\n";
        }
        os.write(data.getBytes());
        os.flush();
        os.close();
        System.out.print("Do you want the object details based on date [Y/N]: ");
        String YorN = (new Scanner(System.in)).next();
        if (YorN.equalsIgnoreCase("y")) {
            System.out.print("Enter date: ");
            String date1 = (new Scanner(System.in)).nextLine();
            Set<Entry<Object, Object>> entries1 = storeObject.entrySet();
            int flag = 0;
            for (Entry<Object, Object> entry : entries1) {
                Object str = entry.getKey();
                String date11 = String.valueOf(str);
                if (date1.equals(date11)) {
                    flag = 1;
                    String filename1 = date1.replaceAll(" ", "").replaceAll(":", "").strip();
                    File file1 = new File("R:\\" + filename1 + ".txt");
                    FileInputStream fis = new FileInputStream(file1);
                    ObjectInputStream ois = new ObjectInputStream(fis);
                    try {
                        d = (DateDemo) ois.readObject();
                        System.out.println("Name: " + d);
                    } catch (ClassNotFoundException | IOException e) {
                        e.printStackTrace();
                    }
                }
            }
            if (flag == 0)
                System.out.println("Wrong date");
        }
    }
}