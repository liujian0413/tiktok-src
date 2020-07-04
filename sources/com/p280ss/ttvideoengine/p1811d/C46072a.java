package com.p280ss.ttvideoengine.p1811d;

import android.os.Bundle;
import com.p280ss.ttvideoengine.log.C46145e;
import com.p280ss.ttvideoengine.log.C46157m;

/* renamed from: com.ss.ttvideoengine.d.a */
final class C46072a implements C46073b {

    /* renamed from: a */
    private Bundle f117762a = new Bundle();

    /* renamed from: b */
    private int f117763b;

    /* renamed from: c */
    private long f117764c;

    /* renamed from: d */
    private long f117765d;

    /* renamed from: e */
    private long f117766e;

    /* renamed from: f */
    private long f117767f;

    /* renamed from: g */
    private long f117768g;

    /* renamed from: a */
    public final long mo112207a(String str) {
        return this.f117762a.getLong(str);
    }

    public C46072a(int i) {
        this.f117763b = i;
    }

    /* renamed from: a */
    public final void mo112208a(C46145e eVar) {
        long j;
        if (eVar != null) {
            long j2 = 0;
            if (eVar.f118127am > 0) {
                j = eVar.f118127am - eVar.f118225i;
            } else {
                j = 0;
            }
            this.f117764c = j;
            this.f117765d = eVar.f118128an - eVar.f118225i;
            this.f117766e = eVar.f118130ap - eVar.f118225i;
            this.f117767f = eVar.f118227k - eVar.f118225i;
            if (eVar.f118219cy > 0) {
                j2 = eVar.f118219cy - eVar.f118225i;
            }
            this.f117768g = j2;
            this.f117762a.putLong("ffr_read_head_duration", this.f117764c);
            this.f117762a.putLong("ffr_read_first_data_duration", this.f117765d);
            this.f117762a.putLong("ffr_decode_duration", this.f117766e);
            this.f117762a.putLong("ffr_render_duration", this.f117767f);
            this.f117762a.putLong("ffr_playback_buffering_duration", this.f117768g);
        }
    }

    /* renamed from: a */
    public final void mo112209a(C46157m mVar) {
        long j;
        if (mVar != null) {
            long j2 = 0;
            if (mVar.f118532Y > 0) {
                j = mVar.f118532Y - mVar.f118640c;
            } else {
                j = 0;
            }
            this.f117764c = j;
            this.f117765d = mVar.f118533Z - mVar.f118640c;
            this.f117766e = mVar.f118562ab - mVar.f118640c;
            this.f117767f = mVar.f118645e - mVar.f118640c;
            if (mVar.f118642cb > 0) {
                j2 = mVar.f118642cb - mVar.f118640c;
            }
            this.f117768g = j2;
            this.f117762a.putLong("ffr_read_head_duration", this.f117764c);
            this.f117762a.putLong("ffr_read_first_data_duration", this.f117765d);
            this.f117762a.putLong("ffr_decode_duration", this.f117766e);
            this.f117762a.putLong("ffr_render_duration", this.f117767f);
            this.f117762a.putLong("ffr_playback_buffering_duration", this.f117768g);
        }
    }
}
