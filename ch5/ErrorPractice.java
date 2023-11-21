package 物件導向程式設計.OOP_practice.ch5;

class MYError extends Exception {
    int errorKind;
    MYError() { errorKind = 0; }
    MYError(int x) { errorKind = x; }
// String toString() { return("Transmission Error: " + errorKind); }
}

public class ErrorPractice {
    void perform_error(int j) throws MYError {
        if (j == 2){
            // throw new MYError();
        }
        else
            throw new MYError();

    }
    public static void main(String[] args) {
        ErrorPractice hehe = new ErrorPractice();
        try {
            hehe.perform_error(3);
        } catch (Exception myError) {
            // Handle the exception or print an error message
            System.err.println("An error occurred: " + myError.errorKind);
        }
//         try {        hehe.perform_error(2);
// }   catch(MYError myerror){

// }

    }
}
