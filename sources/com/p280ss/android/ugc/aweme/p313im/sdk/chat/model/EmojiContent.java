package com.p280ss.android.ugc.aweme.p313im.sdk.chat.model;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.common.utility.C6319n;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.emoji.model.Emoji;
import com.p280ss.android.ugc.aweme.emoji.p1202b.p1204b.C27507a;
import com.p280ss.android.ugc.aweme.emoji.utils.C27632c;
import com.p280ss.android.ugc.aweme.p313im.sdk.share.model.PureDataSharePackage;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage;
import com.p280ss.android.vesdk.filterparam.VETransitionFilterParam;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.model.EmojiContent */
public class EmojiContent extends BaseContent {
    private static String BIG_EMOJI_MESSAGE_HINT = "";
    @C6593c(mo15949a = "display_name")
    private String displayName;
    @C6593c(mo15949a = "height")
    int height;
    @C6593c(mo15949a = "image_id")
    private long imageId;
    @C6593c(mo15949a = "image_type")
    private String imageType;
    @C6593c(mo15949a = "package_id")
    private long packageId;
    @C6593c(mo15949a = "url")
    UrlModel url;
    @C6593c(mo15949a = "version")
    private String version;
    @C6593c(mo15949a = "width")
    int width;

    public String getDisplayName() {
        return this.displayName;
    }

    public int getHeight() {
        return this.height;
    }

    public long getImageId() {
        return this.imageId;
    }

    public String getImageType() {
        return this.imageType;
    }

    public long getPackageId() {
        return this.packageId;
    }

    public UrlModel getUrl() {
        return this.url;
    }

    public String getVersion() {
        return this.version;
    }

    public int getWidth() {
        return this.width;
    }

    public SharePackage generateSharePackage() {
        PureDataSharePackage a = PureDataSharePackage.m103267a("gif");
        Bundle bundle = a.f20186l;
        bundle.putSerializable("video_cover", getUrl());
        bundle.putInt("aweme_type", getType());
        return a;
    }

    public void tryInit() {
        if (TextUtils.isEmpty(BIG_EMOJI_MESSAGE_HINT)) {
            Context a = C6399b.m19921a();
            if (a != null) {
                BIG_EMOJI_MESSAGE_HINT = a.getString(R.string.bh4);
            }
        }
    }

    public UrlModel getLocalUrl() {
        String str;
        if (getType() == 502) {
            return null;
        }
        if (getType() == 501) {
            str = C27632c.m90588a(0, "0", this.imageId, this.imageType);
        } else {
            str = C27632c.m90588a(this.packageId, this.version, this.imageId, this.imageType);
        }
        if (!new File(str).exists()) {
            return null;
        }
        UrlModel urlModel = new UrlModel();
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder("file://");
        sb.append(str);
        arrayList.add(sb.toString());
        urlModel.setUrlList(arrayList);
        StringBuilder sb2 = new StringBuilder("file://");
        sb2.append(str);
        urlModel.setUri(sb2.toString());
        return urlModel;
    }

    public String getMsgHint() {
        if (501 == getType()) {
            StringBuilder sb = new StringBuilder("[");
            sb.append(C6399b.m19921a().getString(R.string.bj0));
            sb.append("]");
            return sb.toString();
        } else if (!C6319n.m19593a(getDisplayName())) {
            StringBuilder sb2 = new StringBuilder("[");
            sb2.append(getDisplayName());
            sb2.append("]");
            return sb2.toString();
        } else {
            super.getMsgHint();
            return BIG_EMOJI_MESSAGE_HINT;
        }
    }

    public void setDisplayName(String str) {
        this.displayName = str;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setImageId(long j) {
        this.imageId = j;
    }

    public void setImageType(String str) {
        this.imageType = str;
    }

    public void setPackageId(long j) {
        this.packageId = j;
    }

    public void setUrl(UrlModel urlModel) {
        this.url = urlModel;
    }

    public void setVersion(String str) {
        this.version = str;
    }

    public void setWidth(int i) {
        this.width = i;
    }

    public static EmojiContent obtain(Emoji emoji) {
        EmojiContent emojiContent = new EmojiContent();
        emojiContent.setUrl(emoji.getAnimateUrl());
        emojiContent.setImageId(emoji.getId());
        emojiContent.setDisplayName(C27507a.m90162b(emoji));
        emojiContent.setImageType(emoji.getAnimateType());
        emojiContent.setPackageId(emoji.getResourcesId());
        emojiContent.setVersion(emoji.getVersion());
        emojiContent.setWidth(emoji.getWidth());
        emojiContent.setHeight(emoji.getHeight());
        if (emoji.getStickerType() == 2) {
            emojiContent.setType(501);
        } else if (emoji.getStickerType() == 3) {
            emojiContent.setType(502);
        } else {
            emojiContent.setType(VETransitionFilterParam.TransitionDuration_DEFAULT);
        }
        return emojiContent;
    }
}
