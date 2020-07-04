package com.rocket.android.opensdk.message;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class RocketMediaContent {
    public String mContent;
    public IMediaObject mMediaObject;
    public String mSource;
    public byte[] mThumbData;
    public String mThumbUrl;
    public String mTitle;

    public RocketMediaContent() {
    }

    public final int getType() {
        if (this.mMediaObject == null) {
            return 0;
        }
        return this.mMediaObject.type();
    }

    public final boolean checkArgs() {
        if (this.mThumbData != null && this.mThumbData.length > 32768) {
            return false;
        }
        if (this.mTitle != null && this.mTitle.length() > 512) {
            return false;
        }
        if (this.mContent != null && this.mContent.length() > 1024) {
            return false;
        }
        if ((TextUtils.isEmpty(this.mThumbUrl) || this.mThumbUrl.length() <= 1024) && this.mMediaObject != null) {
            return this.mMediaObject.checkArgs();
        }
        return false;
    }

    public RocketMediaContent(IMediaObject iMediaObject) {
        this.mMediaObject = iMediaObject;
    }

    public final void setThumbImage(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            bitmap.compress(CompressFormat.JPEG, 85, byteArrayOutputStream);
            this.mThumbData = byteArrayOutputStream.toByteArray();
        } finally {
            try {
                byteArrayOutputStream.close();
            } catch (IOException unused) {
            }
        }
    }
}
