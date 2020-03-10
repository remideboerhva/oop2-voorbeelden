package week05.customexception;

public class IllegalLauncher {

    public static void main(String[] args) {

        try {
            methode(5);
        } catch (NegativeNumberException e) {
            e.printStackTrace();
        }
        int x = -5;
        try {

            methode(x);
        } catch (NegativeNumberException e) {
            e.printStackTrace();
            //
            methode(x * -1);
        }
    }

    private static void methode(int x) {
        if(x < 0){
            throw new NegativeNumberException("Waarde x mag niet  < 0 zijn!");
        }

        System.out.println("Dit mag");
    }
}

class NegativeNumberException extends RuntimeException {

    public NegativeNumberException() {
        super();
    }

    public NegativeNumberException(String message) {
        super(message);
    }

    public NegativeNumberException(String message, Throwable cause) {
        super(message, cause);
    }
}

