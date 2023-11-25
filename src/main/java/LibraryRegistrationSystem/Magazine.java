/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LibraryRegistrationSystem;

/**
 *
 * @author naseem
 */
public class Magazine extends Book {
    private int issueNumber;
    private String releaseDate;

    public Magazine(String title, String author, int number, String genre, int edition, 
                    String date, int issueNumber, String releaseDate) {
        super(title, author, number, genre, edition, date);
        this.issueNumber = issueNumber;
        this.releaseDate = releaseDate;
    }

    // Getters
    public int getIssueNumber() {
        return issueNumber;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    // Setters
    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Issue Number: " + issueNumber + ", Release Date: " + releaseDate;
    }

    // Additional methods...
}
