package com.p280ss.android.ugc.aweme.tools.live.p1671a;

import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0069x;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.jedi.arch.JediViewModel;
import com.p280ss.android.ugc.asve.recorder.effect.composer.ComposerInfo;
import com.p280ss.android.ugc.aweme.beauty.C23532c;
import com.p280ss.android.ugc.aweme.beauty.C23536f;
import com.p280ss.android.ugc.aweme.beauty.C23539i;
import com.p280ss.android.ugc.aweme.beauty.C23544m;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.C40832n;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.C40994w;
import com.p280ss.android.ugc.aweme.status.RecordStatusViewModel;
import com.p280ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.p280ss.android.ugc.aweme.tools.C42342g;
import com.p280ss.android.ugc.aweme.tools.C42585u;
import com.p280ss.android.ugc.aweme.tools.live.C42350a;
import com.p280ss.android.ugc.aweme.tools.live.RecordLiveViewModel;
import com.p280ss.android.ugc.aweme.utils.C43119fc;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheTTnetProxyTimeoutExperiment;
import com.p280ss.android.ugc.gamora.bottomtab.C43866b;
import com.p280ss.android.ugc.gamora.bottomtab.C43867c;
import com.p280ss.android.ugc.gamora.bottomtab.C43868d;
import com.p280ss.android.ugc.gamora.bottomtab.C43869e;
import com.p280ss.android.ugc.gamora.bottomtab.C43870f;
import com.p280ss.android.ugc.gamora.bottomtab.C43870f.C43871a;
import com.p280ss.android.ugc.gamora.p1486a.C36113b;
import com.p280ss.android.ugc.gamora.recorder.RecordViewModel;
import com.p280ss.android.ugc.gamora.recorder.progress.RecordProgressViewModel;
import com.p280ss.android.ugc.gamora.recorder.toolbar.RecordToolbarViewModel;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.tools.live.a.a */
public final class C42359a implements C43867c {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f110170a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C42359a.class), "liveScene", "getLiveScene()Lcom/ss/android/ugc/gamora/bottomtab/TabContentScene;"))};

    /* renamed from: b */
    public RecordStatusViewModel f110171b;

    /* renamed from: c */
    private final C7541d f110172c = C7546e.m23569a(C42361b.f110176a);

    /* renamed from: com.ss.android.ugc.aweme.tools.live.a.a$a */
    public static final class C42360a implements C43870f {

        /* renamed from: a */
        final /* synthetic */ C42359a f110173a;

        /* renamed from: b */
        final /* synthetic */ C43868d f110174b;

        /* renamed from: c */
        private FaceStickerBean f110175c;

        C42360a(C42359a aVar, C43868d dVar) {
            this.f110173a = aVar;
            this.f110174b = dVar;
        }

        /* renamed from: b */
        public final boolean mo94783b(C43866b bVar, C43871a aVar) {
            C7573i.m23587b(bVar, "model");
            C7573i.m23587b(aVar, "extraInfo");
            this.f110174b.mo106150i().mo96506c(false);
            if (!(C6399b.m19946v() || this.f110175c == null || this.f110175c == FaceStickerBean.NONE)) {
                C40994w wVar = (C40994w) this.f110174b.mo106149h().getValue();
                if (wVar != null) {
                    wVar.mo100282a(this.f110175c);
                }
            }
            if (C23536f.m77298a()) {
                C23539i n = C35574k.m114859a().mo70099n();
                C23532c cVar = new C23532c(C35574k.m114859a().mo70099n().mo61330e(), true, true, false, true);
                n.mo61325a(cVar);
            } else if (!C6399b.m19946v()) {
                this.f110174b.mo106150i().mo96497a(this.f110174b.mo106146e().f99784t, true);
                this.f110174b.mo106150i().mo96503b(this.f110174b.mo106146e().f99784t, true);
                if (C23544m.m77321a("2", "3")) {
                    this.f110174b.mo106150i().mo96507c(this.f110174b.mo106146e().f99784t, true);
                }
                this.f110174b.mo106150i().mo96501b((List<ComposerInfo>) new ArrayList<ComposerInfo>(), (int) VideoCacheTTnetProxyTimeoutExperiment.DEFAULT);
            }
            return false;
        }

        /* renamed from: a */
        public final boolean mo94782a(C43866b bVar, C43871a aVar) {
            FaceStickerBean faceStickerBean;
            C7573i.m23587b(bVar, "model");
            C7573i.m23587b(aVar, "extraInfo");
            this.f110174b.mo106150i().mo96506c(true);
            JediViewModel a = C36113b.m116288a(this.f110174b.mo106145d()).mo91871a(RecordProgressViewModel.class);
            C7573i.m23582a((Object) a, "JediViewModelProviders.o…essViewModel::class.java)");
            RecordProgressViewModel recordProgressViewModel = (RecordProgressViewModel) a;
            C0063u a2 = C0069x.m159a(this.f110174b.mo106145d()).mo147a(ShortVideoContextViewModel.class);
            C7573i.m23582a((Object) a2, "ViewModelProviders.of(ta…extViewModel::class.java)");
            ShortVideoContextViewModel shortVideoContextViewModel = (ShortVideoContextViewModel) a2;
            ((RecordViewModel) C36113b.m116288a(this.f110174b.mo106145d()).mo91871a(RecordViewModel.class)).mo106846k(false);
            if (shortVideoContextViewModel.f99791a.f99776l.isEmpty()) {
                if (!C6399b.m19946v()) {
                    this.f110174b.mo106148g().mo100082b(0);
                    boolean d = this.f110174b.mo106148g().mo100085d();
                    JediViewModel a3 = C36113b.m116288a(this.f110174b.mo106145d()).mo91871a(RecordToolbarViewModel.class);
                    C7573i.m23582a((Object) a3, "JediViewModelProviders.o…barViewModel::class.java)");
                    RecordToolbarViewModel recordToolbarViewModel = (RecordToolbarViewModel) a3;
                    recordToolbarViewModel.mo107180a(new C42342g(false, this.f110174b.mo106148g().mo100080a(d), this.f110174b.mo106148g().f104644f.mo55994a(d, false)));
                    recordToolbarViewModel.mo107181a(new C42585u(0));
                    C40994w wVar = (C40994w) this.f110174b.mo106149h().getValue();
                    if (wVar != null) {
                        faceStickerBean = wVar.mo100301b();
                    } else {
                        faceStickerBean = null;
                    }
                    this.f110175c = faceStickerBean;
                    if (!(this.f110175c == null || this.f110175c == FaceStickerBean.NONE)) {
                        C40994w wVar2 = (C40994w) this.f110174b.mo106149h().getValue();
                        if (wVar2 != null) {
                            wVar2.mo100282a(FaceStickerBean.NONE);
                        }
                    }
                    this.f110174b.mo106150i().mo96497a(false, true);
                    this.f110174b.mo106150i().mo96503b(false, true);
                    this.f110174b.mo106150i().mo96507c(false, true);
                }
                recordProgressViewModel.mo107138a(false);
                if (shortVideoContextViewModel.f99791a.f99782r != null) {
                    C40832n nVar = (C40832n) this.f110174b.mo106154m().mo44946a();
                    if (nVar != null) {
                        nVar.mo100423d();
                    }
                    C40832n nVar2 = (C40832n) this.f110174b.mo106154m().mo44946a();
                    if (nVar2 != null) {
                        nVar2.mo100420b();
                    }
                }
            }
            C42359a.m134680a(this.f110173a).mo102542m().setValue(Boolean.valueOf(true));
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.live.a.a$b */
    static final class C42361b extends Lambda implements C7561a<C42350a> {

        /* renamed from: a */
        public static final C42361b f110176a = new C42361b();

        C42361b() {
            super(0);
        }

        /* renamed from: a */
        private static C42350a m134687a() {
            return new C42350a();
        }

        public final /* synthetic */ Object invoke() {
            return m134687a();
        }
    }

    /* renamed from: b */
    private final C43869e m134681b() {
        return (C43869e) this.f110172c.getValue();
    }

    public final C43869e bH_() {
        return m134681b();
    }

    /* renamed from: c */
    private static boolean m134682c(C43868d dVar) {
        return dVar.mo106146e().f99764ay;
    }

    /* renamed from: a */
    public static final /* synthetic */ RecordStatusViewModel m134680a(C42359a aVar) {
        RecordStatusViewModel recordStatusViewModel = aVar.f110171b;
        if (recordStatusViewModel == null) {
            C7573i.m23583a("recordStatusViewModel");
        }
        return recordStatusViewModel;
    }

    /* renamed from: b */
    public final C43866b mo94780b(C43868d dVar) {
        int i;
        C7573i.m23587b(dVar, "tabEnv");
        if (C6399b.m19946v()) {
            i = R.string.bzz;
        } else {
            i = R.string.dco;
        }
        C43866b bVar = new C43866b(C43119fc.m136748a(i), C43119fc.m136748a(R.string.dcp), "live", m134682c(dVar), new C42360a(this, dVar));
        return bVar;
    }

    /* renamed from: a */
    public final void mo94779a(C43868d dVar) {
        C7573i.m23587b(dVar, "tabEnv");
        RecordLiveViewModel recordLiveViewModel = (RecordLiveViewModel) C0069x.m159a(dVar.mo106145d()).mo147a(RecordLiveViewModel.class);
        recordLiveViewModel.f110150a = dVar.mo106126a();
        recordLiveViewModel.mo103832a(dVar.mo106141b());
        recordLiveViewModel.mo103831a(dVar.mo106148g());
        recordLiveViewModel.f110154e = dVar.mo106146e();
        recordLiveViewModel.mo103830a(dVar.mo106147f());
        C0063u a = C0069x.m159a(dVar.mo106145d()).mo147a(RecordStatusViewModel.class);
        C7573i.m23582a((Object) a, "ViewModelProviders.of(ta…tusViewModel::class.java)");
        this.f110171b = (RecordStatusViewModel) a;
    }
}
