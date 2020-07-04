package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.qp */
public abstract class C15984qp extends bfz implements C15983qo {
    public C15984qp() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    /* renamed from: a */
    public static C15983qo m51983a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
        if (queryLocalInterface instanceof C15983qo) {
            return (C15983qo) queryLocalInterface;
        }
        return new C15985qq(iBinder);
    }

    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v3, types: [com.google.android.gms.internal.ads.qs] */
    /* JADX WARNING: type inference failed for: r1v4, types: [com.google.android.gms.internal.ads.qr] */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: type inference failed for: r7v1 */
    /* JADX WARNING: type inference failed for: r6v3, types: [com.google.android.gms.internal.ads.qr] */
    /* JADX WARNING: type inference failed for: r1v10, types: [com.google.android.gms.internal.ads.qf] */
    /* JADX WARNING: type inference failed for: r1v11, types: [com.google.android.gms.internal.ads.qe] */
    /* JADX WARNING: type inference failed for: r1v12 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: type inference failed for: r5v6, types: [com.google.android.gms.internal.ads.qe] */
    /* JADX WARNING: type inference failed for: r1v18, types: [com.google.android.gms.internal.ads.qh] */
    /* JADX WARNING: type inference failed for: r1v19, types: [com.google.android.gms.internal.ads.qg] */
    /* JADX WARNING: type inference failed for: r1v20 */
    /* JADX WARNING: type inference failed for: r6v8 */
    /* JADX WARNING: type inference failed for: r5v9, types: [com.google.android.gms.internal.ads.qg] */
    /* JADX WARNING: type inference failed for: r1v24, types: [com.google.android.gms.internal.ads.qn] */
    /* JADX WARNING: type inference failed for: r1v25, types: [com.google.android.gms.internal.ads.qm] */
    /* JADX WARNING: type inference failed for: r1v26 */
    /* JADX WARNING: type inference failed for: r6v11 */
    /* JADX WARNING: type inference failed for: r5v12, types: [com.google.android.gms.internal.ads.qm] */
    /* JADX WARNING: type inference failed for: r1v30, types: [com.google.android.gms.internal.ads.qj] */
    /* JADX WARNING: type inference failed for: r1v31, types: [com.google.android.gms.internal.ads.qi] */
    /* JADX WARNING: type inference failed for: r1v32 */
    /* JADX WARNING: type inference failed for: r6v14 */
    /* JADX WARNING: type inference failed for: r5v15, types: [com.google.android.gms.internal.ads.qi] */
    /* JADX WARNING: type inference failed for: r1v34 */
    /* JADX WARNING: type inference failed for: r1v35 */
    /* JADX WARNING: type inference failed for: r1v36 */
    /* JADX WARNING: type inference failed for: r1v37 */
    /* JADX WARNING: type inference failed for: r1v38 */
    /* JADX WARNING: type inference failed for: r1v39 */
    /* JADX WARNING: type inference failed for: r1v40 */
    /* JADX WARNING: type inference failed for: r1v41 */
    /* JADX WARNING: type inference failed for: r1v42 */
    /* JADX WARNING: type inference failed for: r1v43 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 21 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean dispatchTransaction(int r10, android.os.Parcel r11, android.os.Parcel r12, int r13) throws android.os.RemoteException {
        /*
            r9 = this;
            r1 = 0
            switch(r10) {
                case 1: goto L_0x01a6;
                case 2: goto L_0x019b;
                case 3: goto L_0x0190;
                case 4: goto L_0x0004;
                case 5: goto L_0x0184;
                case 6: goto L_0x0004;
                case 7: goto L_0x0004;
                case 8: goto L_0x0004;
                case 9: goto L_0x0004;
                case 10: goto L_0x0174;
                case 11: goto L_0x0160;
                case 12: goto L_0x0004;
                case 13: goto L_0x010c;
                case 14: goto L_0x00c2;
                case 15: goto L_0x00ae;
                case 16: goto L_0x0064;
                case 17: goto L_0x0050;
                case 18: goto L_0x0006;
                default: goto L_0x0004;
            }
        L_0x0004:
            r0 = 0
            return r0
        L_0x0006:
            java.lang.String r2 = r11.readString()
            java.lang.String r3 = r11.readString()
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzyv> r4 = com.google.android.gms.internal.ads.zzyv.CREATOR
            android.os.Parcelable r4 = com.google.android.gms.internal.ads.bga.m48614a(r11, r4)
            com.google.android.gms.internal.ads.zzyv r4 = (com.google.android.gms.internal.ads.zzyv) r4
            android.os.IBinder r5 = r11.readStrongBinder()
            com.google.android.gms.dynamic.b r5 = com.google.android.gms.dynamic.C15345b.C15346a.m44656a(r5)
            android.os.IBinder r6 = r11.readStrongBinder()
            if (r6 != 0) goto L_0x0026
        L_0x0024:
            r6 = r1
            goto L_0x0039
        L_0x0026:
            java.lang.String r1 = "com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback"
            android.os.IInterface r1 = r6.queryLocalInterface(r1)
            boolean r7 = r1 instanceof com.google.android.gms.internal.ads.C15977qi
            if (r7 == 0) goto L_0x0033
            com.google.android.gms.internal.ads.qi r1 = (com.google.android.gms.internal.ads.C15977qi) r1
            goto L_0x0024
        L_0x0033:
            com.google.android.gms.internal.ads.qj r1 = new com.google.android.gms.internal.ads.qj
            r1.<init>(r6)
            goto L_0x0024
        L_0x0039:
            android.os.IBinder r0 = r11.readStrongBinder()
            com.google.android.gms.internal.ads.ox r7 = com.google.android.gms.internal.ads.C15939oy.m51599a(r0)
            r0 = r9
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r0.mo41917a(r1, r2, r3, r4, r5, r6)
            r12.writeNoException()
            goto L_0x01f2
        L_0x0050:
            android.os.IBinder r0 = r11.readStrongBinder()
            com.google.android.gms.dynamic.b r0 = com.google.android.gms.dynamic.C15345b.C15346a.m44656a(r0)
            boolean r0 = r9.mo41923c(r0)
            r12.writeNoException()
            com.google.android.gms.internal.ads.bga.m48617a(r12, r0)
            goto L_0x01f2
        L_0x0064:
            java.lang.String r2 = r11.readString()
            java.lang.String r3 = r11.readString()
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzyv> r4 = com.google.android.gms.internal.ads.zzyv.CREATOR
            android.os.Parcelable r4 = com.google.android.gms.internal.ads.bga.m48614a(r11, r4)
            com.google.android.gms.internal.ads.zzyv r4 = (com.google.android.gms.internal.ads.zzyv) r4
            android.os.IBinder r5 = r11.readStrongBinder()
            com.google.android.gms.dynamic.b r5 = com.google.android.gms.dynamic.C15345b.C15346a.m44656a(r5)
            android.os.IBinder r6 = r11.readStrongBinder()
            if (r6 != 0) goto L_0x0084
        L_0x0082:
            r6 = r1
            goto L_0x0097
        L_0x0084:
            java.lang.String r1 = "com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback"
            android.os.IInterface r1 = r6.queryLocalInterface(r1)
            boolean r7 = r1 instanceof com.google.android.gms.internal.ads.C15981qm
            if (r7 == 0) goto L_0x0091
            com.google.android.gms.internal.ads.qm r1 = (com.google.android.gms.internal.ads.C15981qm) r1
            goto L_0x0082
        L_0x0091:
            com.google.android.gms.internal.ads.qn r1 = new com.google.android.gms.internal.ads.qn
            r1.<init>(r6)
            goto L_0x0082
        L_0x0097:
            android.os.IBinder r0 = r11.readStrongBinder()
            com.google.android.gms.internal.ads.ox r7 = com.google.android.gms.internal.ads.C15939oy.m51599a(r0)
            r0 = r9
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r0.mo41918a(r1, r2, r3, r4, r5, r6)
            r12.writeNoException()
            goto L_0x01f2
        L_0x00ae:
            android.os.IBinder r0 = r11.readStrongBinder()
            com.google.android.gms.dynamic.b r0 = com.google.android.gms.dynamic.C15345b.C15346a.m44656a(r0)
            boolean r0 = r9.mo41921b(r0)
            r12.writeNoException()
            com.google.android.gms.internal.ads.bga.m48617a(r12, r0)
            goto L_0x01f2
        L_0x00c2:
            java.lang.String r2 = r11.readString()
            java.lang.String r3 = r11.readString()
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzyv> r4 = com.google.android.gms.internal.ads.zzyv.CREATOR
            android.os.Parcelable r4 = com.google.android.gms.internal.ads.bga.m48614a(r11, r4)
            com.google.android.gms.internal.ads.zzyv r4 = (com.google.android.gms.internal.ads.zzyv) r4
            android.os.IBinder r5 = r11.readStrongBinder()
            com.google.android.gms.dynamic.b r5 = com.google.android.gms.dynamic.C15345b.C15346a.m44656a(r5)
            android.os.IBinder r6 = r11.readStrongBinder()
            if (r6 != 0) goto L_0x00e2
        L_0x00e0:
            r6 = r1
            goto L_0x00f5
        L_0x00e2:
            java.lang.String r1 = "com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback"
            android.os.IInterface r1 = r6.queryLocalInterface(r1)
            boolean r7 = r1 instanceof com.google.android.gms.internal.ads.C15975qg
            if (r7 == 0) goto L_0x00ef
            com.google.android.gms.internal.ads.qg r1 = (com.google.android.gms.internal.ads.C15975qg) r1
            goto L_0x00e0
        L_0x00ef:
            com.google.android.gms.internal.ads.qh r1 = new com.google.android.gms.internal.ads.qh
            r1.<init>(r6)
            goto L_0x00e0
        L_0x00f5:
            android.os.IBinder r0 = r11.readStrongBinder()
            com.google.android.gms.internal.ads.ox r7 = com.google.android.gms.internal.ads.C15939oy.m51599a(r0)
            r0 = r9
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r0.mo41916a(r1, r2, r3, r4, r5, r6)
            r12.writeNoException()
            goto L_0x01f2
        L_0x010c:
            java.lang.String r2 = r11.readString()
            java.lang.String r3 = r11.readString()
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzyv> r4 = com.google.android.gms.internal.ads.zzyv.CREATOR
            android.os.Parcelable r4 = com.google.android.gms.internal.ads.bga.m48614a(r11, r4)
            com.google.android.gms.internal.ads.zzyv r4 = (com.google.android.gms.internal.ads.zzyv) r4
            android.os.IBinder r5 = r11.readStrongBinder()
            com.google.android.gms.dynamic.b r5 = com.google.android.gms.dynamic.C15345b.C15346a.m44656a(r5)
            android.os.IBinder r6 = r11.readStrongBinder()
            if (r6 != 0) goto L_0x012c
        L_0x012a:
            r6 = r1
            goto L_0x013f
        L_0x012c:
            java.lang.String r1 = "com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback"
            android.os.IInterface r1 = r6.queryLocalInterface(r1)
            boolean r7 = r1 instanceof com.google.android.gms.internal.ads.C15973qe
            if (r7 == 0) goto L_0x0139
            com.google.android.gms.internal.ads.qe r1 = (com.google.android.gms.internal.ads.C15973qe) r1
            goto L_0x012a
        L_0x0139:
            com.google.android.gms.internal.ads.qf r1 = new com.google.android.gms.internal.ads.qf
            r1.<init>(r6)
            goto L_0x012a
        L_0x013f:
            android.os.IBinder r1 = r11.readStrongBinder()
            com.google.android.gms.internal.ads.ox r7 = com.google.android.gms.internal.ads.C15939oy.m51599a(r1)
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzyz> r1 = com.google.android.gms.internal.ads.zzyz.CREATOR
            android.os.Parcelable r0 = com.google.android.gms.internal.ads.bga.m48614a(r11, r1)
            r8 = r0
            com.google.android.gms.internal.ads.zzyz r8 = (com.google.android.gms.internal.ads.zzyz) r8
            r0 = r9
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r0.mo41915a(r1, r2, r3, r4, r5, r6, r7)
            r12.writeNoException()
            goto L_0x01f2
        L_0x0160:
            java.lang.String[] r1 = r11.createStringArray()
            android.os.Parcelable$Creator r2 = android.os.Bundle.CREATOR
            java.lang.Object[] r0 = r11.createTypedArray(r2)
            android.os.Bundle[] r0 = (android.os.Bundle[]) r0
            r9.mo41919a(r1, r0)
            r12.writeNoException()
            goto L_0x01f2
        L_0x0174:
            android.os.IBinder r0 = r11.readStrongBinder()
            com.google.android.gms.dynamic.b r0 = com.google.android.gms.dynamic.C15345b.C15346a.m44656a(r0)
            r9.mo41913a(r0)
            r12.writeNoException()
            goto L_0x01f2
        L_0x0184:
            com.google.android.gms.internal.ads.ak r0 = r9.mo41922c()
            r12.writeNoException()
            com.google.android.gms.internal.ads.bga.m48615a(r12, r0)
            goto L_0x01f2
        L_0x0190:
            com.google.android.gms.internal.ads.zzaso r0 = r9.mo41920b()
            r12.writeNoException()
            com.google.android.gms.internal.ads.bga.m48620b(r12, r0)
            goto L_0x01f2
        L_0x019b:
            com.google.android.gms.internal.ads.zzaso r0 = r9.mo41912a()
            r12.writeNoException()
            com.google.android.gms.internal.ads.bga.m48620b(r12, r0)
            goto L_0x01f2
        L_0x01a6:
            android.os.IBinder r2 = r11.readStrongBinder()
            com.google.android.gms.dynamic.b r2 = com.google.android.gms.dynamic.C15345b.C15346a.m44656a(r2)
            java.lang.String r3 = r11.readString()
            android.os.Parcelable$Creator r4 = android.os.Bundle.CREATOR
            android.os.Parcelable r4 = com.google.android.gms.internal.ads.bga.m48614a(r11, r4)
            android.os.Bundle r4 = (android.os.Bundle) r4
            android.os.Parcelable$Creator r5 = android.os.Bundle.CREATOR
            android.os.Parcelable r5 = com.google.android.gms.internal.ads.bga.m48614a(r11, r5)
            android.os.Bundle r5 = (android.os.Bundle) r5
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzyz> r6 = com.google.android.gms.internal.ads.zzyz.CREATOR
            android.os.Parcelable r6 = com.google.android.gms.internal.ads.bga.m48614a(r11, r6)
            com.google.android.gms.internal.ads.zzyz r6 = (com.google.android.gms.internal.ads.zzyz) r6
            android.os.IBinder r0 = r11.readStrongBinder()
            if (r0 != 0) goto L_0x01d2
        L_0x01d0:
            r7 = r1
            goto L_0x01e5
        L_0x01d2:
            java.lang.String r1 = "com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback"
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r7 = r1 instanceof com.google.android.gms.internal.ads.C15986qr
            if (r7 == 0) goto L_0x01df
            com.google.android.gms.internal.ads.qr r1 = (com.google.android.gms.internal.ads.C15986qr) r1
            goto L_0x01d0
        L_0x01df:
            com.google.android.gms.internal.ads.qs r1 = new com.google.android.gms.internal.ads.qs
            r1.<init>(r0)
            goto L_0x01d0
        L_0x01e5:
            r0 = r9
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r0.mo41914a(r1, r2, r3, r4, r5, r6)
            r12.writeNoException()
        L_0x01f2:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C15984qp.dispatchTransaction(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
