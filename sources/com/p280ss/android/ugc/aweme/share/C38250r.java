package com.p280ss.android.ugc.aweme.share;

import android.content.Context;
import com.twitter.sdk.android.core.C46940l;
import com.twitter.sdk.android.core.C46966o.C46968a;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.share.r */
public final class C38250r {

    /* renamed from: a */
    public static final C38250r f99407a = new C38250r();

    /* renamed from: b */
    private static C38249q f99408b;

    private C38250r() {
    }

    /* renamed from: a */
    public static void m122191a(Context context, C38249q qVar) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(qVar, "mobKey");
        f99408b = qVar;
        C46940l.m146817a(new C46968a(context).mo118100a(new TwitterAuthConfig(qVar.f99402a, qVar.f99403b)).mo118102a());
    }
}
