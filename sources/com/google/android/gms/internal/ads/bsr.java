package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCodec.OnFrameRenderedListener;
import android.os.Handler;

final class bsr implements OnFrameRenderedListener {

    /* renamed from: a */
    private final /* synthetic */ bso f43458a;

    private bsr(bso bso, MediaCodec mediaCodec) {
        this.f43458a = bso;
        mediaCodec.setOnFrameRenderedListener(this, new Handler());
    }

    public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
        if (this == this.f43458a.f43435f) {
            this.f43458a.mo40974s();
        }
    }
}
