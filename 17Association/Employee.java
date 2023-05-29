package Singha;

public class Employee {
    String name;
    int id;
    EmployeeAddress eAddress; // Aggregation

    // here address is now global,we can use anywhere..

    Employee(String name , int id){
        this.name = name;
        this.id = id;
        eAddress = new EmployeeAddress("Singra", "Magura", 7620);
    }

    void display(){
        System.out.println("Employee name : " +name);
        System.out.println("Employee id : "+id);
        System.out.println("Street number : " +eAddress.Street);
        System.out.println("City name : "+eAddress.city);
        System.out.println("Postal Code is : "+eAddress.postalCode);

    }
}
