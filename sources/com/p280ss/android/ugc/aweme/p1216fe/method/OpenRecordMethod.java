package com.p280ss.android.ugc.aweme.p1216fe.method;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.react.bridge.ReactContext;
import com.google.common.util.concurrent.C18245g;
import com.google.common.util.concurrent.C18246h;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.C23364n;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.discover.hitrank.C26678c;
import com.p280ss.android.ugc.aweme.discover.model.NationalTask;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.nationaltask.api.NationalTaskApi;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod.C27876a;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseOpenMethod;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.shortvideo.p1588r.C40251d;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.fe.method.OpenRecordMethod */
public class OpenRecordMethod extends BaseOpenMethod {

    /* renamed from: b */
    public String f73519b;

    /* renamed from: a */
    public static void m91428a(String str) {
        C6907h.m21524a("shoot", (Map) C22984d.m75611a().mo59973a("task_id", str).mo59973a("shoot_way", "task_platform").mo59973a("creation_id", UUID.randomUUID().toString()).f60753a);
    }

    public OpenRecordMethod(WeakReference<Context> weakReference, ReactContext reactContext) {
        super(weakReference, reactContext);
        this.f73450a = weakReference;
    }

    /* renamed from: a */
    public final void mo64209a(final JSONObject jSONObject, final C27876a aVar) {
        JSONObject jSONObject2;
        try {
            String string = jSONObject.getString("type");
            if (TextUtils.equals("goods_order_share", string)) {
                C27997n.m91597a(jSONObject, this.f73450a);
                return;
            }
            jSONObject.put("type", "openRecord");
            if (jSONObject.has("args")) {
                jSONObject2 = jSONObject.getJSONObject("args");
                jSONObject2.put("recordOrigin", "jsBridge");
            } else {
                jSONObject2 = null;
            }
            if (!"default".equals(string)) {
                if (TextUtils.equals("challenge", string)) {
                    jSONObject2.put("id", jSONObject2.optString("challenge_id"));
                    jSONObject2.put("recordParam", "challenge");
                    if (TextUtils.equals(jSONObject2.optString("from"), "star_board")) {
                        C26678c.m87650b(jSONObject2.optString("star_id"));
                        C26678c.m87651b(true);
                    }
                } else if ("music".equals(string)) {
                    jSONObject2.put("id", jSONObject2.get("music_id"));
                    jSONObject2.put("recordParam", "music");
                } else if ("effect".equals(string)) {
                    jSONObject2.put("id", jSONObject2.get("effect_id"));
                    jSONObject2.put("recordParam", "sticker");
                    if (TextUtils.equals(jSONObject2.optString("from"), "star_board")) {
                        C26678c.m87648a(true);
                        C26678c.m87650b(jSONObject2.optString("star_id"));
                    }
                } else if ("task".equals(string)) {
                    jSONObject2.put("id", jSONObject2.get("task_id"));
                    jSONObject2.put("shoot_way", jSONObject2.get("shoot_way"));
                    this.f73519b = jSONObject2.getString("task_id");
                }
            }
            jSONObject2.put("group", "1");
            if ("task".equals(string)) {
                C18246h.m60214a(NationalTaskApi.m109601a().getNationalTask(jSONObject2.getString("task_id")), (C18245g<? super V>) new C18245g<NationalTask>() {
                    public final void onFailure(Throwable th) {
                    }

                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public void onSuccess(NationalTask nationalTask) {
                        if (nationalTask != null) {
                            ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().addNationalTask(C40251d.m128601a(nationalTask));
                            OpenRecordMethod.m91428a(OpenRecordMethod.this.f73519b);
                            OpenRecordMethod.this.mo71366a(jSONObject);
                            aVar.mo71363a((Object) null);
                        }
                    }
                }, (Executor) C23364n.f61448a);
                return;
            }
            mo71366a(jSONObject);
            aVar.mo71363a((Object) null);
        } catch (Exception unused) {
            aVar.mo71362a(-1, "");
        }
    }
}
