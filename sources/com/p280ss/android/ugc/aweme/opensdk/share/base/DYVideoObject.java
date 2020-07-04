package com.p280ss.android.ugc.aweme.opensdk.share.base;

import android.os.Bundle;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.opensdk.share.base.DYVideoObject */
public class DYVideoObject implements C34682a {
    private static final String TAG = "DYVideoObject";
    public ArrayList<String> mVideoPaths;

    public boolean checkArgs() {
        return true;
    }

    public int type() {
        return 3;
    }

    public void serialize(Bundle bundle) {
        bundle.putStringArrayList("AWEME_EXTRA_VIDEO_MESSAGE_PATH", this.mVideoPaths);
    }

    public void unserialize(Bundle bundle) {
        this.mVideoPaths = bundle.getStringArrayList("AWEME_EXTRA_VIDEO_MESSAGE_PATH");
    }
}
