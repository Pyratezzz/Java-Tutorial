package Examples.DataStructure;

import java.util.LinkedHashMap;


public class LinkedHashMapExample {
    public static void main(String[] args){
        LinkedHashMap<String,Long> phonebook = new LinkedHashMap(4,.75f, true);
        phonebook.put("John Doe", 9690999999L );
        phonebook.put("Jane Doe", 1234567890L);
        phonebook.put("Kevin", 12345L);
        phonebook.put("Jill", 98765L);
        phonebook.put("Brenda", 123123L);
        phonebook.put("Gary", 22222L);

        // Order Map
        System.out.println(phonebook);


    }
}
