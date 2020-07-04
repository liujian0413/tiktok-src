package org.greenrobot.eventbus.util;

import android.os.Bundle;

/* renamed from: org.greenrobot.eventbus.util.b */
public abstract class C48347b<T> {

    /* renamed from: a */
    protected final C48346a f123460a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo121793a(C48349d dVar, Bundle bundle);

    /* renamed from: b */
    private String m149944b(C48349d dVar, Bundle bundle) {
        return this.f123460a.f123453a.getString(this.f123460a.f123454b);
    }

    /* renamed from: c */
    private String m149945c(C48349d dVar, Bundle bundle) {
        return this.f123460a.f123453a.getString(this.f123460a.mo121791a(dVar.f123462a));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final T mo121794a(C48349d dVar, boolean z, Bundle bundle) {
        Bundle bundle2;
        if (dVar.f123463b) {
            return null;
        }
        if (bundle != null) {
            bundle2 = (Bundle) bundle.clone();
        } else {
            bundle2 = new Bundle();
        }
        if (!bundle2.containsKey("de.greenrobot.eventbus.errordialog.title")) {
            bundle2.putString("de.greenrobot.eventbus.errordialog.title", m149944b(dVar, bundle2));
        }
        if (!bundle2.containsKey("de.greenrobot.eventbus.errordialog.message")) {
            bundle2.putString("de.greenrobot.eventbus.errordialog.message", m149945c(dVar, bundle2));
        }
        if (!bundle2.containsKey("de.greenrobot.eventbus.errordialog.finish_after_dialog")) {
            bundle2.putBoolean("de.greenrobot.eventbus.errordialog.finish_after_dialog", z);
        }
        if (!bundle2.containsKey("de.greenrobot.eventbus.errordialog.event_type_on_close") && this.f123460a.f123459g != null) {
            bundle2.putSerializable("de.greenrobot.eventbus.errordialog.event_type_on_close", this.f123460a.f123459g);
        }
        if (!bundle2.containsKey("de.greenrobot.eventbus.errordialog.icon_id") && this.f123460a.f123458f != 0) {
            bundle2.putInt("de.greenrobot.eventbus.errordialog.icon_id", this.f123460a.f123458f);
        }
        return mo121793a(dVar, bundle2);
    }
}
