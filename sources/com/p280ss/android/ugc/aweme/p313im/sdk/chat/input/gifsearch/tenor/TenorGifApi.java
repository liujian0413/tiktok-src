package com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.gifsearch.tenor;

import bolts.C1592h;
import java.util.Map;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7744t;
import retrofit2.p363b.C7745u;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.tenor.TenorGifApi */
public interface TenorGifApi {
    @C7730f(mo20420a = "anonid")
    C1592h<Object> getAnonId(@C7744t(mo20436a = "key") String str);

    @C7730f(mo20420a = "search")
    C1592h<Object> getSearchGifs(@C7745u Map<String, String> map);

    @C7730f(mo20420a = "trending")
    C1592h<Object> getTrendingGifs(@C7745u Map<String, String> map);

    @C7730f(mo20420a = "registershare")
    C1592h<Object> registerShareGif(@C7745u Map<String, String> map);
}
