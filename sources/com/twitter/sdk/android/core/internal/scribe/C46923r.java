package com.twitter.sdk.android.core.internal.scribe;

import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.twitter.sdk.android.core.internal.scribe.r */
public class C46923r implements Closeable {

    /* renamed from: c */
    private static final Logger f120309c = Logger.getLogger(C46923r.class.getName());

    /* renamed from: a */
    public final RandomAccessFile f120310a;

    /* renamed from: b */
    int f120311b;

    /* renamed from: d */
    private int f120312d;

    /* renamed from: e */
    private C46925a f120313e;

    /* renamed from: f */
    private C46925a f120314f;

    /* renamed from: g */
    private final byte[] f120315g = new byte[16];

    /* renamed from: com.twitter.sdk.android.core.internal.scribe.r$a */
    static class C46925a {

        /* renamed from: a */
        static final C46925a f120319a = new C46925a(0, 0);

        /* renamed from: b */
        final int f120320b;

        /* renamed from: c */
        final int f120321c;

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getClass().getSimpleName());
            sb.append("[position = ");
            sb.append(this.f120320b);
            sb.append(", length = ");
            sb.append(this.f120321c);
            sb.append("]");
            return sb.toString();
        }

        C46925a(int i, int i2) {
            this.f120320b = i;
            this.f120321c = i2;
        }
    }

    /* renamed from: com.twitter.sdk.android.core.internal.scribe.r$b */
    final class C46926b extends InputStream {

        /* renamed from: b */
        private int f120323b;

        /* renamed from: c */
        private int f120324c;

        public final int read() throws IOException {
            if (this.f120324c == 0) {
                return -1;
            }
            C46923r.this.f120310a.seek((long) this.f120323b);
            int read = C46923r.this.f120310a.read();
            this.f120323b = C46923r.this.mo118065a(this.f120323b + 1);
            this.f120324c--;
            return read;
        }

        private C46926b(C46925a aVar) {
            this.f120323b = C46923r.this.mo118065a(aVar.f120320b + 4);
            this.f120324c = aVar.f120321c;
        }

        public final int read(byte[] bArr, int i, int i2) throws IOException {
            C46923r.m146761a(bArr, "buffer");
            if ((i | i2) < 0 || i2 > bArr.length - i) {
                throw new ArrayIndexOutOfBoundsException();
            } else if (this.f120324c <= 0) {
                return -1;
            } else {
                if (i2 > this.f120324c) {
                    i2 = this.f120324c;
                }
                C46923r.this.mo118066a(this.f120323b, bArr, i, i2);
                this.f120323b = C46923r.this.mo118065a(this.f120323b + i2);
                this.f120324c -= i2;
                return i2;
            }
        }
    }

    /* renamed from: com.twitter.sdk.android.core.internal.scribe.r$c */
    public interface C46927c {
        /* renamed from: a */
        void mo118073a(InputStream inputStream, int i) throws IOException;
    }

    /* renamed from: a */
    public final void mo118066a(int i, byte[] bArr, int i2, int i3) throws IOException {
        int a = mo118065a(i);
        if (a + i3 <= this.f120311b) {
            this.f120310a.seek((long) a);
            this.f120310a.readFully(bArr, i2, i3);
            return;
        }
        int i4 = this.f120311b - a;
        this.f120310a.seek((long) a);
        this.f120310a.readFully(bArr, i2, i4);
        this.f120310a.seek(16);
        this.f120310a.readFully(bArr, i2 + i4, i3 - i4);
    }

    /* renamed from: a */
    public final synchronized void mo118067a(C46927c cVar) throws IOException {
        int i = this.f120313e.f120320b;
        for (int i2 = 0; i2 < this.f120312d; i2++) {
            C46925a b = m146766b(i);
            cVar.mo118073a(new C46926b(b), b.f120321c);
            i = mo118065a(b.f120320b + 4 + b.f120321c);
        }
    }

    /* renamed from: a */
    public final boolean mo118069a(int i, int i2) {
        return (mo118064a() + 4) + i <= i2;
    }

    /* renamed from: d */
    private int m146772d() {
        return this.f120311b - mo118064a();
    }

    /* renamed from: b */
    public final synchronized boolean mo118070b() {
        boolean z;
        if (this.f120312d == 0) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    public synchronized void close() throws IOException {
        this.f120310a.close();
    }

    /* renamed from: c */
    private void m146770c() throws IOException {
        this.f120310a.seek(0);
        this.f120310a.readFully(this.f120315g);
        this.f120311b = m146760a(this.f120315g, 0);
        if (((long) this.f120311b) <= this.f120310a.length()) {
            this.f120312d = m146760a(this.f120315g, 4);
            int a = m146760a(this.f120315g, 8);
            int a2 = m146760a(this.f120315g, 12);
            this.f120313e = m146766b(a);
            this.f120314f = m146766b(a2);
            return;
        }
        StringBuilder sb = new StringBuilder("File is truncated. Expected length: ");
        sb.append(this.f120311b);
        sb.append(", Actual length: ");
        sb.append(this.f120310a.length());
        throw new IOException(sb.toString());
    }

    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        sb.append("fileLength=");
        sb.append(this.f120311b);
        sb.append(", size=");
        sb.append(this.f120312d);
        sb.append(", first=");
        sb.append(this.f120313e);
        sb.append(", last=");
        sb.append(this.f120314f);
        sb.append(", element lengths=[");
        try {
            mo118067a((C46927c) new C46927c() {

                /* renamed from: a */
                boolean f120316a = true;

                /* renamed from: a */
                public final void mo118073a(InputStream inputStream, int i) throws IOException {
                    if (this.f120316a) {
                        this.f120316a = false;
                    } else {
                        sb.append(", ");
                    }
                    sb.append(i);
                }
            });
        } catch (IOException e) {
            f120309c.log(Level.WARNING, "read error", e);
        }
        sb.append("]]");
        return sb.toString();
    }

    /* renamed from: a */
    public final int mo118064a() {
        if (this.f120312d == 0) {
            return 16;
        }
        if (this.f120314f.f120320b >= this.f120313e.f120320b) {
            return (this.f120314f.f120320b - this.f120313e.f120320b) + 4 + this.f120314f.f120321c + 16;
        }
        return (((this.f120314f.f120320b + 4) + this.f120314f.f120321c) + this.f120311b) - this.f120313e.f120320b;
    }

    /* renamed from: b */
    private static RandomAccessFile m146767b(File file) throws FileNotFoundException {
        return new RandomAccessFile(file, "rwd");
    }

    /* renamed from: a */
    public final void mo118068a(byte[] bArr) throws IOException {
        m146769b(bArr, 0, bArr.length);
    }

    public C46923r(File file) throws IOException {
        if (!file.exists()) {
            m146763a(file);
        }
        this.f120310a = m146767b(file);
        m146770c();
    }

    /* renamed from: b */
    private C46925a m146766b(int i) throws IOException {
        if (i == 0) {
            return C46925a.f120319a;
        }
        this.f120310a.seek((long) i);
        return new C46925a(i, this.f120310a.readInt());
    }

    /* renamed from: d */
    private void m146773d(int i) throws IOException {
        this.f120310a.setLength((long) i);
        this.f120310a.getChannel().force(true);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    private static void m146763a(File file) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append(file.getPath());
        sb.append(".tmp");
        File file2 = new File(sb.toString());
        RandomAccessFile b = m146767b(file2);
        try {
            b.setLength(4096);
            b.seek(0);
            byte[] bArr = new byte[16];
            m146765a(bArr, 4096, 0, 0, 0);
            b.write(bArr);
            b.close();
            if (!file2.renameTo(file)) {
                throw new IOException("Rename failed!");
            }
        } catch (Throwable th) {
            b.close();
            throw th;
        }
    }

    /* renamed from: c */
    private void m146771c(int i) throws IOException {
        int i2 = i + 4;
        int d = m146772d();
        if (d < i2) {
            int i3 = this.f120311b;
            do {
                d += i3;
                i3 <<= 1;
            } while (d < i2);
            m146773d(i3);
            int a = mo118065a(this.f120314f.f120320b + 4 + this.f120314f.f120321c);
            if (a < this.f120313e.f120320b) {
                FileChannel channel = this.f120310a.getChannel();
                channel.position((long) this.f120311b);
                long j = (long) (a - 4);
                if (channel.transferTo(16, j, channel) != j) {
                    throw new AssertionError("Copied insufficient number of bytes!");
                }
            }
            if (this.f120314f.f120320b < this.f120313e.f120320b) {
                int i4 = (this.f120311b + this.f120314f.f120320b) - 16;
                m146762a(i3, this.f120312d, this.f120313e.f120320b, i4);
                this.f120314f = new C46925a(i4, this.f120314f.f120321c);
            } else {
                m146762a(i3, this.f120312d, this.f120313e.f120320b, this.f120314f.f120320b);
            }
            this.f120311b = i3;
        }
    }

    /* renamed from: a */
    public final int mo118065a(int i) {
        if (i < this.f120311b) {
            return i;
        }
        return (i + 16) - this.f120311b;
    }

    /* renamed from: a */
    public static <T> T m146761a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: a */
    private static int m146760a(byte[] bArr, int i) {
        return ((bArr[i] & 255) << 24) + ((bArr[i + 1] & 255) << 16) + ((bArr[i + 2] & 255) << 8) + (bArr[i + 3] & 255);
    }

    /* renamed from: a */
    private static void m146765a(byte[] bArr, int... iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            m146764a(bArr, i, iArr[i2]);
            i += 4;
        }
    }

    /* renamed from: b */
    private synchronized void m146769b(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        int i4;
        m146761a((T) bArr, "buffer");
        if ((i2 | 0) < 0 || i2 > bArr.length - 0) {
            throw new IndexOutOfBoundsException();
        }
        m146771c(i2);
        boolean b = mo118070b();
        if (b) {
            i3 = 16;
        } else {
            i3 = mo118065a(this.f120314f.f120320b + 4 + this.f120314f.f120321c);
        }
        C46925a aVar = new C46925a(i3, i2);
        m146764a(this.f120315g, 0, i2);
        m146768b(aVar.f120320b, this.f120315g, 0, 4);
        m146768b(aVar.f120320b + 4, bArr, 0, i2);
        if (b) {
            i4 = aVar.f120320b;
        } else {
            i4 = this.f120313e.f120320b;
        }
        m146762a(this.f120311b, this.f120312d + 1, i4, aVar.f120320b);
        this.f120314f = aVar;
        this.f120312d++;
        if (b) {
            this.f120313e = this.f120314f;
        }
    }

    /* renamed from: a */
    private static void m146764a(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 >> 24);
        bArr[i + 1] = (byte) (i2 >> 16);
        bArr[i + 2] = (byte) (i2 >> 8);
        bArr[i + 3] = (byte) i2;
    }

    /* renamed from: a */
    private void m146762a(int i, int i2, int i3, int i4) throws IOException {
        m146765a(this.f120315g, i, i2, i3, i4);
        this.f120310a.seek(0);
        this.f120310a.write(this.f120315g);
    }

    /* renamed from: b */
    private void m146768b(int i, byte[] bArr, int i2, int i3) throws IOException {
        int a = mo118065a(i);
        if (a + i3 <= this.f120311b) {
            this.f120310a.seek((long) a);
            this.f120310a.write(bArr, i2, i3);
            return;
        }
        int i4 = this.f120311b - a;
        this.f120310a.seek((long) a);
        this.f120310a.write(bArr, i2, i4);
        this.f120310a.seek(16);
        this.f120310a.write(bArr, i2 + i4, i3 - i4);
    }
}
