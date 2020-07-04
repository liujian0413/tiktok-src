package com.google.android.gms.internal.measurement;

import com.C1642a;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class zztv extends C16541fw {

    /* renamed from: b */
    private static final Logger f46681b = Logger.getLogger(zztv.class.getName());
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final boolean f46682c = C16657jy.m54556a();

    /* renamed from: a */
    C16560go f46683a = this;

    /* renamed from: com.google.android.gms.internal.measurement.zztv$a */
    static class C16708a extends zztv {

        /* renamed from: b */
        private final byte[] f46684b;

        /* renamed from: c */
        private final int f46685c;

        /* renamed from: d */
        private final int f46686d;

        /* renamed from: e */
        private int f46687e;

        C16708a(byte[] bArr, int i, int i2) {
            super();
            if (bArr != null) {
                int i3 = i + i2;
                if ((i | i2 | (bArr.length - i3)) >= 0) {
                    this.f46684b = bArr;
                    this.f46685c = i;
                    this.f46687e = i;
                    this.f46686d = i3;
                    return;
                }
                throw new IllegalArgumentException(C1642a.m8034a("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)}));
            }
            throw new NullPointerException("buffer");
        }

        /* renamed from: a */
        public void mo43247a() {
        }

        /* renamed from: a */
        public final void mo43254a(int i, int i2) throws IOException {
            mo43269b((i << 3) | i2);
        }

        /* renamed from: b */
        public final void mo43270b(int i, int i2) throws IOException {
            mo43254a(i, 0);
            mo43251a(i2);
        }

        /* renamed from: c */
        public final void mo43277c(int i, int i2) throws IOException {
            mo43254a(i, 0);
            mo43269b(i2);
        }

        /* renamed from: e */
        public final void mo43283e(int i, int i2) throws IOException {
            mo43254a(i, 5);
            mo43281d(i2);
        }

        /* renamed from: a */
        public final void mo43255a(int i, long j) throws IOException {
            mo43254a(i, 0);
            mo43261a(j);
        }

        /* renamed from: c */
        public final void mo43278c(int i, long j) throws IOException {
            mo43254a(i, 1);
            mo43279c(j);
        }

        /* renamed from: a */
        public final void mo43260a(int i, boolean z) throws IOException {
            mo43254a(i, 0);
            mo43248a(z ? (byte) 1 : 0);
        }

        /* renamed from: a */
        public final void mo43259a(int i, String str) throws IOException {
            mo43254a(i, 2);
            mo43265a(str);
        }

        /* renamed from: a */
        public final void mo43258a(int i, zzte zzte) throws IOException {
            mo43254a(i, 2);
            mo43264a(zzte);
        }

        /* renamed from: a */
        public final void mo43264a(zzte zzte) throws IOException {
            mo43269b(zzte.size());
            zzte.zza((C16541fw) this);
        }

        /* renamed from: c */
        public final void mo43280c(byte[] bArr, int i, int i2) throws IOException {
            mo43269b(i2);
            mo43275b(bArr, 0, i2);
        }

        /* renamed from: a */
        public final void mo43256a(int i, C16615ij ijVar) throws IOException {
            mo43254a(i, 2);
            mo43262a(ijVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo43257a(int i, C16615ij ijVar, C16633ja jaVar) throws IOException {
            mo43254a(i, 2);
            C16535fq fqVar = (C16535fq) ijVar;
            int e = fqVar.mo42727e();
            if (e == -1) {
                e = jaVar.mo42995b(fqVar);
                fqVar.mo42725a(e);
            }
            mo43269b(e);
            jaVar.mo42993a(ijVar, (C16675kl) this.f46683a);
        }

        /* renamed from: b */
        public final void mo43272b(int i, C16615ij ijVar) throws IOException {
            mo43254a(1, 3);
            mo43277c(2, i);
            mo43256a(3, ijVar);
            mo43254a(1, 4);
        }

        /* renamed from: b */
        public final void mo43273b(int i, zzte zzte) throws IOException {
            mo43254a(1, 3);
            mo43277c(2, i);
            mo43258a(3, zzte);
            mo43254a(1, 4);
        }

        /* renamed from: a */
        public final void mo43262a(C16615ij ijVar) throws IOException {
            mo43269b(ijVar.mo42933h());
            ijVar.mo42929a(this);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo43263a(C16615ij ijVar, C16633ja jaVar) throws IOException {
            C16535fq fqVar = (C16535fq) ijVar;
            int e = fqVar.mo42727e();
            if (e == -1) {
                e = jaVar.mo42995b(fqVar);
                fqVar.mo42725a(e);
            }
            mo43269b(e);
            jaVar.mo42993a(ijVar, (C16675kl) this.f46683a);
        }

        /* renamed from: a */
        public final void mo43248a(byte b) throws IOException {
            try {
                byte[] bArr = this.f46684b;
                int i = this.f46687e;
                this.f46687e = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new zzc(C1642a.m8034a("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f46687e), Integer.valueOf(this.f46686d), Integer.valueOf(1)}), e);
            }
        }

        /* renamed from: a */
        public final void mo43251a(int i) throws IOException {
            if (i >= 0) {
                mo43269b(i);
            } else {
                mo43261a((long) i);
            }
        }

        /* renamed from: b */
        public final void mo43269b(int i) throws IOException {
            if (!zztv.f46682c || mo43268b() < 10) {
                while ((i & -128) != 0) {
                    byte[] bArr = this.f46684b;
                    int i2 = this.f46687e;
                    this.f46687e = i2 + 1;
                    bArr[i2] = (byte) ((i & 127) | PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
                    i >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f46684b;
                    int i3 = this.f46687e;
                    this.f46687e = i3 + 1;
                    bArr2[i3] = (byte) i;
                } catch (IndexOutOfBoundsException e) {
                    throw new zzc(C1642a.m8034a("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f46687e), Integer.valueOf(this.f46686d), Integer.valueOf(1)}), e);
                }
            } else {
                while ((i & -128) != 0) {
                    byte[] bArr3 = this.f46684b;
                    int i4 = this.f46687e;
                    this.f46687e = i4 + 1;
                    C16657jy.m54554a(bArr3, (long) i4, (byte) ((i & 127) | PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH));
                    i >>>= 7;
                }
                byte[] bArr4 = this.f46684b;
                int i5 = this.f46687e;
                this.f46687e = i5 + 1;
                C16657jy.m54554a(bArr4, (long) i5, (byte) i);
            }
        }

        /* renamed from: d */
        public final void mo43281d(int i) throws IOException {
            try {
                byte[] bArr = this.f46684b;
                int i2 = this.f46687e;
                this.f46687e = i2 + 1;
                bArr[i2] = (byte) i;
                byte[] bArr2 = this.f46684b;
                int i3 = this.f46687e;
                this.f46687e = i3 + 1;
                bArr2[i3] = (byte) (i >> 8);
                byte[] bArr3 = this.f46684b;
                int i4 = this.f46687e;
                this.f46687e = i4 + 1;
                bArr3[i4] = (byte) (i >> 16);
                byte[] bArr4 = this.f46684b;
                int i5 = this.f46687e;
                this.f46687e = i5 + 1;
                bArr4[i5] = (byte) (i >>> 24);
            } catch (IndexOutOfBoundsException e) {
                throw new zzc(C1642a.m8034a("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f46687e), Integer.valueOf(this.f46686d), Integer.valueOf(1)}), e);
            }
        }

        /* renamed from: a */
        public final void mo43261a(long j) throws IOException {
            if (!zztv.f46682c || mo43268b() < 10) {
                while ((j & -128) != 0) {
                    byte[] bArr = this.f46684b;
                    int i = this.f46687e;
                    this.f46687e = i + 1;
                    bArr[i] = (byte) ((((int) j) & 127) | PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
                    j >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f46684b;
                    int i2 = this.f46687e;
                    this.f46687e = i2 + 1;
                    bArr2[i2] = (byte) ((int) j);
                } catch (IndexOutOfBoundsException e) {
                    throw new zzc(C1642a.m8034a("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f46687e), Integer.valueOf(this.f46686d), Integer.valueOf(1)}), e);
                }
            } else {
                while ((j & -128) != 0) {
                    byte[] bArr3 = this.f46684b;
                    int i3 = this.f46687e;
                    this.f46687e = i3 + 1;
                    C16657jy.m54554a(bArr3, (long) i3, (byte) ((((int) j) & 127) | PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH));
                    j >>>= 7;
                }
                byte[] bArr4 = this.f46684b;
                int i4 = this.f46687e;
                this.f46687e = i4 + 1;
                C16657jy.m54554a(bArr4, (long) i4, (byte) ((int) j));
            }
        }

        /* renamed from: c */
        public final void mo43279c(long j) throws IOException {
            try {
                byte[] bArr = this.f46684b;
                int i = this.f46687e;
                this.f46687e = i + 1;
                bArr[i] = (byte) ((int) j);
                byte[] bArr2 = this.f46684b;
                int i2 = this.f46687e;
                this.f46687e = i2 + 1;
                bArr2[i2] = (byte) ((int) (j >> 8));
                byte[] bArr3 = this.f46684b;
                int i3 = this.f46687e;
                this.f46687e = i3 + 1;
                bArr3[i3] = (byte) ((int) (j >> 16));
                byte[] bArr4 = this.f46684b;
                int i4 = this.f46687e;
                this.f46687e = i4 + 1;
                bArr4[i4] = (byte) ((int) (j >> 24));
                byte[] bArr5 = this.f46684b;
                int i5 = this.f46687e;
                this.f46687e = i5 + 1;
                bArr5[i5] = (byte) ((int) (j >> 32));
                byte[] bArr6 = this.f46684b;
                int i6 = this.f46687e;
                this.f46687e = i6 + 1;
                bArr6[i6] = (byte) ((int) (j >> 40));
                byte[] bArr7 = this.f46684b;
                int i7 = this.f46687e;
                this.f46687e = i7 + 1;
                bArr7[i7] = (byte) ((int) (j >> 48));
                byte[] bArr8 = this.f46684b;
                int i8 = this.f46687e;
                this.f46687e = i8 + 1;
                bArr8[i8] = (byte) ((int) (j >> 56));
            } catch (IndexOutOfBoundsException e) {
                throw new zzc(C1642a.m8034a("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f46687e), Integer.valueOf(this.f46686d), Integer.valueOf(1)}), e);
            }
        }

        /* renamed from: b */
        public final void mo43275b(byte[] bArr, int i, int i2) throws IOException {
            try {
                System.arraycopy(bArr, i, this.f46684b, this.f46687e, i2);
                this.f46687e += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new zzc(C1642a.m8034a("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f46687e), Integer.valueOf(this.f46686d), Integer.valueOf(i2)}), e);
            }
        }

        /* renamed from: a */
        public final void mo42752a(byte[] bArr, int i, int i2) throws IOException {
            mo43275b(bArr, i, i2);
        }

        /* renamed from: a */
        public final void mo43265a(String str) throws IOException {
            int i = this.f46687e;
            try {
                int g = m54941g(str.length() * 3);
                int g2 = m54941g(str.length());
                if (g2 == g) {
                    this.f46687e = i + g2;
                    int a = C16664ka.m54644a(str, this.f46684b, this.f46687e, mo43268b());
                    this.f46687e = i;
                    mo43269b((a - i) - g2);
                    this.f46687e = a;
                    return;
                }
                mo43269b(C16664ka.m54643a((CharSequence) str));
                this.f46687e = C16664ka.m54644a(str, this.f46684b, this.f46687e, mo43268b());
            } catch (C16668ke e) {
                this.f46687e = i;
                mo43266a(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new zzc((Throwable) e2);
            }
        }

        /* renamed from: b */
        public final int mo43268b() {
            return this.f46686d - this.f46687e;
        }

        /* renamed from: d */
        public final int mo43284d() {
            return this.f46687e - this.f46685c;
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.zztv$b */
    static final class C16709b extends C16708a {

        /* renamed from: b */
        private final ByteBuffer f46688b;

        /* renamed from: c */
        private int f46689c;

        C16709b(ByteBuffer byteBuffer) {
            super(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            this.f46688b = byteBuffer;
            this.f46689c = byteBuffer.position();
        }

        /* renamed from: a */
        public final void mo43247a() {
            this.f46688b.position(this.f46689c + mo43284d());
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.zztv$c */
    static final class C16710c extends zztv {

        /* renamed from: b */
        private final ByteBuffer f46690b;

        /* renamed from: c */
        private final ByteBuffer f46691c;

        /* renamed from: d */
        private final int f46692d;

        C16710c(ByteBuffer byteBuffer) {
            super();
            this.f46690b = byteBuffer;
            this.f46691c = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            this.f46692d = byteBuffer.position();
        }

        /* renamed from: a */
        public final void mo43254a(int i, int i2) throws IOException {
            mo43269b((i << 3) | i2);
        }

        /* renamed from: b */
        public final void mo43270b(int i, int i2) throws IOException {
            mo43254a(i, 0);
            mo43251a(i2);
        }

        /* renamed from: c */
        public final void mo43277c(int i, int i2) throws IOException {
            mo43254a(i, 0);
            mo43269b(i2);
        }

        /* renamed from: e */
        public final void mo43283e(int i, int i2) throws IOException {
            mo43254a(i, 5);
            mo43281d(i2);
        }

        /* renamed from: a */
        public final void mo43255a(int i, long j) throws IOException {
            mo43254a(i, 0);
            mo43261a(j);
        }

        /* renamed from: c */
        public final void mo43278c(int i, long j) throws IOException {
            mo43254a(i, 1);
            mo43279c(j);
        }

        /* renamed from: a */
        public final void mo43260a(int i, boolean z) throws IOException {
            mo43254a(i, 0);
            mo43248a(z ? (byte) 1 : 0);
        }

        /* renamed from: a */
        public final void mo43259a(int i, String str) throws IOException {
            mo43254a(i, 2);
            mo43265a(str);
        }

        /* renamed from: a */
        public final void mo43258a(int i, zzte zzte) throws IOException {
            mo43254a(i, 2);
            mo43264a(zzte);
        }

        /* renamed from: a */
        public final void mo43256a(int i, C16615ij ijVar) throws IOException {
            mo43254a(i, 2);
            mo43262a(ijVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo43257a(int i, C16615ij ijVar, C16633ja jaVar) throws IOException {
            mo43254a(i, 2);
            mo43263a(ijVar, jaVar);
        }

        /* renamed from: b */
        public final void mo43272b(int i, C16615ij ijVar) throws IOException {
            mo43254a(1, 3);
            mo43277c(2, i);
            mo43256a(3, ijVar);
            mo43254a(1, 4);
        }

        /* renamed from: b */
        public final void mo43273b(int i, zzte zzte) throws IOException {
            mo43254a(1, 3);
            mo43277c(2, i);
            mo43258a(3, zzte);
            mo43254a(1, 4);
        }

        /* renamed from: a */
        public final void mo43262a(C16615ij ijVar) throws IOException {
            mo43269b(ijVar.mo42933h());
            ijVar.mo42929a(this);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo43263a(C16615ij ijVar, C16633ja jaVar) throws IOException {
            C16535fq fqVar = (C16535fq) ijVar;
            int e = fqVar.mo42727e();
            if (e == -1) {
                e = jaVar.mo42995b(fqVar);
                fqVar.mo42725a(e);
            }
            mo43269b(e);
            jaVar.mo42993a(ijVar, (C16675kl) this.f46683a);
        }

        /* renamed from: a */
        public final void mo43248a(byte b) throws IOException {
            try {
                this.f46691c.put(b);
            } catch (BufferOverflowException e) {
                throw new zzc((Throwable) e);
            }
        }

        /* renamed from: a */
        public final void mo43264a(zzte zzte) throws IOException {
            mo43269b(zzte.size());
            zzte.zza((C16541fw) this);
        }

        /* renamed from: c */
        public final void mo43280c(byte[] bArr, int i, int i2) throws IOException {
            mo43269b(i2);
            mo43275b(bArr, 0, i2);
        }

        /* renamed from: a */
        public final void mo43251a(int i) throws IOException {
            if (i >= 0) {
                mo43269b(i);
            } else {
                mo43261a((long) i);
            }
        }

        /* renamed from: b */
        public final void mo43269b(int i) throws IOException {
            while ((i & -128) != 0) {
                this.f46691c.put((byte) ((i & 127) | PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH));
                i >>>= 7;
            }
            try {
                this.f46691c.put((byte) i);
            } catch (BufferOverflowException e) {
                throw new zzc((Throwable) e);
            }
        }

        /* renamed from: d */
        public final void mo43281d(int i) throws IOException {
            try {
                this.f46691c.putInt(i);
            } catch (BufferOverflowException e) {
                throw new zzc((Throwable) e);
            }
        }

        /* renamed from: a */
        public final void mo43261a(long j) throws IOException {
            while ((-128 & j) != 0) {
                this.f46691c.put((byte) ((((int) j) & 127) | PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH));
                j >>>= 7;
            }
            try {
                this.f46691c.put((byte) ((int) j));
            } catch (BufferOverflowException e) {
                throw new zzc((Throwable) e);
            }
        }

        /* renamed from: c */
        public final void mo43279c(long j) throws IOException {
            try {
                this.f46691c.putLong(j);
            } catch (BufferOverflowException e) {
                throw new zzc((Throwable) e);
            }
        }

        /* renamed from: b */
        public final void mo43275b(byte[] bArr, int i, int i2) throws IOException {
            try {
                this.f46691c.put(bArr, i, i2);
            } catch (IndexOutOfBoundsException e) {
                throw new zzc((Throwable) e);
            } catch (BufferOverflowException e2) {
                throw new zzc((Throwable) e2);
            }
        }

        /* renamed from: a */
        public final void mo42752a(byte[] bArr, int i, int i2) throws IOException {
            mo43275b(bArr, i, i2);
        }

        /* renamed from: a */
        public final void mo43265a(String str) throws IOException {
            int position = this.f46691c.position();
            try {
                int g = m54941g(str.length() * 3);
                int g2 = m54941g(str.length());
                if (g2 == g) {
                    int position2 = this.f46691c.position() + g2;
                    this.f46691c.position(position2);
                    m55021c(str);
                    int position3 = this.f46691c.position();
                    this.f46691c.position(position);
                    mo43269b(position3 - position2);
                    this.f46691c.position(position3);
                    return;
                }
                mo43269b(C16664ka.m54643a((CharSequence) str));
                m55021c(str);
            } catch (C16668ke e) {
                this.f46691c.position(position);
                mo43266a(str, e);
            } catch (IllegalArgumentException e2) {
                throw new zzc((Throwable) e2);
            }
        }

        /* renamed from: a */
        public final void mo43247a() {
            this.f46690b.position(this.f46691c.position());
        }

        /* renamed from: b */
        public final int mo43268b() {
            return this.f46691c.remaining();
        }

        /* renamed from: c */
        private final void m55021c(String str) throws IOException {
            try {
                C16664ka.m54645a((CharSequence) str, this.f46691c);
            } catch (IndexOutOfBoundsException e) {
                throw new zzc((Throwable) e);
            }
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.zztv$d */
    static final class C16711d extends zztv {

        /* renamed from: b */
        private final ByteBuffer f46693b;

        /* renamed from: c */
        private final ByteBuffer f46694c;

        /* renamed from: d */
        private final long f46695d;

        /* renamed from: e */
        private final long f46696e;

        /* renamed from: f */
        private final long f46697f;

        /* renamed from: g */
        private final long f46698g = (this.f46697f - 10);

        /* renamed from: h */
        private long f46699h = this.f46696e;

        C16711d(ByteBuffer byteBuffer) {
            super();
            this.f46693b = byteBuffer;
            this.f46694c = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            this.f46695d = C16657jy.m54543a(byteBuffer);
            this.f46696e = this.f46695d + ((long) byteBuffer.position());
            this.f46697f = this.f46695d + ((long) byteBuffer.limit());
        }

        /* renamed from: a */
        public final void mo43254a(int i, int i2) throws IOException {
            mo43269b((i << 3) | i2);
        }

        /* renamed from: b */
        public final void mo43270b(int i, int i2) throws IOException {
            mo43254a(i, 0);
            mo43251a(i2);
        }

        /* renamed from: c */
        public final void mo43277c(int i, int i2) throws IOException {
            mo43254a(i, 0);
            mo43269b(i2);
        }

        /* renamed from: e */
        public final void mo43283e(int i, int i2) throws IOException {
            mo43254a(i, 5);
            mo43281d(i2);
        }

        /* renamed from: a */
        public final void mo43255a(int i, long j) throws IOException {
            mo43254a(i, 0);
            mo43261a(j);
        }

        /* renamed from: c */
        public final void mo43278c(int i, long j) throws IOException {
            mo43254a(i, 1);
            mo43279c(j);
        }

        /* renamed from: a */
        public final void mo43260a(int i, boolean z) throws IOException {
            mo43254a(i, 0);
            mo43248a(z ? (byte) 1 : 0);
        }

        /* renamed from: a */
        public final void mo43259a(int i, String str) throws IOException {
            mo43254a(i, 2);
            mo43265a(str);
        }

        /* renamed from: a */
        public final void mo43258a(int i, zzte zzte) throws IOException {
            mo43254a(i, 2);
            mo43264a(zzte);
        }

        /* renamed from: a */
        public final void mo43256a(int i, C16615ij ijVar) throws IOException {
            mo43254a(i, 2);
            mo43262a(ijVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo43257a(int i, C16615ij ijVar, C16633ja jaVar) throws IOException {
            mo43254a(i, 2);
            mo43263a(ijVar, jaVar);
        }

        /* renamed from: b */
        public final void mo43272b(int i, C16615ij ijVar) throws IOException {
            mo43254a(1, 3);
            mo43277c(2, i);
            mo43256a(3, ijVar);
            mo43254a(1, 4);
        }

        /* renamed from: b */
        public final void mo43273b(int i, zzte zzte) throws IOException {
            mo43254a(1, 3);
            mo43277c(2, i);
            mo43258a(3, zzte);
            mo43254a(1, 4);
        }

        /* renamed from: a */
        public final void mo43262a(C16615ij ijVar) throws IOException {
            mo43269b(ijVar.mo42933h());
            ijVar.mo42929a(this);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo43263a(C16615ij ijVar, C16633ja jaVar) throws IOException {
            C16535fq fqVar = (C16535fq) ijVar;
            int e = fqVar.mo42727e();
            if (e == -1) {
                e = jaVar.mo42995b(fqVar);
                fqVar.mo42725a(e);
            }
            mo43269b(e);
            jaVar.mo42993a(ijVar, (C16675kl) this.f46683a);
        }

        /* renamed from: a */
        public final void mo43248a(byte b) throws IOException {
            if (this.f46699h < this.f46697f) {
                long j = this.f46699h;
                this.f46699h = 1 + j;
                C16657jy.m54546a(j, b);
                return;
            }
            throw new zzc(C1642a.m8034a("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(this.f46699h), Long.valueOf(this.f46697f), Integer.valueOf(1)}));
        }

        /* renamed from: a */
        public final void mo43264a(zzte zzte) throws IOException {
            mo43269b(zzte.size());
            zzte.zza((C16541fw) this);
        }

        /* renamed from: c */
        public final void mo43280c(byte[] bArr, int i, int i2) throws IOException {
            mo43269b(i2);
            mo43275b(bArr, 0, i2);
        }

        /* renamed from: a */
        public final void mo43251a(int i) throws IOException {
            if (i >= 0) {
                mo43269b(i);
            } else {
                mo43261a((long) i);
            }
        }

        /* renamed from: b */
        public final void mo43269b(int i) throws IOException {
            if (this.f46699h <= this.f46698g) {
                while ((i & -128) != 0) {
                    long j = this.f46699h;
                    this.f46699h = j + 1;
                    C16657jy.m54546a(j, (byte) ((i & 127) | PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH));
                    i >>>= 7;
                }
                long j2 = this.f46699h;
                this.f46699h = 1 + j2;
                C16657jy.m54546a(j2, (byte) i);
                return;
            }
            while (this.f46699h < this.f46697f) {
                if ((i & -128) == 0) {
                    long j3 = this.f46699h;
                    this.f46699h = 1 + j3;
                    C16657jy.m54546a(j3, (byte) i);
                    return;
                }
                long j4 = this.f46699h;
                this.f46699h = j4 + 1;
                C16657jy.m54546a(j4, (byte) ((i & 127) | PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH));
                i >>>= 7;
            }
            throw new zzc(C1642a.m8034a("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(this.f46699h), Long.valueOf(this.f46697f), Integer.valueOf(1)}));
        }

        /* renamed from: d */
        public final void mo43281d(int i) throws IOException {
            this.f46694c.putInt((int) (this.f46699h - this.f46695d), i);
            this.f46699h += 4;
        }

        /* renamed from: a */
        public final void mo43261a(long j) throws IOException {
            if (this.f46699h <= this.f46698g) {
                while ((j & -128) != 0) {
                    long j2 = this.f46699h;
                    this.f46699h = j2 + 1;
                    C16657jy.m54546a(j2, (byte) ((((int) j) & 127) | PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH));
                    j >>>= 7;
                }
                long j3 = this.f46699h;
                this.f46699h = 1 + j3;
                C16657jy.m54546a(j3, (byte) ((int) j));
                return;
            }
            while (this.f46699h < this.f46697f) {
                if ((j & -128) == 0) {
                    long j4 = this.f46699h;
                    this.f46699h = 1 + j4;
                    C16657jy.m54546a(j4, (byte) ((int) j));
                    return;
                }
                long j5 = this.f46699h;
                this.f46699h = j5 + 1;
                C16657jy.m54546a(j5, (byte) ((((int) j) & 127) | PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH));
                j >>>= 7;
            }
            throw new zzc(C1642a.m8034a("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(this.f46699h), Long.valueOf(this.f46697f), Integer.valueOf(1)}));
        }

        /* renamed from: c */
        public final void mo43279c(long j) throws IOException {
            this.f46694c.putLong((int) (this.f46699h - this.f46695d), j);
            this.f46699h += 8;
        }

        /* renamed from: b */
        public final void mo43275b(byte[] bArr, int i, int i2) throws IOException {
            if (bArr != null && i >= 0 && i2 >= 0 && bArr.length - i2 >= i) {
                long j = (long) i2;
                if (this.f46697f - j >= this.f46699h) {
                    C16657jy.m54555a(bArr, (long) i, this.f46699h, j);
                    this.f46699h += j;
                    return;
                }
            }
            if (bArr == null) {
                throw new NullPointerException("value");
            }
            throw new zzc(C1642a.m8034a("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(this.f46699h), Long.valueOf(this.f46697f), Integer.valueOf(i2)}));
        }

        /* renamed from: a */
        public final void mo42752a(byte[] bArr, int i, int i2) throws IOException {
            mo43275b(bArr, i, i2);
        }

        /* renamed from: a */
        public final void mo43265a(String str) throws IOException {
            long j = this.f46699h;
            try {
                int g = m54941g(str.length() * 3);
                int g2 = m54941g(str.length());
                if (g2 == g) {
                    int i = ((int) (this.f46699h - this.f46695d)) + g2;
                    this.f46694c.position(i);
                    C16664ka.m54645a((CharSequence) str, this.f46694c);
                    int position = this.f46694c.position() - i;
                    mo43269b(position);
                    this.f46699h += (long) position;
                    return;
                }
                int a = C16664ka.m54643a((CharSequence) str);
                mo43269b(a);
                m55050g(this.f46699h);
                C16664ka.m54645a((CharSequence) str, this.f46694c);
                this.f46699h += (long) a;
            } catch (C16668ke e) {
                this.f46699h = j;
                m55050g(this.f46699h);
                mo43266a(str, e);
            } catch (IllegalArgumentException e2) {
                throw new zzc((Throwable) e2);
            } catch (IndexOutOfBoundsException e3) {
                throw new zzc((Throwable) e3);
            }
        }

        /* renamed from: a */
        public final void mo43247a() {
            this.f46693b.position((int) (this.f46699h - this.f46695d));
        }

        /* renamed from: b */
        public final int mo43268b() {
            return (int) (this.f46697f - this.f46699h);
        }

        /* renamed from: g */
        private final void m55050g(long j) {
            this.f46694c.position((int) (j - this.f46695d));
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
    public static zztv m54913a(byte[] bArr) {
        return new C16708a(bArr, 0, bArr.length);
    }

    /* renamed from: e */
    public static int m54936e(long j) {
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
    public static int m54941g(int i) {
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
    private static long m54944g(long j) {
        return (j >> 63) ^ (j << 1);
    }

    /* renamed from: k */
    private static int m54952k(int i) {
        return (i >> 31) ^ (i << 1);
    }

    /* renamed from: a */
    public abstract void mo43247a() throws IOException;

    /* renamed from: a */
    public abstract void mo43248a(byte b) throws IOException;

    /* renamed from: a */
    public abstract void mo43251a(int i) throws IOException;

    /* renamed from: a */
    public abstract void mo43254a(int i, int i2) throws IOException;

    /* renamed from: a */
    public abstract void mo43255a(int i, long j) throws IOException;

    /* renamed from: a */
    public abstract void mo43256a(int i, C16615ij ijVar) throws IOException;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract void mo43257a(int i, C16615ij ijVar, C16633ja jaVar) throws IOException;

    /* renamed from: a */
    public abstract void mo43258a(int i, zzte zzte) throws IOException;

    /* renamed from: a */
    public abstract void mo43259a(int i, String str) throws IOException;

    /* renamed from: a */
    public abstract void mo43260a(int i, boolean z) throws IOException;

    /* renamed from: a */
    public abstract void mo43261a(long j) throws IOException;

    /* renamed from: a */
    public abstract void mo43262a(C16615ij ijVar) throws IOException;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract void mo43263a(C16615ij ijVar, C16633ja jaVar) throws IOException;

    /* renamed from: a */
    public abstract void mo43264a(zzte zzte) throws IOException;

    /* renamed from: a */
    public abstract void mo43265a(String str) throws IOException;

    /* renamed from: b */
    public abstract int mo43268b();

    /* renamed from: b */
    public abstract void mo43269b(int i) throws IOException;

    /* renamed from: b */
    public abstract void mo43270b(int i, int i2) throws IOException;

    /* renamed from: b */
    public abstract void mo43272b(int i, C16615ij ijVar) throws IOException;

    /* renamed from: b */
    public abstract void mo43273b(int i, zzte zzte) throws IOException;

    /* renamed from: b */
    public abstract void mo43275b(byte[] bArr, int i, int i2) throws IOException;

    /* renamed from: c */
    public abstract void mo43277c(int i, int i2) throws IOException;

    /* renamed from: c */
    public abstract void mo43278c(int i, long j) throws IOException;

    /* renamed from: c */
    public abstract void mo43279c(long j) throws IOException;

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public abstract void mo43280c(byte[] bArr, int i, int i2) throws IOException;

    /* renamed from: d */
    public abstract void mo43281d(int i) throws IOException;

    /* renamed from: e */
    public abstract void mo43283e(int i, int i2) throws IOException;

    /* renamed from: a */
    public static zztv m54912a(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return new C16709b(byteBuffer);
        }
        if (!byteBuffer.isDirect() || byteBuffer.isReadOnly()) {
            throw new IllegalArgumentException("ByteBuffer is read-only");
        } else if (C16657jy.m54561b()) {
            return new C16711d(byteBuffer);
        } else {
            return new C16710c(byteBuffer);
        }
    }

    private zztv() {
    }

    /* renamed from: d */
    public final void mo43282d(int i, int i2) throws IOException {
        mo43277c(i, m54952k(i2));
    }

    /* renamed from: b */
    public final void mo43271b(int i, long j) throws IOException {
        mo43255a(i, m54944g(j));
    }

    /* renamed from: a */
    public final void mo43253a(int i, float f) throws IOException {
        mo43283e(i, Float.floatToRawIntBits(f));
    }

    /* renamed from: a */
    public final void mo43252a(int i, double d) throws IOException {
        mo43278c(i, Double.doubleToRawLongBits(d));
    }

    /* renamed from: c */
    public final void mo43276c(int i) throws IOException {
        mo43269b(m54952k(i));
    }

    /* renamed from: b */
    public final void mo43274b(long j) throws IOException {
        mo43261a(m54944g(j));
    }

    /* renamed from: a */
    public final void mo43250a(float f) throws IOException {
        mo43281d(Float.floatToRawIntBits(f));
    }

    /* renamed from: a */
    public final void mo43249a(double d) throws IOException {
        mo43279c(Double.doubleToRawLongBits(d));
    }

    /* renamed from: a */
    public final void mo43267a(boolean z) throws IOException {
        mo43248a(z ? (byte) 1 : 0);
    }

    /* renamed from: f */
    public static int m54938f(int i, int i2) {
        return m54934e(i) + m54937f(i2);
    }

    /* renamed from: g */
    public static int m54942g(int i, int i2) {
        return m54934e(i) + m54941g(i2);
    }

    /* renamed from: h */
    public static int m54946h(int i, int i2) {
        return m54934e(i) + m54941g(m54952k(i2));
    }

    /* renamed from: i */
    public static int m54949i(int i, int i2) {
        return m54934e(i) + 4;
    }

    /* renamed from: j */
    public static int m54951j(int i, int i2) {
        return m54934e(i) + 4;
    }

    /* renamed from: d */
    public static int m54930d(int i, long j) {
        return m54934e(i) + m54936e(j);
    }

    /* renamed from: e */
    public static int m54935e(int i, long j) {
        return m54934e(i) + m54936e(j);
    }

    /* renamed from: f */
    public static int m54939f(int i, long j) {
        return m54934e(i) + m54936e(m54944g(j));
    }

    /* renamed from: g */
    public static int m54943g(int i, long j) {
        return m54934e(i) + 8;
    }

    /* renamed from: h */
    public static int m54947h(int i, long j) {
        return m54934e(i) + 8;
    }

    /* renamed from: b */
    public static int m54915b(int i, float f) {
        return m54934e(i) + 4;
    }

    /* renamed from: b */
    public static int m54914b(int i, double d) {
        return m54934e(i) + 8;
    }

    /* renamed from: b */
    public static int m54919b(int i, boolean z) {
        return m54934e(i) + 1;
    }

    /* renamed from: k */
    public static int m54953k(int i, int i2) {
        return m54934e(i) + m54937f(i2);
    }

    /* renamed from: b */
    public static int m54918b(int i, String str) {
        return m54934e(i) + m54923b(str);
    }

    /* renamed from: c */
    public static int m54927c(int i, zzte zzte) {
        int e = m54934e(i);
        int size = zzte.size();
        return e + m54941g(size) + size;
    }

    /* renamed from: a */
    public static int m54910a(int i, C16596hr hrVar) {
        int e = m54934e(i);
        int b = hrVar.mo42961b();
        return e + m54941g(b) + b;
    }

    /* renamed from: c */
    public static int m54925c(int i, C16615ij ijVar) {
        return m54934e(i) + m54920b(ijVar);
    }

    /* renamed from: b */
    static int m54917b(int i, C16615ij ijVar, C16633ja jaVar) {
        return m54934e(i) + m54921b(ijVar, jaVar);
    }

    /* renamed from: d */
    public static int m54931d(int i, C16615ij ijVar) {
        return (m54934e(1) << 1) + m54942g(2, i) + m54925c(3, ijVar);
    }

    /* renamed from: d */
    public static int m54932d(int i, zzte zzte) {
        return (m54934e(1) << 1) + m54942g(2, i) + m54927c(3, zzte);
    }

    /* renamed from: b */
    public static int m54916b(int i, C16596hr hrVar) {
        return (m54934e(1) << 1) + m54942g(2, i) + m54910a(3, hrVar);
    }

    /* renamed from: e */
    public static int m54934e(int i) {
        return m54941g(i << 3);
    }

    /* renamed from: f */
    public static int m54937f(int i) {
        if (i >= 0) {
            return m54941g(i);
        }
        return 10;
    }

    /* renamed from: h */
    public static int m54945h(int i) {
        return m54941g(m54952k(i));
    }

    /* renamed from: d */
    public static int m54933d(long j) {
        return m54936e(j);
    }

    /* renamed from: f */
    public static int m54940f(long j) {
        return m54936e(m54944g(j));
    }

    /* renamed from: i */
    public static int m54948i(int i) {
        return m54937f(i);
    }

    /* renamed from: b */
    public static int m54923b(String str) {
        int i;
        try {
            i = C16664ka.m54643a((CharSequence) str);
        } catch (C16668ke unused) {
            i = str.getBytes(C16586hh.f46424a).length;
        }
        return m54941g(i) + i;
    }

    /* renamed from: a */
    public static int m54911a(C16596hr hrVar) {
        int b = hrVar.mo42961b();
        return m54941g(b) + b;
    }

    /* renamed from: b */
    public static int m54922b(zzte zzte) {
        int size = zzte.size();
        return m54941g(size) + size;
    }

    /* renamed from: b */
    public static int m54924b(byte[] bArr) {
        int length = bArr.length;
        return m54941g(length) + length;
    }

    /* renamed from: b */
    public static int m54920b(C16615ij ijVar) {
        int h = ijVar.mo42933h();
        return m54941g(h) + h;
    }

    /* renamed from: b */
    static int m54921b(C16615ij ijVar, C16633ja jaVar) {
        C16535fq fqVar = (C16535fq) ijVar;
        int e = fqVar.mo42727e();
        if (e == -1) {
            e = jaVar.mo42995b(fqVar);
            fqVar.mo42725a(e);
        }
        return m54941g(e) + e;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo43266a(String str, C16668ke keVar) throws IOException {
        f46681b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", keVar);
        byte[] bytes = str.getBytes(C16586hh.f46424a);
        try {
            mo43269b(bytes.length);
            mo42752a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e) {
            throw new zzc((Throwable) e);
        } catch (zzc e2) {
            throw e2;
        }
    }

    /* renamed from: c */
    static int m54926c(int i, C16615ij ijVar, C16633ja jaVar) {
        int e = m54934e(i) << 1;
        C16535fq fqVar = (C16535fq) ijVar;
        int e2 = fqVar.mo42727e();
        if (e2 == -1) {
            e2 = jaVar.mo42995b(fqVar);
            fqVar.mo42725a(e2);
        }
        return e + e2;
    }

    /* renamed from: c */
    public static int m54928c(C16615ij ijVar) {
        return ijVar.mo42933h();
    }

    /* renamed from: j */
    public static int m54950j(int i) {
        return m54941g(i);
    }
}
