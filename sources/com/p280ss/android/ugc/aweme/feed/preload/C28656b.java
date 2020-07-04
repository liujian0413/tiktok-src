package com.p280ss.android.ugc.aweme.feed.preload;

import android.text.TextUtils;
import bolts.C1592h;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.common.util.NetworkUtils;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.feed.adapter.FeedPagerAdapter;
import com.p280ss.android.ugc.aweme.feed.experiment.C28344a;
import com.p280ss.android.ugc.aweme.feed.experiment.EnableSpeedMonitorExperiment;
import com.p280ss.android.ugc.aweme.feed.experiment.SmartPreoloadStrategyExperiment;
import com.p280ss.android.ugc.aweme.feed.experiment.SmartPreoloadStrategyV2Experiment;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.Video;
import com.p280ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.p280ss.android.ugc.aweme.p332ml.C7174p;
import com.p280ss.android.ugc.aweme.p932aa.C21097b;
import com.p280ss.android.ugc.aweme.video.C43264m;
import com.p280ss.android.ugc.aweme.video.C43269p;
import com.p280ss.android.ugc.aweme.video.preload.C43305j;
import com.p280ss.android.ugc.aweme.video.preload.experiment.H265PlayAddrPolicyUnifyExperiment;
import com.p280ss.android.ugc.aweme.video.preload.model.C7280a;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadStrategyConfig;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.p280ss.android.ugc.networkspeed.C44903d;
import com.p280ss.android.ugc.networkspeed.C44905e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.feed.preload.b */
public final class C28656b {

    /* renamed from: a */
    private boolean f75500a;

    /* renamed from: b */
    private PreloadStrategyConfig f75501b;

    /* renamed from: c */
    private String f75502c;

    /* renamed from: d */
    private boolean f75503d;

    /* renamed from: e */
    private boolean f75504e;

    /* renamed from: a */
    private static List<PreloadStrategyConfig> m94286a() {
        try {
            PreloadStrategyConfig[] preloadStrategyConfigArr = (PreloadStrategyConfig[]) C6384b.m19835a().mo15290a(SmartPreoloadStrategyExperiment.class, true, "smart_preload_strategy", (Object) C6384b.m19835a().mo15295d().smart_preload_strategy, PreloadStrategyConfig[].class);
            if (preloadStrategyConfigArr != null) {
                return Arrays.asList(preloadStrategyConfigArr);
            }
        } catch (Throwable unused) {
        }
        return Collections.emptyList();
    }

    /* renamed from: a */
    private static void m94287a(String str) {
        if (C6384b.m19835a().mo15287a(EnableSpeedMonitorExperiment.class, true, "enable_speed_monitor", C6384b.m19835a().mo15295d().enable_speed_monitor, 0) == 1) {
            int f = C44903d.m141656f();
            String networkAccessType = NetworkUtils.getNetworkAccessType(C6399b.m19921a());
            int b = C43264m.m137242a(C6399b.m19921a()).mo105015b(C6399b.m19921a());
            C44905e[] d = C44903d.m141655a().mo107379d();
            if (d != null) {
                C28658d dVar = new C28658d(d, str, f, networkAccessType, b);
                C1592h.m7855a((Callable<TResult>) dVar, (Executor) C6907h.m21516a());
            }
        }
    }

