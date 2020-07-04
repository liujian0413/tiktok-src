package com.p280ss.android.ugc.aweme.i18n.language.p1303a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.text.TextUtils;
import com.bytedance.ies.dmt.p262ui.common.rebranding.C10779a;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.base.C23397p;
import com.p280ss.android.ugc.aweme.base.p1062f.C23336d;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.i18n.language.C30476b;
import com.p280ss.android.ugc.aweme.i18n.language.initial.C30483e;
import com.p280ss.android.ugc.aweme.i18n.language.initial.C30489i;
import com.p280ss.android.ugc.aweme.i18n.p1299a.C30434c;
import com.p280ss.android.ugc.aweme.language.C32326h;
import com.p280ss.android.ugc.aweme.language.C7120e;
import com.p280ss.android.ugc.aweme.language.I18nManagerService;
import com.p280ss.android.ugc.aweme.live.C32430a;
import com.p280ss.android.ugc.aweme.main.MainActivity;
import com.p280ss.android.ugc.aweme.net.CommonApi;
import com.p280ss.android.ugc.aweme.setting.C37562ao;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.pixaloop.p1595a.C40427a;
import com.p280ss.android.ugc.aweme.video.preload.C43305j;
import com.p280ss.android.ugc.trill.app.TrillApplication;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.i18n.language.a.e */
public final class C30468e {

    /* renamed from: a */
    public static final String f80054a;

    /* renamed from: b */
    public Map<String, C7120e> f80055b;

    /* renamed from: c */
    public CommonApi f80056c;

    /* renamed from: com.ss.android.ugc.aweme.i18n.language.a.e$a */
    static class C30471a {

        /* renamed from: a */
        public static C30468e f80063a = new C30468e();
    }

    /* renamed from: a */
    public static C30468e m99511a() {
        return C30471a.f80063a;
    }

    /* renamed from: e */
    public static String m99514e() {
        return C32326h.m104886h();
    }

    /* renamed from: f */
    public static String m99515f() {
        return Resources.getSystem().getConfiguration().locale.getCountry();
    }

    /* renamed from: h */
    public static String m99516h() {
        return C30476b.m99555b("key_current_region", C30476b.m99547a().getCountry());
    }

    /* renamed from: b */
    public final List<C7120e> mo80142b() {
        return new ArrayList(this.f80055b.values());
    }

    /* renamed from: c */
    public final String mo80143c() {
        return m99512a(C30476b.m99547a());
    }

    /* renamed from: d */
    public final String mo80144d() {
        return m99512a(Locale.getDefault());
    }

