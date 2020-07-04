package com.p280ss.android.ugc.aweme.poi.event;

import android.text.TextUtils;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.poi.event.FinishMapEvent */
public class FinishMapEvent implements Serializable {
    public static String pageKey;

    public boolean isSamePage(String str) {
        if (TextUtils.isEmpty(pageKey) || !pageKey.equalsIgnoreCase(str)) {
            return false;
        }
        return true;
    }
}
