package com.p280ss.android.ugc.aweme.bullet.reactpackage;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.support.p022v4.util.C0902i;
import android.text.TextUtils;
import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.ies.bullet.kit.p261rn.BulletMethod;
import com.bytedance.ies.bullet.kit.p261rn.C10486a;
import com.bytedance.ies.bullet.kit.p261rn.C10488b;
import com.bytedance.ies.bullet.kit.p261rn.p546c.C10493a;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.ugc.appcontext.C6405d;
import com.bytedance.retrofit2.p637a.C12461b;
import com.p280ss.android.newmedia.C19936f;
import com.p280ss.android.sdk.webview.C20145l;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.app.AwemeAppData;
import com.p280ss.android.ugc.aweme.app.C22909c;
import com.p280ss.android.ugc.aweme.app.C22912d;
import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.app.api.C22838j;
import com.p280ss.android.ugc.aweme.bullet.C23563b;
import com.p280ss.android.ugc.aweme.crossplatform.platform.p1153rn.p1154a.C25910a;
import com.p280ss.android.ugc.aweme.crossplatform.platform.p1153rn.p1154a.C25912b;
import com.p280ss.android.ugc.aweme.framework.p1274c.C29956a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.hybrid.monitor.C30375b;
import com.p280ss.android.ugc.aweme.language.C32326h;
import com.p280ss.android.ugc.aweme.language.I18nManagerService;
import com.p280ss.android.ugc.aweme.net.CommonApi;
import com.p280ss.android.ugc.aweme.p1216fe.method.ShareMethod;
import com.p280ss.android.ugc.aweme.p931a.C21085a;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.utils.C43013ch;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.Callable;
import kotlin.C7581n;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlin.text.C7634n;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.bullet.reactpackage.RNCommonModule */
public final class RNCommonModule implements C10488b {
    private static final String APP_LANGUAGE = "app_language";
    private static final String APP_NAME = "appName";
    private static final String APP_VERSION = "appVersion";
    private static final String CHANNEL = "channel";
    public static final C23616a Companion = new C23616a(null);
    private static final String DEFAULT_CONTENT_TYPE = "application/x-www-form-urlencoded";
    private static final String DELETE = "DELETE";
    private static final String GECKO_PATH = "assetSource";
    private static final String GET = "GET";
    private static final String IS_FULL_SCREEN = "isFullScreen";
    private static final String LANGUAGE = "language";
    private static final String POST = "POST";
    private static final String PUT = "PUT";
    private static final String REGION = "region";
    private final CommonApi sApi = ((CommonApi) C22838j.m75274a(Api.f60502b).mo30492a(CommonApi.class));

    /* renamed from: com.ss.android.ugc.aweme.bullet.reactpackage.RNCommonModule$a */
    public static final class C23616a {
        private C23616a() {
        }

        public /* synthetic */ C23616a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.reactpackage.RNCommonModule$b */
    static final class C23617b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f62285a;

        /* renamed from: b */
        final /* synthetic */ C10486a f62286b;

        C23617b(String str, C10486a aVar) {
            this.f62285a = str;
            this.f62286b = aVar;
        }

