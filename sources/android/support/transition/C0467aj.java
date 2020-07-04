package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.transition.C0508m.C0514c;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: android.support.transition.aj */
public abstract class C0467aj extends C0508m {

    /* renamed from: a */
    private static final String[] f1928a = {"android:visibility:visibility", "android:visibility:parent"};

    /* renamed from: p */
    public int f1929p = 3;

    /* renamed from: android.support.transition.aj$a */
    static class C0469a extends AnimatorListenerAdapter implements C0454a, C0514c {

        /* renamed from: a */
        boolean f1933a;

        /* renamed from: b */
        private final View f1934b;

        /* renamed from: c */
        private final int f1935c;

        /* renamed from: d */
        private final ViewGroup f1936d;

        /* renamed from: e */
        private final boolean f1937e = true;

        /* renamed from: f */
        private boolean f1938f;

        /* renamed from: d */
        public final void mo2045d(C0508m mVar) {
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationStart(Animator animator) {
        }

        /* renamed from: a */
        private void m2050a() {
            if (!this.f1933a) {
                C0460ae.m2007a(this.f1934b, this.f1935c);
                if (this.f1936d != null) {
                    this.f1936d.invalidate();
                }
            }
            m2051a(false);
        }

        public final void onAnimationCancel(Animator animator) {
            this.f1933a = true;
        }

        public final void onAnimationEnd(Animator animator) {
            m2050a();
        }

        /* renamed from: a */
        public final void mo2042a(C0508m mVar) {
            m2050a();
            mVar.mo2130b((C0514c) this);
        }

        /* renamed from: b */
        public final void mo2043b(C0508m mVar) {
            m2051a(false);
        }

        /* renamed from: c */
        public final void mo2044c(C0508m mVar) {
            m2051a(true);
        }

        public final void onAnimationPause(Animator animator) {
            if (!this.f1933a) {
                C0460ae.m2007a(this.f1934b, this.f1935c);
            }
        }

        public final void onAnimationResume(Animator animator) {
            if (!this.f1933a) {
                C0460ae.m2007a(this.f1934b, 0);
            }
        }

        /* renamed from: a */
        private void m2051a(boolean z) {
            if (this.f1937e && this.f1938f != z && this.f1936d != null) {
                this.f1938f = z;
                C0531y.m2229a(this.f1936d, z);
            }
        }

        C0469a(View view, int i, boolean z) {
            this.f1934b = view;
            this.f1935c = i;
            this.f1936d = (ViewGroup) view.getParent();
            m2051a(true);
        }
    }

    /* renamed from: android.support.transition.aj$b */
    static class C0470b {

        /* renamed from: a */
        boolean f1939a;

        /* renamed from: b */
        boolean f1940b;

        /* renamed from: c */
        int f1941c;

        /* renamed from: d */
        int f1942d;

        /* renamed from: e */
        ViewGroup f1943e;

        /* renamed from: f */
        ViewGroup f1944f;

        C0470b() {
        }
    }

    /* renamed from: a */
    public Animator mo2071a(ViewGroup viewGroup, View view, C0524s sVar, C0524s sVar2) {
        return null;
    }

    /* renamed from: b */
    public Animator mo2074b(ViewGroup viewGroup, View view, C0524s sVar, C0524s sVar2) {
        return null;
    }

    /* renamed from: a */
    public final String[] mo2073a() {
        return f1928a;
    }

    /* renamed from: a */
    public void mo1185a(C0524s sVar) {
        m2041d(sVar);
    }

    /* renamed from: b */
    public void mo1186b(C0524s sVar) {
        m2041d(sVar);
    }

