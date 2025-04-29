import java.sql.SQLOutput;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        MyHashTable<MyTestingClass, Student> table = new MyHashTable<>(100);
        Random random = new Random();
        for (int i = 0; i < 10000; i++) {
            int id = random.nextInt(10000);
            String name = "abvgd" + random.nextInt(10000);
            MyTestingClass testingClass = new MyTestingClass(id, name);
            Student student = new Student("Student" + i,random.nextInt(1000));
            table.put(testingClass, student);
        }
        for (int i = 0; i < 100; i++) {
            System.out.println("Bucket number " + i + " have this number "+ table.bucketSize(i)+"of elements" );
        }

    }
}