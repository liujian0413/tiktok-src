package com.facebook.react.views.toolbar.events;

import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.RCTEventEmitter;

public class ToolbarClickEvent extends Event<ToolbarClickEvent> {
    private final int position;

    public boolean canCoalesce() {
        return false;
    }

    public String getEventName() {
        return "topSelect";
    }

    public int getPosition() {
        return this.position;
    }

    public void dispatch(RCTEventEmitter rCTEventEmitter) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putInt("position", getPosition());
        rCTEventEmitter.receiveEvent(getViewTag(), getEventName(), writableNativeMap);
    }

    public ToolbarClickEvent(int i, int i2) {
        super(i);
        this.position = i2;
    }
}
