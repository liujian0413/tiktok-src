package com.p280ss.android.ugc.aweme.emoji.emojichoose.model;

import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.text.TextUtils;
import com.bytedance.common.utility.p482io.FileUtils;
import com.google.gson.p276a.C6593c;
import java.io.File;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.emoji.emojichoose.model.EmojiCreate */
public class EmojiCreate implements Serializable {
    @C6593c(mo15949a = "animate_type")
    private String animateType;
    @C6593c(mo15949a = "animate_uri")
    private String animateUrl;
    @C6593c(mo15949a = "height")
    private int height;
    @C6593c(mo15949a = "static_type")
    private String staticType;
    @C6593c(mo15949a = "static_uri")
    private String staticUrl;
    @C6593c(mo15949a = "width")
    private int width;

    public String getAnimateType() {
        return this.animateType;
    }

    public String getAnimateUrl() {
        return this.animateUrl;
    }

    public int getHeight() {
        return this.height;
    }

    public String getStaticType() {
        return this.staticType;
    }

    public String getStaticUrl() {
        return this.staticUrl;
    }

    public int getWidth() {
        return this.width;
    }

    public void setAnimateType(String str) {
        this.animateType = str;
    }

    public void setAnimateUrl(String str) {
        this.animateUrl = str;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setStaticType(String str) {
        this.staticType = str;
    }

    public void setStaticUrl(String str) {
        this.staticUrl = str;
    }

    public void setWidth(int i) {
        this.width = i;
    }

    public static EmojiCreate obtain(String str, String str2) {
        int i;
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        EmojiCreate emojiCreate = new EmojiCreate();
        emojiCreate.animateUrl = str2;
        emojiCreate.staticUrl = str2;
        Options options = new Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        int i2 = 0;
        if (options.outWidth == 0 || options.outHeight == 0) {
            i = 0;
        } else if (options.outWidth <= 140 && options.outHeight <= 140) {
            i2 = options.outWidth;
            i = options.outHeight;
        } else if (options.outWidth >= options.outHeight) {
            i = (options.outHeight * 140) / options.outWidth;
            i2 = 140;
        } else {
            i2 = (options.outWidth * 140) / options.outHeight;
            i = 140;
        }
        emojiCreate.width = i2;
        emojiCreate.height = i;
        if (FileUtils.m28673a(new File(str))) {
            emojiCreate.animateType = "gif";
            emojiCreate.staticType = "gif";
        } else {
            emojiCreate.animateType = "jpeg";
            emojiCreate.staticType = "jpeg";
        }
        return emojiCreate;
    }
}
