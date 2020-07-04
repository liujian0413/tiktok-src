package com.p280ss.android.ugc.aweme.mix;

import android.support.p029v7.util.C1143a.C1147c;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Objects;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.mix.AwemeDiff */
public final class AwemeDiff extends C1147c<Aweme> {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo4549a(Object obj, Object obj2) {
        return m108226a((Aweme) obj, (Aweme) obj2);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo4550b(Object obj, Object obj2) {
        return m108227b((Aweme) obj, (Aweme) obj2);
    }

    /* renamed from: a */
    private static boolean m108226a(Aweme aweme, Aweme aweme2) {
        C7573i.m23587b(aweme, "p0");
        C7573i.m23587b(aweme2, "p1");
        return Objects.equals(aweme.getAid(), aweme2.getAid());
    }

    /* renamed from: b */
    private static boolean m108227b(Aweme aweme, Aweme aweme2) {
        C7573i.m23587b(aweme, "p0");
        C7573i.m23587b(aweme2, "p1");
        return Objects.equals(aweme.getAid(), aweme2.getAid());
    }
}
