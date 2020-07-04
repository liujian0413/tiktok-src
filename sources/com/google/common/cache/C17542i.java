package com.google.common.cache;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/* renamed from: com.google.common.cache.i */
final class C17542i extends C17545l implements C17537g, Serializable {
    private static final long serialVersionUID = 7249069246863182397L;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final long mo45140a(long j, long j2) {
        return j + j2;
    }

    /* renamed from: a */
    public final void mo45138a() {
        mo45139a(1);
    }

    public final double doubleValue() {
        return (double) m58416c();
    }

    public final float floatValue() {
        return (float) m58416c();
    }

    public final int intValue() {
        return (int) m58416c();
    }

    public final long longValue() {
        return m58416c();
    }

    public final String toString() {
        return Long.toString(m58416c());
    }

    /* renamed from: c */
    private long m58416c() {
        long j = this.f48620e;
        C17547a[] aVarArr = this.f48619d;
        if (aVarArr != null) {
            for (C17547a aVar : aVarArr) {
                if (aVar != null) {
                    j += aVar.f48624a;
                }
            }
        }
        return j;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.f48621f = 0;
        this.f48619d = null;
        this.f48620e = objectInputStream.readLong();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeLong(m58416c());
    }

    /* renamed from: a */
    public final void mo45139a(long j) {
        C17547a[] aVarArr = this.f48619d;
        if (aVarArr == null) {
            long j2 = this.f48620e;
            if (mo45147b(j2, j2 + j)) {
                return;
            }
        }
        int[] iArr = (int[]) f48613a.get();
        boolean z = true;
        if (!(iArr == null || aVarArr == null)) {
            int length = aVarArr.length;
            if (length > 0) {
                C17547a aVar = aVarArr[(length - 1) & iArr[0]];
                if (aVar != null) {
                    long j3 = aVar.f48624a;
                    z = aVar.mo45149a(j3, j3 + j);
                    if (z) {
                        return;
                    }
                }
            }
        }
        mo45146a(j, iArr, z);
    }
}
