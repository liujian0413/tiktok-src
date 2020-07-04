package com.p280ss.android.vesdk;

/* renamed from: com.ss.android.vesdk.VEPerformanceUtils */
public final class VEPerformanceUtils {

    /* renamed from: a */
    private String f116365a = "VEPerformanceUtils";

    /* renamed from: b */
    private volatile long f116366b;

    /* renamed from: c */
    private volatile long f116367c;

    /* renamed from: d */
    private volatile boolean f116368d;

    /* renamed from: e */
    private boolean f116369e = true;

    /* renamed from: com.ss.android.vesdk.VEPerformanceUtils$Status */
    public enum Status {
        STATUS_DISABLED,
        STATUS_OK,
        STATUS_MARKED
    }

    /* renamed from: a */
    public final Status mo108047a() {
        if (!this.f116369e) {
            return Status.STATUS_DISABLED;
        }
        this.f116368d = true;
        this.f116367c = System.currentTimeMillis();
        return Status.STATUS_OK;
    }

    public VEPerformanceUtils(String str) {
        this.f116365a = str;
    }

    /* renamed from: a */
    public final long mo108046a(String str) {
        if (!this.f116369e) {
            return 0;
        }
        this.f116366b = System.currentTimeMillis();
        long j = this.f116366b - this.f116367c;
        String str2 = this.f116365a;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" cost ");
        sb.append(j);
        sb.append("ms");
        C45372t.m143403a(str2, sb.toString());
        this.f116367c = this.f116366b;
        return j;
    }
}
