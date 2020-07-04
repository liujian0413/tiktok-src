package com.p280ss.android.ugc.aweme.poi.p335ui;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.PoiRoutePresenter_ViewBinding */
public class PoiRoutePresenter_ViewBinding implements Unbinder {

    /* renamed from: a */
    private PoiRoutePresenter f92450a;

    /* renamed from: b */
    private View f92451b;

    /* renamed from: c */
    private View f92452c;

    /* renamed from: d */
    private View f92453d;

    public void unbind() {
        PoiRoutePresenter poiRoutePresenter = this.f92450a;
        if (poiRoutePresenter != null) {
            this.f92450a = null;
            poiRoutePresenter.mRouteDrive = null;
            poiRoutePresenter.mRouteBus = null;
            poiRoutePresenter.mRouteWalking = null;
            poiRoutePresenter.mTitle = null;
            poiRoutePresenter.mRouteTab = null;
            this.f92451b.setOnClickListener(null);
            this.f92451b = null;
            this.f92452c.setOnClickListener(null);
            this.f92452c = null;
            this.f92453d.setOnClickListener(null);
            this.f92453d = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public PoiRoutePresenter_ViewBinding(final PoiRoutePresenter poiRoutePresenter, View view) {
        this.f92450a = poiRoutePresenter;
        View findRequiredView = Utils.findRequiredView(view, R.id.cgi, "field 'mRouteDrive' and method 'onClick'");
        poiRoutePresenter.mRouteDrive = (TextView) Utils.castView(findRequiredView, R.id.cgi, "field 'mRouteDrive'", TextView.class);
        this.f92451b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                poiRoutePresenter.onClick(view);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, R.id.cgf, "field 'mRouteBus' and method 'onClick'");
        poiRoutePresenter.mRouteBus = (TextView) Utils.castView(findRequiredView2, R.id.cgf, "field 'mRouteBus'", TextView.class);
        this.f92452c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                poiRoutePresenter.onClick(view);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, R.id.cgt, "field 'mRouteWalking' and method 'onClick'");
        poiRoutePresenter.mRouteWalking = (TextView) Utils.castView(findRequiredView3, R.id.cgt, "field 'mRouteWalking'", TextView.class);
        this.f92453d = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                poiRoutePresenter.onClick(view);
            }
        });
        poiRoutePresenter.mTitle = (TextView) Utils.findOptionalViewAsType(view, R.id.cgo, "field 'mTitle'", TextView.class);
        poiRoutePresenter.mRouteTab = Utils.findRequiredView(view, R.id.cgm, "field 'mRouteTab'");
    }
}
