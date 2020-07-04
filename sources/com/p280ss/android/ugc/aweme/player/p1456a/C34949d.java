package com.p280ss.android.ugc.aweme.player.p1456a;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.player.a.d */
public final class C34949d {

    /* renamed from: a */
    public static final C34949d f91179a = new C34949d();

    /* renamed from: b */
    private static List<String> f91180b;

    private C34949d() {
    }

    static {
        List<String> arrayList = new ArrayList<>();
        f91180b = arrayList;
        arrayList.add("TCP_HIT");
        List<String> list = f91180b;
        if (list == null) {
            C7573i.m23580a();
        }
        list.add("TCP_MISS");
        List<String> list2 = f91180b;
        if (list2 == null) {
            C7573i.m23580a();
        }
        list2.add("HIT, HIT");
        List<String> list3 = f91180b;
        if (list3 == null) {
            C7573i.m23580a();
        }
        list3.add("HIT, MISS");
        List<String> list4 = f91180b;
        if (list4 == null) {
            C7573i.m23580a();
        }
        list4.add("MISS, HIT");
        List<String> list5 = f91180b;
        if (list5 == null) {
            C7573i.m23580a();
        }
        list5.add("MISS, MISS");
        List<String> list6 = f91180b;
        if (list6 == null) {
            C7573i.m23580a();
        }
        list6.add("HIT");
        List<String> list7 = f91180b;
        if (list7 == null) {
            C7573i.m23580a();
        }
        list7.add("MISS");
        List<String> list8 = f91180b;
        if (list8 == null) {
            C7573i.m23580a();
        }
        list8.add("TCP_MEM_HIT");
        List<String> list9 = f91180b;
        if (list9 == null) {
            C7573i.m23580a();
        }
        list9.add("TCP_REFRESH_HIT");
        List<String> list10 = f91180b;
        if (list10 == null) {
            C7573i.m23580a();
        }
        list10.add("TCP_REFRESH_MISS");
        List<String> list11 = f91180b;
        if (list11 == null) {
            C7573i.m23580a();
        }
        list11.add("TCP_REFRESH_FAIL_HIT");
        List<String> list12 = f91180b;
        if (list12 == null) {
            C7573i.m23580a();
        }
        list12.add("TCP_IMS_HIT");
        List<String> list13 = f91180b;
        if (list13 == null) {
            C7573i.m23580a();
        }
        list13.add("TCP_NEGATIVE_HIT");
    }

    /* renamed from: a */
    public static int m112623a(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        List<String> list = f91180b;
        if (list == null) {
            C7573i.m23580a();
        }
        for (String str2 : list) {
            if (str == null) {
                C7573i.m23580a();
            }
            if (C7634n.m23721b(str, str2, false)) {
                List<String> list2 = f91180b;
                if (list2 == null) {
                    C7573i.m23580a();
                }
                return list2.indexOf(str2) + 1;
            }
        }
        return 0;
    }
}
