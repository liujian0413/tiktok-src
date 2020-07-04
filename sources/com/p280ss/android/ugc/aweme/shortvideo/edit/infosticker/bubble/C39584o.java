package com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.bubble;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.View;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.ugc.aweme.base.utils.C23482j;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.shortvideo.C39804em;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.bubble.o */
public final class C39584o extends C39570c {

    /* renamed from: e */
    public static final float f102793e;

    /* renamed from: f */
    public static final float f102794f;

    /* renamed from: g */
    public static final float f102795g;

    /* renamed from: h */
    public static final float f102796h;

    /* renamed from: i */
    public static final float f102797i;

    /* renamed from: j */
    public static final float f102798j;

    /* renamed from: k */
    public static final float f102799k;

    /* renamed from: l */
    public static final float f102800l;

    /* renamed from: m */
    public static final float f102801m;

    /* renamed from: n */
    public static final C39585a f102802n = new C39585a(null);

    /* renamed from: o */
    private RectF f102803o = new RectF();

    /* renamed from: p */
    private int f102804p;

    /* renamed from: q */
    private int f102805q;

    /* renamed from: r */
    private float f102806r;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.bubble.o$a */
    public static final class C39585a {
        private C39585a() {
        }

        public /* synthetic */ C39585a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: a */
    private static float m126503a(float f) {
        while (f < 0.0f) {
            f += 360.0f;
        }
        while (f > 360.0f) {
            f -= 360.0f;
        }
        return f;
    }

    /* renamed from: v */
    private final PointF m126512v() {
        m126511u();
        return new PointF((float) this.f102804p, ((float) this.f102805q) - (((float) mo98555j()) - f102793e));
    }

    /* renamed from: y */
    private final float m126515y() {
        double d = (double) f102795g;
        double cos = Math.cos(Math.toRadians((double) m126503a(this.f102806r)));
        Double.isNaN(d);
        return Math.abs((float) (d * cos));
    }

    /* renamed from: u */
    private final void m126511u() {
        mo98537c(48);
        mo98542f((int) (((float) mo98556k()) / 2.0f));
        int g = mo98544g();
        View contentView = getContentView();
        C7573i.m23582a((Object) contentView, "contentView");
        Context context = contentView.getContext();
        C7573i.m23582a((Object) context, "contentView.context");
        mo98542f(g - ((int) C39575f.m126467a(context, 3.5f)));
    }

    /* renamed from: x */
    private final float m126514x() {
        double d;
        float a = m126503a(this.f102806r);
        double d2 = (double) f102795g;
        double sin = Math.sin(Math.toRadians((double) a));
        Double.isNaN(d2);
        double d3 = d2 * sin;
        if (a <= 90.0f) {
            d = Math.abs(d3);
        } else if (a <= 180.0f || a > 270.0f) {
            d = -Math.abs(d3);
        } else {
            d = Math.abs(d3);
        }
        return (float) d;
    }

    /* renamed from: t */
    private final boolean m126510t() {
        if (m126509b(this.f102803o, this.f102806r, false).y - (((float) mo98555j()) - f102796h) < f102797i) {
            PointF b = m126509b(this.f102803o, this.f102806r, true);
            View contentView = getContentView();
            C7573i.m23582a((Object) contentView, "contentView");
            if (((float) C23482j.m77095a(contentView.getContext())) - (b.y + (((float) mo98555j()) - f102796h)) < f102797i) {
                return true;
            }
        }
        return false;
    }

    static {
        Application application = C35563c.f93238a;
        C7573i.m23582a((Object) application, "AVEnv.application");
        f102793e = C9738o.m28708b(application.getApplicationContext(), 37.0f);
        Application application2 = C35563c.f93238a;
        C7573i.m23582a((Object) application2, "AVEnv.application");
        f102794f = C9738o.m28708b(application2.getApplicationContext(), 7.0f);
        Application application3 = C35563c.f93238a;
        C7573i.m23582a((Object) application3, "AVEnv.application");
        f102795g = C9738o.m28708b(application3.getApplicationContext(), 8.0f);
        Application application4 = C35563c.f93238a;
        C7573i.m23582a((Object) application4, "AVEnv.application");
        f102796h = C9738o.m28708b(application4.getApplicationContext(), 30.0f);
        Application application5 = C35563c.f93238a;
        C7573i.m23582a((Object) application5, "AVEnv.application");
        f102797i = C9738o.m28708b(application5.getApplicationContext(), 8.0f);
        Application application6 = C35563c.f93238a;
        C7573i.m23582a((Object) application6, "AVEnv.application");
        f102798j = C9738o.m28708b(application6.getApplicationContext(), 1.0f);
        Application application7 = C35563c.f93238a;
        C7573i.m23582a((Object) application7, "AVEnv.application");
        f102799k = C9738o.m28708b(application7.getApplicationContext(), 12.0f);
        Application application8 = C35563c.f93238a;
        C7573i.m23582a((Object) application8, "AVEnv.application");
        f102800l = C9738o.m28708b(application8.getApplicationContext(), 42.0f);
        Application application9 = C35563c.f93238a;
        C7573i.m23582a((Object) application9, "AVEnv.application");
        f102801m = C9738o.m28708b(application9.getApplicationContext(), 48.0f);
    }

