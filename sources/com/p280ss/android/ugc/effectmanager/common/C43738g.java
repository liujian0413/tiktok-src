package com.p280ss.android.ugc.effectmanager.common;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.ss.android.ugc.effectmanager.common.g */
final class C43738g {
    /* renamed from: a */
    static int m138611a(String str, String str2) {
        Matcher matcher = Pattern.compile(str2).matcher(str);
        int i = -1;
        while (matcher.find()) {
            i = matcher.start();
        }
        return i;
    }
}
