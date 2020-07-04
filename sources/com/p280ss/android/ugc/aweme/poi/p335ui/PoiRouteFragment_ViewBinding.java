package com.p280ss.android.ugc.aweme.poi.p335ui;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.PoiRouteFragment_ViewBinding */
public class PoiRouteFragment_ViewBinding implements Unbinder {

    /* renamed from: a */
    private PoiRouteFragment f92431a;

    /* renamed from: b */
    private View f92432b;

    public void unbind() {
        if (this.f92431a != null) {
            this.f92431a = null;
            this.f92432b.setOnClickListener(null);
            this.f92432b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public PoiRouteFragment_ViewBinding(final PoiRouteFragment poiRouteFragment, View view) {
        this.f92431a = poiRouteFragment;
        View findRequiredView = Utils.findRequiredView(view, R.id.cge, "method 'onClick'");
        this.f92432b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                poiRouteFragment.onClick(view);
            }
        });
    }
}
