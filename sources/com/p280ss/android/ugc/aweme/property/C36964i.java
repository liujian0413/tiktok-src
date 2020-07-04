package com.p280ss.android.ugc.aweme.property;

import android.content.Context;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.bytedance.common.utility.C6311g;
import com.bytedance.ies.NullValueException;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.google.gson.p277b.C6597a;
import com.p280ss.android.ugc.aweme.base.utils.C23478e;
import com.p280ss.android.ugc.aweme.common.p1146g.C25684a;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.property.AVAB.Property;
import java.lang.reflect.Type;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.property.i */
public final class C36964i {

    /* renamed from: a */
    private static volatile boolean f96870a;

    /* renamed from: b */
    private static volatile boolean f96871b;

    /* renamed from: a */
    public static int m118917a(int i, int i2, int i3, int i4) {
        return (i <= 0 || i > 51) ? i4 : i;
    }

    /* renamed from: c */
    public static boolean m118927c() {
        return f96870a;
    }

    /* renamed from: s */
    private static boolean m118943s() {
        return f96871b;
    }

    /* renamed from: q */
    public static boolean m118941q() {
        try {
            return C30199h.m98861a().getEnableHdH264HwDecoder().booleanValue();
        } catch (NullValueException unused) {
            return false;
        }
    }

