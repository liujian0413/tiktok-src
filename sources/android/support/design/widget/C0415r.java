package android.support.design.widget;

import android.widget.ImageButton;

/* renamed from: android.support.design.widget.r */
public class C0415r extends ImageButton {

    /* renamed from: a */
    private int f1775a;

    public final int getUserSetVisibility() {
        return this.f1775a;
    }

    public void setVisibility(int i) {
        mo1877a(i, true);
    }

    /* renamed from: a */
    public final void mo1877a(int i, boolean z) {
        super.setVisibility(i);
        if (z) {
            this.f1775a = i;
        }
    }
}
