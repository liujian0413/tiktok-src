package com.p280ss.android.ugc.aweme.p313im.sdk.relations.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.viewholder.BaseSelectViewHolder;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMContact;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C48006q;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.adapter.SearchViewHolder */
public final class SearchViewHolder extends BaseSelectViewHolder<IMContact> {
    public SearchViewHolder(ViewGroup viewGroup) {
        C7573i.m23587b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a28, viewGroup, false);
        C7573i.m23582a((Object) inflate, "LayoutInflater.from(pare…em_search, parent, false)");
        super(inflate);
        this.f83181d.setOnClickListener(new OnClickListener(this) {

            /* renamed from: a */
            final /* synthetic */ SearchViewHolder f83040a;

            {
                this.f83040a = r1;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                C48006q<? super Integer, ? super Integer, ? super View, C7581n> qVar = this.f83040a.f83179b;
                if (qVar != null) {
                    Integer valueOf = Integer.valueOf(1);
                    Integer valueOf2 = Integer.valueOf(this.f83040a.getAdapterPosition());
                    C7573i.m23582a((Object) view, "it");
                    qVar.invoke(valueOf, valueOf2, view);
                }
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo81879a(IMContact iMContact, IMContact iMContact2, int i) {
        C7573i.m23587b(iMContact, "item");
        C23323e.m76524b(this.f83181d, iMContact.getDisplayAvatar());
    }
}
