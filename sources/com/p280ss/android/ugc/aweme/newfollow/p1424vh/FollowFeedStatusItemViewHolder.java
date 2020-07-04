package com.p280ss.android.ugc.aweme.newfollow.p1424vh;

import android.content.Context;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.p280ss.android.ugc.aweme.newfollow.p1419b.C34121a;
import com.p280ss.android.ugc.aweme.views.C43361b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.newfollow.vh.FollowFeedStatusItemViewHolder */
public final class FollowFeedStatusItemViewHolder extends C1293v {

    /* renamed from: a */
    public C34121a f89277a;

    /* renamed from: b */
    public final Context f89278b;

    /* renamed from: c */
    private final DmtStatusView f89279c;

    /* renamed from: a */
    public final void mo86983a(C34121a aVar) {
        C7573i.m23587b(aVar, "listener");
        this.f89277a = aVar;
    }

    public FollowFeedStatusItemViewHolder(View view, Context context, int i) {
        C7573i.m23587b(view, "itemView");
        C7573i.m23587b(context, "context");
        super(view);
        this.f89278b = context;
        View findViewById = view.findViewById(R.id.dag);
        C7573i.m23582a((Object) findViewById, "itemView.findViewById(R.id.status)");
        this.f89279c = (DmtStatusView) findViewById;
        this.f89279c.setBuilder(C10803a.m31631a(this.f89278b).mo25964b(C43361b.m137644a(this.f89278b, new OnClickListener(this) {

            /* renamed from: a */
            final /* synthetic */ FollowFeedStatusItemViewHolder f89280a;

            {
                this.f89280a = r1;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                C34121a aVar = this.f89280a.f89277a;
                if (aVar != null) {
                    aVar.mo86787a();
                }
            }
        })));
        switch (i) {
            case 65531:
                LayoutParams layoutParams = this.f89279c.getLayoutParams();
                if (layoutParams != null) {
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                    layoutParams2.height = (int) C9738o.m28708b(this.f89278b, 100.0f);
                    this.f89279c.setLayoutParams(layoutParams2);
                    this.f89279c.mo25942f();
                    break;
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                }
            case 65533:
                this.f89279c.mo25934a(false);
                return;
            case 65534:
                this.f89279c.mo25942f();
                return;
        }
    }
}
