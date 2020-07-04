package com.p280ss.android.ugc.aweme.services.interceptor;

import android.app.Activity;
import android.support.p022v4.util.ArrayMap;
import android.text.TextUtils;
import com.bytedance.sdk.account.p645a.C12728d;
import com.bytedance.sdk.account.p645a.p646a.C12710e;
import com.bytedance.sdk.account.p660d.C12798d;
import com.bytedance.sdk.account.p662f.p663a.C12833p;
import com.bytedance.sdk.account.p662f.p664b.p665a.C12852m;
import com.p280ss.android.ugc.aweme.C21671bd;
import com.p280ss.android.ugc.aweme.account.C21169e;
import com.p280ss.android.ugc.aweme.account.log.C21252c;
import com.p280ss.android.ugc.aweme.account.login.loginlog.C21558a;
import com.p280ss.android.ugc.aweme.account.login.p975v2.p977ui.C22054e;
import com.p280ss.android.ugc.aweme.account.login.p975v2.p977ui.C22054e.C22055a;
import com.p280ss.android.ugc.aweme.main.p1385g.C33023i;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.services.interceptor.PicCaptchaInterceptor */
public class PicCaptchaInterceptor implements IInterceptor {
    private static final boolean DEBUG = C7163a.m22363a();
    public C12728d mAccountApi;
    public CountDownLatch mCounter = new CountDownLatch(1);
    public ArrayMap<String, String> mNewParams;
    public URL mURL;

    /* renamed from: com.ss.android.ugc.aweme.services.interceptor.PicCaptchaInterceptor$InterceptorCaptchaData */
    public static class InterceptorCaptchaData {
        public String captcha;
        public String errorMsg;
        public String scenario;

        public InterceptorCaptchaData(String str, String str2, String str3) {
            this.captcha = str;
            this.errorMsg = str2;
            this.scenario = str3;
        }
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void lambda$showCaptchaAndReleaseLockIfNeeded$0$PicCaptchaInterceptor() {
        this.mCounter.countDown();
    }

    public void showCaptchaAndReleaseLockIfNeeded(InterceptorCaptchaData interceptorCaptchaData) {
        C21252c.m71532a(interceptorCaptchaData.captcha, interceptorCaptchaData.scenario, interceptorCaptchaData.errorMsg);
        this.mAccountApi = C12798d.m37186a(C21671bd.m72532b());
        final C22054e eVar = new C22054e(((C33023i) C21671bd.m72521a(C33023i.class)).mo60020b());
        eVar.mo58409a(interceptorCaptchaData);
        eVar.f58980b = new PicCaptchaInterceptor$$Lambda$0(this);
        eVar.f58979a = new C22055a() {
            public void onRefreshCaptcha() {
                eVar.dismiss();
                C21252c.m71533b();
                PicCaptchaInterceptor.this.mAccountApi.mo31177a(C21169e.f56936u, (C12852m) new C12852m() {
                    public void onSuccess(C12710e<C12833p> eVar) {
                        String str;
                        if (eVar != null && eVar.f33709g != null && !TextUtils.isEmpty(((C12833p) eVar.f33709g).f33986a)) {
                            C21252c.m71534b(((C12833p) eVar.f33709g).f33986a, String.valueOf(((C12833p) eVar.f33709g).f33970r));
                            PicCaptchaInterceptor picCaptchaInterceptor = PicCaptchaInterceptor.this;
                            String str2 = ((C12833p) eVar.f33709g).f33986a;
                            if (PicCaptchaInterceptor.this.mURL == null) {
                                str = "";
                            } else {
                                str = PicCaptchaInterceptor.this.mURL.getPath();
                            }
                            picCaptchaInterceptor.showCaptchaAndReleaseLockIfNeeded(new InterceptorCaptchaData(str2, null, str));
                        }
                    }

                    public void onNeedCaptcha(C12710e<C12833p> eVar, String str) {
                        PicCaptchaInterceptor.this.mCounter.countDown();
                    }

                    public void onError(C12710e<C12833p> eVar, int i) {
                        C21252c.m71535c(String.valueOf(eVar.f33702b), eVar.f33703c);
                        PicCaptchaInterceptor.this.mCounter.countDown();
                    }
                });
            }

            public void onOk(String str, String str2) {
                C21558a.m72263a().mo57697a("", "", false, "send_voice_code", "", "注册图片验证码");
                C21252c.m71531a(str, str2);
                PicCaptchaInterceptor.this.mNewParams.put("captcha", str);
                PicCaptchaInterceptor.this.mCounter.countDown();
                eVar.dismiss();
            }
        };
        eVar.mo58405a();
    }

    private static InterceptorCaptchaData parseCaptchaData(URL url, JSONObject jSONObject) {
        String str;
        try {
            String string = jSONObject.getString("captcha");
            String string2 = jSONObject.getString("description");
            if (url == null) {
                str = "";
            } else {
                str = url.getPath();
            }
            return new InterceptorCaptchaData(string, string2, str);
        } catch (JSONException unused) {
            return null;
        }
    }

    public Map<String, String> tryToIntercept(String str, String str2, int i) {
        this.mNewParams = new ArrayMap<>();
        try {
            try {
                JSONObject jSONObject = new JSONObject(str2).getJSONObject("data");
                try {
                    this.mURL = new URL(str);
                } catch (MalformedURLException unused) {
                }
                final InterceptorCaptchaData parseCaptchaData = parseCaptchaData(this.mURL, jSONObject);
                if (parseCaptchaData == null) {
                    return this.mNewParams;
                }
                Activity b = ((C33023i) C21671bd.m72521a(C33023i.class)).mo60020b();
                if (b == null) {
                    return this.mNewParams;
                }
                b.runOnUiThread(new Runnable() {
                    public void run() {
                        PicCaptchaInterceptor.this.showCaptchaAndReleaseLockIfNeeded(parseCaptchaData);
                    }
                });
                try {
                    this.mCounter.await();
                } catch (InterruptedException unused2) {
                }
                return this.mNewParams;
            } catch (JSONException unused3) {
                return this.mNewParams;
            }
        } catch (JSONException unused4) {
            return this.mNewParams;
        }
    }
}
