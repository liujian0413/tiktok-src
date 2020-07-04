package android.support.p022v4.app;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.support.p022v4.util.ArrayMap;
import android.support.p022v4.view.C0991u;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: android.support.v4.app.r */
final class C0634r {

    /* renamed from: a */
    private static final int[] f2464a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8};

    /* renamed from: b */
    private static final C0646u f2465b;

    /* renamed from: c */
    private static final C0646u f2466c = m2738a();

    /* renamed from: android.support.v4.app.r$a */
    static class C0639a {

        /* renamed from: a */
        public Fragment f2495a;

        /* renamed from: b */
        public boolean f2496b;

        /* renamed from: c */
        public C0601e f2497c;

        /* renamed from: d */
        public Fragment f2498d;

        /* renamed from: e */
        public boolean f2499e;

        /* renamed from: f */
        public C0601e f2500f;

        C0639a() {
        }
    }

    /* renamed from: a */
    static void m2753a(C0612l lVar, ArrayList<C0601e> arrayList, ArrayList<Boolean> arrayList2, int i, int i2, boolean z) {
        if (lVar.f2413l > 0) {
            SparseArray sparseArray = new SparseArray();
            for (int i3 = i; i3 < i2; i3++) {
                C0601e eVar = (C0601e) arrayList.get(i3);
                if (((Boolean) arrayList2.get(i3)).booleanValue()) {
                    m2764b(eVar, sparseArray, z);
                } else {
                    m2751a(eVar, sparseArray, z);
                }
            }
            if (sparseArray.size() != 0) {
                View view = new View(lVar.f2414m.f2159c);
                int size = sparseArray.size();
                for (int i4 = 0; i4 < size; i4++) {
                    int keyAt = sparseArray.keyAt(i4);
                    ArrayMap a = m2740a(keyAt, arrayList, arrayList2, i, i2);
                    C0639a aVar = (C0639a) sparseArray.valueAt(i4);
                    if (z) {
                        m2752a(lVar, keyAt, aVar, view, a);
                    } else {
                        m2765b(lVar, keyAt, aVar, view, a);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static void m2752a(C0612l lVar, int i, C0639a aVar, View view, ArrayMap<String, String> arrayMap) {
        Object obj;
        C0612l lVar2 = lVar;
        C0639a aVar2 = aVar;
        View view2 = view;
        ViewGroup viewGroup = lVar2.f2415n.mo2352a() ? (ViewGroup) lVar2.f2415n.mo2351a(i) : null;
        if (viewGroup != null) {
            Fragment fragment = aVar2.f2495a;
            Fragment fragment2 = aVar2.f2498d;
            C0646u a = m2739a(fragment2, fragment);
            if (a != null) {
                boolean z = aVar2.f2496b;
                boolean z2 = aVar2.f2499e;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                Object a2 = m2744a(a, fragment, z);
                Object b = m2762b(a, fragment2, z2);
                Object obj2 = a2;
                ViewGroup viewGroup2 = viewGroup;
                ArrayList arrayList3 = arrayList2;
                Object a3 = m2745a(a, viewGroup, view, arrayMap, aVar, arrayList2, arrayList, a2, b);
                Object obj3 = obj2;
                if (obj3 == null && a3 == null) {
                    obj = b;
                    if (obj == null) {
                        return;
                    }
                } else {
                    obj = b;
                }
                ArrayList a4 = m2748a(a, obj, fragment2, arrayList3, view2);
                ArrayList a5 = m2748a(a, obj3, fragment, arrayList, view2);
                m2758a(a5, 4);
                Fragment fragment3 = fragment;
                ArrayList arrayList4 = a4;
                Object a6 = m2746a(a, obj3, obj, a3, fragment3, z);
                if (a6 != null) {
                    m2755a(a, obj, fragment2, arrayList4);
                    ArrayList a7 = C0646u.m2785a(arrayList);
                    a.mo2030a(a6, obj3, a5, obj, arrayList4, a3, arrayList);
                    ViewGroup viewGroup3 = viewGroup2;
                    a.mo2026a(viewGroup3, a6);
                    a.mo2750a(viewGroup3, arrayList3, arrayList, a7, arrayMap);
                    m2758a(a5, 0);
                    a.mo2032a(a3, arrayList3, arrayList);
                }
            }
        }
    }

    /* renamed from: a */
    private static void m2755a(C0646u uVar, Object obj, Fragment fragment, final ArrayList<View> arrayList) {
        if (fragment != null && obj != null && fragment.mAdded && fragment.mHidden && fragment.mHiddenChanged) {
            fragment.setHideReplaced(true);
            uVar.mo2037b(obj, fragment.getView(), arrayList);
            C0587ab.m2461a(fragment.mContainer, new Runnable() {
                public final void run() {
                    C0634r.m2758a(arrayList, 4);
                }
            });
        }
    }

    /* renamed from: a */
    private static void m2754a(C0646u uVar, ViewGroup viewGroup, Fragment fragment, View view, ArrayList<View> arrayList, Object obj, ArrayList<View> arrayList2, Object obj2, ArrayList<View> arrayList3) {
        final Object obj3 = obj;
        final C0646u uVar2 = uVar;
        final View view2 = view;
        final Fragment fragment2 = fragment;
        final ArrayList<View> arrayList4 = arrayList;
        final ArrayList<View> arrayList5 = arrayList2;
        final ArrayList<View> arrayList6 = arrayList3;
        final Object obj4 = obj2;
        C06362 r0 = new Runnable() {
            public final void run() {
                if (obj3 != null) {
                    uVar2.mo2040c(obj3, view2);
                    arrayList5.addAll(C0634r.m2748a(uVar2, obj3, fragment2, arrayList4, view2));
                }
                if (arrayList6 != null) {
                    if (obj4 != null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(view2);
                        uVar2.mo2038b(obj4, arrayList6, arrayList);
                    }
                    arrayList6.clear();
                    arrayList6.add(view2);
                }
            }
        };
        ViewGroup viewGroup2 = viewGroup;
        C0587ab.m2461a(viewGroup, r0);
    }

    /* renamed from: a */
    private static boolean m2760a(C0646u uVar, List<Object> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!uVar.mo2033a(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private static Object m2745a(C0646u uVar, ViewGroup viewGroup, View view, ArrayMap<String, String> arrayMap, C0639a aVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object obj3;
        Object obj4;
        final Rect rect;
        final View view2;
        C0646u uVar2 = uVar;
        View view3 = view;
        ArrayMap<String, String> arrayMap2 = arrayMap;
        C0639a aVar2 = aVar;
        ArrayList<View> arrayList3 = arrayList;
        ArrayList<View> arrayList4 = arrayList2;
        Object obj5 = obj;
        Fragment fragment = aVar2.f2495a;
        Fragment fragment2 = aVar2.f2498d;
        if (fragment != null) {
            fragment.getView().setVisibility(0);
        }
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z = aVar2.f2496b;
        if (arrayMap.isEmpty()) {
            obj3 = null;
        } else {
            obj3 = m2743a(uVar2, fragment, fragment2, z);
        }
        ArrayMap b = m2761b(uVar2, arrayMap2, obj3, aVar2);
        ArrayMap a = m2741a(uVar2, arrayMap2, obj3, aVar2);
        if (arrayMap.isEmpty()) {
            if (b != null) {
                b.clear();
            }
            if (a != null) {
                a.clear();
            }
            obj4 = null;
        } else {
            m2759a(arrayList3, b, (Collection<String>) arrayMap.keySet());
            m2759a(arrayList4, a, arrayMap.values());
            obj4 = obj3;
        }
        if (obj5 == null && obj2 == null && obj4 == null) {
            return null;
        }
        m2749a(fragment, fragment2, z, b, true);
        if (obj4 != null) {
            arrayList4.add(view3);
            uVar2.mo2029a(obj4, view3, arrayList3);
            m2756a(uVar, obj4, obj2, b, aVar2.f2499e, aVar2.f2500f);
            Rect rect2 = new Rect();
            View a2 = m2742a(a, aVar2, obj5, z);
            if (a2 != null) {
                uVar2.mo2027a(obj5, rect2);
            }
            rect = rect2;
            view2 = a2;
        } else {
            view2 = null;
            rect = null;
        }
        final Fragment fragment3 = fragment;
        final Fragment fragment4 = fragment2;
        final boolean z2 = z;
        final ArrayMap arrayMap3 = a;
        final C0646u uVar3 = uVar;
        C06373 r0 = new Runnable() {
            public final void run() {
                C0634r.m2749a(fragment3, fragment4, z2, arrayMap3, false);
                if (view2 != null) {
                    C0646u.m2786a(view2, rect);
                }
            }
        };
        C0587ab.m2461a(viewGroup, r0);
        return obj4;
    }

    /* renamed from: a */
    private static void m2759a(ArrayList<View> arrayList, ArrayMap<String, View> arrayMap, Collection<String> collection) {
        for (int size = arrayMap.size() - 1; size >= 0; size--) {
            View view = (View) arrayMap.mo3418c(size);
            if (collection.contains(C0991u.m4241t(view))) {
                arrayList.add(view);
            }
        }
    }

    /* renamed from: a */
    private static String m2747a(ArrayMap<String, String> arrayMap, String str) {
        int size = arrayMap.size();
        for (int i = 0; i < size; i++) {
            if (str.equals(arrayMap.mo3418c(i))) {
                return (String) arrayMap.mo3417b(i);
            }
        }
        return null;
    }

    /* renamed from: a */
    private static void m2756a(C0646u uVar, Object obj, Object obj2, ArrayMap<String, View> arrayMap, boolean z, C0601e eVar) {
        String str;
        if (eVar.f2376r != null && !eVar.f2376r.isEmpty()) {
            if (z) {
                str = (String) eVar.f2377s.get(0);
            } else {
                str = (String) eVar.f2376r.get(0);
            }
            View view = (View) arrayMap.get(str);
            uVar.mo2028a(obj, view);
            if (obj2 != null) {
                uVar.mo2028a(obj2, view);
            }
        }
    }

    /* renamed from: a */
    private static void m2757a(ArrayMap<String, String> arrayMap, ArrayMap<String, View> arrayMap2) {
        for (int size = arrayMap.size() - 1; size >= 0; size--) {
            if (!arrayMap2.containsKey((String) arrayMap.mo3418c(size))) {
                arrayMap.mo3422d(size);
            }
        }
    }

    /* renamed from: a */
    static void m2749a(Fragment fragment, Fragment fragment2, boolean z, ArrayMap<String, View> arrayMap, boolean z2) {
        C0591ae aeVar;
        int i;
        if (z) {
            aeVar = fragment2.getEnterTransitionCallback();
        } else {
            aeVar = fragment.getEnterTransitionCallback();
        }
        if (aeVar != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (arrayMap == null) {
                i = 0;
            } else {
                i = arrayMap.size();
            }
            for (int i2 = 0; i2 < i; i2++) {
                arrayList2.add(arrayMap.mo3417b(i2));
                arrayList.add(arrayMap.mo3418c(i2));
            }
        }
    }

    /* renamed from: a */
    static ArrayList<View> m2748a(C0646u uVar, Object obj, Fragment fragment, ArrayList<View> arrayList, View view) {
        if (obj == null) {
            return null;
        }
        ArrayList<View> arrayList2 = new ArrayList<>();
        View view2 = fragment.getView();
        if (view2 != null) {
            uVar.mo2753a(arrayList2, view2);
        }
        if (arrayList != null) {
            arrayList2.removeAll(arrayList);
        }
        if (arrayList2.isEmpty()) {
            return arrayList2;
        }
        arrayList2.add(view);
        uVar.mo2031a(obj, arrayList2);
        return arrayList2;
    }

    /* renamed from: a */
    static void m2758a(ArrayList<View> arrayList, int i) {
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((View) arrayList.get(size)).setVisibility(i);
            }
        }
    }

    /* renamed from: a */
    private static Object m2746a(C0646u uVar, Object obj, Object obj2, Object obj3, Fragment fragment, boolean z) {
        boolean z2 = (obj == null || obj2 == null || fragment == null) ? true : z ? fragment.getAllowReturnTransitionOverlap() : fragment.getAllowEnterTransitionOverlap();
        if (z2) {
            return uVar.mo2025a(obj2, obj, obj3);
        }
        return uVar.mo2035b(obj2, obj, obj3);
    }

    /* renamed from: a */
    private static void m2751a(C0601e eVar, SparseArray<C0639a> sparseArray, boolean z) {
        int size = eVar.f2360b.size();
        for (int i = 0; i < size; i++) {
            m2750a(eVar, (C0602a) eVar.f2360b.get(i), sparseArray, false, z);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002d, code lost:
        if (r6.mAdded != false) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0064, code lost:
        r12 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0066, code lost:
        r12 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0071, code lost:
        r8 = r12;
        r12 = true;
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0080, code lost:
        if (r6.mHidden == false) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0082, code lost:
        r12 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0090  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m2750a(android.support.p022v4.app.C0601e r11, android.support.p022v4.app.C0601e.C0602a r12, android.util.SparseArray<android.support.p022v4.app.C0634r.C0639a> r13, boolean r14, boolean r15) {
        /*
            android.support.v4.app.Fragment r6 = r12.f2381b
            if (r6 != 0) goto L_0x0005
            return
        L_0x0005:
            int r7 = r6.mContainerId
            if (r7 != 0) goto L_0x000a
            return
        L_0x000a:
            if (r14 == 0) goto L_0x0013
            int[] r0 = f2464a
            int r12 = r12.f2380a
            r12 = r0[r12]
            goto L_0x0015
        L_0x0013:
            int r12 = r12.f2380a
        L_0x0015:
            r0 = 0
            r1 = 1
            if (r12 == r1) goto L_0x0075
            switch(r12) {
                case 3: goto L_0x004b;
                case 4: goto L_0x0033;
                case 5: goto L_0x0021;
                case 6: goto L_0x004b;
                case 7: goto L_0x0075;
                default: goto L_0x001c;
            }
        L_0x001c:
            r12 = 0
            r1 = 0
        L_0x001e:
            r8 = 0
            goto L_0x0088
        L_0x0021:
            if (r15 == 0) goto L_0x0030
            boolean r12 = r6.mHiddenChanged
            if (r12 == 0) goto L_0x0084
            boolean r12 = r6.mHidden
            if (r12 != 0) goto L_0x0084
            boolean r12 = r6.mAdded
            if (r12 == 0) goto L_0x0084
            goto L_0x0082
        L_0x0030:
            boolean r12 = r6.mHidden
            goto L_0x0085
        L_0x0033:
            if (r15 == 0) goto L_0x0042
            boolean r12 = r6.mHiddenChanged
            if (r12 == 0) goto L_0x0066
            boolean r12 = r6.mAdded
            if (r12 == 0) goto L_0x0066
            boolean r12 = r6.mHidden
            if (r12 == 0) goto L_0x0066
        L_0x0041:
            goto L_0x0064
        L_0x0042:
            boolean r12 = r6.mAdded
            if (r12 == 0) goto L_0x0066
            boolean r12 = r6.mHidden
            if (r12 != 0) goto L_0x0066
            goto L_0x0041
        L_0x004b:
            if (r15 == 0) goto L_0x0068
            boolean r12 = r6.mAdded
            if (r12 != 0) goto L_0x0066
            android.view.View r12 = r6.mView
            if (r12 == 0) goto L_0x0066
            android.view.View r12 = r6.mView
            int r12 = r12.getVisibility()
            if (r12 != 0) goto L_0x0066
            float r12 = r6.mPostponedAlpha
            r2 = 0
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 < 0) goto L_0x0066
        L_0x0064:
            r12 = 1
            goto L_0x0071
        L_0x0066:
            r12 = 0
            goto L_0x0071
        L_0x0068:
            boolean r12 = r6.mAdded
            if (r12 == 0) goto L_0x0066
            boolean r12 = r6.mHidden
            if (r12 != 0) goto L_0x0066
            goto L_0x0064
        L_0x0071:
            r8 = r12
            r12 = 1
            r1 = 0
            goto L_0x0088
        L_0x0075:
            if (r15 == 0) goto L_0x007a
            boolean r12 = r6.mIsNewlyAdded
            goto L_0x0085
        L_0x007a:
            boolean r12 = r6.mAdded
            if (r12 != 0) goto L_0x0084
            boolean r12 = r6.mHidden
            if (r12 != 0) goto L_0x0084
        L_0x0082:
            r12 = 1
            goto L_0x0085
        L_0x0084:
            r12 = 0
        L_0x0085:
            r0 = r12
            r12 = 0
            goto L_0x001e
        L_0x0088:
            java.lang.Object r2 = r13.get(r7)
            android.support.v4.app.r$a r2 = (android.support.p022v4.app.C0634r.C0639a) r2
            if (r0 == 0) goto L_0x009a
            android.support.v4.app.r$a r2 = m2737a(r2, r13, r7)
            r2.f2495a = r6
            r2.f2496b = r14
            r2.f2497c = r11
        L_0x009a:
            r9 = r2
            r10 = 0
            if (r15 != 0) goto L_0x00c1
            if (r1 == 0) goto L_0x00c1
            if (r9 == 0) goto L_0x00a8
            android.support.v4.app.Fragment r0 = r9.f2498d
            if (r0 != r6) goto L_0x00a8
            r9.f2498d = r10
        L_0x00a8:
            android.support.v4.app.l r0 = r11.f2359a
            int r1 = r6.mState
            if (r1 > 0) goto L_0x00c1
            int r1 = r0.f2413l
            if (r1 <= 0) goto L_0x00c1
            boolean r1 = r11.f2378t
            if (r1 != 0) goto L_0x00c1
            r0.mo2695d(r6)
            r2 = 1
            r3 = 0
            r4 = 0
            r5 = 0
            r1 = r6
            android.support.p022v4.app.C0640s.m2766a(r0, r1, r2, r3, r4, r5)
        L_0x00c1:
            if (r8 == 0) goto L_0x00d3
            if (r9 == 0) goto L_0x00c9
            android.support.v4.app.Fragment r0 = r9.f2498d
            if (r0 != 0) goto L_0x00d3
        L_0x00c9:
            android.support.v4.app.r$a r9 = m2737a(r9, r13, r7)
            r9.f2498d = r6
            r9.f2499e = r14
            r9.f2500f = r11
        L_0x00d3:
            if (r15 != 0) goto L_0x00df
            if (r12 == 0) goto L_0x00df
            if (r9 == 0) goto L_0x00df
            android.support.v4.app.Fragment r11 = r9.f2495a
            if (r11 != r6) goto L_0x00df
            r9.f2495a = r10
        L_0x00df:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p022v4.app.C0634r.m2750a(android.support.v4.app.e, android.support.v4.app.e$a, android.util.SparseArray, boolean, boolean):void");
    }

    /* renamed from: a */
    private static C0646u m2738a() {
        try {
            return (C0646u) Class.forName("android.support.transition.FragmentTransitionSupport").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    static {
        C0641t tVar;
        if (VERSION.SDK_INT >= 21) {
            tVar = new C0641t();
        } else {
            tVar = null;
        }
        f2465b = tVar;
    }

    /* renamed from: a */
    private static C0646u m2739a(Fragment fragment, Fragment fragment2) {
        ArrayList arrayList = new ArrayList();
        if (fragment != null) {
            Object exitTransition = fragment.getExitTransition();
            if (exitTransition != null) {
                arrayList.add(exitTransition);
            }
            Object returnTransition = fragment.getReturnTransition();
            if (returnTransition != null) {
                arrayList.add(returnTransition);
            }
            Object sharedElementReturnTransition = fragment.getSharedElementReturnTransition();
            if (sharedElementReturnTransition != null) {
                arrayList.add(sharedElementReturnTransition);
            }
        }
        if (fragment2 != null) {
            Object enterTransition = fragment2.getEnterTransition();
            if (enterTransition != null) {
                arrayList.add(enterTransition);
            }
            Object reenterTransition = fragment2.getReenterTransition();
            if (reenterTransition != null) {
                arrayList.add(reenterTransition);
            }
            Object sharedElementEnterTransition = fragment2.getSharedElementEnterTransition();
            if (sharedElementEnterTransition != null) {
                arrayList.add(sharedElementEnterTransition);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        if (f2465b != null && m2760a(f2465b, (List<Object>) arrayList)) {
            return f2465b;
        }
        if (f2466c != null && m2760a(f2466c, (List<Object>) arrayList)) {
            return f2466c;
        }
        if (f2465b == null && f2466c == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    /* renamed from: a */
    private static C0639a m2737a(C0639a aVar, SparseArray<C0639a> sparseArray, int i) {
        if (aVar != null) {
            return aVar;
        }
        C0639a aVar2 = new C0639a();
        sparseArray.put(i, aVar2);
        return aVar2;
    }

    /* renamed from: b */
    private static Object m2762b(C0646u uVar, Fragment fragment, boolean z) {
        Object obj;
        if (fragment == null) {
            return null;
        }
        if (z) {
            obj = fragment.getReturnTransition();
        } else {
            obj = fragment.getExitTransition();
        }
        return uVar.mo2034b(obj);
    }

    /* renamed from: b */
    private static void m2764b(C0601e eVar, SparseArray<C0639a> sparseArray, boolean z) {
        if (eVar.f2359a.f2415n.mo2352a()) {
            for (int size = eVar.f2360b.size() - 1; size >= 0; size--) {
                m2750a(eVar, (C0602a) eVar.f2360b.get(size), sparseArray, true, z);
            }
        }
    }

    /* renamed from: a */
    private static Object m2744a(C0646u uVar, Fragment fragment, boolean z) {
        Object obj;
        if (fragment == null) {
            return null;
        }
        if (z) {
            obj = fragment.getReenterTransition();
        } else {
            obj = fragment.getEnterTransition();
        }
        return uVar.mo2034b(obj);
    }

    /* renamed from: a */
    static View m2742a(ArrayMap<String, View> arrayMap, C0639a aVar, Object obj, boolean z) {
        String str;
        C0601e eVar = aVar.f2497c;
        if (obj == null || arrayMap == null || eVar.f2376r == null || eVar.f2376r.isEmpty()) {
            return null;
        }
        if (z) {
            str = (String) eVar.f2376r.get(0);
        } else {
            str = (String) eVar.f2377s.get(0);
        }
        return (View) arrayMap.get(str);
    }

    /* renamed from: b */
    private static ArrayMap<String, View> m2761b(C0646u uVar, ArrayMap<String, String> arrayMap, Object obj, C0639a aVar) {
        C0591ae aeVar;
        ArrayList<String> arrayList;
        if (arrayMap.isEmpty() || obj == null) {
            arrayMap.clear();
            return null;
        }
        Fragment fragment = aVar.f2498d;
        ArrayMap<String, View> arrayMap2 = new ArrayMap<>();
        uVar.mo2754a((Map<String, View>) arrayMap2, fragment.getView());
        C0601e eVar = aVar.f2500f;
        if (aVar.f2499e) {
            aeVar = fragment.getEnterTransitionCallback();
            arrayList = eVar.f2377s;
        } else {
            aeVar = fragment.getExitTransitionCallback();
            arrayList = eVar.f2376r;
        }
        arrayMap2.mo3288a(arrayList);
        if (aeVar != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = (String) arrayList.get(size);
                View view = (View) arrayMap2.get(str);
                if (view == null) {
                    arrayMap.remove(str);
                } else if (!str.equals(C0991u.m4241t(view))) {
                    arrayMap.put(C0991u.m4241t(view), (String) arrayMap.remove(str));
                }
            }
        } else {
            arrayMap.mo3288a(arrayMap2.keySet());
        }
        return arrayMap2;
    }

    /* renamed from: a */
    static ArrayMap<String, View> m2741a(C0646u uVar, ArrayMap<String, String> arrayMap, Object obj, C0639a aVar) {
        C0591ae aeVar;
        ArrayList<String> arrayList;
        Fragment fragment = aVar.f2495a;
        View view = fragment.getView();
        if (arrayMap.isEmpty() || obj == null || view == null) {
            arrayMap.clear();
            return null;
        }
        ArrayMap<String, View> arrayMap2 = new ArrayMap<>();
        uVar.mo2754a((Map<String, View>) arrayMap2, view);
        C0601e eVar = aVar.f2497c;
        if (aVar.f2496b) {
            aeVar = fragment.getExitTransitionCallback();
            arrayList = eVar.f2376r;
        } else {
            aeVar = fragment.getEnterTransitionCallback();
            arrayList = eVar.f2377s;
        }
        if (arrayList != null) {
            arrayMap2.mo3288a(arrayList);
            arrayMap2.mo3288a(arrayMap.values());
        }
        if (aeVar != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = (String) arrayList.get(size);
                View view2 = (View) arrayMap2.get(str);
                if (view2 == null) {
                    String a = m2747a(arrayMap, str);
                    if (a != null) {
                        arrayMap.remove(a);
                    }
                } else if (!str.equals(C0991u.m4241t(view2))) {
                    String a2 = m2747a(arrayMap, str);
                    if (a2 != null) {
                        arrayMap.put(a2, C0991u.m4241t(view2));
                    }
                }
            }
        } else {
            m2757a(arrayMap, arrayMap2);
        }
        return arrayMap2;
    }

    /* renamed from: a */
    private static Object m2743a(C0646u uVar, Fragment fragment, Fragment fragment2, boolean z) {
        Object obj;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        if (z) {
            obj = fragment2.getSharedElementReturnTransition();
        } else {
            obj = fragment.getSharedElementEnterTransition();
        }
        return uVar.mo2039c(uVar.mo2034b(obj));
    }

    /* renamed from: a */
    private static ArrayMap<String, String> m2740a(int i, ArrayList<C0601e> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        ArrayList<String> arrayList3;
        ArrayList arrayList4;
        ArrayMap<String, String> arrayMap = new ArrayMap<>();
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            C0601e eVar = (C0601e) arrayList.get(i4);
            if (eVar.mo2603b(i)) {
                boolean booleanValue = ((Boolean) arrayList2.get(i4)).booleanValue();
                if (eVar.f2376r != null) {
                    int size = eVar.f2376r.size();
                    if (booleanValue) {
                        arrayList3 = eVar.f2376r;
                        arrayList4 = eVar.f2377s;
                    } else {
                        ArrayList arrayList5 = eVar.f2376r;
                        arrayList3 = eVar.f2377s;
                        arrayList4 = arrayList5;
                    }
                    for (int i5 = 0; i5 < size; i5++) {
                        String str = (String) arrayList4.get(i5);
                        String str2 = (String) arrayList3.get(i5);
                        String str3 = (String) arrayMap.remove(str2);
                        if (str3 != null) {
                            arrayMap.put(str, str3);
                        } else {
                            arrayMap.put(str, str2);
                        }
                    }
                }
            }
        }
        return arrayMap;
    }

    /* renamed from: b */
    private static void m2765b(C0612l lVar, int i, C0639a aVar, View view, ArrayMap<String, String> arrayMap) {
        ViewGroup viewGroup;
        Object obj;
        Object obj2;
        C0612l lVar2 = lVar;
        C0639a aVar2 = aVar;
        View view2 = view;
        ArrayMap<String, String> arrayMap2 = arrayMap;
        if (lVar2.f2415n.mo2352a()) {
            viewGroup = (ViewGroup) lVar2.f2415n.mo2351a(i);
        } else {
            viewGroup = null;
        }
        if (viewGroup != null) {
            Fragment fragment = aVar2.f2495a;
            Fragment fragment2 = aVar2.f2498d;
            C0646u a = m2739a(fragment2, fragment);
            if (a != null) {
                boolean z = aVar2.f2496b;
                boolean z2 = aVar2.f2499e;
                Object a2 = m2744a(a, fragment, z);
                Object b = m2762b(a, fragment2, z2);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = arrayList;
                Object obj3 = b;
                Object obj4 = a2;
                C0646u uVar = a;
                Object b2 = m2763b(a, viewGroup, view, arrayMap, aVar, arrayList, arrayList2, a2, obj3);
                Object obj5 = obj4;
                if (obj5 == null && b2 == null) {
                    obj = obj3;
                    if (obj == null) {
                        return;
                    }
                } else {
                    obj = obj3;
                }
                ArrayList a3 = m2748a(uVar, obj, fragment2, arrayList3, view2);
                if (a3 == null || a3.isEmpty()) {
                    obj2 = null;
                } else {
                    obj2 = obj;
                }
                uVar.mo2036b(obj5, view2);
                Object a4 = m2746a(uVar, obj5, obj2, b2, fragment, aVar2.f2496b);
                if (a4 != null) {
                    ArrayList arrayList4 = new ArrayList();
                    C0646u uVar2 = uVar;
                    uVar2.mo2030a(a4, obj5, arrayList4, obj2, a3, b2, arrayList2);
                    m2754a(uVar2, viewGroup, fragment, view, arrayList2, obj5, arrayList4, obj2, a3);
                    ArrayList arrayList5 = arrayList2;
                    uVar.mo2751a((View) viewGroup, arrayList5, (Map<String, String>) arrayMap2);
                    uVar.mo2026a(viewGroup, a4);
                    uVar.mo2752a(viewGroup, arrayList5, (Map<String, String>) arrayMap2);
                }
            }
        }
    }

    /* renamed from: b */
    private static Object m2763b(C0646u uVar, ViewGroup viewGroup, View view, ArrayMap<String, String> arrayMap, C0639a aVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        ArrayMap<String, String> arrayMap2;
        Object obj3;
        Object obj4;
        Rect rect;
        C0646u uVar2 = uVar;
        C0639a aVar2 = aVar;
        ArrayList<View> arrayList3 = arrayList;
        Object obj5 = obj;
        Fragment fragment = aVar2.f2495a;
        Fragment fragment2 = aVar2.f2498d;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z = aVar2.f2496b;
        if (arrayMap.isEmpty()) {
            arrayMap2 = arrayMap;
            obj3 = null;
        } else {
            obj3 = m2743a(uVar2, fragment, fragment2, z);
            arrayMap2 = arrayMap;
        }
        ArrayMap b = m2761b(uVar2, arrayMap2, obj3, aVar2);
        if (arrayMap.isEmpty()) {
            obj4 = null;
        } else {
            arrayList3.addAll(b.values());
            obj4 = obj3;
        }
        if (obj5 == null && obj2 == null && obj4 == null) {
            return null;
        }
        m2749a(fragment, fragment2, z, b, true);
        if (obj4 != null) {
            rect = new Rect();
            uVar2.mo2029a(obj4, view, arrayList3);
            m2756a(uVar, obj4, obj2, b, aVar2.f2499e, aVar2.f2500f);
            if (obj5 != null) {
                uVar2.mo2027a(obj5, rect);
            }
        } else {
            rect = null;
        }
        final C0646u uVar3 = uVar;
        final ArrayMap<String, String> arrayMap3 = arrayMap;
        final Object obj6 = obj4;
        final C0639a aVar3 = aVar;
        C06384 r13 = r0;
        final ArrayList<View> arrayList4 = arrayList2;
        final View view2 = view;
        final Fragment fragment3 = fragment;
        final Fragment fragment4 = fragment2;
        final boolean z2 = z;
        final ArrayList<View> arrayList5 = arrayList;
        final Object obj7 = obj;
        final Rect rect2 = rect;
        C06384 r0 = new Runnable() {
            public final void run() {
                ArrayMap a = C0634r.m2741a(uVar3, arrayMap3, obj6, aVar3);
                if (a != null) {
                    arrayList4.addAll(a.values());
                    arrayList4.add(view2);
                }
                C0634r.m2749a(fragment3, fragment4, z2, a, false);
                if (obj6 != null) {
                    uVar3.mo2032a(obj6, arrayList5, arrayList4);
                    View a2 = C0634r.m2742a(a, aVar3, obj7, z2);
                    if (a2 != null) {
                        C0646u.m2786a(a2, rect2);
                    }
                }
            }
        };
        C0587ab.m2461a(viewGroup, r13);
        return obj4;
    }
}
