package com.p280ss.android.ugc.aweme.tools.live;

import android.app.Activity;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0069x;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
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
import com.p280ss.android.ugc.aweme.common.p1145f.C25682d;
import com.p280ss.android.ugc.aweme.port.internal.C35610c;
import com.p280ss.android.ugc.aweme.port.internal.C35610c.C35611a;
import com.p280ss.android.ugc.aweme.port.internal.C35622l;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.port.p1479in.C35601y;
import com.p280ss.android.ugc.aweme.port.p1479in.C35601y.C35602a;
import com.p280ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p280ss.android.ugc.aweme.shortvideo.p1578i.C39998a;
import com.p280ss.android.ugc.aweme.shortvideo.record.CameraModule;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41530am;
import com.p280ss.android.ugc.aweme.tools.C42155av;
import com.p280ss.android.ugc.aweme.tools.C42156aw;
import com.p280ss.android.ugc.aweme.tools.C42570p;
import com.p280ss.android.ugc.aweme.tools.C42586v;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import com.p280ss.android.ugc.gamora.bottomtab.C43869e;
import com.p280ss.android.ugc.gamora.jedi.C44396a;
import com.p280ss.android.ugc.gamora.jedi.C44396a.C44397a;
import com.p280ss.android.ugc.gamora.jedi.C44403b;
import com.p280ss.android.ugc.gamora.jedi.C44413i;
import com.p280ss.android.ugc.gamora.recorder.RecordViewModel;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7581n;
import kotlin.Triple;
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

/* renamed from: com.ss.android.ugc.aweme.tools.live.a */
public final class C42350a extends C43869e implements C44396a {

