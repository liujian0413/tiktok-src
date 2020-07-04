package com.p280ss.android.ugc.aweme.poi.map;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.bytedane.aweme.map.api.C13045a;
import com.bytedane.aweme.map.api.C13047b;
import com.bytedane.aweme.map.api.C13048c;
import com.bytedane.aweme.map.api.C13049d;
import com.bytedane.aweme.map.api.data.C13050a;
import com.p280ss.android.ugc.aweme.map.p1389a.C33116a;
import com.p280ss.android.ugc.aweme.poi.model.PoiLatLng;

/* renamed from: com.ss.android.ugc.aweme.poi.map.MapLayout */
public class MapLayout extends BaseMapLayout {

    /* renamed from: b */
    private C13045a f91775b;

    /* renamed from: c */
    private C35101n f91776c;

    public float getZoomBig() {
        return 14.0f;
    }

    public float getZoomSmall() {
        return 10.0f;
    }

    public void setOnCameraChangeListener(C13047b bVar) {
    }

    /* renamed from: a */
    public final void mo88955a(PoiLatLng poiLatLng, PoiLatLng poiLatLng2, MapRoutePlan mapRoutePlan, String str, C35098k kVar) {
        new C13050a(poiLatLng.latitude, poiLatLng.longitude);
        new C13050a(poiLatLng2.latitude, poiLatLng2.longitude);
        new C35091d(this, kVar);
    }

    /* renamed from: a */
    public final void mo88953a(View view, PoiLatLng poiLatLng, Bitmap bitmap, C35094g gVar) {
        this.f91775b.mo31624a(view, new C13050a(poiLatLng.latitude, poiLatLng.longitude), bitmap, (C13049d) new C35092e(gVar));
    }

    /* renamed from: a */
    public final void mo88954a(C35099l lVar) {
        new C35093f(lVar);
    }

    /* renamed from: b */
    public final void mo88956b() {
        this.f91775b.mo31629e();
    }

    /* renamed from: c */
    public final void mo88957c() {
        this.f91775b.mo31626b();
    }

    /* renamed from: d */
    public final void mo88958d() {
        this.f91775b.mo31627c();
    }

    /* renamed from: e */
    public final void mo88960e() {
        this.f91775b.mo31628d();
    }

    /* renamed from: f */
    public final void mo88961f() {
        this.f91775b.mo31630f();
    }

    /* renamed from: a */
    public final void mo88947a() {
        this.f91775b.mo31618a();
    }

    public void setOnMapZoomGestureListener(C35101n nVar) {
        this.f91776c = nVar;
    }

    public MapLayout(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    static final /* synthetic */ void m113233a(C35094g gVar) {
        if (gVar != null) {
            gVar.mo88967a();
        }
    }

    /* renamed from: a */
    static final /* synthetic */ void m113234a(C35096i iVar) {
        if (iVar != null) {
            iVar.mo88968d();
        }
    }

    public void setOnMapClickListener(C35100m mVar) {
        this.f91775b.mo31625a((C13048c) new C35090c(mVar));
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        getParent().requestDisallowInterceptTouchEvent(true);
        if (motionEvent.getAction() == 261 && this.f91776c != null) {
            this.f91776c.bt_();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: a */
    public final void mo88951a(Bundle bundle) {
        this.f91775b.mo31622a(bundle);
    }

    public MapLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public final void mo88952a(Bundle bundle, C35096i iVar) {
        this.f91775b = new C33116a(this);
        this.f91775b.mo31623a(bundle, new C35088a(iVar));
    }

    public MapLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: a */
    static final /* synthetic */ void m113235a(C35100m mVar, double d, double d2) {
        if (mVar != null) {
            mVar.mo88969a(d, d2);
        }
    }

    /* renamed from: a */
    public final void mo88949a(Bitmap bitmap, double d, double d2) {
        this.f91775b.mo31620a(bitmap, d, d2);
    }

    /* renamed from: a */
    public final void mo88948a(double d, double d2, double d3, double d4) {
        this.f91775b.mo31619a(d, d2, d3, d4);
    }

    /* renamed from: a */
    public final void mo88950a(Bitmap bitmap, double d, double d2, float f, C35095h hVar) {
        this.f91775b.mo31621a(bitmap, d, d2, f, new C35089b(hVar));
    }
}
