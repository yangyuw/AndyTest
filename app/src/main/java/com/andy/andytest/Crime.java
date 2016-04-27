package com.andy.andytest;

import java.util.UUID;

/**
 * Created by Administrator on 2016/4/28.
 */
public class Crime {
    private UUID mId;

    public UUID getmId() {
        return mId;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    private String mTitle;

    public Crime() {
        mId = UUID.randomUUID();
    }
}
