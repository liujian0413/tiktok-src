package com.p280ss.android.ugc.aweme.emoji.smallemoji.online.model;

import com.google.gson.p276a.C6593c;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.emoji.smallemoji.online.model.OnlineSmallEmojiResInfo */
public final class OnlineSmallEmojiResInfo implements Serializable {
    @C6593c(mo15949a = "display_name")
    private String displayName = "";
    @C6593c(mo15949a = "id")

    /* renamed from: id */
    private long f72807id;
    private String md5 = "";
    @C6593c(mo15949a = "mini_cover")
    private String miniCover = "";
    private String picFileDirPath = "";
    private String resDirPath = "";
    @C6593c(mo15949a = "stickers")
    private List<OnlineSmallEmoji> stickers;
    @C6593c(mo15949a = "version")
    private long version;

    public final String getDisplayName() {
        return this.displayName;
    }

    public final long getId() {
        return this.f72807id;
    }

    public final String getMd5() {
        return this.md5;
    }

    public final String getMiniCover() {
        return this.miniCover;
    }

    public final String getPicFileDirPath() {
        return this.picFileDirPath;
    }

    public final String getResDirPath() {
        return this.resDirPath;
    }

    public final List<OnlineSmallEmoji> getStickers() {
        return this.stickers;
    }

    public final long getVersion() {
        return this.version;
    }

    public final String toString() {
        Integer num;
        StringBuilder sb = new StringBuilder("OnlineSmallEmojiResInfo{md5=");
        sb.append(this.md5);
        sb.append(", resDirPath=");
        sb.append(this.resDirPath);
        sb.append(", picFilePath=");
        sb.append(this.picFileDirPath);
        sb.append(", stickers=");
        List<OnlineSmallEmoji> list = this.stickers;
        if (list != null) {
            num = Integer.valueOf(list.size());
        } else {
            num = null;
        }
        sb.append(num);
        sb.append('}');
        return sb.toString();
    }

    public final boolean isValid() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        Collection collection = this.stickers;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            if (this.md5.length() > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (this.resDirPath.length() > 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    if (this.picFileDirPath.length() > 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z4) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void setDisplayName(String str) {
        this.displayName = str;
    }

    public final void setId(long j) {
        this.f72807id = j;
    }

    public final void setMiniCover(String str) {
        this.miniCover = str;
    }

    public final void setStickers(List<OnlineSmallEmoji> list) {
        this.stickers = list;
    }

    public final void setVersion(long j) {
        this.version = j;
    }

    public final void setMd5(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.md5 = str;
    }

    public final void setPicFileDirPath(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.picFileDirPath = str;
    }

    public final void setResDirPath(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.resDirPath = str;
    }
}
