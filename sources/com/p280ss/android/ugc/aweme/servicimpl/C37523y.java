package com.p280ss.android.ugc.aweme.servicimpl;

import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0069x;
import com.bytedance.jedi.arch.JediViewModel;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVSettings.Property;
import com.p280ss.android.ugc.aweme.shortvideo.p1550b.C38505a;
import com.p280ss.android.ugc.aweme.shortvideo.record.CameraModule;
import com.p280ss.android.ugc.aweme.status.RecordStatusViewModel;
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
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.servicimpl.y */
public final class C37523y implements C43867c {

    /* renamed from: a */
    public RecordViewModel f97874a;

    /* renamed from: b */
    public RecordProgressViewModel f97875b;

    /* renamed from: c */
    public RecordToolbarViewModel f97876c;

    /* renamed from: d */
    public RecordControlViewModel f97877d;

    /* renamed from: e */
    public RecordStatusViewModel f97878e;

    /* renamed from: f */
    public CameraModule f97879f;

    /* renamed from: g */
    private final String f97880g;

    /* renamed from: h */
    private final String f97881h;

    /* renamed from: i */
    private final String f97882i;

    /* renamed from: j */
    private final boolean f97883j = false;

    /* renamed from: com.ss.android.ugc.aweme.servicimpl.y$a */
    public static final class C37524a implements C43870f {

        /* renamed from: a */
        final /* synthetic */ C37523y f97884a;

        /* renamed from: b */
        final /* synthetic */ C43868d f97885b;

        /* renamed from: b */
        public final boolean mo94783b(C43866b bVar, C43871a aVar) {
            C7573i.m23587b(bVar, "model");
            C7573i.m23587b(aVar, "extraInfo");
            return false;
        }

        C37524a(C37523y yVar, C43868d dVar) {
            this.f97884a = yVar;
            this.f97885b = dVar;
        }

        /* renamed from: a */
        public final boolean mo94782a(C43866b bVar, C43871a aVar) {
            C7573i.m23587b(bVar, "model");
            C7573i.m23587b(aVar, "extraInfo");
            C37523y.m120202a(this.f97884a).mo106846k(true);
            C37523y.m120203b(this.f97884a).mo29069f();
            C37523y.m120203b(this.f97884a).mo106952a(new Pair<>(Integer.valueOf(0), Boolean.valueOf(false)));
            C37523y.m120204c(this.f97884a).mo100082b(0);
            C37523y.m120205d(this.f97884a).mo107181a(new C42585u(0));
            boolean d = C37523y.m120204c(this.f97884a).mo100085d();
            C37523y.m120205d(this.f97884a).mo107180a(new C42342g(false, C37523y.m120204c(this.f97884a).mo100080a(d), C37523y.m120204c(this.f97884a).f104644f.mo55994a(d, false)));
            C37523y.m120206e(this.f97884a).mo107138a(true);
            C35563c.f93240c.mo83131a(this.f97885b.mo106146e().f99788x, "long_press_shoot");
            C6907h.onEvent(MobClick.obtain().setEventName("shoot_mode").setLabelName("shoot_page").setJsonObject((JSONObject) this.f97885b.mo106153l().mo44946a()));
            if (C35563c.f93230L.mo93342a(Property.SpeedPanelOpen)) {
                C37523y.m120202a(this.f97884a).mo106829a(0);
            }
            C38505a.m123091d(1);
            this.f97885b.mo106146e().f99719X = 1;
            C37523y.m120207f(this.f97884a).mo102542m().setValue(Boolean.valueOf(false));
            return true;
        }
    }

    public final C43869e bH_() {
        return null;
    }

    /* renamed from: a */
    public static final /* synthetic */ RecordViewModel m120202a(C37523y yVar) {
        RecordViewModel recordViewModel = yVar.f97874a;
        if (recordViewModel == null) {
            C7573i.m23583a("recordViewModel");
        }
        return recordViewModel;
    }

