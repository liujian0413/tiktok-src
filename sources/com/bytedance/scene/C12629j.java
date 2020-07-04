package com.bytedance.scene;

import android.app.Activity;
import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0044j;
import android.arch.lifecycle.C0070y;
import android.arch.lifecycle.C0071z;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.Lifecycle.Event;
import android.arch.lifecycle.Lifecycle.State;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.p022v4.view.C0991u;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.scene.C12675t.C12677a;
import com.bytedance.scene.C12675t.C12678b;
import com.bytedance.scene.navigation.C12648d;
import com.bytedance.scene.p643c.C12594d;
import com.bytedance.scene.utlity.C12700j;
import com.bytedance.scene.utlity.SceneInternalException;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.scene.j */
public abstract class C12629j implements C0043i, C0071z {

    /* renamed from: b */
    public View f33523b;

    /* renamed from: c */
    public C12629j f33524c;

    /* renamed from: d */
    public C12677a f33525d = C12675t.f33650a;

    /* renamed from: d_ */
    public Activity f33526d_;

    /* renamed from: e */
    public C12648d f33527e;

    /* renamed from: f */
    public State f33528f = State.NONE;

    /* renamed from: g */
    public Bundle f33529g;

    /* renamed from: h */
    public int f33530h;

    /* renamed from: i */
    private Context f33531i;

    /* renamed from: j */
    private LayoutInflater f33532j;

    /* renamed from: k */
    private C12675t f33533k;

    /* renamed from: l */
    private final StringBuilder f33534l = new StringBuilder(this.f33528f.name);

    /* renamed from: m */
    private final Handler f33535m = new Handler(Looper.getMainLooper());

    /* renamed from: n */
    private final List<Runnable> f33536n = new ArrayList();

    /* renamed from: o */
    private boolean f33537o = false;

    /* renamed from: p */
    private boolean f33538p = false;

    /* renamed from: q */
    private final C12632a f33539q = new C12632a(new C0044j(this));

    /* renamed from: com.bytedance.scene.j$a */
    static class C12632a extends Lifecycle {

        /* renamed from: a */
        private final C0044j f33542a;

        /* renamed from: b */
        private final List<C0042h> f33543b;

        /* renamed from: a */
        public final State mo54a() {
            return this.f33542a.mo54a();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo31021b() {
            for (C0042h b : this.f33543b) {
                this.f33542a.mo56b(b);
            }
            this.f33542a.mo117a(State.INITIALIZED);
            for (C0042h a : this.f33543b) {
                this.f33542a.mo55a(a);
            }
        }

        private C12632a(C0044j jVar) {
            this.f33543b = new ArrayList();
            this.f33542a = jVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo31020a(Event event) {
            this.f33542a.mo116a(event);
        }

        /* renamed from: b */
        public final void mo56b(C0042h hVar) {
            this.f33543b.remove(hVar);
            this.f33542a.mo56b(hVar);
        }

        /* renamed from: a */
        public final void mo55a(C0042h hVar) {
            this.f33543b.add(hVar);
            this.f33542a.mo55a(hVar);
        }
    }

    /* renamed from: com.bytedance.scene.j$b */
    static class C12633b implements C12678b {

        /* renamed from: a */
        public C0070y f33544a;

        /* renamed from: a */
        public final void mo31022a() {
            this.f33544a.mo151a();
        }

        private C12633b(C0070y yVar) {
            this.f33544a = yVar;
        }
    }

    /* renamed from: H */
    private void mo30921H() {
        this.f33537o = true;
    }

    /* renamed from: B */
    public void mo30994B() {
        this.f33537o = true;
    }

    /* renamed from: a */
    public abstract View mo30923a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle);

    public final Lifecycle getLifecycle() {
        return this.f33539q;
    }

    /* renamed from: o */
    public void mo31006o() {
        this.f33537o = true;
    }

    /* renamed from: p */
    public void mo31007p() {
        this.f33537o = true;
    }

    /* renamed from: q */
    public void mo31008q() {
        this.f33537o = true;
    }

    /* renamed from: z */
    public void mo31019z() {
        this.f33537o = true;
    }

