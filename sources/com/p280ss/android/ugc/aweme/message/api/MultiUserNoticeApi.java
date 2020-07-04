package com.p280ss.android.ugc.aweme.message.api;

import android.text.TextUtils;
import bolts.C1592h;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.message.model.MultiUserNoticeCountResponse;
import com.p280ss.android.ugc.aweme.notice.repo.TutorialVideoApiManager;
import java.util.List;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7744t;

/* renamed from: com.ss.android.ugc.aweme.message.api.MultiUserNoticeApi */
public final class MultiUserNoticeApi {

    /* renamed from: a */
    private static final MultiUserNoticeRetrofitApi f86438a = ((MultiUserNoticeRetrofitApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(TutorialVideoApiManager.f89507a).create(MultiUserNoticeRetrofitApi.class));

    /* renamed from: com.ss.android.ugc.aweme.message.api.MultiUserNoticeApi$MultiUserNoticeRetrofitApi */
    public interface MultiUserNoticeRetrofitApi {
        @C7730f(mo20420a = "/aweme/v1/notice/multi_user/count/")
        C1592h<MultiUserNoticeCountResponse> getMultiUserNoticeCount(@C7744t(mo20436a = "user_ids") String str);
    }

    /* renamed from: a */
    public static C1592h<MultiUserNoticeCountResponse> m107163a(List<String> list) {
        return f86438a.getMultiUserNoticeCount(TextUtils.join(",", list));
    }
}
