package com.bytedance.p255e.p256a;

import com.bytedance.p255e.p256a.C6329c.C6330a;
import com.bytedance.p255e.p256a.C6329c.C6331b;
import com.bytedance.p255e.p256a.C6329c.C6332c;
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

/* renamed from: com.bytedance.e.a.f */
public final class C6336f implements C6329c, Closeable {

    /* renamed from: a */
    private final int f18593a = 1179403647;

    /* renamed from: b */
    private final FileChannel f18594b;

    public final void close() throws IOException {
        this.f18594b.close();
    }

    /* renamed from: b */
    private C6331b m19656b() throws IOException {
        boolean z;
        this.f18594b.position(0);
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        if (mo15171b(allocate, 0) == 1179403647) {
            short e = m19658e(allocate, 4);
            if (m19658e(allocate, 5) == 2) {
                z = true;
            } else {
                z = false;
            }
            if (e == 1) {
                return new C6334d(z, this);
            }
            if (e == 2) {
                return new C6335e(z, this);
            }
            throw new IllegalStateException("Invalid class type!");
        }
        throw new IllegalArgumentException("Invalid ELF Magic!");
    }

    /* renamed from: a */
    public final List<String> mo15170a() throws IOException {
        ByteOrder byteOrder;
        long j;
        this.f18594b.position(0);
        ArrayList arrayList = new ArrayList();
        C6331b b = m19656b();
        ByteBuffer allocate = ByteBuffer.allocate(8);
        if (b.f18577a) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        allocate.order(byteOrder);
        long j2 = (long) b.f18582f;
        int i = 0;
        if (j2 == 65535) {
            j2 = b.mo15168a(0).f18590a;
        }
        long j3 = 0;
        while (true) {
            if (j3 >= j2) {
                j = 0;
                break;
            }
            C6332c a = b.mo15167a(j3);
            if (a.f18586a == 2) {
                j = a.f18587b;
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
            C6330a a2 = b.mo15166a(j, i);
            long j5 = j;
            if (a2.f18575a == 1) {
                arrayList2.add(Long.valueOf(a2.f18576b));
            } else if (a2.f18575a == 5) {
                j4 = a2.f18576b;
            }
            i++;
            if (a2.f18575a == 0) {
                break;
            }
            j = j5;
        }
        if (j4 != 0) {
            long a3 = m19654a(b, j2, j4);
            for (Long longValue : arrayList2) {
                arrayList.add(m19657d(allocate, longValue.longValue() + a3));
            }
            return arrayList;
        }
        throw new IllegalStateException("String table offset not found!");
    }

    public C6336f(File file) throws FileNotFoundException {
        if (file == null || !file.exists()) {
            throw new IllegalArgumentException("File is null or does not exist");
        }
        this.f18594b = new FileInputStream(file).getChannel();
    }

    /* renamed from: e */
    private short m19658e(ByteBuffer byteBuffer, long j) throws IOException {
        m19655a(byteBuffer, j, 1);
        return (short) (byteBuffer.get() & 255);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final long mo15169a(ByteBuffer byteBuffer, long j) throws IOException {
        m19655a(byteBuffer, j, 8);
        return byteBuffer.getLong();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final long mo15171b(ByteBuffer byteBuffer, long j) throws IOException {
        m19655a(byteBuffer, j, 4);
        return ((long) byteBuffer.getInt()) & 4294967295L;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final int mo15172c(ByteBuffer byteBuffer, long j) throws IOException {
        m19655a(byteBuffer, j, 2);
        return byteBuffer.getShort() & 65535;
    }

    /* renamed from: d */
    private String m19657d(ByteBuffer byteBuffer, long j) throws IOException {
        StringBuilder sb = new StringBuilder();
        while (true) {
            long j2 = 1 + j;
            short e = m19658e(byteBuffer, j);
            if (e == 0) {
                return sb.toString();
            }
            sb.append((char) e);
            j = j2;
        }
    }

    /* renamed from: a */
    private static long m19654a(C6331b bVar, long j, long j2) throws IOException {
        for (long j3 = 0; j3 < j; j3++) {
            C6332c a = bVar.mo15167a(j3);
            if (a.f18586a == 1 && a.f18588c <= j2 && j2 <= a.f18588c + a.f18589d) {
                return (j2 - a.f18588c) + a.f18587b;
            }
        }
        throw new IllegalStateException("Could not map vma to file offset!");
    }

    /* renamed from: a */
    private void m19655a(ByteBuffer byteBuffer, long j, int i) throws IOException {
        byteBuffer.position(0);
        byteBuffer.limit(i);
        long j2 = 0;
        while (j2 < ((long) i)) {
            int read = this.f18594b.read(byteBuffer, j + j2);
            if (read != -1) {
                j2 += (long) read;
            } else {
                throw new EOFException();
            }
        }
        byteBuffer.position(0);
    }
}
