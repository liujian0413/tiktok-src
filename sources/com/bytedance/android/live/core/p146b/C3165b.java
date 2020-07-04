package com.bytedance.android.live.core.p146b;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.bytedance.android.live.core.b.b */
public final class C3165b {

    /* renamed from: a */
    private static Map<String, String> f9750a;

    static {
        HashMap hashMap = new HashMap();
        f9750a = hashMap;
        hashMap.put("ar", "ar");
        f9750a.put("bn_in", "bn-IN");
        f9750a.put("en", "en");
        f9750a.put("es", "es");
        f9750a.put("fr_fr", "fr");
        f9750a.put("gu_in", "gu-IN");
        f9750a.put("hi_in", "hi-IN");
        f9750a.put("ja_jp", "ja-JP");
        f9750a.put("kn_in", "kn-IN");
        f9750a.put("ko_kr", "ko-KR");
        f9750a.put("ml_in", "ml-IN");
        f9750a.put("mr_in", "mr-IN");
        f9750a.put("ms", "ms-MY");
        f9750a.put("or_in", "or-IN");
        f9750a.put("pa_in", "pa-IN");
        f9750a.put("pt_br", "pt-BR");
        f9750a.put("pt_pt", "pt-BR");
        f9750a.put("ru_ru", "ru-RU");
        f9750a.put("ta_in", "ta-IN");
        f9750a.put("te_in", "te-IN");
        f9750a.put("th_th", "th-TH");
        f9750a.put("vi_vn", "vi-VN");
        f9750a.put("zh_cn", "zh-hans-CN");
        f9750a.put("de", "de-de");
        f9750a.put("id", "id-ID");
        f9750a.put("it", "it-IT");
        f9750a.put("tr", "tr-TR");
    }

    /* renamed from: b */
    private static String m11952b(Locale locale) {
        String lowerCase = locale.toString().toLowerCase();
        String lowerCase2 = locale.getLanguage().toLowerCase();
        if (f9750a.containsKey(lowerCase)) {
            return (String) f9750a.get(lowerCase);
        }
        if (f9750a.containsKey(lowerCase2)) {
            return (String) f9750a.get(lowerCase2);
        }
        if (TextUtils.isEmpty(locale.getCountry())) {
            return lowerCase2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(locale.getLanguage());
        sb.append("-");
        sb.append(locale.getCountry());
        return sb.toString();
    }

    /* renamed from: a */
    public static String m11951a(Locale locale) {
        if ("musicallyI18n".equals("i18nVigo")) {
            return m11952b(locale);
        }
        if (locale == null || locale.getLanguage() == null) {
            locale = Locale.getDefault();
        }
        String language = locale.getLanguage();
        String country = locale.getCountry();
        if (language.equals("ml") || language.equals("pa") || language.equals("gu") || language.equals("bh") || language.equals("bn") || language.equals("mr")) {
            StringBuilder sb = new StringBuilder();
            sb.append(language);
            sb.append("-IN");
            return sb.toString();
        } else if (language.equals("pt")) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(language);
            sb2.append("-BR");
            return sb2.toString();
        } else if (language.equals("sv")) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(language);
            sb3.append("-SE");
            return sb3.toString();
        } else if (language.equals("zh") && !TextUtils.equals(country, "CN")) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(language);
            sb4.append("-TW");
            return sb4.toString();
        } else if (!language.equals("es") || !TextUtils.equals(country, "US")) {
            return language;
        } else {
            StringBuilder sb5 = new StringBuilder();
            sb5.append(language);
            sb5.append("-US");
            return sb5.toString();
        }
    }
}
