package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.taobao.android.dexposed.ClassUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.zd */
public final class C16214zd extends abz implements C16213zc {

    /* renamed from: a */
    private final abk f45466a;

    /* renamed from: b */
    private final Context f45467b;

    /* renamed from: c */
    private final ArrayList<C16203yt> f45468c;

    /* renamed from: d */
    private final List<C16206yw> f45469d;

    /* renamed from: e */
    private final HashSet<String> f45470e;

    /* renamed from: f */
    private final Object f45471f;

    /* renamed from: g */
    private final C16176xt f45472g;

    /* renamed from: h */
    private final long f45473h;

    public C16214zd(Context context, abk abk, C16176xt xtVar) {
        Context context2 = context;
        abk abk2 = abk;
        C16176xt xtVar2 = xtVar;
        this(context2, abk2, xtVar2, ((Long) bym.m50299d().mo41272a(C15585bw.f43805az)).longValue());
    }

    /* renamed from: a */
    public final void mo42117a(String str, int i) {
    }

    /* renamed from: u_ */
    public final void mo37836u_() {
    }

    private C16214zd(Context context, abk abk, C16176xt xtVar, long j) {
        this.f45468c = new ArrayList<>();
        this.f45469d = new ArrayList();
        this.f45470e = new HashSet<>();
        this.f45471f = new Object();
        this.f45467b = context;
        this.f45466a = abk;
        this.f45472g = xtVar;
        this.f45473h = j;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:89:0x015a */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo37835a() {
        /*
            r19 = this;
            r11 = r19
            com.google.android.gms.internal.ads.abk r0 = r11.f45466a
            com.google.android.gms.internal.ads.ob r0 = r0.f39889c
            java.util.List<com.google.android.gms.internal.ads.oa> r0 = r0.f44738a
            java.util.Iterator r12 = r0.iterator()
        L_0x000c:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x00ba
            java.lang.Object r0 = r12.next()
            r13 = r0
            com.google.android.gms.internal.ads.oa r13 = (com.google.android.gms.internal.ads.C15915oa) r13
            java.lang.String r14 = r13.f44725k
            java.util.List<java.lang.String> r0 = r13.f44717c
            java.util.Iterator r15 = r0.iterator()
        L_0x0021:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x000c
            java.lang.Object r0 = r15.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x0040
            java.lang.String r1 = "com.google.ads.mediation.customevent.CustomEventAdapter"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x003e
            goto L_0x0040
        L_0x003e:
            r3 = r0
            goto L_0x004c
        L_0x0040:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00b2 }
            r0.<init>(r14)     // Catch:{ JSONException -> 0x00b2 }
            java.lang.String r1 = "class_name"
            java.lang.String r0 = r0.getString(r1)     // Catch:{ JSONException -> 0x00b2 }
            goto L_0x003e
        L_0x004c:
            java.lang.Object r9 = r11.f45471f
            monitor-enter(r9)
            com.google.android.gms.internal.ads.xt r0 = r11.f45472g     // Catch:{ all -> 0x00ab }
            com.google.android.gms.internal.ads.zh r7 = r0.mo42068a(r3)     // Catch:{ all -> 0x00ab }
            if (r7 == 0) goto L_0x0083
            com.google.android.gms.internal.ads.zb r0 = r7.f45479b     // Catch:{ all -> 0x00ab }
            if (r0 == 0) goto L_0x0083
            com.google.android.gms.internal.ads.ou r0 = r7.f45478a     // Catch:{ all -> 0x00ab }
            if (r0 != 0) goto L_0x0060
            goto L_0x0083
        L_0x0060:
            com.google.android.gms.internal.ads.yt r0 = new com.google.android.gms.internal.ads.yt     // Catch:{ all -> 0x00ab }
            android.content.Context r2 = r11.f45467b     // Catch:{ all -> 0x00ab }
            com.google.android.gms.internal.ads.abk r6 = r11.f45466a     // Catch:{ all -> 0x00ab }
            long r4 = r11.f45473h     // Catch:{ all -> 0x00ab }
            r1 = r0
            r16 = r4
            r4 = r14
            r5 = r13
            r8 = r19
            r18 = r9
            r9 = r16
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x00b0 }
            com.google.android.gms.internal.ads.xt r1 = r11.f45472g     // Catch:{ all -> 0x00b0 }
            com.google.android.gms.internal.ads.gw r1 = r1.f45410a     // Catch:{ all -> 0x00b0 }
            r0.f45435c = r1     // Catch:{ all -> 0x00b0 }
            java.util.ArrayList<com.google.android.gms.internal.ads.yt> r1 = r11.f45468c     // Catch:{ all -> 0x00b0 }
            r1.add(r0)     // Catch:{ all -> 0x00b0 }
            monitor-exit(r18)     // Catch:{ all -> 0x00b0 }
            goto L_0x0021
        L_0x0083:
            r18 = r9
            java.util.List<com.google.android.gms.internal.ads.yw> r0 = r11.f45469d     // Catch:{ all -> 0x00b0 }
            com.google.android.gms.internal.ads.yy r1 = new com.google.android.gms.internal.ads.yy     // Catch:{ all -> 0x00b0 }
            r1.<init>()     // Catch:{ all -> 0x00b0 }
            java.lang.String r2 = r13.f44718d     // Catch:{ all -> 0x00b0 }
            com.google.android.gms.internal.ads.yy r1 = r1.mo42127b(r2)     // Catch:{ all -> 0x00b0 }
            com.google.android.gms.internal.ads.yy r1 = r1.mo42126a(r3)     // Catch:{ all -> 0x00b0 }
            r2 = 0
            com.google.android.gms.internal.ads.yy r1 = r1.mo42125a(r2)     // Catch:{ all -> 0x00b0 }
            r2 = 7
            com.google.android.gms.internal.ads.yy r1 = r1.mo42124a(r2)     // Catch:{ all -> 0x00b0 }
            com.google.android.gms.internal.ads.yw r1 = r1.mo42123a()     // Catch:{ all -> 0x00b0 }
            r0.add(r1)     // Catch:{ all -> 0x00b0 }
            monitor-exit(r18)     // Catch:{ all -> 0x00b0 }
            goto L_0x0021
        L_0x00ab:
            r0 = move-exception
            r18 = r9
        L_0x00ae:
            monitor-exit(r18)     // Catch:{ all -> 0x00b0 }
            throw r0
        L_0x00b0:
            r0 = move-exception
            goto L_0x00ae
        L_0x00b2:
            r0 = move-exception
            java.lang.String r1 = "Unable to determine custom event class name, skipping..."
            com.google.android.gms.internal.ads.acd.m45778b(r1, r0)
            goto L_0x0021
        L_0x00ba:
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.ArrayList<com.google.android.gms.internal.ads.yt> r1 = r11.f45468c
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            int r2 = r1.size()
            r3 = 0
            r4 = 0
        L_0x00c9:
            if (r4 >= r2) goto L_0x00df
            java.lang.Object r5 = r1.get(r4)
            int r4 = r4 + 1
            com.google.android.gms.internal.ads.yt r5 = (com.google.android.gms.internal.ads.C16203yt) r5
            java.lang.String r6 = r5.f45433a
            boolean r6 = r0.add(r6)
            if (r6 == 0) goto L_0x00c9
            r5.mo42118d()
            goto L_0x00c9
        L_0x00df:
            java.util.ArrayList<com.google.android.gms.internal.ads.yt> r0 = r11.f45468c
            r1 = r0
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            int r2 = r1.size()
        L_0x00e8:
            if (r3 >= r2) goto L_0x0193
            java.lang.Object r0 = r1.get(r3)
            int r3 = r3 + 1
            r4 = r0
            com.google.android.gms.internal.ads.yt r4 = (com.google.android.gms.internal.ads.C16203yt) r4
            java.util.concurrent.Future r0 = r4.mo42118d()     // Catch:{ InterruptedException -> 0x015a, Exception -> 0x013b }
            r0.get()     // Catch:{ InterruptedException -> 0x015a, Exception -> 0x013b }
            java.lang.Object r5 = r11.f45471f
            monitor-enter(r5)
            java.lang.String r0 = r4.f45433a     // Catch:{ all -> 0x0136 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0136 }
            if (r0 != 0) goto L_0x010e
            java.util.List<com.google.android.gms.internal.ads.yw> r0 = r11.f45469d     // Catch:{ all -> 0x0136 }
            com.google.android.gms.internal.ads.yw r6 = r4.mo42119e()     // Catch:{ all -> 0x0136 }
            r0.add(r6)     // Catch:{ all -> 0x0136 }
        L_0x010e:
            monitor-exit(r5)     // Catch:{ all -> 0x0136 }
            java.lang.Object r6 = r11.f45471f
            monitor-enter(r6)
            java.util.HashSet<java.lang.String> r0 = r11.f45470e     // Catch:{ all -> 0x0133 }
            java.lang.String r5 = r4.f45433a     // Catch:{ all -> 0x0133 }
            boolean r0 = r0.contains(r5)     // Catch:{ all -> 0x0133 }
            if (r0 == 0) goto L_0x0131
            java.lang.String r0 = r4.f45433a     // Catch:{ all -> 0x0133 }
            com.google.android.gms.internal.ads.oa r1 = r4.f45434b     // Catch:{ all -> 0x0133 }
            r2 = -2
            com.google.android.gms.internal.ads.abj r0 = r11.m52585a(r2, r0, r1)     // Catch:{ all -> 0x0133 }
            android.os.Handler r1 = com.google.android.gms.internal.ads.afb.f40136a     // Catch:{ all -> 0x0133 }
            com.google.android.gms.internal.ads.ze r2 = new com.google.android.gms.internal.ads.ze     // Catch:{ all -> 0x0133 }
            r2.<init>(r11, r0)     // Catch:{ all -> 0x0133 }
            r1.post(r2)     // Catch:{ all -> 0x0133 }
            monitor-exit(r6)     // Catch:{ all -> 0x0133 }
            return
        L_0x0131:
            monitor-exit(r6)     // Catch:{ all -> 0x0133 }
            goto L_0x00e8
        L_0x0133:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0133 }
            throw r0
        L_0x0136:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0136 }
            throw r0
        L_0x0139:
            r0 = move-exception
            goto L_0x017a
        L_0x013b:
            r0 = move-exception
            java.lang.String r5 = "Unable to resolve rewarded adapter."
            com.google.android.gms.internal.ads.acd.m45780c(r5, r0)     // Catch:{ all -> 0x0139 }
            java.lang.Object r5 = r11.f45471f
            monitor-enter(r5)
            java.lang.String r0 = r4.f45433a     // Catch:{ all -> 0x0157 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0157 }
            if (r0 != 0) goto L_0x0155
            java.util.List<com.google.android.gms.internal.ads.yw> r0 = r11.f45469d     // Catch:{ all -> 0x0157 }
            com.google.android.gms.internal.ads.yw r4 = r4.mo42119e()     // Catch:{ all -> 0x0157 }
            r0.add(r4)     // Catch:{ all -> 0x0157 }
        L_0x0155:
            monitor-exit(r5)     // Catch:{ all -> 0x0157 }
            goto L_0x00e8
        L_0x0157:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0157 }
            throw r0
        L_0x015a:
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0139 }
            r0.interrupt()     // Catch:{ all -> 0x0139 }
            java.lang.Object r1 = r11.f45471f
            monitor-enter(r1)
            java.lang.String r0 = r4.f45433a     // Catch:{ all -> 0x0177 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0177 }
            if (r0 != 0) goto L_0x0175
            java.util.List<com.google.android.gms.internal.ads.yw> r0 = r11.f45469d     // Catch:{ all -> 0x0177 }
            com.google.android.gms.internal.ads.yw r2 = r4.mo42119e()     // Catch:{ all -> 0x0177 }
            r0.add(r2)     // Catch:{ all -> 0x0177 }
        L_0x0175:
            monitor-exit(r1)     // Catch:{ all -> 0x0177 }
            goto L_0x0193
        L_0x0177:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0177 }
            throw r0
        L_0x017a:
            java.lang.Object r1 = r11.f45471f
            monitor-enter(r1)
            java.lang.String r2 = r4.f45433a     // Catch:{ all -> 0x0190 }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x0190 }
            if (r2 != 0) goto L_0x018e
            java.util.List<com.google.android.gms.internal.ads.yw> r2 = r11.f45469d     // Catch:{ all -> 0x0190 }
            com.google.android.gms.internal.ads.yw r3 = r4.mo42119e()     // Catch:{ all -> 0x0190 }
            r2.add(r3)     // Catch:{ all -> 0x0190 }
        L_0x018e:
            monitor-exit(r1)     // Catch:{ all -> 0x0190 }
            throw r0
        L_0x0190:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0190 }
            throw r0
        L_0x0193:
            r0 = 3
            r1 = 0
            com.google.android.gms.internal.ads.abj r0 = r11.m52585a(r0, r1, r1)
            android.os.Handler r1 = com.google.android.gms.internal.ads.afb.f40136a
            com.google.android.gms.internal.ads.zf r2 = new com.google.android.gms.internal.ads.zf
            r2.<init>(r11, r0)
            r1.post(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C16214zd.mo37835a():void");
    }

    /* renamed from: a */
    public final void mo42116a(String str) {
        synchronized (this.f45471f) {
            this.f45470e.add(str);
        }
    }

    /* renamed from: a */
    private final abj m52585a(int i, String str, C15915oa oaVar) {
        boolean z;
        long j;
        String str2;
        zzyz zzyz;
        String str3;
        long j2;
        int i2;
        zzyv zzyv = this.f45466a.f39887a.f45573c;
        List<String> list = this.f45466a.f39888b.f45626c;
        List<String> list2 = this.f45466a.f39888b.f45628e;
        List<String> list3 = this.f45466a.f39888b.f45632i;
        int i3 = this.f45466a.f39888b.f45634k;
        long j3 = this.f45466a.f39888b.f45633j;
        String str4 = this.f45466a.f39887a.f45579i;
        boolean z2 = this.f45466a.f39888b.f45630g;
        C15916ob obVar = this.f45466a.f39889c;
        long j4 = this.f45466a.f39888b.f45631h;
        zzyz zzyz2 = this.f45466a.f39890d;
        long j5 = j4;
        C15916ob obVar2 = obVar;
        long j6 = this.f45466a.f39888b.f45629f;
        long j7 = this.f45466a.f39892f;
        long j8 = this.f45466a.f39888b.f45636m;
        String str5 = this.f45466a.f39888b.f45637n;
        JSONObject jSONObject = this.f45466a.f39894h;
        zzbaz zzbaz = this.f45466a.f39888b.f45597A;
        JSONObject jSONObject2 = jSONObject;
        List<String> list4 = this.f45466a.f39888b.f45598B;
        List<String> list5 = this.f45466a.f39888b.f45599C;
        boolean z3 = this.f45466a.f39888b.f45600D;
        zzaxk zzaxk = this.f45466a.f39888b.f45601E;
        zzbaz zzbaz2 = zzbaz;
        StringBuilder sb = new StringBuilder("");
        if (this.f45469d == null) {
            str3 = sb.toString();
            zzyz = zzyz2;
            z = z2;
            str2 = str5;
            j = j8;
        } else {
            Iterator it = this.f45469d.iterator();
            while (true) {
                zzyz = zzyz2;
                if (it.hasNext()) {
                    C16206yw ywVar = (C16206yw) it.next();
                    if (ywVar != null) {
                        Iterator it2 = it;
                        if (!TextUtils.isEmpty(ywVar.f45454a)) {
                            String str6 = ywVar.f45454a;
                            String str7 = str5;
                            switch (ywVar.f45455b) {
                                case 3:
                                    j2 = j8;
                                    i2 = 1;
                                    break;
                                case 4:
                                    j2 = j8;
                                    i2 = 2;
                                    break;
                                case 5:
                                    j2 = j8;
                                    i2 = 4;
                                    break;
                                case 6:
                                    j2 = j8;
                                    i2 = 0;
                                    break;
                                case 7:
                                    j2 = j8;
                                    i2 = 3;
                                    break;
                                default:
                                    j2 = j8;
                                    i2 = 6;
                                    break;
                            }
                            long j9 = ywVar.f45456c;
                            boolean z4 = z2;
                            StringBuilder sb2 = new StringBuilder(String.valueOf(str6).length() + 33);
                            sb2.append(str6);
                            sb2.append(ClassUtils.PACKAGE_SEPARATOR);
                            sb2.append(i2);
                            sb2.append(ClassUtils.PACKAGE_SEPARATOR);
                            sb2.append(j9);
                            sb.append(String.valueOf(sb2.toString()).concat("_"));
                            zzyz2 = zzyz;
                            it = it2;
                            str5 = str7;
                            j8 = j2;
                            z2 = z4;
                        } else {
                            zzyz2 = zzyz;
                            it = it2;
                        }
                    } else {
                        zzyz2 = zzyz;
                    }
                } else {
                    z = z2;
                    str2 = str5;
                    j = j8;
                    str3 = sb.substring(0, Math.max(0, sb.length() - 1));
                }
            }
        }
        long j10 = j5;
        long j11 = j6;
        long j12 = j7;
        long j13 = j;
        JSONObject jSONObject3 = jSONObject2;
        zzyz zzyz3 = zzyz;
        int i4 = i;
        boolean z5 = z;
        String str8 = str2;
        C15915oa oaVar2 = oaVar;
        C15916ob obVar3 = obVar2;
        String str9 = str;
        abj abj = new abj(zzyv, null, list, i4, list2, list3, i3, j3, str4, z5, oaVar2, null, str9, obVar3, null, j10, zzyz3, j11, j12, j13, str8, jSONObject3, null, zzbaz2, list4, list5, z3, zzaxk, str3, this.f45466a.f39888b.f45604H, this.f45466a.f39888b.f45608L, this.f45466a.f39895i, this.f45466a.f39888b.f45611O, this.f45466a.f39896j, this.f45466a.f39888b.f45613Q, this.f45466a.f39888b.f45614R, this.f45466a.f39888b.f45615S, this.f45466a.f39888b.f45616T, this.f45466a.f39888b.f45618V, this.f45466a.f39888b.f45619W);
        return abj;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo42140a(abj abj) {
        this.f45472g.f45411b.mo37611b(abj);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo42141b(abj abj) {
        this.f45472g.f45411b.mo37611b(abj);
    }
}
