package com.google.android.gms.internal.ads;

import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import java.util.Collections;

public final class bkd {

    /* renamed from: a */
    private static final int[] f42372a = {48000, 44100, 32000};

    /* renamed from: b */
    private static final int[] f42373b = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: c */
    private static final int[] f42374c = {32, 40, 48, 56, 64, 80, 96, 112, PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};

    /* renamed from: d */
    private static final int[] f42375d = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* renamed from: a */
    public static bhl m49055a(bkj bkj) {
        int i = f42372a[(bkj.mo40808a() & 192) >> 6];
        int a = bkj.mo40808a();
        int i2 = f42373b[(a & 56) >> 3];
        if ((a & 4) != 0) {
            i2++;
        }
        return bhl.m48812b("audio/ac3", -1, -1, i2, i, Collections.emptyList());
    }

    /* renamed from: b */
    public static bhl m49056b(bkj bkj) {
        bkj.mo40813b(2);
        int i = f42372a[(bkj.mo40808a() & 192) >> 6];
        int a = bkj.mo40808a();
        int i2 = f42373b[(a & 14) >> 1];
        if ((a & 1) != 0) {
            i2++;
        }
        return bhl.m48808a("audio/eac3", -1, i2, i, Collections.emptyList());
    }

    /* renamed from: a */
    public static int m49054a(int i, int i2) {
        return (((i << 3) * i2) + 768000) / 1536000;
    }
}
