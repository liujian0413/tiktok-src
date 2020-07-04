package com.p280ss.android.ugc.aweme.account.login.p975v2;

import com.bytedance.ies.NullValueException;
import com.bytedance.ies.abmock.C6384b;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.AgeGateSettings;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.EmailLoginSettings;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.a */
public final class C21886a {

    /* renamed from: a */
    public static final C21886a f58594a = new C21886a();

    /* renamed from: b */
    private static final List<String> f58595b = C7525m.m23464b((T[]) new String[]{"gmail.com", "hotmail.com", "outlook.com", "yahoo.com", "icloud.com"});

    /* renamed from: c */
    private static final Date f58596c = new Date(System.currentTimeMillis() - 31536000000L);

    private C21886a() {
    }

    /* renamed from: c */
    public final boolean mo58324c() {
        if (m73068f() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final boolean mo58325d() {
        if (m73068f() > 1) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final boolean mo58326e() {
        if (m73068f() == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    private static int m73068f() {
        return C6384b.m19835a().mo15287a(LoginRedesignExperiment.class, true, "mt_login_revision_android", C6384b.m19835a().mo15295d().mt_login_revision_android, 0);
    }

    /* renamed from: a */
    public static List<String> m73066a() {
        try {
            IESSettingsProxy a = C30199h.m98861a();
            C7573i.m23582a((Object) a, "SettingsReader.get()");
            EmailLoginSettings emailLoginSettings = a.getEmailLoginSettings();
            C7573i.m23582a((Object) emailLoginSettings, "setting");
            List domainRecommendation = emailLoginSettings.getDomainRecommendation();
            C7573i.m23582a((Object) domainRecommendation, "setting.domainRecommendation");
            if (!domainRecommendation.isEmpty()) {
                return emailLoginSettings.getDomainRecommendation();
            }
        } catch (NullValueException unused) {
        }
        return f58595b;
    }

    /* renamed from: b */
    public static Date m73067b() {
        try {
            IESSettingsProxy a = C30199h.m98861a();
            C7573i.m23582a((Object) a, "SettingsReader.get()");
            AgeGateSettings ageGateSettings = a.getAgeGateSettings();
            C7573i.m23582a((Object) ageGateSettings, "setting");
            if (C7573i.m23576a(ageGateSettings.getInitialDate().intValue(), 0) > 0) {
                return new Date(TimeUnit.SECONDS.toMillis((long) ageGateSettings.getInitialDate().intValue()));
            }
        } catch (NullValueException unused) {
        }
        return f58596c;
    }
}
