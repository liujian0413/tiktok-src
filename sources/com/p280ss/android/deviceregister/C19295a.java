package com.p280ss.android.deviceregister;

import org.json.JSONObject;

/* renamed from: com.ss.android.deviceregister.a */
public final class C19295a {

    /* renamed from: a */
    private static JSONObject f52198a;

    /* JADX WARNING: Can't wrap try/catch for region: R(42:2|3|4|(1:6)|7|(2:9|(1:11))|12|(4:16|(2:19|17)|101|20)|21|(1:23)|24|(1:26)|27|(2:29|(1:31))|32|(1:36)|37|(3:39|40|(1:42))|43|44|(1:48)|49|(1:51)|52|(1:54)|55|(2:57|(1:59))|60|(2:62|(1:66))|67|(1:69)|70|(2:72|(1:74))|75|(1:77)|78|(1:80)|81|(4:83|(3:85|(2:87|103)(1:104)|88)|102|89)|90|(4:94|95|96|99)|97) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00f5 */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0116 A[Catch:{ Throwable -> 0x02b7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x012b A[Catch:{ Throwable -> 0x02b7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0143 A[Catch:{ Throwable -> 0x02b7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x015e A[Catch:{ Throwable -> 0x02b7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x019b A[Catch:{ Throwable -> 0x02b7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01ac A[Catch:{ Throwable -> 0x02b7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01d2 A[Catch:{ Throwable -> 0x02b7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01eb A[Catch:{ Throwable -> 0x02b7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x021d A[Catch:{ Throwable -> 0x02b7 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m63226a(org.json.JSONObject r8, android.content.Context r9) {
        /*
            if (r9 != 0) goto L_0x0003
            return
        L_0x0003:
            android.content.Context r9 = r9.getApplicationContext()
            org.json.JSONObject r0 = f52198a     // Catch:{ Throwable -> 0x02b7 }
            if (r0 != 0) goto L_0x0012
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Throwable -> 0x02b7 }
            r0.<init>()     // Catch:{ Throwable -> 0x02b7 }
            f52198a = r0     // Catch:{ Throwable -> 0x02b7 }
        L_0x0012:
            com.ss.android.deviceregister.c.f r0 = new com.ss.android.deviceregister.c.f     // Catch:{ Throwable -> 0x02b7 }
            r0.<init>()     // Catch:{ Throwable -> 0x02b7 }
            org.json.JSONObject r1 = f52198a     // Catch:{ Throwable -> 0x02b7 }
            java.lang.String r2 = "band"
            boolean r1 = r1.has(r2)     // Catch:{ Throwable -> 0x02b7 }
            if (r1 != 0) goto L_0x0034
            java.lang.String r1 = "gsm.version.baseband"
            java.lang.String r1 = r0.mo51220a(r1)     // Catch:{ Throwable -> 0x02b7 }
            boolean r2 = com.bytedance.common.utility.C6319n.m19593a(r1)     // Catch:{ Throwable -> 0x02b7 }
            if (r2 != 0) goto L_0x0034
            org.json.JSONObject r2 = f52198a     // Catch:{ Throwable -> 0x02b7 }
            java.lang.String r3 = "band"
            r2.put(r3, r1)     // Catch:{ Throwable -> 0x02b7 }
        L_0x0034:
            java.util.List r1 = com.p280ss.android.deviceregister.p855c.C19319c.m63350c(r9)     // Catch:{ Throwable -> 0x02b7 }
            if (r1 == 0) goto L_0x0082
            boolean r2 = r1.isEmpty()     // Catch:{ Throwable -> 0x02b7 }
            if (r2 != 0) goto L_0x0082
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch:{ Throwable -> 0x02b7 }
            r2.<init>()     // Catch:{ Throwable -> 0x02b7 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ Throwable -> 0x02b7 }
        L_0x0049:
            boolean r3 = r1.hasNext()     // Catch:{ Throwable -> 0x02b7 }
            if (r3 == 0) goto L_0x007b
            java.lang.Object r3 = r1.next()     // Catch:{ Throwable -> 0x02b7 }
            android.net.wifi.ScanResult r3 = (android.net.wifi.ScanResult) r3     // Catch:{ Throwable -> 0x02b7 }
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ Throwable -> 0x02b7 }
            r4.<init>()     // Catch:{ Throwable -> 0x02b7 }
            java.lang.String r5 = "ap"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x02b7 }
            r6.<init>()     // Catch:{ Throwable -> 0x02b7 }
            java.lang.String r7 = r3.BSSID     // Catch:{ Throwable -> 0x02b7 }
            r6.append(r7)     // Catch:{ Throwable -> 0x02b7 }
            java.lang.String r7 = ","
            r6.append(r7)     // Catch:{ Throwable -> 0x02b7 }
            int r3 = r3.level     // Catch:{ Throwable -> 0x02b7 }
            r6.append(r3)     // Catch:{ Throwable -> 0x02b7 }
            java.lang.String r3 = r6.toString()     // Catch:{ Throwable -> 0x02b7 }
            r4.put(r5, r3)     // Catch:{ Throwable -> 0x02b7 }
            r2.put(r4)     // Catch:{ Throwable -> 0x02b7 }
            goto L_0x0049
        L_0x007b:
            org.json.JSONObject r1 = f52198a     // Catch:{ Throwable -> 0x02b7 }
            java.lang.String r3 = "aps"
            r1.put(r3, r2)     // Catch:{ Throwable -> 0x02b7 }
        L_0x0082:
            org.json.JSONArray r1 = com.p280ss.android.deviceregister.p855c.C19319c.m63352d(r9)     // Catch:{ Throwable -> 0x02b7 }
            if (r1 == 0) goto L_0x008f
            org.json.JSONObject r2 = f52198a     // Catch:{ Throwable -> 0x02b7 }
            java.lang.String r3 = "cell"
            r2.put(r3, r1)     // Catch:{ Throwable -> 0x02b7 }
        L_0x008f:
            r1 = 0
            boolean r2 = com.bytedance.common.utility.C6319n.m19593a(r1)     // Catch:{ Throwable -> 0x02b7 }
            if (r2 != 0) goto L_0x009d
            org.json.JSONObject r2 = f52198a     // Catch:{ Throwable -> 0x02b7 }
            java.lang.String r3 = "bssid"
            r2.put(r3, r1)     // Catch:{ Throwable -> 0x02b7 }
        L_0x009d:
            org.json.JSONObject r2 = f52198a     // Catch:{ Throwable -> 0x02b7 }
            java.lang.String r3 = "mac"
            boolean r2 = r2.has(r3)     // Catch:{ Throwable -> 0x02b7 }
            if (r2 != 0) goto L_0x00b8
            java.lang.String r2 = com.p280ss.android.deviceregister.p855c.C19319c.m63354e(r9)     // Catch:{ Throwable -> 0x02b7 }
            boolean r3 = com.bytedance.common.utility.C6319n.m19593a(r2)     // Catch:{ Throwable -> 0x02b7 }
            if (r3 != 0) goto L_0x00b8
            org.json.JSONObject r3 = f52198a     // Catch:{ Throwable -> 0x02b7 }
            java.lang.String r4 = "mac"
            r3.put(r4, r2)     // Catch:{ Throwable -> 0x02b7 }
        L_0x00b8:
            org.json.JSONObject r2 = f52198a     // Catch:{ Throwable -> 0x02b7 }
            java.lang.String r3 = "imsi"
            boolean r2 = r2.has(r3)     // Catch:{ Throwable -> 0x02b7 }
            if (r2 != 0) goto L_0x00cf
            boolean r2 = com.bytedance.common.utility.C6319n.m19593a(r1)     // Catch:{ Throwable -> 0x02b7 }
            if (r2 != 0) goto L_0x00cf
            org.json.JSONObject r2 = f52198a     // Catch:{ Throwable -> 0x02b7 }
            java.lang.String r3 = "imsi"
            r2.put(r3, r1)     // Catch:{ Throwable -> 0x02b7 }
        L_0x00cf:
            org.json.JSONObject r2 = f52198a     // Catch:{ Throwable -> 0x02b7 }
            java.lang.String r3 = "t"
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x02b7 }
            r2.put(r3, r4)     // Catch:{ Throwable -> 0x02b7 }
            org.json.JSONObject r2 = f52198a     // Catch:{ Throwable -> 0x02b7 }
            java.lang.String r3 = "cpuModel"
            boolean r2 = r2.has(r3)     // Catch:{ Throwable -> 0x02b7 }
            if (r2 != 0) goto L_0x00f5
            java.lang.String r2 = com.p280ss.android.deviceregister.p855c.C19319c.m63347b()     // Catch:{ Exception -> 0x00f5 }
            boolean r3 = com.bytedance.common.utility.C6319n.m19593a(r2)     // Catch:{ Exception -> 0x00f5 }
            if (r3 != 0) goto L_0x00f5
            org.json.JSONObject r3 = f52198a     // Catch:{ Exception -> 0x00f5 }
            java.lang.String r4 = "cpuModel"
            r3.put(r4, r2)     // Catch:{ Exception -> 0x00f5 }
        L_0x00f5:
            org.json.JSONObject r2 = f52198a     // Catch:{ Throwable -> 0x02b7 }
            java.lang.String r3 = "btmac"
            boolean r2 = r2.has(r3)     // Catch:{ Throwable -> 0x02b7 }
            if (r2 != 0) goto L_0x010c
            boolean r2 = com.bytedance.common.utility.C6319n.m19593a(r1)     // Catch:{ Throwable -> 0x02b7 }
            if (r2 != 0) goto L_0x010c
            org.json.JSONObject r2 = f52198a     // Catch:{ Throwable -> 0x02b7 }
            java.lang.String r3 = "btmac"
            r2.put(r3, r1)     // Catch:{ Throwable -> 0x02b7 }
        L_0x010c:
            org.json.JSONObject r1 = f52198a     // Catch:{ Throwable -> 0x02b7 }
            java.lang.String r2 = "boot"
            boolean r1 = r1.has(r2)     // Catch:{ Throwable -> 0x02b7 }
            if (r1 != 0) goto L_0x0121
            org.json.JSONObject r1 = f52198a     // Catch:{ Throwable -> 0x02b7 }
            java.lang.String r2 = "boot"
            long r3 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Throwable -> 0x02b7 }
            r1.put(r2, r3)     // Catch:{ Throwable -> 0x02b7 }
        L_0x0121:
            java.lang.String r1 = com.p280ss.android.deviceregister.p855c.C19319c.m63356f(r9)     // Catch:{ Throwable -> 0x02b7 }
            boolean r2 = com.bytedance.common.utility.C6319n.m19593a(r1)     // Catch:{ Throwable -> 0x02b7 }
            if (r2 != 0) goto L_0x0132
            org.json.JSONObject r2 = f52198a     // Catch:{ Throwable -> 0x02b7 }
            java.lang.String r3 = "ssid"
            r2.put(r3, r1)     // Catch:{ Throwable -> 0x02b7 }
        L_0x0132:
            org.json.JSONObject r1 = f52198a     // Catch:{ Throwable -> 0x02b7 }
            java.lang.String r2 = "accid"
            r1.has(r2)     // Catch:{ Throwable -> 0x02b7 }
            org.json.JSONObject r1 = f52198a     // Catch:{ Throwable -> 0x02b7 }
            java.lang.String r2 = "mem"
            boolean r1 = r1.has(r2)     // Catch:{ Throwable -> 0x02b7 }
            if (r1 != 0) goto L_0x0154
            long r1 = com.p280ss.android.deviceregister.p855c.C19319c.m63349c()     // Catch:{ Throwable -> 0x02b7 }
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 < 0) goto L_0x0154
            org.json.JSONObject r3 = f52198a     // Catch:{ Throwable -> 0x02b7 }
            java.lang.String r4 = "mem"
            r3.put(r4, r1)     // Catch:{ Throwable -> 0x02b7 }
        L_0x0154:
            org.json.JSONObject r1 = f52198a     // Catch:{ Throwable -> 0x02b7 }
            java.lang.String r2 = "cpuFreq"
            boolean r1 = r1.has(r2)     // Catch:{ Throwable -> 0x02b7 }
            if (r1 != 0) goto L_0x018d
            java.lang.String r1 = com.p280ss.android.deviceregister.p855c.C19319c.m63351d()     // Catch:{ Throwable -> 0x02b7 }
            java.lang.String r2 = com.p280ss.android.deviceregister.p855c.C19319c.m63353e()     // Catch:{ Throwable -> 0x02b7 }
            boolean r3 = com.bytedance.common.utility.C6319n.m19593a(r1)     // Catch:{ Throwable -> 0x02b7 }
            if (r3 == 0) goto L_0x0172
            boolean r3 = com.bytedance.common.utility.C6319n.m19593a(r2)     // Catch:{ Throwable -> 0x02b7 }
            if (r3 != 0) goto L_0x018d
        L_0x0172:
            org.json.JSONObject r3 = f52198a     // Catch:{ Throwable -> 0x02b7 }
            java.lang.String r4 = "cpuFreq"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x02b7 }
            r5.<init>()     // Catch:{ Throwable -> 0x02b7 }
            r5.append(r1)     // Catch:{ Throwable -> 0x02b7 }
            java.lang.String r1 = " - "
            r5.append(r1)     // Catch:{ Throwable -> 0x02b7 }
            r5.append(r2)     // Catch:{ Throwable -> 0x02b7 }
            java.lang.String r1 = r5.toString()     // Catch:{ Throwable -> 0x02b7 }
            r3.put(r4, r1)     // Catch:{ Throwable -> 0x02b7 }
        L_0x018d:
            java.lang.String r1 = com.p280ss.android.deviceregister.p855c.C19319c.m63355f()     // Catch:{ Throwable -> 0x02b7 }
            org.json.JSONObject r2 = f52198a     // Catch:{ Throwable -> 0x02b7 }
            java.lang.String r3 = "brand"
            boolean r2 = r2.has(r3)     // Catch:{ Throwable -> 0x02b7 }
            if (r2 != 0) goto L_0x01a2
            org.json.JSONObject r2 = f52198a     // Catch:{ Throwable -> 0x02b7 }
            java.lang.String r3 = "brand"
            r2.put(r3, r1)     // Catch:{ Throwable -> 0x02b7 }
        L_0x01a2:
            org.json.JSONObject r1 = f52198a     // Catch:{ Throwable -> 0x02b7 }
            java.lang.String r2 = "proc"
            boolean r1 = r1.has(r2)     // Catch:{ Throwable -> 0x02b7 }
            if (r1 != 0) goto L_0x01bd
            java.lang.String r1 = com.p280ss.android.deviceregister.p855c.C19319c.m63358g(r9)     // Catch:{ Throwable -> 0x02b7 }
            boolean r2 = com.bytedance.common.utility.C6319n.m19593a(r1)     // Catch:{ Throwable -> 0x02b7 }
            if (r2 != 0) goto L_0x01bd
            org.json.JSONObject r2 = f52198a     // Catch:{ Throwable -> 0x02b7 }
            java.lang.String r3 = "proc"
            r2.put(r3, r1)     // Catch:{ Throwable -> 0x02b7 }
        L_0x01bd:
            org.json.JSONObject r1 = f52198a     // Catch:{ Throwable -> 0x02b7 }
            java.lang.String r2 = "sim"
            int r3 = com.p280ss.android.deviceregister.p855c.C19319c.m63359h(r9)     // Catch:{ Throwable -> 0x02b7 }
            r1.put(r2, r3)     // Catch:{ Throwable -> 0x02b7 }
            org.json.JSONObject r1 = f52198a     // Catch:{ Throwable -> 0x02b7 }
            java.lang.String r2 = "cpi_abi2"
            boolean r1 = r1.has(r2)     // Catch:{ Throwable -> 0x02b7 }
            if (r1 != 0) goto L_0x01dd
            org.json.JSONObject r1 = f52198a     // Catch:{ Throwable -> 0x02b7 }
            java.lang.String r2 = "cpi_abi2"
            java.lang.String r3 = com.p280ss.android.deviceregister.p855c.C19319c.m63360h()     // Catch:{ Throwable -> 0x02b7 }
            r1.put(r2, r3)     // Catch:{ Throwable -> 0x02b7 }
        L_0x01dd:
            java.lang.String r1 = com.p280ss.android.deviceregister.p855c.C19319c.m63363j()     // Catch:{ Throwable -> 0x02b7 }
            org.json.JSONObject r2 = f52198a     // Catch:{ Throwable -> 0x02b7 }
            java.lang.String r3 = "diaplay"
            boolean r2 = r2.has(r3)     // Catch:{ Throwable -> 0x02b7 }
            if (r2 != 0) goto L_0x0213
            org.json.JSONObject r2 = f52198a     // Catch:{ Throwable -> 0x02b7 }
            java.lang.String r3 = "diaplay"
            java.lang.String r4 = com.p280ss.android.deviceregister.p855c.C19319c.m63357g()     // Catch:{ Throwable -> 0x02b7 }
            r2.put(r3, r4)     // Catch:{ Throwable -> 0x02b7 }
            org.json.JSONObject r2 = f52198a     // Catch:{ Throwable -> 0x02b7 }
            java.lang.String r3 = "manufacturer"
            java.lang.String r4 = com.p280ss.android.deviceregister.p855c.C19319c.m63361i()     // Catch:{ Throwable -> 0x02b7 }
            r2.put(r3, r4)     // Catch:{ Throwable -> 0x02b7 }
            org.json.JSONObject r2 = f52198a     // Catch:{ Throwable -> 0x02b7 }
            java.lang.String r3 = "hardware"
            r2.put(r3, r1)     // Catch:{ Throwable -> 0x02b7 }
            org.json.JSONObject r1 = f52198a     // Catch:{ Throwable -> 0x02b7 }
            java.lang.String r2 = "product"
            java.lang.String r3 = com.p280ss.android.deviceregister.p855c.C19319c.m63365k()     // Catch:{ Throwable -> 0x02b7 }
            r1.put(r2, r3)     // Catch:{ Throwable -> 0x02b7 }
        L_0x0213:
            org.json.JSONObject r1 = f52198a     // Catch:{ Throwable -> 0x02b7 }
            java.lang.String r2 = "props"
            boolean r1 = r1.has(r2)     // Catch:{ Throwable -> 0x02b7 }
            if (r1 != 0) goto L_0x029d
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Throwable -> 0x02b7 }
            r1.<init>()     // Catch:{ Throwable -> 0x02b7 }
            r2 = 16
            java.lang.String[] r3 = new java.lang.String[r2]     // Catch:{ Throwable -> 0x02b7 }
            java.lang.String r4 = "gsm.version.baseband"
            r5 = 0
            r3[r5] = r4     // Catch:{ Throwable -> 0x02b7 }
            java.lang.String r4 = "ro.debuggable"
            r6 = 1
            r3[r6] = r4     // Catch:{ Throwable -> 0x02b7 }
            r4 = 2
            java.lang.String r6 = "ro.serialno"
            r3[r4] = r6     // Catch:{ Throwable -> 0x02b7 }
            r4 = 3
            java.lang.String r6 = "ro.boot.hardware"
            r3[r4] = r6     // Catch:{ Throwable -> 0x02b7 }
            r4 = 4
            java.lang.String r6 = "ro.build.tags"
            r3[r4] = r6     // Catch:{ Throwable -> 0x02b7 }
            r4 = 5
            java.lang.String r6 = "ro.build.date.utc"
            r3[r4] = r6     // Catch:{ Throwable -> 0x02b7 }
            r4 = 6
            java.lang.String r6 = "ro.product.name"
            r3[r4] = r6     // Catch:{ Throwable -> 0x02b7 }
            r4 = 7
            java.lang.String r6 = "gsm.network.type"
            r3[r4] = r6     // Catch:{ Throwable -> 0x02b7 }
            r4 = 8
            java.lang.String r6 = "gsm.sim.state"
            r3[r4] = r6     // Catch:{ Throwable -> 0x02b7 }
            r4 = 9
            java.lang.String r6 = "persist.sys.country"
            r3[r4] = r6     // Catch:{ Throwable -> 0x02b7 }
            r4 = 10
            java.lang.String r6 = "persist.sys.language"
            r3[r4] = r6     // Catch:{ Throwable -> 0x02b7 }
            r4 = 11
            java.lang.String r6 = "sys.usb.state"
            r3[r4] = r6     // Catch:{ Throwable -> 0x02b7 }
            r4 = 12
            java.lang.String r6 = "net.dns1"
            r3[r4] = r6     // Catch:{ Throwable -> 0x02b7 }
            r4 = 13
            java.lang.String r6 = "net.hostname"
            r3[r4] = r6     // Catch:{ Throwable -> 0x02b7 }
            r4 = 14
            java.lang.String r6 = "net.eth0.gw"
            r3[r4] = r6     // Catch:{ Throwable -> 0x02b7 }
            r4 = 15
            java.lang.String r6 = "net.gprs.local-ip"
            r3[r4] = r6     // Catch:{ Throwable -> 0x02b7 }
        L_0x027e:
            if (r5 >= r2) goto L_0x0296
            r4 = r3[r5]     // Catch:{ Throwable -> 0x02b7 }
            java.lang.String r6 = r0.mo51220a(r4)     // Catch:{ Throwable -> 0x02b7 }
            boolean r6 = com.bytedance.common.utility.C6319n.m19593a(r6)     // Catch:{ Throwable -> 0x02b7 }
            if (r6 != 0) goto L_0x0293
            java.lang.String r6 = r0.mo51220a(r4)     // Catch:{ Throwable -> 0x02b7 }
            r1.put(r4, r6)     // Catch:{ Throwable -> 0x02b7 }
        L_0x0293:
            int r5 = r5 + 1
            goto L_0x027e
        L_0x0296:
            org.json.JSONObject r0 = f52198a     // Catch:{ Throwable -> 0x02b7 }
            java.lang.String r2 = "props"
            r0.put(r2, r1)     // Catch:{ Throwable -> 0x02b7 }
        L_0x029d:
            org.json.JSONObject r0 = f52198a     // Catch:{ Throwable -> 0x02b7 }
            com.p280ss.android.deviceregister.C19325h.m63390a(r9, r0)     // Catch:{ Throwable -> 0x02b7 }
            org.json.JSONObject r9 = f52198a     // Catch:{ Throwable -> 0x02b7 }
            if (r9 == 0) goto L_0x02b6
            org.json.JSONObject r9 = f52198a     // Catch:{ Throwable -> 0x02b7 }
            int r9 = r9.length()     // Catch:{ Throwable -> 0x02b7 }
            if (r9 <= 0) goto L_0x02b6
            java.lang.String r9 = "anti_cheating"
            org.json.JSONObject r0 = f52198a     // Catch:{ JSONException -> 0x02b6 }
            r8.put(r9, r0)     // Catch:{ JSONException -> 0x02b6 }
            goto L_0x02b7
        L_0x02b6:
            return
        L_0x02b7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.deviceregister.C19295a.m63226a(org.json.JSONObject, android.content.Context):void");
    }
}
