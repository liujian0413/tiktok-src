package com.squareup.picasso;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;

/* renamed from: com.squareup.picasso.i */
final class C18829i {

    /* renamed from: a */
    final C18832b f50737a = new C18832b();

    /* renamed from: b */
    final Context f50738b;

    /* renamed from: c */
    final ExecutorService f50739c;

    /* renamed from: d */
    final Downloader f50740d;

    /* renamed from: e */
    final Map<String, C18815c> f50741e;

    /* renamed from: f */
    final Map<Object, C18800a> f50742f;

    /* renamed from: g */
    final Map<Object, C18800a> f50743g;

    /* renamed from: h */
    final Set<Object> f50744h;

    /* renamed from: i */
    final Handler f50745i;

    /* renamed from: j */
    final Handler f50746j;

    /* renamed from: k */
    final C18822d f50747k;

    /* renamed from: l */
    final C18853w f50748l;

    /* renamed from: m */
    final List<C18815c> f50749m;

    /* renamed from: n */
    final C18833c f50750n;

    /* renamed from: o */
    final boolean f50751o;

    /* renamed from: p */
    public boolean f50752p;

    /* renamed from: com.squareup.picasso.i$a */
    static class C18830a extends Handler {

        /* renamed from: a */
        private final C18829i f50753a;

        public final void handleMessage(final Message message) {
            boolean z = false;
            switch (message.what) {
                case 1:
                    this.f50753a.mo50039c((C18800a) message.obj);
                    return;
                case 2:
                    this.f50753a.mo50041d((C18800a) message.obj);
                    return;
                case 4:
                    this.f50753a.mo50043e((C18815c) message.obj);
                    return;
                case 5:
                    this.f50753a.mo50042d((C18815c) message.obj);
                    return;
                case 6:
                    this.f50753a.mo50032a((C18815c) message.obj, false);
                    return;
                case 7:
                    this.f50753a.mo50028a();
                    return;
                case 9:
                    this.f50753a.mo50035b((NetworkInfo) message.obj);
                    return;
                case 10:
                    C18829i iVar = this.f50753a;
                    if (message.arg1 == 1) {
                        z = true;
                    }
                    iVar.f50752p = z;
                    return;
                case 11:
                    this.f50753a.mo50033a(message.obj);
                    return;
                case 12:
                    this.f50753a.mo50038b(message.obj);
                    return;
                default:
                    Picasso.f50650a.post(new Runnable() {
                        public final void run() {
                            StringBuilder sb = new StringBuilder("Unknown handler message received: ");
                            sb.append(message.what);
                            throw new AssertionError(sb.toString());
                        }
                    });
                    return;
            }
        }

        public C18830a(Looper looper, C18829i iVar) {
            super(looper);
            this.f50753a = iVar;
        }
    }

    /* renamed from: com.squareup.picasso.i$b */
    static class C18832b extends HandlerThread {
        C18832b() {
            super("Picasso-Dispatcher", 10);
        }
    }

    /* renamed from: com.squareup.picasso.i$c */
    static class C18833c extends BroadcastReceiver {

        /* renamed from: a */
        private final C18829i f50756a;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo50046a() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.AIRPLANE_MODE");
            if (this.f50756a.f50751o) {
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            }
            this.f50756a.f50738b.registerReceiver(this, intentFilter);
        }

        C18833c(C18829i iVar) {
            this.f50756a = iVar;
        }

