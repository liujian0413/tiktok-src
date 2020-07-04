package com.facebook.react.views.webview.events;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.RCTEventEmitter;

public class TopMessageEvent extends Event<TopMessageEvent> {
    private final String mData;

    public boolean canCoalesce() {
        return false;
    }

    public short getCoalescingKey() {
        return 0;
    }

    public String getEventName() {
        return "topMessage";
    }

    public void dispatch(RCTEventEmitter rCTEventEmitter) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("data", this.mData);
        rCTEventEmitter.receiveEvent(getViewTag(), "topMessage", createMap);
    }

    public TopMessageEvent(int i, String str) {
        super(i);
        this.mData = str;
    }
}
