package mainpackage.midterm_2420181_sec5;

import java.time.LocalDate;

public class Article {

    private String title, author, articleType, citationStatus;
    private LocalDate publicationDate;
    private int numberOfAuthors;

    public Article(String title, String author, String articleType, String citationStatus, LocalDate publicationDate, int numberOfAuthors) {
        this.title = title;
        this.author = author;
        this.articleType = articleType;
        this.citationStatus = citationStatus;
        this.publicationDate = publicationDate;
        this.numberOfAuthors = numberOfAuthors;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getArticleType() {
        return articleType;
    }

    public String getCitationStatus() {
        return citationStatus;
    }

    public LocalDate getPublicationDate() {
        return publicationDate;
    }

    public int getNumberOfAuthors() {
        return numberOfAuthors;
    }

    @Override
    public String toString() {
        return "Article{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", articleType='" + articleType + '\'' +
                ", citationStatus='" + citationStatus + '\'' +
                ", publicationDate=" + publicationDate +
                ", numberOfAuthors=" + numberOfAuthors +
                '}';
    }

    public void retrieveYear(Article a){

       LocalDate date = a.getPublicationDate();

       int year = date.getYear();


    }

}
