package com.p280ss.android.ugc.aweme.notification.view.copy;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.bytedance.common.utility.C9738o;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.notification.view.copy.RelativeUserAvatarListView */
public final class RelativeUserAvatarListView extends FrameLayout {

    /* renamed from: a */
    private final int f90415a;

    /* renamed from: b */
    private final int f90416b;

    /* renamed from: c */
    private final int f90417c;

    public RelativeUserAvatarListView(Context context) {
        this(context, null, 0, 6, null);
    }

    public RelativeUserAvatarListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public RelativeUserAvatarListView(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
        this.f90415a = (int) C9738o.m28708b(context, 16.0f);
        this.f90416b = (int) C9738o.m28708b(context, 20.0f);
        this.f90417c = (int) C9738o.m28708b(context, 1.0f);
    }

    public /* synthetic */ RelativeUserAvatarListView(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
