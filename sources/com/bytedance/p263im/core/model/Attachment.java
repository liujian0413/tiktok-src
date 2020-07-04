package com.bytedance.p263im.core.model;

import android.net.Uri;
import com.bytedance.p263im.core.internal.utils.C11401b;
import java.io.File;
import java.io.Serializable;
import java.util.Map;

/* renamed from: com.bytedance.im.core.model.Attachment */
public class Attachment implements Serializable {
    private String displayType;
    private Map<String, String> ext;
    private String hash;
    private int index;
    private long length;
    private String localPath;
    private String mimeType;
    private String msgUuid;
    private String remoteUrl;
    private int status;
    private String type;
    private int uploadProgress;

    public String getDisplayType() {
        return this.displayType;
    }

    public Map<String, String> getExt() {
        return this.ext;
    }

    public String getHash() {
        return this.hash;
    }

    public int getIndex() {
        return this.index;
    }

    public long getLength() {
        return this.length;
    }

    public String getLocalPath() {
        return this.localPath;
    }

    public String getMimeType() {
        return this.mimeType;
    }

    public String getMsgUuid() {
        return this.msgUuid;
    }

    public String getRemoteUrl() {
        return this.remoteUrl;
    }

    public int getStatus() {
        return this.status;
    }

    public String getType() {
        return this.type;
    }

    public int getUploadProgress() {
        return this.uploadProgress;
    }

    public String getExtStr() {
        return C11401b.m33573a(this.ext);
    }

    public Uri getLocalUri() {
        return Uri.fromFile(new File(this.localPath));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Attachment{msgUuid='");
        sb.append(this.msgUuid);
        sb.append('\'');
        sb.append(", localPath='");
        sb.append(this.localPath);
        sb.append('\'');
        sb.append(", remoteUrl='");
        sb.append(this.remoteUrl);
        sb.append('\'');
        sb.append(", length=");
        sb.append(this.length);
        sb.append(", type='");
        sb.append(this.type);
        sb.append('\'');
        sb.append(", index=");
        sb.append(this.index);
        sb.append(", uploadProgress=");
        sb.append(this.uploadProgress);
        sb.append(", ext=");
        sb.append(this.ext);
        sb.append(", status=");
        sb.append(this.status);
        sb.append(", hash='");
        sb.append(this.hash);
        sb.append('\'');
        sb.append(", displayType='");
        sb.append(this.displayType);
        sb.append('\'');
        sb.append(", mimeType='");
        sb.append(this.mimeType);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }

    public void setDisplayType(String str) {
        this.displayType = str;
    }

    public void setExt(Map<String, String> map) {
        this.ext = map;
    }

    public void setHash(String str) {
        this.hash = str;
    }

    public void setIndex(int i) {
        this.index = i;
    }

    public void setLength(long j) {
        this.length = j;
    }

    public void setLocalPath(String str) {
        this.localPath = str;
    }

    public void setMimeType(String str) {
        this.mimeType = str;
    }

    public void setMsgUuid(String str) {
        this.msgUuid = str;
    }

    public void setRemoteUrl(String str) {
        this.remoteUrl = str;
    }

    public void setStatus(int i) {
        this.status = i;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setUploadProgress(int i) {
        this.uploadProgress = i;
    }

    public void setExtStr(String str) {
        this.ext = C11401b.m33577a(str);
    }

    public void setLocalUri(Uri uri) {
        String str;
        if (uri != null) {
            str = uri.getPath();
        } else {
            str = "";
        }
        this.localPath = str;
    }
}
