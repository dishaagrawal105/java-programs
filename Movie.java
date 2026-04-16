class Movie {
    String title;
    String genre;
    double rating;

    void displayDetails() {
        System.out.println("Title: " + title + ", Genre: " + genre + ", Rating: " + rating);
    }

    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.title = "Inception";
        movie.genre = "Sci-Fi";
        movie.rating = 8.8;
 
        movie.displayDetails();
    }
}

