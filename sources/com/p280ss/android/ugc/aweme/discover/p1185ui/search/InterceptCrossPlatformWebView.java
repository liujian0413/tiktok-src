package com.p280ss.android.ugc.aweme.discover.p1185ui.search;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.p280ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView;
import java.util.HashMap;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.search.InterceptCrossPlatformWebView */
public final class InterceptCrossPlatformWebView extends CrossPlatformWebView {

    /* renamed from: i */
    private HashMap f71393i;

    /* renamed from: a */
    public final View mo67462a(int i) {
        if (this.f71393i == null) {
            this.f71393i = new HashMap();
        }
        View view = (View) this.f71393i.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f71393i.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public InterceptCrossPlatformWebView(Context context) {
        C7573i.m23587b(context, "context");
        super(context, null, 0);
    }

    public InterceptCrossPlatformWebView(Context context, AttributeSet attributeSet) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, 0);
    }

    public InterceptCrossPlatformWebView(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
    }

    public /* synthetic */ InterceptCrossPlatformWebView(Context context, AttributeSet attributeSet, int i, C7571f fVar) {
        if ((i & 2) != 0) {
            attributeSet = null;
        }
        this(context, attributeSet);
    }

    public /* synthetic */ InterceptCrossPlatformWebView(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
