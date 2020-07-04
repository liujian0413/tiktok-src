package com.p280ss.android.ugc.aweme.notification.api;

import bolts.C1592h;
import com.google.common.util.concurrent.C18253l;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.notice.repo.TutorialVideoApiManager;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.NoticeResponse;
import com.p280ss.android.ugc.aweme.notice.repo.p1431a.C34346a;
import com.p280ss.android.ugc.aweme.notification.p1432a.C34382b;
import java.util.concurrent.ExecutionException;
import p346io.reactivex.C7492s;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7739o;
import retrofit2.p363b.C7744t;

/* renamed from: com.ss.android.ugc.aweme.notification.api.NoticeApiManager */
public final class NoticeApiManager {

    /* renamed from: a */
    private static NoticeApi f89815a = ((NoticeApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(TutorialVideoApiManager.f89507a).create(NoticeApi.class));

    /* renamed from: com.ss.android.ugc.aweme.notification.api.NoticeApiManager$NoticeApi */
    interface NoticeApi {
        @C7739o(mo20429a = "/aweme/v1/notice/del/")
        C1592h<BaseResponse> deleteNotice(@C7744t(mo20436a = "notice_id") String str);

        @C7730f(mo20420a = "/aweme/v1/digg/list/")
        C1592h<C34382b> fetchLikeList(@C7744t(mo20436a = "max_cursor") long j, @C7744t(mo20436a = "min_cursor") long j2, @C7744t(mo20436a = "count") int i, @C7744t(mo20436a = "is_new") boolean z, @C7744t(mo20436a = "digg_type") int i2, @C7744t(mo20436a = "ref_id") String str);

        @C7730f(mo20420a = "/aweme/v1/notice/")
        C18253l<NoticeResponse> fetchNotice(@C7744t(mo20436a = "max_time") long j, @C7744t(mo20436a = "min_time") long j2, @C7744t(mo20436a = "count") int i, @C7744t(mo20436a = "notice_group") int i2, @C7744t(mo20436a = "top_group") Integer num, @C7744t(mo20436a = "is_mark_read") int i3, @C7744t(mo20436a = "address_book_access") Integer num2, @C7744t(mo20436a = "gps_access") Integer num3, @C7744t(mo20436a = "notice_style") Integer num4);

        @C7730f(mo20420a = "/aweme/v1/notice/")
        C7492s<NoticeResponse> markAsRead(@C7744t(mo20436a = "max_time") long j, @C7744t(mo20436a = "min_time") long j2, @C7744t(mo20436a = "count") int i, @C7744t(mo20436a = "notice_group") int i2, @C7744t(mo20436a = "top_group") Integer num, @C7744t(mo20436a = "is_mark_read") int i3, @C7744t(mo20436a = "address_book_access") Integer num2, @C7744t(mo20436a = "gps_access") Integer num3);
    }

    /* renamed from: a */
    public static void m111260a(String str) {
        f89815a.deleteNotice(str);
    }

    /* renamed from: a */
    public static C7492s<NoticeResponse> m111259a(Integer num) {
        return f89815a.markAsRead(0, 0, 0, num.intValue(), null, 1, Integer.valueOf(C34346a.m111061a()), Integer.valueOf(C34346a.m111063b()));
    }

    /* renamed from: a */
    public static C1592h<C34382b> m111257a(long j, long j2, int i, boolean z, int i2, String str) {
        return f89815a.fetchLikeList(j, j2, 20, z, i2, str);
    }

    /* renamed from: a */
    public static NoticeResponse m111258a(long j, long j2, int i, int i2, Integer num, int i3, int i4, int i5) throws Exception {
        try {
            return (NoticeResponse) f89815a.fetchNotice(j, j2, i, i2, num, i3, Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(NoticeStyle.getNoticeStyle())).get();
        } catch (ExecutionException e) {
            throw ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).propagateCompatibleException(e);
        }
    }
}
