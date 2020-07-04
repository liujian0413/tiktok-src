package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.c */
public abstract class C15589c extends bfz implements C15553b {
    public C15589c() {
        super("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    /* JADX WARNING: type inference failed for: r4v1 */
    /* JADX WARNING: type inference failed for: r4v2, types: [com.google.android.gms.internal.ads.bys] */
    /* JADX WARNING: type inference failed for: r4v4, types: [com.google.android.gms.internal.ads.byu] */
    /* JADX WARNING: type inference failed for: r4v6, types: [com.google.android.gms.internal.ads.bys] */
    /* JADX WARNING: type inference failed for: r4v9, types: [com.google.android.gms.internal.ads.u] */
    /* JADX WARNING: type inference failed for: r4v11, types: [com.google.android.gms.internal.ads.w] */
    /* JADX WARNING: type inference failed for: r4v13, types: [com.google.android.gms.internal.ads.u] */
    /* JADX WARNING: type inference failed for: r4v15 */
    /* JADX WARNING: type inference failed for: r4v16 */
    /* JADX WARNING: type inference failed for: r4v17 */
    /* JADX WARNING: type inference failed for: r4v18 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r4v1
      assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], com.google.android.gms.internal.ads.w, com.google.android.gms.internal.ads.byu, com.google.android.gms.internal.ads.bys, com.google.android.gms.internal.ads.u]
      uses: [com.google.android.gms.internal.ads.bys, com.google.android.gms.internal.ads.u]
      mth insns count: 78
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean dispatchTransaction(int r1, android.os.Parcel r2, android.os.Parcel r3, int r4) throws android.os.RemoteException {
        /*
            r0 = this;
            r4 = 0
            switch(r1) {
                case 1: goto L_0x00e9;
                case 2: goto L_0x00c8;
                case 3: goto L_0x00b9;
                case 4: goto L_0x00aa;
                case 5: goto L_0x008f;
                case 6: goto L_0x0080;
                case 7: goto L_0x005e;
                case 8: goto L_0x0046;
                case 9: goto L_0x0036;
                case 10: goto L_0x0026;
                case 11: goto L_0x0004;
                case 12: goto L_0x0004;
                case 13: goto L_0x0016;
                case 14: goto L_0x0006;
                default: goto L_0x0004;
            }
        L_0x0004:
            r1 = 0
            return r1
        L_0x0006:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.jl r1 = com.google.android.gms.internal.ads.C15792jm.m51111a(r1)
            r0.mo37794a(r1)
            r3.writeNoException()
            goto L_0x00f3
        L_0x0016:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzaks> r1 = com.google.android.gms.internal.ads.zzaks.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.bga.m48614a(r2, r1)
            com.google.android.gms.internal.ads.zzaks r1 = (com.google.android.gms.internal.ads.zzaks) r1
            r0.mo37797a(r1)
            r3.writeNoException()
            goto L_0x00f3
        L_0x0026:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.ge r1 = com.google.android.gms.internal.ads.C15704gf.m50899a(r1)
            r0.mo37793a(r1)
            r3.writeNoException()
            goto L_0x00f3
        L_0x0036:
            android.os.Parcelable$Creator<com.google.android.gms.ads.formats.PublisherAdViewOptions> r1 = com.google.android.gms.ads.formats.PublisherAdViewOptions.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.bga.m48614a(r2, r1)
            com.google.android.gms.ads.formats.PublisherAdViewOptions r1 = (com.google.android.gms.ads.formats.PublisherAdViewOptions) r1
            r0.mo37788a(r1)
            r3.writeNoException()
            goto L_0x00f3
        L_0x0046:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.gb r1 = com.google.android.gms.internal.ads.C15701gc.m50896a(r1)
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzyz> r4 = com.google.android.gms.internal.ads.zzyz.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.internal.ads.bga.m48614a(r2, r4)
            com.google.android.gms.internal.ads.zzyz r2 = (com.google.android.gms.internal.ads.zzyz) r2
            r0.mo37792a(r1, r2)
            r3.writeNoException()
            goto L_0x00f3
        L_0x005e:
            android.os.IBinder r1 = r2.readStrongBinder()
            if (r1 != 0) goto L_0x0065
            goto L_0x0078
        L_0x0065:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.ICorrelationIdProvider"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.C16076u
            if (r4 == 0) goto L_0x0073
            r4 = r2
            com.google.android.gms.internal.ads.u r4 = (com.google.android.gms.internal.ads.C16076u) r4
            goto L_0x0078
        L_0x0073:
            com.google.android.gms.internal.ads.w r4 = new com.google.android.gms.internal.ads.w
            r4.<init>(r1)
        L_0x0078:
            r0.mo37795a(r4)
            r3.writeNoException()
            goto L_0x00f3
        L_0x0080:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzafl> r1 = com.google.android.gms.internal.ads.zzafl.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.bga.m48614a(r2, r1)
            com.google.android.gms.internal.ads.zzafl r1 = (com.google.android.gms.internal.ads.zzafl) r1
            r0.mo37796a(r1)
            r3.writeNoException()
            goto L_0x00f3
        L_0x008f:
            java.lang.String r1 = r2.readString()
            android.os.IBinder r4 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.fy r4 = com.google.android.gms.internal.ads.C15697fz.m50859a(r4)
            android.os.IBinder r2 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.fv r2 = com.google.android.gms.internal.ads.C15694fw.m50856a(r2)
            r0.mo37798a(r1, r4, r2)
            r3.writeNoException()
            goto L_0x00f3
        L_0x00aa:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.fs r1 = com.google.android.gms.internal.ads.C15691ft.m50853a(r1)
            r0.mo37791a(r1)
            r3.writeNoException()
            goto L_0x00f3
        L_0x00b9:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.fo r1 = com.google.android.gms.internal.ads.C15687fp.m50849a(r1)
            r0.mo37790a(r1)
            r3.writeNoException()
            goto L_0x00f3
        L_0x00c8:
            android.os.IBinder r1 = r2.readStrongBinder()
            if (r1 != 0) goto L_0x00cf
            goto L_0x00e2
        L_0x00cf:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IAdListener"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.bys
            if (r4 == 0) goto L_0x00dd
            r4 = r2
            com.google.android.gms.internal.ads.bys r4 = (com.google.android.gms.internal.ads.bys) r4
            goto L_0x00e2
        L_0x00dd:
            com.google.android.gms.internal.ads.byu r4 = new com.google.android.gms.internal.ads.byu
            r4.<init>(r1)
        L_0x00e2:
            r0.mo37789a(r4)
            r3.writeNoException()
            goto L_0x00f3
        L_0x00e9:
            com.google.android.gms.internal.ads.byv r1 = r0.mo37787a()
            r3.writeNoException()
            com.google.android.gms.internal.ads.bga.m48615a(r3, r1)
        L_0x00f3:
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C15589c.dispatchTransaction(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
