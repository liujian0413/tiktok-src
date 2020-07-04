package com.p280ss.android.ugc.aweme.bullet.bridge.common;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.bullet.core.kit.bridge.IBridge.Access;
import com.bytedance.ies.bullet.core.model.p542a.C10403b;
import com.bytedance.ies.web.p582a.C11087a;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.app.C22912d;
import com.p280ss.android.ugc.aweme.bullet.bridge.BaseBridge.C23565a;
import com.p280ss.android.ugc.aweme.live.p1359a.C32434c;
import com.p280ss.android.ugc.aweme.login.C32656f;
import com.p280ss.android.ugc.aweme.profile.api.C35731g;
import com.p280ss.android.ugc.aweme.profile.experiment.DivideAwemeV1User;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.web.jsbridge.C43520q;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import org.greenrobot.eventbus.C7709l;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.OpenAwemeMethod */
public final class OpenAwemeMethod extends OpenMethod {

    /* renamed from: e */
    public static final C23575a f62189e = new C23575a(null);

    /* renamed from: c */
    public String f62190c;

    /* renamed from: d */
    public C11087a f62191d;

    /* renamed from: g */
    private String f62192g = "openAweme";

    /* renamed from: h */
    private Access f62193h = Access.PROTECT;

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.OpenAwemeMethod$a */
    public static final class C23575a {
        private C23575a() {
        }

        public /* synthetic */ C23575a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.OpenAwemeMethod$b */
    static final class C23576b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ OpenAwemeMethod f62194a;

        /* renamed from: b */
        final /* synthetic */ JSONObject f62195b;

        /* renamed from: c */
        final /* synthetic */ JSONObject f62196c;

        /* renamed from: d */
        final /* synthetic */ JSONObject f62197d;

        C23576b(OpenAwemeMethod openAwemeMethod, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
            this.f62194a = openAwemeMethod;
            this.f62195b = jSONObject;
            this.f62196c = jSONObject2;
            this.f62197d = jSONObject3;
        }

        public final void run() {
            String str;
            int i;
            int i2;
            final int i3 = 63;
            final int i4 = 0;
            try {
                String string = this.f62195b.getString("user_id");
                String optString = this.f62195b.optString("sec_user_id");
                C7573i.m23582a((Object) optString, "jsonObject.optString(\"sec_user_id\")");
                if (C6384b.m19835a().mo15292a(DivideAwemeV1User.class, true, "divide_aweme_v1_user", C6384b.m19835a().mo15295d().divide_aweme_v1_user, true)) {
                    str = C35731g.m115449b(optString, string, 0);
                } else if (TextUtils.isEmpty(optString)) {
                    str = C35731g.m115448b(string);
                } else {
                    str = C35731g.m115442a(string, optString, 0);
                }
                User a = C35731g.m115439a(str, false, (String) null);
                if (a.roomId == 0) {
                    i2 = 0;
                    i = 47;
                } else {
                    i2 = 1;
                    i = 31;
                }
                this.f62195b.put("room_id", String.valueOf(a.roomId));
                i4 = i2;
                i3 = i;
            } catch (Exception | JSONException unused) {
            }
            C6726a.m20844b(new Runnable(this) {

                /* renamed from: a */
                final /* synthetic */ C23576b f62198a;

                {
                    this.f62198a = r1;
                }

                public final void run() {
                    if (i3 != 47) {
                        this.f62198a.f62194a.mo61501a(this.f62198a.f62196c);
                    }
                    OpenAwemeMethod.m77402a(this.f62198a.f62197d, i4);
                    C11087a aVar = this.f62198a.f62194a.f62191d;
                    if (aVar != null) {
                        aVar.mo27030a(this.f62198a.f62194a.f62190c, this.f62198a.f62195b);
                    }
                }
            });
        }
    }

    /* renamed from: e */
    private final void m77407e() {
        C42961az.m136383d(this);
    }

    /* renamed from: b */
    public final Access mo25126b() {
        return this.f62193h;
    }

    /* renamed from: c */
    public final String mo25127c() {
        return this.f62192g;
    }

    /* renamed from: a */
    public final void mo25139a(Access access) {
        C7573i.m23587b(access, "<set-?>");
        this.f62193h = access;
    }

    public OpenAwemeMethod(C10403b bVar) {
        C7573i.m23587b(bVar, "contextProviderFactory");
        super(bVar);
    }

