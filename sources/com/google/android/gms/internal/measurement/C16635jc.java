package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.jc */
final class C16635jc {

    /* renamed from: a */
    private static final Class<?> f46494a = m54432d();

    /* renamed from: b */
    private static final C16651js<?, ?> f46495b = m54407a(false);

    /* renamed from: c */
    private static final C16651js<?, ?> f46496c = m54407a(true);

    /* renamed from: d */
    private static final C16651js<?, ?> f46497d = new C16653ju();

    /* renamed from: a */
    public static void m54416a(Class<?> cls) {
        if (!C16579hf.class.isAssignableFrom(cls) && f46494a != null && !f46494a.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* renamed from: a */
    public static void m54412a(int i, List<Double> list, C16675kl klVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            klVar.mo42876g(i, list, z);
        }
    }

    /* renamed from: b */
    public static void m54425b(int i, List<Float> list, C16675kl klVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            klVar.mo42875f(i, list, z);
        }
    }

    /* renamed from: c */
    public static void m54429c(int i, List<Long> list, C16675kl klVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            klVar.mo42867c(i, list, z);
        }
    }

    /* renamed from: d */
    public static void m54433d(int i, List<Long> list, C16675kl klVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            klVar.mo42870d(i, list, z);
        }
    }

    /* renamed from: e */
    public static void m54437e(int i, List<Long> list, C16675kl klVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            klVar.mo42883n(i, list, z);
        }
    }

    /* renamed from: f */
    public static void m54440f(int i, List<Long> list, C16675kl klVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            klVar.mo42873e(i, list, z);
        }
    }

    /* renamed from: g */
    public static void m54443g(int i, List<Long> list, C16675kl klVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            klVar.mo42881l(i, list, z);
        }
    }

    /* renamed from: h */
    public static void m54446h(int i, List<Integer> list, C16675kl klVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            klVar.mo42856a(i, list, z);
        }
    }

    /* renamed from: i */
    public static void m54449i(int i, List<Integer> list, C16675kl klVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            klVar.mo42879j(i, list, z);
        }
    }

    /* renamed from: j */
    public static void m54452j(int i, List<Integer> list, C16675kl klVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            klVar.mo42882m(i, list, z);
        }
    }

    /* renamed from: k */
    public static void m54453k(int i, List<Integer> list, C16675kl klVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            klVar.mo42864b(i, list, z);
        }
    }

    /* renamed from: l */
    public static void m54454l(int i, List<Integer> list, C16675kl klVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            klVar.mo42880k(i, list, z);
        }
    }

    /* renamed from: m */
    public static void m54455m(int i, List<Integer> list, C16675kl klVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            klVar.mo42877h(i, list, z);
        }
    }

    /* renamed from: n */
    public static void m54456n(int i, List<Boolean> list, C16675kl klVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            klVar.mo42878i(i, list, z);
        }
    }

    /* renamed from: a */
    public static void m54410a(int i, List<String> list, C16675kl klVar) throws IOException {
        if (list != null && !list.isEmpty()) {
            klVar.mo42854a(i, list);
        }
    }

    /* renamed from: b */
    public static void m54423b(int i, List<zzte> list, C16675kl klVar) throws IOException {
        if (list != null && !list.isEmpty()) {
            klVar.mo42862b(i, list);
        }
    }

    /* renamed from: a */
    public static void m54411a(int i, List<?> list, C16675kl klVar, C16633ja jaVar) throws IOException {
        if (list != null && !list.isEmpty()) {
            klVar.mo42855a(i, list, jaVar);
        }
    }

    /* renamed from: b */
    public static void m54424b(int i, List<?> list, C16675kl klVar, C16633ja jaVar) throws IOException {
        if (list != null && !list.isEmpty()) {
            klVar.mo42863b(i, list, jaVar);
        }
    }

    /* renamed from: a */
    static int m54405a(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C16603hy) {
            C16603hy hyVar = (C16603hy) list;
            i = 0;
            while (i2 < size) {
                i += zztv.m54933d(hyVar.mo42973b(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zztv.m54933d(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: a */
    static int m54404a(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return m54405a(list) + (list.size() * zztv.m54934e(i));
    }

    /* renamed from: b */
    static int m54421b(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C16603hy) {
            C16603hy hyVar = (C16603hy) list;
            i = 0;
            while (i2 < size) {
                i += zztv.m54936e(hyVar.mo42973b(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zztv.m54936e(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: b */
    static int m54420b(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m54421b(list) + (size * zztv.m54934e(i));
    }

    /* renamed from: c */
    static int m54427c(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C16603hy) {
            C16603hy hyVar = (C16603hy) list;
            i = 0;
            while (i2 < size) {
                i += zztv.m54940f(hyVar.mo42973b(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zztv.m54940f(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: c */
    static int m54426c(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m54427c(list) + (size * zztv.m54934e(i));
    }

    /* renamed from: d */
    static int m54431d(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C16585hg) {
            C16585hg hgVar = (C16585hg) list;
            i = 0;
            while (i2 < size) {
                i += zztv.m54948i(hgVar.mo42944b(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zztv.m54948i(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: d */
    static int m54430d(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m54431d(list) + (size * zztv.m54934e(i));
    }

    /* renamed from: e */
    static int m54435e(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C16585hg) {
            C16585hg hgVar = (C16585hg) list;
            i = 0;
            while (i2 < size) {
                i += zztv.m54937f(hgVar.mo42944b(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zztv.m54937f(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: e */
    static int m54434e(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m54435e(list) + (size * zztv.m54934e(i));
    }

    /* renamed from: f */
    static int m54439f(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C16585hg) {
            C16585hg hgVar = (C16585hg) list;
            i = 0;
            while (i2 < size) {
                i += zztv.m54941g(hgVar.mo42944b(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zztv.m54941g(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: f */
    static int m54438f(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m54439f(list) + (size * zztv.m54934e(i));
    }

    /* renamed from: g */
    static int m54442g(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C16585hg) {
            C16585hg hgVar = (C16585hg) list;
            i = 0;
            while (i2 < size) {
                i += zztv.m54945h(hgVar.mo42944b(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zztv.m54945h(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: g */
    static int m54441g(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m54442g(list) + (size * zztv.m54934e(i));
    }

    /* renamed from: h */
    static int m54445h(List<?> list) {
        return list.size() << 2;
    }

    /* renamed from: h */
    static int m54444h(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zztv.m54949i(i, 0);
    }

    /* renamed from: i */
    static int m54448i(List<?> list) {
        return list.size() << 3;
    }

    /* renamed from: i */
    static int m54447i(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zztv.m54943g(i, 0);
    }

    /* renamed from: j */
    static int m54451j(List<?> list) {
        return list.size();
    }

    /* renamed from: j */
    static int m54450j(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zztv.m54919b(i, true);
    }

    /* renamed from: a */
    static int m54402a(int i, List<?> list) {
        int i2;
        int i3;
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        int e = zztv.m54934e(i) * size;
        if (list instanceof C16598ht) {
            C16598ht htVar = (C16598ht) list;
            while (i4 < size) {
                Object b = htVar.mo42964b(i4);
                if (b instanceof zzte) {
                    i3 = zztv.m54922b((zzte) b);
                } else {
                    i3 = zztv.m54923b((String) b);
                }
                e += i3;
                i4++;
            }
        } else {
            while (i4 < size) {
                Object obj = list.get(i4);
                if (obj instanceof zzte) {
                    i2 = zztv.m54922b((zzte) obj);
                } else {
                    i2 = zztv.m54923b((String) obj);
                }
                e += i2;
                i4++;
            }
        }
        return e;
    }

    /* renamed from: a */
    static int m54401a(int i, Object obj, C16633ja jaVar) {
        if (obj instanceof C16596hr) {
            return zztv.m54910a(i, (C16596hr) obj);
        }
        return zztv.m54917b(i, (C16615ij) obj, jaVar);
    }

    /* renamed from: a */
    static int m54403a(int i, List<?> list, C16633ja jaVar) {
        int i2;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e = zztv.m54934e(i) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            if (obj instanceof C16596hr) {
                i2 = zztv.m54911a((C16596hr) obj);
            } else {
                i2 = zztv.m54921b((C16615ij) obj, jaVar);
            }
            e += i2;
        }
        return e;
    }

    /* renamed from: b */
    static int m54418b(int i, List<zzte> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e = size * zztv.m54934e(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            e += zztv.m54922b((zzte) list.get(i2));
        }
        return e;
    }

    /* renamed from: b */
    static int m54419b(int i, List<C16615ij> list, C16633ja jaVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += zztv.m54926c(i, (C16615ij) list.get(i3), jaVar);
        }
        return i2;
    }

    /* renamed from: a */
    public static C16651js<?, ?> m54406a() {
        return f46495b;
    }

    /* renamed from: b */
    public static C16651js<?, ?> m54422b() {
        return f46496c;
    }

    /* renamed from: c */
    public static C16651js<?, ?> m54428c() {
        return f46497d;
    }

    /* renamed from: a */
    private static C16651js<?, ?> m54407a(boolean z) {
        try {
            Class e = m54436e();
            if (e == null) {
                return null;
            }
            return (C16651js) e.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: d */
    private static Class<?> m54432d() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: e */
    private static Class<?> m54436e() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    static boolean m54417a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: a */
    static <T> void m54414a(C16610ie ieVar, T t, T t2, long j) {
        C16657jy.m54552a((Object) t, j, ieVar.mo42980a(C16657jy.m54575f(t, j), C16657jy.m54575f(t2, j)));
    }

    /* renamed from: a */
    static <T, FT extends C16572gz<FT>> void m54413a(C16567gu<FT> guVar, T t, T t2) {
        C16570gx a = guVar.mo42893a((Object) t2);
        if (!a.mo42903b()) {
            guVar.mo42900b(t).mo42902a(a);
        }
    }

    /* renamed from: a */
    static <T, UT, UB> void m54415a(C16651js<UT, UB> jsVar, T t, T t2) {
        jsVar.mo43055a((Object) t, jsVar.mo43062c(jsVar.mo43057b(t), jsVar.mo43057b(t2)));
    }

    /* renamed from: a */
    static <UT, UB> UB m54409a(int i, List<Integer> list, C16589hk hkVar, UB ub, C16651js<UT, UB> jsVar) {
        UB ub2;
        if (hkVar == null) {
            return ub;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            loop1:
            while (true) {
                ub2 = ub;
                while (it.hasNext()) {
                    int intValue = ((Integer) it.next()).intValue();
                    if (!hkVar.mo42653a(intValue)) {
                        ub = m54408a(i, intValue, ub2, jsVar);
                        it.remove();
                    }
                }
                break loop1;
            }
        } else {
            int size = list.size();
            ub2 = ub;
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue2 = ((Integer) list.get(i3)).intValue();
                if (hkVar.mo42653a(intValue2)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue2));
                    }
                    i2++;
                } else {
                    ub2 = m54408a(i, intValue2, ub2, jsVar);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        }
        return ub2;
    }

    /* renamed from: a */
    static <UT, UB> UB m54408a(int i, int i2, UB ub, C16651js<UT, UB> jsVar) {
        if (ub == null) {
            ub = jsVar.mo43048a();
        }
        jsVar.mo43051a(ub, i, (long) i2);
        return ub;
    }
}
