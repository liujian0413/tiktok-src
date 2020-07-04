package com.p280ss.android.ugc.aweme.p313im.sdk.relations.adapter;

import android.arch.lifecycle.C0043i;
import android.content.Context;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.ugc.aweme.p313im.sdk.arch.adpater.BaseDiffableAdapter;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.viewholder.BaseSelectViewHolder;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.viewholder.HeaderViewHolder;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C48006q;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.adapter.BaseSelectListAdapter */
public abstract class BaseSelectListAdapter<T> extends BaseDiffableAdapter<BaseSelectViewHolder<T>, T> {

    /* renamed from: d */
    public static final C31714a f82975d = new C31714a(null);

    /* renamed from: a */
    private final int f82976a = ((int) C9738o.m28708b(this.f82978c, 40.0f));

    /* renamed from: b */
    private C48006q<? super Integer, ? super Integer, ? super View, C7581n> f82977b;

    /* renamed from: c */
    public final Context f82978c;

    /* renamed from: e */
    private View f82979e;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.adapter.BaseSelectListAdapter$a */
    public static final class C31714a {
        private C31714a() {
        }

        public /* synthetic */ C31714a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: b */
    public abstract BaseSelectViewHolder<T> mo81803b(ViewGroup viewGroup, int i);

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public C48006q<Integer, Integer, View, C7581n> mo81805l() {
        return this.f82977b;
    }

    /* renamed from: j */
    public final int mo80347j() {
        if (this.f82979e == null) {
            return 0;
        }
        return 1;
    }

    /* renamed from: m */
    public final void mo82500m() {
        if (this.f82979e != null) {
            this.f82979e = null;
            notifyItemRemoved(0);
        }
    }

    /* renamed from: a */
    public final int mo58029a(int i) {
        if (i < mo80347j()) {
            return Integer.MAX_VALUE;
        }
        return super.mo58029a(i);
    }

    public BaseSelectListAdapter(C0043i iVar) {
        C7573i.m23587b(iVar, "owner");
        super(null, 1, null);
        this.f82978c = (Context) iVar;
    }

    /* renamed from: c */
    public final void mo82499c(View view) {
        C7573i.m23587b(view, "headerView");
        if (this.f82979e == null) {
            this.f82979e = view;
            notifyItemInserted(0);
            return;
        }
        if (!C7573i.m23585a((Object) this.f82979e, (Object) view)) {
            this.f82979e = view;
            notifyItemChanged(0);
        }
    }

    /* renamed from: a */
    public final C1293v mo58032a(ViewGroup viewGroup, int i) {
        C7573i.m23587b(viewGroup, "parent");
        if (i != Integer.MAX_VALUE) {
            return mo81803b(viewGroup, i);
        }
        View view = this.f82979e;
        if (view == null) {
            C7573i.m23580a();
        }
        return new HeaderViewHolder(view);
    }

    /* renamed from: a */
    public final void mo58033a(C1293v vVar, int i) {
        C7573i.m23587b(vVar, "holder");
        if (i >= mo80347j()) {
            BaseSelectViewHolder baseSelectViewHolder = (BaseSelectViewHolder) vVar;
            mo82498a(baseSelectViewHolder, i);
            Object b = mo80344b(i);
            if (b != null) {
                baseSelectViewHolder.mo81879a(b, mo80344b(i - 1), i);
                baseSelectViewHolder.f83179b = mo81805l();
            }
        }
    }

    /* renamed from: a */
    public void mo82498a(BaseSelectViewHolder<T> baseSelectViewHolder, int i) {
        C7573i.m23587b(baseSelectViewHolder, "holder");
        View view = baseSelectViewHolder.itemView;
        C7573i.m23582a((Object) view, "holder.itemView");
        LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) layoutParams;
            if (i == getItemCount() - 1) {
                layoutParams2.setMargins(layoutParams2.leftMargin, layoutParams2.topMargin, layoutParams2.rightMargin, this.f82976a);
            } else {
                layoutParams2.setMargins(layoutParams2.leftMargin, layoutParams2.topMargin, layoutParams2.rightMargin, 0);
            }
        } else {
            throw new TypeCastException("null cannot be cast to non-null type android.support.v7.widget.RecyclerView.LayoutParams");
        }
    }
}
