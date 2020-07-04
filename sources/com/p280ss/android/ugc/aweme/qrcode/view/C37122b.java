package com.p280ss.android.ugc.aweme.qrcode.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import com.p280ss.android.ugc.aweme.base.utils.C23482j;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.qrcode.view.b */
public final class C37122b extends View {

    /* renamed from: a */
    private final float f97151a;

    /* renamed from: b */
    private final float f97152b;

    /* renamed from: c */
    private final float f97153c;

    /* renamed from: d */
    private final float f97154d;

    /* renamed from: e */
    private Paint f97155e = new Paint();

    /* renamed from: f */
    private float f97156f;

    /* renamed from: a */
    public final void mo93597a(float f) {
        this.f97156f = ((this.f97152b - this.f97151a) * (f - 1.0f)) / 2.0f;
        invalidate();
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        C7573i.m23587b(canvas, "canvas");
        this.f97155e.setColor(getResources().getColor(R.color.lr));
        this.f97155e.setAntiAlias(true);
        int b = C23482j.m77098b(getContext());
        int a = C23482j.m77095a(getContext());
        float f = this.f97151a - this.f97156f;
        float f2 = this.f97152b + this.f97156f;
        float f3 = this.f97153c - this.f97156f;
        float f4 = this.f97154d + this.f97156f;
        float f5 = (float) b;
        Canvas canvas2 = canvas;
        canvas2.drawRect(0.0f, 0.0f, f5, f, this.f97155e);
        float f6 = f2 + 1.0f;
        float f7 = f;
        float f8 = f6;
        canvas2.drawRect(0.0f, f7, f3, f8, this.f97155e);
        float f9 = f5;
        canvas2.drawRect(f4 + 1.0f, f7, f9, f8, this.f97155e);
        canvas2.drawRect(0.0f, f6, f9, (float) a, this.f97155e);
    }

    public C37122b(Context context, float f, float f2, float f3, float f4) {
        C7573i.m23587b(context, "context");
        super(context);
        this.f97151a = f2;
        this.f97152b = f4;
        this.f97153c = f;
        this.f97154d = f3;
    }
}
