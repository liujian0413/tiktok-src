package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.C14863t;
import com.taobao.android.dexposed.ClassUtils;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import org.json.JSONObject;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.ta */
public final class C16050ta extends C16039sq {

    /* renamed from: g */
    private C15931oq f44993g;

    /* renamed from: h */
    private C15913nz f44994h;

    /* renamed from: i */
    private C15916ob f44995i;

    /* renamed from: j */
    private C15922oh f44996j;

    /* renamed from: k */
    private final C15600ck f44997k;

    /* renamed from: l */
    private final ami f44998l;

    /* renamed from: m */
    private boolean f44999m;

    C16050ta(Context context, abk abk, C15931oq oqVar, C16043su suVar, C15600ck ckVar, ami ami) {
        super(context, abk, suVar);
        this.f44993g = oqVar;
        this.f44995i = abk.f39889c;
        this.f44997k = ckVar;
        this.f44998l = ami;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final abj mo41969a(int i) {
        String name;
        String str;
        boolean z;
        C15916ob obVar;
        long j;
        zzaxk zzaxk;
        String str2;
        String str3;
        boolean z2;
        C15916ob obVar2;
        long j2;
        Iterator it;
        C15916ob obVar3;
        int i2;
        zzaxe zzaxe = this.f44980e.f39887a;
        zzyv zzyv = zzaxe.f45573c;
        ami ami = this.f44998l;
        List<String> list = this.f44981f.f45626c;
        List<String> list2 = this.f44981f.f45628e;
        List<String> list3 = this.f44981f.f45632i;
        int i3 = this.f44981f.f45634k;
        long j3 = this.f44981f.f45633j;
        String str4 = zzaxe.f45579i;
        boolean z3 = this.f44981f.f45630g;
        C15915oa oaVar = this.f44996j != null ? this.f44996j.f44786b : null;
        C15935ou ouVar = this.f44996j != null ? this.f44996j.f44787c : null;
        if (this.f44996j != null) {
            name = this.f44996j.f44788d;
        } else {
            name = AdMobAdapter.class.getName();
        }
        String str5 = name;
        C15916ob obVar4 = this.f44995i;
        C15918od odVar = this.f44996j != null ? this.f44996j.f44789e : null;
        C15915oa oaVar2 = oaVar;
        C15935ou ouVar2 = ouVar;
        long j4 = this.f44981f.f45631h;
        zzyz zzyz = this.f44980e.f39890d;
        long j5 = j4;
        long j6 = this.f44981f.f45629f;
        long j7 = this.f44980e.f39892f;
        long j8 = this.f44981f.f45636m;
        String str6 = this.f44981f.f45637n;
        JSONObject jSONObject = this.f44980e.f39894h;
        zzbaz zzbaz = this.f44981f.f45597A;
        List<String> list4 = this.f44981f.f45598B;
        List<String> list5 = this.f44981f.f45599C;
        zzyz zzyz2 = zzyz;
        boolean z4 = this.f44995i != null ? this.f44995i.f44752o : false;
        zzaxk zzaxk2 = this.f44981f.f45601E;
        if (this.f44994h != null) {
            List b = this.f44994h.mo41777b();
            String str7 = "";
            if (b == null) {
                obVar = obVar4;
                zzaxk = zzaxk2;
                str2 = str7.toString();
                str = str4;
                z = z3;
                j = j8;
            } else {
                Iterator it2 = b.iterator();
                String str8 = str7;
                while (it2.hasNext()) {
                    zzaxk zzaxk3 = zzaxk2;
                    C15922oh ohVar = (C15922oh) it2.next();
                    if (ohVar != null) {
                        it = it2;
                        if (ohVar.f44786b == null || TextUtils.isEmpty(ohVar.f44786b.f44718d)) {
                            obVar3 = obVar4;
                        } else {
                            String valueOf = String.valueOf(str8);
                            j2 = j8;
                            String str9 = ohVar.f44786b.f44718d;
                            switch (ohVar.f44785a) {
                                case -1:
                                    i2 = 4;
                                    break;
                                case 0:
                                    obVar2 = obVar4;
                                    i2 = 0;
                                    break;
                                case 1:
                                    obVar2 = obVar4;
                                    i2 = 1;
                                    break;
                                case 3:
                                    i2 = 2;
                                    break;
                                case 4:
                                    i2 = 3;
                                    break;
                                case 5:
                                    i2 = 5;
                                    break;
                                default:
                                    i2 = 6;
                                    break;
                            }
                            obVar2 = obVar4;
                            long j9 = ohVar.f44791g;
                            z2 = z3;
                            str3 = str4;
                            StringBuilder sb = new StringBuilder(String.valueOf(str9).length() + 33);
                            sb.append(str9);
                            sb.append(ClassUtils.PACKAGE_SEPARATOR);
                            sb.append(i2);
                            sb.append(ClassUtils.PACKAGE_SEPARATOR);
                            sb.append(j9);
                            String sb2 = sb.toString();
                            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(sb2).length());
                            sb3.append(valueOf);
                            sb3.append(sb2);
                            sb3.append("_");
                            str8 = sb3.toString();
                            zzaxk2 = zzaxk3;
                            it2 = it;
                            j8 = j2;
                            obVar4 = obVar2;
                            z3 = z2;
                            str4 = str3;
                        }
                    } else {
                        obVar3 = obVar4;
                        it = it2;
                    }
                    str3 = str4;
                    z2 = z3;
                    j2 = j8;
                    zzaxk2 = zzaxk3;
                    it2 = it;
                    j8 = j2;
                    obVar4 = obVar2;
                    z3 = z2;
                    str4 = str3;
                }
                obVar = obVar4;
                zzaxk = zzaxk2;
                str = str4;
                z = z3;
                j = j8;
                str2 = str8.substring(0, Math.max(0, str8.length() - 1));
            }
        } else {
            obVar = obVar4;
            zzaxk = zzaxk2;
            str = str4;
            z = z3;
            j = j8;
            str2 = null;
        }
        abj abj = new abj(zzyv, ami, list, i, list2, list3, i3, j3, str, z, oaVar2, ouVar2, str5, obVar, odVar, j5, zzyz2, j6, j7, j, str6, jSONObject, null, zzbaz, list4, list5, z4, zzaxk, str2, this.f44981f.f45604H, this.f44981f.f45608L, this.f44980e.f39895i, this.f44981f.f45611O, this.f44980e.f39896j, this.f44981f.f45613Q, this.f44981f.f45614R, this.f44981f.f45615S, this.f44981f.f45616T, this.f44981f.f45618V, this.f44981f.f45619W);
        return abj;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [com.google.android.gms.internal.ads.nz] */
    /* JADX WARNING: type inference failed for: r17v0, types: [com.google.android.gms.internal.ads.on] */
    /* JADX WARNING: type inference failed for: r4v4, types: [com.google.android.gms.internal.ads.ok] */
    /* JADX WARNING: type inference failed for: r17v2, types: [com.google.android.gms.internal.ads.on] */
    /* JADX WARNING: type inference failed for: r4v5, types: [com.google.android.gms.internal.ads.ok] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r17v2, types: [com.google.android.gms.internal.ads.on]
      assigns: [com.google.android.gms.internal.ads.on, com.google.android.gms.internal.ads.ok]
      uses: [com.google.android.gms.internal.ads.on, com.google.android.gms.internal.ads.nz, com.google.android.gms.internal.ads.ok]
      mth insns count: 151
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
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0104  */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo41970a(long r32) throws com.google.android.gms.internal.ads.zzaug {
        /*
            r31 = this;
            r1 = r31
            java.lang.Object r2 = r1.f44979d
            monitor-enter(r2)
            com.google.android.gms.internal.ads.ob r0 = r1.f44995i     // Catch:{ all -> 0x0174 }
            int r0 = r0.f44750m     // Catch:{ all -> 0x0174 }
            r3 = -1
            if (r0 == r3) goto L_0x0043
            com.google.android.gms.internal.ads.ok r0 = new com.google.android.gms.internal.ads.ok     // Catch:{ all -> 0x0174 }
            android.content.Context r5 = r1.f44977b     // Catch:{ all -> 0x0174 }
            com.google.android.gms.internal.ads.abk r3 = r1.f44980e     // Catch:{ all -> 0x0174 }
            com.google.android.gms.internal.ads.zzaxe r6 = r3.f39887a     // Catch:{ all -> 0x0174 }
            com.google.android.gms.internal.ads.oq r7 = r1.f44993g     // Catch:{ all -> 0x0174 }
            com.google.android.gms.internal.ads.ob r8 = r1.f44995i     // Catch:{ all -> 0x0174 }
            com.google.android.gms.internal.ads.zzaxi r3 = r1.f44981f     // Catch:{ all -> 0x0174 }
            boolean r9 = r3.f45642s     // Catch:{ all -> 0x0174 }
            com.google.android.gms.internal.ads.zzaxi r3 = r1.f44981f     // Catch:{ all -> 0x0174 }
            boolean r10 = r3.f45649z     // Catch:{ all -> 0x0174 }
            com.google.android.gms.internal.ads.zzaxi r3 = r1.f44981f     // Catch:{ all -> 0x0174 }
            java.lang.String r11 = r3.f45606J     // Catch:{ all -> 0x0174 }
            com.google.android.gms.internal.ads.bl<java.lang.Long> r3 = com.google.android.gms.internal.ads.C15585bw.f43848bp     // Catch:{ all -> 0x0174 }
            com.google.android.gms.internal.ads.bt r4 = com.google.android.gms.internal.ads.bym.m50299d()     // Catch:{ all -> 0x0174 }
            java.lang.Object r3 = r4.mo41272a(r3)     // Catch:{ all -> 0x0174 }
            java.lang.Long r3 = (java.lang.Long) r3     // Catch:{ all -> 0x0174 }
            long r14 = r3.longValue()     // Catch:{ all -> 0x0174 }
            r16 = 2
            com.google.android.gms.internal.ads.abk r3 = r1.f44980e     // Catch:{ all -> 0x0174 }
            boolean r3 = r3.f39896j     // Catch:{ all -> 0x0174 }
            r4 = r0
            r12 = r32
            r17 = r3
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r14, r16, r17)     // Catch:{ all -> 0x0174 }
            goto L_0x008a
        L_0x0043:
            com.google.android.gms.internal.ads.on r0 = new com.google.android.gms.internal.ads.on     // Catch:{ all -> 0x0174 }
            android.content.Context r3 = r1.f44977b     // Catch:{ all -> 0x0174 }
            com.google.android.gms.internal.ads.abk r4 = r1.f44980e     // Catch:{ all -> 0x0174 }
            com.google.android.gms.internal.ads.zzaxe r4 = r4.f39887a     // Catch:{ all -> 0x0174 }
            com.google.android.gms.internal.ads.oq r5 = r1.f44993g     // Catch:{ all -> 0x0174 }
            com.google.android.gms.internal.ads.ob r6 = r1.f44995i     // Catch:{ all -> 0x0174 }
            com.google.android.gms.internal.ads.zzaxi r7 = r1.f44981f     // Catch:{ all -> 0x0174 }
            boolean r7 = r7.f45642s     // Catch:{ all -> 0x0174 }
            com.google.android.gms.internal.ads.zzaxi r8 = r1.f44981f     // Catch:{ all -> 0x0174 }
            boolean r8 = r8.f45649z     // Catch:{ all -> 0x0174 }
            com.google.android.gms.internal.ads.zzaxi r9 = r1.f44981f     // Catch:{ all -> 0x0174 }
            java.lang.String r9 = r9.f45606J     // Catch:{ all -> 0x0174 }
            com.google.android.gms.internal.ads.bl<java.lang.Long> r10 = com.google.android.gms.internal.ads.C15585bw.f43848bp     // Catch:{ all -> 0x0174 }
            com.google.android.gms.internal.ads.bt r11 = com.google.android.gms.internal.ads.bym.m50299d()     // Catch:{ all -> 0x0174 }
            java.lang.Object r10 = r11.mo41272a(r10)     // Catch:{ all -> 0x0174 }
            java.lang.Long r10 = (java.lang.Long) r10     // Catch:{ all -> 0x0174 }
            long r27 = r10.longValue()     // Catch:{ all -> 0x0174 }
            com.google.android.gms.internal.ads.ck r10 = r1.f44997k     // Catch:{ all -> 0x0174 }
            com.google.android.gms.internal.ads.abk r11 = r1.f44980e     // Catch:{ all -> 0x0174 }
            boolean r11 = r11.f39896j     // Catch:{ all -> 0x0174 }
            r17 = r0
            r18 = r3
            r19 = r4
            r20 = r5
            r21 = r6
            r22 = r7
            r23 = r8
            r24 = r9
            r25 = r32
            r29 = r10
            r30 = r11
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r27, r29, r30)     // Catch:{ all -> 0x0174 }
        L_0x008a:
            r1.f44994h = r0     // Catch:{ all -> 0x0174 }
            monitor-exit(r2)     // Catch:{ all -> 0x0174 }
            java.util.ArrayList r0 = new java.util.ArrayList
            com.google.android.gms.internal.ads.ob r2 = r1.f44995i
            java.util.List<com.google.android.gms.internal.ads.oa> r2 = r2.f44738a
            r0.<init>(r2)
            com.google.android.gms.internal.ads.abk r2 = r1.f44980e
            com.google.android.gms.internal.ads.zzaxe r2 = r2.f39887a
            com.google.android.gms.internal.ads.zzyv r2 = r2.f45573c
            android.os.Bundle r2 = r2.f45789m
            java.lang.String r3 = "com.google.ads.mediation.admob.AdMobAdapter"
            r4 = 0
            if (r2 == 0) goto L_0x00b0
            android.os.Bundle r2 = r2.getBundle(r3)
            if (r2 == 0) goto L_0x00b0
            java.lang.String r5 = "_skipMediation"
            boolean r2 = r2.getBoolean(r5)
            goto L_0x00b1
        L_0x00b0:
            r2 = 0
        L_0x00b1:
            if (r2 == 0) goto L_0x00cf
            java.util.ListIterator r2 = r0.listIterator()
        L_0x00b7:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x00cf
            java.lang.Object r5 = r2.next()
            com.google.android.gms.internal.ads.oa r5 = (com.google.android.gms.internal.ads.C15915oa) r5
            java.util.List<java.lang.String> r5 = r5.f44717c
            boolean r5 = r5.contains(r3)
            if (r5 != 0) goto L_0x00b7
            r2.remove()
            goto L_0x00b7
        L_0x00cf:
            com.google.android.gms.internal.ads.nz r2 = r1.f44994h
            com.google.android.gms.internal.ads.oh r0 = r2.mo41775a(r0)
            r1.f44996j = r0
            com.google.android.gms.internal.ads.oh r0 = r1.f44996j
            int r0 = r0.f44785a
            switch(r0) {
                case 0: goto L_0x0104;
                case 1: goto L_0x00fb;
                default: goto L_0x00de;
            }
        L_0x00de:
            com.google.android.gms.internal.ads.zzaug r0 = new com.google.android.gms.internal.ads.zzaug
            com.google.android.gms.internal.ads.oh r2 = r1.f44996j
            int r2 = r2.f44785a
            r3 = 40
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r3)
            java.lang.String r3 = "Unexpected mediation result: "
            r5.append(r3)
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            r0.<init>(r2, r4)
            throw r0
        L_0x00fb:
            com.google.android.gms.internal.ads.zzaug r0 = new com.google.android.gms.internal.ads.zzaug
            r2 = 3
            java.lang.String r3 = "No fill from any mediation ad networks."
            r0.<init>(r3, r2)
            throw r0
        L_0x0104:
            com.google.android.gms.internal.ads.oh r0 = r1.f44996j
            com.google.android.gms.internal.ads.oa r0 = r0.f44786b
            if (r0 == 0) goto L_0x0173
            com.google.android.gms.internal.ads.oh r0 = r1.f44996j
            com.google.android.gms.internal.ads.oa r0 = r0.f44786b
            java.lang.String r0 = r0.f44731q
            if (r0 == 0) goto L_0x0173
            java.util.concurrent.CountDownLatch r0 = new java.util.concurrent.CountDownLatch
            r2 = 1
            r0.<init>(r2)
            android.os.Handler r2 = com.google.android.gms.internal.ads.acl.f40003a
            com.google.android.gms.internal.ads.tb r3 = new com.google.android.gms.internal.ads.tb
            r3.<init>(r1, r0)
            r2.post(r3)
            r2 = 10
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x014d }
            r0.await(r2, r5)     // Catch:{ InterruptedException -> 0x014d }
            java.lang.Object r2 = r1.f44979d
            monitor-enter(r2)
            boolean r0 = r1.f44999m     // Catch:{ all -> 0x014a }
            if (r0 == 0) goto L_0x0142
            com.google.android.gms.internal.ads.ami r0 = r1.f44998l     // Catch:{ all -> 0x014a }
            boolean r0 = r0.mo39703C()     // Catch:{ all -> 0x014a }
            if (r0 != 0) goto L_0x013a
            monitor-exit(r2)     // Catch:{ all -> 0x014a }
            return
        L_0x013a:
            com.google.android.gms.internal.ads.zzaug r0 = new com.google.android.gms.internal.ads.zzaug     // Catch:{ all -> 0x014a }
            java.lang.String r3 = "Assets not loaded, web view is destroyed"
            r0.<init>(r3, r4)     // Catch:{ all -> 0x014a }
            throw r0     // Catch:{ all -> 0x014a }
        L_0x0142:
            com.google.android.gms.internal.ads.zzaug r0 = new com.google.android.gms.internal.ads.zzaug     // Catch:{ all -> 0x014a }
            java.lang.String r3 = "View could not be prepared"
            r0.<init>(r3, r4)     // Catch:{ all -> 0x014a }
            throw r0     // Catch:{ all -> 0x014a }
        L_0x014a:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x014a }
            throw r0
        L_0x014d:
            r0 = move-exception
            com.google.android.gms.internal.ads.zzaug r2 = new com.google.android.gms.internal.ads.zzaug
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r3 = java.lang.String.valueOf(r0)
            int r3 = r3.length()
            int r3 = r3 + 38
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r3)
            java.lang.String r3 = "Interrupted while waiting for latch : "
            r5.append(r3)
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            r2.<init>(r0, r4)
            throw r2
        L_0x0173:
            return
        L_0x0174:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0174 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C16050ta.mo41970a(long):void");
    }

    /* renamed from: u_ */
    public final void mo37836u_() {
        synchronized (this.f44979d) {
            super.mo37836u_();
            if (this.f44994h != null) {
                this.f44994h.mo41776a();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo41975a(CountDownLatch countDownLatch) {
        synchronized (this.f44979d) {
            this.f44999m = C14863t.m43177a(this.f44998l, this.f44996j, countDownLatch);
        }
    }
}
