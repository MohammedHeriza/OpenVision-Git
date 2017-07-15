/**
 * Created by OV_Lab2-7 on 7/14/2017.
 */
public class Person {
    //attribute
   private String FirstName;
    private String LastName;
    private int DateBirth;
    private String Address;
    private Boolean ismale;

    public Person(){
        FirstName = "Mohammed";
        LastName="Saeed";;
        DateBirth = 1990;
       Address=  "cairo";;
        ismale = true;
    }
    public Person(String FirstName,String LastName,int DateBirth){
        this.FirstName=FirstName;
        this.LastName=LastName;
        this.DateBirth=DateBirth;
    }


    //method
    public void setFirstName(String firstName){
        this.FirstName= firstName;
    }
    public void settDateBirth(int dateBirth) {
        this.DateBirth = dateBirth;
    }

    public int getDateBirth(){
        return DateBirth;

    }


}
