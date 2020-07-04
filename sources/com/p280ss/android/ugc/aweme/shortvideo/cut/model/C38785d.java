package com.p280ss.android.ugc.aweme.shortvideo.cut.model;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.model.d */
public final class C38785d {

    /* renamed from: a */
    public long f100795a;

    /* renamed from: b */
    public long f100796b;

    /* renamed from: c */
    public int f100797c;

    /* renamed from: d */
    public float f100798d = 1.0f;

    /* renamed from: a */
    public final void mo96925a() {
        this.f100795a = 0;
        this.f100796b = 0;
        this.f100797c = 0;
        this.f100798d = 1.0f;
    }

    public C38785d(VideoSegment videoSegment) {
        this.f100795a = videoSegment.mo96909h();
        this.f100796b = videoSegment.mo96910i();
        this.f100797c = videoSegment.f100769k;
        this.f100798d = videoSegment.mo96911j();
        if (videoSegment.mo96912k()) {
            this.f100795a = videoSegment.f100774p.getVideoStart();
            this.f100796b = videoSegment.f100774p.getVideoEnd();
        }
    }

    /* renamed from: a */
    public final void mo96926a(VideoSegment videoSegment) {
        this.f100795a = videoSegment.mo96909h();
        this.f100796b = videoSegment.mo96910i();
        this.f100797c = videoSegment.f100769k;
        this.f100798d = videoSegment.mo96911j();
        if (videoSegment.mo96912k()) {
            this.f100795a = videoSegment.f100774p.getVideoStart();
            this.f100796b = videoSegment.f100774p.getVideoEnd();
        }
    }
}
