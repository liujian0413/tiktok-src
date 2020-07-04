package com.p280ss.android.ugc.gamora.recorder.countdown;

import android.app.Activity;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0069x;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
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
import com.bytedance.scene.group.C12604b;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p1059d.p1060a.C23321d;
import com.p280ss.android.ugc.aweme.shortvideo.C39382ed;
import com.p280ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p280ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.p280ss.android.ugc.aweme.shortvideo.countdown.C38622h.C38623a;
import com.p280ss.android.ugc.aweme.shortvideo.countdown.CountDownModule;
import com.p280ss.android.ugc.aweme.shortvideo.countdown.CountDownModule.C38590a;
import com.p280ss.android.ugc.aweme.tools.C42137ad;
import com.p280ss.android.ugc.aweme.tools.C42155av;
import com.p280ss.android.ugc.aweme.tools.C42156aw;
import com.p280ss.android.ugc.gamora.jedi.C44396a;
import com.p280ss.android.ugc.gamora.jedi.C44396a.C44397a;
import com.p280ss.android.ugc.gamora.jedi.C44403b;
import com.p280ss.android.ugc.gamora.jedi.C44413i;
import com.p280ss.android.ugc.gamora.recorder.RecordViewModel;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C48006q;
import kotlin.jvm.p357a.C48008s;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;
import kotlin.reflect.C7584c;
import kotlin.reflect.C7595j;
import kotlin.reflect.C7599l;
import org.json.JSONObject;
import p346io.reactivex.p347b.C7321c;

/* renamed from: com.ss.android.ugc.gamora.recorder.countdown.a */
public final class C44600a extends C12604b implements C44396a {