    @C7709l
    public final void onEvent(C43520q qVar) {
        C7573i.m23587b(qVar, "event");
        String str = qVar.f112681a;
        C7573i.m23582a((Object) str, "event.type");
        JSONObject jSONObject = qVar.f112682b;
        C7573i.m23582a((Object) jSONObject, "event.args");
        m77406b(str, jSONObject);
        m77407e();
    }

    /* renamed from: b */
    private final void m77405b(String str) {
        IAccountUserService a = C21115b.m71197a();
        C7573i.m23582a((Object) a, "AccountUserProxyService.get()");
        if (!a.isLogin() && this.f28552b != null) {
            Activity a2 = mo61500a(this.f28552b);
            C42961az.m136382c(this);
            try {
                C32656f.m105742a(a2, str, "");
            } catch (Throwable unused) {
                C42961az.m136383d(this);
            }
        }
    }

    /* renamed from: a */
    public static void m77402a(JSONObject jSONObject, int i) {
        C7573i.m23587b(jSONObject, "res");
        try {
            jSONObject.put("code", i);
        } catch (JSONException unused) {
        }
    }

    /* renamed from: a */
    private final void m77403a(JSONObject jSONObject, String str) {
        C42961az.m136380a(new C32434c(str));
        C11087a aVar = this.f62191d;
        if (aVar != null) {
            aVar.mo27030a(this.f62190c, jSONObject);
        }
    }

    /* renamed from: b */
    private void m77406b(String str, JSONObject jSONObject) {
        C7573i.m23587b(str, "type");
        C7573i.m23587b(jSONObject, "args");
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("type", str);
            jSONObject2.put("args", jSONObject);
        } catch (JSONException unused) {
        }
        C11087a aVar = this.f62191d;
        if (aVar != null) {
            aVar.mo27034b("H5_nativeEvent", jSONObject2);
        }
    }

    /* renamed from: a */
    public final void mo61491a(JSONObject jSONObject, C23565a aVar) {
        JSONObject jSONObject2;
        C7573i.m23587b(jSONObject, "params");
        C7573i.m23587b(aVar, "iReturn");
        this.f62191d = (C11087a) this.f28074a.mo25202b(C11087a.class);
        JSONObject jSONObject3 = jSONObject.getJSONObject("res");
        String string = jSONObject.getString("type");
        this.f62190c = jSONObject.getString("callback_id");
        if (jSONObject.has("args")) {
            jSONObject2 = jSONObject.getJSONObject("args");
        } else {
            jSONObject2 = null;
        }
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
            jSONObject.put("args", jSONObject2);
        }
        if (C7573i.m23585a((Object) "item", (Object) string)) {
            jSONObject2.put("id", jSONObject2.get("item_id"));
        } else if (C7573i.m23585a((Object) "profile", (Object) string)) {
            jSONObject2.put("id", jSONObject2.get("user_id"));
        } else if (C7573i.m23585a((Object) "challenge", (Object) string)) {
            jSONObject2.put("id", jSONObject2.get("challenge_id"));
        } else if (C7573i.m23585a((Object) "music", (Object) string)) {
            jSONObject2.put("id", jSONObject2.get("music_id"));
        } else if (C7573i.m23585a((Object) "collection", (Object) string)) {
            jSONObject2.put("id", jSONObject2.get("collection_id"));
        } else if (C7573i.m23585a((Object) "live", (Object) string)) {
            C7573i.m23582a((Object) jSONObject3, "res");
            m77404a(jSONObject, jSONObject2, jSONObject3);
            return;
        } else if (C7573i.m23585a((Object) "login", (Object) string)) {
            String optString = jSONObject2.optString("enter_from");
            C7573i.m23582a((Object) optString, "enterFrom");
            m77405b(optString);
            return;
        } else if (C7573i.m23585a((Object) C22912d.f60641a, (Object) string)) {
            try {
                String string2 = jSONObject.getJSONObject("args").getString("url");
                if (TextUtils.equals("1", Uri.parse(string2).getQueryParameter("live_half_charge_dialog"))) {
                    C7573i.m23582a((Object) jSONObject3, "res");
                    C7573i.m23582a((Object) string2, "openUrl");
                    m77403a(jSONObject3, string2);
                    return;
                }
            } catch (Exception unused) {
            }
        }
        C42961az.m136382c(this);
        jSONObject2.put("group", "0");
        mo61501a(jSONObject);
        if (jSONObject3 != null) {
            jSONObject3.put("code", 1);
        }
    }

    /* renamed from: a */
    private final void m77404a(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        C6726a.m20842a(new C23576b(this, jSONObject2, jSONObject, jSONObject3));
    }
}
