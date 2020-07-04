package com.p280ss.android.ugc.aweme.tools.mvtemplate.p1678d;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.text.TextUtils;
import bolts.C1592h;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.p280ss.android.ugc.aweme.base.utils.C23477d;
import com.p280ss.android.ugc.aweme.draft.model.C27311c;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.mvtheme.AfrFileBean;
import com.p280ss.android.ugc.aweme.photo.C34731e;
import com.p280ss.android.ugc.aweme.photo.PhotoContext;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.video.C7276d;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import kotlin.Pair;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.d.b */
public final class C42537b {

    /* renamed from: a */
    private static String f110608a = "change_mode";

    /* renamed from: c */
    public static String m135190c() {
        return f110608a;
    }

    /* renamed from: b */
    public static String m135186b() {
        StringBuilder sb = new StringBuilder();
        sb.append(m135179a("cover_tmp"));
        sb.append(File.separator);
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(sb2);
        sb3.append(m135191c(".png"));
        return sb3.toString();
    }

    /* renamed from: a */
    public static boolean m135184a() {
        return ((IAVService) ServiceManager.get().getService(IAVService.class)).avSettingsService().showMvThemeRecordMode();
    }

    /* renamed from: d */
    public static void m135192d(String str) {
        f110608a = str;
    }

    /* renamed from: a */
    public static String m135179a(String str) {
        String b = m135187b(str);
        if (!new File(b).exists()) {
            new File(b).mkdirs();
        }
        return b;
    }

    /* renamed from: b */
    public static void m135188b(C27311c cVar) {
        if (cVar != null && cVar.mo70175Q() != null) {
            C1592h.m7853a((Callable<TResult>) new C42540e<TResult>(cVar));
        }
    }

