package com.p280ss.android.ugc.aweme.i18n.language.p1303a;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.LocaleList;
import android.text.TextUtils;
import com.google.android.play.core.splitinstall.C6563f;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.i18n.language.C30476b;
import com.p280ss.android.ugc.aweme.language.I18nManagerService;
import com.p280ss.android.ugc.aweme.p1168df.base.C26220a.C26221a;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.i18n.language.a.f */
public final class C30472f {

    /* renamed from: a */
    private static Map<String, C6563f> f80064a = new HashMap();

    /* renamed from: a */
    public static Map<String, C6563f> m99530a() {
        return f80064a;
    }

    /* renamed from: b */
    private static boolean m99539b() {
        if (VERSION.SDK_INT >= 21) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static Locale m99529a(Context context) {
        return context.getResources().getConfiguration().locale;
    }

    /* renamed from: b */
    public static Context m99537b(Context context) {
        if (VERSION.SDK_INT >= 24) {
            return m99540c(context);
        }
        return context;
    }

    /* renamed from: c */
    private static Context m99540c(Context context) {
        Resources resources = context.getResources();
        Locale a = C30476b.m99548a(context);
        Configuration configuration = resources.getConfiguration();
        configuration.setLocale(a);
        configuration.setLocales(new LocaleList(new Locale[]{a}));
        try {
            if (((I18nManagerService) ServiceManager.get().getService(I18nManagerService.class)).isArabicLang(context)) {
                m99533a(configuration, 1);
            }
        } catch (Throwable unused) {
        }
        return context.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    private static void m99533a(Configuration configuration, int i) {
        configuration.screenLayout = (configuration.screenLayout & -193) | PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH;
    }

    /* renamed from: b */
    private static void m99538b(Context context, Locale locale) {
        if (context != null) {
            Resources resources = context.getResources();
            Configuration configuration = resources.getConfiguration();
            m99534a(configuration, locale);
            resources.updateConfiguration(configuration, null);
        }
    }

    /* renamed from: a */
    public static void m99531a(Context context, Locale locale) {
        m99538b(context, locale);
        if (!(context instanceof AwemeApplication)) {
            m99538b(context.getApplicationContext(), locale);
        }
        String country = locale.getCountry();
        if (TextUtils.isEmpty(country)) {
            country = Resources.getSystem().getConfiguration().locale.getCountry();
        }
        C30476b.m99550a(context, "key_current_region", country);
        C30476b.m99550a(context, "pref_language_key", locale.getLanguage());
    }

    /* renamed from: a */
    private static void m99534a(Configuration configuration, Locale locale) {
        if (VERSION.SDK_INT < 17) {
            configuration.locale = locale;
        } else {
            configuration.setLocale(locale);
        }
    }

    /* renamed from: a */
    private static boolean m99535a(String str, String str2) {
        if ((str != null || str2 != null) && !"".equals(str) && !"".equals(str2) && (str == null || !str.equals(str2))) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m99536a(Locale locale, Locale locale2) {
        if (!m99535a(locale.getLanguage(), locale2.getLanguage()) || !m99535a(locale.getCountry(), locale2.getCountry()) || !m99535a(locale.getVariant(), locale2.getVariant())) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m99532a(final Context context, final Locale locale, boolean z, final C30474g gVar) {
        if (m99536a(locale, context.getResources().getConfiguration().locale)) {
            if (gVar != null) {
                gVar.mo80148a();
            }
        } else if (!z || !m99539b()) {
            m99531a(context, locale);
            if (gVar != null) {
                gVar.mo80148a();
            }
        } else {
            final C30463a aVar = new C30463a(context);
            aVar.mo67782d();
            aVar.f69118c = new C26221a() {

                /* renamed from: a */
                WeakReference<Context> f80065a = new WeakReference<>(context);

                /* renamed from: b */
                public final void mo16974b() {
                    aVar.mo67783e();
                }

                /* renamed from: a */
                public final void mo16973a() {
                    Context context = (Context) this.f80065a.get();
                    if (context != null) {
                        C30472f.m99531a(context, locale);
                        if (gVar != null) {
                            gVar.mo80148a();
                        }
                        aVar.mo67783e();
                    }
                }
            };
            aVar.mo80138a(new Locale(locale.getLanguage()));
        }
    }
}
