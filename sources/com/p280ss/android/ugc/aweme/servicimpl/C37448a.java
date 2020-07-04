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
import com.p280ss.android.ugc.aweme.tools.C42156aw;
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

/* renamed from: com.ss.android.ugc.aweme.servicimpl.a */
public final class C37448a implements C43867c {

    /* renamed from: a */
    public RecordViewModel f97722a;

    /* renamed from: b */
    public RecordToolbarViewModel f97723b;

    /* renamed from: c */
    public RecordControlViewModel f97724c;

    /* renamed from: d */
    public RecordProgressViewModel f97725d;

    /* renamed from: e */
    public RecordStatusViewModel f97726e;

    /* renamed from: f */
    public CameraModule f97727f;

    /* renamed from: g */
    private C42156aw f97728g;

    /* renamed from: h */
    private final String f97729h;

    /* renamed from: i */
    private final String f97730i;

    /* renamed from: j */
    private final String f97731j;

    /* renamed from: k */
    private final boolean f97732k = false;

    /* renamed from: com.ss.android.ugc.aweme.servicimpl.a$a */
    public static final class C37449a implements C43870f {

        /* renamed from: a */
        final /* synthetic */ C37448a f97733a;

        /* renamed from: b */
        final /* synthetic */ C43868d f97734b;

        /* renamed from: b */
        public final boolean mo94783b(C43866b bVar, C43871a aVar) {
            C7573i.m23587b(bVar, "model");
            C7573i.m23587b(aVar, "extraInfo");
            return false;
        }

        C37449a(C37448a aVar, C43868d dVar) {
            this.f97733a = aVar;
            this.f97734b = dVar;
        }

        /* renamed from: a */
        public final boolean mo94782a(C43866b bVar, C43871a aVar) {
            C7573i.m23587b(bVar, "model");
            C7573i.m23587b(aVar, "extraInfo");
            C37448a.m120068a(this.f97733a).mo106846k(true);
            C37448a.m120069b(this.f97733a).mo29069f();
            C37448a.m120069b(this.f97733a).mo106952a(new Pair<>(Integer.valueOf(1), Boolean.valueOf(false)));
            C37448a.m120070c(this.f97733a).mo100082b(0);
            C37448a.m120071d(this.f97733a).mo107181a(new C42585u(0));
            boolean d = C37448a.m120070c(this.f97733a).mo100085d();
            C37448a.m120071d(this.f97733a).mo107180a(new C42342g(false, C37448a.m120070c(this.f97733a).mo100080a(d), C37448a.m120070c(this.f97733a).f104644f.mo55994a(d, false)));
            C37448a.m120072e(this.f97733a).mo107138a(true);
            C35563c.f93240c.mo83131a(this.f97734b.mo106146e().f99788x, "click_shoot");
            C6907h.onEvent(MobClick.obtain().setEventName("click_mode").setLabelName("shoot_page").setJsonObject((JSONObject) this.f97734b.mo106153l().mo44946a()));
            if (C35563c.f93230L.mo93342a(Property.SpeedPanelOpen)) {
                C37448a.m120068a(this.f97733a).mo106829a(0);
            }
            C38505a.m123091d(0);
            this.f97734b.mo106146e().f99719X = 0;
            C37448a.m120073f(this.f97733a).mo102542m().setValue(Boolean.valueOf(false));
            return true;
        }
    }

    public final C43869e bH_() {
        return null;
    }

    /* renamed from: a */
    public static final /* synthetic */ RecordViewModel m120068a(C37448a aVar) {
        RecordViewModel recordViewModel = aVar.f97722a;
        if (recordViewModel == null) {
            C7573i.m23583a("recordViewModel");
        }
        return recordViewModel;
    }

    /* renamed from: b */
    public static final /* synthetic */ RecordControlViewModel m120069b(C37448a aVar) {
        RecordControlViewModel recordControlViewModel = aVar.f97724c;
        if (recordControlViewModel == null) {
            C7573i.m23583a("recordControlViewModel");
        }
        return recordControlViewModel;
    }

    /* renamed from: c */
    public static final /* synthetic */ CameraModule m120070c(C37448a aVar) {
        CameraModule cameraModule = aVar.f97727f;
        if (cameraModule == null) {
            C7573i.m23583a("cameraModule");
        }
        return cameraModule;
    }

    /* renamed from: d */
    public static final /* synthetic */ RecordToolbarViewModel m120071d(C37448a aVar) {
        RecordToolbarViewModel recordToolbarViewModel = aVar.f97723b;
        if (recordToolbarViewModel == null) {
            C7573i.m23583a("recordToolbarViewModel");
        }
        return recordToolbarViewModel;
    }

    /* renamed from: e */
    public static final /* synthetic */ RecordProgressViewModel m120072e(C37448a aVar) {
        RecordProgressViewModel recordProgressViewModel = aVar.f97725d;
        if (recordProgressViewModel == null) {
            C7573i.m23583a("recordProgressViewModel");
        }
        return recordProgressViewModel;
    }

    /* renamed from: f */
    public static final /* synthetic */ RecordStatusViewModel m120073f(C37448a aVar) {
        RecordStatusViewModel recordStatusViewModel = aVar.f97726e;
        if (recordStatusViewModel == null) {
            C7573i.m23583a("recordStatusViewModel");
        }
        return recordStatusViewModel;
    }

    /* renamed from: b */
    public final C43866b mo94780b(C43868d dVar) {
        C7573i.m23587b(dVar, "tabEnv");
        C43866b bVar = new C43866b(this.f97729h, this.f97730i, this.f97731j, this.f97732k, new C37449a(this, dVar));
        return bVar;
    }

    /* renamed from: a */
    public final void mo94779a(C43868d dVar) {
        C7573i.m23587b(dVar, "tabEnv");
        JediViewModel a = C36113b.m116288a(dVar.mo106145d()).mo91871a(RecordViewModel.class);
        C7573i.m23582a((Object) a, "JediViewModelProviders.o…ordViewModel::class.java)");
        this.f97722a = (RecordViewModel) a;
        JediViewModel a2 = C36113b.m116288a(dVar.mo106145d()).mo91871a(RecordProgressViewModel.class);
        C7573i.m23582a((Object) a2, "JediViewModelProviders.o…essViewModel::class.java)");
        this.f97725d = (RecordProgressViewModel) a2;
        JediViewModel a3 = C36113b.m116288a(dVar.mo106145d()).mo91871a(RecordToolbarViewModel.class);
        C7573i.m23582a((Object) a3, "JediViewModelProviders.o…barViewModel::class.java)");
        this.f97723b = (RecordToolbarViewModel) a3;
        JediViewModel a4 = C36113b.m116288a(dVar.mo106145d()).mo91871a(RecordControlViewModel.class);
        C7573i.m23582a((Object) a4, "JediViewModelProviders.o…rolViewModel::class.java)");
        this.f97724c = (RecordControlViewModel) a4;
        this.f97728g = dVar.mo106141b();
        this.f97727f = dVar.mo106148g();
        C0063u a5 = C0069x.m159a(dVar.mo106145d()).mo147a(RecordStatusViewModel.class);
        C7573i.m23582a((Object) a5, "ViewModelProviders.of(ta…tusViewModel::class.java)");
        this.f97726e = (RecordStatusViewModel) a5;
    }

    public C37448a(String str, String str2, String str3, boolean z) {
        C7573i.m23587b(str, "text");
        C7573i.m23587b(str2, "tag");
        C7573i.m23587b(str3, "shootMode");
        this.f97729h = str;
        this.f97730i = str2;
        this.f97731j = str3;
    }
}
