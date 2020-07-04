package com.rocket.android.opensdk.message;

import android.os.Bundle;
import android.text.TextUtils;

public class RocketWebPageContent implements IMediaObject {
    public String mUrl;

    public RocketWebPageContent() {
    }

    public int type() {
        return 1;
    }

    public boolean checkArgs() {
        if (TextUtils.isEmpty(this.mUrl) || this.mUrl.length() > 10240) {
            return false;
        }
        return true;
    }

    public RocketWebPageContent(String str) {
        this.mUrl = str;
    }

    public void serialize(Bundle bundle) {
        bundle.putString("ROCKET_EXTRA_WEB_MESSAGE_URL", this.mUrl);
    }

    public void unserialize(Bundle bundle) {
        this.mUrl = bundle.getString("ROCKET_EXTRA_WEB_MESSAGE_URL");
    }
}
