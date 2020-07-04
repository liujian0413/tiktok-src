package com.p280ss.android.ugc.aweme.poi.p335ui;

import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.poi.map.C35102o;
import com.p280ss.android.ugc.aweme.poi.map.MapRoutePlan;
import com.p280ss.android.ugc.aweme.poi.model.PoiStruct;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.PoiOptimizedRoutePresenter */
public class PoiOptimizedRoutePresenter extends PoiRoutePresenter implements C35102o {

    /* renamed from: j */
    private boolean f92397j = true;

    /* renamed from: k */
    private boolean f92398k;

    /* renamed from: l */
    private boolean f92399l;
    View mMoreActionBtn;
    ImageView mRouteBusImg;
    View mRouteBusLayout;
    ImageView mRouteDriveImg;
    View mRouteDriveLayout;
    ImageView mRouteWalkingImg;
    View mRouteWalkingLayout;
    View mShareBtn;

    /* renamed from: f */
    public final boolean mo89772f() {
        return this.f92398k;
    }

    /* renamed from: g */
    public final C35102o mo89773g() {
        return this;
    }

    /* renamed from: a */
    public final void mo88971a() {
        if (this.f92442h) {
            mo89799m();
        }
    }

    /* renamed from: h */
    public final int mo89774h() {
        if (this.f92442h) {
            return R.layout.a0m;
        }
        return R.layout.a0l;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo89768b() {
        Object tag = this.mRouteDriveLayout.getTag();
        if (tag != null && (tag instanceof Boolean) && ((Boolean) tag).booleanValue()) {
            mo89793b(MapRoutePlan.RouteDrive);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo89769c() {
        Object tag = this.mRouteBusLayout.getTag();
        if (tag != null && (tag instanceof Boolean) && ((Boolean) tag).booleanValue()) {
            mo89793b(MapRoutePlan.RouteTransit);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo89770d() {
        Object tag = this.mRouteWalkingLayout.getTag();
        if (tag != null && (tag instanceof Boolean) && ((Boolean) tag).booleanValue()) {
            mo89793b(MapRoutePlan.RouteWalking);
        }
    }

    /* renamed from: o */
    private void m113799o() {
        if (this.f92436b != null) {
            Object obj = null;
            switch (this.f92436b) {
                case RouteDrive:
                    obj = this.mRouteDriveLayout.getTag();
                    break;
                case RouteTransit:
                    obj = this.mRouteBusLayout.getTag();
                    break;
                case RouteWalking:
                    obj = this.mRouteWalkingLayout.getTag();
                    break;
            }
            if (obj != null && (obj instanceof Boolean) && ((Boolean) obj).booleanValue()) {
                mo89794c(this.f92436b);
                mo89791a(this.f92436b);
            }
        }
    }

    /* renamed from: e */
    public final void mo89771e() {
        if (!this.f92399l && mo89796j() && this.f92439e != null) {
            this.f92399l = true;
            mo89786a(this.f92439e[0], this.f92439e[1]);
            if (this.f92442h) {
                this.f92398k = true;
                m113799o();
                mo89798l();
                if (C6399b.m19944t()) {
                    this.f92435a.mo88948a(this.f92440f, this.f92441g, this.f92439e[0], this.f92439e[1]);
                }
            }
        }
    }

    /* renamed from: a */
    public final boolean mo89767a(PoiStruct poiStruct) {
        return super.mo89767a(poiStruct);
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.cgk) {
            mo89768b();
        } else if (id == R.id.cgh) {
            mo89769c();
        } else if (id == R.id.cgv) {
            mo89770d();
        } else {
            super.onClick(view);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo89766a(MapRoutePlan mapRoutePlan, boolean z) {
        int i;
        int i2;
        int i3;
        if (mapRoutePlan != null) {
            switch (mapRoutePlan) {
                case RouteDrive:
                    View view = this.mRouteDriveLayout;
                    ImageView imageView = this.mRouteDriveImg;
                    TextView textView = this.mRouteDrive;
                    if (z) {
                        i = R.drawable.aqs;
                    } else {
                        i = R.drawable.aqr;
                    }
                    m113798a(view, imageView, textView, i, z);
                    return;
                case RouteTransit:
                    View view2 = this.mRouteBusLayout;
                    ImageView imageView2 = this.mRouteBusImg;
                    TextView textView2 = this.mRouteBus;
                    if (z) {
                        i2 = R.drawable.apn;
                    } else {
                        i2 = R.drawable.apm;
                    }
                    m113798a(view2, imageView2, textView2, i2, z);
                    return;
                case RouteWalking:
                    View view3 = this.mRouteWalkingLayout;
                    ImageView imageView3 = this.mRouteWalkingImg;
                    TextView textView3 = this.mRouteWalking;
                    if (z) {
                        i3 = R.drawable.b2r;
                    } else {
                        i3 = R.drawable.b2q;
                    }
                    m113798a(view3, imageView3, textView3, i3, z);
                    break;
            }
        }
    }

    /* renamed from: a */
    private void m113798a(View view, ImageView imageView, TextView textView, int i, boolean z) {
        int i2;
        imageView.setImageResource(i);
        Resources k = mo89797k();
        if (z) {
            i2 = R.color.a71;
        } else {
            i2 = R.color.a5d;
        }
        textView.setTextColor(k.getColor(i2));
        view.setSelected(z);
    }
}
