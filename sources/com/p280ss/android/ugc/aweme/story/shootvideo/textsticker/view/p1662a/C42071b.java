package com.p280ss.android.ugc.aweme.story.shootvideo.textsticker.view.p1662a;

import com.p280ss.android.ugc.aweme.story.shootvideo.textsticker.view.C42088k;

/* renamed from: com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.a.b */
public final class C42071b {

    /* renamed from: a */
    public C42088k f109393a;

    /* renamed from: b */
    private float f109394b;

    /* renamed from: c */
    private float f109395c;

    /* renamed from: d */
    private float f109396d;

    /* renamed from: e */
    private float f109397e;

    /* renamed from: f */
    private float f109398f;

    /* renamed from: g */
    private float f109399g;

    /* renamed from: h */
    private boolean f109400h;

    /* renamed from: i */
    private boolean f109401i;

    /* renamed from: j */
    private float f109402j;

    /* renamed from: k */
    private float f109403k;

    /* renamed from: l */
    private float f109404l;

    /* renamed from: m */
    private float f109405m;

    /* renamed from: n */
    private int f109406n = 15;

    /* renamed from: a */
    public final void mo103371a() {
        this.f109401i = true;
        this.f109400h = false;
        this.f109394b = (-this.f109405m) / ((float) this.f109406n);
        this.f109395c = (-this.f109404l) / ((float) this.f109406n);
        this.f109396d = (-(this.f109402j - this.f109398f)) / ((float) this.f109406n);
        this.f109397e = (-(this.f109403k - this.f109399g)) / ((float) this.f109406n);
        this.f109393a.invalidate();
    }

    /* renamed from: a */
    public final void mo103373a(int i, int i2) {
        this.f109398f = (float) i;
        this.f109399g = (float) i2;
    }

