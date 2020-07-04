package com.p280ss.android.ugc.aweme.emoji.utils.zip;

import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import java.io.ByteArrayOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.util.Calendar;
import java.util.List;
import java.util.Map;
import java.util.zip.CRC32;
import java.util.zip.Deflater;
import java.util.zip.ZipException;

/* renamed from: com.ss.android.ugc.aweme.emoji.utils.zip.v */
public final class C27677v extends FilterOutputStream {

    /* renamed from: f */
    protected static final byte[] f72931f = C27676u.f72927c.mo71099a();

    /* renamed from: g */
    protected static final byte[] f72932g = C27676u.f72928d.mo71099a();

    /* renamed from: h */
    protected static final byte[] f72933h = C27676u.f72926b.mo71099a();

    /* renamed from: i */
    protected static final byte[] f72934i = C27676u.m90767a(101010256);

    /* renamed from: j */
    static final byte[] f72935j = C27676u.m90767a(101075792);

    /* renamed from: k */
    static final byte[] f72936k = C27676u.m90767a(117853008);

    /* renamed from: m */
    private static final byte[] f72937m = new byte[0];

    /* renamed from: t */
    private static final byte[] f72938t = {0, 0};

    /* renamed from: u */
    private static final byte[] f72939u = {0, 0, 0, 0};

    /* renamed from: v */
    private static final byte[] f72940v = C27676u.m90767a(1);

    /* renamed from: A */
    private boolean f72941A;

    /* renamed from: B */
    private final Calendar f72942B;

    /* renamed from: a */
    public String f72943a;

    /* renamed from: b */
    protected final Deflater f72944b;

    /* renamed from: c */
    protected byte[] f72945c;

    /* renamed from: d */
    public boolean f72946d;

    /* renamed from: e */
    public Zip64Mode f72947e;

    /* renamed from: l */
    private boolean f72948l;

    /* renamed from: n */
    private C27678a f72949n;

    /* renamed from: o */
    private final List<C27667r> f72950o;

    /* renamed from: p */
    private final CRC32 f72951p;

    /* renamed from: q */
    private long f72952q;

    /* renamed from: r */
    private long f72953r;

    /* renamed from: s */
    private long f72954s;

    /* renamed from: w */
    private final Map<C27667r, Long> f72955w;

    /* renamed from: x */
    private C27664p f72956x;

    /* renamed from: y */
    private final RandomAccessFile f72957y;

    /* renamed from: z */
    private boolean f72958z;

    /* renamed from: com.ss.android.ugc.aweme.emoji.utils.zip.v$a */
    static final class C27678a {

        /* renamed from: a */
        public final C27667r f72959a;

        /* renamed from: b */
        public long f72960b;

        /* renamed from: c */
        public long f72961c;

        /* renamed from: d */
        public long f72962d;

        /* renamed from: e */
        public boolean f72963e;

        /* renamed from: f */
        public boolean f72964f;
    }

    /* renamed from: a */
    private boolean m90781a(C27667r rVar, Zip64Mode zip64Mode) {
        return zip64Mode == Zip64Mode.Always || m90780a(rVar);
    }

    /* renamed from: a */
    private static boolean m90780a(C27667r rVar) {
        return rVar.getSize() >= 4294967295L || rVar.getCompressedSize() >= 4294967295L;
    }

