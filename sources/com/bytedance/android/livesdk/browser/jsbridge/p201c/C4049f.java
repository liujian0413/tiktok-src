package com.bytedance.android.livesdk.browser.jsbridge.p201c;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.android.live.api.exceptions.local.ApiLocalException;
import com.bytedance.android.live.core.p147c.C3166a;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.core.utils.C3384d;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.api.C3628c;
import com.bytedance.android.live.wallet.model.CheckOrderOriginalResult;
import com.bytedance.android.live.wallet.p178b.p179a.C3644a;
import com.bytedance.android.live.wallet.p178b.p180b.C3669a;
import com.bytedance.android.livesdk.p393h.C8296e;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.android.livesdk.p428w.C9178j;
import com.bytedance.android.livesdk.utils.C9044al;
import com.bytedance.android.livesdk.utils.C9049ap;
import com.bytedance.android.livesdkapi.depend.model.C9353b;
import com.bytedance.android.livesdkapi.depend.model.ChargeDeal;
import com.bytedance.android.livesdkapi.host.PayChannel;
import com.bytedance.ies.web.p582a.C11093e;
import com.bytedance.ies.web.p582a.C11097i;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.c.f */
public final class C4049f implements C11093e {

    /* renamed from: a */
    public final WeakReference<Context> f12036a;

    /* renamed from: b */
    public C9353b f12037b;

    /* renamed from: c */
    public ProgressDialog f12038c;

    /* renamed from: d */
    private IWalletService f12039d = ((IWalletService) C3596c.m13172a(IWalletService.class));

    /* renamed from: e */
    private C3644a f12040e;

    public C4049f(WeakReference<Context> weakReference) {
        this.f12036a = weakReference;
    }

