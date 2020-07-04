package com.p280ss.android.ugc.aweme.feedback.runtime.behavior.strategy;

import com.p280ss.android.ugc.aweme.feedback.runtime.behavior.C29096c.C29097a;
import com.p280ss.android.ugc.aweme.runtime.behavior.C37295c;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.d */
public final class C29105d extends C29100a {

    /* renamed from: a */
    public static final C29106a f76856a = new C29106a(null);

    /* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.d$a */
    public static final class C29106a {
        private C29106a() {
        }

        public /* synthetic */ C29106a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: a */
    public final String mo74558a() {
        return "abnor_download";
    }

    /* renamed from: b */
    public final long mo74560b() {
        return TimeUnit.HOURS.toMillis(2);
    }

    /* renamed from: c */
    public final String mo74561c() {
        long currentTimeMillis = System.currentTimeMillis() - mo74560b();
        List b = C29097a.m95452a().mo74534b("download_start", currentTimeMillis);
        List b2 = C29097a.m95452a().mo74534b("download_cancel", currentTimeMillis);
        List b3 = C29097a.m95452a().mo74534b("download_success", currentTimeMillis);
        List<C37295c> b4 = C29097a.m95452a().mo74534b("download_error", currentTimeMillis);
        List b5 = C29097a.m95452a().mo74534b("water_mark_start", currentTimeMillis);
        List b6 = C29097a.m95452a().mo74534b("water_mark_cancel", currentTimeMillis);
        List b7 = C29097a.m95452a().mo74534b("water_mark_success", currentTimeMillis);
        List b8 = C29097a.m95452a().mo74534b("water_mark_error", currentTimeMillis);
        StringBuilder sb = new StringBuilder();
        if (!b.isEmpty()) {
            StringBuilder sb2 = new StringBuilder("下载次数: ");
            sb2.append(b.size());
            sb2.append("次;");
            sb.append(sb2.toString());
        }
        if (!b2.isEmpty()) {
            StringBuilder sb3 = new StringBuilder("下载取消: ");
            sb3.append(b2.size());
            sb3.append("次;");
            sb.append(sb3.toString());
        }
        if (!b3.isEmpty()) {
            StringBuilder sb4 = new StringBuilder("下载成功: ");
            sb4.append(b3.size());
            sb4.append("次;");
            sb.append(sb4.toString());
        }
        if (!b4.isEmpty()) {
            StringBuilder sb5 = new StringBuilder("下载错误: ");
            sb5.append(b4.size());
            sb5.append("次(ECode:");
            sb.append(sb5.toString());
            boolean z = true;
            for (C37295c cVar : b4) {
                if (!z) {
                    sb.append(",");
                }
                sb.append(cVar.f97424d);
                z = false;
            }
            sb.append(");");
        }
        if (!b5.isEmpty()) {
            StringBuilder sb6 = new StringBuilder("水印次数: ");
            sb6.append(b5.size());
            sb6.append("次;");
            sb.append(sb6.toString());
        }
        if (!b6.isEmpty()) {
            StringBuilder sb7 = new StringBuilder("水印取消: ");
            sb7.append(b6.size());
            sb7.append("次;");
            sb.append(sb7.toString());
        }
        if (!b7.isEmpty()) {
            StringBuilder sb8 = new StringBuilder("水印成功: ");
            sb8.append(b7.size());
            sb8.append("次;");
            sb.append(sb8.toString());
        }
        if (!b8.isEmpty()) {
            StringBuilder sb9 = new StringBuilder("水印错误: ");
            sb9.append(b8.size());
            sb9.append("次;");
            sb.append(sb9.toString());
        }
        String sb10 = sb.toString();
        C7573i.m23582a((Object) sb10, "result.toString()");
        return sb10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0037, code lost:
        if (r2.equals("download_error") != false) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0040, code lost:
        if (r2.equals("download_cancel") != false) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0049, code lost:
        if (r2.equals("download_success") != false) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0052, code lost:
        if (r2.equals("water_mark_cancel") != false) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0055, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0057, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        if (r2.equals("water_mark_success") != false) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001c, code lost:
        if (r2.equals("water_mark_start") != false) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0025, code lost:
        if (r2.equals("water_mark_error") != false) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002e, code lost:
        if (r2.equals("download_start") != false) goto L_0x0054;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo74559a(java.lang.String r2) {
        /*
            r1 = this;
            java.lang.String r0 = "type"
            kotlin.jvm.internal.C7573i.m23587b(r2, r0)
            int r0 = r2.hashCode()
            switch(r0) {
                case -1826452220: goto L_0x004c;
                case -210589876: goto L_0x0043;
                case 71186961: goto L_0x003a;
                case 974485393: goto L_0x0031;
                case 987458027: goto L_0x0028;
                case 1051818558: goto L_0x001f;
                case 1064791192: goto L_0x0016;
                case 1092137657: goto L_0x000d;
                default: goto L_0x000c;
            }
        L_0x000c:
            goto L_0x0056
        L_0x000d:
            java.lang.String r0 = "water_mark_success"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x0056
            goto L_0x0054
        L_0x0016:
            java.lang.String r0 = "water_mark_start"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x0056
            goto L_0x0054
        L_0x001f:
            java.lang.String r0 = "water_mark_error"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x0056
            goto L_0x0054
        L_0x0028:
            java.lang.String r0 = "download_start"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x0056
            goto L_0x0054
        L_0x0031:
            java.lang.String r0 = "download_error"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x0056
            goto L_0x0054
        L_0x003a:
            java.lang.String r0 = "download_cancel"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x0056
            goto L_0x0054
        L_0x0043:
            java.lang.String r0 = "download_success"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x0056
            goto L_0x0054
        L_0x004c:
            java.lang.String r0 = "water_mark_cancel"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x0056
        L_0x0054:
            r2 = 1
            return r2
        L_0x0056:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.feedback.runtime.behavior.strategy.C29105d.mo74559a(java.lang.String):boolean");
    }
}
