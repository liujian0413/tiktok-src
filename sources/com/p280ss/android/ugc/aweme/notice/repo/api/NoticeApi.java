package com.p280ss.android.ugc.aweme.notice.repo.api;

import com.p280ss.android.ugc.aweme.notice.repo.bean.FollowRequestResponse;
import p346io.reactivex.C7492s;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7744t;

/* renamed from: com.ss.android.ugc.aweme.notice.repo.api.NoticeApi */
public interface NoticeApi {

    /* renamed from: a */
    public static final C34347a f89510a = C34347a.f89511a;

    /* renamed from: com.ss.android.ugc.aweme.notice.repo.api.NoticeApi$a */
    public static final class C34347a {

        /* renamed from: a */
        static final /* synthetic */ C34347a f89511a = new C34347a();

        private C34347a() {
        }
    }

    @C7730f(mo20420a = "/aweme/v1/user/following/request/list/")
    C7492s<FollowRequestResponse> fetchFollowRequestList(@C7744t(mo20436a = "max_time") long j, @C7744t(mo20436a = "min_time") long j2, @C7744t(mo20436a = "count") int i);
}
