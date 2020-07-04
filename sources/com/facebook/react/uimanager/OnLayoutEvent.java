package com.facebook.react.uimanager;

import android.support.p022v4.util.Pools.SynchronizedPool;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.RCTEventEmitter;

public class OnLayoutEvent extends Event<OnLayoutEvent> {
    private static final SynchronizedPool<OnLayoutEvent> EVENTS_POOL = new SynchronizedPool<>(20);
    private int mHeight;
    private int mWidth;

    /* renamed from: mX */
    private int f37426mX;

    /* renamed from: mY */
    private int f37427mY;

    private OnLayoutEvent() {
    }

    public String getEventName() {
        return "topLayout";
    }

    public void onDispose() {
        EVENTS_POOL.release(this);
    }

    public void dispatch(RCTEventEmitter rCTEventEmitter) {
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble("x", (double) PixelUtil.toDIPFromPixel((float) this.f37426mX));
        createMap.putDouble("y", (double) PixelUtil.toDIPFromPixel((float) this.f37427mY));
        createMap.putDouble("width", (double) PixelUtil.toDIPFromPixel((float) this.mWidth));
        createMap.putDouble("height", (double) PixelUtil.toDIPFromPixel((float) this.mHeight));
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putMap("layout", createMap);
        createMap2.putInt("target", getViewTag());
        rCTEventEmitter.receiveEvent(getViewTag(), getEventName(), createMap2);
    }

    /* access modifiers changed from: protected */
    public void init(int i, int i2, int i3, int i4, int i5) {
        super.init(i);
        this.f37426mX = i2;
        this.f37427mY = i3;
        this.mWidth = i4;
        this.mHeight = i5;
    }

    public static OnLayoutEvent obtain(int i, int i2, int i3, int i4, int i5) {
        OnLayoutEvent onLayoutEvent = (OnLayoutEvent) EVENTS_POOL.acquire();
        if (onLayoutEvent == null) {
            onLayoutEvent = new OnLayoutEvent();
        }
        onLayoutEvent.init(i, i2, i3, i4, i5);
        return onLayoutEvent;
    }
}
