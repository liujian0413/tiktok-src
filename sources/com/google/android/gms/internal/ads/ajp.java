package com.google.android.gms.internal.ads;

import java.io.IOException;

@C6505uv
final class ajp implements bjp {

    /* renamed from: a */
    private final bjp f40422a;

    /* renamed from: b */
    private final long f40423b;

    /* renamed from: c */
    private final bjp f40424c;

    /* renamed from: d */
    private long f40425d;

    ajp(bjp bjp, int i, bjp bjp2) {
        this.f40422a = bjp;
        this.f40423b = (long) i;
        this.f40424c = bjp2;
    }

    /* renamed from: a */
    public final long mo39543a(bjq bjq) throws IOException {
        bjq bjq2;
        bjq bjq3;
        long j;
        bjq bjq4 = bjq;
        if (bjq4.f42327c >= this.f40423b) {
            bjq2 = null;
        } else {
            long j2 = bjq4.f42327c;
            if (bjq4.f42328d != -1) {
                j = Math.min(bjq4.f42328d, this.f40423b - j2);
            } else {
                j = this.f40423b - j2;
            }
            bjq2 = new bjq(bjq4.f42325a, j2, j, null);
        }
        if (bjq4.f42328d == -1 || bjq4.f42327c + bjq4.f42328d > this.f40423b) {
            bjq3 = new bjq(bjq4.f42325a, Math.max(this.f40423b, bjq4.f42327c), bjq4.f42328d != -1 ? Math.min(bjq4.f42328d, (bjq4.f42327c + bjq4.f42328d) - this.f40423b) : -1, null);
        } else {
            bjq3 = null;
        }
        long j3 = 0;
        long a = bjq2 != null ? this.f40422a.mo39543a(bjq2) : 0;
        if (bjq3 != null) {
            j3 = this.f40424c.mo39543a(bjq3);
        }
        this.f40425d = bjq4.f42327c;
        if (a == -1 || j3 == -1) {
            return -1;
        }
        return a + j3;
    }

    /* renamed from: a */
    public final int mo39542a(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        if (this.f40425d < this.f40423b) {
            i3 = this.f40422a.mo39542a(bArr, i, (int) Math.min((long) i2, this.f40423b - this.f40425d));
            this.f40425d += (long) i3;
        } else {
            i3 = 0;
        }
        if (this.f40425d < this.f40423b) {
            return i3;
        }
        int a = this.f40424c.mo39542a(bArr, i + i3, i2 - i3);
        int i4 = i3 + a;
        this.f40425d += (long) a;
        return i4;
    }

    /* renamed from: a */
    public final void mo39544a() throws IOException {
        this.f40422a.mo39544a();
        this.f40424c.mo39544a();
    }
}
