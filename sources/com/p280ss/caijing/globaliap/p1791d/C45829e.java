package com.p280ss.caijing.globaliap.p1791d;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import com.android.vending.billing.IInAppBillingService;
import com.android.vending.billing.IInAppBillingService.Stub;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.ss.caijing.globaliap.d.e */
public final class C45829e {

    /* renamed from: a */
    IInAppBillingService f117216a;

    /* renamed from: b */
    C45836b f117217b;

    /* renamed from: c */
    C45841g f117218c;

    /* renamed from: d */
    C45839e f117219d;

    /* renamed from: e */
    C45838d f117220e;

    /* renamed from: f */
    C45840f f117221f;

    /* renamed from: g */
    C45835a f117222g;

    /* renamed from: h */
    C45837c f117223h;

    /* renamed from: i */
    Context f117224i;

    /* renamed from: j */
    volatile boolean f117225j;

    /* renamed from: k */
    volatile boolean f117226k;

    /* renamed from: l */
    volatile boolean f117227l;

    /* renamed from: m */
    volatile boolean f117228m;

    /* renamed from: n */
    volatile boolean f117229n;

    /* renamed from: o */
    volatile boolean f117230o;

    /* renamed from: p */
    volatile boolean f117231p;

    /* renamed from: q */
    C45842h f117232q = new C45842h(this, 0);

    /* renamed from: r */
    private ServiceConnection f117233r = new ServiceConnection() {
        public final void onServiceDisconnected(ComponentName componentName) {
            if (!C45829e.this.f117226k) {
                C45829e.this.f117217b.mo111009b();
                C45829e.this.f117225j = false;
            }
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (!C45829e.this.f117226k) {
                C45829e.this.f117216a = Stub.asInterface(iBinder);
                C45829e.this.f117217b.mo111008a();
                C45829e.this.f117225j = true;
            }
        }
    };

    /* renamed from: com.ss.caijing.globaliap.d.e$a */
    public interface C45835a {
    }

    /* renamed from: com.ss.caijing.globaliap.d.e$b */
    public interface C45836b {
        /* renamed from: a */
        void mo111008a();

        /* renamed from: b */
        void mo111009b();
    }

    /* renamed from: com.ss.caijing.globaliap.d.e$c */
    public interface C45837c {
        /* renamed from: a */
        void mo111012a(Map<String, Integer> map);
    }

    /* renamed from: com.ss.caijing.globaliap.d.e$d */
    public interface C45838d {
        /* renamed from: a */
        void mo111046a();

        /* renamed from: a */
        void mo111047a(int i);
    }

    /* renamed from: com.ss.caijing.globaliap.d.e$e */
    public interface C45839e {
        /* renamed from: a */
        void mo111041a();

        /* renamed from: a */
        void mo111042a(Bundle bundle);
    }

    /* renamed from: com.ss.caijing.globaliap.d.e$f */
    public interface C45840f {
        /* renamed from: a */
        void mo111048a(int i);

        /* renamed from: a */
        void mo111049a(C45847i iVar);
    }

    /* renamed from: com.ss.caijing.globaliap.d.e$g */
    public interface C45841g {
        /* renamed from: a */
        void mo111010a();

        /* renamed from: a */
        void mo111011a(Bundle bundle);
    }

    /* renamed from: com.ss.caijing.globaliap.d.e$h */
    static class C45842h extends Handler {

        /* renamed from: a */
        private WeakReference<C45829e> f117246a;

        private C45842h(C45829e eVar) {
            this.f117246a = new WeakReference<>(eVar);
        }

