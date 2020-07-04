package com.bytedance.scene.ktx;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.Lifecycle.State;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.scene.C12629j;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference0;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.bytedance.scene.ktx.b */
public final class C12637b {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f33551a = {C7575l.m23601a((PropertyReference0) new PropertyReference0Impl(C7575l.m23596a(C12637b.class, "scene_ktx_release"), "HANDLER", "getHANDLER()Landroid/os/Handler;"))};

    /* renamed from: b */
    private static final C7541d f33552b = C7546e.m23569a(C12638a.f33553a);

    /* renamed from: com.bytedance.scene.ktx.b$a */
    static final class C12638a extends Lambda implements C7561a<Handler> {

        /* renamed from: a */
        public static final C12638a f33553a = new C12638a();

        C12638a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m36716a();
        }

        /* renamed from: a */
        private static Handler m36716a() {
            return new Handler(Looper.getMainLooper());
        }
    }

    /* renamed from: a */
    public static final Handler m36713a() {
        return (Handler) f33552b.getValue();
    }

    /* renamed from: a */
    public static final void m36714a(C12629j jVar, Runnable runnable) {
        C7573i.m23587b(jVar, "$this$post");
        C7573i.m23587b(runnable, "runnable");
        Lifecycle lifecycle = jVar.getLifecycle();
        C7573i.m23582a((Object) lifecycle, "this.lifecycle");
        if (lifecycle.mo54a() != State.DESTROYED) {
            m36713a().post(runnable);
            jVar.getLifecycle().mo55a(new SceneExtensionsKt$post$1(runnable));
        }
    }

    /* renamed from: a */
    public static final void m36715a(C12629j jVar, Runnable runnable, long j) {
        C7573i.m23587b(jVar, "$this$postDelayed");
        C7573i.m23587b(runnable, "runnable");
        Lifecycle lifecycle = jVar.getLifecycle();
        C7573i.m23582a((Object) lifecycle, "this.lifecycle");
        if (lifecycle.mo54a() != State.DESTROYED) {
            m36713a().postDelayed(runnable, 200);
            jVar.getLifecycle().mo55a(new SceneExtensionsKt$postDelayed$1(runnable));
        }
    }
}
