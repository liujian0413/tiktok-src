package com.p280ss.android.ugc.aweme.account.p947j.p948a.p949a;

import com.bytedance.ies.abmock.C6384b;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.player.sdk.api.C34976f;
import com.p280ss.android.ugc.aweme.video.experiment.Get265DecodeTypeExperiment;
import com.p280ss.android.ugc.playerkit.videoview.VideoViewComponent;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.account.j.a.a.a */
public final class C21224a {

    /* renamed from: a */
    public VideoViewComponent f57024a;

    /* renamed from: b */
    public C34976f f57025b;

    /* renamed from: c */
    private Aweme f57026c;

    /* renamed from: e */
    private final boolean m71430e() {
        if (this.f57026c != null) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final void mo57155b() {
        this.f57024a.mo71672ad();
    }

    /* renamed from: c */
    public final void mo57156c() {
        if (m71430e()) {
            this.f57024a.mo71663a(this.f57025b);
            VideoViewComponent videoViewComponent = this.f57024a;
            Aweme aweme = this.f57026c;
            if (aweme == null) {
                C7573i.m23580a();
            }
            videoViewComponent.mo71660a(aweme.getVideo());
        }
    }

    /* renamed from: d */
    public final void mo57157d() {
        this.f57024a.mo71692b(this.f57025b);
        this.f57024a.mo71673ae();
        this.f57024a.mo107435b();
    }

    /* renamed from: a */
    public final void mo57153a() {
        if (m71430e()) {
            this.f57024a.mo71663a(this.f57025b);
            VideoViewComponent videoViewComponent = this.f57024a;
            Aweme aweme = this.f57026c;
            if (aweme == null) {
                C7573i.m23580a();
            }
            videoViewComponent.mo71661a(aweme.getVideo(), true, C6384b.m19835a().mo15287a(Get265DecodeTypeExperiment.class, true, "decoder_type", C6384b.m19835a().mo15295d().decoder_type, 0));
        }
    }

    /* renamed from: a */
    public final void mo57154a(Aweme aweme) {
        C7573i.m23587b(aweme, "aweme");
        this.f57026c = aweme;
    }

    public C21224a(VideoViewComponent videoViewComponent, C34976f fVar) {
        C7573i.m23587b(videoViewComponent, "videoView");
        C7573i.m23587b(fVar, "onUIPlayListener");
        this.f57024a = videoViewComponent;
        this.f57025b = fVar;
    }
}
