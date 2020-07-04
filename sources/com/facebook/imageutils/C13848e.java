package com.facebook.imageutils;

import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.facebook.common.internal.C13307g;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.facebook.imageutils.e */
public final class C13848e {
    /* renamed from: a */
    public static int m40891a(int i) {
        return C13850g.m40896a(i);
    }

    /* renamed from: a */
    public static int m40892a(InputStream inputStream) {
        try {
            int b = m40894b(inputStream);
            if (b == 0) {
                return 0;
            }
            return C13850g.m40897a(inputStream, b);
        } catch (IOException unused) {
            return 0;
        }
    }

    /* renamed from: b */
    private static int m40894b(InputStream inputStream) throws IOException {
        if (m40893a(inputStream, 225)) {
            int a = C13849f.m40895a(inputStream, 2, false) - 2;
            if (a > 6) {
                int a2 = C13849f.m40895a(inputStream, 4, false);
                int i = a - 4;
                int a3 = C13849f.m40895a(inputStream, 2, false);
                int i2 = i - 2;
                if (a2 == 1165519206 && a3 == 0) {
                    return i2;
                }
                return 0;
            }
        }
        return 0;
    }

    /* renamed from: a */
    private static boolean m40893a(InputStream inputStream, int i) throws IOException {
        C13307g.m38940a(inputStream);
        while (C13849f.m40895a(inputStream, 1, false) == 255) {
            int i2 = NormalGiftView.ALPHA_255;
            while (i2 == 255) {
                i2 = C13849f.m40895a(inputStream, 1, false);
            }
            if (i2 == 225) {
                return true;
            }
            if (!(i2 == 216 || i2 == 1)) {
                if (i2 == 217 || i2 == 218) {
                    return false;
                }
                inputStream.skip((long) (C13849f.m40895a(inputStream, 2, false) - 2));
            }
        }
        return false;
    }
}
