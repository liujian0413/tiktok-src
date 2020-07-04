package com.p280ss.android.ugc.aweme.profile.api;

import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.profile.model.UsedPhoneNoticeMsgResponse;
import p346io.reactivex.C7319aa;
import retrofit2.p363b.C7727c;
import retrofit2.p363b.C7729e;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7739o;

/* renamed from: com.ss.android.ugc.aweme.profile.api.UsedPhoneApi */
public interface UsedPhoneApi {
    @C7729e
    @C7739o(mo20429a = "/safe_info/user/confirm/mno_mobile/")
    C7319aa<BaseResponse> usedPhoneConfirm(@C7727c(mo20417a = "is_mine") boolean z);

    @C7730f(mo20420a = "/safe_info/user/message/notice/")
    C7319aa<UsedPhoneNoticeMsgResponse> usedPhoneNoticeMsg();
}
