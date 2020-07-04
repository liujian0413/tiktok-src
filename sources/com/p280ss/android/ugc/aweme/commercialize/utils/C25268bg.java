package com.p280ss.android.ugc.aweme.commercialize.utils;

import com.p280ss.android.ugc.aweme.commercialize.model.LinkData;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.bg */
public final class C25268bg {

    /* renamed from: a */
    public static final C25268bg f66614a = new C25268bg();

    /* renamed from: b */
    private static final LinkedHashMap<String, LinkData> f66615b = new LinkedHashMap<>(12, 0.75f, true);

    private C25268bg() {
    }

    /* renamed from: a */
    public static LinkedHashMap<String, LinkData> m83040a() {
        return f66615b;
    }

    /* renamed from: a */
    public static LinkData m83039a(Aweme aweme) {
        if (aweme == null) {
            return null;
        }
        if (aweme.getLinkAdData() == null && aweme.needPreloadAdLink()) {
            aweme.setLinkAdData((LinkData) f66615b.get(aweme.getAid()));
        }
        return aweme.getLinkAdData();
    }

    /* renamed from: a */
    public static void m83041a(Aweme aweme, LinkData linkData) {
        if (aweme != null) {
            aweme.setLinkAdData(linkData);
            Map map = f66615b;
            String aid = aweme.getAid();
            C7573i.m23582a((Object) aid, "aweme.aid");
            map.put(aid, linkData);
        }
    }
}
