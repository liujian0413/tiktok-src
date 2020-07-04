package com.p280ss.android.ugc.aweme.filter;

import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0069x;
import android.support.p022v4.app.FragmentActivity;
import android.support.p029v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import bolts.C1592h;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.google.common.collect.C17794bt;
import com.p280ss.android.ugc.aweme.effect.p1197c.p1198a.C27413a;
import com.p280ss.android.ugc.aweme.effectplatform.EffectPlatform;
import com.p280ss.android.ugc.aweme.effectplatform.FilterEffect;
import com.p280ss.android.ugc.aweme.filter.C29266bu.C29267a;
import com.p280ss.android.ugc.aweme.filter.C29327r.C29328a;
import com.p280ss.android.ugc.aweme.filter.FilterBoxView.C29159b;
import com.p280ss.android.ugc.aweme.filter.p1247f.C29293a;
import com.p280ss.android.ugc.aweme.filter.p1247f.C29294b;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.photomovie.p1454a.C34856c;
import com.p280ss.android.ugc.aweme.photomovie.p1454a.C34860g;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1605g.C40582c;
import com.p280ss.android.ugc.effectmanager.common.model.BaseNetResponse;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import com.p280ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.p280ss.android.ugc.effectmanager.effect.model.EffectChannelModel;
import com.p280ss.android.ugc.effectmanager.link.model.host.Host;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.p1877a.C47886a;
import kotlin.reflect.C7595j;
import p346io.reactivex.C7319aa;
import p346io.reactivex.C7320af;
import p346io.reactivex.C7498y;
import p346io.reactivex.internal.p352a.C7342a;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p348d.C7327h;
import p346io.reactivex.p351i.C7333a;
import p346io.reactivex.p354j.C7486b;

