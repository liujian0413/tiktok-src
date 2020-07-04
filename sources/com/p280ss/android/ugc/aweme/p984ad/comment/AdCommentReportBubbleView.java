package com.p280ss.android.ugc.aweme.p984ad.comment;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.commercialize.model.LinkData;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.ad.comment.AdCommentReportBubbleView */
public final class AdCommentReportBubbleView extends LinearLayout implements OnClickListener {

    /* renamed from: a */
    private LinkData f59718a;

    /* renamed from: b */
    private Aweme f59719b;

    /* renamed from: c */
    private C22389a f59720c;

    /* renamed from: d */
    private DmtTextView f59721d;

    /* renamed from: e */
    private DmtTextView f59722e;

    /* renamed from: f */
    private DmtTextView f59723f;

    /* renamed from: com.ss.android.ugc.aweme.ad.comment.AdCommentReportBubbleView$a */
    public interface C22389a {
        /* renamed from: a */
        void mo58883a();

        /* renamed from: b */
        void mo58884b();

        /* renamed from: c */
        void mo58885c();
    }

    /* renamed from: a */
    private final void m74143a() {
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.ik, this, true);
        this.f59721d = (DmtTextView) inflate.findViewById(R.id.bw0);
        this.f59722e = (DmtTextView) inflate.findViewById(R.id.c56);
        this.f59723f = (DmtTextView) inflate.findViewById(R.id.crz);
        DmtTextView dmtTextView = this.f59721d;
        if (dmtTextView != null) {
            dmtTextView.setOnClickListener(this);
        }
        DmtTextView dmtTextView2 = this.f59722e;
        if (dmtTextView2 != null) {
            dmtTextView2.setOnClickListener(this);
        }
        DmtTextView dmtTextView3 = this.f59723f;
        if (dmtTextView3 != null) {
            dmtTextView3.setOnClickListener(this);
        }
    }

    public final void setInnerClick(C22389a aVar) {
        this.f59720c = aVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C7573i.m23587b(view, "v");
        int id = view.getId();
        if (id == R.id.bw0) {
            C22389a aVar = this.f59720c;
            if (aVar != null) {
                aVar.mo58884b();
            }
        } else if (id == R.id.c56) {
            C22389a aVar2 = this.f59720c;
            if (aVar2 != null) {
                aVar2.mo58883a();
            }
        } else if (id == R.id.crz) {
            C22389a aVar3 = this.f59720c;
            if (aVar3 != null) {
                aVar3.mo58885c();
            }
        }
    }

    /* renamed from: a */
    public final void mo58880a(LinkData linkData, Aweme aweme) {
        C7573i.m23587b(linkData, "linkData");
        C7573i.m23587b(aweme, "aweme");
        this.f59718a = linkData;
        this.f59719b = aweme;
        if (linkData.reportEnabled) {
            DmtTextView dmtTextView = this.f59723f;
            if (dmtTextView != null) {
                dmtTextView.setVisibility(0);
            }
            return;
        }
        DmtTextView dmtTextView2 = this.f59723f;
        if (dmtTextView2 != null) {
            dmtTextView2.setVisibility(8);
        }
    }

    public AdCommentReportBubbleView(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
        m74143a();
    }

    public /* synthetic */ AdCommentReportBubbleView(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        this(context, null, 0);
    }
}
