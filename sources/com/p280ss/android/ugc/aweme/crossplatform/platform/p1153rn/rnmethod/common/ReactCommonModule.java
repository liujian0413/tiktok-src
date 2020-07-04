package com.p280ss.android.ugc.aweme.crossplatform.platform.p1153rn.rnmethod.common;

import android.content.Context;
import android.support.p022v4.util.C0902i;
import android.text.TextUtils;
import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.ugc.appcontext.C6405d;
import com.bytedance.retrofit2.p637a.C12461b;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.UiThreadUtil;
import com.p280ss.android.common.util.C19290j;
import com.p280ss.android.http.legacy.p296a.C19565e;
import com.p280ss.android.newmedia.C19936f;
import com.p280ss.android.sdk.webview.C20145l;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.app.api.C22838j;
import com.p280ss.android.ugc.aweme.crossplatform.platform.p1153rn.p1154a.C25910a;
import com.p280ss.android.ugc.aweme.crossplatform.platform.p1153rn.p1154a.C25912b;
import com.p280ss.android.ugc.aweme.crossplatform.platform.p1153rn.rnmethod.common.p1155a.C25940a;
import com.p280ss.android.ugc.aweme.framework.ReactInstance;
import com.p280ss.android.ugc.aweme.framework.activity.C29948b;
import com.p280ss.android.ugc.aweme.framework.p1274c.C29956a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.hybrid.monitor.C30375b;
import com.p280ss.android.ugc.aweme.language.C32326h;
import com.p280ss.android.ugc.aweme.language.I18nManagerService;
import com.p280ss.android.ugc.aweme.net.CommonApi;
import com.p280ss.android.ugc.aweme.p1216fe.method.ShareMethod;
import com.p280ss.android.ugc.aweme.p931a.C21085a;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.util.C42893q;
import com.p280ss.android.ugc.aweme.utils.C43013ch;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.rn.rnmethod.common.ReactCommonModule */
public class ReactCommonModule extends ReactContextBaseJavaModule {
    public final CommonApi sApi = ((CommonApi) C22838j.m75274a(Api.f60502b).mo30492a(CommonApi.class));

    public String getName() {
        return "brn";
    }

    public Map<String, Object> getConstants() {
        HashMap hashMap = new HashMap(16);
        hashMap.put("appName", C6399b.m19929e());
        hashMap.put("appVersion", C6399b.m19934j());
        hashMap.put("language", C43013ch.m136515b().toString());
        hashMap.put("app_language", ((I18nManagerService) ServiceManager.get().getService(I18nManagerService.class)).getAppLanguage());
        hashMap.put("region", C32326h.m104885g());
        hashMap.put("channel", C6399b.m19941q());
        hashMap.put("isFullScreen", Boolean.valueOf(C21085a.m71117a().f56622i));
        C20145l g = C19936f.m65765a().mo53441g();
        if (g != null) {
            hashMap.put("assetSource", g.mo53916a());
        }
        return hashMap;
    }

    static final /* synthetic */ void lambda$componentDidMount$3$ReactCommonModule(String str) {
        C29948b reactViewById = ReactInstance.getReactViewById(str);
        if (reactViewById != null) {
            reactViewById.mo67487d();
        }
    }

    @ReactMethod
    public void componentDidMount(String str) {
        UiThreadUtil.runOnUiThread(new C25944d(str));
    }

    @ReactMethod
    public void showToast(final String str) {
        UiThreadUtil.runOnUiThread(new Runnable() {
            public final void run() {
                C10761a.m31410e((Context) C6405d.m19984g(), str).mo25750a();
            }
        });
    }

    public ReactCommonModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    public void getAppInfo(Callback callback) {
        try {
            callback.invoke(C29956a.f78748a, C25910a.m85196a());
        } catch (Exception e) {
            callback.invoke(e.getMessage(), C29956a.f78749b);
        }
    }

