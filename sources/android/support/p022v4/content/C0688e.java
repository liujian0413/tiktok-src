package android.support.p022v4.content;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Message;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: android.support.v4.content.e */
public final class C0688e {

    /* renamed from: f */
    private static final Object f2636f = new Object();

    /* renamed from: g */
    private static C0688e f2637g;

    /* renamed from: a */
    private final Context f2638a;

    /* renamed from: b */
    private final HashMap<BroadcastReceiver, ArrayList<C0691b>> f2639b = new HashMap<>();

    /* renamed from: c */
    private final HashMap<String, ArrayList<C0691b>> f2640c = new HashMap<>();

    /* renamed from: d */
    private final ArrayList<C0690a> f2641d = new ArrayList<>();

    /* renamed from: e */
    private final Handler f2642e;

    /* renamed from: android.support.v4.content.e$a */
    static final class C0690a {

        /* renamed from: a */
        final Intent f2644a;

        /* renamed from: b */
        final ArrayList<C0691b> f2645b;

        C0690a(Intent intent, ArrayList<C0691b> arrayList) {
            this.f2644a = intent;
            this.f2645b = arrayList;
        }
    }

    /* renamed from: android.support.v4.content.e$b */
    static final class C0691b {

        /* renamed from: a */
        final IntentFilter f2646a;

        /* renamed from: b */
        final BroadcastReceiver f2647b;

        /* renamed from: c */
        boolean f2648c;

        /* renamed from: d */
        boolean f2649d;

