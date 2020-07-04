package com.twitter.sdk.android.core.services;

import com.twitter.sdk.android.core.models.C46957m;
import com.twitter.sdk.android.core.services.params.Geocode;
import retrofit2.C48475b;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7744t;

public interface SearchService {
    @C7730f(mo20420a = "/1.1/search/tweets.json?tweet_mode=extended&include_cards=true&cards_platform=TwitterKit-13")
    C48475b<C46957m> tweets(@C7744t(mo20436a = "q") String str, @C7744t(mo20436a = "geocode", mo20437b = true) Geocode geocode, @C7744t(mo20436a = "lang") String str2, @C7744t(mo20436a = "locale") String str3, @C7744t(mo20436a = "result_type") String str4, @C7744t(mo20436a = "count") Integer num, @C7744t(mo20436a = "until") String str5, @C7744t(mo20436a = "since_id") Long l, @C7744t(mo20436a = "max_id") Long l2, @C7744t(mo20436a = "include_entities") Boolean bool);
}
