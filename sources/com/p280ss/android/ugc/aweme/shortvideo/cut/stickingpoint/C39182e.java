package com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.apm.util.C6292i;
import com.bytedance.common.utility.C6306c;
import com.bytedance.ies.dmt.p262ui.bubbleview.C10751a;
import com.bytedance.ies.dmt.p262ui.bubbleview.C10751a.C10752a;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.google.common.util.concurrent.C18245g;
import com.google.common.util.concurrent.C18246h;
import com.p280ss.android.ugc.asve.p754b.C15389d;
import com.p280ss.android.ugc.aweme.base.p1062f.C23337e;
import com.p280ss.android.ugc.aweme.base.p1062f.C23339g;
import com.p280ss.android.ugc.aweme.feed.experiment.DouPlusShareGuideExperiment;
import com.p280ss.android.ugc.aweme.port.p1479in.C35544ak;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.property.AVAB;
import com.p280ss.android.ugc.aweme.property.AVSettings.Property;
import com.p280ss.android.ugc.aweme.shortvideo.AVMusic;
import com.p280ss.android.ugc.aweme.shortvideo.C39811er;
import com.p280ss.android.ugc.aweme.shortvideo.C39961gh;
import com.p280ss.android.ugc.aweme.shortvideo.C39966gm;
import com.p280ss.android.ugc.aweme.shortvideo.TTUploaderService;
import com.p280ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p1556c.C39164b;
import com.p280ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity;
import com.p280ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.C40173d;
import com.p280ss.android.ugc.aweme.shortvideo.stickpoint.StickPointData;
import com.p280ss.android.ugc.aweme.utils.C43127fh;
import com.p280ss.android.ugc.p1716b.C43659c;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.C7581n;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.e */
public final class C39182e {

    /* renamed from: a */
    public static final C39182e f101552a = new C39182e();

    /* renamed from: b */
    private static String f101553b;

    /* renamed from: c */
    private static String f101554c;

    /* renamed from: d */
    private static boolean f101555d;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.e$a */
    static final class C39183a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Activity f101556a;

        /* renamed from: b */
        final /* synthetic */ View f101557b;

        /* renamed from: c */
        final /* synthetic */ C10751a f101558c;

        /* renamed from: d */
        final /* synthetic */ C23339g f101559d;

        C39183a(Activity activity, View view, C10751a aVar, C23339g gVar) {
            this.f101556a = activity;
            this.f101557b = view;
            this.f101558c = aVar;
            this.f101559d = gVar;
        }

