package com.p280ss.android.websocket.p344ws.p1782c;

import android.content.Context;
import com.p280ss.android.websocket.p344ws.output.WSHandShakeState;

/* renamed from: com.ss.android.websocket.ws.c.c */
public final class C45452c extends C45450a {

    /* renamed from: a */
    private int f117056a;

    /* renamed from: b */
    private int f117057b;

    /* renamed from: a */
    public final void mo108843a() {
        super.mo108843a();
        this.f117057b = 0;
    }

    public C45452c(Context context) {
        this(context, 3);
    }

    /* renamed from: a */
    public final long mo108842a(WSHandShakeState wSHandShakeState) {
        long j;
        if (this.f117057b < this.f117056a) {
            j = super.mo108842a(wSHandShakeState);
        } else {
            j = -1;
        }
        if (j != -1) {
            this.f117057b++;
        }
        return j;
    }

    private C45452c(Context context, int i) {
        super(context);
        this.f117056a = 3;
    }
}
