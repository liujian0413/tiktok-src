package com.google.android.gms.ads.formats;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import com.google.android.gms.dynamic.C15345b;
import com.google.android.gms.dynamic.C15349d;
import com.google.android.gms.internal.ads.C15663es;
import com.google.android.gms.internal.ads.afm;

/* renamed from: com.google.android.gms.ads.formats.c */
public final class C14752c extends FrameLayout {

    /* renamed from: a */
    private final FrameLayout f38128a;

    /* renamed from: b */
    private final C15663es f38129b;

    public final void setAdChoicesView(AdChoicesView adChoicesView) {
        m42654a("1098", adChoicesView);
    }

    public final AdChoicesView getAdChoicesView() {
        View a = m42653a("1098");
        if (a instanceof AdChoicesView) {
            return (AdChoicesView) a;
        }
        return null;
    }

    /* renamed from: a */
    private void m42654a(String str, View view) {
        try {
            this.f38129b.mo40520a(str, C15349d.m44668a(view));
        } catch (RemoteException e) {
            afm.m45778b("Unable to call setAssetView on delegate", e);
        }
    }

    /* renamed from: a */
    private View m42653a(String str) {
        try {
            C15345b a = this.f38129b.mo40516a(str);
            if (a != null) {
                return (View) C15349d.m44669a(a);
            }
        } catch (RemoteException e) {
            afm.m45778b("Unable to call getAssetView on delegate", e);
        }
        return null;
    }

    public final void setNativeAd(C14747a aVar) {
        try {
            this.f38129b.mo40518a((C15345b) aVar.mo37498a());
        } catch (RemoteException e) {
            afm.m45778b("Unable to call setNativeAd on delegate", e);
        }
    }

    public final void addView(View view, int i, LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        super.bringChildToFront(this.f38128a);
    }

    public final void removeView(View view) {
        if (this.f38128a != view) {
            super.removeView(view);
        }
    }

    public final void removeAllViews() {
        super.removeAllViews();
        super.addView(this.f38128a);
    }

    public final void bringChildToFront(View view) {
        super.bringChildToFront(view);
        if (this.f38128a != view) {
            super.bringChildToFront(this.f38128a);
        }
    }

    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (this.f38129b != null) {
            try {
                this.f38129b.mo40519a(C15349d.m44668a(view), i);
            } catch (RemoteException e) {
                afm.m45778b("Unable to call onVisibilityChanged on delegate", e);
            }
        }
    }
}
