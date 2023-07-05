public class Array {
    public static void main(String[] args) {
        System.out.println(">> This is Array project << ");

//        Array declearation : 
//       datatype [] array_name = new int []
//       3 wyas to create arrays in java

//        1.  declaration and memory allocation
       int [] marks = new int [5];

      

//        2.  Declaration and then mermory allocation
       int [] marks;
       marks =  new int[5];

      

//        3. All in one thing

       int [] marks= {23,45,90,54,60};

       System.out.println(marks[]);




      
      // Array Traversing or Array Acess
      
        String [] std = {"Grapes", "Kiwi", "Apple", "Orange"};

        System.out.println(std.length);

      

//      1.  Displaying the array (simple way)
       System.out.println(std[0]);
       System.out.println(std[1]);
       System.out.println(std[2]);
       System.out.println(std[3]);





      
//      2. Displaying Array in suttle way
//        using For loop

       for (int i =0; i<std.length; i++){
           System.out.println(std[i]);
       }



      

//      3.  Displaying array in reverse order
        System.out.println("Displaying the array in reverse order");
        for(int i = std.length -1 ; i>=0 ; i--){
            System.out.println(std[i]);
        }







//     4.   For Each Loop - This shows only element and we cannot access single element.

        for(String element:std){
            System.out.println(element);
        }











    }
}
