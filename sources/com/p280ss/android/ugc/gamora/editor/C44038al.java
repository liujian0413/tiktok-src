package com.p280ss.android.ugc.gamora.editor;

import android.app.Activity;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0069x;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import android.support.p029v7.app.AppCompatActivity;
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
import com.bytedance.scene.C12629j;
import com.p280ss.android.ugc.asve.p754b.C15389d;
import com.p280ss.android.ugc.aweme.base.activity.C23258e;
import com.p280ss.android.ugc.aweme.photomovie.p1454a.C34860g;
import com.p280ss.android.ugc.aweme.services.video.VEVolumeChangeOp;
import com.p280ss.android.ugc.aweme.shortvideo.AVMusic;
import com.p280ss.android.ugc.aweme.shortvideo.edit.C39500av;
import com.p280ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p280ss.android.ugc.aweme.shortvideo.music.C40079a;
import com.p280ss.android.ugc.aweme.shortvideo.music.C40079a.C40081b;
import com.p280ss.android.ugc.aweme.shortvideo.p1571f.C39852k;
import com.p280ss.android.ugc.aweme.shortvideo.p1571f.C39852k.C39856a;
import com.p280ss.android.ugc.aweme.toolsport.IAVMusicService.C42593c;
import com.p280ss.android.ugc.aweme.toolsport.p1679a.C42609g;
import com.p280ss.android.ugc.aweme.toolsport.p1679a.C42612j;
import com.p280ss.android.ugc.aweme.toolsport.p1679a.C42613k;
import com.p280ss.android.ugc.aweme.toolsport.p1679a.C42614l;
import com.p280ss.android.ugc.gamora.jedi.C44396a;
import com.p280ss.android.ugc.gamora.jedi.C44396a.C44397a;
import com.p280ss.android.ugc.gamora.jedi.C44403b;
import com.p280ss.android.ugc.gamora.jedi.C44413i;
import com.p280ss.android.ugc.gamora.p1486a.C36113b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import dmt.p1861av.video.C47516v;
import dmt.p1861av.video.VEVideoPublishEditViewModel;
import java.util.ArrayList;
import java.util.List;
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
import kotlin.reflect.C7595j;
import kotlin.reflect.C7599l;
import p346io.reactivex.p347b.C7321c;

/* renamed from: com.ss.android.ugc.gamora.editor.al */
public final class C44038al extends C12629j implements C44396a {

