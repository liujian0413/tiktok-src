package com.p280ss.android.ugc.aweme.p1216fe.method.commerce;

import android.content.Context;
import android.content.Intent;
import com.bytedance.ies.web.p582a.C11087a;
import com.p280ss.android.ugc.aweme.challenge.p1086ui.header.C23764b;
import com.p280ss.android.ugc.aweme.framework.p1274c.C29956a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod.C27876a;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.utils.C42973bg;
import java.lang.ref.WeakReference;
import java.util.UUID;
import kotlin.jvm.internal.C7571f;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.fe.method.commerce.VideoPublishMethod */
public final class VideoPublishMethod extends BaseCommonJavaMethod {

    /* renamed from: a */
    public static final C27969a f73671a = new C27969a(null);

    /* renamed from: com.ss.android.ugc.aweme.fe.method.commerce.VideoPublishMethod$a */
    public static final class C27969a {
        private C27969a() {
        }

        public /* synthetic */ C27969a(C7571f fVar) {
            this();
        }
    }

    public VideoPublishMethod() {
        this(null, 1, null);
    }

    public VideoPublishMethod(C11087a aVar) {
        super(aVar);
    }

    /* renamed from: a */
    public final void mo64209a(JSONObject jSONObject, C27876a aVar) {
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("code", C29956a.f78751d);
        if (jSONObject != null) {
            String optString = jSONObject.optString("path");
            if (optString != null) {
                boolean a = C23764b.m77913a(optString);
                if (!a) {
                    jSONObject2.put("reason", "path should not be empty");
                }
                Context context = null;
                if (!a) {
                    optString = null;
                }
                if (optString != null) {
                    boolean a2 = C42973bg.m136427a(optString);
                    if (!a2) {
                        jSONObject2.put("reason", "file doesn't exists");
                    }
                    if (!a2) {
                        optString = null;
                    }
                    if (optString != null) {
                        IAVService iAVService = (IAVService) ServiceManager.get().getService(IAVService.class);
                        WeakReference weakReference = this.f73443f;
                        if (weakReference != null) {
                            context = (Context) weakReference.get();
                        }
                        Intent intent = new Intent();
                        intent.putExtra("file_path", optString);
                        intent.putExtra("cc_vid", jSONObject.optString("vid"));
                        intent.putExtra("creation_id", UUID.randomUUID().toString());
                        intent.putExtra("edit_publish_session_end_together", true);
                        intent.putExtra("shoot_way", "enterprise_service_center");
                        iAVService.startCutMultiVideoActivity(context, intent);
                        jSONObject2.put("code", C29956a.f78750c);
                    }
                }
            }
        }
        aVar.mo71365a(jSONObject2);
    }

    private /* synthetic */ VideoPublishMethod(C11087a aVar, int i, C7571f fVar) {
        this(null);
    }
}
