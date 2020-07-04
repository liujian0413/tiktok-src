package com.swmansion.gesturehandler;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/* renamed from: com.swmansion.gesturehandler.d */
public final class C46349d {

    /* renamed from: b */
    private static final PointF f119306b = new PointF();

    /* renamed from: c */
    private static final float[] f119307c = new float[2];

    /* renamed from: d */
    private static final Matrix f119308d = new Matrix();

    /* renamed from: e */
    private static final float[] f119309e = new float[2];

    /* renamed from: f */
    private static final Comparator<C46347b> f119310f = new Comparator<C46347b>() {
        public final /* synthetic */ int compare(Object obj, Object obj2) {
            return m145553a((C46347b) obj, (C46347b) obj2);
        }

        /* renamed from: a */
        private static int m145553a(C46347b bVar, C46347b bVar2) {
            if ((bVar.f119295n && bVar2.f119295n) || (bVar.f119296o && bVar2.f119296o)) {
                return Integer.signum(bVar2.f119294m - bVar.f119294m);
            }
            if (bVar.f119295n) {
                return -1;
            }
            if (bVar2.f119295n) {
                return 1;
            }
            if (bVar.f119296o) {
                return -1;
            }
            if (bVar2.f119296o) {
                return 1;
            }
            return 0;
        }
    };

    /* renamed from: a */
    public float f119311a;

    /* renamed from: g */
    private final ViewGroup f119312g;

    /* renamed from: h */
    private final C46351e f119313h;

    /* renamed from: i */
    private final C46366o f119314i;

    /* renamed from: j */
    private final C46347b[] f119315j = new C46347b[20];

    /* renamed from: k */
    private final C46347b[] f119316k = new C46347b[20];

    /* renamed from: l */
    private final C46347b[] f119317l = new C46347b[20];

    /* renamed from: m */
    private final C46347b[] f119318m = new C46347b[20];

    /* renamed from: n */
    private int f119319n;

    /* renamed from: o */
    private int f119320o;

    /* renamed from: p */
    private boolean f119321p;

    /* renamed from: q */
    private int f119322q;

    /* renamed from: r */
    private boolean f119323r;

    /* renamed from: s */
    private int f119324s;

    /* renamed from: a */
    private static boolean m145533a(int i) {
        return i == 3 || i == 1 || i == 5;
    }

