public class AutoBoxing_Unboxing {
    public static void main(String [] args){
        //AutoBoxing : int to Integer Conversion
        int x1 = 10;
        Integer x2 = x1;
        //unboxing : Integer to int 
        int x3 = x1;
        System.out.println("x1:"+ x1);
        System.out.println("x2:"+x2);
        System.out.println("x3:"+x3);
    }
    
}



class Comparison{
    public static void main(String []args){
        Integer x1 = new Integer(10);
        Integer x2 = new Integer(10);
        if (x1 == x2){
            System.out.println("Same");
        }else{
            System.out.println("Notsame");
        }
        Integer y1 = 40;
        Integer y2 = 40;
        if (y1 == y2 ){
            System.out.println("Same");
        }else{
             System.out.println("Notsame");
        }

    }
}