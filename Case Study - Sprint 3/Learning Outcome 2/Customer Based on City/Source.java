
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Source {
public static  String[] getCustomer(String city)
{ 
    String[][] customer=new String[5][3];
 customer[0][0]="102";
 customer[0][1]="Krithick";
 customer[0][2]="Bangalore";
 
 customer[1][0]="105";
 customer[1][1]="Prabu";
 customer[1][2]="Chennai";
 
 customer[2][0]="252";
 customer[2][1]="Chandrav";
 customer[2][2]="Delhi";
 
 customer[3][0]="205";
 customer[3][1]="Kiran";
 customer[3][2]="Mumbai";
 
 customer[4][0]="202";
 customer[4][1]="Shravan";
 customer[4][2]="Pune";
 
  String[] d=new String[3];
  d=null;
    
   int low = 0;
    int high = 4;
    int mid=0;

    while (low <= high) {
        mid = (low + high) / 2;

        if (customer[mid][2].compareTo(city) < 0) {
            low = mid + 1;
        } else if (customer[mid][2].compareTo(city) > 0) {
            high = mid - 1;
        } else if(customer[mid][2].compareTo(city)==0) {
            d=customer[mid];
            break;
        }
    }
    //System.out.println(mid);
return d;
}
 
    public static void main( String[] args )
 {
     Scanner sc=new Scanner(System.in);
     String c=sc.nextLine();
     String[] a=new String[3];
     Source s=new Source();
     a=s.getCustomer(c);
     System.out.println(a[0] + " " + a[1] + " " + a[2]);
 }
}
