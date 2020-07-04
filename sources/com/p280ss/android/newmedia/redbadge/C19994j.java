package com.p280ss.android.newmedia.redbadge;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.p280ss.android.message.C19836e;
import com.p280ss.android.pushmanager.app.C20044c;

/* renamed from: com.ss.android.newmedia.redbadge.j */
public final class C19994j implements C19836e {

    /* renamed from: a */
    private C19983d f54115a;

    /* renamed from: a */
    public final void mo53187a() {
    }

    /* renamed from: a */
    public final void mo53188a(Context context) {
        try {
            this.f54115a = C19983d.m65885a(C20044c.m66007b().mo53664a());
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public final void mo53189a(Intent intent) {
        if (intent != null) {
            Bundle extras = intent.getExtras();
            if (extras.getBoolean("app_entrance")) {
                if (this.f54115a != null) {
                    this.f54115a.mo53497a();
                }
                return;
            }
            if (extras.getBoolean("app_exit") && this.f54115a != null) {
                this.f54115a.mo53500b();
            }
        }
    }
}
