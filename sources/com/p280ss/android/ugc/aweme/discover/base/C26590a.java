package com.p280ss.android.ugc.aweme.discover.base;

import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.widget.DmtLoadingLayout;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.p280ss.android.ugc.aweme.discover.base.LoadMoreAdapterWrapper.C26587b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.base.a */
final class C26590a extends C26587b {

    /* renamed from: a */
    private DmtStatusView f70135a;

    /* renamed from: com.ss.android.ugc.aweme.discover.base.a$a */
    static final class C26591a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ LoadMoreAdapterWrapper f70136a;

        C26591a(LoadMoreAdapterWrapper loadMoreAdapterWrapper) {
            this.f70136a = loadMoreAdapterWrapper;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f70136a.mo68264c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.base.a$b */
    public static final class C26592b implements OnAttachStateChangeListener {

        /* renamed from: a */
        final /* synthetic */ DmtStatusView f70137a;

        public final void onViewDetachedFromWindow(View view) {
        }

        C26592b(DmtStatusView dmtStatusView) {
            this.f70137a = dmtStatusView;
        }

        public final void onViewAttachedToWindow(View view) {
            if (this.f70137a.mo25945i() && view != null) {
                view.setVisibility(0);
            }
        }
    }

    /* renamed from: a */
    public final void mo68268a(int i) {
        switch (i) {
            case 0:
                DmtStatusView dmtStatusView = this.f70135a;
                if (dmtStatusView != null) {
                    dmtStatusView.setStatus(-1);
                    break;
                } else {
                    return;
                }
            case 1:
                DmtStatusView dmtStatusView2 = this.f70135a;
                if (dmtStatusView2 != null) {
                    dmtStatusView2.setStatus(0);
                    break;
                } else {
                    return;
                }
            case 2:
                DmtStatusView dmtStatusView3 = this.f70135a;
                if (dmtStatusView3 != null) {
                    dmtStatusView3.setStatus(1);
                    break;
                } else {
                    return;
                }
            case 3:
                DmtStatusView dmtStatusView4 = this.f70135a;
                if (dmtStatusView4 != null) {
                    dmtStatusView4.setStatus(2);
                    return;
                }
                break;
        }
    }

    /* renamed from: a */
    public final View mo68267a(ViewGroup viewGroup, LoadMoreAdapterWrapper loadMoreAdapterWrapper) {
        C7573i.m23587b(viewGroup, "parent");
        C7573i.m23587b(loadMoreAdapterWrapper, "wrapper");
        DmtStatusView dmtStatusView = new DmtStatusView(viewGroup.getContext());
        dmtStatusView.setLayoutParams(new LayoutParams(-1, (int) C9738o.m28708b(viewGroup.getContext(), 60.0f)));
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.b2x, null);
        if (inflate != null) {
            TextView textView = (TextView) inflate;
            textView.setGravity(17);
            View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.b2x, null);
            if (inflate2 != null) {
                TextView textView2 = (TextView) inflate2;
                textView2.setText(R.string.c46);
                textView2.setOnClickListener(new C26591a(loadMoreAdapterWrapper));
                textView2.setGravity(17);
                DmtLoadingLayout dmtLoadingLayout = new DmtLoadingLayout(viewGroup.getContext());
                dmtLoadingLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                dmtLoadingLayout.addOnAttachStateChangeListener(new C26592b(dmtStatusView));
                dmtStatusView.setBuilder(new C10803a(viewGroup.getContext()).mo25960a((View) dmtLoadingLayout).mo25963b((View) textView).mo25966c((View) textView2));
                this.f70135a = dmtStatusView;
                return dmtStatusView;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.TextView");
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.TextView");
    }
}
