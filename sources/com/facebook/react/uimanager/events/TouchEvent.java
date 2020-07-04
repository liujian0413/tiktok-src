package com.facebook.react.uimanager.events;

import android.support.p022v4.util.Pools.SynchronizedPool;
import android.view.MotionEvent;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.facebook.infer.p728a.C13854a;
import com.facebook.react.bridge.SoftAssertions;

public class TouchEvent extends Event<TouchEvent> {
    private static final SynchronizedPool<TouchEvent> EVENTS_POOL = new SynchronizedPool<>(3);
    private short mCoalescingKey;
    private MotionEvent mMotionEvent;
    private TouchEventType mTouchEventType;
    private float mViewX;
    private float mViewY;

    private TouchEvent() {
    }

    public short getCoalescingKey() {
        return this.mCoalescingKey;
    }

    public float getViewX() {
        return this.mViewX;
    }

    public float getViewY() {
        return this.mViewY;
    }

    public MotionEvent getMotionEvent() {
        C13854a.m40916b(this.mMotionEvent);
        return this.mMotionEvent;
    }

    public String getEventName() {
        return ((TouchEventType) C13854a.m40916b(this.mTouchEventType)).getJSEventName();
    }

    public void onDispose() {
        ((MotionEvent) C13854a.m40916b(this.mMotionEvent)).recycle();
        this.mMotionEvent = null;
        EVENTS_POOL.release(this);
    }

    public boolean canCoalesce() {
        switch ((TouchEventType) C13854a.m40916b(this.mTouchEventType)) {
            case START:
            case END:
            case CANCEL:
                return false;
            case MOVE:
                return true;
            default:
                StringBuilder sb = new StringBuilder("Unknown touch event type: ");
                sb.append(this.mTouchEventType);
                throw new RuntimeException(sb.toString());
        }
    }

    public void dispatch(RCTEventEmitter rCTEventEmitter) {
        TouchesHelper.sendTouchEvent(rCTEventEmitter, (TouchEventType) C13854a.m40916b(this.mTouchEventType), getViewTag(), this);
    }

    public static TouchEvent obtain(int i, TouchEventType touchEventType, MotionEvent motionEvent, long j, float f, float f2, TouchEventCoalescingKeyHelper touchEventCoalescingKeyHelper) {
        TouchEvent touchEvent = (TouchEvent) EVENTS_POOL.acquire();
        if (touchEvent == null) {
            touchEvent = new TouchEvent();
        }
        touchEvent.init(i, touchEventType, motionEvent, j, f, f2, touchEventCoalescingKeyHelper);
        return touchEvent;
    }

    private void init(int i, TouchEventType touchEventType, MotionEvent motionEvent, long j, float f, float f2, TouchEventCoalescingKeyHelper touchEventCoalescingKeyHelper) {
        boolean z;
        super.init(i);
        short s = 0;
        if (j != Long.MIN_VALUE) {
            z = true;
        } else {
            z = false;
        }
        SoftAssertions.assertCondition(z, "Gesture start time must be initialized");
        int action = motionEvent.getAction() & NormalGiftView.ALPHA_255;
        switch (action) {
            case 0:
                touchEventCoalescingKeyHelper.addCoalescingKey(j);
                break;
            case 1:
                touchEventCoalescingKeyHelper.removeCoalescingKey(j);
                break;
            case 2:
                s = touchEventCoalescingKeyHelper.getCoalescingKey(j);
                break;
            case 3:
                touchEventCoalescingKeyHelper.removeCoalescingKey(j);
                break;
            case 5:
            case 6:
                touchEventCoalescingKeyHelper.incrementCoalescingKey(j);
                break;
            default:
                StringBuilder sb = new StringBuilder("Unhandled MotionEvent action: ");
                sb.append(action);
                throw new RuntimeException(sb.toString());
        }
        this.mTouchEventType = touchEventType;
        this.mMotionEvent = MotionEvent.obtain(motionEvent);
        this.mCoalescingKey = s;
        this.mViewX = f;
        this.mViewY = f2;
    }
}
