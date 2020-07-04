package com.p280ss.android.ugc.aweme.emoji.emojichoose.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.emoji.model.Emoji;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.emoji.emojichoose.model.EmojiResources */
public class EmojiResources extends Resources {
    @C6593c(mo15949a = "package_type")
    private int packageType;
    @C6593c(mo15949a = "resource_type")
    private int resourceType;
    @C6593c(mo15949a = "stickers")
    private List<Emoji> stickers;

    public int getPackageType() {
        return this.packageType;
    }

    public int getResourceType() {
        return this.resourceType;
    }

    public List<Emoji> getStickers() {
        return this.stickers;
    }

    public void setPackageType(int i) {
        this.packageType = i;
    }

    public void setResourceType(int i) {
        this.resourceType = i;
    }

    public void setStickers(List<Emoji> list) {
        this.stickers = list;
    }
}
