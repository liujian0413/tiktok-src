package com.p280ss.android.ugc.aweme.tools.beauty.adapter;

import android.support.p029v7.widget.RecyclerView.C1262a;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.p280ss.android.ugc.aweme.tools.beauty.adapter.BeautyListViewHolder.C42167a;
import java.util.ArrayList;
import java.util.List;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7563m;

/* renamed from: com.ss.android.ugc.aweme.tools.beauty.adapter.BeautyListAdapter */
public final class BeautyListAdapter extends C1262a<BeautyListViewHolder> {

    /* renamed from: a */
    public final ArrayList<ComposerBeauty> f109705a = new ArrayList<>();

    /* renamed from: b */
    public C7563m<? super ComposerBeauty, ? super Integer, C7581n> f109706b;

    /* renamed from: c */
    public int f109707c;

    /* renamed from: d */
    private final C7563m<ComposerBeauty, Integer, C7581n> f109708d = new C42166a(this);

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.adapter.BeautyListAdapter$a */
    static final class C42166a extends Lambda implements C7563m<ComposerBeauty, Integer, C7581n> {

        /* renamed from: a */
        final /* synthetic */ BeautyListAdapter f109709a;

        C42166a(BeautyListAdapter beautyListAdapter) {
            this.f109709a = beautyListAdapter;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m134145a((ComposerBeauty) obj, ((Number) obj2).intValue());
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m134145a(ComposerBeauty composerBeauty, int i) {
            C7573i.m23587b(composerBeauty, "beautyBean");
            this.f109709a.f109707c = i;
            C7563m<? super ComposerBeauty, ? super Integer, C7581n> mVar = this.f109709a.f109706b;
            if (mVar != null) {
                mVar.invoke(composerBeauty, Integer.valueOf(i));
            }
            this.f109709a.notifyDataSetChanged();
        }
    }

    public final int getItemCount() {
        return this.f109705a.size();
    }

    /* renamed from: a */
    public final void mo103618a(List<ComposerBeauty> list) {
        C7573i.m23587b(list, "beautyBeans");
        this.f109705a.clear();
        this.f109705a.addAll(list);
        notifyDataSetChanged();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public BeautyListViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C7573i.m23587b(viewGroup, "parent");
        BeautyListViewHolder a = C42167a.m134151a(viewGroup);
        a.f109711a = this.f109708d;
        return a;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onBindViewHolder(BeautyListViewHolder beautyListViewHolder, int i) {
        boolean z;
        C7573i.m23587b(beautyListViewHolder, "viewHodler");
        Object obj = this.f109705a.get(i);
        C7573i.m23582a(obj, "data[index]");
        ComposerBeauty composerBeauty = (ComposerBeauty) obj;
        boolean z2 = false;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        if (this.f109705a.size() > 1 && i == this.f109705a.size() - 1) {
            z2 = true;
        }
        beautyListViewHolder.mo103619a(composerBeauty, z, z2);
    }
}
