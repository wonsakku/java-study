package chap02._2_3_exam_program._1_before_refactoring;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) throws IOException {
        SimpleDatabase db = new SimpleDatabase(new FileReader("2.3.1.dbfile.txt"));
        Iterator<String> it = db.iterator();

        while(it.hasNext()){
            String key = it.next();
            System.out.println("KEY: \"" + key + "\"");
            System.out.println("VALUE: \"" + db.getValue(key) + "\"");
            System.out.println();
        }
    }
}
