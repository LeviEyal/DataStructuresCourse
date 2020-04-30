import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * hkd
 */
public class hkd {

    public static void main(String[] args) {
        File f = new File("C:\\Users\\happy\\outpt3.txt");
        Scanner in = new Scanner(System.in);
        try {
            in = new Scanner(f);
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        }
        int countPos=0;
        int countNeg=0;
        int countAll=0;
        ArrayList<String> pos = new ArrayList<>();
        ArrayList<String> neg = new ArrayList<>();
        while(in.hasNext()){
            String t = in.next();
            int e = t.length()-t.replace("e", "").length();
            if(e%2==0){
                countPos++;
                pos.add(t);
            } 
            else {
                countNeg++;
                neg.add(t);
            }
            countAll++;
        }
        System.out.println("all: "+countAll+" pos: "+countPos+" neg: "+countNeg);
        System.out.println("pos: "+pos.toString());
        System.out.println("neg: "+neg.toString());
    }
}