package com.p280ss.android.ugc.aweme.profile.api;

import bolts.C1592h;
import com.p280ss.android.ugc.aweme.profile.model.CommitRemarkNameResponse;
import retrofit2.p363b.C7727c;
import retrofit2.p363b.C7729e;
import retrofit2.p363b.C7739o;

/* renamed from: com.ss.android.ugc.aweme.profile.api.RemarkApi */
public interface RemarkApi {
    @C7729e
    @C7739o(mo20429a = "/aweme/v1/user/remark/name/")
    C1592h<CommitRemarkNameResponse> commitRemarkName(@C7727c(mo20417a = "remark_name") String str, @C7727c(mo20417a = "user_id") String str2, @C7727c(mo20417a = "sec_user_id") String str3);

    @C7729e
    @C7739o(mo20429a = "/aweme/v1/user/contact/book/remark/name/")
    C1592h<CommitRemarkNameResponse> getContackBookRemarkName(@C7727c(mo20417a = "user_id") String str, @C7727c(mo20417a = "sec_user_id") String str2);
}
