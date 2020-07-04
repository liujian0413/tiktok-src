package com.p280ss.android.ugc.aweme.poi.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.p280ss.android.ugc.aweme.poi.adapter.viewholder.PoiDetailHeaderInfoPresenter;
import com.p280ss.android.ugc.aweme.poi.adapter.viewholder.PoiDetailHeaderInfoPresenter.C35025a;
import com.p280ss.android.ugc.aweme.poi.adapter.viewholder.PoiDetailHeaderInfoPresenter.C35026b;
import com.p280ss.android.ugc.aweme.poi.model.PoiDetail;
import com.p280ss.android.ugc.aweme.poi.p335ui.C35392m;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.poi.widget.PoiHeaderLayout */
public final class PoiHeaderLayout extends LinearLayout {

    /* renamed from: a */
    private PoiDetailHeaderInfoPresenter f93040a;

    public PoiHeaderLayout(Context context) {
        this(context, null, 0, 6, null);
    }

    public PoiHeaderLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: a */
    public final void mo90213a(View view) {
        PoiDetailHeaderInfoPresenter poiDetailHeaderInfoPresenter = this.f93040a;
        if (poiDetailHeaderInfoPresenter != null) {
            poiDetailHeaderInfoPresenter.mo88801a(view);
        }
    }

    /* renamed from: a */
    public final void mo90215a(PoiDetail poiDetail) {
        PoiDetailHeaderInfoPresenter poiDetailHeaderInfoPresenter = this.f93040a;
        if (poiDetailHeaderInfoPresenter != null) {
            poiDetailHeaderInfoPresenter.mo88802a(poiDetail);
        }
    }

    public PoiHeaderLayout(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.a0s, this);
    }

    /* renamed from: a */
    public final void mo90214a(AbsFragment absFragment, C35025a aVar, C35392m mVar, C35026b bVar) {
        PoiDetailHeaderInfoPresenter poiDetailHeaderInfoPresenter = new PoiDetailHeaderInfoPresenter(absFragment, aVar, this, mVar, bVar);
        this.f93040a = poiDetailHeaderInfoPresenter;
    }

    public /* synthetic */ PoiHeaderLayout(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
