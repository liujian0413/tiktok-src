package com.google.android.gms.internal.measurement;

import com.C1642a;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;

/* renamed from: com.google.android.gms.internal.measurement.ko */
public final class C16678ko {

    /* renamed from: a */
    private final ByteBuffer f46590a;

    /* renamed from: b */
    private zztv f46591b;

    /* renamed from: c */
    private int f46592c;

    private C16678ko(byte[] bArr, int i, int i2) {
        this(ByteBuffer.wrap(bArr, 0, i2));
    }

    /* renamed from: a */
    public static int m54752a(long j) {
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

    /* renamed from: d */
    public static int m54765d(int i) {
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

    private C16678ko(ByteBuffer byteBuffer) {
        this.f46590a = byteBuffer;
        this.f46590a.order(ByteOrder.LITTLE_ENDIAN);
    }

    /* renamed from: a */
    public static C16678ko m54755a(byte[] bArr) {
        return m54756a(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public static C16678ko m54756a(byte[] bArr, int i, int i2) {
        return new C16678ko(bArr, 0, i2);
    }

    /* renamed from: b */
    private final zztv m54762b() throws IOException {
        if (this.f46591b == null) {
            this.f46591b = zztv.m54912a(this.f46590a);
            this.f46592c = this.f46590a.position();
        } else if (this.f46592c != this.f46590a.position()) {
            this.f46591b.mo43275b(this.f46590a.array(), this.f46592c, this.f46590a.position() - this.f46592c);
            this.f46592c = this.f46590a.position();
        }
        return this.f46591b;
    }

    /* renamed from: a */
    public final void mo43133a(int i, double d) throws IOException {
        mo43145c(i, 1);
        long doubleToLongBits = Double.doubleToLongBits(d);
        if (this.f46590a.remaining() >= 8) {
            this.f46590a.putLong(doubleToLongBits);
            return;
        }
        throw new zzyb(this.f46590a.position(), this.f46590a.limit());
    }

    /* renamed from: a */
    public final void mo43134a(int i, float f) throws IOException {
        mo43145c(i, 5);
        int floatToIntBits = Float.floatToIntBits(f);
        if (this.f46590a.remaining() >= 4) {
            this.f46590a.putInt(floatToIntBits);
            return;
        }
        throw new zzyb(this.f46590a.position(), this.f46590a.limit());
    }

    /* renamed from: a */
    public final void mo43136a(int i, long j) throws IOException {
        mo43145c(i, 0);
        m54763b(j);
    }

    /* renamed from: b */
    public final void mo43142b(int i, long j) throws IOException {
        mo43145c(i, 0);
        m54763b(j);
    }

    /* renamed from: a */
    public final void mo43135a(int i, int i2) throws IOException {
        mo43145c(i, 0);
        if (i2 >= 0) {
            mo43144c(i2);
        } else {
            m54763b((long) i2);
        }
    }

    /* renamed from: a */
    public final void mo43140a(int i, boolean z) throws IOException {
        mo43145c(i, 0);
        byte b = z ? (byte) 1 : 0;
        if (this.f46590a.hasRemaining()) {
            this.f46590a.put(b);
            return;
        }
        throw new zzyb(this.f46590a.position(), this.f46590a.limit());
    }

    /* renamed from: a */
    public final void mo43139a(int i, String str) throws IOException {
        mo43145c(i, 2);
        try {
            int d = m54765d(str.length());
            if (d == m54765d(str.length() * 3)) {
                int position = this.f46590a.position();
                if (this.f46590a.remaining() >= d) {
                    this.f46590a.position(position + d);
                    m54757a((CharSequence) str, this.f46590a);
                    int position2 = this.f46590a.position();
                    this.f46590a.position(position);
                    mo43144c((position2 - position) - d);
                    this.f46590a.position(position2);
                    return;
                }
                throw new zzyb(position + d, this.f46590a.limit());
            }
            mo43144c(m54753a((CharSequence) str));
            m54757a((CharSequence) str, this.f46590a);
        } catch (BufferOverflowException e) {
            zzyb zzyb = new zzyb(this.f46590a.position(), this.f46590a.limit());
            zzyb.initCause(e);
            throw zzyb;
        }
    }

    /* renamed from: a */
    public final void mo43138a(int i, C16684ku kuVar) throws IOException {
        mo43145c(i, 2);
        mo43141a(kuVar);
    }

    /* renamed from: a */
    public final void mo43137a(int i, C16615ij ijVar) throws IOException {
        zztv b = m54762b();
        b.mo43256a(44, ijVar);
        b.mo43247a();
        this.f46592c = this.f46590a.position();
    }

    /* renamed from: a */
    private static int m54753a(CharSequence charSequence) {
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
    private static void m54757a(CharSequence charSequence, ByteBuffer byteBuffer) {
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

    /* renamed from: a */
    public final void mo43141a(C16684ku kuVar) throws IOException {
        mo43144c(kuVar.mo43167d());
        kuVar.mo42655a(this);
    }

    /* renamed from: c */
    public static int m54764c(int i, long j) {
        return m54758b(i) + m54752a(j);
    }

    /* renamed from: b */
    public static int m54759b(int i, int i2) {
        return m54758b(i) + m54751a(i2);
    }

    /* renamed from: b */
    public static int m54761b(int i, String str) {
        return m54758b(i) + m54754a(str);
    }

    /* renamed from: b */
    public static int m54760b(int i, C16684ku kuVar) {
        int b = m54758b(i);
        int e = kuVar.mo43168e();
        return b + m54765d(e) + e;
    }

    /* renamed from: a */
    public static int m54751a(int i) {
        if (i >= 0) {
            return m54765d(i);
        }
        return 10;
    }

    /* renamed from: a */
    public static int m54754a(String str) {
        int a = m54753a((CharSequence) str);
        return m54765d(a) + a;
    }

    /* renamed from: a */
    public final void mo43132a() {
        if (this.f46590a.remaining() != 0) {
            throw new IllegalStateException(C1642a.m8034a("Did not write as much data as expected, %s bytes remaining.", new Object[]{Integer.valueOf(this.f46590a.remaining())}));
        }
    }

    /* renamed from: e */
    private final void m54766e(int i) throws IOException {
        byte b = (byte) i;
        if (this.f46590a.hasRemaining()) {
            this.f46590a.put(b);
            return;
        }
        throw new zzyb(this.f46590a.position(), this.f46590a.limit());
    }

    /* renamed from: b */
    public final void mo43143b(byte[] bArr) throws IOException {
        int length = bArr.length;
        if (this.f46590a.remaining() >= length) {
            this.f46590a.put(bArr, 0, length);
            return;
        }
        throw new zzyb(this.f46590a.position(), this.f46590a.limit());
    }

    /* renamed from: c */
    public final void mo43145c(int i, int i2) throws IOException {
        mo43144c((i << 3) | i2);
    }

    /* renamed from: b */
    public static int m54758b(int i) {
        return m54765d(i << 3);
    }

    /* renamed from: c */
    public final void mo43144c(int i) throws IOException {
        while ((i & -128) != 0) {
            m54766e((i & 127) | PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
            i >>>= 7;
        }
        m54766e(i);
    }

    /* renamed from: b */
    private final void m54763b(long j) throws IOException {
        while ((-128 & j) != 0) {
            m54766e((((int) j) & 127) | PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
            j >>>= 7;
        }
        m54766e((int) j);
    }
}