    /* renamed from: u */
    private static boolean m118945u() {
        if (VERSION.SDK_INT >= 18) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public static boolean m118940p() {
        if (!m118944t() || !C35574k.m114859a().mo70096k().mo93305a(Property.EnableSaveUploadVideo)) {
            return false;
        }
        return true;
    }

    /* renamed from: r */
    public static int m118942r() {
        try {
            int intValue = C30199h.m98861a().getHdHwDecoderMinSideSize().intValue();
            if (intValue <= 720 || intValue >= 2200) {
                return 1090;
            }
            return intValue;
        } catch (NullValueException unused) {
            return 1090;
        }
    }

    /* renamed from: t */
    private static boolean m118944t() {
        if (!m118945u() || !C35574k.m114859a().mo70091f().mo93342a(AVSettings.Property.WatermarkHardcode)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m118920a() {
        if (!m118945u() || !C35574k.m114859a().mo70091f().mo93342a(AVSettings.Property.HardCode) || m118943s()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m118926b() {
        if (!m118945u() || !C35574k.m114859a().mo70091f().mo93342a(AVSettings.Property.SyntheticHardCode)) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public static boolean m118928d() {
        if (!C35574k.m114859a().mo70096k().mo93305a(Property.StickerDetailsEntranceEnable) || !C35574k.m114859a().mo70096k().mo93305a(Property.EnableStickerCollection)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public static float m118930f() {
        float d = C35574k.m114859a().mo70096k().mo93308d(Property.SyntheticVideoBitrate);
        if (d != -1.0f) {
            return d;
        }
        return C35574k.m114859a().mo70091f().mo93345d(AVSettings.Property.SyntheticVideoBitrate);
    }

    /* renamed from: h */
    public static String m118932h() {
        String str = "";
        int[] j = m118934j();
        if (j == null || j.length < 2) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(j[0]);
        sb.append("*");
        sb.append(j[1]);
        return sb.toString();
    }

    /* renamed from: i */
    public static String m118933i() {
        String str = "";
        int[] k = m118935k();
        if (k == null || k.length < 2) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(k[0]);
        sb.append("*");
        sb.append(k[1]);
        return sb.toString();
    }

    /* renamed from: l */
    public static int m118936l() {
        int b = C35574k.m114859a().mo70096k().mo93306b(Property.SyntheticVideoQuality);
        if (b != -1) {
            return b;
        }
        return C35574k.m114859a().mo70091f().mo93343b(AVSettings.Property.SyntheticVideoQuality);
    }

    /* renamed from: m */
    public static long m118937m() {
        long c = C35574k.m114859a().mo70096k().mo93307c(Property.SyntheticVideoMaxRate);
        if (c != -1) {
            return c;
        }
        return C35574k.m114859a().mo70091f().mo93344c(AVSettings.Property.SyntheticVideoMaxRate);
    }

    /* renamed from: n */
    public static int m118938n() {
        int b = C35574k.m114859a().mo70096k().mo93306b(Property.SyntheticVideoPreset);
        if (b != -1) {
            return b;
        }
        return C35574k.m114859a().mo70091f().mo93343b(AVSettings.Property.SyntheticVideoPreset);
    }

    /* renamed from: o */
    public static int m118939o() {
        int b = C35574k.m114859a().mo70096k().mo93306b(Property.SyntheticVideoGop);
        if (b != -1) {
            return b;
        }
        return C35574k.m114859a().mo70091f().mo93343b(AVSettings.Property.SyntheticVideoGop);
    }

    /* renamed from: e */
    public static float m118929e() {
        float f;
        float d = C35574k.m114859a().mo70096k().mo93308d(Property.VideoBitrate);
        if (d != -1.0f) {
            return d;
        }
        float d2 = C35574k.m114859a().mo70091f().mo93345d(AVSettings.Property.VideoBitrate);
        int b = C35574k.m114859a().mo70096k().mo93306b(Property.RecordBitrateCategoryIndex);
        List list = (List) m118918a(C35574k.m114859a().mo70091f().mo93346e(AVSettings.Property.RecordBitrateCategory), new C6597a<List<Float>>() {
        }.type);
        if (!C6311g.m19574b(list) || b >= list.size()) {
            f = 0.0f;
        } else {
            f = ((Float) list.get(b)).floatValue();
        }
        if (f != 0.0f) {
            d2 = f;
        }
        return d2;
    }

    /* renamed from: g */
    public static int m118931g() {
        int i;
        int b = C35574k.m114859a().mo70091f().mo93343b(AVSettings.Property.RecordVideoQuality);
        int b2 = C35574k.m114859a().mo70096k().mo93306b(Property.RecordQualityCategoryIndex);
        List list = (List) m118918a(C35574k.m114859a().mo70091f().mo93346e(AVSettings.Property.RecordQualityCategory), new C6597a<List<Integer>>() {
        }.type);
        if (!C6311g.m19574b(list) || b2 >= list.size()) {
            i = 0;
        } else {
            i = ((Integer) list.get(b2)).intValue();
        }
        if (i != 0) {
            return i;
        }
        return b;
    }

    /* renamed from: j */
    public static int[] m118934j() {
        int[] iArr;
        int[] a = m118922a(C35574k.m114859a().mo70091f().mo93346e(AVSettings.Property.VideoSize));
        int b = C35574k.m114859a().mo70096k().mo93306b(Property.VideoSizeIndex);
        List list = (List) m118918a(C35574k.m114859a().mo70091f().mo93346e(AVSettings.Property.VideoSizeCategory), new C6597a<List<String>>() {
        }.type);
        if (!C6311g.m19574b(list) || b >= list.size()) {
            iArr = null;
        } else {
            iArr = m118922a((String) list.get(b));
        }
        if (iArr != null) {
            return iArr;
        }
        return a;
    }

    /* renamed from: k */
    public static int[] m118935k() {
        int[] iArr;
        int[] a = m118922a(C35574k.m114859a().mo70091f().mo93346e(AVSettings.Property.VideoSize));
        int b = C35574k.m114859a().mo70096k().mo93306b(Property.ImportVideoSizeIndex);
        List list = (List) m118918a(C35574k.m114859a().mo70091f().mo93346e(AVSettings.Property.ImportVideoSizeCategory), new C6597a<List<String>>() {
        }.type);
        if (!C6311g.m19574b(list) || b >= list.size()) {
            iArr = null;
        } else {
            iArr = m118922a((String) list.get(b));
        }
        if (iArr != null) {
            return iArr;
        }
        return a;
    }

    /* renamed from: a */
    public static void m118919a(boolean z) {
        f96871b = z;
    }

    /* renamed from: b */
    public static void m118925b(boolean z) {
        f96870a = true;
    }

    /* renamed from: a */
    public static float m118916a(int i) {
        return (C35574k.m114859a().mo70096k().mo93308d(Property.SmoothMax) / 5.0f) * ((float) C23478e.m77084a(i, 0, 5));
    }

    /* renamed from: b */
    public static float m118924b(int i) {
        return (C35574k.m114859a().mo70096k().mo93308d(Property.ReshapeMax) / 5.0f) * ((float) C23478e.m77084a(i, 0, 5));
    }

    /* renamed from: a */
    public static boolean m118921a(Context context) {
        if (!C35574k.m114859a().mo70096k().mo93305a(Property.EnablePreUpload) || ((!C6399b.m19944t() && !C35574k.m114859a().mo70091f().mo93342a(AVSettings.Property.EnablePreUploadByUser)) || !C35574k.m114859a().mo70073G().mo57090c())) {
            return false;
        }
        int a = (int) ((C25684a.m84431a(context) / 1024) / 1024);
        if (a <= 0 || a > C35574k.m114859a().mo70091f().mo93343b(AVSettings.Property.PreUploadMemoryLimit)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static int[] m118922a(String str) {
        int[] iArr;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            iArr = m118923a(str.split("x"));
        } catch (Exception unused) {
            iArr = new int[0];
        }
        if (iArr.length != 2) {
            return null;
        }
        return iArr;
    }

    /* renamed from: a */
    private static int[] m118923a(String[] strArr) {
        int[] iArr = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            iArr[i] = Integer.parseInt(strArr[i]);
        }
        return iArr;
    }

    /* renamed from: a */
    private static <T> T m118918a(String str, Type type) {
        try {
            return C35574k.m114859a().mo70085S().mo15975a(str, type);
        } catch (Exception unused) {
            return null;
        }
    }
}
