package com.p280ss.android.ugc.aweme.web.jsbridge.p1706a;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.common.utility.C6319n;
import com.bytedance.ies.web.p582a.C11087a;
import com.bytedance.ies.web.p582a.C11097i;
import com.bytedance.retrofit2.p637a.C12461b;
import com.p280ss.android.common.applog.NetUtil;
import com.p280ss.android.common.util.C19290j;
import com.p280ss.android.http.legacy.client.HttpResponseException;
import com.p280ss.android.http.legacy.p296a.C19565e;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.app.api.Api.C22800d;
import com.p280ss.android.ugc.aweme.base.C23397p;
import com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.net.CommonApi;
import com.p280ss.android.ugc.aweme.utils.C43023cr;
import com.p280ss.android.ugc.aweme.web.jsbridge.p1706a.C43468a.C43469a;
import com.p280ss.android.ugc.aweme.web.jsbridge.p1706a.C43468a.C43470b;
import com.p280ss.android.ugc.aweme.web.jsbridge.p1706a.C43468a.C43471c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.web.jsbridge.a.e */
public class C43480e implements C43472b {

    /* renamed from: a */
    public static final String f112603a = "e";

    /* renamed from: b */
    private C11097i f112604b;

    /* renamed from: c */
    private JSONObject f112605c;

    /* renamed from: d */
    private Handler f112606d;

    /* renamed from: e */
    private C11087a f112607e;

    /* renamed from: f */
    private C43470b f112608f;

    /* renamed from: g */
    private String f112609g;

    /* renamed from: h */
    private String f112610h;

    /* renamed from: i */
    private String f112611i;

    /* renamed from: j */
    private JSONObject f112612j;

    /* renamed from: k */
    private JSONObject f112613k;

    /* renamed from: l */
    private List<C12461b> f112614l;

    /* renamed from: m */
    private String f112615m;

    /* renamed from: n */
    private Exception f112616n;

    /* renamed from: o */
    private Callable<JSONObject> f112617o = new C43481f(this);

    /* renamed from: p */
    private Callable<JSONObject> f112618p = new C43482g(this);

    /* renamed from: q */
    private Callable<JSONObject> f112619q = new C43483h(this);

    /* renamed from: r */
    private Callable<JSONObject> f112620r = new C43484i(this);

