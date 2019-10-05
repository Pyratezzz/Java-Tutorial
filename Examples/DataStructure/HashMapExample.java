package Examples.DataStructure;

import java.util.HashMap;


public class HashMapExample {
    public static void main(String[]args)
    {
        HashMap<String,Long> phonebook = new HashMap<>();
        phonebook.put("John Doe", 9690999999L );
        phonebook.put("Jane Doe", 1234567890L);
        phonebook.put("Kevin", 12345L);
        phonebook.put("Jill", 98765L);
        phonebook.put("Brenda", 123123L);
        phonebook.put("Gary", 22222L);

        if( phonebook.containsKey("John Doe")){
           System.out.println(phonebook.get("John Doe"));
       }

        //Unordered Map
       System.out.println(phonebook);

       phonebook.clear();

       System.out.println(phonebook);


    }
}
