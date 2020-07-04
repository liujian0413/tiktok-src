package com.p280ss.android.ugc.aweme.poi.p335ui;

import android.view.View;
import android.widget.ImageView;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.PoiOptimizedRoutePresenter_ViewBinding */
public class PoiOptimizedRoutePresenter_ViewBinding extends PoiRoutePresenter_ViewBinding {

    /* renamed from: a */
    private PoiOptimizedRoutePresenter f92401a;

    /* renamed from: b */
    private View f92402b;

    /* renamed from: c */
    private View f92403c;

    /* renamed from: d */
    private View f92404d;

    public void unbind() {
        PoiOptimizedRoutePresenter poiOptimizedRoutePresenter = this.f92401a;
        if (poiOptimizedRoutePresenter != null) {
            this.f92401a = null;
            poiOptimizedRoutePresenter.mRouteDriveLayout = null;
            poiOptimizedRoutePresenter.mRouteBusLayout = null;
            poiOptimizedRoutePresenter.mRouteWalkingLayout = null;
            poiOptimizedRoutePresenter.mRouteDriveImg = null;
            poiOptimizedRoutePresenter.mRouteBusImg = null;
            poiOptimizedRoutePresenter.mRouteWalkingImg = null;
            poiOptimizedRoutePresenter.mShareBtn = null;
            poiOptimizedRoutePresenter.mMoreActionBtn = null;
            this.f92402b.setOnClickListener(null);
            this.f92402b = null;
            this.f92403c.setOnClickListener(null);
            this.f92403c = null;
            this.f92404d.setOnClickListener(null);
            this.f92404d = null;
            super.unbind();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public PoiOptimizedRoutePresenter_ViewBinding(final PoiOptimizedRoutePresenter poiOptimizedRoutePresenter, View view) {
        super(poiOptimizedRoutePresenter, view);
        this.f92401a = poiOptimizedRoutePresenter;
        View findRequiredView = Utils.findRequiredView(view, R.id.cgk, "field 'mRouteDriveLayout' and method 'onClick'");
        poiOptimizedRoutePresenter.mRouteDriveLayout = findRequiredView;
        this.f92402b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                poiOptimizedRoutePresenter.onClick(view);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, R.id.cgh, "field 'mRouteBusLayout' and method 'onClick'");
        poiOptimizedRoutePresenter.mRouteBusLayout = findRequiredView2;
        this.f92403c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                poiOptimizedRoutePresenter.onClick(view);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, R.id.cgv, "field 'mRouteWalkingLayout' and method 'onClick'");
        poiOptimizedRoutePresenter.mRouteWalkingLayout = findRequiredView3;
        this.f92404d = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                poiOptimizedRoutePresenter.onClick(view);
            }
        });
        poiOptimizedRoutePresenter.mRouteDriveImg = (ImageView) Utils.findRequiredViewAsType(view, R.id.cgj, "field 'mRouteDriveImg'", ImageView.class);
        poiOptimizedRoutePresenter.mRouteBusImg = (ImageView) Utils.findRequiredViewAsType(view, R.id.cgg, "field 'mRouteBusImg'", ImageView.class);
        poiOptimizedRoutePresenter.mRouteWalkingImg = (ImageView) Utils.findRequiredViewAsType(view, R.id.cgu, "field 'mRouteWalkingImg'", ImageView.class);
        poiOptimizedRoutePresenter.mShareBtn = view.findViewById(R.id.d4t);
        poiOptimizedRoutePresenter.mMoreActionBtn = view.findViewById(R.id.bzv);
    }
}
