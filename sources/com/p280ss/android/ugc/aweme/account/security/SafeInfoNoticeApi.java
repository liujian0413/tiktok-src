package com.p280ss.android.ugc.aweme.account.security;

import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.C7573i;
import p346io.reactivex.C7319aa;
import retrofit2.p363b.C7727c;
import retrofit2.p363b.C7729e;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7739o;
import retrofit2.p363b.C7744t;

/* renamed from: com.ss.android.ugc.aweme.account.security.SafeInfoNoticeApi */
public interface SafeInfoNoticeApi {

    /* renamed from: a */
    public static final C22216a f59316a = C22216a.f59317a;

    /* renamed from: com.ss.android.ugc.aweme.account.security.SafeInfoNoticeApi$a */
    public static final class C22216a {

        /* renamed from: a */
        static final /* synthetic */ C22216a f59317a = new C22216a();

        private C22216a() {
        }

        /* renamed from: a */
        public static SafeInfoNoticeApi m73692a() {
            Object a = new RetrofitFactory().createBuilder(Api.f60502b).mo26430a().mo26435a(SafeInfoNoticeApi.class);
            C7573i.m23582a(a, "RetrofitFactory().create…nfoNoticeApi::class.java)");
            return (SafeInfoNoticeApi) a;
        }
    }

    @C7729e
    @C7739o(mo20429a = "/safe_info/user/confirm/notice/")
    C7319aa<BaseResponse> safeInfoConfirm(@C7727c(mo20417a = "notice_id") String str, @C7727c(mo20417a = "notice_type") String str2);

    @C7730f(mo20420a = "/safe_info/user/message/notice/")
    C7319aa<C22219c> safeInfoNoticeMsg(@C7744t(mo20436a = "adolescent_model") boolean z);
}
