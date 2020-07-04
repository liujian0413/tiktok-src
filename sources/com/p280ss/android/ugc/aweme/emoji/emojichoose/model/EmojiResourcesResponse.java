package com.p280ss.android.ugc.aweme.emoji.emojichoose.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.emoji.emojichoose.model.EmojiResourcesResponse */
public class EmojiResourcesResponse extends BaseResponse {
    @C6593c(mo15949a = "resources")
    private List<EmojiResources> resources;

    public List<EmojiResources> getResources() {
        return this.resources;
    }

    public void setResources(List<EmojiResources> list) {
        this.resources = list;
    }
}
