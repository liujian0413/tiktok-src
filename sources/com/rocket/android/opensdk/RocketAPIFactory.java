package com.rocket.android.opensdk;

import android.content.Context;

public class RocketAPIFactory {
    public static IRocketAPI createRocketAPI(Context context, String str) {
        return new RocketAPI(context, str);
    }

    public static IRocketAPI createRocketAPI(Context context, String str, boolean z) {
        return new RocketAPI(context, str, z);
    }
}