    /* renamed from: a */
    public final boolean mo115223a(MotionEvent motionEvent) {
        this.f119321p = true;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 || actionMasked == 5) {
            m145546c(motionEvent);
        } else if (actionMasked == 3) {
            m145549d();
        }
        m145541b(motionEvent);
        this.f119321p = false;
        if (this.f119323r && this.f119322q == 0) {
            m145540b();
        }
        return true;
    }

    /* renamed from: a */
    private boolean m145538a(C46347b bVar) {
        for (int i = 0; i < this.f119319n; i++) {
            C46347b bVar2 = this.f119315j[i];
            if (!m145533a(bVar2.f119286e) && m145539a(bVar, bVar2)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo115222a(C46347b bVar, int i, int i2) {
        this.f119322q++;
        if (m145533a(i)) {
            for (int i3 = 0; i3 < this.f119320o; i3++) {
                C46347b bVar2 = this.f119316k[i3];
                if (m145539a(bVar2, bVar)) {
                    if (i == 5) {
                        bVar2.mo115209d();
                        bVar2.f119296o = false;
                    } else {
                        m145542b(bVar2);
                    }
                }
            }
            m145545c();
        }
        if (i == 4) {
            m145542b(bVar);
        } else if (!(i2 == 4 || i2 == 5) || bVar.f119295n) {
            bVar.mo115197a(i, i2);
        }
        this.f119322q--;
        m145528a();
    }

    /* renamed from: a */
    private boolean m145536a(View view, float[] fArr, int i) {
        ArrayList a = this.f119313h.mo115225a(view);
        if (a == null) {
            return false;
        }
        int size = a.size();
        boolean z = false;
        for (int i2 = 0; i2 < size; i2++) {
            C46347b bVar = (C46347b) a.get(i2);
            if (bVar.f119290i && bVar.mo115199a(view, fArr[0], fArr[1])) {
                m145531a(bVar, view);
                bVar.mo115196a(i);
                z = true;
            }
        }
        return z;
    }

    /* renamed from: a */
    private boolean m145537a(ViewGroup viewGroup, float[] fArr, int i) {
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View a = this.f119314i.mo115262a(viewGroup, childCount);
            PointF pointF = f119306b;
            if (m145534a(a)) {
                if (m145532a(fArr[0], fArr[1], viewGroup, a, pointF)) {
                    float f = fArr[0];
                    float f2 = fArr[1];
                    fArr[0] = pointF.x;
                    fArr[1] = pointF.y;
                    boolean b = m145543b(a, fArr, i);
                    fArr[0] = f;
                    fArr[1] = f2;
                    if (b) {
                        return true;
                    }
                } else {
                    continue;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m145539a(C46347b bVar, C46347b bVar2) {
        return bVar != bVar2 && (bVar.mo115208c(bVar2) || bVar2.mo115205b(bVar));
    }

    /* renamed from: a */
    private void m145528a() {
        if (this.f119321p || this.f119322q != 0) {
            this.f119323r = true;
        } else {
            m145540b();
        }
    }

    /* renamed from: c */
    private void m145545c() {
        int i = 0;
        for (int i2 = 0; i2 < this.f119320o; i2++) {
            if (this.f119316k[i2].f119296o) {
                int i3 = i + 1;
                this.f119316k[i] = this.f119316k[i2];
                i = i3;
            }
        }
        this.f119320o = i;
    }

    /* renamed from: d */
    private void m145549d() {
        for (int i = this.f119320o - 1; i >= 0; i--) {
            this.f119316k[i].mo115209d();
        }
        int i2 = this.f119319n;
        for (int i3 = 0; i3 < i2; i3++) {
            this.f119317l[i3] = this.f119315j[i3];
        }
        for (int i4 = i2 - 1; i4 >= 0; i4--) {
            this.f119317l[i4].mo115209d();
        }
    }

    /* renamed from: b */
    private void m145540b() {
        boolean z = false;
        for (int i = this.f119319n - 1; i >= 0; i--) {
            C46347b bVar = this.f119315j[i];
            if (m145533a(bVar.f119286e) && !bVar.f119296o) {
                this.f119315j[i] = null;
                bVar.mo115216i();
                bVar.f119295n = false;
                bVar.f119296o = false;
                bVar.f119294m = Integer.MAX_VALUE;
                z = true;
            }
        }
        if (z) {
            int i2 = 0;
            for (int i3 = 0; i3 < this.f119319n; i3++) {
                if (this.f119315j[i3] != null) {
                    int i4 = i2 + 1;
                    this.f119315j[i2] = this.f119315j[i3];
                    i2 = i4;
                }
            }
            this.f119319n = i2;
        }
        this.f119323r = false;
    }

    /* renamed from: b */
    private void m145542b(C46347b bVar) {
        if (m145538a(bVar)) {
            m145550d(bVar);
            return;
        }
        m145547c(bVar);
        bVar.f119296o = false;
    }

    /* renamed from: b */
    private void m145541b(MotionEvent motionEvent) {
        int i = this.f119319n;
        for (int i2 = 0; i2 < i; i2++) {
            this.f119317l[i2] = this.f119315j[i2];
        }
        Arrays.sort(this.f119317l, 0, i, f119310f);
        for (int i3 = 0; i3 < i; i3++) {
            m145530a(this.f119317l[i3], motionEvent);
        }
    }

    /* renamed from: c */
    private void m145546c(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        int pointerId = motionEvent.getPointerId(actionIndex);
        f119309e[0] = motionEvent.getX(actionIndex);
        f119309e[1] = motionEvent.getY(actionIndex);
        m145543b(this.f119312g, f119309e, pointerId);
        m145537a(this.f119312g, f119309e, pointerId);
    }

    /* renamed from: c */
    private void m145547c(C46347b bVar) {
        int i = bVar.f119286e;
        bVar.f119296o = false;
        bVar.f119295n = true;
        int i2 = this.f119324s;
        this.f119324s = i2 + 1;
        bVar.f119294m = i2;
        int i3 = 0;
        for (int i4 = 0; i4 < this.f119319n; i4++) {
            C46347b bVar2 = this.f119315j[i4];
            if (m145548c(bVar2, bVar)) {
                int i5 = i3 + 1;
                this.f119318m[i3] = bVar2;
                i3 = i5;
            }
        }
        for (int i6 = i3 - 1; i6 >= 0; i6--) {
            this.f119318m[i6].mo115209d();
        }
        for (int i7 = this.f119320o - 1; i7 >= 0; i7--) {
            C46347b bVar3 = this.f119316k[i7];
            if (m145548c(bVar3, bVar)) {
                bVar3.mo115209d();
                bVar3.f119296o = false;
            }
        }
        m145545c();
        bVar.mo115197a(4, 2);
        if (i != 4) {
            bVar.mo115197a(5, 4);
            if (i != 5) {
                bVar.mo115197a(0, 5);
            }
        }
    }

    /* renamed from: d */
    private void m145550d(C46347b bVar) {
        int i = 0;
        while (i < this.f119320o) {
            if (this.f119316k[i] != bVar) {
                i++;
            } else {
                return;
            }
        }
        if (this.f119320o < this.f119316k.length) {
            C46347b[] bVarArr = this.f119316k;
            int i2 = this.f119320o;
            this.f119320o = i2 + 1;
            bVarArr[i2] = bVar;
            bVar.f119296o = true;
            int i3 = this.f119324s;
            this.f119324s = i3 + 1;
            bVar.f119294m = i3;
            return;
        }
        throw new IllegalStateException("Too many recognizers");
    }

    /* renamed from: a */
    private boolean m145534a(View view) {
        if (view.getVisibility() != 0 || view.getAlpha() < this.f119311a) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private void m145531a(C46347b bVar, View view) {
        int i = 0;
        while (i < this.f119319n) {
            if (this.f119315j[i] != bVar) {
                i++;
            } else {
                return;
            }
        }
        if (this.f119319n < this.f119315j.length) {
            C46347b[] bVarArr = this.f119315j;
            int i2 = this.f119319n;
            this.f119319n = i2 + 1;
            bVarArr[i2] = bVar;
            bVar.f119295n = false;
            bVar.f119296o = false;
            bVar.f119294m = Integer.MAX_VALUE;
            bVar.mo115198a(view, this);
            return;
        }
        throw new IllegalStateException("Too many recognizers");
    }

    /* renamed from: a */
    private void m145530a(C46347b bVar, MotionEvent motionEvent) {
        if (bVar.mo115207c()) {
            int actionMasked = motionEvent.getActionMasked();
            if (!bVar.f119296o || actionMasked != 2) {
                float[] fArr = f119309e;
                m145529a(bVar.f119285d, motionEvent, fArr);
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                motionEvent.setLocation(fArr[0], fArr[1]);
                bVar.mo115206c(motionEvent);
                if (bVar.f119295n) {
                    bVar.mo115204b(motionEvent);
                }
                motionEvent.setLocation(x, y);
                if (actionMasked == 1 || actionMasked == 6) {
                    bVar.mo115202b(motionEvent.getPointerId(motionEvent.getActionIndex()));
                }
            }
        }
    }

    /* renamed from: c */
    private static boolean m145548c(C46347b bVar, C46347b bVar2) {
        if (!bVar.mo115200a(bVar2) || m145544b(bVar, bVar2)) {
            return false;
        }
        if (bVar == bVar2 || (!bVar.f119296o && bVar.f119286e != 4)) {
            return true;
        }
        return bVar.mo115212e(bVar2);
    }

    /* renamed from: b */
    private static boolean m145544b(C46347b bVar, C46347b bVar2) {
        if (bVar == bVar2 || bVar.mo115210d(bVar2) || bVar2.mo115210d(bVar)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m145535a(View view, float[] fArr) {
        if (!(view instanceof ViewGroup) || view.getBackground() != null) {
            return true;
        }
        return false;
    }

    public C46349d(ViewGroup viewGroup, C46351e eVar, C46366o oVar) {
        this.f119312g = viewGroup;
        this.f119313h = eVar;
        this.f119314i = oVar;
    }

    /* renamed from: a */
    private void m145529a(View view, MotionEvent motionEvent, float[] fArr) {
        if (view == this.f119312g) {
            fArr[0] = motionEvent.getX();
            fArr[1] = motionEvent.getY();
        } else if (view == null || !(view.getParent() instanceof ViewGroup)) {
            throw new IllegalArgumentException("Parent is null? View is no longer in the tree");
        } else {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            m145529a((View) viewGroup, motionEvent, fArr);
            PointF pointF = f119306b;
            m145532a(fArr[0], fArr[1], viewGroup, view, pointF);
            fArr[0] = pointF.x;
            fArr[1] = pointF.y;
        }
    }

    /* renamed from: b */
    private boolean m145543b(View view, float[] fArr, int i) {
        boolean z;
        PointerEventsConfig a = this.f119314i.mo115263a(view);
        if (a == PointerEventsConfig.NONE) {
            return false;
        }
        if (a == PointerEventsConfig.BOX_ONLY) {
            if (m145536a(view, fArr, i) || m145535a(view, fArr)) {
                return true;
            }
            return false;
        } else if (a == PointerEventsConfig.BOX_NONE) {
            if (view instanceof ViewGroup) {
                return m145537a((ViewGroup) view, fArr, i);
            }
            return false;
        } else if (a == PointerEventsConfig.AUTO) {
            if (view instanceof ViewGroup) {
                z = m145537a((ViewGroup) view, fArr, i);
            } else {
                z = false;
            }
            if (m145536a(view, fArr, i) || z || m145535a(view, fArr)) {
                return true;
            }
            return false;
        } else {
            StringBuilder sb = new StringBuilder("Unknown pointer event type: ");
            sb.append(a.toString());
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: a */
    private boolean m145532a(float f, float f2, ViewGroup viewGroup, View view, PointF pointF) {
        boolean z;
        float scrollX = (f + ((float) viewGroup.getScrollX())) - ((float) view.getLeft());
        float scrollY = (f2 + ((float) viewGroup.getScrollY())) - ((float) view.getTop());
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            float[] fArr = f119307c;
            fArr[0] = scrollX;
            fArr[1] = scrollY;
            Matrix matrix2 = f119308d;
            matrix.invert(matrix2);
            matrix2.mapPoints(fArr);
            scrollX = fArr[0];
            scrollY = fArr[1];
        }
        pointF.set(scrollX, scrollY);
        ArrayList a = this.f119313h.mo115225a(view);
        if (a != null) {
            int size = a.size();
            z = false;
            int i = 0;
            while (!z && i < size) {
                z = ((C46347b) a.get(i)).mo115199a(view, scrollX, scrollY);
                i++;
            }
        } else {
            z = false;
        }
        if (z) {
            return z;
        }
        if (scrollX < 0.0f || scrollX > ((float) view.getWidth()) || scrollY < 0.0f || scrollY >= ((float) view.getHeight())) {
            return false;
        }
        return true;
    }
}
