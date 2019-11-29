package com.example.homescreen;

public class AddToDatabase {
    private String contactName;
    private String meetingDate;
    private String meetingTime;
    private String meetingTitle;

    public AddToDatabase() {

    }

    public String getContactName() {
        return contactName;
    }

    public String getMeetingDate() {
        return meetingDate;
    }

    public String getMeetingTime() {
        return meetingTime;
    }

    public String getMeetingTitle() {
        return meetingTitle;
    }

    public AddToDatabase(String contactName, String meetingDate, String meetingTime, String meetingTitle) {

        this.contactName = contactName;
        this.meetingDate = meetingDate;
        this.meetingTime = meetingTime;
        this.meetingTitle = meetingTitle;
    }
}
