package p1896pl.droidsonroids.relinker.p1898a;

import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p1896pl.droidsonroids.relinker.p1898a.C48441c.C48442a;
import p1896pl.droidsonroids.relinker.p1898a.C48441c.C48443b;
import p1896pl.droidsonroids.relinker.p1898a.C48441c.C48444c;

/* renamed from: pl.droidsonroids.relinker.a.f */
public final class C48448f implements Closeable, C48441c {

    /* renamed from: a */
    private final int f123566a = 1179403647;

    /* renamed from: b */
    private final FileChannel f123567b;

    public final void close() throws IOException {
        this.f123567b.close();
    }

    /* renamed from: b */
    private C48443b m150124b() throws IOException {
        boolean z;
        this.f123567b.position(0);
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        if (mo123263b(allocate, 0) == 1179403647) {
            short e = m150126e(allocate, 4);
            if (m150126e(allocate, 5) == 2) {
                z = true;
            } else {
                z = false;
            }
            if (e == 1) {
                return new C48446d(z, this);
            }
            if (e == 2) {
                return new C48447e(z, this);
            }
            throw new IllegalStateException("Invalid class type!");
        }
        throw new IllegalArgumentException("Invalid ELF Magic!");
    }

    /* renamed from: a */
    public final List<String> mo123262a() throws IOException {
        ByteOrder byteOrder;
        long j;
        this.f123567b.position(0);
        ArrayList arrayList = new ArrayList();
        C48443b b = m150124b();
        ByteBuffer allocate = ByteBuffer.allocate(8);
        if (b.f123550a) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        allocate.order(byteOrder);
        long j2 = (long) b.f123555f;
        int i = 0;
        if (j2 == 65535) {
            j2 = b.mo123260a(0).f123563a;
        }
        long j3 = 0;
        while (true) {
            if (j3 >= j2) {
                j = 0;
                break;
            }
            C48444c a = b.mo123259a(j3);
            if (a.f123559a == 2) {
                j = a.f123560b;
                break;
            }
            j3++;
        }
        if (j == 0) {
            return Collections.unmodifiableList(arrayList);
        }
        ArrayList<Long> arrayList2 = new ArrayList<>();
        long j4 = 0;
        while (true) {
            C48442a a2 = b.mo123258a(j, i);
            long j5 = j;
            if (a2.f123548a == 1) {
                arrayList2.add(Long.valueOf(a2.f123549b));
            } else if (a2.f123548a == 5) {
                j4 = a2.f123549b;
            }
            i++;
            if (a2.f123548a == 0) {
                break;
            }
            j = j5;
        }
        if (j4 != 0) {
            long a3 = m150122a(b, j2, j4);
            for (Long longValue : arrayList2) {
                arrayList.add(m150125d(allocate, longValue.longValue() + a3));
            }
            return arrayList;
        }
        throw new IllegalStateException("String table offset not found!");
    }

    public C48448f(File file) throws FileNotFoundException {
        if (file == null || !file.exists()) {
            throw new IllegalArgumentException("File is null or does not exist");
        }
        this.f123567b = new FileInputStream(file).getChannel();
    }

    /* renamed from: e */
    private short m150126e(ByteBuffer byteBuffer, long j) throws IOException {
        m150123a(byteBuffer, j, 1);
        return (short) (byteBuffer.get() & 255);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final long mo123261a(ByteBuffer byteBuffer, long j) throws IOException {
        m150123a(byteBuffer, j, 8);
        return byteBuffer.getLong();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final long mo123263b(ByteBuffer byteBuffer, long j) throws IOException {
        m150123a(byteBuffer, j, 4);
        return ((long) byteBuffer.getInt()) & 4294967295L;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final int mo123264c(ByteBuffer byteBuffer, long j) throws IOException {
        m150123a(byteBuffer, j, 2);
        return byteBuffer.getShort() & 65535;
    }

    /* renamed from: d */
    private String m150125d(ByteBuffer byteBuffer, long j) throws IOException {
        StringBuilder sb = new StringBuilder();
        while (true) {
            long j2 = 1 + j;
            short e = m150126e(byteBuffer, j);
            if (e == 0) {
                return sb.toString();
            }
            sb.append((char) e);
            j = j2;
        }
    }

    /* renamed from: a */
    private static long m150122a(C48443b bVar, long j, long j2) throws IOException {
        for (long j3 = 0; j3 < j; j3++) {
            C48444c a = bVar.mo123259a(j3);
            if (a.f123559a == 1 && a.f123561c <= j2 && j2 <= a.f123561c + a.f123562d) {
                return (j2 - a.f123561c) + a.f123560b;
            }
        }
        throw new IllegalStateException("Could not map vma to file offset!");
    }

    /* renamed from: a */
    private void m150123a(ByteBuffer byteBuffer, long j, int i) throws IOException {
        byteBuffer.position(0);
        byteBuffer.limit(i);
        long j2 = 0;
        while (j2 < ((long) i)) {
            int read = this.f123567b.read(byteBuffer, j + j2);
            if (read != -1) {
                j2 += (long) read;
            } else {
                throw new EOFException();
            }
        }
        byteBuffer.position(0);
    }
}
