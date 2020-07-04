package com.p280ss.android.ugc.aweme.emoji.utils.zip;

import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;
import java.util.zip.ZipException;

/* renamed from: com.ss.android.ugc.aweme.emoji.utils.zip.t */
public final class C27669t implements Closeable {

    /* renamed from: m */
    private static final long f72900m = C27676u.m90765a(C27677v.f72933h);

    /* renamed from: a */
    public final String f72901a;

    /* renamed from: b */
    public final RandomAccessFile f72902b;

    /* renamed from: c */
    private final List<C27667r> f72903c;

    /* renamed from: d */
    private final Map<String, LinkedList<C27667r>> f72904d;

    /* renamed from: e */
    private final C27664p f72905e;

    /* renamed from: f */
    private final String f72906f;

    /* renamed from: g */
    private final boolean f72907g;

    /* renamed from: h */
    private volatile boolean f72908h;

    /* renamed from: i */
    private final byte[] f72909i;

    /* renamed from: j */
    private final byte[] f72910j;

    /* renamed from: k */
    private final byte[] f72911k;

    /* renamed from: l */
    private final byte[] f72912l;

    /* renamed from: n */
    private final Comparator<C27667r> f72913n;

    /* renamed from: com.ss.android.ugc.aweme.emoji.utils.zip.t$a */
    class C27672a extends InputStream {

        /* renamed from: b */
        private long f72918b;

        /* renamed from: c */
        private long f72919c;

        /* renamed from: d */
        private boolean f72920d;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo71095a() {
            this.f72920d = true;
        }

        public final int read() throws IOException {
            int read;
            long j = this.f72918b;
            this.f72918b = j - 1;
            if (j > 0) {
                synchronized (C27669t.this.f72902b) {
                    RandomAccessFile randomAccessFile = C27669t.this.f72902b;
                    long j2 = this.f72919c;
                    this.f72919c = 1 + j2;
                    randomAccessFile.seek(j2);
                    read = C27669t.this.f72902b.read();
                }
                return read;
            } else if (!this.f72920d) {
                return -1;
            } else {
                this.f72920d = false;
                return 0;
            }
        }

        C27672a(long j, long j2) {
            this.f72918b = j2;
            this.f72919c = j;
        }

