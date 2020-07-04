package com.p280ss.android.ugc.aweme.p1216fe.method;

import android.app.Activity;
import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.Lifecycle.Event;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6405d;
import com.facebook.react.bridge.ReactContext;
import com.p280ss.android.ugc.aweme.base.p1059d.p1060a.C23322e;
import com.p280ss.android.ugc.aweme.base.p1063g.C23345c;
import com.p280ss.android.ugc.aweme.crossplatform.business.C25864j;
import com.p280ss.android.ugc.aweme.p1070bb.C23524a;
import com.p280ss.android.ugc.aweme.p1070bb.p1071a.C23525a;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod.C27876a;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.utils.C43025ct;
import com.p280ss.android.ugc.aweme.zhima.C43583a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.lang.ref.WeakReference;
import java.net.URLEncoder;
import java.util.concurrent.Callable;
import org.greenrobot.eventbus.C7709l;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.fe.method.ZhimaMethod */
public class ZhimaMethod extends BaseCommonJavaMethod {

    /* renamed from: a */
    WeakReference<Context> f73607a;

    /* renamed from: b */
    public String f73608b = "";

    /* renamed from: c */
    public Boolean f73609c = Boolean.valueOf(false);

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ String mo71374c() throws Exception {
        if (!this.f73609c.booleanValue()) {
            return C23525a.m77283a(this.f73608b);
        }
        return "";
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final /* synthetic */ Boolean mo71412d() throws Exception {
        return Boolean.valueOf(C43583a.m138109a((Context) this.f73607a.get()));
    }

    @C7709l
    public void onVerifyEvent(C23524a aVar) {
        C1592h.m7853a((Callable<TResult>) new C28015t<TResult>(this)).mo6876a((C1591g<TResult, TContinuationResult>) new C28016u<TResult,TContinuationResult>(this), C1592h.f5958b);
        C42961az.m136383d(this);
    }

    /* renamed from: a */
    private void m91496a(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("type", "zmCert");
            jSONObject2.put("args", jSONObject);
            mo71359a("H5_nativeEvent", jSONObject2, 3);
        } catch (JSONException unused) {
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Void mo71411a(C1592h hVar) throws Exception {
        if (hVar.mo6882b()) {
            m91496a(m91495a(1, (String) hVar.mo6890e()));
        } else {
            m91496a(m91495a(0, ""));
        }
        return null;
    }

    public ZhimaMethod(WeakReference<Context> weakReference, ReactContext reactContext) {
        super(reactContext);
        this.f73607a = weakReference;
    }

    /* renamed from: a */
    private static JSONObject m91495a(int i, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("code", i);
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("_raw", str);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* renamed from: a */
    public final void mo64209a(JSONObject jSONObject, final C27876a aVar) {
        Context context = (Context) this.f73607a.get();
        if (context != null) {
            String optString = jSONObject.optString("url");
            this.f73608b = jSONObject.optString("biz_no");
            this.f73609c = Boolean.valueOf(jSONObject.optBoolean("skip_query"));
            if (context instanceof C0043i) {
                final Lifecycle lifecycle = ((C0043i) context).getLifecycle();
                lifecycle.mo55a(new C0042h() {
                    @C0054q(mo125a = Event.ON_RESUME)
                    public void onResume() {
                        new C43025ct(new C23322e<String>() {
                            /* access modifiers changed from: private */
                            /* renamed from: b */
                            public String mo60608a() throws Exception {
                                if (!ZhimaMethod.this.f73609c.booleanValue()) {
                                    return C23525a.m77283a(ZhimaMethod.this.f73608b);
                                }
                                return null;
                            }
                        }, new C23345c<String>() {
                            /* access modifiers changed from: private */
                            /* renamed from: a */
                            public void mo60643a(String str) {
                                aVar.mo71363a((Object) str);
                            }

                            /* renamed from: a */
                            public final void mo60642a(Exception exc) {
                                aVar.mo71362a(0, "error");
                            }
                        }).mo104701a();
                        lifecycle.mo56b(this);
                    }
                });
            }
            if (TextUtils.isEmpty(optString)) {
                m91496a(m91495a(0, ""));
                return;
            }
            C1592h.m7853a((Callable<TResult>) new C28013r<TResult>(this)).mo6876a((C1591g<TResult, TContinuationResult>) new C28014s<TResult,TContinuationResult>(this, optString, context), C1592h.f5958b);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Object mo71410a(String str, Context context, C1592h hVar) throws Exception {
        if (!hVar.mo6882b() || !((Boolean) hVar.mo6890e()).booleanValue()) {
            C10761a.m31410e(context, context.getString(R.string.cuz)).mo25750a();
        } else {
            Intent intent = new Intent("android.intent.action.VIEW");
            StringBuilder sb = new StringBuilder();
            sb.append("alipays://platformapi/startapp?appId=20000067&url=");
            sb.append(URLEncoder.encode(str));
            intent.setData(Uri.parse(sb.toString()));
            context.startActivity(intent);
            C42961az.m136382c(this);
            Activity g = C6405d.m19984g();
            if (g instanceof C25864j) {
                ((C25864j) g).mo67101a().mo67233a(true);
            }
        }
        return null;
    }
}
