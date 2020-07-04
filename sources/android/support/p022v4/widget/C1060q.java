package android.support.p022v4.widget;

import android.content.Context;
import android.support.p022v4.view.C0991u;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.Arrays;

/* renamed from: android.support.v4.widget.q */
public final class C1060q {

    /* renamed from: v */
    private static final Interpolator f3672v = new Interpolator() {
        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    };

    /* renamed from: a */
    public int f3673a;

    /* renamed from: b */
    public int f3674b;

    /* renamed from: c */
    public int f3675c = -1;

    /* renamed from: d */
    public float f3676d;

    /* renamed from: e */
    public int f3677e;

    /* renamed from: f */
    public int f3678f;

    /* renamed from: g */
    public View f3679g;

    /* renamed from: h */
    private float[] f3680h;

    /* renamed from: i */
    private float[] f3681i;

    /* renamed from: j */
    private float[] f3682j;

    /* renamed from: k */
    private float[] f3683k;

    /* renamed from: l */
    private int[] f3684l;

    /* renamed from: m */
    private int[] f3685m;

    /* renamed from: n */
    private int[] f3686n;

    /* renamed from: o */
    private int f3687o;

    /* renamed from: p */
    private VelocityTracker f3688p;

    /* renamed from: q */
    private float f3689q;

    /* renamed from: r */
    private OverScroller f3690r;

    /* renamed from: s */
    private final C1063a f3691s;

    /* renamed from: t */
    private boolean f3692t;

    /* renamed from: u */
    private final ViewGroup f3693u;

    /* renamed from: w */
    private final Runnable f3694w = new Runnable() {
        public final void run() {
            C1060q.this.mo4153a(0);
        }
    };

    /* renamed from: android.support.v4.widget.q$a */
    public static abstract class C1063a {
        /* renamed from: b */
        public static int m4623b(int i) {
            return i;
        }

        /* renamed from: a */
        public int mo1362a(View view) {
            return 0;
        }

        /* renamed from: a */
        public int mo1363a(View view, int i, int i2) {
            return 0;
        }

        /* renamed from: a */
        public void mo1364a(int i) {
        }

        /* renamed from: a */
        public void mo3908a(int i, int i2) {
        }

        /* renamed from: a */
        public void mo1365a(View view, float f, float f2) {
        }

        /* renamed from: a */
        public void mo1366a(View view, int i, int i2, int i3, int i4) {
        }

        /* renamed from: a */
        public abstract boolean mo1367a(View view, int i);

        /* renamed from: b */
        public int mo1578b(View view) {
            return 0;
        }

        /* renamed from: b */
        public int mo1368b(View view, int i, int i2) {
            return 0;
        }

        /* renamed from: b */
        public void mo3910b(int i, int i2) {
        }

        /* renamed from: b */
        public void mo1579b(View view, int i) {
        }
    }

