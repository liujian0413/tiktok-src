package com.p280ss.android.ugc.aweme.p313im.sdk.relations.adapter;

import android.arch.lifecycle.C0043i;
import android.os.Build.VERSION;
import android.support.p029v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.viewholder.BaseSelectViewHolder;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMContact;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C48006q;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.adapter.SearchHeadListAdapter */
public final class SearchHeadListAdapter extends BaseSelectListAdapter<IMContact> {

    /* renamed from: a */
    private final int f83036a = ((int) C9738o.m28708b(this.f82978c, 16.0f));

    /* renamed from: b */
    private C48006q<? super Integer, ? super Integer, ? super View, C7581n> f83037b;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.adapter.SearchHeadListAdapter$a */
    static final class C31729a extends Lambda implements C48006q<Integer, Integer, View, C7581n> {

        /* renamed from: a */
        final /* synthetic */ SearchHeadListAdapter f83038a;

        /* renamed from: b */
        final /* synthetic */ C7562b f83039b;

        C31729a(SearchHeadListAdapter searchHeadListAdapter, C7562b bVar) {
            this.f83038a = searchHeadListAdapter;
            this.f83039b = bVar;
            super(3);
        }

        /* renamed from: a */
        private void m103045a(int i, int i2, View view) {
            C7573i.m23587b(view, "view");
            if (i == 1) {
                IMContact iMContact = (IMContact) this.f83038a.mo80344b(i2);
                if (iMContact != null) {
                    C7562b bVar = this.f83039b;
                    if (bVar != null) {
                        bVar.invoke(iMContact);
                    }
                }
            }
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            m103045a(((Number) obj).intValue(), ((Number) obj2).intValue(), (View) obj3);
            return C7581n.f20898a;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final C48006q<Integer, Integer, View, C7581n> mo81805l() {
        return this.f83037b;
    }

    /* renamed from: b */
    public final BaseSelectViewHolder<IMContact> mo81803b(ViewGroup viewGroup, int i) {
        C7573i.m23587b(viewGroup, "parent");
        return new SearchViewHolder<>(viewGroup);
    }

    public SearchHeadListAdapter(C0043i iVar, C7562b<? super IMContact, C7581n> bVar) {
        C7573i.m23587b(iVar, "owner");
        super(iVar);
        this.f83037b = new C31729a(this, bVar);
    }

    /* renamed from: a */
    public final void mo82498a(BaseSelectViewHolder<IMContact> baseSelectViewHolder, int i) {
        C7573i.m23587b(baseSelectViewHolder, "holder");
        View view = baseSelectViewHolder.itemView;
        C7573i.m23582a((Object) view, "holder.itemView");
        LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) layoutParams;
            if (i == getItemCount() - 1) {
                layoutParams2.setMargins(this.f83036a, layoutParams2.topMargin, layoutParams2.rightMargin, layoutParams2.bottomMargin);
                if (VERSION.SDK_INT >= 17) {
                    layoutParams2.setMarginStart(this.f83036a);
                    return;
                }
            } else {
                layoutParams2.setMargins(0, layoutParams2.topMargin, layoutParams2.rightMargin, layoutParams2.bottomMargin);
                if (VERSION.SDK_INT >= 17) {
                    layoutParams2.setMarginStart(0);
                }
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v7.widget.RecyclerView.LayoutParams");
    }
}
