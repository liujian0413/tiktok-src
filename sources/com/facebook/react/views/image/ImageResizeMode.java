package com.facebook.react.views.image;

import com.facebook.drawee.drawable.C13421p.C13423b;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;

public class ImageResizeMode {
    public static C13423b defaultValue() {
        return C13423b.f35599g;
    }

    public static C13423b toScaleType(String str) {
        if ("contain".equals(str)) {
            return C13423b.f35595c;
        }
        if ("cover".equals(str)) {
            return C13423b.f35599g;
        }
        if ("stretch".equals(str)) {
            return C13423b.f35593a;
        }
        if ("center".equals(str)) {
            return C13423b.f35598f;
        }
        if (str == null) {
            return defaultValue();
        }
        StringBuilder sb = new StringBuilder("Invalid resize mode: '");
        sb.append(str);
        sb.append("'");
        throw new JSApplicationIllegalArgumentException(sb.toString());
    }
}