        public final void handleMessage(Message message) {
            C45829e eVar = (C45829e) this.f117246a.get();
            if (eVar != null && !eVar.f117226k) {
                switch (message.what) {
                    case 100:
                        if (eVar.f117218c != null) {
                            if (message.arg1 == 0) {
                                eVar.f117218c.mo111011a((Bundle) message.obj);
                                return;
                            }
                            eVar.f117218c.mo111010a();
                            return;
                        }
                        break;
                    case BaseNotice.HASHTAG /*101*/:
                        if (eVar.f117219d != null) {
                            if (message.arg1 == 0) {
                                eVar.f117219d.mo111042a((Bundle) message.obj);
                                return;
                            }
                            eVar.f117219d.mo111041a();
                            return;
                        }
                        break;
                    case 102:
                        if (eVar.f117220e != null) {
                            if (message.arg1 == 0) {
                                eVar.f117220e.mo111047a(message.arg2);
                                return;
                            }
                            eVar.f117220e.mo111046a();
                            return;
                        }
                        break;
                    case 103:
                        int i = message.arg2;
                        if (eVar.f117221f != null) {
                            if (message.arg1 == 0) {
                                eVar.f117221f.mo111049a((C45847i) message.obj);
                                return;
                            }
                            eVar.f117221f.mo111048a(i);
                            return;
                        }
                        break;
                    case 104:
                        if (eVar.f117222g != null && message.arg1 != 0) {
                            return;
                        }
                        return;
                    case 105:
                        if (eVar.f117223h != null) {
                            eVar.f117223h.mo111012a((Map) message.obj);
                            break;
                        }
                        break;
                }
            }
        }

        /* synthetic */ C45842h(C45829e eVar, byte b) {
            this(eVar);
        }
    }

    /* renamed from: com.ss.caijing.globaliap.d.e$i */
    static class C45843i implements Runnable {

        /* renamed from: a */
        private WeakReference<C45829e> f117247a;

        /* renamed from: b */
        private String f117248b;

        /* renamed from: c */
        private String f117249c;

