package com.twitter.sdk.android.tweetui.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ProgressBar;
import com.squareup.picasso.C18857y;
import com.squareup.picasso.Picasso.LoadedFrom;
import com.twitter.sdk.android.tweetui.internal.C47077j.C47078a;

/* renamed from: com.twitter.sdk.android.tweetui.internal.c */
public final class C47069c extends FrameLayout implements C18857y {

    /* renamed from: a */
    final MultiTouchImageView f120796a;

    /* renamed from: b */
    final ProgressBar f120797b;

    public C47069c(Context context) {
        this(context, new MultiTouchImageView(context), new ProgressBar(context));
    }

    public final void setSwipeToDismissCallback(C47078a aVar) {
        this.f120796a.setOnTouchListener(C47077j.m147180a((View) this.f120796a, aVar));
    }

    /* renamed from: a */
    public final void mo50116a(Drawable drawable) {
        this.f120796a.setImageResource(17170445);
        this.f120797b.setVisibility(0);
    }

    /* renamed from: a */
    public final void mo50115a(Bitmap bitmap, LoadedFrom loadedFrom) {
        this.f120796a.setImageBitmap(bitmap);
        this.f120797b.setVisibility(8);
    }

    private C47069c(Context context, MultiTouchImageView multiTouchImageView, ProgressBar progressBar) {
        super(context);
        this.f120796a = multiTouchImageView;
        this.f120797b = progressBar;
        progressBar.setLayoutParams(new LayoutParams(-2, -2, 17));
        addView(progressBar);
        multiTouchImageView.setLayoutParams(new LayoutParams(-1, -1, 17));
        addView(multiTouchImageView);
    }
}
