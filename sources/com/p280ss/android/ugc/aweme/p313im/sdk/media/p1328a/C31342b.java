package com.p280ss.android.ugc.aweme.p313im.sdk.media.p1328a;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31864aj;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.media.a.b */
public final class C31342b {

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.a.b$a */
    static final class C31343a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C7562b f82127a;

        C31343a(C7562b bVar) {
            this.f82127a = bVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (!C31864aj.m103545a(view, (long) C31864aj.f83332b)) {
                C7562b bVar = this.f82127a;
                C7573i.m23582a((Object) view, "it");
                bVar.invoke(view);
            }
        }
    }

    /* renamed from: a */
    public static final void m102053a(View view, C7562b<? super View, C7581n> bVar) {
        C7573i.m23587b(view, "$this$setNoDoubleClickListener");
        C7573i.m23587b(bVar, "block");
        view.setOnClickListener(new C31343a(bVar));
    }
}