    /* renamed from: j */
    static final /* synthetic */ C7595j[] f114904j = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C44600a.class), "countDownViewModel", "getCountDownViewModel()Lcom/ss/android/ugc/gamora/recorder/countdown/RecordCountDownViewModel;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C44600a.class), "recordViewModel", "getRecordViewModel()Lcom/ss/android/ugc/gamora/recorder/RecordViewModel;"))};

    /* renamed from: k */
    public C39382ed f114905k;

    /* renamed from: l */
    public CountDownModule f114906l;

    /* renamed from: m */
    private final C7541d f114907m;

    /* renamed from: n */
    private final C7541d f114908n;

    /* renamed from: com.ss.android.ugc.gamora.recorder.countdown.a$a */
    public static final class C44601a implements C38623a {

        /* renamed from: a */
        final /* synthetic */ C44600a f114909a;

        /* renamed from: b */
        final /* synthetic */ ShortVideoContextViewModel f114910b;

        /* renamed from: a */
        public final void mo96626a() {
            this.f114910b.mo96165a(true);
            this.f114909a.mo107039J().mo107030a(true);
        }

        /* renamed from: b */
        public final void mo96627b() {
            if (this.f114909a.f33526d_ != null) {
                this.f114909a.mo96987K().mo106840e(false);
                this.f114909a.mo107039J().mo107029a(C44600a.m140871b(this.f114909a).f100241g);
                this.f114909a.mo107039J().mo107030a(false);
                this.f114910b.mo96165a(false);
                this.f114910b.mo96164a((long) C44600a.m140871b(this.f114909a).f100239e);
            }
        }

        /* renamed from: c */
        public final void mo96628c() {
            if (this.f114909a.f33526d_ != null) {
                this.f114910b.mo96165a(false);
                this.f114909a.mo96987K().mo106840e(false);
                C42156aw J = C44600a.m140870a(this.f114909a).mo97896J();
                if (J != null) {
                    J.mo103594a((Object) C44600a.m140870a(this.f114909a), (C42155av) new C42137ad(4));
                }
            }
        }

        C44601a(C44600a aVar, ShortVideoContextViewModel shortVideoContextViewModel) {
            this.f114909a = aVar;
            this.f114910b = shortVideoContextViewModel;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.countdown.a$b */
    static final class C44602b<T> implements C23321d<JSONObject> {

        /* renamed from: a */
        final /* synthetic */ C44600a f114911a;

        C44602b(C44600a aVar) {
            this.f114911a = aVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public JSONObject mo60607a() {
            return C44600a.m140870a(this.f114911a).mo97966S();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.countdown.a$c */
    public static final class C44603c implements C38590a {

        /* renamed from: a */
        final /* synthetic */ C44600a f114912a;

        /* renamed from: a */
        public final void mo96572a() {
            C42156aw J = C44600a.m140870a(this.f114912a).mo97896J();
            if (J != null) {
                J.mo103594a((Object) C44600a.m140871b(this.f114912a), (C42155av) new C42137ad(0));
            }
        }

        C44603c(C44600a aVar) {
            this.f114912a = aVar;
        }

        /* renamed from: a */
        public final void mo96573a(boolean z) {
            if (this.f114912a.f33526d_ != null) {
                if (!z) {
                    this.f114912a.mo96987K().mo106840e(false);
                }
                if (!C44600a.m140871b(this.f114912a).mo96564b()) {
                    C42156aw J = C44600a.m140870a(this.f114912a).mo97896J();
                    if (J != null) {
                        J.mo103594a((Object) C44600a.m140870a(this.f114912a), (C42155av) new C42137ad(4));
                    }
                }
            }
        }
    }

    /* renamed from: J */
    public final RecordCountDownViewModel mo107039J() {
        return (RecordCountDownViewModel) this.f114907m.getValue();
    }

    /* renamed from: K */
    public final RecordViewModel mo96987K() {
        return (RecordViewModel) this.f114908n.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: L */
    public C11585f mo29191e() {
        return C44397a.m140506c(this);
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

    /* renamed from: a */
    public final C11648k mo29060a() {
        return C44397a.m140503b(this);
    }

    public C44600a() {
        C7584c a = C7575l.m23595a(RecordCountDownViewModel.class);
        this.f114907m = C7546e.m23569a(new RecordCountDownScene$$special$$inlined$activityViewModel$1(this, a, a));
        C7584c a2 = C7575l.m23595a(RecordViewModel.class);
        this.f114908n = C7546e.m23569a(new RecordCountDownScene$$special$$inlined$activityViewModel$2(this, a2, a2));
    }

    /* renamed from: a */
    public static final /* synthetic */ C39382ed m140870a(C44600a aVar) {
        C39382ed edVar = aVar.f114905k;
        if (edVar == null) {
            C7573i.m23583a("ownerHost");
        }
        return edVar;
    }

    /* renamed from: b */
    public static final /* synthetic */ CountDownModule m140871b(C44600a aVar) {
        CountDownModule countDownModule = aVar.f114906l;
        if (countDownModule == null) {
            C7573i.m23583a("countDownModule");
        }
        return countDownModule;
    }

    /* renamed from: e */
    public final void mo30985e(Bundle bundle) {
        super.mo30985e(bundle);
        Object b = mo30998F().mo31126b((Object) "owner");
        if (b == null) {
            C7573i.m23580a();
        }
        this.f114905k = (C39382ed) b;
        C39382ed edVar = this.f114905k;
        if (edVar == null) {
            C7573i.m23583a("ownerHost");
        }
        C0063u a = C0069x.m159a(edVar.mo97962O()).mo147a(ShortVideoContextViewModel.class);
        C7573i.m23582a((Object) a, "ViewModelProviders.of(ow…extViewModel::class.java)");
        ShortVideoContextViewModel shortVideoContextViewModel = (ShortVideoContextViewModel) a;
        Activity v = mo31015v();
        if (v != null) {
            FragmentActivity fragmentActivity = (FragmentActivity) v;
            View view = this.f33523b;
            if (view != null) {
                CountDownModule countDownModule = new CountDownModule(this, fragmentActivity, (FrameLayout) view, new C44601a(this, shortVideoContextViewModel), new C44602b(this));
                this.f114906l = countDownModule;
                ShortVideoContext shortVideoContext = shortVideoContextViewModel.f99791a;
                CountDownModule countDownModule2 = this.f114906l;
                if (countDownModule2 == null) {
                    C7573i.m23583a("countDownModule");
                }
                String str = shortVideoContext.f99769e;
                UrlModel urlModel = shortVideoContext.f99768d;
                C7573i.m23582a((Object) shortVideoContext, "shortVideoContext");
                countDownModule2.mo96563a(R.id.cpo, str, urlModel, shortVideoContext.mo96150k(), (long) shortVideoContext.f99771g, shortVideoContext.mo96151l(), shortVideoContext.mo96155p(), shortVideoContext.f99732aJ, new C44603c(this));
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout");
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    /* renamed from: a */
    public final <VM1 extends JediViewModel<S1>, S1 extends C11670t, R> R mo29066a(VM1 vm1, C7562b<? super S1, ? extends R> bVar) {
        C7573i.m23587b(vm1, "viewModel1");
        C7573i.m23587b(bVar, "block");
        return C44397a.m140500a(this, vm1, bVar);
    }

    /* renamed from: b */
    public final ViewGroup mo30923a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        C7573i.m23587b(viewGroup, "container");
        View inflate = layoutInflater.inflate(R.layout.b24, viewGroup, false);
        if (inflate != null) {
            return (ViewGroup) inflate;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
    }

    /* renamed from: a */
    public final <S extends C11670t> C7321c mo29061a(JediViewModel<S> jediViewModel, C11672v<S> vVar, C7563m<? super C11585f, ? super S, C7581n> mVar) {
        C7573i.m23587b(jediViewModel, "$this$subscribe");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(mVar, "subscriber");
        return C44397a.m140496a(this, jediViewModel, vVar, mVar);
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

    /* renamed from: b */
    public final <S extends C11670t, A> void mo91868b(JediViewModel<S> jediViewModel, C7599l<S, ? extends A> lVar, C11672v<C11675y<A>> vVar, C7563m<? super C44396a, ? super A, C7581n> mVar) {
        C7573i.m23587b(jediViewModel, "$this$selectNonNullSubscribe");
        C7573i.m23587b(lVar, "prop1");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(mVar, "subscriber");
        C44397a.m140501a(this, jediViewModel, lVar, vVar, mVar);
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
