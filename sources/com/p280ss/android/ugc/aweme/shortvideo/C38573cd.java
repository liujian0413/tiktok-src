package com.p280ss.android.ugc.aweme.shortvideo;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cd */
public final class C38573cd {
    /* renamed from: a */
    public final MaxDurationTip mo96553a(long j, long j2) {
        return m123264a(j, j2, 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static MaxDurationTip m123264a(long j, long j2, long j3) {
        boolean z;
        boolean z2 = false;
        if (j2 != 0) {
            z = true;
        } else {
            z = false;
        }
        if (j3 != 0) {
            z2 = true;
        }
        if (!z && !z2) {
            return MaxDurationTip.NONE;
        }
        if (z && z2 && j2 != j3) {
            long min = Math.min(j, Math.min(j2, j3));
            if (min == j2 && min < j) {
                return MaxDurationTip.MUSIC;
            }
            if (min == j3 && min < j) {
                return MaxDurationTip.VIDEO;
            }
        }
        if (z) {
            long min2 = Math.min(j, j2);
            if (min2 == j2 && min2 < j) {
                return MaxDurationTip.MUSIC;
            }
        }
        if (z2) {
            long min3 = Math.min(j, j3);
            if (min3 == j3 && min3 < j) {
                return MaxDurationTip.VIDEO;
            }
        }
        return MaxDurationTip.NONE;
    }
}
