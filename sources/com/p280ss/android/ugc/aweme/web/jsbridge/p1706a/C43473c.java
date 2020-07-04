package com.p280ss.android.ugc.aweme.web.jsbridge.p1706a;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.common.utility.C6319n;
import com.bytedance.ies.web.p582a.C11087a;
import com.bytedance.ies.web.p582a.C11097i;
import com.bytedance.retrofit2.p637a.C12461b;
import com.p280ss.android.common.util.C19290j;
import com.p280ss.android.http.legacy.client.HttpResponseException;
import com.p280ss.android.http.legacy.p296a.C19565e;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.app.api.Api.C22800d;
import com.p280ss.android.ugc.aweme.base.C23397p;
import com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException;
import com.p280ss.android.ugc.aweme.base.utils.C23477d;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.net.CommonApi;
import com.p280ss.android.ugc.aweme.utils.C43023cr;
import com.p280ss.android.ugc.aweme.web.jsbridge.p1706a.C43468a.C43469a;
import com.p280ss.android.ugc.aweme.web.jsbridge.p1706a.C43468a.C43470b;
import com.p280ss.android.ugc.aweme.web.jsbridge.p1706a.C43468a.C43471c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.web.jsbridge.a.c */
public class C43473c implements C43472b {

    /* renamed from: a */
    public static final String f112579a = "c";

    /* renamed from: b */
    public C11087a f112580b;

    /* renamed from: c */
    public C43470b f112581c;

    /* renamed from: d */
    public String f112582d;

    /* renamed from: e */
    public String f112583e;

    /* renamed from: f */
    public String f112584f;

    /* renamed from: g */
    public JSONObject f112585g;

    /* renamed from: h */
    public JSONObject f112586h;

    /* renamed from: i */
    public Exception f112587i = null;

    /* renamed from: j */
    private C11097i f112588j;

    /* renamed from: k */
    private JSONObject f112589k;

    /* renamed from: l */
    private Handler f112590l;

