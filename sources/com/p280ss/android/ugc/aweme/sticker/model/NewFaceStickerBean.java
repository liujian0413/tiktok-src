package com.p280ss.android.ugc.aweme.sticker.model;

import com.google.common.base.C17434j;
import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.share.ShareInfo;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean */
public class NewFaceStickerBean implements Serializable {
    @C6593c(mo15949a = "avatar_thumb")
    public UrlModel avatarThumb;
    @C6593c(mo15949a = "children")
    public List<String> children;
    @C6593c(mo15949a = "commerce_sticker")
    public CommerceSticker commerceSticker;
    @C6593c(mo15949a = "desc")
    public String desc;
    @C6593c(mo15949a = "extra")
    public String extra;
    @C6593c(mo15949a = "icon_url")
    public UrlModel iconUrl;
    @C6593c(mo15949a = "id")

    /* renamed from: id */
    public String f108868id;
    @C6593c(mo15949a = "is_favorite")
    public boolean isFavorite;
    public boolean mIsSelect;
    @C6593c(mo15949a = "sec_uid")
    public String mSecUid;
    @C6593c(mo15949a = "tags")
    public List<String> mTags;
    @C6593c(mo15949a = "name")
    public String name;
    @C6593c(mo15949a = "owner_id")
    public String ownerId;
    @C6593c(mo15949a = "owner_nickname")
    public String ownerName;
    @C6593c(mo15949a = "share_info")
    public ShareInfo shareInfo = new ShareInfo();
    @C6593c(mo15949a = "user_count")
    public long userCount;
    @C6593c(mo15949a = "vv_count")
    public long viewCount;

    public int hashCode() {
        return C17434j.m57954a(this.f108868id);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return C17434j.m57955a(this.f108868id, ((NewFaceStickerBean) obj).f108868id);
    }
}