        /* JADX WARNING: Code restructure failed: missing block: B:40:0x00ab, code lost:
            r3 = com.p280ss.caijing.globaliap.p1791d.C45845g.m143861a((java.lang.String) r6.get(r8), (java.lang.String) r7.get(r8));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ad, code lost:
            r5 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
            com.google.p268a.p269a.p270a.p271a.p272a.C6497a.m20185b(r5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:0x00d1, code lost:
            r1.sendMessage(m143856a(r1, 21));
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r11 = this;
                java.lang.ref.WeakReference<com.ss.caijing.globaliap.d.e> r0 = r11.f117247a
                java.lang.Object r0 = r0.get()
                com.ss.caijing.globaliap.d.e r0 = (com.p280ss.caijing.globaliap.p1791d.C45829e) r0
                if (r0 == 0) goto L_0x0123
                com.android.vending.billing.IInAppBillingService r1 = r0.f117216a
                if (r1 == 0) goto L_0x0123
                com.ss.caijing.globaliap.d.e$h r1 = r0.f117232q
                if (r1 != 0) goto L_0x0014
                goto L_0x0123
            L_0x0014:
                com.ss.caijing.globaliap.d.e$h r1 = r0.f117232q
                r2 = 0
                r3 = r2
            L_0x0018:
                r4 = 0
                com.android.vending.billing.IInAppBillingService r5 = r0.f117216a     // Catch:{ RemoteException -> 0x00c5 }
                r6 = 3
                android.content.Context r7 = r0.f117224i     // Catch:{ RemoteException -> 0x00c5 }
                java.lang.String r7 = r7.getPackageName()     // Catch:{ RemoteException -> 0x00c5 }
                java.lang.String r8 = r11.f117249c     // Catch:{ RemoteException -> 0x00c5 }
                android.os.Bundle r2 = r5.getPurchases(r6, r7, r8, r2)     // Catch:{ RemoteException -> 0x00c5 }
                java.lang.String r5 = "RESPONSE_CODE"
                java.lang.Object r5 = r2.get(r5)     // Catch:{ RemoteException -> 0x00c5 }
                if (r5 != 0) goto L_0x0032
                r5 = 0
                goto L_0x0048
            L_0x0032:
                boolean r6 = r5 instanceof java.lang.Integer     // Catch:{ RemoteException -> 0x00c5 }
                if (r6 == 0) goto L_0x003d
                java.lang.Integer r5 = (java.lang.Integer) r5     // Catch:{ RemoteException -> 0x00c5 }
                int r5 = r5.intValue()     // Catch:{ RemoteException -> 0x00c5 }
                goto L_0x0048
            L_0x003d:
                boolean r6 = r5 instanceof java.lang.Long     // Catch:{ RemoteException -> 0x00c5 }
                if (r6 == 0) goto L_0x00db
                java.lang.Long r5 = (java.lang.Long) r5     // Catch:{ RemoteException -> 0x00c5 }
                long r5 = r5.longValue()     // Catch:{ RemoteException -> 0x00c5 }
                int r5 = (int) r5     // Catch:{ RemoteException -> 0x00c5 }
            L_0x0048:
                if (r5 == 0) goto L_0x0053
                android.os.Message r2 = m143856a(r1, r5)     // Catch:{ RemoteException -> 0x00c5 }
                r1.sendMessage(r2)     // Catch:{ RemoteException -> 0x00c5 }
                goto L_0x00f7
            L_0x0053:
                java.lang.String r5 = "INAPP_PURCHASE_ITEM_LIST"
                boolean r5 = r2.containsKey(r5)     // Catch:{ RemoteException -> 0x00c5 }
                if (r5 == 0) goto L_0x00d1
                java.lang.String r5 = "INAPP_PURCHASE_DATA_LIST"
                boolean r5 = r2.containsKey(r5)     // Catch:{ RemoteException -> 0x00c5 }
                if (r5 == 0) goto L_0x00d1
                java.lang.String r5 = "INAPP_DATA_SIGNATURE_LIST"
                boolean r5 = r2.containsKey(r5)     // Catch:{ RemoteException -> 0x00c5 }
                if (r5 != 0) goto L_0x006d
                goto L_0x00d1
            L_0x006d:
                java.lang.String r5 = "INAPP_PURCHASE_ITEM_LIST"
                java.util.ArrayList r5 = r2.getStringArrayList(r5)     // Catch:{ RemoteException -> 0x00c5 }
                java.lang.String r6 = "INAPP_PURCHASE_DATA_LIST"
                java.util.ArrayList r6 = r2.getStringArrayList(r6)     // Catch:{ RemoteException -> 0x00c5 }
                java.lang.String r7 = "INAPP_DATA_SIGNATURE_LIST"
                java.util.ArrayList r7 = r2.getStringArrayList(r7)     // Catch:{ RemoteException -> 0x00c5 }
                if (r5 == 0) goto L_0x00c7
                if (r6 == 0) goto L_0x00c7
                if (r7 != 0) goto L_0x0086
                goto L_0x00c7
            L_0x0086:
                r8 = 0
            L_0x0087:
                int r9 = r6.size()     // Catch:{ RemoteException -> 0x00c5 }
                if (r8 >= r9) goto L_0x00b5
                java.lang.Object r9 = r5.get(r8)     // Catch:{ RemoteException -> 0x00c5 }
                java.lang.String r9 = (java.lang.String) r9     // Catch:{ RemoteException -> 0x00c5 }
                java.lang.String r10 = r11.f117248b     // Catch:{ RemoteException -> 0x00c5 }
                boolean r9 = android.text.TextUtils.equals(r9, r10)     // Catch:{ RemoteException -> 0x00c5 }
                if (r9 == 0) goto L_0x00b2
                java.lang.Object r5 = r6.get(r8)     // Catch:{ RemoteException -> 0x00c5 }
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ RemoteException -> 0x00c5 }
                java.lang.Object r6 = r7.get(r8)     // Catch:{ RemoteException -> 0x00c5 }
                java.lang.String r6 = (java.lang.String) r6     // Catch:{ RemoteException -> 0x00c5 }
                com.ss.caijing.globaliap.d.i r5 = com.p280ss.caijing.globaliap.p1791d.C45845g.m143861a(r5, r6)     // Catch:{ c -> 0x00ad }
                r3 = r5
                goto L_0x00b5
            L_0x00ad:
                r5 = move-exception
                com.google.p268a.p269a.p270a.p271a.p272a.C6497a.m20185b(r5)     // Catch:{ RemoteException -> 0x00c5 }
                goto L_0x00b5
            L_0x00b2:
                int r8 = r8 + 1
                goto L_0x0087
            L_0x00b5:
                if (r3 == 0) goto L_0x00b8
                goto L_0x00f7
            L_0x00b8:
                java.lang.String r5 = "INAPP_CONTINUATION_TOKEN"
                java.lang.String r2 = r2.getString(r5)     // Catch:{ RemoteException -> 0x00c5 }
                boolean r5 = android.text.TextUtils.isEmpty(r2)
                if (r5 == 0) goto L_0x0018
                goto L_0x00f7
            L_0x00c5:
                goto L_0x00f7
            L_0x00c7:
                r2 = 22
                android.os.Message r2 = m143856a(r1, r2)     // Catch:{ RemoteException -> 0x00c5 }
                r1.sendMessage(r2)     // Catch:{ RemoteException -> 0x00c5 }
                goto L_0x00f7
            L_0x00d1:
                r2 = 21
                android.os.Message r2 = m143856a(r1, r2)     // Catch:{ RemoteException -> 0x00c5 }
                r1.sendMessage(r2)     // Catch:{ RemoteException -> 0x00c5 }
                goto L_0x00f7
            L_0x00db:
                java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch:{ RemoteException -> 0x00c5 }
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ RemoteException -> 0x00c5 }
                java.lang.String r7 = "Unexpected type for bundle response code: "
                r6.<init>(r7)     // Catch:{ RemoteException -> 0x00c5 }
                java.lang.Class r5 = r5.getClass()     // Catch:{ RemoteException -> 0x00c5 }
                java.lang.String r5 = r5.getName()     // Catch:{ RemoteException -> 0x00c5 }
                r6.append(r5)     // Catch:{ RemoteException -> 0x00c5 }
                java.lang.String r5 = r6.toString()     // Catch:{ RemoteException -> 0x00c5 }
                r2.<init>(r5)     // Catch:{ RemoteException -> 0x00c5 }
                throw r2     // Catch:{ RemoteException -> 0x00c5 }
            L_0x00f7:
                if (r3 == 0) goto L_0x010b
                android.os.Message r2 = r1.obtainMessage()
                r5 = 103(0x67, float:1.44E-43)
                r2.what = r5
                r2.arg1 = r4
                r2.arg2 = r4
                r2.obj = r3
                r1.sendMessage(r2)
                goto L_0x0120
            L_0x010b:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r3 = "do not find targetProduct:"
                r2.<init>(r3)
                java.lang.String r3 = r11.f117248b
                r2.append(r3)
                r2 = 23
                android.os.Message r2 = m143856a(r1, r2)
                r1.sendMessage(r2)
            L_0x0120:
                r0.f117230o = r4
                return
            L_0x0123:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.caijing.globaliap.p1791d.C45829e.C45843i.run():void");
        }

        /* renamed from: a */
        private static Message m143856a(Handler handler, int i) {
            Message obtainMessage = handler.obtainMessage();
            obtainMessage.what = 103;
            obtainMessage.arg1 = -1;
            obtainMessage.arg2 = i;
            return obtainMessage;
        }

