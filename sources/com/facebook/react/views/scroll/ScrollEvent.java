package com.facebook.react.views.scroll;

import android.support.p022v4.util.Pools.SynchronizedPool;
import com.facebook.infer.p728a.C13854a;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.RCTEventEmitter;

public class ScrollEvent extends Event<ScrollEvent> {
    private static final SynchronizedPool<ScrollEvent> EVENTS_POOL = new SynchronizedPool<>(3);
    private int mContentHeight;
    private int mContentWidth;
    private ScrollEventType mScrollEventType;
    private int mScrollViewHeight;
    private int mScrollViewWidth;
    private int mScrollX;
    private int mScrollY;
    private double mXVelocity;
    private double mYVelocity;

    private ScrollEvent() {
    }

    public short getCoalescingKey() {
        return 0;
    }

    public void onDispose() {
        EVENTS_POOL.release(this);
    }

    public boolean canCoalesce() {
        if (this.mScrollEventType == ScrollEventType.SCROLL) {
            return true;
        }
        return false;
    }

    public String getEventName() {
        return ((ScrollEventType) C13854a.m40916b(this.mScrollEventType)).getJSEventName();
    }

    private WritableMap serializeEventData() {
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble("top", 0.0d);
        createMap.putDouble("bottom", 0.0d);
        createMap.putDouble("left", 0.0d);
        createMap.putDouble("right", 0.0d);
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putDouble("x", (double) PixelUtil.toDIPFromPixel((float) this.mScrollX));
        createMap2.putDouble("y", (double) PixelUtil.toDIPFromPixel((float) this.mScrollY));
        WritableMap createMap3 = Arguments.createMap();
        createMap3.putDouble("width", (double) PixelUtil.toDIPFromPixel((float) this.mContentWidth));
        createMap3.putDouble("height", (double) PixelUtil.toDIPFromPixel((float) this.mContentHeight));
        WritableMap createMap4 = Arguments.createMap();
        createMap4.putDouble("width", (double) PixelUtil.toDIPFromPixel((float) this.mScrollViewWidth));
        createMap4.putDouble("height", (double) PixelUtil.toDIPFromPixel((float) this.mScrollViewHeight));
        WritableMap createMap5 = Arguments.createMap();
        createMap5.putDouble("x", this.mXVelocity);
        createMap5.putDouble("y", this.mYVelocity);
        WritableMap createMap6 = Arguments.createMap();
        createMap6.putMap("contentInset", createMap);
        createMap6.putMap("contentOffset", createMap2);
        createMap6.putMap("contentSize", createMap3);
        createMap6.putMap("layoutMeasurement", createMap4);
        createMap6.putMap("velocity", createMap5);
        createMap6.putInt("target", getViewTag());
        createMap6.putBoolean("responderIgnoreScroll", true);
        return createMap6;
    }

    public void dispatch(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(getViewTag(), getEventName(), serializeEventData());
    }

    private void init(int i, ScrollEventType scrollEventType, int i2, int i3, float f, float f2, int i4, int i5, int i6, int i7) {
        super.init(i);
        this.mScrollEventType = scrollEventType;
        this.mScrollX = i2;
        this.mScrollY = i3;
        this.mXVelocity = (double) f;
        this.mYVelocity = (double) f2;
        this.mContentWidth = i4;
        this.mContentHeight = i5;
        this.mScrollViewWidth = i6;
        this.mScrollViewHeight = i7;
    }

    public static ScrollEvent obtain(int i, ScrollEventType scrollEventType, int i2, int i3, float f, float f2, int i4, int i5, int i6, int i7) {
        ScrollEvent scrollEvent = (ScrollEvent) EVENTS_POOL.acquire();
        if (scrollEvent == null) {
            scrollEvent = new ScrollEvent();
        }
        scrollEvent.init(i, scrollEventType, i2, i3, f, f2, i4, i5, i6, i7);
        return scrollEvent;
    }
}
