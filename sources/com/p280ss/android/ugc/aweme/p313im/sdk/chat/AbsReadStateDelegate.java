package com.p280ss.android.ugc.aweme.p313im.sdk.chat;

import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.Lifecycle.Event;
import android.os.Handler;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.CommonLifeCycleObserver.C30609a;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.AbsReadStateDelegate */
public abstract class AbsReadStateDelegate extends Handler implements CommonLifeCycleObserver {

    /* renamed from: a */
    public final C30739d f80333a;

    /* renamed from: a */
    public void mo80370a() {
    }

    /* renamed from: b */
    public void mo80371b() {
    }

    /* renamed from: c */
    public void mo80372c() {
    }

    /* renamed from: d */
    public void mo80373d() {
    }

    @C0054q(mo125a = Event.ON_CREATE)
    public void onCreate() {
        C30609a.onCreate(this);
    }

    @C0054q(mo125a = Event.ON_DESTROY)
    public void onDestroy() {
        C30609a.onDestroy(this);
    }

    @C0054q(mo125a = Event.ON_PAUSE)
    public void onPause() {
        C30609a.onPause(this);
    }

    @C0054q(mo125a = Event.ON_RESUME)
    public void onResume() {
        C30609a.onResume(this);
    }

    @C0054q(mo125a = Event.ON_START)
    public void onStart() {
        C30609a.onStart(this);
    }

    @C0054q(mo125a = Event.ON_STOP)
    public void onStop() {
        C30609a.onStop(this);
    }

    public AbsReadStateDelegate(C30739d dVar) {
        C7573i.m23587b(dVar, "dataCenter");
        this.f80333a = dVar;
    }
}
