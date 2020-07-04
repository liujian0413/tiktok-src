package com.p280ss.android.ugc.effectmanager.common.p1730e;

import com.p280ss.android.ugc.effectmanager.common.C43707b;
import com.p280ss.android.ugc.effectmanager.common.model.UrlModel;
import com.p280ss.android.ugc.effectmanager.common.p1726a.C43703a;
import com.p280ss.android.ugc.effectmanager.common.p1726a.C43704b;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import com.p280ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43754d;
import com.p280ss.android.ugc.effectmanager.network.C43859a;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.effectmanager.common.e.c */
public final class C43731c {
    /* renamed from: a */
    public static String m138582a(ProviderEffect providerEffect) {
        if (providerEffect.sticker == null || providerEffect.sticker.url == null) {
            return "";
        }
        return providerEffect.sticker.url;
    }

    /* renamed from: b */
    public static List<String> m138587b(UrlModel urlModel) {
        if (urlModel == null || m138585a(urlModel)) {
            return new ArrayList();
        }
        return urlModel.getUrlList();
    }

    /* renamed from: a */
    public static boolean m138585a(UrlModel urlModel) {
        if (urlModel == null || urlModel.getUrlList() == null || urlModel.getUrlList().isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m138586a(Effect effect) {
        if (effect != null && !m138585a(effect.getFileUrl())) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m138584a(String str, List<Effect> list) {
        if (list != null) {
            for (Effect effect : list) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(File.separator);
                sb.append(effect.getId());
                sb.append(".zip");
                effect.setZipPath(sb.toString());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(File.separator);
                sb2.append(effect.getId());
                effect.setUnzipPath(sb2.toString());
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:4|5|(2:6|(3:8|(2:14|42)|15)(1:41))|(2:17|18)|19|20|21) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x003e */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0051 A[SYNTHETIC, Splitter:B:33:0x0051] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0058 A[SYNTHETIC, Splitter:B:37:0x0058] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.io.File m138581a(java.io.InputStream r9, java.lang.String r10, long r11, com.p280ss.android.ugc.effectmanager.effect.p1732b.C43754d r13) throws java.io.IOException {
        /*
            r0 = 0
            java.io.File r1 = new java.io.File     // Catch:{ IOException -> 0x004a }
            r1.<init>(r10)     // Catch:{ IOException -> 0x004a }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x004a }
            r2.<init>(r1)     // Catch:{ IOException -> 0x004a }
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r0 = new byte[r0]     // Catch:{ IOException -> 0x0045, all -> 0x0042 }
            r3 = 0
            r4 = 0
        L_0x0011:
            int r5 = r9.read(r0)     // Catch:{ IOException -> 0x0045, all -> 0x0042 }
            r6 = -1
            if (r5 == r6) goto L_0x0039
            int r4 = r4 + r5
            if (r13 == 0) goto L_0x0035
            long r6 = (long) r4     // Catch:{ IOException -> 0x0045, all -> 0x0042 }
            int r8 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r8 >= 0) goto L_0x0035
            r6 = 0
            int r8 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r8 <= 0) goto L_0x0035
            float r6 = (float) r4     // Catch:{ IOException -> 0x0045, all -> 0x0042 }
            r7 = 1065353216(0x3f800000, float:1.0)
            float r6 = r6 * r7
            float r7 = (float) r11     // Catch:{ IOException -> 0x0045, all -> 0x0042 }
            float r6 = r6 / r7
            r7 = 1120403456(0x42c80000, float:100.0)
            float r6 = r6 * r7
            int r6 = (int) r6     // Catch:{ IOException -> 0x0045, all -> 0x0042 }
            r13.mo105802a(r6, r11)     // Catch:{ IOException -> 0x0045, all -> 0x0042 }
        L_0x0035:
            r2.write(r0, r3, r5)     // Catch:{ IOException -> 0x0045, all -> 0x0042 }
            goto L_0x0011
        L_0x0039:
            if (r9 == 0) goto L_0x003e
            r9.close()     // Catch:{ IOException -> 0x003e }
        L_0x003e:
            r2.close()     // Catch:{ IOException -> 0x0041 }
        L_0x0041:
            return r1
        L_0x0042:
            r10 = move-exception
            r0 = r2
            goto L_0x004f
        L_0x0045:
            r11 = move-exception
            r0 = r2
            goto L_0x004b
        L_0x0048:
            r10 = move-exception
            goto L_0x004f
        L_0x004a:
            r11 = move-exception
        L_0x004b:
            com.p280ss.android.ugc.effectmanager.common.p1730e.C43733e.m138599b(r10)     // Catch:{ all -> 0x0048 }
            throw r11     // Catch:{ all -> 0x0048 }
        L_0x004f:
            if (r9 == 0) goto L_0x0056
            r9.close()     // Catch:{ IOException -> 0x0055 }
            goto L_0x0056
        L_0x0055:
        L_0x0056:
            if (r0 == 0) goto L_0x005b
            r0.close()     // Catch:{ IOException -> 0x005b }
        L_0x005b:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.effectmanager.common.p1730e.C43731c.m138581a(java.io.InputStream, java.lang.String, long, com.ss.android.ugc.effectmanager.effect.b.d):java.io.File");
    }

    /* renamed from: a */
    public static void m138583a(C43859a aVar, String str, Effect effect, C43754d dVar) throws Exception {
        InputStream inputStream = null;
        try {
            C43707b bVar = new C43707b("GET", str);
            InputStream inputStream2 = aVar.mo106116a(bVar);
            try {
                String parent = new File(effect.getZipPath()).getParent();
                if (C43703a.m138485a().mo105727a(parent) instanceof C43704b) {
                    C43704b bVar2 = (C43704b) C43703a.m138485a().mo105727a(parent);
                    String e = C43704b.m138489e(effect.getId());
                    StringBuilder sb = new StringBuilder();
                    sb.append(bVar2.f113166b.getPath());
                    sb.append(File.separator);
                    sb.append(e);
                    effect.setUnzipPath(sb.toString());
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(e);
                    sb2.append(".zip");
                    String e2 = C43704b.m138489e(sb2.toString());
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(bVar2.f113166b.getPath());
                    sb3.append(File.separator);
                    sb3.append(e2);
                    effect.setZipPath(sb3.toString());
                    bVar2.mo105733a(effect.getId(), effect.getEffectId(), e2, inputStream2, bVar.f113171c, dVar);
                } else {
                    m138581a(inputStream2, effect.getZipPath(), bVar.f113171c, dVar);
                }
                C43729a.m138574a(inputStream2);
            } catch (IOException e3) {
                e = e3;
                inputStream = inputStream2;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    inputStream2 = inputStream;
                }
            } catch (Throwable th2) {
                th = th2;
                C43729a.m138574a(inputStream2);
                throw th;
            }
        } catch (IOException e4) {
            e = e4;
            throw e;
        }
    }
}
