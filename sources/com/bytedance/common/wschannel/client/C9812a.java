package com.bytedance.common.wschannel.client;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.RemoteException;
import com.bytedance.common.utility.p254b.C6304f;
import com.bytedance.common.wschannel.C9817d;
import com.bytedance.common.wschannel.app.IWsApp;
import com.bytedance.common.wschannel.model.IntegerParcelable;
import com.bytedance.common.wschannel.model.SsWsApp;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.common.wschannel.server.WsChannelService;
import java.lang.ref.WeakReference;
import java.util.concurrent.LinkedBlockingDeque;

/* renamed from: com.bytedance.common.wschannel.client.a */
public final class C9812a {

    /* renamed from: a */
    public static WeakReference<Context> f26717a;

    /* renamed from: e */
    private static C9812a f26718e = new C9812a();

    /* renamed from: b */
    Messenger f26719b;

    /* renamed from: c */
    ServiceConnection f26720c;

    /* renamed from: d */
    public LinkedBlockingDeque<C9816b> f26721d = new LinkedBlockingDeque<>();

    /* renamed from: com.bytedance.common.wschannel.client.a$a */
    class C9815a implements ServiceConnection {
        C9815a() {
        }

        public final void onServiceDisconnected(ComponentName componentName) {
            if (componentName != null) {
                try {
                    C9812a.this.f26719b = null;
                    C9812a.this.f26721d.clear();
                } catch (Throwable unused) {
                }
            }
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (componentName != null && iBinder != null) {
                try {
                    C9812a.this.f26719b = new Messenger(iBinder);
                    C9812a.this.mo24279a(componentName);
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: com.bytedance.common.wschannel.client.a$b */
    static class C9816b {

        /* renamed from: a */
        String f26727a;

        /* renamed from: b */
        Parcelable f26728b;

        /* renamed from: c */
        int f26729c;

        C9816b() {
        }
    }

    /* renamed from: a */
    public static C9812a m28935a() {
        return f26718e;
    }

    private C9812a() {
    }

    /* renamed from: a */
    public static void m28937a(Context context) {
        m28947c(context, 1);
    }

    /* renamed from: b */
    public static void m28944b(Context context) {
        m28947c(context, 2);
    }

    /* renamed from: b */
    private void m28943b(ComponentName componentName) {
        WeakReference<Context> weakReference = f26717a;
        if (weakReference != null && weakReference.get() != null) {
            Context context = (Context) weakReference.get();
            if (componentName != null) {
                try {
                    Intent intent = new Intent();
                    intent.setComponent(componentName);
                    C9815a aVar = new C9815a();
                    this.f26720c = aVar;
                    context.bindService(intent, aVar, 1);
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:5|(2:19|7)(5:8|9|10|21|18)|3|2) */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r5.f26719b = null;
        r5.f26721d.offerFirst(r0);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:2:0x0003 */
    /* JADX WARNING: Removed duplicated region for block: B:2:0x0003 A[LOOP:0: B:2:0x0003->B:18:0x0003, LOOP_START, SYNTHETIC, Splitter:B:2:0x0003] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m28946c(android.content.ComponentName r6) {
        /*
            r5 = this;
            if (r6 != 0) goto L_0x0003
            return
        L_0x0003:
            java.util.concurrent.LinkedBlockingDeque<com.bytedance.common.wschannel.client.a$b> r0 = r5.f26721d     // Catch:{ Throwable -> 0x0038 }
            java.lang.Object r0 = r0.peek()     // Catch:{ Throwable -> 0x0038 }
            if (r0 == 0) goto L_0x0037
            java.util.concurrent.LinkedBlockingDeque<com.bytedance.common.wschannel.client.a$b> r0 = r5.f26721d     // Catch:{ Throwable -> 0x0038 }
            java.lang.Object r0 = r0.poll()     // Catch:{ Throwable -> 0x0038 }
            com.bytedance.common.wschannel.client.a$b r0 = (com.bytedance.common.wschannel.client.C9812a.C9816b) r0     // Catch:{ Throwable -> 0x0038 }
            if (r0 != 0) goto L_0x0016
            return
        L_0x0016:
            android.os.Message r1 = new android.os.Message     // Catch:{ Throwable -> 0x0038 }
            r1.<init>()     // Catch:{ Throwable -> 0x0038 }
            int r2 = r0.f26729c     // Catch:{ Throwable -> 0x0038 }
            r1.what = r2     // Catch:{ Throwable -> 0x0038 }
            android.os.Bundle r2 = r1.getData()     // Catch:{ Throwable -> 0x0038 }
            java.lang.String r3 = r0.f26727a     // Catch:{ Throwable -> 0x0038 }
            android.os.Parcelable r4 = r0.f26728b     // Catch:{ Throwable -> 0x0038 }
            r2.putParcelable(r3, r4)     // Catch:{ Throwable -> 0x0038 }
            r5.m28936a(r6, r1)     // Catch:{ DeadObjectException -> 0x002e, Throwable -> 0x0003 }
            goto L_0x0003
        L_0x002e:
            r6 = 0
            r5.f26719b = r6     // Catch:{ Throwable -> 0x0038 }
            java.util.concurrent.LinkedBlockingDeque<com.bytedance.common.wschannel.client.a$b> r6 = r5.f26721d     // Catch:{ Throwable -> 0x0038 }
            r6.offerFirst(r0)     // Catch:{ Throwable -> 0x0038 }
            goto L_0x0038
        L_0x0037:
            return
        L_0x0038:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.wschannel.client.C9812a.m28946c(android.content.ComponentName):void");
    }

    /* renamed from: a */
    public final synchronized void mo24279a(ComponentName componentName) {
        if (this.f26719b == null) {
            m28943b(componentName);
        } else {
            m28946c(componentName);
        }
    }

    /* renamed from: a */
    private void m28936a(ComponentName componentName, Message message) throws RemoteException {
        if (componentName != null) {
            Messenger messenger = this.f26719b;
            if (messenger != null) {
                messenger.send(message);
            }
        }
    }

    /* renamed from: a */
    public static void m28938a(Context context, int i) {
        if (context != null) {
            f26718e.m28945b(context, i);
        }
    }

    /* renamed from: a */
    public static void m28940a(Context context, SsWsApp ssWsApp) {
        if (context != null) {
            if (f26717a == null || f26717a.get() == null) {
                f26717a = new WeakReference<>(context.getApplicationContext());
            }
            if (C9817d.m28950a(context).mo24286a() && ssWsApp != null) {
                f26718e.m28939a(context, (IWsApp) ssWsApp);
            }
        }
    }

    /* renamed from: a */
    private void m28939a(Context context, IWsApp iWsApp) {
        if (context != null && iWsApp != null) {
            if (f26717a == null || f26717a.get() == null) {
                f26717a = new WeakReference<>(context.getApplicationContext());
            }
            if (C9817d.m28950a(context).mo24286a()) {
                try {
                    ComponentName componentName = new ComponentName(context, WsChannelService.class);
                    C9816b bVar = new C9816b();
                    bVar.f26727a = "ws_app";
                    bVar.f26728b = iWsApp;
                    bVar.f26729c = 0;
                    this.f26721d.offer(bVar);
                    mo24279a(componentName);
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: b */
    private void m28945b(Context context, int i) {
        if (context != null) {
            if (f26717a == null || f26717a.get() == null) {
                f26717a = new WeakReference<>(context.getApplicationContext());
            }
            try {
                ComponentName componentName = new ComponentName(context, WsChannelService.class);
                C9816b bVar = new C9816b();
                bVar.f26727a = "ws_app";
                bVar.f26728b = new IntegerParcelable(i);
                bVar.f26729c = 1;
                this.f26721d.offer(bVar);
                mo24279a(componentName);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: c */
    private static void m28947c(Context context, int i) {
        if (context != null && i > 0 && i <= 3) {
            if (f26717a == null || f26717a.get() == null) {
                f26717a = new WeakReference<>(context.getApplicationContext());
            }
            if (C9817d.m28950a(context).mo24286a()) {
                try {
                    ComponentName componentName = new ComponentName(context, WsChannelService.class);
                    Intent intent = new Intent("com.bytedance.article.wschannel.appstate");
                    intent.setComponent(componentName);
                    intent.putExtra("app_state", i);
                    context.startService(intent);
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    private void m28941a(final Context context, final boolean z) {
        C6304f.submitRunnable(new Runnable() {
            public final void run() {
                int i;
                if (context != null) {
                    if (C9812a.f26717a == null || C9812a.f26717a.get() == null) {
                        C9812a.f26717a = new WeakReference<>(context.getApplicationContext());
                    }
                    try {
                        ComponentName componentName = new ComponentName(context, WsChannelService.class);
                        C9816b bVar = new C9816b();
                        if (z) {
                            i = 9;
                        } else {
                            i = 11;
                        }
                        bVar.f26729c = i;
                        C9812a.this.f26721d.offer(bVar);
                        C9812a.this.mo24279a(componentName);
                    } catch (Throwable unused) {
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo24280a(Context context, WsChannelMsg wsChannelMsg) {
        if (context != null && wsChannelMsg != null) {
            if (f26717a == null || f26717a.get() == null) {
                f26717a = new WeakReference<>(context.getApplicationContext());
            }
            if (C9817d.m28950a(context).mo24286a()) {
                try {
                    ComponentName componentName = new ComponentName(context, WsChannelService.class);
                    C9816b bVar = new C9816b();
                    bVar.f26727a = "payload";
                    bVar.f26728b = wsChannelMsg;
                    bVar.f26729c = 5;
                    this.f26721d.offer(bVar);
                    mo24279a(componentName);
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m28942a(final Context context, boolean z, boolean z2) {
        if (z) {
            f26718e.m28941a(context, true);
        } else {
            C6304f.submitRunnable(new Runnable() {
                public final void run() {
                    try {
                        context.startService(new Intent(context, WsChannelService.class));
                    } catch (Throwable unused) {
                    }
                }
            });
        }
    }
}
