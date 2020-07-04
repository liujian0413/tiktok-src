package com.p280ss.android.ugc.effectmanager.common.p1726a;

import android.text.TextUtils;
import com.p280ss.android.ugc.effectmanager.C43834g;
import com.p280ss.android.ugc.effectmanager.common.p1727b.C43708a;
import com.p280ss.android.ugc.effectmanager.common.p1727b.C43714b;
import com.p280ss.android.ugc.effectmanager.common.p1730e.C43733e;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: com.ss.android.ugc.effectmanager.common.a.b */
public class C43704b extends C43705c {

    /* renamed from: c */
    private static C43704b f113157c;

    /* renamed from: f */
    private static String f113158f;

    /* renamed from: g */
    private static C43714b f113159g;

    /* renamed from: h */
    private static List<String> f113160h = Arrays.asList(new String[]{"52310", "42494", "22435", "52308", "22428", "29412", "23202", "85256", "51522", "51092", "45973", "40781"});

    /* renamed from: i */
    private static List<String> f113161i = Arrays.asList(new String[]{"52352", "42504", "50593", "249501", "22146", "166469", "221655", "234650", "240739", "203226"});

    /* renamed from: j */
    private static ArrayList<String> f113162j;

    /* renamed from: d */
    private C43708a f113163d;

    /* renamed from: e */
    private final int f113164e = 115343360;

