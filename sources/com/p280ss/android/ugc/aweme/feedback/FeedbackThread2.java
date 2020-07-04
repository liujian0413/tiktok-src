package com.p280ss.android.ugc.aweme.feedback;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.p254b.C6304f;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.retrofit2.p264b.C6450ac;
import com.bytedance.retrofit2.p264b.C6455f;
import com.bytedance.retrofit2.p264b.C6456g;
import com.bytedance.retrofit2.p264b.C6457h;
import com.bytedance.retrofit2.p264b.C6463n;
import com.bytedance.retrofit2.p264b.C6468s;
import com.bytedance.retrofit2.p264b.C6475z;
import com.google.common.util.concurrent.C18253l;
import com.p280ss.android.common.p852c.C19281d;
import com.p280ss.android.image.C6813b;
import com.p280ss.android.newmedia.C19913a;
import com.p280ss.android.p284b.C19223b;
import com.p280ss.android.ugc.aweme.app.C6877n;
import com.p280ss.android.ugc.aweme.app.api.p1023b.C22814a;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.feedback.runtime.behavior.C29096c;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ExecutionException;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.feedback.FeedbackThread2 */
public final class FeedbackThread2 extends C6304f {

    /* renamed from: a */
    private static final String f76685a;

    /* renamed from: b */
    private static final String f76686b;

    /* renamed from: c */
    private static final String f76687c;

    /* renamed from: d */
    private static final String f76688d;

    /* renamed from: e */
    private final Handler f76689e;

    /* renamed from: f */
    private final Context f76690f;

    /* renamed from: g */
    private C29072e f76691g;

    /* renamed from: h */
    private C29091r f76692h;

    /* renamed from: i */
    private C29090q f76693i;

    /* renamed from: j */
    private C6813b f76694j;

    /* renamed from: k */
    private C19281d[] f76695k = new C19281d[1];

    /* renamed from: l */
    private boolean f76696l;

    /* renamed from: m */
    private boolean f76697m = true;

    /* renamed from: n */
    private FeedbackApi f76698n = ((FeedbackApi) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(C19223b.f51890e).mo26430a().mo26435a(FeedbackApi.class));

    /* renamed from: com.ss.android.ugc.aweme.feedback.FeedbackThread2$FeedbackApi */
    public interface FeedbackApi {
        @C6457h
        C18253l<String> doGet(@C6450ac String str);

        @C6456g
        @C6468s(mo15750a = "/feedback/2/post_message/")
        C18253l<String> doPost(@C6463n int i, @C6455f Map<String, String> map, @C6475z Map<String, String> map2);
    }

    /* renamed from: c */
    private int m95376c() {
        return m95370a(0, 0, true);
    }

    /* renamed from: d */
    private int m95377d() {
        return m95370a(0, this.f76691g.mo74505a(true), false);
    }

    /* renamed from: e */
    private int m95378e() {
        return m95370a(this.f76691g.mo74505a(false), 0, false);
    }

    /* renamed from: a */
    public final void mo74488a() {
        this.f76696l = true;
        if (this.f76695k != null) {
            for (int i = 0; i < this.f76695k.length; i++) {
                if (this.f76695k[i] != null) {
                    try {
                        this.f76695k[i].mo26330a();
                    } catch (Throwable unused) {
                    }
                }
            }
        }
    }

