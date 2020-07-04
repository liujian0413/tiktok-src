package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C16579hf.C16583d;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.gt */
public class C16565gt {

    /* renamed from: a */
    static final C16565gt f46368a = new C16565gt(true);

    /* renamed from: b */
    private static final Class<?> f46369b = m54084d();

    /* renamed from: c */
    private static volatile C16565gt f46370c;

    /* renamed from: d */
    private final Map<C16566a, C16583d<?, ?>> f46371d;

    /* renamed from: com.google.android.gms.internal.measurement.gt$a */
    static final class C16566a {

        /* renamed from: a */
        private final Object f46372a;

        /* renamed from: b */
        private final int f46373b;

        C16566a(Object obj, int i) {
            this.f46372a = obj;
            this.f46373b = i;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f46372a) * 65535) + this.f46373b;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C16566a)) {
                return false;
            }
            C16566a aVar = (C16566a) obj;
            if (this.f46372a == aVar.f46372a && this.f46373b == aVar.f46373b) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: d */
    private static Class<?> m54084d() {
        try {
            return Class.forName("com.google.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static C16565gt m54081a() {
        return C16564gs.m54077a();
    }

    /* renamed from: b */
    public static C16565gt m54082b() {
        C16565gt gtVar = f46370c;
        if (gtVar == null) {
            synchronized (C16565gt.class) {
                gtVar = f46370c;
                if (gtVar == null) {
                    gtVar = C16564gs.m54079b();
                    f46370c = gtVar;
                }
            }
        }
        return gtVar;
    }

    /* renamed from: c */
    static C16565gt m54083c() {
        return C16577hd.m54142a(C16565gt.class);
    }

    /* renamed from: a */
    public final <ContainingType extends C16615ij> C16583d<ContainingType, ?> mo42889a(ContainingType containingtype, int i) {
        return (C16583d) this.f46371d.get(new C16566a(containingtype, i));
    }

    C16565gt() {
        this.f46371d = new HashMap();
    }

    private C16565gt(boolean z) {
        this.f46371d = Collections.emptyMap();
    }
}
