package com.p280ss.android.ugc.aweme.shortvideo.cut.videoeditv2;

import com.bytedance.common.utility.C6311g;
import com.p280ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.p1878b.C47891a;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2.b */
public final class C39278b {

    /* renamed from: e */
    public static final C39279a f101993e = new C39279a(null);

    /* renamed from: a */
    public float f101994a;

    /* renamed from: b */
    public long f101995b;

    /* renamed from: c */
    public long f101996c;

    /* renamed from: d */
    public long f101997d;

    /* renamed from: f */
    private float f101998f;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2.b$a */
    public static final class C39279a {
        private C39279a() {
        }

        public /* synthetic */ C39279a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static long m125549a(List<? extends VideoSegment> list, float f) {
            C7573i.m23587b(list, "videoSegmentList");
            if (C6311g.m19573a(list)) {
                return 0;
            }
            float f2 = 0.0f;
            for (VideoSegment videoSegment : list) {
                if (!videoSegment.f100768j) {
                    f2 += ((float) (videoSegment.f100763e - videoSegment.f100762d)) / (videoSegment.f100764f * f);
                }
            }
            return (long) f2;
        }

        /* renamed from: a */
        public static Pair<Integer, Float> m125550a(long j, float f, int i, List<? extends VideoSegment> list) {
            C7573i.m23587b(list, "videoList");
            float f2 = 0.0f;
            int i2 = 0;
            float f3 = 0.0f;
            for (VideoSegment videoSegment : list) {
                if (!videoSegment.f100768j) {
                    float f4 = (float) j;
                    if (f4 < f2) {
                        break;
                    }
                    float f5 = ((float) (videoSegment.f100763e - videoSegment.f100762d)) / videoSegment.f100764f;
                    float f6 = f2 + f5;
                    if (f4 >= f6) {
                        i2 += C47891a.m148821a((float) Math.ceil((double) (f5 / f)));
                    } else {
                        float f7 = f4 - f2;
                        int i3 = (int) (f7 / f);
                        i2 += i3;
                        f3 = ((f7 - (((float) i3) * f)) / f) * ((float) i);
                    }
                    f2 = f6;
                }
            }
            return new Pair<>(Integer.valueOf(i2), Float.valueOf(f3));
        }
    }

    /* renamed from: a */
    public static final long m125544a(List<? extends VideoSegment> list, float f) {
        return C39279a.m125549a(list, f);
    }

    /* renamed from: a */
    public static final Pair<Integer, Float> m125545a(long j, float f, int i, List<? extends VideoSegment> list) {
        return C39279a.m125550a(j, f, i, list);
    }

    public C39278b(float f) {
        this.f101998f = f;
    }

    /* renamed from: a */
    public final void mo97796a(long j) {
        this.f101995b = Math.min(Math.min(this.f101995b, j), this.f101996c);
        this.f101994a = ((float) this.f101995b) / this.f101998f;
    }

    /* renamed from: b */
    public final void mo97798b(long j, float f) {
        this.f101995b = Math.min(this.f101995b, j);
        this.f101994a = ((float) this.f101995b) / this.f101998f;
    }

    /* renamed from: a */
    public final void mo97797a(long j, float f) {
        this.f101995b = Math.min(Math.min(this.f101995b, (long) (((float) j) / f)), this.f101996c);
        this.f101994a = ((float) this.f101995b) / this.f101998f;
    }
}