    public final void run() {
        this.f76691g = C29072e.m95401a(this.f76690f);
        if (this.f76697m) {
            m95379f();
        } else {
            m95374b();
        }
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(C19913a.f51888c);
        sb.append("/feedback/2/list/");
        f76685a = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C19913a.f51888c);
        sb2.append("/feedback/3/list/");
        f76686b = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(C19913a.f51888c);
        sb3.append("/feedback/1/post_message/");
        f76687c = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        sb4.append(C19913a.f51887b);
        sb4.append("/2/data/upload_image/");
        f76688d = sb4.toString();
    }

    /* renamed from: f */
    private void m95379f() {
        int i;
        int i2;
        if (this.f76692h.f76835e == 2) {
            i = m95377d();
            this.f76692h.f76837g = this.f76691g.mo74506a(0, this.f76692h.f76832b, this.f76692h.f76833c, " DESC");
        } else if (this.f76692h.f76835e == 3) {
            i = m95377d();
            this.f76692h.f76837g = this.f76691g.mo74506a(0, this.f76692h.f76832b, -1, " DESC");
            this.f76692h.f76838h = this.f76691g.mo74509c();
        } else if (this.f76692h.f76835e == 5) {
            this.f76692h.f76837g = this.f76691g.mo74506a(0, 0, -1, null);
            this.f76692h.f76838h = this.f76691g.mo74509c();
            i = 0;
        } else if (this.f76692h.f76835e == 4) {
            i = m95377d();
            if (i == 0) {
                i = m95378e();
                this.f76692h.f76837g = this.f76691g.mo74506a(0, 0, -1, null);
                this.f76692h.f76838h = this.f76691g.mo74509c();
            }
        } else if (this.f76692h.f76835e == 1) {
            i = m95376c();
            this.f76692h.f76837g = this.f76691g.mo74506a(0, 0, -1, null);
            this.f76692h.f76838h = this.f76691g.mo74509c();
        } else {
            i = 18;
        }
        if (i == 0) {
            i2 = 10;
        } else {
            i2 = 11;
        }
        Message obtainMessage = this.f76689e.obtainMessage(i2);
        obtainMessage.obj = this.f76692h;
        obtainMessage.arg1 = i;
        this.f76689e.sendMessage(obtainMessage);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(41:1|2|(1:4)|5|(5:7|(2:9|(3:11|96|(1:98)(2:99|100))(3:12|(5:16|(1:18)|19|(1:21)|(4:25|(1:27)|28|(1:30)))|31))|90|96|(0)(0))|32|(1:34)|35|(1:37)|38|(1:40)|41|(1:43)|44|(1:46)|47|(1:49)|50|(1:52)|53|(1:55)|56|(1:58)|59|(1:61)|62|(1:64)|65|(1:67)|68|69|70|71|(1:73)|74|(1:78)|79|(1:81)|82|(4:84|(2:86|(1:88))(1:89)|96|(0)(0))|90) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:70:0x0248 */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0250 A[Catch:{ Throwable -> 0x02ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0270 A[Catch:{ Throwable -> 0x02ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x02b8 A[Catch:{ Throwable -> 0x02ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0301 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0302  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m95374b() {
        /*
            r13 = this;
            r0 = 11
            java.lang.String r1 = ""
            java.lang.String r2 = ""
            java.lang.String r3 = ""
            com.ss.android.ugc.aweme.feedback.q r4 = r13.f76693i     // Catch:{ Throwable -> 0x02ee }
            java.lang.String r4 = r4.f76824f     // Catch:{ Throwable -> 0x02ee }
            if (r4 != 0) goto L_0x0014
            com.ss.android.ugc.aweme.feedback.q r4 = r13.f76693i     // Catch:{ Throwable -> 0x02ee }
            java.lang.String r5 = ""
            r4.f76824f = r5     // Catch:{ Throwable -> 0x02ee }
        L_0x0014:
            java.io.File r4 = new java.io.File     // Catch:{ Throwable -> 0x02ee }
            com.ss.android.ugc.aweme.feedback.q r5 = r13.f76693i     // Catch:{ Throwable -> 0x02ee }
            java.lang.String r5 = r5.f76824f     // Catch:{ Throwable -> 0x02ee }
            r4.<init>(r5)     // Catch:{ Throwable -> 0x02ee }
            boolean r4 = r4.exists()     // Catch:{ Throwable -> 0x02ee }
            r5 = 0
            if (r4 == 0) goto L_0x0135
            java.util.HashMap r10 = new java.util.HashMap     // Catch:{ Throwable -> 0x02ee }
            r10.<init>()     // Catch:{ Throwable -> 0x02ee }
            java.lang.String r1 = "watermark"
            java.lang.String r2 = "0"
            r10.put(r1, r2)     // Catch:{ Throwable -> 0x02ee }
            java.lang.String r1 = "upload_image_choose"
            com.ss.android.ugc.aweme.app.g.d r2 = com.p280ss.android.ugc.aweme.app.p305g.C22984d.m75611a()     // Catch:{ Throwable -> 0x02ee }
            java.lang.String r3 = "faq_id"
            com.ss.android.ugc.aweme.feedback.q r4 = r13.f76693i     // Catch:{ Throwable -> 0x02ee }
            java.lang.String r4 = r4.f76825g     // Catch:{ Throwable -> 0x02ee }
            com.ss.android.ugc.aweme.app.g.d r2 = r2.mo59973a(r3, r4)     // Catch:{ Throwable -> 0x02ee }
            java.lang.String r3 = "type"
            java.lang.String r4 = "single"
            com.ss.android.ugc.aweme.app.g.d r2 = r2.mo59973a(r3, r4)     // Catch:{ Throwable -> 0x02ee }
            java.util.Map<java.lang.String, java.lang.String> r2 = r2.f60753a     // Catch:{ Throwable -> 0x02ee }
            com.p280ss.android.ugc.aweme.common.C6907h.m21524a(r1, r2)     // Catch:{ Throwable -> 0x02ee }
            r6 = 20480(0x5000, float:2.8699E-41)
            java.lang.String r7 = f76688d     // Catch:{ Throwable -> 0x02ee }
            java.lang.String r8 = "image"
            com.ss.android.ugc.aweme.feedback.q r1 = r13.f76693i     // Catch:{ Throwable -> 0x02ee }
            java.lang.String r9 = r1.f76824f     // Catch:{ Throwable -> 0x02ee }
            com.ss.android.common.c.d[] r11 = r13.f76695k     // Catch:{ Throwable -> 0x02ee }
            java.lang.String r1 = com.p280ss.android.common.util.NetworkUtils.postFile(r6, r7, r8, r9, r10, r11)     // Catch:{ Throwable -> 0x02ee }
            boolean r2 = com.bytedance.common.utility.C6319n.m19593a(r1)     // Catch:{ Throwable -> 0x02ee }
            if (r2 != 0) goto L_0x02e9
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Throwable -> 0x02ee }
            r2.<init>(r1)     // Catch:{ Throwable -> 0x02ee }
            boolean r1 = com.p280ss.android.newmedia.p893d.C19930a.isApiSuccess(r2)     // Catch:{ Throwable -> 0x02ee }
            if (r1 != 0) goto L_0x0092
            m95375b(r2)     // Catch:{ Throwable -> 0x02ee }
            java.lang.String r1 = "upload_image_choose_failed"
            com.ss.android.ugc.aweme.app.g.d r2 = com.p280ss.android.ugc.aweme.app.p305g.C22984d.m75611a()     // Catch:{ Throwable -> 0x02ee }
            java.lang.String r3 = "faq_id"
            com.ss.android.ugc.aweme.feedback.q r4 = r13.f76693i     // Catch:{ Throwable -> 0x02ee }
            java.lang.String r4 = r4.f76825g     // Catch:{ Throwable -> 0x02ee }
            com.ss.android.ugc.aweme.app.g.d r2 = r2.mo59973a(r3, r4)     // Catch:{ Throwable -> 0x02ee }
            java.lang.String r3 = "type"
            java.lang.String r4 = "single"
            com.ss.android.ugc.aweme.app.g.d r2 = r2.mo59973a(r3, r4)     // Catch:{ Throwable -> 0x02ee }
            java.util.Map<java.lang.String, java.lang.String> r2 = r2.f60753a     // Catch:{ Throwable -> 0x02ee }
            com.p280ss.android.ugc.aweme.common.C6907h.m21524a(r1, r2)     // Catch:{ Throwable -> 0x02ee }
            r1 = 16
            goto L_0x02fd
        L_0x0092:
            java.lang.String r1 = "upload_image_choose_succeed"
            com.ss.android.ugc.aweme.app.g.d r3 = com.p280ss.android.ugc.aweme.app.p305g.C22984d.m75611a()     // Catch:{ Throwable -> 0x02ee }
            java.lang.String r4 = "faq_id"
            com.ss.android.ugc.aweme.feedback.q r6 = r13.f76693i     // Catch:{ Throwable -> 0x02ee }
            java.lang.String r6 = r6.f76825g     // Catch:{ Throwable -> 0x02ee }
            com.ss.android.ugc.aweme.app.g.d r3 = r3.mo59973a(r4, r6)     // Catch:{ Throwable -> 0x02ee }
            java.lang.String r4 = "type"
            java.lang.String r6 = "single"
            com.ss.android.ugc.aweme.app.g.d r3 = r3.mo59973a(r4, r6)     // Catch:{ Throwable -> 0x02ee }
            java.util.Map<java.lang.String, java.lang.String> r3 = r3.f60753a     // Catch:{ Throwable -> 0x02ee }
            com.p280ss.android.ugc.aweme.common.C6907h.m21524a(r1, r3)     // Catch:{ Throwable -> 0x02ee }
            java.lang.String r1 = "data"
            org.json.JSONObject r1 = r2.optJSONObject(r1)     // Catch:{ Throwable -> 0x02ee }
            java.lang.String r2 = "web_uri"
            java.lang.String r3 = ""
            java.lang.String r2 = r1.optString(r2, r3)     // Catch:{ Throwable -> 0x02ee }
            java.lang.String r3 = "width"
            java.lang.String r3 = r1.optString(r3)     // Catch:{ Throwable -> 0x02ee }
            java.lang.String r4 = "height"
            java.lang.String r4 = r1.optString(r4)     // Catch:{ Throwable -> 0x02ee }
            java.lang.String r6 = "url_list"
            org.json.JSONArray r1 = r1.optJSONArray(r6)     // Catch:{ Throwable -> 0x02ee }
            if (r1 == 0) goto L_0x0132
            int r6 = r1.length()     // Catch:{ Throwable -> 0x02ee }
            if (r6 <= 0) goto L_0x0132
            com.ss.android.image.b r6 = r13.f76694j     // Catch:{ Throwable -> 0x02ee }
            if (r6 != 0) goto L_0x00e4
            com.ss.android.image.b r6 = new com.ss.android.image.b     // Catch:{ Throwable -> 0x02ee }
            android.content.Context r7 = r13.f76690f     // Catch:{ Throwable -> 0x02ee }
            r6.<init>(r7)     // Catch:{ Throwable -> 0x02ee }
            r13.f76694j = r6     // Catch:{ Throwable -> 0x02ee }
        L_0x00e4:
            r6 = 0
            org.json.JSONObject r1 = r1.getJSONObject(r5)     // Catch:{ Throwable -> 0x02ee }
            if (r1 == 0) goto L_0x00f1
            java.lang.String r6 = "url"
            java.lang.String r6 = r1.optString(r6)     // Catch:{ Throwable -> 0x02ee }
        L_0x00f1:
            if (r6 == 0) goto L_0x0132
            int r1 = r6.length()     // Catch:{ Throwable -> 0x02ee }
            if (r1 <= 0) goto L_0x0132
            java.lang.String r1 = "~noop.image"
            boolean r1 = r6.endsWith(r1)     // Catch:{ Throwable -> 0x02ee }
            if (r1 == 0) goto L_0x0109
            java.lang.String r1 = "~noop.image"
            java.lang.String r7 = ""
            java.lang.String r6 = r6.replace(r1, r7)     // Catch:{ Throwable -> 0x02ee }
        L_0x0109:
            java.lang.String r1 = "/img/"
            java.lang.String r7 = "/obj/"
            java.lang.String r1 = r6.replace(r1, r7)     // Catch:{ Throwable -> 0x02ee }
            java.lang.String r1 = com.bytedance.common.utility.C6306c.m19561a(r1)     // Catch:{ Throwable -> 0x02ee }
            com.ss.android.image.b r6 = r13.f76694j     // Catch:{ Throwable -> 0x02ee }
            java.lang.String r6 = r6.mo16652c(r1)     // Catch:{ Throwable -> 0x02ee }
            com.ss.android.image.b r7 = r13.f76694j     // Catch:{ Throwable -> 0x02ee }
            java.lang.String r1 = r7.mo16654e(r1)     // Catch:{ Throwable -> 0x02ee }
            com.ss.android.ugc.aweme.feedback.q r7 = r13.f76693i     // Catch:{ Throwable -> 0x02ee }
            java.lang.String r7 = r7.f76824f     // Catch:{ Throwable -> 0x02ee }
            boolean r6 = com.p280ss.android.ugc.aweme.video.C7276d.m22820d(r7, r6)     // Catch:{ Throwable -> 0x02ee }
            if (r6 != 0) goto L_0x0132
            com.ss.android.ugc.aweme.feedback.q r6 = r13.f76693i     // Catch:{ Throwable -> 0x02ee }
            java.lang.String r6 = r6.f76824f     // Catch:{ Throwable -> 0x02ee }
            com.p280ss.android.ugc.aweme.video.C7276d.m22820d(r6, r1)     // Catch:{ Throwable -> 0x02ee }
        L_0x0132:
            r1 = r2
            r2 = r3
            r3 = r4
        L_0x0135:
            java.lang.String r4 = ""
            com.ss.android.ugc.aweme.framework.services.ServiceManager r6 = com.p280ss.android.ugc.aweme.framework.services.ServiceManager.get()     // Catch:{ Throwable -> 0x02ee }
            java.lang.Class<com.ss.android.ugc.aweme.services.IAVService> r7 = com.p280ss.android.ugc.aweme.services.IAVService.class
            java.lang.Object r6 = r6.getService(r7)     // Catch:{ Throwable -> 0x02ee }
            com.ss.android.ugc.aweme.services.IAVService r6 = (com.p280ss.android.ugc.aweme.services.IAVService) r6     // Catch:{ Throwable -> 0x02ee }
            com.ss.android.ugc.aweme.services.settings.IAVSettingsService r6 = r6.avSettingsService()     // Catch:{ Throwable -> 0x02ee }
            boolean r6 = r6.enableFeedbackLog()     // Catch:{ Throwable -> 0x02ee }
            if (r6 == 0) goto L_0x0151
            java.lang.String r4 = com.p280ss.android.ugc.aweme.feedback.C29081i.m95422a()     // Catch:{ Throwable -> 0x02ee }
        L_0x0151:
            java.util.HashMap r6 = new java.util.HashMap     // Catch:{ Throwable -> 0x02ee }
            r6.<init>()     // Catch:{ Throwable -> 0x02ee }
            java.lang.String r7 = "appkey"
            java.lang.String r8 = "musically-android"
            r6.put(r7, r8)     // Catch:{ Throwable -> 0x02ee }
            java.lang.String r7 = "content"
            com.ss.android.ugc.aweme.feedback.q r8 = r13.f76693i     // Catch:{ Throwable -> 0x02ee }
            java.lang.String r8 = r8.f76819a     // Catch:{ Throwable -> 0x02ee }
            r6.put(r7, r8)     // Catch:{ Throwable -> 0x02ee }
            com.ss.android.ugc.aweme.feedback.q r7 = r13.f76693i     // Catch:{ Throwable -> 0x02ee }
            java.lang.String r7 = r7.f76820b     // Catch:{ Throwable -> 0x02ee }
            boolean r7 = com.bytedance.common.utility.C6319n.m19593a(r7)     // Catch:{ Throwable -> 0x02ee }
            if (r7 != 0) goto L_0x0179
            java.lang.String r7 = "contact"
            com.ss.android.ugc.aweme.feedback.q r8 = r13.f76693i     // Catch:{ Throwable -> 0x02ee }
            java.lang.String r8 = r8.f76820b     // Catch:{ Throwable -> 0x02ee }
            r6.put(r7, r8)     // Catch:{ Throwable -> 0x02ee }
        L_0x0179:
            com.ss.android.ugc.aweme.feedback.q r7 = r13.f76693i     // Catch:{ Throwable -> 0x02ee }
            java.lang.String r7 = r7.f76821c     // Catch:{ Throwable -> 0x02ee }
            boolean r7 = com.bytedance.common.utility.C6319n.m19593a(r7)     // Catch:{ Throwable -> 0x02ee }
            if (r7 != 0) goto L_0x018c
            java.lang.String r7 = "report_type"
            com.ss.android.ugc.aweme.feedback.q r8 = r13.f76693i     // Catch:{ Throwable -> 0x02ee }
            java.lang.String r8 = r8.f76821c     // Catch:{ Throwable -> 0x02ee }
            r6.put(r7, r8)     // Catch:{ Throwable -> 0x02ee }
        L_0x018c:
            com.ss.android.ugc.aweme.feedback.q r7 = r13.f76693i     // Catch:{ Throwable -> 0x02ee }
            java.lang.String r7 = r7.f76822d     // Catch:{ Throwable -> 0x02ee }
            boolean r7 = com.bytedance.common.utility.C6319n.m19593a(r7)     // Catch:{ Throwable -> 0x02ee }
            if (r7 != 0) goto L_0x019f
            java.lang.String r7 = "report_content"
            com.ss.android.ugc.aweme.feedback.q r8 = r13.f76693i     // Catch:{ Throwable -> 0x02ee }
            java.lang.String r8 = r8.f76822d     // Catch:{ Throwable -> 0x02ee }
            r6.put(r7, r8)     // Catch:{ Throwable -> 0x02ee }
        L_0x019f:
            com.ss.android.ugc.aweme.feedback.q r7 = r13.f76693i     // Catch:{ Throwable -> 0x02ee }
            long r7 = r7.f76823e     // Catch:{ Throwable -> 0x02ee }
            r9 = 0
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 <= 0) goto L_0x01b6
            java.lang.String r7 = "user_id"
            com.ss.android.ugc.aweme.feedback.q r8 = r13.f76693i     // Catch:{ Throwable -> 0x02ee }
            long r11 = r8.f76823e     // Catch:{ Throwable -> 0x02ee }
            java.lang.String r8 = java.lang.String.valueOf(r11)     // Catch:{ Throwable -> 0x02ee }
            r6.put(r7, r8)     // Catch:{ Throwable -> 0x02ee }
        L_0x01b6:
            boolean r7 = com.bytedance.common.utility.C6319n.m19593a(r1)     // Catch:{ Throwable -> 0x02ee }
            if (r7 != 0) goto L_0x01c1
            java.lang.String r7 = "image_uri"
            r6.put(r7, r1)     // Catch:{ Throwable -> 0x02ee }
        L_0x01c1:
            boolean r1 = com.bytedance.common.utility.C6319n.m19593a(r4)     // Catch:{ Throwable -> 0x02ee }
            if (r1 != 0) goto L_0x01cc
            java.lang.String r1 = "aweme_infra_log"
            r6.put(r1, r4)     // Catch:{ Throwable -> 0x02ee }
        L_0x01cc:
            java.lang.String r1 = "device"
            java.lang.String r4 = android.os.Build.MODEL     // Catch:{ Throwable -> 0x02ee }
            r6.put(r1, r4)     // Catch:{ Throwable -> 0x02ee }
            com.ss.android.ugc.aweme.feedback.q r1 = r13.f76693i     // Catch:{ Throwable -> 0x02ee }
            java.lang.String r1 = r1.f76825g     // Catch:{ Throwable -> 0x02ee }
            boolean r1 = com.bytedance.common.utility.C6319n.m19593a(r1)     // Catch:{ Throwable -> 0x02ee }
            if (r1 != 0) goto L_0x01e6
            java.lang.String r1 = "feedback_id"
            com.ss.android.ugc.aweme.feedback.q r4 = r13.f76693i     // Catch:{ Throwable -> 0x02ee }
            java.lang.String r4 = r4.f76825g     // Catch:{ Throwable -> 0x02ee }
            r6.put(r1, r4)     // Catch:{ Throwable -> 0x02ee }
        L_0x01e6:
            com.ss.android.ugc.aweme.feedback.q r1 = r13.f76693i     // Catch:{ Throwable -> 0x02ee }
            java.lang.String r1 = r1.f76826h     // Catch:{ Throwable -> 0x02ee }
            boolean r1 = com.bytedance.common.utility.C6319n.m19593a(r1)     // Catch:{ Throwable -> 0x02ee }
            if (r1 != 0) goto L_0x01f9
            java.lang.String r1 = "fantasy_log"
            com.ss.android.ugc.aweme.feedback.q r4 = r13.f76693i     // Catch:{ Throwable -> 0x02ee }
            java.lang.String r4 = r4.f76826h     // Catch:{ Throwable -> 0x02ee }
            r6.put(r1, r4)     // Catch:{ Throwable -> 0x02ee }
        L_0x01f9:
            com.ss.android.ugc.aweme.feedback.q r1 = r13.f76693i     // Catch:{ Throwable -> 0x02ee }
            java.lang.String r1 = r1.f76827i     // Catch:{ Throwable -> 0x02ee }
            boolean r1 = com.bytedance.common.utility.C6319n.m19593a(r1)     // Catch:{ Throwable -> 0x02ee }
            if (r1 != 0) goto L_0x020c
            java.lang.String r1 = "aweme_login_log"
            com.ss.android.ugc.aweme.feedback.q r4 = r13.f76693i     // Catch:{ Throwable -> 0x02ee }
            java.lang.String r4 = r4.f76827i     // Catch:{ Throwable -> 0x02ee }
            r6.put(r1, r4)     // Catch:{ Throwable -> 0x02ee }
        L_0x020c:
            com.ss.android.ugc.aweme.feedback.q r1 = r13.f76693i     // Catch:{ Throwable -> 0x02ee }
            java.lang.String r1 = r1.f76828j     // Catch:{ Throwable -> 0x02ee }
            boolean r1 = com.bytedance.common.utility.C6319n.m19593a(r1)     // Catch:{ Throwable -> 0x02ee }
            if (r1 != 0) goto L_0x021f
            java.lang.String r1 = "last_uid"
            com.ss.android.ugc.aweme.feedback.q r4 = r13.f76693i     // Catch:{ Throwable -> 0x02ee }
            java.lang.String r4 = r4.f76828j     // Catch:{ Throwable -> 0x02ee }
            r6.put(r1, r4)     // Catch:{ Throwable -> 0x02ee }
        L_0x021f:
            com.ss.android.ugc.aweme.feedback.q r1 = r13.f76693i     // Catch:{ Throwable -> 0x02ee }
            java.lang.String r1 = r1.f76829k     // Catch:{ Throwable -> 0x02ee }
            boolean r1 = com.bytedance.common.utility.C6319n.m19593a(r1)     // Catch:{ Throwable -> 0x02ee }
            if (r1 != 0) goto L_0x0232
            java.lang.String r1 = "description"
            com.ss.android.ugc.aweme.feedback.q r4 = r13.f76693i     // Catch:{ Throwable -> 0x02ee }
            java.lang.String r4 = r4.f76829k     // Catch:{ Throwable -> 0x02ee }
            r6.put(r1, r4)     // Catch:{ Throwable -> 0x02ee }
        L_0x0232:
            android.content.Context r1 = r13.f76690f     // Catch:{ Exception -> 0x0248 }
            java.lang.String r1 = com.p280ss.android.common.applog.AppLog.getVersion(r1)     // Catch:{ Exception -> 0x0248 }
            java.lang.String r4 = "app_version"
            r6.put(r4, r1)     // Catch:{ Exception -> 0x0248 }
            java.lang.String r1 = "sig_hash"
            android.content.Context r4 = r13.f76690f     // Catch:{ Exception -> 0x0248 }
            java.lang.String r4 = com.p280ss.android.common.applog.AppLog.getSigHash(r4)     // Catch:{ Exception -> 0x0248 }
            r6.put(r1, r4)     // Catch:{ Exception -> 0x0248 }
        L_0x0248:
            android.content.Context r1 = r13.f76690f     // Catch:{ Throwable -> 0x02ee }
            java.lang.String r1 = com.p280ss.android.common.util.NetworkUtils.getNetworkAccessType(r1)     // Catch:{ Throwable -> 0x02ee }
            if (r1 == 0) goto L_0x0255
            java.lang.String r4 = "network_type"
            r6.put(r4, r1)     // Catch:{ Throwable -> 0x02ee }
        L_0x0255:
            java.lang.String r1 = com.p280ss.android.ugc.aweme.feedback.C29085m.m95428a()     // Catch:{ Throwable -> 0x02ee }
            if (r1 == 0) goto L_0x0268
            int r4 = r1.length()     // Catch:{ Throwable -> 0x02ee }
            r7 = 30
            if (r4 >= r7) goto L_0x0268
            java.lang.String r4 = "rom"
            r6.put(r4, r1)     // Catch:{ Throwable -> 0x02ee }
        L_0x0268:
            com.ss.android.ugc.aweme.feedback.q r1 = r13.f76693i     // Catch:{ Throwable -> 0x02ee }
            long r7 = r1.f76830l     // Catch:{ Throwable -> 0x02ee }
            int r1 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r1 == 0) goto L_0x0287
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Throwable -> 0x02ee }
            r1.<init>()     // Catch:{ Throwable -> 0x02ee }
            java.lang.String r4 = "roomId"
            com.ss.android.ugc.aweme.feedback.q r7 = r13.f76693i     // Catch:{ Throwable -> 0x02ee }
            long r7 = r7.f76830l     // Catch:{ Throwable -> 0x02ee }
            r1.put(r4, r7)     // Catch:{ Throwable -> 0x02ee }
            java.lang.String r4 = "extra_persistent_params"
            java.lang.String r1 = r1.toString()     // Catch:{ Throwable -> 0x02ee }
            r6.put(r4, r1)     // Catch:{ Throwable -> 0x02ee }
        L_0x0287:
            m95372a(r6)     // Catch:{ Throwable -> 0x02ee }
            java.lang.String r1 = "image_width"
            r6.put(r1, r2)     // Catch:{ Throwable -> 0x02ee }
            java.lang.String r1 = "image_height"
            r6.put(r1, r3)     // Catch:{ Throwable -> 0x02ee }
            r1 = 1
            com.p280ss.android.common.applog.NetUtil.putCommonParams(r6, r1)     // Catch:{ Throwable -> 0x02ee }
            java.util.HashMap r1 = new java.util.HashMap     // Catch:{ Throwable -> 0x02ee }
            r1.<init>()     // Catch:{ Throwable -> 0x02ee }
            java.lang.String r2 = "app_name"
            java.lang.String r3 = "musical_ly"
            r1.put(r2, r3)     // Catch:{ Throwable -> 0x02ee }
            com.ss.android.ugc.aweme.feedback.FeedbackThread2$FeedbackApi r2 = r13.f76698n     // Catch:{ Throwable -> 0x02ee }
            r3 = 12040(0x2f08, float:1.6872E-41)
            com.google.common.util.concurrent.l r1 = r2.doPost(r3, r6, r1)     // Catch:{ Throwable -> 0x02ee }
            java.lang.Object r1 = r1.get()     // Catch:{ Throwable -> 0x02ee }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Throwable -> 0x02ee }
            boolean r2 = com.bytedance.common.utility.C6319n.m19593a(r1)     // Catch:{ Throwable -> 0x02ee }
            if (r2 != 0) goto L_0x02e9
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Throwable -> 0x02ee }
            r2.<init>(r1)     // Catch:{ Throwable -> 0x02ee }
            java.lang.String r1 = "message"
            java.lang.String r1 = r2.optString(r1)     // Catch:{ Throwable -> 0x02ee }
            java.lang.String r3 = "success"
            boolean r1 = r3.equals(r1)     // Catch:{ Throwable -> 0x02ee }
            if (r1 != 0) goto L_0x02e5
            java.lang.String r1 = "data"
            org.json.JSONObject r1 = r2.optJSONObject(r1)     // Catch:{ Throwable -> 0x02ee }
            r13.m95373a(r2)     // Catch:{ Throwable -> 0x02ee }
            java.lang.String r2 = "session_expired"
            java.lang.String r3 = "name"
            java.lang.String r1 = r1.optString(r3)     // Catch:{ Throwable -> 0x02ee }
            boolean r1 = r2.equals(r1)     // Catch:{ Throwable -> 0x02ee }
            if (r1 == 0) goto L_0x02e9
            r1 = 105(0x69, float:1.47E-43)
            goto L_0x02fd
        L_0x02e5:
            r0 = 10
            r1 = 0
            goto L_0x02fd
        L_0x02e9:
            r5 = 18
            r1 = 18
            goto L_0x02fd
        L_0x02ee:
            r1 = move-exception
            boolean r2 = r1 instanceof java.util.concurrent.ExecutionException
            if (r2 == 0) goto L_0x02f7
            java.lang.Throwable r1 = r1.getCause()
        L_0x02f7:
            android.content.Context r2 = r13.f76690f
            int r1 = com.p280ss.android.ugc.aweme.app.api.p1023b.C22814a.m75246b(r2, r1)
        L_0x02fd:
            boolean r2 = r13.f76696l
            if (r2 == 0) goto L_0x0302
            return
        L_0x0302:
            android.os.Handler r2 = r13.f76689e
            android.os.Message r0 = r2.obtainMessage(r0)
            r0.arg1 = r1
            android.os.Handler r1 = r13.f76689e
            r1.sendMessage(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.feedback.FeedbackThread2.m95374b():void");
    }

    /* renamed from: a */
    private static void m95372a(Map<String, String> map) {
        if (C29096c.m95445b()) {
            for (Entry entry : C29096c.m95443a().entrySet()) {
                map.put((String) entry.getKey(), (String) entry.getValue());
            }
        }
    }

    /* renamed from: b */
    private static void m95375b(JSONObject jSONObject) {
        C6877n.m21447a("feedback_uploadimage_error_rate", C6869c.m21381a().mo16885a("errorCode", Integer.valueOf(-1024)).mo16887a("errorDesc", jSONObject.optString("data")).mo16888b());
    }

    /* renamed from: a */
    private void m95373a(JSONObject jSONObject) {
        int optInt = jSONObject.optInt("err_code", -1024);
        String optString = jSONObject.optString("message");
        C6907h.m21524a("feedback_failed", (Map) C22984d.m75611a().mo59973a("faq_id", this.f76693i.f76825g).mo59973a("page_type", "app").mo59973a("question_content", this.f76693i.f76819a).mo59970a("status_code", optInt).mo59973a("message", optString).f60753a);
        C6877n.m21447a("feedback_error_rate", C6869c.m21381a().mo16885a("errorCode", Integer.valueOf(optInt)).mo16887a("errorDesc", optString).mo16888b());
    }

    public FeedbackThread2(Handler handler, Context context, C29091r rVar) {
        this.f76689e = handler;
        this.f76690f = context.getApplicationContext();
        this.f76692h = rVar;
    }

    public FeedbackThread2(C6309f fVar, Context context, C29090q qVar) {
        this.f76689e = fVar;
        this.f76690f = context.getApplicationContext();
        this.f76693i = qVar;
        this.f76697m = false;
    }

    /* renamed from: a */
    private int m95370a(long j, long j2, boolean z) {
        int a;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        long j3 = -1;
        long j4 = j;
        while (true) {
            C29091r rVar = new C29091r(j4, j2, 50);
            a = m95371a((List<C29075g>) arrayList, (List<C29075g>) arrayList2, rVar);
            if (a != 0 || arrayList.size() <= 0) {
                break;
            }
            long j5 = ((C29075g) arrayList.get(arrayList.size() - 1)).f76752b;
            if (j3 == j5 || j2 >= j5 || !rVar.f76836f) {
                break;
            }
            j3 = j5;
            j4 = j3;
        }
        if (z && a == 0) {
            this.f76691g.mo74508b();
        }
        this.f76691g.mo74507a((List<C29075g>) arrayList);
        this.f76691g.mo74507a((List<C29075g>) arrayList2);
        return a;
    }

    /* renamed from: a */
    private int m95371a(List<C29075g> list, List<C29075g> list2, C29091r rVar) {
        boolean z;
        List<C29075g> list3 = list;
        C29091r rVar2 = rVar;
        try {
            StringBuffer stringBuffer = new StringBuffer(f76686b);
            stringBuffer.append("?appkey=musically-android");
            if (rVar2.f76833c > 0) {
                StringBuilder sb = new StringBuilder("&count=");
                sb.append(rVar2.f76833c);
                stringBuffer.append(sb.toString());
            }
            long j = 0;
            if (rVar2.f76832b > 0) {
                StringBuilder sb2 = new StringBuilder("&min_id=");
                sb2.append(rVar2.f76832b);
                stringBuffer.append(sb2.toString());
            }
            if (rVar2.f76831a > 0) {
                StringBuilder sb3 = new StringBuilder("&max_id=");
                sb3.append(rVar2.f76831a);
                stringBuffer.append(sb3.toString());
            }
            String str = (String) this.f76698n.doGet(stringBuffer.toString()).get();
            if (C6319n.m19593a(str)) {
                return 18;
            }
            JSONObject jSONObject = new JSONObject(str);
            if ("success".equals(jSONObject.optString("message"))) {
                JSONArray optJSONArray = jSONObject.optJSONArray("data");
                int length = optJSONArray.length();
                if (jSONObject.isNull("has_more")) {
                    if (length >= rVar2.f76833c) {
                        z = true;
                    } else {
                        z = false;
                    }
                    rVar2.f76836f = z;
                } else {
                    rVar2.f76836f = jSONObject.optBoolean("has_more", false);
                }
                int i = 0;
                while (i < length) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    long optLong = optJSONObject.optLong("id", -1);
                    if (optLong > j) {
                        C29075g gVar = new C29075g(optLong);
                        gVar.mo74513a(optJSONObject);
                        list3.add(gVar);
                        if (gVar.f76763m != null && gVar.f76763m.size() > 0) {
                            for (C29076a aVar : gVar.f76763m) {
                                C29075g gVar2 = new C29075g(gVar.f76751a, gVar.f76752b, gVar.f76753c);
                                gVar2.f76754d = gVar.f76754d;
                                gVar2.f76757g = gVar.f76757g;
                                gVar2.f76760j = gVar.f76760j;
                                gVar2.f76756f = aVar.f76767c;
                                gVar2.f76758h = aVar.f76765a;
                                gVar2.f76759i = aVar.f76766b;
                                gVar2.f76764n = true;
                                list3.add(gVar2);
                            }
                        }
                    }
                    i++;
                    j = 0;
                }
                JSONObject optJSONObject2 = jSONObject.optJSONObject("default_item");
                if (optJSONObject2 != null) {
                    C29075g gVar3 = new C29075g(optJSONObject2.optLong("id", 0));
                    gVar3.mo74513a(optJSONObject2);
                    gVar3.f76760j = 2;
                    list2.add(gVar3);
                }
                return 0;
            } else if ("session_expired".equals(jSONObject.optJSONObject("data").optString("name"))) {
                return 105;
            } else {
                return 18;
            }
        } catch (Throwable th) {
            th = th;
            if (th instanceof ExecutionException) {
                th = th.getCause();
            }
            return C22814a.m75246b(this.f76690f, th);
        }
    }
}