    /* renamed from: c */
    public final void mo2075c(int i) {
        if ((i & -4) == 0) {
            this.f1929p = i;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }

    /* renamed from: d */
    private static void m2041d(C0524s sVar) {
        sVar.f2072a.put("android:visibility:visibility", Integer.valueOf(sVar.f2073b.getVisibility()));
        sVar.f2072a.put("android:visibility:parent", sVar.f2073b.getParent());
        int[] iArr = new int[2];
        sVar.f2073b.getLocationOnScreen(iArr);
        sVar.f2072a.put("android:visibility:screenLocation", iArr);
    }

    /* renamed from: a */
    public final boolean mo2072a(C0524s sVar, C0524s sVar2) {
        if (sVar == null && sVar2 == null) {
            return false;
        }
        if (sVar != null && sVar2 != null && sVar2.f2072a.containsKey("android:visibility:visibility") != sVar.f2072a.containsKey("android:visibility:visibility")) {
            return false;
        }
        C0470b b = m2040b(sVar, sVar2);
        if (!b.f1939a || (b.f1941c != 0 && b.f1942d != 0)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private static C0470b m2040b(C0524s sVar, C0524s sVar2) {
        C0470b bVar = new C0470b();
        bVar.f1939a = false;
        bVar.f1940b = false;
        if (sVar == null || !sVar.f2072a.containsKey("android:visibility:visibility")) {
            bVar.f1941c = -1;
            bVar.f1943e = null;
        } else {
            bVar.f1941c = ((Integer) sVar.f2072a.get("android:visibility:visibility")).intValue();
            bVar.f1943e = (ViewGroup) sVar.f2072a.get("android:visibility:parent");
        }
        if (sVar2 == null || !sVar2.f2072a.containsKey("android:visibility:visibility")) {
            bVar.f1942d = -1;
            bVar.f1944f = null;
        } else {
            bVar.f1942d = ((Integer) sVar2.f2072a.get("android:visibility:visibility")).intValue();
            bVar.f1944f = (ViewGroup) sVar2.f2072a.get("android:visibility:parent");
        }
        if (sVar == null || sVar2 == null) {
            if (sVar == null && bVar.f1942d == 0) {
                bVar.f1940b = true;
                bVar.f1939a = true;
            } else if (sVar2 == null && bVar.f1941c == 0) {
                bVar.f1940b = false;
                bVar.f1939a = true;
            }
        } else if (bVar.f1941c == bVar.f1942d && bVar.f1943e == bVar.f1944f) {
            return bVar;
        } else {
            if (bVar.f1941c != bVar.f1942d) {
                if (bVar.f1941c == 0) {
                    bVar.f1940b = false;
                    bVar.f1939a = true;
                } else if (bVar.f1942d == 0) {
                    bVar.f1940b = true;
                    bVar.f1939a = true;
                }
            } else if (bVar.f1944f == null) {
                bVar.f1940b = false;
                bVar.f1939a = true;
            } else if (bVar.f1943e == null) {
                bVar.f1940b = true;
                bVar.f1939a = true;
            }
        }
        return bVar;
    }

    /* renamed from: a */
    public final Animator mo1184a(ViewGroup viewGroup, C0524s sVar, C0524s sVar2) {
        C0470b b = m2040b(sVar, sVar2);
        if (!b.f1939a || (b.f1943e == null && b.f1944f == null)) {
            return null;
        }
        if (b.f1940b) {
            return m2038a(viewGroup, sVar, b.f1941c, sVar2, b.f1942d);
        }
        return m2039b(viewGroup, sVar, b.f1941c, sVar2, b.f1942d);
    }

    /* renamed from: a */
    private Animator m2038a(ViewGroup viewGroup, C0524s sVar, int i, C0524s sVar2, int i2) {
        if ((this.f1929p & 1) != 1 || sVar2 == null) {
            return null;
        }
        if (sVar == null) {
            View view = (View) sVar2.f2073b.getParent();
            if (m2040b(mo2132b(view, false), mo2118a(view, false)).f1939a) {
                return null;
            }
        }
        return mo2071a(viewGroup, sVar2.f2073b, sVar, sVar2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x007d, code lost:
        if (r6.f2031k != false) goto L_0x003a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0087 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00ee A[RETURN] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.animation.Animator m2039b(android.view.ViewGroup r7, android.support.transition.C0524s r8, int r9, android.support.transition.C0524s r10, int r11) {
        /*
            r6 = this;
            int r9 = r6.f1929p
            r0 = 2
            r9 = r9 & r0
            r1 = 0
            if (r9 == r0) goto L_0x0008
            return r1
        L_0x0008:
            if (r8 == 0) goto L_0x000d
            android.view.View r9 = r8.f2073b
            goto L_0x000e
        L_0x000d:
            r9 = r1
        L_0x000e:
            if (r10 == 0) goto L_0x0013
            android.view.View r2 = r10.f2073b
            goto L_0x0014
        L_0x0013:
            r2 = r1
        L_0x0014:
            r3 = 1
            if (r2 == 0) goto L_0x0037
            android.view.ViewParent r4 = r2.getParent()
            if (r4 != 0) goto L_0x001e
            goto L_0x0037
        L_0x001e:
            r4 = 4
            if (r11 != r4) goto L_0x0022
            goto L_0x0024
        L_0x0022:
            if (r9 != r2) goto L_0x0027
        L_0x0024:
            r9 = r1
            goto L_0x0084
        L_0x0027:
            boolean r2 = r6.f2031k
            if (r2 == 0) goto L_0x002c
            goto L_0x0044
        L_0x002c:
            android.view.ViewParent r2 = r9.getParent()
            android.view.View r2 = (android.view.View) r2
            android.view.View r9 = android.support.transition.C0523r.m2217a(r7, r9, r2)
            goto L_0x003a
        L_0x0037:
            if (r2 == 0) goto L_0x003c
            r9 = r2
        L_0x003a:
            r2 = r1
            goto L_0x0084
        L_0x003c:
            if (r9 == 0) goto L_0x0082
            android.view.ViewParent r2 = r9.getParent()
            if (r2 != 0) goto L_0x0045
        L_0x0044:
            goto L_0x003a
        L_0x0045:
            android.view.ViewParent r2 = r9.getParent()
            boolean r2 = r2 instanceof android.view.View
            if (r2 == 0) goto L_0x0082
            android.view.ViewParent r2 = r9.getParent()
            android.view.View r2 = (android.view.View) r2
            android.support.transition.s r4 = r6.mo2118a(r2, r3)
            android.support.transition.s r5 = r6.mo2132b(r2, r3)
            android.support.transition.aj$b r4 = m2040b(r4, r5)
            boolean r4 = r4.f1939a
            if (r4 != 0) goto L_0x0068
            android.view.View r9 = android.support.transition.C0523r.m2217a(r7, r9, r2)
            goto L_0x003a
        L_0x0068:
            android.view.ViewParent r4 = r2.getParent()
            if (r4 != 0) goto L_0x0080
            int r2 = r2.getId()
            r4 = -1
            if (r2 == r4) goto L_0x0080
            android.view.View r2 = r7.findViewById(r2)
            if (r2 == 0) goto L_0x0080
            boolean r2 = r6.f2031k
            if (r2 == 0) goto L_0x0080
            goto L_0x003a
        L_0x0080:
            r9 = r1
            goto L_0x003a
        L_0x0082:
            r9 = r1
            r2 = r9
        L_0x0084:
            r4 = 0
            if (r9 == 0) goto L_0x00cc
            if (r8 == 0) goto L_0x00cc
            java.util.Map<java.lang.String, java.lang.Object> r11 = r8.f2072a
            java.lang.String r1 = "android:visibility:screenLocation"
            java.lang.Object r11 = r11.get(r1)
            int[] r11 = (int[]) r11
            r1 = r11[r4]
            r11 = r11[r3]
            int[] r0 = new int[r0]
            r7.getLocationOnScreen(r0)
            r2 = r0[r4]
            int r1 = r1 - r2
            int r2 = r9.getLeft()
            int r1 = r1 - r2
            r9.offsetLeftAndRight(r1)
            r0 = r0[r3]
            int r11 = r11 - r0
            int r0 = r9.getTop()
            int r11 = r11 - r0
            r9.offsetTopAndBottom(r11)
            android.support.transition.x r11 = android.support.transition.C0531y.m2228a(r7)
            r11.mo2164a(r9)
            android.animation.Animator r7 = r6.mo2074b(r7, r9, r8, r10)
            if (r7 != 0) goto L_0x00c3
            r11.mo2165b(r9)
            goto L_0x00cb
        L_0x00c3:
            android.support.transition.aj$1 r8 = new android.support.transition.aj$1
            r8.<init>(r11, r9)
            r7.addListener(r8)
        L_0x00cb:
            return r7
        L_0x00cc:
            if (r2 == 0) goto L_0x00ee
            int r9 = r2.getVisibility()
            android.support.transition.C0460ae.m2007a(r2, r4)
            android.animation.Animator r7 = r6.mo2074b(r7, r2, r8, r10)
            if (r7 == 0) goto L_0x00ea
            android.support.transition.aj$a r8 = new android.support.transition.aj$a
            r8.<init>(r2, r11, r3)
            r7.addListener(r8)
            android.support.transition.C0453a.m1986a(r7, r8)
            r6.mo2117a(r8)
            goto L_0x00ed
        L_0x00ea:
            android.support.transition.C0460ae.m2007a(r2, r9)
        L_0x00ed:
            return r7
        L_0x00ee:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.transition.C0467aj.m2039b(android.view.ViewGroup, android.support.transition.s, int, android.support.transition.s, int):android.animation.Animator");
    }
}
