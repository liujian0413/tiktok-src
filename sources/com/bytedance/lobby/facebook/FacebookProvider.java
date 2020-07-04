package com.bytedance.lobby.facebook;

import android.app.Application;
import com.bytedance.lobby.C12191a;
import com.bytedance.lobby.C12203b;
import com.bytedance.lobby.internal.BaseProvider;
import com.facebook.C13499h;
import com.facebook.FacebookException;

class FacebookProvider<T> extends BaseProvider<T> {

    /* renamed from: c */
    private Application f32478c;

    /* renamed from: e */
    public final void mo29949e() {
        if (!C13499h.m39710a()) {
            C13499h.m39707a(this.f32494b.f32467c);
            try {
                C13499h.m39703a(this.f32478c.getApplicationContext());
            } catch (FacebookException e) {
                if (C12191a.f32435a) {
                    throw e;
                }
            }
        }
    }

    FacebookProvider(Application application, C12203b bVar) {
        super(application, bVar);
        this.f32478c = application;
    }
}