        public final void run() {
            Activity activityById = C23563b.m77362a().getActivityById(this.f62285a);
            if (activityById == null) {
                C10486a aVar = this.f62286b;
                if (aVar != null) {
                    aVar.mo25269a("illegal state to finish page.", C29956a.f78749b);
                }
            } else {
                activityById.finish();
                C10486a aVar2 = this.f62286b;
                if (aVar2 != null) {
                    aVar2.mo25269a(C29956a.f78748a, C29956a.f78749b);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.reactpackage.RNCommonModule$c */
    static final class C23618c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ RNCommonModule f62287a;

        /* renamed from: b */
        final /* synthetic */ String f62288b;

        /* renamed from: c */
        final /* synthetic */ String f62289c;

        /* renamed from: d */
        final /* synthetic */ C10486a f62290d;

        C23618c(RNCommonModule rNCommonModule, String str, String str2, C10486a aVar) {
            this.f62287a = rNCommonModule;
            this.f62288b = str;
            this.f62289c = str2;
            this.f62290d = aVar;
        }

        public final void run() {
            boolean z;
            int i;
            Activity activityById = C23563b.m77362a().getActivityById(this.f62288b);
            CharSequence charSequence = this.f62289c;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z || activityById == null) {
                RNCommonModule.reportCallback$default(this.f62287a, this.f62290d, Integer.valueOf(C29956a.f78751d), "schema is not legal", null, 8, null);
            } else if (C7634n.m23721b(this.f62289c, "aweme://live/", false)) {
                Uri parse = Uri.parse(this.f62289c);
                String queryParameter = parse.getQueryParameter("room_id");
                String queryParameter2 = parse.getQueryParameter("user_id");
                if (!TextUtils.isEmpty(queryParameter) || !TextUtils.isEmpty(queryParameter2)) {
                    C22912d.f60645e.mo59887a((Context) activityById, C7634n.m23711a(this.f62289c, "aweme", C22909c.f60637a, false), (String) null);
                    RNCommonModule.reportCallback$default(this.f62287a, this.f62290d, Integer.valueOf(C29956a.f78750c), null, null, 12, null);
                    return;
                }
                RNCommonModule.reportCallback$default(this.f62287a, this.f62290d, Integer.valueOf(C29956a.f78751d), null, null, 12, null);
            } else {
                boolean a = C7195s.m22438a().mo18679a(activityById, this.f62289c);
                RNCommonModule rNCommonModule = this.f62287a;
                C10486a aVar = this.f62290d;
                if (a) {
                    i = C29956a.f78750c;
                } else {
                    i = C29956a.f78751d;
                }
                RNCommonModule.reportCallback$default(rNCommonModule, aVar, Integer.valueOf(i), null, null, 12, null);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.reactpackage.RNCommonModule$d */
    static final class C23619d<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ RNCommonModule f62291a;

        /* renamed from: b */
        final /* synthetic */ String f62292b;

        /* renamed from: c */
        final /* synthetic */ Map f62293c;

        /* renamed from: d */
        final /* synthetic */ HashMap f62294d;

        /* renamed from: e */
        final /* synthetic */ ObjectRef f62295e;

        /* renamed from: f */
        final /* synthetic */ List f62296f;

        C23619d(RNCommonModule rNCommonModule, String str, Map map, HashMap hashMap, ObjectRef objectRef, List list) {
            this.f62291a = rNCommonModule;
            this.f62292b = str;
            this.f62293c = map;
            this.f62294d = hashMap;
            this.f62295e = objectRef;
            this.f62296f = list;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C0902i<String, C30375b> call() {
            return this.f62291a.callInBackground(this.f62292b, this.f62293c, this.f62294d, (String) this.f62295e.element, this.f62296f);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.reactpackage.RNCommonModule$e */
    static final class C23620e<TTaskResult, TContinuationResult> implements C1591g<C0902i<String, C30375b>, C7581n> {

        /* renamed from: a */
        final /* synthetic */ RNCommonModule f62297a;

        /* renamed from: b */
        final /* synthetic */ C10486a f62298b;

        C23620e(RNCommonModule rNCommonModule, C10486a aVar) {
            this.f62297a = rNCommonModule;
            this.f62298b = aVar;
        }

        public final /* synthetic */ Object then(C1592h hVar) {
            m77523a(hVar);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m77523a(C1592h<C0902i<String, C30375b>> hVar) {
            RNCommonModule rNCommonModule = this.f62297a;
            C7573i.m23582a((Object) hVar, "task");
            rNCommonModule.continueWith(hVar, this.f62298b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.reactpackage.RNCommonModule$f */
    static final class C23621f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ RNCommonModule f62299a;

        /* renamed from: b */
        final /* synthetic */ Map f62300b;

        /* renamed from: c */
        final /* synthetic */ C10486a f62301c;

        C23621f(RNCommonModule rNCommonModule, Map map, C10486a aVar) {
            this.f62299a = rNCommonModule;
            this.f62300b = map;
            this.f62301c = aVar;
        }

        public final void run() {
            boolean z;
            int i;
            try {
                z = new ShareMethod(null, 1, null).mo71405a(new WeakReference<>(C6405d.m19984g()), new JSONObject(this.f62300b));
            } catch (Exception unused) {
                z = false;
            }
            RNCommonModule rNCommonModule = this.f62299a;
            C10486a aVar = this.f62301c;
            if (z) {
                i = C29956a.f78750c;
            } else {
                i = C29956a.f78751d;
            }
            RNCommonModule.reportCallback$default(rNCommonModule, aVar, Integer.valueOf(i), null, null, 12, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.reactpackage.RNCommonModule$g */
    static final class C23622g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f62302a;

        C23622g(String str) {
            this.f62302a = str;
        }

        public final void run() {
            C10761a.m31410e((Context) C6405d.m19984g(), this.f62302a).mo25750a();
        }
    }

    public final String getName() {
        return "brn";
    }

    public final boolean hasConstants() {
        return false;
    }

    public final void initialize() {
    }

    public final void onCatalystInstanceDestroy() {
    }

    public final Map<String, Object> getConstants() {
        Map<String, Object> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(APP_NAME, C6399b.m19929e());
        linkedHashMap.put(APP_VERSION, C6399b.m19934j());
        String str = LANGUAGE;
        String locale = C43013ch.m136515b().toString();
        C7573i.m23582a((Object) locale, "LocaleUtils.getCurrentLocale().toString()");
        linkedHashMap.put(str, locale);
        String str2 = APP_LANGUAGE;
        Object service = ServiceManager.get().getService(I18nManagerService.class);
        C7573i.m23582a(service, "ServiceManager.get()\n   …nagerService::class.java)");
        String appLanguage = ((I18nManagerService) service).getAppLanguage();
        C7573i.m23582a((Object) appLanguage, "ServiceManager.get()\n   …::class.java).appLanguage");
        linkedHashMap.put(str2, appLanguage);
        String str3 = REGION;
        String g = C32326h.m104885g();
        C7573i.m23582a((Object) g, "RegionHelper.getRegion()");
        linkedHashMap.put(str3, g);
        linkedHashMap.put(CHANNEL, C6399b.m19941q());
        linkedHashMap.put(IS_FULL_SCREEN, Boolean.valueOf(C21085a.m71117a().f56622i));
        AwemeAppData a = C19936f.m65765a();
        C7573i.m23582a((Object) a, "BaseAppData.inst()");
        C20145l g2 = a.mo53441g();
        if (g2 != null) {
            String str4 = GECKO_PATH;
            String a2 = g2.mo53916a();
            C7573i.m23582a((Object) a2, "config.offlineRootDir()");
            linkedHashMap.put(str4, a2);
        }
        return linkedHashMap;
    }

    @BulletMethod
    public final void showToast(String str) {
        new Handler(Looper.getMainLooper()).post(new C23622g(str));
    }

    @BulletMethod
    public final void getAppInfo(C10486a aVar) {
        if (aVar != null) {
            try {
                aVar.mo25269a(C29956a.f78748a, C25910a.m85196a());
            } catch (Exception e) {
                if (aVar != null) {
                    aVar.mo25269a(e.getMessage(), C29956a.f78749b);
                }
            }
        }
    }

    @BulletMethod
    public final void getUserInfo(C10486a aVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            IAccountUserService a = C21115b.m71197a();
            C7573i.m23582a((Object) a, "AccountUserProxyService.get()");
            if (a.isLogin()) {
                IAccountUserService a2 = C21115b.m71197a();
                C7573i.m23582a((Object) a2, "AccountUserProxyService.get()");
                User curUser = a2.getCurUser();
                jSONObject.put("login", true);
                C7573i.m23582a((Object) curUser, "curUser");
                jSONObject.put("openid", curUser.getUid());
                jSONObject.put("bindPhone", curUser.getBindPhone());
                if (aVar != null) {
                    aVar.mo25269a(C29956a.f78748a, jSONObject.toString());
                }
            } else {
                jSONObject.put("login", false);
                if (aVar != null) {
                    aVar.mo25269a(C29956a.f78748a, jSONObject.toString());
                }
            }
        } catch (Exception unused) {
            if (aVar != null) {
                aVar.mo25269a("service get error", C29956a.f78749b);
            }
        }
    }

    @BulletMethod
    public final void close(String str, C10486a aVar) {
        if (str != null) {
            new Handler(Looper.getMainLooper()).post(new C23617b(str, aVar));
        }
    }

    @BulletMethod
    public final void share(Map<String, ? extends Object> map, C10486a aVar) {
        if (map != null) {
            new Handler(Looper.getMainLooper()).post(new C23621f(this, map, aVar));
        }
    }

    @BulletMethod
    public final void logEventV3(String str, Map<String, ? extends Object> map) {
        if (str != null && map != null) {
            Map linkedHashMap = new LinkedHashMap();
            for (Entry entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), String.valueOf(entry.getValue()));
            }
            C25912b.m85200a(C6405d.m19984g(), str, linkedHashMap);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0096, code lost:
        if (r9.optInt("code") != 0) goto L_0x0098;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void continueWith(bolts.C1592h<android.support.p022v4.util.C0902i<java.lang.String, com.p280ss.android.ugc.aweme.hybrid.monitor.C30375b>> r8, com.bytedance.ies.bullet.kit.p261rn.C10486a r9) {
        /*
            r7 = this;
            boolean r0 = r8.mo6889d()
            r1 = 2
            r2 = 0
            r3 = 0
            r4 = 1
            if (r0 == 0) goto L_0x0055
            java.lang.Exception r0 = r8.mo6891f()
            boolean r2 = r0 instanceof com.p280ss.android.http.legacy.client.HttpResponseException
            if (r2 == 0) goto L_0x001a
            r2 = r0
            com.ss.android.http.legacy.client.HttpResponseException r2 = (com.p280ss.android.http.legacy.client.HttpResponseException) r2
            int r2 = r2.getStatusCode()
            goto L_0x001b
        L_0x001a:
            r2 = 1
        L_0x001b:
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>()
            java.util.Map r5 = (java.util.Map) r5
            java.lang.String r6 = "statusCode"
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r5.put(r6, r2)
            java.lang.String r2 = "statusMessage"
            java.lang.String r6 = r0.getMessage()
            if (r6 != 0) goto L_0x0035
            java.lang.String r6 = ""
        L_0x0035:
            r5.put(r2, r6)
            if (r9 == 0) goto L_0x0045
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r5
            java.lang.Object r2 = com.p280ss.android.ugc.aweme.framework.p1274c.C29956a.f78749b
            r1[r4] = r2
            r9.mo25269a(r1)
        L_0x0045:
            com.ss.android.ugc.aweme.hybrid.monitor.ApiResultException r2 = new com.ss.android.ugc.aweme.hybrid.monitor.ApiResultException
            java.lang.String r9 = "network_error"
            java.lang.String r1 = "exception"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            r2.<init>(r9, r0)
            goto L_0x00de
        L_0x0055:
            java.lang.Object r0 = r8.mo6890e()
            android.support.v4.util.i r0 = (android.support.p022v4.util.C0902i) r0
            F r0 = r0.f3154a
            java.lang.String r0 = (java.lang.String) r0
            if (r9 == 0) goto L_0x006c
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Object r5 = com.p280ss.android.ugc.aweme.framework.p1274c.C29956a.f78748a
            r1[r3] = r5
            r1[r4] = r0
            r9.mo25269a(r1)
        L_0x006c:
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00dd }
            r9.<init>(r0)     // Catch:{ JSONException -> 0x00dd }
            java.lang.String r1 = "message"
            boolean r1 = r9.has(r1)     // Catch:{ JSONException -> 0x00dd }
            if (r1 == 0) goto L_0x0088
            java.lang.String r1 = "success"
            java.lang.String r3 = "message"
            java.lang.String r9 = r9.optString(r3)     // Catch:{ JSONException -> 0x00dd }
            boolean r9 = kotlin.jvm.internal.C7573i.m23585a(r1, r9)     // Catch:{ JSONException -> 0x00dd }
            r3 = r9 ^ 1
            goto L_0x00bc
        L_0x0088:
            java.lang.String r1 = "code"
            boolean r1 = r9.has(r1)     // Catch:{ JSONException -> 0x00dd }
            if (r1 == 0) goto L_0x009a
            java.lang.String r1 = "code"
            int r9 = r9.optInt(r1)     // Catch:{ JSONException -> 0x00dd }
            if (r9 == 0) goto L_0x00bc
        L_0x0098:
            r3 = 1
            goto L_0x00bc
        L_0x009a:
            java.lang.String r1 = "status_code"
            boolean r1 = r9.has(r1)     // Catch:{ JSONException -> 0x00dd }
            if (r1 == 0) goto L_0x00ab
            java.lang.String r1 = "status_code"
            int r9 = r9.optInt(r1)     // Catch:{ JSONException -> 0x00dd }
            if (r9 == 0) goto L_0x00bc
            goto L_0x0098
        L_0x00ab:
            java.lang.String r1 = "statusCode"
            boolean r1 = r9.has(r1)     // Catch:{ JSONException -> 0x00dd }
            if (r1 == 0) goto L_0x00bc
            java.lang.String r1 = "statusCode"
            int r9 = r9.optInt(r1)     // Catch:{ JSONException -> 0x00dd }
            if (r9 == 0) goto L_0x00bc
            goto L_0x0098
        L_0x00bc:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r3)     // Catch:{ JSONException -> 0x00dd }
            boolean r1 = r9.booleanValue()     // Catch:{ JSONException -> 0x00dd }
            if (r1 == 0) goto L_0x00c7
            goto L_0x00c8
        L_0x00c7:
            r9 = r2
        L_0x00c8:
            if (r9 == 0) goto L_0x00de
            r9.booleanValue()     // Catch:{ JSONException -> 0x00dd }
            com.ss.android.ugc.aweme.hybrid.monitor.ApiResultException r9 = new com.ss.android.ugc.aweme.hybrid.monitor.ApiResultException     // Catch:{ JSONException -> 0x00dd }
            java.lang.String r1 = "api_error"
            java.lang.Exception r3 = new java.lang.Exception     // Catch:{ JSONException -> 0x00dd }
            r3.<init>(r0)     // Catch:{ JSONException -> 0x00dd }
            java.lang.Throwable r3 = (java.lang.Throwable) r3     // Catch:{ JSONException -> 0x00dd }
            r9.<init>(r1, r3)     // Catch:{ JSONException -> 0x00dd }
            r2 = r9
            goto L_0x00de
        L_0x00dd:
        L_0x00de:
            java.lang.Object r8 = r8.mo6890e()
            android.support.v4.util.i r8 = (android.support.p022v4.util.C0902i) r8
            S r8 = r8.f3155b
            com.ss.android.ugc.aweme.hybrid.monitor.b r8 = (com.p280ss.android.ugc.aweme.hybrid.monitor.C30375b) r8
            if (r8 == 0) goto L_0x0108
            com.ss.android.ugc.aweme.crossplatform.d r9 = com.p280ss.android.ugc.aweme.crossplatform.C25870d.C25871a.m85133a()
            com.ss.android.ugc.aweme.hybrid.monitor.i r9 = r9.mo67248b()
            if (r9 == 0) goto L_0x0107
            java.lang.Class<com.ss.android.ugc.aweme.hybrid.monitor.o> r0 = com.p280ss.android.ugc.aweme.hybrid.monitor.C30395o.class
            com.ss.android.ugc.aweme.hybrid.monitor.q r9 = r9.mo80008a(r0)
            com.ss.android.ugc.aweme.hybrid.monitor.o r9 = (com.p280ss.android.ugc.aweme.hybrid.monitor.C30395o) r9
            if (r9 == 0) goto L_0x0107
            java.lang.String r0 = "apiRequest"
            kotlin.jvm.internal.C7573i.m23582a(r8, r0)
            r9.mo79993a(r8, r2)
            goto L_0x0108
        L_0x0107:
            return
        L_0x0108:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.bullet.reactpackage.RNCommonModule.continueWith(bolts.h, com.bytedance.ies.bullet.kit.rn.a):void");
    }

    @BulletMethod
    public final void openSchema(String str, String str2, C10486a aVar) {
        if (str != null) {
            new Handler(Looper.getMainLooper()).post(new C23618c(this, str, str2, aVar));
        }
    }

    @BulletMethod
    public final void request(String str, Map<String, ? extends Object> map, C10486a aVar) {
        boolean z;
        boolean z2;
        CharSequence charSequence = str;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z && map != null && map.get("method") != null) {
            Object obj = map.get("params");
            if (!(obj instanceof HashMap)) {
                obj = null;
            }
            HashMap hashMap = (HashMap) obj;
            List arrayList = new ArrayList();
            ObjectRef objectRef = new ObjectRef();
            objectRef.element = null;
            Object obj2 = map.get("header");
            if (!(obj2 instanceof HashMap)) {
                obj2 = null;
            }
            HashMap hashMap2 = (HashMap) obj2;
            if (hashMap2 != null) {
                for (Entry entry : hashMap2.entrySet()) {
                    Object value = entry.getValue();
                    if (value != null) {
                        T a = C10493a.f28230a.mo25284a(value);
                        if (((CharSequence) a).length() > 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (!z2) {
                            a = null;
                        }
                        if (a != null) {
                            arrayList.add(new C12461b((String) entry.getKey(), a));
                            if (C7634n.m23717a("content-type", (String) entry.getKey(), true)) {
                                objectRef.element = a;
                            }
                        }
                    }
                }
            }
            C23619d dVar = new C23619d(this, str, map, hashMap, objectRef, arrayList);
            C1592h.m7853a((Callable<TResult>) dVar).mo6876a((C1591g<TResult, TContinuationResult>) new C23620e<TResult,TContinuationResult>(this, aVar), C1592h.f5958b);
        }
    }

    private final C7581n reportCallback(C10486a aVar, Integer num, String str, Map<String, ? extends Object> map) {
        if (aVar == null) {
            return null;
        }
        Map linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("code", num);
        linkedHashMap.put("message", str);
        linkedHashMap.put("data", map);
        aVar.mo25269a(linkedHashMap);
        return C7581n.f20898a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01ca, code lost:
        if (r11 == null) goto L_0x01cc;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.support.p022v4.util.C0902i<java.lang.String, com.p280ss.android.ugc.aweme.hybrid.monitor.C30375b> callInBackground(java.lang.String r8, java.util.Map<java.lang.String, ? extends java.lang.Object> r9, java.util.HashMap<java.lang.String, java.lang.Object> r10, java.lang.String r11, java.util.List<com.bytedance.retrofit2.p637a.C12461b> r12) {
        /*
            r7 = this;
            com.ss.android.common.util.j r0 = new com.ss.android.common.util.j
            r0.<init>(r8)
            java.util.List<com.ss.android.http.legacy.a.e> r8 = r0.f52191a
            java.util.Iterator r8 = r8.iterator()
        L_0x000b:
            boolean r1 = r8.hasNext()
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x002c
            java.lang.Object r1 = r8.next()
            com.ss.android.http.legacy.a.e r1 = (com.p280ss.android.http.legacy.p296a.C19565e) r1
            java.lang.String r4 = "request_tag_from"
            java.lang.String r5 = "pair"
            kotlin.jvm.internal.C7573i.m23582a(r1, r5)
            java.lang.String r1 = r1.mo51722a()
            boolean r1 = kotlin.text.C7634n.m23717a(r4, r1, r2)
            if (r1 == 0) goto L_0x000b
            r8 = 1
            goto L_0x002d
        L_0x002c:
            r8 = 0
        L_0x002d:
            if (r8 != 0) goto L_0x0036
            java.lang.String r8 = "request_tag_from"
            java.lang.String r1 = "rn"
            r0.mo51188a(r8, r1)
        L_0x0036:
            java.lang.String r8 = "method"
            java.lang.Object r8 = r9.get(r8)
            if (r8 == 0) goto L_0x0204
            java.lang.String r8 = (java.lang.String) r8
            if (r8 == 0) goto L_0x01fc
            java.lang.String r8 = r8.toUpperCase()
            java.lang.String r9 = "(this as java.lang.String).toUpperCase()"
            kotlin.jvm.internal.C7573i.m23582a(r8, r9)
            java.lang.String r9 = ""
            r1 = 0
            int r4 = r8.hashCode()
            r5 = 70454(0x11336, float:9.8727E-41)
            if (r4 == r5) goto L_0x0163
            r5 = 79599(0x136ef, float:1.11542E-40)
            if (r4 == r5) goto L_0x013f
            r5 = 2461856(0x2590a0, float:3.449795E-39)
            if (r4 == r5) goto L_0x00dc
            r9 = 2012838315(0x77f979ab, float:1.0119919E34)
            if (r4 != r9) goto L_0x01f2
            java.lang.String r9 = "DELETE"
            boolean r9 = r8.equals(r9)
            if (r9 == 0) goto L_0x01f2
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.List r9 = (java.util.List) r9
            if (r10 == 0) goto L_0x00c0
            java.util.Iterator r11 = r12.iterator()
        L_0x007b:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x0094
            java.lang.Object r12 = r11.next()
            com.bytedance.retrofit2.a.b r12 = (com.bytedance.retrofit2.p637a.C12461b) r12
            com.bytedance.retrofit2.a.b r4 = new com.bytedance.retrofit2.a.b
            java.lang.String r5 = r12.f33095a
            java.lang.String r12 = r12.f33096b
            r4.<init>(r5, r12)
            r9.add(r4)
            goto L_0x007b
        L_0x0094:
            java.util.Map r10 = (java.util.Map) r10
            java.util.Set r10 = r10.entrySet()
            java.util.Iterator r10 = r10.iterator()
        L_0x009e:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x00c0
            java.lang.Object r11 = r10.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.Object r12 = r11.getValue()
            if (r12 == 0) goto L_0x009e
            java.lang.Object r11 = r11.getKey()
            java.lang.String r11 = (java.lang.String) r11
            com.bytedance.ies.bullet.kit.rn.c.a r4 = com.bytedance.ies.bullet.kit.p261rn.p546c.C10493a.f28230a
            java.lang.String r12 = r4.mo25284a(r12)
            r0.mo51188a(r11, r12)
            goto L_0x009e
        L_0x00c0:
            java.lang.String r10 = r0.toString()
            java.lang.String r11 = "urlBuilder.toString()"
            kotlin.jvm.internal.C7573i.m23582a(r10, r11)
            com.ss.android.ugc.aweme.net.CommonApi r11 = r7.sApi
            com.bytedance.retrofit2.b r9 = r11.doDelete(r10, r3, r9)
            com.bytedance.retrofit2.t r9 = r9.execute()
            T r9 = r9.f33302b
            java.lang.String r9 = (java.lang.String) r9
        L_0x00d7:
            r6 = r10
            r10 = r9
            r9 = r6
            goto L_0x01b0
        L_0x00dc:
            java.lang.String r4 = "POST"
            boolean r4 = r8.equals(r4)
            if (r4 == 0) goto L_0x01f2
            if (r10 == 0) goto L_0x00ec
            java.util.Map r10 = (java.util.Map) r10
            org.json.JSONObject r1 = com.bytedance.ies.bullet.kit.p261rn.p546c.C10493a.m30885a(r10)
        L_0x00ec:
            if (r11 == 0) goto L_0x00f6
            com.ss.android.ugc.aweme.utils.cr r10 = com.p280ss.android.ugc.aweme.utils.C43023cr.f111606a
            java.lang.String r10 = r10.mo104700b(r9, r1, r11, r12)
            goto L_0x01b0
        L_0x00f6:
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            if (r1 == 0) goto L_0x0122
            java.util.Iterator r10 = r1.keys()
        L_0x0101:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x0122
            java.lang.Object r11 = r10.next()
            java.lang.String r11 = (java.lang.String) r11
            r12 = r9
            java.util.Map r12 = (java.util.Map) r12
            java.lang.String r4 = "key"
            kotlin.jvm.internal.C7573i.m23582a(r11, r4)
            java.lang.String r4 = r1.optString(r11)
            java.lang.String r5 = "json.optString(key)"
            kotlin.jvm.internal.C7573i.m23582a(r4, r5)
            r12.put(r11, r4)
            goto L_0x0101
        L_0x0122:
            java.lang.String r10 = r0.toString()
            java.lang.String r11 = "urlBuilder.toString()"
            kotlin.jvm.internal.C7573i.m23582a(r10, r11)
            java.util.Map r9 = (java.util.Map) r9
            com.p280ss.android.common.applog.NetUtil.putCommonParams(r9, r2)
            com.ss.android.ugc.aweme.net.CommonApi r11 = r7.sApi
            com.bytedance.retrofit2.b r9 = r11.doPost(r10, r3, r9)
            com.bytedance.retrofit2.t r9 = r9.execute()
            T r9 = r9.f33302b
            java.lang.String r9 = (java.lang.String) r9
            goto L_0x00d7
        L_0x013f:
            java.lang.String r9 = "PUT"
            boolean r9 = r8.equals(r9)
            if (r9 == 0) goto L_0x01f2
            if (r10 == 0) goto L_0x014f
            java.util.Map r10 = (java.util.Map) r10
            org.json.JSONObject r1 = com.bytedance.ies.bullet.kit.p261rn.p546c.C10493a.m30885a(r10)
        L_0x014f:
            java.lang.String r9 = r0.toString()
            java.lang.String r10 = "urlBuilder.toString()"
            kotlin.jvm.internal.C7573i.m23582a(r9, r10)
            com.ss.android.ugc.aweme.utils.cr r10 = com.p280ss.android.ugc.aweme.utils.C43023cr.f111606a
            if (r11 != 0) goto L_0x015e
            java.lang.String r11 = "application/x-www-form-urlencoded"
        L_0x015e:
            java.lang.String r10 = r10.mo104699a(r9, r1, r11, r12)
            goto L_0x01b0
        L_0x0163:
            java.lang.String r9 = "GET"
            boolean r9 = r8.equals(r9)
            if (r9 == 0) goto L_0x01f2
            if (r10 == 0) goto L_0x0199
            java.util.Map r10 = (java.util.Map) r10
            java.util.Set r9 = r10.entrySet()
            java.util.Iterator r9 = r9.iterator()
        L_0x0177:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x0199
            java.lang.Object r10 = r9.next()
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10
            java.lang.Object r11 = r10.getValue()
            if (r11 == 0) goto L_0x0177
            java.lang.Object r10 = r10.getKey()
            java.lang.String r10 = (java.lang.String) r10
            com.bytedance.ies.bullet.kit.rn.c.a r12 = com.bytedance.ies.bullet.kit.p261rn.p546c.C10493a.f28230a
            java.lang.String r11 = r12.mo25284a(r11)
            r0.mo51188a(r10, r11)
            goto L_0x0177
        L_0x0199:
            java.lang.String r9 = r0.toString()
            java.lang.String r10 = "urlBuilder.toString()"
            kotlin.jvm.internal.C7573i.m23582a(r9, r10)
            com.ss.android.ugc.aweme.net.CommonApi r10 = r7.sApi
            com.bytedance.retrofit2.b r10 = r10.doGet(r9, r3)
            com.bytedance.retrofit2.t r10 = r10.execute()
            T r10 = r10.f33302b
            java.lang.String r10 = (java.lang.String) r10
        L_0x01b0:
            java.lang.String r11 = ""
            boolean r11 = kotlin.jvm.internal.C7573i.m23585a(r9, r11)
            r11 = r11 ^ r2
            if (r11 == 0) goto L_0x01e1
            if (r8 == 0) goto L_0x01d9
            java.lang.String r8 = r8.toLowerCase()
            java.lang.String r11 = "(this as java.lang.String).toLowerCase()"
            kotlin.jvm.internal.C7573i.m23582a(r8, r11)
            if (r1 == 0) goto L_0x01cc
            java.lang.String r11 = r1.toString()
            if (r11 != 0) goto L_0x01ce
        L_0x01cc:
            java.lang.String r11 = ""
        L_0x01ce:
            com.ss.android.ugc.aweme.hybrid.monitor.b r12 = new com.ss.android.ugc.aweme.hybrid.monitor.b
            r12.<init>(r9, r8, r11)
            android.support.v4.util.i r8 = new android.support.v4.util.i
            r8.<init>(r10, r12)
            return r8
        L_0x01d9:
            kotlin.TypeCastException r8 = new kotlin.TypeCastException
            java.lang.String r9 = "null cannot be cast to non-null type java.lang.String"
            r8.<init>(r9)
            throw r8
        L_0x01e1:
            android.support.v4.util.i r8 = new android.support.v4.util.i
            com.ss.android.ugc.aweme.hybrid.monitor.b r9 = new com.ss.android.ugc.aweme.hybrid.monitor.b
            java.lang.String r11 = ""
            java.lang.String r12 = ""
            java.lang.String r0 = ""
            r9.<init>(r11, r12, r0)
            r8.<init>(r10, r9)
            return r8
        L_0x01f2:
            java.lang.Exception r8 = new java.lang.Exception
            java.lang.String r9 = "method should be in [GET, POST, PUT, DELETE]"
            r8.<init>(r9)
            java.lang.Throwable r8 = (java.lang.Throwable) r8
            throw r8
        L_0x01fc:
            kotlin.TypeCastException r8 = new kotlin.TypeCastException
            java.lang.String r9 = "null cannot be cast to non-null type java.lang.String"
            r8.<init>(r9)
            throw r8
        L_0x0204:
            kotlin.TypeCastException r8 = new kotlin.TypeCastException
            java.lang.String r9 = "null cannot be cast to non-null type kotlin.String"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.bullet.reactpackage.RNCommonModule.callInBackground(java.lang.String, java.util.Map, java.util.HashMap, java.lang.String, java.util.List):android.support.v4.util.i");
    }

    static /* synthetic */ C7581n reportCallback$default(RNCommonModule rNCommonModule, C10486a aVar, Integer num, String str, Map map, int i, Object obj) {
        if ((i & 4) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            map = null;
        }
        return rNCommonModule.reportCallback(aVar, num, str, map);
    }
}
