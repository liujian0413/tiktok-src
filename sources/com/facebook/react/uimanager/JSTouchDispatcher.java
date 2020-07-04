package com.facebook.react.uimanager;

import android.view.MotionEvent;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.facebook.common.p686c.C13286a;
import com.facebook.infer.p728a.C13854a;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.events.TouchEvent;
import com.facebook.react.uimanager.events.TouchEventCoalescingKeyHelper;
import com.facebook.react.uimanager.events.TouchEventType;

public class JSTouchDispatcher {
    private boolean mChildIsHandlingNativeGesture;
    private long mGestureStartTime = Long.MIN_VALUE;
    private final ViewGroup mRootViewGroup;
    private final float[] mTargetCoordinates = new float[2];
    private int mTargetTag = -1;
    private final TouchEventCoalescingKeyHelper mTouchEventCoalescingKeyHelper = new TouchEventCoalescingKeyHelper();

    public JSTouchDispatcher(ViewGroup viewGroup) {
        this.mRootViewGroup = viewGroup;
    }

    private int findTargetTagAndSetCoordinates(MotionEvent motionEvent) {
        return TouchTargetHelper.findTargetTagAndCoordinatesForTouch(motionEvent.getX(), motionEvent.getY(), this.mRootViewGroup, this.mTargetCoordinates, null);
    }

    public void onChildStartedNativeGesture(MotionEvent motionEvent, EventDispatcher eventDispatcher) {
        if (!this.mChildIsHandlingNativeGesture) {
            dispatchCancelEvent(motionEvent, eventDispatcher);
            this.mChildIsHandlingNativeGesture = true;
            this.mTargetTag = -1;
        }
    }

    private void dispatchCancelEvent(MotionEvent motionEvent, EventDispatcher eventDispatcher) {
        if (this.mTargetTag == -1) {
            C13286a.m38860c("ReactNative", "Can't cancel already finished gesture. Is a child View trying to start a gesture from an UP/CANCEL event?");
            return;
        }
        C13854a.m40915a(!this.mChildIsHandlingNativeGesture, "Expected to not have already sent a cancel for this gesture");
        ((EventDispatcher) C13854a.m40916b(eventDispatcher)).dispatchEvent(TouchEvent.obtain(this.mTargetTag, TouchEventType.CANCEL, motionEvent, this.mGestureStartTime, this.mTargetCoordinates[0], this.mTargetCoordinates[1], this.mTouchEventCoalescingKeyHelper));
    }

    public void handleTouchEvent(MotionEvent motionEvent, EventDispatcher eventDispatcher) {
        EventDispatcher eventDispatcher2 = eventDispatcher;
        int action = motionEvent.getAction() & NormalGiftView.ALPHA_255;
        if (action == 0) {
            if (this.mTargetTag != -1) {
                C13286a.m38863d("ReactNative", "Got DOWN touch before receiving UP or CANCEL from last gesture");
            }
            this.mChildIsHandlingNativeGesture = false;
            this.mGestureStartTime = motionEvent.getEventTime();
            this.mTargetTag = findTargetTagAndSetCoordinates(motionEvent);
            eventDispatcher2.dispatchEvent(TouchEvent.obtain(this.mTargetTag, TouchEventType.START, motionEvent, this.mGestureStartTime, this.mTargetCoordinates[0], this.mTargetCoordinates[1], this.mTouchEventCoalescingKeyHelper));
        } else if (!this.mChildIsHandlingNativeGesture) {
            if (this.mTargetTag == -1) {
                C13286a.m38863d("ReactNative", "Unexpected state: received touch event but didn't get starting ACTION_DOWN for this gesture before");
            } else if (action == 1) {
                findTargetTagAndSetCoordinates(motionEvent);
                eventDispatcher2.dispatchEvent(TouchEvent.obtain(this.mTargetTag, TouchEventType.END, motionEvent, this.mGestureStartTime, this.mTargetCoordinates[0], this.mTargetCoordinates[1], this.mTouchEventCoalescingKeyHelper));
                this.mTargetTag = -1;
                this.mGestureStartTime = Long.MIN_VALUE;
            } else if (action == 2) {
                findTargetTagAndSetCoordinates(motionEvent);
                eventDispatcher2.dispatchEvent(TouchEvent.obtain(this.mTargetTag, TouchEventType.MOVE, motionEvent, this.mGestureStartTime, this.mTargetCoordinates[0], this.mTargetCoordinates[1], this.mTouchEventCoalescingKeyHelper));
            } else if (action == 5) {
                eventDispatcher2.dispatchEvent(TouchEvent.obtain(this.mTargetTag, TouchEventType.START, motionEvent, this.mGestureStartTime, this.mTargetCoordinates[0], this.mTargetCoordinates[1], this.mTouchEventCoalescingKeyHelper));
            } else if (action == 6) {
                eventDispatcher2.dispatchEvent(TouchEvent.obtain(this.mTargetTag, TouchEventType.END, motionEvent, this.mGestureStartTime, this.mTargetCoordinates[0], this.mTargetCoordinates[1], this.mTouchEventCoalescingKeyHelper));
            } else if (action == 3) {
                if (this.mTouchEventCoalescingKeyHelper.hasCoalescingKey(motionEvent.getDownTime())) {
                    dispatchCancelEvent(motionEvent, eventDispatcher);
                } else {
                    C13286a.m38863d("ReactNative", "Received an ACTION_CANCEL touch event for which we have no corresponding ACTION_DOWN");
                }
                this.mTargetTag = -1;
                this.mGestureStartTime = Long.MIN_VALUE;
            } else {
                StringBuilder sb = new StringBuilder("Warning : touch event was ignored. Action=");
                sb.append(action);
                sb.append(" Target=");
                sb.append(this.mTargetTag);
                C13286a.m38860c("ReactNative", sb.toString());
            }
        }
    }
}
