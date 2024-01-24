package src.chapter3.java.beverages.dtos;

public class NegativeValueError extends Error {
    public NegativeValueError() {
        super("negative value not supported");
    }
}