        private C45843i(String str, String str2, C45829e eVar) {
            this.f117248b = str;
            this.f117249c = str2;
            this.f117247a = new WeakReference<>(eVar);
        }

        /* synthetic */ C45843i(String str, String str2, C45829e eVar, byte b) {
            this(str, str2, eVar);
        }
    }

    /* renamed from: a */
    public final synchronized void mo111056a(final ArrayList<String> arrayList, final String str, C45841g gVar) {
        if (this.f117226k) {
            gVar.mo111010a();
        } else if (this.f117227l) {
            gVar.mo111010a();
        } else {
            this.f117218c = gVar;
            new Thread(new Runnable() {
                public final void run() {
                    boolean z;
                    Bundle bundle;
                    Bundle bundle2 = new Bundle();
                    bundle2.putStringArrayList("ITEM_ID_LIST", arrayList);
                    try {
                        bundle = C45829e.this.f117216a.getSkuDetails(3, C45829e.this.f117224i.getPackageName(), str, bundle2);
                        z = true;
                    } catch (RemoteException unused) {
                        bundle = null;
                        z = false;
                    }
                    if (C45829e.this.f117232q != null) {
                        Message obtainMessage = C45829e.this.f117232q.obtainMessage();
                        obtainMessage.what = 100;
                        if (z) {
                            obtainMessage.arg1 = 0;
                            obtainMessage.obj = bundle;
                        } else {
                            obtainMessage.arg1 = -1;
                        }
                        C45829e.this.f117232q.sendMessage(obtainMessage);
                    }
                    C45829e.this.f117227l = false;
                }
            }).start();
            this.f117227l = true;
        }
    }

    /* renamed from: a */
    public final void mo111050a() {
        if (!(this.f117216a == null || this.f117224i == null)) {
            this.f117224i.unbindService(this.f117233r);
        }
        this.f117216a = null;
        this.f117224i = null;
        this.f117233r = null;
        this.f117232q = null;
        this.f117217b = null;
        this.f117218c = null;
        this.f117219d = null;
        this.f117220e = null;
        this.f117221f = null;
        this.f117222g = null;
        this.f117223h = null;
        this.f117226k = true;
    }

