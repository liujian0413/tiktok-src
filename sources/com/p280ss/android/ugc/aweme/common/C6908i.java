package com.p280ss.android.ugc.aweme.common;

import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.experiment.MuteV1LogExperiment;
import com.p280ss.android.ugc.aweme.lancet.C32279f;
import com.p280ss.android.ugc.aweme.lancet.C32280g;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.common.i */
final class C6908i {
    /* renamed from: a */
    static void m21529a(String str, String str2, String str3, String str4, long j, JSONObject jSONObject) {
        if (C6384b.m19835a().mo15292a(MuteV1LogExperiment.class, true, "mute_v1_log", C6384b.m19835a().mo15295d().mute_v1_log, false)) {
            Set set = (Set) C32279f.f84345a.get(str2);
            if (set != null && set.contains(str3)) {
                return;
            }
        }
        C6907h.m21526b(str, str2, str3, str4, j, jSONObject);
    }

    /* renamed from: a */
    static void m21530a(String str, Map map) {
        if (!C6399b.m19946v() && map != null && C32280g.f84346a.contains(str)) {
            map.put("_staging_flag", "1");
        }
        C6907h.m21527b(str, map);
    }
}