        public final void onReceive(Context context, Intent intent) {
            if (intent != null) {
                String action = intent.getAction();
                if (!"android.intent.action.AIRPLANE_MODE".equals(action)) {
                    if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
                        this.f50756a.mo50029a(((ConnectivityManager) C18807ad.m61431a(context, "connectivity")).getActiveNetworkInfo());
                    }
                } else if (intent.hasExtra("state")) {
                    this.f50756a.mo50034a(intent.getBooleanExtra("state", false));
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo50034a(boolean z) {
        this.f50745i.sendMessage(this.f50745i.obtainMessage(10, z ? 1 : 0, 0));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo50028a() {
        ArrayList arrayList = new ArrayList(this.f50749m);
        this.f50749m.clear();
        this.f50746j.sendMessage(this.f50746j.obtainMessage(8, arrayList));
        m61490a((List<C18815c>) arrayList);
    }

    /* renamed from: b */
    private void m61491b() {
        if (!this.f50742f.isEmpty()) {
            Iterator it = this.f50742f.values().iterator();
            while (it.hasNext()) {
                C18800a aVar = (C18800a) it.next();
                it.remove();
                if (aVar.f50682a.f50662m) {
                    aVar.f50683b.mo50069a();
                }
                m61489a(aVar, false);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo50039c(C18800a aVar) {
        m61489a(aVar, true);
    }

    /* renamed from: e */
    private void m61492e(C18800a aVar) {
        Object c = aVar.mo49997c();
        if (c != null) {
            aVar.f50692k = true;
            this.f50742f.put(c, aVar);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo50029a(NetworkInfo networkInfo) {
        this.f50745i.sendMessage(this.f50745i.obtainMessage(9, networkInfo));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo50036b(C18800a aVar) {
        this.f50745i.sendMessage(this.f50745i.obtainMessage(2, aVar));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo50040c(C18815c cVar) {
        this.f50745i.sendMessage(this.f50745i.obtainMessage(6, cVar));
    }

    /* renamed from: f */
    private void m61493f(C18815c cVar) {
        C18800a aVar = cVar.f50716k;
        if (aVar != null) {
            m61492e(aVar);
        }
        List<C18800a> list = cVar.f50717l;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                m61492e((C18800a) list.get(i));
            }
        }
    }

    /* renamed from: g */
    private void m61494g(C18815c cVar) {
        if (!cVar.mo50011b()) {
            this.f50749m.add(cVar);
            if (!this.f50745i.hasMessages(7)) {
                this.f50745i.sendEmptyMessageDelayed(7, 200);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo50035b(NetworkInfo networkInfo) {
        if (this.f50739c instanceof C18844r) {
            ((C18844r) this.f50739c).mo50066a(networkInfo);
        }
        if (networkInfo != null && networkInfo.isConnected()) {
            m61491b();
        }
    }

    /* renamed from: a */
    private static void m61490a(List<C18815c> list) {
        if (!list.isEmpty() && ((C18815c) list.get(0)).f50707b.f50662m) {
            StringBuilder sb = new StringBuilder();
            for (C18815c cVar : list) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(C18807ad.m61433a(cVar));
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final void mo50043e(C18815c cVar) {
        if (MemoryPolicy.shouldWriteToMemoryCache(cVar.f50713h)) {
            this.f50747k.mo50021a(cVar.f50711f, cVar.f50718m);
        }
        this.f50741e.remove(cVar.f50711f);
        m61494g(cVar);
        if (cVar.f50707b.f50662m) {
            C18807ad.m61433a(cVar);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo50030a(C18800a aVar) {
        this.f50745i.sendMessage(this.f50745i.obtainMessage(1, aVar));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo50037b(C18815c cVar) {
        this.f50745i.sendMessageDelayed(this.f50745i.obtainMessage(5, cVar), 500);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final void mo50041d(C18800a aVar) {
        String str = aVar.f50690i;
        C18815c cVar = (C18815c) this.f50741e.get(str);
        if (cVar != null) {
            cVar.mo50010b(aVar);
            if (cVar.mo50008a()) {
                this.f50741e.remove(str);
                if (aVar.f50682a.f50662m) {
                    aVar.f50683b.mo50069a();
                }
            }
        }
        if (this.f50744h.contains(aVar.f50691j)) {
            this.f50743g.remove(aVar.mo49997c());
            if (aVar.f50682a.f50662m) {
                aVar.f50683b.mo50069a();
            }
        }
        C18800a aVar2 = (C18800a) this.f50742f.remove(aVar.mo49997c());
        if (aVar2 != null && aVar2.f50682a.f50662m) {
            aVar2.f50683b.mo50069a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo50038b(Object obj) {
        if (this.f50744h.remove(obj)) {
            ArrayList arrayList = null;
            Iterator it = this.f50743g.values().iterator();
            while (it.hasNext()) {
                C18800a aVar = (C18800a) it.next();
                if (aVar.f50691j.equals(obj)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(aVar);
                    it.remove();
                }
            }
            if (arrayList != null) {
                this.f50746j.sendMessage(this.f50746j.obtainMessage(13, arrayList));
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final void mo50042d(C18815c cVar) {
        boolean z;
        if (!cVar.mo50011b()) {
            boolean z2 = false;
            if (this.f50739c.isShutdown()) {
                mo50032a(cVar, false);
                return;
            }
            NetworkInfo networkInfo = null;
            if (this.f50751o) {
                networkInfo = ((ConnectivityManager) C18807ad.m61431a(this.f50738b, "connectivity")).getActiveNetworkInfo();
            }
            if (networkInfo == null || !networkInfo.isConnected()) {
                z = false;
            } else {
                z = true;
            }
            boolean a = cVar.mo50009a(this.f50752p, networkInfo);
            boolean c = cVar.mo50012c();
            if (!a) {
                if (this.f50751o && c) {
                    z2 = true;
                }
                mo50032a(cVar, z2);
                if (z2) {
                    m61493f(cVar);
                }
            } else if (!this.f50751o || z) {
                if (cVar.f50707b.f50662m) {
                    C18807ad.m61433a(cVar);
                }
                if (cVar.f50721p instanceof C18841a) {
                    cVar.f50714i |= NetworkPolicy.NO_CACHE.index;
                }
                cVar.f50719n = this.f50739c.submit(cVar);
            } else {
                mo50032a(cVar, c);
                if (c) {
                    m61493f(cVar);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo50031a(C18815c cVar) {
        this.f50745i.sendMessage(this.f50745i.obtainMessage(4, cVar));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo50033a(Object obj) {
        boolean z;
        if (this.f50744h.add(obj)) {
            Iterator it = this.f50741e.values().iterator();
            while (it.hasNext()) {
                C18815c cVar = (C18815c) it.next();
                boolean z2 = cVar.f50707b.f50662m;
                C18800a aVar = cVar.f50716k;
                List<C18800a> list = cVar.f50717l;
                if (list == null || list.isEmpty()) {
                    z = false;
                } else {
                    z = true;
                }
                if (aVar != null || z) {
                    if (aVar != null && aVar.f50691j.equals(obj)) {
                        cVar.mo50010b(aVar);
                        this.f50743g.put(aVar.mo49997c(), aVar);
                        if (z2) {
                            aVar.f50683b.mo50069a();
                            StringBuilder sb = new StringBuilder("because tag '");
                            sb.append(obj);
                            sb.append("' was paused");
                        }
                    }
                    if (z) {
                        for (int size = list.size() - 1; size >= 0; size--) {
                            C18800a aVar2 = (C18800a) list.get(size);
                            if (aVar2.f50691j.equals(obj)) {
                                cVar.mo50010b(aVar2);
                                this.f50743g.put(aVar2.mo49997c(), aVar2);
                                if (z2) {
                                    aVar2.f50683b.mo50069a();
                                    StringBuilder sb2 = new StringBuilder("because tag '");
                                    sb2.append(obj);
                                    sb2.append("' was paused");
                                }
                            }
                        }
                    }
                    if (cVar.mo50008a()) {
                        it.remove();
                        if (z2) {
                            C18807ad.m61433a(cVar);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private void m61489a(C18800a aVar, boolean z) {
        if (this.f50744h.contains(aVar.f50691j)) {
            this.f50743g.put(aVar.mo49997c(), aVar);
            if (aVar.f50682a.f50662m) {
                aVar.f50683b.mo50069a();
                StringBuilder sb = new StringBuilder("because tag '");
                sb.append(aVar.f50691j);
                sb.append("' is paused");
            }
            return;
        }
        C18815c cVar = (C18815c) this.f50741e.get(aVar.f50690i);
        if (cVar != null) {
            cVar.mo50007a(aVar);
        } else if (this.f50739c.isShutdown()) {
            if (aVar.f50682a.f50662m) {
                aVar.f50683b.mo50069a();
            }
        } else {
            C18815c a = C18815c.m61457a(aVar.f50682a, this, this.f50747k, this.f50748l, aVar);
            a.f50719n = this.f50739c.submit(a);
            this.f50741e.put(aVar.f50690i, a);
            if (z) {
                this.f50742f.remove(aVar.mo49997c());
            }
            if (aVar.f50682a.f50662m) {
                aVar.f50683b.mo50069a();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo50032a(C18815c cVar, boolean z) {
        String str;
        if (cVar.f50707b.f50662m) {
            C18807ad.m61433a(cVar);
            StringBuilder sb = new StringBuilder("for error");
            if (z) {
                str = " (will replay)";
            } else {
                str = "";
            }
            sb.append(str);
        }
        this.f50741e.remove(cVar.f50711f);
        m61494g(cVar);
    }

    C18829i(Context context, ExecutorService executorService, Handler handler, Downloader downloader, C18822d dVar, C18853w wVar) {
        this.f50737a.start();
        C18807ad.m61438a(this.f50737a.getLooper());
        this.f50738b = context;
        this.f50739c = executorService;
        this.f50741e = new LinkedHashMap();
        this.f50742f = new WeakHashMap();
        this.f50743g = new WeakHashMap();
        this.f50744h = new HashSet();
        this.f50745i = new C18830a(this.f50737a.getLooper(), this);
        this.f50740d = downloader;
        this.f50746j = handler;
        this.f50747k = dVar;
        this.f50748l = wVar;
        this.f50749m = new ArrayList(4);
        this.f50752p = C18807ad.m61447d(this.f50738b);
        this.f50751o = C18807ad.m61443b(context, "android.permission.ACCESS_NETWORK_STATE");
        this.f50750n = new C18833c(this);
        this.f50750n.mo50046a();
    }
}
