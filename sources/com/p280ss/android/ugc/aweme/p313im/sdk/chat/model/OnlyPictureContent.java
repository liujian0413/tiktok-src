package com.p280ss.android.ugc.aweme.p313im.sdk.chat.model;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.google.gson.p276a.C6593c;
import com.p280ss.android.chooser.C19262f;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.photo.PhotoParam;
import com.p280ss.android.ugc.aweme.p313im.sdk.share.model.PureDataSharePackage;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.model.OnlyPictureContent */
public class OnlyPictureContent extends BaseContent {
    private static String ONLY_PICTURE_GINT = "";
    @C6593c(mo15949a = "compress_path")
    String compressPath;
    @C6593c(mo15949a = "cover_height")
    int height;
    @C6593c(mo15949a = "mime")
    String mime;
    @C6593c(mo15949a = "local_path")
    String picturePath;
    @C6593c(mo15949a = "send_raw")
    boolean sendRaw;
    @C6593c(mo15949a = "resource_url")
    UrlModel url;
    @C6593c(mo15949a = "cover_width")
    int width;

    public String getCompressPath() {
        return this.compressPath;
    }

    public int getHeight() {
        return this.height;
    }

    public String getMime() {
        return this.mime;
    }

    public String getPicturePath() {
        return this.picturePath;
    }

    public UrlModel getUrl() {
        return this.url;
    }

    public int getWidth() {
        return this.width;
    }

    public boolean isSendRaw() {
        return this.sendRaw;
    }

    public String getMsgHint() {
        super.getMsgHint();
        return ONLY_PICTURE_GINT;
    }

    public void tryInit() {
        if (TextUtils.isEmpty(ONLY_PICTURE_GINT)) {
            Context a = C6399b.m19921a();
            if (a != null) {
                ONLY_PICTURE_GINT = a.getString(R.string.bpj);
            }
        }
    }

    public SharePackage generateSharePackage() {
        PureDataSharePackage a = PureDataSharePackage.m103267a("pic");
        Bundle bundle = a.f20186l;
        if (getUrl() != null) {
            bundle.putSerializable("video_cover", getUrl());
        } else {
            UrlModel urlModel = new UrlModel();
            StringBuilder sb = new StringBuilder("file://");
            sb.append(getPicturePath());
            urlModel.setUri(sb.toString());
            bundle.putSerializable("video_cover", urlModel);
        }
        bundle.putInt("aweme_width", getWidth());
        bundle.putInt("aweme_height", getHeight());
        return a;
    }

    public void setCompressPath(String str) {
        this.compressPath = str;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setMime(String str) {
        this.mime = str;
    }

    public void setPicturePath(String str) {
        this.picturePath = str;
    }

    public void setSendRaw(boolean z) {
        this.sendRaw = z;
    }

    public void setUrl(UrlModel urlModel) {
        this.url = urlModel;
    }

    public void setWidth(int i) {
        this.width = i;
    }

    public static OnlyPictureContent obtain(C19262f fVar) {
        OnlyPictureContent onlyPictureContent = new OnlyPictureContent();
        onlyPictureContent.setPicturePath(fVar.f52149b);
        onlyPictureContent.setWidth(fVar.f52156i);
        onlyPictureContent.setHeight(fVar.f52157j);
        onlyPictureContent.setMime(fVar.f52154g);
        return onlyPictureContent;
    }

    public static OnlyPictureContent obtain(PhotoParam photoParam) {
        OnlyPictureContent onlyPictureContent = new OnlyPictureContent();
        onlyPictureContent.setPicturePath(photoParam.getPath());
        onlyPictureContent.setWidth(photoParam.getWith());
        onlyPictureContent.setHeight(photoParam.getHeight());
        onlyPictureContent.setMime(photoParam.getMime());
        return onlyPictureContent;
    }
}
