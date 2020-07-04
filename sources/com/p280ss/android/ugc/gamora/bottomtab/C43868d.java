package com.p280ss.android.ugc.gamora.bottomtab;

import android.support.p022v4.app.FragmentActivity;
import com.google.common.base.C17457s;
import com.p280ss.android.ugc.asve.recorder.camera.p923a.C20705b;
import com.p280ss.android.ugc.asve.recorder.camera.p925c.C20719d;
import com.p280ss.android.ugc.asve.recorder.p922b.C20676a;
import com.p280ss.android.ugc.aweme.services.recording.IRecordingOperationPanel;
import com.p280ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p280ss.android.ugc.aweme.shortvideo.beauty.C38519c;
import com.p280ss.android.ugc.aweme.shortvideo.p1558e.C39374g;
import com.p280ss.android.ugc.aweme.shortvideo.p1584n.C40190e;
import com.p280ss.android.ugc.aweme.shortvideo.record.CameraModule;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.C40832n;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.C40994w;
import com.p280ss.android.ugc.aweme.tools.C42156aw;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.C7541d;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.gamora.bottomtab.d */
public final class C43868d {

    /* renamed from: a */
    public IRecordingOperationPanel f113647a;

    /* renamed from: b */
    public C42156aw f113648b;

    /* renamed from: c */
    public C42156aw f113649c;

    /* renamed from: d */
    public FragmentActivity f113650d;

    /* renamed from: e */
    public ShortVideoContext f113651e;

    /* renamed from: f */
    public C20676a f113652f;

    /* renamed from: g */
    public CameraModule f113653g;

    /* renamed from: h */
    public C7541d<? extends C40994w> f113654h;

    /* renamed from: i */
    public C38519c f113655i;

    /* renamed from: j */
    public C20719d f113656j;

    /* renamed from: k */
    public C20705b f113657k;

    /* renamed from: l */
    public C17457s<JSONObject> f113658l;

    /* renamed from: m */
    public Effect f113659m;

    /* renamed from: n */
    public C17457s<C40832n> f113660n;

    /* renamed from: o */
    public C39374g f113661o;

    /* renamed from: p */
    public C40190e f113662p;

    /* renamed from: q */
    public String f113663q;

    /* renamed from: a */
    public final void mo106138a(C42156aw awVar) {
        C7573i.m23587b(awVar, "<set-?>");
        this.f113648b = awVar;
    }

    /* renamed from: a */
    public final void mo106137a(CameraModule cameraModule) {
        C7573i.m23587b(cameraModule, "<set-?>");
        this.f113653g = cameraModule;
    }

    /* renamed from: a */
    public final void mo106140a(C7541d<? extends C40994w> dVar) {
        C7573i.m23587b(dVar, "<set-?>");
        this.f113654h = dVar;
    }

    /* renamed from: a */
    public final void mo106135a(C39374g gVar) {
        C7573i.m23587b(gVar, "<set-?>");
        this.f113661o = gVar;
    }

    /* renamed from: a */
    public final void mo106136a(C40190e eVar) {
        C7573i.m23587b(eVar, "<set-?>");
        this.f113662p = eVar;
    }

    /* renamed from: a */
    public final void mo106139a(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.f113663q = str;
    }

    /* renamed from: a */
    public final IRecordingOperationPanel mo106126a() {
        IRecordingOperationPanel iRecordingOperationPanel = this.f113647a;
        if (iRecordingOperationPanel == null) {
            C7573i.m23583a("recordingOperationPanel");
        }
        return iRecordingOperationPanel;
    }

    /* renamed from: b */
    public final C42156aw mo106141b() {
        C42156aw awVar = this.f113648b;
        if (awVar == null) {
            C7573i.m23583a("uiEventContext");
        }
        return awVar;
    }

    /* renamed from: c */
    public final C42156aw mo106144c() {
        C42156aw awVar = this.f113649c;
        if (awVar == null) {
            C7573i.m23583a("sdkEventContext");
        }
        return awVar;
    }

    /* renamed from: d */
    public final FragmentActivity mo106145d() {
        FragmentActivity fragmentActivity = this.f113650d;
        if (fragmentActivity == null) {
            C7573i.m23583a("activity");
        }
        return fragmentActivity;
    }

    /* renamed from: e */
    public final ShortVideoContext mo106146e() {
        ShortVideoContext shortVideoContext = this.f113651e;
        if (shortVideoContext == null) {
            C7573i.m23583a("shortVideoContext");
        }
        return shortVideoContext;
    }

