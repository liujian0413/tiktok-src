package com.twitter.sdk.android.core.services;

import com.twitter.sdk.android.core.models.C46959o;
import java.util.List;
import retrofit2.C48475b;
import retrofit2.p363b.C7727c;
import retrofit2.p363b.C7729e;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7739o;
import retrofit2.p363b.C7744t;

public interface FavoriteService {
    @C7729e
    @C7739o(mo20429a = "/1.1/favorites/create.json?tweet_mode=extended&include_cards=true&cards_platform=TwitterKit-13")
    C48475b<C46959o> create(@C7727c(mo20417a = "id") Long l, @C7727c(mo20417a = "include_entities") Boolean bool);

    @C7729e
    @C7739o(mo20429a = "/1.1/favorites/destroy.json?tweet_mode=extended&include_cards=true&cards_platform=TwitterKit-13")
    C48475b<C46959o> destroy(@C7727c(mo20417a = "id") Long l, @C7727c(mo20417a = "include_entities") Boolean bool);

    @C7730f(mo20420a = "/1.1/favorites/list.json?tweet_mode=extended&include_cards=true&cards_platform=TwitterKit-13")
    C48475b<List<C46959o>> list(@C7744t(mo20436a = "user_id") Long l, @C7744t(mo20436a = "screen_name") String str, @C7744t(mo20436a = "count") Integer num, @C7744t(mo20436a = "since_id") String str2, @C7744t(mo20436a = "max_id") String str3, @C7744t(mo20436a = "include_entities") Boolean bool);
}
