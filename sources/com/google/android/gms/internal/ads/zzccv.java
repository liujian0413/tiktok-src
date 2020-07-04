package com.google.android.gms.internal.ads;

import com.C1642a;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class zzccv extends awl {

    /* renamed from: b */
    private static final Logger f45690b = Logger.getLogger(zzccv.class.getName());
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final boolean f45691c = baq.m48145a();

    /* renamed from: a */
    axd f45692a = this;

    /* renamed from: com.google.android.gms.internal.ads.zzccv$a */
    static class C16255a extends zzccv {

        /* renamed from: b */
        private final byte[] f45693b;

        /* renamed from: c */
        private final int f45694c;

        /* renamed from: d */
        private final int f45695d;

        /* renamed from: e */
        private int f45696e;

        C16255a(byte[] bArr, int i, int i2) {
            super();
            if (bArr != null) {
                int i3 = i + i2;
                if ((i | i2 | (bArr.length - i3)) >= 0) {
                    this.f45693b = bArr;
                    this.f45694c = i;
                    this.f45696e = i;
                    this.f45695d = i3;
                    return;
                }
                throw new IllegalArgumentException(C1642a.m8034a("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)}));
            }
            throw new NullPointerException("buffer");
        }

        /* renamed from: a */
        public void mo42293a() {
        }

        /* renamed from: a */
        public final void mo42300a(int i, int i2) throws IOException {
            mo42315b((i << 3) | i2);
        }

        /* renamed from: b */
        public final void mo42316b(int i, int i2) throws IOException {
            mo42300a(i, 0);
            mo42297a(i2);
        }

        /* renamed from: c */
        public final void mo42324c(int i, int i2) throws IOException {
            mo42300a(i, 0);
            mo42315b(i2);
        }

        /* renamed from: e */
        public final void mo42330e(int i, int i2) throws IOException {
            mo42300a(i, 5);
            mo42328d(i2);
        }

        /* renamed from: a */
        public final void mo42301a(int i, long j) throws IOException {
            mo42300a(i, 0);
            mo42307a(j);
        }

        /* renamed from: c */
        public final void mo42325c(int i, long j) throws IOException {
            mo42300a(i, 1);
            mo42326c(j);
        }

        /* renamed from: a */
        public final void mo42306a(int i, boolean z) throws IOException {
            mo42300a(i, 0);
            mo42294a(z ? (byte) 1 : 0);
        }

        /* renamed from: a */
        public final void mo42305a(int i, String str) throws IOException {
            mo42300a(i, 2);
            mo42311a(str);
        }

        /* renamed from: a */
        public final void mo42304a(int i, zzcce zzcce) throws IOException {
            mo42300a(i, 2);
            mo42310a(zzcce);
        }

        /* renamed from: a */
        public final void mo42310a(zzcce zzcce) throws IOException {
            mo42315b(zzcce.size());
            zzcce.zza((awl) this);
        }

        /* renamed from: c */
        public final void mo42327c(byte[] bArr, int i, int i2) throws IOException {
            mo42315b(i2);
            mo42321b(bArr, 0, i2);
        }

        /* renamed from: a */
        public final void mo42302a(int i, aza aza) throws IOException {
            mo42300a(i, 2);
            mo42308a(aza);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo42303a(int i, aza aza, azs azs) throws IOException {
            mo42300a(i, 2);
            awc awc = (awc) aza;
            int h = awc.mo40083h();
            if (h == -1) {
                h = azs.mo40350b(awc);
                awc.mo40080a(h);
            }
            mo42315b(h);
            azs.mo40347a(aza, (bbe) this.f45692a);
        }

        /* renamed from: b */
        public final void mo42318b(int i, aza aza) throws IOException {
            mo42300a(1, 3);
            mo42324c(2, i);
            mo42302a(3, aza);
            mo42300a(1, 4);
        }

        /* renamed from: b */
        public final void mo42319b(int i, zzcce zzcce) throws IOException {
            mo42300a(1, 3);
            mo42324c(2, i);
            mo42304a(3, zzcce);
            mo42300a(1, 4);
        }

        /* renamed from: a */
        public final void mo42308a(aza aza) throws IOException {
            mo42315b(aza.mo40285j());
            aza.mo40281a(this);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo42309a(aza aza, azs azs) throws IOException {
            awc awc = (awc) aza;
            int h = awc.mo40083h();
            if (h == -1) {
                h = azs.mo40350b(awc);
                awc.mo40080a(h);
            }
            mo42315b(h);
            azs.mo40347a(aza, (bbe) this.f45692a);
        }

        /* renamed from: a */
        public final void mo42294a(byte b) throws IOException {
            try {
                byte[] bArr = this.f45693b;
                int i = this.f45696e;
                this.f45696e = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new zzc(C1642a.m8034a("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f45696e), Integer.valueOf(this.f45695d), Integer.valueOf(1)}), e);
            }
        }

        /* renamed from: a */
        public final void mo42297a(int i) throws IOException {
            if (i >= 0) {
                mo42315b(i);
            } else {
                mo42307a((long) i);
            }
        }

        /* renamed from: b */
        public final void mo42315b(int i) throws IOException {
            if (!zzccv.f45691c || mo42314b() < 10) {
                while ((i & -128) != 0) {
                    byte[] bArr = this.f45693b;
                    int i2 = this.f45696e;
                    this.f45696e = i2 + 1;
                    bArr[i2] = (byte) ((i & 127) | PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
                    i >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f45693b;
                    int i3 = this.f45696e;
                    this.f45696e = i3 + 1;
                    bArr2[i3] = (byte) i;
                } catch (IndexOutOfBoundsException e) {
                    throw new zzc(C1642a.m8034a("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f45696e), Integer.valueOf(this.f45695d), Integer.valueOf(1)}), e);
                }
            } else {
                while ((i & -128) != 0) {
                    byte[] bArr3 = this.f45693b;
                    int i4 = this.f45696e;
                    this.f45696e = i4 + 1;
                    baq.m48143a(bArr3, (long) i4, (byte) ((i & 127) | PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH));
                    i >>>= 7;
                }
                byte[] bArr4 = this.f45693b;
                int i5 = this.f45696e;
                this.f45696e = i5 + 1;
                baq.m48143a(bArr4, (long) i5, (byte) i);
            }
        }

        /* renamed from: d */
        public final void mo42328d(int i) throws IOException {
            try {
                byte[] bArr = this.f45693b;
                int i2 = this.f45696e;
                this.f45696e = i2 + 1;
                bArr[i2] = (byte) i;
                byte[] bArr2 = this.f45693b;
                int i3 = this.f45696e;
                this.f45696e = i3 + 1;
                bArr2[i3] = (byte) (i >> 8);
                byte[] bArr3 = this.f45693b;
                int i4 = this.f45696e;
                this.f45696e = i4 + 1;
                bArr3[i4] = (byte) (i >> 16);
                byte[] bArr4 = this.f45693b;
                int i5 = this.f45696e;
                this.f45696e = i5 + 1;
                bArr4[i5] = (byte) (i >>> 24);
            } catch (IndexOutOfBoundsException e) {
                throw new zzc(C1642a.m8034a("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f45696e), Integer.valueOf(this.f45695d), Integer.valueOf(1)}), e);
            }
        }

        /* renamed from: a */
        public final void mo42307a(long j) throws IOException {
            if (!zzccv.f45691c || mo42314b() < 10) {
                while ((j & -128) != 0) {
                    byte[] bArr = this.f45693b;
                    int i = this.f45696e;
                    this.f45696e = i + 1;
                    bArr[i] = (byte) ((((int) j) & 127) | PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
                    j >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f45693b;
                    int i2 = this.f45696e;
                    this.f45696e = i2 + 1;
                    bArr2[i2] = (byte) ((int) j);
                } catch (IndexOutOfBoundsException e) {
                    throw new zzc(C1642a.m8034a("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f45696e), Integer.valueOf(this.f45695d), Integer.valueOf(1)}), e);
                }
            } else {
                while ((j & -128) != 0) {
                    byte[] bArr3 = this.f45693b;
                    int i3 = this.f45696e;
                    this.f45696e = i3 + 1;
                    baq.m48143a(bArr3, (long) i3, (byte) ((((int) j) & 127) | PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH));
                    j >>>= 7;
                }
                byte[] bArr4 = this.f45693b;
                int i4 = this.f45696e;
                this.f45696e = i4 + 1;
                baq.m48143a(bArr4, (long) i4, (byte) ((int) j));
            }
        }

        /* renamed from: c */
        public final void mo42326c(long j) throws IOException {
            try {
                byte[] bArr = this.f45693b;
                int i = this.f45696e;
                this.f45696e = i + 1;
                bArr[i] = (byte) ((int) j);
                byte[] bArr2 = this.f45693b;
                int i2 = this.f45696e;
                this.f45696e = i2 + 1;
                bArr2[i2] = (byte) ((int) (j >> 8));
                byte[] bArr3 = this.f45693b;
                int i3 = this.f45696e;
                this.f45696e = i3 + 1;
                bArr3[i3] = (byte) ((int) (j >> 16));
                byte[] bArr4 = this.f45693b;
                int i4 = this.f45696e;
                this.f45696e = i4 + 1;
                bArr4[i4] = (byte) ((int) (j >> 24));
                byte[] bArr5 = this.f45693b;
                int i5 = this.f45696e;
                this.f45696e = i5 + 1;
                bArr5[i5] = (byte) ((int) (j >> 32));
                byte[] bArr6 = this.f45693b;
                int i6 = this.f45696e;
                this.f45696e = i6 + 1;
                bArr6[i6] = (byte) ((int) (j >> 40));
                byte[] bArr7 = this.f45693b;
                int i7 = this.f45696e;
                this.f45696e = i7 + 1;
                bArr7[i7] = (byte) ((int) (j >> 48));
                byte[] bArr8 = this.f45693b;
                int i8 = this.f45696e;
                this.f45696e = i8 + 1;
                bArr8[i8] = (byte) ((int) (j >> 56));
            } catch (IndexOutOfBoundsException e) {
                throw new zzc(C1642a.m8034a("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f45696e), Integer.valueOf(this.f45695d), Integer.valueOf(1)}), e);
            }
        }

        /* renamed from: b */
        public final void mo42321b(byte[] bArr, int i, int i2) throws IOException {
            try {
                System.arraycopy(bArr, i, this.f45693b, this.f45696e, i2);
                this.f45696e += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new zzc(C1642a.m8034a("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f45696e), Integer.valueOf(this.f45695d), Integer.valueOf(i2)}), e);
            }
        }

        /* renamed from: a */
        public final void mo40110a(byte[] bArr, int i, int i2) throws IOException {
            mo42321b(bArr, i, i2);
        }

        /* renamed from: a */
        public final void mo42311a(String str) throws IOException {
            int i = this.f45696e;
            try {
                int g = m53026g(str.length() * 3);
                int g2 = m53026g(str.length());
                if (g2 == g) {
                    this.f45696e = i + g2;
                    int a = bas.m48224a(str, this.f45693b, this.f45696e, mo42314b());
                    this.f45696e = i;
                    mo42315b((a - i) - g2);
                    this.f45696e = a;
                    return;
                }
                mo42315b(bas.m48223a((CharSequence) str));
                this.f45696e = bas.m48224a(str, this.f45693b, this.f45696e, mo42314b());
            } catch (baw e) {
                this.f45696e = i;
                mo42312a(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new zzc((Throwable) e2);
            }
        }

        /* renamed from: b */
        public final int mo42314b() {
            return this.f45695d - this.f45696e;
        }

        /* renamed from: e */
        public final int mo42331e() {
            return this.f45696e - this.f45694c;
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.zzccv$b */
    static final class C16256b extends C16255a {

        /* renamed from: b */
        private final ByteBuffer f45697b;

        /* renamed from: c */
        private int f45698c;

        C16256b(ByteBuffer byteBuffer) {
            super(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            this.f45697b = byteBuffer;
            this.f45698c = byteBuffer.position();
        }

        /* renamed from: a */
        public final void mo42293a() {
            this.f45697b.position(this.f45698c + mo42331e());
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.zzccv$c */
    static final class C16257c extends zzccv {

        /* renamed from: b */
        private final ByteBuffer f45699b;

        /* renamed from: c */
        private final ByteBuffer f45700c;

        /* renamed from: d */
        private final int f45701d;

        C16257c(ByteBuffer byteBuffer) {
            super();
            this.f45699b = byteBuffer;
            this.f45700c = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            this.f45701d = byteBuffer.position();
        }

        /* renamed from: a */
        public final void mo42300a(int i, int i2) throws IOException {
            mo42315b((i << 3) | i2);
        }

        /* renamed from: b */
        public final void mo42316b(int i, int i2) throws IOException {
            mo42300a(i, 0);
            mo42297a(i2);
        }

        /* renamed from: c */
        public final void mo42324c(int i, int i2) throws IOException {
            mo42300a(i, 0);
            mo42315b(i2);
        }

        /* renamed from: e */
        public final void mo42330e(int i, int i2) throws IOException {
            mo42300a(i, 5);
            mo42328d(i2);
        }

        /* renamed from: a */
        public final void mo42301a(int i, long j) throws IOException {
            mo42300a(i, 0);
            mo42307a(j);
        }

        /* renamed from: c */
        public final void mo42325c(int i, long j) throws IOException {
            mo42300a(i, 1);
            mo42326c(j);
        }

        /* renamed from: a */
        public final void mo42306a(int i, boolean z) throws IOException {
            mo42300a(i, 0);
            mo42294a(z ? (byte) 1 : 0);
        }

        /* renamed from: a */
        public final void mo42305a(int i, String str) throws IOException {
            mo42300a(i, 2);
            mo42311a(str);
        }

        /* renamed from: a */
        public final void mo42304a(int i, zzcce zzcce) throws IOException {
            mo42300a(i, 2);
            mo42310a(zzcce);
        }

        /* renamed from: a */
        public final void mo42302a(int i, aza aza) throws IOException {
            mo42300a(i, 2);
            mo42308a(aza);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo42303a(int i, aza aza, azs azs) throws IOException {
            mo42300a(i, 2);
            mo42309a(aza, azs);
        }

        /* renamed from: b */
        public final void mo42318b(int i, aza aza) throws IOException {
            mo42300a(1, 3);
            mo42324c(2, i);
            mo42302a(3, aza);
            mo42300a(1, 4);
        }

        /* renamed from: b */
        public final void mo42319b(int i, zzcce zzcce) throws IOException {
            mo42300a(1, 3);
            mo42324c(2, i);
            mo42304a(3, zzcce);
            mo42300a(1, 4);
        }

        /* renamed from: a */
        public final void mo42308a(aza aza) throws IOException {
            mo42315b(aza.mo40285j());
            aza.mo40281a(this);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo42309a(aza aza, azs azs) throws IOException {
            awc awc = (awc) aza;
            int h = awc.mo40083h();
            if (h == -1) {
                h = azs.mo40350b(awc);
                awc.mo40080a(h);
            }
            mo42315b(h);
            azs.mo40347a(aza, (bbe) this.f45692a);
        }

        /* renamed from: a */
        public final void mo42294a(byte b) throws IOException {
            try {
                this.f45700c.put(b);
            } catch (BufferOverflowException e) {
                throw new zzc((Throwable) e);
            }
        }

        /* renamed from: a */
        public final void mo42310a(zzcce zzcce) throws IOException {
            mo42315b(zzcce.size());
            zzcce.zza((awl) this);
        }

        /* renamed from: c */
        public final void mo42327c(byte[] bArr, int i, int i2) throws IOException {
            mo42315b(i2);
            mo42321b(bArr, 0, i2);
        }

        /* renamed from: a */
        public final void mo42297a(int i) throws IOException {
            if (i >= 0) {
                mo42315b(i);
            } else {
                mo42307a((long) i);
            }
        }

        /* renamed from: b */
        public final void mo42315b(int i) throws IOException {
            while ((i & -128) != 0) {
                this.f45700c.put((byte) ((i & 127) | PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH));
                i >>>= 7;
            }
            try {
                this.f45700c.put((byte) i);
            } catch (BufferOverflowException e) {
                throw new zzc((Throwable) e);
            }
        }

        /* renamed from: d */
        public final void mo42328d(int i) throws IOException {
            try {
                this.f45700c.putInt(i);
            } catch (BufferOverflowException e) {
                throw new zzc((Throwable) e);
            }
        }

        /* renamed from: a */
        public final void mo42307a(long j) throws IOException {
            while ((-128 & j) != 0) {
                this.f45700c.put((byte) ((((int) j) & 127) | PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH));
                j >>>= 7;
            }
            try {
                this.f45700c.put((byte) ((int) j));
            } catch (BufferOverflowException e) {
                throw new zzc((Throwable) e);
            }
        }

        /* renamed from: c */
        public final void mo42326c(long j) throws IOException {
            try {
                this.f45700c.putLong(j);
            } catch (BufferOverflowException e) {
                throw new zzc((Throwable) e);
            }
        }

        /* renamed from: b */
        public final void mo42321b(byte[] bArr, int i, int i2) throws IOException {
            try {
                this.f45700c.put(bArr, i, i2);
            } catch (IndexOutOfBoundsException e) {
                throw new zzc((Throwable) e);
            } catch (BufferOverflowException e2) {
                throw new zzc((Throwable) e2);
            }
        }

        /* renamed from: a */
        public final void mo40110a(byte[] bArr, int i, int i2) throws IOException {
            mo42321b(bArr, i, i2);
        }

        /* renamed from: a */
        public final void mo42311a(String str) throws IOException {
            int position = this.f45700c.position();
            try {
                int g = m53026g(str.length() * 3);
                int g2 = m53026g(str.length());
                if (g2 == g) {
                    int position2 = this.f45700c.position() + g2;
                    this.f45700c.position(position2);
                    m53107c(str);
                    int position3 = this.f45700c.position();
                    this.f45700c.position(position);
                    mo42315b(position3 - position2);
                    this.f45700c.position(position3);
                    return;
                }
                mo42315b(bas.m48223a((CharSequence) str));
                m53107c(str);
            } catch (baw e) {
                this.f45700c.position(position);
                mo42312a(str, e);
            } catch (IllegalArgumentException e2) {
                throw new zzc((Throwable) e2);
            }
        }

        /* renamed from: a */
        public final void mo42293a() {
            this.f45699b.position(this.f45700c.position());
        }

        /* renamed from: b */
        public final int mo42314b() {
            return this.f45700c.remaining();
        }

        /* renamed from: c */
        private final void m53107c(String str) throws IOException {
            try {
                bas.m48225a((CharSequence) str, this.f45700c);
            } catch (IndexOutOfBoundsException e) {
                throw new zzc((Throwable) e);
            }
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.zzccv$d */
    static final class C16258d extends zzccv {

        /* renamed from: b */
        private final ByteBuffer f45702b;

        /* renamed from: c */
        private final ByteBuffer f45703c;

        /* renamed from: d */
        private final long f45704d;

        /* renamed from: e */
        private final long f45705e;

        /* renamed from: f */
        private final long f45706f;

        /* renamed from: g */
        private final long f45707g = (this.f45706f - 10);

        /* renamed from: h */
        private long f45708h = this.f45705e;

        C16258d(ByteBuffer byteBuffer) {
            super();
            this.f45702b = byteBuffer;
            this.f45703c = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            this.f45704d = baq.m48132a(byteBuffer);
            this.f45705e = this.f45704d + ((long) byteBuffer.position());
            this.f45706f = this.f45704d + ((long) byteBuffer.limit());
        }

        /* renamed from: a */
        public final void mo42300a(int i, int i2) throws IOException {
            mo42315b((i << 3) | i2);
        }

        /* renamed from: b */
        public final void mo42316b(int i, int i2) throws IOException {
            mo42300a(i, 0);
            mo42297a(i2);
        }

        /* renamed from: c */
        public final void mo42324c(int i, int i2) throws IOException {
            mo42300a(i, 0);
            mo42315b(i2);
        }

        /* renamed from: e */
        public final void mo42330e(int i, int i2) throws IOException {
            mo42300a(i, 5);
            mo42328d(i2);
        }

        /* renamed from: a */
        public final void mo42301a(int i, long j) throws IOException {
            mo42300a(i, 0);
            mo42307a(j);
        }

        /* renamed from: c */
        public final void mo42325c(int i, long j) throws IOException {
            mo42300a(i, 1);
            mo42326c(j);
        }

        /* renamed from: a */
        public final void mo42306a(int i, boolean z) throws IOException {
            mo42300a(i, 0);
            mo42294a(z ? (byte) 1 : 0);
        }

        /* renamed from: a */
        public final void mo42305a(int i, String str) throws IOException {
            mo42300a(i, 2);
            mo42311a(str);
        }

        /* renamed from: a */
        public final void mo42304a(int i, zzcce zzcce) throws IOException {
            mo42300a(i, 2);
            mo42310a(zzcce);
        }

        /* renamed from: a */
        public final void mo42302a(int i, aza aza) throws IOException {
            mo42300a(i, 2);
            mo42308a(aza);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo42303a(int i, aza aza, azs azs) throws IOException {
            mo42300a(i, 2);
            mo42309a(aza, azs);
        }

        /* renamed from: b */
        public final void mo42318b(int i, aza aza) throws IOException {
            mo42300a(1, 3);
            mo42324c(2, i);
            mo42302a(3, aza);
            mo42300a(1, 4);
        }

        /* renamed from: b */
        public final void mo42319b(int i, zzcce zzcce) throws IOException {
            mo42300a(1, 3);
            mo42324c(2, i);
            mo42304a(3, zzcce);
            mo42300a(1, 4);
        }

        /* renamed from: a */
        public final void mo42308a(aza aza) throws IOException {
            mo42315b(aza.mo40285j());
            aza.mo40281a(this);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo42309a(aza aza, azs azs) throws IOException {
            awc awc = (awc) aza;
            int h = awc.mo40083h();
            if (h == -1) {
                h = azs.mo40350b(awc);
                awc.mo40080a(h);
            }
            mo42315b(h);
            azs.mo40347a(aza, (bbe) this.f45692a);
        }

        /* renamed from: a */
        public final void mo42294a(byte b) throws IOException {
            if (this.f45708h < this.f45706f) {
                long j = this.f45708h;
                this.f45708h = 1 + j;
                baq.m48135a(j, b);
                return;
            }
            throw new zzc(C1642a.m8034a("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(this.f45708h), Long.valueOf(this.f45706f), Integer.valueOf(1)}));
        }

        /* renamed from: a */
        public final void mo42310a(zzcce zzcce) throws IOException {
            mo42315b(zzcce.size());
            zzcce.zza((awl) this);
        }

        /* renamed from: c */
        public final void mo42327c(byte[] bArr, int i, int i2) throws IOException {
            mo42315b(i2);
            mo42321b(bArr, 0, i2);
        }

        /* renamed from: a */
        public final void mo42297a(int i) throws IOException {
            if (i >= 0) {
                mo42315b(i);
            } else {
                mo42307a((long) i);
            }
        }

        /* renamed from: b */
        public final void mo42315b(int i) throws IOException {
            if (this.f45708h <= this.f45707g) {
                while ((i & -128) != 0) {
                    long j = this.f45708h;
                    this.f45708h = j + 1;
                    baq.m48135a(j, (byte) ((i & 127) | PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH));
                    i >>>= 7;
                }
                long j2 = this.f45708h;
                this.f45708h = 1 + j2;
                baq.m48135a(j2, (byte) i);
                return;
            }
            while (this.f45708h < this.f45706f) {
                if ((i & -128) == 0) {
                    long j3 = this.f45708h;
                    this.f45708h = 1 + j3;
                    baq.m48135a(j3, (byte) i);
                    return;
                }
                long j4 = this.f45708h;
                this.f45708h = j4 + 1;
                baq.m48135a(j4, (byte) ((i & 127) | PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH));
                i >>>= 7;
            }
            throw new zzc(C1642a.m8034a("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(this.f45708h), Long.valueOf(this.f45706f), Integer.valueOf(1)}));
        }

        /* renamed from: d */
        public final void mo42328d(int i) throws IOException {
            this.f45703c.putInt((int) (this.f45708h - this.f45704d), i);
            this.f45708h += 4;
        }

        /* renamed from: a */
        public final void mo42307a(long j) throws IOException {
            if (this.f45708h <= this.f45707g) {
                while ((j & -128) != 0) {
                    long j2 = this.f45708h;
                    this.f45708h = j2 + 1;
                    baq.m48135a(j2, (byte) ((((int) j) & 127) | PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH));
                    j >>>= 7;
                }
                long j3 = this.f45708h;
                this.f45708h = 1 + j3;
                baq.m48135a(j3, (byte) ((int) j));
                return;
            }
            while (this.f45708h < this.f45706f) {
                if ((j & -128) == 0) {
                    long j4 = this.f45708h;
                    this.f45708h = 1 + j4;
                    baq.m48135a(j4, (byte) ((int) j));
                    return;
                }
                long j5 = this.f45708h;
                this.f45708h = j5 + 1;
                baq.m48135a(j5, (byte) ((((int) j) & 127) | PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH));
                j >>>= 7;
            }
            throw new zzc(C1642a.m8034a("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(this.f45708h), Long.valueOf(this.f45706f), Integer.valueOf(1)}));
        }

        /* renamed from: c */
        public final void mo42326c(long j) throws IOException {
            this.f45703c.putLong((int) (this.f45708h - this.f45704d), j);
            this.f45708h += 8;
        }

        /* renamed from: b */
        public final void mo42321b(byte[] bArr, int i, int i2) throws IOException {
            if (bArr != null && i >= 0 && i2 >= 0 && bArr.length - i2 >= i) {
                long j = (long) i2;
                if (this.f45706f - j >= this.f45708h) {
                    baq.m48144a(bArr, (long) i, this.f45708h, j);
                    this.f45708h += j;
                    return;
                }
            }
            if (bArr == null) {
                throw new NullPointerException("value");
            }
            throw new zzc(C1642a.m8034a("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(this.f45708h), Long.valueOf(this.f45706f), Integer.valueOf(i2)}));
        }

        /* renamed from: a */
        public final void mo40110a(byte[] bArr, int i, int i2) throws IOException {
            mo42321b(bArr, i, i2);
        }

        /* renamed from: a */
        public final void mo42311a(String str) throws IOException {
            long j = this.f45708h;
            try {
                int g = m53026g(str.length() * 3);
                int g2 = m53026g(str.length());
                if (g2 == g) {
                    int i = ((int) (this.f45708h - this.f45704d)) + g2;
                    this.f45703c.position(i);
                    bas.m48225a((CharSequence) str, this.f45703c);
                    int position = this.f45703c.position() - i;
                    mo42315b(position);
                    this.f45708h += (long) position;
                    return;
                }
                int a = bas.m48223a((CharSequence) str);
                mo42315b(a);
                m53136g(this.f45708h);
                bas.m48225a((CharSequence) str, this.f45703c);
                this.f45708h += (long) a;
            } catch (baw e) {
                this.f45708h = j;
                m53136g(this.f45708h);
                mo42312a(str, e);
            } catch (IllegalArgumentException e2) {
                throw new zzc((Throwable) e2);
            } catch (IndexOutOfBoundsException e3) {
                throw new zzc((Throwable) e3);
            }
        }

        /* renamed from: a */
        public final void mo42293a() {
            this.f45702b.position((int) (this.f45708h - this.f45704d));
        }

        /* renamed from: b */
        public final int mo42314b() {
            return (int) (this.f45706f - this.f45708h);
        }

        /* renamed from: g */
        private final void m53136g(long j) {
            this.f45703c.position((int) (j - this.f45704d));
        }
    }

    public static class zzc extends IOException {
        zzc() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        zzc(String str) {
            String valueOf = String.valueOf("CodedOutputStream was writing to a flat byte array and ran out of space.: ");
            String valueOf2 = String.valueOf(str);
            super(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
        }

        zzc(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        zzc(String str, Throwable th) {
            String valueOf = String.valueOf("CodedOutputStream was writing to a flat byte array and ran out of space.: ");
            String valueOf2 = String.valueOf(str);
            super(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), th);
        }
    }

    /* renamed from: a */
    public static zzccv m52998a(byte[] bArr) {
        return new C16255a(bArr, 0, bArr.length);
    }

    /* renamed from: e */
    public static int m53021e(long j) {
        int i;
        if ((-128 & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if ((-34359738368L & j) != 0) {
            i = 6;
            j >>>= 28;
        } else {
            i = 2;
        }
        if ((-2097152 & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        if ((j & -16384) != 0) {
            i++;
        }
        return i;
    }

    /* renamed from: g */
    public static int m53026g(int i) {
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

    /* renamed from: g */
    private static long m53029g(long j) {
        return (j >> 63) ^ (j << 1);
    }

    /* renamed from: k */
    private static int m53037k(int i) {
        return (i >> 31) ^ (i << 1);
    }

    /* renamed from: a */
    public abstract void mo42293a() throws IOException;

    /* renamed from: a */
    public abstract void mo42294a(byte b) throws IOException;

    /* renamed from: a */
    public abstract void mo42297a(int i) throws IOException;

    /* renamed from: a */
    public abstract void mo42300a(int i, int i2) throws IOException;

    /* renamed from: a */
    public abstract void mo42301a(int i, long j) throws IOException;

    /* renamed from: a */
    public abstract void mo42302a(int i, aza aza) throws IOException;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract void mo42303a(int i, aza aza, azs azs) throws IOException;

    /* renamed from: a */
    public abstract void mo42304a(int i, zzcce zzcce) throws IOException;

    /* renamed from: a */
    public abstract void mo42305a(int i, String str) throws IOException;

    /* renamed from: a */
    public abstract void mo42306a(int i, boolean z) throws IOException;

    /* renamed from: a */
    public abstract void mo42307a(long j) throws IOException;

    /* renamed from: a */
    public abstract void mo42308a(aza aza) throws IOException;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract void mo42309a(aza aza, azs azs) throws IOException;

    /* renamed from: a */
    public abstract void mo42310a(zzcce zzcce) throws IOException;

    /* renamed from: a */
    public abstract void mo42311a(String str) throws IOException;

    /* renamed from: b */
    public abstract int mo42314b();

    /* renamed from: b */
    public abstract void mo42315b(int i) throws IOException;

    /* renamed from: b */
    public abstract void mo42316b(int i, int i2) throws IOException;

    /* renamed from: b */
    public abstract void mo42318b(int i, aza aza) throws IOException;

    /* renamed from: b */
    public abstract void mo42319b(int i, zzcce zzcce) throws IOException;

    /* renamed from: b */
    public abstract void mo42321b(byte[] bArr, int i, int i2) throws IOException;

    /* renamed from: c */
    public abstract void mo42324c(int i, int i2) throws IOException;

    /* renamed from: c */
    public abstract void mo42325c(int i, long j) throws IOException;

    /* renamed from: c */
    public abstract void mo42326c(long j) throws IOException;

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public abstract void mo42327c(byte[] bArr, int i, int i2) throws IOException;

    /* renamed from: d */
    public abstract void mo42328d(int i) throws IOException;

    /* renamed from: e */
    public abstract void mo42330e(int i, int i2) throws IOException;

    /* renamed from: a */
    public static zzccv m52997a(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return new C16256b(byteBuffer);
        }
        if (!byteBuffer.isDirect() || byteBuffer.isReadOnly()) {
            throw new IllegalArgumentException("ByteBuffer is read-only");
        } else if (baq.m48150b()) {
            return new C16258d(byteBuffer);
        } else {
            return new C16257c(byteBuffer);
        }
    }

    private zzccv() {
    }

    /* renamed from: d */
    public final void mo42329d(int i, int i2) throws IOException {
        mo42324c(i, m53037k(i2));
    }

    /* renamed from: b */
    public final void mo42317b(int i, long j) throws IOException {
        mo42301a(i, m53029g(j));
    }

    /* renamed from: a */
    public final void mo42299a(int i, float f) throws IOException {
        mo42330e(i, Float.floatToRawIntBits(f));
    }

    /* renamed from: a */
    public final void mo42298a(int i, double d) throws IOException {
        mo42325c(i, Double.doubleToRawLongBits(d));
    }

    /* renamed from: c */
    public final void mo42323c(int i) throws IOException {
        mo42315b(m53037k(i));
    }

    /* renamed from: b */
    public final void mo42320b(long j) throws IOException {
        mo42307a(m53029g(j));
    }

    /* renamed from: a */
    public final void mo42296a(float f) throws IOException {
        mo42328d(Float.floatToRawIntBits(f));
    }

    /* renamed from: a */
    public final void mo42295a(double d) throws IOException {
        mo42326c(Double.doubleToRawLongBits(d));
    }

    /* renamed from: a */
    public final void mo42313a(boolean z) throws IOException {
        mo42294a(z ? (byte) 1 : 0);
    }

    /* renamed from: f */
    public static int m53023f(int i, int i2) {
        return m53019e(i) + m53022f(i2);
    }

    /* renamed from: g */
    public static int m53027g(int i, int i2) {
        return m53019e(i) + m53026g(i2);
    }

    /* renamed from: h */
    public static int m53031h(int i, int i2) {
        return m53019e(i) + m53026g(m53037k(i2));
    }

    /* renamed from: i */
    public static int m53034i(int i, int i2) {
        return m53019e(i) + 4;
    }

    /* renamed from: j */
    public static int m53036j(int i, int i2) {
        return m53019e(i) + 4;
    }

    /* renamed from: d */
    public static int m53014d(int i, long j) {
        return m53019e(i) + m53021e(j);
    }

    /* renamed from: e */
    public static int m53020e(int i, long j) {
        return m53019e(i) + m53021e(j);
    }

    /* renamed from: f */
    public static int m53024f(int i, long j) {
        return m53019e(i) + m53021e(m53029g(j));
    }

    /* renamed from: g */
    public static int m53028g(int i, long j) {
        return m53019e(i) + 8;
    }

    /* renamed from: h */
    public static int m53032h(int i, long j) {
        return m53019e(i) + 8;
    }

    /* renamed from: b */
    public static int m53000b(int i, float f) {
        return m53019e(i) + 4;
    }

    /* renamed from: b */
    public static int m52999b(int i, double d) {
        return m53019e(i) + 8;
    }

    /* renamed from: b */
    public static int m53004b(int i, boolean z) {
        return m53019e(i) + 1;
    }

    /* renamed from: k */
    public static int m53038k(int i, int i2) {
        return m53019e(i) + m53022f(i2);
    }

    /* renamed from: b */
    public static int m53003b(int i, String str) {
        return m53019e(i) + m53008b(str);
    }

    /* renamed from: c */
    public static int m53012c(int i, zzcce zzcce) {
        int e = m53019e(i);
        int size = zzcce.size();
        return e + m53026g(size) + size;
    }

    /* renamed from: a */
    public static int m52995a(int i, ayi ayi) {
        int e = m53019e(i);
        int b = ayi.mo40315b();
        return e + m53026g(b) + b;
    }

    /* renamed from: c */
    public static int m53010c(int i, aza aza) {
        return m53019e(i) + m53005b(aza);
    }

    /* renamed from: b */
    static int m53002b(int i, aza aza, azs azs) {
        return m53019e(i) + m53006b(aza, azs);
    }

    /* renamed from: d */
    public static int m53015d(int i, aza aza) {
        return (m53019e(1) << 1) + m53027g(2, i) + m53010c(3, aza);
    }

    /* renamed from: d */
    public static int m53016d(int i, zzcce zzcce) {
        return (m53019e(1) << 1) + m53027g(2, i) + m53012c(3, zzcce);
    }

    /* renamed from: b */
    public static int m53001b(int i, ayi ayi) {
        return (m53019e(1) << 1) + m53027g(2, i) + m52995a(3, ayi);
    }

    /* renamed from: e */
    public static int m53019e(int i) {
        return m53026g(i << 3);
    }

    /* renamed from: f */
    public static int m53022f(int i) {
        if (i >= 0) {
            return m53026g(i);
        }
        return 10;
    }

    /* renamed from: h */
    public static int m53030h(int i) {
        return m53026g(m53037k(i));
    }

    /* renamed from: d */
    public static int m53017d(long j) {
        return m53021e(j);
    }

    /* renamed from: f */
    public static int m53025f(long j) {
        return m53021e(m53029g(j));
    }

    /* renamed from: i */
    public static int m53033i(int i) {
        return m53022f(i);
    }

    /* renamed from: b */
    public static int m53008b(String str) {
        int i;
        try {
            i = bas.m48223a((CharSequence) str);
        } catch (baw unused) {
            i = str.getBytes(axw.f41216a).length;
        }
        return m53026g(i) + i;
    }

    /* renamed from: a */
    public static int m52996a(ayi ayi) {
        int b = ayi.mo40315b();
        return m53026g(b) + b;
    }

    /* renamed from: b */
    public static int m53007b(zzcce zzcce) {
        int size = zzcce.size();
        return m53026g(size) + size;
    }

    /* renamed from: b */
    public static int m53009b(byte[] bArr) {
        int length = bArr.length;
        return m53026g(length) + length;
    }

    /* renamed from: b */
    public static int m53005b(aza aza) {
        int j = aza.mo40285j();
        return m53026g(j) + j;
    }

    /* renamed from: b */
    static int m53006b(aza aza, azs azs) {
        awc awc = (awc) aza;
        int h = awc.mo40083h();
        if (h == -1) {
            h = azs.mo40350b(awc);
            awc.mo40080a(h);
        }
        return m53026g(h) + h;
    }

    /* renamed from: c */
    public final void mo42322c() {
        if (mo42314b() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo42312a(String str, baw baw) throws IOException {
        f45690b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", baw);
        byte[] bytes = str.getBytes(axw.f41216a);
        try {
            mo42315b(bytes.length);
            mo40110a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e) {
            throw new zzc((Throwable) e);
        } catch (zzc e2) {
            throw e2;
        }
    }

    /* renamed from: c */
    static int m53011c(int i, aza aza, azs azs) {
        int e = m53019e(i) << 1;
        awc awc = (awc) aza;
        int h = awc.mo40083h();
        if (h == -1) {
            h = azs.mo40350b(awc);
            awc.mo40080a(h);
        }
        return e + h;
    }

    /* renamed from: c */
    public static int m53013c(aza aza) {
        return aza.mo40285j();
    }

    /* renamed from: j */
    public static int m53035j(int i) {
        return m53026g(i);
    }
}
