package com.p280ss.android.ugc.aweme.hybrid.monitor.utils;

import android.graphics.Bitmap;
import java.util.Arrays;

/* renamed from: com.ss.android.ugc.aweme.hybrid.monitor.utils.f */
public final class C30410f {

    /* renamed from: a */
    private int f79919a;

    public C30410f() {
        this(0);
    }

    public C30410f(int i) {
        this.f79919a = i;
    }

    /* renamed from: a */
    public final boolean mo80037a(Bitmap bitmap) {
        int i;
        Bitmap bitmap2 = bitmap;
        boolean z = true;
        if (bitmap2 == null) {
            return true;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width <= 0 || height <= 0) {
            return false;
        }
        if (this.f79919a == 0) {
            i = bitmap2.getPixel(0, 0);
        } else {
            i = this.f79919a;
        }
        int[] iArr = new int[width];
        Arrays.fill(iArr, i);
        int[] iArr2 = new int[width];
        int i2 = 0;
        while (true) {
            if (i2 >= height) {
                break;
            }
            int i3 = i2;
            bitmap.getPixels(iArr2, 0, width, 0, i2, width, 1);
            if (!Arrays.equals(iArr, iArr2)) {
                z = false;
                break;
            }
            i2 = i3 + 1;
        }
        return z;
    }
}
