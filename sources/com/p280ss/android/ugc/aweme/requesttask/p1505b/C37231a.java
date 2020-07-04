package com.p280ss.android.ugc.aweme.requesttask.p1505b;

import android.content.Context;
import com.p280ss.android.ugc.aweme.feed.preload.C28659e;
import com.p280ss.android.ugc.aweme.feed.preload.C28662h;
import com.p280ss.android.ugc.aweme.feed.preload.C28666j;
import com.p280ss.android.ugc.aweme.lego.C7152c;
import com.p280ss.android.ugc.aweme.lego.RequestType;
import com.p280ss.android.ugc.aweme.p304ab.C6857a;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.requesttask.b.a */
public final class C37231a implements C7152c {
    /* renamed from: a */
    public final RequestType mo18606a() {
        return RequestType.P0;
    }

    /* renamed from: a */
    public final void mo18607a(Context context, boolean z) {
        C7573i.m23587b(context, "context");
        C6857a.m21312e().mo16827b("feed_boot_to_feed_request", true);
        C6857a.m21312e().mo16822a("feed_request_to_network", true);
        if (C6857a.m21312e().f19501a) {
            C6857a.m21312e().mo16827b("feed_lego_add_to_request", false);
            C6857a.m21312e().mo16822a("feed_request_to_feed_api", false);
        }
        C28659e a = C28662h.m94303a().mo73724a(4);
        if (a != null) {
            ((C28666j) a).mo73733h();
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.preload.OpenFeedApiCommandV2");
    }
}
