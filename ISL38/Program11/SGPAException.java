package p11;

public class SGPAException extends Exception {
    private static final long serialVersionUID = 1L;
    private int SGPA;

    SGPAException(int SGPA) {
        this.SGPA = SGPA;
    }
    public String toString() {
        return "SGPA Exeption greater than 10, ["+SGPA+"]\n";
    }
}