    /* renamed from: a */
    public final void mo4154a(View view, int i) {
        if (view.getParent() == this.f3693u) {
            this.f3679g = view;
            this.f3675c = i;
            this.f3691s.mo1579b(view, i);
            mo4153a(1);
            return;
        }
        StringBuilder sb = new StringBuilder("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (");
        sb.append(this.f3693u);
        sb.append(")");
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public final void mo4152a() {
        this.f3675c = -1;
        m4602c();
        if (this.f3688p != null) {
            this.f3688p.recycle();
            this.f3688p = null;
        }
    }

    /* renamed from: a */
    public final boolean mo4157a(View view, int i, int i2) {
        this.f3679g = view;
        this.f3675c = -1;
        boolean a = m4595a(i, i2, 0, 0);
        if (!a && this.f3673a == 0 && this.f3679g != null) {
            this.f3679g = null;
        }
        return a;
    }

    /* renamed from: a */
    public final boolean mo4155a(int i, int i2) {
        if (this.f3692t) {
            return m4595a(i, i2, (int) this.f3688p.getXVelocity(this.f3675c), (int) this.f3688p.getYVelocity(this.f3675c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* renamed from: a */
    private boolean m4595a(int i, int i2, int i3, int i4) {
        int left = this.f3679g.getLeft();
        int top = this.f3679g.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        if (i5 == 0 && i6 == 0) {
            this.f3690r.abortAnimation();
            mo4153a(0);
            return false;
        }
        this.f3690r.startScroll(left, top, i5, i6, m4589a(this.f3679g, i5, i6, i3, i4));
        mo4153a(2);
        return true;
    }

    /* renamed from: a */
    public final boolean mo4158a(boolean z) {
        if (this.f3673a == 2) {
            boolean computeScrollOffset = this.f3690r.computeScrollOffset();
            int currX = this.f3690r.getCurrX();
            int currY = this.f3690r.getCurrY();
            int left = currX - this.f3679g.getLeft();
            int top = currY - this.f3679g.getTop();
            if (left != 0) {
                C0991u.m4225i(this.f3679g, left);
            }
            if (top != 0) {
                C0991u.m4222h(this.f3679g, top);
            }
            if (!(left == 0 && top == 0)) {
                this.f3691s.mo1366a(this.f3679g, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == this.f3690r.getFinalX() && currY == this.f3690r.getFinalY()) {
                this.f3690r.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                this.f3693u.post(this.f3694w);
            }
        }
        if (this.f3673a == 2) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo4153a(int i) {
        this.f3693u.removeCallbacks(this.f3694w);
        if (this.f3673a != i) {
            this.f3673a = i;
            this.f3691s.mo1364a(i);
            if (this.f3673a == 0) {
                this.f3679g = null;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00d3, code lost:
        if (r12 != r11) goto L_0x00db;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo4156a(android.view.MotionEvent r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            int r2 = r17.getActionMasked()
            int r3 = r17.getActionIndex()
            if (r2 != 0) goto L_0x0011
            r16.mo4152a()
        L_0x0011:
            android.view.VelocityTracker r4 = r0.f3688p
            if (r4 != 0) goto L_0x001b
            android.view.VelocityTracker r4 = android.view.VelocityTracker.obtain()
            r0.f3688p = r4
        L_0x001b:
            android.view.VelocityTracker r4 = r0.f3688p
            r4.addMovement(r1)
            r4 = 2
            r6 = 1
            switch(r2) {
                case 0: goto L_0x00f5;
                case 1: goto L_0x00f1;
                case 2: goto L_0x0069;
                case 3: goto L_0x00f1;
                case 4: goto L_0x0025;
                case 5: goto L_0x0030;
                case 6: goto L_0x0027;
                default: goto L_0x0025;
            }
        L_0x0025:
            goto L_0x0127
        L_0x0027:
            int r1 = r1.getPointerId(r3)
            r0.m4603c(r1)
            goto L_0x0127
        L_0x0030:
            int r2 = r1.getPointerId(r3)
            float r7 = r1.getX(r3)
            float r1 = r1.getY(r3)
            r0.m4593a(r7, r1, r2)
            int r3 = r0.f3673a
            if (r3 != 0) goto L_0x0056
            int[] r1 = r0.f3684l
            r1 = r1[r2]
            int r3 = r0.f3678f
            r3 = r3 & r1
            if (r3 == 0) goto L_0x0127
            android.support.v4.widget.q$a r3 = r0.f3691s
            int r4 = r0.f3678f
            r1 = r1 & r4
            r3.mo3908a(r1, r2)
            goto L_0x0127
        L_0x0056:
            int r3 = r0.f3673a
            if (r3 != r4) goto L_0x0127
            int r3 = (int) r7
            int r1 = (int) r1
            android.view.View r1 = r0.mo4159b(r3, r1)
            android.view.View r3 = r0.f3679g
            if (r1 != r3) goto L_0x0127
            r0.m4600b(r1, r2)
            goto L_0x0127
        L_0x0069:
            float[] r2 = r0.f3680h
            if (r2 == 0) goto L_0x0127
            float[] r2 = r0.f3681i
            if (r2 == 0) goto L_0x0127
            int r2 = r17.getPointerCount()
            r3 = 0
        L_0x0076:
            if (r3 >= r2) goto L_0x00ed
            int r4 = r1.getPointerId(r3)
            boolean r7 = r0.m4611f(r4)
            if (r7 == 0) goto L_0x00ea
            float r7 = r1.getX(r3)
            float r8 = r1.getY(r3)
            float[] r9 = r0.f3680h
            r9 = r9[r4]
            float r9 = r7 - r9
            float[] r10 = r0.f3681i
            r10 = r10[r4]
            float r10 = r8 - r10
            int r7 = (int) r7
            int r8 = (int) r8
            android.view.View r7 = r0.mo4159b(r7, r8)
            if (r7 == 0) goto L_0x00a6
            boolean r8 = r0.m4596a(r7, r9, r10)
            if (r8 == 0) goto L_0x00a6
            r8 = 1
            goto L_0x00a7
        L_0x00a6:
            r8 = 0
        L_0x00a7:
            if (r8 == 0) goto L_0x00db
            int r11 = r7.getLeft()
            int r12 = (int) r9
            int r13 = r11 + r12
            android.support.v4.widget.q$a r14 = r0.f3691s
            int r12 = r14.mo1368b(r7, r13, r12)
            int r13 = r7.getTop()
            int r14 = (int) r10
            int r15 = r13 + r14
            android.support.v4.widget.q$a r5 = r0.f3691s
            int r5 = r5.mo1363a(r7, r15, r14)
            android.support.v4.widget.q$a r14 = r0.f3691s
            int r14 = r14.mo1578b(r7)
            android.support.v4.widget.q$a r15 = r0.f3691s
            int r15 = r15.mo1362a(r7)
            if (r14 == 0) goto L_0x00d5
            if (r14 <= 0) goto L_0x00db
            if (r12 != r11) goto L_0x00db
        L_0x00d5:
            if (r15 == 0) goto L_0x00ed
            if (r15 <= 0) goto L_0x00db
            if (r5 == r13) goto L_0x00ed
        L_0x00db:
            r0.m4598b(r9, r10, r4)
            int r5 = r0.f3673a
            if (r5 == r6) goto L_0x00ed
            if (r8 == 0) goto L_0x00ea
            boolean r4 = r0.m4600b(r7, r4)
            if (r4 != 0) goto L_0x00ed
        L_0x00ea:
            int r3 = r3 + 1
            goto L_0x0076
        L_0x00ed:
            r16.m4604c(r17)
            goto L_0x0127
        L_0x00f1:
            r16.mo4152a()
            goto L_0x0127
        L_0x00f5:
            float r2 = r17.getX()
            float r3 = r17.getY()
            r5 = 0
            int r1 = r1.getPointerId(r5)
            r0.m4593a(r2, r3, r1)
            int r2 = (int) r2
            int r3 = (int) r3
            android.view.View r2 = r0.mo4159b(r2, r3)
            android.view.View r3 = r0.f3679g
            if (r2 != r3) goto L_0x0116
            int r3 = r0.f3673a
            if (r3 != r4) goto L_0x0116
            r0.m4600b(r2, r1)
        L_0x0116:
            int[] r2 = r0.f3684l
            r2 = r2[r1]
            int r3 = r0.f3678f
            r3 = r3 & r2
            if (r3 == 0) goto L_0x0127
            android.support.v4.widget.q$a r3 = r0.f3691s
            int r4 = r0.f3678f
            r2 = r2 & r4
            r3.mo3908a(r2, r1)
        L_0x0127:
            int r1 = r0.f3673a
            if (r1 != r6) goto L_0x012c
            return r6
        L_0x012c:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p022v4.widget.C1060q.mo4156a(android.view.MotionEvent):boolean");
    }

    /* renamed from: a */
    private boolean m4594a(float f, float f2, int i, int i2) {
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        if ((this.f3684l[i] & i2) != i2 || (this.f3678f & i2) == 0 || (this.f3686n[i] & i2) == i2 || (this.f3685m[i] & i2) == i2 || ((abs <= ((float) this.f3674b) && abs2 <= ((float) this.f3674b)) || (this.f3685m[i] & i2) != 0 || abs <= ((float) this.f3674b))) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private boolean m4596a(View view, float f, float f2) {
        if (view == null) {
            return false;
        }
        boolean z = this.f3691s.mo1578b(view) > 0;
        boolean z2 = this.f3691s.mo1362a(view) > 0;
        return (!z || !z2) ? z ? Math.abs(f) > ((float) this.f3674b) : z2 && Math.abs(f2) > ((float) this.f3674b) : (f * f) + (f2 * f2) > ((float) (this.f3674b * this.f3674b));
    }

    /* renamed from: b */
    public final boolean mo4162b(int i) {
        int length = this.f3680h.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (m4605c(3, i2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    private void m4602c() {
        if (this.f3680h != null) {
            Arrays.fill(this.f3680h, 0.0f);
            Arrays.fill(this.f3681i, 0.0f);
            Arrays.fill(this.f3682j, 0.0f);
            Arrays.fill(this.f3683k, 0.0f);
            Arrays.fill(this.f3684l, 0);
            Arrays.fill(this.f3685m, 0);
            Arrays.fill(this.f3686n, 0);
            this.f3687o = 0;
        }
    }

    /* renamed from: d */
    private void m4606d() {
        this.f3688p.computeCurrentVelocity(1000, this.f3689q);
        m4592a(m4587a(this.f3688p.getXVelocity(this.f3675c), this.f3676d, this.f3689q), m4587a(this.f3688p.getYVelocity(this.f3675c), this.f3676d, this.f3689q));
    }

    /* renamed from: b */
    public final void mo4160b() {
        mo4152a();
        if (this.f3673a == 2) {
            int currX = this.f3690r.getCurrX();
            int currY = this.f3690r.getCurrY();
            this.f3690r.abortAnimation();
            int currX2 = this.f3690r.getCurrX();
            int currY2 = this.f3690r.getCurrY();
            this.f3691s.mo1366a(this.f3679g, currX2, currY2, currX2 - currX, currY2 - currY);
        }
        mo4153a(0);
    }

    /* renamed from: a */
    private static float m4586a(float f) {
        return (float) Math.sin((double) ((f - 0.5f) * 0.47123894f));
    }

    /* renamed from: e */
    private boolean m4610e(int i) {
        if (((1 << i) & this.f3687o) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    private boolean m4611f(int i) {
        if (!m4610e(i)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    private void m4603c(int i) {
        if (this.f3680h != null && m4610e(i)) {
            this.f3680h[i] = 0.0f;
            this.f3681i[i] = 0.0f;
            this.f3682j[i] = 0.0f;
            this.f3683k[i] = 0.0f;
            this.f3684l[i] = 0;
            this.f3685m[i] = 0;
            this.f3686n[i] = 0;
            this.f3687o = ((1 << i) ^ -1) & this.f3687o;
        }
    }

    /* renamed from: d */
    private void m4607d(int i) {
        if (this.f3680h == null || this.f3680h.length <= i) {
            int i2 = i + 1;
            float[] fArr = new float[i2];
            float[] fArr2 = new float[i2];
            float[] fArr3 = new float[i2];
            float[] fArr4 = new float[i2];
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int[] iArr3 = new int[i2];
            if (this.f3680h != null) {
                System.arraycopy(this.f3680h, 0, fArr, 0, this.f3680h.length);
                System.arraycopy(this.f3681i, 0, fArr2, 0, this.f3681i.length);
                System.arraycopy(this.f3682j, 0, fArr3, 0, this.f3682j.length);
                System.arraycopy(this.f3683k, 0, fArr4, 0, this.f3683k.length);
                System.arraycopy(this.f3684l, 0, iArr, 0, this.f3684l.length);
                System.arraycopy(this.f3685m, 0, iArr2, 0, this.f3685m.length);
                System.arraycopy(this.f3686n, 0, iArr3, 0, this.f3686n.length);
            }
            this.f3680h = fArr;
            this.f3681i = fArr2;
            this.f3682j = fArr3;
            this.f3683k = fArr4;
            this.f3684l = iArr;
            this.f3685m = iArr2;
            this.f3686n = iArr3;
        }
    }

    /* renamed from: c */
    private void m4604c(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (m4611f(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f3682j[pointerId] = x;
                this.f3683k[pointerId] = y;
            }
        }
    }

    /* renamed from: b */
    public final void mo4161b(MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            mo4152a();
        }
        if (this.f3688p == null) {
            this.f3688p = VelocityTracker.obtain();
        }
        this.f3688p.addMovement(motionEvent);
        int i2 = 0;
        switch (actionMasked) {
            case 0:
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                int pointerId = motionEvent.getPointerId(0);
                View b = mo4159b((int) x, (int) y);
                m4593a(x, y, pointerId);
                m4600b(b, pointerId);
                int i3 = this.f3684l[pointerId];
                if ((this.f3678f & i3) != 0) {
                    this.f3691s.mo3908a(i3 & this.f3678f, pointerId);
                    return;
                }
                break;
            case 1:
                if (this.f3673a == 1) {
                    m4606d();
                }
                mo4152a();
                return;
            case 2:
                if (this.f3673a != 1) {
                    int pointerCount = motionEvent.getPointerCount();
                    while (i2 < pointerCount) {
                        int pointerId2 = motionEvent.getPointerId(i2);
                        if (m4611f(pointerId2)) {
                            float x2 = motionEvent.getX(i2);
                            float y2 = motionEvent.getY(i2);
                            float f = x2 - this.f3680h[pointerId2];
                            float f2 = y2 - this.f3681i[pointerId2];
                            m4598b(f, f2, pointerId2);
                            if (this.f3673a != 1) {
                                View b2 = mo4159b((int) x2, (int) y2);
                                if (m4596a(b2, f, f2) && m4600b(b2, pointerId2)) {
                                }
                            }
                            m4604c(motionEvent);
                            return;
                        }
                        i2++;
                    }
                    m4604c(motionEvent);
                    return;
                } else if (m4611f(this.f3675c)) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f3675c);
                    float x3 = motionEvent.getX(findPointerIndex);
                    int i4 = (int) (x3 - this.f3682j[this.f3675c]);
                    int y3 = (int) (motionEvent.getY(findPointerIndex) - this.f3683k[this.f3675c]);
                    m4599b(this.f3679g.getLeft() + i4, this.f3679g.getTop() + y3, i4, y3);
                    m4604c(motionEvent);
                    return;
                }
                break;
            case 3:
                if (this.f3673a == 1) {
                    m4592a(0.0f, 0.0f);
                }
                mo4152a();
                break;
            case 5:
                int pointerId3 = motionEvent.getPointerId(actionIndex);
                float x4 = motionEvent.getX(actionIndex);
                float y4 = motionEvent.getY(actionIndex);
                m4593a(x4, y4, pointerId3);
                if (this.f3673a == 0) {
                    m4600b(mo4159b((int) x4, (int) y4), pointerId3);
                    int i5 = this.f3684l[pointerId3];
                    if ((this.f3678f & i5) != 0) {
                        this.f3691s.mo3908a(i5 & this.f3678f, pointerId3);
                    }
                    return;
                } else if (m4608d((int) x4, (int) y4)) {
                    m4600b(this.f3679g, pointerId3);
                    return;
                }
                break;
            case 6:
                int pointerId4 = motionEvent.getPointerId(actionIndex);
                if (this.f3673a == 1 && pointerId4 == this.f3675c) {
                    int pointerCount2 = motionEvent.getPointerCount();
                    while (true) {
                        if (i2 < pointerCount2) {
                            int pointerId5 = motionEvent.getPointerId(i2);
                            if (pointerId5 != this.f3675c) {
                                if (mo4159b((int) motionEvent.getX(i2), (int) motionEvent.getY(i2)) == this.f3679g && m4600b(this.f3679g, pointerId5)) {
                                    i = this.f3675c;
                                }
                            }
                            i2++;
                        } else {
                            i = -1;
                        }
                    }
                    if (i == -1) {
                        m4606d();
                    }
                }
                m4603c(pointerId4);
                return;
        }
    }

    /* renamed from: d */
    private boolean m4608d(int i, int i2) {
        return m4601b(this.f3679g, i, i2);
    }

    /* renamed from: b */
    private boolean m4600b(View view, int i) {
        if (view == this.f3679g && this.f3675c == i) {
            return true;
        }
        if (view == null || !this.f3691s.mo1367a(view, i)) {
            return false;
        }
        this.f3675c = i;
        mo4154a(view, i);
        return true;
    }

    /* renamed from: e */
    private int m4609e(int i, int i2) {
        int i3;
        if (i < this.f3693u.getLeft() + this.f3677e) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        if (i2 < this.f3693u.getTop() + this.f3677e) {
            i3 |= 4;
        }
        if (i > this.f3693u.getRight() - this.f3677e) {
            i3 |= 2;
        }
        if (i2 > this.f3693u.getBottom() - this.f3677e) {
            return i3 | 8;
        }
        return i3;
    }

    /* renamed from: a */
    public static C1060q m4591a(ViewGroup viewGroup, C1063a aVar) {
        return new C1060q(viewGroup.getContext(), viewGroup, aVar);
    }

    /* renamed from: c */
    private boolean m4605c(int i, int i2) {
        boolean z;
        boolean z2;
        if (!m4610e(i2)) {
            return false;
        }
        if ((i & 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        if ((i & 2) == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        float f = this.f3682j[i2] - this.f3680h[i2];
        float f2 = this.f3683k[i2] - this.f3681i[i2];
        if (!z || !z2) {
            if (z) {
                if (Math.abs(f) > ((float) this.f3674b)) {
                    return true;
                }
                return false;
            } else if (!z2 || Math.abs(f2) <= ((float) this.f3674b)) {
                return false;
            } else {
                return true;
            }
        } else if ((f * f) + (f2 * f2) > ((float) (this.f3674b * this.f3674b))) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: b */
    public final View mo4159b(int i, int i2) {
        for (int childCount = this.f3693u.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f3693u.getChildAt(C1063a.m4623b(childCount));
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: a */
    private void m4592a(float f, float f2) {
        this.f3692t = true;
        this.f3691s.mo1365a(this.f3679g, f, f2);
        this.f3692t = false;
        if (this.f3673a == 1) {
            mo4153a(0);
        }
    }

    /* renamed from: b */
    private static int m4597b(int i, int i2, int i3) {
        int abs = Math.abs(i);
        if (abs < i2) {
            return 0;
        }
        if (abs <= i3) {
            return i;
        }
        if (i > 0) {
            return i3;
        }
        return -i3;
    }

    /* renamed from: a */
    private static float m4587a(float f, float f2, float f3) {
        float abs = Math.abs(f);
        if (abs < f2) {
            return 0.0f;
        }
        if (abs <= f3) {
            return f;
        }
        if (f > 0.0f) {
            return f3;
        }
        return -f3;
    }

    /* renamed from: a */
    public static C1060q m4590a(ViewGroup viewGroup, float f, C1063a aVar) {
        C1060q a = m4591a(viewGroup, aVar);
        a.f3674b = (int) (((float) a.f3674b) * (1.0f / f));
        return a;
    }

    /* renamed from: b */
    private void m4598b(float f, float f2, int i) {
        boolean a = m4594a(f, f2, i, 1);
        if (m4594a(f2, f, i, 4)) {
            a |= true;
        }
        if (m4594a(f, f2, i, 2)) {
            a |= true;
        }
        if (m4594a(f2, f, i, 8)) {
            a |= true;
        }
        if (a) {
            int[] iArr = this.f3685m;
            iArr[i] = iArr[i] | a;
            this.f3691s.mo3910b(a ? 1 : 0, i);
        }
    }

    private C1060q(Context context, ViewGroup viewGroup, C1063a aVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        } else if (aVar != null) {
            this.f3693u = viewGroup;
            this.f3691s = aVar;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.f3677e = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.f3674b = viewConfiguration.getScaledTouchSlop();
            this.f3689q = (float) viewConfiguration.getScaledMaximumFlingVelocity();
            this.f3676d = (float) viewConfiguration.getScaledMinimumFlingVelocity();
            this.f3690r = new OverScroller(context, f3672v);
        } else {
            throw new IllegalArgumentException("Callback may not be null");
        }
    }

    /* renamed from: a */
    private int m4588a(int i, int i2, int i3) {
        int i4;
        if (i == 0) {
            return 0;
        }
        int width = this.f3693u.getWidth();
        float f = (float) (width / 2);
        float a = f + (m4586a(Math.min(1.0f, ((float) Math.abs(i)) / ((float) width))) * f);
        int abs = Math.abs(i2);
        if (abs > 0) {
            i4 = Math.round(Math.abs(a / ((float) abs)) * 1000.0f) * 4;
        } else {
            i4 = (int) (((((float) Math.abs(i)) / ((float) i3)) + 1.0f) * 256.0f);
        }
        return Math.min(i4, 600);
    }

    /* renamed from: b */
    public static boolean m4601b(View view, int i, int i2) {
        if (view != null && i >= view.getLeft() && i < view.getRight() && i2 >= view.getTop() && i2 < view.getBottom()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private void m4593a(float f, float f2, int i) {
        m4607d(i);
        float[] fArr = this.f3680h;
        this.f3682j[i] = f;
        fArr[i] = f;
        float[] fArr2 = this.f3681i;
        this.f3683k[i] = f2;
        fArr2[i] = f2;
        this.f3684l[i] = m4609e((int) f, (int) f2);
        this.f3687o |= 1 << i;
    }

    /* renamed from: b */
    private void m4599b(int i, int i2, int i3, int i4) {
        int left = this.f3679g.getLeft();
        int top = this.f3679g.getTop();
        if (i3 != 0) {
            i = this.f3691s.mo1368b(this.f3679g, i, i3);
            C0991u.m4225i(this.f3679g, i - left);
        }
        int i5 = i;
        if (i4 != 0) {
            i2 = this.f3691s.mo1363a(this.f3679g, i2, i4);
            C0991u.m4222h(this.f3679g, i2 - top);
        }
        int i6 = i2;
        if (i3 != 0 || i4 != 0) {
            this.f3691s.mo1366a(this.f3679g, i5, i6, i5 - left, i6 - top);
        }
    }

    /* renamed from: a */
    private int m4589a(View view, int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int b = m4597b(i3, (int) this.f3676d, (int) this.f3689q);
        int b2 = m4597b(i4, (int) this.f3676d, (int) this.f3689q);
        int abs = Math.abs(i);
        int abs2 = Math.abs(i2);
        int abs3 = Math.abs(b);
        int abs4 = Math.abs(b2);
        int i5 = abs3 + abs4;
        int i6 = abs + abs2;
        if (b != 0) {
            f = (float) abs3;
            f2 = (float) i5;
        } else {
            f = (float) abs;
            f2 = (float) i6;
        }
        float f5 = f / f2;
        if (b2 != 0) {
            f3 = (float) abs4;
            f4 = (float) i5;
        } else {
            f3 = (float) abs2;
            f4 = (float) i6;
        }
        float f6 = f3 / f4;
        return (int) ((((float) m4588a(i, b, this.f3691s.mo1578b(view))) * f5) + (((float) m4588a(i2, b2, this.f3691s.mo1362a(view))) * f6));
    }
}
