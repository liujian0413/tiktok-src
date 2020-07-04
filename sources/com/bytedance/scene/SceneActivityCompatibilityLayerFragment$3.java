package com.bytedance.scene;

import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.Lifecycle.Event;

class SceneActivityCompatibilityLayerFragment$3 implements C0042h {

    /* renamed from: a */
    final /* synthetic */ C0043i f33318a;

    /* renamed from: b */
    final /* synthetic */ int f33319b;

    /* renamed from: c */
    final /* synthetic */ C12634k f33320c;

    /* access modifiers changed from: 0000 */
    @C0054q(mo125a = Event.ON_DESTROY)
    public void onDestroy() {
        this.f33318a.getLifecycle().mo56b(this);
        this.f33320c.f33546b.mo3436b(this.f33319b);
    }
}
