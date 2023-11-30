package ba.smoki.nine.human;

/**
 * Student IS A Person.
 * <p>
 *     DRY- Don't Repeat Yourself
 * </p>
 */
public class Student extends Person{
    private String indexNumber;

    public void setIndexNumber(String indexNumber) {
        this.indexNumber = indexNumber;
    }

    public String getIndexNumber() {
        return indexNumber;
    }
}
