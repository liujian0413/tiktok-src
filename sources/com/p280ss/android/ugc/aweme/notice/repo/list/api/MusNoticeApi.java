package com.p280ss.android.ugc.aweme.notice.repo.list.api;

import com.p280ss.android.ugc.aweme.notice.repo.list.bean.C34362j;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.MessageResponse;
import p346io.reactivex.C7492s;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7744t;

/* renamed from: com.ss.android.ugc.aweme.notice.repo.list.api.MusNoticeApi */
public interface MusNoticeApi {

    /* renamed from: a */
    public static final C34349a f89512a = C34349a.f89513a;

    /* renamed from: com.ss.android.ugc.aweme.notice.repo.list.api.MusNoticeApi$a */
    public static final class C34349a {

        /* renamed from: a */
        static final /* synthetic */ C34349a f89513a = new C34349a();

        private C34349a() {
        }
    }

    @C7730f(mo20420a = "/aweme/v1/notice/list/message/")
    C7492s<MessageResponse> fetchNotice(@C7744t(mo20436a = "max_time") long j, @C7744t(mo20436a = "min_time") long j2, @C7744t(mo20436a = "count") int i, @C7744t(mo20436a = "notice_group") int i2, @C7744t(mo20436a = "top_group") Integer num, @C7744t(mo20436a = "is_mark_read") int i3);

    @C7730f(mo20420a = "/aweme/v1/room/recommended/avatars/")
    C7492s<C34362j> fetchRecommendAvatars();
}
