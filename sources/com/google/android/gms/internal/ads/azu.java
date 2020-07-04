package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

final class azu {

    /* renamed from: a */
    private static final Class<?> f41282a = m48009d();

    /* renamed from: b */
    private static final bak<?, ?> f41283b = m47984a(false);

    /* renamed from: c */
    private static final bak<?, ?> f41284c = m47984a(true);

    /* renamed from: d */
    private static final bak<?, ?> f41285d = new bam();

    /* renamed from: a */
    public static void m47993a(Class<?> cls) {
        if (!axu.class.isAssignableFrom(cls) && f41282a != null && !f41282a.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* renamed from: a */
    public static void m47989a(int i, List<Double> list, bbe bbe, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            bbe.mo40231g(i, list, z);
        }
    }

    /* renamed from: b */
    public static void m48002b(int i, List<Float> list, bbe bbe, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            bbe.mo40230f(i, list, z);
        }
    }

    /* renamed from: c */
    public static void m48006c(int i, List<Long> list, bbe bbe, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            bbe.mo40222c(i, list, z);
        }
    }

    /* renamed from: d */
    public static void m48010d(int i, List<Long> list, bbe bbe, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            bbe.mo40225d(i, list, z);
        }
    }

    /* renamed from: e */
    public static void m48014e(int i, List<Long> list, bbe bbe, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            bbe.mo40238n(i, list, z);
        }
    }

    /* renamed from: f */
    public static void m48017f(int i, List<Long> list, bbe bbe, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            bbe.mo40228e(i, list, z);
        }
    }

    /* renamed from: g */
    public static void m48020g(int i, List<Long> list, bbe bbe, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            bbe.mo40236l(i, list, z);
        }
    }

    /* renamed from: h */
    public static void m48023h(int i, List<Integer> list, bbe bbe, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            bbe.mo40211a(i, list, z);
        }
    }

    /* renamed from: i */
    public static void m48026i(int i, List<Integer> list, bbe bbe, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            bbe.mo40234j(i, list, z);
        }
    }

    /* renamed from: j */
    public static void m48029j(int i, List<Integer> list, bbe bbe, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            bbe.mo40237m(i, list, z);
        }
    }

    /* renamed from: k */
    public static void m48030k(int i, List<Integer> list, bbe bbe, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            bbe.mo40219b(i, list, z);
        }
    }

    /* renamed from: l */
    public static void m48031l(int i, List<Integer> list, bbe bbe, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            bbe.mo40235k(i, list, z);
        }
    }

    /* renamed from: m */
    public static void m48032m(int i, List<Integer> list, bbe bbe, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            bbe.mo40232h(i, list, z);
        }
    }

    /* renamed from: n */
    public static void m48033n(int i, List<Boolean> list, bbe bbe, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            bbe.mo40233i(i, list, z);
        }
    }

    /* renamed from: a */
    public static void m47987a(int i, List<String> list, bbe bbe) throws IOException {
        if (list != null && !list.isEmpty()) {
            bbe.mo40209a(i, list);
        }
    }

    /* renamed from: b */
    public static void m48000b(int i, List<zzcce> list, bbe bbe) throws IOException {
        if (list != null && !list.isEmpty()) {
            bbe.mo40217b(i, list);
        }
    }

    /* renamed from: a */
    public static void m47988a(int i, List<?> list, bbe bbe, azs azs) throws IOException {
        if (list != null && !list.isEmpty()) {
            bbe.mo40210a(i, list, azs);
        }
    }

    /* renamed from: b */
    public static void m48001b(int i, List<?> list, bbe bbe, azs azs) throws IOException {
        if (list != null && !list.isEmpty()) {
            bbe.mo40218b(i, list, azs);
        }
    }

    /* renamed from: a */
    static int m47982a(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof ayp) {
            ayp ayp = (ayp) list;
            i = 0;
            while (i2 < size) {
                i += zzccv.m53017d(ayp.mo40327b(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzccv.m53017d(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: a */
    static int m47981a(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return m47982a(list) + (list.size() * zzccv.m53019e(i));
    }

    /* renamed from: b */
    static int m47998b(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof ayp) {
            ayp ayp = (ayp) list;
            i = 0;
            while (i2 < size) {
                i += zzccv.m53021e(ayp.mo40327b(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzccv.m53021e(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: b */
    static int m47997b(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m47998b(list) + (size * zzccv.m53019e(i));
    }

    /* renamed from: c */
    static int m48004c(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof ayp) {
            ayp ayp = (ayp) list;
            i = 0;
            while (i2 < size) {
                i += zzccv.m53025f(ayp.mo40327b(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzccv.m53025f(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: c */
    static int m48003c(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m48004c(list) + (size * zzccv.m53019e(i));
    }

    /* renamed from: d */
    static int m48008d(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof axv) {
            axv axv = (axv) list;
            i = 0;
            while (i2 < size) {
                i += zzccv.m53033i(axv.mo40295c(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzccv.m53033i(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: d */
    static int m48007d(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m48008d(list) + (size * zzccv.m53019e(i));
    }

    /* renamed from: e */
    static int m48012e(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof axv) {
            axv axv = (axv) list;
            i = 0;
            while (i2 < size) {
                i += zzccv.m53022f(axv.mo40295c(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzccv.m53022f(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: e */
    static int m48011e(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m48012e(list) + (size * zzccv.m53019e(i));
    }

    /* renamed from: f */
    static int m48016f(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof axv) {
            axv axv = (axv) list;
            i = 0;
            while (i2 < size) {
                i += zzccv.m53026g(axv.mo40295c(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzccv.m53026g(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: f */
    static int m48015f(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m48016f(list) + (size * zzccv.m53019e(i));
    }

    /* renamed from: g */
    static int m48019g(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof axv) {
            axv axv = (axv) list;
            i = 0;
            while (i2 < size) {
                i += zzccv.m53030h(axv.mo40295c(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzccv.m53030h(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: g */
    static int m48018g(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m48019g(list) + (size * zzccv.m53019e(i));
    }

    /* renamed from: h */
    static int m48022h(List<?> list) {
        return list.size() << 2;
    }

    /* renamed from: h */
    static int m48021h(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzccv.m53034i(i, 0);
    }

    /* renamed from: i */
    static int m48025i(List<?> list) {
        return list.size() << 3;
    }

    /* renamed from: i */
    static int m48024i(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzccv.m53028g(i, 0);
    }

    /* renamed from: j */
    static int m48028j(List<?> list) {
        return list.size();
    }

    /* renamed from: j */
    static int m48027j(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzccv.m53004b(i, true);
    }

    /* renamed from: a */
    static int m47979a(int i, List<?> list) {
        int i2;
        int i3;
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        int e = zzccv.m53019e(i) * size;
        if (list instanceof ayk) {
            ayk ayk = (ayk) list;
            while (i4 < size) {
                Object b = ayk.mo40318b(i4);
                if (b instanceof zzcce) {
                    i3 = zzccv.m53007b((zzcce) b);
                } else {
                    i3 = zzccv.m53008b((String) b);
                }
                e += i3;
                i4++;
            }
        } else {
            while (i4 < size) {
                Object obj = list.get(i4);
                if (obj instanceof zzcce) {
                    i2 = zzccv.m53007b((zzcce) obj);
                } else {
                    i2 = zzccv.m53008b((String) obj);
                }
                e += i2;
                i4++;
            }
        }
        return e;
    }

    /* renamed from: a */
    static int m47978a(int i, Object obj, azs azs) {
        if (obj instanceof ayi) {
            return zzccv.m52995a(i, (ayi) obj);
        }
        return zzccv.m53002b(i, (aza) obj, azs);
    }

    /* renamed from: a */
    static int m47980a(int i, List<?> list, azs azs) {
        int i2;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e = zzccv.m53019e(i) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            if (obj instanceof ayi) {
                i2 = zzccv.m52996a((ayi) obj);
            } else {
                i2 = zzccv.m53006b((aza) obj, azs);
            }
            e += i2;
        }
        return e;
    }

    /* renamed from: b */
    static int m47995b(int i, List<zzcce> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e = size * zzccv.m53019e(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            e += zzccv.m53007b((zzcce) list.get(i2));
        }
        return e;
    }

    /* renamed from: b */
    static int m47996b(int i, List<aza> list, azs azs) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += zzccv.m53011c(i, (aza) list.get(i3), azs);
        }
        return i2;
    }

    /* renamed from: a */
    public static bak<?, ?> m47983a() {
        return f41283b;
    }

    /* renamed from: b */
    public static bak<?, ?> m47999b() {
        return f41284c;
    }

    /* renamed from: c */
    public static bak<?, ?> m48005c() {
        return f41285d;
    }

    /* renamed from: a */
    private static bak<?, ?> m47984a(boolean z) {
        try {
            Class e = m48013e();
            if (e == null) {
                return null;
            }
            return (bak) e.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: d */
    private static Class<?> m48009d() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: e */
    private static Class<?> m48013e() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    static boolean m47994a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: a */
    static <T> void m47991a(ayv ayv, T t, T t2, long j) {
        baq.m48141a((Object) t, j, ayv.mo40333a(baq.m48164f(t, j), baq.m48164f(t2, j)));
    }

    /* renamed from: a */
    static <T, FT extends axo<FT>> void m47990a(axj<FT> axj, T t, T t2) {
        axm a = axj.mo40247a((Object) t2);
        if (!a.mo40257b()) {
            axj.mo40254b(t).mo40256a(a);
        }
    }

    /* renamed from: a */
    static <T, UT, UB> void m47992a(bak<UT, UB> bak, T t, T t2) {
        bak.mo40408a((Object) t, bak.mo40415c(bak.mo40410b(t), bak.mo40410b(t2)));
    }

    /* renamed from: a */
    static <UT, UB> UB m47986a(int i, List<Integer> list, axz axz, UB ub, bak<UT, UB> bak) {
        UB ub2;
        if (axz == null) {
            return ub;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            loop1:
            while (true) {
                ub2 = ub;
                while (it.hasNext()) {
                    int intValue = ((Integer) it.next()).intValue();
                    if (!axz.mo39677a(intValue)) {
                        ub = m47985a(i, intValue, ub2, bak);
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
                if (axz.mo39677a(intValue2)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue2));
                    }
                    i2++;
                } else {
                    ub2 = m47985a(i, intValue2, ub2, bak);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        }
        return ub2;
    }

    /* renamed from: a */
    static <UT, UB> UB m47985a(int i, int i2, UB ub, bak<UT, UB> bak) {
        if (ub == null) {
            ub = bak.mo40401a();
        }
        bak.mo40404a(ub, i, (long) i2);
        return ub;
    }
}
