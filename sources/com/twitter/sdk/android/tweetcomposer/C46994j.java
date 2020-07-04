package com.twitter.sdk.android.tweetcomposer;

import com.twitter.sdk.android.core.internal.scribe.C46898a;
import com.twitter.sdk.android.core.internal.scribe.C46908e;
import com.twitter.sdk.android.core.internal.scribe.ScribeItem;
import java.util.List;

/* renamed from: com.twitter.sdk.android.tweetcomposer.j */
final class C46994j implements C46992i {

    /* renamed from: a */
    private final C46898a f120562a;

    C46994j(C46898a aVar) {
        this.f120562a = aVar;
    }

    /* renamed from: a */
    public final void mo118162a(C46908e eVar, List<ScribeItem> list) {
        if (this.f120562a != null) {
            this.f120562a.mo118022a(eVar, list);
        }
    }
}
