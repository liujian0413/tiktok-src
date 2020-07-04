package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.h */
public abstract class C15725h extends bfz implements C15698g {
    public C15725h() {
        super("com.google.android.gms.ads.internal.client.IAdManager");
    }

    /* renamed from: a */
    public static C15698g m50989a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
        if (queryLocalInterface instanceof C15698g) {
            return (C15698g) queryLocalInterface;
        }
        return new C15752i(iBinder);
    }

    /* JADX WARNING: type inference failed for: r4v1 */
    /* JADX WARNING: type inference failed for: r4v2, types: [com.google.android.gms.internal.ads.bys] */
    /* JADX WARNING: type inference failed for: r4v4, types: [com.google.android.gms.internal.ads.byu] */
    /* JADX WARNING: type inference failed for: r4v6, types: [com.google.android.gms.internal.ads.bys] */
    /* JADX WARNING: type inference failed for: r4v7, types: [com.google.android.gms.internal.ads.o] */
    /* JADX WARNING: type inference failed for: r4v9, types: [com.google.android.gms.internal.ads.q] */
    /* JADX WARNING: type inference failed for: r4v11, types: [com.google.android.gms.internal.ads.o] */
    /* JADX WARNING: type inference failed for: r4v12, types: [com.google.android.gms.internal.ads.byp] */
    /* JADX WARNING: type inference failed for: r4v14, types: [com.google.android.gms.internal.ads.byr] */
    /* JADX WARNING: type inference failed for: r4v16, types: [com.google.android.gms.internal.ads.byp] */
    /* JADX WARNING: type inference failed for: r4v17, types: [com.google.android.gms.internal.ads.u] */
    /* JADX WARNING: type inference failed for: r4v19, types: [com.google.android.gms.internal.ads.w] */
    /* JADX WARNING: type inference failed for: r4v21, types: [com.google.android.gms.internal.ads.u] */
    /* JADX WARNING: type inference failed for: r4v22, types: [com.google.android.gms.internal.ads.l] */
    /* JADX WARNING: type inference failed for: r4v24, types: [com.google.android.gms.internal.ads.n] */
    /* JADX WARNING: type inference failed for: r4v26, types: [com.google.android.gms.internal.ads.l] */
    /* JADX WARNING: type inference failed for: r4v27 */
    /* JADX WARNING: type inference failed for: r4v28 */
    /* JADX WARNING: type inference failed for: r4v29 */
    /* JADX WARNING: type inference failed for: r4v30 */
    /* JADX WARNING: type inference failed for: r4v31 */
    /* JADX WARNING: type inference failed for: r4v32 */
    /* JADX WARNING: type inference failed for: r4v33 */
    /* JADX WARNING: type inference failed for: r4v34 */
    /* JADX WARNING: type inference failed for: r4v35 */
    /* JADX WARNING: type inference failed for: r4v36 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r4v1
      assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], com.google.android.gms.internal.ads.q, com.google.android.gms.internal.ads.byu, com.google.android.gms.internal.ads.bys, com.google.android.gms.internal.ads.o, com.google.android.gms.internal.ads.byr, com.google.android.gms.internal.ads.byp, com.google.android.gms.internal.ads.w, com.google.android.gms.internal.ads.u, com.google.android.gms.internal.ads.n, com.google.android.gms.internal.ads.l]
      uses: [com.google.android.gms.internal.ads.bys, com.google.android.gms.internal.ads.o, com.google.android.gms.internal.ads.byp, com.google.android.gms.internal.ads.u, com.google.android.gms.internal.ads.l]
      mth insns count: 164
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
    /* JADX WARNING: Unknown variable types count: 11 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean dispatchTransaction(int r1, android.os.Parcel r2, android.os.Parcel r3, int r4) throws android.os.RemoteException {
        /*
            r0 = this;
            r4 = 0
            switch(r1) {
                case 1: goto L_0x0209;
                case 2: goto L_0x0202;
                case 3: goto L_0x01f7;
                case 4: goto L_0x01e4;
                case 5: goto L_0x01dd;
                case 6: goto L_0x01d6;
                case 7: goto L_0x01b5;
                case 8: goto L_0x0194;
                case 9: goto L_0x018c;
                case 10: goto L_0x0184;
                case 11: goto L_0x017c;
                case 12: goto L_0x0170;
                case 13: goto L_0x0160;
                case 14: goto L_0x0150;
                case 15: goto L_0x013c;
                case 16: goto L_0x0004;
                case 17: goto L_0x0004;
                case 18: goto L_0x0130;
                case 19: goto L_0x0120;
                case 20: goto L_0x00fe;
                case 21: goto L_0x00dc;
                case 22: goto L_0x00d0;
                case 23: goto L_0x00c4;
                case 24: goto L_0x00b4;
                case 25: goto L_0x00a8;
                case 26: goto L_0x009c;
                case 27: goto L_0x0004;
                case 28: goto L_0x0004;
                case 29: goto L_0x008c;
                case 30: goto L_0x007c;
                case 31: goto L_0x0070;
                case 32: goto L_0x0064;
                case 33: goto L_0x0058;
                case 34: goto L_0x004c;
                case 35: goto L_0x0040;
                case 36: goto L_0x001e;
                case 37: goto L_0x0012;
                case 38: goto L_0x0006;
                default: goto L_0x0004;
            }
        L_0x0004:
            r1 = 0
            return r1
        L_0x0006:
            java.lang.String r1 = r2.readString()
            r0.mo37612b(r1)
            r3.writeNoException()
            goto L_0x0213
        L_0x0012:
            android.os.Bundle r1 = r0.mo37624n()
            r3.writeNoException()
            com.google.android.gms.internal.ads.bga.m48620b(r3, r1)
            goto L_0x0213
        L_0x001e:
            android.os.IBinder r1 = r2.readStrongBinder()
            if (r1 != 0) goto L_0x0025
            goto L_0x0038
        L_0x0025:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IAdMetadataListener"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.C15833l
            if (r4 == 0) goto L_0x0033
            r4 = r2
            com.google.android.gms.internal.ads.l r4 = (com.google.android.gms.internal.ads.C15833l) r4
            goto L_0x0038
        L_0x0033:
            com.google.android.gms.internal.ads.n r4 = new com.google.android.gms.internal.ads.n
            r4.<init>(r1)
        L_0x0038:
            r0.mo37592a(r4)
            r3.writeNoException()
            goto L_0x0213
        L_0x0040:
            java.lang.String r1 = r0.mo37689y_()
            r3.writeNoException()
            r3.writeString(r1)
            goto L_0x0213
        L_0x004c:
            boolean r1 = com.google.android.gms.internal.ads.bga.m48618a(r2)
            r0.mo37613b(r1)
            r3.writeNoException()
            goto L_0x0213
        L_0x0058:
            com.google.android.gms.internal.ads.bys r1 = r0.mo37578C()
            r3.writeNoException()
            com.google.android.gms.internal.ads.bga.m48615a(r3, r1)
            goto L_0x0213
        L_0x0064:
            com.google.android.gms.internal.ads.o r1 = r0.mo37577B()
            r3.writeNoException()
            com.google.android.gms.internal.ads.bga.m48615a(r3, r1)
            goto L_0x0213
        L_0x0070:
            java.lang.String r1 = r0.mo37576A()
            r3.writeNoException()
            r3.writeString(r1)
            goto L_0x0213
        L_0x007c:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzabp> r1 = com.google.android.gms.internal.ads.zzabp.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.bga.m48614a(r2, r1)
            com.google.android.gms.internal.ads.zzabp r1 = (com.google.android.gms.internal.ads.zzabp) r1
            r0.mo37599a(r1)
            r3.writeNoException()
            goto L_0x0213
        L_0x008c:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzacq> r1 = com.google.android.gms.internal.ads.zzacq.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.bga.m48614a(r2, r1)
            com.google.android.gms.internal.ads.zzacq r1 = (com.google.android.gms.internal.ads.zzacq) r1
            r0.mo37600a(r1)
            r3.writeNoException()
            goto L_0x0213
        L_0x009c:
            com.google.android.gms.internal.ads.ak r1 = r0.mo37627q()
            r3.writeNoException()
            com.google.android.gms.internal.ads.bga.m48615a(r3, r1)
            goto L_0x0213
        L_0x00a8:
            java.lang.String r1 = r2.readString()
            r0.mo37603a(r1)
            r3.writeNoException()
            goto L_0x0213
        L_0x00b4:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.yk r1 = com.google.android.gms.internal.ads.C16195yl.m52503a(r1)
            r0.mo37598a(r1)
            r3.writeNoException()
            goto L_0x0213
        L_0x00c4:
            boolean r1 = r0.mo37626p()
            r3.writeNoException()
            com.google.android.gms.internal.ads.bga.m48617a(r3, r1)
            goto L_0x0213
        L_0x00d0:
            boolean r1 = com.google.android.gms.internal.ads.bga.m48618a(r2)
            r0.mo37607a(r1)
            r3.writeNoException()
            goto L_0x0213
        L_0x00dc:
            android.os.IBinder r1 = r2.readStrongBinder()
            if (r1 != 0) goto L_0x00e3
            goto L_0x00f6
        L_0x00e3:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.ICorrelationIdProvider"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.C16076u
            if (r4 == 0) goto L_0x00f1
            r4 = r2
            com.google.android.gms.internal.ads.u r4 = (com.google.android.gms.internal.ads.C16076u) r4
            goto L_0x00f6
        L_0x00f1:
            com.google.android.gms.internal.ads.w r4 = new com.google.android.gms.internal.ads.w
            r4.<init>(r1)
        L_0x00f6:
            r0.mo37596a(r4)
            r3.writeNoException()
            goto L_0x0213
        L_0x00fe:
            android.os.IBinder r1 = r2.readStrongBinder()
            if (r1 != 0) goto L_0x0105
            goto L_0x0118
        L_0x0105:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IAdClickListener"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.byp
            if (r4 == 0) goto L_0x0113
            r4 = r2
            com.google.android.gms.internal.ads.byp r4 = (com.google.android.gms.internal.ads.byp) r4
            goto L_0x0118
        L_0x0113:
            com.google.android.gms.internal.ads.byr r4 = new com.google.android.gms.internal.ads.byr
            r4.<init>(r1)
        L_0x0118:
            r0.mo37588a(r4)
            r3.writeNoException()
            goto L_0x0213
        L_0x0120:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.cq r1 = com.google.android.gms.internal.ads.C15607cr.m50379a(r1)
            r0.mo37591a(r1)
            r3.writeNoException()
            goto L_0x0213
        L_0x0130:
            java.lang.String r1 = r0.mo37684a()
            r3.writeNoException()
            r3.writeString(r1)
            goto L_0x0213
        L_0x013c:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.sk r1 = com.google.android.gms.internal.ads.C16034sl.m52115a(r1)
            java.lang.String r2 = r2.readString()
            r0.mo37595a(r1, r2)
            r3.writeNoException()
            goto L_0x0213
        L_0x0150:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.se r1 = com.google.android.gms.internal.ads.C16028sf.m52113a(r1)
            r0.mo37594a(r1)
            r3.writeNoException()
            goto L_0x0213
        L_0x0160:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzyz> r1 = com.google.android.gms.internal.ads.zzyz.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.bga.m48614a(r2, r1)
            com.google.android.gms.internal.ads.zzyz r1 = (com.google.android.gms.internal.ads.zzyz) r1
            r0.mo37602a(r1)
            r3.writeNoException()
            goto L_0x0213
        L_0x0170:
            com.google.android.gms.internal.ads.zzyz r1 = r0.mo37619i()
            r3.writeNoException()
            com.google.android.gms.internal.ads.bga.m48620b(r3, r1)
            goto L_0x0213
        L_0x017c:
            r0.mo37621k()
            r3.writeNoException()
            goto L_0x0213
        L_0x0184:
            r0.mo37625o()
            r3.writeNoException()
            goto L_0x0213
        L_0x018c:
            r0.mo37640E()
            r3.writeNoException()
            goto L_0x0213
        L_0x0194:
            android.os.IBinder r1 = r2.readStrongBinder()
            if (r1 != 0) goto L_0x019b
            goto L_0x01ae
        L_0x019b:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IAppEventListener"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.C15914o
            if (r4 == 0) goto L_0x01a9
            r4 = r2
            com.google.android.gms.internal.ads.o r4 = (com.google.android.gms.internal.ads.C15914o) r4
            goto L_0x01ae
        L_0x01a9:
            com.google.android.gms.internal.ads.q r4 = new com.google.android.gms.internal.ads.q
            r4.<init>(r1)
        L_0x01ae:
            r0.mo37593a(r4)
            r3.writeNoException()
            goto L_0x0213
        L_0x01b5:
            android.os.IBinder r1 = r2.readStrongBinder()
            if (r1 != 0) goto L_0x01bc
            goto L_0x01cf
        L_0x01bc:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IAdListener"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.bys
            if (r4 == 0) goto L_0x01ca
            r4 = r2
            com.google.android.gms.internal.ads.bys r4 = (com.google.android.gms.internal.ads.bys) r4
            goto L_0x01cf
        L_0x01ca:
            com.google.android.gms.internal.ads.byu r4 = new com.google.android.gms.internal.ads.byu
            r4.<init>(r1)
        L_0x01cf:
            r0.mo37589a(r4)
            r3.writeNoException()
            goto L_0x0213
        L_0x01d6:
            r0.mo37623m()
            r3.writeNoException()
            goto L_0x0213
        L_0x01dd:
            r0.mo37622l()
            r3.writeNoException()
            goto L_0x0213
        L_0x01e4:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzyv> r1 = com.google.android.gms.internal.ads.zzyv.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.bga.m48614a(r2, r1)
            com.google.android.gms.internal.ads.zzyv r1 = (com.google.android.gms.internal.ads.zzyv) r1
            boolean r1 = r0.mo37614b(r1)
            r3.writeNoException()
            com.google.android.gms.internal.ads.bga.m48617a(r3, r1)
            goto L_0x0213
        L_0x01f7:
            boolean r1 = r0.mo37620j()
            r3.writeNoException()
            com.google.android.gms.internal.ads.bga.m48617a(r3, r1)
            goto L_0x0213
        L_0x0202:
            r0.mo37617g()
            r3.writeNoException()
            goto L_0x0213
        L_0x0209:
            com.google.android.gms.dynamic.b r1 = r0.mo37618h()
            r3.writeNoException()
            com.google.android.gms.internal.ads.bga.m48615a(r3, r1)
        L_0x0213:
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C15725h.dispatchTransaction(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
