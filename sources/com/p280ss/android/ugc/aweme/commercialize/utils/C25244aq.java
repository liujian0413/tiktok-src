package com.p280ss.android.ugc.aweme.commercialize.utils;

import android.net.Uri.Builder;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.google.gson.C6600e;
import com.p280ss.android.common.applog.AppLog;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.commercialize.model.LinkData;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.language.I18nManagerService;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.aq */
public final class C25244aq {

    /* renamed from: a */
    public static final C25244aq f66584a = new C25244aq();

    private C25244aq() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0033, code lost:
        if (r3 == null) goto L_0x0035;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.HashMap<java.lang.String, java.lang.String> m82988a(com.p280ss.android.ugc.aweme.feed.model.Aweme r3, java.lang.String r4) {
        /*
            java.lang.String r0 = "aweme"
            kotlin.jvm.internal.C7573i.m23587b(r3, r0)
            java.lang.String r0 = "from"
            kotlin.jvm.internal.C7573i.m23587b(r4, r0)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r1 = "enter_from"
            r0.put(r1, r4)
            java.lang.String r4 = "author_id"
            java.lang.String r1 = r3.getAuthorUid()
            r0.put(r4, r1)
            java.lang.String r4 = "group_id"
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r3 = r3.getAwemeRawAd()
            if (r3 == 0) goto L_0x0035
            java.lang.Long r3 = r3.getGroupId()
            if (r3 == 0) goto L_0x0035
            long r1 = r3.longValue()
            java.lang.String r3 = java.lang.String.valueOf(r1)
            if (r3 != 0) goto L_0x0037
        L_0x0035:
            java.lang.String r3 = ""
        L_0x0037:
            r0.put(r4, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.commercialize.utils.C25244aq.m82988a(com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String):java.util.HashMap");
    }

    /* renamed from: a */
    public static final Builder m82987a(Aweme aweme, String str, String str2) {
        C7573i.m23587b(aweme, "aweme");
        C7573i.m23587b(str, "reportFrom");
        C7573i.m23587b(str2, "reportType");
        return m82985a(new Builder(), aweme, str, str2);
    }

    /* renamed from: b */
    public static final Builder m82989b(Aweme aweme, String str, String str2) {
        Object obj;
        C7573i.m23587b(aweme, "aweme");
        C7573i.m23587b(str, "reportFrom");
        C7573i.m23587b(str2, "reportType");
        HashMap hashMap = new HashMap();
        LinkData a = C25268bg.m83039a(aweme);
        Map map = hashMap;
        String str3 = "log_extra";
        String str4 = null;
        if (a != null) {
            obj = a.logExtra;
        } else {
            obj = null;
        }
        map.put(str3, obj);
        String str5 = "cid";
        if (a != null) {
            str4 = a.creativeId;
        }
        map.put(str5, str4);
        Builder builder = new Builder();
        String b = new C6600e().mo15979b((Object) hashMap);
        C7573i.m23582a((Object) b, "Gson().toJson(extraMap)");
        return m82986a(builder, aweme, str, str2, b);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004f, code lost:
        if (r3 == null) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003c, code lost:
        if (r3 == null) goto L_0x003e;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.net.Uri.Builder m82985a(android.net.Uri.Builder r5, com.p280ss.android.ugc.aweme.feed.model.Aweme r6, java.lang.String r7, java.lang.String r8) {
        /*
            java.lang.String r0 = "builder"
            kotlin.jvm.internal.C7573i.m23587b(r5, r0)
            java.lang.String r0 = "aweme"
            kotlin.jvm.internal.C7573i.m23587b(r6, r0)
            java.lang.String r0 = "reportFrom"
            kotlin.jvm.internal.C7573i.m23587b(r7, r0)
            java.lang.String r0 = "reportType"
            kotlin.jvm.internal.C7573i.m23587b(r8, r0)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1 = r0
            java.util.Map r1 = (java.util.Map) r1
            java.lang.String r2 = "log_extra"
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r3 = r6.getAwemeRawAd()
            if (r3 == 0) goto L_0x003e
            java.lang.String r3 = r3.getLogExtra()
            if (r3 == 0) goto L_0x003e
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r3 = r6.getAwemeRawAd()
            if (r3 != 0) goto L_0x0033
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x0033:
            java.lang.String r4 = "aweme.awemeRawAd!!"
            kotlin.jvm.internal.C7573i.m23582a(r3, r4)
            java.lang.String r3 = r3.getLogExtra()
            if (r3 != 0) goto L_0x0040
        L_0x003e:
            java.lang.String r3 = ""
        L_0x0040:
            r1.put(r2, r3)
            java.lang.String r2 = "cid"
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r3 = r6.getAwemeRawAd()
            if (r3 == 0) goto L_0x0051
            java.lang.String r3 = r3.getCreativeIdStr()
            if (r3 != 0) goto L_0x0053
        L_0x0051:
            java.lang.String r3 = ""
        L_0x0053:
            r1.put(r2, r3)
            com.google.gson.e r1 = new com.google.gson.e
            r1.<init>()
            java.lang.String r0 = r1.mo15979b(r0)
            java.lang.String r1 = "Gson().toJson(extraMap)"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            android.net.Uri$Builder r5 = m82986a(r5, r6, r7, r8, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.commercialize.utils.C25244aq.m82985a(android.net.Uri$Builder, com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String, java.lang.String):android.net.Uri$Builder");
    }

    /* renamed from: a */
    public static final Builder m82986a(Builder builder, Aweme aweme, String str, String str2, String str3) {
        Long l;
        C7573i.m23587b(builder, "builder");
        C7573i.m23587b(aweme, "aweme");
        C7573i.m23587b(str, "reportFrom");
        C7573i.m23587b(str2, "reportType");
        C7573i.m23587b(str3, "extra");
        IAccountUserService a = C21115b.m71197a();
        C7573i.m23582a((Object) a, "AccountUserProxyService.get()");
        Builder appendQueryParameter = builder.appendQueryParameter("report_type", str2).appendQueryParameter("item_id", aweme.getAid()).appendQueryParameter("owner_id", aweme.getAuthorUid()).appendQueryParameter("user_id", a.getCurUserId());
        String str4 = "group_id";
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd != null) {
            l = awemeRawAd.getGroupId();
        } else {
            l = null;
        }
        Object service = ServiceManager.get().getService(I18nManagerService.class);
        C7573i.m23582a(service, "ServiceManager.get().get…nagerService::class.java)");
        Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter(str4, String.valueOf(l)).appendQueryParameter("report_from", str).appendQueryParameter("app_language", ((I18nManagerService) service).getAppLanguage()).appendQueryParameter("extra", str3).appendQueryParameter("app_name", C6399b.m19929e()).appendQueryParameter("device_id", AppLog.getServerDeviceId()).appendQueryParameter("platform", "android").appendQueryParameter(C38347c.f99551f, C6399b.m19934j()).appendQueryParameter("install_id", AppLog.getInstallId());
        C7573i.m23582a((Object) appendQueryParameter2, "builder\n                …\", AppLog.getInstallId())");
        return appendQueryParameter2;
    }
}
