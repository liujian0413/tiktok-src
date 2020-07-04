package com.p280ss.android.ugc.aweme.poi.p335ui.detail.component;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.p280ss.android.ugc.aweme.newfollow.model.C34145b;
import com.p280ss.android.ugc.aweme.poi.PoiSimpleBundle;
import com.p280ss.android.ugc.aweme.poi.adapter.viewholder.PoiDetailHeaderInfoPresenter.C35025a;
import com.p280ss.android.ugc.aweme.poi.model.PoiDetail;
import com.p280ss.android.ugc.aweme.poi.p335ui.coupon.C35308e;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.List;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.detail.component.PoiHeaderWidgetGroup */
public final class PoiHeaderWidgetGroup extends LinearLayout {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f92607a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(PoiHeaderWidgetGroup.class), "mPoiStructureInfoWidget", "getMPoiStructureInfoWidget()Lcom/ss/android/ugc/aweme/poi/ui/detail/component/PoiStructureInfoWidget;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(PoiHeaderWidgetGroup.class), "mPoiContentContainer", "getMPoiContentContainer()Landroid/widget/LinearLayout;"))};

    /* renamed from: b */
    private C35349a f92608b;

    /* renamed from: c */
    private final C7541d f92609c;

    /* renamed from: d */
    private final C7541d f92610d;

    /* renamed from: e */
    private HashMap f92611e;

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.detail.component.PoiHeaderWidgetGroup$a */
    static final class C35329a extends Lambda implements C7561a<LinearLayout> {

        /* renamed from: a */
        final /* synthetic */ PoiHeaderWidgetGroup f92612a;

        C35329a(PoiHeaderWidgetGroup poiHeaderWidgetGroup) {
            this.f92612a = poiHeaderWidgetGroup;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public LinearLayout invoke() {
            return (LinearLayout) this.f92612a.mo89895a(R.id.cf5);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.detail.component.PoiHeaderWidgetGroup$b */
    static final class C35330b extends Lambda implements C7561a<PoiStructureInfoWidget> {

        /* renamed from: a */
        final /* synthetic */ PoiHeaderWidgetGroup f92613a;

        C35330b(PoiHeaderWidgetGroup poiHeaderWidgetGroup) {
            this.f92613a = poiHeaderWidgetGroup;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public PoiStructureInfoWidget invoke() {
            return (PoiStructureInfoWidget) this.f92613a.mo89895a(R.id.cf7);
        }
    }

    public PoiHeaderWidgetGroup(Context context) {
        this(context, null, 0, 6, null);
    }

    public PoiHeaderWidgetGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    private final LinearLayout getMPoiContentContainer() {
        return (LinearLayout) this.f92610d.getValue();
    }

    private final PoiStructureInfoWidget getMPoiStructureInfoWidget() {
        return (PoiStructureInfoWidget) this.f92609c.getValue();
    }

    /* renamed from: a */
    public final View mo89895a(int i) {
        if (this.f92611e == null) {
            this.f92611e = new HashMap();
        }
        View view = (View) this.f92611e.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f92611e.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public PoiHeaderWidgetGroup(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.vn, this);
        this.f92609c = C7546e.m23569a(new C35330b(this));
        this.f92610d = C7546e.m23569a(new C35329a(this));
    }

    /* renamed from: a */
    private final void m114030a(C34145b bVar, PoiSimpleBundle poiSimpleBundle, C35025a aVar, C35308e eVar) {
        getMPoiStructureInfoWidget().mo89899a(aVar, eVar);
        PoiStructureInfoWidget mPoiStructureInfoWidget = getMPoiStructureInfoWidget();
        if (bVar != null) {
            mPoiStructureInfoWidget.mo89900a((PoiDetail) bVar, poiSimpleBundle);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.poi.model.PoiDetail");
    }

    /* renamed from: a */
    public final void mo89896a(List<? extends C34145b> list, PoiSimpleBundle poiSimpleBundle, C35025a aVar, C35308e eVar) {
        C7573i.m23587b(list, "data");
        C7573i.m23587b(aVar, "iCollectionInfoGetter");
        C7573i.m23587b(eVar, "joinCouponCallback");
        Context context = getContext();
        C7573i.m23582a((Object) context, "context");
        this.f92608b = new C35349a(context, getMPoiContentContainer());
        for (C34145b bVar : list) {
            switch (bVar.getFeedType()) {
                case 65441:
                    m114030a(bVar, poiSimpleBundle, aVar, eVar);
                    break;
                case 65446:
                    if (this.f92608b == null) {
                        C7573i.m23583a("componentBuilder");
                    }
                    C35349a.m114066d(bVar, poiSimpleBundle);
                    break;
                case 65448:
                    if (this.f92608b == null) {
                        C7573i.m23583a("componentBuilder");
                    }
                    C35349a.m114063a(bVar, poiSimpleBundle);
                    break;
                case 65449:
                    if (this.f92608b == null) {
                        C7573i.m23583a("componentBuilder");
                    }
                    C35349a.m114064b(bVar, poiSimpleBundle);
                    break;
                case 65453:
                    if (this.f92608b == null) {
                        C7573i.m23583a("componentBuilder");
                    }
                    C35349a.m114065c(bVar, poiSimpleBundle);
                    break;
            }
        }
    }

    public /* synthetic */ PoiHeaderWidgetGroup(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
