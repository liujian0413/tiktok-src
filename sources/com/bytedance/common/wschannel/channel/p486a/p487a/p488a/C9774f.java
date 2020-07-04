package com.bytedance.common.wschannel.channel.p486a.p487a.p488a;

import android.content.Context;

/* renamed from: com.bytedance.common.wschannel.channel.a.a.a.f */
public final class C9774f extends C9772d {

    /* renamed from: a */
    private final int f26563a;

    /* renamed from: b */
    private int f26564b;

    /* renamed from: c */
    public final void mo24198c() {
        super.mo24198c();
        this.f26564b = 0;
    }

    /* renamed from: a */
    public final long mo24195a() {
        long j;
        if (this.f26564b < this.f26563a) {
            j = super.mo24195a();
        } else {
            j = -1;
        }
        if (j != -1) {
            this.f26564b++;
        }
        return j;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RetryTimesPolicy{mMaxRetryTime=");
        sb.append(this.f26563a);
        sb.append(", mCurrRetryTime=");
        sb.append(this.f26564b);
        sb.append('}');
        return sb.toString();
    }

    public C9774f(Context context) {
        this(context, 4);
    }

    private C9774f(Context context, int i) {
        super(context);
        this.f26563a = 4;
    }
}
