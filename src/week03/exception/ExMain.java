package week03.exception;

public class ExMain {

    public static void main(String[] args){

        int[] arr = new int[3];
        Object object = null;

        try{
            arr[5] = 99;
        }catch (ArrayIndexOutOfBoundsException ex){
            // doe iets
            System.out.println("Array Index Fout");

        }
        try{
            object.toString();
        } catch (NullPointerException ex){
            System.out.println("Wel een goed object meegegeven!!!");
        }


        System.out.println("Hallo na fout");

    }
}
