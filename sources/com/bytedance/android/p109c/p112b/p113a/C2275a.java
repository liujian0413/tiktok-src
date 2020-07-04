package com.bytedance.android.p109c.p112b.p113a;

import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;

/* renamed from: com.bytedance.android.c.b.a.a */
public final class C2275a {

    /* renamed from: a */
    private byte[] f7555a;

    /* renamed from: b */
    private int f7556b;

    /* renamed from: c */
    public static int m9792c(long j) {
        if ((-128 & j) == 0) {
            return 1;
        }
        if ((-16384 & j) == 0) {
            return 2;
        }
        if ((-2097152 & j) == 0) {
            return 3;
        }
        if ((-268435456 & j) == 0) {
            return 4;
        }
        if ((-34359738368L & j) == 0) {
            return 5;
        }
        if ((-4398046511104L & j) == 0) {
            return 6;
        }
        if ((-562949953421312L & j) == 0) {
            return 7;
        }
        if ((-72057594037927936L & j) == 0) {
            return 8;
        }
        return (j & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    /* renamed from: e */
    public static int m9794e(int i) {
        if ((i & -128) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) == 0) {
            return 3;
        }
        return (i & -268435456) == 0 ? 4 : 5;
    }

    /* renamed from: d */
    public static int m9793d(int i) {
        if (i >= 0) {
            return m9794e(i);
        }
        return 10;
    }

    /* renamed from: a */
    public final void mo8067a(int i) {
        if (i >= 0) {
            mo8071b(i);
        } else {
            mo8068a((long) i);
        }
    }

    /* renamed from: a */
    public final void mo8070a(byte[] bArr) {
        System.arraycopy(bArr, 0, this.f7555a, this.f7556b, bArr.length);
        this.f7556b += bArr.length;
    }

    /* renamed from: a */
    public final void mo8068a(long j) {
        while ((-128 & j) != 0) {
            byte[] bArr = this.f7555a;
            int i = this.f7556b;
            this.f7556b = i + 1;
            bArr[i] = (byte) ((((int) j) & 127) | PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
            j >>>= 7;
        }
        byte[] bArr2 = this.f7555a;
        int i2 = this.f7556b;
        this.f7556b = i2 + 1;
        bArr2[i2] = (byte) ((int) j);
    }

    /* renamed from: b */
    public final void mo8071b(int i) {
        while ((i & -128) != 0) {
            byte[] bArr = this.f7555a;
            int i2 = this.f7556b;
            this.f7556b = i2 + 1;
            bArr[i2] = (byte) ((i & 127) | PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
            i >>>= 7;
        }
        byte[] bArr2 = this.f7555a;
        int i3 = this.f7556b;
        this.f7556b = i3 + 1;
        bArr2[i3] = (byte) i;
    }

    /* renamed from: c */
    public final void mo8073c(int i) {
        byte[] bArr = this.f7555a;
        int i2 = this.f7556b;
        this.f7556b = i2 + 1;
        bArr[i2] = (byte) ((i >>> 24) & NormalGiftView.ALPHA_255);
        byte[] bArr2 = this.f7555a;
        int i3 = this.f7556b;
        this.f7556b = i3 + 1;
        bArr2[i3] = (byte) ((i >>> 16) & NormalGiftView.ALPHA_255);
        byte[] bArr3 = this.f7555a;
        int i4 = this.f7556b;
        this.f7556b = i4 + 1;
        bArr3[i4] = (byte) ((i >>> 8) & NormalGiftView.ALPHA_255);
        byte[] bArr4 = this.f7555a;
        int i5 = this.f7556b;
        this.f7556b = i5 + 1;
        bArr4[i5] = (byte) (i & NormalGiftView.ALPHA_255);
    }

    /* renamed from: b */
    public static int m9791b(String str) {
        int length = str.length();
        int i = 0;
        int i2 = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt >= 128) {
                if (charAt < 2048) {
                    i2 += 2;
                } else if (charAt < 55296 || charAt > 57343) {
                    i2 += 3;
                } else if (charAt <= 56319) {
                    int i3 = i + 1;
                    if (i3 < length && str.charAt(i3) >= 56320 && str.charAt(i3) <= 57343) {
                        i2 += 4;
                        i = i3;
                    }
                }
                i++;
            }
            i2++;
            i++;
        }
        return i2;
    }

    /* renamed from: a */
    public final void mo8069a(String str) {
        char c;
        int i = 0;
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt < 128) {
                byte[] bArr = this.f7555a;
                int i2 = this.f7556b;
                this.f7556b = i2 + 1;
                bArr[i2] = (byte) charAt;
                i++;
            } else if (charAt < 2048) {
                byte[] bArr2 = this.f7555a;
                int i3 = this.f7556b;
                this.f7556b = i3 + 1;
                bArr2[i3] = (byte) ((charAt >> 6) | 192);
                byte[] bArr3 = this.f7555a;
                int i4 = this.f7556b;
                this.f7556b = i4 + 1;
                bArr3[i4] = (byte) ((charAt & '?') | 128);
                i++;
            } else if (charAt < 55296 || charAt > 57343) {
                byte[] bArr4 = this.f7555a;
                int i5 = this.f7556b;
                this.f7556b = i5 + 1;
                bArr4[i5] = (byte) ((charAt >> 12) | 224);
                byte[] bArr5 = this.f7555a;
                int i6 = this.f7556b;
                this.f7556b = i6 + 1;
                bArr5[i6] = (byte) ((63 & (charAt >> 6)) | PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
                byte[] bArr6 = this.f7555a;
                int i7 = this.f7556b;
                this.f7556b = i7 + 1;
                bArr6[i7] = (byte) ((charAt & '?') | 128);
                i++;
            } else {
                int i8 = i + 1;
                if (i8 < str.length()) {
                    c = str.charAt(i8);
                } else {
                    c = 0;
                }
                if (charAt > 56319 || c < 56320 || c > 57343) {
                    byte[] bArr7 = this.f7555a;
                    int i9 = this.f7556b;
                    this.f7556b = i9 + 1;
                    bArr7[i9] = 63;
                    i = i8;
                } else {
                    int i10 = (((charAt & 10239) << 10) | (9215 & c)) + 0;
                    byte[] bArr8 = this.f7555a;
                    int i11 = this.f7556b;
                    this.f7556b = i11 + 1;
                    bArr8[i11] = (byte) ((i10 >> 18) | 240);
                    byte[] bArr9 = this.f7555a;
                    int i12 = this.f7556b;
                    this.f7556b = i12 + 1;
                    bArr9[i12] = (byte) (((i10 >> 12) & 63) | PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
                    byte[] bArr10 = this.f7555a;
                    int i13 = this.f7556b;
                    this.f7556b = i13 + 1;
                    bArr10[i13] = (byte) (((i10 >> 6) & 63) | PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
                    byte[] bArr11 = this.f7555a;
                    int i14 = this.f7556b;
                    this.f7556b = i14 + 1;
                    bArr11[i14] = (byte) ((i10 & 63) | PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
                    i += 2;
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo8072b(long j) {
        byte[] bArr = this.f7555a;
        int i = this.f7556b;
        this.f7556b = i + 1;
        bArr[i] = (byte) ((int) ((j >>> 56) & 255));
        byte[] bArr2 = this.f7555a;
        int i2 = this.f7556b;
        this.f7556b = i2 + 1;
        bArr2[i2] = (byte) ((int) ((j >>> 48) & 255));
        byte[] bArr3 = this.f7555a;
        int i3 = this.f7556b;
        this.f7556b = i3 + 1;
        bArr3[i3] = (byte) ((int) ((j >>> 40) & 255));
        byte[] bArr4 = this.f7555a;
        int i4 = this.f7556b;
        this.f7556b = i4 + 1;
        bArr4[i4] = (byte) ((int) ((j >>> 32) & 255));
        byte[] bArr5 = this.f7555a;
        int i5 = this.f7556b;
        this.f7556b = i5 + 1;
        bArr5[i5] = (byte) ((int) ((j >>> 24) & 255));
        byte[] bArr6 = this.f7555a;
        int i6 = this.f7556b;
        this.f7556b = i6 + 1;
        bArr6[i6] = (byte) ((int) ((j >>> 16) & 255));
        byte[] bArr7 = this.f7555a;
        int i7 = this.f7556b;
        this.f7556b = i7 + 1;
        bArr7[i7] = (byte) ((int) ((j >>> 8) & 255));
        byte[] bArr8 = this.f7555a;
        int i8 = this.f7556b;
        this.f7556b = i8 + 1;
        bArr8[i8] = (byte) ((int) (j & 255));
    }

    /* renamed from: a */
    public final C2275a mo8066a(byte[] bArr, int i) {
        this.f7555a = bArr;
        this.f7556b = 16;
        return this;
    }
}