    public C45829e(Context context) {
        this.f117224i = context;
    }

    /* renamed from: a */
    public final void mo111051a(C45836b bVar) {
        if (!this.f117226k) {
            this.f117217b = bVar;
            Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
            intent.setPackage("com.android.vending");
            if (!this.f117224i.bindService(intent, this.f117233r, 1)) {
                this.f117217b.mo111009b();
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo111052a(final String str, C45838d dVar) {
        if (this.f117226k) {
            dVar.mo111046a();
        } else if (this.f117229n) {
            dVar.mo111046a();
        } else {
            this.f117220e = dVar;
            new Thread(new Runnable() {
                public final void run() {
                    boolean z;
                    int i;
                    try {
                        i = C45829e.this.f117216a.consumePurchase(3, C45829e.this.f117224i.getPackageName(), str);
                        z = true;
                    } catch (RemoteException unused) {
                        i = 0;
                        z = false;
                    }
                    if (C45829e.this.f117232q != null) {
                        Message obtainMessage = C45829e.this.f117232q.obtainMessage();
                        obtainMessage.what = 102;
                        if (z) {
                            obtainMessage.arg1 = 0;
                            obtainMessage.arg2 = i;
                        } else {
                            obtainMessage.arg1 = -1;
                        }
                        C45829e.this.f117232q.sendMessage(obtainMessage);
                        C45829e.this.f117229n = false;
                    }
                }
            }).start();
            this.f117229n = true;
        }
    }

    /* renamed from: a */
    public final synchronized void mo111055a(final ArrayList<String> arrayList, C45837c cVar) {
        if (this.f117226k) {
            cVar.mo111012a(null);
        } else if (this.f117231p) {
            cVar.mo111012a(null);
        } else {
            this.f117223h = cVar;
            new Thread(new Runnable() {
                public final void run() {
                    HashMap hashMap = new HashMap();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        String str = (String) it.next();
                        try {
                            hashMap.put(str, Integer.valueOf(C45829e.this.f117216a.consumePurchase(3, C45829e.this.f117224i.getPackageName(), str)));
                        } catch (RemoteException unused) {
                            hashMap.put(str, Integer.valueOf(-1));
                        }
                    }
                    if (C45829e.this.f117232q != null) {
                        Message obtainMessage = C45829e.this.f117232q.obtainMessage();
                        obtainMessage.what = 105;
                        obtainMessage.obj = hashMap;
                        C45829e.this.f117232q.sendMessage(obtainMessage);
                    }
                    C45829e.this.f117231p = false;
                }
            }).start();
            this.f117231p = true;
        }
    }

    /* renamed from: a */
    public final synchronized void mo111053a(String str, String str2, C45840f fVar) {
        if (this.f117226k) {
            fVar.mo111048a(24);
        } else if (this.f117230o) {
            fVar.mo111048a(25);
        } else {
            this.f117221f = fVar;
            new Thread(new C45843i(str, str2, this, 0)).start();
            this.f117230o = true;
        }
    }

    /* renamed from: a */
    public final synchronized void mo111054a(final String str, final String str2, final String str3, C45839e eVar) {
        if (this.f117226k) {
            eVar.mo111041a();
        } else if (this.f117228m) {
            eVar.mo111041a();
        } else {
            this.f117219d = eVar;
            new Thread(new Runnable() {
                public final void run() {
                    boolean z;
                    Bundle bundle;
                    try {
                        bundle = C45829e.this.f117216a.getBuyIntent(3, C45829e.this.f117224i.getPackageName(), str, str2, str3);
                        z = true;
                    } catch (RemoteException unused) {
                        bundle = null;
                        z = false;
                    }
                    if (C45829e.this.f117232q != null) {
                        Message obtainMessage = C45829e.this.f117232q.obtainMessage();
                        obtainMessage.what = BaseNotice.HASHTAG;
                        if (z) {
                            obtainMessage.arg1 = 0;
                            obtainMessage.obj = bundle;
                        } else {
                            obtainMessage.arg1 = -1;
                        }
                        C45829e.this.f117232q.sendMessage(obtainMessage);
                        C45829e.this.f117228m = false;
                    }
                }
            }).start();
            this.f117228m = true;
        }
    }
}
