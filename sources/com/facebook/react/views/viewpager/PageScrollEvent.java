package com.facebook.react.views.viewpager;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.RCTEventEmitter;

class PageScrollEvent extends Event<PageScrollEvent> {
    private final float mOffset;
    private final int mPosition;

    public String getEventName() {
        return "topPageScroll";
    }

    private WritableMap serializeEventData() {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("position", this.mPosition);
        createMap.putDouble("offset", (double) this.mOffset);
        return createMap;
    }

    public void dispatch(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(getViewTag(), getEventName(), serializeEventData());
    }

    protected PageScrollEvent(int i, int i2, float f) {
        super(i);
        this.mPosition = i2;
        if (Float.isInfinite(f) || Float.isNaN(f)) {
            f = 0.0f;
        }
        this.mOffset = f;
    }
}
