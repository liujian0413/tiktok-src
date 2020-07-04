package com.facebook.react.uimanager.events;

import com.facebook.react.common.SystemClock;
import com.facebook.react.uimanager.events.Event;

public abstract class Event<T extends Event> {
    private static int sUniqueID;
    private boolean mInitialized;
    private long mTimestampMs;
    private int mUniqueID;
    private int mViewTag;

    public boolean canCoalesce() {
        return true;
    }

    public abstract void dispatch(RCTEventEmitter rCTEventEmitter);

    public short getCoalescingKey() {
        return 0;
    }

    public abstract String getEventName();

    public final long getTimestampMs() {
        return this.mTimestampMs;
    }

    public int getUniqueID() {
        return this.mUniqueID;
    }

    public final int getViewTag() {
        return this.mViewTag;
    }

    /* access modifiers changed from: 0000 */
    public boolean isInitialized() {
        return this.mInitialized;
    }

    public void onDispose() {
    }

    /* access modifiers changed from: 0000 */
    public final void dispose() {
        this.mInitialized = false;
        onDispose();
    }

    protected Event() {
        int i = sUniqueID;
        sUniqueID = i + 1;
        this.mUniqueID = i;
    }

    public T coalesce(T t) {
        if (getTimestampMs() >= t.getTimestampMs()) {
            return this;
        }
        return t;
    }

    /* access modifiers changed from: protected */
    public void init(int i) {
        this.mViewTag = i;
        this.mTimestampMs = SystemClock.uptimeMillis();
        this.mInitialized = true;
    }

    protected Event(int i) {
        int i2 = sUniqueID;
        sUniqueID = i2 + 1;
        this.mUniqueID = i2;
        init(i);
    }
}
