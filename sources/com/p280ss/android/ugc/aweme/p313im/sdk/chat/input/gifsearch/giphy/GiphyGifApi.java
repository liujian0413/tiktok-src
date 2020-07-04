package com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.gifsearch.giphy;

import bolts.C1592h;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.gifsearch.giphy.p1321a.C30865c;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7744t;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.giphy.GiphyGifApi */
public interface GiphyGifApi {
    @C7730f(mo20420a = "im/resources/gifs/search/")
    C1592h<C30865c> getSearchingGiphy(@C7744t(mo20436a = "offset") int i, @C7744t(mo20436a = "q") String str);

    @C7730f(mo20420a = "im/resources/gifs/trending/")
    C1592h<C30865c> getTrendingGiphy(@C7744t(mo20436a = "offset") int i);
}
