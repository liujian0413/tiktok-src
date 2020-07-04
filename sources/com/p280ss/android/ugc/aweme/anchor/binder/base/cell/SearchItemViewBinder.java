package com.p280ss.android.ugc.aweme.anchor.binder.base.cell;

import android.app.Activity;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.anchor.binder.base.BaseItemViewBinder;
import com.p280ss.android.ugc.aweme.anchor.binder.base.BaseItemViewBinder.BaseItemViewHolder;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import p1886me.drakeet.multitype.MultiTypeAdapter;

/* renamed from: com.ss.android.ugc.aweme.anchor.binder.base.cell.SearchItemViewBinder */
public final class SearchItemViewBinder extends BaseItemViewBinder<String, SearchHolder> {

    /* renamed from: c */
    public C22537a f60028c;

    /* renamed from: com.ss.android.ugc.aweme.anchor.binder.base.cell.SearchItemViewBinder$SearchHolder */
    public final class SearchHolder extends BaseItemViewHolder {

        /* renamed from: b */
        public final DmtTextView f60029b;

        /* renamed from: c */
        public final ImageView f60030c;

        /* renamed from: d */
        final /* synthetic */ SearchItemViewBinder f60031d;

        public SearchHolder(SearchItemViewBinder searchItemViewBinder, View view) {
            C7573i.m23587b(view, "itemView");
            this.f60031d = searchItemViewBinder;
            super(searchItemViewBinder, view);
            this.f60029b = (DmtTextView) view.findViewById(R.id.avp);
            this.f60030c = (ImageView) view.findViewById(R.id.avo);
            this.f60030c.setOnClickListener(new OnClickListener(this) {

                /* renamed from: a */
                final /* synthetic */ SearchHolder f60032a;

                {
                    this.f60032a = r1;
                }

                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    MultiTypeAdapter multiTypeAdapter = this.f60032a.f60031d.f123131e;
                    C7573i.m23582a((Object) multiTypeAdapter, "adapter");
                    Object obj = multiTypeAdapter.f123129a.get(this.f60032a.getAdapterPosition());
                    if (obj != null) {
                        String str = (String) obj;
                        C22537a aVar = this.f60032a.f60031d.f60028c;
                        if (aVar != null) {
                            aVar.mo59122a(str);
                            return;
                        }
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.anchor.binder.base.cell.SearchItemViewBinder$a */
    public interface C22537a {
        /* renamed from: a */
        void mo59122a(String str);
    }

    public SearchItemViewBinder(Activity activity) {
        super(activity);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo21966a(C1293v vVar, Object obj) {
        m74504a((SearchHolder) vVar, (String) obj);
    }

    /* renamed from: a */
    private static void m74504a(SearchHolder searchHolder, String str) {
        C7573i.m23587b(searchHolder, "holder");
        C7573i.m23587b(str, "name");
        DmtTextView dmtTextView = searchHolder.f60029b;
        C7573i.m23582a((Object) dmtTextView, "holder.mName");
        dmtTextView.setText(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public SearchHolder mo21965a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C7573i.m23587b(layoutInflater, "inflater");
        C7573i.m23587b(viewGroup, "parent");
        View inflate = layoutInflater.inflate(R.layout.t8, viewGroup, false);
        C7573i.m23582a((Object) inflate, "inflater.inflate(R.layou…h_history, parent, false)");
        return new SearchHolder(this, inflate);
    }
}
