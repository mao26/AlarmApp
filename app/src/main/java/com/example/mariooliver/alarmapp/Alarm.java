package com.example.mariooliver.alarmapp;

/**
 * Created by mariooliver on 10/10/16.
 */

public class Alarm {

    private String mName;
    private String mAlarmTime;
    private boolean mAlarmOn;

    public Alarm(String name, String time, boolean isOn){
        mName = name;
        mAlarmTime = time;
        mAlarmOn = isOn;
    }

    public Alarm(){
        mName = "Default";
        mAlarmTime = "12:00AM";
        mAlarmOn = false;
    }


    public String getName() {
        return mName;
    }

    public void setName(String mName) {
        this.mName = mName;
    }

    public String getAlarmTime() {
        return mAlarmTime;
    }

    public void setAlarmTime(String mAlarmTime) {
        this.mAlarmTime = mAlarmTime;
    }

    public boolean isAlarmOn() {
        return mAlarmOn;
    }

    public void setAlarmOn(boolean mAlarmOn) {
        this.mAlarmOn = mAlarmOn;
    }
}
