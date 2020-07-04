package com.p280ss.android.ugc.aweme.player.p1456a;

import android.app.Activity;
import android.content.Context;
import android.os.Build.VERSION;
import android.text.TextUtils;
import bolts.C1592h;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.frameworks.baselib.network.http.cronet.impl.C10123a;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ttnet.C12961d;
import com.google.gson.C6607f;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.app.C6877n;
import com.p280ss.android.ugc.aweme.audio.AudioUtils;
import com.p280ss.android.ugc.aweme.awemeservice.api.IRequestIdService;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.experiment.CellInfoEnableExperiment;
import com.p280ss.android.ugc.aweme.feed.adapter.C28130ac;
import com.p280ss.android.ugc.aweme.feed.cache.C28275c;
import com.p280ss.android.ugc.aweme.feed.helper.C28416d;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.BitRate;
import com.p280ss.android.ugc.aweme.feed.model.BitRate.ExcludeStrategy;
import com.p280ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.p280ss.android.ugc.aweme.feed.p1227c.C28250k;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28478a;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28481d;
import com.p280ss.android.ugc.aweme.feed.panel.C28648x;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.image.C32042i;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.p332ml.C7173g;
import com.p280ss.android.ugc.aweme.p332ml.C7174p;
import com.p280ss.android.ugc.aweme.p932aa.C21097b;
import com.p280ss.android.ugc.aweme.player.C34938a;
import com.p280ss.android.ugc.aweme.player.p1457b.C34960a;
import com.p280ss.android.ugc.aweme.setting.C37653j;
import com.p280ss.android.ugc.aweme.setting.model.MLModel;
import com.p280ss.android.ugc.aweme.utils.C42931ao;
import com.p280ss.android.ugc.aweme.utils.C42941at;
import com.p280ss.android.ugc.aweme.utils.C43048db;
import com.p280ss.android.ugc.aweme.utils.OneTimeEnum;
import com.p280ss.android.ugc.aweme.video.C43221f;
import com.p280ss.android.ugc.aweme.video.C43240l;
import com.p280ss.android.ugc.aweme.video.C43264m;
import com.p280ss.android.ugc.aweme.video.C43316v;
import com.p280ss.android.ugc.aweme.video.experiment.C43220a;
import com.p280ss.android.ugc.aweme.video.p1701e.C43216b;
import com.p280ss.android.ugc.aweme.video.preload.C43273d;
import com.p280ss.android.ugc.aweme.video.preload.C43305j;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.p280ss.android.ugc.lib.video.bitrate.regulator.p1746a.C44863c;
import com.p280ss.android.ugc.lib.video.bitrate.regulator.p1746a.C44866f;
import com.p280ss.android.ugc.networkspeed.C44903d;
import com.p280ss.android.ugc.playerkit.model.C44917a;
import com.p280ss.android.ugc.playerkit.model.C44921e;
import com.p280ss.android.ugc.playerkit.session.C44925a;
import com.p280ss.android.ugc.playerkit.session.Session;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.player.a.e */
public final class C34950e {

    /* renamed from: a */
    public VideoUrlModel f91181a;

    /* renamed from: b */
    public C28130ac f91182b;

    /* renamed from: c */
    public String f91183c;

    /* renamed from: d */
    public int f91184d;

    /* renamed from: e */
    public C28250k f91185e;

    /* renamed from: f */
    public C28648x f91186f;

    /* renamed from: g */
    public C44921e f91187g;

    /* renamed from: h */
    public int f91188h;

    /* renamed from: i */
    public Activity f91189i;

    /* renamed from: j */
    public Context f91190j;

    /* renamed from: k */
    public C43216b f91191k;

    /* renamed from: l */
    public C28416d f91192l;

    /* renamed from: com.ss.android.ugc.aweme.player.a.e$a */
    public static class C34953a {

        /* renamed from: a */
        public C34950e f91203a = new C34950e();

        /* renamed from: a */
        public final C34953a mo88536a(String str) {
            this.f91203a.f91183c = str;
            return this;
        }

        /* renamed from: a */
        public final C34953a mo88535a(C44921e eVar) {
            this.f91203a.f91187g = eVar;
            return this;
        }

        /* renamed from: a */
        public final C34953a mo88526a(int i) {
            this.f91203a.f91184d = i;
            return this;
        }

        /* renamed from: b */
        public final C34953a mo88537b(int i) {
            this.f91203a.f91188h = i;
            return this;
        }

        /* renamed from: a */
        public final C34953a mo88527a(Activity activity) {
            this.f91203a.f91189i = activity;
            return this;
        }

