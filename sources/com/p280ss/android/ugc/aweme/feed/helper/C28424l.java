package com.p280ss.android.ugc.aweme.feed.helper;

import com.bytedance.ies.abmock.C6384b;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.player.sdk.api.C34976f;
import com.p280ss.android.ugc.aweme.video.experiment.Get265DecodeTypeExperiment;
import com.p280ss.android.ugc.playerkit.videoview.VideoViewComponent;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.feed.helper.l */
public final class C28424l {

    /* renamed from: a */
    public VideoViewComponent f74952a;

    /* renamed from: b */
    public C34976f f74953b;

    /* renamed from: c */
    private Aweme f74954c;

    /* renamed from: e */
    private final boolean m93423e() {
        if (this.f74954c != null) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final void mo72161b() {
        this.f74952a.mo71672ad();
    }

    /* renamed from: c */
    public final void mo72162c() {
        if (m93423e()) {
            this.f74952a.mo71663a(this.f74953b);
            VideoViewComponent videoViewComponent = this.f74952a;
            Aweme aweme = this.f74954c;
            if (aweme == null) {
                C7573i.m23580a();
            }
            videoViewComponent.mo71660a(aweme.getVideo());
        }
    }

    /* renamed from: d */
    public final void mo72163d() {
        this.f74952a.mo71692b(this.f74953b);
        this.f74952a.mo71673ae();
        this.f74952a.mo107435b();
    }

    /* renamed from: a */
    public final void mo72159a() {
        if (m93423e()) {
            this.f74952a.mo71663a(this.f74953b);
            VideoViewComponent videoViewComponent = this.f74952a;
            Aweme aweme = this.f74954c;
            if (aweme == null) {
                C7573i.m23580a();
            }
            videoViewComponent.mo71661a(aweme.getVideo(), true, C6384b.m19835a().mo15287a(Get265DecodeTypeExperiment.class, true, "decoder_type", C6384b.m19835a().mo15295d().decoder_type, 0));
        }
    }

    /* renamed from: a */
    public final void mo72160a(Aweme aweme) {
        C7573i.m23587b(aweme, "aweme");
        this.f74954c = aweme;
    }

    public C28424l(VideoViewComponent videoViewComponent, C34976f fVar) {
        C7573i.m23587b(videoViewComponent, "videoView");
        C7573i.m23587b(fVar, "onUIPlayListener");
        this.f74952a = videoViewComponent;
        this.f74953b = fVar;
    }
}
