package com.p280ss.android.ugc.aweme.discover.p1185ui;

import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.google.gson.C6600e;
import com.google.gson.p277b.C6597a;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.discover.abtest.SearchResultHasVideoTab;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.ba */
public final class C27029ba {

    /* renamed from: a */
    public static final int f71319a = f71328j.indexOf("general");

    /* renamed from: b */
    public static final int f71320b = f71328j.indexOf("video");

    /* renamed from: c */
    public static final int f71321c = f71328j.indexOf("user");

    /* renamed from: d */
    public static final int f71322d = f71328j.indexOf("poi");

    /* renamed from: e */
    public static final int f71323e = f71328j.indexOf("music");

    /* renamed from: f */
    public static final int f71324f = f71328j.indexOf("hashtag");

    /* renamed from: g */
    public static final int f71325g = f71328j.indexOf("goods");

    /* renamed from: h */
    private static final List<String> f71326h = Collections.unmodifiableList(Arrays.asList(new String[]{"general", "video", "user", "poi", "music", "hashtag", "goods"}));

    /* renamed from: i */
    private static final List<String> f71327i = Collections.unmodifiableList(Arrays.asList(new String[]{"general", "user", "music", "hashtag", "video"}));

    /* renamed from: j */
    private static List<String> f71328j;

    /* renamed from: a */
    public static int m88789a() {
        return f71328j.size();
    }

    /* renamed from: b */
    private static List<String> m88792b() {
        if (C6399b.m19944t()) {
            return f71327i;
        }
        return f71326h;
    }

    static {
        try {
            f71328j = (List) new C6600e().mo15975a((String) SharePrefCache.inst().getSearchTabIndex().mo59877d(), new C6597a<List<String>>() {
            }.type);
        } catch (Exception unused) {
        }
        if (C6307b.m19566a((Collection<T>) f71328j)) {
            ArrayList arrayList = new ArrayList();
            f71328j = arrayList;
            arrayList.addAll(m88792b());
        }
        Iterator it = f71328j.iterator();
        while (it.hasNext()) {
            if (!m88793b((String) it.next())) {
                it.remove();
            }
        }
    }

    /* renamed from: a */
    public static int m88790a(String str) {
        return f71328j.indexOf(str);
    }

    /* renamed from: c */
    private static boolean m88794c(String str) {
        return m88792b().contains(str);
    }

    /* renamed from: a */
    public static String m88791a(int i) {
        return (String) f71328j.get(i);
    }

    /* renamed from: b */
    private static boolean m88793b(String str) {
        if (!m88794c(str)) {
            return false;
        }
        if ("goods".equalsIgnoreCase(str)) {
            if (C6399b.m19944t()) {
                return false;
            }
        } else if ("video".equalsIgnoreCase(str) && C6399b.m19945u()) {
            return C6384b.m19835a().mo15292a(SearchResultHasVideoTab.class, true, "search_result_has_video_tab", C6384b.m19835a().mo15295d().search_result_has_video_tab, true);
        }
        return true;
    }
}
