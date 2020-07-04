package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.graphics.Rect;
import android.support.p022v4.util.ArrayMap;
import android.support.p022v4.util.C0893e;
import android.support.p022v4.util.C0904k;
import android.support.p022v4.view.C0991u;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: android.support.transition.m */
public abstract class C0508m implements Cloneable {

    /* renamed from: C */
    private static ThreadLocal<ArrayMap<Animator, C0512a>> f2010C = new ThreadLocal<>();

    /* renamed from: a */
    private static final int[] f2011a = {2, 1, 3, 4};

    /* renamed from: p */
    private static final C0492f f2012p = new C0492f() {
        /* renamed from: a */
        public final Path mo2106a(float f, float f2, float f3, float f4) {
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f3, f4);
            return path;
        }
    };

    /* renamed from: A */
    private ArrayList<C0524s> f2013A;

    /* renamed from: B */
    private ArrayList<C0524s> f2014B;

    /* renamed from: D */
    private ViewGroup f2015D = null;

    /* renamed from: E */
    private int f2016E = 0;

    /* renamed from: F */
    private boolean f2017F = false;

    /* renamed from: G */
    private boolean f2018G = false;

    /* renamed from: H */
    private ArrayList<C0514c> f2019H = null;

    /* renamed from: I */
    private ArrayList<Animator> f2020I = new ArrayList<>();

    /* renamed from: J */
    private ArrayMap<String, String> f2021J;

    /* renamed from: b */
    public String f2022b = getClass().getName();

    /* renamed from: c */
    public long f2023c = -1;

    /* renamed from: d */
    public long f2024d = -1;

    /* renamed from: e */
    public TimeInterpolator f2025e = null;

    /* renamed from: f */
    public ArrayList<Integer> f2026f = new ArrayList<>();

    /* renamed from: g */
    public ArrayList<View> f2027g = new ArrayList<>();

    /* renamed from: h */
    public ArrayList<String> f2028h = null;

    /* renamed from: i */
    public ArrayList<Class> f2029i = null;

    /* renamed from: j */
    C0520q f2030j = null;

    /* renamed from: k */
    boolean f2031k = false;

    /* renamed from: l */
    ArrayList<Animator> f2032l = new ArrayList<>();

    /* renamed from: m */
    public C0519p f2033m;

    /* renamed from: n */
    public C0513b f2034n;

    /* renamed from: o */
    public C0492f f2035o = f2012p;

    /* renamed from: q */
    private ArrayList<Integer> f2036q = null;

    /* renamed from: r */
    private ArrayList<View> f2037r = null;

    /* renamed from: s */
    private ArrayList<Class> f2038s = null;

    /* renamed from: t */
    private ArrayList<String> f2039t = null;

    /* renamed from: u */
    private ArrayList<Integer> f2040u = null;

    /* renamed from: v */
    private ArrayList<View> f2041v = null;

    /* renamed from: w */
    private ArrayList<Class> f2042w = null;

    /* renamed from: x */
    private C0525t f2043x = new C0525t();

    /* renamed from: y */
    private C0525t f2044y = new C0525t();

    /* renamed from: z */
    private int[] f2045z = f2011a;

    /* renamed from: android.support.transition.m$a */
    static class C0512a {

        /* renamed from: a */
        View f2049a;

        /* renamed from: b */
        String f2050b;

        /* renamed from: c */
        C0524s f2051c;

        /* renamed from: d */
        C0474an f2052d;

        /* renamed from: e */
        C0508m f2053e;

        C0512a(View view, String str, C0508m mVar, C0474an anVar, C0524s sVar) {
            this.f2049a = view;
            this.f2050b = str;
            this.f2051c = sVar;
            this.f2052d = anVar;
            this.f2053e = mVar;
        }
    }

    /* renamed from: android.support.transition.m$b */
    public static abstract class C0513b {
        /* renamed from: a */
        public abstract Rect mo2041a(C0508m mVar);
    }

    /* renamed from: android.support.transition.m$c */
    public interface C0514c {
        /* renamed from: a */
        void mo2042a(C0508m mVar);

        /* renamed from: b */
        void mo2043b(C0508m mVar);

        /* renamed from: c */
        void mo2044c(C0508m mVar);

        /* renamed from: d */
        void mo2045d(C0508m mVar);
    }

    /* renamed from: a */
    public Animator mo1184a(ViewGroup viewGroup, C0524s sVar, C0524s sVar2) {
        return null;
    }

    /* renamed from: a */
    public abstract void mo1185a(C0524s sVar);

    /* renamed from: a */
    public String[] mo2073a() {
        return null;
    }

    /* renamed from: b */
    public abstract void mo1186b(C0524s sVar);

    /* renamed from: a */
    public C0508m mo2116a(TimeInterpolator timeInterpolator) {
        this.f2025e = timeInterpolator;
        return this;
    }

    /* renamed from: a */
    private void m2123a(ArrayMap<View, C0524s> arrayMap, ArrayMap<View, C0524s> arrayMap2, SparseArray<View> sparseArray, SparseArray<View> sparseArray2) {
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            View view = (View) sparseArray.valueAt(i);
            if (view != null && mo2127a(view)) {
                View view2 = (View) sparseArray2.get(sparseArray.keyAt(i));
                if (view2 != null && mo2127a(view2)) {
                    C0524s sVar = (C0524s) arrayMap.get(view);
                    C0524s sVar2 = (C0524s) arrayMap2.get(view2);
                    if (!(sVar == null || sVar2 == null)) {
                        this.f2013A.add(sVar);
                        this.f2014B.add(sVar2);
                        arrayMap.remove(view);
                        arrayMap2.remove(view2);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo2124a(ViewGroup viewGroup, C0525t tVar, C0525t tVar2, ArrayList<C0524s> arrayList, ArrayList<C0524s> arrayList2) {
        int i;
        int i2;
        View view;
        Animator animator;
        C0524s sVar;
        Animator animator2;
        C0524s sVar2;
        ViewGroup viewGroup2 = viewGroup;
        ArrayMap g = mo2156g();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        long j = Long.MAX_VALUE;
        int i3 = 0;
        while (i3 < size) {
            C0524s sVar3 = (C0524s) arrayList.get(i3);
            C0524s sVar4 = (C0524s) arrayList2.get(i3);
            if (sVar3 != null && !sVar3.f2074c.contains(this)) {
                sVar3 = null;
            }
            if (sVar4 != null && !sVar4.f2074c.contains(this)) {
                sVar4 = null;
            }
            if (!(sVar3 == null && sVar4 == null)) {
                if (sVar3 == null || sVar4 == null || mo2072a(sVar3, sVar4)) {
                    Animator a = mo1184a(viewGroup2, sVar3, sVar4);
                    if (a != null) {
                        if (sVar4 != null) {
                            view = sVar4.f2073b;
                            String[] a2 = mo2073a();
                            if (view != null && a2 != null && a2.length > 0) {
                                sVar2 = new C0524s();
                                sVar2.f2073b = view;
                                animator2 = a;
                                i2 = size;
                                C0524s sVar5 = (C0524s) tVar2.f2075a.get(view);
                                if (sVar5 != null) {
                                    int i4 = 0;
                                    while (i4 < a2.length) {
                                        int i5 = i3;
                                        C0524s sVar6 = sVar5;
                                        sVar2.f2072a.put(a2[i4], sVar5.f2072a.get(a2[i4]));
                                        i4++;
                                        i3 = i5;
                                        sVar5 = sVar6;
                                        ArrayList<C0524s> arrayList3 = arrayList2;
                                    }
                                }
                                i = i3;
                                int size2 = g.size();
                                int i6 = 0;
                                while (true) {
                                    if (i6 >= size2) {
                                        break;
                                    }
                                    C0512a aVar = (C0512a) g.get((Animator) g.mo3417b(i6));
                                    if (aVar.f2051c != null && aVar.f2049a == view && aVar.f2050b.equals(this.f2022b) && aVar.f2051c.equals(sVar2)) {
                                        sVar = sVar2;
                                        animator = null;
                                        break;
                                    }
                                    i6++;
                                }
                            } else {
                                animator2 = a;
                                i2 = size;
                                i = i3;
                                sVar2 = null;
                            }
                            sVar = sVar2;
                            animator = animator2;
                        } else {
                            Animator animator3 = a;
                            i2 = size;
                            i = i3;
                            view = sVar3.f2073b;
                            animator = animator3;
                            sVar = null;
                        }
                        if (animator != null) {
                            if (this.f2033m != null) {
                                long a3 = this.f2033m.mo2111a(viewGroup2, this, sVar3, sVar4);
                                sparseIntArray.put(this.f2020I.size(), (int) a3);
                                j = Math.min(a3, j);
                            }
                            long j2 = j;
                            C0512a aVar2 = new C0512a(view, this.f2022b, this, C0460ae.m2010b(viewGroup), sVar);
                            g.put(animator, aVar2);
                            this.f2020I.add(animator);
                            j = j2;
                        }
                        i3 = i + 1;
                        size = i2;
                    }
                }
            }
            i2 = size;
            i = i3;
            i3 = i + 1;
            size = i2;
        }
        if (j != 0) {
            for (int i7 = 0; i7 < sparseIntArray.size(); i7++) {
                Animator animator4 = (Animator) this.f2020I.get(sparseIntArray.keyAt(i7));
                animator4.setStartDelay((((long) sparseIntArray.valueAt(i7)) - j) + animator4.getStartDelay());
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo2127a(View view) {
        int id = view.getId();
        if (this.f2036q != null && this.f2036q.contains(Integer.valueOf(id))) {
            return false;
        }
        if (this.f2037r != null && this.f2037r.contains(view)) {
            return false;
        }
        if (this.f2038s != null) {
            int size = this.f2038s.size();
            for (int i = 0; i < size; i++) {
                if (((Class) this.f2038s.get(i)).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.f2039t != null && C0991u.m4241t(view) != null && this.f2039t.contains(C0991u.m4241t(view))) {
            return false;
        }
        if ((this.f2026f.size() == 0 && this.f2027g.size() == 0 && ((this.f2029i == null || this.f2029i.isEmpty()) && (this.f2028h == null || this.f2028h.isEmpty()))) || this.f2026f.contains(Integer.valueOf(id)) || this.f2027g.contains(view)) {
            return true;
        }
        if (this.f2028h != null && this.f2028h.contains(C0991u.m4241t(view))) {
            return true;
        }
        if (this.f2029i != null) {
            for (int i2 = 0; i2 < this.f2029i.size(); i2++) {
                if (((Class) this.f2029i.get(i2)).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo2125a(ViewGroup viewGroup, boolean z) {
        mo2126a(z);
        if ((this.f2026f.size() > 0 || this.f2027g.size() > 0) && ((this.f2028h == null || this.f2028h.isEmpty()) && (this.f2029i == null || this.f2029i.isEmpty()))) {
            for (int i = 0; i < this.f2026f.size(); i++) {
                View findViewById = viewGroup.findViewById(((Integer) this.f2026f.get(i)).intValue());
                if (findViewById != null) {
                    C0524s sVar = new C0524s();
                    sVar.f2073b = findViewById;
                    if (z) {
                        mo1185a(sVar);
                    } else {
                        mo1186b(sVar);
                    }
                    sVar.f2074c.add(this);
                    mo2136c(sVar);
                    if (z) {
                        m2119a(this.f2043x, findViewById, sVar);
                    } else {
                        m2119a(this.f2044y, findViewById, sVar);
                    }
                }
            }
            for (int i2 = 0; i2 < this.f2027g.size(); i2++) {
                View view = (View) this.f2027g.get(i2);
                C0524s sVar2 = new C0524s();
                sVar2.f2073b = view;
                if (z) {
                    mo1185a(sVar2);
                } else {
                    mo1186b(sVar2);
                }
                sVar2.f2074c.add(this);
                mo2136c(sVar2);
                if (z) {
                    m2119a(this.f2043x, view, sVar2);
                } else {
                    m2119a(this.f2044y, view, sVar2);
                }
            }
        } else {
            m2126c(viewGroup, z);
        }
        if (!z && this.f2021J != null) {
            int size = this.f2021J.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i3 = 0; i3 < size; i3++) {
                arrayList.add(this.f2043x.f2078d.remove((String) this.f2021J.mo3417b(i3)));
            }
            for (int i4 = 0; i4 < size; i4++) {
                View view2 = (View) arrayList.get(i4);
                if (view2 != null) {
                    this.f2043x.f2078d.put((String) this.f2021J.mo3418c(i4), view2);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo2126a(boolean z) {
        if (z) {
            this.f2043x.f2075a.clear();
            this.f2043x.f2076b.clear();
            this.f2043x.f2077c.mo3335c();
            return;
        }
        this.f2044y.f2075a.clear();
        this.f2044y.f2076b.clear();
        this.f2044y.f2077c.mo3335c();
    }

    /* renamed from: a */
    public final C0524s mo2118a(View view, boolean z) {
        C0508m mVar = this;
        while (mVar.f2030j != null) {
            mVar = mVar.f2030j;
        }
        return (C0524s) (z ? mVar.f2043x : mVar.f2044y).f2075a.get(view);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo2123a(ViewGroup viewGroup) {
        this.f2013A = new ArrayList<>();
        this.f2014B = new ArrayList<>();
        m2118a(this.f2043x, this.f2044y);
        ArrayMap g = mo2156g();
        int size = g.size();
        C0474an b = C0460ae.m2010b(viewGroup);
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = (Animator) g.mo3417b(i);
            if (animator != null) {
                C0512a aVar = (C0512a) g.get(animator);
                if (!(aVar == null || aVar.f2049a == null || !b.equals(aVar.f2052d))) {
                    C0524s sVar = aVar.f2051c;
                    View view = aVar.f2049a;
                    C0524s a = mo2118a(view, true);
                    C0524s b2 = mo2132b(view, true);
                    if (!(a == null && b2 == null) && aVar.f2053e.mo2072a(sVar, b2)) {
                        if (animator.isRunning() || animator.isStarted()) {
                            animator.cancel();
                        } else {
                            g.remove(animator);
                        }
                    }
                }
            }
        }
        mo2124a(viewGroup, this.f2043x, this.f2044y, this.f2013A, this.f2014B);
        mo2133b();
    }

    /* renamed from: a */
    public boolean mo2072a(C0524s sVar, C0524s sVar2) {
        if (!(sVar == null || sVar2 == null)) {
            String[] a = mo2073a();
            if (a != null) {
                for (String a2 : a) {
                    if (m2124a(sVar, sVar2, a2)) {
                        return true;
                    }
                }
            } else {
                for (String a3 : sVar.f2072a.keySet()) {
                    if (m2124a(sVar, sVar2, a3)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public C0508m mo2117a(C0514c cVar) {
        if (this.f2019H == null) {
            this.f2019H = new ArrayList<>();
        }
        this.f2019H.add(cVar);
        return this;
    }

    /* renamed from: a */
    public void mo2120a(C0492f fVar) {
        if (fVar == null) {
            this.f2035o = f2012p;
        } else {
            this.f2035o = fVar;
        }
    }

    /* renamed from: a */
    public void mo2121a(C0513b bVar) {
        this.f2034n = bVar;
    }

    /* renamed from: a */
    public void mo2122a(C0519p pVar) {
        this.f2033m = pVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public String mo2119a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        String sb2 = sb.toString();
        if (this.f2024d != -1) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(sb2);
            sb3.append("dur(");
            sb3.append(this.f2024d);
            sb3.append(") ");
            sb2 = sb3.toString();
        }
        if (this.f2023c != -1) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(sb2);
            sb4.append("dly(");
            sb4.append(this.f2023c);
            sb4.append(") ");
            sb2 = sb4.toString();
        }
        if (this.f2025e != null) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append(sb2);
            sb5.append("interp(");
            sb5.append(this.f2025e);
            sb5.append(") ");
            sb2 = sb5.toString();
        }
        if (this.f2026f.size() <= 0 && this.f2027g.size() <= 0) {
            return sb2;
        }
        StringBuilder sb6 = new StringBuilder();
        sb6.append(sb2);
        sb6.append("tgts(");
        String sb7 = sb6.toString();
        if (this.f2026f.size() > 0) {
            String str2 = sb7;
            for (int i = 0; i < this.f2026f.size(); i++) {
                if (i > 0) {
                    StringBuilder sb8 = new StringBuilder();
                    sb8.append(str2);
                    sb8.append(", ");
                    str2 = sb8.toString();
                }
                StringBuilder sb9 = new StringBuilder();
                sb9.append(str2);
                sb9.append(this.f2026f.get(i));
                str2 = sb9.toString();
            }
            sb7 = str2;
        }
        if (this.f2027g.size() > 0) {
            for (int i2 = 0; i2 < this.f2027g.size(); i2++) {
                if (i2 > 0) {
                    StringBuilder sb10 = new StringBuilder();
                    sb10.append(sb7);
                    sb10.append(", ");
                    sb7 = sb10.toString();
                }
                StringBuilder sb11 = new StringBuilder();
                sb11.append(sb7);
                sb11.append(this.f2027g.get(i2));
                sb7 = sb11.toString();
            }
        }
        StringBuilder sb12 = new StringBuilder();
        sb12.append(sb7);
        sb12.append(")");
        return sb12.toString();
    }

    public String toString() {
        return mo2119a("");
    }

    /* renamed from: e */
    public final Rect mo2140e() {
        if (this.f2034n == null) {
            return null;
        }
        return this.f2034n.mo2041a(this);
    }

    /* renamed from: g */
    private static ArrayMap<Animator, C0512a> mo2156g() {
        ArrayMap<Animator, C0512a> arrayMap = (ArrayMap) f2010C.get();
        if (arrayMap != null) {
            return arrayMap;
        }
        ArrayMap<Animator, C0512a> arrayMap2 = new ArrayMap<>();
        f2010C.set(arrayMap2);
        return arrayMap2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo2135c() {
        if (this.f2016E == 0) {
            if (this.f2019H != null && this.f2019H.size() > 0) {
                ArrayList arrayList = (ArrayList) this.f2019H.clone();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((C0514c) arrayList.get(i)).mo2045d(this);
                }
            }
            this.f2018G = false;
        }
        this.f2016E++;
    }

    /* renamed from: f */
    public C0508m clone() {
        try {
            C0508m mVar = (C0508m) super.clone();
            mVar.f2020I = new ArrayList<>();
            mVar.f2043x = new C0525t();
            mVar.f2044y = new C0525t();
            mVar.f2013A = null;
            mVar.f2014B = null;
            return mVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo2138d() {
        this.f2016E--;
        if (this.f2016E == 0) {
            if (this.f2019H != null && this.f2019H.size() > 0) {
                ArrayList arrayList = (ArrayList) this.f2019H.clone();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((C0514c) arrayList.get(i)).mo2042a(this);
                }
            }
            for (int i2 = 0; i2 < this.f2043x.f2077c.mo3330b(); i2++) {
                View view = (View) this.f2043x.f2077c.mo3334c(i2);
                if (view != null) {
                    C0991u.m4193a(view, false);
                }
            }
            for (int i3 = 0; i3 < this.f2044y.f2077c.mo3330b(); i3++) {
                View view2 = (View) this.f2044y.f2077c.mo3334c(i3);
                if (view2 != null) {
                    C0991u.m4193a(view2, false);
                }
            }
            this.f2018G = true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo2133b() {
        mo2135c();
        ArrayMap g = mo2156g();
        Iterator it = this.f2020I.iterator();
        while (it.hasNext()) {
            Animator animator = (Animator) it.next();
            if (g.containsKey(animator)) {
                mo2135c();
                m2117a(animator, g);
            }
        }
        this.f2020I.clear();
        mo2138d();
    }

    /* renamed from: b */
    public C0508m mo2129b(long j) {
        this.f2023c = j;
        return this;
    }

    /* renamed from: a */
    public C0508m mo2115a(long j) {
        this.f2024d = j;
        return this;
    }

    /* renamed from: b */
    public C0508m mo2131b(View view) {
        this.f2027g.add(view);
        return this;
    }

    /* renamed from: c */
    public C0508m mo2134c(View view) {
        this.f2027g.remove(view);
        return this;
    }

    /* renamed from: b */
    public C0508m mo2128b(int i) {
        if (i != 0) {
            this.f2026f.add(Integer.valueOf(i));
        }
        return this;
    }

    /* renamed from: b */
    public C0508m mo2130b(C0514c cVar) {
        if (this.f2019H == null) {
            return this;
        }
        this.f2019H.remove(cVar);
        if (this.f2019H.size() == 0) {
            this.f2019H = null;
        }
        return this;
    }

    /* renamed from: a */
    private void m2116a(Animator animator) {
        if (animator == null) {
            mo2138d();
            return;
        }
        if (this.f2024d >= 0) {
            animator.setDuration(this.f2024d);
        }
        if (this.f2023c >= 0) {
            animator.setStartDelay(this.f2023c);
        }
        if (this.f2025e != null) {
            animator.setInterpolator(this.f2025e);
        }
        animator.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                C0508m.this.mo2138d();
                animator.removeListener(this);
            }
        });
        animator.start();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo2136c(C0524s sVar) {
        if (this.f2033m != null && !sVar.f2072a.isEmpty()) {
            String[] a = this.f2033m.mo2082a();
            if (a != null) {
                boolean z = false;
                int i = 0;
                while (true) {
                    if (i >= a.length) {
                        z = true;
                        break;
                    } else if (!sVar.f2072a.containsKey(a[i])) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (!z) {
                    this.f2033m.mo2081a(sVar);
                }
            }
        }
    }

    /* renamed from: e */
    public void mo2141e(View view) {
        if (this.f2017F) {
            if (!this.f2018G) {
                ArrayMap g = mo2156g();
                int size = g.size();
                C0474an b = C0460ae.m2010b(view);
                for (int i = size - 1; i >= 0; i--) {
                    C0512a aVar = (C0512a) g.mo3418c(i);
                    if (aVar.f2049a != null && b.equals(aVar.f2052d)) {
                        C0453a.m1987b((Animator) g.mo3417b(i));
                    }
                }
                if (this.f2019H != null && this.f2019H.size() > 0) {
                    ArrayList arrayList = (ArrayList) this.f2019H.clone();
                    int size2 = arrayList.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((C0514c) arrayList.get(i2)).mo2044c(this);
                    }
                }
            }
            this.f2017F = false;
        }
    }

    /* renamed from: d */
    public void mo2139d(View view) {
        if (!this.f2018G) {
            ArrayMap g = mo2156g();
            int size = g.size();
            C0474an b = C0460ae.m2010b(view);
            for (int i = size - 1; i >= 0; i--) {
                C0512a aVar = (C0512a) g.mo3418c(i);
                if (aVar.f2049a != null && b.equals(aVar.f2052d)) {
                    C0453a.m1985a((Animator) g.mo3417b(i));
                }
            }
            if (this.f2019H != null && this.f2019H.size() > 0) {
                ArrayList arrayList = (ArrayList) this.f2019H.clone();
                int size2 = arrayList.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ((C0514c) arrayList.get(i2)).mo2043b(this);
                }
            }
            this.f2017F = true;
        }
    }

    /* renamed from: a */
    private void m2117a(Animator animator, final ArrayMap<Animator, C0512a> arrayMap) {
        if (animator != null) {
            animator.addListener(new AnimatorListenerAdapter() {
                public final void onAnimationStart(Animator animator) {
                    C0508m.this.f2032l.add(animator);
                }

                public final void onAnimationEnd(Animator animator) {
                    arrayMap.remove(animator);
                    C0508m.this.f2032l.remove(animator);
                }
            });
            m2116a(animator);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final C0524s mo2132b(View view, boolean z) {
        ArrayList<C0524s> arrayList;
        ArrayList<C0524s> arrayList2;
        C0508m mVar = this;
        while (mVar.f2030j != null) {
            mVar = mVar.f2030j;
        }
        if (z) {
            arrayList = mVar.f2013A;
        } else {
            arrayList = mVar.f2014B;
        }
        C0524s sVar = null;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = -1;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            C0524s sVar2 = (C0524s) arrayList.get(i2);
            if (sVar2 == null) {
                return null;
            }
            if (sVar2.f2073b == view) {
                i = i2;
                break;
            }
            i2++;
        }
        if (i >= 0) {
            if (z) {
                arrayList2 = mVar.f2014B;
            } else {
                arrayList2 = mVar.f2013A;
            }
            sVar = (C0524s) arrayList2.get(i);
        }
        return sVar;
    }

    /* renamed from: a */
    private void m2118a(C0525t tVar, C0525t tVar2) {
        ArrayMap arrayMap = new ArrayMap((C0904k) tVar.f2075a);
        ArrayMap arrayMap2 = new ArrayMap((C0904k) tVar2.f2075a);
        for (int i : this.f2045z) {
            switch (i) {
                case 1:
                    m2120a(arrayMap, arrayMap2);
                    break;
                case 2:
                    m2121a(arrayMap, arrayMap2, tVar.f2078d, tVar2.f2078d);
                    break;
                case 3:
                    m2123a(arrayMap, arrayMap2, tVar.f2076b, tVar2.f2076b);
                    break;
                case 4:
                    m2122a(arrayMap, arrayMap2, tVar.f2077c, tVar2.f2077c);
                    break;
            }
        }
        m2125b(arrayMap, arrayMap2);
    }

    /* renamed from: b */
    private void m2125b(ArrayMap<View, C0524s> arrayMap, ArrayMap<View, C0524s> arrayMap2) {
        for (int i = 0; i < arrayMap.size(); i++) {
            C0524s sVar = (C0524s) arrayMap.mo3418c(i);
            if (mo2127a(sVar.f2073b)) {
                this.f2013A.add(sVar);
                this.f2014B.add(null);
            }
        }
        for (int i2 = 0; i2 < arrayMap2.size(); i2++) {
            C0524s sVar2 = (C0524s) arrayMap2.mo3418c(i2);
            if (mo2127a(sVar2.f2073b)) {
                this.f2014B.add(sVar2);
                this.f2013A.add(null);
            }
        }
    }

    /* renamed from: c */
    private void m2126c(View view, boolean z) {
        if (view != null) {
            int id = view.getId();
            if (this.f2036q != null && this.f2036q.contains(Integer.valueOf(id))) {
                return;
            }
            if (this.f2037r == null || !this.f2037r.contains(view)) {
                if (this.f2038s != null) {
                    int size = this.f2038s.size();
                    int i = 0;
                    while (i < size) {
                        if (!((Class) this.f2038s.get(i)).isInstance(view)) {
                            i++;
                        } else {
                            return;
                        }
                    }
                }
                if (view.getParent() instanceof ViewGroup) {
                    C0524s sVar = new C0524s();
                    sVar.f2073b = view;
                    if (z) {
                        mo1185a(sVar);
                    } else {
                        mo1186b(sVar);
                    }
                    sVar.f2074c.add(this);
                    mo2136c(sVar);
                    if (z) {
                        m2119a(this.f2043x, view, sVar);
                    } else {
                        m2119a(this.f2044y, view, sVar);
                    }
                }
                if ((view instanceof ViewGroup) && (this.f2040u == null || !this.f2040u.contains(Integer.valueOf(id)))) {
                    if (this.f2041v == null || !this.f2041v.contains(view)) {
                        if (this.f2042w != null) {
                            int size2 = this.f2042w.size();
                            int i2 = 0;
                            while (i2 < size2) {
                                if (!((Class) this.f2042w.get(i2)).isInstance(view)) {
                                    i2++;
                                } else {
                                    return;
                                }
                            }
                        }
                        ViewGroup viewGroup = (ViewGroup) view;
                        for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                            m2126c(viewGroup.getChildAt(i3), z);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private void m2120a(ArrayMap<View, C0524s> arrayMap, ArrayMap<View, C0524s> arrayMap2) {
        for (int size = arrayMap.size() - 1; size >= 0; size--) {
            View view = (View) arrayMap.mo3417b(size);
            if (view != null && mo2127a(view)) {
                C0524s sVar = (C0524s) arrayMap2.remove(view);
                if (!(sVar == null || sVar.f2073b == null || !mo2127a(sVar.f2073b))) {
                    this.f2013A.add((C0524s) arrayMap.mo3422d(size));
                    this.f2014B.add(sVar);
                }
            }
        }
    }

    /* renamed from: a */
    private static boolean m2124a(C0524s sVar, C0524s sVar2, String str) {
        Object obj = sVar.f2072a.get(str);
        Object obj2 = sVar2.f2072a.get(str);
        if ((obj != null || obj2 != null) && (obj == null || obj2 == null || !obj.equals(obj2))) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static void m2119a(C0525t tVar, View view, C0524s sVar) {
        tVar.f2075a.put(view, sVar);
        int id = view.getId();
        if (id >= 0) {
            if (tVar.f2076b.indexOfKey(id) >= 0) {
                tVar.f2076b.put(id, null);
            } else {
                tVar.f2076b.put(id, view);
            }
        }
        String t = C0991u.m4241t(view);
        if (t != null) {
            if (tVar.f2078d.containsKey(t)) {
                tVar.f2078d.put(t, null);
            } else {
                tVar.f2078d.put(t, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (tVar.f2077c.mo3339d(itemIdAtPosition) >= 0) {
                    View view2 = (View) tVar.f2077c.mo3327a(itemIdAtPosition);
                    if (view2 != null) {
                        C0991u.m4193a(view2, false);
                        tVar.f2077c.mo3333b(itemIdAtPosition, null);
                    }
                    return;
                }
                C0991u.m4193a(view, true);
                tVar.f2077c.mo3333b(itemIdAtPosition, view);
            }
        }
    }

    /* renamed from: a */
    private void m2121a(ArrayMap<View, C0524s> arrayMap, ArrayMap<View, C0524s> arrayMap2, ArrayMap<String, View> arrayMap3, ArrayMap<String, View> arrayMap4) {
        int size = arrayMap3.size();
        for (int i = 0; i < size; i++) {
            View view = (View) arrayMap3.mo3418c(i);
            if (view != null && mo2127a(view)) {
                View view2 = (View) arrayMap4.get(arrayMap3.mo3417b(i));
                if (view2 != null && mo2127a(view2)) {
                    C0524s sVar = (C0524s) arrayMap.get(view);
                    C0524s sVar2 = (C0524s) arrayMap2.get(view2);
                    if (!(sVar == null || sVar2 == null)) {
                        this.f2013A.add(sVar);
                        this.f2014B.add(sVar2);
                        arrayMap.remove(view);
                        arrayMap2.remove(view2);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private void m2122a(ArrayMap<View, C0524s> arrayMap, ArrayMap<View, C0524s> arrayMap2, C0893e<View> eVar, C0893e<View> eVar2) {
        int b = eVar.mo3330b();
        for (int i = 0; i < b; i++) {
            View view = (View) eVar.mo3334c(i);
            if (view != null && mo2127a(view)) {
                View view2 = (View) eVar2.mo3327a(eVar.mo3331b(i));
                if (view2 != null && mo2127a(view2)) {
                    C0524s sVar = (C0524s) arrayMap.get(view);
                    C0524s sVar2 = (C0524s) arrayMap2.get(view2);
                    if (!(sVar == null || sVar2 == null)) {
                        this.f2013A.add(sVar);
                        this.f2014B.add(sVar2);
                        arrayMap.remove(view);
                        arrayMap2.remove(view2);
                    }
                }
            }
        }
    }
}
