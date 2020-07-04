package com.p280ss.android.ugc.aweme.discover.delegate.intermedaite;

import android.arch.lifecycle.C0043i;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.ViewGroup;
import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.ugc.aweme.common.adapter.C25647a;
import com.p280ss.android.ugc.aweme.discover.adapter.HotSearchImageViewHolder;
import com.p280ss.android.ugc.aweme.discover.adapter.HotSearchWordViewHolder;
import com.p280ss.android.ugc.aweme.discover.adapter.viewholder.TwoColumnViewHolder;
import com.p280ss.android.ugc.aweme.discover.adapter.viewholder.TwoColumnViewHolder.C26524a;
import com.p280ss.android.ugc.aweme.discover.helper.C26654b;
import com.p280ss.android.ugc.aweme.discover.model.HotSearchItem;
import com.p280ss.android.ugc.aweme.discover.p1185ui.C27011ap.C27013b;
import com.p280ss.android.ugc.aweme.search.C37380c;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.delegate.intermedaite.b */
public final class C26626b extends C25647a<List<? extends Object>> {

    /* renamed from: b */
    public static final C26627a f70213b = new C26627a(null);

    /* renamed from: a */
    public boolean f70214a;

    /* renamed from: c */
    private C0043i f70215c;

    /* renamed from: d */
    private C27013b f70216d;

    /* renamed from: com.ss.android.ugc.aweme.discover.delegate.intermedaite.b$a */
    public static final class C26627a {
        private C26627a() {
        }

        public /* synthetic */ C26627a(C7571f fVar) {
            this();
        }
    }

    public C26626b() {
    }

    /* renamed from: a */
    private static boolean m87487a() {
        if (C37380c.m119976c() == 3) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo68319a(C27013b bVar) {
        C7573i.m23587b(bVar, "handler");
        this.f70216d = bVar;
    }

    public C26626b(C0043i iVar) {
        C7573i.m23587b(iVar, "owner");
        this();
        this.f70215c = iVar;
    }

    /* renamed from: a */
    private static boolean m87488a(Object obj) {
        if (!(obj instanceof List)) {
            obj = null;
        }
        List list = (List) obj;
        if (list != null && !C6307b.m19566a((Collection<T>) list) && (list.get(0) instanceof HotSearchItem)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final C1293v mo62251a(ViewGroup viewGroup) {
        C7573i.m23587b(viewGroup, "parent");
        if (C26654b.m87582j()) {
            HotSearchImageViewHolder a = HotSearchImageViewHolder.m86827a(viewGroup, "hot_search_section_search", this.f70216d, this.f70215c);
            C7573i.m23582a((Object) a, "HotSearchImageViewHolder…mHotSearchHandler, owner)");
            return a;
        } else if (m87487a()) {
            TwoColumnViewHolder a2 = C26524a.m87214a(viewGroup, true);
            a2.mo68152a(this.f70216d);
            return a2;
        } else {
            HotSearchWordViewHolder a3 = HotSearchWordViewHolder.m86844a(viewGroup, "hot_search_section_search", this.f70216d);
            C7573i.m23582a((Object) a3, "HotSearchWordViewHolder.…     , mHotSearchHandler)");
            return a3;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean mo62253a(List<? extends Object> list, int i) {
        C7573i.m23587b(list, "items");
        return m87488a(list.get(i));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo62252a(List<? extends Object> list, int i, C1293v vVar, List<Object> list2) {
        C7573i.m23587b(list, "items");
        C7573i.m23587b(vVar, "holder");
        C7573i.m23587b(list2, "payloads");
        if (this.f70214a) {
            this.f70214a = false;
            if (vVar instanceof HotSearchWordViewHolder) {
                HotSearchWordViewHolder hotSearchWordViewHolder = (HotSearchWordViewHolder) vVar;
                Object obj = list.get(i);
                if (!(obj instanceof List)) {
                    obj = null;
                }
                hotSearchWordViewHolder.mo67914a((List) obj);
            } else if (vVar instanceof HotSearchImageViewHolder) {
                HotSearchImageViewHolder hotSearchImageViewHolder = (HotSearchImageViewHolder) vVar;
                Object obj2 = list.get(i);
                if (!(obj2 instanceof List)) {
                    obj2 = null;
                }
                hotSearchImageViewHolder.mo67965a((List) obj2);
            } else {
                if (vVar instanceof TwoColumnViewHolder) {
                    TwoColumnViewHolder twoColumnViewHolder = (TwoColumnViewHolder) vVar;
                    Object obj3 = list.get(i);
                    if (!(obj3 instanceof List)) {
                        obj3 = null;
                    }
                    twoColumnViewHolder.mo68153a((List) obj3);
                }
            }
        }
    }
}
