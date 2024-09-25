class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class TestCustomException {
    public static void main(String[] args) {
        try {
            throw new CustomException("Custom exception occurred!");
        } catch (CustomException e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }
}
