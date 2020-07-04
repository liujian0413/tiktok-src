package com.rocket.android.opensdk.message;

import android.os.Bundle;
import android.text.TextUtils;
import java.io.File;

public class RocketVideoContent implements IMediaObject {
    public String mVideoPath;

    public int type() {
        return 4;
    }

    public boolean checkArgs() {
        if (TextUtils.isEmpty(this.mVideoPath) || !new File(this.mVideoPath).exists()) {
            return false;
        }
        return true;
    }

    public void serialize(Bundle bundle) {
        bundle.putString("ROCKET_EXTRA_VIDEO_MESSAGE_PATH", this.mVideoPath);
    }

    public void unserialize(Bundle bundle) {
        this.mVideoPath = bundle.getString("ROCKET_EXTRA_VIDEO_MESSAGE_PATH");
    }
}
