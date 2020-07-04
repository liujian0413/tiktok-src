package com.google.firebase.iid;

/* renamed from: com.google.firebase.iid.l */
final /* synthetic */ class C18342l implements Runnable {

    /* renamed from: a */
    private final C18339i f49830a;

    C18342l(C18339i iVar) {
        this.f49830a = iVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0039, code lost:
        r3 = r0.f49827f.f49818b;
        r4 = r0.f49823b;
        r5 = android.os.Message.obtain();
        r5.what = r1.f49837c;
        r5.arg1 = r1.f49835a;
        r5.replyTo = r4;
        r4 = new android.os.Bundle();
        r4.putBoolean("oneWay", r1.mo47263a());
        r4.putString("pkg", r3.getPackageName());
        r4.putBundle("data", r1.f49838d);
        r5.setData(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r0.f49824c.mo47261a(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0076, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0077, code lost:
        r0.mo47251a(2, r1.getMessage());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r8 = this;
            com.google.firebase.iid.i r0 = r8.f49830a
        L_0x0002:
            monitor-enter(r0)
            int r1 = r0.f49822a     // Catch:{ all -> 0x007f }
            r2 = 2
            if (r1 == r2) goto L_0x000a
            monitor-exit(r0)     // Catch:{ all -> 0x007f }
            return
        L_0x000a:
            java.util.Queue<com.google.firebase.iid.p<?>> r1 = r0.f49825d     // Catch:{ all -> 0x007f }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x007f }
            if (r1 == 0) goto L_0x0017
            r0.mo47249a()     // Catch:{ all -> 0x007f }
            monitor-exit(r0)     // Catch:{ all -> 0x007f }
            return
        L_0x0017:
            java.util.Queue<com.google.firebase.iid.p<?>> r1 = r0.f49825d     // Catch:{ all -> 0x007f }
            java.lang.Object r1 = r1.poll()     // Catch:{ all -> 0x007f }
            com.google.firebase.iid.p r1 = (com.google.firebase.iid.C18346p) r1     // Catch:{ all -> 0x007f }
            android.util.SparseArray<com.google.firebase.iid.p<?>> r3 = r0.f49826e     // Catch:{ all -> 0x007f }
            int r4 = r1.f49835a     // Catch:{ all -> 0x007f }
            r3.put(r4, r1)     // Catch:{ all -> 0x007f }
            com.google.firebase.iid.f r3 = r0.f49827f     // Catch:{ all -> 0x007f }
            java.util.concurrent.ScheduledExecutorService r3 = r3.f49819c     // Catch:{ all -> 0x007f }
            com.google.firebase.iid.m r4 = new com.google.firebase.iid.m     // Catch:{ all -> 0x007f }
            r4.<init>(r0, r1)     // Catch:{ all -> 0x007f }
            r5 = 30
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x007f }
            r3.schedule(r4, r5, r7)     // Catch:{ all -> 0x007f }
            monitor-exit(r0)     // Catch:{ all -> 0x007f }
            com.google.firebase.iid.f r3 = r0.f49827f
            android.content.Context r3 = r3.f49818b
            android.os.Messenger r4 = r0.f49823b
            android.os.Message r5 = android.os.Message.obtain()
            int r6 = r1.f49837c
            r5.what = r6
            int r6 = r1.f49835a
            r5.arg1 = r6
            r5.replyTo = r4
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            java.lang.String r6 = "oneWay"
            boolean r7 = r1.mo47263a()
            r4.putBoolean(r6, r7)
            java.lang.String r6 = "pkg"
            java.lang.String r3 = r3.getPackageName()
            r4.putString(r6, r3)
            java.lang.String r3 = "data"
            android.os.Bundle r1 = r1.f49838d
            r4.putBundle(r3, r1)
            r5.setData(r4)
            com.google.firebase.iid.n r1 = r0.f49824c     // Catch:{ RemoteException -> 0x0076 }
            r1.mo47261a(r5)     // Catch:{ RemoteException -> 0x0076 }
            goto L_0x0002
        L_0x0076:
            r1 = move-exception
            java.lang.String r1 = r1.getMessage()
            r0.mo47251a(r2, r1)
            goto L_0x0002
        L_0x007f:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x007f }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.C18342l.run():void");
    }
}