    /* renamed from: m */
    private CommonApi f112591m = ((CommonApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(Api.f60502b).create(CommonApi.class));

    /* renamed from: n */
    private List<C12461b> f112592n;

    /* renamed from: o */
    private String f112593o;

    /* renamed from: p */
    private Callable<JSONObject> f112594p = new Callable<JSONObject>() {
        /* access modifiers changed from: private */
        /* renamed from: a */
        public JSONObject call() throws Exception {
            return C43473c.this.mo105399e();
        }
    };

    /* renamed from: q */
    private Callable<JSONObject> f112595q = new Callable<JSONObject>() {
        /* access modifiers changed from: private */
        /* renamed from: a */
        public JSONObject call() throws Exception {
            return C43473c.this.mo105396b();
        }
    };

    /* renamed from: r */
    private Callable<JSONObject> f112596r = new Callable<JSONObject>() {
        /* access modifiers changed from: private */
        /* renamed from: a */
        public JSONObject call() throws Exception {
            return C43473c.this.mo105397c();
        }
    };

    /* renamed from: s */
    private Callable<JSONObject> f112597s = new Callable<JSONObject>() {
        /* access modifiers changed from: private */
        /* renamed from: a */
        public JSONObject call() throws Exception {
            return C43473c.this.mo105398d();
        }
    };

    /* renamed from: a */
    public final void mo105394a() {
        m137939a(this.f112588j, this.f112589k);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x008a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008b, code lost:
        r8 = r2;
        r2 = r0;
        r0 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ac, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ad, code lost:
        r9.f112587i = r0;
        r2 = new org.json.JSONObject();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        r2.put("code", 0);
        r1 = new org.json.JSONObject();
        r1.put("errCode", r0.getStatusCode());
        r1.put("message", r0.getMessage());
        r2.put("error", r1);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ac A[ExcHandler: HttpResponseException (r0v7 'e' com.ss.android.http.legacy.client.HttpResponseException A[CUSTOM_DECLARE]), Splitter:B:5:0x001b] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final org.json.JSONObject mo105396b() {
        /*
            r9 = this;
            java.lang.String r0 = r9.f112582d
            if (r0 == 0) goto L_0x00d6
            java.lang.String r0 = r9.f112582d
            boolean r0 = com.bytedance.common.utility.C6319n.m19593a(r0)
            if (r0 == 0) goto L_0x000e
            goto L_0x00d6
        L_0x000e:
            java.lang.String r0 = r9.f112583e
            org.json.JSONObject r1 = r9.f112585g
            java.lang.String r0 = r9.mo105395a(r0, r1)
            r9.f112583e = r0
            java.lang.String r0 = ""
            r1 = 0
            java.lang.String r2 = r9.f112593o     // Catch:{ HttpResponseException -> 0x00ac, Exception -> 0x008f }
            r3 = 1
            if (r2 == 0) goto L_0x0030
            com.ss.android.ugc.aweme.utils.cr r2 = com.p280ss.android.ugc.aweme.utils.C43023cr.f111606a     // Catch:{ HttpResponseException -> 0x00ac, Exception -> 0x008f }
            java.lang.String r4 = r9.f112583e     // Catch:{ HttpResponseException -> 0x00ac, Exception -> 0x008f }
            org.json.JSONObject r5 = r9.f112586h     // Catch:{ HttpResponseException -> 0x00ac, Exception -> 0x008f }
            java.lang.String r6 = r9.f112593o     // Catch:{ HttpResponseException -> 0x00ac, Exception -> 0x008f }
            java.util.List<com.bytedance.retrofit2.a.b> r7 = r9.f112592n     // Catch:{ HttpResponseException -> 0x00ac, Exception -> 0x008f }
            java.lang.String r2 = r2.mo104700b(r4, r5, r6, r7)     // Catch:{ HttpResponseException -> 0x00ac, Exception -> 0x008f }
        L_0x002e:
            r0 = r2
            goto L_0x0070
        L_0x0030:
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ HttpResponseException -> 0x00ac, Exception -> 0x008f }
            r2.<init>()     // Catch:{ HttpResponseException -> 0x00ac, Exception -> 0x008f }
            org.json.JSONObject r4 = r9.f112586h     // Catch:{ HttpResponseException -> 0x00ac, Exception -> 0x008f }
            if (r4 == 0) goto L_0x0057
            org.json.JSONObject r4 = r9.f112586h     // Catch:{ HttpResponseException -> 0x00ac, Exception -> 0x008f }
            java.util.Iterator r4 = r4.keys()     // Catch:{ HttpResponseException -> 0x00ac, Exception -> 0x008f }
        L_0x003f:
            boolean r5 = r4.hasNext()     // Catch:{ HttpResponseException -> 0x00ac, Exception -> 0x008f }
            if (r5 == 0) goto L_0x0057
            java.lang.Object r5 = r4.next()     // Catch:{ HttpResponseException -> 0x00ac, Exception -> 0x008f }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ HttpResponseException -> 0x00ac, Exception -> 0x008f }
            org.json.JSONObject r6 = r9.f112586h     // Catch:{ HttpResponseException -> 0x00ac, Exception -> 0x008f }
            java.lang.String r7 = ""
            java.lang.String r6 = r6.optString(r5, r7)     // Catch:{ HttpResponseException -> 0x00ac, Exception -> 0x008f }
            r2.put(r5, r6)     // Catch:{ HttpResponseException -> 0x00ac, Exception -> 0x008f }
            goto L_0x003f
        L_0x0057:
            com.p280ss.android.common.applog.NetUtil.putCommonParams(r2, r3)     // Catch:{ HttpResponseException -> 0x00ac, Exception -> 0x008f }
            com.ss.android.ugc.aweme.net.CommonApi r4 = r9.f112591m     // Catch:{ HttpResponseException -> 0x00ac, Exception -> 0x008f }
            java.lang.String r5 = r9.f112583e     // Catch:{ HttpResponseException -> 0x00ac, Exception -> 0x008f }
            com.bytedance.retrofit2.b r2 = r4.doPost(r5, r2)     // Catch:{ HttpResponseException -> 0x00ac, Exception -> 0x008f }
            com.bytedance.retrofit2.t r2 = r2.execute()     // Catch:{ HttpResponseException -> 0x00ac, Exception -> 0x008f }
            T r2 = r2.f33302b     // Catch:{ HttpResponseException -> 0x00ac, Exception -> 0x008f }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ HttpResponseException -> 0x00ac, Exception -> 0x008f }
            java.lang.String r0 = r9.f112583e     // Catch:{ HttpResponseException -> 0x00ac, Exception -> 0x008a }
            com.p280ss.android.ugc.aweme.app.api.Api.m75214a(r2, r0)     // Catch:{ HttpResponseException -> 0x00ac, Exception -> 0x008a }
            goto L_0x002e
        L_0x0070:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ HttpResponseException -> 0x00ac, Exception -> 0x008f }
            r2.<init>()     // Catch:{ HttpResponseException -> 0x00ac, Exception -> 0x008f }
            java.lang.String r4 = "code"
            r2.put(r4, r3)     // Catch:{ HttpResponseException -> 0x00ac, Exception -> 0x008f }
            java.lang.String r3 = "response"
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ HttpResponseException -> 0x00ac, Exception -> 0x008f }
            r4.<init>(r0)     // Catch:{ HttpResponseException -> 0x00ac, Exception -> 0x008f }
            r2.put(r3, r4)     // Catch:{ HttpResponseException -> 0x00ac, Exception -> 0x008f }
            java.lang.String r3 = "_raw"
            r2.put(r3, r0)     // Catch:{ HttpResponseException -> 0x00ac, Exception -> 0x008f }
            return r2
        L_0x008a:
            r0 = move-exception
            r8 = r2
            r2 = r0
            r0 = r8
            goto L_0x0090
        L_0x008f:
            r2 = move-exception
        L_0x0090:
            r9.f112587i = r2
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            java.lang.String r3 = "code"
            r2.put(r3, r1)     // Catch:{ JSONException -> 0x00ab }
            java.lang.String r1 = "response"
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00ab }
            r3.<init>(r0)     // Catch:{ JSONException -> 0x00ab }
            r2.put(r1, r3)     // Catch:{ JSONException -> 0x00ab }
            java.lang.String r1 = "_raw"
            r2.put(r1, r0)     // Catch:{ JSONException -> 0x00ab }
        L_0x00ab:
            return r2
        L_0x00ac:
            r0 = move-exception
            r9.f112587i = r0
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            java.lang.String r3 = "code"
            r2.put(r3, r1)     // Catch:{ JSONException -> 0x00d5 }
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00d5 }
            r1.<init>()     // Catch:{ JSONException -> 0x00d5 }
            java.lang.String r3 = "errCode"
            int r4 = r0.getStatusCode()     // Catch:{ JSONException -> 0x00d5 }
            r1.put(r3, r4)     // Catch:{ JSONException -> 0x00d5 }
            java.lang.String r3 = "message"
            java.lang.String r0 = r0.getMessage()     // Catch:{ JSONException -> 0x00d5 }
            r1.put(r3, r0)     // Catch:{ JSONException -> 0x00d5 }
            java.lang.String r0 = "error"
            r2.put(r0, r1)     // Catch:{ JSONException -> 0x00d5 }
        L_0x00d5:
            return r2
        L_0x00d6:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.web.jsbridge.p1706a.C43473c.mo105396b():org.json.JSONObject");
    }

    /* renamed from: c */
    public final JSONObject mo105397c() {
        String a;
        if (this.f112582d == null || C6319n.m19593a(this.f112582d)) {
            return null;
        }
        this.f112583e = mo105395a(this.f112583e, this.f112585g);
        String str = "";
        try {
            if (this.f112593o != null) {
                a = C43023cr.f111606a.mo104699a(this.f112583e, this.f112586h, this.f112593o, this.f112592n);
            } else {
                a = C43023cr.f111606a.mo104699a(this.f112583e, this.f112586h, "application/x-www-form-urlencoded", this.f112592n);
            }
            String str2 = a;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", 1);
            jSONObject.put("response", new JSONObject(str2));
            jSONObject.put("_raw", str2);
            return jSONObject;
        } catch (HttpResponseException e) {
            this.f112587i = e;
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("code", 0);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("errCode", e.getStatusCode());
                jSONObject3.put("message", e.getMessage());
                jSONObject2.put("error", jSONObject3);
            } catch (JSONException unused) {
            }
            return jSONObject2;
        } catch (Exception e2) {
            this.f112587i = e2;
            JSONObject jSONObject4 = new JSONObject();
            try {
                jSONObject4.put("code", 0);
                jSONObject4.put("response", new JSONObject(str));
                jSONObject4.put("_raw", str);
            } catch (JSONException unused2) {
            }
            return jSONObject4;
        }
    }

    /* renamed from: d */
    public final JSONObject mo105398d() {
        if (this.f112582d == null || C6319n.m19593a(this.f112582d)) {
            return null;
        }
        this.f112583e = mo105395a(this.f112583e, this.f112585g);
        try {
            String a = m137937a(this.f112583e);
            JSONObject jSONObject = new JSONObject(a);
            jSONObject.put("_raw", a);
            return jSONObject;
        } catch (HttpResponseException e) {
            this.f112587i = e;
            JSONObject jSONObject2 = new JSONObject();
            m137941a(jSONObject2, 0, e.getStatusCode(), e.getMessage(), "", "");
            return jSONObject2;
        } catch (ApiServerException e2) {
            this.f112587i = e2;
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("_raw", e2.getResponse());
            } catch (JSONException unused) {
            }
            m137941a(jSONObject3, 0, e2.getErrorCode(), e2.getErrorMsg(), e2.getPrompt(), "");
            return jSONObject3;
        } catch (Exception e3) {
            this.f112587i = e3;
            JSONObject jSONObject4 = new JSONObject();
            m137941a(jSONObject4, 0, -408, e3.getMessage(), "", "");
            return jSONObject4;
        }
    }

    /* renamed from: e */
    public final JSONObject mo105399e() {
        if (this.f112582d == null || C6319n.m19593a(this.f112582d)) {
            return null;
        }
        this.f112583e = mo105395a(this.f112583e, this.f112585g);
        try {
            ArrayList arrayList = new ArrayList();
            if (this.f112592n != null) {
                for (C12461b bVar : this.f112592n) {
                    arrayList.add(new C12461b(bVar.f33095a, bVar.f33096b));
                }
            }
            String str = (String) this.f112591m.doGet(this.f112583e, null, (List<C12461b>) arrayList).execute().f33302b;
            JSONObject jSONObject = new JSONObject(str);
            Api.m75215a(jSONObject, str, this.f112583e);
            jSONObject.put("_raw", str);
            return jSONObject;
        } catch (HttpResponseException e) {
            this.f112587i = e;
            JSONObject jSONObject2 = new JSONObject();
            m137941a(jSONObject2, 0, e.getStatusCode(), e.getMessage(), "", "");
            return jSONObject2;
        } catch (ApiServerException e2) {
            this.f112587i = e2;
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("_raw", e2.getResponse());
            } catch (JSONException unused) {
            }
            m137941a(jSONObject3, 0, e2.getErrorCode(), e2.getErrorMsg(), e2.getPrompt(), "");
            return jSONObject3;
        } catch (Exception e3) {
            this.f112587i = e3;
            JSONObject jSONObject4 = new JSONObject();
            m137941a(jSONObject4, 0, -408, e3.getMessage(), "", "");
            return jSONObject4;
        }
    }

