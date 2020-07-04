package com.p280ss.android.ugc.aweme.p313im.sdk.share.panel;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.p280ss.android.ugc.aweme.p313im.sdk.arch.Widget;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.SharePanelHeadLayout */
public final class SharePanelHeadLayout extends LinearLayout {

    /* renamed from: a */
    public static final C31824a f83251a = new C31824a(null);

    /* renamed from: b */
    private Widget f83252b;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.SharePanelHeadLayout$a */
    public static final class C31824a {
        private C31824a() {
        }

        public /* synthetic */ C31824a(C7571f fVar) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Widget widget = this.f83252b;
        if (widget != null) {
            widget.destroy();
        }
    }

    public final void setWidget(Widget widget) {
        C7573i.m23587b(widget, "widget");
        this.f83252b = widget;
    }

    /* access modifiers changed from: protected */
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (i == 0) {
            Widget widget = this.f83252b;
            if (widget != null) {
                widget.resume();
            }
        }
    }

    public SharePanelHeadLayout(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
        View.inflate(context, R.layout.aaf, this);
    }

    public /* synthetic */ SharePanelHeadLayout(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        this(context, null, 0);
    }
}
