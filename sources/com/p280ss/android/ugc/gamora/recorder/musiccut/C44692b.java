package com.p280ss.android.ugc.gamora.recorder.musiccut;

import android.app.Activity;
import android.arch.lifecycle.C0043i;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
import com.p280ss.android.ugc.aweme.base.AmeActivity;
import com.p280ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p280ss.android.ugc.aweme.shortvideo.cutmusic.C39309c;
import com.p280ss.android.ugc.aweme.shortvideo.cutmusic.C39309c.C39310a;
import com.p280ss.android.ugc.aweme.shortvideo.cutmusic.RepeatMusicPlayer;
import com.p280ss.android.ugc.aweme.shortvideo.cutmusic.RepeatMusicPlayer.C39306a;
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
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C48006q;
import kotlin.jvm.p357a.C48008s;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;
import kotlin.reflect.C7584c;
import kotlin.reflect.C7595j;
import kotlin.reflect.C7599l;
import p346io.reactivex.p347b.C7321c;

/* renamed from: com.ss.android.ugc.gamora.recorder.musiccut.b */
public final class C44692b extends C12629j implements C39306a, C39310a, C44396a {

    /* renamed from: i */
    static final /* synthetic */ C7595j[] f115061i = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C44692b.class), "musicCutViewModel", "getMusicCutViewModel()Lcom/ss/android/ugc/gamora/recorder/musiccut/RecordMusicCutViewModel;"))};

    /* renamed from: j */
    public static final C44693a f115062j = new C44693a(null);

    /* renamed from: k */
    private ShortVideoContext f115063k;

    /* renamed from: l */
    private final C7541d f115064l;

    /* renamed from: m */
    private C39309c f115065m;

    /* renamed from: n */
    private RepeatMusicPlayer f115066n;

    /* renamed from: o */
    private String f115067o;

    /* renamed from: p */
    private int f115068p;

    /* renamed from: q */
    private int f115069q;

    /* renamed from: com.ss.android.ugc.gamora.recorder.musiccut.b$a */
    public static final class C44693a {
        private C44693a() {
        }

        public /* synthetic */ C44693a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: G */
    private final RecordMusicCutViewModel m141100G() {
        return (RecordMusicCutViewModel) this.f115064l.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: I */
    public C11585f mo29191e() {
        return C44397a.m140506c(this);
    }

    /* renamed from: C */
    public final void mo30995C() {
        super.mo30995C();
        m141101H();
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

    /* renamed from: H */
    private final void m141101H() {
        RepeatMusicPlayer repeatMusicPlayer = this.f115066n;
        if (repeatMusicPlayer != null) {
            repeatMusicPlayer.mo97852a();
        }
        this.f115066n = null;
    }

    /* renamed from: p */
    public final void mo31007p() {
        super.mo31007p();
        C39309c cVar = this.f115065m;
        if (cVar != null) {
            cVar.mo97863a();
        }
    }

    public C44692b() {
        C7584c a = C7575l.m23595a(RecordMusicCutViewModel.class);
        this.f115064l = C7546e.m23569a(new RecordMusicCutScene$$special$$inlined$activityViewModel$1(this, a, a));
    }

    /* renamed from: c */
    public final void mo97859c(int i) {
        C39309c cVar = this.f115065m;
        if (cVar != null) {
            cVar.mo97860a(i);
        }
    }

    /* renamed from: f_ */
    public final void mo97871f_(int i) {
        String str = this.f115067o;
        if (str == null) {
            C7573i.m23583a("mMusicPath");
        }
        if (!TextUtils.isEmpty(str)) {
            this.f115069q = i;
            m141103a(i, this.f115068p);
        }
    }

    /* renamed from: g_ */
    public final void mo97872g_(int i) {
        this.f115069q = i;
        m141100G().mo107103a(new C44691a(i));
        m141101H();
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00ec  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo30985e(android.os.Bundle r4) {
        /*
            r3 = this;
            super.mo30985e(r4)
            android.app.Activity r4 = r3.f33526d_
            if (r4 == 0) goto L_0x00f4
            android.support.v4.app.FragmentActivity r4 = (android.support.p022v4.app.FragmentActivity) r4
            android.arch.lifecycle.w r4 = android.arch.lifecycle.C0069x.m159a(r4)
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel> r0 = com.p280ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel.class
            android.arch.lifecycle.u r4 = r4.mo147a(r0)
            java.lang.String r0 = "ViewModelProviders.of(ac…extViewModel::class.java)"
            kotlin.jvm.internal.C7573i.m23582a(r4, r0)
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel r4 = (com.p280ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel) r4
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r4 = r4.f99791a
            java.lang.String r0 = "ViewModelProviders.of(ac…s.java).shortVideoContext"
            kotlin.jvm.internal.C7573i.m23582a(r4, r0)
            r3.f115063k = r4
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r4 = r3.f115063k
            if (r4 != 0) goto L_0x002c
            java.lang.String r0 = "shortVideoContext"
            kotlin.jvm.internal.C7573i.m23583a(r0)
        L_0x002c:
            com.ss.android.ugc.aweme.sticker.model.BackgroundVideo r4 = r4.f99782r
            if (r4 == 0) goto L_0x004a
            com.ss.android.ugc.aweme.property.AVSettings r4 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93230L
            com.ss.android.ugc.aweme.property.AVSettings$Property r0 = com.p280ss.android.ugc.aweme.property.AVSettings.Property.LongVideoThreshold
            long r0 = r4.mo93344c(r0)
            int r4 = (int) r0
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r3.f115063k
            if (r0 != 0) goto L_0x0042
            java.lang.String r1 = "shortVideoContext"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x0042:
            boolean r0 = r0.f99745af
            if (r0 == 0) goto L_0x0047
            goto L_0x0056
        L_0x0047:
            r4 = 15000(0x3a98, float:2.102E-41)
            goto L_0x0056
        L_0x004a:
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r4 = r3.f115063k
            if (r4 != 0) goto L_0x0053
            java.lang.String r0 = "shortVideoContext"
            kotlin.jvm.internal.C7573i.m23583a(r0)
        L_0x0053:
            long r0 = r4.f99767c
            int r4 = (int) r0
        L_0x0056:
            com.ss.android.ugc.aweme.property.AVAB r0 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93231M
            com.ss.android.ugc.aweme.property.AVAB$Property r1 = com.p280ss.android.ugc.aweme.property.AVAB.Property.EnableRemove15sCapMusic
            boolean r0 = r0.mo93305a(r1)
            if (r0 == 0) goto L_0x0091
            com.ss.android.ugc.aweme.shortvideo.dw r0 = com.p280ss.android.ugc.aweme.shortvideo.C39360dw.m125725a()
            com.ss.android.ugc.aweme.shortvideo.AVMusic r0 = r0.mo97931b()
            if (r0 == 0) goto L_0x0091
            com.ss.android.ugc.aweme.shortvideo.dw r0 = com.p280ss.android.ugc.aweme.shortvideo.C39360dw.m125725a()
            com.ss.android.ugc.aweme.shortvideo.AVMusic r0 = r0.mo97931b()
            if (r0 != 0) goto L_0x0077
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x0077:
            int r0 = r0.shootDuration
            if (r0 <= 0) goto L_0x0091
            com.ss.android.ugc.aweme.shortvideo.dw r0 = com.p280ss.android.ugc.aweme.shortvideo.C39360dw.m125725a()
            com.ss.android.ugc.aweme.shortvideo.AVMusic r0 = r0.mo97931b()
            if (r0 != 0) goto L_0x0088
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x0088:
            int r0 = r0.shootDuration
            int r4 = java.lang.Math.min(r4, r0)
            r3.f115068p = r4
            goto L_0x0093
        L_0x0091:
            r3.f115068p = r4
        L_0x0093:
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r4 = r3.f115063k
            if (r4 != 0) goto L_0x009c
            java.lang.String r0 = "shortVideoContext"
            kotlin.jvm.internal.C7573i.m23583a(r0)
        L_0x009c:
            int r4 = r4.f99770f
            r3.f115069q = r4
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r4 = r3.f115063k
            if (r4 != 0) goto L_0x00a9
            java.lang.String r0 = "shortVideoContext"
            kotlin.jvm.internal.C7573i.m23583a(r0)
        L_0x00a9:
            java.lang.String r4 = r4.f99769e
            java.lang.String r0 = "shortVideoContext.mMusicPath"
            kotlin.jvm.internal.C7573i.m23582a(r4, r0)
            r3.f115067o = r4
            com.ss.android.ugc.aweme.shortvideo.cutmusic.a r4 = new com.ss.android.ugc.aweme.shortvideo.cutmusic.a
            android.view.View r0 = r3.f33523b
            if (r0 == 0) goto L_0x00ec
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r1 = r3
            com.ss.android.ugc.aweme.shortvideo.cutmusic.c$a r1 = (com.p280ss.android.ugc.aweme.shortvideo.cutmusic.C39309c.C39310a) r1
            r4.<init>(r0, r1)
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r3.f115063k
            if (r0 != 0) goto L_0x00c9
            java.lang.String r1 = "shortVideoContext"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x00c9:
            com.ss.android.ugc.aweme.shortvideo.AVMusicWaveBean r0 = r0.f99732aJ
            r4.mo97862a(r0)
            int r0 = r3.f115068p
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r1 = r3.f115063k
            if (r1 != 0) goto L_0x00d9
            java.lang.String r2 = "shortVideoContext"
            kotlin.jvm.internal.C7573i.m23583a(r2)
        L_0x00d9:
            int r1 = r1.f99771g
            int r2 = r3.f115069q
            r4.mo97861a(r0, r1, r2)
            com.ss.android.ugc.aweme.shortvideo.cutmusic.c r4 = (com.p280ss.android.ugc.aweme.shortvideo.cutmusic.C39309c) r4
            r3.f115065m = r4
            int r4 = r3.f115069q
            int r0 = r3.f115068p
            r3.m141103a(r4, r0)
            return
        L_0x00ec:
            kotlin.TypeCastException r4 = new kotlin.TypeCastException
            java.lang.String r0 = "null cannot be cast to non-null type android.widget.FrameLayout"
            r4.<init>(r0)
            throw r4
        L_0x00f4:
            kotlin.TypeCastException r4 = new kotlin.TypeCastException
            java.lang.String r0 = "null cannot be cast to non-null type android.support.v4.app.FragmentActivity"
            r4.<init>(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.gamora.recorder.musiccut.C44692b.mo30985e(android.os.Bundle):void");
    }

    /* renamed from: a */
    public final <VM1 extends JediViewModel<S1>, S1 extends C11670t, R> R mo29066a(VM1 vm1, C7562b<? super S1, ? extends R> bVar) {
        C7573i.m23587b(vm1, "viewModel1");
        C7573i.m23587b(bVar, "block");
        return C44397a.m140500a(this, vm1, bVar);
    }

    /* renamed from: a */
    private final void m141103a(int i, int i2) {
        String str = this.f115067o;
        if (str == null) {
            C7573i.m23583a("mMusicPath");
        }
        if (!TextUtils.isEmpty(str)) {
            if (this.f115066n == null) {
                Activity activity = this.f33526d_;
                if (activity != null) {
                    AmeActivity ameActivity = (AmeActivity) activity;
                    String str2 = this.f115067o;
                    if (str2 == null) {
                        C7573i.m23583a("mMusicPath");
                    }
                    this.f115066n = new RepeatMusicPlayer(ameActivity, str2, i2);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.base.AmeActivity");
                }
            }
            RepeatMusicPlayer repeatMusicPlayer = this.f115066n;
            if (repeatMusicPlayer == null) {
                C7573i.m23580a();
            }
            repeatMusicPlayer.mo97853a(i);
            RepeatMusicPlayer repeatMusicPlayer2 = this.f115066n;
            if (repeatMusicPlayer2 == null) {
                C7573i.m23580a();
            }
            repeatMusicPlayer2.f102089e = this;
        }
    }

    /* renamed from: a */
    public final View mo30923a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        C7573i.m23587b(viewGroup, "container");
        View inflate = layoutInflater.inflate(R.layout.b29, viewGroup, false);
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
