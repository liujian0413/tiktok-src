package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.measurement.cg */
public abstract class C16441cg extends C16507ep implements C16440cf {
    /* renamed from: a */
    public static C16440cf m53608a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        if (queryLocalInterface instanceof C16440cf) {
            return (C16440cf) queryLocalInterface;
        }
        return new C16442ch(iBinder);
    }

    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v6, types: [com.google.android.gms.internal.measurement.ck] */
    /* JADX WARNING: type inference failed for: r1v7, types: [com.google.android.gms.internal.measurement.ci] */
    /* JADX WARNING: type inference failed for: r1v8 */
    /* JADX WARNING: type inference failed for: r5v2 */
    /* JADX WARNING: type inference failed for: r4v4, types: [com.google.android.gms.internal.measurement.ci] */
    /* JADX WARNING: type inference failed for: r1v11, types: [com.google.android.gms.internal.measurement.ci] */
    /* JADX WARNING: type inference failed for: r1v14, types: [com.google.android.gms.internal.measurement.ck] */
    /* JADX WARNING: type inference failed for: r1v15, types: [com.google.android.gms.internal.measurement.ci] */
    /* JADX WARNING: type inference failed for: r1v16, types: [com.google.android.gms.internal.measurement.ci] */
    /* JADX WARNING: type inference failed for: r1v19, types: [com.google.android.gms.internal.measurement.ck] */
    /* JADX WARNING: type inference failed for: r1v20, types: [com.google.android.gms.internal.measurement.ci] */
    /* JADX WARNING: type inference failed for: r1v26, types: [com.google.android.gms.internal.measurement.ci] */
    /* JADX WARNING: type inference failed for: r1v29, types: [com.google.android.gms.internal.measurement.ck] */
    /* JADX WARNING: type inference failed for: r1v30, types: [com.google.android.gms.internal.measurement.ci] */
    /* JADX WARNING: type inference failed for: r1v34, types: [com.google.android.gms.internal.measurement.ci] */
    /* JADX WARNING: type inference failed for: r1v37, types: [com.google.android.gms.internal.measurement.ck] */
    /* JADX WARNING: type inference failed for: r1v38, types: [com.google.android.gms.internal.measurement.ci] */
    /* JADX WARNING: type inference failed for: r1v39, types: [com.google.android.gms.internal.measurement.ci] */
    /* JADX WARNING: type inference failed for: r1v42, types: [com.google.android.gms.internal.measurement.ck] */
    /* JADX WARNING: type inference failed for: r1v43, types: [com.google.android.gms.internal.measurement.ci] */
    /* JADX WARNING: type inference failed for: r1v44, types: [com.google.android.gms.internal.measurement.cn] */
    /* JADX WARNING: type inference failed for: r1v47, types: [com.google.android.gms.internal.measurement.co] */
    /* JADX WARNING: type inference failed for: r1v48, types: [com.google.android.gms.internal.measurement.cn] */
    /* JADX WARNING: type inference failed for: r1v49, types: [com.google.android.gms.internal.measurement.ci] */
    /* JADX WARNING: type inference failed for: r1v52, types: [com.google.android.gms.internal.measurement.ck] */
    /* JADX WARNING: type inference failed for: r1v53, types: [com.google.android.gms.internal.measurement.ci] */
    /* JADX WARNING: type inference failed for: r1v54, types: [com.google.android.gms.internal.measurement.ci] */
    /* JADX WARNING: type inference failed for: r1v57, types: [com.google.android.gms.internal.measurement.ck] */
    /* JADX WARNING: type inference failed for: r1v58, types: [com.google.android.gms.internal.measurement.ci] */
    /* JADX WARNING: type inference failed for: r1v59, types: [com.google.android.gms.internal.measurement.ci] */
    /* JADX WARNING: type inference failed for: r1v62, types: [com.google.android.gms.internal.measurement.ck] */
    /* JADX WARNING: type inference failed for: r1v63, types: [com.google.android.gms.internal.measurement.ci] */
    /* JADX WARNING: type inference failed for: r1v64, types: [com.google.android.gms.internal.measurement.ci] */
    /* JADX WARNING: type inference failed for: r1v67, types: [com.google.android.gms.internal.measurement.ck] */
    /* JADX WARNING: type inference failed for: r1v68, types: [com.google.android.gms.internal.measurement.ci] */
    /* JADX WARNING: type inference failed for: r1v83, types: [com.google.android.gms.internal.measurement.ci] */
    /* JADX WARNING: type inference failed for: r1v86, types: [com.google.android.gms.internal.measurement.ck] */
    /* JADX WARNING: type inference failed for: r1v87, types: [com.google.android.gms.internal.measurement.ci] */
    /* JADX WARNING: type inference failed for: r1v88, types: [com.google.android.gms.internal.measurement.ci] */
    /* JADX WARNING: type inference failed for: r1v91, types: [com.google.android.gms.internal.measurement.ck] */
    /* JADX WARNING: type inference failed for: r1v92, types: [com.google.android.gms.internal.measurement.ci] */
    /* JADX WARNING: type inference failed for: r1v94, types: [com.google.android.gms.internal.measurement.cl] */
    /* JADX WARNING: type inference failed for: r1v97, types: [com.google.android.gms.internal.measurement.cm] */
    /* JADX WARNING: type inference failed for: r1v98, types: [com.google.android.gms.internal.measurement.cl] */
    /* JADX WARNING: type inference failed for: r1v99, types: [com.google.android.gms.internal.measurement.cl] */
    /* JADX WARNING: type inference failed for: r1v102, types: [com.google.android.gms.internal.measurement.cm] */
    /* JADX WARNING: type inference failed for: r1v103, types: [com.google.android.gms.internal.measurement.cl] */
    /* JADX WARNING: type inference failed for: r1v104, types: [com.google.android.gms.internal.measurement.cl] */
    /* JADX WARNING: type inference failed for: r1v107, types: [com.google.android.gms.internal.measurement.cm] */
    /* JADX WARNING: type inference failed for: r1v108, types: [com.google.android.gms.internal.measurement.cl] */
    /* JADX WARNING: type inference failed for: r1v109, types: [com.google.android.gms.internal.measurement.ci] */
    /* JADX WARNING: type inference failed for: r1v112, types: [com.google.android.gms.internal.measurement.ck] */
    /* JADX WARNING: type inference failed for: r1v113, types: [com.google.android.gms.internal.measurement.ci] */
    /* JADX WARNING: type inference failed for: r1v114 */
    /* JADX WARNING: type inference failed for: r1v115 */
    /* JADX WARNING: type inference failed for: r1v116 */
    /* JADX WARNING: type inference failed for: r1v117 */
    /* JADX WARNING: type inference failed for: r1v118 */
    /* JADX WARNING: type inference failed for: r1v119 */
    /* JADX WARNING: type inference failed for: r1v120 */
    /* JADX WARNING: type inference failed for: r1v121 */
    /* JADX WARNING: type inference failed for: r1v122 */
    /* JADX WARNING: type inference failed for: r1v123 */
    /* JADX WARNING: type inference failed for: r1v124 */
    /* JADX WARNING: type inference failed for: r1v125 */
    /* JADX WARNING: type inference failed for: r1v126 */
    /* JADX WARNING: type inference failed for: r1v127 */
    /* JADX WARNING: type inference failed for: r1v128 */
    /* JADX WARNING: type inference failed for: r1v129 */
    /* JADX WARNING: type inference failed for: r1v130 */
    /* JADX WARNING: type inference failed for: r1v131 */
    /* JADX WARNING: type inference failed for: r1v132 */
    /* JADX WARNING: type inference failed for: r1v133 */
    /* JADX WARNING: type inference failed for: r1v134 */
    /* JADX WARNING: type inference failed for: r1v135 */
    /* JADX WARNING: type inference failed for: r1v136 */
    /* JADX WARNING: type inference failed for: r1v137 */
    /* JADX WARNING: type inference failed for: r1v138 */
    /* JADX WARNING: type inference failed for: r1v139 */
    /* JADX WARNING: type inference failed for: r1v140 */
    /* JADX WARNING: type inference failed for: r1v141 */
    /* JADX WARNING: type inference failed for: r1v142 */
    /* JADX WARNING: type inference failed for: r1v143 */
    /* JADX WARNING: type inference failed for: r1v144 */
    /* JADX WARNING: type inference failed for: r1v145 */
    /* JADX WARNING: type inference failed for: r1v146 */
    /* JADX WARNING: type inference failed for: r1v147 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r1v0
      assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], com.google.android.gms.internal.measurement.ck, com.google.android.gms.internal.measurement.ci, com.google.android.gms.internal.measurement.co, com.google.android.gms.internal.measurement.cn, com.google.android.gms.internal.measurement.cm, com.google.android.gms.internal.measurement.cl]
      uses: [?[OBJECT, ARRAY], com.google.android.gms.internal.measurement.ci, com.google.android.gms.internal.measurement.cn, com.google.android.gms.internal.measurement.cl]
      mth insns count: 319
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
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 37 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo42615a(int r9, android.os.Parcel r10, android.os.Parcel r11, int r12) throws android.os.RemoteException {
        /*
            r8 = this;
            r1 = 0
            switch(r9) {
                case 1: goto L_0x03be;
                case 2: goto L_0x039d;
                case 3: goto L_0x0364;
                case 4: goto L_0x0346;
                case 5: goto L_0x031c;
                case 6: goto L_0x02fa;
                case 7: goto L_0x02ed;
                case 8: goto L_0x02dc;
                case 9: goto L_0x02c7;
                case 10: goto L_0x02a1;
                case 11: goto L_0x0294;
                case 12: goto L_0x028b;
                case 13: goto L_0x0282;
                case 14: goto L_0x0279;
                case 15: goto L_0x025f;
                case 16: goto L_0x0241;
                case 17: goto L_0x0223;
                case 18: goto L_0x0205;
                case 19: goto L_0x01e7;
                case 20: goto L_0x01c9;
                case 21: goto L_0x01ab;
                case 22: goto L_0x018d;
                case 23: goto L_0x0180;
                case 24: goto L_0x0173;
                case 25: goto L_0x0162;
                case 26: goto L_0x0151;
                case 27: goto L_0x0138;
                case 28: goto L_0x0127;
                case 29: goto L_0x0116;
                case 30: goto L_0x0105;
                case 31: goto L_0x00db;
                case 32: goto L_0x00b1;
                case 33: goto L_0x008b;
                case 34: goto L_0x006d;
                case 35: goto L_0x004f;
                case 36: goto L_0x0031;
                case 37: goto L_0x0028;
                case 38: goto L_0x0006;
                default: goto L_0x0004;
            }
        L_0x0004:
            r0 = 0
            return r0
        L_0x0006:
            android.os.IBinder r2 = r10.readStrongBinder()
            if (r2 != 0) goto L_0x000d
            goto L_0x001f
        L_0x000d:
            java.lang.String r1 = "com.google.android.gms.measurement.api.internal.IBundleReceiver"
            android.os.IInterface r1 = r2.queryLocalInterface(r1)
            boolean r3 = r1 instanceof com.google.android.gms.internal.measurement.C16443ci
            if (r3 == 0) goto L_0x001a
            com.google.android.gms.internal.measurement.ci r1 = (com.google.android.gms.internal.measurement.C16443ci) r1
            goto L_0x001f
        L_0x001a:
            com.google.android.gms.internal.measurement.ck r1 = new com.google.android.gms.internal.measurement.ck
            r1.<init>(r2)
        L_0x001f:
            int r0 = r10.readInt()
            r8.mo42587a(r1, r0)
            goto L_0x03d5
        L_0x0028:
            java.util.HashMap r0 = com.google.android.gms.internal.measurement.C16517ez.m53837b(r10)
            r8.mo42598a(r0)
            goto L_0x03d5
        L_0x0031:
            android.os.IBinder r0 = r10.readStrongBinder()
            if (r0 != 0) goto L_0x0038
            goto L_0x004a
        L_0x0038:
            java.lang.String r1 = "com.google.android.gms.measurement.api.internal.IEventHandlerProxy"
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r2 = r1 instanceof com.google.android.gms.internal.measurement.C16446cl
            if (r2 == 0) goto L_0x0045
            com.google.android.gms.internal.measurement.cl r1 = (com.google.android.gms.internal.measurement.C16446cl) r1
            goto L_0x004a
        L_0x0045:
            com.google.android.gms.internal.measurement.cm r1 = new com.google.android.gms.internal.measurement.cm
            r1.<init>(r0)
        L_0x004a:
            r8.mo42608c(r1)
            goto L_0x03d5
        L_0x004f:
            android.os.IBinder r0 = r10.readStrongBinder()
            if (r0 != 0) goto L_0x0056
            goto L_0x0068
        L_0x0056:
            java.lang.String r1 = "com.google.android.gms.measurement.api.internal.IEventHandlerProxy"
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r2 = r1 instanceof com.google.android.gms.internal.measurement.C16446cl
            if (r2 == 0) goto L_0x0063
            com.google.android.gms.internal.measurement.cl r1 = (com.google.android.gms.internal.measurement.C16446cl) r1
            goto L_0x0068
        L_0x0063:
            com.google.android.gms.internal.measurement.cm r1 = new com.google.android.gms.internal.measurement.cm
            r1.<init>(r0)
        L_0x0068:
            r8.mo42603b(r1)
            goto L_0x03d5
        L_0x006d:
            android.os.IBinder r0 = r10.readStrongBinder()
            if (r0 != 0) goto L_0x0074
            goto L_0x0086
        L_0x0074:
            java.lang.String r1 = "com.google.android.gms.measurement.api.internal.IEventHandlerProxy"
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r2 = r1 instanceof com.google.android.gms.internal.measurement.C16446cl
            if (r2 == 0) goto L_0x0081
            com.google.android.gms.internal.measurement.cl r1 = (com.google.android.gms.internal.measurement.C16446cl) r1
            goto L_0x0086
        L_0x0081:
            com.google.android.gms.internal.measurement.cm r1 = new com.google.android.gms.internal.measurement.cm
            r1.<init>(r0)
        L_0x0086:
            r8.mo42588a(r1)
            goto L_0x03d5
        L_0x008b:
            int r1 = r10.readInt()
            java.lang.String r2 = r10.readString()
            android.os.IBinder r3 = r10.readStrongBinder()
            com.google.android.gms.dynamic.b r3 = com.google.android.gms.dynamic.C15345b.C15346a.m44656a(r3)
            android.os.IBinder r4 = r10.readStrongBinder()
            com.google.android.gms.dynamic.b r4 = com.google.android.gms.dynamic.C15345b.C15346a.m44656a(r4)
            android.os.IBinder r0 = r10.readStrongBinder()
            com.google.android.gms.dynamic.b r5 = com.google.android.gms.dynamic.C15345b.C15346a.m44656a(r0)
            r0 = r8
            r0.mo42577a(r1, r2, r3, r4, r5)
            goto L_0x03d5
        L_0x00b1:
            android.os.Parcelable$Creator r2 = android.os.Bundle.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.internal.measurement.C16517ez.m53832a(r10, r2)
            android.os.Bundle r2 = (android.os.Bundle) r2
            android.os.IBinder r3 = r10.readStrongBinder()
            if (r3 != 0) goto L_0x00c0
            goto L_0x00d2
        L_0x00c0:
            java.lang.String r1 = "com.google.android.gms.measurement.api.internal.IBundleReceiver"
            android.os.IInterface r1 = r3.queryLocalInterface(r1)
            boolean r4 = r1 instanceof com.google.android.gms.internal.measurement.C16443ci
            if (r4 == 0) goto L_0x00cd
            com.google.android.gms.internal.measurement.ci r1 = (com.google.android.gms.internal.measurement.C16443ci) r1
            goto L_0x00d2
        L_0x00cd:
            com.google.android.gms.internal.measurement.ck r1 = new com.google.android.gms.internal.measurement.ck
            r1.<init>(r3)
        L_0x00d2:
            long r3 = r10.readLong()
            r8.mo42580a(r2, r1, r3)
            goto L_0x03d5
        L_0x00db:
            android.os.IBinder r2 = r10.readStrongBinder()
            com.google.android.gms.dynamic.b r2 = com.google.android.gms.dynamic.C15345b.C15346a.m44656a(r2)
            android.os.IBinder r3 = r10.readStrongBinder()
            if (r3 != 0) goto L_0x00ea
            goto L_0x00fc
        L_0x00ea:
            java.lang.String r1 = "com.google.android.gms.measurement.api.internal.IBundleReceiver"
            android.os.IInterface r1 = r3.queryLocalInterface(r1)
            boolean r4 = r1 instanceof com.google.android.gms.internal.measurement.C16443ci
            if (r4 == 0) goto L_0x00f7
            com.google.android.gms.internal.measurement.ci r1 = (com.google.android.gms.internal.measurement.C16443ci) r1
            goto L_0x00fc
        L_0x00f7:
            com.google.android.gms.internal.measurement.ck r1 = new com.google.android.gms.internal.measurement.ck
            r1.<init>(r3)
        L_0x00fc:
            long r3 = r10.readLong()
            r8.mo42583a(r2, r1, r3)
            goto L_0x03d5
        L_0x0105:
            android.os.IBinder r1 = r10.readStrongBinder()
            com.google.android.gms.dynamic.b r1 = com.google.android.gms.dynamic.C15345b.C15346a.m44656a(r1)
            long r2 = r10.readLong()
            r8.mo42612e(r1, r2)
            goto L_0x03d5
        L_0x0116:
            android.os.IBinder r1 = r10.readStrongBinder()
            com.google.android.gms.dynamic.b r1 = com.google.android.gms.dynamic.C15345b.C15346a.m44656a(r1)
            long r2 = r10.readLong()
            r8.mo42610d(r1, r2)
            goto L_0x03d5
        L_0x0127:
            android.os.IBinder r1 = r10.readStrongBinder()
            com.google.android.gms.dynamic.b r1 = com.google.android.gms.dynamic.C15345b.C15346a.m44656a(r1)
            long r2 = r10.readLong()
            r8.mo42606c(r1, r2)
            goto L_0x03d5
        L_0x0138:
            android.os.IBinder r1 = r10.readStrongBinder()
            com.google.android.gms.dynamic.b r1 = com.google.android.gms.dynamic.C15345b.C15346a.m44656a(r1)
            android.os.Parcelable$Creator r2 = android.os.Bundle.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.internal.measurement.C16517ez.m53832a(r10, r2)
            android.os.Bundle r2 = (android.os.Bundle) r2
            long r3 = r10.readLong()
            r8.mo42582a(r1, r2, r3)
            goto L_0x03d5
        L_0x0151:
            android.os.IBinder r1 = r10.readStrongBinder()
            com.google.android.gms.dynamic.b r1 = com.google.android.gms.dynamic.C15345b.C15346a.m44656a(r1)
            long r2 = r10.readLong()
            r8.mo42601b(r1, r2)
            goto L_0x03d5
        L_0x0162:
            android.os.IBinder r1 = r10.readStrongBinder()
            com.google.android.gms.dynamic.b r1 = com.google.android.gms.dynamic.C15345b.C15346a.m44656a(r1)
            long r2 = r10.readLong()
            r8.mo42581a(r1, r2)
            goto L_0x03d5
        L_0x0173:
            java.lang.String r1 = r10.readString()
            long r2 = r10.readLong()
            r8.mo42609c(r1, r2)
            goto L_0x03d5
        L_0x0180:
            java.lang.String r1 = r10.readString()
            long r2 = r10.readLong()
            r8.mo42604b(r1, r2)
            goto L_0x03d5
        L_0x018d:
            android.os.IBinder r0 = r10.readStrongBinder()
            if (r0 != 0) goto L_0x0194
            goto L_0x01a6
        L_0x0194:
            java.lang.String r1 = "com.google.android.gms.measurement.api.internal.IBundleReceiver"
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r2 = r1 instanceof com.google.android.gms.internal.measurement.C16443ci
            if (r2 == 0) goto L_0x01a1
            com.google.android.gms.internal.measurement.ci r1 = (com.google.android.gms.internal.measurement.C16443ci) r1
            goto L_0x01a6
        L_0x01a1:
            com.google.android.gms.internal.measurement.ck r1 = new com.google.android.gms.internal.measurement.ck
            r1.<init>(r0)
        L_0x01a6:
            r8.mo42614f(r1)
            goto L_0x03d5
        L_0x01ab:
            android.os.IBinder r0 = r10.readStrongBinder()
            if (r0 != 0) goto L_0x01b2
            goto L_0x01c4
        L_0x01b2:
            java.lang.String r1 = "com.google.android.gms.measurement.api.internal.IBundleReceiver"
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r2 = r1 instanceof com.google.android.gms.internal.measurement.C16443ci
            if (r2 == 0) goto L_0x01bf
            com.google.android.gms.internal.measurement.ci r1 = (com.google.android.gms.internal.measurement.C16443ci) r1
            goto L_0x01c4
        L_0x01bf:
            com.google.android.gms.internal.measurement.ck r1 = new com.google.android.gms.internal.measurement.ck
            r1.<init>(r0)
        L_0x01c4:
            r8.mo42613e(r1)
            goto L_0x03d5
        L_0x01c9:
            android.os.IBinder r0 = r10.readStrongBinder()
            if (r0 != 0) goto L_0x01d0
            goto L_0x01e2
        L_0x01d0:
            java.lang.String r1 = "com.google.android.gms.measurement.api.internal.IBundleReceiver"
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r2 = r1 instanceof com.google.android.gms.internal.measurement.C16443ci
            if (r2 == 0) goto L_0x01dd
            com.google.android.gms.internal.measurement.ci r1 = (com.google.android.gms.internal.measurement.C16443ci) r1
            goto L_0x01e2
        L_0x01dd:
            com.google.android.gms.internal.measurement.ck r1 = new com.google.android.gms.internal.measurement.ck
            r1.<init>(r0)
        L_0x01e2:
            r8.mo42611d(r1)
            goto L_0x03d5
        L_0x01e7:
            android.os.IBinder r0 = r10.readStrongBinder()
            if (r0 != 0) goto L_0x01ee
            goto L_0x0200
        L_0x01ee:
            java.lang.String r1 = "com.google.android.gms.measurement.api.internal.IBundleReceiver"
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r2 = r1 instanceof com.google.android.gms.internal.measurement.C16443ci
            if (r2 == 0) goto L_0x01fb
            com.google.android.gms.internal.measurement.ci r1 = (com.google.android.gms.internal.measurement.C16443ci) r1
            goto L_0x0200
        L_0x01fb:
            com.google.android.gms.internal.measurement.ck r1 = new com.google.android.gms.internal.measurement.ck
            r1.<init>(r0)
        L_0x0200:
            r8.mo42607c(r1)
            goto L_0x03d5
        L_0x0205:
            android.os.IBinder r0 = r10.readStrongBinder()
            if (r0 != 0) goto L_0x020c
            goto L_0x021e
        L_0x020c:
            java.lang.String r1 = "com.google.android.gms.measurement.api.internal.IStringProvider"
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r2 = r1 instanceof com.google.android.gms.internal.measurement.C16448cn
            if (r2 == 0) goto L_0x0219
            com.google.android.gms.internal.measurement.cn r1 = (com.google.android.gms.internal.measurement.C16448cn) r1
            goto L_0x021e
        L_0x0219:
            com.google.android.gms.internal.measurement.co r1 = new com.google.android.gms.internal.measurement.co
            r1.<init>(r0)
        L_0x021e:
            r8.mo42589a(r1)
            goto L_0x03d5
        L_0x0223:
            android.os.IBinder r0 = r10.readStrongBinder()
            if (r0 != 0) goto L_0x022a
            goto L_0x023c
        L_0x022a:
            java.lang.String r1 = "com.google.android.gms.measurement.api.internal.IBundleReceiver"
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r2 = r1 instanceof com.google.android.gms.internal.measurement.C16443ci
            if (r2 == 0) goto L_0x0237
            com.google.android.gms.internal.measurement.ci r1 = (com.google.android.gms.internal.measurement.C16443ci) r1
            goto L_0x023c
        L_0x0237:
            com.google.android.gms.internal.measurement.ck r1 = new com.google.android.gms.internal.measurement.ck
            r1.<init>(r0)
        L_0x023c:
            r8.mo42602b(r1)
            goto L_0x03d5
        L_0x0241:
            android.os.IBinder r0 = r10.readStrongBinder()
            if (r0 != 0) goto L_0x0248
            goto L_0x025a
        L_0x0248:
            java.lang.String r1 = "com.google.android.gms.measurement.api.internal.IBundleReceiver"
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r2 = r1 instanceof com.google.android.gms.internal.measurement.C16443ci
            if (r2 == 0) goto L_0x0255
            com.google.android.gms.internal.measurement.ci r1 = (com.google.android.gms.internal.measurement.C16443ci) r1
            goto L_0x025a
        L_0x0255:
            com.google.android.gms.internal.measurement.ck r1 = new com.google.android.gms.internal.measurement.ck
            r1.<init>(r0)
        L_0x025a:
            r8.mo42586a(r1)
            goto L_0x03d5
        L_0x025f:
            android.os.IBinder r1 = r10.readStrongBinder()
            com.google.android.gms.dynamic.b r1 = com.google.android.gms.dynamic.C15345b.C15346a.m44656a(r1)
            java.lang.String r2 = r10.readString()
            java.lang.String r3 = r10.readString()
            long r4 = r10.readLong()
            r0 = r8
            r0.mo42585a(r1, r2, r3, r4)
            goto L_0x03d5
        L_0x0279:
            long r0 = r10.readLong()
            r8.mo42605c(r0)
            goto L_0x03d5
        L_0x0282:
            long r0 = r10.readLong()
            r8.mo42600b(r0)
            goto L_0x03d5
        L_0x028b:
            long r0 = r10.readLong()
            r8.mo42578a(r0)
            goto L_0x03d5
        L_0x0294:
            boolean r1 = com.google.android.gms.internal.measurement.C16517ez.m53836a(r10)
            long r2 = r10.readLong()
            r8.mo42599a(r1, r2)
            goto L_0x03d5
        L_0x02a1:
            java.lang.String r2 = r10.readString()
            java.lang.String r3 = r10.readString()
            android.os.IBinder r0 = r10.readStrongBinder()
            if (r0 != 0) goto L_0x02b0
            goto L_0x02c2
        L_0x02b0:
            java.lang.String r1 = "com.google.android.gms.measurement.api.internal.IBundleReceiver"
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r4 = r1 instanceof com.google.android.gms.internal.measurement.C16443ci
            if (r4 == 0) goto L_0x02bd
            com.google.android.gms.internal.measurement.ci r1 = (com.google.android.gms.internal.measurement.C16443ci) r1
            goto L_0x02c2
        L_0x02bd:
            com.google.android.gms.internal.measurement.ck r1 = new com.google.android.gms.internal.measurement.ck
            r1.<init>(r0)
        L_0x02c2:
            r8.mo42596a(r2, r3, r1)
            goto L_0x03d5
        L_0x02c7:
            java.lang.String r1 = r10.readString()
            java.lang.String r2 = r10.readString()
            android.os.Parcelable$Creator r3 = android.os.Bundle.CREATOR
            android.os.Parcelable r0 = com.google.android.gms.internal.measurement.C16517ez.m53832a(r10, r3)
            android.os.Bundle r0 = (android.os.Bundle) r0
            r8.mo42592a(r1, r2, r0)
            goto L_0x03d5
        L_0x02dc:
            android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.measurement.C16517ez.m53832a(r10, r1)
            android.os.Bundle r1 = (android.os.Bundle) r1
            long r2 = r10.readLong()
            r8.mo42579a(r1, r2)
            goto L_0x03d5
        L_0x02ed:
            java.lang.String r1 = r10.readString()
            long r2 = r10.readLong()
            r8.mo42590a(r1, r2)
            goto L_0x03d5
        L_0x02fa:
            java.lang.String r2 = r10.readString()
            android.os.IBinder r0 = r10.readStrongBinder()
            if (r0 != 0) goto L_0x0305
            goto L_0x0317
        L_0x0305:
            java.lang.String r1 = "com.google.android.gms.measurement.api.internal.IBundleReceiver"
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r3 = r1 instanceof com.google.android.gms.internal.measurement.C16443ci
            if (r3 == 0) goto L_0x0312
            com.google.android.gms.internal.measurement.ci r1 = (com.google.android.gms.internal.measurement.C16443ci) r1
            goto L_0x0317
        L_0x0312:
            com.google.android.gms.internal.measurement.ck r1 = new com.google.android.gms.internal.measurement.ck
            r1.<init>(r0)
        L_0x0317:
            r8.mo42591a(r2, r1)
            goto L_0x03d5
        L_0x031c:
            java.lang.String r2 = r10.readString()
            java.lang.String r3 = r10.readString()
            boolean r4 = com.google.android.gms.internal.measurement.C16517ez.m53836a(r10)
            android.os.IBinder r0 = r10.readStrongBinder()
            if (r0 != 0) goto L_0x032f
            goto L_0x0341
        L_0x032f:
            java.lang.String r1 = "com.google.android.gms.measurement.api.internal.IBundleReceiver"
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r5 = r1 instanceof com.google.android.gms.internal.measurement.C16443ci
            if (r5 == 0) goto L_0x033c
            com.google.android.gms.internal.measurement.ci r1 = (com.google.android.gms.internal.measurement.C16443ci) r1
            goto L_0x0341
        L_0x033c:
            com.google.android.gms.internal.measurement.ck r1 = new com.google.android.gms.internal.measurement.ck
            r1.<init>(r0)
        L_0x0341:
            r8.mo42597a(r2, r3, r4, r1)
            goto L_0x03d5
        L_0x0346:
            java.lang.String r1 = r10.readString()
            java.lang.String r2 = r10.readString()
            android.os.IBinder r3 = r10.readStrongBinder()
            com.google.android.gms.dynamic.b r3 = com.google.android.gms.dynamic.C15345b.C15346a.m44656a(r3)
            boolean r4 = com.google.android.gms.internal.measurement.C16517ez.m53836a(r10)
            long r5 = r10.readLong()
            r0 = r8
            r0.mo42595a(r1, r2, r3, r4, r5)
            goto L_0x03d5
        L_0x0364:
            java.lang.String r2 = r10.readString()
            java.lang.String r3 = r10.readString()
            android.os.Parcelable$Creator r4 = android.os.Bundle.CREATOR
            android.os.Parcelable r4 = com.google.android.gms.internal.measurement.C16517ez.m53832a(r10, r4)
            android.os.Bundle r4 = (android.os.Bundle) r4
            android.os.IBinder r5 = r10.readStrongBinder()
            if (r5 != 0) goto L_0x037c
        L_0x037a:
            r5 = r1
            goto L_0x038f
        L_0x037c:
            java.lang.String r1 = "com.google.android.gms.measurement.api.internal.IBundleReceiver"
            android.os.IInterface r1 = r5.queryLocalInterface(r1)
            boolean r6 = r1 instanceof com.google.android.gms.internal.measurement.C16443ci
            if (r6 == 0) goto L_0x0389
            com.google.android.gms.internal.measurement.ci r1 = (com.google.android.gms.internal.measurement.C16443ci) r1
            goto L_0x037a
        L_0x0389:
            com.google.android.gms.internal.measurement.ck r1 = new com.google.android.gms.internal.measurement.ck
            r1.<init>(r5)
            goto L_0x037a
        L_0x038f:
            long r6 = r10.readLong()
            r0 = r8
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r0.mo42593a(r1, r2, r3, r4, r5)
            goto L_0x03d5
        L_0x039d:
            java.lang.String r1 = r10.readString()
            java.lang.String r2 = r10.readString()
            android.os.Parcelable$Creator r3 = android.os.Bundle.CREATOR
            android.os.Parcelable r3 = com.google.android.gms.internal.measurement.C16517ez.m53832a(r10, r3)
            android.os.Bundle r3 = (android.os.Bundle) r3
            boolean r4 = com.google.android.gms.internal.measurement.C16517ez.m53836a(r10)
            boolean r5 = com.google.android.gms.internal.measurement.C16517ez.m53836a(r10)
            long r6 = r10.readLong()
            r0 = r8
            r0.mo42594a(r1, r2, r3, r4, r5, r6)
            goto L_0x03d5
        L_0x03be:
            android.os.IBinder r1 = r10.readStrongBinder()
            com.google.android.gms.dynamic.b r1 = com.google.android.gms.dynamic.C15345b.C15346a.m44656a(r1)
            android.os.Parcelable$Creator<com.google.android.gms.internal.measurement.zzdy> r2 = com.google.android.gms.internal.measurement.zzdy.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.internal.measurement.C16517ez.m53832a(r10, r2)
            com.google.android.gms.internal.measurement.zzdy r2 = (com.google.android.gms.internal.measurement.zzdy) r2
            long r3 = r10.readLong()
            r8.mo42584a(r1, r2, r3)
        L_0x03d5:
            r11.writeNoException()
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C16441cg.mo42615a(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
