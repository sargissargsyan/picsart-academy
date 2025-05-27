package am.picsartacademy.oop.exepations;

public class AgeException extends RuntimeException {
    private String message;
    public AgeException(String message) {
        this.message = message;
    }

//    public String toString() {
//        return message;
//    }
}
