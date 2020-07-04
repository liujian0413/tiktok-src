package com.snapchat.kit.sdk.core.controller;

import android.os.Handler;
import com.snapchat.kit.sdk.core.controller.LoginStateController.OnLoginStartListener;
import com.snapchat.kit.sdk.core.controller.LoginStateController.OnLoginStateChangedListener;
import com.snapchat.kit.sdk.core.dagger.scope.SnapConnectScope;
import java.util.ArrayList;
import java.util.Collection;
import java.util.WeakHashMap;

@SnapConnectScope
/* renamed from: com.snapchat.kit.sdk.core.controller.a */
public final class C18647a implements LoginStateController {

    /* renamed from: a */
    private final WeakHashMap<OnLoginStateChangedListener, Void> f50403a = new WeakHashMap<>();

    /* renamed from: b */
    private final WeakHashMap<OnLoginStartListener, Void> f50404b = new WeakHashMap<>();

    /* renamed from: c */
    private final Handler f50405c;

    /* access modifiers changed from: private */
    /* renamed from: e */
    public Collection<OnLoginStateChangedListener> m61158e() {
        return new ArrayList(this.f50403a.keySet());
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public Collection<OnLoginStartListener> m61159f() {
        return new ArrayList(this.f50404b.keySet());
    }

    /* renamed from: a */
    public final void mo48889a() {
        this.f50405c.post(new Runnable() {
            public final void run() {
                for (OnLoginStateChangedListener onLogout : C18647a.this.m61158e()) {
                    onLogout.onLogout();
                }
            }
        });
    }

    /* renamed from: b */
    public final void mo48890b() {
        this.f50405c.post(new Runnable() {
            public final void run() {
                for (OnLoginStateChangedListener onLoginSucceeded : C18647a.this.m61158e()) {
                    onLoginSucceeded.onLoginSucceeded();
                }
            }
        });
    }

    /* renamed from: c */
    public final void mo48891c() {
        this.f50405c.post(new Runnable() {
            public final void run() {
                for (OnLoginStateChangedListener onLoginFailed : C18647a.this.m61158e()) {
                    onLoginFailed.onLoginFailed();
                }
            }
        });
    }

    /* renamed from: d */
    public final void mo48892d() {
        this.f50405c.post(new Runnable() {
            public final void run() {
                for (OnLoginStartListener onLoginStart : C18647a.this.m61159f()) {
                    onLoginStart.onLoginStart();
                }
            }
        });
    }

    public final void addOnLoginStartListener(OnLoginStartListener onLoginStartListener) {
        this.f50404b.put(onLoginStartListener, null);
    }

    public final void addOnLoginStateChangedListener(OnLoginStateChangedListener onLoginStateChangedListener) {
        this.f50403a.put(onLoginStateChangedListener, null);
    }

    public final void removeOnLoginStartListener(OnLoginStartListener onLoginStartListener) {
        this.f50404b.remove(onLoginStartListener);
    }

    public final void removeOnLoginStateChangedListener(OnLoginStateChangedListener onLoginStateChangedListener) {
        this.f50403a.remove(onLoginStateChangedListener);
    }

    C18647a(Handler handler) {
        this.f50405c = handler;
    }
}
