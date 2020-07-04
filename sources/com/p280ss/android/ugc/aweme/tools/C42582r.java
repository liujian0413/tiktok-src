package com.p280ss.android.ugc.aweme.tools;

/* renamed from: com.ss.android.ugc.aweme.tools.r */
public class C42582r extends C42249c {

    /* renamed from: a */
    public final long f110730a;

    /* renamed from: b */
    public final String f110731b;

    /* renamed from: c */
    public final String f110732c;

    /* renamed from: d */
    public final int f110733d;

    public String toString() {
        StringBuilder sb = new StringBuilder("ConcatFinishedEvent{concatStartTime=");
        sb.append(this.f110730a);
        sb.append(", videoPath='");
        sb.append(this.f110731b);
        sb.append('\'');
        sb.append(", audioPath='");
        sb.append(this.f110732c);
        sb.append('\'');
        sb.append(", statusCode=");
        sb.append(this.f110733d);
        sb.append('}');
        return sb.toString();
    }

    public C42582r(long j, String str, String str2, int i) {
        this.f110730a = j;
        this.f110731b = str;
        this.f110732c = str2;
        this.f110733d = i;
    }
}