    /* renamed from: w */
    private final PointF m126513w() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        m126511u();
        PointF a = m126509b(this.f102803o, this.f102806r, false);
        boolean z7 = true;
        if (a.y - (((float) mo98555j()) - f102796h) < f102797i) {
            mo98537c(80);
            a = m126509b(this.f102803o, this.f102806r, true);
        }
        RectF rectF = this.f102803o;
        float f = this.f102806r;
        if (bO_() == 80) {
            z = true;
        } else {
            z = false;
        }
        float a2 = m126504a(rectF, f, z);
        if (a.x - ((((float) mo98556k()) - f102796h) / 2.0f) < f102798j) {
            mo98539d((int) (f102798j - (a.x - ((((float) mo98556k()) - f102796h) / 2.0f))));
            RectF rectF2 = this.f102803o;
            float f2 = this.f102806r;
            if (bO_() == 80) {
                z5 = true;
            } else {
                z5 = false;
            }
            mo98540e((int) m126508b(rectF2, f2, z5, (float) bP_()));
            float f3 = a2 / 2.0f;
            if ((((float) bP_()) < f3 && f3 - ((float) bP_()) < f102799k) || ((float) bP_()) > Math.abs(f3)) {
                mo98542f(mo98544g() - ((int) (f102799k - (Math.abs(f3) - ((float) bP_())))));
                if (((float) Math.abs(mo98544g())) < f102800l || mo98544g() < 0) {
                    mo98542f((int) f102800l);
                }
                RectF rectF3 = this.f102803o;
                float f4 = this.f102806r;
                if (bO_() == 80) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                mo98540e((int) m126508b(rectF3, f4, z6, Math.abs(f3) - f102799k));
            }
        }
        if (((float) C23482j.m77098b(this.f102772b)) - (a.x + ((((float) mo98556k()) - f102800l) / 2.0f)) < f102798j) {
            mo98539d((int) ((((float) C23482j.m77098b(this.f102772b)) - (a.x + ((((float) mo98556k()) - f102800l) / 2.0f))) - f102798j));
            RectF rectF4 = this.f102803o;
            float f5 = this.f102806r;
            if (bO_() == 80) {
                z3 = true;
            } else {
                z3 = false;
            }
            mo98540e((int) m126508b(rectF4, f5, z3, (float) bP_()));
            float f6 = a2 / 2.0f;
            if ((((float) (-bP_())) < f6 && ((float) bP_()) + f6 < f102799k) || ((float) bP_()) > Math.abs(f6)) {
                mo98542f(mo98544g() + ((int) (f102799k - (Math.abs(f6) + ((float) bP_())))));
                if (((float) Math.abs(mo98544g())) > ((float) mo98556k()) - f102801m) {
                    mo98542f((int) (((float) mo98556k()) - f102801m));
                }
                RectF rectF5 = this.f102803o;
                float f7 = this.f102806r;
                if (bO_() == 80) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                mo98540e((int) m126508b(rectF5, f7, z4, f102799k - Math.abs(f6)));
            }
        }
        if (a.y < f102797i) {
            mo98540e((int) (f102797i - a.y));
            RectF rectF6 = this.f102803o;
            float f8 = this.f102806r;
            if (bO_() == 80) {
                z2 = true;
            } else {
                z2 = false;
            }
            mo98539d((int) m126505a(rectF6, f8, z2, (float) mo98536c()));
        }
        float f9 = a.y;
        View contentView = getContentView();
        C7573i.m23582a((Object) contentView, "contentView");
        if (f9 > (((float) C23482j.m77105f(contentView.getContext())) - f102797i) - (((float) mo98555j()) - f102796h)) {
            View contentView2 = getContentView();
            C7573i.m23582a((Object) contentView2, "contentView");
            mo98540e((int) (((((float) C23482j.m77105f(contentView2.getContext())) - f102797i) - (((float) mo98555j()) - f102796h)) - a.y));
            RectF rectF7 = this.f102803o;
            float f10 = this.f102806r;
            if (bO_() != 80) {
                z7 = false;
            }
            mo98539d((int) m126505a(rectF7, f10, z7, (float) mo98536c()));
        }
        if (!C39804em.m127436a()) {
            mo98540e(mo98536c() - C23482j.m77101d());
        }
        return a;
    }

