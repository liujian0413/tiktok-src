package com.p280ss.android.ugc.aweme.status;

import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0069x;
import android.content.Context;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.airbnb.lottie.C1757f;
import com.airbnb.lottie.C1761g;
import com.airbnb.lottie.C1781j;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
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
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVSettings.Property;
import com.p280ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p280ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.p280ss.android.ugc.gamora.jedi.C44396a;
import com.p280ss.android.ugc.gamora.jedi.C44396a.C44397a;
import com.p280ss.android.ugc.gamora.jedi.C44403b;
import com.p280ss.android.ugc.gamora.jedi.C44413i;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.C7581n;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C48006q;
import kotlin.jvm.p357a.C48008s;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;
import kotlin.reflect.C7599l;
import p346io.reactivex.p347b.C7321c;

/* renamed from: com.ss.android.ugc.aweme.status.c */
public final class C41811c extends C12629j implements OnClickListener, C44396a {

    /* renamed from: m */
    public static final C41812a f108758m = new C41812a(null);

    /* renamed from: i */
    public View f108759i;

    /* renamed from: j */
    public LottieAnimationView f108760j;

    /* renamed from: k */
    public boolean f108761k;

    /* renamed from: l */
    public FragmentActivity f108762l;

    /* renamed from: n */
    private final RecordStatusViewModel f108763n;

    /* renamed from: o */
    private final ShortVideoContext f108764o;

    /* renamed from: com.ss.android.ugc.aweme.status.c$a */
    public static final class C41812a {
        private C41812a() {
        }

        public /* synthetic */ C41812a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.status.c$b */
    static final class C41813b<T> implements C1781j<Throwable> {

        /* renamed from: a */
        final /* synthetic */ C41811c f108765a;

        C41813b(C41811c cVar) {
            this.f108765a = cVar;
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo7127a(Object obj) {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.status.c$c */
    static final class C41814c<T> implements C1781j<C1757f> {

        /* renamed from: a */
        final /* synthetic */ C41811c f108766a;

        C41814c(C41811c cVar) {
            this.f108766a = cVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void mo7127a(C1757f fVar) {
            C41811c.m133035a(this.f108766a).setVisibility(0);
            C41811c.m133036b(this.f108766a).setComposition(fVar);
            C41811c.m133036b(this.f108766a).mo7078b();
            this.f108766a.f108761k = true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.status.c$d */
    static final class C41815d<T> implements C0053p<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C41811c f108767a;

        C41815d(C41811c cVar) {
            this.f108767a = cVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Boolean bool) {
            if (this.f108767a.f108761k) {
                if (bool == null || !bool.booleanValue()) {
                    C41811c.m133035a(this.f108767a).setVisibility(0);
                } else {
                    C41811c.m133035a(this.f108767a).setVisibility(8);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: G */
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

    /* renamed from: a */
    public static final /* synthetic */ View m133035a(C41811c cVar) {
        View view = cVar.f108759i;
        if (view == null) {
            C7573i.m23583a("rootView");
        }
        return view;
    }

    /* renamed from: b */
    public static final /* synthetic */ LottieAnimationView m133036b(C41811c cVar) {
        LottieAnimationView lottieAnimationView = cVar.f108760j;
        if (lottieAnimationView == null) {
            C7573i.m23583a("lottieview");
        }
        return lottieAnimationView;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f108763n.mo102545p().setValue("shoot_icon");
        this.f108763n.mo102541l().setValue(Boolean.valueOf(true));
    }

    public C41811c(FragmentActivity fragmentActivity) {
        C7573i.m23587b(fragmentActivity, "fragmentActivity");
        this.f108762l = fragmentActivity;
        C0063u a = C0069x.m159a(this.f108762l).mo147a(RecordStatusViewModel.class);
        C7573i.m23582a((Object) a, "ViewModelProviders.of(fr…tusViewModel::class.java)");
        this.f108763n = (RecordStatusViewModel) a;
        C0063u a2 = C0069x.m159a(this.f108762l).mo147a(ShortVideoContextViewModel.class);
        C7573i.m23582a((Object) a2, "ViewModelProviders.of(fr…extViewModel::class.java)");
        this.f108764o = ((ShortVideoContextViewModel) a2).f99791a;
    }

    /* renamed from: a */
    public final <VM1 extends JediViewModel<S1>, S1 extends C11670t, R> R mo29066a(VM1 vm1, C7562b<? super S1, ? extends R> bVar) {
        C7573i.m23587b(vm1, "viewModel1");
        C7573i.m23587b(bVar, "block");
        return C44397a.m140500a(this, vm1, bVar);
    }

    /* renamed from: a */
    public final <S extends C11670t> C7321c mo29061a(JediViewModel<S> jediViewModel, C11672v<S> vVar, C7563m<? super C11585f, ? super S, C7581n> mVar) {
        C7573i.m23587b(jediViewModel, "$this$subscribe");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(mVar, "subscriber");
        return C44397a.m140496a(this, jediViewModel, vVar, mVar);
    }

    /* renamed from: a */
    public final View mo30923a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        C7573i.m23587b(viewGroup, "container");
        View inflate = layoutInflater.inflate(R.layout.a_8, viewGroup, false);
        C7573i.m23582a((Object) inflate, "inflater.inflate(R.layou…status, container, false)");
        this.f108759i = inflate;
        View view = this.f108759i;
        if (view == null) {
            C7573i.m23583a("rootView");
        }
        view.setOnClickListener(this);
        View view2 = this.f108759i;
        if (view2 == null) {
            C7573i.m23583a("rootView");
        }
        View findViewById = view2.findViewById(R.id.cq0);
        C7573i.m23582a((Object) findViewById, "rootView.findViewById(R.id.record_pendant)");
        this.f108760j = (LottieAnimationView) findViewById;
        String e = C35563c.f93230L.mo93346e(Property.StatusLottieUrl);
        if (TextUtils.isEmpty(e) || this.f108764o.mo96142d() || this.f108764o.mo96144e() || this.f108764o.f99765az) {
            View view3 = this.f108759i;
            if (view3 == null) {
                C7573i.m23583a("rootView");
            }
            view3.setVisibility(8);
            this.f108761k = false;
        } else if (!C41816d.m133056a(this.f108762l)) {
            View view4 = this.f108759i;
            if (view4 == null) {
                C7573i.m23583a("rootView");
            }
            view4.setVisibility(8);
            this.f108761k = false;
        } else {
            C1761g.m8398a((Context) this.f108762l, e).mo7281c(new C41813b(this)).mo7275a((C1781j<T>) new C41814c<T>(this));
        }
        this.f108763n.mo102542m().observe(this.f108762l, new C41815d(this));
        View view5 = this.f108759i;
        if (view5 == null) {
            C7573i.m23583a("rootView");
        }
        return view5;
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
