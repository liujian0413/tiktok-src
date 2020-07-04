package com.p280ss.android.ugc.aweme.discover.model.tab;

import android.app.Activity;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0069x;
import android.support.p022v4.app.FragmentActivity;
import android.view.View;
import com.bytedance.ies.sdk.widgets.NextLiveData;
import com.p280ss.android.ugc.aweme.app.C22898bh;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.aweme.discover.model.tab.SearchTabViewModel */
public final class SearchTabViewModel extends C0063u {
    public static final Companion Companion = new Companion(null);
    public final NextLiveData<C22898bh> tabInfo = new NextLiveData<>();

    /* renamed from: com.ss.android.ugc.aweme.discover.model.tab.SearchTabViewModel$Companion */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C7571f fVar) {
            this();
        }

        public final SearchTabViewModel from(View view) {
            C7573i.m23587b(view, "view");
            Activity e = C23487o.m77158e(view);
            if (e != null) {
                C0063u a = C0069x.m159a((FragmentActivity) e).mo147a(SearchTabViewModel.class);
                C7573i.m23582a((Object) a, "ViewModelProviders.of(ac…TabViewModel::class.java)");
                return (SearchTabViewModel) a;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }

        public final void addObserver(View view, C0043i iVar, C7562b<? super C22898bh, C7581n> bVar) {
            C7573i.m23587b(view, "view");
            C7573i.m23587b(iVar, "lifecycleOwner");
            C7573i.m23587b(bVar, "observer");
            if (C7163a.m22363a()) {
                from(view).tabInfo.observe(iVar, new SearchObserver().setListener(bVar), true);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.model.tab.SearchTabViewModel$SearchObserver */
    public static final class SearchObserver implements C0053p<C22898bh> {
        private C7562b<? super C22898bh, C7581n> listener = SearchTabViewModel$SearchObserver$listener$1.INSTANCE;

        public final SearchObserver setListener(C7562b<? super C22898bh, C7581n> bVar) {
            C7573i.m23587b(bVar, "listener");
            this.listener = bVar;
            return this;
        }

        public final void onChanged(C22898bh bhVar) {
            if (bhVar != null) {
                this.listener.invoke(bhVar);
            }
        }
    }

    public static final void addObserver(View view, C0043i iVar, C7562b<? super C22898bh, C7581n> bVar) {
        Companion.addObserver(view, iVar, bVar);
    }

    public static final SearchTabViewModel from(View view) {
        return Companion.from(view);
    }
}
