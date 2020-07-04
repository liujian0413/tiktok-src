package com.p280ss.android.ugc.aweme.discover.viewmodel;

import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0069x;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import com.p280ss.android.ugc.aweme.search.model.SearchEnterParam;
import java.io.Serializable;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.viewmodel.SearchEnterViewModel */
public final class SearchEnterViewModel extends C0063u {

    /* renamed from: b */
    public static final C27244a f71756b = new C27244a(null);

    /* renamed from: a */
    public SearchEnterParam f71757a;

    /* renamed from: com.ss.android.ugc.aweme.discover.viewmodel.SearchEnterViewModel$a */
    public static final class C27244a {
        private C27244a() {
        }

        public /* synthetic */ C27244a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static SearchEnterViewModel m89252a(FragmentActivity fragmentActivity) {
            if (fragmentActivity == null) {
                return new SearchEnterViewModel();
            }
            C0063u a = C0069x.m159a(fragmentActivity).mo147a(SearchEnterViewModel.class);
            C7573i.m23582a((Object) a, "ViewModelProviders.of(ac…terViewModel::class.java)");
            return (SearchEnterViewModel) a;
        }

        /* renamed from: b */
        public static SearchEnterParam m89253b(FragmentActivity fragmentActivity) {
            if (fragmentActivity == null) {
                return null;
            }
            return ((SearchEnterViewModel) C0069x.m159a(fragmentActivity).mo147a(SearchEnterViewModel.class)).f71757a;
        }
    }

    /* renamed from: a */
    public static final SearchEnterViewModel m89249a(FragmentActivity fragmentActivity) {
        return C27244a.m89252a(fragmentActivity);
    }

    /* renamed from: b */
    public static final SearchEnterParam m89250b(FragmentActivity fragmentActivity) {
        return C27244a.m89253b(fragmentActivity);
    }

    /* renamed from: a */
    public final void mo69989a(Bundle bundle) {
        if (bundle != null) {
            Serializable serializable = bundle.getSerializable("search_enter_param");
            if (!(serializable instanceof SearchEnterParam)) {
                serializable = null;
            }
            this.f71757a = (SearchEnterParam) serializable;
        }
    }
}
