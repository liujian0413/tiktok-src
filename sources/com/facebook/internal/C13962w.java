package com.facebook.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;

/* renamed from: com.facebook.internal.w */
public abstract class C13962w implements ServiceConnection {

    /* renamed from: a */
    public final Context f36930a;

    /* renamed from: b */
    public C13964a f36931b;

    /* renamed from: c */
    private final Handler f36932c;

    /* renamed from: d */
    private boolean f36933d;

    /* renamed from: e */
    private Messenger f36934e;

    /* renamed from: f */
    private int f36935f;

    /* renamed from: g */
    private int f36936g;

    /* renamed from: h */
    private final String f36937h;

    /* renamed from: i */
    private final int f36938i;

    /* renamed from: com.facebook.internal.w$a */
    public interface C13964a {
        /* renamed from: a */
        void mo33617a(Bundle bundle);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo33610a(Bundle bundle);

    /* renamed from: b */
    public final void mo33613b() {
        this.f36933d = false;
    }

    /* renamed from: c */
    private void m41200c() {
        Bundle bundle = new Bundle();
        bundle.putString("com.facebook.platform.extra.APPLICATION_ID", this.f36937h);
        mo33610a(bundle);
        Message obtain = Message.obtain(null, this.f36935f);
        obtain.arg1 = this.f36938i;
        obtain.setData(bundle);
        obtain.replyTo = new Messenger(this.f36932c);
        try {
            this.f36934e.send(obtain);
        } catch (RemoteException unused) {
            m41199b(null);
        }
    }

    /* renamed from: a */
    public final boolean mo33612a() {
        if (this.f36933d || C13953v.m41169b(this.f36938i) == -1) {
            return false;
        }
        Intent a = C13953v.m41155a(this.f36930a);
        if (a == null) {
            return false;
        }
        this.f36933d = true;
        this.f36930a.bindService(a, this, 1);
        return true;
    }

    /* renamed from: b */
    private void m41199b(Bundle bundle) {
        if (this.f36933d) {
            this.f36933d = false;
            C13964a aVar = this.f36931b;
            if (aVar != null) {
                aVar.mo33617a(bundle);
            }
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
        this.f36934e = null;
        try {
            this.f36930a.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        m41199b(null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo33611a(Message message) {
        if (message.what == this.f36936g) {
            Bundle data = message.getData();
            if (data.getString("com.facebook.platform.status.ERROR_TYPE") != null) {
                m41199b(null);
            } else {
                m41199b(data);
            }
            try {
                this.f36930a.unbindService(this);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f36934e = new Messenger(iBinder);
        m41200c();
    }

    public C13962w(Context context, int i, int i2, int i3, String str) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        this.f36930a = context;
        this.f36935f = i;
        this.f36936g = i2;
        this.f36937h = str;
        this.f36938i = i3;
        this.f36932c = new Handler() {
            public final void handleMessage(Message message) {
                C13962w.this.mo33611a(message);
            }
        };
    }
}
