package com.p280ss.android.ugc.aweme.feed.api;

import android.text.TextUtils;
import com.bytedance.retrofit2.p264b.C6455f;
import com.bytedance.retrofit2.p264b.C6456g;
import com.bytedance.retrofit2.p264b.C6468s;
import com.google.common.util.concurrent.C18253l;
import com.p280ss.android.p284b.C19223b;
import com.p280ss.android.ugc.aweme.app.C22977g;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.feed.api.AwemeStatsApi */
public final class AwemeStatsApi {

    /* renamed from: a */
    private static final AwemeStatsService f74317a = ((AwemeStatsService) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(C19223b.f51890e).create(AwemeStatsService.class));

    /* renamed from: com.ss.android.ugc.aweme.feed.api.AwemeStatsApi$AwemeStatsService */
    public interface AwemeStatsService {
        @C6456g
        @C6468s(mo15750a = "/aweme/v1/aweme/stats/")
        C18253l<BaseResponse> awemeStatsReport(@C6455f Map<String, String> map);

        @C6456g
        @C6468s(mo15750a = "/aweme/v1/play/stats/")
        C18253l<BaseResponse> playStatsReport(@C6455f Map<String, String> map);
    }

    /* renamed from: a */
    private static void m92732a(Map<String, String> map) {
        map.put("first_install_time", C30199h.m98861a().getFirstInstallTime().toString());
        map.put("action_time", String.valueOf(System.currentTimeMillis() / 1000));
    }

    /* renamed from: a */
    public static void m92731a(String str, int i, int i2, int i3, int i4, long j) throws Exception {
        if (!C22977g.f60742b.mo59967b()) {
            HashMap hashMap = new HashMap();
            if (!TextUtils.isEmpty(str)) {
                hashMap.put("item_id", str);
            }
            if (i >= 0) {
                hashMap.put("source", String.valueOf(i));
            }
            if (i2 >= 0) {
                hashMap.put("aweme_type", String.valueOf(i2));
            }
            if (i3 >= 0) {
                hashMap.put("finish", String.valueOf(i3));
            }
            if (i4 >= 0) {
                hashMap.put("tab_type", String.valueOf(i4));
            }
            if (j > -1) {
                hashMap.put("play_time", String.valueOf(j));
            }
            m92732a(hashMap);
            f74317a.playStatsReport(hashMap).get();
        }
    }

    /* renamed from: a */
    public static void m92730a(String str, int i, int i2, int i3, int i4, int i5, int i6, String str2) throws Exception {
        if (!C22977g.f60742b.mo59967b()) {
            HashMap hashMap = new HashMap();
            if (!TextUtils.isEmpty(str)) {
                hashMap.put("item_id", str);
            }
            if (i > 0) {
                hashMap.put("share_delta", String.valueOf(i));
            }
            if (i2 > 0) {
                hashMap.put("play_delta", String.valueOf(i2));
            }
            if (i3 > 0) {
                hashMap.put("download_delta", String.valueOf(i3));
            }
            if (i4 >= 0) {
                hashMap.put("aweme_type", String.valueOf(i4));
            }
            if (i5 >= 0) {
                hashMap.put("tab_type", String.valueOf(i5));
            }
            if (i6 > 0) {
                hashMap.put("item_type", String.valueOf(i6));
            }
            if (str2 != null) {
                hashMap.put("stats_channel", str2);
            }
            m92732a(hashMap);
            f74317a.awemeStatsReport(hashMap).get();
        }
    }
}
