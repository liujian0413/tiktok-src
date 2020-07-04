package com.p280ss.android.ugc.aweme.language;

import android.content.Context;
import android.support.p022v4.content.C0683b;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7562b;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.language.RegionSelectViewHolder */
public final class RegionSelectViewHolder extends C1293v {

    /* renamed from: a */
    private final DmtTextView f84413a;

    /* renamed from: b */
    private final LinearLayout f84414b;

    /* renamed from: com.ss.android.ugc.aweme.language.RegionSelectViewHolder$a */
    static final class C32317a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C7562b f84415a;

        /* renamed from: b */
        final /* synthetic */ C32329j f84416b;

        C32317a(C7562b bVar, C32329j jVar) {
            this.f84415a = bVar;
            this.f84416b = jVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C7562b bVar = this.f84415a;
            if (bVar != null) {
                bVar.invoke(this.f84416b);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.language.RegionSelectViewHolder$b */
    static final class C32318b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C7562b f84417a;

        /* renamed from: b */
        final /* synthetic */ C32329j f84418b;

        C32318b(C7562b bVar, C32329j jVar) {
            this.f84417a = bVar;
            this.f84418b = jVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C7562b bVar = this.f84417a;
            if (bVar != null) {
                bVar.invoke(this.f84418b);
            }
        }
    }

    public RegionSelectViewHolder(View view) {
        C7573i.m23587b(view, "itemView");
        super(view);
        DmtTextView dmtTextView = (DmtTextView) view.findViewById(R.id.cr9);
        C7573i.m23582a((Object) dmtTextView, "itemView.region_text");
        this.f84413a = dmtTextView;
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.cwn);
        C7573i.m23582a((Object) linearLayout, "itemView.root_layout");
        this.f84414b = linearLayout;
    }

    /* renamed from: a */
    public final void mo83526a(C32329j jVar, C7562b<? super C32329j, C7581n> bVar, C32329j jVar2) {
        String str;
        C7573i.m23587b(jVar, "item");
        boolean z = jVar instanceof C32323d;
        int i = R.color.fs;
        if (z) {
            this.f84413a.setText("*NONE*");
            DmtTextView dmtTextView = this.f84413a;
            View view = this.itemView;
            C7573i.m23582a((Object) view, "itemView");
            Context context = view.getContext();
            if (jVar2 == null) {
                i = R.color.a3t;
            }
            dmtTextView.setTextColor(C0683b.m2912c(context, i));
            this.f84414b.setOnClickListener(new C32317a(bVar, jVar));
            return;
        }
        DmtTextView dmtTextView2 = this.f84413a;
        StringBuilder sb = new StringBuilder("[");
        sb.append(jVar.f84437b);
        sb.append(']');
        sb.append(jVar.f84436a);
        dmtTextView2.setText(sb.toString());
        DmtTextView dmtTextView3 = this.f84413a;
        View view2 = this.itemView;
        C7573i.m23582a((Object) view2, "itemView");
        Context context2 = view2.getContext();
        String str2 = jVar.f84437b;
        if (jVar2 != null) {
            str = jVar2.f84437b;
        } else {
            str = null;
        }
        if (C7634n.m23717a(str2, str, true)) {
            i = R.color.a3t;
        }
        dmtTextView3.setTextColor(C0683b.m2912c(context2, i));
        this.f84414b.setOnClickListener(new C32318b(bVar, jVar));
    }
}
