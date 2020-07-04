package com.google.android.gms.internal.ads;

import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import java.nio.ByteBuffer;

public final class blq {

    /* renamed from: a */
    private static final int[] f42523a = {1, 2, 3, 6};

    /* renamed from: b */
    private static final int[] f42524b = {48000, 44100, 32000};

    /* renamed from: c */
    private static final int[] f42525c = {24000, 22050, 16000};

    /* renamed from: d */
    private static final int[] f42526d = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: e */
    private static final int[] f42527e = {32, 40, 48, 56, 64, 80, 96, 112, PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};

    /* renamed from: f */
    private static final int[] f42528f = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* renamed from: a */
    public static zzlg m49254a(bsa bsa, String str, String str2, zznd zznd) {
        int i = f42524b[(bsa.mo41224d() & 192) >> 6];
        int d = bsa.mo41224d();
        int i2 = f42526d[(d & 56) >> 3];
        if ((d & 4) != 0) {
            i2++;
        }
        return zzlg.m53192a(str, "audio/ac3", null, -1, -1, i2, i, null, null, 0, str2);
    }

    /* renamed from: b */
    public static zzlg m49255b(bsa bsa, String str, String str2, zznd zznd) {
        bsa.mo41225d(2);
        int i = f42524b[(bsa.mo41224d() & 192) >> 6];
        int d = bsa.mo41224d();
        int i2 = f42526d[(d & 14) >> 1];
        if ((d & 1) != 0) {
            i2++;
        }
        return zzlg.m53192a(str, "audio/eac3", null, -1, -1, i2, i, null, null, 0, str2);
    }

    /* renamed from: a */
    public static int m49253a(ByteBuffer byteBuffer) {
        int i = 6;
        if (((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3) {
            i = f42523a[(byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4];
        }
        return i * 256;
    }
}
