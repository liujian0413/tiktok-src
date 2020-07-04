package com.swmansion.gesturehandler;

import android.view.MotionEvent;
import android.view.MotionEvent.PointerCoords;
import android.view.MotionEvent.PointerProperties;
import android.view.View;
import com.swmansion.gesturehandler.C46347b;
import java.util.Arrays;

/* renamed from: com.swmansion.gesturehandler.b */
public class C46347b<T extends C46347b> {

    /* renamed from: a */
    private static int f119281a = 11;

    /* renamed from: b */
    private static PointerProperties[] f119282b;

    /* renamed from: p */
    private static PointerCoords[] f119283p;

    /* renamed from: c */
    public int f119284c;

    /* renamed from: d */
    public View f119285d;

    /* renamed from: e */
    public int f119286e;

    /* renamed from: f */
    public float f119287f;

    /* renamed from: g */
    public float f119288g;

    /* renamed from: h */
    public boolean f119289h;

    /* renamed from: i */
    public boolean f119290i = true;

    /* renamed from: j */
    public float f119291j;

    /* renamed from: k */
    public float f119292k;

    /* renamed from: l */
    public int f119293l;

    /* renamed from: m */
    int f119294m;

    /* renamed from: n */
    boolean f119295n;

    /* renamed from: o */
    boolean f119296o;

    /* renamed from: q */
    private final int[] f119297q = new int[f119281a];

    /* renamed from: r */
    private int f119298r;

    /* renamed from: s */
    private float[] f119299s;

    /* renamed from: t */
    private float f119300t;

    /* renamed from: u */
    private float f119301u;

    /* renamed from: v */
    private boolean f119302v;

    /* renamed from: w */
    private C46349d f119303w;

    /* renamed from: x */
    private C46356i<T> f119304x;

    /* renamed from: y */
    private C46348c f119305y;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo115188a() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo115190b() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo115203b(int i, int i2) {
    }

