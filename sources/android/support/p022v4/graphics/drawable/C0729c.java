package android.support.p022v4.graphics.drawable;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Outline;
import android.graphics.Rect;
import android.view.Gravity;

/* renamed from: android.support.v4.graphics.drawable.c */
final class C0729c extends C0728b {
    public final void getOutline(Outline outline) {
        mo2889a();
        outline.setRoundRect(this.f2749e, this.f2748d);
    }

    protected C0729c(Resources resources, Bitmap bitmap) {
        super(resources, bitmap);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo2891a(int i, int i2, int i3, Rect rect, Rect rect2) {
        Gravity.apply(i, i2, i3, rect, rect2, 0);
    }
}