        public final String toString() {
            StringBuilder sb = new StringBuilder(PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
            sb.append("Receiver{");
            sb.append(this.f2647b);
            sb.append(" filter=");
            sb.append(this.f2646a);
            if (this.f2649d) {
                sb.append(" DEAD");
            }
            sb.append("}");
            return sb.toString();
        }

        C0691b(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
            this.f2646a = intentFilter;
            this.f2647b = broadcastReceiver;
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001d, code lost:
        if (r2 >= r1.length) goto L_0x0000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001f, code lost:
        r3 = r1[r2];
        r4 = r3.f2645b.size();
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
        if (r5 >= r4) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        r6 = (android.support.p022v4.content.C0688e.C0691b) r3.f2645b.get(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0034, code lost:
        if (r6.f2649d != false) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0036, code lost:
        r6.f2647b.onReceive(r9.f2638a, r3.f2644a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003f, code lost:
        r5 = r5 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0042, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        r2 = 0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo2836a() {
        /*
            r9 = this;
        L_0x0000:
            java.util.HashMap<android.content.BroadcastReceiver, java.util.ArrayList<android.support.v4.content.e$b>> r0 = r9.f2639b
            monitor-enter(r0)
            java.util.ArrayList<android.support.v4.content.e$a> r1 = r9.f2641d     // Catch:{ all -> 0x0045 }
            int r1 = r1.size()     // Catch:{ all -> 0x0045 }
            if (r1 > 0) goto L_0x000d
            monitor-exit(r0)     // Catch:{ all -> 0x0045 }
            return
        L_0x000d:
            android.support.v4.content.e$a[] r1 = new android.support.p022v4.content.C0688e.C0690a[r1]     // Catch:{ all -> 0x0045 }
            java.util.ArrayList<android.support.v4.content.e$a> r2 = r9.f2641d     // Catch:{ all -> 0x0045 }
            r2.toArray(r1)     // Catch:{ all -> 0x0045 }
            java.util.ArrayList<android.support.v4.content.e$a> r2 = r9.f2641d     // Catch:{ all -> 0x0045 }
            r2.clear()     // Catch:{ all -> 0x0045 }
            monitor-exit(r0)     // Catch:{ all -> 0x0045 }
            r0 = 0
            r2 = 0
        L_0x001c:
            int r3 = r1.length
            if (r2 >= r3) goto L_0x0000
            r3 = r1[r2]
            java.util.ArrayList<android.support.v4.content.e$b> r4 = r3.f2645b
            int r4 = r4.size()
            r5 = 0
        L_0x0028:
            if (r5 >= r4) goto L_0x0042
            java.util.ArrayList<android.support.v4.content.e$b> r6 = r3.f2645b
            java.lang.Object r6 = r6.get(r5)
            android.support.v4.content.e$b r6 = (android.support.p022v4.content.C0688e.C0691b) r6
            boolean r7 = r6.f2649d
            if (r7 != 0) goto L_0x003f
            android.content.BroadcastReceiver r6 = r6.f2647b
            android.content.Context r7 = r9.f2638a
            android.content.Intent r8 = r3.f2644a
            r6.onReceive(r7, r8)
        L_0x003f:
            int r5 = r5 + 1
            goto L_0x0028
        L_0x0042:
            int r2 = r2 + 1
            goto L_0x001c
        L_0x0045:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0045 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p022v4.content.C0688e.mo2836a():void");
    }

    /* renamed from: a */
    public static C0688e m2941a(Context context) {
        C0688e eVar;
        synchronized (f2636f) {
            if (f2637g == null) {
                f2637g = new C0688e(context.getApplicationContext());
            }
            eVar = f2637g;
        }
        return eVar;
    }

    private C0688e(Context context) {
        this.f2638a = context;
        this.f2642e = new Handler(context.getMainLooper()) {
            public final void handleMessage(Message message) {
                if (message.what != 1) {
                    super.handleMessage(message);
                } else {
                    C0688e.this.mo2836a();
                }
            }
        };
    }

    /* renamed from: a */
    public final void mo2837a(BroadcastReceiver broadcastReceiver) {
        synchronized (this.f2639b) {
            ArrayList arrayList = (ArrayList) this.f2639b.remove(broadcastReceiver);
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    C0691b bVar = (C0691b) arrayList.get(size);
                    bVar.f2649d = true;
                    for (int i = 0; i < bVar.f2646a.countActions(); i++) {
                        String action = bVar.f2646a.getAction(i);
                        ArrayList arrayList2 = (ArrayList) this.f2640c.get(action);
                        if (arrayList2 != null) {
                            for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                                C0691b bVar2 = (C0691b) arrayList2.get(size2);
                                if (bVar2.f2647b == broadcastReceiver) {
                                    bVar2.f2649d = true;
                                    arrayList2.remove(size2);
                                }
                            }
                            if (arrayList2.size() <= 0) {
                                this.f2640c.remove(action);
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c2, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00c5, code lost:
        return false;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo2839a(android.content.Intent r23) {
        /*
            r22 = this;
            r1 = r22
            r0 = r23
            java.util.HashMap<android.content.BroadcastReceiver, java.util.ArrayList<android.support.v4.content.e$b>> r2 = r1.f2639b
            monitor-enter(r2)
            java.lang.String r10 = r23.getAction()     // Catch:{ all -> 0x00c6 }
            android.content.Context r3 = r1.f2638a     // Catch:{ all -> 0x00c6 }
            android.content.ContentResolver r3 = r3.getContentResolver()     // Catch:{ all -> 0x00c6 }
            java.lang.String r11 = r0.resolveTypeIfNeeded(r3)     // Catch:{ all -> 0x00c6 }
            android.net.Uri r12 = r23.getData()     // Catch:{ all -> 0x00c6 }
            java.lang.String r13 = r23.getScheme()     // Catch:{ all -> 0x00c6 }
            java.util.Set r14 = r23.getCategories()     // Catch:{ all -> 0x00c6 }
            int r3 = r23.getFlags()     // Catch:{ all -> 0x00c6 }
            r3 = r3 & 8
            r9 = 1
            if (r3 == 0) goto L_0x002d
            r16 = 1
            goto L_0x002f
        L_0x002d:
            r16 = 0
        L_0x002f:
            java.util.HashMap<java.lang.String, java.util.ArrayList<android.support.v4.content.e$b>> r3 = r1.f2640c     // Catch:{ all -> 0x00c6 }
            java.lang.String r4 = r23.getAction()     // Catch:{ all -> 0x00c6 }
            java.lang.Object r3 = r3.get(r4)     // Catch:{ all -> 0x00c6 }
            r8 = r3
            java.util.ArrayList r8 = (java.util.ArrayList) r8     // Catch:{ all -> 0x00c6 }
            if (r8 == 0) goto L_0x00c3
            r3 = 0
            r6 = r3
            r7 = 0
        L_0x0041:
            int r3 = r8.size()     // Catch:{ all -> 0x00c6 }
            if (r7 >= r3) goto L_0x0093
            java.lang.Object r3 = r8.get(r7)     // Catch:{ all -> 0x00c6 }
            r5 = r3
            android.support.v4.content.e$b r5 = (android.support.p022v4.content.C0688e.C0691b) r5     // Catch:{ all -> 0x00c6 }
            boolean r3 = r5.f2648c     // Catch:{ all -> 0x00c6 }
            if (r3 == 0) goto L_0x005d
            r19 = r7
            r20 = r8
            r18 = r10
            r21 = r11
            r11 = 1
            r10 = r6
            goto L_0x0088
        L_0x005d:
            android.content.IntentFilter r3 = r5.f2646a     // Catch:{ all -> 0x00c6 }
            java.lang.String r17 = "LocalBroadcastManager"
            r4 = r10
            r15 = r5
            r5 = r11
            r18 = r10
            r10 = r6
            r6 = r13
            r19 = r7
            r7 = r12
            r20 = r8
            r8 = r14
            r21 = r11
            r11 = 1
            r9 = r17
            int r3 = r3.match(r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x00c6 }
            if (r3 < 0) goto L_0x0088
            if (r10 != 0) goto L_0x0081
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x00c6 }
            r6.<init>()     // Catch:{ all -> 0x00c6 }
            goto L_0x0082
        L_0x0081:
            r6 = r10
        L_0x0082:
            r6.add(r15)     // Catch:{ all -> 0x00c6 }
            r15.f2648c = r11     // Catch:{ all -> 0x00c6 }
            goto L_0x0089
        L_0x0088:
            r6 = r10
        L_0x0089:
            int r7 = r19 + 1
            r10 = r18
            r8 = r20
            r11 = r21
            r9 = 1
            goto L_0x0041
        L_0x0093:
            r10 = r6
            r11 = 1
            if (r10 == 0) goto L_0x00c3
            r3 = 0
        L_0x0098:
            int r4 = r10.size()     // Catch:{ all -> 0x00c6 }
            if (r3 >= r4) goto L_0x00aa
            java.lang.Object r4 = r10.get(r3)     // Catch:{ all -> 0x00c6 }
            android.support.v4.content.e$b r4 = (android.support.p022v4.content.C0688e.C0691b) r4     // Catch:{ all -> 0x00c6 }
            r5 = 0
            r4.f2648c = r5     // Catch:{ all -> 0x00c6 }
            int r3 = r3 + 1
            goto L_0x0098
        L_0x00aa:
            java.util.ArrayList<android.support.v4.content.e$a> r3 = r1.f2641d     // Catch:{ all -> 0x00c6 }
            android.support.v4.content.e$a r4 = new android.support.v4.content.e$a     // Catch:{ all -> 0x00c6 }
            r4.<init>(r0, r10)     // Catch:{ all -> 0x00c6 }
            r3.add(r4)     // Catch:{ all -> 0x00c6 }
            android.os.Handler r0 = r1.f2642e     // Catch:{ all -> 0x00c6 }
            boolean r0 = r0.hasMessages(r11)     // Catch:{ all -> 0x00c6 }
            if (r0 != 0) goto L_0x00c1
            android.os.Handler r0 = r1.f2642e     // Catch:{ all -> 0x00c6 }
            r0.sendEmptyMessage(r11)     // Catch:{ all -> 0x00c6 }
        L_0x00c1:
            monitor-exit(r2)     // Catch:{ all -> 0x00c6 }
            return r11
        L_0x00c3:
            monitor-exit(r2)     // Catch:{ all -> 0x00c6 }
            r0 = 0
            return r0
        L_0x00c6:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00c6 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p022v4.content.C0688e.mo2839a(android.content.Intent):boolean");
    }

    /* renamed from: a */
    public final void mo2838a(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.f2639b) {
            C0691b bVar = new C0691b(intentFilter, broadcastReceiver);
            ArrayList arrayList = (ArrayList) this.f2639b.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList(1);
                this.f2639b.put(broadcastReceiver, arrayList);
            }
            arrayList.add(bVar);
            for (int i = 0; i < intentFilter.countActions(); i++) {
                String action = intentFilter.getAction(i);
                ArrayList arrayList2 = (ArrayList) this.f2640c.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList(1);
                    this.f2640c.put(action, arrayList2);
                }
                arrayList2.add(bVar);
            }
        }
    }
}
