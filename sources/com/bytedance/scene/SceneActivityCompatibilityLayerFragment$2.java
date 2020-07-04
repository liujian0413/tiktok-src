package com.bytedance.scene;

import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.Lifecycle.Event;

class SceneActivityCompatibilityLayerFragment$2 implements C0042h {

    /* renamed from: a */
    final /* synthetic */ C0043i f33315a;

    /* renamed from: b */
    final /* synthetic */ int f33316b;

    /* renamed from: c */
    final /* synthetic */ C12634k f33317c;

    /* access modifiers changed from: 0000 */
    @C0054q(mo125a = Event.ON_DESTROY)
    public void onDestroy() {
        this.f33315a.getLifecycle().mo56b(this);
        this.f33317c.f33545a.mo3436b(this.f33316b);
    }
}
