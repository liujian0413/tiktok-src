package com.p280ss.android.sdk.webview;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.MaxSizeLinkedHashMap;
import com.p280ss.android.common.util.C19290j;
import com.p280ss.android.common.util.NetworkUtils;
import com.p280ss.android.download.p856a.C19362d;
import com.p280ss.android.download.p856a.C19362d.C19363a;
import com.p280ss.android.sdk.webview.p900a.C20126b;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.android.sdk.webview.m */
public class C20146m {

    /* renamed from: a */
    private static C20146m f54520a;

    /* renamed from: b */
    private final MaxSizeLinkedHashMap<String, C20150o> f54521b = new MaxSizeLinkedHashMap<>(16, 16);

    /* renamed from: c */
    private final C20150o f54522c = new C20150o("", null, null);

    /* renamed from: d */
    private C19363a<String, String, String, Void, C20150o> f54523d = new C19363a<String, String, String, Void, C20150o>() {
        /* access modifiers changed from: private */
        /* renamed from: a */
        public C20150o mo51335a(String str, String str2, String str3) {
            return C20146m.this.mo53920a(str, str2, str3);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void mo51336a(String str, String str2, String str3, Void voidR, C20150o oVar) {
            C20146m.this.mo53922a(str, oVar, str2);
        }
    };

    /* renamed from: e */
    private C19362d<String, String, String, Void, C20150o> f54524e = new C19362d<>(16, 2, this.f54523d);

    /* renamed from: f */
    private List<C20148a> f54525f;

    /* renamed from: com.ss.android.sdk.webview.m$a */
    public interface C20148a {
        /* renamed from: a */
        void mo53869a(String str, C20150o oVar, String str2);
    }

    /* renamed from: a */
    public static C20146m m66392a() {
        if (f54520a == null) {
            synchronized (C20146m.class) {
                if (f54520a == null) {
                    f54520a = new C20146m();
                }
            }
        }
        return f54520a;
    }

    private C20146m() {
    }

    /* renamed from: b */
    public final void mo53923b(C20148a aVar) {
        if (this.f54525f != null && !this.f54525f.isEmpty()) {
            this.f54525f.remove(aVar);
        }
    }

    /* renamed from: a */
    public final void mo53921a(C20148a aVar) {
        if (this.f54525f == null) {
            this.f54525f = new ArrayList();
        }
        if (!this.f54525f.contains(aVar)) {
            this.f54525f.add(aVar);
        }
    }

    /* renamed from: a */
    private static void m66393a(JSONArray jSONArray, List<String> list) {
        if (jSONArray != null && list != null) {
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                String optString = jSONArray.optString(i);
                if (!TextUtils.isEmpty(optString)) {
                    list.add(optString);
                }
            }
        }
    }

    /* renamed from: a */
    public final C20150o mo53919a(Context context, String str, String str2) {
        if (context == null) {
            return null;
        }
        String a = C20150o.m66405a(str, str2);
        if (TextUtils.isEmpty(a)) {
            return this.f54522c;
        }
        C20150o oVar = (C20150o) this.f54521b.get(a);
        long currentTimeMillis = System.currentTimeMillis();
        boolean a2 = C20149n.m66404a(context);
        if (oVar != null && (currentTimeMillis - oVar.f54530d < 600000 || (!a2 && currentTimeMillis - oVar.f54530d < 1200000))) {
            return oVar;
        }
        if (a2) {
            this.f54524e.mo51326a(a, str, str2, null);
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C20150o mo53920a(String str, String str2, String str3) {
        C20150o oVar = null;
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return null;
        }
        try {
            C19290j jVar = new C19290j(C20126b.m66361a().getJSSDKConfigUrl());
            jVar.mo51188a("client_id", str3);
            jVar.mo51188a("partner_domain", str2);
            String executeGet = NetworkUtils.executeGet(-1, jVar.mo51184a());
            if (TextUtils.isEmpty(executeGet)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(executeGet);
            if (!C20126b.m66361a().isApiSuccess(jSONObject)) {
                return null;
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject != null) {
                C20150o oVar2 = new C20150o(str, str2, str3);
                try {
                    m66393a(optJSONObject.optJSONArray("call"), oVar2.f54531e);
                    m66393a(optJSONObject.optJSONArray("info"), oVar2.f54532f);
                    m66393a(optJSONObject.optJSONArray("event"), oVar2.f54533g);
                } catch (Exception unused) {
                }
                oVar = oVar2;
            }
            return oVar;
        } catch (Exception unused2) {
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo53922a(String str, C20150o oVar, String str2) {
        if (str != null) {
            if (oVar != null) {
                oVar.f54530d = System.currentTimeMillis();
                this.f54521b.put(str, oVar);
            }
            if (this.f54525f != null && !this.f54525f.isEmpty()) {
                for (int i = 0; i < this.f54525f.size(); i++) {
                    C20148a aVar = (C20148a) this.f54525f.get(i);
                    if (aVar != null) {
                        aVar.mo53869a(str, oVar, str2);
                    }
                }
            }
        }
    }
}
