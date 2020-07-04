package com.p280ss.android.ugc.aweme.p313im.sdk.chat.model;

import android.os.Bundle;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.emoji.model.Emoji;
import com.p280ss.android.ugc.aweme.emoji.p1202b.p1204b.C27507a;
import com.p280ss.android.ugc.aweme.p313im.sdk.share.model.PureDataSharePackage;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.model.StickerEmojiContent */
public class StickerEmojiContent extends EmojiContent {
    public UrlModel getLocalUrl() {
        return null;
    }

    public SharePackage generateSharePackage() {
        PureDataSharePackage a = PureDataSharePackage.m103267a("gif");
        Bundle bundle = a.f20186l;
        bundle.putSerializable("video_cover", getUrl());
        bundle.putInt("aweme_type", getType());
        return a;
    }

    public String getMsgHint() {
        StringBuilder sb = new StringBuilder("[");
        sb.append(C6399b.m19921a().getString(R.string.bj0));
        sb.append("]");
        return sb.toString();
    }

    public static StickerEmojiContent obtain(Emoji emoji) {
        StickerEmojiContent stickerEmojiContent = new StickerEmojiContent();
        stickerEmojiContent.setUrl(emoji.getAnimateUrl());
        stickerEmojiContent.setImageId(emoji.getId());
        stickerEmojiContent.setDisplayName(C27507a.m90162b(emoji));
        stickerEmojiContent.setImageType(emoji.getAnimateType());
        stickerEmojiContent.setPackageId(emoji.getResourcesId());
        stickerEmojiContent.setVersion(emoji.getVersion());
        stickerEmojiContent.setWidth(emoji.getWidth());
        stickerEmojiContent.setHeight(emoji.getHeight());
        return stickerEmojiContent;
    }
}
