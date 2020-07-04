package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

final class bbj implements Cloneable {

    /* renamed from: a */
    private bbh<?, ?> f41367a;

    /* renamed from: b */
    private Object f41368b;

    /* renamed from: c */
    private List<Object> f41369c = new ArrayList();

    bbj() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final int mo40483a() {
        if (this.f41368b == null) {
            Iterator it = this.f41369c.iterator();
            if (!it.hasNext()) {
                return 0;
            }
            it.next();
            throw new NoSuchMethodError();
        }
        throw new NoSuchMethodError();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo40484a(bbf bbf) throws IOException {
        if (this.f41368b == null) {
            Iterator it = this.f41369c.iterator();
            if (it.hasNext()) {
                it.next();
                throw new NoSuchMethodError();
            }
            return;
        }
        throw new NoSuchMethodError();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bbj)) {
            return false;
        }
        bbj bbj = (bbj) obj;
        if (this.f41368b == null || bbj.f41368b == null) {
            if (this.f41369c != null && bbj.f41369c != null) {
                return this.f41369c.equals(bbj.f41369c);
            }
            try {
                return Arrays.equals(m48376b(), bbj.m48376b());
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        } else if (this.f41367a != bbj.f41367a) {
            return false;
        } else {
            if (!this.f41367a.f41362a.isArray()) {
                return this.f41368b.equals(bbj.f41368b);
            }
            if (this.f41368b instanceof byte[]) {
                return Arrays.equals((byte[]) this.f41368b, (byte[]) bbj.f41368b);
            }
            if (this.f41368b instanceof int[]) {
                return Arrays.equals((int[]) this.f41368b, (int[]) bbj.f41368b);
            }
            if (this.f41368b instanceof long[]) {
                return Arrays.equals((long[]) this.f41368b, (long[]) bbj.f41368b);
            }
            if (this.f41368b instanceof float[]) {
                return Arrays.equals((float[]) this.f41368b, (float[]) bbj.f41368b);
            }
            if (this.f41368b instanceof double[]) {
                return Arrays.equals((double[]) this.f41368b, (double[]) bbj.f41368b);
            }
            if (this.f41368b instanceof boolean[]) {
                return Arrays.equals((boolean[]) this.f41368b, (boolean[]) bbj.f41368b);
            }
            return Arrays.deepEquals((Object[]) this.f41368b, (Object[]) bbj.f41368b);
        }
    }

    public final int hashCode() {
        try {
            return Arrays.hashCode(m48376b()) + 527;
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: b */
    private final byte[] m48376b() throws IOException {
        byte[] bArr = new byte[mo40483a()];
        mo40484a(bbf.m48351a(bArr));
        return bArr;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final bbj clone() {
        bbj bbj = new bbj();
        try {
            bbj.f41367a = this.f41367a;
            if (this.f41369c == null) {
                bbj.f41369c = null;
            } else {
                bbj.f41369c.addAll(this.f41369c);
            }
            if (this.f41368b != null) {
                if (this.f41368b instanceof bbl) {
                    bbj.f41368b = (bbl) ((bbl) this.f41368b).clone();
                } else if (this.f41368b instanceof byte[]) {
                    bbj.f41368b = ((byte[]) this.f41368b).clone();
                } else {
                    int i = 0;
                    if (this.f41368b instanceof byte[][]) {
                        byte[][] bArr = (byte[][]) this.f41368b;
                        byte[][] bArr2 = new byte[bArr.length][];
                        bbj.f41368b = bArr2;
                        while (i < bArr.length) {
                            bArr2[i] = (byte[]) bArr[i].clone();
                            i++;
                        }
                    } else if (this.f41368b instanceof boolean[]) {
                        bbj.f41368b = ((boolean[]) this.f41368b).clone();
                    } else if (this.f41368b instanceof int[]) {
                        bbj.f41368b = ((int[]) this.f41368b).clone();
                    } else if (this.f41368b instanceof long[]) {
                        bbj.f41368b = ((long[]) this.f41368b).clone();
                    } else if (this.f41368b instanceof float[]) {
                        bbj.f41368b = ((float[]) this.f41368b).clone();
                    } else if (this.f41368b instanceof double[]) {
                        bbj.f41368b = ((double[]) this.f41368b).clone();
                    } else if (this.f41368b instanceof bbl[]) {
                        bbl[] bblArr = (bbl[]) this.f41368b;
                        bbl[] bblArr2 = new bbl[bblArr.length];
                        bbj.f41368b = bblArr2;
                        while (i < bblArr.length) {
                            bblArr2[i] = (bbl) bblArr[i].clone();
                            i++;
                        }
                    }
                }
            }
            return bbj;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }
}
