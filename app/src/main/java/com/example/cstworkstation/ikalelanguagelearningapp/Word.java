package com.example.cstworkstation.ikalelanguagelearningapp;

/**
 * Created by CST Workstation on 9/17/2017.
 * it contains a default translation and an Ikale translation for that word
 */

public class Word {

    private static final int NO_IMAGE_PROVIDED = -1;
    /**
     * Default translation for the word
     */
    private String mDefaultTranslation;
    /**
     * Ikale translation for the word
     */
    private String mIkaleTranslation;
    /**
     * Default image representation for the word
     */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    public Word(String defaultTranslation, String ikaleTranslation) {
        mDefaultTranslation = defaultTranslation;
        mIkaleTranslation = ikaleTranslation;
    }

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId) {
        mDefaultTranslation = defaultTranslation;
        mIkaleTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the default translation of the word.
     */
    public String getmDefaultTranslation() {

        return mDefaultTranslation;
    }

    /**
     * Get the image depiction of the word.
     */
    public int getmImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Get the Ikale translation of the word.
     */
    public String getmIkaleTranslation() {
        return mIkaleTranslation;
    }

    /**
     * Returns whether or not the word has an image.\
     *
     * @return
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
