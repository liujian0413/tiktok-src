package com.p280ss.android.ugc.aweme.feed.param;

import android.app.Activity;
import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0069x;
import android.content.Context;
import android.support.p022v4.app.FragmentActivity;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.feed.param.FeedParamProvider */
public final class FeedParamProvider extends C0063u {

    /* renamed from: b */
    public static final C28651a f75494b = new C28651a(null);

    /* renamed from: a */
    public FeedParam f75495a;

    /* renamed from: com.ss.android.ugc.aweme.feed.param.FeedParamProvider$a */
    public static final class C28651a {
        private C28651a() {
        }

        public /* synthetic */ C28651a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static FeedParam m94274a(Context context) {
            C7573i.m23587b(context, "context");
            Activity a = C23487o.m77130a(context);
            if (a != null) {
                C0063u a2 = C0069x.m159a((FragmentActivity) a).mo147a(FeedParamProvider.class);
                C7573i.m23582a((Object) a2, "ViewModelProviders.of(ac…aramProvider::class.java)");
                FeedParam feedParam = ((FeedParamProvider) a2).f75495a;
                if (feedParam == null) {
                    return new FeedParam();
                }
                return feedParam;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }

        /* renamed from: a */
        public static void m94275a(Context context, FeedParam feedParam) {
            C7573i.m23587b(context, "context");
            C7573i.m23587b(feedParam, "param");
            Activity a = C23487o.m77130a(context);
            if (a != null) {
                C0063u a2 = C0069x.m159a((FragmentActivity) a).mo147a(FeedParamProvider.class);
                C7573i.m23582a((Object) a2, "ViewModelProviders.of(ac…aramProvider::class.java)");
                ((FeedParamProvider) a2).f75495a = feedParam;
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
    }

    /* renamed from: a */
    public static final FeedParam m94273a(Context context) {
        return C28651a.m94274a(context);
    }
}
