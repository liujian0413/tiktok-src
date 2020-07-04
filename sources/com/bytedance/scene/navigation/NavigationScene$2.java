package com.bytedance.scene.navigation;

import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.Lifecycle.Event;

class NavigationScene$2 implements C0042h {

    /* renamed from: a */
    final /* synthetic */ C0043i f33563a;

    /* renamed from: b */
    final /* synthetic */ C12667g f33564b;

    /* renamed from: c */
    final /* synthetic */ C12648d f33565c;

    /* access modifiers changed from: 0000 */
    @C0054q(mo125a = Event.ON_DESTROY)
    public void onDestroy() {
        this.f33563a.getLifecycle().mo56b(this);
        this.f33565c.f33576k.mo31082a(this.f33564b);
    }

    NavigationScene$2(C12648d dVar, C0043i iVar, C12667g gVar) {
        this.f33565c = dVar;
        this.f33563a = iVar;
        this.f33564b = gVar;
    }
}
