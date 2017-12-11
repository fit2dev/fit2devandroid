package com.theliitlepony.loops.events;


public class ConfirmationDialogEvent {
    public interface ConfirmationDialogEventListener{
        void confirm();
        void cancel();
    }
}
