package com.facebook.react.views.webview.events;

import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.RCTEventEmitter;

public class TopLoadingErrorEvent extends Event<TopLoadingErrorEvent> {
    private WritableMap mEventData;

    public boolean canCoalesce() {
        return false;
    }

    public short getCoalescingKey() {
        return 0;
    }

    public String getEventName() {
        return "topLoadingError";
    }

    public void dispatch(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(getViewTag(), getEventName(), this.mEventData);
    }

    public TopLoadingErrorEvent(int i, WritableMap writableMap) {
        super(i);
        this.mEventData = writableMap;
    }
}
