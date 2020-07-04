package com.p280ss.android.ugc.aweme.music.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.music.model.MusicCollection */
public class MusicCollection extends BaseResponse {
    @C6593c(mo15949a = "cursor")
    public long cursor;
    @C6593c(mo15949a = "has_more")
    public boolean hasMore;
    @C6593c(mo15949a = "mc_list")
    public List<MusicCollectionItem> items;

    public List<MusicCollectionItem> getItems() {
        if (this.items == null || this.items.isEmpty()) {
            return this.items;
        }
        return MusicCollectionFilterKt.distinctByName(this.items);
    }
}
