package com.bytedance.android.livesdkapi.depend.model.live;

import com.google.gson.p276a.C6593c;

public enum LiveMode {
    VIDEO("general", false, true),
    AUDIO("general", false, false),
    THIRD_PARTY("thirdparty", true, false),
    SCREEN_RECORD("game", true, false),
    OFFICIAL_ACTIVITY("official_activity", false, false);
    
    @C6593c(mo15949a = "isStreamingBackground")
    public final boolean isStreamingBackground;
    @C6593c(mo15949a = "isUsingCamera")
    public final boolean isUsingCamera;
    @C6593c(mo15949a = "logStreamingType")
    public final String logStreamingType;

    public static LiveMode valueOf(int i) {
        if (i < 0 || i >= values().length) {
            return VIDEO;
        }
        return values()[i];
    }

    private LiveMode(String str, boolean z, boolean z2) {
        this.logStreamingType = str;
        this.isStreamingBackground = z;
        this.isUsingCamera = z2;
    }
}
