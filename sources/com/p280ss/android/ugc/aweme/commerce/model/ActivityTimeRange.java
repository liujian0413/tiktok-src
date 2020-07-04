package com.p280ss.android.ugc.aweme.commerce.model;

import com.google.gson.p276a.C6593c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.commerce.model.ActivityTimeRange */
public final class ActivityTimeRange implements Serializable {
    @C6593c(mo15949a = "end")
    public float end;
    @C6593c(mo15949a = "start")
    public float start;

    public ActivityTimeRange() {
    }

    public static /* synthetic */ ActivityTimeRange copy$default(ActivityTimeRange activityTimeRange, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = activityTimeRange.start;
        }
        if ((i & 2) != 0) {
            f2 = activityTimeRange.end;
        }
        return activityTimeRange.copy(f, f2);
    }

    public final float component1() {
        return this.start;
    }

    public final float component2() {
        return this.end;
    }

    public final ActivityTimeRange copy(float f, float f2) {
        return new ActivityTimeRange(f, f2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (java.lang.Float.compare(r2.end, r3.end) == 0) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.p280ss.android.ugc.aweme.commerce.model.ActivityTimeRange
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.commerce.model.ActivityTimeRange r3 = (com.p280ss.android.ugc.aweme.commerce.model.ActivityTimeRange) r3
            float r0 = r2.start
            float r1 = r3.start
            int r0 = java.lang.Float.compare(r0, r1)
            if (r0 != 0) goto L_0x001d
            float r0 = r2.end
            float r3 = r3.end
            int r3 = java.lang.Float.compare(r0, r3)
            if (r3 != 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r3 = 0
            return r3
        L_0x001f:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.commerce.model.ActivityTimeRange.equals(java.lang.Object):boolean");
    }

    public final float getEnd() {
        return this.end;
    }

    public final float getStart() {
        return this.start;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.start) * 31) + Float.floatToIntBits(this.end);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActivityTimeRange(start=");
        sb.append(this.start);
        sb.append(", end=");
        sb.append(this.end);
        sb.append(")");
        return sb.toString();
    }

    public ActivityTimeRange(float f, float f2) {
        this.start = f;
        this.end = f2;
    }
}
