public class Novel extends Book implements BookOperations {
    private String genre;

    public Novel(String title, String author, int year, String genre, boolean borrowed) {
        super(title, author, year);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    
    public void manageBook(boolean borrowed) {
        if (borrowed) {
            if (!isBorrowed()) {
                setBorrowed(true);
                System.out.println("Novel : " + getTitle() + " borrowed successfully.");
            } else {
                System.out.println("Novel : " + getTitle() + " is already borrowed.");
            }
        } else {
            if (isBorrowed()) {
                setBorrowed(false);
                System.out.println("Novel : " + getTitle() + " returned successfully.");
            } else {
                System.out.println("Novel : " + getTitle() + " is not borrowed.");
            }
        }
    }
}