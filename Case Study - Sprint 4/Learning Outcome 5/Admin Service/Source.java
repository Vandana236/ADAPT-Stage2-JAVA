import java.util.Scanner;

interface AdminService {
   public Toy searchToy(int id);
}

interface CustomerService {
   public Customer searchCustomer(int id);
}

class Customer {
   private int customerId;
   private String customerName;
   private String email;
   private String password;
   private String address;

   public Customer() {

   }

   public Customer(int customerId, String customerName, String email, String password, String address) {
      super();
      this.customerId = customerId;
      this.customerName = customerName;
      this.email = email;
      this.password = password;
      this.address = address;
   }

    public int getCustomerId() {
        return this.customerId;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public String toString() {
        return "Id: " + this.customerId + "\nName: " + this.customerName;
    }
}

class Toy {
   private int toyId;
   private String toyName;
   private String toyType;
   private int minAge;
   private int maxAge;
   private double price;
   private int quantity;
   private int rentalAmt;
   private int refundableDeposit;
   public String toString;

   public Toy() {

   }

   public Toy(int toyId, String toyName, String toyType, int minAge, int maxAge, double price, int rentalAmt,
         int refundableDeposit, int quantity) {
      this.toyId = toyId;
      this.toyName = toyName;
      this.toyType = toyType;
      this.minAge = minAge;
      this.maxAge = maxAge;
      this.price = price;
      this.rentalAmt = rentalAmt;
      this.refundableDeposit = refundableDeposit;
      this.quantity = quantity;
      this.toString = "Id: " + this.toyId + "\nToyName: " + this.toyName;
   }

   public int getToyId() {
      return this.toyId;
   }

   public String getToyName() {
      return this.toyName;
   }

   public String toString() {
      return "Id: " + this.toyId + "\nToyName: " + this.toyName;
   }
}

class CustomerServiceImpl extends Customer implements CustomerService {
   public static Customer[] customerArray = new Customer[5];

   public CustomerServiceImpl() {
      customerArray[0] = new Customer(100, "Krithick","krithick@gmail.com","krithi","Bangalore");
      customerArray[1] = new Customer(101, "Rajan","rajan@gmail.com","rajan#345","Bangalore");
      customerArray[2] = new Customer(102, "Chandrav","chand@gmail.com","wel$234","Chennai");
      customerArray[3] = new Customer(103, "Ankit","ankit@gmail.com","kit@56","Mumbai");
      customerArray[4] = new Customer(104, "Akilan","akilan@gmail.com","ak*76","Pune");
   }

    public Customer searchCustomer(int id) {
        for (int i = 0; i < 5; i++) {
            if (customerArray[i].getCustomerId() == id) {
                return customerArray[i];
            }
        }
        return null;
    }
   
}

class AdminServiceImpl implements AdminService {
   static Toy availableToys[] = new Toy[5];
   Toy toy = new Toy();

   AdminServiceImpl() {
      availableToys[0] = new Toy(120, "Rubber Ducky", "Toy", 1, 3, 200, 20, 20, 200);
      availableToys[1] = new Toy(130, "Car", "Toy", 1, 5, 100, 30, 20, 100);
      availableToys[2] = new Toy(150, "Kite", "Toy", 3, 8, 100, 50, 20, 50);
      availableToys[3] = new Toy(180, "Airplane", "Toy", 4, 7, 500, 30, 50, 20);
    }

    public Toy searchToy(int id) {
        for (int i = 0; i < 4; i++) {
            if (availableToys[i].getToyId() == id) {
                return availableToys[i];
            }
        }
        return null;
    }
}

public class Source {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int ch=sc.nextInt();
    int id=sc.nextInt();
    sc.close();
    switch(ch) {
    case 1:  CustomerService customerService=new CustomerServiceImpl();
       Customer customer=customerService.searchCustomer(id);
       System.out.println(customerService.toString());
       break;
    case 2:  AdminService adminService=new AdminServiceImpl();
       Toy toy=adminService.searchToy(id);
       System.out.println(toy.toString());
       break;
    default: System.out.println("Invalid Choice");
    }
   }
}
