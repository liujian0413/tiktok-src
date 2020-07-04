package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.ks */
final class C16682ks implements Cloneable {

    /* renamed from: a */
    private C16680kq<?, ?> f46602a;

    /* renamed from: b */
    private Object f46603b;

    /* renamed from: c */
    private List<C16686kw> f46604c = new ArrayList();

    C16682ks() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo43163a(C16686kw kwVar) throws IOException {
        Object obj;
        Object obj2;
        if (this.f46604c != null) {
            this.f46604c.add(kwVar);
            return;
        }
        if (this.f46603b instanceof C16684ku) {
            byte[] bArr = kwVar.f46610b;
            C16676km a = C16676km.m54726a(bArr, 0, bArr.length);
            int d = a.mo43124d();
            if (d == bArr.length - C16678ko.m54751a(d)) {
                obj = ((C16684ku) this.f46603b).mo42654a(a);
            } else {
                throw zzyh.zzzd();
            }
        } else {
            if (this.f46603b instanceof C16684ku[]) {
                C16684ku[] kuVarArr = (C16684ku[]) this.f46602a.mo43150a(Collections.singletonList(kwVar));
                C16684ku[] kuVarArr2 = (C16684ku[]) this.f46603b;
                obj2 = (C16684ku[]) Arrays.copyOf(kuVarArr2, kuVarArr2.length + kuVarArr.length);
                System.arraycopy(kuVarArr, 0, obj2, kuVarArr2.length, kuVarArr.length);
            } else if (this.f46603b instanceof C16615ij) {
                obj = ((C16615ij) this.f46603b).mo42935j().mo42730a((C16615ij) this.f46602a.mo43150a(Collections.singletonList(kwVar))).mo42942d();
            } else if (this.f46603b instanceof C16615ij[]) {
                C16615ij[] ijVarArr = (C16615ij[]) this.f46602a.mo43150a(Collections.singletonList(kwVar));
                C16615ij[] ijVarArr2 = (C16615ij[]) this.f46603b;
                obj2 = (C16615ij[]) Arrays.copyOf(ijVarArr2, ijVarArr2.length + ijVarArr.length);
                System.arraycopy(ijVarArr, 0, obj2, ijVarArr2.length, ijVarArr.length);
            } else {
                obj = this.f46602a.mo43150a(Collections.singletonList(kwVar));
            }
            obj = obj2;
        }
        this.f46602a = this.f46602a;
        this.f46603b = obj;
        this.f46604c = null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final int mo43161a() {
        if (this.f46603b != null) {
            C16680kq<?, ?> kqVar = this.f46602a;
            Object obj = this.f46603b;
            if (!kqVar.f46596c) {
                return kqVar.mo43149a(obj);
            }
            int length = Array.getLength(obj);
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                Object obj2 = Array.get(obj, i2);
                if (obj2 != null) {
                    i += kqVar.mo43149a(obj2);
                }
            }
            return i;
        }
        int i3 = 0;
        for (C16686kw kwVar : this.f46604c) {
            i3 += C16678ko.m54765d(kwVar.f46609a) + 0 + kwVar.f46610b.length;
        }
        return i3;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo43162a(C16678ko koVar) throws IOException {
        if (this.f46603b != null) {
            C16680kq<?, ?> kqVar = this.f46602a;
            Object obj = this.f46603b;
            if (kqVar.f46596c) {
                int length = Array.getLength(obj);
                for (int i = 0; i < length; i++) {
                    Object obj2 = Array.get(obj, i);
                    if (obj2 != null) {
                        kqVar.mo43151a(obj2, koVar);
                    }
                }
                return;
            }
            kqVar.mo43151a(obj, koVar);
            return;
        }
        for (C16686kw kwVar : this.f46604c) {
            koVar.mo43144c(kwVar.f46609a);
            koVar.mo43143b(kwVar.f46610b);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C16682ks)) {
            return false;
        }
        C16682ks ksVar = (C16682ks) obj;
        if (this.f46603b == null || ksVar.f46603b == null) {
            if (this.f46604c != null && ksVar.f46604c != null) {
                return this.f46604c.equals(ksVar.f46604c);
            }
            try {
                return Arrays.equals(m54795b(), ksVar.m54795b());
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        } else if (this.f46602a != ksVar.f46602a) {
            return false;
        } else {
            if (!this.f46602a.f46594a.isArray()) {
                return this.f46603b.equals(ksVar.f46603b);
            }
            if (this.f46603b instanceof byte[]) {
                return Arrays.equals((byte[]) this.f46603b, (byte[]) ksVar.f46603b);
            }
            if (this.f46603b instanceof int[]) {
                return Arrays.equals((int[]) this.f46603b, (int[]) ksVar.f46603b);
            }
            if (this.f46603b instanceof long[]) {
                return Arrays.equals((long[]) this.f46603b, (long[]) ksVar.f46603b);
            }
            if (this.f46603b instanceof float[]) {
                return Arrays.equals((float[]) this.f46603b, (float[]) ksVar.f46603b);
            }
            if (this.f46603b instanceof double[]) {
                return Arrays.equals((double[]) this.f46603b, (double[]) ksVar.f46603b);
            }
            if (this.f46603b instanceof boolean[]) {
                return Arrays.equals((boolean[]) this.f46603b, (boolean[]) ksVar.f46603b);
            }
            return Arrays.deepEquals((Object[]) this.f46603b, (Object[]) ksVar.f46603b);
        }
    }

    public final int hashCode() {
        try {
            return Arrays.hashCode(m54795b()) + 527;
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: b */
    private final byte[] m54795b() throws IOException {
        byte[] bArr = new byte[mo43161a()];
        mo43162a(C16678ko.m54755a(bArr));
        return bArr;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final C16682ks clone() {
        C16682ks ksVar = new C16682ks();
        try {
            ksVar.f46602a = this.f46602a;
            if (this.f46604c == null) {
                ksVar.f46604c = null;
            } else {
                ksVar.f46604c.addAll(this.f46604c);
            }
            if (this.f46603b != null) {
                if (this.f46603b instanceof C16684ku) {
                    ksVar.f46603b = (C16684ku) ((C16684ku) this.f46603b).clone();
                } else if (this.f46603b instanceof byte[]) {
                    ksVar.f46603b = ((byte[]) this.f46603b).clone();
                } else {
                    int i = 0;
                    if (this.f46603b instanceof byte[][]) {
                        byte[][] bArr = (byte[][]) this.f46603b;
                        byte[][] bArr2 = new byte[bArr.length][];
                        ksVar.f46603b = bArr2;
                        while (i < bArr.length) {
                            bArr2[i] = (byte[]) bArr[i].clone();
                            i++;
                        }
                    } else if (this.f46603b instanceof boolean[]) {
                        ksVar.f46603b = ((boolean[]) this.f46603b).clone();
                    } else if (this.f46603b instanceof int[]) {
                        ksVar.f46603b = ((int[]) this.f46603b).clone();
                    } else if (this.f46603b instanceof long[]) {
                        ksVar.f46603b = ((long[]) this.f46603b).clone();
                    } else if (this.f46603b instanceof float[]) {
                        ksVar.f46603b = ((float[]) this.f46603b).clone();
                    } else if (this.f46603b instanceof double[]) {
                        ksVar.f46603b = ((double[]) this.f46603b).clone();
                    } else if (this.f46603b instanceof C16684ku[]) {
                        C16684ku[] kuVarArr = (C16684ku[]) this.f46603b;
                        C16684ku[] kuVarArr2 = new C16684ku[kuVarArr.length];
                        ksVar.f46603b = kuVarArr2;
                        while (i < kuVarArr.length) {
                            kuVarArr2[i] = (C16684ku) kuVarArr[i].clone();
                            i++;
                        }
                    }
                }
            }
            return ksVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }
}