    /* renamed from: a */
    public void mo30932a(C12629j jVar, boolean z) {
        C12629j jVar2 = this.f33524c;
        if (jVar2 != null) {
            jVar2.mo30932a(jVar, jVar == this);
        }
    }

    /* renamed from: A */
    public void mo30993A() {
        this.f33537o = true;
        mo96987K();
    }

    /* renamed from: C */
    public void mo30995C() {
        this.f33537o = true;
        mo30997E();
    }

    public final int hashCode() {
        return super.hashCode();
    }

    /* renamed from: m */
    public void mo30956m() {
        this.f33524c = null;
        this.f33527e = null;
    }

    /* renamed from: D */
    public final boolean mo30996D() {
        if (this.f33528f.value >= State.STARTED.value) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final void mo30997E() {
        boolean D = mo30996D();
        if (D != this.f33538p) {
            this.f33538p = D;
        }
    }

    /* renamed from: F */
    public final C12675t mo30998F() {
        if (this.f33533k != null) {
            return this.f33533k;
        }
        throw new IllegalStateException("Scope is not created, you can't call before onCreate");
    }

    /* access modifiers changed from: protected */
    /* renamed from: q_ */
    public final LayoutInflater mo31009q_() {
        if (this.f33532j == null) {
            this.f33532j = mo30920G();
        }
        return this.f33532j;
    }

    /* renamed from: r_ */
    public final View mo31010r_() {
        View view = this.f33523b;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("requireView() should not be called before onCreateView() or after onDestroyView()");
    }

    /* renamed from: s */
    public final Context mo31011s() {
        if (this.f33526d_ == null) {
            return null;
        }
        return this.f33526d_.getApplicationContext();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
        C12700j.m36912a((Object) this, sb);
        return sb.toString();
    }

    /* renamed from: x */
    public final Resources mo31017x() {
        return mo31015v().getResources();
    }

    /* renamed from: G */
    private LayoutInflater mo30920G() {
        if (this.f33526d_ != null) {
            return this.f33526d_.getLayoutInflater().cloneInContext(mo31014u());
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Scene is attached to the Activity.");
    }

    /* renamed from: t */
    public final Context mo31012t() {
        if (this.f33526d_ == null) {
            return null;
        }
        if (this.f33531i == null) {
            this.f33531i = mo30922I();
        }
        return this.f33531i;
    }

    /* renamed from: u */
    public final Context mo31014u() {
        Context t = mo31012t();
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("Scene ");
        sb.append(this);
        sb.append(" not attached to an activity.");
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: v */
    public final Activity mo31015v() {
        Activity activity = this.f33526d_;
        if (activity != null) {
            return activity;
        }
        StringBuilder sb = new StringBuilder("Scene ");
        sb.append(this);
        sb.append(" not attached to an activity.");
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: w */
    public final Context mo31016w() {
        Context s = mo31011s();
        if (s != null) {
            return s;
        }
        StringBuilder sb = new StringBuilder("Scene ");
        sb.append(this);
        sb.append(" not attached to a context.");
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: I */
    private Context mo30922I() {
        if (this.f33526d_ == null) {
            throw new IllegalStateException("onGetContextThemeWrapper() cannot be executed until the Scene is attached to the Activity.");
        } else if (this.f33530h > 0) {
            return new C12594d(this.f33526d_, this.f33530h) {
                public final Object getSystemService(String str) {
                    if ("scene".equals(str)) {
                        return C12629j.this;
                    }
                    if (!"layout_inflater".equals(str) || C12629j.this.f33526d_ == null) {
                        return super.getSystemService(str);
                    }
                    return C12629j.this.mo31009q_();
                }
            };
        } else {
            return new C12594d(this.f33526d_, this.f33526d_.getTheme()) {
                public final Object getSystemService(String str) {
                    if ("scene".equals(str)) {
                        return C12629j.this;
                    }
                    if (!"layout_inflater".equals(str) || C12629j.this.f33526d_ == null) {
                        return super.getSystemService(str);
                    }
                    return C12629j.this.mo31009q_();
                }
            };
        }
    }

    /* renamed from: K */
    private void mo96987K() {
        if (this.f33536n.size() > 0) {
            ArrayList<Runnable> arrayList = new ArrayList<>(this.f33536n);
            for (Runnable run : arrayList) {
                run.run();
            }
            this.f33536n.removeAll(arrayList);
        }
    }

    public final C0070y getViewModelStore() {
        C12675t F = mo30998F();
        if (F.mo31125a((Object) C12633b.class)) {
            return ((C12633b) F.mo31126b((Object) C12633b.class)).f33544a;
        }
        C0070y yVar = new C0070y();
        F.mo31124a((Object) C12633b.class, (Object) new C12633b(yVar));
        return yVar;
    }

    /* renamed from: i */
    public void mo30952i() {
        this.f33539q.mo31020a(Event.ON_PAUSE);
        m36643a(State.STARTED);
        this.f33537o = false;
        mo30994B();
        if (this.f33537o) {
            mo30946d(this, false);
            return;
        }
        StringBuilder sb = new StringBuilder("Scene ");
        sb.append(this);
        sb.append(" did not call through to super.onPause()");
        throw new C12702w(sb.toString());
    }

    /* renamed from: j */
    public void mo30953j() {
        this.f33539q.mo31020a(Event.ON_STOP);
        m36643a(State.ACTIVITY_CREATED);
        this.f33537o = false;
        mo30995C();
        if (this.f33537o) {
            mo30942c(this, false);
            return;
        }
        StringBuilder sb = new StringBuilder("Scene ");
        sb.append(this);
        sb.append(" did not call through to super.onStop()");
        throw new C12702w(sb.toString());
    }

    /* renamed from: l */
    public void mo30955l() {
        this.f33537o = false;
        mo31008q();
        if (this.f33537o) {
            mo30949f(this, false);
            return;
        }
        StringBuilder sb = new StringBuilder("Scene ");
        sb.append(this);
        sb.append(" did not call through to super.onDestroy()");
        throw new C12702w(sb.toString());
    }

    /* renamed from: n */
    public void mo30957n() {
        Activity activity = this.f33526d_;
        this.f33526d_ = null;
        this.f33531i = null;
        this.f33537o = false;
        mo30921H();
        if (this.f33537o) {
            if (!activity.isChangingConfigurations()) {
                this.f33533k.mo31127b();
            }
            this.f33533k = null;
            this.f33536n.clear();
            return;
        }
        StringBuilder sb = new StringBuilder("Scene ");
        sb.append(this);
        sb.append(" did not call through to super.onDetach()");
        throw new C12702w(sb.toString());
    }

    /* renamed from: g */
    public void mo30950g() {
        this.f33537o = false;
        mo31019z();
        if (this.f33537o) {
            mo30932a(this, false);
            m36643a(State.STARTED);
            mo30997E();
            this.f33539q.mo31020a(Event.ON_START);
            return;
        }
        StringBuilder sb = new StringBuilder("Scene ");
        sb.append(this);
        sb.append(" did not call through to super.onStart()");
        throw new C12702w(sb.toString());
    }

    /* renamed from: h */
    public void mo30951h() {
        this.f33537o = false;
        mo30993A();
        if (this.f33537o) {
            mo30937b(this, false);
            m36643a(State.RESUMED);
            this.f33539q.mo31020a(Event.ON_RESUME);
            return;
        }
        StringBuilder sb = new StringBuilder("Scene ");
        sb.append(this);
        sb.append(" did not call through to super.onResume()");
        throw new C12702w(sb.toString());
    }

    /* renamed from: k */
    public void mo30954k() {
        this.f33539q.mo31020a(Event.ON_DESTROY);
        m36643a(State.NONE);
        this.f33537o = false;
        mo31007p();
        if (this.f33537o) {
            mo30947e(this, false);
            if (VERSION.SDK_INT >= 19) {
                this.f33523b.cancelPendingInputEvents();
            }
            this.f33523b = null;
            this.f33532j = null;
            return;
        }
        StringBuilder sb = new StringBuilder("Scene ");
        sb.append(this);
        sb.append(" did not call through to super.onDestroyView()");
        throw new C12702w(sb.toString());
    }

    /* renamed from: y */
    public final C12648d mo31018y() {
        C12648d dVar = this.f33527e;
        if (dVar != null) {
            return dVar;
        }
        if (mo31011s() == null) {
            StringBuilder sb = new StringBuilder("Scene ");
            sb.append(this);
            sb.append(" is not attached to any Scene");
            throw new IllegalStateException(sb.toString());
        } else if (this instanceof C12648d) {
            StringBuilder sb2 = new StringBuilder("Scene ");
            sb2.append(this);
            sb2.append(" is root Scene");
            throw new IllegalStateException(sb2.toString());
        } else {
            throw new IllegalStateException("The root of the Scene hierarchy is not NavigationScene");
        }
    }

    /* renamed from: d */
    public void mo30944d(Bundle bundle) {
        this.f33537o = true;
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* renamed from: a */
    public final String mo30999a(int i) {
        return mo31017x().getString(i);
    }

    /* renamed from: b */
    public final <T extends View> T mo31002b(int i) {
        View view = this.f33523b;
        if (view == null) {
            return null;
        }
        return view.findViewById(i);
    }

    /* renamed from: g */
    private void m36644g(Bundle bundle) {
        this.f33537o = false;
        m36645h(bundle);
        if (!this.f33537o) {
            StringBuilder sb = new StringBuilder("Scene ");
            sb.append(this);
            sb.append(" did not call through to super.onViewStateRestored()");
            throw new C12702w(sb.toString());
        }
    }

    /* renamed from: h */
    private void m36645h(Bundle bundle) {
        this.f33537o = true;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("bd-scene:views");
        if (sparseParcelableArray != null) {
            this.f33523b.restoreHierarchyState(sparseParcelableArray);
        }
        int i = bundle.getInt("bd-scene:focusedViewId", -1);
        if (i != -1) {
            View findViewById = this.f33523b.findViewById(i);
            if (findViewById != null) {
                findViewById.requestFocus();
            }
        }
    }

    /* renamed from: a */
    public void mo30926a(Activity activity) {
        this.f33526d_ = activity;
        if (this.f33539q.mo54a() != State.INITIALIZED) {
            this.f33539q.mo31021b();
        }
    }

    /* renamed from: b */
    public void mo30934b(Bundle bundle) {
        this.f33537o = false;
        mo30985e(bundle);
        if (this.f33537o) {
            mo30936b(this, bundle, false);
            if (bundle != null) {
                m36644g(bundle);
            }
            m36643a(State.ACTIVITY_CREATED);
            this.f33539q.mo31020a(Event.ON_CREATE);
            return;
        }
        StringBuilder sb = new StringBuilder("Scene ");
        sb.append(this);
        sb.append(" did not call through to super.onActivityCreated()");
        throw new C12702w(sb.toString());
    }

    /* renamed from: c */
    public void mo30939c(Bundle bundle) {
        this.f33537o = false;
        mo30948f(bundle);
        if (!this.f33537o) {
            StringBuilder sb = new StringBuilder("Scene ");
            sb.append(this);
            sb.append(" did not call through to super.onSaveInstanceState()");
            throw new C12702w(sb.toString());
        }
    }

    /* renamed from: e */
    public void mo30985e(Bundle bundle) {
        View decorView = mo31015v().getWindow().getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        if ((systemUiVisibility & PreloadTask.BYTE_UNIT_NUMBER) != 0) {
            C0991u.m4243v(decorView);
        } else if ((systemUiVisibility & 512) != 0) {
            C0991u.m4243v(decorView);
        }
        this.f33537o = true;
    }

    /* renamed from: a */
    private void m36643a(State state) {
        State state2 = this.f33528f;
        if (state.value > state2.value) {
            if (state.value - state2.value != 1) {
                StringBuilder sb = new StringBuilder("Cant setState from ");
                sb.append(state2.name);
                sb.append(" to ");
                sb.append(state.name);
                throw new SceneInternalException(sb.toString());
            }
        } else if (state.value < state2.value && !((state2 == State.ACTIVITY_CREATED && state == State.NONE) || state.value - state2.value == -1)) {
            StringBuilder sb2 = new StringBuilder("Cant setState from ");
            sb2.append(state2.name);
            sb2.append(" to ");
            sb2.append(state.name);
            throw new SceneInternalException(sb2.toString());
        }
        this.f33528f = state;
        StringBuilder sb3 = this.f33534l;
        StringBuilder sb4 = new StringBuilder(" - ");
        sb4.append(state.name);
        sb3.append(sb4.toString());
    }

    /* renamed from: f */
    public void mo30948f(Bundle bundle) {
        this.f33537o = true;
        if (this.f33529g != null) {
            bundle.putBoolean("bd-scene-nav:scene_argument_has", true);
            bundle.putBundle("bd-scene-nav:scene_argument", this.f33529g);
        } else {
            bundle.putBoolean("bd-scene-nav:scene_argument_has", false);
        }
        this.f33533k.mo31123a(bundle);
        SparseArray sparseArray = new SparseArray();
        this.f33523b.saveHierarchyState(sparseArray);
        bundle.putSparseParcelableArray("bd-scene:views", sparseArray);
        View findFocus = this.f33523b.findFocus();
        if (!(findFocus == null || findFocus.getId() == -1)) {
            bundle.putInt("bd-scene:focusedViewId", findFocus.getId());
        }
        mo30941c(this, bundle, false);
    }

    /* renamed from: h_ */
    public final <T extends View> T mo31004h_(int i) {
        T findViewById = mo31010r_().findViewById(i);
        if (findViewById != null) {
            return findViewById;
        }
        try {
            String resourceName = mo31017x().getResourceName(i);
            StringBuilder sb = new StringBuilder(" ");
            sb.append(resourceName);
            sb.append(" view not found");
            throw new IllegalArgumentException(sb.toString());
        } catch (NotFoundException unused) {
            StringBuilder sb2 = new StringBuilder(" ");
            sb2.append(i);
            sb2.append(" view not found");
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    /* renamed from: a */
    public void mo30927a(Bundle bundle) {
        if (this.f33524c == null) {
            this.f33533k = this.f33525d.mo31128a();
        } else {
            this.f33533k = this.f33524c.mo30998F().mo31122a(this, bundle);
        }
        if (bundle != null && bundle.getBoolean("bd-scene-nav:scene_argument_has")) {
            Bundle bundle2 = bundle.getBundle("bd-scene-nav:scene_argument");
            if (bundle2 != null) {
                bundle2.setClassLoader(getClass().getClassLoader());
                this.f33529g = bundle2;
            } else {
                throw new IllegalStateException("can't get Scene arguments from savedInstanceState");
            }
        }
        this.f33537o = false;
        mo30944d(bundle);
        if (this.f33537o) {
            mo30931a(this, bundle, false);
            return;
        }
        StringBuilder sb = new StringBuilder("Scene ");
        sb.append(this);
        sb.append(" did not call through to super.onCreate()");
        throw new C12702w(sb.toString());
    }

    /* renamed from: a */
    public void mo30930a(C12629j jVar) {
        if (jVar != null) {
            this.f33524c = jVar;
            if (this.f33524c instanceof C12648d) {
                this.f33527e = (C12648d) this.f33524c;
            } else {
                this.f33527e = this.f33524c.f33527e;
            }
        }
        this.f33537o = false;
        mo31006o();
        if (!this.f33537o) {
            StringBuilder sb = new StringBuilder("Scene ");
            sb.append(this);
            sb.append(" did not call through to super.onAttach()");
            throw new C12702w(sb.toString());
        }
    }

    /* renamed from: a */
    public void mo31001a(View view, Bundle bundle) {
        this.f33537o = true;
    }

    /* renamed from: d */
    public void mo30946d(C12629j jVar, boolean z) {
        boolean z2;
        C12629j jVar2 = this.f33524c;
        if (jVar2 != null) {
            if (jVar == this) {
                z2 = true;
            } else {
                z2 = false;
            }
            jVar2.mo30946d(jVar, z2);
        }
    }

    /* renamed from: e */
    public void mo30947e(C12629j jVar, boolean z) {
        boolean z2;
        C12629j jVar2 = this.f33524c;
        if (jVar2 != null) {
            if (jVar == this) {
                z2 = true;
            } else {
                z2 = false;
            }
            jVar2.mo30947e(jVar, z2);
        }
    }

    /* renamed from: f */
    public void mo30949f(C12629j jVar, boolean z) {
        boolean z2;
        C12629j jVar2 = this.f33524c;
        if (jVar2 != null) {
            if (jVar == this) {
                z2 = true;
            } else {
                z2 = false;
            }
            jVar2.mo30949f(jVar, z2);
        }
    }

    /* renamed from: a */
    public final String mo31000a(int i, Object... objArr) {
        return mo31017x().getString(i, objArr);
    }

    /* renamed from: c */
    public void mo30942c(C12629j jVar, boolean z) {
        boolean z2;
        C12629j jVar2 = this.f33524c;
        if (jVar2 != null) {
            if (jVar == this) {
                z2 = true;
            } else {
                z2 = false;
            }
            jVar2.mo30942c(jVar, z2);
        }
    }

    /* renamed from: b */
    public void mo30937b(C12629j jVar, boolean z) {
        boolean z2;
        C12629j jVar2 = this.f33524c;
        if (jVar2 != null) {
            if (jVar == this) {
                z2 = true;
            } else {
                z2 = false;
            }
            jVar2.mo30937b(jVar, z2);
        }
    }

    /* renamed from: a */
    public void mo30928a(Bundle bundle, ViewGroup viewGroup) {
        if (this.f33523b == null) {
            View a = mo30923a(mo31009q_(), viewGroup, bundle);
            if (a == null) {
                throw new IllegalArgumentException("onCreateView cant return null");
            } else if (a.getParent() == null) {
                a.getId();
                Context u = mo31014u();
                Context context = a.getContext();
                if (context == u || this.f33530h == 0 || context.getSystemService("scene") == this) {
                    a.setTag(R.id.sk, this);
                    a.setSaveFromParentEnabled(false);
                    this.f33523b = a;
                    this.f33537o = false;
                    mo31001a(this.f33523b, bundle);
                    if (this.f33537o) {
                        m36643a(State.VIEW_CREATED);
                        return;
                    }
                    StringBuilder sb = new StringBuilder("Scene ");
                    sb.append(this);
                    sb.append(" did not call through to super.onViewCreated()");
                    throw new C12702w(sb.toString());
                }
                throw new IllegalArgumentException("Scene view's context is incorrect, you should create view with getLayoutInflater() or requireSceneContext() instead");
            } else {
                throw new IllegalArgumentException("onCreateView returned view already has a parent. You must call removeView() on the view's parent first.");
            }
        } else {
            throw new IllegalArgumentException("Scene already call onCreateView");
        }
    }

    /* renamed from: c */
    public void mo30941c(C12629j jVar, Bundle bundle, boolean z) {
        boolean z2;
        C12629j jVar2 = this.f33524c;
        if (jVar2 != null) {
            if (jVar == this) {
                z2 = true;
            } else {
                z2 = false;
            }
            jVar2.mo30941c(jVar, bundle, z2);
        }
    }

    /* renamed from: b */
    public void mo30936b(C12629j jVar, Bundle bundle, boolean z) {
        boolean z2;
        C12629j jVar2 = this.f33524c;
        if (jVar2 != null) {
            if (jVar == this) {
                z2 = true;
            } else {
                z2 = false;
            }
            jVar2.mo30936b(jVar, bundle, z2);
        }
    }

    /* renamed from: a */
    public void mo30931a(C12629j jVar, Bundle bundle, boolean z) {
        boolean z2;
        C12629j jVar2 = this.f33524c;
        if (jVar2 != null) {
            if (jVar == this) {
                z2 = true;
            } else {
                z2 = false;
            }
            jVar2.mo30931a(jVar, bundle, z2);
        }
    }
}
