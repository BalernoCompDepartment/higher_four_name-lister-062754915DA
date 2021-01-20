class Main {
  public static void main(String[] args) {
    
    //Step 1: initialise names array
    String [] names = {"Marisol","Gaynelle","Josue","Cletus","Dong","Lucille","Margot","Mai","Vaughn","Sebastian","Petrina","Maxima","Fletcher","Kenda","Doug","Dot","Jeromy","Jerald","Alla","Georgene"};
   
    //Step 2: ask user for the number to seperate students by
    int number = Keyboard.getInt("Please enter a number.");
  
    //Step 3: Start fixed loop length of names array times
      for(int loop =0; loop < names.length; loop++) {
    //Step 4: if loop counter modulus the number entered is 0 then
      if (loop % number == 0) {
  
    //Step 5: display the name from the array
      Screen.display("The name of the student is " + names[loop] + ".", "Name");
    //Step 6: end if
      } 
    //Step 7: end loop
} 
  
}
} 