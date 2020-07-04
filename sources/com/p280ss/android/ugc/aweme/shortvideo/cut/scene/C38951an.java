package com.p280ss.android.ugc.aweme.shortvideo.cut.scene;

import android.app.Activity;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0069x;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import android.support.p022v4.util.C0902i;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import bolts.C1592h;
import com.C1642a;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
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
import com.bytedance.scene.group.C12604b;
import com.google.common.base.C17454q;
import com.p280ss.android.ugc.asve.p754b.C15389d;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.ShareContext;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.shortvideo.AVMusic;
import com.p280ss.android.ugc.aweme.shortvideo.C39810eq;
import com.p280ss.android.ugc.aweme.shortvideo.ImportVideoInfo;
import com.p280ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.p280ss.android.ugc.aweme.shortvideo.cut.C38747c;
import com.p280ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.p280ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C39193g;
import com.p280ss.android.ugc.aweme.shortvideo.cut.videoedit.C39252c;
import com.p280ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.p280ss.android.ugc.aweme.shortvideo.cut.videoeditv2.VEVideoEditViewV2;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41530am;
import com.p280ss.android.ugc.aweme.shortvideo.view.C41654d;
import com.p280ss.android.ugc.aweme.themechange.base.C42111b;
import com.p280ss.android.ugc.aweme.utils.C42951au;
import com.p280ss.android.ugc.gamora.jedi.C44396a;
import com.p280ss.android.ugc.gamora.jedi.C44396a.C44397a;
import com.p280ss.android.ugc.gamora.jedi.C44403b;
import com.p280ss.android.ugc.gamora.jedi.C44413i;
import com.p280ss.android.ugc.gamora.p1486a.C36113b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7581n;
import kotlin.TypeCastException;
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

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.an */
public final class C38951an extends C12604b implements C38931ag, C39052bl, C44396a {

