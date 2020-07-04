package com.p280ss.android.ugc.aweme.emoji.utils.zip;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.emoji.utils.zip.i */
final class C27656i implements C27664p {

    /* renamed from: a */
    private final char[] f72862a;

    /* renamed from: b */
    private final List<C27657a> f72863b;

    /* renamed from: com.ss.android.ugc.aweme.emoji.utils.zip.i$a */
    static final class C27657a implements Comparable<C27657a> {

        /* renamed from: a */
        public final char f72864a;

        /* renamed from: b */
        public final byte f72865b;

        public final int hashCode() {
            return this.f72864a;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("0x");
            sb.append(Integer.toHexString(this.f72864a & 65535));
            sb.append("->0x");
            sb.append(Integer.toHexString(this.f72865b & 255));
            return sb.toString();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public int compareTo(C27657a aVar) {
            return this.f72864a - aVar.f72864a;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C27657a)) {
                return false;
            }
            C27657a aVar = (C27657a) obj;
            if (this.f72864a == aVar.f72864a && this.f72865b == aVar.f72865b) {
                return true;
            }
            return false;
        }

        C27657a(byte b, char c) {
            this.f72865b = b;
            this.f72864a = c;
        }
    }

    /* renamed from: a */
    private char m90675a(byte b) {
        if (b >= 0) {
            return (char) b;
        }
        return this.f72862a[b + 128];
    }

    /* renamed from: a */
    private boolean m90676a(char c) {
        if ((c < 0 || c >= 128) && m90678b(c) == null) {
            return false;
        }
        return true;
    }

    C27656i(char[] cArr) {
        this.f72862a = (char[]) cArr.clone();
        ArrayList arrayList = new ArrayList(this.f72862a.length);
        byte b = Byte.MAX_VALUE;
        for (char aVar : this.f72862a) {
            b = (byte) (b + 1);
            arrayList.add(new C27657a(b, aVar));
        }
        Collections.sort(arrayList);
        this.f72863b = Collections.unmodifiableList(arrayList);
    }

    /* renamed from: b */
    private C27657a m90678b(char c) {
        int size = this.f72863b.size();
        int i = 0;
        while (size > i) {
            int i2 = ((size - i) / 2) + i;
            C27657a aVar = (C27657a) this.f72863b.get(i2);
            if (aVar.f72864a == c) {
                return aVar;
            }
            if (aVar.f72864a < c) {
                i = i2 + 1;
            } else {
                size = i2;
            }
        }
        if (i >= this.f72863b.size()) {
            return null;
        }
        C27657a aVar2 = (C27657a) this.f72863b.get(i);
        if (aVar2.f72864a != c) {
            return null;
        }
        return aVar2;
    }

    /* renamed from: a */
    public final String mo71053a(byte[] bArr) throws IOException {
        char[] cArr = new char[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            cArr[i] = m90675a(bArr[i]);
        }
        return new String(cArr);
    }

    /* renamed from: b */
    public final ByteBuffer mo71055b(String str) {
        ByteBuffer allocate = ByteBuffer.allocate(str.length() + 6 + ((str.length() + 1) / 2));
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (allocate.remaining() < 6) {
                allocate = C27665q.m90721a(allocate, allocate.position() + 6);
            }
            if (!m90677a(allocate, charAt)) {
                C27665q.m90722a(allocate, charAt);
            }
        }
        allocate.limit(allocate.position());
        allocate.rewind();
        return allocate;
    }

    /* renamed from: a */
    public final boolean mo71054a(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!m90676a(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private boolean m90677a(ByteBuffer byteBuffer, char c) {
        if (c < 0 || c >= 128) {
            C27657a b = m90678b(c);
            if (b == null) {
                return false;
            }
            byteBuffer.put(b.f72865b);
            return true;
        }
        byteBuffer.put((byte) c);
        return true;
    }
}
