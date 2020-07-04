package com.p280ss.android.ugc.aweme.poi.p335ui.p1473a;

import android.app.Activity;
import android.content.Context;
import com.p280ss.android.ugc.aweme.app.api.p1023b.C22814a;
import com.p280ss.android.ugc.aweme.newfollow.model.C34145b;
import com.p280ss.android.ugc.aweme.poi.model.C35105b;
import com.p280ss.android.ugc.aweme.poi.model.PoiCouponActivityStruct;
import com.p280ss.android.ugc.aweme.poi.model.PoiQRDetailStruct;
import com.p280ss.android.ugc.aweme.poi.p335ui.C35386j;
import com.p280ss.android.ugc.aweme.poi.p335ui.C35386j.C35388a;
import com.p280ss.android.ugc.aweme.poi.p335ui.C35390l;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.a.a */
public final class C35271a extends C35386j<C35105b> {

    /* renamed from: p */
    public boolean f92463p;

    /* renamed from: q */
    private PoiQRDetailStruct f92464q;

    /* renamed from: x */
    public final C35105b mo66539h() {
        return (C35105b) this.f67571b;
    }

    /* renamed from: v */
    public final PoiCouponActivityStruct mo89806v() {
        if (this.f92464q != null) {
            return this.f92464q.getActivity();
        }
        return null;
    }

    /* renamed from: t */
    public final boolean mo86797t() {
        if (this.f92464q == null || this.f92464q.getException() != null || !mo89805u()) {
            return false;
        }
        return true;
    }

    /* renamed from: u */
    public final boolean mo89805u() {
        PoiCouponActivityStruct poiCouponActivityStruct;
        if (this.f92464q != null) {
            poiCouponActivityStruct = this.f92464q.getActivity();
        } else {
            poiCouponActivityStruct = null;
        }
        if (poiCouponActivityStruct == null || !poiCouponActivityStruct.isValid()) {
            return false;
        }
        return true;
    }

    /* renamed from: w */
    public final List<C34145b> mo89807w() {
        if (this.f67571b != null) {
            return ((C35105b) this.f67571b).getItems();
        }
        return new ArrayList();
    }

    /* renamed from: b */
    public final void mo56977b() {
        if (this.f67571b != null && this.f67572c != null && ((C35390l) this.f67572c).isViewValid()) {
            int i = ((C35105b) this.f67571b).mListQueryType;
            boolean z = false;
            if (i != 1) {
                switch (i) {
                    case 4:
                    case 5:
                        C35390l lVar = (C35390l) this.f67572c;
                        List items = ((C35105b) this.f67571b).getItems();
                        if (((C35105b) this.f67571b).isHasMore() && !((C35105b) this.f67571b).isNewDataEmpty()) {
                            z = true;
                        }
                        lVar.mo75161b(items, z);
                        break;
                }
                return;
            }
            this.f92463p = false;
            ((C35390l) this.f67572c).mo75152a(((C35105b) this.f67571b).getItems(), ((C35105b) this.f67571b).isHasMore());
        }
    }

    public C35271a(C35388a aVar) {
        super(aVar);
    }

    /* renamed from: a */
    public final void mo89804a(List<C34145b> list) {
        if (this.f67571b != null) {
            ((C35105b) this.f67571b).setItems(list);
        }
    }

    /* renamed from: a */
    public final void mo89802a(Activity activity) {
        if (this.f92464q != null && this.f92464q.getException() != null) {
            C22814a.m75244a((Context) activity, (Throwable) this.f92464q.getException());
        }
    }

    /* renamed from: a */
    public final void mo89803a(PoiQRDetailStruct poiQRDetailStruct) {
        this.f92464q = poiQRDetailStruct;
        if (this.f92824o != null) {
            if (mo86797t()) {
                this.f92824o.mo89737k();
            }
            if (mo75080r().getActivity() != null) {
                mo89802a((Activity) mo75080r().getActivity());
            }
        }
    }

    /* renamed from: a */
    public final void mo57296a(Exception exc) {
        if (this.f67571b != null && this.f67572c != null && ((C35390l) this.f67572c).isViewValid()) {
            ((C35390l) this.f67572c).mo75153a(false);
            int i = ((C35105b) this.f67571b).mListQueryType;
            if (i != 1) {
                switch (i) {
                    case 4:
                        ((C35390l) this.f67572c).mo75163b(1);
                        return;
                    case 5:
                        ((C35390l) this.f67572c).mo75163b(5);
                        break;
                }
                return;
            }
            ((C35390l) this.f67572c).mo75133a(1);
            this.f92463p = true;
        }
    }
}
