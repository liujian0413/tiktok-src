package com.p280ss.android.ugc.aweme.account.util;

import android.text.TextUtils;
import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.ss.android.ugc.aweme.account.util.d */
public final class C22325d {

    /* renamed from: a */
    public static final Set<Integer> f59597a = new HashSet(Arrays.asList(new Integer[]{Integer.valueOf(1), Integer.valueOf(6)}));

    /* renamed from: a */
    public static String m73917a(String str) {
        if (TextUtils.isEmpty(str) || !str.contains("third_party_")) {
            return null;
        }
        return str.replace("third_party_", "");
    }

    /* renamed from: b */
    public static boolean m73918b(String str) {
        List thirdpartyLoginBindSkip = C30199h.m98861a().getThirdpartyLoginBindSkip();
        if (!C6307b.m19566a((Collection<T>) thirdpartyLoginBindSkip) && thirdpartyLoginBindSkip.contains(Integer.valueOf(m73919c(str)))) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m73919c(java.lang.String r7) {
        /*
            int r0 = r7.hashCode()
            r1 = 4
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            r6 = -1
            switch(r0) {
                case -1530308138: goto L_0x0040;
                case -1134307907: goto L_0x0036;
                case -791575966: goto L_0x002c;
                case -471473230: goto L_0x0022;
                case 635922494: goto L_0x0018;
                case 1851692357: goto L_0x000e;
                default: goto L_0x000d;
            }
        L_0x000d:
            goto L_0x004a
        L_0x000e:
            java.lang.String r0 = "flipchat"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x004a
            r7 = 5
            goto L_0x004b
        L_0x0018:
            java.lang.String r0 = "toutiao_v2"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x004a
            r7 = 4
            goto L_0x004b
        L_0x0022:
            java.lang.String r0 = "sina_weibo"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x004a
            r7 = 2
            goto L_0x004b
        L_0x002c:
            java.lang.String r0 = "weixin"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x004a
            r7 = 1
            goto L_0x004b
        L_0x0036:
            java.lang.String r0 = "toutiao"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x004a
            r7 = 3
            goto L_0x004b
        L_0x0040:
            java.lang.String r0 = "qzone_sns"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x004a
            r7 = 0
            goto L_0x004b
        L_0x004a:
            r7 = -1
        L_0x004b:
            switch(r7) {
                case 0: goto L_0x0053;
                case 1: goto L_0x0052;
                case 2: goto L_0x0051;
                case 3: goto L_0x0050;
                case 4: goto L_0x0050;
                case 5: goto L_0x004f;
                default: goto L_0x004e;
            }
        L_0x004e:
            return r6
        L_0x004f:
            return r1
        L_0x0050:
            return r2
        L_0x0051:
            return r3
        L_0x0052:
            return r4
        L_0x0053:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.account.util.C22325d.m73919c(java.lang.String):int");
    }
}
