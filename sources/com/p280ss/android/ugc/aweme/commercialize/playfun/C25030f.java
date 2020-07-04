package com.p280ss.android.ugc.aweme.commercialize.playfun;

import android.graphics.Point;
import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.commercialize.playfun.p1132a.C25016b;
import com.p280ss.android.ugc.aweme.commercialize.playfun.p1132a.C25017c;
import com.p280ss.android.ugc.aweme.commercialize.playfun.p1132a.C25019d;
import com.p280ss.android.ugc.aweme.commercialize.playfun.p1132a.C25021e;
import com.p280ss.android.ugc.aweme.commercialize.playfun.p1132a.C25022f;
import com.p280ss.android.ugc.aweme.commercialize.playfun.p1132a.C25023g;
import com.p280ss.android.ugc.aweme.feed.model.AwemePlayFunModel;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import java.util.HashMap;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7579l;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.collections.C7507ae;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.commercialize.playfun.f */
public final class C25030f {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f66020a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C25030f.class), "introLl", "getIntroLl()Landroid/view/View;"))};

    /* renamed from: b */
    public String f66021b = "IdleState";

    /* renamed from: c */
    public AwemePlayFunModel f66022c;

    /* renamed from: d */
    public View f66023d;

    /* renamed from: e */
    public View f66024e;

    /* renamed from: f */
    public View f66025f;

    /* renamed from: g */
    public final AdPlayFunView f66026g;

    /* renamed from: h */
    public final C25028d f66027h;

    /* renamed from: i */
    private final C7541d f66028i;

    /* renamed from: j */
    private final HashMap<String, String> f66029j;

    /* renamed from: k */
    private final HashMap<String, C25029e> f66030k;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.playfun.f$a */
    static final class C25031a extends Lambda implements C7561a<View> {

        /* renamed from: a */
        final /* synthetic */ C25030f f66031a;

        C25031a(C25030f fVar) {
            this.f66031a = fVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public View invoke() {
            ViewParent parent = this.f66031a.f66026g.getParent();
            if (!(parent instanceof ViewGroup)) {
                parent = null;
            }
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup != null) {
                return viewGroup.findViewById(R.id.jh);
            }
            return null;
        }
    }

    /* renamed from: j */
    private final View m82403j() {
        return (View) this.f66028i.getValue();
    }

    /* renamed from: a */
    public final void mo65488a() {
        this.f66021b = "IdleState";
        C25029e eVar = (C25029e) this.f66030k.get(this.f66021b);
        if (eVar != null) {
            eVar.mo65461a();
        }
    }

    /* renamed from: b */
    public final void mo65492b() {
        C25029e eVar = (C25029e) this.f66030k.get(this.f66021b);
        if (eVar != null) {
            eVar.mo65464c();
        }
    }

    /* renamed from: c */
    public final void mo65493c() {
        C25029e eVar = (C25029e) this.f66030k.get(this.f66021b);
        if (eVar != null) {
            eVar.mo65463b();
        }
    }

    /* renamed from: e */
    public final boolean mo65495e() {
        C25029e eVar = (C25029e) this.f66030k.get(this.f66021b);
        if (eVar != null) {
            return eVar.mo65468e();
        }
        return false;
    }

    /* renamed from: h */
    public final void mo65498h() {
        if (C7573i.m23585a((Object) this.f66021b, (Object) "WidgetShowState")) {
            Object obj = this.f66030k.get("WidgetShowState");
            if (!(obj instanceof C25023g)) {
                obj = null;
            }
            C25023g gVar = (C25023g) obj;
            if (gVar != null) {
                gVar.mo65473h();
            }
        }
    }

    /* renamed from: i */
    public final ViewGroup mo65499i() {
        ViewParent parent = this.f66026g.getParent();
        if (parent != null) {
            return (ViewGroup) parent;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
    }

    /* renamed from: d */
    public final void mo65494d() {
        this.f66024e.setAlpha(0.0f);
        this.f66025f.setAlpha(0.0f);
        this.f66023d.setAlpha(0.0f);
        Collection<C25029e> values = this.f66030k.values();
        C7573i.m23582a((Object) values, "stateTable.values");
        for (C25029e d : values) {
            d.mo65465d();
        }
        this.f66021b = "IdleState";
    }

    /* renamed from: g */
    public final PointF mo65497g() {
        int i;
        float f = ((1.0f - this.f66027h.f66017d) / 2.0f) * ((float) this.f66027h.f66014a);
        float b = C9738o.m28708b(C6399b.m19921a(), 10.0f) - f;
        if (m82403j() != null) {
            View j = m82403j();
            if (j == null) {
                C7573i.m23580a();
            }
            i = C25032g.m82417a(j);
        } else {
            i = C25032g.m82417a(this.f66026g) + this.f66026g.getHeight();
        }
        return new PointF(b, (((float) ((i - C25032g.m82417a(this.f66026g)) - this.f66027h.f66014a)) + f) - C9738o.m28708b(C6399b.m19921a(), 8.0f));
    }

    /* renamed from: f */
    public final void mo65496f() {
        if (!C7573i.m23585a((Object) this.f66021b, (Object) "IdleState") && !C7573i.m23585a((Object) this.f66021b, (Object) "WidgetShowState") && !C7573i.m23585a((Object) this.f66021b, (Object) "FinishState")) {
            C25029e eVar = (C25029e) this.f66030k.get(this.f66021b);
            if (eVar != null) {
                eVar.mo65465d();
            }
            this.f66021b = "WidgetShowState";
            PointF g = mo65497g();
            this.f66024e.setPivotX(((float) this.f66027h.f66014a) / 2.0f);
            this.f66024e.setPivotY(((float) this.f66027h.f66014a) / 2.0f);
            this.f66024e.setTranslationX(g.x);
            this.f66024e.setTranslationY(g.y);
            this.f66024e.setScaleX(this.f66027h.f66017d);
            this.f66024e.setScaleY(this.f66027h.f66017d);
            this.f66024e.setRotation(0.0f);
            this.f66025f.setAlpha(0.0f);
            this.f66023d.setAlpha(0.0f);
            C25029e eVar2 = (C25029e) this.f66030k.get(this.f66021b);
            if (eVar2 != null) {
                eVar2.mo65461a();
            }
        }
    }

    /* renamed from: a */
    public final void mo65490a(String str) {
        C7573i.m23587b(str, "type");
        this.f66026g.mo65443a(str);
    }

    /* renamed from: a */
    public final void mo65489a(int i) {
        switch (i) {
            case 0:
                String str = (String) this.f66029j.get(this.f66021b);
                if (str != null) {
                    C7573i.m23582a((Object) str, "it");
                    this.f66021b = str;
                    C25029e eVar = (C25029e) this.f66030k.get(this.f66021b);
                    if (eVar != null) {
                        eVar.mo65461a();
                    }
                }
                return;
            case 1:
                this.f66021b = "FinishState";
                break;
        }
    }

    public C25030f(AdPlayFunView adPlayFunView, C25028d dVar) {
        C7573i.m23587b(adPlayFunView, "playFunView");
        C7573i.m23587b(dVar, "playFunParam");
        this.f66026g = adPlayFunView;
        this.f66027h = dVar;
        View findViewById = this.f66026g.findViewById(R.id.ct);
        C7573i.m23582a((Object) findViewById, "playFunView.findViewById…d.ad_play_fun_background)");
        this.f66023d = findViewById;
        View findViewById2 = this.f66026g.findViewById(R.id.cu);
        C7573i.m23582a((Object) findViewById2, "playFunView.findViewById…id.ad_play_fun_egg_image)");
        this.f66024e = findViewById2;
        View findViewById3 = this.f66026g.findViewById(R.id.cv);
        C7573i.m23582a((Object) findViewById3, "playFunView.findViewById…id.ad_play_fun_egg_title)");
        this.f66025f = findViewById3;
        this.f66028i = C7546e.m23569a(new C25031a(this));
        this.f66029j = C7507ae.m23401c((Pair<? extends K, ? extends V>[]) new Pair[]{C7579l.m23633a("IdleState", "ExpandState"), C7579l.m23633a("ExpandState", "EggShowState"), C7579l.m23633a("EggShowState", "CollapseState"), C7579l.m23633a("CollapseState", "WidgetShowState"), C7579l.m23633a("WidgetShowState", "FinishState")});
        this.f66030k = C7507ae.m23401c((Pair<? extends K, ? extends V>[]) new Pair[]{C7579l.m23633a("IdleState", new C25022f(this)), C7579l.m23633a("ExpandState", new C25019d(this)), C7579l.m23633a("EggShowState", new C25017c(this)), C7579l.m23633a("CollapseState", new C25016b(this)), C7579l.m23633a("WidgetShowState", new C25023g(this)), C7579l.m23633a("FinishState", new C25021e(this))});
    }

    /* renamed from: a */
    public final void mo65491a(String str, Point point, Point point2) {
        C7573i.m23587b(str, "state");
        this.f66026g.mo65444a(str, point, point2);
    }
}
