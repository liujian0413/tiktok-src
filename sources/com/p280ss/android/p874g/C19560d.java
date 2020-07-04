package com.p280ss.android.p874g;

import android.media.MediaCodec.BufferInfo;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import com.p280ss.android.vesdk.C45372t;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: com.ss.android.g.d */
public final class C19560d {

    /* renamed from: a */
    private MediaMuxer f52926a;

    /* renamed from: b */
    private String f52927b;

    /* renamed from: c */
    private int f52928c;

    /* renamed from: d */
    private C19555b f52929d;

    /* renamed from: e */
    private boolean f52930e;

    /* renamed from: a */
    public final void mo51706a() {
        if (this.f52926a != null) {
            this.f52926a.start();
        }
        this.f52930e = false;
    }

    /* renamed from: b */
    public final void mo51708b() {
        this.f52930e = true;
        if (this.f52926a != null) {
            this.f52926a.stop();
        }
    }

    /* renamed from: c */
    public final void mo51709c() {
        if (!this.f52930e) {
            mo51708b();
        }
        if (this.f52926a != null) {
            this.f52926a.release();
            this.f52926a = null;
        }
    }

    /* renamed from: a */
    public final int mo51705a(MediaFormat mediaFormat) {
        try {
            this.f52926a = new MediaMuxer(this.f52927b, 0);
            this.f52928c = this.f52926a.addTrack(mediaFormat);
            return this.f52928c;
        } catch (IOException unused) {
            C45372t.m143409d("TEHwMuxer", "MediaMuxer create fail");
            return -1;
        }
    }

    public C19560d(String str, C19555b bVar) {
        this.f52927b = str;
        this.f52929d = bVar;
    }

    /* renamed from: a */
    public final void mo51707a(ByteBuffer byteBuffer, BufferInfo bufferInfo) {
        this.f52926a.writeSampleData(this.f52928c, byteBuffer, bufferInfo);
    }
}
