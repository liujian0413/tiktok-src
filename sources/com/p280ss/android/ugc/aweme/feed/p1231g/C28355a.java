package com.p280ss.android.ugc.aweme.feed.p1231g;

import android.text.TextUtils;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.feed.experiment.FeedDuplicateFilterExperiment;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.FeedItemList;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.feed.g.a */
public final class C28355a {

    /* renamed from: a */
    public static final C28355a f74704a = new C28355a();

    /* renamed from: b */
    private static C28356b f74705b = new C28356b();

    /* renamed from: c */
    private static List<String> f74706c = new ArrayList();

    /* renamed from: d */
    private static List<Aweme> f74707d = new ArrayList();

    /* renamed from: e */
    private static String f74708e = "";

    private C28355a() {
    }

    /* renamed from: a */
    public static List<String> m93170a() {
        return f74706c;
    }

    /* renamed from: b */
    public static boolean m93175b() {
        if (C6399b.m19944t() || !C6384b.m19835a().mo15292a(FeedDuplicateFilterExperiment.class, true, "enable_feed_duplicate_filter", C6384b.m19835a().mo15295d().enable_feed_duplicate_filter, false)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m93172a(String str) {
        C7573i.m23587b(str, "<set-?>");
        f74708e = str;
    }

    /* renamed from: a */
    private static boolean m93173a(Aweme aweme) {
        C7573i.m23587b(aweme, "aweme");
        if (aweme.isRelieve() || TextUtils.equals(aweme.getAid(), f74708e)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static void m93174b(String str) {
        C7573i.m23587b(str, "awemeId");
        if (!TextUtils.isEmpty(str)) {
            f74705b.mo72027b(str);
        }
    }

    /* renamed from: a */
    public final List<Aweme> mo72024a(FeedItemList feedItemList) {
        C7573i.m23587b(feedItemList, "itemList");
        List items = feedItemList.getItems();
        C7573i.m23582a((Object) items, "itemList.items");
        return m93171a(items);
    }

    /* renamed from: a */
    private static List<Aweme> m93171a(List<? extends Aweme> list) {
        C7573i.m23587b(list, "itemList");
        f74705b.mo72025a();
        f74706c.clear();
        f74707d = new ArrayList();
        for (Aweme aweme : list) {
            if (aweme != null && !aweme.isAd() && !m93173a(aweme)) {
                C28356b bVar = f74705b;
                String aid = aweme.getAid();
                C7573i.m23582a((Object) aid, "aweme.aid");
                if (bVar.mo72026a(aid)) {
                    List<String> list2 = f74706c;
                    String aid2 = aweme.getAid();
                    C7573i.m23582a((Object) aid2, "aweme.aid");
                    list2.add(aid2);
                }
            }
            f74707d.add(aweme);
        }
        return f74707d;
    }
}
