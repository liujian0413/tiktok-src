package com.p280ss.android.ugc.aweme.i18n.language;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.i18n.language.p1303a.C30468e;
import com.p280ss.android.ugc.aweme.i18n.language.p1303a.C30472f;
import com.p280ss.android.ugc.aweme.i18n.language.p1303a.C30474g;
import com.p280ss.android.ugc.aweme.language.C7120e;
import com.p280ss.android.ugc.aweme.language.I18nManagerService;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import com.p280ss.android.ugc.trill.app.TrillApplication;
import java.util.Locale;

/* renamed from: com.ss.android.ugc.aweme.i18n.language.b */
public final class C30476b {
    /* renamed from: c */
    public static void m99558c() {
        m99556b(null);
    }

    /* renamed from: a */
    public static Locale m99547a() {
        return m99548a(AwemeApplication.m21341a());
    }

    /* renamed from: b */
    public static String m99553b() {
        String b = m99555b("key_current_locale", "");
        if (TextUtils.isEmpty(b)) {
            return "en";
        }
        return b;
    }

    /* renamed from: a */
    public static Locale m99548a(Context context) {
        return m99549a((String) null, (String) null, context);
    }

    /* renamed from: d */
    private static SharedPreferences m99559d(Context context) {
        return C7285c.m22838a(context, "key_language_sp_key", 0);
    }

    /* renamed from: c */
    public static String m99557c(Context context) {
        return ((I18nManagerService) ServiceManager.get().getService(I18nManagerService.class)).getCurrentI18nItem(context).mo18535f();
    }

    /* renamed from: b */
    public static void m99556b(Context context) {
        if (context == null) {
            context = TrillApplication.m21341a();
        }
        if (context == null) {
            context = TrillApplication.m21344c();
        }
        C30472f.m99532a(context, m99548a(context), false, null);
    }

    /* renamed from: b */
    public static String m99555b(String str, String str2) {
        return m99559d(AwemeApplication.m21341a()).getString(str, str2);
    }

    /* renamed from: a */
    public static void m99551a(String str, String str2) {
        m99559d(AwemeApplication.m21341a()).edit().putString(str, str2).apply();
    }

    /* renamed from: a */
    private static String m99546a(Locale locale, String str) {
        String b = m99555b("key_current_locale", "");
        if (!TextUtils.isEmpty(b)) {
            return b;
        }
        String country = locale.getCountry();
        String language = locale.getLanguage();
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, language)) {
            str = language;
        } else if (TextUtils.equals(str, "zh-Hant") || TextUtils.equals(str, "zh")) {
            m99551a("key_current_locale", "zh-Hant-TW");
            return "zh-Hant-TW";
        } else if (TextUtils.equals(str, "in")) {
            m99551a("key_current_locale", "id-ID");
            return "id-ID";
        } else if (TextUtils.equals(str, "iw")) {
            m99551a("key_current_locale", "he-IL");
            return "he-IL";
        } else {
            country = "";
        }
        if (C30472f.m99536a(locale, Locale.SIMPLIFIED_CHINESE)) {
            return "en";
        }
        if (TextUtils.equals("in", str)) {
            m99551a("key_current_locale", "id-ID");
            return "id-ID";
        } else if (TextUtils.equals("iw", str)) {
            m99551a("key_current_locale", "he-IL");
            return "he-IL";
        } else {
            for (C7120e eVar : C30468e.m99511a().f80055b.values()) {
                if (TextUtils.isEmpty(eVar.mo18532c().getCountry())) {
                    if (TextUtils.equals(str, eVar.mo18532c().getLanguage())) {
                        m99551a("key_current_locale", str);
                        return str;
                    }
                } else if (TextUtils.equals("zh-Hant", str) || TextUtils.equals("zh", str) || TextUtils.equals("zh_TW", str)) {
                    m99551a("key_current_locale", "zh-Hant-TW");
                    return "zh-Hant-TW";
                } else if (TextUtils.equals(str, eVar.mo18532c().getLanguage()) && TextUtils.equals(country, eVar.mo18532c().getCountry())) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append("-");
                    sb.append(country);
                    m99551a("key_current_locale", sb.toString());
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str);
                    sb2.append("-");
                    sb2.append(country);
                    return sb2.toString();
                } else if (TextUtils.equals(str, eVar.mo18532c().getLanguage())) {
                    m99551a("key_current_locale", eVar.mo18530a());
                    return eVar.mo18530a();
                }
            }
            m99551a("key_current_locale", "en");
            return "en";
        }
    }

    /* renamed from: b */
    public static String m99554b(Context context, String str, String str2) {
        return m99559d(context).getString(str, str2);
    }

    /* renamed from: a */
    public static void m99550a(Context context, String str, String str2) {
        m99559d(context).edit().putString(str, str2).apply();
    }

    /* renamed from: a */
    private static Locale m99549a(String str, String str2, Context context) {
        Locale locale = Locale.getDefault();
        if (str2 == null) {
            if (context == null) {
                str2 = "";
            } else {
                str2 = m99554b(context, "pref_language_key", "");
            }
        }
        if (str == null) {
            str = m99546a(locale, str2);
        }
        try {
            Locale locale2 = ((I18nManagerService) ServiceManager.get().getService(I18nManagerService.class)).getLocale(str);
            if (locale2 != null) {
                return locale2;
            }
            return locale;
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static void m99552a(String str, String str2, Context context, C30474g gVar) {
        if (context == null) {
            context = TrillApplication.m21341a();
        }
        if (context == null) {
            context = TrillApplication.m21344c();
        }
        C30472f.m99532a(context, m99549a(str, str2, context), true, gVar);
    }
}
