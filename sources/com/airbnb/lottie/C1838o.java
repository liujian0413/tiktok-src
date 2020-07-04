package com.airbnb.lottie;

import android.support.p022v4.util.C0888a;
import android.support.p022v4.util.C0902i;
import com.airbnb.lottie.p056d.C1749d;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: com.airbnb.lottie.o */
public final class C1838o {

    /* renamed from: a */
    public boolean f6643a;

    /* renamed from: b */
    private final Set<Object> f6644b = new C0888a();

    /* renamed from: c */
    private final Map<String, C1749d> f6645c = new HashMap();

    /* renamed from: d */
    private final Comparator<C0902i<String, Float>> f6646d = new Comparator<C0902i<String, Float>>() {
        public final /* synthetic */ int compare(Object obj, Object obj2) {
            return m8606a((C0902i) obj, (C0902i) obj2);
        }

        /* renamed from: a */
        private static int m8606a(C0902i<String, Float> iVar, C0902i<String, Float> iVar2) {
            float floatValue = ((Float) iVar.f3155b).floatValue();
            float floatValue2 = ((Float) iVar2.f3155b).floatValue();
            if (floatValue2 > floatValue) {
                return 1;
            }
            if (floatValue > floatValue2) {
                return -1;
            }
            return 0;
        }
    };

    /* renamed from: a */
    public final void mo7338a(String str, float f) {
        if (this.f6643a) {
            C1749d dVar = (C1749d) this.f6645c.get(str);
            if (dVar == null) {
                dVar = new C1749d();
                this.f6645c.put(str, dVar);
            }
            dVar.mo7199a(f);
            if (str.equals("__container")) {
                Iterator it = this.f6644b.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        }
    }
}
