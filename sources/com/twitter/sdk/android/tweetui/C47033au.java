package com.twitter.sdk.android.tweetui;

import com.twitter.sdk.android.core.internal.scribe.C46908e;
import com.twitter.sdk.android.core.internal.scribe.C46908e.C46909a;
import com.twitter.sdk.android.core.internal.scribe.ScribeItem;
import java.util.ArrayList;

/* renamed from: com.twitter.sdk.android.tweetui.au */
final class C47033au implements C47032at {

    /* renamed from: a */
    final C47029aq f120678a;

    /* renamed from: a */
    private static C46908e m147060a() {
        return new C46909a().mo118034a("tfw").mo118036b("android").mo118037c("video").mo118040f("impression").mo118035a();
    }

    /* renamed from: b */
    private static C46908e m147061b() {
        return new C46909a().mo118034a("tfw").mo118036b("android").mo118037c("video").mo118040f("play").mo118035a();
    }

    C47033au(C47029aq aqVar) {
        this.f120678a = aqVar;
    }

    /* renamed from: a */
    public final void mo118236a(ScribeItem scribeItem) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(scribeItem);
        this.f120678a.mo118234a(m147060a(), arrayList);
    }

    /* renamed from: b */
    public final void mo118237b(ScribeItem scribeItem) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(scribeItem);
        this.f120678a.mo118234a(m147061b(), arrayList);
    }
}
