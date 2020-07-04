package com.bytedance.android.live.broadcast.effect.p136b;

import android.view.View;
import com.bytedance.android.livesdk.widget.AdjustPercentBar;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7571f;

/* renamed from: com.bytedance.android.live.broadcast.effect.b.a */
public final class C2589a {

    /* renamed from: a */
    public final View f8318a;

    /* renamed from: b */
    public final AdjustPercentBar f8319b;

    /* renamed from: c */
    public final int f8320c;

    /* renamed from: d */
    public final int f8321d;

    public C2589a() {
        this(null, null, 0, 0, 15, null);
    }

    public C2589a(View view, AdjustPercentBar adjustPercentBar, int i, int i2) {
        this.f8318a = view;
        this.f8319b = adjustPercentBar;
        this.f8320c = i;
        this.f8321d = i2;
    }

    public /* synthetic */ C2589a(View view, AdjustPercentBar adjustPercentBar, int i, int i2, int i3, C7571f fVar) {
        if ((i3 & 1) != 0) {
            view = null;
        }
        if ((i3 & 2) != 0) {
            adjustPercentBar = null;
        }
        if ((i3 & 4) != 0) {
            i = R.layout.arq;
        }
        if ((i3 & 8) != 0) {
            i2 = R.layout.arh;
        }
        this(view, adjustPercentBar, i, i2);
    }
}
