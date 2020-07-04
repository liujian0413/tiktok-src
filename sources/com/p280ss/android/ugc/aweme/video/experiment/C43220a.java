package com.p280ss.android.ugc.aweme.video.experiment;

import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.video.C43316v;
import com.p280ss.android.ugc.playerkit.model.PlayerConfig.Type;

/* renamed from: com.ss.android.ugc.aweme.video.experiment.a */
public final class C43220a {

    /* renamed from: a */
    private static boolean f111884a;

    /* renamed from: c */
    public static double m137074c() {
        return C6384b.m19835a().mo15286a(BitrateModelThresholdExperiment.class, true, "video_auto_model_threshold", C6384b.m19835a().mo15295d().video_auto_model_threshold, -1.0d);
    }

    /* renamed from: d */
    public static double m137075d() {
        return C6384b.m19835a().mo15286a(BitrateSwitchThresholdExperiment.class, true, "bitrate_switch_threshold", C6384b.m19835a().mo15295d().bitrate_switch_threshold, 0.75d);
    }

    /* renamed from: e */
    public static boolean m137076e() {
        if (C6384b.m19835a().mo15287a(EnableDynamicRateExperiment.class, true, "enable_dynamic_rate", C6384b.m19835a().mo15295d().enable_dynamic_rate, 0) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public static long m137077f() {
        return C6384b.m19835a().mo15288a(VideoCDNUrlTimeoutExperiment.class, true, "cdn_url_timeout_time", C6384b.m19835a().mo15295d().cdn_url_timeout_time, (long) VideoCDNUrlTimeoutExperiment.DEFAULT_TIMEOUT);
    }

    /* renamed from: a */
    public static boolean m137072a() {
        if (!f111884a && C6384b.m19835a().mo15287a(EnablePlayerALogExperiment.class, true, "enable_player_alog", C6384b.m19835a().mo15295d().enable_player_alog, 0) != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static int m137073b() {
        int a = C6384b.m19835a().mo15287a(PreloadTypeExperiment.class, true, "preloader_type", C6384b.m19835a().mo15295d().preloader_type, 0);
        if (!C6399b.m19944t() || a != 1 || C43316v.m137451L().mo104901a() == Type.TT) {
            return a;
        }
        return 0;
    }
}