    /* renamed from: a */
    private byte[] m90782a(C27667r rVar, ByteBuffer byteBuffer, long j, boolean z) throws IOException {
        C27667r rVar2 = rVar;
        byte[] b = rVar.mo71078b();
        String comment = rVar.getComment();
        if (comment == null) {
            comment = "";
        }
        ByteBuffer b2 = m90798g(rVar).mo71055b(comment);
        int limit = byteBuffer.limit() - byteBuffer.position();
        int limit2 = b2.limit() - b2.position();
        int i = limit + 46;
        byte[] bArr = new byte[(b.length + i + limit2)];
        System.arraycopy(f72933h, 0, bArr, 0, 4);
        C27679w.m90806a((rVar2.f72891b << 8) | (!this.f72941A ? 20 : 45), bArr, 4);
        int method = rVar.getMethod();
        boolean a = this.f72956x.mo71054a(rVar.getName());
        C27679w.m90806a(m90783b(method, z), bArr, 6);
        m90771a(method, !a && this.f72946d).mo71056a(bArr, 8);
        C27679w.m90806a(method, bArr, 10);
        C27680x.m90813a(this.f72942B, rVar.getTime(), bArr, 12);
        C27676u.m90766a(rVar.getCrc(), bArr, 16);
        if (rVar.getCompressedSize() >= 4294967295L || rVar.getSize() >= 4294967295L) {
            C27676u.f72929e.mo71098a(bArr, 20);
            C27676u.f72929e.mo71098a(bArr, 24);
        } else {
            C27676u.m90766a(rVar.getCompressedSize(), bArr, 20);
            C27676u.m90766a(rVar.getSize(), bArr, 24);
        }
        C27679w.m90806a(limit, bArr, 28);
        C27679w.m90806a(b.length, bArr, 30);
        C27679w.m90806a(limit2, bArr, 32);
        System.arraycopy(f72938t, 0, bArr, 34, 2);
        C27679w.m90806a(rVar2.f72890a, bArr, 36);
        C27676u.m90766a(rVar2.f72892c, bArr, 38);
        C27676u.m90766a(Math.min(j, 4294967295L), bArr, 42);
        System.arraycopy(byteBuffer.array(), byteBuffer.arrayOffset(), bArr, 46, limit);
        System.arraycopy(b, 0, bArr, i, b.length);
        System.arraycopy(b2.array(), b2.arrayOffset(), bArr, i + b.length, limit2);
        return bArr;
    }

    /* renamed from: i */
    private void m90802i() throws IOException {
        while (!this.f72944b.needsInput()) {
            m90797f();
        }
    }

    public final void close() throws IOException {
        if (!this.f72948l) {
            m90772a();
        }
        m90803j();
    }

    public final void flush() throws IOException {
        if (this.out != null) {
            this.out.flush();
        }
    }

    /* renamed from: e */
    private void m90794e() throws IOException {
        if (this.f72949n.f72959a.getMethod() == 8) {
            this.f72944b.finish();
            while (!this.f72944b.finished()) {
                m90797f();
            }
        }
    }

    /* renamed from: f */
    private void m90797f() throws IOException {
        int deflate = this.f72944b.deflate(this.f72945c, 0, this.f72945c.length);
        if (deflate > 0) {
            m90776a(this.f72945c, 0, deflate);
        }
    }

    /* renamed from: j */
    private void m90803j() throws IOException {
        if (this.f72957y != null) {
            this.f72957y.close();
        }
        if (this.out != null) {
            this.out.close();
        }
    }

    /* renamed from: a */
    private void m90772a() throws IOException {
        if (!this.f72948l) {
            if (this.f72949n != null) {
                m90789c();
            }
            this.f72953r = this.f72952q;
            m90784b();
            this.f72954s = this.f72952q - this.f72953r;
            m90801h();
            m90799g();
            this.f72955w.clear();
            this.f72950o.clear();
            this.f72944b.end();
            this.f72948l = true;
            return;
        }
        throw new IOException("This archive has already been finished");
    }

