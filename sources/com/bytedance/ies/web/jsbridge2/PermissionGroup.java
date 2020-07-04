package com.bytedance.ies.web.jsbridge2;

import android.text.TextUtils;

public enum PermissionGroup {
    PUBLIC,
    PROTECTED,
    PRIVATE;

    static PermissionGroup from(String str) {
        if (TextUtils.isEmpty(str)) {
            return PUBLIC;
        }
        String lowerCase = str.toLowerCase();
        if (TextUtils.equals("protected", lowerCase)) {
            return PROTECTED;
        }
        if (TextUtils.equals("private", lowerCase)) {
            return PRIVATE;
        }
        return PUBLIC;
    }
}
