package com.p280ss.android.ugc.aweme.commercialize.link.nationaltask;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.p280ss.android.ugc.aweme.commercialize.link.video.C24804a;
import com.p280ss.android.ugc.aweme.feed.model.NationalTaskLink;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.link.nationaltask.NationalTaskTagLayout */
public final class NationalTaskTagLayout extends FrameLayout {

    /* renamed from: a */
    private NationalTaskLinkContent f65306a;

    public NationalTaskTagLayout(Context context) {
        this(context, null, 0, 6, null);
    }

    public NationalTaskTagLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: b */
    public final void mo64838b() {
        removeAllViews();
        this.f65306a = null;
    }

    /* renamed from: a */
    public final void mo64836a() {
        NationalTaskLinkContent nationalTaskLinkContent = this.f65306a;
        if (nationalTaskLinkContent != null) {
            nationalTaskLinkContent.mo64832a();
        }
    }

    /* renamed from: a */
    public final void mo64837a(NationalTaskLink nationalTaskLink, C24804a aVar) {
        View view;
        C7573i.m23587b(nationalTaskLink, "nationalTaskLink");
        C7573i.m23587b(aVar, "commerceTagCallBack");
        Context context = getContext();
        C7573i.m23582a((Object) context, "context");
        NationalTaskLinkContent nationalTaskLinkContent = new NationalTaskLinkContent(context, null, 0, 6, null);
        this.f65306a = nationalTaskLinkContent;
        NationalTaskLinkContent nationalTaskLinkContent2 = this.f65306a;
        if (nationalTaskLinkContent2 != null) {
            nationalTaskLinkContent2.mo64833a(nationalTaskLink, aVar);
        }
        removeAllViews();
        NationalTaskLinkContent nationalTaskLinkContent3 = this.f65306a;
        if (nationalTaskLinkContent3 != null) {
            view = nationalTaskLinkContent3.mo64834b();
        } else {
            view = null;
        }
        addView(view);
    }

    public NationalTaskTagLayout(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
    }

    public /* synthetic */ NationalTaskTagLayout(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
