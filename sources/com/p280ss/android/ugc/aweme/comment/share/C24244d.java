package com.p280ss.android.ugc.aweme.comment.share;

import com.bytedance.ies.abmock.C6384b;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.player.sdk.api.C34976f;
import com.p280ss.android.ugc.aweme.video.experiment.Get265DecodeTypeExperiment;
import com.p280ss.android.ugc.playerkit.videoview.VideoViewComponent;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.comment.share.d */
public final class C24244d {

    /* renamed from: a */
    public VideoViewComponent f63972a;

    /* renamed from: b */
    public C34976f f63973b;

    /* renamed from: c */
    private Aweme f63974c;

    /* renamed from: e */
    private final boolean m79626e() {
        if (this.f63974c != null) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final void mo63029b() {
        this.f63972a.mo71672ad();
    }

    /* renamed from: c */
    public final void mo63030c() {
        if (m79626e()) {
            this.f63972a.mo71663a(this.f63973b);
            VideoViewComponent videoViewComponent = this.f63972a;
            Aweme aweme = this.f63974c;
            if (aweme == null) {
                C7573i.m23580a();
            }
            videoViewComponent.mo71660a(aweme.getVideo());
        }
    }

    /* renamed from: d */
    public final void mo63031d() {
        this.f63972a.mo71692b(this.f63973b);
        this.f63972a.mo71673ae();
        this.f63972a.mo107435b();
    }

    /* renamed from: a */
    public final void mo63027a() {
        if (m79626e()) {
            this.f63972a.mo71663a(this.f63973b);
            VideoViewComponent videoViewComponent = this.f63972a;
            Aweme aweme = this.f63974c;
            if (aweme == null) {
                C7573i.m23580a();
            }
            videoViewComponent.mo71661a(aweme.getVideo(), true, C6384b.m19835a().mo15287a(Get265DecodeTypeExperiment.class, true, "decoder_type", C6384b.m19835a().mo15295d().decoder_type, 0));
        }
    }

    /* renamed from: a */
    public final void mo63028a(Aweme aweme) {
        C7573i.m23587b(aweme, "aweme");
        this.f63974c = aweme;
    }

    public C24244d(VideoViewComponent videoViewComponent, C34976f fVar) {
        C7573i.m23587b(videoViewComponent, "videoView");
        C7573i.m23587b(fVar, "onUIPlayListener");
        this.f63972a = videoViewComponent;
        this.f63973b = fVar;
    }
}
