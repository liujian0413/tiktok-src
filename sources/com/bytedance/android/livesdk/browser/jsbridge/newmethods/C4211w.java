package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.android.live.base.model.NameValuePair;
import com.bytedance.android.live.network.api.INetworkService;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.browser.jsbridge.p200b.C4039a;
import com.bytedance.android.livesdkapi.p457i.C9477e;
import com.bytedance.ies.web.jsbridge2.C11152c;
import com.bytedance.ies.web.jsbridge2.CallContext;
import com.p280ss.android.common.util.C19290j;
import com.p280ss.android.http.legacy.p296a.C19565e;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p346io.reactivex.C47557ad;
import p346io.reactivex.C7319aa;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7327h;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.w */
public final class C4211w extends C11152c<JSONObject, JSONObject> {

    /* renamed from: a */
    public C7321c f12315a;

    public final void onTerminate() {
        if (this.f12315a != null) {
            this.f12315a.dispose();
        }
    }

    /* renamed from: a */
    private static List<NameValuePair> m14336a(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        if (jSONObject != null) {
            Iterator keys = jSONObject.keys();
            while (keys.hasNext()) {
                String str = (String) keys.next();
                arrayList.add(new NameValuePair(str, jSONObject.optString(str, "")));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private static String m14332a(String str, JSONObject jSONObject) {
        C19290j jVar = new C19290j(str);
        for (NameValuePair nameValuePair : m14336a(jSONObject)) {
            jVar.mo51188a(nameValuePair.getName(), nameValuePair.getValue());
        }
        return jVar.mo51184a();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void invoke(JSONObject jSONObject, CallContext callContext) throws JSONException {
        String optString = jSONObject.optString("url", "");
        C7319aa.m22930a(jSONObject.optString("method", "get").toLowerCase()).mo19135b(C7333a.m23044b()).mo19134b((C7327h<? super T, ? extends R>) new C4213x<Object,Object>(optString, jSONObject.optJSONObject("headers"), jSONObject.optJSONObject("params"), jSONObject.optJSONObject("data"))).mo19127a(C47549a.m148327a()).mo19137b((C47557ad<? super T>) new C47557ad<String>() {
            public final void onError(Throwable th) {
                C4211w.this.finishWithFailure(th);
            }

            public final void onSubscribe(C7321c cVar) {
                C4211w.this.f12315a = cVar;
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onSuccess(String str) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("raw", str);
                    C4211w.this.finishWithResult(jSONObject);
                } catch (JSONException e) {
                    C4211w.this.finishWithFailure(e);
                }
            }
        });
    }

    /* renamed from: a */
    private static String m14333a(String str, JSONObject jSONObject, JSONObject jSONObject2) throws IOException, JSONException {
        return Base64.encodeToString(((C9477e) ((INetworkService) C3596c.m13172a(INetworkService.class)).get(m14332a(str, jSONObject2), m14336a(jSONObject)).mo23512a()).f25947e, 2);
    }

    /* renamed from: a */
    private static String m14334a(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) throws IOException, JSONException {
        String a = m14332a(str, jSONObject2);
        ArrayList<C19565e> arrayList = new ArrayList<>();
        if (jSONObject3 != null) {
            Iterator keys = jSONObject3.keys();
            while (keys.hasNext()) {
                String str2 = (String) keys.next();
                arrayList.add(new C19565e(str2, jSONObject3.optString(str2, "")));
            }
        }
        String a2 = C4039a.m14106a(a);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (C19565e eVar : arrayList) {
            if (byteArrayOutputStream.size() > 0) {
                byteArrayOutputStream.write(38);
            }
            try {
                String encode = URLEncoder.encode(eVar.mo51722a(), "UTF-8");
                String encode2 = URLEncoder.encode(eVar.mo51723b(), "UTF-8");
                byteArrayOutputStream.write(encode.getBytes(Charset.forName("UTF-8")));
                byteArrayOutputStream.write(61);
                byteArrayOutputStream.write(encode2.getBytes(Charset.forName("UTF-8")));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return Base64.encodeToString(((C9477e) ((INetworkService) C3596c.m13172a(INetworkService.class)).post(a2, m14336a(jSONObject), "application/x-www-form-urlencoded; charset=UTF-8", byteArrayOutputStream.toByteArray()).mo23512a()).f25947e, 2);
    }

    /* renamed from: a */
    static final /* synthetic */ String m14335a(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, String str2) throws Exception {
        if (TextUtils.equals(str2, "post")) {
            return m14334a(str, jSONObject, jSONObject2, jSONObject3);
        }
        return m14333a(str, jSONObject, jSONObject2);
    }
}
