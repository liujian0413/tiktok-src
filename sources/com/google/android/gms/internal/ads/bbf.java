package com.google.android.gms.internal.ads;

import com.C1642a;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;

public final class bbf {

    /* renamed from: a */
    private final ByteBuffer f41358a;

    /* renamed from: b */
    private zzccv f41359b;

    /* renamed from: c */
    private int f41360c;

    private bbf(byte[] bArr, int i, int i2) {
        this(ByteBuffer.wrap(bArr, 0, i2));
    }

    /* renamed from: b */
    public static int m48359b(long j) {
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
    private static int m48362e(int i) {
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

    private bbf(ByteBuffer byteBuffer) {
        this.f41358a = byteBuffer;
        this.f41358a.order(ByteOrder.LITTLE_ENDIAN);
    }

    /* renamed from: a */
    public static bbf m48351a(byte[] bArr) {
        return m48352a(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public static bbf m48352a(byte[] bArr, int i, int i2) {
        return new bbf(bArr, 0, i2);
    }

    /* renamed from: a */
    public final void mo40465a(int i, int i2) throws IOException {
        mo40472c(i, 0);
        if (i2 >= 0) {
            m48361d(i2);
        } else {
            mo40471a((long) i2);
        }
    }

    /* renamed from: a */
    public final void mo40469a(int i, boolean z) throws IOException {
        mo40472c(3, 0);
        byte b = z ? (byte) 1 : 0;
        if (this.f41358a.hasRemaining()) {
            this.f41358a.put(b);
            return;
        }
        throw new zzchd(this.f41358a.position(), this.f41358a.limit());
    }

    /* renamed from: a */
    public final void mo40468a(int i, String str) throws IOException {
        mo40472c(i, 2);
        try {
            int e = m48362e(str.length());
            if (e == m48362e(str.length() * 3)) {
                int position = this.f41358a.position();
                if (this.f41358a.remaining() >= e) {
                    this.f41358a.position(position + e);
                    m48353a((CharSequence) str, this.f41358a);
                    int position2 = this.f41358a.position();
                    this.f41358a.position(position);
                    m48361d((position2 - position) - e);
                    this.f41358a.position(position2);
                    return;
                }
                throw new zzchd(position + e, this.f41358a.limit());
            }
            m48361d(m48349a((CharSequence) str));
            m48353a((CharSequence) str, this.f41358a);
        } catch (BufferOverflowException e2) {
            zzchd zzchd = new zzchd(this.f41358a.position(), this.f41358a.limit());
            zzchd.initCause(e2);
            throw zzchd;
        }
    }

    /* renamed from: a */
    public final void mo40467a(int i, bbl bbl) throws IOException {
        mo40472c(i, 2);
        if (bbl.f41373b < 0) {
            bbl.mo40488c();
        }
        m48361d(bbl.f41373b);
        bbl.mo40474a(this);
    }

    /* renamed from: a */
    public final void mo40466a(int i, aza aza) throws IOException {
        if (this.f41359b == null) {
            this.f41359b = zzccv.m52997a(this.f41358a);
            this.f41360c = this.f41358a.position();
        } else if (this.f41360c != this.f41358a.position()) {
            this.f41359b.mo42321b(this.f41358a.array(), this.f41360c, this.f41358a.position() - this.f41360c);
            this.f41360c = this.f41358a.position();
        }
        zzccv zzccv = this.f41359b;
        zzccv.mo42302a(i, aza);
        zzccv.mo42293a();
        this.f41360c = this.f41358a.position();
    }

    /* renamed from: a */
    public final void mo40470a(int i, byte[] bArr) throws IOException {
        mo40472c(i, 2);
        m48361d(bArr.length);
        int length = bArr.length;
        if (this.f41358a.remaining() >= length) {
            this.f41358a.put(bArr, 0, length);
            return;
        }
        throw new zzchd(this.f41358a.position(), this.f41358a.limit());
    }

    /* renamed from: a */
    private static int m48349a(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = charSequence.length();
                while (i2 < length2) {
                    char charAt2 = charSequence.charAt(i2);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i2) >= 65536) {
                                i2++;
                            } else {
                                StringBuilder sb = new StringBuilder(39);
                                sb.append("Unpaired surrogate at index ");
                                sb.append(i2);
                                throw new IllegalArgumentException(sb.toString());
                            }
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        long j = ((long) i3) + 4294967296L;
        StringBuilder sb2 = new StringBuilder(54);
        sb2.append("UTF-8 length does not fit in int: ");
        sb2.append(j);
        throw new IllegalArgumentException(sb2.toString());
    }

    /* renamed from: a */
    private static void m48353a(CharSequence charSequence, ByteBuffer byteBuffer) {
        int i;
        int i2;
        if (!byteBuffer.isReadOnly()) {
            int i3 = 0;
            if (byteBuffer.hasArray()) {
                try {
                    byte[] array = byteBuffer.array();
                    int arrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
                    int remaining = byteBuffer.remaining();
                    int length = charSequence.length();
                    int i4 = remaining + arrayOffset;
                    while (i3 < length) {
                        int i5 = i3 + arrayOffset;
                        if (i5 >= i4) {
                            break;
                        }
                        char charAt = charSequence.charAt(i3);
                        if (charAt >= 128) {
                            break;
                        }
                        array[i5] = (byte) charAt;
                        i3++;
                    }
                    if (i3 == length) {
                        i = arrayOffset + length;
                    } else {
                        i = arrayOffset + i3;
                        while (i3 < length) {
                            char charAt2 = charSequence.charAt(i3);
                            if (charAt2 < 128 && i < i4) {
                                i2 = i + 1;
                                array[i] = (byte) charAt2;
                            } else if (charAt2 < 2048 && i <= i4 - 2) {
                                int i6 = i + 1;
                                array[i] = (byte) ((charAt2 >>> 6) | 960);
                                i = i6 + 1;
                                array[i6] = (byte) ((charAt2 & '?') | 128);
                                i3++;
                            } else if ((charAt2 < 55296 || 57343 < charAt2) && i <= i4 - 3) {
                                int i7 = i + 1;
                                array[i] = (byte) ((charAt2 >>> 12) | 480);
                                int i8 = i7 + 1;
                                array[i7] = (byte) (((charAt2 >>> 6) & 63) | PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
                                i2 = i8 + 1;
                                array[i8] = (byte) ((charAt2 & '?') | 128);
                            } else if (i <= i4 - 4) {
                                int i9 = i3 + 1;
                                if (i9 != charSequence.length()) {
                                    char charAt3 = charSequence.charAt(i9);
                                    if (Character.isSurrogatePair(charAt2, charAt3)) {
                                        int codePoint = Character.toCodePoint(charAt2, charAt3);
                                        int i10 = i + 1;
                                        array[i] = (byte) ((codePoint >>> 18) | 240);
                                        int i11 = i10 + 1;
                                        array[i10] = (byte) (((codePoint >>> 12) & 63) | PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
                                        int i12 = i11 + 1;
                                        array[i11] = (byte) (((codePoint >>> 6) & 63) | PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
                                        i = i12 + 1;
                                        array[i12] = (byte) ((codePoint & 63) | PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
                                        i3 = i9;
                                        i3++;
                                    } else {
                                        i3 = i9;
                                    }
                                }
                                int i13 = i3 - 1;
                                StringBuilder sb = new StringBuilder(39);
                                sb.append("Unpaired surrogate at index ");
                                sb.append(i13);
                                throw new IllegalArgumentException(sb.toString());
                            } else {
                                StringBuilder sb2 = new StringBuilder(37);
                                sb2.append("Failed writing ");
                                sb2.append(charAt2);
                                sb2.append(" at index ");
                                sb2.append(i);
                                throw new ArrayIndexOutOfBoundsException(sb2.toString());
                            }
                            i = i2;
                            i3++;
                        }
                    }
                    byteBuffer.position(i - byteBuffer.arrayOffset());
                } catch (ArrayIndexOutOfBoundsException e) {
                    BufferOverflowException bufferOverflowException = new BufferOverflowException();
                    bufferOverflowException.initCause(e);
                    throw bufferOverflowException;
                }
            } else {
                int length2 = charSequence.length();
                while (i3 < length2) {
                    char charAt4 = charSequence.charAt(i3);
                    if (charAt4 < 128) {
                        byteBuffer.put((byte) charAt4);
                    } else if (charAt4 < 2048) {
                        byteBuffer.put((byte) ((charAt4 >>> 6) | 960));
                        byteBuffer.put((byte) ((charAt4 & '?') | 128));
                    } else if (charAt4 < 55296 || 57343 < charAt4) {
                        byteBuffer.put((byte) ((charAt4 >>> 12) | 480));
                        byteBuffer.put((byte) (((charAt4 >>> 6) & 63) | PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH));
                        byteBuffer.put((byte) ((charAt4 & '?') | 128));
                    } else {
                        int i14 = i3 + 1;
                        if (i14 != charSequence.length()) {
                            char charAt5 = charSequence.charAt(i14);
                            if (Character.isSurrogatePair(charAt4, charAt5)) {
                                int codePoint2 = Character.toCodePoint(charAt4, charAt5);
                                byteBuffer.put((byte) ((codePoint2 >>> 18) | 240));
                                byteBuffer.put((byte) (((codePoint2 >>> 12) & 63) | PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH));
                                byteBuffer.put((byte) (((codePoint2 >>> 6) & 63) | PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH));
                                byteBuffer.put((byte) ((codePoint2 & 63) | PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH));
                                i3 = i14;
                            } else {
                                i3 = i14;
                            }
                        }
                        int i15 = i3 - 1;
                        StringBuilder sb3 = new StringBuilder(39);
                        sb3.append("Unpaired surrogate at index ");
                        sb3.append(i15);
                        throw new IllegalArgumentException(sb3.toString());
                    }
                    i3++;
                }
            }
        } else {
            throw new ReadOnlyBufferException();
        }
    }

    /* renamed from: b */
    public static int m48355b(int i, int i2) {
        return m48354b(i) + m48348a(i2);
    }

    /* renamed from: b */
    public static int m48357b(int i, String str) {
        return m48354b(i) + m48350a(str);
    }

    /* renamed from: b */
    public static int m48356b(int i, bbl bbl) {
        int b = m48354b(i);
        int c = bbl.mo40488c();
        return b + m48362e(c) + c;
    }

    /* renamed from: b */
    public static int m48358b(int i, byte[] bArr) {
        return m48354b(i) + m48362e(bArr.length) + bArr.length;
    }

    /* renamed from: a */
    public static int m48348a(int i) {
        if (i >= 0) {
            return m48362e(i);
        }
        return 10;
    }

    /* renamed from: a */
    public static int m48350a(String str) {
        int a = m48349a((CharSequence) str);
        return m48362e(a) + a;
    }

    /* renamed from: a */
    public final void mo40464a() {
        if (this.f41358a.remaining() != 0) {
            throw new IllegalStateException(C1642a.m8034a("Did not write as much data as expected, %s bytes remaining.", new Object[]{Integer.valueOf(this.f41358a.remaining())}));
        }
    }

    /* renamed from: c */
    private final void m48360c(int i) throws IOException {
        byte b = (byte) i;
        if (this.f41358a.hasRemaining()) {
            this.f41358a.put(b);
            return;
        }
        throw new zzchd(this.f41358a.position(), this.f41358a.limit());
    }

    /* renamed from: c */
    public final void mo40472c(int i, int i2) throws IOException {
        m48361d((i << 3) | i2);
    }

    /* renamed from: b */
    public static int m48354b(int i) {
        return m48362e(i << 3);
    }

    /* renamed from: d */
    private final void m48361d(int i) throws IOException {
        while ((i & -128) != 0) {
            m48360c((i & 127) | PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
            i >>>= 7;
        }
        m48360c(i);
    }

    /* renamed from: a */
    public final void mo40471a(long j) throws IOException {
        while ((-128 & j) != 0) {
            m48360c((((int) j) & 127) | PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
            j >>>= 7;
        }
        m48360c((int) j);
    }
}
