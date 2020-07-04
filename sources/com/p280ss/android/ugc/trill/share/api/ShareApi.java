package com.p280ss.android.ugc.trill.share.api;

import android.text.TextUtils;
import com.bytedance.retrofit2.C12466b;
import com.bytedance.retrofit2.p264b.C6457h;
import com.bytedance.retrofit2.p264b.C6475z;
import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.trill.share.api.ShareApi */
public final class ShareApi {

    /* renamed from: a */
    private static final ShareService f115849a = ((ShareService) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(Api.f60502b).create(ShareService.class));

    /* renamed from: com.ss.android.ugc.trill.share.api.ShareApi$ShareService */
    public interface ShareService {
        @C6457h(mo15740a = "/aweme/v1/thrid/platform/share/")
        C12466b<AutoShare> autoShare(@C6475z Map<String, String> map);
    }

    /* renamed from: a */
    public static AutoShare m142195a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) throws Exception {
        HashMap hashMap = new HashMap();
        hashMap.put("platform_type", str);
        hashMap.put("share_url", str2);
        hashMap.put("share_message", str3);
        if (!TextUtils.isEmpty(str4)) {
            hashMap.put("fb_access_token", str4);
        }
        if (!TextUtils.isEmpty(str5)) {
            hashMap.put("twitter_access_token", str5);
        }
        if (!TextUtils.isEmpty(str6)) {
            hashMap.put("access_token_secret", str6);
        }
        if (!TextUtils.isEmpty(str7)) {
            hashMap.put("youtube_code", str7);
        }
        if (!TextUtils.isEmpty(str8)) {
            hashMap.put("item_id", str8);
        }
        if (!TextUtils.isEmpty(str9)) {
            hashMap.put("youtube_title", str9);
        }
        if (!TextUtils.isEmpty(str10)) {
            hashMap.put("youtube_desc", str10);
        }
        return (AutoShare) f115849a.autoShare(hashMap).execute().f33302b;
    }
}
