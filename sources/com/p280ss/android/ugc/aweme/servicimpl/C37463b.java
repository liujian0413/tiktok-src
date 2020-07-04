package com.p280ss.android.ugc.aweme.servicimpl;

import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0069x;
import com.bytedance.jedi.arch.JediViewModel;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVSettings.Property;
import com.p280ss.android.ugc.aweme.shortvideo.C38427ad;
import com.p280ss.android.ugc.aweme.shortvideo.C39360dw;
import com.p280ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p280ss.android.ugc.aweme.shortvideo.p1550b.C38505a;
import com.p280ss.android.ugc.aweme.shortvideo.record.CameraModule;
import com.p280ss.android.ugc.aweme.status.RecordStatusViewModel;
import com.p280ss.android.ugc.aweme.tools.C42152as;
import com.p280ss.android.ugc.aweme.tools.C42155av;
import com.p280ss.android.ugc.aweme.tools.C42342g;
import com.p280ss.android.ugc.aweme.tools.C42585u;
import com.p280ss.android.ugc.gamora.bottomtab.C43866b;
import com.p280ss.android.ugc.gamora.bottomtab.C43867c;
import com.p280ss.android.ugc.gamora.bottomtab.C43868d;
import com.p280ss.android.ugc.gamora.bottomtab.C43869e;
import com.p280ss.android.ugc.gamora.bottomtab.C43870f;
import com.p280ss.android.ugc.gamora.bottomtab.C43870f.C43871a;
import com.p280ss.android.ugc.gamora.p1486a.C36113b;
import com.p280ss.android.ugc.gamora.recorder.RecordViewModel;
import com.p280ss.android.ugc.gamora.recorder.control.RecordControlViewModel;
import com.p280ss.android.ugc.gamora.recorder.progress.RecordProgressViewModel;
import com.p280ss.android.ugc.gamora.recorder.toolbar.RecordToolbarViewModel;
import kotlin.Pair;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.servicimpl.b */
public final class C37463b implements C43867c {

    /* renamed from: a */
    public RecordViewModel f97770a;

    /* renamed from: b */
    public RecordProgressViewModel f97771b;

    /* renamed from: c */
    public RecordToolbarViewModel f97772c;

    /* renamed from: d */
    public RecordControlViewModel f97773d;

    /* renamed from: e */
    public RecordStatusViewModel f97774e;

    /* renamed from: f */
    public CameraModule f97775f;

    /* renamed from: g */
    private final String f97776g;

    /* renamed from: h */
    private final String f97777h;

    /* renamed from: i */
    private final String f97778i;

    /* renamed from: j */
    private final boolean f97779j = false;

    /* renamed from: com.ss.android.ugc.aweme.servicimpl.b$a */
    public static final class C37464a implements C43870f {

        /* renamed from: a */
        final /* synthetic */ C37463b f97780a;

        /* renamed from: b */
        final /* synthetic */ C43868d f97781b;

        /* renamed from: b */
        public final boolean mo94783b(C43866b bVar, C43871a aVar) {
            C7573i.m23587b(bVar, "model");
            C7573i.m23587b(aVar, "extraInfo");
            return false;
        }

        C37464a(C37463b bVar, C43868d dVar) {
            this.f97780a = bVar;
            this.f97781b = dVar;
        }

        /* renamed from: a */
        public final boolean mo94782a(C43866b bVar, C43871a aVar) {
            C7573i.m23587b(bVar, "model");
            C7573i.m23587b(aVar, "extraInfo");
            int a = C38427ad.m122854a(bVar.f113643c);
            C37463b.m120120a(this.f97780a).mo106846k(true);
            C37463b.m120121b(this.f97780a).mo29069f();
            C37463b.m120121b(this.f97780a).mo106952a(new Pair<>(Integer.valueOf(3), Boolean.valueOf(false)));
            C37463b.m120122c(this.f97780a).mo100082b(0);
            C37463b.m120123d(this.f97780a).mo107181a(new C42585u(0));
            boolean d = C37463b.m120122c(this.f97780a).mo100085d();
            C37463b.m120123d(this.f97780a).mo107180a(new C42342g(false, C37463b.m120122c(this.f97780a).mo100080a(d), C37463b.m120122c(this.f97780a).f104644f.mo55994a(d, false)));
            C37463b.m120124e(this.f97780a).mo107138a(true);
            if (C35563c.f93230L.mo93342a(Property.SpeedPanelOpen)) {
                C37463b.m120120a(this.f97780a).mo106829a(0);
            }
            m120129a(this.f97781b, bVar.f113643c, this.f97781b.mo106146e(), aVar.f113664a);
            m120128a(this.f97781b, bVar.f113643c, this.f97781b.mo106146e());
            C38505a.m123091d(a);
            this.f97781b.mo106146e().f99719X = a;
            C37463b.m120125f(this.f97780a).mo102542m().setValue(Boolean.valueOf(false));
            return true;
        }

        /* renamed from: a */
        private static void m120128a(C43868d dVar, String str, ShortVideoContext shortVideoContext) {
            if ((C7573i.m23585a((Object) C38427ad.m122856b(), (Object) str) || C7573i.m23585a((Object) C38427ad.m122855a(), (Object) str)) && shortVideoContext.mo96141c()) {
                shortVideoContext.f99770f = 0;
                C38505a.m123080a(shortVideoContext.f99769e, C39360dw.m125725a().mo97931b(), shortVideoContext.f99770f);
                dVar.mo106147f().mo55900a(shortVideoContext.f99769e, (long) shortVideoContext.f99770f, shortVideoContext.f99777m);
            }
        }