    /* renamed from: b */
    private void m90784b() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(70000);
        while (true) {
            int i = 0;
            for (C27667r c : this.f72950o) {
                byteArrayOutputStream.write(m90791c(c));
                i++;
                if (i > 1000) {
                    m90775a(byteArrayOutputStream.toByteArray());
                    byteArrayOutputStream.reset();
                }
            }
            m90775a(byteArrayOutputStream.toByteArray());
            return;
        }
    }

    /* renamed from: c */
    private void m90789c() throws IOException {
        m90793d();
        m90794e();
        Zip64Mode f = m90796f(this.f72949n.f72959a);
        long j = this.f72952q - this.f72949n.f72961c;
        long value = this.f72951p.getValue();
        this.f72951p.reset();
        m90774a(m90778a(j, value, f));
    }

    /* renamed from: d */
    private void m90793d() throws IOException {
        if (this.f72948l) {
            throw new IOException("Stream has already been finished");
        } else if (this.f72949n == null) {
            throw new IOException("No current entry to close");
        } else if (!this.f72949n.f72964f) {
            write(f72937m, 0, 0);
        }
    }

    /* renamed from: g */
    private void m90799g() throws IOException {
        m90775a(f72934i);
        m90775a(f72938t);
        m90775a(f72938t);
        int size = this.f72950o.size();
        if (size > 65535 && this.f72947e == Zip64Mode.Never) {
            throw new Zip64RequiredException("archive contains more than 65535 entries.");
        } else if (this.f72953r <= 4294967295L || this.f72947e != Zip64Mode.Never) {
            byte[] a = C27679w.m90807a(Math.min(size, 65535));
            m90775a(a);
            m90775a(a);
            m90775a(C27676u.m90767a(Math.min(this.f72954s, 4294967295L)));
            m90775a(C27676u.m90767a(Math.min(this.f72953r, 4294967295L)));
            ByteBuffer b = this.f72956x.mo71055b(this.f72943a);
            int limit = b.limit() - b.position();
            m90775a(C27679w.m90807a(limit));
            m90776a(b.array(), b.arrayOffset(), limit);
        } else {
            throw new Zip64RequiredException("archive's size exceeds the limit of 4GByte.");
        }
    }

    /* renamed from: h */
    private void m90801h() throws IOException {
        if (this.f72947e != Zip64Mode.Never) {
            if (!this.f72941A && (this.f72953r >= 4294967295L || this.f72954s >= 4294967295L || this.f72950o.size() >= 65535)) {
                this.f72941A = true;
            }
            if (this.f72941A) {
                long j = this.f72952q;
                m90787b(f72935j);
                m90787b(C27663o.m90712a(44));
                m90787b(C27679w.m90807a(45));
                m90787b(C27679w.m90807a(45));
                m90787b(f72939u);
                m90787b(f72939u);
                byte[] a = C27663o.m90712a((long) this.f72950o.size());
                m90787b(a);
                m90787b(a);
                m90787b(C27663o.m90712a(this.f72954s));
                m90787b(C27663o.m90712a(this.f72953r));
                m90787b(f72936k);
                m90787b(f72939u);
                m90787b(C27663o.m90712a(j));
                m90787b(f72940v);
            }
        }
    }

    /* renamed from: a */
    private void m90775a(byte[] bArr) throws IOException {
        m90776a(bArr, 0, bArr.length);
    }

    /* renamed from: b */
    private void m90787b(byte[] bArr) throws IOException {
        m90790c(bArr, 0, bArr.length);
    }

    /* renamed from: e */
    private static boolean m90795e(C27667r rVar) {
        if (rVar.mo71077b(C27662n.f72874a) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    private ByteBuffer m90800h(C27667r rVar) throws IOException {
        return m90798g(rVar).mo71055b(rVar.getName());
    }

    /* renamed from: g */
    private C27664p m90798g(C27667r rVar) {
        if (this.f72956x.mo71054a(rVar.getName()) || !this.f72946d) {
            return this.f72956x;
        }
        return C27665q.f72883a;
    }

    /* renamed from: d */
    private C27662n m90792d(C27667r rVar) {
        if (this.f72949n != null) {
            this.f72949n.f72963e = !this.f72941A;
        }
        this.f72941A = true;
        C27662n nVar = (C27662n) rVar.mo71077b(C27662n.f72874a);
        if (nVar == null) {
            nVar = new C27662n();
        }
        rVar.mo71072a((C27668s) nVar);
        return nVar;
    }

    /* renamed from: f */
    private Zip64Mode m90796f(C27667r rVar) {
        if (this.f72947e == Zip64Mode.AsNeeded && this.f72957y == null && rVar.getMethod() == 8 && rVar.getSize() == -1) {
            return Zip64Mode.Never;
        }
        return this.f72947e;
    }

    /* renamed from: b */
    private void m90785b(C27667r rVar) throws IOException {
        if (rVar.getMethod() == 8 && this.f72957y == null) {
            m90775a(f72932g);
            m90775a(C27676u.m90767a(rVar.getCrc()));
            if (!m90795e(rVar)) {
                m90775a(C27676u.m90767a(rVar.getCompressedSize()));
                m90775a(C27676u.m90767a(rVar.getSize()));
                return;
            }
            m90775a(C27663o.m90712a(rVar.getCompressedSize()));
            m90775a(C27663o.m90712a(rVar.getSize()));
        }
    }

    /* renamed from: c */
    private byte[] m90791c(C27667r rVar) throws IOException {
        boolean z;
        long longValue = ((Long) this.f72955w.get(rVar)).longValue();
        if (m90795e(rVar) || rVar.getCompressedSize() >= 4294967295L || rVar.getSize() >= 4294967295L || longValue >= 4294967295L) {
            z = true;
        } else {
            z = false;
        }
        if (!z || this.f72947e != Zip64Mode.Never) {
            m90773a(rVar, longValue, z);
            return m90782a(rVar, m90800h(rVar), longValue, z);
        }
        throw new Zip64RequiredException("archive's size exceeds the limit of 4GByte.");
    }

    /* renamed from: a */
    private void m90774a(boolean z) throws IOException {
        if (this.f72957y != null) {
            m90786b(z);
        }
        m90785b(this.f72949n.f72959a);
        this.f72949n = null;
    }

    /* renamed from: b */
    private void m90786b(boolean z) throws IOException {
        long filePointer = this.f72957y.getFilePointer();
        this.f72957y.seek(this.f72949n.f72960b);
        m90787b(C27676u.m90767a(this.f72949n.f72959a.getCrc()));
        if (!m90795e(this.f72949n.f72959a) || !z) {
            m90787b(C27676u.m90767a(this.f72949n.f72959a.getCompressedSize()));
            m90787b(C27676u.m90767a(this.f72949n.f72959a.getSize()));
        } else {
            m90787b(C27676u.f72929e.mo71099a());
            m90787b(C27676u.f72929e.mo71099a());
        }
        if (m90795e(this.f72949n.f72959a)) {
            this.f72957y.seek(this.f72949n.f72960b + 12 + 4 + ((long) m90800h(this.f72949n.f72959a).limit()) + 4);
            m90787b(C27663o.m90712a(this.f72949n.f72959a.getSize()));
            m90787b(C27663o.m90712a(this.f72949n.f72959a.getCompressedSize()));
            if (!z) {
                this.f72957y.seek(this.f72949n.f72960b - 10);
                m90787b(C27679w.m90807a(10));
                this.f72949n.f72959a.mo71073a(C27662n.f72874a);
                this.f72949n.f72959a.mo71071a();
                if (this.f72949n.f72963e) {
                    this.f72941A = false;
                }
            }
        }
        this.f72957y.seek(filePointer);
    }

    /* renamed from: a */
    private boolean m90777a(int i) {
        if (i == 8 && this.f72957y == null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private boolean m90779a(Zip64Mode zip64Mode) throws ZipException {
        boolean a = m90781a(this.f72949n.f72959a, zip64Mode);
        if (!a || zip64Mode != Zip64Mode.Never) {
            return a;
        }
        throw new Zip64RequiredException(Zip64RequiredException.getEntryTooBigMessage(this.f72949n.f72959a));
    }

    /* renamed from: a */
    private C27653f m90771a(int i, boolean z) {
        boolean z2;
        C27653f fVar = new C27653f();
        if (this.f72958z || z) {
            z2 = true;
        } else {
            z2 = false;
        }
        fVar.f72853a = z2;
        if (m90777a(i)) {
            fVar.f72854b = true;
        }
        return fVar;
    }

    /* renamed from: b */
    private int m90783b(int i, boolean z) {
        if (z) {
            return 45;
        }
        if (m90777a(i)) {
            return 20;
        }
        return 10;
    }

    /* renamed from: a */
    private void m90776a(byte[] bArr, int i, int i2) throws IOException {
        m90790c(bArr, i, i2);
        this.f72952q += (long) i2;
    }

    /* renamed from: c */
    private void m90790c(byte[] bArr, int i, int i2) throws IOException {
        if (this.f72957y != null) {
            this.f72957y.write(bArr, i, i2);
        } else {
            this.out.write(bArr, i, i2);
        }
    }

    public final void write(byte[] bArr, int i, int i2) throws IOException {
        if (this.f72949n != null) {
            C27680x.m90811a(this.f72949n.f72959a);
            this.f72949n.f72964f = true;
            if (this.f72949n.f72959a.getMethod() == 8) {
                m90788b(bArr, i, i2);
            } else {
                m90776a(bArr, i, i2);
            }
            this.f72951p.update(bArr, i, i2);
            return;
        }
        throw new IllegalStateException("No current entry");
    }

    /* renamed from: a */
    private void m90773a(C27667r rVar, long j, boolean z) {
        if (z) {
            C27662n d = m90792d(rVar);
            if (rVar.getCompressedSize() >= 4294967295L || rVar.getSize() >= 4294967295L) {
                d.f72877c = new C27663o(rVar.getCompressedSize());
                d.f72876b = new C27663o(rVar.getSize());
            } else {
                d.f72877c = null;
                d.f72876b = null;
            }
            if (j >= 4294967295L) {
                d.f72878d = new C27663o(j);
            }
            rVar.mo71071a();
        }
    }

    /* renamed from: b */
    private void m90788b(byte[] bArr, int i, int i2) throws IOException {
        if (i2 > 0 && !this.f72944b.finished()) {
            this.f72949n.f72962d += (long) i2;
            if (i2 <= 8192) {
                this.f72944b.setInput(bArr, i, i2);
                m90802i();
                return;
            }
            int i3 = i2 / VideoCacheReadBuffersizeExperiment.DEFAULT;
            for (int i4 = 0; i4 < i3; i4++) {
                this.f72944b.setInput(bArr, (i4 * VideoCacheReadBuffersizeExperiment.DEFAULT) + i, VideoCacheReadBuffersizeExperiment.DEFAULT);
                m90802i();
            }
            int i5 = i3 * VideoCacheReadBuffersizeExperiment.DEFAULT;
            if (i5 < i2) {
                this.f72944b.setInput(bArr, i + i5, i2 - i5);
                m90802i();
            }
        }
    }

    /* renamed from: a */
    private boolean m90778a(long j, long j2, Zip64Mode zip64Mode) throws ZipException {
        if (this.f72949n.f72959a.getMethod() == 8) {
            this.f72949n.f72959a.setSize(this.f72949n.f72962d);
            this.f72949n.f72959a.setCompressedSize(j);
            this.f72949n.f72959a.setCrc(j2);
            this.f72944b.reset();
        } else if (this.f72957y != null) {
            this.f72949n.f72959a.setSize(j);
            this.f72949n.f72959a.setCompressedSize(j);
            this.f72949n.f72959a.setCrc(j2);
        } else if (this.f72949n.f72959a.getCrc() != j2) {
            StringBuilder sb = new StringBuilder("bad CRC checksum for entry ");
            sb.append(this.f72949n.f72959a.getName());
            sb.append(": ");
            sb.append(Long.toHexString(this.f72949n.f72959a.getCrc()));
            sb.append(" instead of ");
            sb.append(Long.toHexString(j2));
            throw new ZipException(sb.toString());
        } else if (this.f72949n.f72959a.getSize() != j) {
            StringBuilder sb2 = new StringBuilder("bad size for entry ");
            sb2.append(this.f72949n.f72959a.getName());
            sb2.append(": ");
            sb2.append(this.f72949n.f72959a.getSize());
            sb2.append(" instead of ");
            sb2.append(j);
            throw new ZipException(sb2.toString());
        }
        return m90779a(zip64Mode);
    }
}
