package com.twitter.sdk.android.tweetui;

import android.content.Context;
import com.twitter.sdk.android.core.models.C46959o;
import com.twitter.sdk.android.core.models.MediaEntity;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.twitter.sdk.android.tweetui.i */
public final class C47042i extends C47037e {
    /* access modifiers changed from: protected */
    public final int getLayout() {
        return R.layout.b0p;
    }

    /* access modifiers changed from: 0000 */
    public final String getViewTypeName() {
        return "compact";
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo118193c() {
        super.mo118193c();
        this.f120612i.requestLayout();
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo118241f() {
        super.mo118241f();
        setPadding(0, getResources().getDimensionPixelSize(R.dimen.un), 0, 0);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.vw);
        this.f120614k.mo118272a(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final double mo118188a(MediaEntity mediaEntity) {
        double a = super.mo118188a(mediaEntity);
        if (a <= 1.0d) {
            return 1.0d;
        }
        if (a > 3.0d) {
            return 3.0d;
        }
        if (a < 1.3333333333333333d) {
            return 1.3333333333333333d;
        }
        return a;
    }

    public C47042i(Context context, C46959o oVar, int i) {
        super(context, oVar, i);
    }
}
