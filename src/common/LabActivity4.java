package common;

import java.util.Set;
import java.util.TreeSet;



public class LabActivity4 {
    
    public static void main(String[] args) {
//        this.empID = empID;
//        this.lastName = lastName;
//        this.firstName = firstName;
//        this.ssn = ssn;
        
        Employee e1 = new Employee(10, "White", "Walt", "111-11-1111");
        Employee e2 = new Employee(18, "Brown", "Amanda", "222-22-2222");
        Employee e3 = new Employee(12, "Smith", "Jason", "333-33-3333");
        Employee e4 = new Employee(20, "Jones", "Jake", "333-33-3333");  
        
        Set treeSet = new TreeSet<>();
        
        treeSet.add(e1);
        treeSet.add(e2);
        treeSet.add(e3);
        treeSet.add(e4);
        
        for(Object ob : treeSet) {
            System.out.println("Employee:  " + ob.toString());
        }
        
    }
    
}