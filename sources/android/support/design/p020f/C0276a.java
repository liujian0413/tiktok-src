package android.support.design.p020f;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build.VERSION;
import android.support.p022v4.graphics.C0721a;
import android.util.StateSet;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;

/* renamed from: android.support.design.f.a */
public final class C0276a {

    /* renamed from: a */
    public static final boolean f1078a;

    /* renamed from: b */
    private static final int[] f1079b = {16842919};

    /* renamed from: c */
    private static final int[] f1080c = {16843623, 16842908};

    /* renamed from: d */
    private static final int[] f1081d = {16842908};

    /* renamed from: e */
    private static final int[] f1082e = {16843623};

    /* renamed from: f */
    private static final int[] f1083f = {16842913, 16842919};

    /* renamed from: g */
    private static final int[] f1084g = {16842913, 16843623, 16842908};

    /* renamed from: h */
    private static final int[] f1085h = {16842913, 16842908};

    /* renamed from: i */
    private static final int[] f1086i = {16842913, 16843623};

    /* renamed from: j */
    private static final int[] f1087j = {16842913};

    static {
        boolean z;
        if (VERSION.SDK_INT >= 21) {
            z = true;
        } else {
            z = false;
        }
        f1078a = z;
    }

    /* renamed from: a */
    private static int m1086a(int i) {
        return C0721a.m3067b(i, Math.min(Color.alpha(i) * 2, NormalGiftView.ALPHA_255));
    }

    /* renamed from: a */
    public static ColorStateList m1088a(ColorStateList colorStateList) {
        if (f1078a) {
            return new ColorStateList(new int[][]{f1087j, StateSet.NOTHING}, new int[]{m1087a(colorStateList, f1083f), m1087a(colorStateList, f1079b)});
        }
        return new ColorStateList(new int[][]{f1083f, f1084g, f1085h, f1086i, f1087j, f1079b, f1080c, f1081d, f1082e, StateSet.NOTHING}, new int[]{m1087a(colorStateList, f1083f), m1087a(colorStateList, f1084g), m1087a(colorStateList, f1085h), m1087a(colorStateList, f1086i), 0, m1087a(colorStateList, f1079b), m1087a(colorStateList, f1080c), m1087a(colorStateList, f1081d), m1087a(colorStateList, f1082e), 0});
    }

    /* renamed from: a */
    private static int m1087a(ColorStateList colorStateList, int[] iArr) {
        int i;
        if (colorStateList != null) {
            i = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        } else {
            i = 0;
        }
        if (f1078a) {
            return m1086a(i);
        }
        return i;
    }
}
