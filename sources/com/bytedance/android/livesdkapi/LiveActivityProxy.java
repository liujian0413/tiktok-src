package com.bytedance.android.livesdkapi;

import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.Lifecycle.Event;
import android.content.Intent;
import android.support.p022v4.app.FragmentActivity;

public class LiveActivityProxy implements C0042h {

    /* renamed from: b */
    public FragmentActivity f25465b;

    /* renamed from: a */
    public void mo11023a(int i, int i2, Intent intent) {
    }

    /* access modifiers changed from: protected */
    @C0054q(mo125a = Event.ON_CREATE)
    public void onCreate() {
    }

    /* access modifiers changed from: protected */
    @C0054q(mo125a = Event.ON_DESTROY)
    public void onDestroy() {
    }

    /* access modifiers changed from: protected */
    @C0054q(mo125a = Event.ON_PAUSE)
    public void onPause() {
    }

    /* access modifiers changed from: protected */
    @C0054q(mo125a = Event.ON_RESUME)
    public void onResume() {
    }

    /* access modifiers changed from: protected */
    @C0054q(mo125a = Event.ON_START)
    public void onStart() {
    }

    /* access modifiers changed from: protected */
    @C0054q(mo125a = Event.ON_STOP)
    public void onStop() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Intent mo22769b() {
        if (this.f25465b != null) {
            return this.f25465b.getIntent();
        }
        return null;
    }

    public LiveActivityProxy(FragmentActivity fragmentActivity) {
        this.f25465b = fragmentActivity;
        this.f25465b.getLifecycle().mo55a(this);
    }
}
