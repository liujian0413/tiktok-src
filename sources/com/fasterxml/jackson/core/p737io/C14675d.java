package com.fasterxml.jackson.core.p737io;

import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.fasterxml.jackson.core.util.C14680a;
import com.fasterxml.jackson.core.util.C14681b;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import java.lang.ref.SoftReference;

/* renamed from: com.fasterxml.jackson.core.io.d */
public final class C14675d {

    /* renamed from: a */
    protected static final ThreadLocal<SoftReference<C14675d>> f37942a = new ThreadLocal<>();

    /* renamed from: e */
    private static final char[] f37943e = C14673b.m42440d();

    /* renamed from: f */
    private static final byte[] f37944f = C14673b.m42441e();

    /* renamed from: b */
    protected C14681b f37945b;

    /* renamed from: c */
    protected C14680a f37946c;

    /* renamed from: d */
    protected final char[] f37947d = new char[6];

    public C14675d() {
        this.f37947d[0] = '\\';
        this.f37947d[2] = '0';
        this.f37947d[3] = '0';
    }

    /* renamed from: a */
    public static C14675d m42455a() {
        C14675d dVar;
        SoftReference softReference = (SoftReference) f37942a.get();
        if (softReference == null) {
            dVar = null;
        } else {
            dVar = (C14675d) softReference.get();
        }
        if (dVar != null) {
            return dVar;
        }
        C14675d dVar2 = new C14675d();
        f37942a.set(new SoftReference(dVar2));
        return dVar2;
    }

