package com.p280ss.android.ugc.aweme.shortvideo.festival;

import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.festival.j */
public final class C39877j implements C39876i {

    /* renamed from: a */
    private float f103613a;

    /* renamed from: b */
    private boolean f103614b;

    /* renamed from: c */
    private boolean f103615c;

    /* renamed from: b */
    private final int m127616b(VideoProcess videoProcess) {
        return (int) ((((float) videoProcess.getWeight()) / this.f103613a) * 100.0f);
    }

    /* renamed from: a */
    private final void m127615a(VideoProcess videoProcess) {
        switch (C39878k.f103616a[videoProcess.ordinal()]) {
            case 1:
                this.f103614b = true;
                return;
            case 2:
                this.f103615c = true;
                break;
        }
    }

    /* renamed from: c */
    private final int m127617c(VideoProcess videoProcess) {
        int i = 0;
        if (videoProcess != VideoProcess.VIDEO_DOWNLOAD_TYPE && this.f103614b) {
            i = 0 + m127616b(VideoProcess.VIDEO_DOWNLOAD_TYPE);
        }
        if (videoProcess == VideoProcess.VIDEO_WATER_TYPE || !this.f103615c) {
            return i;
        }
        return i + m127616b(VideoProcess.VIDEO_WATER_TYPE);
    }

    public C39877j(boolean z, boolean z2) {
        if (z) {
            this.f103613a += (float) VideoProcess.VIDEO_DOWNLOAD_TYPE.getWeight();
        }
        if (z2) {
            this.f103613a += (float) VideoProcess.VIDEO_WATER_TYPE.getWeight();
        }
    }

    /* renamed from: a */
    public final int mo99298a(VideoProcess videoProcess, int i) {
        C7573i.m23587b(videoProcess, "videoProcess");
        m127615a(videoProcess);
        return (int) (((((float) videoProcess.getWeight()) / this.f103613a) * ((float) i)) + ((float) m127617c(videoProcess)));
    }
}
