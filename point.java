package abclogin;

public class point {

    

 static int  setx(int x){
    return x;

 }

 static int  set(int x){
    return x;

 }
 static void displaypoints(){
     int x = 88;
     int y = 88;
    if (x==y) {
         System.out.println("\n\n\tBOTH POINTS ARE SAME!\n\n\n");
         
        } else {
        System.out.println("\n\n\tBOTH POINTS ARE NOT SAME!\n\n\n");
        
    } 

}
public static void main(String[] args){
 point g1= new point();
    g1.displaypoints();
}


    
}
