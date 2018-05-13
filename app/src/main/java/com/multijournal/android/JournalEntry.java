package com.multijournal.android;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by dikennaogbo on 12/05/2018.
 */

public class JournalEntry implements Entry{

    private String mTitle, mTextEntry, mDate, mLocation, mAudioRef, mPhotoRef;

    public JournalEntry(){
        mTitle = "";
        mTextEntry = "";
        mDate = "";
        mLocation = "";
        mAudioRef = "";
        mPhotoRef = "";
    }

    public JournalEntry(String title, String textentry, String date, String location, String audioref, String photoref){
        mTitle = title;
        mTextEntry = textentry;
        mDate = date;
        mLocation = location;
        mAudioRef = audioref;
        mPhotoRef = photoref;
    }

    public Map<String, Object> getHashMap(){
        Map<String, Object> hashmap = new HashMap();

        hashmap.put("title", mTitle);
        hashmap.put("textentry", mTextEntry);
        hashmap.put("date", mDate);
        hashmap.put("location", mLocation);
        hashmap.put("audioref", mAudioRef);
        hashmap.put("photoref", mPhotoRef);

        return hashmap;
    }

    public String getTitle(){
        return mTitle;
    }

    public String getDate(){
        return mDate;
    }

    public String getLocation(){
        return mLocation;
    }

    public String getAudioRef(){
        return mAudioRef;
    }

    public String getPhotoRef(){
        return mPhotoRef;
    }

    public String getTextEntry(){
        return mTextEntry;
    }

    public String getEntryType(){
        if(mAudioRef!=null) return "audio";
        else if(mPhotoRef!=null) return "photo";
        else return "text";
    }

}
