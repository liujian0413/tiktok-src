package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.gms.ads.internal.C14793ay;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.cx */
public final class C15613cx implements OnClickListener {

    /* renamed from: a */
    public C15706gh f44254a;

    /* renamed from: b */
    String f44255b;

    /* renamed from: c */
    Long f44256c;

    /* renamed from: d */
    WeakReference<View> f44257d;

    /* renamed from: e */
    private final C16075tz f44258e;

    /* renamed from: f */
    private C15742hq f44259f;

    public C15613cx(C16075tz tzVar) {
        this.f44258e = tzVar;
    }

    /* renamed from: a */
    public final void mo41475a(C15706gh ghVar) {
        this.f44254a = ghVar;
        if (this.f44259f != null) {
            this.f44258e.mo42007b("/unconfirmedClick", this.f44259f);
        }
        this.f44259f = new C15614cy(this);
        this.f44258e.mo42004a("/unconfirmedClick", this.f44259f);
    }

    /* renamed from: a */
    public final void mo41474a() {
        if (this.f44254a != null && this.f44256c != null) {
            m50392b();
            try {
                this.f44254a.mo41642a();
            } catch (RemoteException e) {
                afm.m45782d("#007 Could not call remote method.", e);
            }
        }
    }

    public final void onClick(View view) {
        if (this.f44257d != null && this.f44257d.get() == view) {
            if (!(this.f44255b == null || this.f44256c == null)) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("id", this.f44255b);
                    jSONObject.put("time_interval", C14793ay.m42901g().mo38684a() - this.f44256c.longValue());
                    jSONObject.put("messageType", "onePointFiveClick");
                    this.f44258e.mo42005a("sendMessageToNativeJs", jSONObject);
                } catch (JSONException e) {
                    acd.m45778b("Unable to dispatch sendMessageToNativeJs event", e);
                }
            }
            m50392b();
        }
    }

    /* renamed from: b */
    private final void m50392b() {
        this.f44255b = null;
        this.f44256c = null;
        if (this.f44257d != null) {
            View view = (View) this.f44257d.get();
            this.f44257d = null;
            if (view != null) {
                view.setClickable(false);
                view.setOnClickListener(null);
            }
        }
    }
}
