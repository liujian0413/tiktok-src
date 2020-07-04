package com.p280ss.android.ugc.aweme.feedback.runtime.behavior.strategy;

import com.bytedance.ies.ugc.aweme.network.C10944e;
import com.p280ss.android.ugc.aweme.feedback.runtime.behavior.C29096c.C29097a;
import com.p280ss.android.ugc.aweme.runtime.behavior.C37295c;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.g */
public final class C29110g extends C29100a {

    /* renamed from: a */
    public static final C29111a f76860a = new C29111a(null);

    /* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.g$a */
    public static final class C29111a {
        private C29111a() {
        }

        public /* synthetic */ C29111a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: a */
    public final String mo74558a() {
        return "abnor_record";
    }

    /* renamed from: b */
    public final long mo74560b() {
        return TimeUnit.HOURS.toMillis(2);
    }

    /* renamed from: c */
    public final String mo74561c() {
        long currentTimeMillis = System.currentTimeMillis() - mo74560b();
        List b = C29097a.m95452a().mo74534b("record_start", currentTimeMillis);
        List<C37295c> b2 = C29097a.m95452a().mo74534b("record_error", currentTimeMillis);
        List b3 = C29097a.m95452a().mo74534b("record_success", currentTimeMillis);
        List b4 = C29097a.m95452a().mo74534b("camera_start", currentTimeMillis);
        List<C37295c> b5 = C29097a.m95452a().mo74534b("camera_error", currentTimeMillis);
        List b6 = C29097a.m95452a().mo74534b("camera_success", currentTimeMillis);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (C37295c cVar : b2) {
            arrayList2.add(new AwemeToolFeedbackECode(cVar.f97424d, null, 2, null));
        }
        AwemeToolFeedbackInfo awemeToolFeedbackInfo = new AwemeToolFeedbackInfo("录制", b.size(), b3.size(), 0, arrayList2);
        arrayList.add(awemeToolFeedbackInfo);
        ArrayList arrayList3 = new ArrayList();
        for (C37295c cVar2 : b5) {
            arrayList3.add(new AwemeToolFeedbackECode(cVar2.f97424d, null, 2, null));
        }
        AwemeToolFeedbackInfo awemeToolFeedbackInfo2 = new AwemeToolFeedbackInfo("相机启动", b4.size(), b6.size(), 0, arrayList3);
        arrayList.add(awemeToolFeedbackInfo2);
        String b7 = C10944e.m32113a().mo15979b((Object) arrayList);
        C7573i.m23582a((Object) b7, "Network.getGson().toJson(infos)");
        return b7;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0037, code lost:
        if (r2.equals("record_start") != false) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0040, code lost:
        if (r2.equals("record_error") != false) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0043, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0045, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        if (r2.equals("record_success") != false) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001c, code lost:
        if (r2.equals("camera_start") != false) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0025, code lost:
        if (r2.equals("camera_error") != false) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002e, code lost:
        if (r2.equals("camera_success") != false) goto L_0x0042;
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
                case -2122358630: goto L_0x003a;
                case -2109385996: goto L_0x0031;
                case -785402647: goto L_0x0028;
                case -603764626: goto L_0x001f;
                case -590791992: goto L_0x0016;
                case 134640149: goto L_0x000d;
                default: goto L_0x000c;
            }
        L_0x000c:
            goto L_0x0044
        L_0x000d:
            java.lang.String r0 = "record_success"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x0044
            goto L_0x0042
        L_0x0016:
            java.lang.String r0 = "camera_start"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x0044
            goto L_0x0042
        L_0x001f:
            java.lang.String r0 = "camera_error"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x0044
            goto L_0x0042
        L_0x0028:
            java.lang.String r0 = "camera_success"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x0044
            goto L_0x0042
        L_0x0031:
            java.lang.String r0 = "record_start"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x0044
            goto L_0x0042
        L_0x003a:
            java.lang.String r0 = "record_error"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x0044
        L_0x0042:
            r2 = 1
            return r2
        L_0x0044:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.feedback.runtime.behavior.strategy.C29110g.mo74559a(java.lang.String):boolean");
    }
}