    /* renamed from: i */
    static final /* synthetic */ C7595j[] f113943i = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C44038al.class), "mVolumeHelper", "getMVolumeHelper()Lcom/ss/android/ugc/aweme/shortvideo/helper/VolumeHelper;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C44038al.class), "musicView", "getMusicView()Lcom/ss/android/ugc/aweme/shortvideo/music/MusicView;"))};

    /* renamed from: m */
    public static final C44039a f113944m = new C44039a(null);

    /* renamed from: j */
    public VideoPublishEditModel f113945j;

    /* renamed from: k */
    public VEVideoPublishEditViewModel f113946k;

    /* renamed from: l */
    public C40081b f113947l;

    /* renamed from: n */
    private final C7541d f113948n = C7546e.m23569a(C44041c.f113953a);

    /* renamed from: o */
    private final C7541d f113949o = C7546e.m23569a(C44042d.f113954a);

    /* renamed from: p */
    private EditVolumeViewModel f113950p;

    /* renamed from: q */
    private EditMusicViewModel f113951q;

    /* renamed from: com.ss.android.ugc.gamora.editor.al$a */
    public static final class C44039a {
        private C44039a() {
        }

        public /* synthetic */ C44039a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.al$b */
    static final class C44040b implements C39856a {

        /* renamed from: a */
        final /* synthetic */ C44038al f113952a;

        C44040b(C44038al alVar) {
            this.f113952a = alVar;
        }

        /* renamed from: a */
        public final void mo99288a(float f, float f2) {
            if ((C44038al.m139373a(this.f113952a).isFastImport || C44038al.m139373a(this.f113952a).getWavFile() != null) && !C44038al.m139373a(this.f113952a).isMuted) {
                C0052o m = C44038al.m139374b(this.f113952a).mo119521m();
                C7573i.m23582a((Object) m, "mViewModel.volumeChangeOpLiveData");
                m.setValue(VEVolumeChangeOp.ofVoice(f));
                if (C44038al.m139373a(this.f113952a).mMusicPath != null) {
                    C0052o m2 = C44038al.m139374b(this.f113952a).mo119521m();
                    C7573i.m23582a((Object) m2, "mViewModel.volumeChangeOpLiveData");
                    m2.setValue(VEVolumeChangeOp.ofMusic(f2));
                }
            } else {
                C44038al.m139374b(this.f113952a).mo119521m().setValue(VEVolumeChangeOp.ofMusic(f2));
            }
            C44038al.m139373a(this.f113952a).voiceVolume = f;
            C44038al.m139373a(this.f113952a).musicVolume = f2;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.al$c */
    static final class C44041c extends Lambda implements C7561a<C39852k> {

        /* renamed from: a */
        public static final C44041c f113953a = new C44041c();

        C44041c() {
            super(0);
        }

        /* renamed from: a */
        private static C39852k m139408a() {
            return new C39852k();
        }

        public final /* synthetic */ Object invoke() {
            return m139408a();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.al$d */
    static final class C44042d extends Lambda implements C7561a<C40079a> {

        /* renamed from: a */
        public static final C44042d f113954a = new C44042d();

        C44042d() {
            super(0);
        }

        /* renamed from: a */
        private static C40079a m139409a() {
            return new C40079a();
        }

        public final /* synthetic */ Object invoke() {
            return m139409a();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.al$e */
    static final class C44043e extends Lambda implements C7563m<C44396a, Boolean, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44038al f113955a;

        C44043e(C44038al alVar) {
            this.f113955a = alVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m139410a((C44396a) obj, ((Boolean) obj2).booleanValue());
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m139410a(C44396a aVar, boolean z) {
            C7573i.m23587b(aVar, "$receiver");
            this.f113955a.mo106545b(z);
            C42593c cVar = this.f113955a.mo30920G().f104095f;
            if (cVar != null) {
                cVar.mo103890c(z);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.al$f */
    static final class C44044f extends Lambda implements C7563m<C44396a, Integer, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44038al f113956a;

        C44044f(C44038al alVar) {
            this.f113956a = alVar;
            super(2);
        }

        /* renamed from: a */
        private void m139411a(C44396a aVar, int i) {
            C7573i.m23587b(aVar, "$receiver");
            this.f113956a.mo106546d(i);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m139411a((C44396a) obj, ((Number) obj2).intValue());
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.al$g */
    static final class C44045g extends Lambda implements C7563m<C44396a, AVMusic, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44038al f113957a;

        C44045g(C44038al alVar) {
            this.f113957a = alVar;
            super(2);
        }

        /* renamed from: a */
        private void m139412a(C44396a aVar, AVMusic aVMusic) {
            C7573i.m23587b(aVar, "$receiver");
            C7573i.m23587b(aVMusic, "it");
            this.f113957a.mo106542a(aVMusic);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m139412a((C44396a) obj, (AVMusic) obj2);
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.al$h */
    public static final class C44046h implements C42612j {

        /* renamed from: a */
        final /* synthetic */ C44038al f113958a;

        C44046h(C44038al alVar) {
            this.f113958a = alVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x001b, code lost:
            if (r4 == null) goto L_0x001d;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo97305a(android.view.View r4, int r5) {
            /*
                r3 = this;
                java.lang.String r0 = "view"
                kotlin.jvm.internal.C7573i.m23587b(r4, r0)
                com.ss.android.ugc.gamora.editor.al r4 = r3.f113958a
                com.ss.android.ugc.aweme.shortvideo.music.a r4 = r4.mo30920G()
                com.ss.android.ugc.aweme.shortvideo.AVMusic r4 = r4.mo99773b(r5)
                com.ss.android.ugc.gamora.editor.al r0 = r3.f113958a
                com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = com.p280ss.android.ugc.gamora.editor.C44038al.m139373a(r0)
                if (r4 == 0) goto L_0x001d
                java.lang.String r4 = r4.getMusicId()
                if (r4 != 0) goto L_0x001f
            L_0x001d:
                java.lang.String r4 = ""
            L_0x001f:
                int r5 = r5 + 1
                com.ss.android.ugc.gamora.editor.al r1 = r3.f113958a
                r1.mo30920G()
                int r1 = com.p280ss.android.ugc.aweme.shortvideo.music.C40079a.m128072a()
                com.ss.android.ugc.gamora.editor.al r2 = r3.f113958a
                com.ss.android.ugc.aweme.shortvideo.music.a r2 = r2.mo30920G()
                int r2 = r2.mo99778f()
                if (r2 != 0) goto L_0x0039
                java.lang.String r2 = "recommend"
                goto L_0x003b
            L_0x0039:
                java.lang.String r2 = "favorite"
            L_0x003b:
                com.p280ss.android.ugc.aweme.shortvideo.edit.C39500av.m126139a(r0, r4, r5, r1, r2)
                com.ss.android.ugc.gamora.editor.al r4 = r3.f113958a
                com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r4 = com.p280ss.android.ugc.gamora.editor.C44038al.m139373a(r4)
                r4.mMusicShowRank = r5
                com.ss.android.ugc.gamora.editor.al r4 = r3.f113958a
                com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r4 = com.p280ss.android.ugc.gamora.editor.C44038al.m139373a(r4)
                com.ss.android.ugc.gamora.editor.al r5 = r3.f113958a
                r5.mo30920G()
                int r5 = com.p280ss.android.ugc.aweme.shortvideo.music.C40079a.m128072a()
                r4.mMusicRecType = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.gamora.editor.C44038al.C44046h.mo97305a(android.view.View, int):void");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.al$i */
    public static final class C44047i implements C42613k {

        /* renamed from: a */
        final /* synthetic */ C44038al f113959a;

        C44047i(C44038al alVar) {
            this.f113959a = alVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0016, code lost:
            if (r4 == null) goto L_0x0018;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo104208a(int r4) {
            /*
                r3 = this;
                com.ss.android.ugc.gamora.editor.al r0 = r3.f113959a
                com.ss.android.ugc.aweme.shortvideo.music.a r0 = r0.mo30920G()
                com.ss.android.ugc.aweme.shortvideo.AVMusic r4 = r0.mo99773b(r4)
                com.ss.android.ugc.gamora.editor.al r0 = r3.f113959a
                com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = com.p280ss.android.ugc.gamora.editor.C44038al.m139373a(r0)
                if (r4 == 0) goto L_0x0018
                java.lang.String r4 = r4.getMusicId()
                if (r4 != 0) goto L_0x001a
            L_0x0018:
                java.lang.String r4 = ""
            L_0x001a:
                com.ss.android.ugc.gamora.editor.al r1 = r3.f113959a
                r1.mo30920G()
                int r1 = com.p280ss.android.ugc.aweme.shortvideo.music.C40079a.m128072a()
                com.ss.android.ugc.gamora.editor.al r2 = r3.f113959a
                com.ss.android.ugc.aweme.shortvideo.music.a r2 = r2.mo30920G()
                int r2 = r2.mo99778f()
                if (r2 != 0) goto L_0x0032
                java.lang.String r2 = "recommend"
                goto L_0x0034
            L_0x0032:
                java.lang.String r2 = "favorite"
            L_0x0034:
                com.p280ss.android.ugc.aweme.shortvideo.edit.C39500av.m126140a(r0, r4, r1, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.gamora.editor.C44038al.C44047i.mo104208a(int):void");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.al$j */
    public static final class C44048j implements C40081b {

        /* renamed from: a */
        final /* synthetic */ C44038al f113960a;

        /* renamed from: d */
        public final void mo99784d() {
            C40081b bVar = this.f113960a.f113947l;
            if (bVar != null) {
                bVar.mo99784d();
            }
        }

        /* renamed from: b */
        public final void mo99782b() {
            C40081b bVar = this.f113960a.f113947l;
            if (bVar != null) {
                bVar.mo99782b();
            }
            C39500av.m126144b(C44038al.m139373a(this.f113960a), this.f113960a.mo30999a((int) R.string.p5));
        }

        /* renamed from: c */
        public final void mo99783c() {
            C40081b bVar = this.f113960a.f113947l;
            if (bVar != null) {
                bVar.mo99783c();
            }
            C39500av.m126146c(C44038al.m139373a(this.f113960a), this.f113960a.mo30999a((int) R.string.o_));
        }

        /* renamed from: a */
        public final void mo99780a() {
            C0052o k = C44038al.m139374b(this.f113960a).mo119519k();
            C7573i.m23582a((Object) k, "mViewModel.previewControlLiveData");
            k.setValue(C47516v.m148297b());
            C40081b bVar = this.f113960a.f113947l;
            if (bVar != null) {
                bVar.mo99780a();
            }
            C39500av.m126160p(C44038al.m139373a(this.f113960a));
        }

        C44048j(C44038al alVar) {
            this.f113960a = alVar;
        }

        /* renamed from: a */
        public final void mo99781a(String str, AVMusic aVMusic, boolean z) {
            C40081b bVar = this.f113960a.f113947l;
            if (bVar != null) {
                bVar.mo99781a(str, aVMusic, z);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.al$k */
    public static final class C44049k implements C42609g {

        /* renamed from: a */
        final /* synthetic */ C44038al f113961a;

        /* renamed from: a */
        public final void mo104206a() {
            C39500av.m126161q(C44038al.m139373a(this.f113961a));
        }

        C44049k(C44038al alVar) {
            this.f113961a = alVar;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.al$l */
    public static final class C44050l implements C42614l {

        /* renamed from: a */
        final /* synthetic */ C44038al f113962a;

        C44050l(C44038al alVar) {
            this.f113962a = alVar;
        }

        /* renamed from: a */
        public final void mo104209a(boolean z) {
            String str;
            VideoPublishEditModel a = C44038al.m139373a(this.f113962a);
            if (z) {
                str = "recommend";
            } else {
                str = "favorite";
            }
            C39500av.m126148d(a, str);
        }
    }

    /* renamed from: M */
    private final C39852k m139370M() {
        return (C39852k) this.f113948n.getValue();
    }

    /* renamed from: G */
    public final C40079a mo30920G() {
        return (C40079a) this.f113949o.getValue();
    }

    /* renamed from: a */
    public final void mo106543a(VideoPublishEditModel videoPublishEditModel) {
        C7573i.m23587b(videoPublishEditModel, "model");
        this.f113945j = videoPublishEditModel;
    }

    /* renamed from: a */
    public final void mo106544a(boolean z) {
        mo30920G().mo99775c();
        m139370M().mo99278c();
        VideoPublishEditModel videoPublishEditModel = this.f113945j;
        if (videoPublishEditModel == null) {
            C7573i.m23583a("mModel");
        }
        if (videoPublishEditModel.mMusicPath != null) {
            C39852k M = m139370M();
            VideoPublishEditModel videoPublishEditModel2 = this.f113945j;
            if (videoPublishEditModel2 == null) {
                C7573i.m23583a("mModel");
            }
            M.mo99270a((int) (videoPublishEditModel2.musicVolume * 100.0f));
        }
        if (z) {
            VideoPublishEditModel videoPublishEditModel3 = this.f113945j;
            if (videoPublishEditModel3 == null) {
                C7573i.m23583a("mModel");
            }
            C39500av.m126162r(videoPublishEditModel3);
        }
    }

    /* renamed from: a */
    public final void mo106542a(AVMusic aVMusic) {
        mo30920G().f104107r = aVMusic;
    }

    /* renamed from: a */
    public final void mo106540a(C15389d dVar) {
        if (mo30920G().f104106q == null) {
            mo30920G().f104106q = dVar;
        }
    }

    /* renamed from: a */
    public final void mo106541a(C34860g gVar) {
        C7573i.m23587b(gVar, "transitionListener");
        mo30920G().mo99771a(gVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: O */
    public C11585f mo29191e() {
        return C44397a.m140506c(this);
    }

    /* renamed from: J */
    public final boolean mo106538J() {
        return mo30920G().f104099j;
    }

    /* renamed from: K */
    public final void mo96987K() {
        mo30920G().mo99775c();
    }

    /* renamed from: L */
    public final void mo106539L() {
        mo30920G().mo99777e();
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

    /* renamed from: q */
    public final void mo31008q() {
        super.mo31008q();
        mo30920G().mo99774b();
    }

    /* renamed from: H */
    public final void mo30921H() {
        mo30920G().mo99776d();
        VideoPublishEditModel videoPublishEditModel = this.f113945j;
        if (videoPublishEditModel == null) {
            C7573i.m23583a("mModel");
        }
        mo30920G();
        C39500av.m126136a(videoPublishEditModel, C40079a.m128072a());
    }

    /* renamed from: A */
    public final void mo30993A() {
        super.mo30993A();
        if (mo30920G().f104099j) {
            C42593c cVar = mo30920G().f104095f;
            if (cVar != null) {
                cVar.mo103893g();
            }
            C42593c cVar2 = mo30920G().f104095f;
            if (cVar2 != null) {
                cVar2.mo103888c();
            }
        }
    }

    /* renamed from: B */
    public final void mo30994B() {
        super.mo30994B();
        if (mo30920G().f104099j) {
            C42593c cVar = mo30920G().f104095f;
            if (cVar != null) {
                cVar.mo103894h();
            }
            C42593c cVar2 = mo30920G().f104095f;
            if (cVar2 != null) {
                cVar2.mo103886b();
            }
        }
    }

    /* renamed from: N */
    private final void m139371N() {
        mo30920G().f104105p = new C44046h(this);
        mo30920G().f104104o = new C44047i(this);
        mo30920G().f104098i = new C44048j(this);
        mo30920G().f104094e = new C44049k(this);
        mo30920G().f104096g = new C44050l(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00c0, code lost:
        if (r0.getWavFile() != null) goto L_0x00c2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0113  */
    /* renamed from: I */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo30922I() {
        /*
            r5 = this;
            com.ss.android.ugc.aweme.shortvideo.f.k r0 = r5.m139370M()
            boolean r0 = r0.f103568f
            if (r0 != 0) goto L_0x00a4
            com.ss.android.ugc.aweme.shortvideo.f.k r0 = r5.m139370M()
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r1 = r5.f113945j
            if (r1 != 0) goto L_0x0015
            java.lang.String r2 = "mModel"
            kotlin.jvm.internal.C7573i.m23583a(r2)
        L_0x0015:
            boolean r1 = r1.isMuted
            r0.mo99273a(r1)
            com.ss.android.ugc.aweme.shortvideo.f.k r0 = r5.m139370M()
            com.ss.android.ugc.aweme.shortvideo.music.a r1 = r5.mo30920G()
            android.view.ViewGroup r1 = r1.f104103n
            android.view.View r1 = (android.view.View) r1
            r0.f103563a = r1
            com.ss.android.ugc.aweme.shortvideo.f.k r0 = r5.m139370M()
            android.app.Activity r1 = r5.f33526d_
            if (r1 == 0) goto L_0x009c
            android.support.v4.app.FragmentActivity r1 = (android.support.p022v4.app.FragmentActivity) r1
            android.app.Activity r2 = r5.f33526d_
            if (r2 == 0) goto L_0x0094
            com.ss.android.ugc.aweme.base.activity.e r2 = (com.p280ss.android.ugc.aweme.base.activity.C23258e) r2
            r0.mo99272a(r1, r2)
            com.ss.android.ugc.aweme.shortvideo.f.k r0 = r5.m139370M()
            r0.mo99271a()
            com.ss.android.ugc.aweme.shortvideo.f.k r0 = r5.m139370M()
            com.ss.android.ugc.gamora.editor.al$b r1 = new com.ss.android.ugc.gamora.editor.al$b
            r1.<init>(r5)
            com.ss.android.ugc.aweme.shortvideo.f.k$a r1 = (com.p280ss.android.ugc.aweme.shortvideo.p1571f.C39852k.C39856a) r1
            r0.f103569g = r1
            com.ss.android.ugc.gamora.editor.EditVolumeViewModel r0 = r5.f113950p
            if (r0 != 0) goto L_0x0058
            java.lang.String r1 = "mEditVolumeViewModel"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x0058:
            r1 = 2131820652(0x7f11006c, float:1.9274025E38)
            java.lang.String r1 = r5.mo30999a(r1)
            java.lang.String r2 = "getString(R.string.accompany)"
            kotlin.jvm.internal.C7573i.m23582a(r1, r2)
            r0.mo106476a(r1)
            com.ss.android.ugc.gamora.editor.EditVolumeViewModel r0 = r5.f113950p
            if (r0 != 0) goto L_0x0070
            java.lang.String r1 = "mEditVolumeViewModel"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x0070:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r1 = r5.f113945j
            if (r1 != 0) goto L_0x0079
            java.lang.String r2 = "mModel"
            kotlin.jvm.internal.C7573i.m23583a(r2)
        L_0x0079:
            boolean r1 = r1.isReaction()
            if (r1 == 0) goto L_0x0087
            r1 = 2131826108(0x7f1115bc, float:1.9285091E38)
        L_0x0082:
            java.lang.String r1 = r5.mo30999a(r1)
            goto L_0x008b
        L_0x0087:
            r1 = 2131824561(0x7f110fb1, float:1.9281953E38)
            goto L_0x0082
        L_0x008b:
            java.lang.String r2 = "if (mModel.isReaction) g…tring(R.string.man_voice)"
            kotlin.jvm.internal.C7573i.m23582a(r1, r2)
            r0.mo106477b(r1)
            goto L_0x00a4
        L_0x0094:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.base.activity.ListenableActivityRegistry"
            r0.<init>(r1)
            throw r0
        L_0x009c:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type android.support.v4.app.FragmentActivity"
            r0.<init>(r1)
            throw r0
        L_0x00a4:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r5.f113945j
            if (r0 != 0) goto L_0x00ad
            java.lang.String r1 = "mModel"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x00ad:
            boolean r0 = r0.isFastImport
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x00c2
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r5.f113945j
            if (r0 != 0) goto L_0x00bc
            java.lang.String r3 = "mModel"
            kotlin.jvm.internal.C7573i.m23583a(r3)
        L_0x00bc:
            java.lang.String r0 = r0.getWavFile()
            if (r0 == 0) goto L_0x00cf
        L_0x00c2:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r5.f113945j
            if (r0 != 0) goto L_0x00cb
            java.lang.String r3 = "mModel"
            kotlin.jvm.internal.C7573i.m23583a(r3)
        L_0x00cb:
            boolean r0 = r0.isMuted
            if (r0 == 0) goto L_0x00db
        L_0x00cf:
            com.ss.android.ugc.aweme.shortvideo.f.k r0 = r5.m139370M()
            com.ss.android.ugc.aweme.shortvideo.f.k r0 = r0.mo99279c(r2)
            r0.mo99276b(r1)
            goto L_0x00f4
        L_0x00db:
            com.ss.android.ugc.aweme.shortvideo.f.k r0 = r5.m139370M()
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r3 = r5.f113945j
            if (r3 != 0) goto L_0x00e8
            java.lang.String r4 = "mModel"
            kotlin.jvm.internal.C7573i.m23583a(r4)
        L_0x00e8:
            java.lang.String r3 = r3.mMusicPath
            if (r3 == 0) goto L_0x00ed
            r1 = 1
        L_0x00ed:
            com.ss.android.ugc.aweme.shortvideo.f.k r0 = r0.mo99279c(r1)
            r0.mo99276b(r2)
        L_0x00f4:
            com.ss.android.ugc.aweme.shortvideo.f.k r0 = r5.m139370M()
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r1 = r5.f113945j
            if (r1 != 0) goto L_0x0101
            java.lang.String r2 = "mModel"
            kotlin.jvm.internal.C7573i.m23583a(r2)
        L_0x0101:
            float r1 = r1.musicVolume
            r2 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 * r2
            int r1 = (int) r1
            r0.mo99270a(r1)
            com.ss.android.ugc.aweme.shortvideo.f.k r0 = r5.m139370M()
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r1 = r5.f113945j
            if (r1 != 0) goto L_0x0118
            java.lang.String r3 = "mModel"
            kotlin.jvm.internal.C7573i.m23583a(r3)
        L_0x0118:
            float r1 = r1.voiceVolume
            float r1 = r1 * r2
            int r1 = (int) r1
            r0.mo99275b(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.gamora.editor.C44038al.mo30922I():void");
    }

    /* renamed from: a */
    public static final /* synthetic */ VideoPublishEditModel m139373a(C44038al alVar) {
        VideoPublishEditModel videoPublishEditModel = alVar.f113945j;
        if (videoPublishEditModel == null) {
            C7573i.m23583a("mModel");
        }
        return videoPublishEditModel;
    }

    /* renamed from: b */
    public static final /* synthetic */ VEVideoPublishEditViewModel m139374b(C44038al alVar) {
        VEVideoPublishEditViewModel vEVideoPublishEditViewModel = alVar.f113946k;
        if (vEVideoPublishEditViewModel == null) {
            C7573i.m23583a("mViewModel");
        }
        return vEVideoPublishEditViewModel;
    }

    /* renamed from: d */
    public final void mo106546d(int i) {
        mo30920G().mo99769a(i);
    }

    /* renamed from: b */
    public final void mo106545b(boolean z) {
        mo30920G().f104097h = z;
    }

    /* renamed from: e */
    public final void mo30985e(Bundle bundle) {
        super.mo30985e(bundle);
        Activity activity = this.f33526d_;
        if (activity != null) {
            C0063u a = C0069x.m159a((FragmentActivity) activity).mo147a(VEVideoPublishEditViewModel.class);
            C7573i.m23582a((Object) a, "ViewModelProviders.of(ac…ditViewModel::class.java)");
            this.f113946k = (VEVideoPublishEditViewModel) a;
            Activity activity2 = this.f33526d_;
            if (activity2 != null) {
                JediViewModel a2 = C36113b.m116288a((FragmentActivity) activity2).mo91871a(EditVolumeViewModel.class);
                C7573i.m23582a((Object) a2, "JediViewModelProviders.o…umeViewModel::class.java)");
                this.f113950p = (EditVolumeViewModel) a2;
                Activity activity3 = this.f33526d_;
                if (activity3 != null) {
                    JediViewModel a3 = C36113b.m116288a((FragmentActivity) activity3).mo91871a(EditMusicViewModel.class);
                    C7573i.m23582a((Object) a3, "JediViewModelProviders.o…sicViewModel::class.java)");
                    this.f113951q = (EditMusicViewModel) a3;
                    VideoPublishEditModel videoPublishEditModel = this.f113945j;
                    if (videoPublishEditModel == null) {
                        C7573i.m23583a("mModel");
                    }
                    if (videoPublishEditModel.isMvThemeVideoType()) {
                        mo30920G().mo99772a(videoPublishEditModel.mvCreateVideoData.musicIds);
                        mo30920G().f104100k = videoPublishEditModel.mIsFromDraft;
                    } else if (videoPublishEditModel.isStatusVideoType()) {
                        mo30920G().mo99772a((List<String>) new ArrayList<String>(videoPublishEditModel.statusCreateVideoData.getMusicIds()));
                        mo30920G().f104100k = videoPublishEditModel.mIsFromDraft;
                    }
                    EditMusicViewModel editMusicViewModel = this.f113951q;
                    if (editMusicViewModel == null) {
                        C7573i.m23583a("musicViewModel");
                    }
                    mo91868b(editMusicViewModel, C44051am.f113963a, new C11672v(), new C44043e(this));
                    EditMusicViewModel editMusicViewModel2 = this.f113951q;
                    if (editMusicViewModel2 == null) {
                        C7573i.m23583a("musicViewModel");
                    }
                    mo91869c(editMusicViewModel2, C44052an.f113964a, new C11672v(), new C44044f(this));
                    EditMusicViewModel editMusicViewModel3 = this.f113951q;
                    if (editMusicViewModel3 == null) {
                        C7573i.m23583a("musicViewModel");
                    }
                    mo91868b(editMusicViewModel3, C44053ao.f113965a, new C11672v(), new C44045g(this));
                    m139371N();
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
            }
            throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
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
        C40079a G = mo30920G();
        Activity activity = this.f33526d_;
        if (activity != null) {
            G.mo99770a((AppCompatActivity) activity);
            C40079a G2 = mo30920G();
            Activity activity2 = this.f33526d_;
            if (!(activity2 instanceof C23258e)) {
                activity2 = null;
            }
            G2.f104092c = (C23258e) activity2;
            C40079a G3 = mo30920G();
            View inflate = layoutInflater.inflate(R.layout.aip, viewGroup, false);
            if (inflate != null) {
                G3.f104091b = (FrameLayout) inflate;
                FrameLayout frameLayout = mo30920G().f104091b;
                if (frameLayout == null) {
                    C7573i.m23580a();
                }
                return frameLayout;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout");
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v7.app.AppCompatActivity");
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
