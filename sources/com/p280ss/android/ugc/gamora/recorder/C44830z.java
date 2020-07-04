package com.p280ss.android.ugc.gamora.recorder;

import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import android.support.p029v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.scene.C12629j;
import com.p280ss.android.ugc.aweme.base.p1059d.p1060a.C23321d;
import com.p280ss.android.ugc.aweme.filter.C29202ag.C29207e;
import com.p280ss.android.ugc.aweme.filter.C29269c;
import com.p280ss.android.ugc.aweme.filter.CircleViewPager;
import com.p280ss.android.ugc.aweme.shortvideo.C39382ed;
import com.p280ss.android.ugc.aweme.shortvideo.p1558e.C39372f;
import com.p280ss.android.ugc.aweme.shortvideo.p1558e.C39374g;
import com.p280ss.android.ugc.aweme.shortvideo.p1558e.C39378j;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.VideoRecordNewActivity;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.gamora.recorder.z */
public final class C44830z extends C12629j {

    /* renamed from: j */
    public static final C44831a f115317j = new C44831a(null);

    /* renamed from: i */
    public C39382ed f115318i;

    /* renamed from: k */
    private C39374g f115319k;

    /* renamed from: l */
    private C39372f f115320l;

    /* renamed from: com.ss.android.ugc.gamora.recorder.z$a */
    public static final class C44831a {
        private C44831a() {
        }

        public /* synthetic */ C44831a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.z$b */
    public static final class C44832b implements C29207e {

        /* renamed from: a */
        final /* synthetic */ C44830z f115321a;

        /* renamed from: b */
        private CircleViewPager f115322b;

        /* renamed from: a */
        public final CircleViewPager mo74809a() {
            CircleViewPager circleViewPager;
            if (this.f115322b == null) {
                RecyclerView recyclerView = (RecyclerView) this.f115321a.mo31002b((int) R.id.cqn);
                if (recyclerView != null) {
                    circleViewPager = (CircleViewPager) recyclerView.findViewById(R.id.ax6);
                } else {
                    circleViewPager = null;
                }
                this.f115322b = circleViewPager;
            }
            if (this.f115322b == null) {
                this.f115322b = new CircleViewPager(C44830z.m141491a(this.f115321a).mo97962O());
            }
            return this.f115322b;
        }

        C44832b(C44830z zVar) {
            this.f115321a = zVar;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.z$c */
    static final class C44833c<T> implements C23321d<JSONObject> {

        /* renamed from: a */
        final /* synthetic */ C44830z f115323a;

        C44833c(C44830z zVar) {
            this.f115323a = zVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public JSONObject mo60607a() {
            FragmentActivity O = C44830z.m141491a(this.f115323a).mo97962O();
            if (O != null) {
                return ((VideoRecordNewActivity) O).mo101854n();
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity");
        }
    }

    /* renamed from: a */
    public final void mo107271a() {
        C39374g gVar = this.f115319k;
        if (gVar == null) {
            C7573i.m23583a("recordFilterModule");
        }
        gVar.mo74904e();
    }

    /* renamed from: p */
    public final void mo31007p() {
        super.mo31007p();
        C39374g gVar = this.f115319k;
        if (gVar == null) {
            C7573i.m23583a("recordFilterModule");
        }
        gVar.mo74892a((C39378j) null);
        C39374g gVar2 = this.f115319k;
        if (gVar2 == null) {
            C7573i.m23583a("recordFilterModule");
        }
        gVar2.mo74891a((C39372f) null);
        C39372f fVar = this.f115320l;
        if (fVar == null) {
            C7573i.m23583a("filterSwitcher");
        }
        fVar.mo74934c();
    }

    /* renamed from: a */
    public static final /* synthetic */ C39382ed m141491a(C44830z zVar) {
        C39382ed edVar = zVar.f115318i;
        if (edVar == null) {
            C7573i.m23583a("owner");
        }
        return edVar;
    }

    /* renamed from: e */
    public final void mo30985e(Bundle bundle) {
        super.mo30985e(bundle);
        Object b = mo30998F().mo31126b((Object) "owner");
        if (b == null) {
            C7573i.m23580a();
        }
        this.f115318i = (C39382ed) b;
        Object b2 = mo30998F().mo31126b((Object) "filter_context");
        if (b2 == null) {
            C7573i.m23580a();
        }
        this.f115319k = (C39374g) b2;
        C39374g gVar = this.f115319k;
        if (gVar == null) {
            C7573i.m23583a("recordFilterModule");
        }
        View view = this.f33523b;
        C7573i.m23582a((Object) view, "view");
        gVar.mo74892a((C39378j) new C44445aa(view));
        C23321d cVar = new C44833c(this);
        C39382ed edVar = this.f115318i;
        if (edVar == null) {
            C7573i.m23583a("owner");
        }
        FragmentActivity O = edVar.mo97962O();
        C7573i.m23582a((Object) O, "owner.fragmentActivity()");
        this.f115320l = new C29269c(O, this, cVar, new C44832b(this));
        C39374g gVar2 = this.f115319k;
        if (gVar2 == null) {
            C7573i.m23583a("recordFilterModule");
        }
        C39372f fVar = this.f115320l;
        if (fVar == null) {
            C7573i.m23583a("filterSwitcher");
        }
        gVar2.mo74891a(fVar);
    }

    /* renamed from: a */
    public final View mo30923a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        C7573i.m23587b(viewGroup, "container");
        View inflate = layoutInflater.inflate(R.layout.b25, viewGroup, false);
        C7573i.m23582a((Object) inflate, "inflater.inflate(R.layou…_scene, container, false)");
        return inflate;
    }
}
