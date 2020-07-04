package com.p280ss.android.ugc.aweme.p313im.sdk.chat.model;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.p313im.sdk.share.model.PureDataSharePackage;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.model.ShareMusicContent */
public class ShareMusicContent extends BaseContent {
    @C6593c(mo15949a = "cover_url")
    private List<UrlModel> awemeCoverList;
    @C6593c(mo15949a = "music_cover")
    private UrlModel coverThumb;
    @C6593c(mo15949a = "music_id")
    private String musicId;
    @C6593c(mo15949a = "title")
    private String musicName;
    @C6593c(mo15949a = "push_detail")
    private String pushDetail;
    @C6593c(mo15949a = "user_count")
    private int userCount;

    public List<UrlModel> getAwemeCoverList() {
        return this.awemeCoverList;
    }

    public UrlModel getCoverThumb() {
        return this.coverThumb;
    }

    public String getMusicId() {
        return this.musicId;
    }

    public String getMusicName() {
        return this.musicName;
    }

    public String getPushDetail() {
        return this.pushDetail;
    }

    public int getUserCount() {
        return this.userCount;
    }

    public SharePackage generateSharePackage() {
        PureDataSharePackage a = PureDataSharePackage.m103267a("music");
        a.f20186l.putSerializable("video_cover", getCoverThumb());
        return a;
    }

    public String getMsgHint() {
        return C6399b.m19921a().getString(R.string.bn6, new Object[]{getMusicName()});
    }

    public void setAwemeCoverList(List<UrlModel> list) {
        this.awemeCoverList = list;
    }

    public void setCoverThumb(UrlModel urlModel) {
        this.coverThumb = urlModel;
    }

    public void setMusicId(String str) {
        this.musicId = str;
    }

    public void setMusicName(String str) {
        this.musicName = str;
    }

    public void setPushDetail(String str) {
        this.pushDetail = str;
    }

    public void setUserCount(int i) {
        this.userCount = i;
    }

    public static ShareMusicContent fromSharePackage(SharePackage sharePackage) {
        String string = sharePackage.f20186l.getString("music_id");
        String string2 = sharePackage.f20186l.getString("music_name");
        int i = sharePackage.f20186l.getInt("user_count");
        UrlModel urlModel = (UrlModel) sharePackage.f20186l.getSerializable("video_cover");
        UrlModel urlModel2 = (UrlModel) sharePackage.f20186l.getSerializable("cover_thumb");
        String string3 = sharePackage.f20186l.getString("aweme_cover_list");
        ShareMusicContent shareMusicContent = new ShareMusicContent();
        shareMusicContent.musicId = string;
        shareMusicContent.musicName = string2;
        shareMusicContent.pushDetail = shareMusicContent.musicName;
        shareMusicContent.userCount = i;
        if (urlModel != null) {
            shareMusicContent.coverThumb = urlModel;
        } else if (urlModel2 != null) {
            shareMusicContent.coverThumb = urlModel2;
        }
        if (!TextUtils.isEmpty(string3)) {
            shareMusicContent.awemeCoverList = (List) JSON.parseObject(string3, List.class);
        }
        return shareMusicContent;
    }
}
