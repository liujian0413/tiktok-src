package com.google.android.gms.internal.ads;

import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.p280ss.ttm.player.MediaPlayer;
import java.nio.ShortBuffer;
import java.util.Arrays;

final class bmo {

    /* renamed from: a */
    public float f42652a;

    /* renamed from: b */
    public float f42653b;

    /* renamed from: c */
    public int f42654c;

    /* renamed from: d */
    private final int f42655d;

    /* renamed from: e */
    private final int f42656e;

    /* renamed from: f */
    private final int f42657f;

    /* renamed from: g */
    private final int f42658g;

    /* renamed from: h */
    private final int f42659h = (this.f42658g * 2);

    /* renamed from: i */
    private final short[] f42660i = new short[this.f42659h];

    /* renamed from: j */
    private int f42661j = this.f42659h;

    /* renamed from: k */
    private short[] f42662k;

    /* renamed from: l */
    private int f42663l;

    /* renamed from: m */
    private short[] f42664m;

    /* renamed from: n */
    private int f42665n;

    /* renamed from: o */
    private short[] f42666o;

    /* renamed from: p */
    private int f42667p;

    /* renamed from: q */
    private int f42668q;

    /* renamed from: r */
    private int f42669r;

    /* renamed from: s */
    private int f42670s;

    /* renamed from: t */
    private int f42671t;

    /* renamed from: u */
    private int f42672u;

    /* renamed from: v */
    private int f42673v;

    /* renamed from: w */
    private int f42674w;

    /* renamed from: x */
    private int f42675x;

    public bmo(int i, int i2) {
        this.f42655d = i;
        this.f42656e = i2;
        this.f42657f = i / MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL;
        this.f42658g = i / 65;
        this.f42662k = new short[(this.f42659h * i2)];
        this.f42663l = this.f42659h;
        this.f42664m = new short[(this.f42659h * i2)];
        this.f42665n = this.f42659h;
        this.f42666o = new short[(this.f42659h * i2)];
        this.f42652a = 1.0f;
        this.f42653b = 1.0f;
    }

    /* renamed from: a */
    public final void mo40978a(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining() / this.f42656e;
        int i = (this.f42656e * remaining) << 1;
        m49375b(remaining);
        shortBuffer.get(this.f42662k, this.f42669r * this.f42656e, i / 2);
        this.f42669r += remaining;
        m49374b();
    }

    /* renamed from: b */
    public final void mo40979b(ShortBuffer shortBuffer) {
        int min = Math.min(shortBuffer.remaining() / this.f42656e, this.f42654c);
        shortBuffer.put(this.f42664m, 0, this.f42656e * min);
        this.f42654c -= min;
        System.arraycopy(this.f42664m, min * this.f42656e, this.f42664m, 0, this.f42654c * this.f42656e);
    }

    /* renamed from: a */
    public final void mo40977a() {
        int i = this.f42669r;
        int i2 = this.f42654c + ((int) ((((((float) i) / (this.f42652a / this.f42653b)) + ((float) this.f42670s)) / this.f42653b) + 0.5f));
        m49375b((this.f42659h * 2) + i);
        for (int i3 = 0; i3 < this.f42659h * 2 * this.f42656e; i3++) {
            this.f42662k[(this.f42656e * i) + i3] = 0;
        }
        this.f42669r += this.f42659h * 2;
        m49374b();
        if (this.f42654c > i2) {
            this.f42654c = i2;
        }
        this.f42669r = 0;
        this.f42671t = 0;
        this.f42670s = 0;
    }

    /* renamed from: a */
    private final void m49371a(int i) {
        if (this.f42654c + i > this.f42663l) {
            this.f42663l += (this.f42663l / 2) + i;
            this.f42664m = Arrays.copyOf(this.f42664m, this.f42663l * this.f42656e);
        }
    }

    /* renamed from: b */
    private final void m49375b(int i) {
        if (this.f42669r + i > this.f42661j) {
            this.f42661j += (this.f42661j / 2) + i;
            this.f42662k = Arrays.copyOf(this.f42662k, this.f42661j * this.f42656e);
        }
    }

