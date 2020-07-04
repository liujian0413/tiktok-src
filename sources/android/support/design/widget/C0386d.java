package android.support.design.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.GradientDrawable;
import android.os.Build.VERSION;
import android.view.View;

/* renamed from: android.support.design.widget.d */
final class C0386d extends GradientDrawable {

    /* renamed from: a */
    private final Paint f1668a = new Paint(1);

    /* renamed from: b */
    private final RectF f1669b;

    /* renamed from: c */
    private int f1670c;

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo1803b() {
        m1712a(0.0f, 0.0f, 0.0f, 0.0f);
    }

    C0386d() {
        m1716c();
        this.f1669b = new RectF();
    }

    /* renamed from: c */
    private void m1716c() {
        this.f1668a.setStyle(Style.FILL_AND_STROKE);
        this.f1668a.setColor(-1);
        this.f1668a.setXfermode(new PorterDuffXfermode(Mode.DST_OUT));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo1802a() {
        if (!this.f1669b.isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m1714a(Callback callback) {
        return callback instanceof View;
    }

    /* renamed from: c */
    private void m1717c(Canvas canvas) {
        if (!m1714a(getCallback())) {
            canvas.restoreToCount(this.f1670c);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo1801a(RectF rectF) {
        m1712a(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    /* renamed from: a */
    private void m1713a(Canvas canvas) {
        Callback callback = getCallback();
        if (m1714a(callback)) {
            ((View) callback).setLayerType(2, null);
        } else {
            m1715b(canvas);
        }
    }

    public final void draw(Canvas canvas) {
        m1713a(canvas);
        super.draw(canvas);
        canvas.drawRect(this.f1669b, this.f1668a);
        m1717c(canvas);
    }

    /* renamed from: b */
    private void m1715b(Canvas canvas) {
        if (VERSION.SDK_INT >= 21) {
            this.f1670c = canvas.saveLayer(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight(), null);
            return;
        }
        this.f1670c = canvas.saveLayer(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight(), null, 31);
    }

    /* renamed from: a */
    private void m1712a(float f, float f2, float f3, float f4) {
        if (f != this.f1669b.left || f2 != this.f1669b.top || f3 != this.f1669b.right || f4 != this.f1669b.bottom) {
            this.f1669b.set(f, f2, f3, f4);
            invalidateSelf();
        }
    }
}
