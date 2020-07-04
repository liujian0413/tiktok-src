package com.google.android.gms.internal.ads;

import java.io.File;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@C6505uv
public final class alm extends alb {

    /* renamed from: d */
    private static final Set<String> f40590d = Collections.synchronizedSet(new HashSet());

    /* renamed from: e */
    private static final DecimalFormat f40591e = new DecimalFormat("#,###");

    /* renamed from: f */
    private File f40592f;

    /* renamed from: g */
    private boolean f40593g;

    public alm(aik aik) {
        super(aik);
        File cacheDir = this.f40536a.getCacheDir();
        if (cacheDir == null) {
            acd.m45783e("Context.getCacheDir() returned null");
            return;
        }
        this.f40592f = new File(cacheDir, "admobVideoStreams");
        if (!this.f40592f.isDirectory() && !this.f40592f.mkdirs()) {
            String str = "Could not create preload cache directory at ";
            String valueOf = String.valueOf(this.f40592f.getAbsolutePath());
            acd.m45783e(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            this.f40592f = null;
        } else if (!this.f40592f.setReadable(true, false) || !this.f40592f.setExecutable(true, false)) {
            String str2 = "Could not set cache file permissions at ";
            String valueOf2 = String.valueOf(this.f40592f.getAbsolutePath());
            acd.m45783e(valueOf2.length() != 0 ? str2.concat(valueOf2) : new String(str2));
            this.f40592f = null;
        }
    }

    /* JADX WARNING: type inference failed for: r10v0 */
    /* JADX WARNING: type inference failed for: r10v1, types: [java.io.FileOutputStream] */
    /* JADX WARNING: type inference failed for: r10v2 */
    /* JADX WARNING: type inference failed for: r4v7, types: [java.io.FileOutputStream] */
    /* JADX WARNING: type inference failed for: r10v3 */
    /* JADX WARNING: type inference failed for: r25v0 */
    /* JADX WARNING: type inference failed for: r10v4 */
    /* JADX WARNING: type inference failed for: r25v1 */
    /* JADX WARNING: type inference failed for: r25v2 */
    /* JADX WARNING: type inference failed for: r4v8 */
    /* JADX WARNING: type inference failed for: r25v3 */
    /* JADX WARNING: type inference failed for: r4v9 */
    /* JADX WARNING: type inference failed for: r25v4, types: [java.io.FileOutputStream] */
    /* JADX WARNING: type inference failed for: r25v5 */
    /* JADX WARNING: type inference failed for: r10v8 */
    /* JADX WARNING: type inference failed for: r25v6 */
    /* JADX WARNING: type inference failed for: r25v7 */
    /* JADX WARNING: type inference failed for: r10v9 */
    /* JADX WARNING: type inference failed for: r10v11 */
    /* JADX WARNING: type inference failed for: r25v8, types: [int] */
    /* JADX WARNING: type inference failed for: r25v9 */
    /* JADX WARNING: type inference failed for: r10v15 */
    /* JADX WARNING: type inference failed for: r25v10 */
    /* JADX WARNING: type inference failed for: r25v11 */
    /* JADX WARNING: type inference failed for: r25v12 */
    /* JADX WARNING: type inference failed for: r4v10 */
    /* JADX WARNING: type inference failed for: r25v13 */
    /* JADX WARNING: type inference failed for: r25v14 */
    /* JADX WARNING: type inference failed for: r25v15 */
    /* JADX WARNING: type inference failed for: r10v18 */
    /* JADX WARNING: type inference failed for: r10v19 */
    /* JADX WARNING: type inference failed for: r4v28 */
    /* JADX WARNING: type inference failed for: r4v29 */
    /* JADX WARNING: type inference failed for: r10v20 */
    /* JADX WARNING: type inference failed for: r25v16 */
    /* JADX WARNING: type inference failed for: r4v30 */
    /* JADX WARNING: type inference failed for: r25v17 */
    /* JADX WARNING: type inference failed for: r25v18 */
    /* JADX WARNING: type inference failed for: r25v19 */
    /* JADX WARNING: type inference failed for: r25v20 */
    /* JADX WARNING: type inference failed for: r25v21 */
    /* JADX WARNING: type inference failed for: r25v22 */
    /* JADX WARNING: type inference failed for: r25v23 */
    /* JADX WARNING: type inference failed for: r25v24 */
    /* JADX WARNING: type inference failed for: r25v25 */
    /* JADX WARNING: type inference failed for: r25v26 */
    /* JADX WARNING: type inference failed for: r25v27 */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:211|212|213|214|215|216|217) */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01ef, code lost:
        if ((r5 instanceof java.net.HttpURLConnection) == false) goto L_0x0248;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:?, code lost:
        r1 = r5.getResponseCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01fa, code lost:
        if (r1 < 400) goto L_0x0248;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01fc, code lost:
        r2 = "badUrl";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01fe, code lost:
        r0 = "HTTP request failed. Code: ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:?, code lost:
        r3 = java.lang.String.valueOf(java.lang.Integer.toString(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x020c, code lost:
        if (r3.length() == 0) goto L_0x0214;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x020e, code lost:
        r3 = r0.concat(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0214, code lost:
        r3 = new java.lang.String(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:?, code lost:
        r5 = new java.lang.StringBuilder(java.lang.String.valueOf(r31).length() + 32);
        r5.append("HTTP status code ");
        r5.append(r1);
        r5.append(" at ");
        r5.append(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0241, code lost:
        throw new java.io.IOException(r5.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0242, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0243, code lost:
        r15 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0245, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0246, code lost:
        r15 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:?, code lost:
        r7 = r5.getContentLength();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x024c, code lost:
        if (r7 >= 0) goto L_0x0277;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x024e, code lost:
        r0 = "Stream cache aborted, missing content-length header at ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:?, code lost:
        r1 = java.lang.String.valueOf(r31);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0258, code lost:
        if (r1.length() == 0) goto L_0x025f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x025a, code lost:
        r0 = r0.concat(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x025f, code lost:
        r0 = new java.lang.String(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0265, code lost:
        com.google.android.gms.internal.ads.acd.m45783e(r0);
        mo39655a(r9, r12.getAbsolutePath(), "contentLengthMissing", null);
        f40590d.remove(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0276, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:?, code lost:
        r1 = f40591e.format((long) r7);
        r3 = ((java.lang.Integer) com.google.android.gms.internal.ads.bym.m50299d().mo41272a(com.google.android.gms.internal.ads.C15585bw.f44028r)).intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x028e, code lost:
        if (r7 <= r3) goto L_0x02e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:?, code lost:
        r2 = new java.lang.StringBuilder((java.lang.String.valueOf(r1).length() + 33) + java.lang.String.valueOf(r31).length());
        r2.append("Content length ");
        r2.append(r1);
        r2.append(" exceeds limit at ");
        r2.append(r9);
        com.google.android.gms.internal.ads.acd.m45783e(r2.toString());
        r0 = "File too big for full file cache. Size: ";
        r1 = java.lang.String.valueOf(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x02c9, code lost:
        if (r1.length() == 0) goto L_0x02d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x02cb, code lost:
        r0 = r0.concat(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x02d0, code lost:
        r0 = new java.lang.String(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x02d6, code lost:
        mo39655a(r9, r12.getAbsolutePath(), "sizeExceeded", r0);
        f40590d.remove(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x02e4, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:?, code lost:
        r4 = new java.lang.StringBuilder((java.lang.String.valueOf(r1).length() + 20) + java.lang.String.valueOf(r31).length());
        r4.append("Caching ");
        r4.append(r1);
        r4.append(" bytes from ");
        r4.append(r9);
        com.google.android.gms.internal.ads.acd.m45777b(r4.toString());
        r5 = java.nio.channels.Channels.newChannel(r5.getInputStream());
        r4 = new java.io.FileOutputStream
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:?, code lost:
        r2 = r4.getChannel();
        r1 = java.nio.ByteBuffer.allocate(1048576);
        r16 = com.google.android.gms.ads.internal.C14793ay.m42901g();
        r17 = r16.mo38684a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x033e, code lost:
        r20 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0340, code lost:
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:?, code lost:
        r10 = new com.google.android.gms.internal.ads.aeq(((java.lang.Long) com.google.android.gms.internal.ads.bym.m50299d().mo41272a(com.google.android.gms.internal.ads.C15585bw.f44031u)).longValue());
        r13 = ((java.lang.Long) com.google.android.gms.internal.ads.bym.m50299d().mo41272a(com.google.android.gms.internal.ads.C15585bw.f44030t)).longValue();
        r6 = 0;
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x035a, code lost:
        r21 = r5.read(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x035e, code lost:
        if (r21 < 0) goto L_0x0466;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0360, code lost:
        r6 = r6 + r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0362, code lost:
        if (r6 <= r3) goto L_0x039b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0364, code lost:
        r1 = "sizeExceeded";
        r0 = "File too big for full file cache. Size: ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:?, code lost:
        r2 = java.lang.String.valueOf(java.lang.Integer.toString(r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0374, code lost:
        if (r2.length() == 0) goto L_0x037c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0376, code lost:
        r10 = r0.concat(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0381, code lost:
        r10 = new java.lang.String(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0389, code lost:
        throw new java.io.IOException("stream cache file size limit exceeded");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x038a, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x038b, code lost:
        r15 = r1;
        r3 = r10;
        r1 = r20;
        r10 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0392, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0393, code lost:
        r15 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0396, code lost:
        r10 = r4;
        r1 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x039b, code lost:
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:?, code lost:
        r1.flip();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x03a2, code lost:
        if (r2.write(r1) > 0) goto L_0x039e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x03a4, code lost:
        r1.clear();
        r25 = ((r16.mo38684a() - r17) > (1000 * r13) ? 1 : ((r16.mo38684a() - r17) == (1000 * r13) ? 0 : -1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x03b5, code lost:
        if (r25 > 0) goto L_0x0429;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x03b9, code lost:
        if (r8.f40593g != false) goto L_0x041b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x03bf, code lost:
        if (r10.mo39263a() == false) goto L_0x03f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x03c1, code lost:
        r11 = r12.getAbsolutePath();
        r26 = r10;
        r10 = com.google.android.gms.internal.ads.afb.f40136a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x03c9, code lost:
        r27 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x03cb, code lost:
        r25 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x03cd, code lost:
        r22 = r1;
        r1 = r1;
        r23 = r2;
        r24 = r3;
        r25 = r4;
        r4 = r11;
        r11 = r5;
        r19 = r6;
        r29 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x03e8, code lost:
        r25 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:?, code lost:
        r1 = new com.google.android.gms.internal.ads.alc(r30, r31, r4, r6, r7, false);
        r10.post(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x03ef, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x03f0, code lost:
        r25 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x03f4, code lost:
        r22 = r1;
        r23 = r2;
        r24 = r3;
        r25 = r4;
        r11 = r5;
        r19 = r6;
        r29 = r7;
        r26 = r10;
        r27 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x0407, code lost:
        r5 = r11;
        r6 = r19;
        r1 = r22;
        r2 = r23;
        r3 = r24;
        r4 = r25;
        r10 = r26;
        r15 = r27;
        r7 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x041b, code lost:
        r25 = r4;
        r27 = r15;
        r15 = "externalAbort";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x0428, code lost:
        throw new java.io.IOException("abort requested");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x0429, code lost:
        r25 = r4;
        r27 = r15;
        r15 = "downloadTimeout";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x042f, code lost:
        r25 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:?, code lost:
        r0 = java.lang.Long.toString(r13);
        r2 = new java.lang.StringBuilder(java.lang.String.valueOf(r0).length() + 29);
        r2.append("Timeout exceeded. Limit: ");
        r2.append(r0);
        r2.append(" sec");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x045a, code lost:
        throw new java.io.IOException("stream cache time limit exceeded");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x045b, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x045c, code lost:
        r3 = r2.toString();
        r1 = r20;
        r10 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x0463, code lost:
        r0 = e;
        r25 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0466, code lost:
        r25 = r4;
        r27 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x046c, code lost:
        r25 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:?, code lost:
        r25.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x0473, code lost:
        if (com.google.android.gms.internal.ads.acd.m45776a(3) == false) goto L_0x04ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x0475, code lost:
        r1 = f40591e.format((long) r6);
        r3 = new java.lang.StringBuilder((java.lang.String.valueOf(r1).length() + 22) + java.lang.String.valueOf(r31).length());
        r3.append("Preloaded ");
        r3.append(r1);
        r3.append(" bytes from ");
        r3.append(r9);
        com.google.android.gms.internal.ads.acd.m45777b(r3.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x04ab, code lost:
        r12.setReadable(true, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x04b4, code lost:
        if (r0.isFile() == false) goto L_0x04be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x04b6, code lost:
        r0.setLastModified(java.lang.System.currentTimeMillis());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:?, code lost:
        r0.createNewFile();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x04c1, code lost:
        r25 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:?, code lost:
        mo39649a(r9, r12.getAbsolutePath(), r6);
        r25 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x04ca, code lost:
        r1 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:?, code lost:
        f40590d.remove(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x04d0, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x04d1, code lost:
        r0 = e;
        r25 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x04d3, code lost:
        r0 = e;
        r25 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x04d4, code lost:
        r1 = r20;
        r25 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x04d6, code lost:
        r10 = r25;
        r15 = r27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x04db, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x04dc, code lost:
        r25 = r4;
        r27 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x04e0, code lost:
        r1 = r20;
        r25 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x04e3, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x04e4, code lost:
        r25 = r4;
        r1 = r14;
        r27 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x04e9, code lost:
        r10 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x04eb, code lost:
        r3 = null;
        r10 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x04ed, code lost:
        r1 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x04f7, code lost:
        throw new java.io.IOException("Invalid protocol.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x04f8, code lost:
        r1 = r14;
        r27 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x0502, code lost:
        throw new java.io.IOException("Too many redirects (20)");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x0503, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x0504, code lost:
        r15 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x0507, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x0508, code lost:
        r1 = r14;
        r27 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x050b, code lost:
        r3 = null;
        r10 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x050f, code lost:
        if ((r0 instanceof java.lang.RuntimeException) != false) goto L_0x0511;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x0511, code lost:
        com.google.android.gms.ads.internal.C14793ay.m42898d().mo39089a(r0, "VideoStreamFullFileCache.preload");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:?, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x051f, code lost:
        if (r8.f40593g == false) goto L_0x0545;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x0521, code lost:
        r2 = new java.lang.StringBuilder(java.lang.String.valueOf(r31).length() + 26);
        r2.append("Preload aborted for URL \"");
        r2.append(r9);
        r2.append("\"");
        com.google.android.gms.internal.ads.acd.m45781d(r2.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x0545, code lost:
        r4 = new java.lang.StringBuilder(java.lang.String.valueOf(r31).length() + 25);
        r4.append("Preload failed for URL \"");
        r4.append(r9);
        r4.append("\"");
        com.google.android.gms.internal.ads.acd.m45780c(r4.toString(), r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x0574, code lost:
        r0 = "Could not delete partial cache file at ";
        r2 = java.lang.String.valueOf(r12.getAbsolutePath());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x0582, code lost:
        if (r2.length() == 0) goto L_0x0589;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x0584, code lost:
        r0 = r0.concat(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x0589, code lost:
        r0 = new java.lang.String(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x058f, code lost:
        com.google.android.gms.internal.ads.acd.m45783e(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x0592, code lost:
        mo39655a(r9, r12.getAbsolutePath(), r15, r3);
        f40590d.remove(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x059f, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x0407, code lost:
        r25 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0133, code lost:
        r15 = "error";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
        r1 = ((java.lang.Integer) com.google.android.gms.internal.ads.bym.m50299d().mo41272a(com.google.android.gms.internal.ads.C15585bw.f44032v)).intValue();
        r3 = new java.net.URL(r9);
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x014c, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x014f, code lost:
        if (r2 > 20) goto L_0x04f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0151, code lost:
        r5 = r3.openConnection();
        r5.setConnectTimeout(r1);
        r5.setReadTimeout(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x015d, code lost:
        if ((r5 instanceof java.net.HttpURLConnection) == false) goto L_0x04ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x015f, code lost:
        r5 = (java.net.HttpURLConnection) r5;
        r6 = new com.google.android.gms.internal.ads.afg();
        r6.mo39280a(r5, (byte[]) null);
        r5.setInstanceFollowRedirects(false);
        r7 = r5.getResponseCode();
        r6.mo39279a(r5, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0176, code lost:
        if ((r7 / 100) != 3) goto L_0x01ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:?, code lost:
        r4 = r5.getHeaderField("Location");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x017e, code lost:
        if (r4 == null) goto L_0x01e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0180, code lost:
        r6 = new java.net.URL(r3, r4);
        r3 = r6.getProtocol();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0189, code lost:
        if (r3 == null) goto L_0x01d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0191, code lost:
        if (r3.equals(com.bytedance.ies.bullet.kit.web.WebKitApi.SCHEME_HTTP) != false) goto L_0x01b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0199, code lost:
        if (r3.equals(com.bytedance.ies.bullet.kit.web.WebKitApi.SCHEME_HTTPS) != false) goto L_0x01b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x019b, code lost:
        r1 = "Unsupported scheme: ";
        r2 = java.lang.String.valueOf(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01a7, code lost:
        if (r2.length() == 0) goto L_0x01ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01a9, code lost:
        r1 = r1.concat(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01ae, code lost:
        r1 = new java.lang.String(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01b7, code lost:
        throw new java.io.IOException(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01b8, code lost:
        r3 = "Redirecting to ";
        r4 = java.lang.String.valueOf(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01c2, code lost:
        if (r4.length() == 0) goto L_0x01c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01c4, code lost:
        r3 = r3.concat(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01c9, code lost:
        r3 = new java.lang.String(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01cf, code lost:
        com.google.android.gms.internal.ads.acd.m45777b(r3);
        r5.disconnect();
        r3 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01df, code lost:
        throw new java.io.IOException("Protocol is null");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01e7, code lost:
        throw new java.io.IOException("Missing Location header in redirect");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01e8, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01e9, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01ea, code lost:
        r1 = r14;
        r10 = r10;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:211:0x04c1 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r10v3
      assigns: []
      uses: []
      mth insns count: 558
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
    /* JADX WARNING: Removed duplicated region for block: B:242:0x0511  */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x0521  */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x0545  */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x0584  */
    /* JADX WARNING: Removed duplicated region for block: B:257:0x0589  */
    /* JADX WARNING: Unknown variable types count: 17 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo39656a(java.lang.String r31) {
        /*
            r30 = this;
            r8 = r30
            r9 = r31
            java.io.File r0 = r8.f40592f
            r10 = 0
            r11 = 0
            if (r0 != 0) goto L_0x0010
            java.lang.String r0 = "noCacheDir"
            r8.mo39655a(r9, r10, r0, r10)
            return r11
        L_0x0010:
            java.io.File r0 = r8.f40592f
            if (r0 != 0) goto L_0x0016
            r3 = 0
            goto L_0x0034
        L_0x0016:
            java.io.File r0 = r8.f40592f
            java.io.File[] r0 = r0.listFiles()
            int r1 = r0.length
            r2 = 0
            r3 = 0
        L_0x001f:
            if (r2 >= r1) goto L_0x0034
            r4 = r0[r2]
            java.lang.String r4 = r4.getName()
            java.lang.String r5 = ".done"
            boolean r4 = r4.endsWith(r5)
            if (r4 != 0) goto L_0x0031
            int r3 = r3 + 1
        L_0x0031:
            int r2 = r2 + 1
            goto L_0x001f
        L_0x0034:
            com.google.android.gms.internal.ads.bl<java.lang.Integer> r0 = com.google.android.gms.internal.ads.C15585bw.f44027q
            com.google.android.gms.internal.ads.bt r1 = com.google.android.gms.internal.ads.bym.m50299d()
            java.lang.Object r0 = r1.mo41272a(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            if (r3 <= r0) goto L_0x009a
            java.io.File r0 = r8.f40592f
            if (r0 != 0) goto L_0x004c
        L_0x004a:
            r0 = 0
            goto L_0x008d
        L_0x004c:
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.io.File r2 = r8.f40592f
            java.io.File[] r2 = r2.listFiles()
            int r3 = r2.length
            r4 = r0
            r1 = r10
            r0 = 0
        L_0x005b:
            if (r0 >= r3) goto L_0x0078
            r6 = r2[r0]
            java.lang.String r7 = r6.getName()
            java.lang.String r12 = ".done"
            boolean r7 = r7.endsWith(r12)
            if (r7 != 0) goto L_0x0075
            long r12 = r6.lastModified()
            int r7 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r7 >= 0) goto L_0x0075
            r1 = r6
            r4 = r12
        L_0x0075:
            int r0 = r0 + 1
            goto L_0x005b
        L_0x0078:
            if (r1 == 0) goto L_0x004a
            boolean r0 = r1.delete()
            java.io.File r1 = r8.m46278a(r1)
            boolean r2 = r1.isFile()
            if (r2 == 0) goto L_0x008d
            boolean r1 = r1.delete()
            r0 = r0 & r1
        L_0x008d:
            if (r0 != 0) goto L_0x0010
            java.lang.String r0 = "Unable to expire stream cache"
            com.google.android.gms.internal.ads.acd.m45783e(r0)
            java.lang.String r0 = "expireFailed"
            r8.mo39655a(r9, r10, r0, r10)
            return r11
        L_0x009a:
            java.lang.String r0 = r30.mo39658b(r31)
            java.io.File r12 = new java.io.File
            java.io.File r1 = r8.f40592f
            r12.<init>(r1, r0)
            java.io.File r0 = r8.m46278a(r12)
            boolean r1 = r12.isFile()
            r13 = 1
            if (r1 == 0) goto L_0x00dd
            boolean r1 = r0.isFile()
            if (r1 == 0) goto L_0x00dd
            long r0 = r12.length()
            int r0 = (int) r0
            java.lang.String r1 = "Stream cache hit at "
            java.lang.String r2 = java.lang.String.valueOf(r31)
            int r3 = r2.length()
            if (r3 == 0) goto L_0x00cc
            java.lang.String r1 = r1.concat(r2)
            goto L_0x00d2
        L_0x00cc:
            java.lang.String r2 = new java.lang.String
            r2.<init>(r1)
            r1 = r2
        L_0x00d2:
            com.google.android.gms.internal.ads.acd.m45777b(r1)
            java.lang.String r1 = r12.getAbsolutePath()
            r8.mo39649a(r9, r1, r0)
            return r13
        L_0x00dd:
            java.io.File r1 = r8.f40592f
            java.lang.String r1 = r1.getAbsolutePath()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = java.lang.String.valueOf(r31)
            int r3 = r2.length()
            if (r3 == 0) goto L_0x00f7
            java.lang.String r1 = r1.concat(r2)
            r14 = r1
            goto L_0x00fd
        L_0x00f7:
            java.lang.String r2 = new java.lang.String
            r2.<init>(r1)
            r14 = r2
        L_0x00fd:
            java.util.Set<java.lang.String> r1 = f40590d
            monitor-enter(r1)
            java.util.Set<java.lang.String> r2 = f40590d     // Catch:{ all -> 0x05a0 }
            boolean r2 = r2.contains(r14)     // Catch:{ all -> 0x05a0 }
            if (r2 == 0) goto L_0x012d
            java.lang.String r0 = "Stream cache already in progress at "
            java.lang.String r2 = java.lang.String.valueOf(r31)     // Catch:{ all -> 0x05a0 }
            int r3 = r2.length()     // Catch:{ all -> 0x05a0 }
            if (r3 == 0) goto L_0x0119
            java.lang.String r0 = r0.concat(r2)     // Catch:{ all -> 0x05a0 }
            goto L_0x011f
        L_0x0119:
            java.lang.String r2 = new java.lang.String     // Catch:{ all -> 0x05a0 }
            r2.<init>(r0)     // Catch:{ all -> 0x05a0 }
            r0 = r2
        L_0x011f:
            com.google.android.gms.internal.ads.acd.m45783e(r0)     // Catch:{ all -> 0x05a0 }
            java.lang.String r0 = r12.getAbsolutePath()     // Catch:{ all -> 0x05a0 }
            java.lang.String r2 = "inProgress"
            r8.mo39655a(r9, r0, r2, r10)     // Catch:{ all -> 0x05a0 }
            monitor-exit(r1)     // Catch:{ all -> 0x05a0 }
            return r11
        L_0x012d:
            java.util.Set<java.lang.String> r2 = f40590d     // Catch:{ all -> 0x05a0 }
            r2.add(r14)     // Catch:{ all -> 0x05a0 }
            monitor-exit(r1)     // Catch:{ all -> 0x05a0 }
            java.lang.String r15 = "error"
            com.google.android.gms.internal.ads.bl<java.lang.Integer> r1 = com.google.android.gms.internal.ads.C15585bw.f44032v     // Catch:{ IOException | RuntimeException -> 0x0507 }
            com.google.android.gms.internal.ads.bt r2 = com.google.android.gms.internal.ads.bym.m50299d()     // Catch:{ IOException | RuntimeException -> 0x0507 }
            java.lang.Object r1 = r2.mo41272a(r1)     // Catch:{ IOException | RuntimeException -> 0x0507 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ IOException | RuntimeException -> 0x0507 }
            int r1 = r1.intValue()     // Catch:{ IOException | RuntimeException -> 0x0507 }
            java.net.URL r2 = new java.net.URL     // Catch:{ IOException | RuntimeException -> 0x0507 }
            r2.<init>(r9)     // Catch:{ IOException | RuntimeException -> 0x0507 }
            r3 = r2
            r2 = 0
        L_0x014c:
            int r2 = r2 + r13
            r4 = 20
            if (r2 > r4) goto L_0x04f8
            java.net.URLConnection r5 = r3.openConnection()     // Catch:{ IOException | RuntimeException -> 0x0507 }
            r5.setConnectTimeout(r1)     // Catch:{ IOException | RuntimeException -> 0x0507 }
            r5.setReadTimeout(r1)     // Catch:{ IOException | RuntimeException -> 0x0507 }
            boolean r6 = r5 instanceof java.net.HttpURLConnection     // Catch:{ IOException | RuntimeException -> 0x0507 }
            if (r6 == 0) goto L_0x04ed
            java.net.HttpURLConnection r5 = (java.net.HttpURLConnection) r5     // Catch:{ IOException | RuntimeException -> 0x0507 }
            com.google.android.gms.internal.ads.afg r6 = new com.google.android.gms.internal.ads.afg     // Catch:{ IOException | RuntimeException -> 0x0507 }
            r6.<init>()     // Catch:{ IOException | RuntimeException -> 0x0507 }
            r6.mo39280a(r5, r10)     // Catch:{ IOException | RuntimeException -> 0x0507 }
            r5.setInstanceFollowRedirects(r11)     // Catch:{ IOException | RuntimeException -> 0x0507 }
            int r7 = r5.getResponseCode()     // Catch:{ IOException | RuntimeException -> 0x0507 }
            r6.mo39279a(r5, r7)     // Catch:{ IOException | RuntimeException -> 0x0507 }
            int r7 = r7 / 100
            r6 = 3
            if (r7 != r6) goto L_0x01ed
            java.lang.String r4 = "Location"
            java.lang.String r4 = r5.getHeaderField(r4)     // Catch:{ IOException | RuntimeException -> 0x01e8 }
            if (r4 == 0) goto L_0x01e0
            java.net.URL r6 = new java.net.URL     // Catch:{ IOException | RuntimeException -> 0x01e8 }
            r6.<init>(r3, r4)     // Catch:{ IOException | RuntimeException -> 0x01e8 }
            java.lang.String r3 = r6.getProtocol()     // Catch:{ IOException | RuntimeException -> 0x01e8 }
            if (r3 == 0) goto L_0x01d8
            java.lang.String r7 = "http"
            boolean r7 = r3.equals(r7)     // Catch:{ IOException | RuntimeException -> 0x01e8 }
            if (r7 != 0) goto L_0x01b8
            java.lang.String r7 = "https"
            boolean r7 = r3.equals(r7)     // Catch:{ IOException | RuntimeException -> 0x01e8 }
            if (r7 != 0) goto L_0x01b8
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException | RuntimeException -> 0x01e8 }
            java.lang.String r1 = "Unsupported scheme: "
            java.lang.String r2 = java.lang.String.valueOf(r3)     // Catch:{ IOException | RuntimeException -> 0x01e8 }
            int r3 = r2.length()     // Catch:{ IOException | RuntimeException -> 0x01e8 }
            if (r3 == 0) goto L_0x01ae
            java.lang.String r1 = r1.concat(r2)     // Catch:{ IOException | RuntimeException -> 0x01e8 }
            goto L_0x01b4
        L_0x01ae:
            java.lang.String r2 = new java.lang.String     // Catch:{ IOException | RuntimeException -> 0x01e8 }
            r2.<init>(r1)     // Catch:{ IOException | RuntimeException -> 0x01e8 }
            r1 = r2
        L_0x01b4:
            r0.<init>(r1)     // Catch:{ IOException | RuntimeException -> 0x01e8 }
            throw r0     // Catch:{ IOException | RuntimeException -> 0x01e8 }
        L_0x01b8:
            java.lang.String r3 = "Redirecting to "
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ IOException | RuntimeException -> 0x01e8 }
            int r7 = r4.length()     // Catch:{ IOException | RuntimeException -> 0x01e8 }
            if (r7 == 0) goto L_0x01c9
            java.lang.String r3 = r3.concat(r4)     // Catch:{ IOException | RuntimeException -> 0x01e8 }
            goto L_0x01cf
        L_0x01c9:
            java.lang.String r4 = new java.lang.String     // Catch:{ IOException | RuntimeException -> 0x01e8 }
            r4.<init>(r3)     // Catch:{ IOException | RuntimeException -> 0x01e8 }
            r3 = r4
        L_0x01cf:
            com.google.android.gms.internal.ads.acd.m45777b(r3)     // Catch:{ IOException | RuntimeException -> 0x01e8 }
            r5.disconnect()     // Catch:{ IOException | RuntimeException -> 0x01e8 }
            r3 = r6
            goto L_0x014c
        L_0x01d8:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException | RuntimeException -> 0x01e8 }
            java.lang.String r1 = "Protocol is null"
            r0.<init>(r1)     // Catch:{ IOException | RuntimeException -> 0x01e8 }
            throw r0     // Catch:{ IOException | RuntimeException -> 0x01e8 }
        L_0x01e0:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException | RuntimeException -> 0x01e8 }
            java.lang.String r1 = "Missing Location header in redirect"
            r0.<init>(r1)     // Catch:{ IOException | RuntimeException -> 0x01e8 }
            throw r0     // Catch:{ IOException | RuntimeException -> 0x01e8 }
        L_0x01e8:
            r0 = move-exception
        L_0x01e9:
            r3 = r10
        L_0x01ea:
            r1 = r14
            goto L_0x050d
        L_0x01ed:
            boolean r1 = r5 instanceof java.net.HttpURLConnection     // Catch:{ IOException | RuntimeException -> 0x0507 }
            if (r1 == 0) goto L_0x0248
            r1 = r5
            java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1     // Catch:{ IOException | RuntimeException -> 0x01e8 }
            int r1 = r1.getResponseCode()     // Catch:{ IOException | RuntimeException -> 0x01e8 }
            r2 = 400(0x190, float:5.6E-43)
            if (r1 < r2) goto L_0x0248
            java.lang.String r2 = "badUrl"
            java.lang.String r0 = "HTTP request failed. Code: "
            java.lang.String r3 = java.lang.Integer.toString(r1)     // Catch:{ IOException | RuntimeException -> 0x0245 }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ IOException | RuntimeException -> 0x0245 }
            int r4 = r3.length()     // Catch:{ IOException | RuntimeException -> 0x0245 }
            if (r4 == 0) goto L_0x0214
            java.lang.String r0 = r0.concat(r3)     // Catch:{ IOException | RuntimeException -> 0x0245 }
            r3 = r0
            goto L_0x0219
        L_0x0214:
            java.lang.String r3 = new java.lang.String     // Catch:{ IOException | RuntimeException -> 0x0245 }
            r3.<init>(r0)     // Catch:{ IOException | RuntimeException -> 0x0245 }
        L_0x0219:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException | RuntimeException -> 0x0242 }
            java.lang.String r4 = java.lang.String.valueOf(r31)     // Catch:{ IOException | RuntimeException -> 0x0242 }
            int r4 = r4.length()     // Catch:{ IOException | RuntimeException -> 0x0242 }
            int r4 = r4 + 32
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException | RuntimeException -> 0x0242 }
            r5.<init>(r4)     // Catch:{ IOException | RuntimeException -> 0x0242 }
            java.lang.String r4 = "HTTP status code "
            r5.append(r4)     // Catch:{ IOException | RuntimeException -> 0x0242 }
            r5.append(r1)     // Catch:{ IOException | RuntimeException -> 0x0242 }
            java.lang.String r1 = " at "
            r5.append(r1)     // Catch:{ IOException | RuntimeException -> 0x0242 }
            r5.append(r9)     // Catch:{ IOException | RuntimeException -> 0x0242 }
            java.lang.String r1 = r5.toString()     // Catch:{ IOException | RuntimeException -> 0x0242 }
            r0.<init>(r1)     // Catch:{ IOException | RuntimeException -> 0x0242 }
            throw r0     // Catch:{ IOException | RuntimeException -> 0x0242 }
        L_0x0242:
            r0 = move-exception
            r15 = r2
            goto L_0x01ea
        L_0x0245:
            r0 = move-exception
            r15 = r2
            goto L_0x01e9
        L_0x0248:
            int r7 = r5.getContentLength()     // Catch:{ IOException | RuntimeException -> 0x0507 }
            if (r7 >= 0) goto L_0x0277
            java.lang.String r0 = "Stream cache aborted, missing content-length header at "
            java.lang.String r1 = java.lang.String.valueOf(r31)     // Catch:{ IOException | RuntimeException -> 0x01e8 }
            int r2 = r1.length()     // Catch:{ IOException | RuntimeException -> 0x01e8 }
            if (r2 == 0) goto L_0x025f
            java.lang.String r0 = r0.concat(r1)     // Catch:{ IOException | RuntimeException -> 0x01e8 }
            goto L_0x0265
        L_0x025f:
            java.lang.String r1 = new java.lang.String     // Catch:{ IOException | RuntimeException -> 0x01e8 }
            r1.<init>(r0)     // Catch:{ IOException | RuntimeException -> 0x01e8 }
            r0 = r1
        L_0x0265:
            com.google.android.gms.internal.ads.acd.m45783e(r0)     // Catch:{ IOException | RuntimeException -> 0x01e8 }
            java.lang.String r0 = r12.getAbsolutePath()     // Catch:{ IOException | RuntimeException -> 0x01e8 }
            java.lang.String r1 = "contentLengthMissing"
            r8.mo39655a(r9, r0, r1, r10)     // Catch:{ IOException | RuntimeException -> 0x01e8 }
            java.util.Set<java.lang.String> r0 = f40590d     // Catch:{ IOException | RuntimeException -> 0x01e8 }
            r0.remove(r14)     // Catch:{ IOException | RuntimeException -> 0x01e8 }
            return r11
        L_0x0277:
            java.text.DecimalFormat r1 = f40591e     // Catch:{ IOException | RuntimeException -> 0x0507 }
            long r2 = (long) r7     // Catch:{ IOException | RuntimeException -> 0x0507 }
            java.lang.String r1 = r1.format(r2)     // Catch:{ IOException | RuntimeException -> 0x0507 }
            com.google.android.gms.internal.ads.bl<java.lang.Integer> r2 = com.google.android.gms.internal.ads.C15585bw.f44028r     // Catch:{ IOException | RuntimeException -> 0x0507 }
            com.google.android.gms.internal.ads.bt r3 = com.google.android.gms.internal.ads.bym.m50299d()     // Catch:{ IOException | RuntimeException -> 0x0507 }
            java.lang.Object r2 = r3.mo41272a(r2)     // Catch:{ IOException | RuntimeException -> 0x0507 }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ IOException | RuntimeException -> 0x0507 }
            int r3 = r2.intValue()     // Catch:{ IOException | RuntimeException -> 0x0507 }
            if (r7 <= r3) goto L_0x02e5
            java.lang.String r0 = java.lang.String.valueOf(r1)     // Catch:{ IOException | RuntimeException -> 0x01e8 }
            int r0 = r0.length()     // Catch:{ IOException | RuntimeException -> 0x01e8 }
            int r0 = r0 + 33
            java.lang.String r2 = java.lang.String.valueOf(r31)     // Catch:{ IOException | RuntimeException -> 0x01e8 }
            int r2 = r2.length()     // Catch:{ IOException | RuntimeException -> 0x01e8 }
            int r0 = r0 + r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException | RuntimeException -> 0x01e8 }
            r2.<init>(r0)     // Catch:{ IOException | RuntimeException -> 0x01e8 }
            java.lang.String r0 = "Content length "
            r2.append(r0)     // Catch:{ IOException | RuntimeException -> 0x01e8 }
            r2.append(r1)     // Catch:{ IOException | RuntimeException -> 0x01e8 }
            java.lang.String r0 = " exceeds limit at "
            r2.append(r0)     // Catch:{ IOException | RuntimeException -> 0x01e8 }
            r2.append(r9)     // Catch:{ IOException | RuntimeException -> 0x01e8 }
            java.lang.String r0 = r2.toString()     // Catch:{ IOException | RuntimeException -> 0x01e8 }
            com.google.android.gms.internal.ads.acd.m45783e(r0)     // Catch:{ IOException | RuntimeException -> 0x01e8 }
            java.lang.String r0 = "File too big for full file cache. Size: "
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ IOException | RuntimeException -> 0x01e8 }
            int r2 = r1.length()     // Catch:{ IOException | RuntimeException -> 0x01e8 }
            if (r2 == 0) goto L_0x02d0
            java.lang.String r0 = r0.concat(r1)     // Catch:{ IOException | RuntimeException -> 0x01e8 }
            goto L_0x02d6
        L_0x02d0:
            java.lang.String r1 = new java.lang.String     // Catch:{ IOException | RuntimeException -> 0x01e8 }
            r1.<init>(r0)     // Catch:{ IOException | RuntimeException -> 0x01e8 }
            r0 = r1
        L_0x02d6:
            java.lang.String r1 = r12.getAbsolutePath()     // Catch:{ IOException | RuntimeException -> 0x01e8 }
            java.lang.String r2 = "sizeExceeded"
            r8.mo39655a(r9, r1, r2, r0)     // Catch:{ IOException | RuntimeException -> 0x01e8 }
            java.util.Set<java.lang.String> r0 = f40590d     // Catch:{ IOException | RuntimeException -> 0x01e8 }
            r0.remove(r14)     // Catch:{ IOException | RuntimeException -> 0x01e8 }
            return r11
        L_0x02e5:
            java.lang.String r2 = java.lang.String.valueOf(r1)     // Catch:{ IOException | RuntimeException -> 0x0507 }
            int r2 = r2.length()     // Catch:{ IOException | RuntimeException -> 0x0507 }
            int r2 = r2 + r4
            java.lang.String r4 = java.lang.String.valueOf(r31)     // Catch:{ IOException | RuntimeException -> 0x0507 }
            int r4 = r4.length()     // Catch:{ IOException | RuntimeException -> 0x0507 }
            int r2 = r2 + r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException | RuntimeException -> 0x0507 }
            r4.<init>(r2)     // Catch:{ IOException | RuntimeException -> 0x0507 }
            java.lang.String r2 = "Caching "
            r4.append(r2)     // Catch:{ IOException | RuntimeException -> 0x0507 }
            r4.append(r1)     // Catch:{ IOException | RuntimeException -> 0x0507 }
            java.lang.String r1 = " bytes from "
            r4.append(r1)     // Catch:{ IOException | RuntimeException -> 0x0507 }
            r4.append(r9)     // Catch:{ IOException | RuntimeException -> 0x0507 }
            java.lang.String r1 = r4.toString()     // Catch:{ IOException | RuntimeException -> 0x0507 }
            com.google.android.gms.internal.ads.acd.m45777b(r1)     // Catch:{ IOException | RuntimeException -> 0x0507 }
            java.io.InputStream r1 = r5.getInputStream()     // Catch:{ IOException | RuntimeException -> 0x0507 }
            java.nio.channels.ReadableByteChannel r5 = java.nio.channels.Channels.newChannel(r1)     // Catch:{ IOException | RuntimeException -> 0x0507 }
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ IOException | RuntimeException -> 0x0507 }
            r4.<init>(r12)     // Catch:{ IOException | RuntimeException -> 0x0507 }
            java.nio.channels.FileChannel r2 = r4.getChannel()     // Catch:{ IOException | RuntimeException -> 0x04e3 }
            r1 = 1048576(0x100000, float:1.469368E-39)
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r1)     // Catch:{ IOException | RuntimeException -> 0x04e3 }
            com.google.android.gms.common.util.e r16 = com.google.android.gms.ads.internal.C14793ay.m42901g()     // Catch:{ IOException | RuntimeException -> 0x04e3 }
            long r17 = r16.mo38684a()     // Catch:{ IOException | RuntimeException -> 0x04e3 }
            com.google.android.gms.internal.ads.bl<java.lang.Long> r6 = com.google.android.gms.internal.ads.C15585bw.f44031u     // Catch:{ IOException | RuntimeException -> 0x04e3 }
            com.google.android.gms.internal.ads.bt r10 = com.google.android.gms.internal.ads.bym.m50299d()     // Catch:{ IOException | RuntimeException -> 0x04e3 }
            java.lang.Object r6 = r10.mo41272a(r6)     // Catch:{ IOException | RuntimeException -> 0x04e3 }
            java.lang.Long r6 = (java.lang.Long) r6     // Catch:{ IOException | RuntimeException -> 0x04e3 }
            r20 = r14
            long r13 = r6.longValue()     // Catch:{ IOException | RuntimeException -> 0x04db }
            com.google.android.gms.internal.ads.aeq r10 = new com.google.android.gms.internal.ads.aeq     // Catch:{ IOException | RuntimeException -> 0x04db }
            r10.<init>(r13)     // Catch:{ IOException | RuntimeException -> 0x04db }
            com.google.android.gms.internal.ads.bl<java.lang.Long> r6 = com.google.android.gms.internal.ads.C15585bw.f44030t     // Catch:{ IOException | RuntimeException -> 0x04db }
            com.google.android.gms.internal.ads.bt r13 = com.google.android.gms.internal.ads.bym.m50299d()     // Catch:{ IOException | RuntimeException -> 0x04db }
            java.lang.Object r6 = r13.mo41272a(r6)     // Catch:{ IOException | RuntimeException -> 0x04db }
            java.lang.Long r6 = (java.lang.Long) r6     // Catch:{ IOException | RuntimeException -> 0x04db }
            long r13 = r6.longValue()     // Catch:{ IOException | RuntimeException -> 0x04db }
            r6 = 0
        L_0x035a:
            int r21 = r5.read(r1)     // Catch:{ IOException | RuntimeException -> 0x04db }
            if (r21 < 0) goto L_0x0466
            int r6 = r6 + r21
            if (r6 <= r3) goto L_0x039b
            java.lang.String r1 = "sizeExceeded"
            java.lang.String r0 = "File too big for full file cache. Size: "
            java.lang.String r2 = java.lang.Integer.toString(r6)     // Catch:{ IOException | RuntimeException -> 0x0392 }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ IOException | RuntimeException -> 0x0392 }
            int r3 = r2.length()     // Catch:{ IOException | RuntimeException -> 0x0392 }
            if (r3 == 0) goto L_0x037c
            java.lang.String r0 = r0.concat(r2)     // Catch:{ IOException | RuntimeException -> 0x0392 }
            r10 = r0
            goto L_0x0382
        L_0x037c:
            java.lang.String r2 = new java.lang.String     // Catch:{ IOException | RuntimeException -> 0x0392 }
            r2.<init>(r0)     // Catch:{ IOException | RuntimeException -> 0x0392 }
            r10 = r2
        L_0x0382:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException | RuntimeException -> 0x038a }
            java.lang.String r2 = "stream cache file size limit exceeded"
            r0.<init>(r2)     // Catch:{ IOException | RuntimeException -> 0x038a }
            throw r0     // Catch:{ IOException | RuntimeException -> 0x038a }
        L_0x038a:
            r0 = move-exception
            r15 = r1
            r3 = r10
            r1 = r20
            r10 = r4
            goto L_0x050d
        L_0x0392:
            r0 = move-exception
            r15 = r1
            goto L_0x0396
        L_0x0395:
            r0 = move-exception
        L_0x0396:
            r10 = r4
            r1 = r20
            goto L_0x04eb
        L_0x039b:
            r1.flip()     // Catch:{ IOException | RuntimeException -> 0x04db }
        L_0x039e:
            int r21 = r2.write(r1)     // Catch:{ IOException | RuntimeException -> 0x04db }
            if (r21 > 0) goto L_0x039e
            r1.clear()     // Catch:{ IOException | RuntimeException -> 0x04db }
            long r21 = r16.mo38684a()     // Catch:{ IOException | RuntimeException -> 0x04db }
            r23 = 0
            long r21 = r21 - r17
            r23 = 1000(0x3e8, double:4.94E-321)
            long r23 = r23 * r13
            int r25 = (r21 > r23 ? 1 : (r21 == r23 ? 0 : -1))
            if (r25 > 0) goto L_0x0429
            boolean r11 = r8.f40593g     // Catch:{ IOException | RuntimeException -> 0x04db }
            if (r11 != 0) goto L_0x041b
            boolean r11 = r10.mo39263a()     // Catch:{ IOException | RuntimeException -> 0x04db }
            if (r11 == 0) goto L_0x03f4
            java.lang.String r11 = r12.getAbsolutePath()     // Catch:{ IOException | RuntimeException -> 0x04db }
            r26 = r10
            android.os.Handler r10 = com.google.android.gms.internal.ads.afb.f40136a     // Catch:{ IOException | RuntimeException -> 0x04db }
            r27 = r15
            com.google.android.gms.internal.ads.alc r15 = new com.google.android.gms.internal.ads.alc     // Catch:{ IOException | RuntimeException -> 0x03ef }
            r21 = 0
            r22 = r1
            r1 = r15
            r23 = r2
            r2 = r30
            r24 = r3
            r3 = r31
            r25 = r4
            r4 = r11
            r11 = r5
            r5 = r6
            r19 = r6
            r28 = 3
            r6 = r7
            r29 = r7
            r7 = r21
            r1.<init>(r2, r3, r4, r5, r6, r7)     // Catch:{ IOException | RuntimeException -> 0x04d3 }
            r10.post(r15)     // Catch:{ IOException | RuntimeException -> 0x04d3 }
            goto L_0x0407
        L_0x03ef:
            r0 = move-exception
            r25 = r4
            goto L_0x04d4
        L_0x03f4:
            r22 = r1
            r23 = r2
            r24 = r3
            r25 = r4
            r11 = r5
            r19 = r6
            r29 = r7
            r26 = r10
            r27 = r15
            r28 = 3
        L_0x0407:
            r5 = r11
            r6 = r19
            r1 = r22
            r2 = r23
            r3 = r24
            r4 = r25
            r10 = r26
            r15 = r27
            r7 = r29
            r11 = 0
            goto L_0x035a
        L_0x041b:
            r25 = r4
            r27 = r15
            java.lang.String r15 = "externalAbort"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException | RuntimeException -> 0x0463 }
            java.lang.String r1 = "abort requested"
            r0.<init>(r1)     // Catch:{ IOException | RuntimeException -> 0x0463 }
            throw r0     // Catch:{ IOException | RuntimeException -> 0x0463 }
        L_0x0429:
            r25 = r4
            r27 = r15
            java.lang.String r15 = "downloadTimeout"
            java.lang.String r0 = java.lang.Long.toString(r13)     // Catch:{ IOException | RuntimeException -> 0x0463 }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ IOException | RuntimeException -> 0x0463 }
            int r1 = r1.length()     // Catch:{ IOException | RuntimeException -> 0x0463 }
            int r1 = r1 + 29
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException | RuntimeException -> 0x0463 }
            r2.<init>(r1)     // Catch:{ IOException | RuntimeException -> 0x0463 }
            java.lang.String r1 = "Timeout exceeded. Limit: "
            r2.append(r1)     // Catch:{ IOException | RuntimeException -> 0x0463 }
            r2.append(r0)     // Catch:{ IOException | RuntimeException -> 0x0463 }
            java.lang.String r0 = " sec"
            r2.append(r0)     // Catch:{ IOException | RuntimeException -> 0x0463 }
            java.lang.String r10 = r2.toString()     // Catch:{ IOException | RuntimeException -> 0x0463 }
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException | RuntimeException -> 0x045b }
            java.lang.String r1 = "stream cache time limit exceeded"
            r0.<init>(r1)     // Catch:{ IOException | RuntimeException -> 0x045b }
            throw r0     // Catch:{ IOException | RuntimeException -> 0x045b }
        L_0x045b:
            r0 = move-exception
            r3 = r10
            r1 = r20
            r10 = r25
            goto L_0x050d
        L_0x0463:
            r0 = move-exception
            goto L_0x04e0
        L_0x0466:
            r25 = r4
            r27 = r15
            r28 = 3
            r25.close()     // Catch:{ IOException | RuntimeException -> 0x04d3 }
            boolean r1 = com.google.android.gms.internal.ads.acd.m45776a(r28)     // Catch:{ IOException | RuntimeException -> 0x04d3 }
            if (r1 == 0) goto L_0x04ab
            java.text.DecimalFormat r1 = f40591e     // Catch:{ IOException | RuntimeException -> 0x04d3 }
            long r2 = (long) r6     // Catch:{ IOException | RuntimeException -> 0x04d3 }
            java.lang.String r1 = r1.format(r2)     // Catch:{ IOException | RuntimeException -> 0x04d3 }
            java.lang.String r2 = java.lang.String.valueOf(r1)     // Catch:{ IOException | RuntimeException -> 0x04d3 }
            int r2 = r2.length()     // Catch:{ IOException | RuntimeException -> 0x04d3 }
            int r2 = r2 + 22
            java.lang.String r3 = java.lang.String.valueOf(r31)     // Catch:{ IOException | RuntimeException -> 0x04d3 }
            int r3 = r3.length()     // Catch:{ IOException | RuntimeException -> 0x04d3 }
            int r2 = r2 + r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException | RuntimeException -> 0x04d3 }
            r3.<init>(r2)     // Catch:{ IOException | RuntimeException -> 0x04d3 }
            java.lang.String r2 = "Preloaded "
            r3.append(r2)     // Catch:{ IOException | RuntimeException -> 0x04d3 }
            r3.append(r1)     // Catch:{ IOException | RuntimeException -> 0x04d3 }
            java.lang.String r1 = " bytes from "
            r3.append(r1)     // Catch:{ IOException | RuntimeException -> 0x04d3 }
            r3.append(r9)     // Catch:{ IOException | RuntimeException -> 0x04d3 }
            java.lang.String r1 = r3.toString()     // Catch:{ IOException | RuntimeException -> 0x04d3 }
            com.google.android.gms.internal.ads.acd.m45777b(r1)     // Catch:{ IOException | RuntimeException -> 0x04d3 }
        L_0x04ab:
            r1 = 0
            r2 = 1
            r12.setReadable(r2, r1)     // Catch:{ IOException | RuntimeException -> 0x04d3 }
            boolean r1 = r0.isFile()     // Catch:{ IOException | RuntimeException -> 0x04d3 }
            if (r1 == 0) goto L_0x04be
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ IOException | RuntimeException -> 0x04d3 }
            r0.setLastModified(r1)     // Catch:{ IOException | RuntimeException -> 0x04d3 }
            goto L_0x04c1
        L_0x04be:
            r0.createNewFile()     // Catch:{ IOException -> 0x04c1 }
        L_0x04c1:
            java.lang.String r0 = r12.getAbsolutePath()     // Catch:{ IOException | RuntimeException -> 0x04d3 }
            r8.mo39649a(r9, r0, r6)     // Catch:{ IOException | RuntimeException -> 0x04d3 }
            java.util.Set<java.lang.String> r0 = f40590d     // Catch:{ IOException | RuntimeException -> 0x04d3 }
            r1 = r20
            r0.remove(r1)     // Catch:{ IOException | RuntimeException -> 0x04d1 }
            r0 = 1
            return r0
        L_0x04d1:
            r0 = move-exception
            goto L_0x04d6
        L_0x04d3:
            r0 = move-exception
        L_0x04d4:
            r1 = r20
        L_0x04d6:
            r10 = r25
            r15 = r27
            goto L_0x04eb
        L_0x04db:
            r0 = move-exception
            r25 = r4
            r27 = r15
        L_0x04e0:
            r1 = r20
            goto L_0x04e9
        L_0x04e3:
            r0 = move-exception
            r25 = r4
            r1 = r14
            r27 = r15
        L_0x04e9:
            r10 = r25
        L_0x04eb:
            r3 = 0
            goto L_0x050d
        L_0x04ed:
            r1 = r14
            r27 = r15
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException | RuntimeException -> 0x0503 }
            java.lang.String r2 = "Invalid protocol."
            r0.<init>(r2)     // Catch:{ IOException | RuntimeException -> 0x0503 }
            throw r0     // Catch:{ IOException | RuntimeException -> 0x0503 }
        L_0x04f8:
            r1 = r14
            r27 = r15
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException | RuntimeException -> 0x0503 }
            java.lang.String r2 = "Too many redirects (20)"
            r0.<init>(r2)     // Catch:{ IOException | RuntimeException -> 0x0503 }
            throw r0     // Catch:{ IOException | RuntimeException -> 0x0503 }
        L_0x0503:
            r0 = move-exception
            r15 = r27
            goto L_0x050b
        L_0x0507:
            r0 = move-exception
            r1 = r14
            r27 = r15
        L_0x050b:
            r3 = 0
            r10 = 0
        L_0x050d:
            boolean r2 = r0 instanceof java.lang.RuntimeException
            if (r2 == 0) goto L_0x051a
            com.google.android.gms.internal.ads.abp r2 = com.google.android.gms.ads.internal.C14793ay.m42898d()
            java.lang.String r4 = "VideoStreamFullFileCache.preload"
            r2.mo39089a(r0, r4)
        L_0x051a:
            r10.close()     // Catch:{ IOException | NullPointerException -> 0x051d }
        L_0x051d:
            boolean r2 = r8.f40593g
            if (r2 == 0) goto L_0x0545
            java.lang.String r0 = java.lang.String.valueOf(r31)
            int r0 = r0.length()
            int r0 = r0 + 26
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            java.lang.String r0 = "Preload aborted for URL \""
            r2.append(r0)
            r2.append(r9)
            java.lang.String r0 = "\""
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.google.android.gms.internal.ads.acd.m45781d(r0)
            goto L_0x0568
        L_0x0545:
            java.lang.String r2 = java.lang.String.valueOf(r31)
            int r2 = r2.length()
            int r2 = r2 + 25
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r2)
            java.lang.String r2 = "Preload failed for URL \""
            r4.append(r2)
            r4.append(r9)
            java.lang.String r2 = "\""
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            com.google.android.gms.internal.ads.acd.m45780c(r2, r0)
        L_0x0568:
            boolean r0 = r12.exists()
            if (r0 == 0) goto L_0x0592
            boolean r0 = r12.delete()
            if (r0 != 0) goto L_0x0592
            java.lang.String r0 = "Could not delete partial cache file at "
            java.lang.String r2 = r12.getAbsolutePath()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            int r4 = r2.length()
            if (r4 == 0) goto L_0x0589
            java.lang.String r0 = r0.concat(r2)
            goto L_0x058f
        L_0x0589:
            java.lang.String r2 = new java.lang.String
            r2.<init>(r0)
            r0 = r2
        L_0x058f:
            com.google.android.gms.internal.ads.acd.m45783e(r0)
        L_0x0592:
            java.lang.String r0 = r12.getAbsolutePath()
            r8.mo39655a(r9, r0, r15, r3)
            java.util.Set<java.lang.String> r0 = f40590d
            r0.remove(r1)
            r1 = 0
            return r1
        L_0x05a0:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x05a0 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.alm.mo39656a(java.lang.String):boolean");
    }

    /* renamed from: a */
    public final void mo39647a() {
        this.f40593g = true;
    }

    /* renamed from: a */
    private final File m46278a(File file) {
        return new File(this.f40592f, String.valueOf(file.getName()).concat(".done"));
    }
}
