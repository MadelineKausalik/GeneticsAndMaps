package common;

import java.util.HashMap;
import java.util.Map;

public class LabActivity2 {
    
    public static void main(String[] args) {
//        this.empID = empID;
//        this.lastName = lastName;
//        this.firstName = firstName;
//        this.ssn = ssn;
        
        Employee e1 = new Employee(10, "White", "Walt", "111-11-1111");
        Employee e2 = new Employee(11, "Brown", "Amanda", "222-22-2222");
        Employee e3 = new Employee(12, "Smith", "Jason", "333-33-3333");
        Employee e4 = new Employee(13, "Jones", "Jake", "333-33-3333");
        
        Map<String,Employee> map = new HashMap<>();
        
        map.put(e1.getSsn(), e1);
        map.put(e2.getSsn(), e2);
        map.put(e3.getSsn(), e3);
        map.put(e4.getSsn(), e4);
        
        for(String key : map.keySet()) {
        Employee mKey = map.get(key);
        System.out.println(mKey.toString());
        
        
        
    }
    
    
}}