    /* renamed from: s */
    private CommonApi f112621s = ((CommonApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(Api.f60502b).create(CommonApi.class));

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ boolean mo105405a(Message message) {
        if (message.what == 25 || message.what == 32 || message.what == 33 || message.what == 34) {
            if (message.obj == null) {
                return true;
            }
            try {
                JSONObject jSONObject = (JSONObject) message.obj;
                if (this.f112608f != null) {
                    C43469a aVar = new C43469a(this.f112611i, m137955a(this.f112610h, this.f112612j), this.f112613k);
                    JSONObject jSONObject2 = null;
                    if (jSONObject != null && jSONObject.has("response")) {
                        jSONObject2 = jSONObject.optJSONObject("response");
                    }
                    this.f112608f.mo61496a(aVar, new C43471c(jSONObject2, this.f112616n));
                }
                if (this.f112607e != null) {
                    this.f112607e.mo27030a(this.f112609g, jSONObject);
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo105394a() {
        m137957a(this.f112604b, this.f112605c);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public JSONObject mo105407c() {
        String a;
        if (this.f112609g == null || C6319n.m19593a(this.f112609g)) {
            return null;
        }
        this.f112610h = m137955a(this.f112610h, this.f112612j);
        String str = "";
        try {
            if (this.f112615m != null) {
                a = C43023cr.f111606a.mo104699a(this.f112610h, this.f112613k, this.f112615m, this.f112614l);
            } else {
                a = C43023cr.f111606a.mo104699a(this.f112610h, this.f112613k, "application/x-www-form-urlencoded", this.f112614l);
            }
            String str2 = a;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", 1);
            jSONObject.put("response", new JSONObject(str2));
            jSONObject.put("_raw", str2);
            return jSONObject;
        } catch (Exception e) {
            this.f112616n = e;
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("code", 0);
                jSONObject2.put("response", new JSONObject(str));
                jSONObject2.put("_raw", str);
            } catch (JSONException unused) {
            }
            return jSONObject2;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public JSONObject mo105408d() {
        String str;
        if (this.f112609g == null || C6319n.m19593a(this.f112609g)) {
            return null;
        }
        this.f112610h = m137955a(this.f112610h, this.f112612j);
        String str2 = "";
        try {
            if (this.f112615m != null) {
                str = C43023cr.f111606a.mo104700b(this.f112610h, this.f112613k, this.f112615m, this.f112614l);
            } else {
                HashMap hashMap = new HashMap();
                if (this.f112613k != null) {
                    Iterator keys = this.f112613k.keys();
                    while (keys.hasNext()) {
                        String str3 = (String) keys.next();
                        hashMap.put(str3, this.f112613k.optString(str3, ""));
                    }
                }
                NetUtil.putCommonParams(hashMap, true);
                str = (String) this.f112621s.doPost(this.f112610h, 0, (Map<String, String>) hashMap).execute().f33302b;
                try {
                    Api.m75214a(str, this.f112610h);
                } catch (Exception e) {
                    String str4 = str;
                    e = e;
                    str2 = str4;
                }
            }
            str2 = str;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", 1);
            jSONObject.put("response", new JSONObject(str2));
            jSONObject.put("_raw", str2);
            return jSONObject;
        } catch (Exception e2) {
            e = e2;
            this.f112616n = e;
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("code", 0);
                jSONObject2.put("response", new JSONObject(str2));
                jSONObject2.put("_raw", str2);
            } catch (JSONException unused) {
            }
            return jSONObject2;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public JSONObject mo105406b() {
        if (this.f112609g == null || C6319n.m19593a(this.f112609g)) {
            return null;
        }
        this.f112610h = m137955a(this.f112610h, this.f112612j);
        try {
            String a = m137954a(this.f112610h);
            JSONObject jSONObject = new JSONObject(a);
            jSONObject.put("_raw", a);
            jSONObject.put("code", 1);
            jSONObject.put("response", new JSONObject(a));
            return jSONObject;
        } catch (HttpResponseException e) {
            this.f112616n = e;
            JSONObject jSONObject2 = new JSONObject();
            m137959a(jSONObject2, 0, e.getStatusCode(), e.getMessage(), "", "");
            return jSONObject2;
        } catch (ApiServerException e2) {
            this.f112616n = e2;
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("_raw", e2.getResponse());
            } catch (JSONException unused) {
            }
            m137959a(jSONObject3, 0, e2.getErrorCode(), e2.getErrorMsg(), e2.getPrompt(), "");
            return jSONObject3;
        } catch (Exception e3) {
            this.f112616n = e3;
            JSONObject jSONObject4 = new JSONObject();
            m137959a(jSONObject4, 0, -408, e3.getMessage(), "", "");
            return jSONObject4;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public JSONObject mo105409e() {
        if (this.f112609g == null || C6319n.m19593a(this.f112609g)) {
            return null;
        }
        this.f112610h = m137955a(this.f112610h, this.f112612j);
        try {
            String str = (String) this.f112621s.doGet(this.f112610h, null, this.f112614l).execute().f33302b;
            JSONObject jSONObject = new JSONObject(str);
            Api.m75215a(jSONObject, str, this.f112610h);
            jSONObject.put("_raw", str);
            jSONObject.put("code", 1);
            jSONObject.put("response", new JSONObject(str));
            return jSONObject;
        } catch (HttpResponseException e) {
            this.f112616n = e;
            JSONObject jSONObject2 = new JSONObject();
            m137959a(jSONObject2, 0, e.getStatusCode(), e.getMessage(), "", "");
            return jSONObject2;
        } catch (ApiServerException e2) {
            this.f112616n = e2;
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("_raw", e2.getResponse());
            } catch (JSONException unused) {
            }
            m137959a(jSONObject3, 0, e2.getErrorCode(), e2.getErrorMsg(), e2.getPrompt(), "");
            return jSONObject3;
        } catch (Exception e3) {
            this.f112616n = e3;
            JSONObject jSONObject4 = new JSONObject();
            m137959a(jSONObject4, 0, -408, e3.getMessage(), "", "");
            return jSONObject4;
        }
    }

    /* renamed from: a */
    private String m137954a(String str) throws Exception {
        if (C43486k.m137971a(AwemeApplication.m21341a())) {
            return (String) Api.m75212a((String) this.f112621s.doDelete(str, this.f112614l).execute().f33302b, C22800d.m75221a(), null, str);
        }
        throw new IOException();
    }

    /* renamed from: a */
    private void m137956a(C11097i iVar) {
        this.f112609g = iVar.f30169b;
        JSONObject jSONObject = iVar.f30171d;
        this.f112610h = jSONObject.optString("url", "");
        this.f112611i = jSONObject.optString("method", "get");
        this.f112612j = jSONObject.optJSONObject("params");
        this.f112613k = jSONObject.optJSONObject("data");
        JSONObject optJSONObject = jSONObject.optJSONObject("header");
        if (optJSONObject != null) {
            this.f112614l = new ArrayList();
            Iterator keys = optJSONObject.keys();
            while (keys.hasNext()) {
                String str = (String) keys.next();
                String optString = optJSONObject.optString(str);
                if (!TextUtils.isEmpty(optString)) {
                    this.f112614l.add(new C12461b(str, optString));
                    if ("content-type".equalsIgnoreCase(str)) {
                        this.f112615m = optString;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private String m137955a(String str, JSONObject jSONObject) {
        C19290j jVar = new C19290j(str);
        if (jSONObject != null) {
            Iterator keys = jSONObject.keys();
            while (keys.hasNext()) {
                String str2 = (String) keys.next();
                jVar.mo51188a(str2, jSONObject.optString(str2, ""));
            }
        }
        m137958a(jVar, "request_tag_from", "h5");
        return jVar.mo51184a();
    }

    /* renamed from: a */
    private void m137957a(C11097i iVar, JSONObject jSONObject) {
        m137956a(iVar);
        if ("get".equalsIgnoreCase(this.f112611i)) {
            C23397p.m76735a().mo60807a(this.f112606d, this.f112617o, 25);
        } else if ("post".equalsIgnoreCase(this.f112611i)) {
            C23397p.m76735a().mo60807a(this.f112606d, this.f112618p, 32);
        } else if ("put".equalsIgnoreCase(this.f112611i)) {
            C23397p.m76735a().mo60807a(this.f112606d, this.f112619q, 33);
        } else {
            if ("delete".equalsIgnoreCase(this.f112611i)) {
                C23397p.m76735a().mo60807a(this.f112606d, this.f112620r, 34);
            }
        }
    }

    /* renamed from: a */
    private static void m137958a(C19290j jVar, String str, String str2) {
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

    public C43480e(C11097i iVar, JSONObject jSONObject, C11087a aVar, C43470b bVar) {
        this.f112604b = iVar;
        this.f112605c = jSONObject;
        this.f112607e = aVar;
        this.f112608f = bVar;
        this.f112606d = new Handler(Looper.getMainLooper(), new C43485j(this));
    }

    /* renamed from: a */
    private static void m137960a(JSONObject jSONObject, int i, String str, String str2, String str3) {
        try {
            jSONObject.put("errCode", i);
            jSONObject.put("message", str);
            jSONObject.put("prompts", str2);
        } catch (JSONException unused) {
        }
    }

    /* renamed from: a */
    private void m137959a(JSONObject jSONObject, int i, int i2, String str, String str2, String str3) {
        try {
            jSONObject.put("code", 0);
            JSONObject jSONObject2 = new JSONObject();
            m137960a(jSONObject2, i2, str, str2, str3);
            jSONObject.put("response", jSONObject2);
        } catch (JSONException unused) {
        }
    }
}
