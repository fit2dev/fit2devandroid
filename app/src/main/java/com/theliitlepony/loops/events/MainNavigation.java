package com.theliitlepony.loops.events;


public class MainNavigation {

    public static final int MAIN_FRAGMENT = 0;


    public interface MainNavigationListener{
        void onChangeFragment(int fragmentId);
        void onForceBackFragment();
        void onForceLogout();
    }
}
