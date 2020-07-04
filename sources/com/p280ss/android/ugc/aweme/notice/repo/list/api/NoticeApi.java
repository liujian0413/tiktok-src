package com.p280ss.android.ugc.aweme.notice.repo.list.api;

import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.NoticeResponse;
import p346io.reactivex.C7492s;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7739o;
import retrofit2.p363b.C7744t;

/* renamed from: com.ss.android.ugc.aweme.notice.repo.list.api.NoticeApi */
public interface NoticeApi {

    /* renamed from: a */
    public static final C34350a f89514a = C34350a.f89515a;

    /* renamed from: com.ss.android.ugc.aweme.notice.repo.list.api.NoticeApi$a */
    public static final class C34350a {

        /* renamed from: a */
        static final /* synthetic */ C34350a f89515a = new C34350a();

        private C34350a() {
        }
    }

    @C7739o(mo20429a = "/aweme/v1/notice/del/")
    C7492s<BaseResponse> deleteNotice(@C7744t(mo20436a = "notice_id") String str);

    @C7730f(mo20420a = "https://api2.musical.ly/aweme/v2/game/entry/")
    C7492s<Object> fetchGameCenter();

    @C7730f(mo20420a = "https://api2.musical.ly/aweme/v1/notice/")
    C7492s<NoticeResponse> fetchNotice(@C7744t(mo20436a = "max_time") long j, @C7744t(mo20436a = "min_time") long j2, @C7744t(mo20436a = "count") int i, @C7744t(mo20436a = "notice_group") int i2, @C7744t(mo20436a = "top_group") Integer num, @C7744t(mo20436a = "is_mark_read") int i3, @C7744t(mo20436a = "address_book_access") int i4, @C7744t(mo20436a = "gps_access") int i5);

    @C7730f(mo20420a = "https://api2.musical.ly/aweme/v1/notice/")
    C7492s<NoticeResponse> markAsRead(@C7744t(mo20436a = "max_time") long j, @C7744t(mo20436a = "min_time") long j2, @C7744t(mo20436a = "count") int i, @C7744t(mo20436a = "notice_group") int i2, @C7744t(mo20436a = "top_group") Integer num, @C7744t(mo20436a = "is_mark_read") int i3, @C7744t(mo20436a = "address_book_access") int i4, @C7744t(mo20436a = "gps_access") int i5);

    @C7730f(mo20420a = "https://api2.musical.ly/aweme/v2/game/subscribe/")
    C7492s<BaseResponse> reportSubscription(@C7744t(mo20436a = "op_type") int i);
}
