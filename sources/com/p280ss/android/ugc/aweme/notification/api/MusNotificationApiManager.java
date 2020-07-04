package com.p280ss.android.ugc.aweme.notification.api;

import bolts.C1592h;
import com.google.common.util.concurrent.C18253l;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.C34362j;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.MessageResponse;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7739o;
import retrofit2.p363b.C7744t;

/* renamed from: com.ss.android.ugc.aweme.notification.api.MusNotificationApiManager */
public final class MusNotificationApiManager {

    /* renamed from: a */
    private static NoticeApi f89814a = ((NoticeApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://api2.musical.ly/").create(NoticeApi.class));

    /* renamed from: com.ss.android.ugc.aweme.notification.api.MusNotificationApiManager$NoticeApi */
    interface NoticeApi {
        @C7739o(mo20429a = "/aweme/v1/notice/del/")
        C1592h<BaseResponse> deleteNotice(@C7744t(mo20436a = "notice_id") String str);

        @C7730f(mo20420a = "/aweme/v1/notice/list/message/")
        C18253l<MessageResponse> fetchNotice(@C7744t(mo20436a = "max_time") long j, @C7744t(mo20436a = "min_time") long j2, @C7744t(mo20436a = "count") int i, @C7744t(mo20436a = "notice_group") int i2, @C7744t(mo20436a = "top_group") Integer num, @C7744t(mo20436a = "is_mark_read") int i3, @C7744t(mo20436a = "notice_style") Integer num2);

        @C7730f(mo20420a = "/aweme/v1/notice/list/message/")
        C1592h<MessageResponse> fetchNoticeTask(@C7744t(mo20436a = "max_time") long j, @C7744t(mo20436a = "min_time") long j2, @C7744t(mo20436a = "count") int i, @C7744t(mo20436a = "notice_group") int i2, @C7744t(mo20436a = "top_group") Integer num, @C7744t(mo20436a = "is_mark_read") int i3, @C7744t(mo20436a = "notice_style") Integer num2);

        @C7730f(mo20420a = "/aweme/v1/room/recommended/avatars/")
        C1592h<C34362j> fetchRecommendAvatars();
    }

    /* renamed from: a */
    public static C1592h<C34362j> m111253a() {
        return f89814a.fetchRecommendAvatars();
    }

    /* renamed from: a */
    public static void m111255a(String str) {
        f89814a.deleteNotice(str).mo6876a(null, (Executor) C1592h.f5957a);
    }

    /* renamed from: b */
    public static C1592h<MessageResponse> m111256b(long j, long j2, int i, int i2, Integer num, int i3) {
        return f89814a.fetchNoticeTask(0, 0, 20, 36, null, 1, Integer.valueOf(NoticeStyle.getNoticeStyle()));
    }

    /* renamed from: a */
    public static MessageResponse m111254a(long j, long j2, int i, int i2, Integer num, int i3) throws Exception {
        try {
            return (MessageResponse) f89814a.fetchNotice(j, j2, 20, i2, num, 1, Integer.valueOf(NoticeStyle.getNoticeStyle())).get();
        } catch (ExecutionException e) {
            throw ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).propagateCompatibleException(e);
        }
    }
}