/* renamed from: com.ss.android.ugc.aweme.filter.i */
public final class C29298i implements C29159b {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f77279a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C29298i.class), "api", "getApi()Lcom/ss/android/ugc/aweme/filter/FilterBoxApi;"))};

    /* renamed from: b */
    public boolean f77280b;

    /* renamed from: c */
    public FilterBoxView f77281c;

    /* renamed from: d */
    public C29331t f77282d;

    /* renamed from: e */
    public int f77283e = -1;

    /* renamed from: f */
    public C34860g f77284f;

    /* renamed from: g */
    public final C29315j f77285g;

    /* renamed from: h */
    public final AppCompatActivity f77286h;

    /* renamed from: i */
    public final FrameLayout f77287i;

    /* renamed from: j */
    private View f77288j;

    /* renamed from: k */
    private C29231b f77289k;

    /* renamed from: l */
    private final C7541d f77290l = C7546e.m23569a(C29300a.f77293a);

    /* renamed from: m */
    private C7321c f77291m;

    /* renamed from: com.ss.android.ugc.aweme.filter.i$a */
    static final class C29300a extends Lambda implements C7561a<FilterBoxApi> {

        /* renamed from: a */
        public static final C29300a f77293a = new C29300a();

        C29300a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m96136a();
        }

        /* renamed from: a */
        private static FilterBoxApi m96136a() {
            IRetrofitService iRetrofitService = (IRetrofitService) ServiceManager.get().getService(IRetrofitService.class);
            Object obj = EffectPlatform.f72451c.get(0);
            C7573i.m23582a(obj, "EffectPlatform.HOST[0]");
            return (FilterBoxApi) iRetrofitService.createNewRetrofit(((Host) obj).getItemName()).create(FilterBoxApi.class);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.i$b */
    public static final class C29301b implements C27413a<C29296g, Void> {

        /* renamed from: a */
        final /* synthetic */ C7561a f77294a;

        /* renamed from: com.ss.android.ugc.aweme.filter.i$b$a */
        static final class C29302a extends Lambda implements C7561a<C7581n> {

            /* renamed from: a */
            final /* synthetic */ C29301b f77295a;

            C29302a(C29301b bVar) {
                this.f77295a = bVar;
                super(0);
            }

            /* renamed from: a */
            private void m96143a() {
                this.f77295a.f77294a.invoke();
            }

            public final /* synthetic */ Object invoke() {
                m96143a();
                return C7581n.f20898a;
            }
        }

        /* renamed from: a */
        private static void m96137a(C29296g gVar) {
            C7573i.m23587b(gVar, "param");
        }

        /* renamed from: a */
        private static void m96138a(C29296g gVar, Integer num, String str, Exception exc) {
            C7573i.m23587b(gVar, "param");
        }

        C29301b(C7561a aVar) {
            this.f77294a = aVar;
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo70519a(Object obj) {
            m96137a((C29296g) obj);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void mo70521a(C29296g gVar, Void voidR) {
            C7573i.m23587b(gVar, "param");
            if (this.f77294a != null) {
                C29325p.m96173a((C7561a<C7581n>) new C29302a<C7581n>(this));
            }
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo70520a(Object obj, Integer num, String str, Exception exc) {
            m96138a((C29296g) obj, num, str, exc);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.i$c */
    public static final class C29303c extends C40582c {

        /* renamed from: a */
        final /* synthetic */ C29298i f77296a;

        /* renamed from: c */
        public final void mo74769c() {
            super.mo74769c();
            C29298i.m96120a(this.f77296a).setCategoryMap(this.f77296a.f77285g.mo74991d());
            C34860g gVar = this.f77296a.f77284f;
            if (gVar != null) {
                gVar.mo74769c();
            }
        }

        C29303c(C29298i iVar) {
            this.f77296a = iVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.i$d */
    static final class C29304d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C29298i f77297a;

        C29304d(C29298i iVar) {
            this.f77297a = iVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f77297a.mo74983b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.i$e */
    static final class C29305e<T, R> implements C7327h<T, R> {

        /* renamed from: a */
        public static final C29305e f77298a = new C29305e();

        C29305e() {
        }

        /* renamed from: a */
        private static EffectChannelModel m96145a(C29320m mVar) {
            C7573i.m23587b(mVar, "it");
            return mVar.data;
        }

        public final /* synthetic */ Object apply(Object obj) {
            return m96145a((C29320m) obj);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.i$f */
    static final class C29306f extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ C29298i f77299a;

        /* renamed from: b */
        final /* synthetic */ C29324o f77300b;

        C29306f(C29298i iVar, C29324o oVar) {
            this.f77299a = iVar;
            this.f77300b = oVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            m96146a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m96146a() {
            this.f77299a.mo74982a((C29296g) this.f77300b);
            C29327r.f77322a.mo75003a(this.f77300b, C29298i.m96123b(this.f77299a));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.i$g */
    static final class C29307g extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ C29298i f77301a;

        /* renamed from: b */
        final /* synthetic */ EffectCategoryModel f77302b;

        /* renamed from: c */
        final /* synthetic */ C29324o f77303c;

        C29307g(C29298i iVar, EffectCategoryModel effectCategoryModel, C29324o oVar) {
            this.f77301a = iVar;
            this.f77302b = effectCategoryModel;
            this.f77303c = oVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            m96147a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m96147a() {
            C29298i.m96123b(this.f77301a).mo75006a(this.f77302b, this.f77303c);
            this.f77301a.mo74982a((C29296g) this.f77303c);
            C29327r.f77322a.mo75003a(this.f77303c, C29298i.m96123b(this.f77301a));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.i$h */
    static final class C29308h<T, R> implements C7327h<T, R> {

        /* renamed from: a */
        final /* synthetic */ C29298i f77304a;

        /* renamed from: com.ss.android.ugc.aweme.filter.i$h$a */
        public static final class C29309a<T> implements Comparator<T> {

            /* renamed from: a */
            final /* synthetic */ EffectCategoryModel f77305a;

            public C29309a(EffectCategoryModel effectCategoryModel) {
                this.f77305a = effectCategoryModel;
            }

            public final int compare(T t, T t2) {
                Effect effect = (Effect) t;
                EffectCategoryModel effectCategoryModel = this.f77305a;
                C7573i.m23582a((Object) effectCategoryModel, "category");
                List<String> list = effectCategoryModel.effects;
                C7573i.m23582a((Object) effect, "it");
                Comparable valueOf = Integer.valueOf(list.indexOf(effect.getEffectId()));
                Effect effect2 = (Effect) t2;
                EffectCategoryModel effectCategoryModel2 = this.f77305a;
                C7573i.m23582a((Object) effectCategoryModel2, "category");
                List<String> list2 = effectCategoryModel2.effects;
                C7573i.m23582a((Object) effect2, "it");
                return C47886a.m148819a(valueOf, Integer.valueOf(list2.indexOf(effect2.getEffectId())));
            }
        }

        C29308h(C29298i iVar) {
            this.f77304a = iVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C17794bt<EffectCategoryModel, Effect> apply(EffectChannelModel effectChannelModel) {
            C7573i.m23587b(effectChannelModel, "response");
            C17794bt<EffectCategoryModel, Effect> d = this.f77304a.f77285g.mo74991d();
            List<EffectCategoryModel> list = effectChannelModel.category;
            C7573i.m23582a((Object) list, "response.category");
            for (EffectCategoryModel effectCategoryModel : list) {
                List<Effect> list2 = effectChannelModel.effects;
                C7573i.m23582a((Object) list2, "response.effects");
                Iterable iterable = list2;
                Collection arrayList = new ArrayList();
                for (Object next : iterable) {
                    Effect effect = (Effect) next;
                    C7573i.m23582a((Object) effectCategoryModel, "category");
                    List<String> list3 = effectCategoryModel.effects;
                    C7573i.m23582a((Object) effect, "it");
                    if (list3.contains(effect.getEffectId())) {
                        arrayList.add(next);
                    }
                }
                d.putAll(effectCategoryModel, C7525m.m23494a((Iterable<? extends T>) (List) arrayList, (Comparator<? super T>) new C29309a<Object>(effectCategoryModel)));
            }
            return d;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.i$i */
    static final class C29310i<T, R> implements C7327h<T, R> {

        /* renamed from: a */
        final /* synthetic */ C29298i f77306a;

        C29310i(C29298i iVar) {
            this.f77306a = iVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C17794bt<EffectCategoryModel, C29324o> apply(C17794bt<EffectCategoryModel, Effect> btVar) {
            C7573i.m23587b(btVar, "data");
            C17794bt<EffectCategoryModel, C29324o> d = this.f77306a.f77285g.mo74991d();
            Collection<Entry> entries = btVar.entries();
            C7573i.m23582a((Object) entries, "data.entries()");
            for (Entry entry : entries) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                if (value != null) {
                    C29324o a = C29325p.m96172a((FilterEffect) value);
                    Object key2 = entry.getKey();
                    C7573i.m23582a(key2, "it.key");
                    a.f77319n = ((EffectCategoryModel) key2).name;
                    d.put(key, a);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.effectplatform.FilterEffect");
                }
            }
            return d;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.i$j */
    static final class C29311j<T> implements C7326g<C17794bt<EffectCategoryModel, C29324o>> {

        /* renamed from: a */
        final /* synthetic */ C29298i f77307a;

        C29311j(C29298i iVar) {
            this.f77307a = iVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(C17794bt<EffectCategoryModel, C29324o> btVar) {
            C7573i.m23582a((Object) btVar, "data");
            if (btVar.isEmpty()) {
                C29298i.m96120a(this.f77307a).setState(3);
                return;
            }
            C29298i.m96120a(this.f77307a).setState(0);
            C29298i.m96120a(this.f77307a).setCategoryMap(btVar);
            C29298i.m96120a(this.f77307a).setCallback(this.f77307a);
            C29298i.m96123b(this.f77307a).mo75005a(btVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.i$k */
    static final class C29312k<T> implements C7326g<Throwable> {

        /* renamed from: a */
        final /* synthetic */ C29298i f77308a;

        C29312k(C29298i iVar) {
            this.f77308a = iVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(Throwable th) {
            C29298i.m96120a(this.f77308a).setState(2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.i$l */
    public static final class C29313l extends C40582c {

        /* renamed from: a */
        final /* synthetic */ C29298i f77309a;

        /* renamed from: a */
        public final void mo74767a() {
            super.mo74767a();
            C29298i.m96120a(this.f77309a).setVisibility(0);
            C34860g gVar = this.f77309a.f77284f;
            if (gVar != null) {
                gVar.mo74767a();
            }
        }

        C29313l(C29298i iVar) {
            this.f77309a = iVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.i$m */
    static final class C29314m<T> implements C7326g<BaseNetResponse> {

        /* renamed from: a */
        public static final C29314m f77310a = new C29314m();

        C29314m() {
        }

        /* renamed from: a */
        private static void m96153a(BaseNetResponse baseNetResponse) {
            FilterManager.m95700a().mo74725h();
        }

        public final /* synthetic */ void accept(Object obj) {
            m96153a((BaseNetResponse) obj);
        }
    }

    /* renamed from: c */
    private final FilterBoxApi m96124c() {
        return (FilterBoxApi) this.f77290l.getValue();
    }

    /* renamed from: b */
    public final void mo74983b() {
        C29231b bVar = this.f77289k;
        if (bVar == null) {
            C7573i.m23583a("chooseFilterTransition");
        }
        bVar.mo74849b(new C40582c());
        m96125d();
    }

    /* renamed from: a */
    public final void mo74981a() {
        if (this.f77288j == null) {
            m96121a(this.f77286h, this.f77287i);
        }
        C29231b bVar = this.f77289k;
        if (bVar == null) {
            C7573i.m23583a("chooseFilterTransition");
        }
        bVar.mo74845a((C34856c) new C29313l(this));
        m96126e();
        this.f77280b = true;
    }

    /* renamed from: d */
    private void m96125d() {
        C29231b bVar = this.f77289k;
        if (bVar == null) {
            C7573i.m23583a("chooseFilterTransition");
        }
        bVar.mo74849b(new C29303c(this));
        C7321c cVar = this.f77291m;
        if (cVar != null) {
            cVar.dispose();
        }
        m96128g();
        C29331t tVar = this.f77282d;
        if (tVar == null) {
            C7573i.m23583a("patch");
        }
        if (!tVar.mo75010f()) {
            C29294b d = C35574k.m114859a().mo70097l().mo74951d();
            C29331t tVar2 = this.f77282d;
            if (tVar2 == null) {
                C7573i.m23583a("patch");
            }
            d.mo74821a((C29293a) tVar2);
        }
        this.f77280b = false;
    }

    /* renamed from: e */
    private final void m96126e() {
        this.f77282d = new C29331t();
        FilterBoxView filterBoxView = this.f77281c;
        if (filterBoxView == null) {
            C7573i.m23583a("filterBoxView");
        }
        filterBoxView.setState(1);
        this.f77291m = m96127f().mo19134b((C7327h<? super T, ? extends R>) new C29308h<Object,Object>(this)).mo19135b(C7333a.m23043a(C1592h.f5957a)).mo19134b((C7327h<? super T, ? extends R>) new C29310i<Object,Object>(this)).mo19127a(C47549a.m148327a()).mo19129a((C7326g<? super T>) new C29311j<Object>(this), (C7326g<? super Throwable>) new C29312k<Object>(this));
    }

    /* renamed from: f */
    private final C7319aa<EffectChannelModel> m96127f() {
        FilterBoxApi c = m96124c();
        String a = C35574k.m114859a().mo70092g().mo70113a();
        String b = C35574k.m114859a().mo70092g().mo70114b();
        String i = C35574k.m114859a().mo70102q().mo83142i();
        C7573i.m23582a((Object) i, "CameraClient.getAPI().ap…icationService.appVersion");
        String c2 = C35574k.m114859a().mo70107v().mo83209c();
        C7573i.m23582a((Object) c2, "CameraClient.getAPI().locationService.region");
        C7573i.m23582a((Object) FilterManager.m95700a(), "FilterManager.getInstance()");
        String i2 = FilterManager.m95703i();
        C7573i.m23582a((Object) i2, "FilterManager.getInstance().colorFilterPanel");
        C7319aa<EffectChannelModel> b2 = c.listFilterBox(a, b, i, c2, i2).mo19134b((C7327h<? super T, ? extends R>) C29305e.f77298a);
        C7573i.m23582a((Object) b2, "api.listFilterBox(Camera…         .map { it.data }");
        return b2;
    }

    /* renamed from: g */
    private final void m96128g() {
        C7319aa aaVar;
        C7319aa aaVar2;
        C29331t tVar = this.f77282d;
        if (tVar == null) {
            C7573i.m23583a("patch");
        }
        Set e = tVar.mo75009e();
        if (!e.isEmpty()) {
            aaVar = m96124c().updateFilterBox(new C29268bv(e, C29267a.m96010b(), null));
        } else {
            aaVar = C7319aa.m22931a((Throwable) new Exception());
            C7573i.m23582a((Object) aaVar, "Single.error(Exception())");
        }
        C29331t tVar2 = this.f77282d;
        if (tVar2 == null) {
            C7573i.m23583a("patch");
        }
        Set d = tVar2.mo75008d();
        if (!d.isEmpty()) {
            aaVar2 = m96124c().updateFilterBox(new C29268bv(d, C29267a.m96009a(), null));
        } else {
            aaVar2 = C7319aa.m22931a((Throwable) new Exception());
            C7573i.m23582a((Object) aaVar2, "Single.error(Exception())");
        }
        C7486b a = C7486b.m23223a();
        C7573i.m23582a((Object) a, "PublishSubject.create<BaseNetResponse>()");
        a.mo19324f().mo19129a((C7326g<? super T>) C29314m.f77310a, C7342a.m23058b());
        C7319aa.m22933a((C7320af<? extends T>) aaVar, (C7320af<? extends T>) aaVar2).mo19166f().mo19304b(C7333a.m23043a(C1592h.f5957a)).mo19189a((C7498y<? super T>) a);
    }

    /* renamed from: a */
    public final void mo74982a(C29296g gVar) {
        this.f77285g.mo74988a(gVar);
    }

    /* renamed from: a */
    public static final /* synthetic */ FilterBoxView m96120a(C29298i iVar) {
        FilterBoxView filterBoxView = iVar.f77281c;
        if (filterBoxView == null) {
            C7573i.m23583a("filterBoxView");
        }
        return filterBoxView;
    }

    /* renamed from: b */
    public static final /* synthetic */ C29331t m96123b(C29298i iVar) {
        C29331t tVar = iVar.f77282d;
        if (tVar == null) {
            C7573i.m23583a("patch");
        }
        return tVar;
    }

    /* renamed from: b */
    public final void mo74687b(EffectCategoryModel effectCategoryModel, C29324o oVar) {
        C7573i.m23587b(effectCategoryModel, "category");
        C7573i.m23587b(oVar, "filter");
        C29296g gVar = oVar;
        if (!C29341z.m96266c(gVar)) {
            m96122a(false, oVar, new C29307g(this, effectCategoryModel, oVar));
            return;
        }
        C29331t tVar = this.f77282d;
        if (tVar == null) {
            C7573i.m23583a("patch");
        }
        tVar.mo75006a(effectCategoryModel, oVar);
        mo74982a(gVar);
        C29328a aVar = C29327r.f77322a;
        C29331t tVar2 = this.f77282d;
        if (tVar2 == null) {
            C7573i.m23583a("patch");
        }
        aVar.mo75003a(oVar, tVar2);
    }

    /* renamed from: c */
    public final void mo74688c(EffectCategoryModel effectCategoryModel, C29324o oVar) {
        C7573i.m23587b(effectCategoryModel, "category");
        C7573i.m23587b(oVar, "filter");
        C29331t tVar = this.f77282d;
        if (tVar == null) {
            C7573i.m23583a("patch");
        }
        tVar.mo75007b(effectCategoryModel, oVar);
        C29327r.f77322a.mo75002a(oVar);
        if (this.f77283e == oVar.f77266a) {
            mo74982a(this.f77285g.mo74990c());
        }
    }

    /* renamed from: a */
    private final void m96121a(AppCompatActivity appCompatActivity, FrameLayout frameLayout) {
        this.f77288j = LayoutInflater.from(appCompatActivity).inflate(R.layout.fy, frameLayout, false);
        View view = this.f77288j;
        if (view == null) {
            C7573i.m23580a();
        }
        this.f77289k = new C29231b(frameLayout, view, view.findViewById(R.id.daz));
        view.findViewById(R.id.dbj).setOnClickListener(new C29304d(this));
        View findViewById = view.findViewById(R.id.ak3);
        C7573i.m23582a((Object) findViewById, "nonNullFilterBoxView.fin…yId(R.id.filter_box_view)");
        this.f77281c = (FilterBoxView) findViewById;
        FilterBoxView filterBoxView = this.f77281c;
        if (filterBoxView == null) {
            C7573i.m23583a("filterBoxView");
        }
        filterBoxView.setDependency(this.f77285g);
    }

    /* renamed from: a */
    public final void mo74686a(EffectCategoryModel effectCategoryModel, C29324o oVar) {
        C7573i.m23587b(effectCategoryModel, "category");
        C7573i.m23587b(oVar, "filter");
        C29296g gVar = oVar;
        if (!C29341z.m96266c(gVar)) {
            m96122a(true, oVar, new C29306f(this, oVar));
            return;
        }
        mo74982a(gVar);
        C29328a aVar = C29327r.f77322a;
        C29331t tVar = this.f77282d;
        if (tVar == null) {
            C7573i.m23583a("patch");
        }
        aVar.mo75003a(oVar, tVar);
    }

    /* renamed from: a */
    private static void m96122a(boolean z, C29324o oVar, C7561a<C7581n> aVar) {
        FilterManager.m95700a().mo74714a(oVar, z, new C29301b(aVar));
    }

    public C29298i(C29315j jVar, AppCompatActivity appCompatActivity, FrameLayout frameLayout) {
        C7573i.m23587b(jVar, "dependency");
        C7573i.m23587b(appCompatActivity, "activity");
        C7573i.m23587b(frameLayout, "root");
        this.f77285g = jVar;
        this.f77286h = appCompatActivity;
        this.f77287i = frameLayout;
        int i = -1;
        C0063u a = C0069x.m159a((FragmentActivity) this.f77286h).mo147a(FilterViewModel.class);
        C7573i.m23582a((Object) a, "ViewModelProviders.of(ac…terViewModel::class.java)");
        C0052o b = ((FilterViewModel) a).mo74771b();
        C7573i.m23582a((Object) b, "curSelectedFilter");
        C29296g gVar = (C29296g) b.getValue();
        if (gVar != null) {
            i = gVar.f77266a;
        }
        this.f77283e = i;
        b.observe(this.f77286h, new C0053p<C29296g>(this) {

            /* renamed from: a */
            final /* synthetic */ C29298i f77292a;

            {
                this.f77292a = r1;
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onChanged(C29296g gVar) {
                if (gVar != null) {
                    C29298i iVar = this.f77292a;
                    C7573i.m23582a((Object) gVar, "it");
                    iVar.f77283e = gVar.f77266a;
                }
            }
        });
    }
}
