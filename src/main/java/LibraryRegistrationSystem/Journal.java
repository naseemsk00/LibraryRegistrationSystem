/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LibraryRegistrationSystem;

/**
 *
 * @author naseem
 */
public class Journal extends Book {
    private String conferenceName;
    private int conferenceNumber;

    public Journal(String title, String author, int number, String genre, int edition, 
                   String date, String conferenceName, int conferenceNumber) {
        super(title, author, number, genre, edition, date);
        this.conferenceName = conferenceName;
        this.conferenceNumber = conferenceNumber;
    }

    // Getters
    public String getConferenceName() {
        return conferenceName;
    }

    public int getConferenceNumber() {
        return conferenceNumber;
    }

    // Setters
    public void setConferenceName(String conferenceName) {
        this.conferenceName = conferenceName;
    }

    public void setConferenceNumber(int conferenceNumber) {
        this.conferenceNumber = conferenceNumber;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Conference Name: " + conferenceName + ", Conference Number: " + conferenceNumber;
    }

    // Additional methods...
}