    /* renamed from: a */
    private final void m49373a(short[] sArr, int i, int i2) {
        m49371a(i2);
        System.arraycopy(sArr, i * this.f42656e, this.f42664m, this.f42654c * this.f42656e, this.f42656e * i2);
        this.f42654c += i2;
    }

    /* renamed from: b */
    private final void m49376b(short[] sArr, int i, int i2) {
        int i3 = this.f42659h / i2;
        int i4 = this.f42656e * i2;
        int i5 = i * this.f42656e;
        for (int i6 = 0; i6 < i3; i6++) {
            int i7 = 0;
            for (int i8 = 0; i8 < i4; i8++) {
                i7 += sArr[(i6 * i4) + i5 + i8];
            }
            this.f42660i[i6] = (short) (i7 / i4);
        }
    }

    /* renamed from: a */
    private final int m49370a(short[] sArr, int i, int i2, int i3) {
        int i4 = i * this.f42656e;
        int i5 = 1;
        int i6 = 0;
        int i7 = 0;
        int i8 = NormalGiftView.ALPHA_255;
        while (i2 <= i3) {
            int i9 = 0;
            for (int i10 = 0; i10 < i2; i10++) {
                short s = sArr[i4 + i10];
                short s2 = sArr[i4 + i2 + i10];
                i9 += s >= s2 ? s - s2 : s2 - s;
            }
            if (i9 * i6 < i5 * i2) {
                i6 = i2;
                i5 = i9;
            }
            if (i9 * i8 > i7 * i2) {
                i8 = i2;
                i7 = i9;
            }
            i2++;
        }
        this.f42674w = i5 / i6;
        this.f42675x = i7 / i8;
        return i6;
    }

