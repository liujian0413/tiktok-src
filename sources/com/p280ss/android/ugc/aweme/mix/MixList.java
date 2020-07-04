package com.p280ss.android.ugc.aweme.mix;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.mix.MixList */
public class MixList implements Serializable {
    @C6593c(mo15949a = "aweme_list")
    public List<Aweme> awemeList;
    @C6593c(mo15949a = "cursor")
    public long cursor;
    @C6593c(mo15949a = "has_more")
    public int hasMore;
    @C6593c(mo15949a = "min_cursor")
    public long minCursor;
    @C6593c(mo15949a = "status_code")
    public int statusCode;
    @C6593c(mo15949a = "status_msg")
    public String statusMsg;
}
