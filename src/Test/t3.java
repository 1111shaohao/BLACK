package Test;
import com.sun.media.jfxmediaimpl.HostUtils;

import java.util.Scanner;
public class t3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=sc.nextInt();
        if(i>=85)
        {
            System.out.println("A");
        }
        else  if(i<85&i>=60)
        {
            System.out.println("B");
        }
       else
        {
            System.out.println("C");
        }

    }
}
