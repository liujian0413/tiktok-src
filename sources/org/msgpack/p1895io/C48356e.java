package org.msgpack.p1895io;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;

/* renamed from: org.msgpack.io.e */
public final class C48356e extends C48352a {

    /* renamed from: a */
    LinkedList<ByteBuffer> f123474a = new LinkedList<>();

    /* renamed from: b */
    int f123475b = -1;

    /* renamed from: c */
    private int f123476c;

    /* renamed from: d */
    private byte[] f123477d = new byte[8];

    /* renamed from: e */
    private ByteBuffer f123478e = ByteBuffer.wrap(this.f123477d);

    /* renamed from: f */
    private final int f123479f;

    public final void close() {
    }

    /* renamed from: d */
    public final byte mo121894d() throws EOFException {
        ByteBuffer c = m149985c(1);
        return c.get(c.position());
    }

    /* renamed from: e */
    public final short mo121895e() throws EOFException {
        ByteBuffer c = m149985c(2);
        return c.getShort(c.position());
    }

    /* renamed from: f */
    public final int mo121896f() throws EOFException {
        ByteBuffer c = m149985c(4);
        return c.getInt(c.position());
    }

    /* renamed from: g */
    public final long mo121897g() throws EOFException {
        ByteBuffer c = m149985c(8);
        return c.getLong(c.position());
    }

    /* renamed from: h */
    public final float mo121898h() throws EOFException {
        ByteBuffer c = m149985c(4);
        return c.getFloat(c.position());
    }

    /* renamed from: i */
    public final double mo121899i() throws EOFException {
        ByteBuffer c = m149985c(8);
        return c.getDouble(c.position());
    }

    /* renamed from: j */
    public final void mo121902j() {
        if (this.f123475b >= 0) {
            ByteBuffer byteBuffer = (ByteBuffer) this.f123474a.getLast();
            this.f123474a.clear();
            byteBuffer.position(0);
            byteBuffer.limit(0);
            this.f123474a.addLast(byteBuffer);
            this.f123475b = byteBuffer.capacity();
            return;
        }
        this.f123474a.clear();
        this.f123475b = -1;
    }

    /* renamed from: b */
    public final byte mo121892b() throws EOFException {
        ByteBuffer byteBuffer;
        try {
            byteBuffer = (ByteBuffer) this.f123474a.getFirst();
        } catch (NoSuchElementException unused) {
            byteBuffer = null;
        }
        if (byteBuffer == null || byteBuffer.remaining() == 0) {
            throw new EndOfBufferException();
        }
        byte b = byteBuffer.get();
        mo121876a();
        if (byteBuffer.remaining() == 0) {
            m149983a(byteBuffer);
        }
        return b;
    }

    /* renamed from: c */
    public final void mo121893c() {
        if (!this.f123474a.isEmpty()) {
            int i = this.f123476c;
            while (true) {
                ByteBuffer byteBuffer = (ByteBuffer) this.f123474a.getFirst();
                if (i >= byteBuffer.remaining()) {
                    i -= byteBuffer.remaining();
                    byteBuffer.position(byteBuffer.position() + byteBuffer.remaining());
                    if (!m149983a(byteBuffer)) {
                        break;
                    }
                } else {
                    byteBuffer.position(byteBuffer.position() + i);
                    break;
                }
            }
            mo121877a(this.f123476c);
            this.f123476c = 0;
        }
    }

    public C48356e(int i) {
        this.f123479f = i;
    }

    /* renamed from: a */
    private boolean m149983a(ByteBuffer byteBuffer) {
        if (this.f123474a.size() != 1) {
            this.f123474a.removeFirst();
            return true;
        } else if (this.f123475b >= 0) {
            byteBuffer.position(0);
            byteBuffer.limit(0);
            this.f123475b = byteBuffer.capacity();
            return false;
        } else {
            this.f123474a.removeFirst();
            return false;
        }
    }

    /* renamed from: b */
    private void m149984b(int i) throws EOFException {
        Iterator it = this.f123474a.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            ByteBuffer byteBuffer = (ByteBuffer) it.next();
            if (i <= byteBuffer.remaining()) {
                int position = byteBuffer.position();
                byteBuffer.get(this.f123477d, i2, i);
                byteBuffer.position(position);
                return;
            }
            int remaining = byteBuffer.remaining();
            int position2 = byteBuffer.position();
            byteBuffer.get(this.f123477d, i2, remaining);
            byteBuffer.position(position2);
            i -= remaining;
            i2 += remaining;
        }
        throw new EndOfBufferException();
    }

    /* renamed from: c */
    private ByteBuffer m149985c(int i) throws EOFException {
        ByteBuffer byteBuffer;
        try {
            byteBuffer = (ByteBuffer) this.f123474a.getFirst();
        } catch (NoSuchElementException unused) {
            byteBuffer = null;
        }
        if (byteBuffer == null) {
            throw new EndOfBufferException();
        } else if (i <= byteBuffer.remaining()) {
            this.f123476c = i;
            return byteBuffer;
        } else {
            m149984b(i);
            this.f123476c = i;
            return this.f123478e;
        }
    }

    /* renamed from: a */
    public final boolean mo121891a(C48353b bVar, int i) throws IOException {
        ByteBuffer byteBuffer;
        try {
            byteBuffer = (ByteBuffer) this.f123474a.getFirst();
        } catch (NoSuchElementException unused) {
            byteBuffer = null;
        }
        if (byteBuffer == null) {
            throw new EndOfBufferException();
        } else if (byteBuffer.remaining() < i) {
            return false;
        } else {
            int position = byteBuffer.position();
            int limit = byteBuffer.limit();
            position += i;
            try {
                byteBuffer.limit(position);
                bVar.refer(byteBuffer, true);
                mo121877a(i);
                return true;
            } finally {
                byteBuffer.limit(limit);
                byteBuffer.position(position);
                if (byteBuffer.remaining() == 0) {
                    m149983a(byteBuffer);
                }
            }
        }
    }

    /* renamed from: a */
    public final int mo121890a(byte[] bArr, int i, int i2) throws EOFException {
        ByteBuffer byteBuffer;
        if (this.f123474a.isEmpty()) {
            return 0;
        }
        int i3 = i;
        int i4 = i2;
        do {
            byteBuffer = (ByteBuffer) this.f123474a.getFirst();
            if (i4 < byteBuffer.remaining()) {
                byteBuffer.get(bArr, i3, i4);
                mo121877a(i4);
                return i2;
            }
            int remaining = byteBuffer.remaining();
            byteBuffer.get(bArr, i3, remaining);
            mo121877a(remaining);
            i4 -= remaining;
            i3 += remaining;
        } while (m149983a(byteBuffer));
        return i2 - i4;
    }

    /* renamed from: a */
    public final void mo121900a(byte[] bArr, int i, int i2, boolean z) {
        if (this.f123475b <= 0 || ((ByteBuffer) this.f123474a.getLast()).remaining() != 0) {
            this.f123474a.addLast(ByteBuffer.wrap(bArr, i, i2));
            this.f123475b = -1;
            return;
        }
        this.f123474a.add(this.f123474a.size() - 1, ByteBuffer.wrap(bArr, i, i2));
    }
}
