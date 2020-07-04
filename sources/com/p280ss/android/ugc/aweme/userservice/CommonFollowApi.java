package com.p280ss.android.ugc.aweme.userservice;

import android.text.TextUtils;
import com.bytedance.retrofit2.p264b.C6457h;
import com.bytedance.retrofit2.p264b.C6474y;
import com.bytedance.retrofit2.p264b.C6475z;
import com.google.common.util.concurrent.C18253l;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p280ss.android.ugc.aweme.services.IMainService;
import java.util.HashMap;
import java.util.Map;
import p346io.reactivex.C7492s;

/* renamed from: com.ss.android.ugc.aweme.userservice.CommonFollowApi */
public final class CommonFollowApi {

    /* renamed from: a */
    private static final FollowService f111323a = ((FollowService) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(((IMainService) ServiceManager.get().getService(IMainService.class)).getApiUrlPrefix()).create(FollowService.class));

    /* renamed from: com.ss.android.ugc.aweme.userservice.CommonFollowApi$FollowService */
    public interface FollowService {
        @C6457h(mo15740a = "/aweme/v3/f2f/follow/")
        C18253l<FollowStatus> face2FaceFollow(@C6474y(mo15757a = "user_id") String str);

        @C6457h(mo15740a = "/aweme/v1/commit/follow/user/")
        C18253l<FollowStatus> follow(@C6475z Map<String, String> map);

        @C6457h(mo15740a = "/aweme/v1/remove/follower/")
        C7492s<BaseResponse> remove(@C6474y(mo15757a = "user_id") String str);
    }

    /* renamed from: a */
    public static C7492s<BaseResponse> m136017a(String str) {
        return f111323a.remove(str);
    }

    /* renamed from: a */
    public static FollowStatus m136016a(String str, String str2, int i, int i2, int i3, String str3, int i4, String str4) throws Exception {
        HashMap hashMap = new HashMap();
        if (TextUtils.isEmpty(str2) || C30199h.m98861a().getSecIdSwitch().intValue() == 0) {
            hashMap.put("user_id", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put("sec_user_id", str2);
        }
        hashMap.put("type", String.valueOf(i));
        hashMap.put("channel_id", String.valueOf(i3));
        hashMap.put("city", str4);
        if (i2 != -1) {
            hashMap.put("from", String.valueOf(i2));
            hashMap.put("from_pre", String.valueOf(i4));
        }
        if (!TextUtils.isEmpty(str3)) {
            hashMap.put("item_id", str3);
        }
        FollowStatus followStatus = (FollowStatus) f111323a.follow(hashMap).get();
        followStatus.userId = str;
        return followStatus;
    }
}