    /* renamed from: a */
    private int m14116a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return 0;
        }
        try {
            Pair b = m14119b(jSONObject);
            if (b == null) {
                return 0;
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("args");
            String str = "live_detail";
            String str2 = "";
            if (optJSONObject != null) {
                str = optJSONObject.optString("request_page");
                str2 = optJSONObject.optString("charge_reason");
            }
            return m14115a((C9353b) b.second, (String) b.first, str, str2);
        } catch (NullPointerException unused) {
            return 0;
        }
    }

    /* renamed from: b */
    private static Pair<String, C9353b> m14119b(JSONObject jSONObject) {
        if (jSONObject == null || ((IWalletService) C3596c.m13172a(IWalletService.class)) == null) {
            return null;
        }
        String optString = jSONObject.optString("type");
        JSONObject optJSONObject = jSONObject.optJSONObject("args");
        if (optJSONObject == null) {
            return null;
        }
        C9353b bVar = new C9353b();
        bVar.f25546a = optJSONObject.optString("order_id");
        bVar.f25552g = optJSONObject.optString("channel_id");
        bVar.f25549d = optJSONObject.optString("product_id");
        bVar.f25550e = optJSONObject.optInt("real_count");
        if (TextUtils.equals(optString, "alipay")) {
            bVar.f25548c = PayChannel.ALIPAY;
            String optString2 = optJSONObject.optString("order_info");
            String optString3 = optJSONObject.optString("sign");
            String optString4 = optJSONObject.optString("sign_type");
            if (!TextUtils.isEmpty(optString3)) {
                StringBuilder sb = new StringBuilder();
                sb.append(optString2);
                sb.append("&sign=\"");
                sb.append(optString3);
                sb.append("\"");
                optString2 = sb.toString();
            }
            if (!TextUtils.isEmpty(optString4)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(optString2);
                sb2.append("&sign_type=\"");
                sb2.append(optString4);
                sb2.append("\"");
                optString2 = sb2.toString();
            }
            bVar.f25553h = optString2;
        } else if (!TextUtils.equals(optString, "wxpay")) {
            return null;
        } else {
            bVar.f25548c = PayChannel.WEIXIN;
            bVar.f25554i = optJSONObject.optString("app_id");
            bVar.f25555j = optJSONObject.optString("partner_id");
            bVar.f25557l = optJSONObject.optString("nonce_str");
            bVar.f25556k = optJSONObject.optString("prepay_id");
            bVar.f25558m = optJSONObject.optString("timestamp");
            bVar.f25559n = optJSONObject.optString("sign");
        }
        return new Pair<>(optString, bVar);
    }

    public final void call(C11097i iVar, JSONObject jSONObject) throws Exception {
        if (iVar != null && iVar.f30171d != null) {
            jSONObject.put("code", m14116a(iVar.f30171d));
        }
    }

    /* renamed from: a */
    public static JSONObject m14118a(C9353b bVar, int i) {
        String str;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", "pay");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("order_id", bVar.f25546a);
            jSONObject2.put("channel_param", i);
            String str2 = "channel";
            if (bVar.f25548c == PayChannel.ALIPAY) {
                str = "alipay";
            } else {
                str = "wxpay";
            }
            jSONObject2.put(str2, str);
            jSONObject2.put("channel_id", bVar.f25552g);
            jSONObject.put("args", jSONObject2);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* renamed from: a */
    private C3644a m14117a(Activity activity, String str, String str2) {
        if (this.f12040e == null) {
            this.f12040e = ((IWalletService) C3596c.m13172a(IWalletService.class)).getBasePayPresenter(activity, new C3628c() {
            }, str2, str, 0, new C3669a() {
                /* renamed from: a */
                public final void mo11113a(C9353b bVar) {
                }

                /* renamed from: a */
                public final void mo11114a(Exception exc) {
                }

                /* renamed from: c */
                public final void mo11116c() {
                    if (C4049f.this.f12038c != null) {
                        if (C4049f.this.f12038c.isShowing()) {
                            C4049f.this.f12038c.dismiss();
                        }
                        C4049f.this.f12038c = null;
                    }
                }

                /* renamed from: d */
                public final void mo11117d() {
                    C9049ap.m27022a((int) R.string.f9k);
                    C9178j.m27302j().mo22374c().mo11543a("H5_payStatusChange", C4049f.m14118a(C4049f.this.f12037b, -1));
                }

                /* renamed from: a */
                public final void mo11111a(int i) {
                    if ((C4049f.this.f12036a.get() != null && C4049f.this.f12038c == null) || !C4049f.this.f12038c.isShowing()) {
                        C4049f.this.f12038c = C9044al.m27010a((Context) C4049f.this.f12036a.get(), C3358ac.m12515a((int) R.string.f9r));
                    }
                }

                /* renamed from: a */
                public final void mo11112a(int i, CheckOrderOriginalResult checkOrderOriginalResult) {
                    C9049ap.m27022a((int) R.string.f9t);
                    C9178j.m27302j().mo22374c().mo11543a("H5_payStatusChange", C4049f.m14118a(C4049f.this.f12037b, 1));
                    C8296e eVar = new C8296e(C4049f.this.f12037b.f25550e);
                    eVar.f22776a = 0;
                    C9097a.m27146a().mo22267a((Object) eVar);
                }

                /* renamed from: a */
                public final void mo11115a(Exception exc, int i) {
                    C9178j.m27302j().mo22374c().mo11543a("H5_payStatusChange", C4049f.m14118a(C4049f.this.f12037b, 2));
                    if (exc instanceof ApiLocalException) {
                        int errorCode = ((ApiLocalException) exc).getErrorCode();
                        if (errorCode == 0) {
                            C9049ap.m27022a((int) R.string.f9u);
                        } else if (errorCode == 1 || errorCode == 2) {
                            C9049ap.m27022a((int) R.string.f9v);
                        } else {
                            C9049ap.m27022a((int) R.string.f9n);
                        }
                    } else {
                        C9049ap.m27022a((int) R.string.f9m);
                    }
                }
            });
        }
        return this.f12040e;
    }

    /* renamed from: a */
    private int m14115a(C9353b bVar, String str, String str2, String str3) {
        if (this.f12036a == null || this.f12036a.get() == null || this.f12039d == null) {
            return 1;
        }
        ChargeDeal chargeDeal = new ChargeDeal();
        chargeDeal.f25523i = bVar.f25550e;
        try {
            chargeDeal.f25515a = Long.parseLong(bVar.f25549d);
        } catch (Exception e) {
            C3166a.m11963b("LivePayMethod", (Throwable) e);
        }
        if (!TextUtils.equals(str, "wxpay")) {
            TextUtils.equals(str, "alipay");
        }
        if (C3384d.m12589a((Context) this.f12036a.get()) == null) {
            C3166a.m11966e("LivePayMethod", "No activity was attached while paying");
            return 1;
        }
        this.f12037b = bVar;
        m14117a((Activity) this.f12036a.get(), str2, str3);
        return 1;
    }
}
