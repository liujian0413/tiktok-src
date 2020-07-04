package android.support.p029v7.widget;

import android.content.Context;
import android.graphics.PointF;
import android.support.p029v7.widget.RecyclerView.C1273i;
import android.support.p029v7.widget.RecyclerView.C1287r;
import android.support.p029v7.widget.RecyclerView.C1287r.C1288a;
import android.support.p029v7.widget.RecyclerView.C1290s;
import android.support.p029v7.widget.RecyclerView.LayoutParams;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheTTnetProxyTimeoutExperiment;

/* renamed from: android.support.v7.widget.LinearSmoothScroller */
public class LinearSmoothScroller extends C1287r {

    /* renamed from: a */
    protected final LinearInterpolator f4783a = new LinearInterpolator();

    /* renamed from: b */
    protected final DecelerateInterpolator f4784b = new DecelerateInterpolator();

    /* renamed from: c */
    protected PointF f4785c;

    /* renamed from: d */
    protected int f4786d = 0;

    /* renamed from: e */
    protected int f4787e = 0;

    /* renamed from: f */
    private final float f4788f;

    /* renamed from: b */
    private static int m5778b(int i, int i2) {
        int i3 = i - i2;
        if (i * i3 <= 0) {
            return 0;
        }
        return i3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo5468a() {
        this.f4787e = 0;
        this.f4786d = 0;
        this.f4785c = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo5471b() {
        if (this.f4785c == null || this.f4785c.x == 0.0f) {
            return 0;
        }
        if (this.f4785c.x > 0.0f) {
            return 1;
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public int mo5473c() {
        if (this.f4785c == null || this.f4785c.y == 0.0f) {
            return 0;
        }
        if (this.f4785c.y > 0.0f) {
            return 1;
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public float mo5464a(DisplayMetrics displayMetrics) {
        return 25.0f / ((float) displayMetrics.densityDpi);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo5465a(int i) {
        double b = (double) mo5472b(i);
        Double.isNaN(b);
        return (int) Math.ceil(b / 0.3356d);
    }

    public LinearSmoothScroller(Context context) {
        this.f4788f = mo5464a(context.getResources().getDisplayMetrics());
    }

    /* renamed from: a */
    private void m5777a(C1288a aVar) {
        PointF c = mo5861c(this.f4993g);
        if (c == null || (c.x == 0.0f && c.y == 0.0f)) {
            aVar.f5000d = this.f4993g;
            mo5862d();
            return;
        }
        m6246a(c);
        this.f4785c = c;
        this.f4786d = (int) (c.x * 10000.0f);
        this.f4787e = (int) (c.y * 10000.0f);
        aVar.mo5864a((int) (((float) this.f4786d) * 1.2f), (int) (((float) this.f4787e) * 1.2f), (int) (((float) mo5472b(VideoCacheTTnetProxyTimeoutExperiment.DEFAULT)) * 1.2f), this.f4783a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo5472b(int i) {
        return (int) Math.ceil((double) (((float) Math.abs(i)) * this.f4788f));
    }

    /* renamed from: b */
    private int m5779b(View view, int i) {
        C1273i iVar = this.f4994h;
        if (iVar == null || !iVar.mo5441f()) {
            return 0;
        }
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        return mo5466a(iVar.mo5789h(view) - layoutParams.topMargin, iVar.mo5793j(view) + layoutParams.bottomMargin, iVar.mo5802u(), iVar.f4958J - iVar.mo5804w(), i);
    }

    /* renamed from: a */
    public final int mo5467a(View view, int i) {
        C1273i iVar = this.f4994h;
        if (iVar == null || !iVar.mo5438e()) {
            return 0;
        }
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        return mo5466a(iVar.mo5787g(view) - layoutParams.leftMargin, iVar.mo5791i(view) + layoutParams.rightMargin, iVar.mo5801t(), iVar.f4957I - iVar.mo5803v(), i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo5470a(View view, C1290s sVar, C1288a aVar) {
        int a = mo5467a(view, mo5471b());
        int b = m5779b(view, mo5473c());
        int a2 = mo5465a((int) Math.sqrt((double) ((a * a) + (b * b))));
        if (a2 > 0) {
            aVar.mo5864a(-a, -b, a2, this.f4784b);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo5469a(int i, int i2, C1290s sVar, C1288a aVar) {
        if (mo5863e() == 0) {
            mo5862d();
            return;
        }
        this.f4786d = m5778b(this.f4786d, i);
        this.f4787e = m5778b(this.f4787e, i2);
        if (this.f4786d == 0 && this.f4787e == 0) {
            m5777a(aVar);
        }
    }

    /* renamed from: a */
    public int mo5466a(int i, int i2, int i3, int i4, int i5) {
        switch (i5) {
            case -1:
                return i3 - i;
            case 0:
                int i6 = i3 - i;
                if (i6 > 0) {
                    return i6;
                }
                int i7 = i4 - i2;
                if (i7 < 0) {
                    return i7;
                }
                return 0;
            case 1:
                return i4 - i2;
            default:
                throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
    }
}