    /* renamed from: a */
    public final synchronized void mo105730a() {
        if (this.f113166b != null) {
            if (!C43733e.m138597a(new File(this.f113166b, "journal").getPath())) {
                try {
                    this.f113163d = C43708a.m138509a(this.f113166b, 0, 1, 115343360);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    /* renamed from: a */
    public final String mo105729a(String str) {
        return super.mo105729a(str);
    }

    /* renamed from: b */
    public final InputStream mo105735b(String str) {
        return super.mo105735b(str);
    }

    /* renamed from: a */
    public final void mo105734a(Pattern pattern) {
        super.mo105734a(pattern);
    }

    private C43704b(C43834g gVar) {
        super(gVar);
        try {
            this.f113163d = C43708a.m138509a(this.f113165a.f113519j, 0, 1, 115343360);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: g */
    private static boolean m138491g(String str) {
        if (TextUtils.isEmpty(str) || !str.equals(f113158f)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final boolean mo105736c(String str) {
        try {
            this.f113163d.mo105743b(m138489e(new File(str).getName()));
        } catch (Exception unused) {
        }
        return super.mo105736c(str);
    }

    /* renamed from: d */
    public final boolean mo105737d(String str) {
        if (this.f113163d.mo105747d(str)) {
            if (super.mo105737d(str)) {
                return true;
            }
            try {
                this.f113163d.mo105743b(str);
            } catch (IOException unused) {
            }
        }
        return false;
    }

    /* renamed from: a */
    public static C43704b m138488a(C43834g gVar) {
        if (f113157c == null) {
            synchronized (C43704b.class) {
                if (f113157c == null) {
                    f113158f = gVar.f113520k;
                    f113162j = gVar.f113530u;
                    f113157c = new C43704b(gVar);
                    f113159g = new C43714b(gVar.f113519j);
                }
            }
        }
        return f113157c;
    }

    /* renamed from: e */
    public static String m138489e(String str) {
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            if (!(c == '_' || c == '-' || ((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')))) {
                charArray[i] = '_';
            }
        }
        return new String(charArray);
    }

    /* renamed from: f */
    public static boolean m138490f(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (m138491g("BR") && f113160h.contains(f113159g.mo105761a(str))) {
            return true;
        }
        if (m138491g("RU") && f113161i.contains(f113159g.mo105761a(str))) {
            return true;
        }
        if (f113162j == null || !f113162j.contains(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo105731a(Effect effect) throws Exception {
        C43733e.m138598b(effect.getZipPath(), effect.getUnzipPath());
        this.f113163d.mo105745c(new File(effect.getUnzipPath()).getName());
        f113159g.mo105762a(effect.getId(), effect.getEffectId());
        String[] split = effect.getZipPath().split(File.separator);
        this.f113163d.mo105743b(split[split.length - 1]);
    }

    /* renamed from: a */
    public final void mo105732a(String str, String str2) {
        super.mo105732a(str, str2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x007a A[SYNTHETIC, Splitter:B:46:0x007a] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x007f A[Catch:{ IOException -> 0x0087 }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0084 A[Catch:{ IOException -> 0x0087 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo105733a(java.lang.String r16, java.lang.String r17, java.lang.String r18, java.io.InputStream r19, long r20, com.p280ss.android.ugc.effectmanager.effect.p1732b.C43754d r22) {
        /*
            r15 = this;
            r1 = r19
            r2 = r20
            r0 = r22
            r4 = 0
            r5 = r15
            com.ss.android.ugc.effectmanager.common.b.a r6 = r5.f113163d     // Catch:{ IOException -> 0x006e, all -> 0x006a }
            r7 = r18
            com.ss.android.ugc.effectmanager.common.b.a$a r6 = r6.mo105739a(r7)     // Catch:{ IOException -> 0x006e, all -> 0x006a }
            r7 = 0
            java.io.OutputStream r8 = r6.mo105750a(r7)     // Catch:{ IOException -> 0x0066, all -> 0x0063 }
            r4 = 8192(0x2000, float:1.14794E-41)
            byte[] r4 = new byte[r4]     // Catch:{ IOException -> 0x0061, all -> 0x005f }
            r9 = 0
            r11 = r9
        L_0x001c:
            int r13 = r1.read(r4)     // Catch:{ IOException -> 0x0061, all -> 0x005f }
            if (r13 <= 0) goto L_0x0041
            r8.write(r4, r7, r13)     // Catch:{ IOException -> 0x0061, all -> 0x005f }
            long r13 = (long) r13     // Catch:{ IOException -> 0x0061, all -> 0x005f }
            long r11 = r11 + r13
            if (r0 == 0) goto L_0x001c
            int r13 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r13 >= 0) goto L_0x001c
            int r13 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r13 <= 0) goto L_0x001c
            float r13 = (float) r11     // Catch:{ IOException -> 0x0061, all -> 0x005f }
            r14 = 1065353216(0x3f800000, float:1.0)
            float r13 = r13 * r14
            float r14 = (float) r2     // Catch:{ IOException -> 0x0061, all -> 0x005f }
            float r13 = r13 / r14
            r14 = 1120403456(0x42c80000, float:100.0)
            float r13 = r13 * r14
            int r13 = (int) r13     // Catch:{ IOException -> 0x0061, all -> 0x005f }
            r0.mo105802a(r13, r2)     // Catch:{ IOException -> 0x0061, all -> 0x005f }
            goto L_0x001c
        L_0x0041:
            r8.close()     // Catch:{ IOException -> 0x0061, all -> 0x005f }
            com.ss.android.ugc.effectmanager.common.b.b r0 = f113159g     // Catch:{ IOException -> 0x0061, all -> 0x005f }
            r2 = r16
            r3 = r17
            r0.mo105762a(r2, r3)     // Catch:{ IOException -> 0x0061, all -> 0x005f }
            if (r1 == 0) goto L_0x0052
            r19.close()     // Catch:{ IOException -> 0x005d }
        L_0x0052:
            if (r8 == 0) goto L_0x0057
            r8.close()     // Catch:{ IOException -> 0x005d }
        L_0x0057:
            if (r6 == 0) goto L_0x005e
            r6.mo105751a()     // Catch:{ IOException -> 0x005d }
            goto L_0x005e
        L_0x005d:
            return
        L_0x005e:
            return
        L_0x005f:
            r0 = move-exception
            goto L_0x0078
        L_0x0061:
            r0 = move-exception
            goto L_0x0068
        L_0x0063:
            r0 = move-exception
            r8 = r4
            goto L_0x0078
        L_0x0066:
            r0 = move-exception
            r8 = r4
        L_0x0068:
            r4 = r6
            goto L_0x0070
        L_0x006a:
            r0 = move-exception
            r6 = r4
            r8 = r6
            goto L_0x0078
        L_0x006e:
            r0 = move-exception
            r8 = r4
        L_0x0070:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch:{ all -> 0x0076 }
            r2.<init>(r0)     // Catch:{ all -> 0x0076 }
            throw r2     // Catch:{ all -> 0x0076 }
        L_0x0076:
            r0 = move-exception
            r6 = r4
        L_0x0078:
            if (r1 == 0) goto L_0x007d
            r19.close()     // Catch:{ IOException -> 0x0087 }
        L_0x007d:
            if (r8 == 0) goto L_0x0082
            r8.close()     // Catch:{ IOException -> 0x0087 }
        L_0x0082:
            if (r6 == 0) goto L_0x0087
            r6.mo105751a()     // Catch:{ IOException -> 0x0087 }
        L_0x0087:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.effectmanager.common.p1726a.C43704b.mo105733a(java.lang.String, java.lang.String, java.lang.String, java.io.InputStream, long, com.ss.android.ugc.effectmanager.effect.b.d):void");
    }
}
