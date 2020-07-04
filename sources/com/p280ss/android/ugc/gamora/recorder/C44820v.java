package com.p280ss.android.ugc.gamora.recorder;

import android.app.Activity;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0069x;
import android.content.Context;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.animation.Animation;
import android.widget.LinearLayout;
import com.bytedance.common.utility.C9738o;
import com.bytedance.jedi.arch.C11491a;
import com.bytedance.jedi.arch.C11493ab;
import com.bytedance.jedi.arch.C11585f;
import com.bytedance.jedi.arch.C11648k;
import com.bytedance.jedi.arch.C11669s;
import com.bytedance.jedi.arch.C11670t;
import com.bytedance.jedi.arch.C11672v;
import com.bytedance.jedi.arch.C11675y;
import com.bytedance.jedi.arch.C11676z;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.scene.C12629j;
import com.p280ss.android.ugc.aweme.shortvideo.C39382ed;
import com.p280ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p280ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.p280ss.android.ugc.aweme.shortvideo.p1578i.C40004b;
import com.p280ss.android.ugc.aweme.shortvideo.record.C40304b;
import com.p280ss.android.ugc.aweme.shortvideo.widget.TabHost;
import com.p280ss.android.ugc.aweme.shortvideo.widget.TabItemView;
import com.p280ss.android.ugc.aweme.utils.C43057di;
import com.p280ss.android.ugc.aweme.utils.C43119fc;
import com.p280ss.android.ugc.gamora.jedi.C44396a;
import com.p280ss.android.ugc.gamora.jedi.C44396a.C44397a;
import com.p280ss.android.ugc.gamora.jedi.C44403b;
import com.p280ss.android.ugc.gamora.jedi.C44413i;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C48006q;
import kotlin.jvm.p357a.C48008s;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;
import kotlin.reflect.C7584c;
import kotlin.reflect.C7595j;
import kotlin.reflect.C7599l;
import p346io.reactivex.p347b.C7321c;

/* renamed from: com.ss.android.ugc.gamora.recorder.v */
public final class C44820v extends C12629j implements C44396a {

