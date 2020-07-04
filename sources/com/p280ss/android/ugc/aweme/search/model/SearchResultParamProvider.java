package com.p280ss.android.ugc.aweme.search.model;

import android.app.Activity;
import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0069x;
import android.content.Context;
import android.support.p022v4.app.FragmentActivity;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.search.model.SearchResultParamProvider */
public final class SearchResultParamProvider extends C0063u {

    /* renamed from: b */
    public static final C37387a f97623b = new C37387a(null);

    /* renamed from: a */
    public SearchResultParam f97624a;

    /* renamed from: com.ss.android.ugc.aweme.search.model.SearchResultParamProvider$a */
    public static final class C37387a {
        private C37387a() {
        }

        public /* synthetic */ C37387a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static SearchResultParam m119990a(Context context) {
            C7573i.m23587b(context, "context");
            Activity a = C23487o.m77130a(context);
            if (a != null) {
                C0063u a2 = C0069x.m159a((FragmentActivity) a).mo147a(SearchResultParamProvider.class);
                C7573i.m23582a((Object) a2, "ViewModelProviders.of(ac…aramProvider::class.java)");
                SearchResultParam searchResultParam = ((SearchResultParamProvider) a2).f97624a;
                if (searchResultParam == null) {
                    return new SearchResultParam();
                }
                return searchResultParam;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }

        /* renamed from: a */
        public static void m119991a(Context context, SearchResultParam searchResultParam) {
            C7573i.m23587b(context, "context");
            C7573i.m23587b(searchResultParam, "param");
            Activity a = C23487o.m77130a(context);
            if (a != null) {
                C0063u a2 = C0069x.m159a((FragmentActivity) a).mo147a(SearchResultParamProvider.class);
                C7573i.m23582a((Object) a2, "ViewModelProviders.of(ac…aramProvider::class.java)");
                ((SearchResultParamProvider) a2).f97624a = searchResultParam;
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
    }
}
