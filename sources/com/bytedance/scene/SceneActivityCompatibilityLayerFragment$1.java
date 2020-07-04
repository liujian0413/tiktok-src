package com.bytedance.scene;

import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.Lifecycle.Event;

class SceneActivityCompatibilityLayerFragment$1 implements C0042h {

    /* renamed from: a */
    final /* synthetic */ C0043i f33312a;

    /* renamed from: b */
    final /* synthetic */ int f33313b;

    /* renamed from: c */
    final /* synthetic */ C12634k f33314c;

    /* access modifiers changed from: 0000 */
    @C0054q(mo125a = Event.ON_DESTROY)
    public void onDestroy() {
        this.f33312a.getLifecycle().mo56b(this);
        this.f33314c.f33545a.mo3436b(this.f33313b);
    }

    SceneActivityCompatibilityLayerFragment$1(C12634k kVar, C0043i iVar, int i) {
        this.f33314c = kVar;
        this.f33312a = iVar;
        this.f33313b = i;
    }
}
