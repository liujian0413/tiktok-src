package android.support.p022v4.graphics.drawable;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.support.p022v4.view.C0972e;

/* renamed from: android.support.v4.graphics.drawable.d */
public final class C0730d {

    /* renamed from: android.support.v4.graphics.drawable.d$a */
    static class C0731a extends C0728b {
        C0731a(Resources resources, Bitmap bitmap) {
            super(resources, bitmap);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo2891a(int i, int i2, int i3, Rect rect, Rect rect2) {
            C0972e.m4110a(i, i2, i3, rect, rect2, 0);
        }
    }

    /* renamed from: a */
    public static C0728b m3126a(Resources resources, Bitmap bitmap) {
        if (VERSION.SDK_INT >= 21) {
            return new C0729c(resources, bitmap);
        }
        return new C0731a(resources, bitmap);
    }
}
