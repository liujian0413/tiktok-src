package com.twitter.sdk.android.core.services;

import com.twitter.sdk.android.core.models.C46959o;
import java.util.List;
import retrofit2.C48475b;
import retrofit2.p363b.C7727c;
import retrofit2.p363b.C7729e;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7739o;
import retrofit2.p363b.C7743s;
import retrofit2.p363b.C7744t;

public interface StatusesService {
    @C7729e
    @C7739o(mo20429a = "/1.1/statuses/destroy/{id}.json?tweet_mode=extended&include_cards=true&cards_platform=TwitterKit-13")
    C48475b<C46959o> destroy(@C7743s(mo20434a = "id") Long l, @C7727c(mo20417a = "trim_user") Boolean bool);

    @C7730f(mo20420a = "/1.1/statuses/home_timeline.json?tweet_mode=extended&include_cards=true&cards_platform=TwitterKit-13")
    C48475b<List<C46959o>> homeTimeline(@C7744t(mo20436a = "count") Integer num, @C7744t(mo20436a = "since_id") Long l, @C7744t(mo20436a = "max_id") Long l2, @C7744t(mo20436a = "trim_user") Boolean bool, @C7744t(mo20436a = "exclude_replies") Boolean bool2, @C7744t(mo20436a = "contributor_details") Boolean bool3, @C7744t(mo20436a = "include_entities") Boolean bool4);

    @C7730f(mo20420a = "/1.1/statuses/lookup.json?tweet_mode=extended&include_cards=true&cards_platform=TwitterKit-13")
    C48475b<List<C46959o>> lookup(@C7744t(mo20436a = "id") String str, @C7744t(mo20436a = "include_entities") Boolean bool, @C7744t(mo20436a = "trim_user") Boolean bool2, @C7744t(mo20436a = "map") Boolean bool3);

    @C7730f(mo20420a = "/1.1/statuses/mentions_timeline.json?tweet_mode=extended&include_cards=true&cards_platform=TwitterKit-13")
    C48475b<List<C46959o>> mentionsTimeline(@C7744t(mo20436a = "count") Integer num, @C7744t(mo20436a = "since_id") Long l, @C7744t(mo20436a = "max_id") Long l2, @C7744t(mo20436a = "trim_user") Boolean bool, @C7744t(mo20436a = "contributor_details") Boolean bool2, @C7744t(mo20436a = "include_entities") Boolean bool3);

    @C7729e
    @C7739o(mo20429a = "/1.1/statuses/retweet/{id}.json?tweet_mode=extended&include_cards=true&cards_platform=TwitterKit-13")
    C48475b<C46959o> retweet(@C7743s(mo20434a = "id") Long l, @C7727c(mo20417a = "trim_user") Boolean bool);

    @C7730f(mo20420a = "/1.1/statuses/retweets_of_me.json?tweet_mode=extended&include_cards=true&cards_platform=TwitterKit-13")
    C48475b<List<C46959o>> retweetsOfMe(@C7744t(mo20436a = "count") Integer num, @C7744t(mo20436a = "since_id") Long l, @C7744t(mo20436a = "max_id") Long l2, @C7744t(mo20436a = "trim_user") Boolean bool, @C7744t(mo20436a = "include_entities") Boolean bool2, @C7744t(mo20436a = "include_user_entities") Boolean bool3);

    @C7730f(mo20420a = "/1.1/statuses/show.json?tweet_mode=extended&include_cards=true&cards_platform=TwitterKit-13")
    C48475b<C46959o> show(@C7744t(mo20436a = "id") Long l, @C7744t(mo20436a = "trim_user") Boolean bool, @C7744t(mo20436a = "include_my_retweet") Boolean bool2, @C7744t(mo20436a = "include_entities") Boolean bool3);

    @C7729e
    @C7739o(mo20429a = "/1.1/statuses/unretweet/{id}.json?tweet_mode=extended&include_cards=true&cards_platform=TwitterKit-13")
    C48475b<C46959o> unretweet(@C7743s(mo20434a = "id") Long l, @C7727c(mo20417a = "trim_user") Boolean bool);

    @C7729e
    @C7739o(mo20429a = "/1.1/statuses/update.json?tweet_mode=extended&include_cards=true&cards_platform=TwitterKit-13")
    C48475b<C46959o> update(@C7727c(mo20417a = "status") String str, @C7727c(mo20417a = "in_reply_to_status_id") Long l, @C7727c(mo20417a = "possibly_sensitive") Boolean bool, @C7727c(mo20417a = "lat") Double d, @C7727c(mo20417a = "long") Double d2, @C7727c(mo20417a = "place_id") String str2, @C7727c(mo20417a = "display_coordinates") Boolean bool2, @C7727c(mo20417a = "trim_user") Boolean bool3, @C7727c(mo20417a = "media_ids") String str3);

    @C7730f(mo20420a = "/1.1/statuses/user_timeline.json?tweet_mode=extended&include_cards=true&cards_platform=TwitterKit-13")
    C48475b<List<C46959o>> userTimeline(@C7744t(mo20436a = "user_id") Long l, @C7744t(mo20436a = "screen_name") String str, @C7744t(mo20436a = "count") Integer num, @C7744t(mo20436a = "since_id") Long l2, @C7744t(mo20436a = "max_id") Long l3, @C7744t(mo20436a = "trim_user") Boolean bool, @C7744t(mo20436a = "exclude_replies") Boolean bool2, @C7744t(mo20436a = "contributor_details") Boolean bool3, @C7744t(mo20436a = "include_rts") Boolean bool4);
}
