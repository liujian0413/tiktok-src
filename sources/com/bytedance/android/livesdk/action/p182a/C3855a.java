package com.bytedance.android.livesdk.action.p182a;

import android.text.TextUtils;
import com.bytedance.android.live.base.model.NameValuePair;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.network.api.INetworkService;
import com.bytedance.android.live.room.C3495l;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.action.C3866b;
import com.bytedance.android.livesdk.action.C3867c;
import com.bytedance.android.livesdk.action.C3868d;
import com.bytedance.android.livesdk.browser.jsbridge.p200b.C4039a;
import com.bytedance.android.livesdk.utils.C9049ap;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostNetwork;
import com.bytedance.android.livesdkapi.p457i.C9477e;
import com.p280ss.android.common.util.C19290j;
import com.p280ss.android.http.legacy.p296a.C19565e;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p346io.reactivex.C47557ad;
import p346io.reactivex.C7319aa;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7327h;
import p346io.reactivex.p351i.C7333a;

@C3867c(mo11408a = "webcast_inroom_fetch")
/* renamed from: com.bytedance.android.livesdk.action.a.a */
public final class C3855a extends C3868d<JSONObject> {

    /* renamed from: b */
    public C7321c f11553b;

    /* renamed from: b */
    private static List<NameValuePair> m13703b(JSONObject jSONObject) {
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
    private static void m13702a(JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        Room currentRoom = ((C3495l) C3596c.m13172a(C3495l.class)).getCurrentRoom();
        if (currentRoom != null) {
            try {
                jSONObject.put("room_id", String.valueOf(currentRoom.getId()));
                jSONObject.put("anchor_id", String.valueOf(currentRoom.getOwnerUserId()));
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo11405a(Map<String, Object> map) throws Exception {
        String str;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        String valueOf = String.valueOf(map.get("url"));
        Object obj = map.get("method");
        if (obj != null) {
            str = obj.toString().toLowerCase();
        } else {
            str = "post";
        }
        Object obj2 = map.get("headers");
        if (obj2 != null) {
            jSONObject = new JSONObject(obj2.toString());
        } else {
            jSONObject = null;
        }
        Object obj3 = map.get("params");
        if (obj3 != null) {
            jSONObject2 = new JSONObject(obj3.toString());
        } else {
            jSONObject2 = null;
        }
        Object obj4 = map.get("data");
        if (obj4 != null) {
            jSONObject3 = new JSONObject(obj4.toString());
        } else {
            jSONObject3 = null;
        }
        C7319aa b = C7319aa.m22930a(str).mo19135b(C7333a.m23044b());
        C3857b bVar = new C3857b(this, jSONObject2, valueOf, jSONObject3, jSONObject);
        b.mo19134b((C7327h<? super T, ? extends R>) bVar).mo19127a(C47549a.m148327a()).mo19137b((C47557ad<? super T>) new C47557ad<JSONObject>() {
            public final void onSubscribe(C7321c cVar) {
                C3855a.this.f11553b = cVar;
            }

            public final void onError(Throwable th) {
                C9049ap.m27028a(C3358ac.m12515a((int) R.string.f7z));
                C3855a.this.mo11412a(th);
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onSuccess(JSONObject jSONObject) {
                try {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                    if (jSONObject.getInt("status_code") == 0) {
                        C3866b.m13714a().mo11406a(jSONObject2.getString("schema"));
                    } else {
                        C9049ap.m27028a(jSONObject2.getString("prompts"));
                    }
                    C3855a.this.mo11410a(jSONObject);
                } catch (JSONException e) {
                    C3855a.this.mo11412a((Throwable) e);
                }
            }
        });
    }

    /* renamed from: a */
    private static String m13699a(String str, JSONObject jSONObject) {
        C19290j jVar = new C19290j(str);
        for (NameValuePair nameValuePair : m13703b(jSONObject)) {
            jVar.mo51188a(nameValuePair.getName(), nameValuePair.getValue());
        }
        return jVar.mo51184a();
    }

    /* renamed from: a */
    private static JSONObject m13700a(String str, JSONObject jSONObject, JSONObject jSONObject2) throws IOException, JSONException {
        String a = m13699a(str, jSONObject2);
        StringBuilder sb = new StringBuilder("https://");
        sb.append(((IHostNetwork) C3596c.m13172a(IHostNetwork.class)).getHostDomain());
        sb.append(a);
        return new JSONObject(new String(((C9477e) ((INetworkService) C3596c.m13172a(INetworkService.class)).get(sb.toString(), m13703b(jSONObject)).mo23512a()).f25947e));
    }

    /* renamed from: a */
    private static JSONObject m13701a(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) throws IOException, JSONException {
        String a = m13699a(str, jSONObject2);
        ArrayList<C19565e> arrayList = new ArrayList<>();
        if (jSONObject3 != null) {
            Iterator keys = jSONObject3.keys();
            while (keys.hasNext()) {
                String str2 = (String) keys.next();
                arrayList.add(new C19565e(str2, jSONObject3.optString(str2, "")));
            }
        }
        String a2 = C4039a.m14106a(a);
        StringBuilder sb = new StringBuilder("https://");
        sb.append(((IHostNetwork) C3596c.m13172a(IHostNetwork.class)).getHostDomain());
        sb.append(a2);
        String sb2 = sb.toString();
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
        return new JSONObject(new String(((C9477e) ((INetworkService) C3596c.m13172a(INetworkService.class)).post(sb2, m13703b(jSONObject), "application/x-www-form-urlencoded; charset=UTF-8", byteArrayOutputStream.toByteArray()).mo23512a()).f25947e));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ JSONObject mo11404a(JSONObject jSONObject, String str, JSONObject jSONObject2, JSONObject jSONObject3, String str2) throws Exception {
        if (TextUtils.equals(str2, "post")) {
            m13702a(jSONObject2);
            return m13701a(str, jSONObject3, jSONObject, jSONObject2);
        }
        m13702a(jSONObject);
        return m13700a(str, jSONObject3, jSONObject);
    }
}
