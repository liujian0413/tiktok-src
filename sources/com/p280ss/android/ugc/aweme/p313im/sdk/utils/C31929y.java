package com.p280ss.android.ugc.aweme.p313im.sdk.utils;

import com.C1642a;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6956a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.utils.y */
public final class C31929y {

    /* renamed from: a */
    private static final String[] f83402a = {"http://p1-dy.bytecdn.cn", "http://p3-dy.bytecdn.cn", "http://p9-dy.bytecdn.cn"};

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.utils.y$a */
    public static class C31931a {

        /* renamed from: d */
        public static String f83403d = "";

        /* renamed from: e */
        public static String f83404e = "large";

        /* renamed from: f */
        public static String f83405f = "medium";

        /* renamed from: g */
        public static String f83406g = "thumb";

        /* renamed from: a */
        List<String> f83407a;

        /* renamed from: b */
        String f83408b;

        /* renamed from: c */
        String f83409c;

        /* renamed from: h */
        private String f83410h;

        /* renamed from: c */
        private String m103692c() {
            return C1642a.m8034a("/img/%s~tplv-x-get:%s.image%s%s", new Object[]{this.f83408b, this.f83410h, "%%secretKey=", this.f83409c});
        }

        /* renamed from: a */
        public final List<String> mo82748a() {
            ArrayList arrayList = new ArrayList();
            String c = m103692c();
            if (this.f83407a != null && this.f83407a.size() > 0) {
                for (int i = 0; i < this.f83407a.size(); i++) {
                    StringBuilder sb = new StringBuilder();
                    sb.append((String) this.f83407a.get(i));
                    sb.append(c);
                    arrayList.add(sb.toString());
                }
            }
            return arrayList;
        }

        /* renamed from: b */
        public final String mo82749b() {
            String c = m103692c();
            if (this.f83407a == null || this.f83407a.size() <= 0) {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            sb.append((String) this.f83407a.get(0));
            sb.append(c);
            return sb.toString();
        }

        private C31931a(List<String> list, String str, String str2) {
            this.f83410h = f83403d;
            this.f83407a = list;
            this.f83408b = str;
            this.f83409c = str2;
        }
    }

    /* renamed from: a */
    public static C31931a m103691a(String str, String str2) {
        List<String> list = C6956a.m21632a().mo18009f().getIMSetting().f83745h;
        if (list == null || list.size() <= 0) {
            return new C31931a(Arrays.asList(f83402a), str, str2);
        }
        if (list.size() < 3) {
            int size = 3 - list.size();
            int i = 0;
            while (i < f83402a.length && i < size) {
                list.add(f83402a[i]);
                i++;
            }
        }
        return new C31931a(list, str, str2);
    }
}
