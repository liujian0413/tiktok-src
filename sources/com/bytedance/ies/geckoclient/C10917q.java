package com.bytedance.ies.geckoclient;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.ies.geckoclient.debug.C10859b;
import com.bytedance.ies.geckoclient.model.C10903d;
import com.bytedance.ies.geckoclient.model.C10909j;
import com.bytedance.ies.geckoclient.model.C10909j.C10911b;
import com.bytedance.ies.geckoclient.model.C10912k;
import com.bytedance.ies.geckoclient.model.PackageStatisticModel;
import com.bytedance.ies.geckoclient.model.PackageStatisticModel.C10892a;
import com.bytedance.ies.geckoclient.p570d.C10852a;
import com.bytedance.ies.geckoclient.p571e.C10867d;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import com.p280ss.android.vesdk.filterparam.VETransitionFilterParam;
import java.io.File;
import java.util.List;
import java.util.UUID;

/* renamed from: com.bytedance.ies.geckoclient.q */
final class C10917q extends C10835a {

    /* renamed from: b */
    public C10912k f29561b;

    /* renamed from: c */
    private C10903d f29562c;

    /* renamed from: d */
    private String f29563d;

    /* renamed from: e */
    private C10889k f29564e;

    /* renamed from: f */
    private int f29565f;

    /* renamed from: g */
    private int f29566g = 1000;

    /* renamed from: h */
    private boolean f29567h;

    /* renamed from: i */
    private C10873f f29568i;

    /* renamed from: j */
    private boolean f29569j;

    /* renamed from: k */
    private PackageStatisticModel f29570k;

    /* renamed from: l */
    private String f29571l = UUID.randomUUID().toString();

