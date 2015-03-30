package common;

import java.util.Map;
import java.util.TreeMap;

public class LabActivity3 {
    
    public static void main(String[] args) {
//        this.empID = empID;
//        this.lastName = lastName;
//        this.firstName = firstName;
//        this.ssn = ssn;
        
        Employee e1 = new Employee(10, "White", "Walt", "111-11-1111");
        Employee e2 = new Employee(18, "Brown", "Amanda", "222-22-2222");
        Employee e3 = new Employee(12, "Smith", "Jason", "333-33-3333");
        Employee e4 = new Employee(20, "Jones", "Jake", "333-33-3333");       
        Map<String,Employee> treeMap = new TreeMap<>();
        
        treeMap.put(e1.getSsn(), e1);
        treeMap.put(e2.getSsn(), e2);
        treeMap.put(e3.getSsn(), e3);
        treeMap.put(e4.getSsn(), e4);
        
        for(String key : treeMap.keySet()) {
           Employee mKey = treeMap.get(key);
            System.out.println(mKey.toString());
        
        
        
    }
        
    }
    
}