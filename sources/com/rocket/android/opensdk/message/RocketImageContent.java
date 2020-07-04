package com.rocket.android.opensdk.message;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.os.Bundle;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.ArrayList;

public class RocketImageContent implements IMediaObject {
    public byte[] mImageData;
    public String mImagePath;
    public ArrayList<String> mTimelineImagePaths;

    public RocketImageContent() {
    }

    public int type() {
        return 3;
    }

    public boolean checkArgs() {
        boolean z;
        if (this.mImageData == null || this.mImageData.length == 0 || this.mImageData.length > 460800) {
            z = false;
        } else {
            z = true;
        }
        if (!TextUtils.isEmpty(this.mImagePath)) {
            File file = new File(this.mImagePath);
            if (file.exists() && file.length() <= 10485760) {
                z = true;
            }
        }
        if (this.mTimelineImagePaths == null || this.mTimelineImagePaths.isEmpty() || this.mTimelineImagePaths.size() > 9) {
            return z;
        }
        return true;
    }

    public RocketImageContent(String str) {
        this.mImagePath = str;
    }

    public RocketImageContent(ArrayList<String> arrayList) {
        this.mTimelineImagePaths = new ArrayList<>();
        this.mTimelineImagePaths.addAll(arrayList);
    }

    public RocketImageContent(Bitmap bitmap) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(CompressFormat.JPEG, 85, byteArrayOutputStream);
            this.mImageData = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
        } catch (Exception unused) {
        }
    }

    public void serialize(Bundle bundle) {
        bundle.putByteArray("ROCKET_EXTRA_IMAGE_MESSAGE_DATA", this.mImageData);
        bundle.putString("ROCKET_EXTRA_IMAGE_MESSAGE_PATH", this.mImagePath);
        bundle.putStringArrayList("ROCKET_EXTRA_IMAGE_MESSAGE_TIMELINE_PATHs", this.mTimelineImagePaths);
    }

    public void unserialize(Bundle bundle) {
        this.mImageData = bundle.getByteArray("ROCKET_EXTRA_IMAGE_MESSAGE_DATA");
        this.mImagePath = bundle.getString("ROCKET_EXTRA_IMAGE_MESSAGE_PATH");
        this.mTimelineImagePaths = bundle.getStringArrayList("ROCKET_EXTRA_IMAGE_MESSAGE_TIMELINE_PATHs");
    }

    public RocketImageContent(byte[] bArr) {
        this.mImageData = bArr;
    }
}
