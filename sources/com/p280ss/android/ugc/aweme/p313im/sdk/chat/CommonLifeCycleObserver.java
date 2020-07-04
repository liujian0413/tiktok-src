package com.p280ss.android.ugc.aweme.p313im.sdk.chat;

import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.Lifecycle.Event;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.CommonLifeCycleObserver */
public interface CommonLifeCycleObserver extends C0042h {

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.CommonLifeCycleObserver$a */
    public static final class C30609a {
        @C0054q(mo125a = Event.ON_CREATE)
        public static void onCreate(CommonLifeCycleObserver commonLifeCycleObserver) {
        }

        @C0054q(mo125a = Event.ON_DESTROY)
        public static void onDestroy(CommonLifeCycleObserver commonLifeCycleObserver) {
        }

        @C0054q(mo125a = Event.ON_PAUSE)
        public static void onPause(CommonLifeCycleObserver commonLifeCycleObserver) {
        }

        @C0054q(mo125a = Event.ON_RESUME)
        public static void onResume(CommonLifeCycleObserver commonLifeCycleObserver) {
        }

        @C0054q(mo125a = Event.ON_START)
        public static void onStart(CommonLifeCycleObserver commonLifeCycleObserver) {
        }

        @C0054q(mo125a = Event.ON_STOP)
        public static void onStop(CommonLifeCycleObserver commonLifeCycleObserver) {
        }
    }

    @C0054q(mo125a = Event.ON_CREATE)
    void onCreate();

    @C0054q(mo125a = Event.ON_DESTROY)
    void onDestroy();

    @C0054q(mo125a = Event.ON_PAUSE)
    void onPause();

    @C0054q(mo125a = Event.ON_RESUME)
    void onResume();

    @C0054q(mo125a = Event.ON_START)
    void onStart();

    @C0054q(mo125a = Event.ON_STOP)
    void onStop();
}
