package com.p280ss.android.ugc.aweme.legoImp.inflate;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.widget.ButtonStyle;
import com.bytedance.ies.dmt.p262ui.widget.C10805b;
import com.bytedance.ies.dmt.p262ui.widget.C10805b.C10806a;
import com.bytedance.ies.dmt.p262ui.widget.DmtDefaultView;
import com.bytedance.ies.dmt.p262ui.widget.DmtLoadingLayout;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.feed.p1238ui.C28771ad;
import com.p280ss.android.ugc.aweme.lego.LegoInflate;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.legoImp.inflate.DmtStatusViewInflate */
public class DmtStatusViewInflate implements LegoInflate {
    private DmtStatusView mDmtStatusView;
    private C32340a mInnerClickListener = new C32340a();

    /* renamed from: com.ss.android.ugc.aweme.legoImp.inflate.DmtStatusViewInflate$a */
    class C32340a implements OnClickListener {

        /* renamed from: a */
        public OnClickListener f84447a;

        private C32340a() {
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f84447a.onClick(view);
        }
    }

    public Class<? extends Activity> activity() {
        return null;
    }

    public int theme() {
        return R.style.gu;
    }

    static final /* synthetic */ View lambda$createDmtStatusView$0$DmtStatusViewInflate(View view) {
        return new DmtLoadingLayout(view.getContext());
    }

    static final /* synthetic */ View lambda$createDmtStatusView$1$DmtStatusViewInflate(View view) {
        C10805b bVar = new C10806a(view.getContext()).mo25993c(R.string.b0x).f29135a;
        DmtDefaultView dmtDefaultView = new DmtDefaultView(view.getContext());
        dmtDefaultView.setStatus(bVar);
        return dmtDefaultView;
    }

    public void inflate(Context context, Activity activity) {
        this.mDmtStatusView = createDmtStatusView(context, this.mInnerClickListener);
    }

    public DmtStatusView getDmtStatusView(Context context, OnClickListener onClickListener) {
        if (this.mDmtStatusView == null) {
            return createDmtStatusView(context, onClickListener);
        }
        this.mInnerClickListener.f84447a = onClickListener;
        DmtStatusView dmtStatusView = this.mDmtStatusView;
        this.mDmtStatusView = null;
        return dmtStatusView;
    }

    private DmtStatusView createDmtStatusView(Context context, OnClickListener onClickListener) {
        C28771ad adVar = new C28771ad(context);
        adVar.mo73988a(C32342a.f84449a, C32343b.f84450a, new C32344c(context, onClickListener));
        adVar.mo25766a(1);
        adVar.setUseScreenHeight(context.getResources().getDimensionPixelSize(R.dimen.ml));
        adVar.mo73989c(0);
        return adVar;
    }

    static final /* synthetic */ View lambda$createDmtStatusView$2$DmtStatusViewInflate(Context context, OnClickListener onClickListener, View view) {
        int i;
        C10806a aVar = new C10806a(context);
        if (C6399b.m19946v()) {
            i = R.drawable.b7a;
        } else {
            i = R.drawable.b7_;
        }
        C10805b bVar = aVar.mo25985a(i).mo25990b((int) R.string.fi5).mo25993c(R.string.fi2).mo25986a(ButtonStyle.BORDER, R.string.fia, onClickListener).f29135a;
        DmtDefaultView dmtDefaultView = new DmtDefaultView(view.getContext());
        dmtDefaultView.setStatus(bVar);
        return dmtDefaultView;
    }
}