    @ReactMethod
    public void getUserInfo(Callback callback) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (C21115b.m71197a().isLogin()) {
                User curUser = C21115b.m71197a().getCurUser();
                jSONObject.put("login", true);
                jSONObject.put("openid", curUser.getUid());
                jSONObject.put("bindPhone", curUser.getBindPhone());
                callback.invoke(C29956a.f78748a, jSONObject.toString());
                return;
            }
            jSONObject.put("login", false);
            callback.invoke(C29956a.f78748a, jSONObject.toString());
        } catch (Exception unused) {
            callback.invoke("service get error", C29956a.f78749b);
        }
    }

    static final /* synthetic */ void lambda$darkMode$2$ReactCommonModule(String str, Boolean bool) {
        C29948b reactViewById = ReactInstance.getReactViewById(str);
        if (reactViewById != null) {
            reactViewById.mo67481b(bool.booleanValue());
        }
    }

    @ReactMethod
    public void close(String str, Callback callback) {
        UiThreadUtil.runOnUiThread(new C25939a(str, callback));
    }

    @ReactMethod
    public void darkMode(String str, Boolean bool) {
        UiThreadUtil.runOnUiThread(new C25943c(str, bool));
    }

    @ReactMethod
    public void share(ReadableMap readableMap, Callback callback) {
        if (readableMap != null) {
            UiThreadUtil.runOnUiThread(new C25942b(readableMap, callback));
        }
    }

    static final /* synthetic */ void lambda$close$0$ReactCommonModule(String str, Callback callback) {
        C29948b reactViewById = ReactInstance.getReactViewById(str);
        if (reactViewById == null) {
            callback.invoke("illegal state to finish page.", C29956a.f78749b);
            return;
        }
        reactViewById.mo67483c();
        callback.invoke(C29956a.f78748a, C29956a.f78749b);
    }

    static final /* synthetic */ void lambda$share$1$ReactCommonModule(ReadableMap readableMap, Callback callback) {
        boolean z;
        int i;
        try {
            z = new ShareMethod().mo71405a(new WeakReference<>(C6405d.m19984g()), C42893q.m136189a(readableMap));
        } catch (Exception unused) {
            z = false;
        }
        if (z) {
            i = C29956a.f78750c;
        } else {
            i = C29956a.f78751d;
        }
        C42893q.m136190a(callback, i);
    }

    @ReactMethod
    public void logEventV3(String str, ReadableMap readableMap) {
        HashMap hashMap = new HashMap();
        for (Entry entry : readableMap.toHashMap().entrySet()) {
            hashMap.put(entry.getKey(), String.valueOf(entry.getValue()));
        }
        C25912b.m85200a(C6405d.m19984g(), str, hashMap);
    }

    @ReactMethod
    public void openSchema(String str, String str2, Callback callback) {
        C25940a.m85251a(str, str2, callback);
    }

    public void addParam(C19290j jVar, String str, String str2) {
        boolean z;
        List<C19565e> list = jVar.f52191a;
        if (list != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (str.equalsIgnoreCase(((C19565e) it.next()).mo51722a())) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        z = false;
        if (!z) {
            jVar.mo51188a(str, str2);
        }
    }

    @ReactMethod
    public void request(String str, ReadableMap readableMap, final Callback callback) {
        final List list;
        final String str2;
        if (!TextUtils.isEmpty(str) && readableMap != null && readableMap.getString("method") != null) {
            String str3 = null;
            if (readableMap.hasKey("header") && readableMap.getType("header") == ReadableType.Map) {
                ReadableMap map = readableMap.getMap("header");
                if (map != null) {
                    ArrayList arrayList = new ArrayList();
                    ReadableMapKeySetIterator keySetIterator = map.keySetIterator();
                    while (keySetIterator.hasNextKey()) {
                        String nextKey = keySetIterator.nextKey();
                        String a = C25910a.m85197a(nextKey, map);
                        if (!TextUtils.isEmpty(a)) {
                            arrayList.add(new C12461b(nextKey, a));
                            if ("content-type".equalsIgnoreCase(nextKey)) {
                                str3 = a;
                            }
                        }
                    }
                    str2 = str3;
                    list = arrayList;
                    final ReadableMap map2 = readableMap.getMap("params");
                    final String str4 = str;
                    final ReadableMap readableMap2 = readableMap;
                    C259383 r4 = new Callable<C0902i<String, C30375b>>() {
                        /* access modifiers changed from: private */
                        /* JADX WARNING: Removed duplicated region for block: B:23:0x0064  */
                        /* JADX WARNING: Removed duplicated region for block: B:25:0x006c  */
                        /* JADX WARNING: Removed duplicated region for block: B:39:0x00ce  */
                        /* JADX WARNING: Removed duplicated region for block: B:43:0x00f8  */
                        /* JADX WARNING: Removed duplicated region for block: B:53:0x014e  */
                        /* JADX WARNING: Removed duplicated region for block: B:63:0x0184  */
                        /* JADX WARNING: Removed duplicated region for block: B:68:0x0197  */
                        /* renamed from: a */
                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public android.support.p022v4.util.C0902i<java.lang.String, com.p280ss.android.ugc.aweme.hybrid.monitor.C30375b> call() throws java.lang.Exception {
                            /*
                                r10 = this;
                                com.ss.android.common.util.j r0 = new com.ss.android.common.util.j
                                java.lang.String r1 = r6
                                r0.<init>(r1)
                                com.ss.android.ugc.aweme.crossplatform.platform.rn.rnmethod.common.ReactCommonModule r1 = com.p280ss.android.ugc.aweme.crossplatform.platform.p1153rn.rnmethod.common.ReactCommonModule.this
                                java.lang.String r2 = "request_tag_from"
                                java.lang.String r3 = "rn"
                                r1.addParam(r0, r2, r3)
                                com.facebook.react.bridge.ReadableMap r1 = r7
                                java.lang.String r2 = "method"
                                java.lang.String r1 = r1.getString(r2)
                                java.lang.String r1 = r1.toUpperCase()
                                int r2 = r1.hashCode()
                                r3 = 70454(0x11336, float:9.8727E-41)
                                r4 = 1
                                r5 = 0
                                if (r2 == r3) goto L_0x0055
                                r3 = 79599(0x136ef, float:1.11542E-40)
                                if (r2 == r3) goto L_0x004b
                                r3 = 2461856(0x2590a0, float:3.449795E-39)
                                if (r2 == r3) goto L_0x0041
                                r3 = 2012838315(0x77f979ab, float:1.0119919E34)
                                if (r2 == r3) goto L_0x0037
                                goto L_0x005f
                            L_0x0037:
                                java.lang.String r2 = "DELETE"
                                boolean r2 = r1.equals(r2)
                                if (r2 == 0) goto L_0x005f
                                r2 = 3
                                goto L_0x0060
                            L_0x0041:
                                java.lang.String r2 = "POST"
                                boolean r2 = r1.equals(r2)
                                if (r2 == 0) goto L_0x005f
                                r2 = 1
                                goto L_0x0060
                            L_0x004b:
                                java.lang.String r2 = "PUT"
                                boolean r2 = r1.equals(r2)
                                if (r2 == 0) goto L_0x005f
                                r2 = 2
                                goto L_0x0060
                            L_0x0055:
                                java.lang.String r2 = "GET"
                                boolean r2 = r1.equals(r2)
                                if (r2 == 0) goto L_0x005f
                                r2 = 0
                                goto L_0x0060
                            L_0x005f:
                                r2 = -1
                            L_0x0060:
                                r3 = 0
                                switch(r2) {
                                    case 0: goto L_0x014e;
                                    case 1: goto L_0x00f8;
                                    case 2: goto L_0x00ce;
                                    case 3: goto L_0x006c;
                                    default: goto L_0x0064;
                                }
                            L_0x0064:
                                java.lang.Exception r0 = new java.lang.Exception
                                java.lang.String r1 = "method should be in [GET, POST, PUT, DELETE]"
                                r0.<init>(r1)
                                throw r0
                            L_0x006c:
                                java.util.ArrayList r2 = new java.util.ArrayList
                                r2.<init>()
                                com.facebook.react.bridge.ReadableMap r4 = r8
                                if (r4 == 0) goto L_0x00b8
                                com.facebook.react.bridge.ReadableMap r4 = r8
                                com.facebook.react.bridge.ReadableMapKeySetIterator r4 = r4.keySetIterator()
                                java.util.List r6 = r10
                                boolean r6 = com.p280ss.android.ugc.aweme.base.utils.C23477d.m77081a(r6)
                                if (r6 != 0) goto L_0x00a2
                                java.util.List r6 = r10
                                java.util.Iterator r6 = r6.iterator()
                            L_0x0089:
                                boolean r7 = r6.hasNext()
                                if (r7 == 0) goto L_0x00a2
                                java.lang.Object r7 = r6.next()
                                com.bytedance.retrofit2.a.b r7 = (com.bytedance.retrofit2.p637a.C12461b) r7
                                com.bytedance.retrofit2.a.b r8 = new com.bytedance.retrofit2.a.b
                                java.lang.String r9 = r7.f33095a
                                java.lang.String r7 = r7.f33096b
                                r8.<init>(r9, r7)
                                r2.add(r8)
                                goto L_0x0089
                            L_0x00a2:
                                boolean r6 = r4.hasNextKey()
                                if (r6 == 0) goto L_0x00b8
                                java.lang.String r6 = r4.nextKey()
                                com.facebook.react.bridge.ReadableMap r7 = r8
                                java.lang.String r7 = com.p280ss.android.ugc.aweme.crossplatform.platform.p1153rn.p1154a.C25910a.m85197a(r6, r7)
                                if (r7 == 0) goto L_0x00a2
                                r0.mo51188a(r6, r7)
                                goto L_0x00a2
                            L_0x00b8:
                                java.lang.String r0 = r0.toString()
                                com.ss.android.ugc.aweme.crossplatform.platform.rn.rnmethod.common.ReactCommonModule r4 = com.p280ss.android.ugc.aweme.crossplatform.platform.p1153rn.rnmethod.common.ReactCommonModule.this
                                com.ss.android.ugc.aweme.net.CommonApi r4 = r4.sApi
                                com.bytedance.retrofit2.b r2 = r4.doDelete(r0, r5, r2)
                                com.bytedance.retrofit2.t r2 = r2.execute()
                                T r2 = r2.f33302b
                                java.lang.String r2 = (java.lang.String) r2
                                goto L_0x0182
                            L_0x00ce:
                                com.facebook.react.bridge.ReadableMap r2 = r8
                                org.json.JSONObject r3 = com.p280ss.android.ugc.aweme.crossplatform.platform.p1153rn.p1154a.C25910a.m85199a(r2)
                                java.lang.String r2 = r9
                                if (r2 == 0) goto L_0x00e8
                                java.lang.String r0 = r0.toString()
                                com.ss.android.ugc.aweme.utils.cr r2 = com.p280ss.android.ugc.aweme.utils.C43023cr.f111606a
                                java.lang.String r4 = r9
                                java.util.List r5 = r10
                                java.lang.String r2 = r2.mo104699a(r0, r3, r4, r5)
                                goto L_0x0182
                            L_0x00e8:
                                java.lang.String r0 = r0.toString()
                                com.ss.android.ugc.aweme.utils.cr r2 = com.p280ss.android.ugc.aweme.utils.C43023cr.f111606a
                                java.lang.String r4 = "application/x-www-form-urlencoded"
                                java.util.List r5 = r10
                                java.lang.String r2 = r2.mo104699a(r0, r3, r4, r5)
                                goto L_0x0182
                            L_0x00f8:
                                com.facebook.react.bridge.ReadableMap r2 = r8
                                org.json.JSONObject r3 = com.p280ss.android.ugc.aweme.crossplatform.platform.p1153rn.p1154a.C25910a.m85199a(r2)
                                java.lang.String r2 = r9
                                if (r2 == 0) goto L_0x0117
                                java.lang.String r0 = r0.toString()
                                com.ss.android.ugc.aweme.utils.cr r2 = com.p280ss.android.ugc.aweme.utils.C43023cr.f111606a
                                com.facebook.react.bridge.ReadableMap r4 = r8
                                org.json.JSONObject r4 = com.p280ss.android.ugc.aweme.crossplatform.platform.p1153rn.p1154a.C25910a.m85199a(r4)
                                java.lang.String r5 = r9
                                java.util.List r6 = r10
                                java.lang.String r2 = r2.mo104700b(r0, r4, r5, r6)
                                goto L_0x0182
                            L_0x0117:
                                java.util.HashMap r2 = new java.util.HashMap
                                r2.<init>()
                                java.util.Iterator r6 = r3.keys()
                            L_0x0120:
                                boolean r7 = r6.hasNext()
                                if (r7 == 0) goto L_0x0136
                                java.lang.Object r7 = r6.next()
                                java.lang.String r7 = (java.lang.String) r7
                                java.lang.String r8 = r3.optString(r7)
                                if (r8 == 0) goto L_0x0120
                                r2.put(r7, r8)
                                goto L_0x0120
                            L_0x0136:
                                java.lang.String r0 = r0.toString()
                                com.p280ss.android.common.applog.NetUtil.putCommonParams(r2, r4)
                                com.ss.android.ugc.aweme.crossplatform.platform.rn.rnmethod.common.ReactCommonModule r4 = com.p280ss.android.ugc.aweme.crossplatform.platform.p1153rn.rnmethod.common.ReactCommonModule.this
                                com.ss.android.ugc.aweme.net.CommonApi r4 = r4.sApi
                                com.bytedance.retrofit2.b r2 = r4.doPost(r0, r5, r2)
                                com.bytedance.retrofit2.t r2 = r2.execute()
                                T r2 = r2.f33302b
                                java.lang.String r2 = (java.lang.String) r2
                                goto L_0x0182
                            L_0x014e:
                                com.facebook.react.bridge.ReadableMap r2 = r8
                                if (r2 == 0) goto L_0x016e
                                com.facebook.react.bridge.ReadableMap r2 = r8
                                com.facebook.react.bridge.ReadableMapKeySetIterator r2 = r2.keySetIterator()
                            L_0x0158:
                                boolean r4 = r2.hasNextKey()
                                if (r4 == 0) goto L_0x016e
                                java.lang.String r4 = r2.nextKey()
                                com.facebook.react.bridge.ReadableMap r6 = r8
                                java.lang.String r6 = com.p280ss.android.ugc.aweme.crossplatform.platform.p1153rn.p1154a.C25910a.m85197a(r4, r6)
                                if (r6 == 0) goto L_0x0158
                                r0.mo51188a(r4, r6)
                                goto L_0x0158
                            L_0x016e:
                                java.lang.String r0 = r0.toString()
                                com.ss.android.ugc.aweme.crossplatform.platform.rn.rnmethod.common.ReactCommonModule r2 = com.p280ss.android.ugc.aweme.crossplatform.platform.p1153rn.rnmethod.common.ReactCommonModule.this
                                com.ss.android.ugc.aweme.net.CommonApi r2 = r2.sApi
                                com.bytedance.retrofit2.b r2 = r2.doGet(r0, r5)
                                com.bytedance.retrofit2.t r2 = r2.execute()
                                T r2 = r2.f33302b
                                java.lang.String r2 = (java.lang.String) r2
                            L_0x0182:
                                if (r0 == 0) goto L_0x0197
                                com.ss.android.ugc.aweme.hybrid.monitor.b r4 = new com.ss.android.ugc.aweme.hybrid.monitor.b
                                java.lang.String r1 = r1.toLowerCase()
                                if (r3 != 0) goto L_0x018f
                                java.lang.String r3 = ""
                                goto L_0x0193
                            L_0x018f:
                                java.lang.String r3 = r3.toString()
                            L_0x0193:
                                r4.<init>(r0, r1, r3)
                                goto L_0x01a2
                            L_0x0197:
                                com.ss.android.ugc.aweme.hybrid.monitor.b r4 = new com.ss.android.ugc.aweme.hybrid.monitor.b
                                java.lang.String r0 = ""
                                java.lang.String r1 = ""
                                java.lang.String r3 = ""
                                r4.<init>(r0, r1, r3)
                            L_0x01a2:
                                android.support.v4.util.i r0 = new android.support.v4.util.i
                                r0.<init>(r2, r4)
                                return r0
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.crossplatform.platform.p1153rn.rnmethod.common.ReactCommonModule.C259383.call():android.support.v4.util.i");
                        }
                    };
                    C1592h.m7853a((Callable<TResult>) r4).mo6876a((C1591g<TResult, TContinuationResult>) new C1591g<C0902i<String, C30375b>, Void>() {
                        /* access modifiers changed from: private */
                        /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a8, code lost:
                            if (r1 != 0) goto L_0x00ac;
                         */
                        /* JADX WARNING: Removed duplicated region for block: B:30:0x00ae  */
                        /* JADX WARNING: Removed duplicated region for block: B:31:0x00bb  */
                        /* renamed from: a */
                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public java.lang.Void then(bolts.C1592h<android.support.p022v4.util.C0902i<java.lang.String, com.p280ss.android.ugc.aweme.hybrid.monitor.C30375b>> r9) throws java.lang.Exception {
                            /*
                                r8 = this;
                                java.lang.Object r0 = r9.mo6890e()
                                android.support.v4.util.i r0 = (android.support.p022v4.util.C0902i) r0
                                boolean r1 = r9.mo6889d()
                                r2 = 2
                                r3 = 0
                                r4 = 0
                                r5 = 1
                                if (r1 == 0) goto L_0x0049
                                java.lang.Exception r9 = r9.mo6891f()
                                boolean r1 = r9 instanceof com.p280ss.android.http.legacy.client.HttpResponseException
                                if (r1 == 0) goto L_0x0020
                                r1 = r9
                                com.ss.android.http.legacy.client.HttpResponseException r1 = (com.p280ss.android.http.legacy.client.HttpResponseException) r1
                                int r1 = r1.getStatusCode()
                                goto L_0x0021
                            L_0x0020:
                                r1 = 1
                            L_0x0021:
                                com.facebook.react.bridge.WritableMap r6 = com.facebook.react.bridge.Arguments.createMap()
                                java.lang.String r7 = "statusCode"
                                r6.putInt(r7, r1)
                                java.lang.String r1 = "statusMessage"
                                java.lang.String r7 = r9.getMessage()
                                r6.putString(r1, r7)
                                com.facebook.react.bridge.Callback r1 = r14
                                java.lang.Object[] r2 = new java.lang.Object[r2]
                                r2[r4] = r6
                                java.lang.Object r4 = com.p280ss.android.ugc.aweme.framework.p1274c.C29956a.f78749b
                                r2[r5] = r4
                                r1.invoke(r2)
                                com.ss.android.ugc.aweme.hybrid.monitor.ApiResultException r1 = new com.ss.android.ugc.aweme.hybrid.monitor.ApiResultException
                                java.lang.String r2 = "network_error"
                                r1.<init>(r2, r9)
                                goto L_0x00bc
                            L_0x0049:
                                F r9 = r0.f3154a
                                java.lang.String r9 = (java.lang.String) r9
                                com.facebook.react.bridge.Callback r1 = r14
                                java.lang.Object[] r2 = new java.lang.Object[r2]
                                java.lang.Object r6 = com.p280ss.android.ugc.aweme.framework.p1274c.C29956a.f78748a
                                r2[r4] = r6
                                r2[r5] = r9
                                r1.invoke(r2)
                                org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0060 }
                                r1.<init>(r9)     // Catch:{ JSONException -> 0x0060 }
                                goto L_0x0061
                            L_0x0060:
                                r1 = r3
                            L_0x0061:
                                if (r1 == 0) goto L_0x00ab
                                java.lang.String r2 = "message"
                                boolean r2 = r1.has(r2)
                                if (r2 == 0) goto L_0x007a
                                java.lang.String r2 = "success"
                                java.lang.String r6 = "message"
                                java.lang.String r6 = r1.optString(r6)
                                boolean r2 = r2.equals(r6)
                                if (r2 != 0) goto L_0x007a
                                goto L_0x00ac
                            L_0x007a:
                                java.lang.String r2 = "code"
                                boolean r2 = r1.has(r2)
                                if (r2 == 0) goto L_0x0089
                                java.lang.String r2 = "code"
                                int r1 = r1.optInt(r2)
                                goto L_0x00a8
                            L_0x0089:
                                java.lang.String r2 = "status_code"
                                boolean r2 = r1.has(r2)
                                if (r2 == 0) goto L_0x0098
                                java.lang.String r2 = "status_code"
                                int r1 = r1.optInt(r2)
                                goto L_0x00a8
                            L_0x0098:
                                java.lang.String r2 = "statusCode"
                                boolean r2 = r1.has(r2)
                                if (r2 == 0) goto L_0x00a7
                                java.lang.String r2 = "statusCode"
                                int r1 = r1.optInt(r2)
                                goto L_0x00a8
                            L_0x00a7:
                                r1 = 0
                            L_0x00a8:
                                if (r1 == 0) goto L_0x00ab
                                goto L_0x00ac
                            L_0x00ab:
                                r5 = 0
                            L_0x00ac:
                                if (r5 == 0) goto L_0x00bb
                                com.ss.android.ugc.aweme.hybrid.monitor.ApiResultException r1 = new com.ss.android.ugc.aweme.hybrid.monitor.ApiResultException
                                java.lang.String r2 = "api_error"
                                java.lang.Exception r4 = new java.lang.Exception
                                r4.<init>(r9)
                                r1.<init>(r2, r4)
                                goto L_0x00bc
                            L_0x00bb:
                                r1 = r3
                            L_0x00bc:
                                com.ss.android.ugc.aweme.crossplatform.d r9 = com.p280ss.android.ugc.aweme.crossplatform.C25870d.C25871a.m85133a()
                                com.ss.android.ugc.aweme.hybrid.monitor.i r9 = r9.mo67248b()
                                if (r9 == 0) goto L_0x00d7
                                java.lang.Class<com.ss.android.ugc.aweme.hybrid.monitor.o> r2 = com.p280ss.android.ugc.aweme.hybrid.monitor.C30395o.class
                                com.ss.android.ugc.aweme.hybrid.monitor.q r9 = r9.mo80008a(r2)
                                com.ss.android.ugc.aweme.hybrid.monitor.o r9 = (com.p280ss.android.ugc.aweme.hybrid.monitor.C30395o) r9
                                if (r9 == 0) goto L_0x00d7
                                S r0 = r0.f3155b
                                com.ss.android.ugc.aweme.hybrid.monitor.b r0 = (com.p280ss.android.ugc.aweme.hybrid.monitor.C30375b) r0
                                r9.mo79993a(r0, r1)
                            L_0x00d7:
                                return r3
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.crossplatform.platform.p1153rn.rnmethod.common.ReactCommonModule.C259372.then(bolts.h):java.lang.Void");
                        }
                    }, C1592h.f5958b);
                }
            }
            str2 = null;
            list = null;
            final ReadableMap map22 = readableMap.getMap("params");
            final String str42 = str;
            final ReadableMap readableMap22 = readableMap;
            C259383 r42 = new Callable<C0902i<String, C30375b>>() {
                /* access modifiers changed from: private */
                /* JADX WARNING: Removed duplicated region for block: B:23:0x0064  */
                /* JADX WARNING: Removed duplicated region for block: B:25:0x006c  */
                /* JADX WARNING: Removed duplicated region for block: B:39:0x00ce  */
                /* JADX WARNING: Removed duplicated region for block: B:43:0x00f8  */
                /* JADX WARNING: Removed duplicated region for block: B:53:0x014e  */
                /* JADX WARNING: Removed duplicated region for block: B:63:0x0184  */
                /* JADX WARNING: Removed duplicated region for block: B:68:0x0197  */
                /* renamed from: a */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public android.support.p022v4.util.C0902i<java.lang.String, com.p280ss.android.ugc.aweme.hybrid.monitor.C30375b> call() throws java.lang.Exception {
                    /*
                        r10 = this;
                        com.ss.android.common.util.j r0 = new com.ss.android.common.util.j
                        java.lang.String r1 = r6
                        r0.<init>(r1)
                        com.ss.android.ugc.aweme.crossplatform.platform.rn.rnmethod.common.ReactCommonModule r1 = com.p280ss.android.ugc.aweme.crossplatform.platform.p1153rn.rnmethod.common.ReactCommonModule.this
                        java.lang.String r2 = "request_tag_from"
                        java.lang.String r3 = "rn"
                        r1.addParam(r0, r2, r3)
                        com.facebook.react.bridge.ReadableMap r1 = r7
                        java.lang.String r2 = "method"
                        java.lang.String r1 = r1.getString(r2)
                        java.lang.String r1 = r1.toUpperCase()
                        int r2 = r1.hashCode()
                        r3 = 70454(0x11336, float:9.8727E-41)
                        r4 = 1
                        r5 = 0
                        if (r2 == r3) goto L_0x0055
                        r3 = 79599(0x136ef, float:1.11542E-40)
                        if (r2 == r3) goto L_0x004b
                        r3 = 2461856(0x2590a0, float:3.449795E-39)
                        if (r2 == r3) goto L_0x0041
                        r3 = 2012838315(0x77f979ab, float:1.0119919E34)
                        if (r2 == r3) goto L_0x0037
                        goto L_0x005f
                    L_0x0037:
                        java.lang.String r2 = "DELETE"
                        boolean r2 = r1.equals(r2)
                        if (r2 == 0) goto L_0x005f
                        r2 = 3
                        goto L_0x0060
                    L_0x0041:
                        java.lang.String r2 = "POST"
                        boolean r2 = r1.equals(r2)
                        if (r2 == 0) goto L_0x005f
                        r2 = 1
                        goto L_0x0060
                    L_0x004b:
                        java.lang.String r2 = "PUT"
                        boolean r2 = r1.equals(r2)
                        if (r2 == 0) goto L_0x005f
                        r2 = 2
                        goto L_0x0060
                    L_0x0055:
                        java.lang.String r2 = "GET"
                        boolean r2 = r1.equals(r2)
                        if (r2 == 0) goto L_0x005f
                        r2 = 0
                        goto L_0x0060
                    L_0x005f:
                        r2 = -1
                    L_0x0060:
                        r3 = 0
                        switch(r2) {
                            case 0: goto L_0x014e;
                            case 1: goto L_0x00f8;
                            case 2: goto L_0x00ce;
                            case 3: goto L_0x006c;
                            default: goto L_0x0064;
                        }
                    L_0x0064:
                        java.lang.Exception r0 = new java.lang.Exception
                        java.lang.String r1 = "method should be in [GET, POST, PUT, DELETE]"
                        r0.<init>(r1)
                        throw r0
                    L_0x006c:
                        java.util.ArrayList r2 = new java.util.ArrayList
                        r2.<init>()
                        com.facebook.react.bridge.ReadableMap r4 = r8
                        if (r4 == 0) goto L_0x00b8
                        com.facebook.react.bridge.ReadableMap r4 = r8
                        com.facebook.react.bridge.ReadableMapKeySetIterator r4 = r4.keySetIterator()
                        java.util.List r6 = r10
                        boolean r6 = com.p280ss.android.ugc.aweme.base.utils.C23477d.m77081a(r6)
                        if (r6 != 0) goto L_0x00a2
                        java.util.List r6 = r10
                        java.util.Iterator r6 = r6.iterator()
                    L_0x0089:
                        boolean r7 = r6.hasNext()
                        if (r7 == 0) goto L_0x00a2
                        java.lang.Object r7 = r6.next()
                        com.bytedance.retrofit2.a.b r7 = (com.bytedance.retrofit2.p637a.C12461b) r7
                        com.bytedance.retrofit2.a.b r8 = new com.bytedance.retrofit2.a.b
                        java.lang.String r9 = r7.f33095a
                        java.lang.String r7 = r7.f33096b
                        r8.<init>(r9, r7)
                        r2.add(r8)
                        goto L_0x0089
                    L_0x00a2:
                        boolean r6 = r4.hasNextKey()
                        if (r6 == 0) goto L_0x00b8
                        java.lang.String r6 = r4.nextKey()
                        com.facebook.react.bridge.ReadableMap r7 = r8
                        java.lang.String r7 = com.p280ss.android.ugc.aweme.crossplatform.platform.p1153rn.p1154a.C25910a.m85197a(r6, r7)
                        if (r7 == 0) goto L_0x00a2
                        r0.mo51188a(r6, r7)
                        goto L_0x00a2
                    L_0x00b8:
                        java.lang.String r0 = r0.toString()
                        com.ss.android.ugc.aweme.crossplatform.platform.rn.rnmethod.common.ReactCommonModule r4 = com.p280ss.android.ugc.aweme.crossplatform.platform.p1153rn.rnmethod.common.ReactCommonModule.this
                        com.ss.android.ugc.aweme.net.CommonApi r4 = r4.sApi
                        com.bytedance.retrofit2.b r2 = r4.doDelete(r0, r5, r2)
                        com.bytedance.retrofit2.t r2 = r2.execute()
                        T r2 = r2.f33302b
                        java.lang.String r2 = (java.lang.String) r2
                        goto L_0x0182
                    L_0x00ce:
                        com.facebook.react.bridge.ReadableMap r2 = r8
                        org.json.JSONObject r3 = com.p280ss.android.ugc.aweme.crossplatform.platform.p1153rn.p1154a.C25910a.m85199a(r2)
                        java.lang.String r2 = r9
                        if (r2 == 0) goto L_0x00e8
                        java.lang.String r0 = r0.toString()
                        com.ss.android.ugc.aweme.utils.cr r2 = com.p280ss.android.ugc.aweme.utils.C43023cr.f111606a
                        java.lang.String r4 = r9
                        java.util.List r5 = r10
                        java.lang.String r2 = r2.mo104699a(r0, r3, r4, r5)
                        goto L_0x0182
                    L_0x00e8:
                        java.lang.String r0 = r0.toString()
                        com.ss.android.ugc.aweme.utils.cr r2 = com.p280ss.android.ugc.aweme.utils.C43023cr.f111606a
                        java.lang.String r4 = "application/x-www-form-urlencoded"
                        java.util.List r5 = r10
                        java.lang.String r2 = r2.mo104699a(r0, r3, r4, r5)
                        goto L_0x0182
                    L_0x00f8:
                        com.facebook.react.bridge.ReadableMap r2 = r8
                        org.json.JSONObject r3 = com.p280ss.android.ugc.aweme.crossplatform.platform.p1153rn.p1154a.C25910a.m85199a(r2)
                        java.lang.String r2 = r9
                        if (r2 == 0) goto L_0x0117
                        java.lang.String r0 = r0.toString()
                        com.ss.android.ugc.aweme.utils.cr r2 = com.p280ss.android.ugc.aweme.utils.C43023cr.f111606a
                        com.facebook.react.bridge.ReadableMap r4 = r8
                        org.json.JSONObject r4 = com.p280ss.android.ugc.aweme.crossplatform.platform.p1153rn.p1154a.C25910a.m85199a(r4)
                        java.lang.String r5 = r9
                        java.util.List r6 = r10
                        java.lang.String r2 = r2.mo104700b(r0, r4, r5, r6)
                        goto L_0x0182
                    L_0x0117:
                        java.util.HashMap r2 = new java.util.HashMap
                        r2.<init>()
                        java.util.Iterator r6 = r3.keys()
                    L_0x0120:
                        boolean r7 = r6.hasNext()
                        if (r7 == 0) goto L_0x0136
                        java.lang.Object r7 = r6.next()
                        java.lang.String r7 = (java.lang.String) r7
                        java.lang.String r8 = r3.optString(r7)
                        if (r8 == 0) goto L_0x0120
                        r2.put(r7, r8)
                        goto L_0x0120
                    L_0x0136:
                        java.lang.String r0 = r0.toString()
                        com.p280ss.android.common.applog.NetUtil.putCommonParams(r2, r4)
                        com.ss.android.ugc.aweme.crossplatform.platform.rn.rnmethod.common.ReactCommonModule r4 = com.p280ss.android.ugc.aweme.crossplatform.platform.p1153rn.rnmethod.common.ReactCommonModule.this
                        com.ss.android.ugc.aweme.net.CommonApi r4 = r4.sApi
                        com.bytedance.retrofit2.b r2 = r4.doPost(r0, r5, r2)
                        com.bytedance.retrofit2.t r2 = r2.execute()
                        T r2 = r2.f33302b
                        java.lang.String r2 = (java.lang.String) r2
                        goto L_0x0182
                    L_0x014e:
                        com.facebook.react.bridge.ReadableMap r2 = r8
                        if (r2 == 0) goto L_0x016e
                        com.facebook.react.bridge.ReadableMap r2 = r8
                        com.facebook.react.bridge.ReadableMapKeySetIterator r2 = r2.keySetIterator()
                    L_0x0158:
                        boolean r4 = r2.hasNextKey()
                        if (r4 == 0) goto L_0x016e
                        java.lang.String r4 = r2.nextKey()
                        com.facebook.react.bridge.ReadableMap r6 = r8
                        java.lang.String r6 = com.p280ss.android.ugc.aweme.crossplatform.platform.p1153rn.p1154a.C25910a.m85197a(r4, r6)
                        if (r6 == 0) goto L_0x0158
                        r0.mo51188a(r4, r6)
                        goto L_0x0158
                    L_0x016e:
                        java.lang.String r0 = r0.toString()
                        com.ss.android.ugc.aweme.crossplatform.platform.rn.rnmethod.common.ReactCommonModule r2 = com.p280ss.android.ugc.aweme.crossplatform.platform.p1153rn.rnmethod.common.ReactCommonModule.this
                        com.ss.android.ugc.aweme.net.CommonApi r2 = r2.sApi
                        com.bytedance.retrofit2.b r2 = r2.doGet(r0, r5)
                        com.bytedance.retrofit2.t r2 = r2.execute()
                        T r2 = r2.f33302b
                        java.lang.String r2 = (java.lang.String) r2
                    L_0x0182:
                        if (r0 == 0) goto L_0x0197
                        com.ss.android.ugc.aweme.hybrid.monitor.b r4 = new com.ss.android.ugc.aweme.hybrid.monitor.b
                        java.lang.String r1 = r1.toLowerCase()
                        if (r3 != 0) goto L_0x018f
                        java.lang.String r3 = ""
                        goto L_0x0193
                    L_0x018f:
                        java.lang.String r3 = r3.toString()
                    L_0x0193:
                        r4.<init>(r0, r1, r3)
                        goto L_0x01a2
                    L_0x0197:
                        com.ss.android.ugc.aweme.hybrid.monitor.b r4 = new com.ss.android.ugc.aweme.hybrid.monitor.b
                        java.lang.String r0 = ""
                        java.lang.String r1 = ""
                        java.lang.String r3 = ""
                        r4.<init>(r0, r1, r3)
                    L_0x01a2:
                        android.support.v4.util.i r0 = new android.support.v4.util.i
                        r0.<init>(r2, r4)
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.crossplatform.platform.p1153rn.rnmethod.common.ReactCommonModule.C259383.call():android.support.v4.util.i");
                }
            };
            C1592h.m7853a((Callable<TResult>) r42).mo6876a((C1591g<TResult, TContinuationResult>) new C1591g<C0902i<String, C30375b>, Void>() {
                /* access modifiers changed from: private */
                /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a8, code lost:
                    if (r1 != 0) goto L_0x00ac;
                 */
                /* JADX WARNING: Removed duplicated region for block: B:30:0x00ae  */
                /* JADX WARNING: Removed duplicated region for block: B:31:0x00bb  */
                /* renamed from: a */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public java.lang.Void then(bolts.C1592h<android.support.p022v4.util.C0902i<java.lang.String, com.p280ss.android.ugc.aweme.hybrid.monitor.C30375b>> r9) throws java.lang.Exception {
                    /*
                        r8 = this;
                        java.lang.Object r0 = r9.mo6890e()
                        android.support.v4.util.i r0 = (android.support.p022v4.util.C0902i) r0
                        boolean r1 = r9.mo6889d()
                        r2 = 2
                        r3 = 0
                        r4 = 0
                        r5 = 1
                        if (r1 == 0) goto L_0x0049
                        java.lang.Exception r9 = r9.mo6891f()
                        boolean r1 = r9 instanceof com.p280ss.android.http.legacy.client.HttpResponseException
                        if (r1 == 0) goto L_0x0020
                        r1 = r9
                        com.ss.android.http.legacy.client.HttpResponseException r1 = (com.p280ss.android.http.legacy.client.HttpResponseException) r1
                        int r1 = r1.getStatusCode()
                        goto L_0x0021
                    L_0x0020:
                        r1 = 1
                    L_0x0021:
                        com.facebook.react.bridge.WritableMap r6 = com.facebook.react.bridge.Arguments.createMap()
                        java.lang.String r7 = "statusCode"
                        r6.putInt(r7, r1)
                        java.lang.String r1 = "statusMessage"
                        java.lang.String r7 = r9.getMessage()
                        r6.putString(r1, r7)
                        com.facebook.react.bridge.Callback r1 = r14
                        java.lang.Object[] r2 = new java.lang.Object[r2]
                        r2[r4] = r6
                        java.lang.Object r4 = com.p280ss.android.ugc.aweme.framework.p1274c.C29956a.f78749b
                        r2[r5] = r4
                        r1.invoke(r2)
                        com.ss.android.ugc.aweme.hybrid.monitor.ApiResultException r1 = new com.ss.android.ugc.aweme.hybrid.monitor.ApiResultException
                        java.lang.String r2 = "network_error"
                        r1.<init>(r2, r9)
                        goto L_0x00bc
                    L_0x0049:
                        F r9 = r0.f3154a
                        java.lang.String r9 = (java.lang.String) r9
                        com.facebook.react.bridge.Callback r1 = r14
                        java.lang.Object[] r2 = new java.lang.Object[r2]
                        java.lang.Object r6 = com.p280ss.android.ugc.aweme.framework.p1274c.C29956a.f78748a
                        r2[r4] = r6
                        r2[r5] = r9
                        r1.invoke(r2)
                        org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0060 }
                        r1.<init>(r9)     // Catch:{ JSONException -> 0x0060 }
                        goto L_0x0061
                    L_0x0060:
                        r1 = r3
                    L_0x0061:
                        if (r1 == 0) goto L_0x00ab
                        java.lang.String r2 = "message"
                        boolean r2 = r1.has(r2)
                        if (r2 == 0) goto L_0x007a
                        java.lang.String r2 = "success"
                        java.lang.String r6 = "message"
                        java.lang.String r6 = r1.optString(r6)
                        boolean r2 = r2.equals(r6)
                        if (r2 != 0) goto L_0x007a
                        goto L_0x00ac
                    L_0x007a:
                        java.lang.String r2 = "code"
                        boolean r2 = r1.has(r2)
                        if (r2 == 0) goto L_0x0089
                        java.lang.String r2 = "code"
                        int r1 = r1.optInt(r2)
                        goto L_0x00a8
                    L_0x0089:
                        java.lang.String r2 = "status_code"
                        boolean r2 = r1.has(r2)
                        if (r2 == 0) goto L_0x0098
                        java.lang.String r2 = "status_code"
                        int r1 = r1.optInt(r2)
                        goto L_0x00a8
                    L_0x0098:
                        java.lang.String r2 = "statusCode"
                        boolean r2 = r1.has(r2)
                        if (r2 == 0) goto L_0x00a7
                        java.lang.String r2 = "statusCode"
                        int r1 = r1.optInt(r2)
                        goto L_0x00a8
                    L_0x00a7:
                        r1 = 0
                    L_0x00a8:
                        if (r1 == 0) goto L_0x00ab
                        goto L_0x00ac
                    L_0x00ab:
                        r5 = 0
                    L_0x00ac:
                        if (r5 == 0) goto L_0x00bb
                        com.ss.android.ugc.aweme.hybrid.monitor.ApiResultException r1 = new com.ss.android.ugc.aweme.hybrid.monitor.ApiResultException
                        java.lang.String r2 = "api_error"
                        java.lang.Exception r4 = new java.lang.Exception
                        r4.<init>(r9)
                        r1.<init>(r2, r4)
                        goto L_0x00bc
                    L_0x00bb:
                        r1 = r3
                    L_0x00bc:
                        com.ss.android.ugc.aweme.crossplatform.d r9 = com.p280ss.android.ugc.aweme.crossplatform.C25870d.C25871a.m85133a()
                        com.ss.android.ugc.aweme.hybrid.monitor.i r9 = r9.mo67248b()
                        if (r9 == 0) goto L_0x00d7
                        java.lang.Class<com.ss.android.ugc.aweme.hybrid.monitor.o> r2 = com.p280ss.android.ugc.aweme.hybrid.monitor.C30395o.class
                        com.ss.android.ugc.aweme.hybrid.monitor.q r9 = r9.mo80008a(r2)
                        com.ss.android.ugc.aweme.hybrid.monitor.o r9 = (com.p280ss.android.ugc.aweme.hybrid.monitor.C30395o) r9
                        if (r9 == 0) goto L_0x00d7
                        S r0 = r0.f3155b
                        com.ss.android.ugc.aweme.hybrid.monitor.b r0 = (com.p280ss.android.ugc.aweme.hybrid.monitor.C30375b) r0
                        r9.mo79993a(r0, r1)
                    L_0x00d7:
                        return r3
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.crossplatform.platform.p1153rn.rnmethod.common.ReactCommonModule.C259372.then(bolts.h):java.lang.Void");
                }
            }, C1592h.f5958b);
        }
    }
}
