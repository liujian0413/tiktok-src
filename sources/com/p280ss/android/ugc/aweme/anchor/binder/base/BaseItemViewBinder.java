package com.p280ss.android.ugc.aweme.anchor.binder.base;

import android.app.Activity;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.anchor.binder.C22534a;
import kotlin.jvm.internal.C7573i;
import p1886me.drakeet.multitype.C48226c;
import p1886me.drakeet.multitype.MultiTypeAdapter;

/* renamed from: com.ss.android.ugc.aweme.anchor.binder.base.BaseItemViewBinder */
public abstract class BaseItemViewBinder<T, VH extends C1293v> extends C48226c<T, VH> {

    /* renamed from: a */
    public C22534a<T> f60022a;

    /* renamed from: b */
    public final Activity f60023b;

    /* renamed from: com.ss.android.ugc.aweme.anchor.binder.base.BaseItemViewBinder$BaseItemViewHolder */
    public class BaseItemViewHolder extends C1293v {

        /* renamed from: a */
        final /* synthetic */ BaseItemViewBinder f60024a;

        public BaseItemViewHolder(BaseItemViewBinder baseItemViewBinder, View view) {
            C7573i.m23587b(view, "itemView");
            this.f60024a = baseItemViewBinder;
            super(view);
            view.setOnClickListener(new OnClickListener(this) {

                /* renamed from: a */
                final /* synthetic */ BaseItemViewHolder f60025a;

                {
                    this.f60025a = r1;
                }

                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    if (this.f60025a.getAdapterPosition() >= 0) {
                        MultiTypeAdapter multiTypeAdapter = this.f60025a.f60024a.f123131e;
                        C7573i.m23582a((Object) multiTypeAdapter, "adapter");
                        Object obj = multiTypeAdapter.f123129a.get(this.f60025a.getAdapterPosition());
                        C22534a<T> aVar = this.f60025a.f60024a.f60022a;
                        if (aVar != null) {
                            C7573i.m23582a((Object) view, "it");
                            aVar.mo59121a(view, obj);
                        }
                    }
                }
            });
        }
    }

    public BaseItemViewBinder(Activity activity) {
        this.f60023b = activity;
    }
}
