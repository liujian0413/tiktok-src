package com.p280ss.android.ugc.aweme.notice.repo.api;

import com.bytedance.retrofit2.C12466b;
import com.bytedance.retrofit2.p264b.C6457h;
import com.bytedance.retrofit2.p264b.C6474y;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.notice.api.bean.NoticeList;
import com.p280ss.android.ugc.aweme.notice.repo.TutorialVideoApiManager;

/* renamed from: com.ss.android.ugc.aweme.notice.repo.api.NotificationApi */
public final class NotificationApi {

    /* renamed from: com.ss.android.ugc.aweme.notice.repo.api.NotificationApi$INotificationApi */
    public interface INotificationApi {
        @C6457h(mo15740a = "/aweme/v1/feedback/cancel/")
        C12466b<String> cancelFeedback();

        @C6457h(mo15740a = "/aweme/v1/notice/count/")
        C12466b<NoticeList> query(@C6474y(mo15757a = "source") int i);
    }

    /* renamed from: a */
    public static void m111065a() {
        C6726a.m20842a(new Runnable() {
            public final void run() {
                try {
                    ((INotificationApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(TutorialVideoApiManager.f89507a).create(INotificationApi.class)).cancelFeedback().execute();
                } catch (Exception unused) {
                }
            }
        });
    }

    /* renamed from: a */
    public static NoticeList m111064a(int i) throws Exception {
        return (NoticeList) ((INotificationApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(TutorialVideoApiManager.f89507a).create(INotificationApi.class)).query(i).execute().f33302b;
    }
}