        /* renamed from: a */
        public final C34953a mo88528a(Context context) {
            this.f91203a.f91190j = context;
            return this;
        }

        /* renamed from: a */
        public final C34953a mo88529a(C28130ac acVar) {
            this.f91203a.f91182b = acVar;
            return this;
        }

        /* renamed from: a */
        public final C34953a mo88530a(C28250k kVar) {
            this.f91203a.f91185e = kVar;
            return this;
        }

        /* renamed from: a */
        public final C34953a mo88531a(C28416d dVar) {
            this.f91203a.f91192l = dVar;
            return this;
        }

        /* renamed from: a */
        public final C34953a mo88532a(VideoUrlModel videoUrlModel) {
            this.f91203a.f91181a = videoUrlModel;
            return this;
        }

        /* renamed from: a */
        public final C34953a mo88533a(C28648x xVar) {
            this.f91203a.f91186f = xVar;
            return this;
        }

        /* renamed from: a */
        public final C34953a mo88534a(C43216b bVar) {
            this.f91203a.f91191k = bVar;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.player.a.e$b */
    public static class C34954b {

        /* renamed from: a */
        public boolean f91204a;

        /* renamed from: b */
        public Long f91205b;
    }

    /* renamed from: b */
    public static int m112628b() {
        C43273d d = C43305j.m137386g().mo105032d();
        if (d == null || d.f112006a == 0 || d.f112007b == 0) {
            return 0;
        }
        return (((int) (d.f112007b / d.f112006a)) * 1000) / PreloadTask.BYTE_UNIT_NUMBER;
    }

    /* renamed from: a */
    public final void mo88522a() {
        if (this.f91190j != null && this.f91187g != null && this.f91182b != null && this.f91181a != null) {
            m112625a(this.f91190j, this.f91182b, this.f91188h, this.f91185e, this.f91183c, this.f91187g, this.f91181a, this.f91192l);
        }
    }

    /* renamed from: a */
    public static String m112624a(String str, int i) {
        if (!TextUtils.isEmpty(str) && str.length() > 50) {
            return str.substring(0, 49);
        }
        return str;
    }

    /* renamed from: a */
    public static void m112626a(C34960a aVar, JSONObject jSONObject) {
        if (jSONObject != null && aVar != null) {
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("cell_id", aVar.f91246a);
                jSONObject2.put("snr", aVar.f91248c);
                jSONObject2.put("rsrp", aVar.f91247b);
                jSONObject2.put("lac", aVar.f91249d);
                jSONArray.put(jSONObject2);
                jSONObject.put("cell_infos", jSONArray);
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m112627a(JSONObject jSONObject, VideoUrlModel videoUrlModel) {
        try {
            int j = (int) ((((float) C43305j.m137386g().mo105092j(videoUrlModel)) * 100.0f) / ((float) C43305j.m137386g().mo105090i(videoUrlModel)));
            jSONObject.put("video_size", C43305j.m137386g().mo105090i(videoUrlModel));
            jSONObject.put("preload_percent", j);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final void mo88523a(C28130ac acVar, JSONObject jSONObject, VideoUrlModel videoUrlModel) {
        boolean z;
        C43216b bVar = this.f91191k;
        if (bVar != null) {
            try {
                boolean z2 = false;
                if (jSONObject.has("is_h265")) {
                    if (jSONObject.getInt("is_h265") == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    bVar.mo104883b(z);
                }
                if (jSONObject.has("group_id")) {
                    bVar.mo104886c(jSONObject.getString("group_id"));
                }
                if (jSONObject.has("dash_videoid")) {
                    bVar.mo104876a(jSONObject.getString("dash_videoid"));
                }
                bVar.mo104882b(videoUrlModel.getBitRatedRatioUri());
                if (jSONObject.has("is_h265")) {
                    if (jSONObject.getInt("is_h265") == 1) {
                        z2 = true;
                    }
                    bVar.mo104883b(z2);
                }
                if (jSONObject.has("speed_model_path")) {
                    bVar.mo104891e(jSONObject.getString("speed_model_path"));
                }
                bVar.mo104881b((long) jSONObject.getInt("duration"));
                bVar.mo104890e(jSONObject.getInt("internet_speed"));
                if (jSONObject.has("video_bitrate")) {
                    bVar.mo104888d(jSONObject.getInt("video_bitrate"));
                }
                if (jSONObject.has("play_bitrate")) {
                    bVar.mo104872a((float) jSONObject.getDouble("play_bitrate"));
                }
                if (jSONObject.has("calc_bitrate")) {
                    bVar.mo104879b((float) jSONObject.getDouble("calc_bitrate"));
                }
                if (jSONObject.opt("bitrate_set") != null) {
                    bVar.mo104875a(jSONObject.get("bitrate_set"));
                }
                if (jSONObject.opt("current_url") != null) {
                    bVar.mo104889d(jSONObject.getString("current_url"));
                }
                if (jSONObject.opt("is_surfaceview") != null) {
                    bVar.mo104892f(jSONObject.getInt("is_surfaceview"));
                }
                if (jSONObject.opt("pt_predict") != null) {
                    bVar.mo104871a(jSONObject.getDouble("pt_predict"));
                }
                if (jSONObject.opt("pt_predictL") != null) {
                    bVar.mo104893f(jSONObject.getString("pt_predictL"));
                }
                bVar.mo104884c(C43305j.m137386g().mo105092j(videoUrlModel));
                bVar.mo104885c(C43305j.m137386g().mo105090i(videoUrlModel));
                bVar.mo104887c(C43316v.m137451L().mo104911j());
                bVar.mo104877a(true);
                C1592h.m7855a((Callable<TResult>) new Callable<Object>() {
                    public final Object call() throws Exception {
                        if (!(C34950e.this.f91186f == null || C34950e.this.f91186f.mo71886W() == null)) {
                            C34950e.this.f91186f.mo71886W().notifyDataSetChanged();
                        }
                        return null;
                    }
                }, C1592h.f5958b);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    private void m112625a(Context context, C28130ac acVar, int i, C28250k kVar, String str, C44921e eVar, VideoUrlModel videoUrlModel, C28416d dVar) {
        final C28130ac acVar2 = acVar;
        final int i2 = i;
        final C28250k kVar2 = kVar;
        final String str2 = str;
        final C44921e eVar2 = eVar;
        final VideoUrlModel videoUrlModel2 = videoUrlModel;
        final Context context2 = context;
        final C28416d dVar2 = dVar;
        C349511 r0 = new Callable<Object>() {
            public final Object call() throws Exception {
                JSONObject jSONObject;
                C34954b bVar;
                int i;
                Object obj;
                String str;
                String str2;
                Aweme h = acVar2.mo65711h();
                if (h == null) {
                    jSONObject = new JSONObject();
                } else {
                    try {
                        C43221f L = C43316v.m137451L();
                        JSONObject requestIdAndOrderJsonObject = ((IRequestIdService) ServiceManager.get().getService(IRequestIdService.class)).getRequestIdAndOrderJsonObject(h, i2);
                        JSONObject jSONObject2 = new JSONObject();
                        boolean d = C28275c.m92999d(h.getAid());
                        String m = C33230ac.m107238m(h);
                        requestIdAndOrderJsonObject.put("group_id", m);
                        jSONObject2.put("group_id", m);
                        requestIdAndOrderJsonObject.put("access2", NetworkUtils.m19551e(C6399b.m19921a()));
                        int i2 = 0;
                        if (kVar2 != null) {
                            requestIdAndOrderJsonObject.put("enter_from", kVar2.mo71889a(false));
                            bVar = C34942b.m112592a(kVar2.mo71881R());
                        } else {
                            bVar = null;
                        }
                        if (bVar == null) {
                            bVar = new C34954b();
                            bVar.f91204a = C43048db.m136578a().mo104720a(OneTimeEnum.FIRST_FRAME);
                        }
                        String str3 = "is_first";
                        if (d) {
                            i = -1;
                        } else if (bVar.f91204a) {
                            i = 1;
                        } else {
                            i = 0;
                        }
                        requestIdAndOrderJsonObject.put(str3, i);
                        requestIdAndOrderJsonObject.put("is_from_feed_cache", String.valueOf(d ? 1 : 0));
                        String str4 = "duration";
                        if (!bVar.f91204a || bVar.f91205b == null) {
                            obj = str2;
                        } else {
                            obj = bVar.f91205b;
                        }
                        requestIdAndOrderJsonObject.put(str4, obj);
                        requestIdAndOrderJsonObject.put("pre_cache_size", C34950e.this.f91184d / PreloadTask.BYTE_UNIT_NUMBER);
                        requestIdAndOrderJsonObject.put("is_surfaceview", C44917a.m141692r().mo105103f() ? 1 : 0);
                        requestIdAndOrderJsonObject.put("player_type", L.mo104901a().toString());
                        String str5 = "player_version";
                        if (TextUtils.isEmpty(L.mo104903b())) {
                            str = "";
                        } else {
                            str = L.mo104903b();
                        }
                        requestIdAndOrderJsonObject.put(str5, str);
                        int f = C44903d.m141656f();
                        requestIdAndOrderJsonObject.put("internet_speed", f);
                        jSONObject2.put("internet_speed", f);
                        requestIdAndOrderJsonObject.put("volumn", AudioUtils.m75898b(C6399b.m19921a()));
                        requestIdAndOrderJsonObject.put("multi_player", C43316v.f112004a ? 1 : 0);
                        requestIdAndOrderJsonObject.put("codec_name", L.mo104904c());
                        requestIdAndOrderJsonObject.put("codec_id", L.mo104905d());
                        requestIdAndOrderJsonObject.put("io_rate", String.valueOf(C34950e.m112628b()));
                        String str6 = "cpu_rate";
                        if (C42931ao.m136282a() != null) {
                            str2 = String.valueOf(C42931ao.m136282a());
                        } else {
                            str2 = "-1";
                        }
                        requestIdAndOrderJsonObject.put(str6, str2);
                        requestIdAndOrderJsonObject.put("current_url", C34950e.m112624a(L.mo104906e(), 50));
                        requestIdAndOrderJsonObject.put("video_fps", (double) L.mo104907f());
                        requestIdAndOrderJsonObject.put("is_h265", eVar2.f115533b ? 1 : 0);
                        requestIdAndOrderJsonObject.put("is_ad", C28478a.m93587c(acVar2) ? 1 : 0);
                        requestIdAndOrderJsonObject.put("dash_videoid", videoUrlModel2.getDashVideoId());
                        requestIdAndOrderJsonObject.put("preloader_type", C43220a.m137073b());
                        requestIdAndOrderJsonObject.put("pt_predict", (double) C7174p.m22398a().mo18652e());
                        requestIdAndOrderJsonObject.put("pt_predictL", C7174p.m22398a().mo18651d());
                        Integer a = C28481d.m93602a(videoUrlModel2);
                        requestIdAndOrderJsonObject.put("video_bitrate", a);
                        jSONObject2.put("video_bitrate", a);
                        List bitRate = videoUrlModel2.getBitRate();
                        if (bitRate != null && !bitRate.isEmpty()) {
                            JSONArray jSONArray = new JSONArray(new C6607f().mo15987a(new ExcludeStrategy()).mo15992f().mo15979b((Object) bitRate));
                            requestIdAndOrderJsonObject.put("bitrate_set", jSONArray);
                            jSONObject2.put("bitrate_set", jSONArray);
                        }
                        float h2 = L.mo104909h();
                        double d2 = (double) h2;
                        requestIdAndOrderJsonObject.put("play_bitrate", d2);
                        jSONObject2.put("play_bitrate", d2);
                        if (C43305j.m137386g().mo105024a(videoUrlModel2)) {
                            requestIdAndOrderJsonObject.put("cache_size", C43305j.m137386g().mo105092j(videoUrlModel2) / PreloadTask.BYTE_UNIT_NUMBER);
                        } else {
                            requestIdAndOrderJsonObject.put("cache_size", -1);
                        }
                        requestIdAndOrderJsonObject.put("video_size", String.valueOf(C43305j.m137386g().mo105090i(videoUrlModel2)));
                        float i3 = (float) L.mo104910i();
                        if (i3 <= 0.0f) {
                            i3 = (float) videoUrlModel2.getDuration();
                        }
                        try {
                            C10123a e = C12961d.m37789e();
                            requestIdAndOrderJsonObject.put("tcp_rtt", e.f27564a);
                            requestIdAndOrderJsonObject.put("tcp_bandwith", e.f27566c);
                            requestIdAndOrderJsonObject.put("http_rtt", e.f27565b);
                            requestIdAndOrderJsonObject.put("signal", C43264m.m137242a(C34950e.this.f91189i).mo105015b(context2));
                        } catch (Exception unused) {
                        }
                        requestIdAndOrderJsonObject.put("video_duration", (double) (i3 / 1000.0f));
                        requestIdAndOrderJsonObject.put("video_quality", C28481d.m93603b(videoUrlModel2));
                        requestIdAndOrderJsonObject.put("access", com.p280ss.android.common.util.NetworkUtils.getNetworkType(context2));
                        if (!(C43220a.m137074c() == -1.0d || C7173g.m22395a("auto_bitrate") == null)) {
                            String str7 = C7173g.m22395a("auto_bitrate").packageUrl;
                            if (str7 != null) {
                                String str8 = "model_path";
                                if (str7.length() >= 30) {
                                    str7 = str7.substring(str7.length() - 30);
                                }
                                requestIdAndOrderJsonObject.put(str8, str7);
                            }
                        }
                        MLModel a2 = C6903bc.m21490i().mo85908a();
                        if (a2 != null && !TextUtils.isEmpty(a2.packageUrl)) {
                            String str9 = a2.packageUrl;
                            if (str9 != null) {
                                String str10 = "speed_model_path";
                                if (str9.length() >= 15) {
                                    str9 = str9.substring(str9.length() - 15);
                                }
                                requestIdAndOrderJsonObject.put(str10, str9);
                            }
                        }
                        C44863c hitBitrate = videoUrlModel2.getHitBitrate();
                        if ((hitBitrate instanceof C44866f) && hitBitrate != null) {
                            requestIdAndOrderJsonObject.put("use_model", ((C44866f) hitBitrate).f115382c);
                        }
                        Session b = C44925a.m141730a().mo107408b(videoUrlModel2.getUri());
                        if (b != null && TextUtils.equals(b.sourceId, videoUrlModel2.getSourceId())) {
                            b.playBitrate = h2;
                            b.cacheSize = requestIdAndOrderJsonObject.getInt("cache_size");
                            requestIdAndOrderJsonObject.put("video_bitrate", b.bitrate);
                            jSONObject2.put("video_bitrate", b.bitrate);
                            requestIdAndOrderJsonObject.put("calc_bitrate", b.calcBitrate);
                            jSONObject2.put("calc_bitrate", b.calcBitrate);
                            if (bitRate != null) {
                                while (true) {
                                    if (i2 >= bitRate.size()) {
                                        break;
                                    } else if (((BitRate) bitRate.get(i2)).getBitRate() == b.bitrate) {
                                        requestIdAndOrderJsonObject.put("video_quality", ((BitRate) bitRate.get(i2)).getQualityType());
                                        break;
                                    } else {
                                        i2++;
                                    }
                                }
                            }
                        }
                        boolean a3 = C6384b.m19835a().mo15292a(CellInfoEnableExperiment.class, true, "enable_cellinfo_report", C6384b.m19835a().mo15295d().enable_cellinfo_report, false);
                        if (VERSION.SDK_INT >= 18 && a3) {
                            C34950e.m112626a(C43240l.m137186a(context2).f111942c, requestIdAndOrderJsonObject);
                        }
                        L.mo104902a(jSONObject2.toString());
                        jSONObject = requestIdAndOrderJsonObject;
                    } catch (Exception e2) {
                        C6921a.m21554a(e2);
                        jSONObject = new JSONObject();
                    }
                }
                if (dVar2 != null) {
                    jSONObject.put("image_size", dVar2.f74926a);
                    jSONObject.put("image_download_duration", dVar2.f74927b);
                    if (dVar2.f74928c != 0) {
                        jSONObject.put("image_load_duration", dVar2.f74928c);
                    }
                    if (!TextUtils.isEmpty(dVar2.f74929d)) {
                        jSONObject.put("image_processor_model", dVar2.f74929d);
                    }
                }
                C34950e.this.mo88523a(acVar2, jSONObject, videoUrlModel2);
                C32042i.f83824a.mo83013a(jSONObject);
                jSONObject.put("memory_usage", C42941at.m136320e(context2) / PreloadTask.BYTE_UNIT_NUMBER);
                C6907h.onEvent(MobClick.obtain().setEventName("video_play_quality").setLabelName("perf_monitor").setValue(C34950e.this.f91182b.mo65711h().getAid()).setJsonObject(jSONObject));
                C21097b.m71144a("video_play_quality", jSONObject);
                if (C37653j.m120481c()) {
                    jSONObject.put("traffic_economy_mode", C37653j.f98123a.mo94946d());
                }
                C6907h.m21528b("video_play_quality", jSONObject);
                C34950e.m112627a(jSONObject, C34950e.this.f91181a);
                try {
                    if (C34950e.this.f91186f == null || C34950e.this.f91186f.mo73395br()) {
                        jSONObject.put("enter_method", "slide");
                    } else {
                        jSONObject.put("enter_method", "click");
                    }
                } catch (JSONException unused2) {
                }
                if (C7163a.m22363a()) {
                    C34938a.m112587a("video_play_quality", jSONObject.toString());
                }
                C6877n.m21447a("aweme_video_bitrate_first_frame_log", jSONObject);
                return null;
            }
        };
        C1592h.m7855a((Callable<TResult>) r0, (Executor) C6907h.m21516a());
    }
}
