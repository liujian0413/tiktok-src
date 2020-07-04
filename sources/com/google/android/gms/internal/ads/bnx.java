package com.google.android.gms.internal.ads;

import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import java.io.IOException;

final class bnx {

    /* renamed from: a */
    private final bsa f42844a = new bsa(8);

    /* renamed from: b */
    private int f42845b;

    /* renamed from: a */
    public final boolean mo41046a(bne bne) throws IOException, InterruptedException {
        bne bne2 = bne;
        long c = bne.mo41010c();
        long j = 1024;
        if (c != -1 && c <= 1024) {
            j = c;
        }
        int i = (int) j;
        bne2.mo41012c(this.f42844a.f43388a, 0, 4);
        this.f42845b = 4;
        for (long h = this.f42844a.mo41230h(); h != 440786851; h = ((h << 8) & -256) | ((long) (this.f42844a.f43388a[0] & 255))) {
            int i2 = this.f42845b + 1;
            this.f42845b = i2;
            if (i2 == i) {
                return false;
            }
            bne2.mo41012c(this.f42844a.f43388a, 0, 1);
        }
        long b = m49514b(bne);
        long j2 = (long) this.f42845b;
        if (b == Long.MIN_VALUE || (c != -1 && j2 + b >= c)) {
            return false;
        }
        while (true) {
            long j3 = j2 + b;
            if (((long) this.f42845b) < j3) {
                if (m49514b(bne) == Long.MIN_VALUE) {
                    return false;
                }
                long b2 = m49514b(bne);
                if (b2 < 0 || b2 > 2147483647L) {
                    return false;
                }
                if (b2 != 0) {
                    bne2.mo41011c((int) b2);
                    this.f42845b = (int) (((long) this.f42845b) + b2);
                }
            } else if (((long) this.f42845b) == j3) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    /* renamed from: b */
    private final long m49514b(bne bne) throws IOException, InterruptedException {
        int i = 0;
        bne.mo41012c(this.f42844a.f43388a, 0, 1);
        byte b = this.f42844a.f43388a[0] & 255;
        if (b == 0) {
            return Long.MIN_VALUE;
        }
        int i2 = PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH;
        int i3 = 0;
        while ((b & i2) == 0) {
            i2 >>= 1;
            i3++;
        }
        int i4 = b & (i2 ^ -1);
        bne.mo41012c(this.f42844a.f43388a, 1, i3);
        while (i < i3) {
            i++;
            i4 = (this.f42844a.f43388a[i] & 255) + (i4 << 8);
        }
        this.f42845b += i3 + 1;
        return (long) i4;
    }
}
