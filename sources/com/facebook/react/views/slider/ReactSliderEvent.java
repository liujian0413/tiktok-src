package com.facebook.react.views.slider;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.RCTEventEmitter;

public class ReactSliderEvent extends Event<ReactSliderEvent> {
    private final boolean mFromUser;
    private final double mValue;

    public short getCoalescingKey() {
        return 0;
    }

    public String getEventName() {
        return "topChange";
    }

    public double getValue() {
        return this.mValue;
    }

    public boolean isFromUser() {
        return this.mFromUser;
    }

    private WritableMap serializeEventData() {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("target", getViewTag());
        createMap.putDouble("value", getValue());
        createMap.putBoolean("fromUser", isFromUser());
        return createMap;
    }

    public void dispatch(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(getViewTag(), getEventName(), serializeEventData());
    }

    public ReactSliderEvent(int i, double d, boolean z) {
        super(i);
        this.mValue = d;
        this.mFromUser = z;
    }
}