        public final int read(byte[] bArr, int i, int i2) throws IOException {
            int read;
            if (this.f72918b <= 0) {
                if (!this.f72920d) {
                    return -1;
                }
                this.f72920d = false;
                bArr[i] = 0;
                return 1;
            } else if (i2 <= 0) {
                return 0;
            } else {
                if (((long) i2) > this.f72918b) {
                    i2 = (int) this.f72918b;
                }
                synchronized (C27669t.this.f72902b) {
                    C27669t.this.f72902b.seek(this.f72919c);
                    read = C27669t.this.f72902b.read(bArr, i, i2);
                }
                if (read > 0) {
                    long j = (long) read;
                    this.f72919c += j;
                    this.f72918b -= j;
                }
                return read;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.emoji.utils.zip.t$b */
    static class C27673b extends C27667r {

        /* renamed from: f */
        public final C27675d f72921f;

        public final int hashCode() {
            return (super.hashCode() * 3) + ((int) (this.f72921f.f72924a % 2147483647L));
        }

        C27673b(C27675d dVar) {
            this.f72921f = dVar;
        }

        public final boolean equals(Object obj) {
            if (!super.equals(obj)) {
                return false;
            }
            C27673b bVar = (C27673b) obj;
            if (this.f72921f.f72924a == bVar.f72921f.f72924a && this.f72921f.f72925b == bVar.f72921f.f72925b) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.emoji.utils.zip.t$c */
    static final class C27674c {

        /* renamed from: a */
        public final byte[] f72922a;

        /* renamed from: b */
        public final byte[] f72923b;

        private C27674c(byte[] bArr, byte[] bArr2) {
            this.f72922a = bArr;
            this.f72923b = bArr2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.emoji.utils.zip.t$d */
    static final class C27675d {

        /* renamed from: a */
        public long f72924a;

        /* renamed from: b */
        public long f72925b;

        private C27675d() {
            this.f72924a = -1;
            this.f72925b = -1;
        }
    }

    /* renamed from: a */
    public final Enumeration<C27667r> mo71090a() {
        return Collections.enumeration(this.f72903c);
    }

    public final void close() throws IOException {
        this.f72908h = true;
        this.f72902b.close();
    }

    /* renamed from: e */
    private void m90758e() throws IOException {
        m90750a(16);
        this.f72902b.readFully(this.f72910j);
        this.f72902b.seek(C27676u.m90765a(this.f72910j));
    }

    /* renamed from: f */
    private void m90759f() throws IOException {
        if (!m90753a(22, 65557, C27677v.f72934i)) {
            throw new ZipException("archive is not a ZIP archive");
        }
    }

    /* renamed from: g */
    private boolean m90760g() throws IOException {
        this.f72902b.seek(0);
        this.f72902b.readFully(this.f72910j);
        return Arrays.equals(this.f72910j, C27677v.f72931f);
    }

    /* access modifiers changed from: protected */
    public final void finalize() throws Throwable {
        try {
            if (!this.f72908h) {
                System.err.printf("Cleaning up unclosed %s for archive %s%n", new Object[]{getClass().getSimpleName(), this.f72906f});
                close();
            }
        } finally {
            super.finalize();
        }
    }

    /* renamed from: b */
    private Map<C27667r, C27674c> m90754b() throws IOException {
        HashMap hashMap = new HashMap();
        m90756c();
        this.f72902b.readFully(this.f72910j);
        long a = C27676u.m90765a(this.f72910j);
        if (a == f72900m || !m90760g()) {
            while (a == f72900m) {
                m90752a((Map<C27667r, C27674c>) hashMap);
                this.f72902b.readFully(this.f72910j);
                a = C27676u.m90765a(this.f72910j);
            }
            return hashMap;
        }
        throw new IOException("central directory is empty, can't expand corrupt archive.");
    }

    /* renamed from: c */
    private void m90756c() throws IOException {
        boolean z;
        m90759f();
        boolean z2 = false;
        if (this.f72902b.getFilePointer() > 20) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f72902b.seek(this.f72902b.getFilePointer() - 20);
            this.f72902b.readFully(this.f72910j);
            z2 = Arrays.equals(C27677v.f72936k, this.f72910j);
        }
        if (!z2) {
            if (z) {
                m90750a(16);
            }
            m90758e();
            return;
        }
        m90757d();
    }

    /* renamed from: d */
    private void m90757d() throws IOException {
        m90750a(4);
        this.f72902b.readFully(this.f72909i);
        this.f72902b.seek(C27663o.m90710a(this.f72909i));
        this.f72902b.readFully(this.f72910j);
        if (Arrays.equals(this.f72910j, C27677v.f72935j)) {
            m90750a(44);
            this.f72902b.readFully(this.f72909i);
            this.f72902b.seek(C27663o.m90710a(this.f72909i));
            return;
        }
        throw new ZipException("archive's ZIP64 end of central directory locator is corrupt.");
    }

    public C27669t(String str) throws IOException {
        this(new File(str), null);
    }

    /* renamed from: a */
    private void m90750a(int i) throws IOException {
        int i2 = 0;
        while (i2 < i) {
            int skipBytes = this.f72902b.skipBytes(i - i2);
            if (skipBytes > 0) {
                i2 += skipBytes;
            } else {
                throw new EOFException();
            }
        }
    }

    /* renamed from: a */
    private void m90752a(Map<C27667r, C27674c> map) throws IOException {
        C27664p pVar;
        this.f72902b.readFully(this.f72911k);
        C27675d dVar = new C27675d();
        C27673b bVar = new C27673b(dVar);
        bVar.f72891b = (C27679w.m90805a(this.f72911k, 0) >> 8) & 15;
        C27653f b = C27653f.m90664b(this.f72911k, 4);
        boolean z = b.f72853a;
        if (z) {
            pVar = C27665q.f72883a;
        } else {
            pVar = this.f72905e;
        }
        bVar.f72894e = b;
        bVar.setMethod(C27679w.m90805a(this.f72911k, 6));
        bVar.setTime(C27680x.m90809a(C27676u.m90768b(this.f72911k, 8)));
        bVar.setCrc(C27676u.m90768b(this.f72911k, 12));
        bVar.setCompressedSize(C27676u.m90768b(this.f72911k, 16));
        bVar.setSize(C27676u.m90768b(this.f72911k, 20));
        int a = C27679w.m90805a(this.f72911k, 24);
        int a2 = C27679w.m90805a(this.f72911k, 26);
        int a3 = C27679w.m90805a(this.f72911k, 28);
        int a4 = C27679w.m90805a(this.f72911k, 30);
        bVar.f72890a = C27679w.m90805a(this.f72911k, 32);
        bVar.f72892c = C27676u.m90768b(this.f72911k, 34);
        byte[] bArr = new byte[a];
        this.f72902b.readFully(bArr);
        bVar.mo71075a(pVar.mo71053a(bArr), bArr);
        dVar.f72924a = C27676u.m90768b(this.f72911k, 38);
        this.f72903c.add(bVar);
        byte[] bArr2 = new byte[a2];
        this.f72902b.readFully(bArr2);
        bVar.mo71076a(bArr2);
        m90751a((C27667r) bVar, dVar, a4);
        byte[] bArr3 = new byte[a3];
        this.f72902b.readFully(bArr3);
        bVar.setComment(pVar.mo71053a(bArr3));
        if (!z && this.f72907g) {
            map.put(bVar, new C27674c(bArr, bArr3));
        }
    }

    /* renamed from: b */
    private void m90755b(Map<C27667r, C27674c> map) throws IOException {
        for (C27667r rVar : this.f72903c) {
            C27673b bVar = (C27673b) rVar;
            C27675d dVar = bVar.f72921f;
            long j = dVar.f72924a + 26;
            this.f72902b.seek(j);
            this.f72902b.readFully(this.f72912l);
            int a = C27679w.m90804a(this.f72912l);
            this.f72902b.readFully(this.f72912l);
            int a2 = C27679w.m90804a(this.f72912l);
            int i = a;
            while (i > 0) {
                int skipBytes = this.f72902b.skipBytes(i);
                if (skipBytes > 0) {
                    i -= skipBytes;
                } else {
                    throw new IOException("failed to skip file name in local file header");
                }
            }
            byte[] bArr = new byte[a2];
            this.f72902b.readFully(bArr);
            bVar.setExtra(bArr);
            dVar.f72925b = j + 2 + 2 + ((long) a) + ((long) a2);
            if (map.containsKey(bVar)) {
                C27674c cVar = (C27674c) map.get(bVar);
                C27680x.m90812a(bVar, cVar.f72922a, cVar.f72923b);
            }
            String name = bVar.getName();
            LinkedList linkedList = (LinkedList) this.f72904d.get(name);
            if (linkedList == null) {
                linkedList = new LinkedList();
                this.f72904d.put(name, linkedList);
            }
            linkedList.addLast(bVar);
        }
    }

    /* renamed from: a */
    public final InputStream mo71089a(C27667r rVar) throws IOException, ZipException {
        if (!(rVar instanceof C27673b)) {
            return null;
        }
        C27675d dVar = ((C27673b) rVar).f72921f;
        C27680x.m90811a(rVar);
        C27672a aVar = new C27672a(dVar.f72925b, rVar.getCompressedSize());
        int method = rVar.getMethod();
        if (method == 0) {
            return aVar;
        }
        if (method == 8) {
            aVar.mo71095a();
            final Inflater inflater = new Inflater(true);
            return new InflaterInputStream(aVar, inflater) {
                public final void close() throws IOException {
                    super.close();
                    inflater.end();
                }
            };
        }
        StringBuilder sb = new StringBuilder("Found unsupported compression method ");
        sb.append(rVar.getMethod());
        throw new ZipException(sb.toString());
    }

    private C27669t(File file, String str) throws IOException {
        this(file, null, true);
    }

    private C27669t(File file, String str, boolean z) throws IOException {
        this.f72903c = new LinkedList();
        this.f72904d = new HashMap(509);
        this.f72909i = new byte[8];
        this.f72910j = new byte[4];
        this.f72911k = new byte[42];
        this.f72912l = new byte[2];
        this.f72913n = new Comparator<C27667r>() {
            public final /* synthetic */ int compare(Object obj, Object obj2) {
                return m90763a((C27667r) obj, (C27667r) obj2);
            }

            /* renamed from: a */
            private static int m90763a(C27667r rVar, C27667r rVar2) {
                C27673b bVar;
                if (rVar == rVar2) {
                    return 0;
                }
                C27673b bVar2 = null;
                if (rVar instanceof C27673b) {
                    bVar = (C27673b) rVar;
                } else {
                    bVar = null;
                }
                if (rVar2 instanceof C27673b) {
                    bVar2 = (C27673b) rVar2;
                }
                if (bVar == null) {
                    return 1;
                }
                if (bVar2 == null) {
                    return -1;
                }
                long j = bVar.f72921f.f72924a - bVar2.f72921f.f72924a;
                if (j == 0) {
                    return 0;
                }
                if (j < 0) {
                    return -1;
                }
                return 1;
            }
        };
        this.f72906f = file.getAbsolutePath();
        this.f72901a = str;
        this.f72905e = C27665q.m90720a(str);
        boolean z2 = true;
        this.f72907g = z2;
        this.f72902b = new RandomAccessFile(file, "r");
        try {
            m90755b(m90754b());
            z2 = false;
        } finally {
            this.f72908h = z2;
            try {
                this.f72902b.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: a */
    private static void m90751a(C27667r rVar, C27675d dVar, int i) throws IOException {
        boolean z;
        boolean z2;
        boolean z3;
        C27662n nVar = (C27662n) rVar.mo71077b(C27662n.f72874a);
        if (nVar != null) {
            boolean z4 = false;
            if (rVar.getSize() == 4294967295L) {
                z = true;
            } else {
                z = false;
            }
            if (rVar.getCompressedSize() == 4294967295L) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (dVar.f72924a == 4294967295L) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (i == 65535) {
                z4 = true;
            }
            nVar.mo71064a(z, z2, z3, z4);
            if (z) {
                rVar.setSize(nVar.f72876b.mo71066b());
            } else if (z2) {
                nVar.f72876b = new C27663o(rVar.getSize());
            }
            if (z2) {
                rVar.setCompressedSize(nVar.f72877c.mo71066b());
            } else if (z) {
                nVar.f72877c = new C27663o(rVar.getCompressedSize());
            }
            if (z3) {
                dVar.f72924a = nVar.f72878d.mo71066b();
            }
        }
    }

    /* renamed from: a */
    private boolean m90753a(long j, long j2, byte[] bArr) throws IOException {
        long length = this.f72902b.length() - 22;
        long max = Math.max(0, this.f72902b.length() - 65557);
        boolean z = false;
        if (length >= 0) {
            while (true) {
                if (length < max) {
                    break;
                }
                this.f72902b.seek(length);
                int read = this.f72902b.read();
                if (read != -1) {
                    if (read == bArr[0] && this.f72902b.read() == bArr[1] && this.f72902b.read() == bArr[2] && this.f72902b.read() == bArr[3]) {
                        z = true;
                        break;
                    }
                    length--;
                } else {
                    break;
                }
            }
        }
        if (z) {
            this.f72902b.seek(length);
        }
        return z;
    }
}
