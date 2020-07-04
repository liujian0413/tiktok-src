package com.bytedance.scene.navigation;

import android.app.Activity;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.Lifecycle;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p022v4.util.C0894f;
import android.support.p022v4.view.C0991u;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.bytedance.scene.C12555a;
import com.bytedance.scene.C12629j;
import com.bytedance.scene.C12640l;
import com.bytedance.scene.C12672q;
import com.bytedance.scene.State;
import com.bytedance.scene.group.C12621e;
import com.bytedance.scene.p639a.C12565c;
import com.bytedance.scene.p639a.p640a.C12558a;
import com.bytedance.scene.p639a.p641b.C12563a.C12564a;
import com.bytedance.scene.p642b.C12582a;
import com.bytedance.scene.p642b.C12584c;
import com.bytedance.scene.p642b.C12586e;
import com.bytedance.scene.p642b.C12586e.C12588a;
import com.bytedance.scene.p643c.C12591a;
import com.bytedance.scene.p643c.C12592b;
import com.bytedance.scene.utlity.C12694d;
import com.bytedance.scene.utlity.C12696f;
import com.bytedance.scene.utlity.C12698h;
import com.bytedance.scene.utlity.C12699i;
import com.bytedance.scene.utlity.C12700j;
import com.bytedance.scene.utlity.SceneInstanceUtility;
import com.bytedance.scene.utlity.SceneInternalException;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.scene.navigation.d */
public final class C12648d extends C12629j implements C12647c, C12672q {

    /* renamed from: i */
    public C12640l f33574i;

    /* renamed from: j */
    C12666f f33575j;

    /* renamed from: k */
    public C12651e f33576k;

    /* renamed from: l */
    public FrameLayout f33577l;

    /* renamed from: m */
    public FrameLayout f33578m;

    /* renamed from: n */
    public C12565c f33579n = new C12558a();

    /* renamed from: o */
    public final List<C12564a> f33580o = new ArrayList();

    /* renamed from: p */
    public final List<C12647c> f33581p = new ArrayList();

    /* renamed from: q */
    private boolean f33582q = true;

    /* renamed from: r */
    private final C0894f<Class, C12621e> f33583r = new C0894f<>(3);

    /* renamed from: s */
    private final List<C12696f<C12584c, Boolean>> f33584s = new ArrayList();

    /* renamed from: t */
    private C12564a f33585t = new C12564a() {
    };

    public final void bT_() {
        this.f33582q = false;
    }

    /* renamed from: o */
    public final void mo31006o() {
        super.mo31006o();
    }

    /* renamed from: r */
    public final boolean mo30958r() {
        return this.f33582q;
    }

    /* renamed from: a */
    public final void mo31063a(Class<? extends C12629j> cls) {
        mo31065a(cls, (Bundle) null, new C12588a().mo30863a());
    }

