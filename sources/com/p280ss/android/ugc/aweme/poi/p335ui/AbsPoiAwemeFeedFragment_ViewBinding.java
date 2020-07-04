package com.p280ss.android.ugc.aweme.poi.p335ui;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.p280ss.android.ugc.aweme.common.widget.NestedScrollingRecyclerView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.AbsPoiAwemeFeedFragment_ViewBinding */
public class AbsPoiAwemeFeedFragment_ViewBinding implements Unbinder {

    /* renamed from: a */
    private AbsPoiAwemeFeedFragment f92349a;

    /* renamed from: b */
    private View f92350b;

    /* renamed from: c */
    private View f92351c;

    public void unbind() {
        AbsPoiAwemeFeedFragment absPoiAwemeFeedFragment = this.f92349a;
        if (absPoiAwemeFeedFragment != null) {
            this.f92349a = null;
            absPoiAwemeFeedFragment.mStatusView = null;
            absPoiAwemeFeedFragment.mStartRecodeLayout = null;
            absPoiAwemeFeedFragment.mStartRecordOutRing = null;
            absPoiAwemeFeedFragment.mRecyclerView = null;
            this.f92350b.setOnClickListener(null);
            this.f92350b = null;
            this.f92351c.setOnClickListener(null);
            this.f92351c = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public AbsPoiAwemeFeedFragment_ViewBinding(final AbsPoiAwemeFeedFragment absPoiAwemeFeedFragment, View view) {
        this.f92349a = absPoiAwemeFeedFragment;
        absPoiAwemeFeedFragment.mStatusView = (DmtStatusView) Utils.findRequiredViewAsType(view, R.id.dag, "field 'mStatusView'", DmtStatusView.class);
        absPoiAwemeFeedFragment.mStartRecodeLayout = view.findViewById(R.id.da5);
        absPoiAwemeFeedFragment.mStartRecordOutRing = view.findViewById(R.id.da8);
        absPoiAwemeFeedFragment.mRecyclerView = (NestedScrollingRecyclerView) Utils.findRequiredViewAsType(view, R.id.bnf, "field 'mRecyclerView'", NestedScrollingRecyclerView.class);
        View findRequiredView = Utils.findRequiredView(view, R.id.jo, "method 'onClick'");
        this.f92350b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                absPoiAwemeFeedFragment.onClick(view);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, R.id.d4t, "method 'onClick'");
        this.f92351c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                absPoiAwemeFeedFragment.onClick(view);
            }
        });
    }
}
