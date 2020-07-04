package com.p280ss.android.ugc.aweme.captcha.api;

import com.alibaba.fastjson.JSON;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.retrofit2.p264b.C6450ac;
import com.bytedance.retrofit2.p264b.C6455f;
import com.bytedance.retrofit2.p264b.C6456g;
import com.bytedance.retrofit2.p264b.C6457h;
import com.bytedance.retrofit2.p264b.C6461l;
import com.bytedance.retrofit2.p264b.C6468s;
import com.bytedance.retrofit2.p637a.C12461b;
import com.google.common.util.concurrent.C18253l;
import com.p280ss.android.common.util.C19290j;
import com.p280ss.android.http.legacy.p296a.C19565e;
import com.p280ss.android.p284b.C19223b;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException;
import com.p280ss.android.ugc.aweme.base.utils.C23477d;
import com.p280ss.android.ugc.aweme.captcha.p1078a.C23630c;
import com.p280ss.android.ugc.aweme.captcha.p1078a.C23633e;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.services.ApiMonitorService;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.captcha.api.VerifyCaptchaApi */
public final class VerifyCaptchaApi {

    /* renamed from: a */
    private static VerifyApi f62333a;

    /* renamed from: com.ss.android.ugc.aweme.captcha.api.VerifyCaptchaApi$VerifyApi */
    interface VerifyApi {
        @C6457h
        C18253l<String> doGet(@C6450ac String str);

        @C6457h
        C18253l<String> doGet(@C6450ac String str, @C6461l List<C12461b> list);

        @C6456g
        @C6468s
        C18253l<String> doPost(@C6450ac String str, @C6455f Map<String, String> map);
    }

    /* renamed from: a */
    public static C23630c m77528a(Boolean bool) throws Exception {
        C19290j jVar = new C19290j("https://api2.musical.ly/ies/antispam/verification_code/get_pic_code/");
        jVar.mo51188a("refresh", String.valueOf(bool));
        if (C23636a.m77531a(AwemeApplication.m21341a())) {
            if (f62333a == null) {
                f62333a = (VerifyApi) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(C19223b.f51890e).mo26430a().mo26435a(VerifyApi.class);
            }
            try {
                return (C23630c) m77530a((String) f62333a.doGet(jVar.toString()).get(), jVar.toString(), C23630c.class);
            } catch (ExecutionException e) {
                throw ((Exception) e.getCause());
            }
        } else {
            throw new IOException();
        }
    }

    /* renamed from: a */
    public static C23633e m77529a(String str) throws Exception {
        ArrayList<C19565e> arrayList = new ArrayList<>();
        arrayList.add(new C19565e("verify_info", str));
        if (C23636a.m77531a(AwemeApplication.m21341a())) {
            if (f62333a == null) {
                f62333a = (VerifyApi) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(C19223b.f51890e).mo26430a().mo26435a(VerifyApi.class);
            }
            HashMap hashMap = new HashMap();
            if (!C23477d.m77081a((Collection<T>) arrayList)) {
                for (C19565e eVar : arrayList) {
                    hashMap.put(eVar.mo51722a(), eVar.mo51723b());
                }
            }
            try {
                return (C23633e) m77530a((String) f62333a.doPost("https://api2.musical.ly/ies/antispam/verification_code/verify_pic_code/", hashMap).get(), "https://api2.musical.ly/ies/antispam/verification_code/verify_pic_code/", C23633e.class);
            } catch (ExecutionException e) {
                throw ((Exception) e.getCause());
            }
        } else {
            throw new IOException();
        }
    }

    /* renamed from: a */
    private static <T> T m77530a(String str, String str2, Class<T> cls) throws JSONException {
        String str3;
        String str4;
        JSONObject jSONObject = new JSONObject(str);
        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
        if (Api.m75216a(jSONObject)) {
            return JSON.parseObject(jSONObject2.toString(), cls);
        }
        ApiMonitorService.Companion.getInstance().apiMonitor(str2, "", str);
        ApiServerException apiServerException = new ApiServerException(jSONObject.optInt("status_code"));
        if (jSONObject2 != null) {
            str3 = jSONObject2.optString("message", "");
        } else {
            str3 = "";
        }
        ApiServerException errorMsg = apiServerException.setErrorMsg(str3).setErrorMsg(jSONObject.optString("status_msg", ""));
        if (jSONObject2 != null) {
            str4 = jSONObject2.optString("prompts", "");
        } else {
            str4 = "";
        }
        throw errorMsg.setPrompt(str4).setUrl(str2);
    }
}
