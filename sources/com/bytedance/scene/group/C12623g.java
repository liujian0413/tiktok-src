package com.bytedance.scene.group;

import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0044j;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.Lifecycle.Event;

/* renamed from: com.bytedance.scene.group.g */
final class C12623g implements C0043i {

    /* renamed from: a */
    private C0044j f33502a;

    public final Lifecycle getLifecycle() {
        m36621a();
        return this.f33502a;
    }

    /* renamed from: a */
    private void m36621a() {
        if (this.f33502a == null) {
            this.f33502a = new C0044j(this);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo30986a(Event event) {
        m36621a();
        this.f33502a.mo116a(event);
    }
}
