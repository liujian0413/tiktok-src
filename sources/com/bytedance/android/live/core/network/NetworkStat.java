package com.bytedance.android.live.core.network;

public final class NetworkStat {

    /* renamed from: c */
    public static final NetworkStat f9752c = new NetworkStat(Status.RUNNING, null);

    /* renamed from: d */
    public static final NetworkStat f9753d = new NetworkStat(Status.SUCCESS, null);

    /* renamed from: a */
    public Status f9754a;

    /* renamed from: b */
    public Throwable f9755b;

    public enum Status {
        RUNNING(0),
        SUCCESS(1),
        FAILED(-1);
        
        public final int mStatus;

        private Status(int i) {
            this.mStatus = i;
        }
    }

    /* renamed from: a */
    public final boolean mo10025a() {
        if (this.f9754a == Status.RUNNING) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo10026b() {
        if (this.f9754a == Status.FAILED) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final boolean mo10027c() {
        if (this.f9754a == Status.SUCCESS) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static NetworkStat m12010a(Throwable th) {
        return new NetworkStat(Status.FAILED, th);
    }

    private NetworkStat(Status status, Throwable th) {
        this.f9754a = status;
        this.f9755b = th;
    }
}