    /* renamed from: b */
    private final void m49374b() {
        int i;
        int i2;
        int i3;
        int i4 = this.f42654c;
        float f = this.f42652a / this.f42653b;
        double d = (double) f;
        int i5 = 1;
        if (d <= 1.00001d && d >= 0.99999d) {
            m49373a(this.f42662k, 0, this.f42669r);
            this.f42669r = 0;
        } else if (this.f42669r >= this.f42659h) {
            int i6 = this.f42669r;
            int i7 = 0;
            while (true) {
                if (this.f42671t > 0) {
                    int min = Math.min(this.f42659h, this.f42671t);
                    m49373a(this.f42662k, i7, min);
                    this.f42671t -= min;
                    i7 += min;
                } else {
                    short[] sArr = this.f42662k;
                    int i8 = this.f42655d > 4000 ? this.f42655d / 4000 : 1;
                    if (this.f42656e == i5 && i8 == i5) {
                        i = m49370a(sArr, i7, this.f42657f, this.f42658g);
                    } else {
                        m49376b(sArr, i7, i8);
                        int a = m49370a(this.f42660i, 0, this.f42657f / i8, this.f42658g / i8);
                        if (i8 != i5) {
                            int i9 = a * i8;
                            int i10 = i8 << 2;
                            int i11 = i9 - i10;
                            int i12 = i9 + i10;
                            if (i11 < this.f42657f) {
                                i11 = this.f42657f;
                            }
                            if (i12 > this.f42658g) {
                                i12 = this.f42658g;
                            }
                            if (this.f42656e == i5) {
                                i = m49370a(sArr, i7, i11, i12);
                            } else {
                                m49376b(sArr, i7, i5);
                                i = m49370a(this.f42660i, 0, i11, i12);
                            }
                        } else {
                            i = a;
                        }
                    }
                    int i13 = this.f42674w;
                    int i14 = i13 != 0 && this.f42672u != 0 && this.f42675x <= i13 * 3 && (i13 << 1) > this.f42673v * 3 ? this.f42672u : i;
                    this.f42673v = this.f42674w;
                    this.f42672u = i;
                    if (d > 1.0d) {
                        short[] sArr2 = this.f42662k;
                        if (f >= 2.0f) {
                            i3 = (int) (((float) i14) / (f - 1.0f));
                        } else {
                            this.f42671t = (int) ((((float) i14) * (2.0f - f)) / (f - 1.0f));
                            i3 = i14;
                        }
                        m49371a(i3);
                        int i15 = i3;
                        int i16 = i14;
                        int i17 = i7;
                        m49372a(i3, this.f42656e, this.f42664m, this.f42654c, sArr2, i7, sArr2, i7 + i14);
                        this.f42654c += i15;
                        i7 = i17 + i16 + i15;
                    } else {
                        int i18 = i14;
                        int i19 = i7;
                        short[] sArr3 = this.f42662k;
                        if (f < 0.5f) {
                            i2 = (int) ((((float) i18) * f) / (1.0f - f));
                        } else {
                            this.f42671t = (int) ((((float) i18) * ((2.0f * f) - 1.0f)) / (1.0f - f));
                            i2 = i18;
                        }
                        int i20 = i18 + i2;
                        m49371a(i20);
                        System.arraycopy(sArr3, this.f42656e * i19, this.f42664m, this.f42654c * this.f42656e, this.f42656e * i18);
                        int i21 = i20;
                        m49372a(i2, this.f42656e, this.f42664m, this.f42654c + i18, sArr3, i19 + i18, sArr3, i19);
                        this.f42654c += i21;
                        i7 = i19 + i2;
                    }
                }
                if (this.f42659h + i7 > i6) {
                    break;
                }
                i5 = 1;
            }
            int i22 = this.f42669r - i7;
            System.arraycopy(this.f42662k, i7 * this.f42656e, this.f42662k, 0, this.f42656e * i22);
            this.f42669r = i22;
        }
        if (this.f42653b != 1.0f) {
            float f2 = this.f42653b;
            if (this.f42654c != i4) {
                int i23 = (int) (((float) this.f42655d) / f2);
                int i24 = this.f42655d;
                while (true) {
                    if (i23 <= 16384 && i24 <= 16384) {
                        break;
                    }
                    i23 /= 2;
                    i24 /= 2;
                }
                int i25 = this.f42654c - i4;
                if (this.f42670s + i25 > this.f42665n) {
                    this.f42665n += (this.f42665n / 2) + i25;
                    this.f42666o = Arrays.copyOf(this.f42666o, this.f42665n * this.f42656e);
                }
                System.arraycopy(this.f42664m, this.f42656e * i4, this.f42666o, this.f42670s * this.f42656e, this.f42656e * i25);
                this.f42654c = i4;
                this.f42670s += i25;
                int i26 = 0;
                while (true) {
                    int i27 = 1;
                    if (i26 >= this.f42670s - 1) {
                        break;
                    }
                    while ((this.f42667p + i27) * i23 > this.f42668q * i24) {
                        m49371a(i27);
                        for (int i28 = 0; i28 < this.f42656e; i28++) {
                            short[] sArr4 = this.f42664m;
                            int i29 = (this.f42654c * this.f42656e) + i28;
                            short[] sArr5 = this.f42666o;
                            int i30 = (this.f42656e * i26) + i28;
                            short s = sArr5[i30];
                            short s2 = sArr5[i30 + this.f42656e];
                            int i31 = (this.f42667p + 1) * i23;
                            int i32 = i31 - (this.f42668q * i24);
                            int i33 = i31 - (this.f42667p * i23);
                            sArr4[i29] = (short) (((s * i32) + ((i33 - i32) * s2)) / i33);
                        }
                        i27 = 1;
                        this.f42668q++;
                        this.f42654c++;
                    }
                    this.f42667p += i27;
                    if (this.f42667p == i24) {
                        this.f42667p = 0;
                        brr.m49873b(this.f42668q == i23);
                        this.f42668q = 0;
                    }
                    i26++;
                }
                int i34 = this.f42670s - 1;
                if (i34 != 0) {
                    System.arraycopy(this.f42666o, this.f42656e * i34, this.f42666o, 0, (this.f42670s - i34) * this.f42656e);
                    this.f42670s -= i34;
                }
            }
        }
    }

    /* renamed from: a */
    private static void m49372a(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i4 * i2) + i6;
            int i8 = (i5 * i2) + i6;
            int i9 = (i3 * i2) + i6;
            for (int i10 = 0; i10 < i; i10++) {
                sArr[i9] = (short) (((sArr2[i7] * (i - i10)) + (sArr3[i8] * i10)) / i);
                i9 += i2;
                i7 += i2;
                i8 += i2;
            }
        }
    }
}
