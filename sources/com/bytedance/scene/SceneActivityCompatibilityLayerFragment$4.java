package com.bytedance.scene;

import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.Lifecycle.Event;
import com.bytedance.scene.navigation.C12646b;

class SceneActivityCompatibilityLayerFragment$4 implements C0042h {

    /* renamed from: a */
    final /* synthetic */ C0043i f33321a;

    /* renamed from: b */
    final /* synthetic */ C12646b f33322b;

    /* renamed from: c */
    final /* synthetic */ C12634k f33323c;

    /* access modifiers changed from: 0000 */
    @C0054q(mo125a = Event.ON_DESTROY)
    public void onDestroy() {
        this.f33321a.getLifecycle().mo56b(this);
        this.f33323c.f33547c.remove(this.f33322b);
    }
}
