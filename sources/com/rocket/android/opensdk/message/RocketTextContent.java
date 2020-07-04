package com.rocket.android.opensdk.message;

import android.os.Bundle;
import android.text.TextUtils;

public class RocketTextContent implements IMediaObject {
    public String mText;

    public RocketTextContent() {
    }

    public int type() {
        return 2;
    }

    public boolean checkArgs() {
        if (TextUtils.isEmpty(this.mText) || this.mText.length() > 2000) {
            return false;
        }
        return true;
    }

    public RocketTextContent(String str) {
        this.mText = str;
    }

    public void serialize(Bundle bundle) {
        bundle.putString("ROCKET_EXTRA_TEXT_MESSAGE", this.mText);
    }

    public void unserialize(Bundle bundle) {
        this.mText = bundle.getString("ROCKET_EXTRA_TEXT_MESSAGE");
    }
}
