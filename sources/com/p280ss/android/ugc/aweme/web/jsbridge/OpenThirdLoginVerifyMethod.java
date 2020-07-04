package com.p280ss.android.ugc.aweme.web.jsbridge;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.web.p582a.C11087a;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.base.activity.C23255b;
import com.p280ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod.C27876a;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheTTnetProxyTimeoutExperiment;
import kotlin.jvm.internal.C7573i;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.web.jsbridge.OpenThirdLoginVerifyMethod */
public final class OpenThirdLoginVerifyMethod extends BaseCommonJavaMethod {

    /* renamed from: a */
    public final C11087a f112559a;

    /* renamed from: com.ss.android.ugc.aweme.web.jsbridge.OpenThirdLoginVerifyMethod$a */
    static final class C43462a implements C23255b {

        /* renamed from: a */
        final /* synthetic */ OpenThirdLoginVerifyMethod f112560a;

        /* renamed from: b */
        final /* synthetic */ C27876a f112561b;

        /* renamed from: c */
        final /* synthetic */ String f112562c;

        C43462a(OpenThirdLoginVerifyMethod openThirdLoginVerifyMethod, C27876a aVar, String str) {
            this.f112560a = openThirdLoginVerifyMethod;
            this.f112561b = aVar;
            this.f112562c = str;
        }

        /* renamed from: a */
        public final boolean mo60523a(int i, int i2, Intent intent) {
            if (i2 == -1 && i == 10000) {
                String stringExtra = intent.getStringExtra("access_token");
                if (stringExtra == null) {
                    stringExtra = "";
                }
                String stringExtra2 = intent.getStringExtra("access_token_secret");
                if (stringExtra2 == null) {
                    stringExtra2 = "";
                }
                String stringExtra3 = intent.getStringExtra("code");
                if (stringExtra3 == null) {
                    stringExtra3 = "";
                }
                if (!C7573i.m23585a((Object) stringExtra, (Object) "") || !C7573i.m23585a((Object) stringExtra2, (Object) "") || !C7573i.m23585a((Object) stringExtra3, (Object) "")) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        if (C7573i.m23585a((Object) "line", (Object) this.f112562c)) {
                            jSONObject.put("access_token", Uri.encode(stringExtra));
                            jSONObject.put("access_token_secret", Uri.encode(stringExtra2));
                            jSONObject.put("code", Uri.encode(stringExtra3));
                        } else {
                            jSONObject.put("access_token", stringExtra);
                            jSONObject.put("access_token_secret", stringExtra2);
                            jSONObject.put("code", stringExtra3);
                        }
                        jSONObject.put("platform", this.f112562c);
                        jSONObject.put("platform_app_id", OpenThirdLoginVerifyMethod.m137921a(this.f112562c));
                        C27876a aVar = this.f112561b;
                        if (aVar != null) {
                            aVar.mo71363a((Object) jSONObject);
                        }
                    } catch (JSONException unused) {
                        C27876a aVar2 = this.f112561b;
                        if (aVar2 != null) {
                            aVar2.mo71362a(0, "failed");
                        }
                        return true;
                    }
                } else {
                    C27876a aVar3 = this.f112561b;
                    if (aVar3 != null) {
                        aVar3.mo71362a(0, "");
                    }
                    return true;
                }
            } else {
                C27876a aVar4 = this.f112561b;
                if (aVar4 != null) {
                    aVar4.mo71362a(0, "");
                }
            }
            return true;
        }
    }

    public OpenThirdLoginVerifyMethod(C11087a aVar) {
        super(aVar);
        this.f112559a = aVar;
    }

    /* renamed from: a */
    public static String m137921a(String str) {
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != -1240244679) {
                if (hashCode != -916346253) {
                    if (hashCode != 3765) {
                        if (hashCode != 28903346) {
                            if (hashCode == 497130182 && str.equals("facebook")) {
                                if (C6399b.m19946v()) {
                                    return "310";
                                }
                                return "";
                            }
                        } else if (str.equals("instagram")) {
                            if (C6399b.m19946v()) {
                                return "312";
                            }
                            return "204";
                        }
                    } else if (str.equals("vk")) {
                        if (C6399b.m19946v()) {
                            return "334";
                        }
                        return "";
                    }
                } else if (str.equals("twitter")) {
                    if (C6399b.m19946v()) {
                        return "313";
                    }
                    return "504";
                }
            } else if (str.equals("google")) {
                if (C6399b.m19946v()) {
                    return "311";
                }
                return "";
            }
        }
        return "";
    }

    /* renamed from: a */
    public final void mo64209a(JSONObject jSONObject, C27876a aVar) {
        String str;
        if (this.f73443f != null && this.f112559a != null) {
            if (jSONObject != null) {
                str = jSONObject.getString("platform");
            } else {
                str = null;
            }
            Context context = (Context) this.f73443f.get();
            if (context instanceof CrossPlatformActivity) {
                CrossPlatformActivity crossPlatformActivity = (CrossPlatformActivity) context;
                crossPlatformActivity.mo60524a((C23255b) new C43462a(this, aVar, str));
                Intent authorizeActivityStartIntent = C6861a.m21335d().getAuthorizeActivityStartIntent(crossPlatformActivity);
                authorizeActivityStartIntent.putExtra("platform", str);
                authorizeActivityStartIntent.putExtra("is_login", false);
                authorizeActivityStartIntent.putExtra("is_only_fetch_token", true);
                crossPlatformActivity.startActivityForResult(authorizeActivityStartIntent, VideoCacheTTnetProxyTimeoutExperiment.DEFAULT);
                return;
            }
            aVar.mo71362a(0, "");
        }
    }
}
