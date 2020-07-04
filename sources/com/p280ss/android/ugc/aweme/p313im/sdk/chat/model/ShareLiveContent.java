package com.p280ss.android.ugc.aweme.p313im.sdk.chat.model;

import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.p313im.sdk.share.model.PureDataSharePackage.C31820a;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.model.ShareLiveContent */
public class ShareLiveContent extends BaseContent {
    @C6593c(mo15949a = "push_detail")
    private String pushDetail;
    @C6593c(mo15949a = "cover_url")
    private UrlModel roomCover;
    @C6593c(mo15949a = "room_description")
    private String roomDesc;
    @C6593c(mo15949a = "room_id")
    private String roomId;
    @C6593c(mo15949a = "room_owner_avatar")
    private UrlModel roomOwnerAvatar;
    @C6593c(mo15949a = "room_owner_id")
    private String roomOwnerId;
    @C6593c(mo15949a = "room_owner_name")
    private String roomOwnerName;
    @C6593c(mo15949a = "room_owner_sec_id")
    private String roomSecOwnerId;

    public String getPushDetail() {
        return this.pushDetail;
    }

    public UrlModel getRoomCover() {
        return this.roomCover;
    }

    public String getRoomDesc() {
        return this.roomDesc;
    }

    public String getRoomId() {
        return this.roomId;
    }

    public UrlModel getRoomOwnerAvatar() {
        return this.roomOwnerAvatar;
    }

    public String getRoomOwnerId() {
        return this.roomOwnerId;
    }

    public String getRoomOwnerName() {
        return this.roomOwnerName;
    }

    public String getRoomSecOwnerId() {
        return this.roomSecOwnerId;
    }

    public String getMsgHint() {
        return C6399b.m19921a().getString(R.string.bmf, new Object[]{getRoomOwnerName()});
    }

    public SharePackage generateSharePackage() {
        SharePackage a = new C31820a().mo18868d("live").mo18869e(getRoomId()).mo18866a();
        Bundle bundle = a.f20186l;
        bundle.putString("live_id", getRoomOwnerId());
        bundle.putSerializable("video_cover", getRoomCover());
        bundle.putString("author_name", getRoomOwnerName());
        bundle.putSerializable("thumb_for_share", getRoomOwnerAvatar());
        if (!TextUtils.isEmpty(getRoomDesc())) {
            bundle.putString("room_title", getRoomDesc());
        }
        return a;
    }

    public void setPushDetail(String str) {
        this.pushDetail = str;
    }

    public void setRoomCover(UrlModel urlModel) {
        this.roomCover = urlModel;
    }

    public void setRoomDesc(String str) {
        this.roomDesc = str;
    }

    public void setRoomId(String str) {
        this.roomId = str;
    }

    public void setRoomOwnerAvatar(UrlModel urlModel) {
        this.roomOwnerAvatar = urlModel;
    }

    public void setRoomOwnerId(String str) {
        this.roomOwnerId = str;
    }

    public void setRoomOwnerName(String str) {
        this.roomOwnerName = str;
    }

    public void setRoomSecOwnerId(String str) {
        this.roomSecOwnerId = str;
    }

    public static ShareLiveContent fromSharePackage(SharePackage sharePackage) {
        ShareLiveContent shareLiveContent = new ShareLiveContent();
        shareLiveContent.setRoomId(sharePackage.f20182h);
        shareLiveContent.setRoomOwnerId(sharePackage.f20186l.getString("live_id"));
        shareLiveContent.setRoomSecOwnerId(sharePackage.f20186l.getString("sec_user_id"));
        shareLiveContent.setRoomOwnerName(sharePackage.f20186l.getString("author_name"));
        Serializable serializable = sharePackage.f20186l.getSerializable("thumb_for_share");
        boolean z = serializable instanceof UrlModel;
        if (z) {
            shareLiveContent.setRoomOwnerAvatar((UrlModel) serializable);
        }
        shareLiveContent.setPushDetail(sharePackage.f20186l.getString("author_name"));
        if (sharePackage.f20186l.containsKey("room_title")) {
            shareLiveContent.setRoomDesc(sharePackage.f20186l.getString("room_title"));
        }
        Serializable serializable2 = sharePackage.f20186l.getSerializable("video_cover");
        if (serializable2 instanceof UrlModel) {
            shareLiveContent.setRoomCover((UrlModel) serializable2);
        } else if (z) {
            shareLiveContent.setRoomCover((UrlModel) serializable);
        } else {
            shareLiveContent.setRoomCover(null);
        }
        return shareLiveContent;
    }
}
