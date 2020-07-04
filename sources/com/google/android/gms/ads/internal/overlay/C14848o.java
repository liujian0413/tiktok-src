package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageButton;
import com.google.android.gms.internal.ads.C6505uv;
import com.google.android.gms.internal.ads.afb;

@C6505uv
/* renamed from: com.google.android.gms.ads.internal.overlay.o */
public final class C14848o extends FrameLayout implements OnClickListener {

    /* renamed from: a */
    private final ImageButton f38456a;

    /* renamed from: b */
    private final C14856w f38457b;

    public C14848o(Context context, C14849p pVar, C14856w wVar) {
        super(context);
        this.f38457b = wVar;
        setOnClickListener(this);
        this.f38456a = new ImageButton(context);
        this.f38456a.setImageResource(17301527);
        this.f38456a.setBackgroundColor(0);
        this.f38456a.setOnClickListener(this);
        this.f38456a.setPadding(afb.m45721a(context, pVar.f38458a), afb.m45721a(context, 0), afb.m45721a(context, pVar.f38459b), afb.m45721a(context, pVar.f38461d));
        this.f38456a.setContentDescription("Interstitial close button");
        addView(this.f38456a, new LayoutParams(afb.m45721a(context, pVar.f38462e + pVar.f38458a + pVar.f38459b), afb.m45721a(context, pVar.f38462e + pVar.f38461d), 17));
    }

    public final void onClick(View view) {
        if (this.f38457b != null) {
            this.f38457b.mo37817c();
        }
    }

    /* renamed from: a */
    public final void mo37840a(boolean z) {
        if (z) {
            this.f38456a.setVisibility(8);
        } else {
            this.f38456a.setVisibility(0);
        }
    }
}
