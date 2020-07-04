package com.p280ss.android.ugc.aweme.beauty;

import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.property.AVSettings;
import com.p280ss.android.ugc.aweme.property.AVSettings.Property;

/* renamed from: com.ss.android.ugc.aweme.beauty.l */
public final class C23543l {

    /* renamed from: a */
    public static final String[] f62133a = {"磨皮", "瘦脸", "大脸", "口红", "腮红"};

    /* renamed from: b */
    public static final float[] f62134b = {0.6f, 0.5f, 0.3f, 0.3f, 0.3f};

    /* renamed from: d */
    public static final float[] f62135d = {1.0f, 1.0f, 1.0f, 1.0f, 1.0f};

    /* renamed from: c */
    public int[] f62136c = new int[5];

    public C23543l() {
    }

    /* renamed from: a */
    public final void mo61332a() {
        AVSettings f = C35574k.m114859a().mo70091f();
        if (f.mo93342a(Property.UlikeBeautyDownloadEnable)) {
            boolean a = C23544m.m77321a("2", "3");
            boolean a2 = C23544m.m77321a("0", "1");
            boolean a3 = C23544m.m77321a("0", "2");
            float a4 = C23533d.m77291a(0, "0");
            float b = C23533d.m77293b(0, "0");
            if (!(!a2 || a4 == -1.0f || b == -1.0f)) {
                f62134b[0] = a4;
                f62135d[0] = b;
            }
            float a5 = C23533d.m77291a(1, "0");
            float b2 = C23533d.m77293b(1, "0");
            if (!(!a3 || a5 == -1.0f || b2 == -1.0f)) {
                f62134b[1] = a5;
                f62135d[1] = b2;
            }
            float a6 = C23533d.m77291a(2, "0");
            float b3 = C23533d.m77293b(2, "0");
            if (!(!a3 || a6 == -1.0f || b3 == -1.0f)) {
                f62134b[2] = a6;
                f62135d[2] = b3;
            }
            float a7 = C23533d.m77291a(3, "0");
            float b4 = C23533d.m77293b(3, "0");
            if (!(!a || a7 == -1.0f || b4 == -1.0f)) {
                f62134b[3] = a7;
                f62135d[3] = b4;
            }
            float a8 = C23533d.m77291a(4, "0");
            float b5 = C23533d.m77293b(4, "0");
            if (!(!a || a8 == -1.0f || b5 == -1.0f)) {
                f62134b[4] = a8;
                f62135d[4] = b5;
            }
        }
        if (f.mo93342a(Property.LoadOldUserLevel)) {
            this.f62136c[0] = f.mo93343b(Property.UserUlikeSmoothSkinLevel);
            this.f62136c[1] = f.mo93343b(Property.UserUlikeShapeLevel);
            this.f62136c[2] = f.mo93343b(Property.UserUlikeBigEyeLevel);
            this.f62136c[3] = f.mo93343b(Property.UserUlikeLipLevel);
            this.f62136c[4] = f.mo93343b(Property.UserUlikeBlushLevel);
        } else {
            this.f62136c[0] = f.mo93343b(Property.UserSmoothSkinLevel);
            this.f62136c[1] = f.mo93343b(Property.UserShapeLevel);
            this.f62136c[2] = f.mo93343b(Property.UserBigEyeLevel);
            this.f62136c[3] = f.mo93343b(Property.UserLipLevel);
            this.f62136c[4] = f.mo93343b(Property.UserBlushLevel);
        }
        f.mo93341a(Property.LoadOldUserLevel, false);
        for (int i = 0; i < 5; i++) {
            if (this.f62136c[i] == -1 && f62135d[i] != 0.0f) {
                this.f62136c[i] = (int) ((f62134b[i] / f62135d[i]) * 100.0f);
            }
        }
    }

    public C23543l(int i, int i2, int i3, int i4, int i5) {
        this.f62136c[0] = i;
        this.f62136c[1] = i2;
        this.f62136c[2] = i3;
        this.f62136c[3] = i4;
        this.f62136c[4] = i5;
    }
}
