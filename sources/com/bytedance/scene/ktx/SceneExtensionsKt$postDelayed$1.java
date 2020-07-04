package com.bytedance.scene.ktx;

import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.Lifecycle.Event;

public final class SceneExtensionsKt$postDelayed$1 implements C0042h {

    /* renamed from: a */
    final /* synthetic */ Runnable f33550a;

    @C0054q(mo125a = Event.ON_DESTROY)
    public final void onDestroy() {
        C12637b.m36713a().removeCallbacks(this.f33550a);
    }

    SceneExtensionsKt$postDelayed$1(Runnable runnable) {
        this.f33550a = runnable;
    }
}
