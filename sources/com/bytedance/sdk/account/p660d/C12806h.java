package com.bytedance.sdk.account.p660d;

import android.content.Context;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.sdk.account.p645a.C12714b.C12715a;
import com.bytedance.sdk.account.p645a.C12714b.C12716b;
import com.bytedance.sdk.account.p645a.p646a.C12706a;
import com.bytedance.sdk.account.p645a.p646a.C12707b;
import com.bytedance.sdk.account.p645a.p646a.C12710e;
import com.bytedance.sdk.account.p645a.p648c.C12724a;
import com.bytedance.sdk.account.p645a.p648c.C12725b;
import com.bytedance.sdk.account.p645a.p648c.C12726c;
import com.bytedance.sdk.account.p645a.p648c.C12727d;
import com.bytedance.sdk.account.p659c.C12790a;
import com.bytedance.sdk.account.p659c.C12792b;
import com.bytedance.sdk.account.utils.C12908a;
import com.bytedance.sdk.account.utils.C12910c;
import com.bytedance.sdk.account.utils.C12913f;
import com.bytedance.sdk.account.utils.NetworkUtils;
import com.bytedance.sdk.account.utils.NetworkUtils.NetworkType;
import com.p280ss.android.account.C18895c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.account.d.h */
public abstract class C12806h<R extends C12707b> implements C12724a, C12726c {

    /* renamed from: d */
    static List<String> f33891d;

    /* renamed from: j */
    private static C12725b f33892j = new C12725b() {
        /* renamed from: a */
        public final C12727d mo31174a(C12726c cVar) {
            C12809a aVar = new C12809a(cVar);
            aVar.mo31379b();
            return aVar;
        }
    };

    /* renamed from: k */
    private static C12810i f33893k = new C12810i() {
        /* renamed from: a */
        public final void mo31358a(C12811j jVar) {
            C6309f fVar = ((C12799e) C12799e.m37195b()).f33875A;
            Message obtain = Message.obtain(fVar, 100);
            obtain.obj = jVar;
            fVar.sendMessage(obtain);
        }
    };

    /* renamed from: a */
    protected WeakReference<Context> f33894a;

    /* renamed from: b */
    protected C12790a f33895b;

    /* renamed from: c */
    protected WeakReference<? extends C12706a> f33896c;

    /* renamed from: e */
    private String f33897e;

    /* renamed from: f */
    private C12792b f33898f;

    /* renamed from: g */
    private C12706a f33899g;

    /* renamed from: h */
    private C12727d f33900h;

    /* renamed from: i */
    private boolean f33901i;

    /* renamed from: com.bytedance.sdk.account.d.h$a */
    static class C12809a extends C12908a implements C12727d {

        /* renamed from: e */
        private C12726c f33902e;

        public final void run() {
            this.f33902e.mo31175b();
        }

