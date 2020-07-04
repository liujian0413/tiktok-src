package com.twitter.sdk.android.tweetui;

import android.content.Context;
import com.twitter.sdk.android.core.models.C46959o;
import com.twitter.sdk.android.core.models.MediaEntity;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.twitter.sdk.android.tweetui.y */
public final class C47099y extends C47003a {
    /* access modifiers changed from: protected */
    public final int getLayout() {
        return R.layout.b0q;
    }

    /* access modifiers changed from: 0000 */
    public final String getViewTypeName() {
        return "quote";
    }

    public final /* bridge */ /* synthetic */ C46959o getTweet() {
        return super.getTweet();
    }

    public final /* bridge */ /* synthetic */ long getTweetId() {
        return super.getTweetId();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo118193c() {
        super.mo118193c();
        this.f120612i.requestLayout();
    }

    /* renamed from: f */
    private void m147241f() {
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.vw);
        this.f120614k.mo118272a(0, 0, dimensionPixelSize, dimensionPixelSize);
        setBackgroundResource(R.drawable.clg);
        this.f120611h.setTextColor(this.f120617n);
        this.f120612i.setTextColor(this.f120618o);
        this.f120615l.setTextColor(this.f120617n);
        this.f120614k.setMediaBgColor(this.f120621r);
        this.f120614k.setPhotoErrorResId(this.f120622s);
    }

    public final /* bridge */ /* synthetic */ void setTweet(C46959o oVar) {
        super.setTweet(oVar);
    }

    public final /* bridge */ /* synthetic */ void setTweetLinkClickListener(C47016ah ahVar) {
        super.setTweetLinkClickListener(ahVar);
    }

    public final /* bridge */ /* synthetic */ void setTweetMediaClickListener(C47017ai aiVar) {
        super.setTweetMediaClickListener(aiVar);
    }

    public C47099y(Context context) {
        this(context, new C47004a());
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

    private C47099y(Context context, C47004a aVar) {
        super(context, null, 0, aVar);
    }

    /* renamed from: a */
    public final void mo118374a(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f120617n = i;
        this.f120618o = i2;
        this.f120619p = i3;
        this.f120620q = i4;
        this.f120621r = i5;
        this.f120622s = i6;
        m147241f();
    }
}
