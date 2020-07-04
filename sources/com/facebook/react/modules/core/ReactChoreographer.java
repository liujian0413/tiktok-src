package com.facebook.react.modules.core;

import com.facebook.common.p686c.C13286a;
import com.facebook.infer.p728a.C13854a;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.modules.core.ChoreographerCompat.FrameCallback;
import java.util.ArrayDeque;

public class ReactChoreographer {
    private static ReactChoreographer sInstance;
    public final ArrayDeque<FrameCallback>[] mCallbackQueues = new ArrayDeque[CallbackType.values().length];
    private final ChoreographerCompat mChoreographer = ChoreographerCompat.getInstance();
    public boolean mHasPostedCallback;
    private final ReactChoreographerDispatcher mReactChoreographerDispatcher = new ReactChoreographerDispatcher();
    public int mTotalCallbacks;

    public enum CallbackType {
        PERF_MARKERS(0),
        DISPATCH_UI(1),
        NATIVE_ANIMATED_MODULE(2),
        TIMERS_EVENTS(3),
        IDLE_EVENT(4);
        
        private final int mOrder;

        /* access modifiers changed from: 0000 */
        public final int getOrder() {
            return this.mOrder;
        }

        private CallbackType(int i) {
            this.mOrder = i;
        }
    }

    class ReactChoreographerDispatcher extends FrameCallback {
        private ReactChoreographerDispatcher() {
        }

        public void doFrame(long j) {
            synchronized (ReactChoreographer.this) {
                ReactChoreographer.this.mHasPostedCallback = false;
                for (int i = 0; i < ReactChoreographer.this.mCallbackQueues.length; i++) {
                    int size = ReactChoreographer.this.mCallbackQueues[i].size();
                    for (int i2 = 0; i2 < size; i2++) {
                        ((FrameCallback) ReactChoreographer.this.mCallbackQueues[i].removeFirst()).doFrame(j);
                        ReactChoreographer.this.mTotalCallbacks--;
                    }
                }
                ReactChoreographer.this.maybeRemoveFrameCallback();
            }
        }
    }

    public static ReactChoreographer getInstance() {
        C13854a.m40913a(sInstance, "ReactChoreographer needs to be initialized.");
        return sInstance;
    }

    public static void initialize() {
        if (sInstance == null) {
            UiThreadUtil.assertOnUiThread();
            sInstance = new ReactChoreographer();
        }
    }

    public void maybeRemoveFrameCallback() {
        boolean z;
        if (this.mTotalCallbacks >= 0) {
            z = true;
        } else {
            z = false;
        }
        C13854a.m40914a(z);
        if (this.mTotalCallbacks == 0 && this.mHasPostedCallback) {
            this.mChoreographer.removeFrameCallback(this.mReactChoreographerDispatcher);
            this.mHasPostedCallback = false;
        }
    }

    private ReactChoreographer() {
        for (int i = 0; i < this.mCallbackQueues.length; i++) {
            this.mCallbackQueues[i] = new ArrayDeque<>();
        }
    }

    public synchronized void postFrameCallback(CallbackType callbackType, FrameCallback frameCallback) {
        boolean z;
        this.mCallbackQueues[callbackType.getOrder()].addLast(frameCallback);
        this.mTotalCallbacks++;
        if (this.mTotalCallbacks > 0) {
            z = true;
        } else {
            z = false;
        }
        C13854a.m40914a(z);
        if (!this.mHasPostedCallback) {
            this.mChoreographer.postFrameCallback(this.mReactChoreographerDispatcher);
            this.mHasPostedCallback = true;
        }
    }

    public synchronized void removeFrameCallback(CallbackType callbackType, FrameCallback frameCallback) {
        if (this.mCallbackQueues[callbackType.getOrder()].removeFirstOccurrence(frameCallback)) {
            this.mTotalCallbacks--;
            maybeRemoveFrameCallback();
            return;
        }
        C13286a.m38863d("ReactNative", "Tried to remove non-existent frame callback");
    }
}