    /* renamed from: a */
    private String m137937a(String str) throws Exception {
        if (C43479d.m137953a(AwemeApplication.m21341a())) {
            ArrayList arrayList = new ArrayList();
            if (!C23477d.m77081a((Collection<T>) this.f112592n)) {
                for (C12461b bVar : this.f112592n) {
                    arrayList.add(new C12461b(bVar.f33095a, bVar.f33096b));
                }
            }
            return (String) Api.m75212a((String) this.f112591m.doDelete(str, 0, arrayList).execute().f33302b, C22800d.m75221a(), null, str);
        }
        throw new IOException();
    }

    /* renamed from: a */
    private void m137938a(C11097i iVar) {
        this.f112582d = iVar.f30169b;
        JSONObject jSONObject = iVar.f30171d;
        this.f112583e = jSONObject.optString("url", "");
        this.f112584f = jSONObject.optString("method", "get");
        this.f112585g = jSONObject.optJSONObject("params");
        this.f112586h = jSONObject.optJSONObject("data");
        JSONObject optJSONObject = jSONObject.optJSONObject("header");
        if (optJSONObject != null) {
            this.f112592n = new ArrayList();
            Iterator keys = optJSONObject.keys();
            while (keys.hasNext()) {
                String str = (String) keys.next();
                String optString = optJSONObject.optString(str);
                if (!TextUtils.isEmpty(optString)) {
                    this.f112592n.add(new C12461b(str, optString));
                    if ("content-type".equalsIgnoreCase(str)) {
                        this.f112593o = optString;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private void m137939a(C11097i iVar, JSONObject jSONObject) {
        m137938a(iVar);
        if ("get".equalsIgnoreCase(this.f112584f)) {
            C23397p.m76735a().mo60807a(this.f112590l, this.f112594p, 25);
        } else if ("post".equalsIgnoreCase(this.f112584f)) {
            C23397p.m76735a().mo60807a(this.f112590l, this.f112595q, 32);
        } else if ("put".equalsIgnoreCase(this.f112584f)) {
            C23397p.m76735a().mo60807a(this.f112590l, this.f112596r, 33);
        } else {
            if ("delete".equalsIgnoreCase(this.f112584f)) {
                C23397p.m76735a().mo60807a(this.f112590l, this.f112597s, 34);
            }
        }
    }

    /* renamed from: a */
    public final String mo105395a(String str, JSONObject jSONObject) {
        C19290j jVar = new C19290j(str);
        if (jSONObject != null) {
            Iterator keys = jSONObject.keys();
            while (keys.hasNext()) {
                String str2 = (String) keys.next();
                jVar.mo51188a(str2, jSONObject.optString(str2, ""));
            }
        }
        m137940a(jVar, "request_tag_from", "h5");
        return jVar.mo51184a();
    }

    /* renamed from: a */
    private static void m137940a(C19290j jVar, String str, String str2) {
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

    public C43473c(C11097i iVar, JSONObject jSONObject, C11087a aVar, C43470b bVar) {
        this.f112588j = iVar;
        this.f112589k = jSONObject;
        this.f112580b = aVar;
        this.f112581c = bVar;
        this.f112590l = new Handler(Looper.getMainLooper(), new Callback() {
            public final boolean handleMessage(Message message) {
                if (message.what == 25 || message.what == 32 || message.what == 33 || message.what == 34) {
                    if (message.obj == null) {
                        return true;
                    }
                    try {
                        JSONObject jSONObject = (JSONObject) message.obj;
                        if (C43473c.this.f112581c != null) {
                            C43469a aVar = new C43469a(C43473c.this.f112584f, C43473c.this.mo105395a(C43473c.this.f112583e, C43473c.this.f112585g), C43473c.this.f112586h);
                            JSONObject jSONObject2 = null;
                            if (jSONObject != null && jSONObject.has("response")) {
                                jSONObject2 = jSONObject.optJSONObject("response");
                            }
                            C43473c.this.f112581c.mo61496a(aVar, new C43471c(jSONObject2, C43473c.this.f112587i));
                        }
                        if (C43473c.this.f112580b != null) {
                            C43473c.this.f112580b.mo27030a(C43473c.this.f112582d, jSONObject);
                        }
                    } catch (Exception unused) {
                    }
                }
                return false;
            }
        });
    }

    /* renamed from: a */
    private static void m137942a(JSONObject jSONObject, int i, String str, String str2, String str3) {
        try {
            jSONObject.put("errCode", i);
            jSONObject.put("message", str);
            jSONObject.put("prompts", str2);
        } catch (JSONException unused) {
        }
    }

    /* renamed from: a */
    private void m137941a(JSONObject jSONObject, int i, int i2, String str, String str2, String str3) {
        try {
            jSONObject.put("code", 0);
            JSONObject jSONObject2 = new JSONObject();
            m137942a(jSONObject2, i2, str, str2, str3);
            jSONObject.put("response", jSONObject2);
        } catch (JSONException unused) {
        }
    }
}