    /* renamed from: b */
    public final void mo98575b(View view) {
        PointF pointF;
        Activity activity = this.f102772b;
        C7573i.m23582a((Object) activity, "activity");
        if (!activity.isFinishing() && view != null && view.getWindowToken() != null) {
            getContentView().removeCallbacks(mo98564s());
            if (!isShowing()) {
                if (m126510t()) {
                    pointF = m126512v();
                } else {
                    pointF = m126513w();
                }
                mo98529b().mo98514a(mo98532b(bO_()), (float) mo98544g());
                mo98558m();
                int bO_ = bO_();
                if (bO_ == 48) {
                    showAtLocation(view, 0, (int) (((pointF.x + ((float) bP_())) - (((float) mo98556k()) / 2.0f)) + m126514x()), (int) (((pointF.y + ((float) mo98536c())) - (((float) mo98555j()) - f102793e)) - m126515y()));
                    mo98547a(true, bO_());
                } else if (bO_ == 80) {
                    showAtLocation(view, 0, (int) (((pointF.x + ((float) bP_())) - (((float) mo98556k()) / 2.0f)) + m126514x()), (int) (pointF.y + ((float) mo98536c()) + f102794f + m126515y()));
                    mo98547a(true, bO_());
                }
                mo98552e(false);
                if (mo98563r() > 0) {
                    getContentView().postDelayed(mo98564s(), mo98563r());
                }
            } else {
                super.dismiss();
            }
        }
    }

    public C39584o(Activity activity, boolean z) {
        super(activity, false);
    }

    /* renamed from: a */
    private static float[] m126507a(RectF rectF, float f) {
        float[] fArr = {rectF.left, rectF.top, rectF.right, rectF.top, rectF.left, rectF.bottom, rectF.right, rectF.bottom};
        Matrix matrix = new Matrix();
        matrix.postRotate(f, ((fArr[2] - fArr[0]) / 2.0f) + fArr[0], ((fArr[5] - fArr[3]) / 2.0f) + fArr[3]);
        matrix.mapPoints(fArr);
        return fArr;
    }

    /* renamed from: a */
    private final float m126504a(RectF rectF, float f, boolean z) {
        float[] a = m126507a(rectF, f);
        if (a[1] + a[3] >= a[5] + a[7] || z) {
            return a[6] - a[4];
        }
        return a[2] - a[0];
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final PointF m126509b(RectF rectF, float f, boolean z) {
        PointF pointF = new PointF();
        float[] a = m126507a(rectF, f);
        if (a[1] + a[3] >= a[5] + a[7] || z) {
            pointF.set((a[4] + a[6]) / 2.0f, (a[5] + a[7]) / 2.0f);
        } else {
            pointF.set((a[0] + a[2]) / 2.0f, (a[1] + a[3]) / 2.0f);
        }
        return pointF;
    }

    /* renamed from: a */
    public final void mo98574a(RectF rectF, int i, int i2, float f) {
        C7573i.m23587b(rectF, "helpBoxRect");
        this.f102803o = rectF;
        this.f102804p = i;
        this.f102805q = i2;
        this.f102806r = f;
    }

    /* renamed from: a */
    private final float m126505a(RectF rectF, float f, boolean z, float f2) {
        float f3;
        float[] a = m126507a(rectF, f);
        if (a[1] + a[3] >= a[5] + a[7] || z) {
            f3 = (a[7] - a[5]) / (a[6] - a[4]);
        } else {
            f3 = (a[3] - a[1]) / (a[2] - a[0]);
        }
        return f2 / f3;
    }

    /* renamed from: b */
    private final float m126508b(RectF rectF, float f, boolean z, float f2) {
        float f3;
        float[] a = m126507a(rectF, f);
        if (a[1] + a[3] >= a[5] + a[7] || z) {
            f3 = (a[7] - a[5]) / (a[6] - a[4]);
        } else {
            f3 = (a[3] - a[1]) / (a[2] - a[0]);
        }
        float abs = (Math.abs(a[2] - a[0]) * f3) / 2.0f;
        float f4 = f3 * f2;
        if (Math.abs(abs) >= Math.abs(f4)) {
            return f4;
        }
        if ((f4 < 0.0f && abs > 0.0f) || (f4 > 0.0f && abs < 0.0f)) {
            abs = -abs;
        }
        return abs;
    }
}