    /* renamed from: c */
    public final byte[] mo37206c(String str) {
        int i;
        C14680a aVar = this.f37946c;
        if (aVar == null) {
            aVar = new C14680a(null);
            this.f37946c = aVar;
        }
        int length = str.length();
        byte[] a = aVar.mo37257a();
        byte[] bArr = a;
        int length2 = a.length;
        int i2 = 0;
        int i3 = 0;
        loop0:
        while (true) {
            if (i2 >= length) {
                break;
            }
            int i4 = i2 + 1;
            int charAt = str.charAt(i2);
            while (charAt <= 127) {
                if (i3 >= length2) {
                    byte[] b = aVar.mo37258b();
                    length2 = b.length;
                    bArr = b;
                    i3 = 0;
                }
                int i5 = i3 + 1;
                bArr[i3] = (byte) charAt;
                if (i4 >= length) {
                    i3 = i5;
                    break loop0;
                }
                int i6 = i4 + 1;
                int charAt2 = str.charAt(i4);
                i4 = i6;
                charAt = charAt2;
                i3 = i5;
            }
            if (i3 >= length2) {
                bArr = aVar.mo37258b();
                length2 = bArr.length;
                i3 = 0;
            }
            if (charAt < 2048) {
                int i7 = i3 + 1;
                bArr[i3] = (byte) ((charAt >> 6) | 192);
                i = i7;
            } else if (charAt < 55296 || charAt > 57343) {
                int i8 = i3 + 1;
                bArr[i3] = (byte) ((charAt >> 12) | 224);
                if (i8 >= length2) {
                    bArr = aVar.mo37258b();
                    length2 = bArr.length;
                    i8 = 0;
                }
                i = i8 + 1;
                bArr[i8] = (byte) (((charAt >> 6) & 63) | PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
            } else {
                if (charAt > 56319) {
                    m42456a(charAt);
                }
                if (i4 >= length) {
                    m42456a(charAt);
                }
                int i9 = i4 + 1;
                charAt = m42452a(charAt, (int) str.charAt(i4));
                if (charAt > 1114111) {
                    m42456a(charAt);
                }
                int i10 = i3 + 1;
                bArr[i3] = (byte) ((charAt >> 18) | 240);
                if (i10 >= length2) {
                    bArr = aVar.mo37258b();
                    length2 = bArr.length;
                    i10 = 0;
                }
                int i11 = i10 + 1;
                bArr[i10] = (byte) (((charAt >> 12) & 63) | PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
                if (i11 >= length2) {
                    byte[] b2 = aVar.mo37258b();
                    length2 = b2.length;
                    bArr = b2;
                    i11 = 0;
                }
                int i12 = i11 + 1;
                bArr[i11] = (byte) (((charAt >> 6) & 63) | PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
                i = i12;
                i4 = i9;
            }
            if (i >= length2) {
                byte[] b3 = aVar.mo37258b();
                length2 = b3.length;
                bArr = b3;
                i = 0;
            }
            int i13 = i + 1;
            bArr[i] = (byte) ((charAt & 63) | PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
            i2 = i4;
            i3 = i13;
        }
        return this.f37946c.mo37259b(i3);
    }

    /* renamed from: a */
    private static void m42456a(int i) {
        if (i > 1114111) {
            StringBuilder sb = new StringBuilder("Illegal character point (0x");
            sb.append(Integer.toHexString(i));
            sb.append(") to output; max is 0x10FFFF as per RFC 4627");
            throw new IllegalArgumentException(sb.toString());
        } else if (i < 55296) {
            StringBuilder sb2 = new StringBuilder("Illegal character point (0x");
            sb2.append(Integer.toHexString(i));
            sb2.append(") to output");
            throw new IllegalArgumentException(sb2.toString());
        } else if (i <= 56319) {
            StringBuilder sb3 = new StringBuilder("Unmatched first part of surrogate pair (0x");
            sb3.append(Integer.toHexString(i));
            sb3.append(")");
            throw new IllegalArgumentException(sb3.toString());
        } else {
            StringBuilder sb4 = new StringBuilder("Unmatched second part of surrogate pair (0x");
            sb4.append(Integer.toHexString(i));
            sb4.append(")");
            throw new IllegalArgumentException(sb4.toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0042, code lost:
        if (r4 < r5.length) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0044, code lost:
        r5 = r0.mo37258b();
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0049, code lost:
        r7 = r2 + 1;
        r2 = r11.charAt(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004f, code lost:
        if (r2 > 127) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0051, code lost:
        r4 = m42453a(r2, r6[r2], r0, r4);
        r5 = r0.f37967a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005d, code lost:
        if (r2 > 2047) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005f, code lost:
        r6 = r4 + 1;
        r5[r4] = (byte) ((r2 >> 6) | 192);
        r2 = (r2 & '?') | 128;
        r4 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0072, code lost:
        if (r2 < 55296) goto L_0x00d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0077, code lost:
        if (r2 <= 57343) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x007d, code lost:
        if (r2 <= 56319) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x007f, code lost:
        m42456a((int) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0082, code lost:
        if (r7 < r1) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0084, code lost:
        m42456a((int) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0087, code lost:
        r6 = r7 + 1;
        r2 = m42452a((int) r2, (int) r11.charAt(r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0094, code lost:
        if (r2 <= 1114111) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0096, code lost:
        m42456a(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0099, code lost:
        r7 = r4 + 1;
        r5[r4] = (byte) ((r2 >> 18) | 240);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a3, code lost:
        if (r7 < r5.length) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a5, code lost:
        r5 = r0.mo37258b();
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00aa, code lost:
        r4 = r7 + 1;
        r5[r7] = (byte) (((r2 >> 12) & 63) | com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00b6, code lost:
        if (r4 < r5.length) goto L_0x00be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b8, code lost:
        r5 = r0.mo37258b();
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00be, code lost:
        r7 = r4 + 1;
        r5[r4] = (byte) (((r2 >> 6) & 63) | com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
        r2 = (r2 & '?') | 128;
        r4 = r7;
        r7 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00d0, code lost:
        r6 = r4 + 1;
        r5[r4] = (byte) ((r2 >> 12) | 224);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00da, code lost:
        if (r6 < r5.length) goto L_0x00e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00dc, code lost:
        r5 = r0.mo37258b();
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00e1, code lost:
        r4 = r6 + 1;
        r5[r6] = (byte) (((r2 >> 6) & 63) | com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
        r2 = (r2 & '?') | 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00f1, code lost:
        if (r4 < r5.length) goto L_0x00f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00f3, code lost:
        r5 = r0.mo37258b();
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00f9, code lost:
        r6 = r4 + 1;
        r5[r4] = (byte) r2;
        r4 = r6;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] mo37205b(java.lang.String r11) {
        /*
            r10 = this;
            com.fasterxml.jackson.core.util.a r0 = r10.f37946c
            if (r0 != 0) goto L_0x000c
            com.fasterxml.jackson.core.util.a r0 = new com.fasterxml.jackson.core.util.a
            r1 = 0
            r0.<init>(r1)
            r10.f37946c = r0
        L_0x000c:
            int r1 = r11.length()
            byte[] r2 = r0.mo37257a()
            r3 = 0
            r5 = r2
            r2 = 0
            r4 = 0
        L_0x0018:
            if (r2 >= r1) goto L_0x0101
            int[] r6 = com.fasterxml.jackson.core.p737io.C14673b.m42439c()
        L_0x001e:
            char r7 = r11.charAt(r2)
            r8 = 127(0x7f, float:1.78E-43)
            if (r7 > r8) goto L_0x0041
            r9 = r6[r7]
            if (r9 != 0) goto L_0x0041
            int r8 = r5.length
            if (r4 < r8) goto L_0x0033
            byte[] r4 = r0.mo37258b()
            r5 = r4
            r4 = 0
        L_0x0033:
            int r8 = r4 + 1
            byte r7 = (byte) r7
            r5[r4] = r7
            int r2 = r2 + 1
            if (r2 >= r1) goto L_0x003e
            r4 = r8
            goto L_0x001e
        L_0x003e:
            r4 = r8
            goto L_0x0101
        L_0x0041:
            int r7 = r5.length
            if (r4 < r7) goto L_0x0049
            byte[] r5 = r0.mo37258b()
            r4 = 0
        L_0x0049:
            int r7 = r2 + 1
            char r2 = r11.charAt(r2)
            if (r2 > r8) goto L_0x005b
            r5 = r6[r2]
            int r4 = m42453a(r2, r5, r0, r4)
            byte[] r5 = r0.f37967a
        L_0x0059:
            r2 = r7
            goto L_0x0018
        L_0x005b:
            r6 = 2047(0x7ff, float:2.868E-42)
            if (r2 > r6) goto L_0x006f
            int r6 = r4 + 1
            int r8 = r2 >> 6
            r8 = r8 | 192(0xc0, float:2.69E-43)
            byte r8 = (byte) r8
            r5[r4] = r8
            r2 = r2 & 63
            r2 = r2 | 128(0x80, float:1.794E-43)
            r4 = r6
            goto L_0x00f0
        L_0x006f:
            r6 = 55296(0xd800, float:7.7486E-41)
            if (r2 < r6) goto L_0x00d0
            r6 = 57343(0xdfff, float:8.0355E-41)
            if (r2 <= r6) goto L_0x007a
            goto L_0x00d0
        L_0x007a:
            r6 = 56319(0xdbff, float:7.892E-41)
            if (r2 <= r6) goto L_0x0082
            m42456a(r2)
        L_0x0082:
            if (r7 < r1) goto L_0x0087
            m42456a(r2)
        L_0x0087:
            int r6 = r7 + 1
            char r7 = r11.charAt(r7)
            int r2 = m42452a(r2, r7)
            r7 = 1114111(0x10ffff, float:1.561202E-39)
            if (r2 <= r7) goto L_0x0099
            m42456a(r2)
        L_0x0099:
            int r7 = r4 + 1
            int r8 = r2 >> 18
            r8 = r8 | 240(0xf0, float:3.36E-43)
            byte r8 = (byte) r8
            r5[r4] = r8
            int r4 = r5.length
            if (r7 < r4) goto L_0x00aa
            byte[] r5 = r0.mo37258b()
            r7 = 0
        L_0x00aa:
            int r4 = r7 + 1
            int r8 = r2 >> 12
            r8 = r8 & 63
            r8 = r8 | 128(0x80, float:1.794E-43)
            byte r8 = (byte) r8
            r5[r7] = r8
            int r7 = r5.length
            if (r4 < r7) goto L_0x00be
            byte[] r4 = r0.mo37258b()
            r5 = r4
            r4 = 0
        L_0x00be:
            int r7 = r4 + 1
            int r8 = r2 >> 6
            r8 = r8 & 63
            r8 = r8 | 128(0x80, float:1.794E-43)
            byte r8 = (byte) r8
            r5[r4] = r8
            r2 = r2 & 63
            r2 = r2 | 128(0x80, float:1.794E-43)
            r4 = r7
            r7 = r6
            goto L_0x00f0
        L_0x00d0:
            int r6 = r4 + 1
            int r8 = r2 >> 12
            r8 = r8 | 224(0xe0, float:3.14E-43)
            byte r8 = (byte) r8
            r5[r4] = r8
            int r4 = r5.length
            if (r6 < r4) goto L_0x00e1
            byte[] r5 = r0.mo37258b()
            r6 = 0
        L_0x00e1:
            int r4 = r6 + 1
            int r8 = r2 >> 6
            r8 = r8 & 63
            r8 = r8 | 128(0x80, float:1.794E-43)
            byte r8 = (byte) r8
            r5[r6] = r8
            r2 = r2 & 63
            r2 = r2 | 128(0x80, float:1.794E-43)
        L_0x00f0:
            int r6 = r5.length
            if (r4 < r6) goto L_0x00f9
            byte[] r4 = r0.mo37258b()
            r5 = r4
            r4 = 0
        L_0x00f9:
            int r6 = r4 + 1
            byte r2 = (byte) r2
            r5[r4] = r2
            r4 = r6
            goto L_0x0059
        L_0x0101:
            com.fasterxml.jackson.core.util.a r11 = r10.f37946c
            byte[] r11 = r11.mo37259b(r4)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.p737io.C14675d.mo37205b(java.lang.String):byte[]");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0032, code lost:
        if (r9 >= 0) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0034, code lost:
        r1 = m42454a((int) r1, r11.f37947d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003b, code lost:
        r1 = m42457b(r9, r11.f37947d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0041, code lost:
        r9 = r6 + r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0044, code lost:
        if (r9 <= r7.length) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0046, code lost:
        r9 = r7.length - r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0048, code lost:
        if (r9 <= 0) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004a, code lost:
        java.lang.System.arraycopy(r11.f37947d, 0, r7, r6, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004f, code lost:
        r7 = r0.mo37268d();
        r6 = r1 - r9;
        java.lang.System.arraycopy(r11.f37947d, r9, r7, 0, r6);
        r1 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005c, code lost:
        java.lang.System.arraycopy(r11.f37947d, 0, r7, r6, r1);
        r1 = r8;
        r6 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002a, code lost:
        r8 = r1 + 1;
        r1 = r12.charAt(r1);
        r9 = r2[r1];
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final char[] mo37204a(java.lang.String r12) {
        /*
            r11 = this;
            com.fasterxml.jackson.core.util.b r0 = r11.f37945b
            if (r0 != 0) goto L_0x000c
            com.fasterxml.jackson.core.util.b r0 = new com.fasterxml.jackson.core.util.b
            r1 = 0
            r0.<init>(r1)
            r11.f37945b = r0
        L_0x000c:
            char[] r1 = r0.mo37267c()
            int[] r2 = com.fasterxml.jackson.core.p737io.C14673b.m42439c()
            int r3 = r2.length
            int r4 = r12.length()
            r5 = 0
            r7 = r1
            r1 = 0
            r6 = 0
        L_0x001d:
            if (r1 >= r4) goto L_0x0077
        L_0x001f:
            char r8 = r12.charAt(r1)
            if (r8 >= r3) goto L_0x0064
            r9 = r2[r8]
            if (r9 != 0) goto L_0x002a
            goto L_0x0064
        L_0x002a:
            int r8 = r1 + 1
            char r1 = r12.charAt(r1)
            r9 = r2[r1]
            if (r9 >= 0) goto L_0x003b
            char[] r9 = r11.f37947d
            int r1 = m42454a(r1, r9)
            goto L_0x0041
        L_0x003b:
            char[] r1 = r11.f37947d
            int r1 = m42457b(r9, r1)
        L_0x0041:
            int r9 = r6 + r1
            int r10 = r7.length
            if (r9 <= r10) goto L_0x005c
            int r9 = r7.length
            int r9 = r9 - r6
            if (r9 <= 0) goto L_0x004f
            char[] r10 = r11.f37947d
            java.lang.System.arraycopy(r10, r5, r7, r6, r9)
        L_0x004f:
            char[] r7 = r0.mo37268d()
            int r6 = r1 - r9
            char[] r1 = r11.f37947d
            java.lang.System.arraycopy(r1, r9, r7, r5, r6)
            r1 = r8
            goto L_0x001d
        L_0x005c:
            char[] r10 = r11.f37947d
            java.lang.System.arraycopy(r10, r5, r7, r6, r1)
            r1 = r8
            r6 = r9
            goto L_0x001d
        L_0x0064:
            int r9 = r7.length
            if (r6 < r9) goto L_0x006c
            char[] r7 = r0.mo37268d()
            r6 = 0
        L_0x006c:
            int r9 = r6 + 1
            r7[r6] = r8
            int r1 = r1 + 1
            if (r1 >= r4) goto L_0x0076
            r6 = r9
            goto L_0x001f
        L_0x0076:
            r6 = r9
        L_0x0077:
            r0.f37973b = r6
            char[] r12 = r0.mo37266b()
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.p737io.C14675d.mo37204a(java.lang.String):char[]");
    }

    /* renamed from: b */
    private static int m42457b(int i, char[] cArr) {
        cArr[1] = (char) i;
        return 2;
    }

    /* renamed from: a */
    private static int m42454a(int i, char[] cArr) {
        cArr[1] = 'u';
        cArr[4] = f37943e[i >> 4];
        cArr[5] = f37943e[i & 15];
        return 6;
    }

    /* renamed from: a */
    private static int m42452a(int i, int i2) {
        if (i2 >= 56320 && i2 <= 57343) {
            return ((i - 55296) << 10) + 65536 + (i2 - 56320);
        }
        StringBuilder sb = new StringBuilder("Broken surrogate pair: first char 0x");
        sb.append(Integer.toHexString(i));
        sb.append(", second 0x");
        sb.append(Integer.toHexString(i2));
        sb.append("; illegal combination");
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    private static int m42453a(int i, int i2, C14680a aVar, int i3) {
        aVar.f37968b = i3;
        aVar.mo37256a(92);
        if (i2 < 0) {
            aVar.mo37256a(117);
            if (i > 255) {
                int i4 = i >> 8;
                aVar.mo37256a(f37944f[i4 >> 4]);
                aVar.mo37256a(f37944f[i4 & 15]);
                i &= NormalGiftView.ALPHA_255;
            } else {
                aVar.mo37256a(48);
                aVar.mo37256a(48);
            }
            aVar.mo37256a(f37944f[i >> 4]);
            aVar.mo37256a(f37944f[i & 15]);
        } else {
            aVar.mo37256a((byte) i2);
        }
        return aVar.f37968b;
    }
}
