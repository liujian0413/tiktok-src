package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C16679kp;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.kq */
public final class C16680kq<M extends C16679kp<M>, T> {

    /* renamed from: a */
    protected final Class<T> f46594a;

    /* renamed from: b */
    public final int f46595b;

    /* renamed from: c */
    protected final boolean f46596c;

    /* renamed from: d */
    private final int f46597d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16680kq)) {
            return false;
        }
        C16680kq kqVar = (C16680kq) obj;
        return this.f46597d == kqVar.f46597d && this.f46594a == kqVar.f46594a && this.f46595b == kqVar.f46595b && this.f46596c == kqVar.f46596c;
    }

    public final int hashCode() {
        return ((((((this.f46597d + 1147) * 31) + this.f46594a.hashCode()) * 31) + this.f46595b) * 31) + (this.f46596c ? 1 : 0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final T mo43150a(List<C16686kw> list) {
        if (list == null) {
            return null;
        }
        if (this.f46596c) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                C16686kw kwVar = (C16686kw) list.get(i);
                if (kwVar.f46610b.length != 0) {
                    arrayList.add(m54785a(C16676km.m54725a(kwVar.f46610b)));
                }
            }
            int size = arrayList.size();
            if (size == 0) {
                return null;
            }
            T cast = this.f46594a.cast(Array.newInstance(this.f46594a.getComponentType(), size));
            for (int i2 = 0; i2 < size; i2++) {
                Array.set(cast, i2, arrayList.get(i2));
            }
            return cast;
        } else if (list.isEmpty()) {
            return null;
        } else {
            return this.f46594a.cast(m54785a(C16676km.m54725a(((C16686kw) list.get(list.size() - 1)).f46610b)));
        }
    }

    /* renamed from: a */
    private final Object m54785a(C16676km kmVar) {
        Class<T> componentType = this.f46596c ? this.f46594a.getComponentType() : this.f46594a;
        try {
            switch (this.f46597d) {
                case 10:
                    C16684ku kuVar = (C16684ku) componentType.newInstance();
                    kmVar.mo43116a(kuVar, this.f46595b >>> 3);
                    return kuVar;
                case 11:
                    C16684ku kuVar2 = (C16684ku) componentType.newInstance();
                    kmVar.mo43115a(kuVar2);
                    return kuVar2;
                default:
                    int i = this.f46597d;
                    StringBuilder sb = new StringBuilder(24);
                    sb.append("Unknown type ");
                    sb.append(i);
                    throw new IllegalArgumentException(sb.toString());
            }
        } catch (InstantiationException e) {
            String valueOf = String.valueOf(componentType);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 33);
            sb2.append("Error creating instance of class ");
            sb2.append(valueOf);
            throw new IllegalArgumentException(sb2.toString(), e);
        } catch (IllegalAccessException e2) {
            String valueOf2 = String.valueOf(componentType);
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 33);
            sb3.append("Error creating instance of class ");
            sb3.append(valueOf2);
            throw new IllegalArgumentException(sb3.toString(), e2);
        } catch (IOException e3) {
            throw new IllegalArgumentException("Error reading extension field", e3);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo43151a(Object obj, C16678ko koVar) {
        try {
            koVar.mo43144c(this.f46595b);
            switch (this.f46597d) {
                case 10:
                    int i = this.f46595b >>> 3;
                    ((C16684ku) obj).mo42655a(koVar);
                    koVar.mo43145c(i, 4);
                    return;
                case 11:
                    koVar.mo43141a((C16684ku) obj);
                    return;
                default:
                    int i2 = this.f46597d;
                    StringBuilder sb = new StringBuilder(24);
                    sb.append("Unknown type ");
                    sb.append(i2);
                    throw new IllegalArgumentException(sb.toString());
            }
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo43149a(Object obj) {
        int i = this.f46595b >>> 3;
        switch (this.f46597d) {
            case 10:
                return (C16678ko.m54758b(i) << 1) + ((C16684ku) obj).mo43168e();
            case 11:
                return C16678ko.m54760b(i, (C16684ku) obj);
            default:
                int i2 = this.f46597d;
                StringBuilder sb = new StringBuilder(24);
                sb.append("Unknown type ");
                sb.append(i2);
                throw new IllegalArgumentException(sb.toString());
        }
    }
}
