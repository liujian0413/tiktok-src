package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.axu.C15549d;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class axi {

    /* renamed from: a */
    static final axi f41167a = new axi(true);

    /* renamed from: b */
    private static final Class<?> f41168b = m47632d();

    /* renamed from: c */
    private static volatile axi f41169c;

    /* renamed from: d */
    private final Map<C15545a, C15549d<?, ?>> f41170d;

    /* renamed from: com.google.android.gms.internal.ads.axi$a */
    static final class C15545a {

        /* renamed from: a */
        private final Object f41171a;

        /* renamed from: b */
        private final int f41172b;

        C15545a(Object obj, int i) {
            this.f41171a = obj;
            this.f41172b = i;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f41171a) * 65535) + this.f41172b;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C15545a)) {
                return false;
            }
            C15545a aVar = (C15545a) obj;
            if (this.f41171a == aVar.f41171a && this.f41172b == aVar.f41172b) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: d */
    private static Class<?> m47632d() {
        try {
            return Class.forName("com.google.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static axi m47629a() {
        return axh.m47625a();
    }

    /* renamed from: b */
    public static axi m47630b() {
        axi axi = f41169c;
        if (axi == null) {
            synchronized (axi.class) {
                axi = f41169c;
                if (axi == null) {
                    axi = axh.m47627b();
                    f41169c = axi;
                }
            }
        }
        return axi;
    }

    /* renamed from: c */
    static axi m47631c() {
        return axs.m47689a(axi.class);
    }

    /* renamed from: a */
    public final <ContainingType extends aza> C15549d<ContainingType, ?> mo40243a(ContainingType containingtype, int i) {
        return (C15549d) this.f41170d.get(new C15545a(containingtype, i));
    }

    axi() {
        this.f41170d = new HashMap();
    }

    private axi(boolean z) {
        this.f41170d = Collections.emptyMap();
    }
}
