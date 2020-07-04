package com.p280ss.android.ugc.aweme.account.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.ies.dmt.p262ui.widget.DmtLoadingLayout;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.account.view.b */
public final class C22360b extends FrameLayout {
    public C22360b(Context context) {
        this(context, null, null, 0, 14, null);
    }

    private C22360b(Context context, String str, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(str, "text");
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.ad2, this);
        View findViewById = findViewById(R.id.btv);
        if (!(findViewById instanceof DmtLoadingLayout)) {
            findViewById = null;
        }
        DmtLoadingLayout dmtLoadingLayout = (DmtLoadingLayout) findViewById;
        if (dmtLoadingLayout != null) {
            dmtLoadingLayout.setVisibility(0);
        }
    }

    private /* synthetic */ C22360b(Context context, String str, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        this(context, "", null, 0);
    }
}
