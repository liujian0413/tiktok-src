package com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.photo;

import com.p280ss.android.chooser.C19262f;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.OnlyPictureContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.model.MediaModel;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.photo.PhotoParam */
public class PhotoParam implements Serializable {
    private List<String> checkTexts;
    private int fromGallery = 1;
    private int height;
    private String mime;
    private String path;
    private int with;

    public List<String> getCheckTexts() {
        return this.checkTexts;
    }

    public int getFromGallery() {
        return this.fromGallery;
    }

    public int getHeight() {
        return this.height;
    }

    public String getMime() {
        return this.mime;
    }

    public String getPath() {
        return this.path;
    }

    public int getWith() {
        return this.with;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PhotoParam{path='");
        sb.append(this.path);
        sb.append('\'');
        sb.append(", mime='");
        sb.append(this.mime);
        sb.append('\'');
        sb.append(", with=");
        sb.append(this.with);
        sb.append(", height=");
        sb.append(this.height);
        sb.append(", fromGallery=");
        sb.append(this.fromGallery);
        sb.append(", checkTexts=");
        sb.append(this.checkTexts);
        sb.append('}');
        return sb.toString();
    }

    public void setCheckTexts(List<String> list) {
        this.checkTexts = list;
    }

    public void setFromGallery(int i) {
        this.fromGallery = i;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setMime(String str) {
        this.mime = str;
    }

    public void setPath(String str) {
        this.path = str;
    }

    public void setWith(int i) {
        this.with = i;
    }

    public static PhotoParam fromContent(OnlyPictureContent onlyPictureContent) {
        PhotoParam photoParam = new PhotoParam();
        photoParam.path = onlyPictureContent.getPicturePath();
        photoParam.mime = onlyPictureContent.getMime();
        photoParam.with = onlyPictureContent.getWidth();
        photoParam.height = onlyPictureContent.getHeight();
        return photoParam;
    }

    public static PhotoParam fromMediaModel(C19262f fVar) {
        if (fVar == null) {
            return null;
        }
        PhotoParam photoParam = new PhotoParam();
        photoParam.path = fVar.f52149b;
        photoParam.mime = fVar.f52154g;
        photoParam.with = fVar.f52156i;
        photoParam.height = fVar.f52157j;
        return photoParam;
    }

    public static PhotoParam fromMediaModel(MediaModel mediaModel) {
        if (mediaModel == null) {
            return null;
        }
        PhotoParam photoParam = new PhotoParam();
        photoParam.path = mediaModel.getFilePath();
        photoParam.mime = mediaModel.getMimeType();
        photoParam.with = mediaModel.getWidth();
        photoParam.height = mediaModel.getHeight();
        return photoParam;
    }

    public static ArrayList<PhotoParam> fromPhotoItems(List<C30897h> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        ArrayList<PhotoParam> arrayList = new ArrayList<>();
        for (C30897h hVar : list) {
            if (hVar != null) {
                arrayList.add(fromMediaModel(hVar.f80944a));
            }
        }
        return arrayList;
    }
}
