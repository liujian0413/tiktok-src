package com.p280ss.android.ugc.aweme.commercialize.link.video;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.p280ss.android.ugc.aweme.commercialize.model.DouPlusLinkData;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.link.video.DouPlusTagLayout */
public final class DouPlusTagLayout extends FrameLayout {

    /* renamed from: a */
    private DouPlusLinkContent f65316a;

    public DouPlusTagLayout(Context context) {
        this(context, null, 0, 6, null);
    }

    public DouPlusTagLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: a */
    public final void mo64853a() {
        removeAllViews();
        this.f65316a = null;
    }

    /* renamed from: a */
    public final void mo64854a(DouPlusLinkData douPlusLinkData, C24804a aVar) {
        C7573i.m23587b(douPlusLinkData, "douPlusLinkData");
        C7573i.m23587b(aVar, "commerceTagCallBack");
        DouPlusLinkContent douPlusLinkContent = new DouPlusLinkContent(getContext(), null, 0, 6, null);
        this.f65316a = douPlusLinkContent;
        DouPlusLinkContent douPlusLinkContent2 = this.f65316a;
        if (douPlusLinkContent2 == null) {
            C7573i.m23580a();
        }
        douPlusLinkContent2.mo64851a(douPlusLinkData, aVar);
        removeAllViews();
        DouPlusLinkContent douPlusLinkContent3 = this.f65316a;
        if (douPlusLinkContent3 == null) {
            C7573i.m23580a();
        }
        addView(douPlusLinkContent3.mo64850a());
    }

    public DouPlusTagLayout(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
    }

    public /* synthetic */ DouPlusTagLayout(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