    /* renamed from: j */
    static final /* synthetic */ C7595j[] f101151j = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C38951an.class), "previewScene", "getPreviewScene()Lcom/ss/android/ugc/aweme/shortvideo/cut/scene/CutVideoPreviewScene;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C38951an.class), "titleBarScene", "getTitleBarScene()Lcom/ss/android/ugc/aweme/shortvideo/cut/scene/CutVideoTitleBarScene;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C38951an.class), "singleBottomScene", "getSingleBottomScene()Lcom/ss/android/ugc/aweme/shortvideo/cut/scene/CutVideoSingleBottomScene;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C38951an.class), "multiBottomScene", "getMultiBottomScene()Lcom/ss/android/ugc/aweme/shortvideo/cut/scene/CutVideoMultiBottomScene;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C38951an.class), "speedScene", "getSpeedScene()Lcom/ss/android/ugc/aweme/shortvideo/cut/scene/CutVideoSpeedScene;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C38951an.class), "presenter", "getPresenter()Lcom/ss/android/ugc/aweme/shortvideo/cut/scene/CutVideoPresenter;"))};

    /* renamed from: A */
    private long f101152A = C39810eq.m127460a();

    /* renamed from: B */
    private final int f101153B = 3600000;

    /* renamed from: k */
    public CutVideoViewModel f101154k;

    /* renamed from: l */
    public VideoEditViewModel f101155l;

    /* renamed from: m */
    public CutVideoTitleBarViewModel f101156m;

    /* renamed from: n */
    public long f101157n;

    /* renamed from: o */
    public final ArrayList<ImportVideoInfo> f101158o = new ArrayList<>();

    /* renamed from: p */
    private final C7541d f101159p = C7546e.m23569a(new C38959h(this));

    /* renamed from: q */
    private final C7541d f101160q = C7546e.m23569a(new C38962k(this));

    /* renamed from: r */
    private final C7541d f101161r = C7546e.m23569a(new C38960i(this));

    /* renamed from: s */
    private final C7541d f101162s = C7546e.m23569a(new C38957f(this));

    /* renamed from: t */
    private final C7541d f101163t = C7546e.m23569a(new C38961j(this));

    /* renamed from: u */
    private final C7541d f101164u = C7546e.m23569a(C38958g.f101179a);

    /* renamed from: v */
    private CutMultiVideoViewModel f101165v;

    /* renamed from: w */
    private CutVideoBottomBarViewModel f101166w;

    /* renamed from: x */
    private CutVideoListViewModel f101167x;

    /* renamed from: y */
    private CutVideoEditViewModel f101168y;

    /* renamed from: z */
    private CutVideoPreviewViewModel f101169z;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.an$a */
    public static final class C38952a implements C38747c {

        /* renamed from: a */
        public C41654d f101170a;

        /* renamed from: b */
        public boolean f101171b;

        /* renamed from: c */
        final /* synthetic */ C38951an f101172c;

        /* renamed from: d */
        final /* synthetic */ C17454q f101173d;

        public final void onCompileDone() {
            C38951an.m124379c(this.f101172c).mo97152d(true);
            C42951au.m136343b(this.f101170a);
            this.f101172c.mo97245a(this.f101171b);
            C17454q qVar = this.f101173d;
            C7573i.m23582a((Object) qVar, "stopwatch");
            if (qVar.f48412a) {
                this.f101173d.mo44943d();
                Locale locale = Locale.US;
                C7573i.m23582a((Object) locale, "Locale.US");
                String a = C1642a.m8035a(locale, "%d", Arrays.copyOf(new Object[]{Long.valueOf(this.f101173d.mo44941a(TimeUnit.MILLISECONDS))}, 1));
                C7573i.m23582a((Object) a, "java.lang.String.format(locale, format, *args)");
                C6907h.m21524a("import_transcoding_end", (Map) C22984d.m75611a().mo59970a("status", 1).mo59973a("duration", a).f60753a);
            }
        }

        public final void onCompileProgress(float f) {
            C41654d dVar = this.f101170a;
            if (dVar != null) {
                if (!dVar.isShowing()) {
                    dVar = null;
                }
                if (dVar != null) {
                    dVar.setProgress((int) (f * 100.0f));
                }
            }
        }

        /* renamed from: a */
        public final void mo96718a(boolean z) {
            this.f101171b = z;
            if (!z) {
                this.f101170a = C41654d.m132586b(this.f101172c.f33526d_, this.f101172c.mo31017x().getString(R.string.dtv));
                C41654d dVar = this.f101170a;
                if (dVar != null) {
                    dVar.setIndeterminate(false);
                }
            }
        }

        C38952a(C38951an anVar, C17454q qVar) {
            this.f101172c = anVar;
            this.f101173d = qVar;
        }

        public final void onCompileError(int i, int i2, float f, String str) {
            C38951an.m124379c(this.f101172c).mo97152d(true);
            C42951au.m136343b(this.f101170a);
            Context context = this.f101172c.f33526d_;
            StringBuilder sb = new StringBuilder("合成失败 ");
            sb.append(i);
            C10761a.m31403c(context, sb.toString()).mo25750a();
            C6907h.m21524a("import_transcoding_end", (Map) C22984d.m75611a().mo59970a("status", 0).f60753a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.an$b */
    static final class C38953b extends Lambda implements C7563m<C44396a, C7581n, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C38951an f101174a;

        C38953b(C38951an anVar) {
            this.f101174a = anVar;
            super(2);
        }

        /* renamed from: a */
        private void m124415a(C44396a aVar, C7581n nVar) {
            C7573i.m23587b(aVar, "$receiver");
            C7573i.m23587b(nVar, "it");
            this.f101174a.mo97237L();
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m124415a((C44396a) obj, (C7581n) obj2);
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.an$c */
    static final class C38954c extends Lambda implements C7563m<C44396a, C7581n, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C38951an f101175a;

        C38954c(C38951an anVar) {
            this.f101175a = anVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m124416a((C44396a) obj, (C7581n) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m124416a(C44396a aVar, C7581n nVar) {
            C7573i.m23587b(aVar, "$receiver");
            C7573i.m23587b(nVar, "it");
            if (C38951an.m124371a(this.f101175a).mo97157i()) {
                this.f101175a.mo97236J().mo97176S();
            } else {
                C39193g.f101577a.mo97489d(C38951an.m124378b(this.f101175a).mo97721n());
            }
            C38951an.m124379c(this.f101175a).mo97152d(false);
            this.f101175a.f101157n = System.currentTimeMillis();
            if (this.f101175a.mo97241P() instanceof VEVideoEditViewV2) {
                C38916af K = this.f101175a.mo96987K();
                C0902i playBoundary = this.f101175a.mo97241P().getPlayBoundary();
                C7573i.m23582a((Object) playBoundary, "getVideoEditView().playBoundary");
                K.mo97210a(playBoundary, this.f101175a.mo97241P().getMaxCutDuration());
            }
            this.f101175a.mo97242Q();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.an$d */
    static final class C38955d<T> implements C0053p<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C38951an f101176a;

        C38955d(C38951an anVar) {
            this.f101176a = anVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Boolean bool) {
            if (bool != null) {
                C38951an anVar = this.f101176a;
                C7573i.m23582a((Object) bool, "it");
                anVar.mo97246b(bool.booleanValue());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.an$e */
    static final class C38956e<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ C38951an f101177a;

        C38956e(C38951an anVar) {
            this.f101177a = anVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C7581n call() {
            List<VideoSegment> n = C38951an.m124378b(this.f101177a).mo97721n();
            if (n == null) {
                return null;
            }
            for (VideoSegment videoSegment : n) {
                ArrayList<ImportVideoInfo> arrayList = this.f101177a.f101158o;
                int i = videoSegment.f100765g;
                int i2 = videoSegment.f100766h;
                C7573i.m23582a((Object) videoSegment, "segment");
                ImportVideoInfo importVideoInfo = new ImportVideoInfo(i, i2, videoSegment.mo96907f(), videoSegment.mo96905e(), videoSegment.mo96908g(), videoSegment.f100761c, videoSegment.mo96910i() - videoSegment.mo96909h());
                arrayList.add(importVideoInfo);
            }
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.an$f */
    static final class C38957f extends Lambda implements C7561a<C38893ab> {

        /* renamed from: a */
        final /* synthetic */ C38951an f101178a;

        C38957f(C38951an anVar) {
            this.f101178a = anVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C38893ab invoke() {
            C38893ab abVar = new C38893ab();
            abVar.mo97185a(this.f101178a.mo96987K());
            abVar.mo97186a((C39052bl) this.f101178a);
            this.f101178a.mo30925a((int) R.id.a5t, (C12629j) abVar, "CutVideoMultiBottomScene");
            return abVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.an$g */
    static final class C38958g extends Lambda implements C7561a<C38916af> {

        /* renamed from: a */
        public static final C38958g f101179a = new C38958g();

        C38958g() {
            super(0);
        }

        /* renamed from: a */
        private static C38916af m124420a() {
            return new C38916af();
        }

        public final /* synthetic */ Object invoke() {
            return m124420a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.an$h */
    static final class C38959h extends Lambda implements C7561a<C38932ah> {

        /* renamed from: a */
        final /* synthetic */ C38951an f101180a;

        C38959h(C38951an anVar) {
            this.f101180a = anVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C38932ah invoke() {
            C38932ah ahVar = new C38932ah();
            ahVar.mo97231a(this.f101180a.mo96987K());
            this.f101180a.mo30925a((int) R.id.a5t, (C12629j) ahVar, "CutVideoPreviewScene");
            return ahVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.an$i */
    static final class C38960i extends Lambda implements C7561a<C38965aq> {

        /* renamed from: a */
        final /* synthetic */ C38951an f101181a;

        C38960i(C38951an anVar) {
            this.f101181a = anVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C38965aq invoke() {
            C38965aq aqVar = new C38965aq();
            aqVar.mo97252a(this.f101181a.mo96987K());
            aqVar.mo97253a((C39052bl) this.f101181a);
            this.f101181a.mo30925a((int) R.id.a5t, (C12629j) aqVar, "CutVideoSingleBottomScene");
            return aqVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.an$j */
    static final class C38961j extends Lambda implements C7561a<C38972as> {

        /* renamed from: a */
        final /* synthetic */ C38951an f101182a;

        C38961j(C38951an anVar) {
            this.f101182a = anVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C38972as invoke() {
            C38972as asVar = new C38972as();
            asVar.mo97254a((C39052bl) this.f101182a);
            this.f101182a.mo30925a((int) R.id.a5t, (C12629j) asVar, "CutVideoSpeedScene");
            return asVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.an$k */
    static final class C38962k extends Lambda implements C7561a<C39037bf> {

        /* renamed from: a */
        final /* synthetic */ C38951an f101183a;

        C38962k(C38951an anVar) {
            this.f101183a = anVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C39037bf invoke() {
            C39037bf bfVar = new C39037bf();
            this.f101183a.mo30925a((int) R.id.a5t, (C12629j) bfVar, "CutVideoTitleBarScene");
            return bfVar;
        }
    }

    /* renamed from: R */
    private final C38932ah m124362R() {
        return (C38932ah) this.f101159p.getValue();
    }

    /* renamed from: S */
    private final C39037bf m124363S() {
        return (C39037bf) this.f101160q.getValue();
    }

    /* renamed from: T */
    private final C38965aq m124364T() {
        return (C38965aq) this.f101161r.getValue();
    }

    /* renamed from: U */
    private final C38972as m124365U() {
        return (C38972as) this.f101163t.getValue();
    }

    /* renamed from: J */
    public final C38893ab mo97236J() {
        return (C38893ab) this.f101162s.getValue();
    }

    /* renamed from: K */
    public final C38916af mo96987K() {
        return (C38916af) this.f101164u.getValue();
    }

    /* renamed from: a */
    public final void mo31001a(View view, Bundle bundle) {
        C7573i.m23587b(view, "view");
        super.mo31001a(view, bundle);
        Activity activity = this.f33526d_;
        if (activity != null) {
            JediViewModel a = C36113b.m116288a((FragmentActivity) activity).mo91871a(CutVideoViewModel.class);
            C7573i.m23582a((Object) a, "JediViewModelProviders.o…deoViewModel::class.java)");
            this.f101154k = (CutVideoViewModel) a;
            mo30945d((C12629j) m124362R());
            mo30945d((C12629j) m124363S());
            CutVideoViewModel cutVideoViewModel = this.f101154k;
            if (cutVideoViewModel == null) {
                C7573i.m23583a("cutVideoViewModel");
            }
            if (cutVideoViewModel.mo97157i()) {
                m124367W();
            } else {
                m124366V();
            }
        } else {
            throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
    }

    /* renamed from: a */
    public final void mo97225a(C15389d dVar) {
        CutVideoViewModel cutVideoViewModel = this.f101154k;
        if (cutVideoViewModel == null) {
            C7573i.m23583a("cutVideoViewModel");
        }
        if (cutVideoViewModel.mo97157i()) {
            mo97236J().mo97184a(dVar);
        }
    }

    /* renamed from: a */
    public final void mo97244a(C39053bm bmVar) {
        C7573i.m23587b(bmVar, "controller");
        m124362R().f101117i = bmVar;
    }

    /* renamed from: a */
    public final void mo97243a(int i, int i2, Intent intent) {
        CutVideoViewModel cutVideoViewModel = this.f101154k;
        if (cutVideoViewModel == null) {
            C7573i.m23583a("cutVideoViewModel");
        }
        if (cutVideoViewModel.mo97157i()) {
            mo97236J().mo97183a(i, i2, intent);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:213:0x0476, code lost:
        if (r7 == null) goto L_0x0478;
     */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x046e  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x0494  */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x049f  */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x04e2  */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x04f4  */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x0506  */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x051a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo97245a(boolean r17) {
        /*
            r16 = this;
            r0 = r16
            com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoViewModel r1 = r0.f101154k
            if (r1 != 0) goto L_0x000b
            java.lang.String r2 = "cutVideoViewModel"
            kotlin.jvm.internal.C7573i.m23583a(r2)
        L_0x000b:
            com.ss.android.ugc.aweme.shortvideo.cut.scene.aa r1 = r1.mo97156h()
            boolean r2 = r1.f101009m
            if (r2 == 0) goto L_0x0017
            r16.m124376ae()
            return
        L_0x0017:
            com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoViewModel r2 = r0.f101154k
            if (r2 != 0) goto L_0x0020
            java.lang.String r3 = "cutVideoViewModel"
            kotlin.jvm.internal.C7573i.m23583a(r3)
        L_0x0020:
            com.ss.android.ugc.aweme.shortvideo.cut.scene.aa r2 = r2.mo97156h()
            com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace r4 = r2.f101006j
            android.app.Activity r2 = r16.mo31015v()
            java.lang.String r3 = "requireActivity()"
            kotlin.jvm.internal.C7573i.m23582a(r2, r3)
            android.content.Intent r2 = r2.getIntent()
            r9 = 0
            if (r2 == 0) goto L_0x003d
            java.lang.String r3 = "from_music_detail"
            boolean r3 = r2.getBooleanExtra(r3, r9)
            goto L_0x003e
        L_0x003d:
            r3 = 0
        L_0x003e:
            r10 = 0
            if (r3 != 0) goto L_0x004d
            if (r4 == 0) goto L_0x0046
            r4.mo96318f()
        L_0x0046:
            com.ss.android.ugc.aweme.shortvideo.dw r3 = com.p280ss.android.ugc.aweme.shortvideo.C39360dw.m125725a()
            r3.mo97928a(r10)
        L_0x004d:
            r16.m124373ab()
            if (r2 == 0) goto L_0x005a
            java.lang.String r3 = "shoot_way"
            java.lang.String r3 = r2.getStringExtra(r3)
            r11 = r3
            goto L_0x005b
        L_0x005a:
            r11 = r10
        L_0x005b:
            if (r2 == 0) goto L_0x0065
            java.lang.String r3 = "creation_id"
            java.lang.String r3 = r2.getStringExtra(r3)
            r12 = r3
            goto L_0x0066
        L_0x0065:
            r12 = r10
        L_0x0066:
            if (r2 == 0) goto L_0x0070
            java.lang.String r3 = "cc_vid"
            java.lang.String r3 = r2.getStringExtra(r3)
            r13 = r3
            goto L_0x0071
        L_0x0070:
            r13 = r10
        L_0x0071:
            if (r2 == 0) goto L_0x007b
            java.lang.String r3 = "task_id"
            java.lang.String r3 = r2.getStringExtra(r3)
            r14 = r3
            goto L_0x007c
        L_0x007b:
            r14 = r10
        L_0x007c:
            if (r2 == 0) goto L_0x0086
            java.lang.String r3 = "challenge_names"
            java.util.ArrayList r3 = r2.getStringArrayListExtra(r3)
            r15 = r3
            goto L_0x0087
        L_0x0086:
            r15 = r10
        L_0x0087:
            boolean r3 = r16.m124374ac()
            if (r3 == 0) goto L_0x00a5
            com.ss.android.ugc.aweme.shortvideo.AVMusic r3 = r16.m124375ad()
            java.lang.String r3 = com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C39182e.m125100c(r3)
            boolean r5 = com.p280ss.android.ugc.aweme.video.C7276d.m22812b(r3)
            if (r5 == 0) goto L_0x00a5
            if (r4 == 0) goto L_0x00a5
            java.io.File r5 = new java.io.File
            r5.<init>(r3)
            r4.mo96312a(r5)
        L_0x00a5:
            com.ss.android.ugc.aweme.shortvideo.cut.scene.af r3 = r16.mo96987K()
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.c r5 = r16.mo97241P()
            android.support.v4.util.i r6 = r5.getPlayBoundary()
            java.lang.String r5 = "getVideoEditView().playBoundary"
            kotlin.jvm.internal.C7573i.m23582a(r6, r5)
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.c r5 = r16.mo97241P()
            long r7 = r5.getMaxCutDuration()
            r5 = r17
            android.content.Intent r3 = r3.mo97203a(r4, r5, r6, r7)
            java.lang.String r4 = "extra_start_enter_edit_page"
            long r5 = r0.f101157n
            r3.putExtra(r4, r5)
            java.lang.String r4 = "extra_import_compile_cost_time"
            long r5 = java.lang.System.currentTimeMillis()
            long r7 = r0.f101157n
            long r5 = r5 - r7
            r3.putExtra(r4, r5)
            java.lang.String r4 = "send_to_user_head"
            if (r2 == 0) goto L_0x00e2
            java.lang.String r5 = "send_to_user_head"
            java.io.Serializable r5 = r2.getSerializableExtra(r5)
            goto L_0x00e3
        L_0x00e2:
            r5 = r10
        L_0x00e3:
            r3.putExtra(r4, r5)
            java.lang.String r4 = "extra_is_change_speed"
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel r5 = r0.f101155l
            if (r5 != 0) goto L_0x00f1
            java.lang.String r6 = "videoEditViewModel"
            kotlin.jvm.internal.C7573i.m23583a(r6)
        L_0x00f1:
            boolean r5 = r5.mo97723p()
            r3.putExtra(r4, r5)
            java.lang.String r4 = "enter_from"
            if (r2 == 0) goto L_0x0103
            java.lang.String r5 = "enter_from"
            java.lang.String r5 = r2.getStringExtra(r5)
            goto L_0x0104
        L_0x0103:
            r5 = r10
        L_0x0104:
            r3.putExtra(r4, r5)
            if (r2 == 0) goto L_0x0110
            java.lang.String r4 = "enter_from"
            java.lang.String r4 = r2.getStringExtra(r4)
            goto L_0x0111
        L_0x0110:
            r4 = r10
        L_0x0111:
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            java.lang.String r5 = "douplus"
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r4 = android.text.TextUtils.equals(r4, r5)
            if (r4 == 0) goto L_0x012c
            java.lang.String r4 = "extra_mention_user_model"
            if (r2 == 0) goto L_0x0128
            java.lang.String r5 = "extra_mention_user_model"
            java.io.Serializable r5 = r2.getSerializableExtra(r5)
            goto L_0x0129
        L_0x0128:
            r5 = r10
        L_0x0129:
            r3.putExtra(r4, r5)
        L_0x012c:
            java.lang.String r4 = "dir"
            java.lang.String r5 = com.p280ss.android.ugc.aweme.shortvideo.C39810eq.f103468d
            r3.putExtra(r4, r5)
            java.lang.String r4 = "shoot_way"
            r3.putExtra(r4, r11)
            java.lang.String r4 = "task_id"
            r3.putExtra(r4, r14)
            java.lang.String r4 = "content_source"
            java.lang.String r5 = "upload"
            r3.putExtra(r4, r5)
            java.lang.String r4 = "content_type"
            boolean r5 = r16.m124374ac()
            if (r5 == 0) goto L_0x014f
            java.lang.String r5 = "sound_sync"
            goto L_0x0151
        L_0x014f:
            java.lang.String r5 = "video"
        L_0x0151:
            r3.putExtra(r4, r5)
            java.lang.String r4 = "enable_music_path_check"
            r3.putExtra(r4, r9)
            java.lang.String r4 = "fromMultiCut"
            com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoViewModel r5 = r0.f101154k
            if (r5 != 0) goto L_0x0164
            java.lang.String r6 = "cutVideoViewModel"
            kotlin.jvm.internal.C7573i.m23583a(r6)
        L_0x0164:
            boolean r5 = r5.mo97157i()
            r3.putExtra(r4, r5)
            java.lang.String r4 = "fromCut"
            r5 = 1
            r3.putExtra(r4, r5)
            java.lang.String r4 = "origin"
            r3.putExtra(r4, r9)
            java.lang.String r4 = "creation_id"
            r3.putExtra(r4, r12)
            java.lang.String r4 = "cc_vid"
            r3.putExtra(r4, r13)
            java.lang.String r4 = "poi_struct_in_tools_line"
            if (r2 == 0) goto L_0x018b
            java.lang.String r6 = "poi_struct_in_tools_line"
            java.lang.String r6 = r2.getStringExtra(r6)
            goto L_0x018c
        L_0x018b:
            r6 = r10
        L_0x018c:
            r3.putExtra(r4, r6)
            java.lang.String r4 = "back_to_main_after_publish"
            com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoViewModel r6 = r0.f101154k
            if (r6 != 0) goto L_0x019a
            java.lang.String r7 = "cutVideoViewModel"
            kotlin.jvm.internal.C7573i.m23583a(r7)
        L_0x019a:
            boolean r6 = r6.mo97159k()
            r3.putExtra(r4, r6)
            com.ss.android.ugc.aweme.shortvideo.AVChallenge r4 = r1.f101001e
            if (r4 == 0) goto L_0x01bb
            java.lang.String r6 = "challenge"
            java.util.List r4 = kotlin.collections.C7525m.m23457a(r4)
            if (r4 == 0) goto L_0x01b3
            java.io.Serializable r4 = (java.io.Serializable) r4
            r3.putExtra(r6, r4)
            goto L_0x01bb
        L_0x01b3:
            kotlin.TypeCastException r1 = new kotlin.TypeCastException
            java.lang.String r2 = "null cannot be cast to non-null type java.io.Serializable"
            r1.<init>(r2)
            throw r1
        L_0x01bb:
            java.lang.String r4 = "enter_record_from_other_platform"
            com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoViewModel r6 = r0.f101154k
            if (r6 != 0) goto L_0x01c6
            java.lang.String r7 = "cutVideoViewModel"
            kotlin.jvm.internal.C7573i.m23583a(r7)
        L_0x01c6:
            boolean r6 = r6.mo97160l()
            r3.putExtra(r4, r6)
            java.lang.String r4 = "edit_publish_session_end_together"
            if (r2 == 0) goto L_0x01dc
            java.lang.String r6 = "edit_publish_session_end_together"
            boolean r6 = r2.getBooleanExtra(r6, r9)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            goto L_0x01dd
        L_0x01dc:
            r6 = r10
        L_0x01dd:
            java.io.Serializable r6 = (java.io.Serializable) r6
            r3.putExtra(r4, r6)
            java.lang.String r4 = "upload_video_type"
            com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoViewModel r6 = r0.f101154k
            if (r6 != 0) goto L_0x01ed
            java.lang.String r7 = "cutVideoViewModel"
            kotlin.jvm.internal.C7573i.m23583a(r7)
        L_0x01ed:
            boolean r6 = r6.mo97157i()
            r3.putExtra(r4, r6)
            java.lang.String r4 = "micro_app_id"
            java.lang.String r6 = r1.f101002f
            r3.putExtra(r4, r6)
            java.lang.String r4 = "micro_app_info"
            com.ss.android.ugc.aweme.shortvideo.edit.MicroAppModel r6 = r1.f101003g
            java.io.Serializable r6 = (java.io.Serializable) r6
            r3.putExtra(r4, r6)
            java.lang.String r4 = "av_et_parameter"
            if (r2 == 0) goto L_0x020f
            java.lang.String r6 = "av_et_parameter"
            java.io.Serializable r6 = r2.getSerializableExtra(r6)
            goto L_0x0210
        L_0x020f:
            r6 = r10
        L_0x0210:
            r3.putExtra(r4, r6)
            java.lang.String r4 = "shoot_mode"
            r6 = -1
            if (r2 == 0) goto L_0x0223
            java.lang.String r7 = "shoot_mode"
            int r7 = r2.getIntExtra(r7, r6)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            goto L_0x0224
        L_0x0223:
            r7 = r10
        L_0x0224:
            java.io.Serializable r7 = (java.io.Serializable) r7
            r3.putExtra(r4, r7)
            java.lang.String r4 = "story_mediaType"
            r3.putExtra(r4, r5)
            java.lang.String r4 = "extra_share_context"
            if (r2 == 0) goto L_0x0239
            java.lang.String r7 = "extra_share_context"
            java.io.Serializable r7 = r2.getSerializableExtra(r7)
            goto L_0x023a
        L_0x0239:
            r7 = r10
        L_0x023a:
            r3.putExtra(r4, r7)
            java.lang.String r4 = "extra_share_app_name"
            if (r2 == 0) goto L_0x0248
            java.lang.String r7 = "extra_share_app_name"
            java.lang.String r7 = r2.getStringExtra(r7)
            goto L_0x0249
        L_0x0248:
            r7 = r10
        L_0x0249:
            r3.putExtra(r4, r7)
            java.util.ArrayList<com.ss.android.ugc.aweme.shortvideo.ImportVideoInfo> r4 = r0.f101158o
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r4 = r4.isEmpty()
            r4 = r4 ^ r5
            if (r4 == 0) goto L_0x025e
            java.lang.String r4 = "extra_import_video_info_list"
            java.util.ArrayList<com.ss.android.ugc.aweme.shortvideo.ImportVideoInfo> r7 = r0.f101158o
            r3.putParcelableArrayListExtra(r4, r7)
        L_0x025e:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            if (r15 == 0) goto L_0x0295
            r7 = r15
            java.util.Collection r7 = (java.util.Collection) r7
            boolean r7 = com.bytedance.common.utility.collection.C6307b.m19566a(r7)
            if (r7 != 0) goto L_0x0295
            java.util.Iterator r7 = r15.iterator()
        L_0x0272:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0295
            java.lang.Object r8 = r7.next()
            java.lang.String r8 = (java.lang.String) r8
            r11 = r8
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11
            boolean r11 = android.text.TextUtils.isEmpty(r11)
            if (r11 != 0) goto L_0x0272
            java.lang.String r11 = "#"
            r4.append(r11)
            r4.append(r8)
            java.lang.String r8 = " "
            r4.append(r8)
            goto L_0x0272
        L_0x0295:
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel r7 = r0.f101155l
            if (r7 != 0) goto L_0x029e
            java.lang.String r8 = "videoEditViewModel"
            kotlin.jvm.internal.C7573i.m23583a(r8)
        L_0x029e:
            java.util.List r7 = r7.mo97721n()
            java.lang.String r8 = "videoEditViewModel.originVideoList"
            kotlin.jvm.internal.C7573i.m23582a(r7, r8)
            java.util.Collection r7 = (java.util.Collection) r7
            boolean r7 = r7.isEmpty()
            r7 = r7 ^ r5
            if (r7 == 0) goto L_0x02f4
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel r7 = r0.f101155l
            if (r7 != 0) goto L_0x02b9
            java.lang.String r8 = "videoEditViewModel"
            kotlin.jvm.internal.C7573i.m23583a(r8)
        L_0x02b9:
            java.util.List r7 = r7.mo97721n()
            if (r7 == 0) goto L_0x02e0
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
            r8 = 0
        L_0x02c6:
            boolean r11 = r7.hasNext()
            if (r11 == 0) goto L_0x02e1
            java.lang.Object r11 = r7.next()
            com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment r11 = (com.p280ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment) r11
            java.lang.String r13 = "segment"
            kotlin.jvm.internal.C7573i.m23582a(r11, r13)
            boolean r11 = r11.mo96899a()
            if (r11 == 0) goto L_0x02c6
            int r8 = r8 + 1
            goto L_0x02c6
        L_0x02e0:
            r8 = 0
        L_0x02e1:
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel r7 = r0.f101155l
            if (r7 != 0) goto L_0x02ea
            java.lang.String r11 = "videoEditViewModel"
            kotlin.jvm.internal.C7573i.m23583a(r11)
        L_0x02ea:
            java.util.List r7 = r7.mo97721n()
            int r7 = r7.size()
            int r7 = r7 - r8
            goto L_0x02f6
        L_0x02f4:
            r7 = 0
            r8 = 0
        L_0x02f6:
            java.lang.String r11 = "extra_photo_count"
            r3.putExtra(r11, r8)
            java.lang.String r8 = "extra_video_count"
            r3.putExtra(r8, r7)
            com.ss.android.ugc.aweme.shortvideo.edit.MicroAppModel r7 = r1.f101003g
            if (r7 == 0) goto L_0x034f
            java.lang.String r8 = r7.getExtra()
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            boolean r8 = android.text.TextUtils.isEmpty(r8)
            r8 = r8 ^ r5
            if (r8 == 0) goto L_0x0312
            goto L_0x0313
        L_0x0312:
            r7 = r10
        L_0x0313:
            if (r7 == 0) goto L_0x034f
            com.google.gson.e r8 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93239b
            java.lang.String r7 = r7.getExtra()
            java.lang.Class<com.tt.appbrandimpl.d> r11 = com.p1843tt.appbrandimpl.C46580d.class
            java.lang.Object r7 = r8.mo15974a(r7, r11)
            com.tt.appbrandimpl.d r7 = (com.p1843tt.appbrandimpl.C46580d) r7
            if (r7 == 0) goto L_0x034f
            java.util.List<java.lang.String> r8 = r7.f120064a
            java.util.Collection r8 = (java.util.Collection) r8
            boolean r8 = com.bytedance.common.utility.collection.C6307b.m19566a(r8)
            if (r8 != 0) goto L_0x034f
            java.util.List<java.lang.String> r7 = r7.f120064a
            java.util.Iterator r7 = r7.iterator()
        L_0x0335:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x034f
            java.lang.Object r8 = r7.next()
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r11 = "#"
            r4.append(r11)
            r4.append(r8)
            java.lang.String r8 = " "
            r4.append(r8)
            goto L_0x0335
        L_0x034f:
            java.lang.String r7 = r4.toString()
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 != 0) goto L_0x0364
            java.lang.String r7 = "video_title"
            java.lang.String r4 = r4.toString()
            r3.putExtra(r7, r4)
        L_0x0364:
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel r4 = r0.f101155l
            if (r4 != 0) goto L_0x036d
            java.lang.String r7 = "videoEditViewModel"
            kotlin.jvm.internal.C7573i.m23583a(r7)
        L_0x036d:
            java.util.List r4 = r4.mo97720m()
            if (r4 == 0) goto L_0x03cd
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.util.Iterator r4 = r4.iterator()
        L_0x037c:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L_0x039d
            java.lang.Object r8 = r4.next()
            com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment r8 = (com.p280ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment) r8
            java.lang.String r11 = r8.f100773o
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11
            boolean r11 = android.text.TextUtils.isEmpty(r11)
            if (r11 != 0) goto L_0x037c
            java.lang.String r8 = r8.f100773o
            r7.append(r8)
            java.lang.String r8 = ","
            r7.append(r8)
            goto L_0x037c
        L_0x039d:
            java.lang.String r4 = r7.toString()
            java.lang.String r7 = "sb.toString()"
            kotlin.jvm.internal.C7573i.m23582a(r4, r7)
            r7 = r4
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 != 0) goto L_0x03cd
            java.lang.String r7 = "md5"
            int r8 = r4.length()
            int r8 = r8 - r5
            if (r4 == 0) goto L_0x03c5
            java.lang.String r4 = r4.substring(r9, r8)
            java.lang.String r8 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
            kotlin.jvm.internal.C7573i.m23582a(r4, r8)
            r3.putExtra(r7, r4)
            goto L_0x03cd
        L_0x03c5:
            kotlin.TypeCastException r1 = new kotlin.TypeCastException
            java.lang.String r2 = "null cannot be cast to non-null type java.lang.String"
            r1.<init>(r2)
            throw r1
        L_0x03cd:
            com.ss.android.ugc.aweme.tools.extension.Scene r4 = com.p280ss.android.ugc.aweme.tools.extension.Scene.CUT
            com.ss.android.ugc.aweme.tools.extension.Scene r7 = com.p280ss.android.ugc.aweme.tools.extension.Scene.EDIT
            com.p280ss.android.ugc.aweme.tools.extension.C42311e.m134567a(r2, r3, r4, r7)
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel r4 = r0.f101155l
            if (r4 != 0) goto L_0x03dd
            java.lang.String r7 = "videoEditViewModel"
            kotlin.jvm.internal.C7573i.m23583a(r7)
        L_0x03dd:
            java.util.List r4 = r4.mo97720m()
            if (r4 == 0) goto L_0x043d
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.util.Iterator r4 = r4.iterator()
        L_0x03ec:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L_0x040d
            java.lang.Object r8 = r4.next()
            com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment r8 = (com.p280ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment) r8
            java.lang.String r11 = r8.f100772n
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11
            boolean r11 = android.text.TextUtils.isEmpty(r11)
            if (r11 != 0) goto L_0x03ec
            java.lang.String r8 = r8.f100772n
            r7.append(r8)
            java.lang.String r8 = ";"
            r7.append(r8)
            goto L_0x03ec
        L_0x040d:
            java.lang.String r4 = r7.toString()
            java.lang.String r7 = "sb.toString()"
            kotlin.jvm.internal.C7573i.m23582a(r4, r7)
            r7 = r4
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 != 0) goto L_0x043d
            java.lang.String r7 = "poi_data_in_tools_line"
            int r8 = r4.length()
            int r8 = r8 - r5
            if (r4 == 0) goto L_0x0435
            java.lang.String r4 = r4.substring(r9, r8)
            java.lang.String r8 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
            kotlin.jvm.internal.C7573i.m23582a(r4, r8)
            r3.putExtra(r7, r4)
            goto L_0x043d
        L_0x0435:
            kotlin.TypeCastException r1 = new kotlin.TypeCastException
            java.lang.String r2 = "null cannot be cast to non-null type java.lang.String"
            r1.<init>(r2)
            throw r1
        L_0x043d:
            boolean r4 = r16.m124374ac()
            if (r4 == 0) goto L_0x044e
            com.ss.android.ugc.aweme.shortvideo.dw r4 = com.p280ss.android.ugc.aweme.shortvideo.C39360dw.m125725a()
            com.ss.android.ugc.aweme.shortvideo.AVMusic r7 = r16.m124375ad()
            r4.mo97928a(r7)
        L_0x044e:
            java.lang.String r4 = "extra_edit_preview_info"
            android.os.Parcelable r4 = r3.getParcelableExtra(r4)
            com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo r4 = (com.p280ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo) r4
            if (r4 == 0) goto L_0x046b
            java.util.List r4 = r4.getVideoList()
            if (r4 == 0) goto L_0x046b
            java.lang.Object r4 = kotlin.collections.C7525m.m23513g(r4)
            com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment r4 = (com.p280ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment) r4
            if (r4 == 0) goto L_0x046b
            java.lang.String r4 = r4.getVideoPath()
            goto L_0x046c
        L_0x046b:
            r4 = r10
        L_0x046c:
            if (r4 == 0) goto L_0x0487
            com.ss.android.ugc.aweme.shortvideo.edit.MicroAppModel r7 = r1.f101003g
            if (r7 == 0) goto L_0x0478
            java.lang.String r7 = r7.getAppId()
            if (r7 != 0) goto L_0x047a
        L_0x0478:
            java.lang.String r7 = r1.f101002f
        L_0x047a:
            r1.f101002f = r7
            com.ss.android.ugc.aweme.toolsport.IAVMusicService r7 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93246i
            com.ss.android.ugc.aweme.toolsport.IAVMusicService$b r7 = r7.mo103867e()
            java.lang.String r1 = r1.f101002f
            r7.mo103923a(r4, r12, r1)
        L_0x0487:
            java.lang.String r1 = "extra_stickpoint_mode"
            boolean r4 = r16.m124374ac()
            r3.putExtra(r1, r4)
            com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoViewModel r1 = r0.f101154k
            if (r1 != 0) goto L_0x0499
            java.lang.String r4 = "cutVideoViewModel"
            kotlin.jvm.internal.C7573i.m23583a(r4)
        L_0x0499:
            boolean r1 = r1.mo97160l()
            if (r1 != 0) goto L_0x04e0
            if (r2 == 0) goto L_0x04a8
            java.lang.String r1 = "enter_from"
            java.lang.String r1 = r2.getStringExtra(r1)
            goto L_0x04a9
        L_0x04a8:
            r1 = r10
        L_0x04a9:
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.String r4 = "from_chat"
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r1 = android.text.TextUtils.equals(r1, r4)
            if (r1 == 0) goto L_0x04b6
            goto L_0x04e0
        L_0x04b6:
            java.lang.String r1 = "shoot_mode"
            int r1 = r3.getIntExtra(r1, r6)
            boolean r1 = com.p280ss.android.ugc.aweme.story.shootvideo.C42017d.m133561a(r1)
            if (r1 == 0) goto L_0x04d6
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.p280ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.services.IAVService> r2 = com.p280ss.android.ugc.aweme.services.IAVService.class
            java.lang.Object r1 = r1.getService(r2)
            com.ss.android.ugc.aweme.services.IAVService r1 = (com.p280ss.android.ugc.aweme.services.IAVService) r1
            android.app.Activity r2 = r16.mo31015v()
            r1.startStoryEditActivity(r2, r3)
            return
        L_0x04d6:
            android.app.Activity r1 = r16.mo31015v()
            android.content.Context r1 = (android.content.Context) r1
            com.p280ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity.m125843a(r1, r3, r5)
            return
        L_0x04e0:
            if (r2 == 0) goto L_0x04e8
            java.lang.String r1 = "enter_from"
            java.lang.String r10 = r2.getStringExtra(r1)
        L_0x04e8:
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10
            java.lang.String r1 = "from_chat"
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = android.text.TextUtils.equals(r10, r1)
            if (r1 == 0) goto L_0x04fa
            java.lang.String r1 = "extra_request_code"
            r2 = 4
            r3.putExtra(r1, r2)
        L_0x04fa:
            java.lang.String r1 = "shoot_mode"
            int r1 = r3.getIntExtra(r1, r6)
            boolean r1 = com.p280ss.android.ugc.aweme.story.shootvideo.C42017d.m133561a(r1)
            if (r1 == 0) goto L_0x051a
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.p280ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.services.IAVService> r2 = com.p280ss.android.ugc.aweme.services.IAVService.class
            java.lang.Object r1 = r1.getService(r2)
            com.ss.android.ugc.aweme.services.IAVService r1 = (com.p280ss.android.ugc.aweme.services.IAVService) r1
            android.app.Activity r2 = r16.mo31015v()
            r1.startStoryEditActivity(r2, r3)
            return
        L_0x051a:
            android.app.Activity r1 = r16.mo31015v()
            com.p280ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity.m125842a(r1, r3, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.cut.scene.C38951an.mo97245a(boolean):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: af */
    public C11585f mo29191e() {
        return C44397a.m140506c(this);
    }

    /* renamed from: b */
    public final C11669s<C11585f> mo29067b() {
        return C44397a.m140509d(this);
    }

    public final void bN_() {
        mo97241P().mo97635b();
    }

    /* renamed from: c */
    public final boolean mo29068c() {
        return C44397a.m140511e(this);
    }

    /* renamed from: d */
    public final C0043i mo29173d() {
        return C44397a.m140494a(this);
    }

    /* renamed from: aa */
    private final void m124372aa() {
        Activity activity = this.f33526d_;
        if (activity != null) {
            activity.finish();
        }
    }

    /* renamed from: ab */
    private final void m124373ab() {
        this.f101158o.clear();
        C1592h.m7853a((Callable<TResult>) new C38956e<TResult>(this));
    }

    /* renamed from: M */
    public final int mo97238M() {
        return m124362R().mo30922I();
    }

    /* renamed from: N */
    public final int mo97239N() {
        return m124362R().mo97230J();
    }

    /* renamed from: O */
    public final int mo97240O() {
        return m124362R().mo96987K();
    }

    public final void bK_() {
        Activity activity = this.f33526d_;
        if (activity != null) {
            activity.finish();
        }
    }

    /* renamed from: q */
    public final void mo31008q() {
        super.mo31008q();
        mo96987K().mo97220d();
    }

    /* renamed from: V */
    private final void m124366V() {
        mo30945d((C12629j) m124364T());
        mo30945d((C12629j) m124365U());
    }

    /* renamed from: Z */
    private final void m124370Z() {
        CutVideoViewModel cutVideoViewModel = this.f101154k;
        if (cutVideoViewModel == null) {
            C7573i.m23583a("cutVideoViewModel");
        }
        if (cutVideoViewModel.mo97157i()) {
            mo97236J().mo97174Q();
        } else {
            m124372aa();
        }
    }

    /* renamed from: ac */
    private final boolean m124374ac() {
        CutVideoViewModel cutVideoViewModel = this.f101154k;
        if (cutVideoViewModel == null) {
            C7573i.m23583a("cutVideoViewModel");
        }
        if (!cutVideoViewModel.mo97157i() || !mo97236J().mo97177T()) {
            return false;
        }
        return true;
    }

    /* renamed from: ad */
    private final AVMusic m124375ad() {
        CutVideoViewModel cutVideoViewModel = this.f101154k;
        if (cutVideoViewModel == null) {
            C7573i.m23583a("cutVideoViewModel");
        }
        if (!cutVideoViewModel.mo97157i()) {
            return null;
        }
        return mo97236J().mo97178U();
    }

    /* renamed from: a */
    public final C11648k mo29060a() {
        return C44397a.m140503b(this);
    }

    public final void bL_() {
        CutVideoViewModel cutVideoViewModel = this.f101154k;
        if (cutVideoViewModel == null) {
            C7573i.m23583a("cutVideoViewModel");
        }
        if (cutVideoViewModel.mo97157i()) {
            mo97236J().mo97173P();
        }
    }

    public final void bM_() {
        CutVideoViewModel cutVideoViewModel = this.f101154k;
        if (cutVideoViewModel == null) {
            C7573i.m23583a("cutVideoViewModel");
        }
        if (cutVideoViewModel.mo97157i()) {
            mo97236J().mo97182Y();
        } else {
            m124364T().mo97251N();
        }
    }

    /* renamed from: W */
    private final void m124367W() {
        mo30945d((C12629j) mo97236J());
        mo30945d((C12629j) m124365U());
        mo96987K().f101072e = C42111b.f109618a.mo103542a(true, false, false, false, false);
    }

    /* renamed from: L */
    public final void mo97237L() {
        CutVideoViewModel cutVideoViewModel = this.f101154k;
        if (cutVideoViewModel == null) {
            C7573i.m23583a("cutVideoViewModel");
        }
        ShareContext shareContext = cutVideoViewModel.mo97156h().f101007k;
        if (C35563c.f93259v.mo83150a(shareContext)) {
            C35563c.f93259v.mo83147a(this.f33526d_, shareContext, "Sharing canceled", 20013);
        }
        m124370Z();
    }

    /* renamed from: P */
    public final C39252c mo97241P() {
        CutVideoViewModel cutVideoViewModel = this.f101154k;
        if (cutVideoViewModel == null) {
            C7573i.m23583a("cutVideoViewModel");
        }
        if (cutVideoViewModel.mo97157i()) {
            return mo97236J().mo97181X();
        }
        return m124364T().mo97250M();
    }

    /* renamed from: o */
    public final void mo31006o() {
        super.mo31006o();
        C38916af K = mo96987K();
        Activity v = mo31015v();
        if (v != null) {
            K.mo97208a((FragmentActivity) v);
            mo96987K().f101081n = this;
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    /* renamed from: z */
    public final void mo31019z() {
        super.mo31019z();
        C38916af K = mo96987K();
        Activity activity = this.f33526d_;
        if (activity != null) {
            FragmentActivity fragmentActivity = (FragmentActivity) activity;
            C0043i iVar = this;
            String b = Workspace.m122805b();
            C7573i.m23582a((Object) b, "Workspace.getImportDir()");
            K.mo97209a(fragmentActivity, iVar, b, m124362R().mo30921H(), mo97241P());
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    /* renamed from: Y */
    private final void m124369Y() {
        CutVideoViewModel cutVideoViewModel = this.f101154k;
        if (cutVideoViewModel == null) {
            C7573i.m23583a("cutVideoViewModel");
        }
        mo91869c(cutVideoViewModel, C38963ao.f101184a, new C11672v(), new C38953b(this));
        CutVideoViewModel cutVideoViewModel2 = this.f101154k;
        if (cutVideoViewModel2 == null) {
            C7573i.m23583a("cutVideoViewModel");
        }
        mo91869c(cutVideoViewModel2, C38964ap.f101185a, new C11672v(), new C38954c(this));
        VideoEditViewModel videoEditViewModel = this.f101155l;
        if (videoEditViewModel == null) {
            C7573i.m23583a("videoEditViewModel");
        }
        videoEditViewModel.f101853r.observe(this, new C38955d(this));
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004e  */
    /* renamed from: ae */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m124376ae() {
        /*
            r6 = this;
            android.app.Activity r0 = r6.f33526d_
            if (r0 == 0) goto L_0x006d
            com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoViewModel r1 = r6.f101154k
            if (r1 != 0) goto L_0x000d
            java.lang.String r2 = "cutVideoViewModel"
            kotlin.jvm.internal.C7573i.m23583a(r2)
        L_0x000d:
            com.ss.android.ugc.aweme.shortvideo.cut.scene.aa r1 = r1.mo97156h()
            com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace r1 = r1.f101006j
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r3 = "videoPath"
            r4 = 0
            if (r1 == 0) goto L_0x0028
            java.io.File r5 = r1.mo96328p()
            if (r5 == 0) goto L_0x0028
            java.lang.String r5 = r5.getPath()
            goto L_0x0029
        L_0x0028:
            r5 = r4
        L_0x0029:
            r2.putExtra(r3, r5)
            java.lang.String r3 = "audioPath"
            if (r1 == 0) goto L_0x003a
            java.io.File r1 = r1.mo96329q()
            if (r1 == 0) goto L_0x003a
            java.lang.String r4 = r1.getPath()
        L_0x003a:
            r2.putExtra(r3, r4)
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel r1 = r6.f101155l
            if (r1 != 0) goto L_0x0046
            java.lang.String r3 = "videoEditViewModel"
            kotlin.jvm.internal.C7573i.m23583a(r3)
        L_0x0046:
            java.util.List r1 = r1.mo97721n()
            com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoListViewModel r3 = r6.f101167x
            if (r3 != 0) goto L_0x0053
            java.lang.String r4 = "videoListViewModel"
            kotlin.jvm.internal.C7573i.m23583a(r4)
        L_0x0053:
            int r3 = r3.f100940e
            java.lang.Object r1 = r1.get(r3)
            com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment r1 = (com.p280ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment) r1
            java.lang.String r3 = "videoOriginPath"
            r4 = 0
            java.lang.String r1 = r1.mo96896a(r4)
            r2.putExtra(r3, r1)
            r1 = -1
            r0.setResult(r1, r2)
            r0.finish()
            return
        L_0x006d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.cut.scene.C38951an.m124376ae():void");
    }

    /* renamed from: X */
    private final void m124368X() {
        Activity activity = this.f33526d_;
        if (activity != null) {
            C0063u a = C0069x.m159a((FragmentActivity) activity).mo147a(VideoEditViewModel.class);
            C7573i.m23582a((Object) a, "ViewModelProviders.of(ac…ditViewModel::class.java)");
            this.f101155l = (VideoEditViewModel) a;
            Activity activity2 = this.f33526d_;
            if (activity2 != null) {
                C0063u a2 = C0069x.m159a((FragmentActivity) activity2).mo147a(CutMultiVideoViewModel.class);
                C7573i.m23582a((Object) a2, "ViewModelProviders.of(ac…deoViewModel::class.java]");
                this.f101165v = (CutMultiVideoViewModel) a2;
                Activity activity3 = this.f33526d_;
                if (activity3 != null) {
                    JediViewModel a3 = C36113b.m116288a((FragmentActivity) activity3).mo91871a(CutVideoTitleBarViewModel.class);
                    C7573i.m23582a((Object) a3, "JediViewModelProviders.o…BarViewModel::class.java)");
                    this.f101156m = (CutVideoTitleBarViewModel) a3;
                    Activity activity4 = this.f33526d_;
                    if (activity4 != null) {
                        JediViewModel a4 = C36113b.m116288a((FragmentActivity) activity4).mo91871a(CutVideoBottomBarViewModel.class);
                        C7573i.m23582a((Object) a4, "JediViewModelProviders.o…BarViewModel::class.java)");
                        this.f101166w = (CutVideoBottomBarViewModel) a4;
                        Activity activity5 = this.f33526d_;
                        if (activity5 != null) {
                            JediViewModel a5 = C36113b.m116288a((FragmentActivity) activity5).mo91871a(CutVideoListViewModel.class);
                            C7573i.m23582a((Object) a5, "JediViewModelProviders.o…istViewModel::class.java)");
                            this.f101167x = (CutVideoListViewModel) a5;
                            Activity activity6 = this.f33526d_;
                            if (activity6 != null) {
                                JediViewModel a6 = C36113b.m116288a((FragmentActivity) activity6).mo91871a(CutVideoEditViewModel.class);
                                C7573i.m23582a((Object) a6, "JediViewModelProviders.o…ditViewModel::class.java)");
                                this.f101168y = (CutVideoEditViewModel) a6;
                                Activity activity7 = this.f33526d_;
                                if (activity7 != null) {
                                    JediViewModel a7 = C36113b.m116288a((FragmentActivity) activity7).mo91871a(CutVideoPreviewViewModel.class);
                                    C7573i.m23582a((Object) a7, "JediViewModelProviders.o…iewViewModel::class.java)");
                                    this.f101169z = (CutVideoPreviewViewModel) a7;
                                    return;
                                }
                                throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                            }
                            throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                        }
                        throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                    }
                    throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                }
                throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
            }
            throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    /* renamed from: Q */
    public final void mo97242Q() {
        Activity activity = this.f33526d_;
        if (activity != null && activity.isFinishing()) {
            return;
        }
        if (mo96987K().mo97202a() + 5 < this.f101152A) {
            C10761a.m31403c(this.f33526d_, mo31000a((int) R.string.fob, Long.valueOf(this.f101152A / 1000))).mo25750a();
            CutVideoTitleBarViewModel cutVideoTitleBarViewModel = this.f101156m;
            if (cutVideoTitleBarViewModel == null) {
                C7573i.m23583a("titleBarViewModel");
            }
            cutVideoTitleBarViewModel.mo97152d(true);
        } else if (mo96987K().mo97202a() > ((long) this.f101153B)) {
            StringBuilder sb = new StringBuilder("compile failed,duration=");
            sb.append(mo96987K().mo97202a());
            sb.append(",maxEncodeDuration=");
            sb.append(this.f101153B);
            C41530am.m132280a(sb.toString());
            C10761a.m31399c((Context) this.f33526d_, (int) R.string.cap).mo25750a();
            CutVideoTitleBarViewModel cutVideoTitleBarViewModel2 = this.f101156m;
            if (cutVideoTitleBarViewModel2 == null) {
                C7573i.m23583a("titleBarViewModel");
            }
            cutVideoTitleBarViewModel2.mo97152d(true);
        } else {
            C6907h.m21524a("import_transcoding_start", Collections.emptyMap());
            C17454q b = C17454q.m58004b();
            CutVideoEditViewModel cutVideoEditViewModel = this.f101168y;
            if (cutVideoEditViewModel == null) {
                C7573i.m23583a("cutVideoEditViewModel");
            }
            if (cutVideoEditViewModel.f100834d != 1) {
                CutVideoListViewModel cutVideoListViewModel = this.f101167x;
                if (cutVideoListViewModel == null) {
                    C7573i.m23583a("videoListViewModel");
                }
                int i = cutVideoListViewModel.f100940e;
                C38916af K = mo96987K();
                VideoEditViewModel videoEditViewModel = this.f101155l;
                if (videoEditViewModel == null) {
                    C7573i.m23583a("videoEditViewModel");
                }
                C38916af.m124272a(K, i, (float) ((VideoSegment) videoEditViewModel.mo97720m().get(i)).f100769k, false, 0.0f, 0.0f, 0, 0, 120, null);
            }
            C38916af K2 = mo96987K();
            CutVideoViewModel cutVideoViewModel = this.f101154k;
            if (cutVideoViewModel == null) {
                C7573i.m23583a("cutVideoViewModel");
            }
            Workspace workspace = cutVideoViewModel.mo97156h().f101006j;
            if (workspace == null) {
                C7573i.m23580a();
            }
            CutVideoViewModel cutVideoViewModel2 = this.f101154k;
            if (cutVideoViewModel2 == null) {
                C7573i.m23583a("cutVideoViewModel");
            }
            boolean z = cutVideoViewModel2.mo97156h().f101009m;
            CutVideoViewModel cutVideoViewModel3 = this.f101154k;
            if (cutVideoViewModel3 == null) {
                C7573i.m23583a("cutVideoViewModel");
            }
            K2.mo97211a(workspace, z, cutVideoViewModel3.mo97161m(), (C38747c) new C38952a(this, b));
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ CutVideoViewModel m124371a(C38951an anVar) {
        CutVideoViewModel cutVideoViewModel = anVar.f101154k;
        if (cutVideoViewModel == null) {
            C7573i.m23583a("cutVideoViewModel");
        }
        return cutVideoViewModel;
    }

    /* renamed from: b */
    public static final /* synthetic */ VideoEditViewModel m124378b(C38951an anVar) {
        VideoEditViewModel videoEditViewModel = anVar.f101155l;
        if (videoEditViewModel == null) {
            C7573i.m23583a("videoEditViewModel");
        }
        return videoEditViewModel;
    }

    /* renamed from: c */
    public static final /* synthetic */ CutVideoTitleBarViewModel m124379c(C38951an anVar) {
        CutVideoTitleBarViewModel cutVideoTitleBarViewModel = anVar.f101156m;
        if (cutVideoTitleBarViewModel == null) {
            C7573i.m23583a("titleBarViewModel");
        }
        return cutVideoTitleBarViewModel;
    }

    /* renamed from: e */
    public final void mo30985e(Bundle bundle) {
        super.mo30985e(bundle);
        m124368X();
        m124369Y();
    }

    /* renamed from: b */
    public final void mo97246b(boolean z) {
        CutVideoEditViewModel cutVideoEditViewModel = this.f101168y;
        if (cutVideoEditViewModel == null) {
            C7573i.m23583a("cutVideoEditViewModel");
        }
        cutVideoEditViewModel.mo96981a(!z);
        CutVideoTitleBarViewModel cutVideoTitleBarViewModel = this.f101156m;
        if (cutVideoTitleBarViewModel == null) {
            C7573i.m23583a("titleBarViewModel");
        }
        cutVideoTitleBarViewModel.mo97152d(!z);
        CutVideoTitleBarViewModel cutVideoTitleBarViewModel2 = this.f101156m;
        if (cutVideoTitleBarViewModel2 == null) {
            C7573i.m23583a("titleBarViewModel");
        }
        cutVideoTitleBarViewModel2.mo97151c(!z);
        CutVideoPreviewViewModel cutVideoPreviewViewModel = this.f101169z;
        if (cutVideoPreviewViewModel == null) {
            C7573i.m23583a("previewViewModel");
        }
        cutVideoPreviewViewModel.mo97091a(!z);
        CutVideoBottomBarViewModel cutVideoBottomBarViewModel = this.f101166w;
        if (cutVideoBottomBarViewModel == null) {
            C7573i.m23583a("bottomBarViewModel");
        }
        cutVideoBottomBarViewModel.mo96962f(!z);
        CutVideoBottomBarViewModel cutVideoBottomBarViewModel2 = this.f101166w;
        if (cutVideoBottomBarViewModel2 == null) {
            C7573i.m23583a("bottomBarViewModel");
        }
        cutVideoBottomBarViewModel2.mo96961e(!z);
        CutVideoViewModel cutVideoViewModel = this.f101154k;
        if (cutVideoViewModel == null) {
            C7573i.m23583a("cutVideoViewModel");
        }
        if (cutVideoViewModel.mo97157i()) {
            mo97236J().mo97188b(z);
            CutVideoBottomBarViewModel cutVideoBottomBarViewModel3 = this.f101166w;
            if (cutVideoBottomBarViewModel3 == null) {
                C7573i.m23583a("bottomBarViewModel");
            }
            cutVideoBottomBarViewModel3.mo96964g(!z);
            CutVideoListViewModel cutVideoListViewModel = this.f101167x;
            if (cutVideoListViewModel == null) {
                C7573i.m23583a("videoListViewModel");
            }
            cutVideoListViewModel.mo97045c(!z);
            CutVideoListViewModel cutVideoListViewModel2 = this.f101167x;
            if (cutVideoListViewModel2 == null) {
                C7573i.m23583a("videoListViewModel");
            }
            cutVideoListViewModel2.mo97044b(!z);
        }
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

    /* renamed from: b */
    public final ViewGroup mo30923a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        C7573i.m23587b(viewGroup, "container");
        View inflate = layoutInflater.inflate(R.layout.ai8, viewGroup, false);
        if (inflate != null) {
            return (FrameLayout) inflate;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout");
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
