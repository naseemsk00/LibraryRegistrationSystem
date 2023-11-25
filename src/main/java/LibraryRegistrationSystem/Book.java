/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LibraryRegistrationSystem;

/**
 *
 * @author naseem
 */
public class Book implements Display {
    private String title;
    private String author;
    private int number;
    private String genre;
    private int edition;
    private String date;
    private boolean isLoaned;

    // Constructor
    public Book(String title, String author, int number, String genre, int edition, String date) {
        this.title = title;
        this.author = author;
        this.number = number;
        this.genre = genre;
        this.edition = edition;
        this.date = date;
        this.isLoaned = false;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getNumber() {
        return number;
    }

    public String getGenre() {
        return genre;
    }

    public int getEdition() {
        return edition;
    }

    public String getDate() {
        return date;
    }

    public boolean isLoaned() {
        return isLoaned;
    }

    // Setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setLoaned(boolean loaned) {
        isLoaned = loaned;
    }

    @Override
    public String getInfo() {
        return "Title: " + title + ", Author: " + author + ", Number: " + number +
               ", Genre: " + genre + ", Edition: " + edition + ", Date: " + date;
    }

    @Override
    public boolean inLoan() {
        return isLoaned;
    }

    // Additional methods...
}