        public final void run() {
            int i;
            float width;
            if (this.f101556a != null && !this.f101556a.isFinishing()) {
                int[] iArr = new int[2];
                this.f101557b.getLocationOnScreen(iArr);
                int c = iArr[1] - this.f101558c.mo25723c();
                if (C43127fh.m136806a(this.f101556a)) {
                    i = (iArr[0] + this.f101557b.getWidth()) - this.f101558c.mo25724d();
                    width = ((float) this.f101558c.mo25724d()) - (((float) this.f101557b.getWidth()) / 2.0f);
                } else {
                    i = iArr[0];
                    width = ((float) this.f101557b.getWidth()) / 2.0f;
                }
                this.f101558c.mo25718a(this.f101557b, 48, i, c, width);
                this.f101559d.mo60634b("bubble_to_stick_point_hint_shown", true);
                C39193g.m125131b();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.e$b */
    public static final class C39184b implements C18245g<Object> {

        /* renamed from: a */
        final /* synthetic */ C15389d f101560a;

        /* renamed from: b */
        final /* synthetic */ C39164b f101561b;

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.e$b$a */
        static final class C39185a<TTaskResult, TContinuationResult> implements C1591g<TResult, TContinuationResult> {

            /* renamed from: a */
            final /* synthetic */ C39184b f101562a;

            C39185a(C39184b bVar) {
                this.f101562a = bVar;
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public C7581n then(C1592h<StickPointUploadTask> hVar) {
                boolean z;
                C7573i.m23582a((Object) hVar, "it");
                if (hVar.mo6882b() && ((StickPointUploadTask) hVar.mo6890e()).f101415a != null) {
                    String str = ((StickPointUploadTask) hVar.mo6890e()).f101415a;
                    if (str == null) {
                        C7573i.m23580a();
                    }
                    if (str.length() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        C39164b bVar = this.f101562a.f101561b;
                        if (bVar == null) {
                            return null;
                        }
                        bVar.mo97287a(((StickPointUploadTask) hVar.mo6890e()).f101415a);
                        return C7581n.f20898a;
                    }
                }
                C39164b bVar2 = this.f101562a.f101561b;
                if (bVar2 == null) {
                    return null;
                }
                bVar2.mo97288a((Throwable) hVar.mo6891f());
                return C7581n.f20898a;
            }
        }

        public final void onFailure(Throwable th) {
            C7573i.m23587b(th, "t");
            C39164b bVar = this.f101561b;
            if (bVar != null) {
                bVar.mo97288a(th);
            }
        }

        public final void onSuccess(Object obj) {
            String e = C35574k.m114859a().mo70091f().mo93346e(Property.SdkV4AuthKey);
            if (!TextUtils.isEmpty(e)) {
                C39961gh ghVar = (C39961gh) C35574k.m114859a().mo70078L().getRetrofitFactoryGson().mo15974a(e, C39961gh.class);
                File file = new File(C39182e.m125096b());
                String path = file.getPath();
                C7573i.m23582a((Object) path, "file.path");
                if (!file.exists()) {
                    file.createNewFile();
                }
                if (this.f101560a == null) {
                    C39164b bVar = this.f101561b;
                    if (bVar != null) {
                        bVar.mo97288a(new Throwable("veEditor = null"));
                    }
                }
                int c = this.f101560a.mo38826c(path);
                if (c != 0) {
                    C39164b bVar2 = this.f101561b;
                    if (bVar2 != null) {
                        bVar2.mo97288a(new Throwable(String.valueOf(c)));
                        return;
                    }
                    return;
                }
                int d = this.f101560a.mo38834d(path);
                if (d != 0) {
                    C39164b bVar3 = this.f101561b;
                    if (bVar3 != null) {
                        bVar3.mo97288a(new Throwable(String.valueOf(d)));
                        return;
                    }
                    return;
                }
                StickPointUploadTask stickPointUploadTask = new StickPointUploadTask(path);
                C7573i.m23582a((Object) ghVar, "config");
                C39966gm gmVar = ghVar.f103779a;
                C7573i.m23582a((Object) gmVar, "config.uploadVideoConfig");
                stickPointUploadTask.mo97359a(gmVar).mo6875a((C1591g<TResult, TContinuationResult>) new C39185a<TResult,TContinuationResult>(this));
            }
        }

        C39184b(C15389d dVar, C39164b bVar) {
            this.f101560a = dVar;
            this.f101561b = bVar;
        }
    }

    private C39182e() {
    }

    /* renamed from: a */
    public static String m125091a() {
        return f101553b;
    }

    /* renamed from: b */
    public static String m125096b() {
        return f101554c;
    }

    /* renamed from: c */
    public static int m125099c() {
        int b = C35563c.f93231M.mo93306b(AVAB.Property.StickPointMusicCutLength);
        if (b <= 0) {
            b = 20;
        }
        return b * 1000;
    }

    /* renamed from: e */
    public static boolean m125102e() {
        return C35563c.f93231M.mo93305a(AVAB.Property.EnableSmartMusicStickPoint);
    }

    /* renamed from: f */
    public static final boolean m125103f() {
        return C35563c.f93231M.mo93305a(AVAB.Property.EnableSmartStickPointFeedback);
    }

    /* renamed from: g */
    public static boolean m125104g() {
        return C35563c.f93231M.mo93305a(AVAB.Property.EnableMusicStickPoint);
    }

    /* renamed from: i */
    public static boolean m125105i() {
        if (C35563c.f93231M.mo93306b(AVAB.Property.StickPointDefaltMode) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    private static boolean m125106j() {
        return C35563c.f93231M.mo93305a(AVAB.Property.ShowMusicStickPointBubble);
    }

    /* renamed from: d */
    public final int mo97469d() {
        if (m125104g()) {
            return C40173d.m128353a();
        }
        return 12;
    }

    /* renamed from: h */
    public final boolean mo97470h() {
        if (!f101555d || !m125104g()) {
            return false;
        }
        return true;
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(C39811er.f103468d);
        sb.append("aiCutData.txt");
        f101554c = sb.toString();
    }

    /* renamed from: a */
    public static void m125094a(String str) {
        f101553b = str;
    }

    /* renamed from: a */
    public static void m125095a(boolean z) {
        f101555d = z;
    }

    /* renamed from: b */
    public static String m125097b(AVMusic aVMusic) {
        if (aVMusic == null || aVMusic.getStickPointMusicAlg() == null) {
            return "";
        }
        return aVMusic.getStickPointMusicAlg().getDefaultLocalPath();
    }

    /* renamed from: c */
    public static String m125100c(AVMusic aVMusic) {
        if (aVMusic == null || TextUtils.isEmpty(aVMusic.getPath())) {
            return null;
        }
        return C43659c.m138324a().mo105612a(aVMusic.getPath());
    }

    /* renamed from: b */
    private static String m125098b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        C43659c a = C43659c.m138324a();
        C7573i.m23582a((Object) a, "MusicProviderConfig.getInstance()");
        String b = a.mo105614b();
        StringBuilder sb = new StringBuilder();
        sb.append(b);
        Uri parse = Uri.parse(str);
        C7573i.m23582a((Object) parse, "Uri.parse(fileUrl)");
        sb.append(C6306c.m19561a(parse.getPath()));
        sb.append(".json");
        return sb.toString();
    }

    /* renamed from: d */
    public static String m125101d(AVMusic aVMusic) {
        String str;
        if (aVMusic == null) {
            return "music == null";
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("music_id", aVMusic.getMusicId());
            if (aVMusic.getStickPointMusicAlg() != null) {
                jSONObject.put("AO_url", aVMusic.getStickPointMusicAlg().getVeBeatsUrl());
                jSONObject.put("C_url", aVMusic.getStickPointMusicAlg().getDownBeatsUrl());
                jSONObject.put("A1_url", aVMusic.getStickPointMusicAlg().getNoStrengthBeatsUrl());
                jSONObject.put("man_mode_url", aVMusic.getStickPointMusicAlg().getManModeBeatsUrl());
            } else {
                jSONObject.put("no_url", aVMusic.getId());
            }
            str = jSONObject.toString();
            C7573i.m23582a((Object) str, "jsonStr.toString()");
        } catch (Exception unused) {
            str = "exception";
        }
        return str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0013  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo97465a(android.app.Activity r5) {
        /*
            r4 = this;
            if (r5 == 0) goto L_0x0010
            android.content.res.Resources r5 = r5.getResources()
            if (r5 == 0) goto L_0x0010
            r0 = 2131827083(0x7f11198b, float:1.9287069E38)
            java.lang.String r5 = r5.getString(r0)
            goto L_0x0011
        L_0x0010:
            r5 = 0
        L_0x0011:
            if (r5 != 0) goto L_0x0016
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x0016:
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = 0
            int r3 = r4.mo97469d()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r2] = r3
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)
            java.lang.String r5 = com.C1642a.m8034a(r5, r0)
            java.lang.String r0 = "java.lang.String.format(format, *args)"
            kotlin.jvm.internal.C7573i.m23582a(r5, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C39182e.mo97465a(android.app.Activity):java.lang.String");
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0079 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0086 A[Catch:{ Exception -> 0x00b6 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo97467a(com.p280ss.android.ugc.aweme.shortvideo.AVMusic r4) {
        /*
            r3 = this;
            if (r4 != 0) goto L_0x0003
            return
        L_0x0003:
            com.ss.android.ugc.aweme.shortvideo.StickPointMusicAlg r0 = new com.ss.android.ugc.aweme.shortvideo.StickPointMusicAlg
            r0.<init>()
            java.lang.String r1 = r4.getMusicId()
            r0.setMusicId(r1)
            r4.setStickPointMusicAlg(r0)
            java.lang.String r1 = r4.getPath()
            r0.setDefaultLocalUrl(r1)
            java.lang.String r1 = r0.getDefaultLocalUrl()
            java.lang.String r1 = m125098b(r1)
            r0.setDefaultLocalPath(r1)
            java.lang.String r4 = r4.extra
            r1 = r4
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x0030
            return
        L_0x0030:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x0079 }
            r1.<init>(r4)     // Catch:{ Exception -> 0x0079 }
            java.lang.String r2 = "beats"
            org.json.JSONObject r1 = r1.optJSONObject(r2)     // Catch:{ Exception -> 0x0079 }
            if (r1 == 0) goto L_0x0079
            java.lang.String r2 = "audio_effect_onset"
            java.lang.String r2 = r1.optString(r2)     // Catch:{ Exception -> 0x0079 }
            r0.setVeBeatsUrl(r2)     // Catch:{ Exception -> 0x0079 }
            java.lang.String r2 = "merged_beats"
            java.lang.String r2 = r1.optString(r2)     // Catch:{ Exception -> 0x0079 }
            r0.setDownBeatsUrl(r2)     // Catch:{ Exception -> 0x0079 }
            java.lang.String r2 = "beats_tracker"
            java.lang.String r1 = r1.optString(r2)     // Catch:{ Exception -> 0x0079 }
            r0.setNoStrengthBeatsUrl(r1)     // Catch:{ Exception -> 0x0079 }
            java.lang.String r1 = r0.getDownBeatsUrl()     // Catch:{ Exception -> 0x0079 }
            java.lang.String r1 = m125098b(r1)     // Catch:{ Exception -> 0x0079 }
            r0.setDownBeatsPath(r1)     // Catch:{ Exception -> 0x0079 }
            java.lang.String r1 = r0.getVeBeatsUrl()     // Catch:{ Exception -> 0x0079 }
            java.lang.String r1 = m125098b(r1)     // Catch:{ Exception -> 0x0079 }
            r0.setVeBeatsPath(r1)     // Catch:{ Exception -> 0x0079 }
            java.lang.String r1 = r0.getNoStrengthBeatsUrl()     // Catch:{ Exception -> 0x0079 }
            java.lang.String r1 = m125098b(r1)     // Catch:{ Exception -> 0x0079 }
            r0.setNoStrengthBeatsPath(r1)     // Catch:{ Exception -> 0x0079 }
        L_0x0079:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x00b6 }
            r1.<init>(r4)     // Catch:{ Exception -> 0x00b6 }
            java.lang.String r4 = "douyin_beats_info"
            org.json.JSONObject r4 = r1.optJSONObject(r4)     // Catch:{ Exception -> 0x00b6 }
            if (r4 == 0) goto L_0x00b6
            java.lang.String r1 = "min_video_num"
            int r1 = r4.optInt(r1)     // Catch:{ Exception -> 0x00b6 }
            r0.setMinSeg(r1)     // Catch:{ Exception -> 0x00b6 }
            java.lang.String r1 = "max_video_num"
            int r1 = r4.optInt(r1)     // Catch:{ Exception -> 0x00b6 }
            r0.setMaxSeg(r1)     // Catch:{ Exception -> 0x00b6 }
            java.lang.String r1 = "type"
            int r1 = r4.optInt(r1)     // Catch:{ Exception -> 0x00b6 }
            r0.setAlgType(r1)     // Catch:{ Exception -> 0x00b6 }
            java.lang.String r1 = "man_made_beats"
            java.lang.String r4 = r4.optString(r1)     // Catch:{ Exception -> 0x00b6 }
            r0.setManModeBeatsUrl(r4)     // Catch:{ Exception -> 0x00b6 }
            java.lang.String r4 = r0.getManModeBeatsUrl()     // Catch:{ Exception -> 0x00b6 }
            java.lang.String r4 = m125098b(r4)     // Catch:{ Exception -> 0x00b6 }
            r0.setManModeBeatsPath(r4)     // Catch:{ Exception -> 0x00b6 }
            return
        L_0x00b6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C39182e.mo97467a(com.ss.android.ugc.aweme.shortvideo.AVMusic):void");
    }

    /* renamed from: a */
    public static void m125092a(C15389d dVar, C39164b bVar) {
        if (dVar == null || !m125103f()) {
            bVar.mo97288a((Throwable) null);
        } else {
            C18246h.m60214a(new TTUploaderService(0).mo96258a(null), (C18245g<? super V>) new C39184b<Object>(dVar, bVar), (Executor) C1592h.f5957a);
        }
    }

    /* renamed from: a */
    public static void m125093a(StickPointData stickPointData, List<? extends VideoSegment> list) {
        if (stickPointData != null && !C6292i.m19525a(list)) {
            if (!TextUtils.isEmpty(f101553b)) {
                stickPointData.setAiCutId(f101553b);
            }
            if (list == null) {
                C7573i.m23580a();
            }
            stickPointData.setVideoCount(Integer.valueOf(list.size()));
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            StringBuilder sb3 = new StringBuilder();
            int i = 0;
            for (Object next : list) {
                int i2 = i + 1;
                if (i < 0) {
                    C7525m.m23465b();
                }
                VideoSegment videoSegment = (VideoSegment) next;
                sb.append(videoSegment.f100761c);
                sb3.append(videoSegment.mo96909h());
                sb2.append(videoSegment.mo96910i() - videoSegment.mo96909h());
                if (i < list.size() - 1) {
                    sb.append(",");
                    sb3.append(",");
                    sb2.append(",");
                }
                i = i2;
            }
            stickPointData.setVideoCutLenListStr(sb.toString());
            stickPointData.setVideoSrcLenListStr(sb.toString());
            stickPointData.setVideoCutStartTimeListStr(sb3.toString());
        }
    }

    /* renamed from: a */
    public final void mo97466a(View view, Activity activity) {
        C7573i.m23587b(view, "anchor");
        C7573i.m23587b(activity, "activity");
        Context context = C35563c.f93238a;
        C35544ak akVar = C35563c.f93252o;
        C7573i.m23582a((Object) akVar, "AVEnv.SP_SERIVCE");
        C23339g a = C23337e.m76561a(context, akVar.mo83222a());
        if (!a.mo60627a("bubble_to_stick_point_hint_shown", false) && m125104g() && m125106j() && view.getParent() != null && !activity.isFinishing() && !C40173d.m128359d()) {
            view.postDelayed(new C39183a(activity, view, new C10752a(activity).mo25738b((int) R.string.fl_).mo25731a((long) DouPlusShareGuideExperiment.MIN_VALID_DURATION).mo25737a(), a), 500);
        }
    }

    /* renamed from: a */
    public final boolean mo97468a(Activity activity, ArrayList<String> arrayList, long j) {
        if (C6292i.m19525a((List<?>) arrayList)) {
            return false;
        }
        int d = mo97469d();
        if (arrayList == null) {
            C7573i.m23580a();
        }
        int size = d - arrayList.size();
        if (size <= 0) {
            C10761a.m31387a((Context) activity, mo97465a(activity)).mo25750a();
            return false;
        }
        long j2 = 3600000 - j;
        Bundle bundle = new Bundle();
        int i = 4;
        if (C40173d.m128359d()) {
            i = 6;
            bundle.putInt("key_photo_select_min_count", 0);
            bundle.putInt("key_photo_select_max_count", size);
        }
        bundle.putInt("key_support_flag", i);
        bundle.putBoolean("Key_enable_multi_video", true);
        bundle.putInt("key_video_select_min_count", 0);
        bundle.putInt("key_video_select_max_count", size);
        bundle.putLong("Key_max_duration", j2);
        bundle.putLong("Key_min_duration", 1000);
        bundle.putStringArrayList("key_selected_video_path", arrayList);
        MvChoosePhotoActivity.m128155a(activity, bundle, 2, 1001);
        return true;
    }
}
