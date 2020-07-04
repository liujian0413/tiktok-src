package p1874it.sephiroth.android.library.imagezoom.p1875a;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

/* renamed from: it.sephiroth.android.library.imagezoom.a.a */
public final class C47882a extends Drawable {

    /* renamed from: a */
    public Bitmap f122743a;

    /* renamed from: b */
    public Paint f122744b;

    /* renamed from: c */
    protected int f122745c;

    /* renamed from: d */
    protected int f122746d;

    public final int getIntrinsicHeight() {
        return this.f122746d;
    }

    public final int getIntrinsicWidth() {
        return this.f122745c;
    }

    public final int getMinimumHeight() {
        return this.f122746d;
    }

    public final int getMinimumWidth() {
        return this.f122745c;
    }

    public final int getOpacity() {
        return -3;
    }

    public final void setAlpha(int i) {
        this.f122744b.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f122744b.setColorFilter(colorFilter);
    }

    public final void draw(Canvas canvas) {
        if (this.f122743a != null && !this.f122743a.isRecycled()) {
            canvas.drawBitmap(this.f122743a, 0.0f, 0.0f, this.f122744b);
        }
    }

    public C47882a(Bitmap bitmap) {
        this.f122743a = bitmap;
        if (this.f122743a != null) {
            this.f122745c = this.f122743a.getWidth();
            this.f122746d = this.f122743a.getHeight();
        } else {
            this.f122745c = 0;
            this.f122746d = 0;
        }
        this.f122744b = new Paint();
        this.f122744b.setDither(true);
        this.f122744b.setFilterBitmap(true);
    }
}
