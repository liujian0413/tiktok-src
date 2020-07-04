package android.support.transition;

import android.animation.TypeEvaluator;
import android.graphics.Rect;

/* renamed from: android.support.transition.i */
final class C0495i implements TypeEvaluator<Rect> {

    /* renamed from: a */
    private Rect f1995a;

    C0495i() {
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public Rect evaluate(float f, Rect rect, Rect rect2) {
        int i = rect.left + ((int) (((float) (rect2.left - rect.left)) * f));
        int i2 = rect.top + ((int) (((float) (rect2.top - rect.top)) * f));
        int i3 = rect.right + ((int) (((float) (rect2.right - rect.right)) * f));
        int i4 = rect.bottom + ((int) (((float) (rect2.bottom - rect.bottom)) * f));
        if (this.f1995a == null) {
            return new Rect(i, i2, i3, i4);
        }
        this.f1995a.set(i, i2, i3, i4);
        return this.f1995a;
    }
}