        /* renamed from: a */
        private final void m120129a(C43868d dVar, String str, ShortVideoContext shortVideoContext, boolean z) {
            if ((C7573i.m23585a((Object) C38427ad.m122856b(), (Object) str) || C7573i.m23585a((Object) C38427ad.m122855a(), (Object) str)) && !shortVideoContext.mo96142d() && !shortVideoContext.mo96144e()) {
                C42152as asVar = new C42152as(!C7573i.m23585a((Object) C38427ad.m122856b(), (Object) str), true);
                asVar.f109682d = z;
                asVar.f109681c = 2;
                C42155av avVar = asVar;
                dVar.mo106144c().mo103594a((Object) this.f97780a, avVar);
                dVar.mo106141b().mo103594a((Object) this.f97780a, avVar);
            }
        }
    }

    public final C43869e bH_() {
        return null;
    }

    /* renamed from: a */
    public static final /* synthetic */ RecordViewModel m120120a(C37463b bVar) {
        RecordViewModel recordViewModel = bVar.f97770a;
        if (recordViewModel == null) {
            C7573i.m23583a("recordViewModel");
        }
        return recordViewModel;
    }

    /* renamed from: b */
    public static final /* synthetic */ RecordControlViewModel m120121b(C37463b bVar) {
        RecordControlViewModel recordControlViewModel = bVar.f97773d;
        if (recordControlViewModel == null) {
            C7573i.m23583a("recordControlViewModel");
        }
        return recordControlViewModel;
    }

    /* renamed from: c */
    public static final /* synthetic */ CameraModule m120122c(C37463b bVar) {
        CameraModule cameraModule = bVar.f97775f;
        if (cameraModule == null) {
            C7573i.m23583a("cameraModule");
        }
        return cameraModule;
    }

    /* renamed from: d */
    public static final /* synthetic */ RecordToolbarViewModel m120123d(C37463b bVar) {
        RecordToolbarViewModel recordToolbarViewModel = bVar.f97772c;
        if (recordToolbarViewModel == null) {
            C7573i.m23583a("recordToolbarViewModel");
        }
        return recordToolbarViewModel;
    }

    /* renamed from: e */
    public static final /* synthetic */ RecordProgressViewModel m120124e(C37463b bVar) {
        RecordProgressViewModel recordProgressViewModel = bVar.f97771b;
        if (recordProgressViewModel == null) {
            C7573i.m23583a("recordProgressViewModel");
        }
        return recordProgressViewModel;
    }

    /* renamed from: f */
    public static final /* synthetic */ RecordStatusViewModel m120125f(C37463b bVar) {
        RecordStatusViewModel recordStatusViewModel = bVar.f97774e;
        if (recordStatusViewModel == null) {
            C7573i.m23583a("recordStatusViewModel");
        }
        return recordStatusViewModel;
    }

    /* renamed from: b */
    public final C43866b mo94780b(C43868d dVar) {
        C7573i.m23587b(dVar, "tabEnv");
        C43866b bVar = new C43866b(this.f97776g, this.f97777h, this.f97778i, this.f97779j, new C37464a(this, dVar));
        return bVar;
    }

    /* renamed from: a */
    public final void mo94779a(C43868d dVar) {
        C7573i.m23587b(dVar, "tabEnv");
        JediViewModel a = C36113b.m116288a(dVar.mo106145d()).mo91871a(RecordViewModel.class);
        C7573i.m23582a((Object) a, "JediViewModelProviders.o…ordViewModel::class.java)");
        this.f97770a = (RecordViewModel) a;
        JediViewModel a2 = C36113b.m116288a(dVar.mo106145d()).mo91871a(RecordProgressViewModel.class);
        C7573i.m23582a((Object) a2, "JediViewModelProviders.o…essViewModel::class.java)");
        this.f97771b = (RecordProgressViewModel) a2;
        JediViewModel a3 = C36113b.m116288a(dVar.mo106145d()).mo91871a(RecordToolbarViewModel.class);
        C7573i.m23582a((Object) a3, "JediViewModelProviders.o…barViewModel::class.java)");
        this.f97772c = (RecordToolbarViewModel) a3;
        JediViewModel a4 = C36113b.m116288a(dVar.mo106145d()).mo91871a(RecordControlViewModel.class);
        C7573i.m23582a((Object) a4, "JediViewModelProviders.o…rolViewModel::class.java)");
        this.f97773d = (RecordControlViewModel) a4;
        this.f97775f = dVar.mo106148g();
        C0063u a5 = C0069x.m159a(dVar.mo106145d()).mo147a(RecordStatusViewModel.class);
        C7573i.m23582a((Object) a5, "ViewModelProviders.of(ta…tusViewModel::class.java)");
        this.f97774e = (RecordStatusViewModel) a5;
    }

    public C37463b(String str, String str2, String str3, boolean z) {
        C7573i.m23587b(str, "text");
        C7573i.m23587b(str2, "tag");
        C7573i.m23587b(str3, "shootMode");
        this.f97776g = str;
        this.f97777h = str2;
        this.f97778i = str3;
    }
}
