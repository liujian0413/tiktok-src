package com.p280ss.android.ugc.aweme.follow.p1258a;

import com.bytedance.common.utility.collection.C6307b;
import com.google.gson.C6600e;
import com.p280ss.android.ugc.aweme.follow.presenter.FollowFeedList;
import com.p280ss.android.ugc.aweme.utils.C42973bg;
import com.p280ss.android.ugc.aweme.video.C7276d;
import java.io.File;
import java.util.Collection;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.follow.a.a */
public final class C29437a {

    /* renamed from: a */
    public static final C29437a f77634a = new C29437a();

    /* renamed from: b */
    private static final String f77635b;

    /* renamed from: c */
    private static final String f77636c;

    /* renamed from: d */
    private static File f77637d = C42973bg.m136422a(f77636c, true);

    /* renamed from: e */
    private static final C6600e f77638e = new C6600e();

    private C29437a() {
    }

    /* renamed from: b */
    public static void m96858b() {
        C42973bg.m136431c(f77635b);
    }

    /* renamed from: a */
    public final FollowFeedList mo75347a() {
        if (!m96861c()) {
            return null;
        }
        String f = C7276d.m22824f(f77636c);
        C7573i.m23582a((Object) f, "FileHelper.readFile(cacheFilePath)");
        return m96857a(f);
    }

    /* renamed from: c */
    private static boolean m96861c() {
        File file = f77637d;
        if (file != null && file.exists()) {
            return true;
        }
        C42973bg.m136422a(f77635b, false);
        File a = C42973bg.m136422a(f77636c, true);
        f77637d = a;
        if (a == null || !a.exists()) {
            return false;
        }
        return true;
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(C7276d.m22821e());
        sb.append(File.separator);
        sb.append("follow_feed_cache");
        f77635b = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(f77635b);
        sb2.append(File.separator);
        sb2.append("cache");
        f77636c = sb2.toString();
        C42973bg.m136422a(f77635b, false);
    }

    /* renamed from: a */
    private static FollowFeedList m96857a(String str) {
        try {
            return (FollowFeedList) f77638e.mo15974a(str, FollowFeedList.class);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: c */
    private static String m96860c(FollowFeedList followFeedList) {
        try {
            String b = f77638e.mo15979b((Object) followFeedList);
            if (b == null) {
                return "";
            }
            return b;
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: b */
    private static boolean m96859b(FollowFeedList followFeedList) {
        if (followFeedList == null || C6307b.m19566a((Collection<T>) followFeedList.getItems())) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo75348a(FollowFeedList followFeedList) {
        C7573i.m23587b(followFeedList, "data");
        if (m96859b(followFeedList)) {
            m96861c();
            C7276d.m22807a(f77636c, m96860c(followFeedList));
        }
    }
}
