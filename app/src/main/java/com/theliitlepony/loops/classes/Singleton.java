package com.theliitlepony.loops.classes;

import android.os.Bundle;

/**
 * Created by user on 29 ต.ค. 2560.
 */

public class Singleton {

    public String Phonenumber = null;

    private static Singleton _instance = null;


    private Singleton() {

    }

    public static Singleton instance() {

        if (_instance == null) {
            _instance = new Singleton();
        }

        return _instance;
    }

    public Bundle saveInstanceState(Bundle outState){
//        outState.putParcelable(USER_STATE, Parcels.wrap(user));
//        outState.putParcelable(SELECTED_COURSE_STATE,Parcels.wrap(selectedCourse));
//        outState.putParcelable(SELECTED_COURSE_SYLLABUS_STATE,Parcels.wrap(selectedCourseSyllabus));
//        outState.putParcelable(TWO_FACTOR_AUTHENTICATION_STATE,Parcels.wrap(twoFactorAuthentication));
//        outState.putParcelable(CONTENT_STATE,Parcels.wrap(content));
//        outState.putParcelable(SELECTED_VIDEO_OBJECT_STATE,Parcels.wrap(selectedVideoObject));
//
//        outState.putParcelable(IS_REGISTER_WITH_SOCIAL_ACCOUNT_STATE,Parcels.wrap(isRegisterWithSocialAccount));
//        outState.putParcelable(SOCIAL_ACCOUNT_TITLE_STATE,Parcels.wrap(socialAccountTitle));
//        outState.putParcelable(MAIN_FRG_SELECTE_TAB_INDEX_STATE,Parcels.wrap(mainFrgSelecteTabIndex));

        return outState;
    }

    public void restoreInstanceState(Bundle savedInstanceState){
        if(savedInstanceState!=null){
//            user = Parcels.unwrap(savedInstanceState.getParcelable(USER_STATE));
//            selectedCourse = Parcels.unwrap(savedInstanceState.getParcelable(SELECTED_COURSE_STATE));
//            selectedCourseSyllabus = Parcels.unwrap(savedInstanceState.getParcelable(SELECTED_COURSE_SYLLABUS_STATE));
//            twoFactorAuthentication = Parcels.unwrap(savedInstanceState.getParcelable(TWO_FACTOR_AUTHENTICATION_STATE));
//            content = Parcels.unwrap(savedInstanceState.getParcelable(CONTENT_STATE));
//            selectedVideoObject = Parcels.unwrap(savedInstanceState.getParcelable(SELECTED_VIDEO_OBJECT_STATE));
//
//            isRegisterWithSocialAccount = Parcels.unwrap(savedInstanceState.getParcelable(IS_REGISTER_WITH_SOCIAL_ACCOUNT_STATE));
//            socialAccountTitle = Parcels.unwrap(savedInstanceState.getParcelable(SOCIAL_ACCOUNT_TITLE_STATE));
//            mainFrgSelecteTabIndex = Parcels.unwrap(savedInstanceState.getParcelable(MAIN_FRG_SELECTE_TAB_INDEX_STATE));
        }
    }
}
