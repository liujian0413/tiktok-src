package com.facebook.imageutils;

import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.facebook.common.p686c.C13286a;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.facebook.imageutils.g */
class C13850g {

    /* renamed from: a */
    private static final Class<?> f36714a = C13850g.class;

    /* renamed from: com.facebook.imageutils.g$a */
    static class C13852a {

        /* renamed from: a */
        boolean f36715a;

        /* renamed from: b */
        int f36716b;

        /* renamed from: c */
        int f36717c;

        private C13852a() {
        }
    }

    C13850g() {
    }

    /* renamed from: a */
    public static int m40896a(int i) {
        if (i == 3) {
            return NormalGiftView.ALPHA_180;
        }
        if (i == 6) {
            return 90;
        }
        if (i == 8) {
            return 270;
        }
        switch (i) {
            case 0:
            case 1:
                return 0;
            default:
                return 0;
        }
    }

    /* renamed from: a */
    public static int m40897a(InputStream inputStream, int i) throws IOException {
        C13852a aVar = new C13852a();
        int a = m40898a(inputStream, i, aVar);
        int i2 = aVar.f36717c - 8;
        if (a == 0 || i2 > a) {
            return 0;
        }
        inputStream.skip((long) i2);
        return m40899a(inputStream, m40900a(inputStream, a - i2, aVar.f36715a, 274), aVar.f36715a);
    }

    /* renamed from: a */
    private static int m40899a(InputStream inputStream, int i, boolean z) throws IOException {
        if (i < 10 || C13849f.m40895a(inputStream, 2, z) != 3 || C13849f.m40895a(inputStream, 4, z) != 1) {
            return 0;
        }
        int a = C13849f.m40895a(inputStream, 2, z);
        C13849f.m40895a(inputStream, 2, z);
        return a;
    }

    /* renamed from: a */
    private static int m40898a(InputStream inputStream, int i, C13852a aVar) throws IOException {
        boolean z;
        if (i <= 8) {
            return 0;
        }
        aVar.f36716b = C13849f.m40895a(inputStream, 4, false);
        int i2 = i - 4;
        if (aVar.f36716b == 1229531648 || aVar.f36716b == 1296891946) {
            if (aVar.f36716b == 1229531648) {
                z = true;
            } else {
                z = false;
            }
            aVar.f36715a = z;
            aVar.f36717c = C13849f.m40895a(inputStream, 4, aVar.f36715a);
            int i3 = i2 - 4;
            if (aVar.f36717c >= 8 && aVar.f36717c - 8 <= i3) {
                return i3;
            }
            C13286a.m38857c(f36714a, "Invalid offset");
            return 0;
        }
        C13286a.m38857c(f36714a, "Invalid TIFF header");
        return 0;
    }

    /* renamed from: a */
    private static int m40900a(InputStream inputStream, int i, boolean z, int i2) throws IOException {
        if (i < 14) {
            return 0;
        }
        int a = C13849f.m40895a(inputStream, 2, z);
        int i3 = i - 2;
        while (true) {
            int i4 = a - 1;
            if (a <= 0 || i3 < 12) {
                return 0;
            }
            int i5 = i3 - 2;
            if (C13849f.m40895a(inputStream, 2, z) == 274) {
                return i5;
            }
            inputStream.skip(10);
            i3 = i5 - 10;
            a = i4;
        }
        return 0;
    }
}