    /* renamed from: a */
    public final void mo31064a(Class<? extends C12629j> cls, Bundle bundle) {
        mo31065a(cls, bundle, new C12588a().mo30863a());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo31061a(C12621e eVar) {
        this.f33583r.mo3342a(eVar.getClass(), eVar);
    }

    /* renamed from: a */
    public final void mo31065a(Class<? extends C12629j> cls, Bundle bundle, C12586e eVar) {
        if (C12700j.m36913a(this.f33526d_)) {
            C12629j jVar = null;
            if (C12621e.class.isAssignableFrom(cls)) {
                jVar = (C12629j) this.f33583r.mo3341a(cls);
            }
            if (jVar == null) {
                jVar = SceneInstanceUtility.m36887a(cls, bundle);
            } else if (bundle != null) {
                jVar.f33529g = bundle;
            }
            mo31062a(jVar, eVar);
        }
    }

    /* renamed from: a */
    public final void mo31062a(C12629j jVar, C12586e eVar) {
        C12699i.m36905a();
        if (C12700j.m36913a(this.f33526d_)) {
            if (jVar.f33524c != null) {
                if (jVar.f33524c == this) {
                    throw new IllegalArgumentException("Scene is already pushed");
                }
                StringBuilder sb = new StringBuilder("Scene already has a parent, parent ");
                sb.append(jVar.f33524c);
                throw new IllegalArgumentException(sb.toString());
            } else if (!mo30958r() || SceneInstanceUtility.m36888a(jVar)) {
                m36742e();
                m36737G();
                this.f33576k.mo31080a(jVar, eVar);
            } else {
                StringBuilder sb2 = new StringBuilder("Scene ");
                sb2.append(jVar.getClass().getName());
                sb2.append(" must be a public class or public static class, and have only one parameterless constructor to be properly recreated from instance state.");
                throw new IllegalArgumentException(sb2.toString());
            }
        }
    }

    /* renamed from: a */
    public final void mo31066a(boolean z) {
        ((C12592b) this.f33523b).setTouchEnabled(!z);
    }

    /* renamed from: a */
    public final void mo31053a(C12629j jVar, C12629j jVar2, boolean z) {
        for (C12647c a : new ArrayList(this.f33581p)) {
            a.mo31053a(jVar, jVar2, z);
        }
    }

    /* renamed from: a */
    public final void mo30930a(C12629j jVar) {
        super.mo30930a(jVar);
        if (jVar == null) {
            return;
        }
        if (jVar instanceof C12672q) {
            if (!((C12672q) jVar).mo30958r()) {
                bT_();
            }
            return;
        }
        StringBuilder sb = new StringBuilder("unknown parent Scene type ");
        sb.append(jVar.getClass());
        throw new SceneInternalException(sb.toString());
    }

    /* renamed from: a */
    public final void mo30931a(C12629j jVar, Bundle bundle, boolean z) {
        if (jVar != this) {
            for (C12696f fVar : new ArrayList(this.f33584s)) {
                if (!z) {
                    ((Boolean) fVar.f33696b).booleanValue();
                }
            }
        }
        super.mo30931a(jVar, bundle, z);
    }

    /* renamed from: a */
    public final void mo30932a(C12629j jVar, boolean z) {
        if (jVar != this) {
            for (C12696f fVar : new ArrayList(this.f33584s)) {
                if (z || ((Boolean) fVar.f33696b).booleanValue()) {
                    ((C12584c) fVar.f33695a).mo30857a(jVar);
                }
            }
        }
        super.mo30932a(jVar, z);
    }

    /* renamed from: e */
    private void m36742e() {
        C12629j d = this.f33576k.mo31088d();
        if (d != null) {
            C12698h.m36904a(d.f33523b);
        }
    }

    /* renamed from: C */
    public final void mo30995C() {
        super.mo30995C();
        this.f33576k.mo31092h();
    }

    /* renamed from: a */
    public final List<C12629j> mo31055a() {
        return this.f33576k.mo31089e();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo31071c() {
        mo31015v().onBackPressed();
    }

    /* renamed from: g */
    public final void mo30950g() {
        super.mo30950g();
        m36739a(State.STARTED);
    }

    /* renamed from: h */
    public final void mo30951h() {
        super.mo30951h();
        m36739a(State.RESUMED);
    }

    /* renamed from: i */
    public final void mo30952i() {
        m36739a(State.STARTED);
        super.mo30952i();
    }

    /* renamed from: j */
    public final void mo30953j() {
        m36739a(State.ACTIVITY_CREATED);
        super.mo30953j();
    }

    /* renamed from: p */
    public final void mo31007p() {
        m36740b(State.NONE);
        super.mo31007p();
    }

    /* renamed from: G */
    private void m36737G() {
        C12629j d = this.f33576k.mo31088d();
        if (d != null) {
            View view = d.f33523b;
            if (view != null && VERSION.SDK_INT >= 19) {
                view.cancelPendingInputEvents();
            }
        }
    }

    /* renamed from: H */
    private void m36738H() {
        C12699i.m36905a();
        if (C12700j.m36913a(this.f33526d_)) {
            m36742e();
            m36737G();
            this.f33576k.mo31074a();
        }
    }

    /* renamed from: d */
    private void m36741d() {
        C12629j jVar;
        String str = this.f33575j.f33628a;
        Bundle bundle = this.f33575j.f33629b;
        if (this.f33574i != null) {
            jVar = this.f33574i.mo31032a(mo31015v().getClassLoader(), str, bundle);
            if (!(jVar == null || jVar.f33524c == null)) {
                throw new IllegalArgumentException("SceneComponentFactory instantiateScene return Scene already has a parent");
            }
        } else {
            jVar = null;
        }
        if (jVar == null) {
            jVar = SceneInstanceUtility.m36886a(mo31015v(), str, bundle);
        }
        this.f33576k.mo31080a(jVar, new C12588a().mo30863a());
    }

    /* renamed from: b */
    public final boolean mo31069b() {
        C12699i.m36905a();
        if (!C12700j.m36913a(this.f33526d_)) {
            return false;
        }
        if (this.f33576k.mo31091g()) {
            return true;
        }
        if (!this.f33576k.mo31087c()) {
            return false;
        }
        m36738H();
        return true;
    }

    /* renamed from: b */
    private void m36740b(State state) {
        this.f33576k.mo31085b(state);
    }

    /* renamed from: a */
    public final String mo31054a(String str) {
        return this.f33576k.mo31073a(str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final Record mo31070c(C12629j jVar) {
        return this.f33576k.mo31083b(jVar);
    }

    /* renamed from: b */
    public final void mo30934b(Bundle bundle) {
        super.mo30934b(bundle);
        this.f33576k.mo31084b();
    }

    /* renamed from: a */
    private void m36739a(State state) {
        if (this.f33528f.value >= State.VIEW_CREATED.value) {
            this.f33576k.mo31078a(state);
            return;
        }
        throw new IllegalArgumentException("dispatchCurrentChildState can only call when state is VIEW_CREATED, ACTIVITY_CREATED, STARTED, RESUMED");
    }

    /* renamed from: b */
    public final void mo31067b(C12629j jVar) {
        C12699i.m36905a();
        if (C12700j.m36913a(this.f33526d_)) {
            if (this.f33576k.mo31088d() == jVar) {
                m36742e();
                m36737G();
            }
            this.f33576k.mo31079a(jVar);
        }
    }

    /* renamed from: d */
    public final void mo30944d(Bundle bundle) {
        super.mo30944d(bundle);
        this.f33576k = new C12651e(this);
        if (this.f33529g != null) {
            this.f33575j = C12666f.m36820a(this.f33529g);
            if (bundle != null && !bundle.getBoolean("bd-scene-navigation:support_restore", mo30958r())) {
                bT_();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("NavigationScene need NavigationSceneOptions bundle");
    }

    /* renamed from: e */
    public final void mo30985e(Bundle bundle) {
        super.mo30985e(bundle);
        if (bundle == null || !mo30958r()) {
            m36741d();
        } else {
            this.f33576k.mo31076a(mo31015v(), bundle, this.f33574i);
        }
        C12648d dVar = this.f33527e;
        if (dVar != null) {
            dVar.mo31057a((C0043i) this, (C12667g) new C12667g() {
                /* renamed from: a */
                public final boolean mo31072a() {
                    if (C12648d.this.f33528f.value < State.STARTED.value) {
                        return false;
                    }
                    return C12648d.this.mo31069b();
                }
            });
        }
    }

    /* renamed from: f */
    public final void mo30948f(Bundle bundle) {
        super.mo30948f(bundle);
        if (!bundle.containsKey("bd-scene-navigation:support_restore")) {
            bundle.putBoolean("bd-scene-navigation:support_restore", mo30958r());
            if (mo30958r()) {
                this.f33576k.mo31077a(bundle);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("outState already contains key bd-scene-navigation:support_restore");
    }

    /* renamed from: b */
    public final void mo31068b(String str) {
        this.f33576k.mo31086b(str);
    }

    /* renamed from: a */
    public final void mo31059a(C12584c cVar) {
        C12696f fVar;
        C12699i.m36905a();
        int size = this.f33584s.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                fVar = null;
                break;
            } else if (((C12696f) this.f33584s.get(i)).f33695a == cVar) {
                fVar = (C12696f) this.f33584s.get(i);
                break;
            } else {
                i++;
            }
        }
        if (fVar != null) {
            this.f33584s.remove(fVar);
        }
    }

    /* renamed from: a */
    public final void mo31056a(C0043i iVar, C12647c cVar) {
        C12699i.m36905a();
        if (iVar.getLifecycle().mo54a() != Lifecycle.State.DESTROYED) {
            this.f33581p.add(cVar);
            iVar.getLifecycle().mo55a(new NavigationScene$1(this, iVar, cVar));
        }
    }

    /* renamed from: b */
    public final void mo30937b(C12629j jVar, boolean z) {
        if (jVar != this) {
            for (C12696f fVar : new ArrayList(this.f33584s)) {
                if (!z) {
                    ((Boolean) fVar.f33696b).booleanValue();
                }
            }
        }
        super.mo30937b(jVar, z);
    }

    /* renamed from: c */
    public final void mo30942c(C12629j jVar, boolean z) {
        if (jVar != this) {
            for (C12696f fVar : new ArrayList(this.f33584s)) {
                if (!z) {
                    ((Boolean) fVar.f33696b).booleanValue();
                }
            }
        }
        super.mo30942c(jVar, z);
    }

    /* renamed from: e */
    public final void mo30947e(C12629j jVar, boolean z) {
        if (jVar != this) {
            for (C12696f fVar : new ArrayList(this.f33584s)) {
                if (!z) {
                    ((Boolean) fVar.f33696b).booleanValue();
                }
            }
        }
        super.mo30947e(jVar, z);
    }

    /* renamed from: f */
    public final void mo30949f(C12629j jVar, boolean z) {
        if (jVar != this) {
            for (C12696f fVar : new ArrayList(this.f33584s)) {
                if (z || ((Boolean) fVar.f33696b).booleanValue()) {
                    ((C12584c) fVar.f33695a).mo30859b(jVar);
                }
            }
        }
        super.mo30949f(jVar, z);
    }

    /* renamed from: a */
    public final void mo31057a(C0043i iVar, C12667g gVar) {
        C12699i.m36905a();
        if (iVar.getLifecycle().mo54a() != Lifecycle.State.DESTROYED) {
            this.f33576k.mo31075a(iVar, gVar);
            iVar.getLifecycle().mo55a(new NavigationScene$2(this, iVar, gVar));
        }
    }

    /* renamed from: d */
    public final void mo30946d(C12629j jVar, boolean z) {
        if (jVar != this) {
            for (C12696f fVar : new ArrayList(this.f33584s)) {
                if (!z) {
                    ((Boolean) fVar.f33696b).booleanValue();
                }
            }
        }
        super.mo30946d(jVar, z);
    }

    /* renamed from: a */
    public final void mo31060a(C12584c cVar, boolean z) {
        C12699i.m36905a();
        this.f33584s.add(C12696f.m36901a(cVar, Boolean.valueOf(false)));
    }

    /* renamed from: b */
    public final void mo30936b(C12629j jVar, Bundle bundle, boolean z) {
        if (jVar != this) {
            for (C12696f fVar : new ArrayList(this.f33584s)) {
                if (z || ((Boolean) fVar.f33696b).booleanValue()) {
                    ((C12584c) fVar.f33695a).mo30858a(jVar, bundle);
                }
            }
        }
        super.mo30936b(jVar, bundle, z);
    }

    /* renamed from: c */
    public final void mo30941c(C12629j jVar, Bundle bundle, boolean z) {
        if (jVar != this) {
            for (C12696f fVar : new ArrayList(this.f33584s)) {
                if (!z) {
                    ((Boolean) fVar.f33696b).booleanValue();
                }
            }
        }
        super.mo30941c(jVar, bundle, z);
    }

    /* renamed from: a */
    public final View mo30923a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C12592b bVar = new C12592b(mo31014u());
        if (VERSION.SDK_INT >= 21) {
            bVar.setOnApplyWindowInsetsListener(new C12694d());
        }
        bVar.setId(R.id.c3g);
        this.f33577l = new FrameLayout(mo31014u());
        if (VERSION.SDK_INT >= 21) {
            this.f33577l.setOnApplyWindowInsetsListener(new C12694d());
        }
        bVar.addView(this.f33577l, new LayoutParams(-1, -1));
        C12591a aVar = new C12591a(mo31014u());
        if (VERSION.SDK_INT >= 21) {
            aVar.setOnApplyWindowInsetsListener(new C12694d());
        }
        this.f33578m = aVar;
        bVar.addView(this.f33578m, new LayoutParams(-1, -1));
        if (this.f33575j.f33630c) {
            C0991u.m4185a((View) bVar, C12700j.m36906a(mo31014u()));
        }
        return bVar;
    }

    /* renamed from: a */
    public final void mo31058a(Intent intent, int i, C12582a aVar) {
        Activity activity = this.f33526d_;
        if (C12700j.m36913a(activity)) {
            C12555a.m36464a(activity, this, intent, 1001, aVar);
        }
    }
}
