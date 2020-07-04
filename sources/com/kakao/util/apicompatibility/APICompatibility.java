package com.kakao.util.apicompatibility;

import android.content.Intent;
import android.os.Build.VERSION;

public abstract class APICompatibility {
    private static volatile APICompatibility instance;

    public abstract String getSmsMessage(Intent intent);

    public static APICompatibility getInstance() {
        if (instance == null) {
            synchronized (APICompatibility.class) {
                if (instance == null) {
                    int i = VERSION.SDK_INT;
                    if (i > 20) {
                        instance = new APILevel21Compatibility();
                    } else if (i > 18) {
                        instance = new APILevel19Compatibility();
                    } else {
                        instance = new APILevel9Compatibility();
                    }
                }
            }
        }
        return instance;
    }
}
