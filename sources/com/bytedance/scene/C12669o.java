package com.bytedance.scene;

import android.app.Activity;
import android.os.Bundle;
import android.view.ViewGroup;
import com.bytedance.scene.C12629j;
import com.bytedance.scene.C12672q;
import com.bytedance.scene.C12675t.C12677a;

/* renamed from: com.bytedance.scene.o */
public final class C12669o<T extends C12629j & C12672q> implements C12641m {

    /* renamed from: a */
    private final int f33634a;

    /* renamed from: b */
    private final C12703x f33635b;

    /* renamed from: c */
    private final T f33636c;

    /* renamed from: d */
    private final C12677a f33637d;

    /* renamed from: e */
    private final boolean f33638e;

    /* renamed from: f */
    private final C12670p<T> f33639f = new C12670p<>();

    /* renamed from: a */
    public final void mo31033a() {
        C12673r.m36850a("SceneLifecycleDispatcher#OnStart");
        this.f33639f.mo31115a();
        C12673r.m36849a();
    }

    /* renamed from: b */
    public final void mo31036b() {
        C12673r.m36850a("SceneLifecycleDispatcher#OnResume");
        this.f33639f.mo31118b();
        C12673r.m36849a();
    }

    /* renamed from: c */
    public final void mo31037c() {
        C12673r.m36850a("SceneLifecycleDispatcher#OnPause");
        this.f33639f.mo31119c();
        C12673r.m36849a();
    }

    /* renamed from: d */
    public final void mo31038d() {
        C12673r.m36850a("SceneLifecycleDispatcher#OnStop");
        this.f33639f.mo31120d();
        C12673r.m36849a();
    }

    /* renamed from: e */
    public final void mo31039e() {
        C12673r.m36850a("SceneLifecycleDispatcher#OnDestroyView");
        this.f33639f.mo31121e();
        C12673r.m36849a();
    }

    /* renamed from: a */
    public final void mo31035a(Bundle bundle) {
        if (this.f33638e) {
            bundle.putString("SCENE", this.f33636c.getClass().getName());
            C12673r.m36850a("SceneLifecycleDispatcher#OnSaveInstance");
            this.f33639f.mo31117a(bundle);
            C12673r.m36849a();
        }
    }

    /* renamed from: a */
    public final void mo31034a(Activity activity, Bundle bundle) {
        C12673r.m36850a("SceneLifecycleDispatcher#OnActivityCreated");
        ViewGroup viewGroup = (ViewGroup) this.f33635b.mo30855a(this.f33634a);
        C12670p<T> pVar = this.f33639f;
        T t = this.f33636c;
        C12677a aVar = this.f33637d;
        boolean z = this.f33638e;
        if (!this.f33638e) {
            bundle = null;
        }
        pVar.mo31116a(activity, viewGroup, t, aVar, z, bundle);
        C12673r.m36849a();
    }

    public C12669o(int i, C12703x xVar, T t, C12677a aVar, boolean z) {
        this.f33634a = i;
        this.f33635b = xVar;
        this.f33636c = t;
        this.f33637d = aVar;
        this.f33638e = z;
    }
}
