package com.bytedance.android.live.core.p146b;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.bytedance.android.live.C2317a;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.ies.p534b.C10296b;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.pixaloop.p1595a.C40427a;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;

/* renamed from: com.bytedance.android.live.core.b.a */
public final class C3164a {

    /* renamed from: a */
    private static Locale f9726a = new Locale("hi", "IN");

    /* renamed from: b */
    private static Locale f9727b = new Locale("te", "IN");

    /* renamed from: c */
    private static Locale f9728c = new Locale("ta", "IN");

    /* renamed from: d */
    private static Locale f9729d = new Locale("mr", "IN");

    /* renamed from: e */
    private static Locale f9730e = new Locale("bn", "IN");

    /* renamed from: f */
    private static Locale f9731f = new Locale("gu", "IN");

    /* renamed from: g */
    private static Locale f9732g = new Locale("kn", "IN");

    /* renamed from: h */
    private static Locale f9733h = new Locale("ml", "IN");

    /* renamed from: i */
    private static Locale f9734i = new Locale("pa", "IN");

    /* renamed from: j */
    private static Locale f9735j = new Locale(C40427a.f105096d, "IN");

    /* renamed from: k */
    private static Locale f9736k = new Locale("in", "ID");

    /* renamed from: l */
    private static Locale f9737l = new Locale("vi", "VN");

    /* renamed from: m */
    private static Locale f9738m = Locale.JAPAN;

    /* renamed from: n */
    private static Locale f9739n = Locale.KOREA;

    /* renamed from: o */
    private static Locale f9740o = new Locale("th", "TH");

    /* renamed from: p */
    private static Locale f9741p = new Locale("pt", "PT");

    /* renamed from: q */
    private static Locale f9742q = new Locale("ms");

    /* renamed from: r */
    private static Locale f9743r = Locale.FRANCE;

    /* renamed from: s */
    private static Locale f9744s = new Locale("ru", "RU");

    /* renamed from: t */
    private static Locale f9745t = new Locale("es");

    /* renamed from: u */
    private static Locale f9746u = new Locale("ar");

    /* renamed from: v */
    private static HashSet<String> f9747v = new HashSet<>(Arrays.asList(new String[]{"en", "hi", "in", "vi", "ko", "ja", "th", "ta", "te", "mr", "ms", "pt", "bn", "fr", "ru", "es", "ar"}));

    /* renamed from: w */
    private static List<String> f9748w = Arrays.asList(new String[]{"EG", "DZ", "MA", "TN", "LY", "YE", "SS", "DJ", "CMR", "SO", "MR", "SD", "SA", "AE", "OM", "KW", "QA", "BH", "JO", "LB", "PS", "IQ", "SY"});

    /* renamed from: x */
    private static List<String> f9749x = Arrays.asList(new String[]{"US", "GB"});

    /* renamed from: a */
    public static String m11945a() {
        return m11946a(C3358ac.m12528e()).getLanguage();
    }

    /* renamed from: c */
    public static Locale m11950c() {
        return Resources.getSystem().getConfiguration().locale;
    }

    /* renamed from: b */
    public static String m11948b() {
        String country = Locale.getDefault().getCountry();
        if (TextUtils.isEmpty(country)) {
            return "";
        }
        return country;
    }

    /* renamed from: a */
    private static Locale m11946a(Context context) {
        Locale b = m11949b(context);
        if (b != null) {
            return m11947a(b);
        }
        return Locale.getDefault();
    }

    /* renamed from: a */
    private static Locale m11947a(Locale locale) {
        if (TextUtils.isEmpty(locale.getCountry())) {
            return new Locale(locale.getLanguage(), Locale.getDefault().getCountry(), locale.getVariant());
        }
        return locale;
    }

    /* renamed from: b */
    private static Locale m11949b(Context context) {
        Locale locale = null;
        if (context == null) {
            return null;
        }
        try {
            Locale locale2 = (Locale) C2317a.m9932a().mo15974a(C10296b.m30493a(context).mo25022a("sp_lanuage_last_select_tag", ""), Locale.class);
            if (locale2 instanceof Locale) {
                locale = locale2;
            }
        } catch (Exception unused) {
        }
        return locale;
    }
}
