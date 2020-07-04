package com.p280ss.android.ugc.aweme.web.jsbridge;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.web.p582a.C11087a;
import com.bytedance.ies.web.p582a.C11097i;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.sdk.webview.p901b.C20133e;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.app.C22912d;
import com.p280ss.android.ugc.aweme.live.p1359a.C32434c;
import com.p280ss.android.ugc.aweme.login.C32656f;
import com.p280ss.android.ugc.aweme.profile.api.C35731g;
import com.p280ss.android.ugc.aweme.profile.experiment.DivideAwemeV1User;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import java.lang.ref.WeakReference;
import org.greenrobot.eventbus.C7709l;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.web.jsbridge.d */
public class C43502d extends C20133e {

    /* renamed from: a */
    public C11087a f112646a;

    /* renamed from: b */
    public String f112647b;

    /* renamed from: c */
    private JSONObject f112648c;

    /* renamed from: a */
    private void m137979a() {
        C42961az.m136383d(this);
        this.f112648c = null;
    }

    @C7709l
    public void onEvent(C43520q qVar) {
        m137982a(qVar.f112681a, qVar.f112682b);
        m137979a();
    }

    /* renamed from: a */
    private void m137981a(String str) {
        if (!C21115b.m71197a().isLogin() && this.mContextRef != null) {
            Activity contextToActivity = contextToActivity((Context) this.mContextRef.get());
            C42961az.m136382c(this);
            try {
                C32656f.m105742a(contextToActivity, str, "");
            } catch (Throwable unused) {
                C42961az.m136383d(this);
            }
        }
    }

    public C43502d(WeakReference<Context> weakReference, C11087a aVar) {
        super(weakReference);
        this.f112646a = aVar;
    }

    /* renamed from: a */
    private void m137982a(String str, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("type", str);
            jSONObject2.put("args", jSONObject);
        } catch (JSONException unused) {
        }
        if (this.f112646a != null) {
            this.f112646a.mo27034b("H5_nativeEvent", jSONObject2);
        }
    }

    /* renamed from: a */
    public static void m137983a(JSONObject jSONObject, int i) {
        try {
            jSONObject.put("code", i);
        } catch (JSONException unused) {
        }
    }

    /* renamed from: a */
    private void m137984a(JSONObject jSONObject, String str) {
        C42961az.m136380a(new C32434c(str));
        if (this.f112646a != null) {
            this.f112646a.mo27030a(this.f112647b, jSONObject);
        }
    }

    public void call(C11097i iVar, JSONObject jSONObject) throws Exception {
        JSONObject jSONObject2;
        String string = iVar.f30171d.getString("type");
        iVar.f30170c = "open";
        iVar.f30171d.put("type", string);
        this.f112647b = iVar.f30169b;
        this.f112648c = jSONObject;
        if (iVar.f30171d.has("args")) {
            jSONObject2 = iVar.f30171d.getJSONObject("args");
        } else {
            jSONObject2 = null;
        }
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
            iVar.f30171d.put("args", jSONObject2);
        }
        if ("item".equals(string)) {
            jSONObject2.put("id", jSONObject2.get("item_id"));
        } else if ("profile".equals(string)) {
            jSONObject2.put("id", jSONObject2.get("user_id"));
        } else if ("challenge".equals(string)) {
            jSONObject2.put("id", jSONObject2.get("challenge_id"));
        } else if ("music".equals(string)) {
            jSONObject2.put("id", jSONObject2.get("music_id"));
        } else if ("collection".equals(string)) {
            jSONObject2.put("id", jSONObject2.get("collection_id"));
        } else if ("live".equals(string)) {
            m137980a(iVar, jSONObject2, jSONObject);
            return;
        } else if ("login".equals(string)) {
            m137981a(jSONObject2.optString("enter_from"));
            return;
        } else if (C22912d.f60641a.equals(string)) {
            try {
                String string2 = iVar.f30171d.getJSONObject("args").getString("url");
                if (TextUtils.equals("1", Uri.parse(string2).getQueryParameter("live_half_charge_dialog"))) {
                    m137984a(jSONObject, string2);
                    return;
                }
            } catch (Exception unused) {
            }
        }
        C42961az.m136382c(this);
        jSONObject2.put("group", "0");
        open(iVar.f30171d);
        jSONObject.put("code", 1);
    }

    /* renamed from: a */
    private void m137980a(final C11097i iVar, final JSONObject jSONObject, final JSONObject jSONObject2) {
        iVar.f30173f = false;
        C6726a.m20842a(new Runnable() {
            public final void run() {
                String str;
                int i;
                int i2;
                final int i3 = 63;
                final int i4 = 0;
                try {
                    String string = jSONObject.getString("user_id");
                    String optString = jSONObject.optString("sec_user_id");
                    if (C6384b.m19835a().mo15292a(DivideAwemeV1User.class, true, "divide_aweme_v1_user", C6384b.m19835a().mo15295d().divide_aweme_v1_user, true)) {
                        str = C35731g.m115450b(optString, string, null, 0);
                    } else if (TextUtils.isEmpty(optString)) {
                        str = C35731g.m115448b(string);
                    } else {
                        str = C35731g.m115443a(string, optString, "", 0);
                    }
                    User a = C35731g.m115439a(str, false, (String) null);
                    if (a.roomId == 0) {
                        i2 = 0;
                        i = 47;
                    } else {
                        i2 = 1;
                        i = 31;
                    }
                    jSONObject.put("room_id", String.valueOf(a.roomId));
                    i4 = i2;
                    i3 = i;
                } catch (Exception | JSONException unused) {
                }
                C6726a.m20844b(new Runnable() {
                    public final void run() {
                        if (i3 != 47) {
                            C43502d.this.open(iVar.f30171d);
                        }
                        C43502d.m137983a(jSONObject2, i4);
                        C43502d.this.f112646a.mo27030a(C43502d.this.f112647b, jSONObject);
                    }
                });
            }
        });
    }
}
