package com.p280ss.android.ugc.aweme.p313im.sdk.chat.model;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.photo.PhotoParam;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.net.upload.EncryptUrlModel;
import com.p280ss.android.ugc.aweme.p313im.sdk.share.model.PureDataSharePackage;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31932z;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.model.StoryPictureContent */
public class StoryPictureContent extends BaseContent {
    public static String STORY_PICTURE_HINT = "";
    @C6593c(mo15949a = "check_pics")
    List<String> checkPics;
    @C6593c(mo15949a = "check_texts")
    List<String> checkTexts;
    String compressPath;
    @C6593c(mo15949a = "from_gallery")
    int fromGallery;
    @C6593c(mo15949a = "cover_height")
    int height;
    @C6593c(mo15949a = "mass_msg")
    int massMsg;
    @C6593c(mo15949a = "md5")
    String md5;
    String picturePath;
    boolean sendRaw;
    @C6593c(mo15949a = "resource_url")
    EncryptUrlModel url;
    @C6593c(mo15949a = "cover_width")
    int width;

    public List<String> getCheckPics() {
        return this.checkPics;
    }

    public List<String> getCheckTexts() {
        return this.checkTexts;
    }

    public String getCompressPath() {
        return this.compressPath;
    }

    public int getFromGallery() {
        return this.fromGallery;
    }

    public int getHeight() {
        return this.height;
    }

    public int getMassMsg() {
        return this.massMsg;
    }

    public String getMd5() {
        return this.md5;
    }

    public String getPicturePath() {
        return this.picturePath;
    }

    public int getWidth() {
        return this.width;
    }

    public boolean isSendRaw() {
        return this.sendRaw;
    }

    public String getMsgHint() {
        super.getMsgHint();
        return STORY_PICTURE_HINT;
    }

    public UrlModel getUrl() {
        if (this.url == null) {
            return null;
        }
        return EncryptUrlModel.convert(this.url);
    }

    public void tryInit() {
        if (TextUtils.isEmpty(STORY_PICTURE_HINT)) {
            Context a = C6399b.m19921a();
            if (a != null) {
                STORY_PICTURE_HINT = a.getString(R.string.bqi);
            }
        }
    }

    public SharePackage generateSharePackage() {
        PureDataSharePackage a = PureDataSharePackage.m103267a("pic");
        Bundle bundle = a.f20186l;
        UrlModel url2 = getUrl();
        if (url2 == null) {
            url2 = new UrlModel();
            StringBuilder sb = new StringBuilder("file://");
            sb.append(getPicturePath());
            url2.setUri(sb.toString());
        }
        bundle.putSerializable("video_cover", url2);
        a.f20186l.putInt("aweme_width", getWidth());
        a.f20186l.putInt("aweme_height", getHeight());
        return a;
    }

    public void setCheckPics(List<String> list) {
        this.checkPics = list;
    }

    public void setCheckTexts(List<String> list) {
        this.checkTexts = list;
    }

    public void setCompressPath(String str) {
        this.compressPath = str;
    }

    public void setFromGallery(int i) {
        this.fromGallery = i;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setMassMsg(int i) {
        this.massMsg = i;
    }

    public void setMd5(String str) {
        this.md5 = str;
    }

    public void setPicturePath(String str) {
        this.picturePath = str;
    }

    public void setSendRaw(boolean z) {
        this.sendRaw = z;
    }

    public void setUrl(EncryptUrlModel encryptUrlModel) {
        this.url = encryptUrlModel;
    }

    public void setWidth(int i) {
        this.width = i;
    }

    public static StoryPictureContent obtain(PhotoParam photoParam) {
        StoryPictureContent storyPictureContent = new StoryPictureContent();
        storyPictureContent.setMd5(C31932z.m103709d(photoParam.getPath()));
        storyPictureContent.setFromGallery(photoParam.getFromGallery());
        storyPictureContent.setCheckTexts(photoParam.getCheckTexts());
        storyPictureContent.setPicturePath(photoParam.getPath());
        storyPictureContent.setHeight(photoParam.getHeight());
        storyPictureContent.setWidth(photoParam.getWith());
        storyPictureContent.setMassMsg(0);
        storyPictureContent.setType(2700);
        return storyPictureContent;
    }
}
