package com.twitter.sdk.android.core.services;

import retrofit2.C48475b;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7744t;

public interface CollectionService {
    @C7730f(mo20420a = "/1.1/collections/entries.json?tweet_mode=extended&include_cards=true&cards_platform=TwitterKit-13")
    C48475b<Object> collection(@C7744t(mo20436a = "id") String str, @C7744t(mo20436a = "count") Integer num, @C7744t(mo20436a = "max_position") Long l, @C7744t(mo20436a = "min_position") Long l2);
}
