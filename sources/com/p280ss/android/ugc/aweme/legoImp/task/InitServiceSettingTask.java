package com.p280ss.android.ugc.aweme.legoImp.task;

import com.p280ss.android.ugc.aweme.app.C23060u;
import com.p280ss.android.ugc.aweme.festival.christmas.C29132a;
import com.p280ss.android.ugc.aweme.festival.p311a.C29121a;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.InitServiceSettingTask */
public final class InitServiceSettingTask extends BaseInitServiceSettingTask {
    /* access modifiers changed from: protected */
    public final void handleConfig(JSONObject jSONObject) {
        super.handleConfig(jSONObject);
        if (jSONObject != null) {
            JSONObject optJSONObject = jSONObject.optJSONObject("aweme_activity_setting");
            if (optJSONObject != null) {
                C29132a.m95559a(optJSONObject);
                C23060u a = C23060u.m75742a();
                C7573i.m23582a((Object) a, "CommonSharePrefCache.inst()");
                a.mo60054X().mo59871a(optJSONObject.toString());
                C42961az.m136380a(new C29121a());
            } else {
                C23060u a2 = C23060u.m75742a();
                C7573i.m23582a((Object) a2, "CommonSharePrefCache.inst()");
                a2.mo60054X().mo59871a("");
            }
        }
    }
}
