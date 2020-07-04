package com.p280ss.android.ugc.aweme.opensdk.share.base;

import android.os.Bundle;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.opensdk.share.base.TikTokImageObject */
public class TikTokImageObject implements C34682a {
    private static final String TAG = "TikTokImageObject";
    public ArrayList<String> mImagePaths;

    public TikTokImageObject() {
    }

    public boolean checkArgs() {
        return true;
    }

    public int type() {
        return 2;
    }

    public void serialize(Bundle bundle) {
        bundle.putStringArrayList("AWEME_EXTRA_IMAGE_MESSAGE_PATH", this.mImagePaths);
    }

    public TikTokImageObject(ArrayList<String> arrayList) {
        this.mImagePaths = new ArrayList<>();
        this.mImagePaths.addAll(arrayList);
    }

    public void unserialize(Bundle bundle) {
        this.mImagePaths = bundle.getStringArrayList("AWEME_EXTRA_IMAGE_MESSAGE_PATH");
    }
}