        private C12809a(C12726c cVar) {
            this.f33902e = cVar;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract R mo31159a(boolean z, C12792b bVar);

    /* renamed from: a */
    public abstract void mo31160a(R r);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo31161a(JSONObject jSONObject, JSONObject jSONObject2);

    /* renamed from: b */
    public final void mo31175b() {
        m37228e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo31162b(JSONObject jSONObject, JSONObject jSONObject2) throws Exception;

    /* renamed from: e */
    private void m37228e() {
        C12707b f = m37229f();
        if (f != null) {
            mo31160a((R) f);
            m37226b(f);
        }
    }

    /* renamed from: a */
    public final void mo31173a() {
        this.f33899g = null;
    }

    /* renamed from: c */
    public final void mo31176c() {
        mo31173a();
        C12727d dVar = this.f33900h;
        if (dVar != null) {
            dVar.mo31176c();
        }
    }

    /* renamed from: d */
    public final void mo31357d() {
        this.f33900h = f33892j.mo31174a(this);
    }

    /* renamed from: f */
    private R m37229f() {
        this.f33901i = false;
        try {
            this.f33901i = m37230g();
        } catch (Throwable th) {
            this.f33898f.f33842b = C12910c.m37582a((Context) this.f33894a.get(), th);
            this.f33898f.f33844d = th.getMessage();
        }
        R a = mo31159a(this.f33901i, this.f33898f);
        m37227c(a);
        return a;
    }

    static {
        ArrayList arrayList = new ArrayList();
        f33891d = arrayList;
        arrayList.add(C12715a.m36940c());
        f33891d.add(C12715a.m36944g());
        f33891d.add(C12715a.m36945h());
        f33891d.add(C12715a.m36946i());
        f33891d.add(C12715a.m36941d());
        f33891d.add(C12715a.m36942e());
        f33891d.add(C12715a.m36943f());
        f33891d.add(C12715a.m36961x());
        f33891d.add(C12715a.m36962y());
        f33891d.add(C12715a.m36932G());
        f33891d.add(C12715a.m36931F());
        f33891d.add(C12715a.m36930E());
        f33891d.add(C12716b.m36964a());
        f33891d.add(C12716b.m36967c());
        f33891d.add(C12716b.m36966b());
        f33891d.add(C12715a.m36953p());
        f33891d.add(C12715a.m36951n());
        f33891d.add(C12715a.m36933H());
        f33891d.add(C12715a.m36935J());
    }

    /* renamed from: g */
    private boolean m37230g() throws Exception {
        if (this.f33894a.get() == null) {
            this.f33898f.f33842b = -18;
            return false;
        } else if (NetworkUtils.m37578a((Context) this.f33894a.get()) == NetworkType.NONE) {
            this.f33898f.f33842b = -12;
            return false;
        } else {
            String str = null;
            if ("get".equals(this.f33895b.f33836b)) {
                str = m37220a(this.f33897e, this.f33895b.f33837c);
            } else if ("post".equals(this.f33895b.f33836b)) {
                str = m37225b(this.f33897e, this.f33895b.f33837c);
            }
            if (C6319n.m19593a(str)) {
                this.f33898f.f33842b = -18;
                return false;
            }
            JSONObject jSONObject = new JSONObject(str);
            JSONObject a = m37221a(jSONObject);
            String optString = jSONObject.optString("message");
            if (!TextUtils.isEmpty(optString)) {
                return m37224a(jSONObject, a, optString);
            }
            if (a != null) {
                return m37224a(a, m37221a(a), a.optString("message"));
            }
            return false;
        }
    }

    /* renamed from: a */
    private static void m37222a(C12811j jVar) {
        f33893k.mo31358a(jVar);
    }

    /* renamed from: b */
    private void m37226b(R r) {
        m37222a(new C12811j(this.f33896c, r));
    }

    /* renamed from: a */
    private static JSONObject m37221a(JSONObject jSONObject) {
        JSONObject jSONObject2;
        if (jSONObject == null || !jSONObject.has("data")) {
            return null;
        }
        try {
            Object opt = jSONObject.opt("data");
            if (opt == null) {
                return null;
            }
            if (opt instanceof JSONObject) {
                jSONObject2 = (JSONObject) opt;
            } else {
                if (opt instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) opt;
                    JSONObject jSONObject3 = new JSONObject();
                    try {
                        jSONObject3.put("data", jSONArray);
                    } catch (Exception unused) {
                    }
                    jSONObject2 = jSONObject3;
                }
                jSONObject2 = null;
            }
            return jSONObject2;
        } catch (Exception unused2) {
        }
    }

    /* renamed from: c */
    private void m37227c(C12707b bVar) {
        String str;
        if (bVar != null) {
            if (this.f33898f.f33842b < 0) {
                if (bVar.f33702b == 0) {
                    bVar.f33702b = this.f33898f.f33842b;
                }
                if (bVar instanceof C12710e) {
                    T t = ((C12710e) bVar).f33709g;
                    if (t != null && t.f33960h == 0) {
                        t.f33960h = this.f33898f.f33842b;
                    }
                }
            }
            if (this.f33898f.f33842b != 0 && TextUtils.isEmpty(bVar.f33704d)) {
                if (this.f33898f.f33844d != null) {
                    str = this.f33898f.f33844d;
                } else {
                    str = "";
                }
                bVar.f33704d = str;
            }
        }
    }

    /* renamed from: a */
    private static String m37220a(String str, Map<String, String> map) throws Exception {
        C12913f fVar = new C12913f(str);
        if (map != null) {
            for (Entry entry : map.entrySet()) {
                if (!TextUtils.isEmpty((CharSequence) entry.getKey()) && !TextUtils.isEmpty((CharSequence) entry.getValue())) {
                    fVar.mo31395a((String) entry.getKey(), (String) entry.getValue());
                }
            }
        }
        if (C18895c.m61668a().mo50932d() && f33891d.contains(str)) {
            fVar.mo31395a("multi_login", "1");
        }
        fVar.mo31395a("account_sdk_source", "app");
        fVar.mo31394a("account_sdk_version", 380);
        return NetworkUtils.m37579a(Integer.MAX_VALUE, fVar.toString());
    }

    /* renamed from: b */
    private static String m37225b(String str, Map<String, String> map) throws Exception {
        HashMap hashMap = new HashMap();
        C12913f fVar = new C12913f(str);
        if (map != null) {
            for (Entry entry : map.entrySet()) {
                if (!TextUtils.isEmpty((CharSequence) entry.getKey()) && !TextUtils.isEmpty((CharSequence) entry.getValue())) {
                    hashMap.put(entry.getKey(), entry.getValue());
                }
            }
        }
        hashMap.put("account_sdk_source", "app");
        if (C18895c.m61668a().mo50932d()) {
            hashMap.put("multi_login", "1");
        }
        fVar.mo31394a("account_sdk_version", 380);
        return NetworkUtils.m37580a(Integer.MAX_VALUE, fVar.toString(), hashMap);
    }

    /* renamed from: a */
    private boolean m37224a(JSONObject jSONObject, JSONObject jSONObject2, String str) throws Exception {
        if (!"success".equals(str)) {
            m37223a(str, jSONObject, jSONObject2);
            return false;
        }
        if (jSONObject2 != null) {
            mo31162b(jSONObject, jSONObject2);
        }
        return true;
    }

    public C12806h(Context context, C12790a aVar, C12706a aVar2) {
        this.f33894a = new WeakReference<>(context);
        this.f33897e = aVar.f33835a;
        this.f33895b = aVar;
        this.f33899g = aVar2;
        if (aVar2 != null) {
            aVar2.mJobController = this;
        }
        this.f33896c = new WeakReference<>(aVar2);
        this.f33898f = new C12792b(aVar);
    }

    /* renamed from: a */
    private void m37223a(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        if (("error".equals(str) || "exception".equals(str)) && jSONObject2 != null) {
            if (jSONObject2.has("error_code")) {
                this.f33898f.f33842b = jSONObject2.optInt("error_code", this.f33898f.f33842b);
            } else if (jSONObject2.has("code")) {
                this.f33898f.f33842b = jSONObject2.optInt("code", this.f33898f.f33842b);
            }
            this.f33898f.f33843c = jSONObject2.optString("description");
            this.f33898f.f33844d = this.f33898f.f33843c;
            mo31161a(jSONObject2, jSONObject);
        }
    }
}
