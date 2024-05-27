class Students{
    String name;
    int id;
    String email;
//System.out.println(Students.name);
    public void display_name(){
           System.out.println(name+ " " + id +" " + email);
        

    }
}






public class Classes {
    public static void main(String[] args){
       Students a1 = new Students();
       Students a2 = new Students();
       Students a3 = new Students();
       Students a4 = new Students();
       Students a5 = new Students();
        
        

       a1.name= "annu";
       a1.id= 1;
       a1.email= "a@1gmail.com";
       

       a2.name= "manu";
       a2.id= 2;
       a2.email= "m@2gmail.com";
    


       a3.name= "peehu";
       a3.id= 3;
       a3.email= "p@3gmail.com";
       


       a4.name= "trapti";
       a4.id= 4;
       a4.email= "t@4gmail.com";
       

       a5.name= "pari";
       a5.id= 5;
       a5.email= "p@5gmail.com";
       


       a1.display_name();
       a2.display_name();
       a3.display_name();
       a4.display_name();
       a5.display_name();



        
    }
}