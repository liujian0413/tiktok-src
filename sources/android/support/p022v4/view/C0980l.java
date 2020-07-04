package android.support.p022v4.view;

import android.view.View;
import android.view.ViewParent;

/* renamed from: android.support.v4.view.l */
public final class C0980l {

    /* renamed from: a */
    public boolean f3397a;

    /* renamed from: b */
    private ViewParent f3398b;

    /* renamed from: c */
    private ViewParent f3399c;

    /* renamed from: d */
    private final View f3400d;

    /* renamed from: e */
    private int[] f3401e;

    /* renamed from: a */
    public final boolean mo3768a(int i, int i2, int[] iArr, int[] iArr2) {
        return mo3769a(i, i2, iArr, iArr2, 0);
    }

    /* renamed from: a */
    public final boolean mo3769a(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        int i4;
        int i5;
        if (this.f3397a) {
            ViewParent d = m4137d(i3);
            if (d == null) {
                return false;
            }
            if (i != 0 || i2 != 0) {
                if (iArr2 != null) {
                    this.f3400d.getLocationInWindow(iArr2);
                    i5 = iArr2[0];
                    i4 = iArr2[1];
                } else {
                    i5 = 0;
                    i4 = 0;
                }
                if (iArr == null) {
                    if (this.f3401e == null) {
                        this.f3401e = new int[2];
                    }
                    iArr = this.f3401e;
                }
                iArr[0] = 0;
                iArr[1] = 0;
                C0997x.m4267a(d, this.f3400d, i, i2, iArr, i3);
                if (iArr2 != null) {
                    this.f3400d.getLocationInWindow(iArr2);
                    iArr2[0] = iArr2[0] - i5;
                    iArr2[1] = iArr2[1] - i4;
                }
                if (iArr[0] == 0 && iArr[1] == 0) {
                    return false;
                }
                return true;
            } else if (iArr2 != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo3761a() {
        return mo3764a(0);
    }

    /* renamed from: b */
    public final void mo3770b() {
        mo3773c(0);
    }

    /* renamed from: c */
    public final void mo3772c() {
        C0991u.m4166C(this.f3400d);
    }

    public C0980l(View view) {
        this.f3400d = view;
    }

    /* renamed from: a */
    public final void mo3760a(boolean z) {
        if (this.f3397a) {
            C0991u.m4166C(this.f3400d);
        }
        this.f3397a = z;
    }

    /* renamed from: b */
    public final boolean mo3771b(int i) {
        return mo3765a(i, 0);
    }

    /* renamed from: c */
    public final void mo3773c(int i) {
        ViewParent d = m4137d(i);
        if (d != null) {
            C0997x.m4265a(d, this.f3400d, i);
            m4136a(i, (ViewParent) null);
        }
    }

    /* renamed from: d */
    private ViewParent m4137d(int i) {
        switch (i) {
            case 0:
                return this.f3398b;
            case 1:
                return this.f3399c;
            default:
                return null;
        }
    }

    /* renamed from: a */
    public final boolean mo3764a(int i) {
        if (m4137d(i) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private void m4136a(int i, ViewParent viewParent) {
        switch (i) {
            case 0:
                this.f3398b = viewParent;
                return;
            case 1:
                this.f3399c = viewParent;
                break;
        }
    }

    /* renamed from: a */
    public final boolean mo3762a(float f, float f2) {
        if (this.f3397a) {
            ViewParent d = m4137d(0);
            if (d != null) {
                return C0997x.m4268a(d, this.f3400d, f, f2);
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo3765a(int i, int i2) {
        if (mo3764a(i2)) {
            return true;
        }
        if (this.f3397a) {
            View view = this.f3400d;
            for (ViewParent parent = this.f3400d.getParent(); parent != null; parent = parent.getParent()) {
                if (C0997x.m4270a(parent, view, this.f3400d, i, i2)) {
                    m4136a(i2, parent);
                    C0997x.m4272b(parent, view, this.f3400d, i, i2);
                    return true;
                }
                if (parent instanceof View) {
                    view = (View) parent;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo3763a(float f, float f2, boolean z) {
        if (this.f3397a) {
            ViewParent d = m4137d(0);
            if (d != null) {
                return C0997x.m4269a(d, this.f3400d, f, f2, z);
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo3766a(int i, int i2, int i3, int i4, int[] iArr) {
        return mo3767a(i, i2, i3, i4, iArr, 0);
    }

    /* renamed from: a */
    public final boolean mo3767a(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        int i6;
        int i7;
        int[] iArr2 = iArr;
        if (this.f3397a) {
            ViewParent d = m4137d(i5);
            if (d == null) {
                return false;
            }
            if (i != 0 || i2 != 0 || i3 != 0 || i4 != 0) {
                if (iArr2 != null) {
                    this.f3400d.getLocationInWindow(iArr2);
                    i7 = iArr2[0];
                    i6 = iArr2[1];
                } else {
                    i7 = 0;
                    i6 = 0;
                }
                C0997x.m4266a(d, this.f3400d, i, i2, i3, i4, i5);
                if (iArr2 != null) {
                    this.f3400d.getLocationInWindow(iArr2);
                    iArr2[0] = iArr2[0] - i7;
                    iArr2[1] = iArr2[1] - i6;
                }
                return true;
            } else if (iArr2 != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
            }
        }
        return false;
    }
}
