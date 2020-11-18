package by.belhard.j24.MyFirstProject.exceptions;

public class ItemNotFoundException extends RuntimeException {

    public ItemNotFoundException(String fieldName) {
        super(fieldName);
    }
}