    /* renamed from: a */
    private void m32008a(C10909j jVar, String str) throws Exception {
        String str2 = this.f29562c.f29508c;
        StringBuilder sb = new StringBuilder();
        sb.append(jVar.f29540a);
        C10859b.m31866a(str2, "开始下载差量包", " version:", sb.toString(), " url:", str);
        this.f29567h = true;
        this.f29564e.mo26216a(this.f29567h, 0, this.f29562c);
        String[] split = str.split("/");
        String str3 = split[split.length - 1];
        new StringBuilder("download patch:").append(str);
        new StringBuilder("patch:").append(str3);
        jVar.mo26310b().f29553e = str3;
        this.f29565f = 1;
        this.f29566g = 301;
        try {
            long uptimeMillis = SystemClock.uptimeMillis();
            String a = m32003a(str, str3);
            this.f29570k.setDownloadDuration(Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis));
            C10859b.m31866a(this.f29562c.f29508c, "下载成功", " filePath:", a);
            long uptimeMillis2 = SystemClock.uptimeMillis();
            this.f29566g = 402;
            String str4 = this.f29562c.f29515j.mo26310b().f29552d;
            String a2 = C10849c.m31815a(new File(a));
            if (TextUtils.equals(str4, a2)) {
                C10859b.m31866a(this.f29562c.f29508c, "MD5校验通过", " filePath:", a);
                jVar.f29544e = new File(a).length();
                this.f29564e.mo26217a(this.f29567h, this.f29565f, this.f29562c, jVar);
                this.f29570k.setStatsType(Integer.valueOf(100));
                this.f29566g = 403;
                this.f29565f = 3;
                try {
                    String a3 = m32002a(a, jVar);
                    C10859b.m31866a(this.f29562c.f29508c, "Patch成功");
                    if (!TextUtils.isEmpty(a3)) {
                        this.f29570k.setActiveCheckDuration(Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis2));
                        this.f29570k = new PackageStatisticModel();
                        long uptimeMillis3 = SystemClock.uptimeMillis();
                        boolean z = !this.f29569j || this.f29568i.mo26228e(jVar.f29541b);
                        this.f29562c.f29506a = jVar.f29540a;
                        this.f29562c.f29507b = z ^ true ? 1 : 0;
                        if (m32017e(jVar)) {
                            C10859b.m31866a(this.f29562c.f29508c, "准备解压");
                            String str5 = z ? this.f29563d : this.f29568i.f29410c;
                            this.f29565f = 2;
                            this.f29566g = 501;
                            try {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(this.f29563d);
                                sb2.append(a3);
                                String a4 = m32004a(sb2.toString(), str5, jVar.f29541b, z);
                                this.f29570k.setApplyDuration(Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis3));
                                C10859b.m31866a(this.f29562c.f29508c, "解压成功", " dir:", a4);
                                this.f29562c.f29509d = a4;
                                if (!TextUtils.equals(this.f29562c.f29510e, a3) && !TextUtils.isEmpty(this.f29562c.f29510e)) {
                                    StringBuilder sb3 = new StringBuilder();
                                    sb3.append(this.f29563d);
                                    sb3.append(this.f29562c.f29510e);
                                    File file = new File(sb3.toString());
                                    if (file.exists()) {
                                        file.delete();
                                    }
                                }
                                this.f29562c.f29510e = a3;
                            } catch (Exception e) {
                                C10859b.m31866a(this.f29562c.f29508c, "解压失败", Log.getStackTraceString(e));
                                this.f29570k = new PackageStatisticModel();
                                this.f29570k.setLogId(this.f29571l);
                                this.f29561b.f29556b.add(this.f29570k);
                                this.f29570k.setAccessKey(this.f29568i.mo26222b());
                                this.f29570k.setChannel(jVar.f29541b);
                                this.f29570k.setPatchId(Integer.valueOf(jVar.mo26310b().f29549a));
                                this.f29570k.setStatsType(Integer.valueOf(103));
                                this.f29570k.setErrCode("501");
                                this.f29570k.setErrMsg(e.getMessage());
                                throw e;
                            }
                        } else {
                            C10859b.m31866a(this.f29562c.f29508c, "无需解压");
                            this.f29565f = 5;
                            this.f29566g = 1000;
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append(this.f29563d);
                            sb4.append(jVar.f29541b);
                            sb4.append(File.separator);
                            sb4.append("gecko_activate_done");
                            File file2 = new File(sb4.toString());
                            if (!file2.exists()) {
                                file2.createNewFile();
                            }
                            this.f29570k.setApplyDuration(Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis3));
                            this.f29562c.f29509d = jVar.f29541b;
                            this.f29562c.f29510e = a3;
                        }
                        C10859b.m31866a(this.f29562c.f29508c, "更新成功");
                        this.f29564e.mo26217a(this.f29567h, this.f29565f, this.f29562c, jVar);
                        this.f29565f = 4;
                        this.f29566g = 1000;
                        m32005a();
                        C10859b.m31866a(this.f29562c.f29508c, "数据库存储成功");
                        this.f29570k.setLogId(this.f29571l);
                        this.f29561b.f29556b.add(this.f29570k);
                        this.f29570k.setAccessKey(this.f29568i.mo26222b());
                        this.f29570k.setChannel(jVar.f29541b);
                        this.f29570k.setPatchId(Integer.valueOf(jVar.mo26310b().f29549a));
                        this.f29570k.setStatsType(Integer.valueOf(102));
                        return;
                    }
                    throw new UnExpectedFileException("patch file failed");
                } catch (Exception e2) {
                    C10859b.m31866a(this.f29562c.f29508c, "Patch失败 ", Log.getStackTraceString(e2));
                    this.f29570k = new PackageStatisticModel();
                    this.f29570k.setLogId(this.f29571l);
                    this.f29561b.f29556b.add(this.f29570k);
                    this.f29570k.setAccessKey(this.f29568i.mo26222b());
                    this.f29570k.setChannel(jVar.f29541b);
                    this.f29570k.setPatchId(Integer.valueOf(jVar.mo26310b().f29549a));
                    this.f29570k.setStatsType(Integer.valueOf(100));
                    this.f29570k.setErrCode("403");
                    this.f29570k.setErrMsg(e2.getMessage());
                    throw e2;
                }
            } else {
                C10859b.m31866a(this.f29562c.f29508c, "MD5校验失败", "serverMd5:", str4, " localMd5", a2, " filePath:", a);
                StringBuilder sb5 = new StringBuilder("file:");
                sb5.append(a);
                sb5.append(" md5 is ");
                sb5.append(a2);
                sb5.append(", server assigned md5 is ");
                sb5.append(str4);
                sb5.append(".  might be hijacked！ ");
                throw new UnExpectedFileException(sb5.toString());
            }
        } catch (Exception e3) {
            C10859b.m31866a(this.f29562c.f29508c, "下载失败 ", Log.getStackTraceString(e3));
            throw e3;
        }
    }

    /* renamed from: a */
    private void m32005a() {
        this.f29564e.mo26223b(this.f29562c);
    }

    public final void run() {
        C10859b.m31866a(this.f29562c.f29508c, "准备下载....................");
        C10909j jVar = this.f29562c.f29515j;
        if (jVar != null) {
            this.f29570k = new PackageStatisticModel();
            this.f29570k.setLogId(this.f29571l);
            this.f29561b.f29556b.add(this.f29570k);
            this.f29570k.setAccessKey(this.f29568i.mo26222b());
            this.f29570k.setChannel(jVar.f29541b);
            m32007a(jVar, 0);
        }
    }

    /* renamed from: e */
    private static boolean m32017e(C10909j jVar) {
        if (jVar.f29542c == 1) {
            return false;
        }
        return jVar.mo26311c().f29539c;
    }

    /* renamed from: c */
    private static boolean m32015c(C10909j jVar) {
        if (jVar.mo26309a() == null || jVar.mo26309a().f29551c.size() <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    private static boolean m32016d(C10909j jVar) {
        if (jVar.mo26310b() == null || jVar.mo26310b().f29551c.size() <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private void m32010b(C10909j jVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f29563d);
        sb.append(jVar.mo26309a().f29554f);
        File file = new File(sb.toString());
        if (!TextUtils.isEmpty(jVar.mo26309a().f29554f) && file.exists()) {
            C10851d.m31821a(file);
            StringBuilder sb2 = new StringBuilder("delete unzip dir:");
            sb2.append(this.f29563d);
            sb2.append(jVar.mo26309a().f29554f);
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.f29563d);
        sb3.append(jVar.mo26309a().f29553e);
        File file2 = new File(sb3.toString());
        if (!TextUtils.isEmpty(jVar.mo26309a().f29554f) && file2.exists()) {
            file2.delete();
            StringBuilder sb4 = new StringBuilder("delete unzip:");
            sb4.append(this.f29563d);
            sb4.append(jVar.mo26309a().f29553e);
        }
    }

    /* renamed from: a */
    private void m32006a(C10909j jVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f29563d);
        sb.append(jVar.mo26309a().f29554f);
        File file = new File(sb.toString());
        if (!TextUtils.isEmpty(jVar.mo26309a().f29554f) && file.exists()) {
            C10851d.m31821a(file);
            StringBuilder sb2 = new StringBuilder("delete unzip dir:");
            sb2.append(this.f29563d);
            sb2.append(jVar.mo26309a().f29554f);
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.f29563d);
        sb3.append(jVar.f29543d);
        File file2 = new File(sb3.toString());
        if (!TextUtils.isEmpty(jVar.f29543d) && file2.exists()) {
            file2.delete();
            StringBuilder sb4 = new StringBuilder("delete after patch unzip:");
            sb4.append(this.f29563d);
            sb4.append(jVar.mo26309a().f29553e);
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.append(this.f29563d);
        sb5.append(jVar.mo26310b().f29553e);
        File file3 = new File(sb5.toString());
        if (!TextUtils.isEmpty(jVar.mo26310b().f29553e) && file3.exists()) {
            file3.delete();
            StringBuilder sb6 = new StringBuilder("delete patch unzip:");
            sb6.append(this.f29563d);
            sb6.append(jVar.mo26309a().f29553e);
        }
    }

    /* renamed from: a */
    private String m32003a(String str, String str2) throws Exception {
        this.f29564e.mo26216a(this.f29567h, 1, this.f29562c);
        StringBuilder sb = new StringBuilder();
        sb.append(this.f29563d);
        sb.append(str2);
        String sb2 = sb.toString();
        new File(sb2).getParentFile().mkdirs();
        if (C10852a.m31831b(str, sb2)) {
            return sb2;
        }
        throw new RuntimeException("download return failed");
    }

    /* renamed from: c */
    private static void m32014c(C10909j jVar, String str) throws Exception {
        C10911b a = jVar.mo26309a();
        if (a != null) {
            String str2 = a.f29552d;
            String a2 = C10849c.m31815a(new File(str));
            if (!TextUtils.equals(str2, a2)) {
                StringBuilder sb = new StringBuilder("after patch md5 check failed  file:");
                sb.append(str);
                sb.append(" md5:");
                sb.append(a2);
                sb.append(", server md5:");
                sb.append(str2);
                throw new UnExpectedFileException(sb.toString());
            }
        }
    }

    /* renamed from: a */
    private String m32002a(String str, C10909j jVar) throws Exception {
        String str2;
        String str3;
        GeckoBspatch geckoBspatch = new GeckoBspatch();
        String str4 = "";
        String str5 = "";
        if (jVar.mo26309a() != null) {
            String str6 = "";
            List<String> list = jVar.mo26309a().f29551c;
            if (list != null && list.size() > 0) {
                str6 = (String) list.get(0);
            }
            String[] split = str6.split("/");
            str5 = split[split.length - 1];
        }
        if (TextUtils.isEmpty(str5)) {
            StringBuilder sb = new StringBuilder("patch_");
            sb.append(this.f29562c.f29510e);
            str5 = sb.toString();
        }
        if (jVar.f29542c == 1) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f29563d);
            sb2.append(jVar.f29541b);
            sb2.append("/");
            sb2.append(this.f29562c.f29510e);
            str3 = sb2.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(this.f29563d);
            sb3.append(jVar.f29541b);
            sb3.append("/");
            sb3.append(str5);
            str2 = sb3.toString();
        } else {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(this.f29563d);
            sb4.append(this.f29562c.f29510e);
            str3 = sb4.toString();
            StringBuilder sb5 = new StringBuilder();
            sb5.append(this.f29563d);
            sb5.append(str5);
            str2 = sb5.toString();
        }
        jVar.f29543d = str5;
        this.f29564e.mo26216a(this.f29567h, this.f29565f, this.f29562c);
        int bspatch = geckoBspatch.bspatch(str4, str3, str2, str);
        File file = new File(str);
        if (file.exists()) {
            file.delete();
        }
        if (bspatch == 0) {
            m32014c(jVar, str2);
            if (!str3.equals(str2)) {
                new File(str3).delete();
            }
            return str5;
        }
        StringBuilder sb6 = new StringBuilder("patch file failed  status:");
        sb6.append(bspatch);
        sb6.append(" patch file:");
        sb6.append(str);
        throw new UnExpectedFileException(sb6.toString());
    }

    /* renamed from: b */
    private void m32011b(C10909j jVar, int i) {
        String str;
        Exception e;
        List<String> list = jVar.mo26309a().f29551c;
        try {
            if (i < list.size()) {
                str = (String) list.get(i);
                try {
                    this.f29570k.setDownloadUrl(str);
                    this.f29570k.setDownloadRetryTimes(i);
                    m32012b(jVar, (String) list.get(i));
                } catch (Exception e2) {
                    e = e2;
                }
            }
        } catch (Exception e3) {
            Exception exc = e3;
            str = null;
            e = exc;
            if (this.f29565f == 1) {
                this.f29570k.getDownloadFailRecords().add(new C10892a(str, e.getMessage()));
                if (i + 1 >= list.size()) {
                    this.f29570k.setStatsType(Integer.valueOf(1));
                    PackageStatisticModel packageStatisticModel = this.f29570k;
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.f29566g);
                    packageStatisticModel.setErrCode(sb.toString());
                    this.f29570k.setErrMsg(e.getMessage());
                }
            }
            if (this.f29565f == 1) {
                int i2 = i + 1;
                if (i2 < list.size()) {
                    m32010b(jVar);
                    m32011b(jVar, i2);
                    return;
                }
            }
            m32013b(e, jVar, this.f29566g);
        }
    }

    /* renamed from: b */
    private void m32012b(C10909j jVar, String str) throws Exception {
        String str2;
        boolean z;
        String str3;
        C10909j jVar2 = jVar;
        String str4 = str;
        String str5 = this.f29562c.f29508c;
        StringBuilder sb = new StringBuilder();
        sb.append(jVar2.f29540a);
        C10859b.m31866a(str5, "开始下载全量包", " version:", sb.toString(), " url:", str4);
        this.f29567h = false;
        this.f29564e.mo26216a(this.f29567h, 0, this.f29562c);
        String[] split = str4.split("/");
        String str6 = split[split.length - 1];
        new StringBuilder("download:").append(str4);
        new StringBuilder("unzip:").append(str6);
        jVar.mo26309a().f29553e = str6;
        this.f29565f = 1;
        this.f29566g = C34943c.f91128x;
        if (jVar2.f29542c == 1) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(jVar2.f29541b);
            sb2.append("/");
            sb2.append(str6);
            str2 = sb2.toString();
        } else {
            str2 = str6;
        }
        try {
            long uptimeMillis = SystemClock.uptimeMillis();
            String a = m32003a(str4, str2);
            this.f29570k.setDownloadDuration(Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis));
            C10859b.m31866a(this.f29562c.f29508c, "下载成功", " filePath:", a);
            long uptimeMillis2 = SystemClock.uptimeMillis();
            this.f29566g = 450;
            String str7 = this.f29562c.f29515j.mo26309a().f29552d;
            String a2 = C10849c.m31815a(new File(a));
            if (TextUtils.equals(str7, a2)) {
                C10859b.m31866a(this.f29562c.f29508c, "MD5校验通过", " filePath:", a);
                jVar2.f29544e = new File(a).length();
                this.f29564e.mo26217a(this.f29567h, this.f29565f, this.f29562c, jVar2);
                this.f29570k.setStatsType(Integer.valueOf(0));
                this.f29570k.setActiveCheckDuration(Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis2));
                this.f29570k = new PackageStatisticModel();
                long uptimeMillis3 = SystemClock.uptimeMillis();
                if (!this.f29569j || this.f29568i.mo26228e(jVar2.f29541b)) {
                    z = true;
                } else {
                    z = false;
                }
                this.f29562c.f29506a = jVar2.f29540a;
                this.f29562c.f29507b = z ^ true ? 1 : 0;
                if (m32017e(jVar)) {
                    C10859b.m31866a(this.f29562c.f29508c, "准备解压");
                    if (z) {
                        str3 = this.f29563d;
                    } else {
                        str3 = this.f29568i.f29410c;
                    }
                    this.f29565f = 2;
                    this.f29566g = VETransitionFilterParam.TransitionDuration_DEFAULT;
                    try {
                        String a3 = m32004a(a, str3, jVar2.f29541b, z);
                        this.f29570k.setApplyDuration(Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis3));
                        C10859b.m31866a(this.f29562c.f29508c, "解压成功", " dir:", a3);
                        this.f29562c.f29509d = a3;
                        if (!TextUtils.equals(this.f29562c.f29510e, str6) && !TextUtils.isEmpty(this.f29562c.f29510e)) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(this.f29563d);
                            sb3.append(this.f29562c.f29510e);
                            File file = new File(sb3.toString());
                            if (file.exists()) {
                                file.delete();
                            }
                        }
                        this.f29562c.f29510e = str6;
                    } catch (Exception e) {
                        C10859b.m31866a(this.f29562c.f29508c, "解压失败", Log.getStackTraceString(e));
                        this.f29570k = new PackageStatisticModel();
                        this.f29570k.setLogId(this.f29571l);
                        this.f29561b.f29556b.add(this.f29570k);
                        this.f29570k.setAccessKey(this.f29568i.mo26222b());
                        this.f29570k.setChannel(jVar2.f29541b);
                        this.f29570k.setId(Integer.valueOf(jVar.mo26309a().f29549a));
                        this.f29570k.setStatsType(Integer.valueOf(3));
                        this.f29570k.setErrCode("500");
                        this.f29570k.setErrMsg(e.getMessage());
                        throw e;
                    }
                } else {
                    C10859b.m31866a(this.f29562c.f29508c, "无需解压");
                    this.f29565f = 5;
                    this.f29566g = 1000;
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(this.f29563d);
                    sb4.append(jVar2.f29541b);
                    sb4.append(File.separator);
                    sb4.append("gecko_activate_done");
                    File file2 = new File(sb4.toString());
                    if (!file2.exists()) {
                        file2.createNewFile();
                    }
                    this.f29570k.setApplyDuration(Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis3));
                    this.f29562c.f29509d = jVar2.f29541b;
                    this.f29562c.f29510e = str6;
                }
                C10859b.m31866a(this.f29562c.f29508c, "更新成功");
                this.f29564e.mo26217a(this.f29567h, this.f29565f, this.f29562c, jVar2);
                this.f29565f = 4;
                this.f29566g = 1000;
                m32005a();
                C10859b.m31866a(this.f29562c.f29508c, "数据库存储成功");
                this.f29570k.setLogId(this.f29571l);
                this.f29561b.f29556b.add(this.f29570k);
                this.f29570k.setAccessKey(this.f29568i.mo26222b());
                this.f29570k.setChannel(jVar2.f29541b);
                this.f29570k.setId(Integer.valueOf(jVar.mo26309a().f29549a));
                this.f29570k.setStatsType(Integer.valueOf(2));
                return;
            }
            C10859b.m31866a(this.f29562c.f29508c, "MD5校验失败", "serverMd5:", str7, " localMd5", a2, " filePath:", a);
            StringBuilder sb5 = new StringBuilder("file:");
            sb5.append(a);
            sb5.append(" md5 is ");
            sb5.append(a2);
            sb5.append(", server assigned md5 is ");
            sb5.append(str7);
            sb5.append(".  might be hijacked！ ");
            throw new UnExpectedFileException(sb5.toString());
        } catch (Exception e2) {
            C10859b.m31866a(this.f29562c.f29508c, "下载失败 ", Log.getStackTraceString(e2));
            throw e2;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00fd  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m32007a(com.bytedance.ies.geckoclient.model.C10909j r9, int r10) {
        /*
            r8 = this;
            java.lang.String r0 = ""
            com.bytedance.ies.geckoclient.model.PackageStatisticModel r1 = r8.f29570k
            android.content.Context r2 = com.bytedance.ies.geckoclient.C10873f.m31911e()
            java.lang.String r2 = com.bytedance.ies.geckoclient.p571e.C10867d.m31884b(r2)
            r1.setAc(r2)
            r1 = 0
            boolean r2 = m32016d(r9)     // Catch:{ Exception -> 0x008a }
            if (r2 == 0) goto L_0x0051
            com.bytedance.ies.geckoclient.model.j$b r2 = r9.mo26310b()     // Catch:{ Exception -> 0x008a }
            java.util.List<java.lang.String> r2 = r2.f29551c     // Catch:{ Exception -> 0x008a }
            java.lang.Object r3 = r2.get(r10)     // Catch:{ Exception -> 0x008a }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x008a }
            com.bytedance.ies.geckoclient.model.PackageStatisticModel r0 = r8.f29570k     // Catch:{ Exception -> 0x004f }
            r0.setDownloadUrl(r3)     // Catch:{ Exception -> 0x004f }
            com.bytedance.ies.geckoclient.model.PackageStatisticModel r0 = r8.f29570k     // Catch:{ Exception -> 0x004f }
            r0.setDownloadRetryTimes(r10)     // Catch:{ Exception -> 0x004f }
            com.bytedance.ies.geckoclient.model.PackageStatisticModel r0 = r8.f29570k     // Catch:{ Exception -> 0x004f }
            com.bytedance.ies.geckoclient.model.j$b r4 = r9.mo26310b()     // Catch:{ Exception -> 0x004f }
            int r4 = r4.f29549a     // Catch:{ Exception -> 0x004f }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x004f }
            r0.setPatchId(r4)     // Catch:{ Exception -> 0x004f }
            int r0 = r2.size()     // Catch:{ Exception -> 0x004f }
            if (r10 >= r0) goto L_0x0102
            int r0 = r2.size()     // Catch:{ Exception -> 0x004f }
            r8.m32008a(r9, r3)     // Catch:{ Exception -> 0x004a }
            goto L_0x0102
        L_0x004a:
            r1 = move-exception
            r7 = r1
            r1 = r0
            r0 = r7
            goto L_0x008d
        L_0x004f:
            r0 = move-exception
            goto L_0x008d
        L_0x0051:
            boolean r2 = m32015c(r9)     // Catch:{ Exception -> 0x008a }
            if (r2 == 0) goto L_0x0089
            com.bytedance.ies.geckoclient.model.j$b r2 = r9.mo26309a()     // Catch:{ Exception -> 0x008a }
            java.util.List<java.lang.String> r2 = r2.f29551c     // Catch:{ Exception -> 0x008a }
            java.lang.Object r3 = r2.get(r10)     // Catch:{ Exception -> 0x008a }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x008a }
            com.bytedance.ies.geckoclient.model.PackageStatisticModel r0 = r8.f29570k     // Catch:{ Exception -> 0x004f }
            r0.setDownloadUrl(r3)     // Catch:{ Exception -> 0x004f }
            com.bytedance.ies.geckoclient.model.PackageStatisticModel r0 = r8.f29570k     // Catch:{ Exception -> 0x004f }
            r0.setDownloadRetryTimes(r10)     // Catch:{ Exception -> 0x004f }
            com.bytedance.ies.geckoclient.model.PackageStatisticModel r0 = r8.f29570k     // Catch:{ Exception -> 0x004f }
            com.bytedance.ies.geckoclient.model.j$b r4 = r9.mo26309a()     // Catch:{ Exception -> 0x004f }
            int r4 = r4.f29549a     // Catch:{ Exception -> 0x004f }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x004f }
            r0.setId(r4)     // Catch:{ Exception -> 0x004f }
            int r0 = r2.size()     // Catch:{ Exception -> 0x004f }
            if (r10 >= r0) goto L_0x0089
            int r0 = r2.size()     // Catch:{ Exception -> 0x004f }
            r8.m32012b(r9, r3)     // Catch:{ Exception -> 0x004a }
        L_0x0089:
            return
        L_0x008a:
            r2 = move-exception
            r3 = r0
            r0 = r2
        L_0x008d:
            int r2 = r8.f29565f
            r4 = 1
            if (r2 != r4) goto L_0x00dd
            com.bytedance.ies.geckoclient.model.PackageStatisticModel r2 = r8.f29570k
            java.util.List r2 = r2.getDownloadFailRecords()
            com.bytedance.ies.geckoclient.model.PackageStatisticModel$a r5 = new com.bytedance.ies.geckoclient.model.PackageStatisticModel$a
            java.lang.String r6 = r0.getMessage()
            r5.<init>(r3, r6)
            r2.add(r5)
            int r2 = r10 + 1
            if (r2 < r1) goto L_0x00dd
            boolean r2 = r8.f29567h
            if (r2 == 0) goto L_0x00b8
            com.bytedance.ies.geckoclient.model.PackageStatisticModel r2 = r8.f29570k
            r3 = 101(0x65, float:1.42E-43)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.setStatsType(r3)
            goto L_0x00c1
        L_0x00b8:
            com.bytedance.ies.geckoclient.model.PackageStatisticModel r2 = r8.f29570k
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            r2.setStatsType(r3)
        L_0x00c1:
            com.bytedance.ies.geckoclient.model.PackageStatisticModel r2 = r8.f29570k
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            int r5 = r8.f29566g
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            r2.setErrCode(r3)
            com.bytedance.ies.geckoclient.model.PackageStatisticModel r2 = r8.f29570k
            java.lang.String r3 = r0.getMessage()
            r2.setErrMsg(r3)
        L_0x00dd:
            int r2 = r8.f29565f
            if (r2 != r4) goto L_0x00f3
            int r10 = r10 + r4
            if (r10 >= r1) goto L_0x00f3
            boolean r0 = r8.f29567h
            if (r0 == 0) goto L_0x00ec
            r8.m32006a(r9)
            goto L_0x00ef
        L_0x00ec:
            r8.m32010b(r9)
        L_0x00ef:
            r8.m32007a(r9, r10)
            return
        L_0x00f3:
            boolean r10 = r8.f29567h
            if (r10 == 0) goto L_0x00fd
            int r10 = r8.f29566g
            r8.m32009a(r0, r9, r10)
            return
        L_0x00fd:
            int r10 = r8.f29566g
            r8.m32013b(r0, r9, r10)
        L_0x0102:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.geckoclient.C10917q.m32007a(com.bytedance.ies.geckoclient.model.j, int):void");
    }

    /* renamed from: b */
    private void m32013b(Exception exc, C10909j jVar, int i) {
        m32010b(jVar);
        this.f29564e.mo26218a(this.f29567h, this.f29565f, this.f29562c, jVar, exc, i);
    }

    /* renamed from: a */
    private void m32009a(Exception exc, C10909j jVar, int i) {
        StringBuilder sb = new StringBuilder("patch task error:");
        sb.append(exc.toString());
        sb.append(" current status:");
        sb.append(this.f29565f);
        m32006a(jVar);
        this.f29564e.mo26218a(this.f29567h, this.f29565f, this.f29562c, jVar, exc, i);
        if (m32015c(jVar)) {
            this.f29570k = new PackageStatisticModel();
            this.f29570k.setLogId(this.f29571l);
            this.f29561b.f29556b.add(this.f29570k);
            this.f29570k.setAccessKey(this.f29568i.mo26222b());
            this.f29570k.setChannel(jVar.f29541b);
            this.f29570k.setId(Integer.valueOf(jVar.mo26309a().f29549a));
            this.f29570k.setAc(C10867d.m31884b(C10873f.m31911e()));
            m32011b(jVar, 0);
        }
    }

    /* renamed from: a */
    private String m32004a(String str, String str2, String str3, boolean z) throws Exception {
        C10919s sVar = new C10919s();
        if (!sVar.mo26318a(str)) {
            StringBuilder sb = new StringBuilder("file:");
            sb.append(str);
            sb.append(" is not a archive file!");
            throw new UnExpectedFileException(sb.toString());
        } else if (C10919s.m32019a(str, str3)) {
            if (!TextUtils.isEmpty(this.f29562c.f29509d) && z) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.f29563d);
                sb2.append(this.f29562c.f29509d);
                File file = new File(sb2.toString());
                if (file.exists()) {
                    boolean a = C10851d.m31821a(file);
                    StringBuilder sb3 = new StringBuilder("delete old package:");
                    sb3.append(this.f29563d);
                    sb3.append(this.f29562c.f29509d);
                    sb3.append(" ");
                    sb3.append(a);
                }
            }
            if (!TextUtils.isEmpty(str3)) {
                this.f29562c.f29515j.mo26309a().f29554f = str3;
                this.f29564e.mo26216a(this.f29567h, 2, this.f29562c);
            }
            return sVar.mo26317a(str, str2, str3);
        } else {
            throw new IllegalArgumentException("zip包最外层必须有一个文件夹，并且以channel命名");
        }
    }

    C10917q(C10852a aVar, C10903d dVar, String str, boolean z, C10873f fVar) {
        super(aVar);
        this.f29562c = dVar;
        this.f29563d = str;
        this.f29568i = fVar;
        this.f29564e = fVar;
        this.f29569j = z;
    }
}