    /* renamed from: e */
    private boolean m133859e(float f, float f2, float f3, float f4) {
        if (this.f109404l >= 0.0f) {
            if (f > 1.0f || f2 > 0.0f || f3 > this.f109398f || f4 > this.f109399g) {
                return false;
            }
            return true;
        } else if (f > 1.0f || f2 < 0.0f || f3 > this.f109398f || f4 > this.f109399g) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: c */
    public final void mo103375c(float f, float f2, float f3, float f4) {
        this.f109400h = true;
        this.f109401i = false;
        this.f109402j = f;
        this.f109403k = f2;
        this.f109404l = f4;
        this.f109405m = f3;
        this.f109394b = this.f109405m / ((float) this.f109406n);
        this.f109395c = this.f109404l / ((float) this.f109406n);
        this.f109396d = (f - this.f109398f) / ((float) this.f109406n);
        this.f109397e = (f2 - this.f109399g) / ((float) this.f109406n);
        this.f109393a.invalidate();
    }

    /* renamed from: d */
    private boolean m133858d(float f, float f2, float f3, float f4) {
        boolean z;
        boolean z2;
        if (this.f109404l < 0.0f ? f2 > this.f109404l : f2 < this.f109404l) {
            z = false;
        } else {
            z = true;
        }
        if (this.f109405m < 1.0f ? f > this.f109405m : f < this.f109405m) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z || !z2 || f3 < this.f109402j || f4 < this.f109403k) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo103372a(float f, float f2, float f3, float f4) {
        if (this.f109401i) {
            if (m133858d(f, f2, f3, f4)) {
                this.f109401i = false;
                this.f109400h = false;
                this.f109393a.mo103415b(this.f109405m);
                this.f109393a.mo103401a(this.f109404l, false);
                this.f109393a.setCenterX(this.f109402j);
                this.f109393a.setCenterY(this.f109403k);
                this.f109393a.invalidate();
                return;
            }
            if (f <= this.f109405m) {
                float f5 = f - this.f109394b;
                if (f5 > this.f109405m) {
                    f5 = this.f109405m;
                }
                this.f109393a.mo103415b(f5);
            } else {
                float f6 = f + this.f109394b;
                if (f6 < this.f109405m) {
                    f6 = this.f109405m;
                }
                this.f109393a.mo103415b(f6);
            }
            if (this.f109404l > 0.0f) {
                if (f2 <= this.f109404l) {
                    float f7 = f2 - this.f109395c;
                    if (f7 > this.f109404l) {
                        f7 = this.f109404l;
                    }
                    this.f109393a.mo103401a(f7, false);
                }
            } else if (f2 >= this.f109404l) {
                float f8 = f2 - this.f109395c;
                if (f8 < this.f109404l) {
                    f8 = this.f109404l;
                }
                this.f109393a.mo103401a(f8, false);
            }
            if (this.f109402j > this.f109398f) {
                if (f3 < this.f109402j) {
                    float f9 = f3 - this.f109396d;
                    if (f9 > this.f109402j) {
                        f9 = this.f109402j;
                    }
                    this.f109393a.setCenterX(f9);
                }
            } else if (f3 > this.f109402j) {
                float f10 = f3 - this.f109396d;
                if (f10 < this.f109402j) {
                    f10 = this.f109402j;
                }
                this.f109393a.setCenterX(f10);
            }
            if (this.f109403k > this.f109399g) {
                if (f4 < this.f109403k) {
                    float f11 = f4 - this.f109397e;
                    if (f11 > this.f109403k) {
                        f11 = this.f109403k;
                    }
                    this.f109393a.setCenterY(f11);
                }
            } else if (f4 > this.f109403k) {
                float f12 = f4 - this.f109397e;
                if (f12 < this.f109403k) {
                    f12 = this.f109403k;
                }
                this.f109393a.setCenterY(f12);
            }
            this.f109393a.invalidate();
        }
    }

    /* renamed from: b */
    public final void mo103374b(float f, float f2, float f3, float f4) {
        if (this.f109400h) {
            if (m133859e(f, f2, f3, f4)) {
                this.f109400h = false;
                this.f109401i = false;
                this.f109393a.mo103415b(1.0f);
                this.f109393a.mo103401a(0.0f, false);
                this.f109393a.setCenterX(this.f109398f);
                this.f109393a.setCenterY(this.f109399g);
                this.f109393a.invalidate();
                return;
            }
            if (f > 1.0f) {
                float f5 = f - this.f109394b;
                if (f5 < 1.0f) {
                    f5 = 1.0f;
                }
                this.f109393a.mo103415b(f5);
            } else {
                float f6 = f + this.f109394b;
                if (f6 > 1.0f) {
                    f6 = 1.0f;
                }
                this.f109393a.mo103415b(f6);
            }
            if (this.f109404l > 0.0f) {
                if (f2 >= 0.0f) {
                    float f7 = f2 - this.f109395c;
                    if (f7 < 0.0f) {
                        f7 = 0.0f;
                    }
                    this.f109393a.mo103401a(f7, false);
                }
            } else if (f2 <= 0.0f) {
                float f8 = f2 - this.f109395c;
                if (f8 > 0.0f) {
                    f8 = 0.0f;
                }
                this.f109393a.mo103401a(f8, false);
            }
            if (this.f109402j > this.f109398f) {
                if (f3 > this.f109398f) {
                    float f9 = f3 - this.f109396d;
                    if (f9 < this.f109398f) {
                        f9 = this.f109398f;
                    }
                    this.f109393a.setCenterX(f9);
                }
            } else if (f3 < this.f109398f) {
                float f10 = f3 - this.f109396d;
                if (f10 > this.f109398f) {
                    f10 = this.f109398f;
                }
                this.f109393a.setCenterX(f10);
            }
            if (this.f109403k > this.f109399g) {
                if (f4 > this.f109399g) {
                    float f11 = f4 - this.f109397e;
                    if (f11 < this.f109399g) {
                        f11 = this.f109399g;
                    }
                    this.f109393a.setCenterY(f11);
                }
            } else if (f4 < this.f109399g) {
                float f12 = f4 - this.f109397e;
                if (f12 > this.f109399g) {
                    f12 = this.f109399g;
                }
                this.f109393a.setCenterY(f12);
            }
            this.f109393a.invalidate();
        }
    }
}
