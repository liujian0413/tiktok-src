package com.bytedance.scene;

import android.app.Activity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.bytedance.scene.C12629j;
import com.bytedance.scene.C12672q;
import com.bytedance.scene.C12675t.C12677a;
import com.bytedance.scene.utlity.C12700j;

/* renamed from: com.bytedance.scene.p */
public final class C12670p<T extends C12629j & C12672q> {

    /* renamed from: a */
    private T f33640a;

    /* renamed from: b */
    private C12671a f33641b = C12671a.NONE;

    /* renamed from: c */
    private boolean f33642c;

    /* renamed from: com.bytedance.scene.p$a */
    enum C12671a {
        NONE,
        ACTIVITY_CREATED,
        START,
        RESUME,
        PAUSE,
        STOP
    }

    /* renamed from: a */
    public final void mo31115a() {
        if (this.f33641b == C12671a.ACTIVITY_CREATED || this.f33641b == C12671a.STOP) {
            this.f33641b = C12671a.START;
            this.f33640a.mo30950g();
            return;
        }
        StringBuilder sb = new StringBuilder("invoke onActivityCreated() or onStop() first, current state ");
        sb.append(this.f33641b.toString());
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: b */
    public final void mo31118b() {
        if (this.f33641b == C12671a.START || this.f33641b == C12671a.PAUSE) {
            this.f33641b = C12671a.RESUME;
            this.f33640a.mo30951h();
            return;
        }
        StringBuilder sb = new StringBuilder("invoke onStart() or onPause() first, current state ");
        sb.append(this.f33641b.toString());
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: c */
    public final void mo31119c() {
        if (this.f33641b == C12671a.RESUME) {
            this.f33641b = C12671a.PAUSE;
            this.f33640a.mo30952i();
            return;
        }
        StringBuilder sb = new StringBuilder("invoke onResume() first, current state ");
        sb.append(this.f33641b.toString());
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: d */
    public final void mo31120d() {
        if (this.f33641b == C12671a.PAUSE || this.f33641b == C12671a.START) {
            this.f33641b = C12671a.STOP;
            this.f33640a.mo30953j();
            return;
        }
        StringBuilder sb = new StringBuilder("invoke onPause() or onStart() first, current state ");
        sb.append(this.f33641b.toString());
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: e */
    public final void mo31121e() {
        if (this.f33641b == C12671a.STOP || this.f33641b == C12671a.ACTIVITY_CREATED) {
            this.f33641b = C12671a.NONE;
            this.f33640a.mo30954k();
            this.f33640a.mo30955l();
            this.f33640a.mo30956m();
            this.f33640a.mo30957n();
            this.f33640a.f33525d = null;
            this.f33640a = null;
            return;
        }
        StringBuilder sb = new StringBuilder("invoke onStop() or onActivityCreated() first, current state ");
        sb.append(this.f33641b.toString());
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: a */
    public final void mo31117a(Bundle bundle) {
        C12700j.m36907a(bundle, "outState can't be null");
        if (this.f33641b == C12671a.NONE) {
            StringBuilder sb = new StringBuilder("invoke onActivityCreated() first, current state ");
            sb.append(this.f33641b.toString());
            throw new IllegalStateException(sb.toString());
        } else if (this.f33642c) {
            this.f33640a.mo30939c(bundle);
        } else {
            throw new IllegalArgumentException("cant invoke onSaveInstanceState when not support restore");
        }
    }

    /* renamed from: a */
    public final void mo31116a(Activity activity, ViewGroup viewGroup, T t, C12677a aVar, boolean z, Bundle bundle) {
        if (this.f33641b == C12671a.NONE) {
            C12700j.m36907a(activity, "activity can't be null");
            C12700j.m36907a(viewGroup, "viewGroup can't be null");
            C12700j.m36907a(t, "scene can't be null");
            C12700j.m36907a(aVar, "rootScopeFactory can't be null");
            if (t.f33528f == State.NONE) {
                this.f33642c = z;
                if (this.f33642c || bundle == null) {
                    this.f33641b = C12671a.ACTIVITY_CREATED;
                    this.f33640a = t;
                    if (!this.f33642c) {
                        ((C12672q) this.f33640a).bT_();
                    }
                    this.f33640a.f33525d = aVar;
                    this.f33640a.mo30926a(activity);
                    this.f33640a.mo30930a((C12629j) null);
                    this.f33640a.mo30927a(bundle);
                    this.f33640a.mo30928a(bundle, viewGroup);
                    viewGroup.addView(this.f33640a.mo31010r_(), new LayoutParams(-1, -1));
                    this.f33640a.mo30934b(bundle);
                    return;
                }
                throw new IllegalArgumentException("savedInstanceState should be null when not support restore");
            }
            StringBuilder sb = new StringBuilder("Scene state must be ");
            sb.append(State.NONE.name);
            throw new IllegalStateException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder("invoke onDestroyView() first, current state ");
        sb2.append(this.f33641b.toString());
        throw new IllegalStateException(sb2.toString());
    }
}
