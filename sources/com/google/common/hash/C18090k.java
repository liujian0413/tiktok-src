package com.google.common.hash;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/* renamed from: com.google.common.hash.k */
final class C18090k extends C18094n implements C18085i, Serializable {
    private static final long serialVersionUID = 7249069246863182397L;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final long mo46702a(long j, long j2) {
        return j + j2;
    }

    /* renamed from: a */
    public final void mo46699a() {
        mo46700a(1);
    }

    public final double doubleValue() {
        return (double) mo46701b();
    }

    public final float floatValue() {
        return (float) mo46701b();
    }

    public final int intValue() {
        return (int) mo46701b();
    }

    public final long longValue() {
        return mo46701b();
    }

    public final String toString() {
        return Long.toString(mo46701b());
    }

    /* renamed from: b */
    public final long mo46701b() {
        long j = this.f49429e;
        C18096a[] aVarArr = this.f49428d;
        if (aVarArr != null) {
            for (C18096a aVar : aVarArr) {
                if (aVar != null) {
                    j += aVar.f49433a;
                }
            }
        }
        return j;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.f49430f = 0;
        this.f49428d = null;
        this.f49429e = objectInputStream.readLong();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeLong(mo46701b());
    }

    /* renamed from: a */
    public final void mo46700a(long j) {
        C18096a[] aVarArr = this.f49428d;
        if (aVarArr == null) {
            long j2 = this.f49429e;
            if (mo46712b(j2, j2 + j)) {
                return;
            }
        }
        int[] iArr = (int[]) f49422a.get();
        boolean z = true;
        if (!(iArr == null || aVarArr == null)) {
            int length = aVarArr.length;
            if (length > 0) {
                C18096a aVar = aVarArr[(length - 1) & iArr[0]];
                if (aVar != null) {
                    long j3 = aVar.f49433a;
                    z = aVar.mo46714a(j3, j3 + j);
                    if (z) {
                        return;
                    }
                }
            }
        }
        mo46711a(j, iArr, z);
    }
}