    /* renamed from: k */
    public final void mo80147k() {
        C23397p.m76735a().mo60807a(null, new Callable() {
            public final Object call() throws Exception {
                if (C30468e.this.f80056c == null) {
                    C30468e.this.f80056c = (CommonApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(Api.f60502b).create(CommonApi.class);
                }
                Api.m75214a((String) C30468e.this.f80056c.doGet(C30468e.f80054a).execute().f33302b, C30468e.f80054a);
                return null;
            }
        }, 0);
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(Api.f60502b);
        sb.append("/aweme/v1/device/update/");
        f80054a = sb.toString();
    }

    /* renamed from: i */
    public static boolean m99517i() {
        String str = (String) C30434c.m99417a().mo80109b();
        if (TextUtils.isEmpty(str) || !str.startsWith("510")) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    public static Locale m99518l() {
        return new Locale(m99511a().mo80139a((Context) TrillApplication.m21341a()).mo18531b(), C32326h.m104885g());
    }

    /* renamed from: g */
    public final String mo80145g() {
        if (!TextUtils.isEmpty(C30476b.m99555b("key_current_region", m99515f()))) {
            return C30476b.m99555b("key_current_region", m99515f());
        }
        return m99515f();
    }

    /* renamed from: j */
    public final boolean mo80146j() {
        return TextUtils.equals(mo80139a((Context) TrillApplication.m21341a()).mo18532c().getCountry(), "KR");
    }

    private C30468e() {
        this.f80055b = new LinkedHashMap();
        this.f80055b.put("en", new C30467d("en", "en", "", "English"));
        this.f80055b.put("ar", new C30467d("ar", "ar", "", "العربية"));
        this.f80055b.put("de-DE", new C30467d("de-DE", "de", "DE", "Deutsch (Deutschland)"));
        this.f80055b.put("es", new C30467d("es", "es", "", "Español"));
        this.f80055b.put("fi-FI", new C30467d("fi-FI", "fi", "FI", "Suomi (Suomi)"));
        this.f80055b.put("fr", new C30467d("fr", "fr", "", "Français"));
        this.f80055b.put("id-ID", new C30467d("id-ID", "id", "ID", "Bahasa Indonesia (Indonesia)"));
        this.f80055b.put("ja-JP", new C30467d("ja-JP", "ja", "JP", "日本語（日本）"));
        this.f80055b.put("ko-KR", new C30467d("ko-KR", "ko", "KR", "한국어 (대한민국)"));
        this.f80055b.put("ms-MY", new C30467d("ms-MY", "ms", "MY", "Bahasa Melayu (Malaysia)"));
        this.f80055b.put("ru-RU", new C30467d("ru-RU", "ru", "RU", "Русский (Россия)"));
        this.f80055b.put("th-TH", new C30467d("th-TH", "th", "TH", "ไทย (ไทย)"));
        this.f80055b.put("tr-TR", new C30467d("tr-TR", "tr", "TR", "Türkçe (Türkiye)"));
        this.f80055b.put("vi-VN", new C30467d("vi-VN", "vi", "VN", "Tiếng Việt (Việt Nam)"));
        C30467d dVar = new C30467d("zh-Hant-TW", "zh", "TW", "繁體中文", "zh-Hant");
        this.f80055b.put("zh-Hant-TW", dVar);
        this.f80055b.put("af-ZA", new C30467d("af-ZA", "af", "ZA", "Afrikaans"));
        this.f80055b.put("he-IL", new C30467d("he-IL", "he", "IL", "עברית (ישראל)"));
        this.f80055b.put("jv-MY", new C30467d("jv-MY", "jv", "MY", "Basa Jawa (Malaysia)"));
        this.f80055b.put("ceb-PH", new C30467d("ceb-PH", "ceb", "PH", "Cebuano (Pilipinas)"));
        this.f80055b.put("cs-CZ", new C30467d("cs-CZ", "cs", "CZ", "Čeština (Česká republika)"));
        this.f80055b.put("it-IT", new C30467d("it-IT", "it", "IT", "Italiano (Italia)"));
        this.f80055b.put("hu-HU", new C30467d("hu-HU", "hu", "HU", "Magyar (Magyarország)"));
        this.f80055b.put("nl-NL", new C30467d("nl-NL", "nl", "NL", "Nederlands (Nederland)"));
        this.f80055b.put("pl-PL", new C30467d("pl-PL", "pl", "PL", "Polski (Polska)"));
        this.f80055b.put("pt-BR", new C30467d("pt-BR", "pt", "BR", "Português (Brasil)"));
        this.f80055b.put("ro-RO", new C30467d("ro-RO", "ro", "RO", "Română (Romania)"));
        this.f80055b.put("sv-SE", new C30467d("sv-SE", "sv", "SE", "Svenska (Sverige)"));
        this.f80055b.put("sw", new C30467d("sw", "sw", "", "Kiswahili"));
        this.f80055b.put("fil-PH", new C30467d("fil-PH", "fil", "PH", "Filipino (Pilipinas)"));
        this.f80055b.put("el-GR", new C30467d("el-GR", "el", "GR", "Ελληνικά (Ελλάδα)"));
        this.f80055b.put("zu-ZA", new C30467d("zu-ZA", "zu", "ZA", "isiZulu"));
        this.f80055b.put("uk-UA", new C30467d("uk-UA", "uk", "UA", "Українська (Україна)"));
        this.f80055b.put("ur", new C30467d("ur", "ur", "", "اردو"));
        this.f80055b.put("mr-IN", new C30467d("mr-IN", "mr", "IN", "मराठी"));
        this.f80055b.put("hi-IN", new C30467d("hi-IN", "hi", "IN", "हिंदी"));
        this.f80055b.put("bn-IN", new C30467d("bn-IN", "bn", "IN", "বাঙ্গালি (ভারত)"));
        this.f80055b.put("pa-IN", new C30467d("pa-IN", "pa", "IN", "ਪੰਜਾਬੀ (ਭਾਰਤ)"));
        this.f80055b.put("gu-IN", new C30467d("gu-IN", "gu", "IN", "ગુજરાતી"));
        this.f80055b.put("or-IN", new C30467d("or-IN", C40427a.f105096d, "IN", "ଓଡିଆ"));
        this.f80055b.put("ta-IN", new C30467d("ta-IN", "ta", "IN", "தமிழ்"));
        this.f80055b.put("te-IN", new C30467d("te-IN", "te", "IN", "తెలుగు"));
        this.f80055b.put("kn-IN", new C30467d("kn-IN", "kn", "IN", "ಕನ್ನಡ"));
        this.f80055b.put("ml-IN", new C30467d("ml-IN", "ml", "IN", "മലയാളം"));
        this.f80055b.put("my-MM", new C30467d("my-MM", "my", "MM", "မြန်မာ (မြန်မာ)"));
        this.f80055b.put("km-KH", new C30467d("km-KH", "km", "KH", "ខ្មែរ (កម្ពុជា)"));
    }

    /* renamed from: a */
    public final C7120e mo80139a(Context context) {
        C7120e eVar = (C7120e) this.f80055b.get(C30476b.m99553b());
        if (eVar != null) {
            return eVar;
        }
        return (C7120e) this.f80055b.get("en");
    }

    /* renamed from: a */
    public static String m99512a(Locale locale) {
        if (C30472f.m99536a(locale, Locale.TRADITIONAL_CHINESE)) {
            return "zh-Hant";
        }
        if (C30472f.m99536a(locale, Locale.CHINESE) || C30472f.m99536a(locale, Locale.SIMPLIFIED_CHINESE)) {
            return "zh-Hans";
        }
        if ("iw".equals(locale.getLanguage())) {
            return "he";
        }
        return locale.getLanguage();
    }

    /* renamed from: b */
    public static boolean m99513b(Context context) {
        String str;
        if (context == null) {
            str = "";
        } else {
            str = C30476b.m99554b(context, "pref_language_key", "");
        }
        if (TextUtils.isEmpty(str)) {
            str = Locale.getDefault().getLanguage();
        }
        return "ar".equals(str);
    }

    /* renamed from: a */
    public final Locale mo80140a(String str) {
        C7120e eVar = (C7120e) this.f80055b.get(str);
        if (eVar != null) {
            return eVar.mo18532c();
        }
        return null;
    }

    /* renamed from: a */
    public final void mo80141a(final String str, final String str2, final Context context) {
        C30476b.m99552a(str, str2, context, new C30474g() {

            /* renamed from: a */
            WeakReference<Context> f80057a = new WeakReference<>(context);

            /* renamed from: a */
            public final void mo80148a() {
                C30476b.m99551a("pref_language_key", str2);
                C30476b.m99551a("key_current_locale", str);
                Context context = (Context) this.f80057a.get();
                if (context != null) {
                    if (context instanceof Activity) {
                        ((Activity) context).finish();
                    }
                    C30483e.m99569a().mo80162b();
                    ((C30489i) C23336d.m76560a(context, C30489i.class)).mo60442b(2);
                    Intent mainActivityIntent = MainActivity.getMainActivityIntent(context);
                    mainActivityIntent.setFlags(268468224);
                    context.startActivity(mainActivityIntent);
                    C43305j.m137386g().mo105030c();
                    C37562ao.m120324a().mo94849a(2);
                    C10779a.m31457a();
                    C30468e.this.mo80147k();
                    C32430a.m105070g();
                    IAccountUserService a = C21115b.m71197a();
                    if (a.isLogin()) {
                        a.updateLanguage(null, ((I18nManagerService) ServiceManager.get().getService(I18nManagerService.class)).getAppLanguage(), 0);
                    }
                }
            }
        });
    }
}