    /* renamed from: i */
    static final /* synthetic */ C7595j[] f110155i = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C42350a.class), "liveModule", "getLiveModule()Lcom/ss/android/ugc/aweme/port/internal/ILiveModule;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C42350a.class), "recordViewModel", "getRecordViewModel()Lcom/ss/android/ugc/gamora/recorder/RecordViewModel;"))};

    /* renamed from: k */
    public static final C42351a f110156k = new C42351a(null);

    /* renamed from: j */
    public RecordLiveViewModel f110157j;

    /* renamed from: l */
    private final C7541d f110158l = C7546e.m23569a(new C42356e(this));

    /* renamed from: m */
    private C35602a f110159m;

    /* renamed from: n */
    private final C7541d f110160n;

    /* renamed from: com.ss.android.ugc.aweme.tools.live.a$a */
    public static final class C42351a {
        private C42351a() {
        }

        public /* synthetic */ C42351a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.live.a$b */
    public static final class C42352b implements C35611a {

        /* renamed from: a */
        final /* synthetic */ C42350a f110161a;

        /* renamed from: b */
        final /* synthetic */ C35610c f110162b;

        /* renamed from: com.ss.android.ugc.aweme.tools.live.a$b$a */
        static final class C42353a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C42352b f110163a;

            C42353a(C42352b bVar) {
                this.f110163a = bVar;
            }

            public final void run() {
                this.f110163a.f110161a.mo30921H().mo106846k(false);
                this.f110163a.f110161a.mo30921H().mo106836b(0);
            }
        }

        /* renamed from: c */
        private boolean m134674c() {
            if (C42350a.m134650a(this.f110161a).f110154e == null) {
                return false;
            }
            ShortVideoContext shortVideoContext = C42350a.m134650a(this.f110161a).f110154e;
            if (shortVideoContext == null) {
                C7573i.m23580a();
            }
            if (!shortVideoContext.mo96142d()) {
                ShortVideoContext shortVideoContext2 = C42350a.m134650a(this.f110161a).f110154e;
                if (shortVideoContext2 == null) {
                    C7573i.m23580a();
                }
                if (!shortVideoContext2.mo96144e()) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: a */
        public final void mo90421a() {
            if (m134674c() && this.f110162b.mo83757a() != null) {
                View a = this.f110162b.mo83757a();
                if (a == null) {
                    C7573i.m23580a();
                }
                C7573i.m23582a((Object) a, "module.liveEntryView!!");
                a.setVisibility(8);
            }
        }

        /* renamed from: b */
        public final void mo90422b() {
            if (m134674c() && this.f110162b.mo83757a() != null) {
                View a = this.f110162b.mo83757a();
                if (a == null) {
                    C7573i.m23580a();
                }
                C7573i.m23582a((Object) a, "module.liveEntryView!!");
                a.setVisibility(0);
                View a2 = this.f110162b.mo83757a();
                if (a2 == null) {
                    C7573i.m23580a();
                }
                a2.postDelayed(new C42353a(this), 200);
            }
        }

        C42352b(C42350a aVar, C35610c cVar) {
            this.f110161a = aVar;
            this.f110162b = cVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.live.a$c */
    static final class C42354c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C42350a f110164a;

        /* renamed from: b */
        final /* synthetic */ C35610c f110165b;

        C42354c(C42350a aVar, C35610c cVar) {
            this.f110164a = aVar;
            this.f110165b = cVar;
        }

        public final void onClick(View view) {
            C42586v vVar;
            ClickInstrumentation.onClick(view);
            if (C42350a.m134650a(this.f110164a).mo103833b().mo100087f() == 0) {
                vVar = C42586v.m135306a();
                C7573i.m23582a((Object) vVar, "FrontRearChangeEvent.toFront()");
                ImageView b = this.f110165b.mo83762b();
                if (b == null) {
                    C7573i.m23580a();
                }
                C7573i.m23582a((Object) b, "module.liveCameraReverseBtn!!");
                b.setSelected(true);
            } else {
                vVar = C42586v.m135307b();
                C7573i.m23582a((Object) vVar, "FrontRearChangeEvent.toRear()");
                ImageView b2 = this.f110165b.mo83762b();
                if (b2 == null) {
                    C7573i.m23580a();
                }
                C7573i.m23582a((Object) b2, "module.liveCameraReverseBtn!!");
                b2.setSelected(false);
            }
            C42156aw a = C42350a.m134650a(this.f110164a).mo103829a();
            Activity activity = this.f110164a.f33526d_;
            if (activity != null) {
                a.mo103594a((Object) (FragmentActivity) activity, (C42155av) vVar);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.live.a$d */
    static final class C42355d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C42350a f110166a;

        C42355d(C42350a aVar) {
            this.f110166a = aVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C42156aw a = C42350a.m134650a(this.f110166a).mo103829a();
            Activity activity = this.f110166a.f33526d_;
            if (activity != null) {
                a.mo103594a((Object) (FragmentActivity) activity, (C42155av) new C42570p());
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.live.a$e */
    static final class C42356e extends Lambda implements C7561a<C35610c> {

        /* renamed from: a */
        final /* synthetic */ C42350a f110167a;

        C42356e(C42350a aVar) {
            this.f110167a = aVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C35610c invoke() {
            C35610c c = C35563c.f93258u.mo83200c();
            C42350a aVar = this.f110167a;
            C7573i.m23582a((Object) c, "this");
            aVar.mo103836a(c);
            return c;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.live.a$f */
    static final class C42357f extends Lambda implements C7563m<C44396a, Triple<? extends Integer, ? extends Integer, ? extends Intent>, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C42350a f110168a;

        C42357f(C42350a aVar) {
            this.f110168a = aVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m134678a((C44396a) obj, (Triple) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m134678a(C44396a aVar, Triple<Integer, Integer, ? extends Intent> triple) {
            C7573i.m23587b(aVar, "$receiver");
            C7573i.m23587b(triple, "it");
            this.f110168a.mo30920G();
            ((Number) triple.getFirst()).intValue();
            ((Number) triple.getSecond()).intValue();
            triple.getThird();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.live.a$g */
    static final class C42358g implements C35602a {

        /* renamed from: a */
        final /* synthetic */ C42350a f110169a;

        C42358g(C42350a aVar) {
            this.f110169a = aVar;
        }

        /* renamed from: a */
        public final void mo90408a() {
            C41530am.m132280a("OnLiveStartListener#onStartLive");
            RecordLiveViewModel a = C42350a.m134650a(this.f110169a);
            a.mo103834c().mo55906b();
            a.mo103833b().mo100094m();
        }
    }

    /* renamed from: G */
    public final C35610c mo30920G() {
        return (C35610c) this.f110158l.getValue();
    }

    /* renamed from: H */
    public final RecordViewModel mo30921H() {
        return (RecordViewModel) this.f110160n.getValue();
    }

    public final String bQ_() {
        return "RecordLiveScene";
    }

    /* renamed from: a */
    public final void mo103836a(C35610c cVar) {
        Context context = this.f33526d_;
        RecordLiveViewModel recordLiveViewModel = this.f110157j;
        if (recordLiveViewModel == null) {
            C7573i.m23583a("recordLiveViewModel");
        }
        cVar.mo83758a(context, recordLiveViewModel.f110150a);
        boolean z = false;
        cVar.mo83761a(new View[0]);
        cVar.mo83760a((C35611a) new C42352b(this, cVar));
        if (cVar.mo83762b() != null) {
            ImageView b = cVar.mo83762b();
            if (b == null) {
                C7573i.m23580a();
            }
            b.setOnClickListener(new C42354c(this, cVar));
        }
        RecordLiveViewModel recordLiveViewModel2 = this.f110157j;
        if (recordLiveViewModel2 == null) {
            C7573i.m23583a("recordLiveViewModel");
        }
        CameraModule b2 = recordLiveViewModel2.mo103833b();
        C35563c.f93258u.mo83198b(b2.mo100087f() == 1);
        if (cVar.mo83762b() != null) {
            ImageView b3 = cVar.mo83762b();
            if (b3 == null) {
                C7573i.m23580a();
            }
            C7573i.m23582a((Object) b3, "module.liveCameraReverseBtn!!");
            if (b2.mo100087f() != 0) {
                z = true;
            }
            b3.setSelected(z);
        }
        if (cVar.mo83764c() != null) {
            View c = cVar.mo83764c();
            if (c == null) {
                C7573i.m23580a();
            }
            c.setOnClickListener(new C42355d(this));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: M */
    public C11585f mo29191e() {
        return C44397a.m140506c(this);
    }

    /* renamed from: I */
    public final boolean mo30922I() {
        mo30920G();
        return false;
    }

    /* renamed from: J */
    public final boolean mo103835J() {
        mo30920G();
        return false;
    }

    /* renamed from: K */
    public final boolean mo96987K() {
        mo30920G();
        return false;
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

    /* renamed from: p */
    public final void mo31007p() {
        C35601y yVar = C35563c.f93258u;
        C35602a aVar = this.f110159m;
        if (aVar == null) {
            C7573i.m23583a("mLiveStartListener");
        }
        yVar.mo83197b(aVar);
        super.mo31007p();
    }

    public C42350a() {
        C7584c a = C7575l.m23595a(RecordViewModel.class);
        this.f110160n = C7546e.m23569a(new RecordLiveScene$$special$$inlined$activityViewModel$1(this, a, a));
    }

    public final void bS_() {
        C35610c G = mo30920G();
        View view = this.f33523b;
        if (view != null) {
            G.mo83763b((ViewGroup) view);
            C35601y yVar = C35563c.f93258u;
            C35602a aVar = this.f110159m;
            if (aVar == null) {
                C7573i.m23583a("mLiveStartListener");
            }
            yVar.mo83197b(aVar);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
    }

    /* renamed from: L */
    private final void m134648L() {
        Effect effect = C39998a.f103900d.mo99454a().f103901a;
        int i = C39998a.f103900d.mo99454a().f103902b;
        if (!(effect == null || i == -1)) {
            mo30920G();
        }
        mo30921H().mo106832a(Integer.valueOf(-1));
        boolean g = ((C35622l) C25682d.m84426a(this.f33526d_, C35622l.class)).mo60373g(false);
        if ((i == 1 || i == 2) && !g) {
            ((C35622l) C25682d.m84426a(this.f33526d_, C35622l.class)).mo60372f(true);
        }
    }

    public final void bR_() {
        boolean z;
        mo30920G();
        C35610c G = mo30920G();
        View view = this.f33523b;
        if (view != null) {
            G.mo83759a((ViewGroup) view);
            RecordLiveViewModel recordLiveViewModel = this.f110157j;
            if (recordLiveViewModel == null) {
                C7573i.m23583a("recordLiveViewModel");
            }
            ShortVideoContext shortVideoContext = recordLiveViewModel.f110154e;
            if (shortVideoContext != null && shortVideoContext.f99776l.isEmpty()) {
                C35601y yVar = C35563c.f93258u;
                C35602a aVar = this.f110159m;
                if (aVar == null) {
                    C7573i.m23583a("mLiveStartListener");
                }
                yVar.mo83194a(aVar);
            }
            RecordLiveViewModel recordLiveViewModel2 = this.f110157j;
            if (recordLiveViewModel2 == null) {
                C7573i.m23583a("recordLiveViewModel");
            }
            ShortVideoContext shortVideoContext2 = recordLiveViewModel2.f110154e;
            if (shortVideoContext2 != null) {
                z = shortVideoContext2.f99764ay;
            } else {
                z = false;
            }
            if (C39998a.m127887a(z, mo103835J())) {
                m134648L();
                return;
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
    }

    /* renamed from: a */
    public static final /* synthetic */ RecordLiveViewModel m134650a(C42350a aVar) {
        RecordLiveViewModel recordLiveViewModel = aVar.f110157j;
        if (recordLiveViewModel == null) {
            C7573i.m23583a("recordLiveViewModel");
        }
        return recordLiveViewModel;
    }

    /* renamed from: e */
    public final void mo30985e(Bundle bundle) {
        super.mo30985e(bundle);
        Activity activity = this.f33526d_;
        if (activity != null) {
            C0063u a = C0069x.m159a((FragmentActivity) activity).mo147a(RecordLiveViewModel.class);
            C7573i.m23582a((Object) a, "ViewModelProviders.of(ac…iveViewModel::class.java)");
            this.f110157j = (RecordLiveViewModel) a;
            mo91869c(mo30921H(), C42362b.f110177a, new C11672v(), new C42357f(this));
            this.f110159m = new C42358g(this);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    /* renamed from: a */
    public final <VM1 extends JediViewModel<S1>, S1 extends C11670t, R> R mo29066a(VM1 vm1, C7562b<? super S1, ? extends R> bVar) {
        C7573i.m23587b(vm1, "viewModel1");
        C7573i.m23587b(bVar, "block");
        return C44397a.m140500a(this, vm1, bVar);
    }

    /* renamed from: a */
    public final View mo30923a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        C7573i.m23587b(viewGroup, "container");
        View inflate = layoutInflater.inflate(R.layout.b26, viewGroup, false);
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
