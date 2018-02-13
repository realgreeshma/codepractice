
 class CarOwner
        {
            private int custId;
            private String ownerName;

            public void setCustId(int id)
            {
                custId = id;
            }
            public  int getCustId()
            {
                System.out.println("Accessing Customer id");;
                return custId;
            }
            public void setOwnerName(String str)
            {
                ownerName = str;
            }

            public String getOwnerName() {
                System.out.println("User is accessing data");
                return ownerName;
            }
        }
//Accessing the data through methods is good practice.
 //Encapsulation is binding the data with methods
 //We can maintain a log file
   //It is always better to access variable through methods

public class EncapsulationDemo {
    public static void main(String[] args)
    {

        CarOwner owner = new CarOwner();
        owner.setCustId(3);
       // owner.getCustId();

       owner.setOwnerName("Hanuman");
        //owner.getOwnerName();

        System.out.println(owner.getCustId() + " \n "+ owner.getOwnerName());
    }


}
