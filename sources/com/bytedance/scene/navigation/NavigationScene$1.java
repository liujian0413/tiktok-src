package com.bytedance.scene.navigation;

import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.Lifecycle.Event;

class NavigationScene$1 implements C0042h {

    /* renamed from: a */
    final /* synthetic */ C0043i f33560a;

    /* renamed from: b */
    final /* synthetic */ C12647c f33561b;

    /* renamed from: c */
    final /* synthetic */ C12648d f33562c;

    /* access modifiers changed from: 0000 */
    @C0054q(mo125a = Event.ON_DESTROY)
    public void onDestroy() {
        this.f33560a.getLifecycle().mo56b(this);
        this.f33562c.f33581p.remove(this.f33561b);
    }

    NavigationScene$1(C12648d dVar, C0043i iVar, C12647c cVar) {
        this.f33562c = dVar;
        this.f33560a = iVar;
        this.f33561b = cVar;
    }
}
