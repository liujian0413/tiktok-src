package com.p280ss.android.ugc.aweme.feed.model;

import com.google.gson.p276a.C6592b;
import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.utils.StringJsonAdapterFactory;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.feed.model.CommerceConfigData */
public class CommerceConfigData implements Serializable {
    @C6592b(mo15947a = StringJsonAdapterFactory.class)
    @C6593c(mo15949a = "data")
    public ItemCommentEggGroup itemCommentEggGroup;
    @C6593c(mo15949a = "item_like_egg")
    public ItemLikeEggData itemLikeEggData;
    @C6593c(mo15949a = "type")
    public int type;

    public ItemCommentEggGroup getItemCommentEggGroup() {
        return this.itemCommentEggGroup;
    }

    public ItemLikeEggData getItemLikeEggData() {
        return this.itemLikeEggData;
    }

    public int getType() {
        return this.type;
    }

    public void setItemCommentEggGroup(ItemCommentEggGroup itemCommentEggGroup2) {
        this.itemCommentEggGroup = itemCommentEggGroup2;
    }

    public void setItemLikeEggData(ItemLikeEggData itemLikeEggData2) {
        this.itemLikeEggData = itemLikeEggData2;
    }

    public void setType(int i) {
        this.type = i;
    }
}
