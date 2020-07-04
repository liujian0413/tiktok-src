package com.google.android.gms.internal.ads;

import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import java.io.IOException;

final class bjg {

    /* renamed from: b */
    private static final int[] f42265b = {PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: a */
    public int f42266a;

    /* renamed from: c */
    private final byte[] f42267c = new byte[8];

    /* renamed from: d */
    private int f42268d;

    /* renamed from: a */
    public final void mo40786a() {
        this.f42268d = 0;
        this.f42266a = 0;
    }

    /* renamed from: a */
    public final long mo40785a(bie bie, boolean z, boolean z2) throws IOException, InterruptedException {
        if (this.f42268d == 0) {
            if (!bie.mo40733a(this.f42267c, 0, 1, z)) {
                return -1;
            }
            byte b = this.f42267c[0] & 255;
            this.f42266a = -1;
            int i = 0;
            while (true) {
                if (i >= f42265b.length) {
                    break;
                } else if ((f42265b[i] & b) != 0) {
                    this.f42266a = i + 1;
                    break;
                } else {
                    i++;
                }
            }
            if (this.f42266a != -1) {
                this.f42268d = 1;
            } else {
                throw new IllegalStateException("No valid varint length mask found");
            }
        }
        bie.mo40732a(this.f42267c, 1, this.f42266a - 1);
        if (z2) {
            byte[] bArr = this.f42267c;
            bArr[0] = (byte) (bArr[0] & (f42265b[this.f42266a - 1] ^ -1));
        }
        long j = 0;
        for (int i2 = 0; i2 < this.f42266a; i2++) {
            j = (j << 8) | ((long) (this.f42267c[i2] & 255));
        }
        this.f42268d = 0;
        return j;
    }
}