    /* renamed from: e */
    private static boolean m135193e(String str) {
        if (!C7276d.m22812b(str)) {
            return true;
        }
        try {
            return new File(str).delete();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    static final /* synthetic */ Void m135180a(C1592h hVar) throws Exception {
        for (PhotoContext a : (List) hVar.mo6890e()) {
            C34731e.m112072a(a, C42541f.f110612a);
        }
        return null;
    }

    /* renamed from: c */
    public static String m135191c(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd-HHmmssSSS", Locale.US);
        Date time = Calendar.getInstance(TimeZone.getTimeZone("GMT+8")).getTime();
        StringBuilder sb = new StringBuilder();
        sb.append(simpleDateFormat.format(time));
        sb.append(str);
        return sb.toString();
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<java.lang.String>, for r5v0, types: [java.util.List, java.util.List<java.lang.String>] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static final /* synthetic */ java.util.List m135181a(java.util.List<java.lang.String> r5) throws java.lang.Exception {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x0009:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x002b
            java.lang.Object r1 = r5.next()
            java.lang.String r1 = (java.lang.String) r1
            int[] r2 = com.p280ss.android.ugc.aweme.tools.mvtemplate.p1678d.C42536a.m135173a(r1)
            if (r2 == 0) goto L_0x0009
            r3 = 0
            r3 = r2[r3]
            r4 = 1
            r2 = r2[r4]
            java.lang.String r4 = ""
            com.ss.android.ugc.aweme.photo.PhotoContext r1 = com.p280ss.android.ugc.aweme.photo.PhotoContext.fromUpload(r1, r3, r2, r4)
            r0.add(r1)
            goto L_0x0009
        L_0x002b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.tools.mvtemplate.p1678d.C42537b.m135181a(java.util.List):java.util.List");
    }

    /* renamed from: b */
    public static String m135187b(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(C35563c.f93238a.getFilesDir().getAbsolutePath());
        sb.append(File.separator);
        sb.append("mvtheme");
        sb.append(File.separator);
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: c */
    static final /* synthetic */ Object m135189c(C27311c cVar) throws Exception {
        ArrayList<String> arrayList = cVar.mo70175Q().selectMediaList;
        if (!C23477d.m77081a((Collection<T>) arrayList)) {
            for (String e : arrayList) {
                m135193e(e);
            }
        }
        ArrayList<AfrFileBean> arrayList2 = cVar.mo70175Q().maskFileData;
        if (!C23477d.m77081a((Collection<T>) arrayList2)) {
            for (AfrFileBean maskFiles : arrayList2) {
                for (Pair component2 : maskFiles.getMaskFiles()) {
                    m135193e((String) component2.component2());
                }
            }
        }
        m135193e(cVar.mo70175Q().videoCoverImgPath);
        m135193e(cVar.mo70175Q().contactVideoPath);
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x003c A[SYNTHETIC, Splitter:B:18:0x003c] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0045 A[SYNTHETIC, Splitter:B:25:0x0045] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static final /* synthetic */ void m135182a(android.graphics.Bitmap r4) {
        /*
            if (r4 != 0) goto L_0x0003
            return
        L_0x0003:
            com.ss.android.ugc.aweme.photo.a r0 = new com.ss.android.ugc.aweme.photo.a
            android.app.Application r1 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93238a
            r0.<init>(r1)
            java.io.File r1 = new java.io.File
            java.lang.String r0 = r0.mo88162a()
            r1.<init>(r0)
            r0 = 0
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0043, all -> 0x0037 }
            r2.<init>(r1)     // Catch:{ Exception -> 0x0043, all -> 0x0037 }
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ Exception -> 0x0035, all -> 0x0033 }
            r3 = 100
            r4.compress(r0, r3, r2)     // Catch:{ Exception -> 0x0035, all -> 0x0033 }
            r2.flush()     // Catch:{ Exception -> 0x0035, all -> 0x0033 }
            android.app.Application r0 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93238a     // Catch:{ Exception -> 0x0035, all -> 0x0033 }
            java.lang.String r1 = r1.getPath()     // Catch:{ Exception -> 0x0035, all -> 0x0033 }
            com.p280ss.android.ugc.aweme.photo.p1451a.C34727a.m112060a(r0, r1)     // Catch:{ Exception -> 0x0035, all -> 0x0033 }
            r2.close()     // Catch:{ Exception -> 0x002f }
        L_0x002f:
            r4.recycle()
            return
        L_0x0033:
            r0 = move-exception
            goto L_0x003a
        L_0x0035:
            r0 = r2
            goto L_0x0043
        L_0x0037:
            r1 = move-exception
            r2 = r0
            r0 = r1
        L_0x003a:
            if (r2 == 0) goto L_0x003f
            r2.close()     // Catch:{ Exception -> 0x003f }
        L_0x003f:
            r4.recycle()
            throw r0
        L_0x0043:
            if (r0 == 0) goto L_0x0048
            r0.close()     // Catch:{ Exception -> 0x0048 }
        L_0x0048:
            r4.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.tools.mvtemplate.p1678d.C42537b.m135182a(android.graphics.Bitmap):void");
    }

    /* renamed from: a */
    public static void m135183a(C27311c cVar) {
        if (cVar != null && cVar.mo70175Q() != null) {
            ArrayList<String> arrayList = cVar.mo70175Q().photoToSave;
            String str = cVar.mo70175Q().mvAutoSaveToast;
            if (!C23477d.m77081a((Collection<T>) arrayList) && !TextUtils.isEmpty(str)) {
                C10761a.m31403c((Context) C35563c.f93238a, str).mo25750a();
                C1592h.m7853a((Callable<TResult>) new C42538c<TResult>(arrayList)).mo6876a(C42539d.f110610a, (Executor) C1592h.f5957a);
            }
        }
    }

    /* renamed from: a */
    public static boolean m135185a(String str, String str2, int i, int i2, int i3) {
        if (!C7276d.m22812b(str)) {
            return false;
        }
        Bitmap a = C42536a.m135169a(str, i, i2, C42536a.m135174b(str), i3);
        if (a == null) {
            return false;
        }
        return C42536a.m135172a(a, new File(str2), 100, CompressFormat.PNG);
    }
}
