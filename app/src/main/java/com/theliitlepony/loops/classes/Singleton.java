package com.theliitlepony.loops.classes;

/**
 * Created by user on 29 ต.ค. 2560.
 */

public class Singleton {

    public String Phonenumber;
    private static Singleton _instance = null;


    private Singleton() {

    }

    public static Singleton instance() {

        if (_instance == null) {
            _instance = new Singleton();
        }

        return _instance;
    }
}
