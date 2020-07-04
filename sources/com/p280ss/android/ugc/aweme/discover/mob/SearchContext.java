package com.p280ss.android.ugc.aweme.discover.mob;

import android.view.View;
import com.p280ss.android.ugc.aweme.discover.adapter.C26501r;
import com.p280ss.android.ugc.aweme.discover.mob.C26804x.C26805a;
import java.util.HashMap;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.mob.SearchContext */
public final class SearchContext implements C26799t {

    /* renamed from: b */
    public static final SearchContext f70614b = new SearchContext();

    /* renamed from: c */
    private static final HashMap<Integer, String> f70615c = new HashMap<>();

    /* renamed from: d */
    private static boolean f70616d;

    /* renamed from: e */
    private static boolean f70617e;

    /* renamed from: f */
    private static String f70618f = "";

    /* renamed from: g */
    private static int f70619g;

    /* renamed from: h */
    private static String f70620h = "";

    /* renamed from: i */
    private static int f70621i;

    /* renamed from: com.ss.android.ugc.aweme.discover.mob.SearchContext$CurrentItemMethod */
    public enum CurrentItemMethod {
        FROM_GENERAL_SEARCH("from_general_search"),
        FROM_SEARCH_RESULT("from_search_result"),
        FROM_OTHERS("from_others");
        
        private final String value;

        public final String getValue() {
            return this.value;
        }

        private CurrentItemMethod(String str) {
            this.value = str;
        }
    }

    private SearchContext() {
    }

    /* renamed from: c */
    public static String m87930c() {
        return f70618f;
    }

    /* renamed from: d */
    public static int m87931d() {
        return f70619g;
    }

    /* renamed from: e */
    public static String m87932e() {
        return f70620h;
    }

    /* renamed from: f */
    public static int m87933f() {
        return f70621i;
    }

    /* renamed from: a */
    public static boolean m87926a() {
        return f70616d;
    }

    /* renamed from: b */
    public static boolean m87929b() {
        return f70617e;
    }

    /* renamed from: a */
    public static void m87925a(boolean z) {
        f70616d = z;
    }

    /* renamed from: b */
    public static void m87927b(int i) {
        f70621i = i;
    }

    /* renamed from: b */
    public static void m87928b(boolean z) {
        f70617e = z;
    }

    /* renamed from: a */
    public static String m87922a(int i) {
        return (String) f70615c.get(Integer.valueOf(i));
    }

    /* renamed from: a */
    public static void m87923a(int i, String str) {
        C7573i.m23587b(str, "searchId");
        f70615c.put(Integer.valueOf(i), str);
    }

    /* renamed from: a */
    public static void m87924a(View view, String str) {
        if (view != null) {
            C26501r a = C26805a.m88001a(view);
            f70619g = a.mo68126a();
            f70620h = a.f69900d;
            if (str == null) {
                str = "";
            }
            f70618f = str;
        }
    }
}
