package com.example.android.welcometonice;

/**
 * {@link Location} represents a card with information about particular location.
 * It contains the name of the location, working hours, address, phone number,
 * brief info and a photo.
 */
public class Location {

    /**
     * Name of the location
     */
    private int mName;

    /**
     * Working hours of the location
     */
    private int mWorkingHours;

    /**
     * Address of the location
     */
    private int mAddress;

    /**
     * Telephone number of the location
     */
    private int mPhoneNumber;

    /**
     * Brief info about the location
     */
    private int mInfo;

    /**
     * Image resource ID for the location
     */
    private int mPhotoId;

    /**
     * Create a new Location object
     *
     * @param name is the name of the location
     * @param workingHours is the working hours of the location
     * @param address is the address of the location
     * @param phoneNumber is the phone number of the location
     * @param info is the brief info about the location
     * @param photoId is the drawable resource ID for the photo associated with the location
     */

    public Location (int name, int workingHours, int address, int phoneNumber,
                     int info, int photoId) {
        mName = name;
        mWorkingHours = workingHours;
        mAddress = address;
        mPhoneNumber = phoneNumber;
        mInfo = info;
        mPhotoId = photoId;
    }

    /**
     * Get the name of the location
     */
    public int getName() {
        return mName;
    }

    /**
     * Get the working hours of the location
     */
    public int getWorkingHours() {
        return mWorkingHours;
    }

    /**
     * Get the address of the location
     */

    public int getAddress() {
        return mAddress;
    }

    /**
     * Get the phone number of the location
     */
    public int getPhoneNumber() {
        return mPhoneNumber;
    }

    /**
     * Get the brief info about the location
     */
    public int getInfo() {
        return mInfo;
    }

    /**
     * Return the photo resource ID for the location
     */
    public int getPhotoId() {
        return mPhotoId;
    }

}
