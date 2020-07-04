package com.p280ss.android.ugc.aweme.discover.delegate.intermedaite;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.ViewGroup;
import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.ugc.aweme.common.adapter.C25647a;
import com.p280ss.android.ugc.aweme.discover.adapter.SearchSquareAdapter;
import com.p280ss.android.ugc.aweme.discover.model.suggest.SuggestChallenge;
import com.p280ss.android.ugc.aweme.discover.model.suggest.SuggestMusic;
import com.p280ss.android.ugc.aweme.discover.model.suggest.SuggestUser;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.delegate.intermedaite.g */
public final class C26632g extends C25647a<List<? extends Object>> {

    /* renamed from: a */
    public final SearchSquareAdapter<?> f70219a;

    /* renamed from: b */
    private C26633a f70220b;

    /* renamed from: com.ss.android.ugc.aweme.discover.delegate.intermedaite.g$a */
    public static abstract class C26633a {

        /* renamed from: b */
        public static final String f70221b;

        /* renamed from: c */
        public static final C26634a f70222c;

        /* renamed from: a */
        public final SearchSquareAdapter<?> f70223a;

        /* renamed from: com.ss.android.ugc.aweme.discover.delegate.intermedaite.g$a$a */
        public static final class C26634a {
            private C26634a() {
            }

            public /* synthetic */ C26634a(C7571f fVar) {
                this();
            }
        }

        /* renamed from: a */
        public abstract C1293v mo68320a(ViewGroup viewGroup);

        /* renamed from: a */
        public abstract void mo68321a(List<? extends Object> list, int i, C1293v vVar, List<Object> list2);

        static {
            C26634a aVar = new C26634a(null);
            f70222c = aVar;
            String simpleName = aVar.getClass().getSimpleName();
            if (simpleName == null) {
                C7573i.m23580a();
            }
            f70221b = simpleName;
        }

        public C26633a(SearchSquareAdapter<?> searchSquareAdapter) {
            C7573i.m23587b(searchSquareAdapter, "adapter");
            this.f70223a = searchSquareAdapter;
        }

        /* renamed from: a */
        public final int mo68324a(Object obj) {
            C7573i.m23587b(obj, "item");
            ArrayList b = this.f70223a.mo68077b();
            Collection collection = b;
            if (C6307b.m19566a(collection)) {
                return -1;
            }
            int size = collection.size();
            for (int i = 0; i < size; i++) {
                if (C7573i.m23585a(obj, b.get(i))) {
                    return i;
                }
            }
            return -1;
        }
    }

    public C26632g(SearchSquareAdapter<?> searchSquareAdapter) {
        C7573i.m23587b(searchSquareAdapter, "adapter");
        this.f70219a = searchSquareAdapter;
    }

    /* renamed from: a */
    public final C1293v mo62251a(ViewGroup viewGroup) {
        C7573i.m23587b(viewGroup, "parent");
        C26633a aVar = this.f70220b;
        if (aVar == null) {
            C7573i.m23583a("mSubDelegate");
        }
        return aVar.mo68320a(viewGroup);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean mo62253a(List<? extends Object> list, int i) {
        C7573i.m23587b(list, "items");
        Object obj = list.get(i);
        if (obj instanceof SuggestUser) {
            this.f70220b = new C26635h(this.f70219a);
            return true;
        } else if (obj instanceof SuggestMusic) {
            this.f70220b = new C26631f(this.f70219a);
            return true;
        } else if (!(obj instanceof SuggestChallenge)) {
            return false;
        } else {
            this.f70220b = new C26628c(this.f70219a);
            return true;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo62252a(List<? extends Object> list, int i, C1293v vVar, List<Object> list2) {
        C7573i.m23587b(list, "items");
        C7573i.m23587b(vVar, "holder");
        C7573i.m23587b(list2, "payloads");
        C26633a aVar = this.f70220b;
        if (aVar == null) {
            C7573i.m23583a("mSubDelegate");
        }
        aVar.mo68321a(list, i, vVar, list2);
    }
}