    /* renamed from: a */
    static final /* synthetic */ Object m94285a(C44905e[] eVarArr, String str, int i, String str2, int i2) throws Exception {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            for (int length = eVarArr.length - 1; length >= 0; length--) {
                C44905e eVar = eVarArr[length];
                if (eVar != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("file_size", eVar.f115484c);
                    jSONObject2.put("cost_time", eVar.f115485d);
                    if (length > 0) {
                        int i3 = length - 1;
                        if (eVarArr[i3] != null) {
                            jSONObject2.put("interval_time", eVar.f115486e - eVarArr[i3].f115486e);
                            jSONArray.put(jSONObject2);
                        }
                    }
                    jSONObject2.put("interval_time", 0);
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.put("group_id", str);
            jSONObject.put("speed_record", jSONArray);
            jSONObject.put("internet_speed", i);
            jSONObject.put("strategy", 0);
            jSONObject.put("access", str2);
            jSONObject.put("signal", i2);
            jSONObject.put("qsize", C44903d.f115471c);
        } catch (Exception unused) {
        }
        C6907h.m21528b("video_speed_monitor", jSONObject);
        C21097b.m71144a("video_speed_monitor", jSONObject);
        return null;
    }

    /* renamed from: a */
    public final void mo73720a(String str, long j, long j2, FeedPagerAdapter feedPagerAdapter, int i, boolean z) {
        VideoUrlModel videoUrlModel;
        C7280a aVar;
        Aweme b = feedPagerAdapter.mo67568b(i);
        if (b != null && b.getVideo() != null) {
            Video video = b.getVideo();
            if (video != null) {
                if (C6384b.m19835a().mo15292a(H265PlayAddrPolicyUnifyExperiment.class, true, "h265_play_addr_policy_unify", C6384b.m19835a().mo15295d().h265_play_addr_policy_unify, true)) {
                    videoUrlModel = C43269p.m137254a(video);
                } else {
                    videoUrlModel = video.getProperPlayAddr();
                }
                if (videoUrlModel != null && !TextUtils.isEmpty(str)) {
                    String bitRatedRatioUri = videoUrlModel.getBitRatedRatioUri();
                    if (TextUtils.equals(str, bitRatedRatioUri)) {
                        if (!TextUtils.equals(bitRatedRatioUri, this.f75502c)) {
                            this.f75504e = false;
                            this.f75503d = true;
                            this.f75502c = bitRatedRatioUri;
                            this.f75500a = false;
                            if (this.f75501b != null) {
                                this.f75501b.clearFlag();
                            }
                        } else {
                            this.f75503d = false;
                        }
                        if (j2 == j && !this.f75504e) {
                            this.f75504e = true;
                            m94287a(videoUrlModel.getSourceId());
                        }
                        if (this.f75503d) {
                            List a = m94286a();
                            if (a != null && a.size() > 0) {
                                long max = Math.max(((PreloadStrategyConfig) a.get(0)).getNetworkLower(), 0);
                                long min = Math.min(Math.max(max, (long) C44903d.m141656f()), Math.min(((PreloadStrategyConfig) a.get(a.size() - 1)).getNetworkUpper(), 25000));
                                Iterator it = a.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    PreloadStrategyConfig preloadStrategyConfig = (PreloadStrategyConfig) it.next();
                                    if (preloadStrategyConfig != null && min >= preloadStrategyConfig.getNetworkLower() && min <= preloadStrategyConfig.getNetworkUpper()) {
                                        this.f75501b = preloadStrategyConfig;
                                        break;
                                    }
                                }
                            } else {
                                try {
                                    String d = C7174p.m22398a().mo18651d();
                                    try {
                                        aVar = (C7280a) C6384b.m19835a().mo15290a(SmartPreoloadStrategyV2Experiment.class, true, "smart_preload_strategy_v2", (Object) C6384b.m19835a().mo15295d().smart_preload_strategy_v2, C7280a.class);
                                    } catch (Throwable unused) {
                                        aVar = null;
                                    }
                                    if (!TextUtils.isEmpty(d) && aVar != null && aVar.f20359c != null && aVar.f20359c.length > 0) {
                                        PreloadStrategyConfig[] preloadStrategyConfigArr = aVar.f20359c;
                                        int i2 = aVar.f20357a;
                                        List<String> list = aVar.f20358b;
                                        if (list != null && list.size() > 0 && list.contains(d) && list.indexOf(d) < preloadStrategyConfigArr.length) {
                                            i2 = list.indexOf(d);
                                        }
                                        this.f75501b = preloadStrategyConfigArr[i2];
                                    }
                                } catch (Throwable th) {
                                    C1592h.m7853a((Callable<TResult>) new C28657c<TResult>(th));
                                    this.f75501b = null;
                                }
                            }
                        }
                        if (this.f75501b == null) {
                            this.f75501b = C28344a.m93118i();
                        }
                        List emptyList = Collections.emptyList();
                        for (PreloadTask preloadTask : this.f75501b.getTasks()) {
                            if (!preloadTask.alreadyPreload && 100 * j2 >= ((long) preloadTask.progress) * j) {
                                if (emptyList.isEmpty()) {
                                    emptyList = new ArrayList();
                                }
                                emptyList.add(preloadTask);
                                preloadTask.alreadyPreload = true;
                            }
                        }
                        if (!emptyList.isEmpty()) {
                            boolean z2 = z;
                            C43305j.m137386g().mo105086a(z2, i, feedPagerAdapter.mo71593b(), emptyList);
                        }
                    }
                }
            }
        }
    }
}
