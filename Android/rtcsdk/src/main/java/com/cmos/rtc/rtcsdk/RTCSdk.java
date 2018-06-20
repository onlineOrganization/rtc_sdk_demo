package com.cmos.rtc.rtcsdk;

public class RTCSdk {
    private static final RTCSdk ourInstance = new RTCSdk();

    public static RTCSdk getInstance() {
        return ourInstance;
    }

    private RTCSdk() {
    }

    public void login(String ip, int port, String usename, String password) {

    }

    public void logout(String usename) {

    }

    public void makeVoiceCall(String phoneNum) {

    }

    public void makeVideoCall(String phoneNum) {

    }
}
