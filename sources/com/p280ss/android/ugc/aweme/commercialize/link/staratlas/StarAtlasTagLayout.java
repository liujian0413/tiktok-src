package com.p280ss.android.ugc.aweme.commercialize.link.staratlas;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.p280ss.android.ugc.aweme.commercialize.link.video.C24804a;
import com.p280ss.android.ugc.aweme.feed.model.StarAtlasLink;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.link.staratlas.StarAtlasTagLayout */
public final class StarAtlasTagLayout extends FrameLayout {

    /* renamed from: a */
    private StarAtlasLinkContent f65310a;

    public StarAtlasTagLayout(Context context) {
        this(context, null, 0, 6, null);
    }

    public StarAtlasTagLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: a */
    public final void mo64843a() {
        removeAllViews();
        this.f65310a = null;
    }

    /* renamed from: b */
    public final void mo64845b() {
        StarAtlasLinkContent starAtlasLinkContent = this.f65310a;
        if (starAtlasLinkContent != null) {
            starAtlasLinkContent.mo64839a();
        }
    }

    /* renamed from: a */
    public final void mo64844a(StarAtlasLink starAtlasLink, C24804a aVar) {
        View view;
        C7573i.m23587b(starAtlasLink, "starAtlasLink");
        C7573i.m23587b(aVar, "commerceTagCallBack");
        Context context = getContext();
        C7573i.m23582a((Object) context, "context");
        StarAtlasLinkContent starAtlasLinkContent = new StarAtlasLinkContent(context, null, 0, 6, null);
        this.f65310a = starAtlasLinkContent;
        StarAtlasLinkContent starAtlasLinkContent2 = this.f65310a;
        if (starAtlasLinkContent2 != null) {
            starAtlasLinkContent2.mo64840a(starAtlasLink, aVar);
        }
        removeAllViews();
        StarAtlasLinkContent starAtlasLinkContent3 = this.f65310a;
        if (starAtlasLinkContent3 != null) {
            view = starAtlasLinkContent3.mo64841b();
        } else {
            view = null;
        }
        addView(view);
    }

    public StarAtlasTagLayout(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
    }

    public /* synthetic */ StarAtlasTagLayout(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
