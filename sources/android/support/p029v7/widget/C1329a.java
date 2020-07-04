package android.support.p029v7.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;

/* renamed from: android.support.v7.widget.a */
final class C1329a extends Drawable {

    /* renamed from: a */
    final ActionBarContainer f5211a;

    public final int getOpacity() {
        return 0;
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public C1329a(ActionBarContainer actionBarContainer) {
        this.f5211a = actionBarContainer;
    }

    public final void draw(Canvas canvas) {
        if (!this.f5211a.f4457d) {
            if (this.f5211a.f4454a != null) {
                this.f5211a.f4454a.draw(canvas);
            }
            if (this.f5211a.f4455b != null && this.f5211a.f4458e) {
                this.f5211a.f4455b.draw(canvas);
            }
        } else if (this.f5211a.f4456c != null) {
            this.f5211a.f4456c.draw(canvas);
        }
    }

    public final void getOutline(Outline outline) {
        if (this.f5211a.f4457d) {
            if (this.f5211a.f4456c != null) {
                this.f5211a.f4456c.getOutline(outline);
            }
        } else if (this.f5211a.f4454a != null) {
            this.f5211a.f4454a.getOutline(outline);
        }
    }
}
