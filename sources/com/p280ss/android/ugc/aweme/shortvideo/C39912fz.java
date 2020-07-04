package com.p280ss.android.ugc.aweme.shortvideo;

import com.google.common.util.concurrent.C18245g;
import com.p280ss.android.ugc.aweme.base.C6893q;
import dmt.p1861av.video.C47440an;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.fz */
public final class C39912fz implements C18245g<SynthetiseResult> {

    /* renamed from: a */
    private List<String> f103683a;

    public final void onFailure(Throwable th) {
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onSuccess(SynthetiseResult synthetiseResult) {
        m127677b(synthetiseResult);
    }

    public C39912fz(List<String> list) {
        this.f103683a = list;
    }

    /* renamed from: b */
    private void m127677b(SynthetiseResult synthetiseResult) {
        if (synthetiseResult.audioLength - synthetiseResult.videoLength > 3000.0f) {
            C6893q.m21447a("aweme_synthesis_lost_video_log", C38510bb.m123095a().mo96481a("fileInfo", synthetiseResult.toString()).mo96479a("duration", Integer.valueOf(C47440an.m148112d(synthetiseResult.inputVideoFile))).mo96482b());
        }
        if (!this.f103683a.isEmpty()) {
            C6893q.m21447a("aweme_synthesis_skip_frame_log", C38510bb.m123095a().mo96481a("fileInfo", this.f103683a.toString()).mo96482b());
        }
    }
}
