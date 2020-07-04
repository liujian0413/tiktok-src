package com.p280ss.android.ugc.aweme.detail.api;

import com.bytedance.ies.ugc.aweme.network.C10944e;
import com.bytedance.retrofit2.C12466b;
import com.bytedance.retrofit2.p264b.C6454e;
import com.bytedance.retrofit2.p264b.C6456g;
import com.bytedance.retrofit2.p264b.C6457h;
import com.bytedance.retrofit2.p264b.C6468s;
import com.bytedance.retrofit2.p264b.C6474y;
import com.p280ss.android.p284b.C19223b;
import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.detail.p1164h.C26066a;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.React;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.detail.api.DetailApi */
public final class DetailApi {

    /* renamed from: a */
    private static final String f68849a;

    /* renamed from: b */
    private static final IDetailApi f68850b = ((IDetailApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(C19223b.f51890e).create(IDetailApi.class));

    /* renamed from: com.ss.android.ugc.aweme.detail.api.DetailApi$IDetailApi */
    public interface IDetailApi {
        @C6457h(mo15740a = "/aweme/v1/aweme/react/info/")
        C12466b<React> fetchReactApi(@C6474y(mo15757a = "aweme_id") String str);

        @C6457h(mo15740a = "/aweme/v1/aweme/detail/")
        C12466b<String> queryAweme(@C6474y(mo15757a = "aweme_id") String str, @C6474y(mo15757a = "origin_type") String str2);

        @C6456g
        @C6468s(mo15750a = "/aweme/v1/multi/aweme/detail/")
        C12466b<C26066a> queryBatchAweme(@C6454e(mo15737a = "aweme_ids") String str, @C6454e(mo15737a = "origin_type") String str2, @C6454e(mo15737a = "push_params") String str3);
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(C19223b.f51890e);
        sb.append("/aweme/v1/aweme/detail/");
        f68849a = sb.toString();
    }

    /* renamed from: a */
    public static React m85568a(String str) throws Exception {
        return (React) f68850b.fetchReactApi(str).execute().f33302b;
    }

    /* renamed from: a */
    public static Aweme m85567a(String str, String str2) throws Exception {
        String str3 = (String) f68850b.queryAweme(str, str2).execute().f33302b;
        JSONObject jSONObject = new JSONObject(str3);
        Api.m75215a(jSONObject, str3, f68849a);
        return (Aweme) C10944e.m32113a().mo15974a(jSONObject.optString("aweme_detail"), Aweme.class);
    }

    /* renamed from: a */
    public static C26066a m85566a(String str, String str2, String str3) throws Exception {
        return (C26066a) f68850b.queryBatchAweme(str, str3, str2).execute().f33302b;
    }
}
