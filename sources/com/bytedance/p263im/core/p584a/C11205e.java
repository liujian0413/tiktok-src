package com.bytedance.p263im.core.p584a;

import android.os.Looper;
import com.p280ss.android.ugc.aweme.feed.experiment.DouPlusShareGuideExperiment;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheTTnetPreloadTimeoutExperiment;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.p280ss.android.vesdk.filterparam.VETransitionFilterParam;
import java.util.concurrent.ExecutorService;

/* renamed from: com.bytedance.im.core.a.e */
public final class C11205e {

    /* renamed from: A */
    public boolean f30391A;

    /* renamed from: B */
    public boolean f30392B;

    /* renamed from: C */
    public int f30393C = 20;

    /* renamed from: D */
    public boolean f30394D;

    /* renamed from: E */
    public int f30395E = 10;

    /* renamed from: F */
    public long f30396F = DouPlusShareGuideExperiment.MIN_VALID_DURATION;

    /* renamed from: G */
    public ExecutorService f30397G;

    /* renamed from: H */
    public Looper f30398H;

    /* renamed from: I */
    public String f30399I = "";

    /* renamed from: J */
    public boolean f30400J = true;

    /* renamed from: a */
    public int f30401a = 6;

    /* renamed from: b */
    public int f30402b;

    /* renamed from: c */
    public int f30403c;

    /* renamed from: d */
    public String f30404d;

    /* renamed from: e */
    public boolean f30405e = true;

    /* renamed from: f */
    public String f30406f;

    /* renamed from: g */
    public int f30407g = 6144;

    /* renamed from: h */
    public int f30408h = PreloadTask.BYTE_UNIT_NUMBER;

    /* renamed from: i */
    public int f30409i = -1;

    /* renamed from: j */
    public int f30410j;

    /* renamed from: k */
    public int f30411k;

    /* renamed from: l */
    public int f30412l = 3;

    /* renamed from: m */
    public int f30413m = VETransitionFilterParam.TransitionDuration_DEFAULT;

    /* renamed from: n */
    public int f30414n = VideoCacheTTnetPreloadTimeoutExperiment.DEFAULT;

    /* renamed from: o */
    public int[] f30415o = {0};

    /* renamed from: p */
    public int[] f30416p;

    /* renamed from: q */
    public boolean f30417q;

    /* renamed from: r */
    public int f30418r;

    /* renamed from: s */
    public int f30419s;

    /* renamed from: t */
    public int f30420t = 1;

    /* renamed from: u */
    public boolean f30421u;

    /* renamed from: v */
    public boolean f30422v;

    /* renamed from: w */
    public boolean f30423w = true;

    /* renamed from: x */
    public String f30424x;

    /* renamed from: y */
    public boolean f30425y;

    /* renamed from: z */
    public boolean f30426z;

    /* renamed from: b */
    public static C11205e m32807b() {
        return new C11205e();
    }

    /* renamed from: a */
    public final boolean mo27255a() {
        if (!this.f30417q) {
            return false;
        }
        int[] iArr = this.f30416p;
        if (iArr == null) {
            iArr = this.f30415o;
        }
        if (iArr == null || iArr.length <= 1) {
            return false;
        }
        return true;
    }
}
