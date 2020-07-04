package com.twitter.sdk.android.core.services;

import com.twitter.sdk.android.core.models.C46959o;
import java.util.List;
import retrofit2.C48475b;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7744t;

public interface ListService {
    @C7730f(mo20420a = "/1.1/lists/statuses.json?tweet_mode=extended&include_cards=true&cards_platform=TwitterKit-13")
    C48475b<List<C46959o>> statuses(@C7744t(mo20436a = "list_id") Long l, @C7744t(mo20436a = "slug") String str, @C7744t(mo20436a = "owner_screen_name") String str2, @C7744t(mo20436a = "owner_id") Long l2, @C7744t(mo20436a = "since_id") Long l3, @C7744t(mo20436a = "max_id") Long l4, @C7744t(mo20436a = "count") Integer num, @C7744t(mo20436a = "include_entities") Boolean bool, @C7744t(mo20436a = "include_rts") Boolean bool2);
}
