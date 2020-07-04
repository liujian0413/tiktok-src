package com.p280ss.android.ugc.aweme.tools.live;

import android.arch.lifecycle.C0063u;
import com.p280ss.android.ugc.asve.recorder.p922b.C20676a;
import com.p280ss.android.ugc.aweme.services.recording.IRecordingOperationPanel;
import com.p280ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p280ss.android.ugc.aweme.shortvideo.record.CameraModule;
import com.p280ss.android.ugc.aweme.tools.C42156aw;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.tools.live.RecordLiveViewModel */
public final class RecordLiveViewModel extends C0063u {

    /* renamed from: a */
    public IRecordingOperationPanel f110150a;

    /* renamed from: b */
    public C42156aw f110151b;

    /* renamed from: c */
    public CameraModule f110152c;

    /* renamed from: d */
    public C20676a f110153d;

    /* renamed from: e */
    public ShortVideoContext f110154e;

    /* renamed from: a */
    public final C42156aw mo103829a() {
        C42156aw awVar = this.f110151b;
        if (awVar == null) {
            C7573i.m23583a("uiEventContext");
        }
        return awVar;
    }

    /* renamed from: b */
    public final CameraModule mo103833b() {
        CameraModule cameraModule = this.f110152c;
        if (cameraModule == null) {
            C7573i.m23583a("cameraModule");
        }
        return cameraModule;
    }

    /* renamed from: c */
    public final C20676a mo103834c() {
        C20676a aVar = this.f110153d;
        if (aVar == null) {
            C7573i.m23583a("mediaController");
        }
        return aVar;
    }

    /* renamed from: a */
    public final void mo103830a(C20676a aVar) {
        C7573i.m23587b(aVar, "<set-?>");
        this.f110153d = aVar;
    }

    /* renamed from: a */
    public final void mo103831a(CameraModule cameraModule) {
        C7573i.m23587b(cameraModule, "<set-?>");
        this.f110152c = cameraModule;
    }

    /* renamed from: a */
    public final void mo103832a(C42156aw awVar) {
        C7573i.m23587b(awVar, "<set-?>");
        this.f110151b = awVar;
    }
}
