package android.support.p022v4.widget;

import android.os.Build.VERSION;

/* renamed from: android.support.v4.widget.b */
public interface C1036b {

    /* renamed from: a */
    public static final boolean f3605a;

    void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) throws IllegalArgumentException;

    static {
        boolean z;
        if (VERSION.SDK_INT >= 27) {
            z = true;
        } else {
            z = false;
        }
        f3605a = z;
    }
}
