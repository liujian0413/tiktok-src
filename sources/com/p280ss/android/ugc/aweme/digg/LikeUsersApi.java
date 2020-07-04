package com.p280ss.android.ugc.aweme.digg;

import bolts.C1592h;
import com.p280ss.android.ugc.aweme.digg.p1171a.C26350a;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7744t;

/* renamed from: com.ss.android.ugc.aweme.digg.LikeUsersApi */
public interface LikeUsersApi {
    @C7730f(mo20420a = "/aweme/v1/favorite/list/")
    C1592h<C26350a> getFavoriteList(@C7744t(mo20436a = "item_id") String str, @C7744t(mo20436a = "item_type") int i, @C7744t(mo20436a = "max_cursor") long j, @C7744t(mo20436a = "min_cursor") long j2, @C7744t(mo20436a = "count") int i2, @C7744t(mo20436a = "insert_ids") String str2, @C7744t(mo20436a = "address_book_access") int i3);
}