    /* renamed from: b */
    public static final /* synthetic */ RecordControlViewModel m120203b(C37523y yVar) {
        RecordControlViewModel recordControlViewModel = yVar.f97877d;
        if (recordControlViewModel == null) {
            C7573i.m23583a("recordControlViewModel");
        }
        return recordControlViewModel;
    }

    /* renamed from: c */
    public static final /* synthetic */ CameraModule m120204c(C37523y yVar) {
        CameraModule cameraModule = yVar.f97879f;
        if (cameraModule == null) {
            C7573i.m23583a("cameraModule");
        }
        return cameraModule;
    }

    /* renamed from: d */
    public static final /* synthetic */ RecordToolbarViewModel m120205d(C37523y yVar) {
        RecordToolbarViewModel recordToolbarViewModel = yVar.f97876c;
        if (recordToolbarViewModel == null) {
            C7573i.m23583a("recordToolbarViewModel");
        }
        return recordToolbarViewModel;
    }

    /* renamed from: e */
    public static final /* synthetic */ RecordProgressViewModel m120206e(C37523y yVar) {
        RecordProgressViewModel recordProgressViewModel = yVar.f97875b;
        if (recordProgressViewModel == null) {
            C7573i.m23583a("recordProgressViewModel");
        }
        return recordProgressViewModel;
    }

    /* renamed from: f */
    public static final /* synthetic */ RecordStatusViewModel m120207f(C37523y yVar) {
        RecordStatusViewModel recordStatusViewModel = yVar.f97878e;
        if (recordStatusViewModel == null) {
            C7573i.m23583a("recordStatusViewModel");
        }
        return recordStatusViewModel;
    }

    /* renamed from: b */
    public final C43866b mo94780b(C43868d dVar) {
        C7573i.m23587b(dVar, "tabEnv");
        C43866b bVar = new C43866b(this.f97880g, this.f97881h, this.f97882i, this.f97883j, new C37524a(this, dVar));
        return bVar;
    }

    /* renamed from: a */
    public final void mo94779a(C43868d dVar) {
        C7573i.m23587b(dVar, "tabEnv");
        JediViewModel a = C36113b.m116288a(dVar.mo106145d()).mo91871a(RecordViewModel.class);
        C7573i.m23582a((Object) a, "JediViewModelProviders.o…ordViewModel::class.java)");
        this.f97874a = (RecordViewModel) a;
        JediViewModel a2 = C36113b.m116288a(dVar.mo106145d()).mo91871a(RecordProgressViewModel.class);
        C7573i.m23582a((Object) a2, "JediViewModelProviders.o…essViewModel::class.java)");
        this.f97875b = (RecordProgressViewModel) a2;
        JediViewModel a3 = C36113b.m116288a(dVar.mo106145d()).mo91871a(RecordToolbarViewModel.class);
        C7573i.m23582a((Object) a3, "JediViewModelProviders.o…barViewModel::class.java)");
        this.f97876c = (RecordToolbarViewModel) a3;
        JediViewModel a4 = C36113b.m116288a(dVar.mo106145d()).mo91871a(RecordControlViewModel.class);
        C7573i.m23582a((Object) a4, "JediViewModelProviders.o…rolViewModel::class.java)");
        this.f97877d = (RecordControlViewModel) a4;
        this.f97879f = dVar.mo106148g();
        C0063u a5 = C0069x.m159a(dVar.mo106145d()).mo147a(RecordStatusViewModel.class);
        C7573i.m23582a((Object) a5, "ViewModelProviders.of(ta…tusViewModel::class.java)");
        this.f97878e = (RecordStatusViewModel) a5;
    }

    public C37523y(String str, String str2, String str3, boolean z) {
        C7573i.m23587b(str, "text");
        C7573i.m23587b(str2, "tag");
        C7573i.m23587b(str3, "shootMode");
        this.f97880g = str;
        this.f97881h = str2;
        this.f97882i = str3;
    }
}