    /* renamed from: i */
    static final /* synthetic */ C7595j[] f115293i = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C44820v.class), "recordViewModel", "getRecordViewModel()Lcom/ss/android/ugc/gamora/recorder/RecordViewModel;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C44820v.class), "tabContainer", "getTabContainer()Landroid/widget/LinearLayout;"))};

    /* renamed from: k */
    public static final C44821a f115294k = new C44821a(null);

    /* renamed from: j */
    public TabHost f115295j;

    /* renamed from: l */
    private C40304b f115296l;

    /* renamed from: m */
    private final C7541d f115297m;

    /* renamed from: n */
    private C39382ed f115298n;

    /* renamed from: o */
    private ShortVideoContext f115299o;

    /* renamed from: p */
    private final C7541d f115300p = C7546e.m23569a(new C44823c(this));

    /* renamed from: com.ss.android.ugc.gamora.recorder.v$a */
    public static final class C44821a {
        private C44821a() {
        }

        public /* synthetic */ C44821a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.v$b */
    static final class C44822b extends Lambda implements C7563m<C44396a, Boolean, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44820v f115301a;

        C44822b(C44820v vVar) {
            this.f115301a = vVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m141465a((C44396a) obj, ((Boolean) obj2).booleanValue());
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m141465a(C44396a aVar, boolean z) {
            int i;
            C7573i.m23587b(aVar, "$receiver");
            int dimensionPixelSize = this.f115301a.mo31017x().getDimensionPixelSize(R.dimen.cp);
            LayoutParams layoutParams = C44820v.m141441a(this.f115301a).getLayoutParams();
            if (layoutParams != null) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                if (z) {
                    i = (dimensionPixelSize - ((int) C9738o.m28708b((Context) this.f115301a.mo31015v(), 40.0f))) / 2;
                } else {
                    i = 0;
                }
                marginLayoutParams.bottomMargin = i;
                C44820v.m141441a(this.f115301a).setLayoutParams(marginLayoutParams);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.v$c */
    static final class C44823c extends Lambda implements C7561a<LinearLayout> {

        /* renamed from: a */
        final /* synthetic */ C44820v f115302a;

        C44823c(C44820v vVar) {
            this.f115302a = vVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public LinearLayout invoke() {
            return (LinearLayout) C44820v.m141441a(this.f115302a).findViewById(R.id.a19);
        }
    }

    /* renamed from: H */
    private final RecordViewModel m141438H() {
        return (RecordViewModel) this.f115297m.getValue();
    }

    /* renamed from: I */
    private final LinearLayout m141439I() {
        return (LinearLayout) this.f115300p.getValue();
    }

    /* renamed from: a */
    public final <VM1 extends JediViewModel<S1>, S1 extends C11670t, R> R mo29066a(VM1 vm1, C7562b<? super S1, ? extends R> bVar) {
        C7573i.m23587b(vm1, "viewModel1");
        C7573i.m23587b(bVar, "block");
        return C44397a.m140500a(this, vm1, bVar);
    }

    /* renamed from: a */
    public final void mo107265a(int i, boolean z) {
        TabHost tabHost = this.f115295j;
        if (tabHost == null) {
            C7573i.m23583a("tabHost");
        }
        tabHost.setIndexWithoutAnim(i);
    }

    /* renamed from: a */
    public final void mo107266a(Animation animation) {
        C7573i.m23587b(animation, "animation");
        TabHost tabHost = this.f115295j;
        if (tabHost == null) {
            C7573i.m23583a("tabHost");
        }
        tabHost.clearAnimation();
        TabHost tabHost2 = this.f115295j;
        if (tabHost2 == null) {
            C7573i.m23583a("tabHost");
        }
        tabHost2.startAnimation(animation);
    }

    /* renamed from: a */
    public final void mo107264a(int i, String str, String str2) {
        C7573i.m23587b(str, "text");
        C7573i.m23587b(str2, "tag");
        if (C43057di.m136601a(this.f33526d_)) {
            TabHost tabHost = this.f115295j;
            if (tabHost == null) {
                C7573i.m23583a("tabHost");
            }
            int tabCount = tabHost.getTabCount() - i;
            C40304b bVar = this.f115296l;
            if (bVar == null) {
                C7573i.m23583a("tabConfig");
            }
            bVar.mo100130a(tabCount, str, str2);
            TabHost tabHost2 = this.f115295j;
            if (tabHost2 == null) {
                C7573i.m23583a("tabHost");
            }
            tabHost2.requestLayout();
            TabHost tabHost3 = this.f115295j;
            if (tabHost3 == null) {
                C7573i.m23583a("tabHost");
            }
            if (tabCount < tabHost3.getCurrentIndex()) {
                TabHost tabHost4 = this.f115295j;
                if (tabHost4 == null) {
                    C7573i.m23583a("tabHost");
                }
                int currentIndex = tabHost4.getCurrentIndex() + 1;
                TabHost tabHost5 = this.f115295j;
                if (tabHost5 == null) {
                    C7573i.m23583a("tabHost");
                }
                mo107265a(Math.min(currentIndex, tabHost5.getTabCount() - 1), false);
            }
        } else {
            C40304b bVar2 = this.f115296l;
            if (bVar2 == null) {
                C7573i.m23583a("tabConfig");
            }
            bVar2.mo100130a(i, str, str2);
            TabHost tabHost6 = this.f115295j;
            if (tabHost6 == null) {
                C7573i.m23583a("tabHost");
            }
            tabHost6.requestLayout();
        }
    }

    /* renamed from: a */
    public final void mo107268a(String str, String str2) {
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
            LinearLayout I = m141439I();
            C7573i.m23582a((Object) I, "tabContainer");
            if (I.getChildCount() > 0) {
                int i = 0;
                LinearLayout I2 = m141439I();
                C7573i.m23582a((Object) I2, "tabContainer");
                int childCount = I2.getChildCount();
                while (i < childCount) {
                    View childAt = m141439I().getChildAt(i);
                    if (childAt != null && (childAt instanceof TabItemView)) {
                        TabItemView tabItemView = (TabItemView) childAt;
                        if (C7573i.m23585a((Object) str, tabItemView.getTag())) {
                            tabItemView.mo102410a(str2);
                            if (C7573i.m23585a((Object) C43119fc.m136748a(R.string.ti), (Object) tabItemView.getTagText())) {
                                C40004b.m127905a("luck");
                            } else if (C7573i.m23585a((Object) C43119fc.m136748a(R.string.dh2), (Object) tabItemView.getTagText())) {
                                C40004b.m127905a("prop");
                            }
                        }
                        i++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo107267a(String str) {
        if (!TextUtils.isEmpty(str)) {
            LinearLayout I = m141439I();
            C7573i.m23582a((Object) I, "tabContainer");
            if (I.getChildCount() > 0) {
                int i = 0;
                LinearLayout I2 = m141439I();
                C7573i.m23582a((Object) I2, "tabContainer");
                int childCount = I2.getChildCount();
                while (i < childCount) {
                    View childAt = m141439I().getChildAt(i);
                    if (childAt != null && (childAt instanceof TabItemView)) {
                        TabItemView tabItemView = (TabItemView) childAt;
                        if (C7573i.m23585a((Object) str, tabItemView.getTag())) {
                            if (!tabItemView.mo20986c()) {
                                C40004b.m127906b("normal_type");
                            } else if (C7573i.m23585a((Object) C43119fc.m136748a(R.string.ti), (Object) tabItemView.getTagText())) {
                                C40004b.m127906b("luck");
                            } else if (C7573i.m23585a((Object) C43119fc.m136748a(R.string.dh2), (Object) tabItemView.getTagText())) {
                                C40004b.m127906b("prop");
                            }
                            tabItemView.mo20984b();
                        }
                        i++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: J */
    public C11585f mo29191e() {
        return C44397a.m140506c(this);
    }

    /* renamed from: a */
    public final C11648k mo29060a() {
        return C44397a.m140503b(this);
    }

    /* renamed from: b */
    public final C11669s<C11585f> mo29067b() {
        return C44397a.m140509d(this);
    }

    /* renamed from: c */
    public final boolean mo29068c() {
        return C44397a.m140511e(this);
    }

    /* renamed from: d */
    public final C0043i mo29173d() {
        return C44397a.m140494a(this);
    }

    /* renamed from: G */
    public final Object mo30920G() {
        TabHost tabHost = this.f115295j;
        if (tabHost == null) {
            C7573i.m23583a("tabHost");
        }
        TabHost tabHost2 = this.f115295j;
        if (tabHost2 == null) {
            C7573i.m23583a("tabHost");
        }
        return tabHost.mo102391a(tabHost2.getCurrentIndex());
    }

    public C44820v() {
        C7584c a = C7575l.m23595a(RecordViewModel.class);
        this.f115297m = C7546e.m23569a(new RecordBottomTabScene$$special$$inlined$activityViewModel$1(this, a, a));
    }

    /* renamed from: a */
    public static final /* synthetic */ TabHost m141441a(C44820v vVar) {
        TabHost tabHost = vVar.f115295j;
        if (tabHost == null) {
            C7573i.m23583a("tabHost");
        }
        return tabHost;
    }

    /* renamed from: a */
    public final int mo107263a(Object obj) {
        C7573i.m23587b(obj, "tag");
        TabHost tabHost = this.f115295j;
        if (tabHost == null) {
            C7573i.m23583a("tabHost");
        }
        int tabCount = tabHost.getTabCount();
        for (int i = 0; i < tabCount; i++) {
            TabHost tabHost2 = this.f115295j;
            if (tabHost2 == null) {
                C7573i.m23583a("tabHost");
            }
            if (C7573i.m23585a(obj, tabHost2.mo102391a(i))) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: e */
    public final void mo30985e(Bundle bundle) {
        super.mo30985e(bundle);
        Object b = mo30998F().mo31126b((Object) "owner");
        if (b == null) {
            C7573i.m23580a();
        }
        this.f115298n = (C39382ed) b;
        Activity v = mo31015v();
        if (v != null) {
            C0063u a = C0069x.m159a((FragmentActivity) v).mo147a(ShortVideoContextViewModel.class);
            C7573i.m23582a((Object) a, "ViewModelProviders.of(re…extViewModel::class.java)");
            ShortVideoContext shortVideoContext = ((ShortVideoContextViewModel) a).f99791a;
            C7573i.m23582a((Object) shortVideoContext, "ViewModelProviders.of(re…s.java).shortVideoContext");
            this.f115299o = shortVideoContext;
            View h_ = mo31004h_(R.id.od);
            C7573i.m23582a((Object) h_, "requireViewById(R.id.bottom_tab_host)");
            this.f115295j = (TabHost) h_;
            TabHost tabHost = this.f115295j;
            if (tabHost == null) {
                C7573i.m23583a("tabHost");
            }
            ShortVideoContext shortVideoContext2 = this.f115299o;
            if (shortVideoContext2 == null) {
                C7573i.m23583a("shortVideoContext");
            }
            this.f115296l = C44442a.m140570a(tabHost, shortVideoContext2);
            C44442a aVar = C44442a.f114701a;
            C39382ed edVar = this.f115298n;
            if (edVar == null) {
                C7573i.m23583a("ownerHost");
            }
            ShortVideoContext shortVideoContext3 = this.f115299o;
            if (shortVideoContext3 == null) {
                C7573i.m23583a("shortVideoContext");
            }
            TabHost tabHost2 = this.f115295j;
            if (tabHost2 == null) {
                C7573i.m23583a("tabHost");
            }
            C40304b bVar = this.f115296l;
            if (bVar == null) {
                C7573i.m23583a("tabConfig");
            }
            aVar.mo106888a(edVar, shortVideoContext3, tabHost2, bVar);
            mo91870d(m141438H(), C44824w.f115303a, new C11672v(), new C44822b(this));
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    /* renamed from: a */
    public final View mo30923a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        C7573i.m23587b(viewGroup, "container");
        View inflate = layoutInflater.inflate(R.layout.b1x, viewGroup, false);
        C7573i.m23582a((Object) inflate, "inflater.inflate(R.layou…_scene, container, false)");
        return inflate;
    }

    /* renamed from: a */
    public final <S extends C11670t> C7321c mo29061a(JediViewModel<S> jediViewModel, C11672v<S> vVar, C7563m<? super C11585f, ? super S, C7581n> mVar) {
        C7573i.m23587b(jediViewModel, "$this$subscribe");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(mVar, "subscriber");
        return C44397a.m140496a(this, jediViewModel, vVar, mVar);
    }

    /* renamed from: b */
    public final <S extends C11670t, A> void mo91868b(JediViewModel<S> jediViewModel, C7599l<S, ? extends A> lVar, C11672v<C11675y<A>> vVar, C7563m<? super C44396a, ? super A, C7581n> mVar) {
        C7573i.m23587b(jediViewModel, "$this$selectNonNullSubscribe");
        C7573i.m23587b(lVar, "prop1");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(mVar, "subscriber");
        C44397a.m140501a(this, jediViewModel, lVar, vVar, mVar);
    }

    /* renamed from: c */
    public final <S extends C11670t, A> void mo91869c(JediViewModel<S> jediViewModel, C7599l<S, ? extends C44403b<? extends A>> lVar, C11672v<C11675y<C44403b<A>>> vVar, C7563m<? super C44396a, ? super A, C7581n> mVar) {
        C7573i.m23587b(jediViewModel, "$this$subscribeEvent");
        C7573i.m23587b(lVar, "prop1");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(mVar, "subscriber");
        C44397a.m140504b(this, jediViewModel, lVar, vVar, mVar);
    }

    /* renamed from: d */
    public final <S extends C11670t, A> void mo91870d(JediViewModel<S> jediViewModel, C7599l<S, ? extends C44413i<? extends A>> lVar, C11672v<C11675y<C44413i<A>>> vVar, C7563m<? super C44396a, ? super A, C7581n> mVar) {
        C7573i.m23587b(jediViewModel, "$this$subscribeMultiEvent");
        C7573i.m23587b(lVar, "prop1");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(mVar, "subscriber");
        C44397a.m140507c(this, jediViewModel, lVar, vVar, mVar);
    }

    /* renamed from: a */
    public final <S extends C11670t, A> C7321c mo29062a(JediViewModel<S> jediViewModel, C7599l<S, ? extends A> lVar, C11672v<C11675y<A>> vVar, C7563m<? super C11585f, ? super A, C7581n> mVar) {
        C7573i.m23587b(jediViewModel, "$this$selectSubscribe");
        C7573i.m23587b(lVar, "prop1");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(mVar, "subscriber");
        return C44397a.m140510d(this, jediViewModel, lVar, vVar, mVar);
    }

    /* renamed from: a */
    public final <S extends C11670t, A, B> C7321c mo29064a(JediViewModel<S> jediViewModel, C7599l<S, ? extends A> lVar, C7599l<S, ? extends B> lVar2, C11672v<C11676z<A, B>> vVar, C48006q<? super C11585f, ? super A, ? super B, C7581n> qVar) {
        C7573i.m23587b(jediViewModel, "$this$selectSubscribe");
        C7573i.m23587b(lVar, "prop1");
        C7573i.m23587b(lVar2, "prop2");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(qVar, "subscriber");
        return C44397a.m140498a(this, jediViewModel, lVar, lVar2, vVar, qVar);
    }

    /* renamed from: a */
    public final <S extends C11670t, T> C7321c mo29063a(JediViewModel<S> jediViewModel, C7599l<S, ? extends C11491a<? extends T>> lVar, C11672v<C11675y<C11491a<T>>> vVar, C7563m<? super C11585f, ? super Throwable, C7581n> mVar, C7562b<? super C11585f, C7581n> bVar, C7563m<? super C11585f, ? super T, C7581n> mVar2) {
        C7573i.m23587b(jediViewModel, "$this$asyncSubscribe");
        C7573i.m23587b(lVar, "prop");
        C7573i.m23587b(vVar, "config");
        return C44397a.m140497a((C44396a) this, jediViewModel, lVar, vVar, mVar, bVar, mVar2);
    }

    /* renamed from: a */
    public final <S extends C11670t, A, B, C, D> C7321c mo29065a(JediViewModel<S> jediViewModel, C7599l<S, ? extends A> lVar, C7599l<S, ? extends B> lVar2, C7599l<S, ? extends C> lVar3, C7599l<S, ? extends D> lVar4, C11672v<C11493ab<A, B, C, D>> vVar, C48008s<? super C11585f, ? super A, ? super B, ? super C, ? super D, C7581n> sVar) {
        C7573i.m23587b(jediViewModel, "$this$selectSubscribe");
        C7573i.m23587b(lVar, "prop1");
        C7573i.m23587b(lVar2, "prop2");
        C7573i.m23587b(lVar3, "prop3");
        C7573i.m23587b(lVar4, "prop4");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(sVar, "subscriber");
        return C44397a.m140499a(this, jediViewModel, lVar, lVar2, lVar3, lVar4, vVar, sVar);
    }
}
