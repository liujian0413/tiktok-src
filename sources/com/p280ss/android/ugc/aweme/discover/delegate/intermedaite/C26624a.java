package com.p280ss.android.ugc.aweme.discover.delegate.intermedaite;

import android.arch.lifecycle.C0043i;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.ViewGroup;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.common.adapter.C25647a;
import com.p280ss.android.ugc.aweme.discover.adapter.GuessWordsViewHolder;
import com.p280ss.android.ugc.aweme.discover.adapter.GuessWordsViewHolder.C26384a;
import com.p280ss.android.ugc.aweme.discover.adapter.viewholder.GuessWordLineViewHolder;
import com.p280ss.android.ugc.aweme.discover.adapter.viewholder.GuessWordLineViewHolder.C26508a;
import com.p280ss.android.ugc.aweme.discover.adapter.viewholder.TwoColumnViewHolder;
import com.p280ss.android.ugc.aweme.discover.adapter.viewholder.TwoColumnViewHolder.C26524a;
import com.p280ss.android.ugc.aweme.discover.model.suggest.Word;
import com.p280ss.android.ugc.aweme.discover.p1185ui.C27011ap.C27012a;
import com.p280ss.android.ugc.aweme.search.C37380c;
import java.util.Collection;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.delegate.intermedaite.a */
public final class C26624a extends C25647a<List<? extends Object>> {

    /* renamed from: c */
    public static final C26625a f70209c = new C26625a(null);

    /* renamed from: a */
    public boolean f70210a;

    /* renamed from: b */
    public final C0043i f70211b;

    /* renamed from: d */
    private C27012a f70212d;

    /* renamed from: com.ss.android.ugc.aweme.discover.delegate.intermedaite.a$a */
    public static final class C26625a {
        private C26625a() {
        }

        public /* synthetic */ C26625a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: a */
    private static boolean m87479a() {
        int c = C37380c.m119976c();
        if (c == 4 || c == 5) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo68318a(C27012a aVar) {
        C7573i.m23587b(aVar, "handler");
        this.f70212d = aVar;
    }

    public C26624a(C0043i iVar) {
        C7573i.m23587b(iVar, "lifecycleOwner");
        this.f70211b = iVar;
    }

    /* renamed from: a */
    private static boolean m87480a(Object obj) {
        if (!(obj instanceof List)) {
            obj = null;
        }
        List list = (List) obj;
        if (list != null && !C6307b.m19566a((Collection<T>) list) && (list.get(0) instanceof Word)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final C1293v mo62251a(ViewGroup viewGroup) {
        C7573i.m23587b(viewGroup, "parent");
        if (C6399b.m19944t()) {
            return C26508a.m87177a(viewGroup, this.f70212d);
        }
        if (!m87479a()) {
            return C26384a.m86813a(viewGroup, this.f70212d);
        }
        TwoColumnViewHolder a = C26524a.m87214a(viewGroup, false);
        a.mo68151a(this.f70212d);
        return a;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean mo62253a(List<? extends Object> list, int i) {
        C7573i.m23587b(list, "items");
        return m87480a(list.get(i));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo62252a(List<? extends Object> list, int i, C1293v vVar, List<Object> list2) {
        C7573i.m23587b(list, "items");
        C7573i.m23587b(vVar, "holder");
        C7573i.m23587b(list2, "payloads");
        if (this.f70210a) {
            this.f70210a = false;
            if (vVar instanceof GuessWordsViewHolder) {
                GuessWordsViewHolder guessWordsViewHolder = (GuessWordsViewHolder) vVar;
                Object obj = list.get(i);
                if (obj != null) {
                    guessWordsViewHolder.mo67914a((List) obj);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.List<com.ss.android.ugc.aweme.discover.model.suggest.Word>");
            } else if (vVar instanceof TwoColumnViewHolder) {
                TwoColumnViewHolder twoColumnViewHolder = (TwoColumnViewHolder) vVar;
                Object obj2 = list.get(i);
                if (obj2 != null) {
                    twoColumnViewHolder.mo68154b((List) obj2);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.List<com.ss.android.ugc.aweme.discover.model.suggest.Word>");
            } else {
                if (vVar instanceof GuessWordLineViewHolder) {
                    GuessWordLineViewHolder guessWordLineViewHolder = (GuessWordLineViewHolder) vVar;
                    Object obj3 = list.get(i);
                    if (obj3 != null) {
                        guessWordLineViewHolder.mo68137a((List) obj3);
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.List<com.ss.android.ugc.aweme.discover.model.suggest.Word>");
                    }
                }
            }
        }
    }
}