    /* renamed from: f */
    public final C20676a mo106147f() {
        C20676a aVar = this.f113652f;
        if (aVar == null) {
            C7573i.m23583a("mediaController");
        }
        return aVar;
    }

    /* renamed from: g */
    public final CameraModule mo106148g() {
        CameraModule cameraModule = this.f113653g;
        if (cameraModule == null) {
            C7573i.m23583a("cameraModule");
        }
        return cameraModule;
    }

    /* renamed from: h */
    public final C7541d<C40994w> mo106149h() {
        C7541d<? extends C40994w> dVar = this.f113654h;
        if (dVar == null) {
            C7573i.m23583a("stickerModule");
        }
        return dVar;
    }

    /* renamed from: i */
    public final C38519c mo106150i() {
        C38519c cVar = this.f113655i;
        if (cVar == null) {
            C7573i.m23583a("beautyModule");
        }
        return cVar;
    }

    /* renamed from: j */
    public final C20719d mo106151j() {
        C20719d dVar = this.f113656j;
        if (dVar == null) {
            C7573i.m23583a("wideCameraComponent");
        }
        return dVar;
    }

    /* renamed from: k */
    public final C20705b mo106152k() {
        C20705b bVar = this.f113657k;
        if (bVar == null) {
            C7573i.m23583a("shakeFreeManager");
        }
        return bVar;
    }

    /* renamed from: l */
    public final C17457s<JSONObject> mo106153l() {
        C17457s<JSONObject> sVar = this.f113658l;
        if (sVar == null) {
            C7573i.m23583a("shootWayExtraSupplier");
        }
        return sVar;
    }

    /* renamed from: m */
    public final C17457s<C40832n> mo106154m() {
        C17457s<C40832n> sVar = this.f113660n;
        if (sVar == null) {
            C7573i.m23583a("backgroundVideoSupplier");
        }
        return sVar;
    }

    /* renamed from: n */
    public final C39374g mo106155n() {
        C39374g gVar = this.f113661o;
        if (gVar == null) {
            C7573i.m23583a("filterModule");
        }
        return gVar;
    }

    /* renamed from: o */
    public final C40190e mo106156o() {
        C40190e eVar = this.f113662p;
        if (eVar == null) {
            C7573i.m23583a("videoRecorder");
        }
        return eVar;
    }

    /* renamed from: p */
    public final String mo106157p() {
        String str = this.f113663q;
        if (str == null) {
            C7573i.m23583a("filterIntensityStoreTAG");
        }
        return str;
    }

    /* renamed from: a */
    public final void mo106127a(FragmentActivity fragmentActivity) {
        C7573i.m23587b(fragmentActivity, "<set-?>");
        this.f113650d = fragmentActivity;
    }

    /* renamed from: b */
    public final void mo106142b(C17457s<C40832n> sVar) {
        C7573i.m23587b(sVar, "<set-?>");
        this.f113660n = sVar;
    }

    /* renamed from: a */
    public final void mo106128a(C17457s<JSONObject> sVar) {
        C7573i.m23587b(sVar, "<set-?>");
        this.f113658l = sVar;
    }

    /* renamed from: b */
    public final void mo106143b(C42156aw awVar) {
        C7573i.m23587b(awVar, "<set-?>");
        this.f113649c = awVar;
    }

    /* renamed from: a */
    public final void mo106129a(C20676a aVar) {
        C7573i.m23587b(aVar, "<set-?>");
        this.f113652f = aVar;
    }

    /* renamed from: a */
    public final void mo106130a(C20705b bVar) {
        C7573i.m23587b(bVar, "<set-?>");
        this.f113657k = bVar;
    }

    /* renamed from: a */
    public final void mo106131a(C20719d dVar) {
        C7573i.m23587b(dVar, "<set-?>");
        this.f113656j = dVar;
    }

    /* renamed from: a */
    public final void mo106132a(IRecordingOperationPanel iRecordingOperationPanel) {
        C7573i.m23587b(iRecordingOperationPanel, "<set-?>");
        this.f113647a = iRecordingOperationPanel;
    }

    /* renamed from: a */
    public final void mo106133a(ShortVideoContext shortVideoContext) {
        C7573i.m23587b(shortVideoContext, "<set-?>");
        this.f113651e = shortVideoContext;
    }

    /* renamed from: a */
    public final void mo106134a(C38519c cVar) {
        C7573i.m23587b(cVar, "<set-?>");
        this.f113655i = cVar;
    }
}
