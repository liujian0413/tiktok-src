package com.p280ss.android.ugc.aweme.familiar.api;

import com.google.common.util.concurrent.C18253l;
import com.p280ss.android.ugc.aweme.familiar.p965a.C21711b;
import retrofit2.p363b.C7727c;
import retrofit2.p363b.C7729e;
import retrofit2.p363b.C7739o;

/* renamed from: com.ss.android.ugc.aweme.familiar.api.IFamiliarFeedApiV1 */
public interface IFamiliarFeedApiV1 {
    @C7729e
    @C7739o(mo20429a = "/aweme/v1/familiar/feed/")
    C18253l<C21711b> getFamiliarFeedList(@C7727c(mo20417a = "cursor") long j, @C7727c(mo20417a = "level") int i, @C7727c(mo20417a = "pull_type") int i2, @C7727c(mo20417a = "address_book_access") int i3, @C7727c(mo20417a = "gps_access") int i4, @C7727c(mo20417a = "aweme_ids") String str, @C7727c(mo20417a = "push_params") String str2, @C7727c(mo20417a = "enter_time") long j2, @C7727c(mo20417a = "rec_impr_users") String str3, @C7727c(mo20417a = "recommend_user_cursor") int i5);
}
