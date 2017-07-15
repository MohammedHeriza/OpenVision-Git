/**
 * Created by OV_Lab2-7 on 7/1/2017.
 */
public class OpenVision {

    public static void main(String[] args) {
        Person P1 = new Person();
        Person P2 = new Person();
//        int x=2016;
//        System.out.println("My name is " + P1.FirstName + " " + P1.LastName + " Iam " + P1.ismale + " My age is " +
//                P1.claculateAge(x));
//        P1.talk();
//         System.out.print( P2.FirstName + " ");
//         P2.walk();
//
//        P2.FirstName = "Ayman";
//        P2.DateBirth = 1995;
        P1.settDateBirth(2000);
        System.out.println(P1.getDateBirth());
//        System.out.println(P2.FirstName + " " + P2.claculateAge(x));
    }
}
