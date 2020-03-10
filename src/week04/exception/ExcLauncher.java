package week04.exception;

public class ExcLauncher {

    public static void main(String[] args) {

        double dubbel;
        try{

            Object obj = null;
            obj.toString();

            String getal = "5,5";
            dubbel = Double.parseDouble(getal);

            System.out.println(dubbel);



        } catch(NumberFormatException ex){
            System.out.println("ERRRORRR!!!!");
        }



    }
}
