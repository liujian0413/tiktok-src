package com.google.android.gms.ads.formats;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.google.android.gms.common.internal.C15267r;
import com.google.android.gms.dynamic.C15345b;
import com.google.android.gms.dynamic.C15349d;
import com.google.android.gms.internal.ads.C15663es;
import com.google.android.gms.internal.ads.afm;
import com.google.android.gms.internal.ads.bym;

public final class UnifiedNativeAdView extends FrameLayout {

    /* renamed from: a */
    private final FrameLayout f38112a;

    /* renamed from: b */
    private final C15663es f38113b = m42631b();

    public UnifiedNativeAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f38112a = m42629a(context);
    }

    /* renamed from: a */
    private final void m42630a(String str, View view) {
        try {
            this.f38113b.mo40520a(str, C15349d.m44668a(view));
        } catch (RemoteException e) {
            afm.m45778b("Unable to call setAssetView on delegate", e);
        }
    }

    public final void setHeadlineView(View view) {
        m42630a("3001", view);
    }

    public final void setCallToActionView(View view) {
        m42630a("3002", view);
    }

    public final void setIconView(View view) {
        m42630a("3003", view);
    }

    public final void setBodyView(View view) {
        m42630a("3004", view);
    }

    public final void setAdvertiserView(View view) {
        m42630a("3005", view);
    }

    public final void setStoreView(View view) {
        m42630a("3006", view);
    }

    public final void setClickConfirmingView(View view) {
        try {
            this.f38113b.mo40521b(C15349d.m44668a(view));
        } catch (RemoteException e) {
            afm.m45778b("Unable to call setClickConfirmingView on delegate", e);
        }
    }

    public final void setPriceView(View view) {
        m42630a("3007", view);
    }

    public final void setImageView(View view) {
        m42630a("3008", view);
    }

    public final void setStarRatingView(View view) {
        m42630a("3009", view);
    }

    public final void setMediaView(MediaView mediaView) {
        m42630a("3010", mediaView);
    }

    public final void setAdChoicesView(AdChoicesView adChoicesView) {
        m42630a("3011", adChoicesView);
    }

    public final void setNativeAd(C14761h hVar) {
        try {
            this.f38113b.mo40518a((C15345b) hVar.mo37549l());
        } catch (RemoteException e) {
            afm.m45778b("Unable to call setNativeAd on delegate", e);
        }
    }

    /* renamed from: a */
    private final View m42628a(String str) {
        try {
            C15345b a = this.f38113b.mo40516a(str);
            if (a != null) {
                return (View) C15349d.m44669a(a);
            }
        } catch (RemoteException e) {
            afm.m45778b("Unable to call getAssetView on delegate", e);
        }
        return null;
    }

    public final View getHeadlineView() {
        return m42628a("3001");
    }

    public final View getCallToActionView() {
        return m42628a("3002");
    }

    public final View getIconView() {
        return m42628a("3003");
    }

    public final View getBodyView() {
        return m42628a("3004");
    }

    public final View getStoreView() {
        return m42628a("3006");
    }

    public final View getPriceView() {
        return m42628a("3007");
    }

    public final View getAdvertiserView() {
        return m42628a("3005");
    }

    public final View getImageView() {
        return m42628a("3008");
    }

    public final View getStarRatingView() {
        return m42628a("3009");
    }

    public final MediaView getMediaView() {
        View a = m42628a("3010");
        if (a instanceof MediaView) {
            return (MediaView) a;
        }
        if (a != null) {
            afm.m45777b("View is not an instance of MediaView");
        }
        return null;
    }

    public final AdChoicesView getAdChoicesView() {
        View a = m42628a("3011");
        if (a instanceof AdChoicesView) {
            return (AdChoicesView) a;
        }
        return null;
    }

    /* renamed from: a */
    public final void mo37468a() {
        try {
            this.f38113b.mo40517a();
        } catch (RemoteException e) {
            afm.m45778b("Unable to destroy native ad view", e);
        }
    }

    /* renamed from: a */
    private final FrameLayout m42629a(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new LayoutParams(-1, -1));
        addView(frameLayout);
        return frameLayout;
    }

    /* renamed from: b */
    private final C15663es m42631b() {
        C15267r.m44385a(this.f38112a, (Object) "createDelegate must be called after overlayFrame has been created");
        if (isInEditMode()) {
            return null;
        }
        return bym.m50297b().mo41437a(this.f38112a.getContext(), (FrameLayout) this, this.f38112a);
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        super.bringChildToFront(this.f38112a);
    }

    public final void removeView(View view) {
        if (this.f38112a != view) {
            super.removeView(view);
        }
    }

    public final void removeAllViews() {
        super.removeAllViews();
        super.addView(this.f38112a);
    }

    public final void bringChildToFront(View view) {
        super.bringChildToFront(view);
        if (this.f38112a != view) {
            super.bringChildToFront(this.f38112a);
        }
    }

    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (this.f38113b != null) {
            try {
                this.f38113b.mo40519a(C15349d.m44668a(view), i);
            } catch (RemoteException e) {
                afm.m45778b("Unable to call onVisibilityChanged on delegate", e);
            }
        }
    }
}
