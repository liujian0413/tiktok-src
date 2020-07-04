package com.p280ss.android.ugc.aweme.discover.p1185ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import com.bytedance.ies.dmt.p262ui.widget.util.C10831a;
import com.p280ss.android.ugc.aweme.R$styleable;
import com.p280ss.android.ugc.aweme.base.p308ui.HollowTextView;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.DiscoverHollowTextView */
public final class DiscoverHollowTextView extends HollowTextView {

    /* renamed from: b */
    private int f70949b;

    public DiscoverHollowTextView(Context context) {
        C7573i.m23587b(context, "context");
        super(context);
    }

    public final void onDraw(Canvas canvas) {
        if (this.f70949b != 0) {
            Paint paint = this.f61699a;
            C7573i.m23582a((Object) paint, "mTextPaint");
            paint.setTypeface(C10831a.m31777a().mo26158a(this.f70949b));
        }
        super.onDraw(canvas);
    }

    public DiscoverHollowTextView(Context context, AttributeSet attributeSet) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(attributeSet, "attrs");
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.FontConfig);
        this.f70949b = obtainStyledAttributes.getInt(0, 1);
        obtainStyledAttributes.recycle();
    }

    public DiscoverHollowTextView(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(attributeSet, "attrs");
        super(context, attributeSet, i);
    }
}
