package com.p280ss.android.ugc.aweme.sharer.p338ui;

import android.content.Context;
import com.p280ss.android.ugc.aweme.sharer.C38343b;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38366a.C38367a;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.sharer.ui.d */
public interface C38386d extends C38366a {

    /* renamed from: com.ss.android.ugc.aweme.sharer.ui.d$a */
    public static final class C38387a {
        /* renamed from: a */
        public static void m122612a(C38386d dVar, C38343b bVar, boolean z, SharePackage sharePackage, Context context) {
            C7573i.m23587b(bVar, "channel");
            C7573i.m23587b(context, "context");
            C38367a.m122556a(dVar, bVar, z, sharePackage, context);
        }

        /* renamed from: a */
        public static void m122613a(C38386d dVar, SharePackage sharePackage, Context context) {
            C7573i.m23587b(sharePackage, "sharePackage");
            C7573i.m23587b(context, "context");
        }

        /* renamed from: b */
        public static void m122614b(C38386d dVar, SharePackage sharePackage, Context context) {
            C7573i.m23587b(sharePackage, "sharePackage");
            C7573i.m23587b(context, "context");
        }
    }

    /* renamed from: a */
    void mo67217a(SharePackage sharePackage, Context context);

    /* renamed from: a */
    void mo67218a(C38389f fVar, SharePackage sharePackage, Context context);

    /* renamed from: b */
    void mo67219b(SharePackage sharePackage, Context context);
}