    /* renamed from: a */
    public final boolean mo115200a(C46347b bVar) {
        for (int i = 0; i < this.f119297q.length; i++) {
            if (this.f119297q[i] != -1 && bVar.f119297q[i] != -1) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo115199a(View view, float f, float f2) {
        float f3;
        float width = (float) view.getWidth();
        float height = (float) view.getHeight();
        float f4 = 0.0f;
        if (this.f119299s != null) {
            float f5 = this.f119299s[0];
            float f6 = this.f119299s[1];
            float f7 = this.f119299s[2];
            float f8 = this.f119299s[3];
            f3 = mo115226a(f5) ? 0.0f - f5 : 0.0f;
            if (mo115226a(f6)) {
                f4 = 0.0f - f8;
            }
            if (mo115226a(f7)) {
                width += f7;
            }
            if (mo115226a(f8)) {
                height += f8;
            }
            float f9 = this.f119299s[4];
            float f10 = this.f119299s[5];
            if (mo115226a(f9)) {
                if (!mo115226a(f5)) {
                    f3 = f7 - f9;
                } else if (!mo115226a(f7)) {
                    width = f5 + f9;
                }
            }
            if (mo115226a(f10)) {
                if (!mo115226a(f4)) {
                    f4 = height - f10;
                } else if (!mo115226a(height)) {
                    height = f4 + f10;
                }
            }
        } else {
            f3 = 0.0f;
        }
        return f >= f3 && f <= width && f2 >= f4 && f2 <= height;
    }

    /* renamed from: j */
    public final float mo115217j() {
        return this.f119291j - this.f119300t;
    }

    /* renamed from: k */
    public final float mo115218k() {
        return this.f119292k - this.f119301u;
    }

    /* renamed from: f */
    public final void mo115213f() {
        if (this.f119286e == 0 || this.f119286e == 2) {
            mo115237d(4);
        }
    }

    /* renamed from: g */
    public final void mo115214g() {
        if (this.f119286e == 0) {
            mo115237d(2);
        }
    }

    /* renamed from: h */
    public final void mo115215h() {
        if (this.f119286e == 2 || this.f119286e == 4) {
            mo115237d(5);
        }
    }

    /* renamed from: l */
    private int mo115245l() {
        int i = 0;
        while (i < this.f119298r) {
            int i2 = 0;
            while (i2 < this.f119297q.length && this.f119297q[i2] != i) {
                i2++;
            }
            if (i2 == this.f119297q.length) {
                return i;
            }
            i++;
        }
        return i;
    }

    /* renamed from: c */
    public final boolean mo115207c() {
        if (!this.f119290i || this.f119286e == 1 || this.f119286e == 3 || this.f119286e == 5 || this.f119298r <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public final void mo115211e() {
        if (this.f119286e == 4 || this.f119286e == 0 || this.f119286e == 2) {
            mo115237d(1);
        }
    }

    /* renamed from: i */
    public final void mo115216i() {
        this.f119285d = null;
        this.f119303w = null;
        Arrays.fill(this.f119297q, -1);
        this.f119298r = 0;
        mo115190b();
    }

    public String toString() {
        String str;
        if (this.f119285d == null) {
            str = null;
        } else {
            str = this.f119285d.getClass().getSimpleName();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("@[");
        sb.append(this.f119284c);
        sb.append("]:");
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: d */
    public final void mo115209d() {
        if (this.f119286e == 4 || this.f119286e == 0 || this.f119286e == 2) {
            mo115188a();
            mo115237d(3);
        }
    }

    /* renamed from: a */
    public final T mo115193a(C46348c cVar) {
        this.f119305y = cVar;
        return this;
    }

    /* renamed from: a */
    public final C46347b mo115194a(C46356i<T> iVar) {
        this.f119304x = iVar;
        return this;
    }

    /* renamed from: a */
    private static boolean mo115226a(float f) {
        if (!Float.isNaN(f)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final T mo115201b(boolean z) {
        if (this.f119285d != null) {
            mo115209d();
        }
        this.f119290i = z;
        return this;
    }

    /* renamed from: c */
    public final boolean mo115208c(C46347b bVar) {
        if (bVar == this || this.f119305y == null) {
            return false;
        }
        return this.f119305y.mo115220a(this, bVar);
    }

    /* renamed from: e */
    public boolean mo115212e(C46347b bVar) {
        return (bVar == this || this.f119305y == null) ? false : false;
    }

    /* renamed from: d */
    private void mo115237d(int i) {
        if (this.f119286e != i) {
            int i2 = this.f119286e;
            this.f119286e = i;
            this.f119303w.mo115222a(this, i, i2);
            mo115203b(i, i2);
        }
    }

    /* renamed from: a */
    public final T mo115195a(boolean z) {
        this.f119302v = z;
        return this;
    }

    /* renamed from: b */
    public final void mo115202b(int i) {
        if (this.f119297q[i] != -1) {
            this.f119297q[i] = -1;
            this.f119298r--;
        }
    }

    /* renamed from: c */
    private static void mo115234c(int i) {
        if (f119282b == null) {
            f119282b = new PointerProperties[f119281a];
            f119283p = new PointerCoords[f119281a];
        }
        while (i > 0) {
            int i2 = i - 1;
            if (f119282b[i2] == null) {
                f119282b[i2] = new PointerProperties();
                f119283p[i2] = new PointerCoords();
                i--;
            } else {
                return;
            }
        }
    }

    /* renamed from: d */
    private boolean m145493d(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() != this.f119298r) {
            return true;
        }
        for (int i = 0; i < this.f119297q.length; i++) {
            if (this.f119297q[i] != -1 && this.f119297q[i] != i) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo115204b(MotionEvent motionEvent) {
        if (this.f119304x != null) {
            this.f119304x.mo115231a(this, motionEvent);
        }
    }

    /* renamed from: a */
    public final void mo115196a(int i) {
        if (this.f119297q[i] == -1) {
            this.f119297q[i] = mo115245l();
            this.f119298r++;
        }
    }

    /* renamed from: b */
    public boolean mo115205b(C46347b bVar) {
        return (bVar == this || this.f119305y != null) ? false : false;
    }

    /* renamed from: c */
    public final void mo115206c(MotionEvent motionEvent) {
        if (this.f119290i && this.f119286e != 3 && this.f119286e != 1 && this.f119286e != 5 && this.f119298r > 0) {
            MotionEvent e = m145494e(motionEvent);
            this.f119287f = e.getX();
            this.f119288g = e.getY();
            this.f119293l = e.getPointerCount();
            this.f119289h = mo115199a(this.f119285d, this.f119287f, this.f119288g);
            if (!this.f119302v || this.f119289h) {
                this.f119291j = C46352f.m145555a(e, true);
                this.f119292k = C46352f.m145556b(e, true);
                this.f119300t = e.getRawX() - e.getX();
                this.f119301u = e.getRawY() - e.getY();
                mo115189a(e);
                if (e != motionEvent) {
                    e.recycle();
                }
            } else if (this.f119286e == 4) {
                mo115209d();
            } else {
                if (this.f119286e == 2) {
                    mo115211e();
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x006a  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.view.MotionEvent m145494e(android.view.MotionEvent r26) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            boolean r2 = r25.m145493d(r26)
            if (r2 != 0) goto L_0x000b
            return r1
        L_0x000b:
            int r2 = r26.getActionMasked()
            r3 = 2
            r4 = 5
            r5 = 0
            r6 = -1
            r7 = 1
            if (r2 == 0) goto L_0x0036
            if (r2 != r4) goto L_0x0019
            goto L_0x0036
        L_0x0019:
            r4 = 6
            if (r2 == r7) goto L_0x0022
            if (r2 != r4) goto L_0x001f
            goto L_0x0022
        L_0x001f:
            r3 = r2
            r2 = -1
            goto L_0x004a
        L_0x0022:
            int r2 = r26.getActionIndex()
            int r8 = r1.getPointerId(r2)
            int[] r9 = r0.f119297q
            r8 = r9[r8]
            if (r8 == r6) goto L_0x004a
            int r3 = r0.f119298r
            if (r3 != r7) goto L_0x0049
            r4 = 1
            goto L_0x0049
        L_0x0036:
            int r2 = r26.getActionIndex()
            int r8 = r1.getPointerId(r2)
            int[] r9 = r0.f119297q
            r8 = r9[r8]
            if (r8 == r6) goto L_0x004a
            int r3 = r0.f119298r
            if (r3 != r7) goto L_0x0049
            r4 = 0
        L_0x0049:
            r3 = r4
        L_0x004a:
            int r4 = r0.f119298r
            mo115234c(r4)
            float r4 = r26.getX()
            float r7 = r26.getY()
            float r8 = r26.getRawX()
            float r9 = r26.getRawY()
            r1.setLocation(r8, r9)
            int r8 = r26.getPointerCount()
            r13 = r3
            r14 = 0
        L_0x0068:
            if (r5 >= r8) goto L_0x0096
            int r3 = r1.getPointerId(r5)
            int[] r9 = r0.f119297q
            r9 = r9[r3]
            if (r9 == r6) goto L_0x0093
            android.view.MotionEvent$PointerProperties[] r9 = f119282b
            r9 = r9[r14]
            r1.getPointerProperties(r5, r9)
            android.view.MotionEvent$PointerProperties[] r9 = f119282b
            r9 = r9[r14]
            int[] r10 = r0.f119297q
            r3 = r10[r3]
            r9.id = r3
            android.view.MotionEvent$PointerCoords[] r3 = f119283p
            r3 = r3[r14]
            r1.getPointerCoords(r5, r3)
            if (r5 != r2) goto L_0x0091
            int r3 = r14 << 8
            r13 = r13 | r3
        L_0x0091:
            int r14 = r14 + 1
        L_0x0093:
            int r5 = r5 + 1
            goto L_0x0068
        L_0x0096:
            long r9 = r26.getDownTime()
            long r11 = r26.getEventTime()
            android.view.MotionEvent$PointerProperties[] r15 = f119282b
            android.view.MotionEvent$PointerCoords[] r16 = f119283p
            int r17 = r26.getMetaState()
            int r18 = r26.getButtonState()
            float r19 = r26.getXPrecision()
            float r20 = r26.getYPrecision()
            int r21 = r26.getDeviceId()
            int r22 = r26.getEdgeFlags()
            int r23 = r26.getSource()
            int r24 = r26.getFlags()
            android.view.MotionEvent r2 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r1.setLocation(r4, r7)
            r2.setLocation(r4, r7)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swmansion.gesturehandler.C46347b.m145494e(android.view.MotionEvent):android.view.MotionEvent");
    }

    /* renamed from: d */
    public boolean mo115210d(C46347b bVar) {
        if (bVar == this) {
            return true;
        }
        if (this.f119305y != null) {
            return this.f119305y.mo115221b(this, bVar);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo115189a(MotionEvent motionEvent) {
        mo115237d(1);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo115197a(int i, int i2) {
        if (this.f119304x != null) {
            this.f119304x.mo115230a(this, i, i2);
        }
    }

    /* renamed from: a */
    public final void mo115198a(View view, C46349d dVar) {
        if (this.f119285d == null && this.f119303w == null) {
            Arrays.fill(this.f119297q, -1);
            this.f119298r = 0;
            this.f119286e = 0;
            this.f119285d = view;
            this.f119303w = dVar;
            return;
        }
        throw new IllegalStateException("Already prepared or hasn't been reset");
    }

    /* renamed from: a */
    public final T mo115192a(float f, float f2, float f3, float f4, float f5, float f6) {
        if (this.f119299s == null) {
            this.f119299s = new float[6];
        }
        this.f119299s[0] = f;
        this.f119299s[1] = f2;
        this.f119299s[2] = f3;
        this.f119299s[3] = f4;
        this.f119299s[4] = f5;
        this.f119299s[5] = f6;
        if (mo115226a(f5) && mo115226a(f) && mo115226a(f3)) {
            throw new IllegalArgumentException("Cannot have all of left, right and width defined");
        } else if (mo115226a(f5) && !mo115226a(f) && !mo115226a(f3)) {
            throw new IllegalArgumentException("When width is set one of left or right pads need to be defined");
        } else if (mo115226a(f6) && mo115226a(f4) && mo115226a(f2)) {
            throw new IllegalArgumentException("Cannot have all of top, bottom and height defined");
        } else if (!mo115226a(f6) || mo115226a(f4) || mo115226a(f2)) {
            return this;
        } else {
            throw new IllegalArgumentException("When height is set one of top or bottom pads need to be defined");
        }
    }
}
