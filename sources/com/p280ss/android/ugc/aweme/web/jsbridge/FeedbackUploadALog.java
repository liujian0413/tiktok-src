package com.p280ss.android.ugc.aweme.web.jsbridge;

import android.text.TextUtils;
import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.ies.web.p582a.C11087a;
import com.p280ss.android.ugc.aweme.feedback.C29081i;
import com.p280ss.android.ugc.aweme.feedback.runtime.behavior.C29096c;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.p1076c.p1077a.C23623a;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod.C27876a;
import com.p280ss.android.ugc.aweme.services.IAVService;
import java.util.Map.Entry;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.web.jsbridge.FeedbackUploadALog */
public class FeedbackUploadALog extends BaseCommonJavaMethod {
    public FeedbackUploadALog() {
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public JSONObject mo71374c() {
        JSONObject jSONObject = new JSONObject();
        m137903a(jSONObject);
        if (((IAVService) ServiceManager.get().getService(IAVService.class)).avSettingsService().enableFeedbackLog()) {
            try {
                String a = C29081i.m95422a();
                if (!TextUtils.isEmpty(a)) {
                    jSONObject.put("aweme_infra_log", a);
                }
            } catch (Exception unused) {
            }
        }
        return jSONObject;
    }

    public FeedbackUploadALog(C11087a aVar) {
        super(aVar);
    }

    /* renamed from: a */
    private static void m137903a(JSONObject jSONObject) {
        if (C29096c.m95445b()) {
            for (Entry entry : C29096c.m95443a().entrySet()) {
                try {
                    jSONObject.put((String) entry.getKey(), (String) entry.getValue());
                } catch (JSONException unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo64209a(JSONObject jSONObject, C27876a aVar) {
        C1592h.m7855a((Callable<TResult>) new C43515m<TResult>(this), (Executor) C1592h.f5957a).mo6876a((C1591g<TResult, TContinuationResult>) new C43516n<TResult,TContinuationResult>(aVar), C1592h.f5958b);
        C23623a.m77524a();
    }
}
