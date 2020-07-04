package com.p280ss.android.ugc.aweme.video.p1700d;

import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.video.C43268o;
import com.p280ss.android.ugc.aweme.video.C43316v;
import com.p280ss.android.ugc.aweme.video.experiment.BreakResumeCheckExperiment;
import com.p280ss.android.ugc.aweme.video.experiment.ForceRequestValidationExperiment;
import com.p280ss.android.ugc.aweme.video.experiment.PlayLinkSelectExperiment;
import com.p280ss.android.ugc.aweme.video.experiment.UseTTNetExperiment;
import com.p280ss.android.ugc.aweme.video.experiment.UseVideoCacheHttpDnsExperiment;
import com.toutiao.proxyserver.C46534r;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.video.d.c */
public final class C43208c {
    /* renamed from: d */
    private static boolean m137006d() {
        return C43206a.m136997a();
    }

    /* renamed from: e */
    private static boolean m137007e() {
        return C6384b.m19835a().mo15292a(UseVideoCacheHttpDnsExperiment.class, true, "use_video_cache_http_dns", C6384b.m19835a().mo15295d().use_video_cache_http_dns, false);
    }

    /* renamed from: a */
    public static boolean m137003a() {
        if (C6399b.m19944t()) {
            return true;
        }
        return C6384b.m19835a().mo15292a(BreakResumeCheckExperiment.class, true, "is_break_resume_check_enabled", C6384b.m19835a().mo15295d().is_break_resume_check_enabled, true);
    }

    /* renamed from: b */
    public static boolean m137004b() {
        if (C6399b.m19944t()) {
            return false;
        }
        return C6384b.m19835a().mo15292a(ForceRequestValidationExperiment.class, true, "is_force_request_validation", C6384b.m19835a().mo15295d().is_force_request_validation, false);
    }

    /* renamed from: c */
    public static boolean m137005c() {
        if (C6399b.m19944t()) {
            return true;
        }
        return C6384b.m19835a().mo15292a(PlayLinkSelectExperiment.class, true, "is_play_link_select_enabled", C6384b.m19835a().mo15295d().is_play_link_select_enabled, true);
    }

    /* renamed from: a */
    public static C6869c m137001a(C6869c cVar) {
        if (cVar == null) {
            cVar = C6869c.m21381a();
        }
        cVar.mo16887a("playerType", C43316v.m137451L().mo104901a().toString());
        cVar.mo16887a("from", "PlayerCommonParamManager");
        cVar.mo16882a("is_break_resume_check_enabled", Boolean.valueOf(m137003a()));
        cVar.mo16882a("is_force_request_validation", Boolean.valueOf(m137004b()));
        cVar.mo16882a("is_play_link_select_enabled", Boolean.valueOf(m137005c()));
        cVar.mo16882a("is_preload_enabled", Boolean.valueOf(m137006d()));
        cVar.mo16882a("need_pre_load_in_settings", (Boolean) SharePrefCache.inst().getVideoPreload().mo59877d());
        cVar.mo16885a("weak_net_pre_load_switch_in_settings", (Integer) SharePrefCache.inst().getWeakNetPreLoadSwitch().mo59877d());
        cVar.mo16882a("use_video_cache_http_dns", Boolean.valueOf(m137007e()));
        cVar.mo16882a("video_cache_use_ttnet", Boolean.valueOf(C46534r.f119902i));
        cVar.mo16885a("multi_player", Integer.valueOf(C43268o.f112004a ? 1 : 0));
        return cVar;
    }

    /* renamed from: a */
    public static JSONObject m137002a(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        jSONObject.put("playerType", C43316v.m137451L().mo104901a().toString());
        jSONObject.put("from", "PlayerCommonParamManager");
        jSONObject.put("is_break_resume_check_enabled", m137003a());
        jSONObject.put("is_force_request_validation", m137004b());
        jSONObject.put("is_play_link_select_enabled", m137005c());
        jSONObject.put("is_preload_enabled", m137006d());
        jSONObject.put("need_pre_load_in_settings", SharePrefCache.inst().getVideoPreload().mo59877d());
        jSONObject.put("weak_net_pre_load_switch_in_settings", SharePrefCache.inst().getWeakNetPreLoadSwitch().mo59877d());
        String str = "video_cache_use_ttnet";
        boolean z = true;
        if (C6384b.m19835a().mo15287a(UseTTNetExperiment.class, true, "use_ttnet", C6384b.m19835a().mo15295d().use_ttnet, 0) != 1) {
            z = false;
        }
        jSONObject.put(str, z);
        jSONObject.put("multi_player", C43268o.f112004a ? 1 : 0);
        return jSONObject;
    }
}
