package com.p280ss.android.ugc.aweme.p313im.sdk.chat.model;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.model.SharePictureContent */
public class SharePictureContent extends ShareAwemeContent {
    private static String PICTURE_MSG_HINT = "";

    public int getAwemeType() {
        this.awemeType = 2;
        return 2;
    }

    public String getMsgHint() {
        super.getMsgHint();
        return PICTURE_MSG_HINT;
    }

    public void tryInit() {
        if (TextUtils.isEmpty(PICTURE_MSG_HINT)) {
            Context a = C6399b.m19921a();
            if (a != null) {
                PICTURE_MSG_HINT = a.getString(R.string.bpk);
            }
        }
    }

    public static SharePictureContent fromSharePackage(SharePackage sharePackage) {
        SharePictureContent sharePictureContent = new SharePictureContent();
        sharePictureContent.setUser(sharePackage.f20186l.getString("uid_for_share"));
        sharePictureContent.setItemId(sharePackage.f20186l.getString("item_id_string"));
        sharePictureContent.setCoverUrl((UrlModel) sharePackage.f20186l.getSerializable("video_cover"));
        sharePictureContent.setContentThumb((UrlModel) sharePackage.f20186l.getSerializable("thumb_url"));
        sharePictureContent.setContentName(sharePackage.f20186l.getString("author_name"));
        sharePictureContent.setWidth((float) sharePackage.f20186l.getInt("aweme_width"));
        sharePictureContent.setHeight((float) sharePackage.f20186l.getInt("aweme_height"));
        sharePictureContent.setAwemeType(2);
        sharePictureContent.setType(800);
        sharePictureContent.setTitle(sharePackage.f20183i);
        return sharePictureContent;
    }
}
