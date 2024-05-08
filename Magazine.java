public class Magazine extends Book implements BookOperations {
    private String category;

    public Magazine(String title, String author, int year, String category, boolean borrowed) {
        super(title, author, year);
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void manageBook(boolean borrowed) {
        if (borrowed) {
            if (!isBorrowed()) {
                setBorrowed(true);
                System.out.println("Magazine : " + getTitle() + " borrowed successfully.");
            } else {
                System.out.println("Magazine : " + getTitle() + " is already borrowed.");
            }
        } else {
            if (isBorrowed()) {
                setBorrowed(false);
                System.out.println("Magazine : " + getTitle() + " returned successfully.");
            } else {
                System.out.println("Magazine : " + getTitle() + " is not borrowed.");
            }
        }
    }
}
