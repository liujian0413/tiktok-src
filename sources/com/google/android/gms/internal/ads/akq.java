package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;

@C6505uv
final class akq implements bre {

    /* renamed from: a */
    private final bre f40521a;

    /* renamed from: b */
    private final long f40522b;

    /* renamed from: c */
    private final bre f40523c;

    /* renamed from: d */
    private long f40524d;

    /* renamed from: e */
    private Uri f40525e;

    akq(bre bre, int i, bre bre2) {
        this.f40521a = bre;
        this.f40522b = (long) i;
        this.f40523c = bre2;
    }

    /* renamed from: a */
    public final long mo39589a(brg brg) throws IOException {
        brg brg2;
        brg brg3;
        long j;
        brg brg4 = brg;
        this.f40525e = brg4.f43314a;
        if (brg4.f43317d >= this.f40522b) {
            brg2 = null;
        } else {
            long j2 = brg4.f43317d;
            if (brg4.f43318e != -1) {
                j = Math.min(brg4.f43318e, this.f40522b - j2);
            } else {
                j = this.f40522b - j2;
            }
            brg2 = new brg(brg4.f43314a, j2, j, null);
        }
        if (brg4.f43318e == -1 || brg4.f43317d + brg4.f43318e > this.f40522b) {
            brg3 = new brg(brg4.f43314a, Math.max(this.f40522b, brg4.f43317d), brg4.f43318e != -1 ? Math.min(brg4.f43318e, (brg4.f43317d + brg4.f43318e) - this.f40522b) : -1, null);
        } else {
            brg3 = null;
        }
        long j3 = 0;
        long a = brg2 != null ? this.f40521a.mo39589a(brg2) : 0;
        if (brg3 != null) {
            j3 = this.f40523c.mo39589a(brg3);
        }
        this.f40524d = brg4.f43317d;
        if (a == -1 || j3 == -1) {
            return -1;
        }
        return a + j3;
    }

    /* renamed from: a */
    public final int mo39588a(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        if (this.f40524d < this.f40522b) {
            i3 = this.f40521a.mo39588a(bArr, i, (int) Math.min((long) i2, this.f40522b - this.f40524d));
            this.f40524d += (long) i3;
        } else {
            i3 = 0;
        }
        if (this.f40524d < this.f40522b) {
            return i3;
        }
        int a = this.f40523c.mo39588a(bArr, i + i3, i2 - i3);
        int i4 = i3 + a;
        this.f40524d += (long) a;
        return i4;
    }

    /* renamed from: a */
    public final Uri mo39590a() {
        return this.f40525e;
    }

    /* renamed from: b */
    public final void mo39592b() throws IOException {
        this.f40521a.mo39592b();
        this.f40523c.mo39592b();
    }
}
