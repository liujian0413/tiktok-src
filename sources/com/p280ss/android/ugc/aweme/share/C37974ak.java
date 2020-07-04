package com.p280ss.android.ugc.aweme.share;

import android.net.Uri;
import android.text.TextUtils;
import bolts.C1592h;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.storage.C12919b;
import com.bytedance.storage.C12920c;
import com.p280ss.android.ttve.nativePort.TEVideoRecorder;
import com.p280ss.android.ugc.aweme.app.C6877n;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41564p;
import com.p280ss.android.ugc.aweme.utils.C42973bg;
import com.p280ss.android.vesdk.filterparam.VETransitionFilterParam;
import java.io.File;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Ref.ObjectRef;

/* renamed from: com.ss.android.ugc.aweme.share.ak */
public final class C37974ak {

    /* renamed from: a */
    public static int f98872a = VETransitionFilterParam.TransitionDuration_DEFAULT;

    /* renamed from: b */
    public static final C37975a f98873b = new C37975a(null);

    /* renamed from: com.ss.android.ugc.aweme.share.ak$a */
    public static final class C37975a {

        /* renamed from: com.ss.android.ugc.aweme.share.ak$a$a */
        static final class C37976a<V> implements Callable<TResult> {

            /* renamed from: a */
            final /* synthetic */ String f98874a;

            /* renamed from: b */
            final /* synthetic */ Long f98875b;

            /* renamed from: c */
            final /* synthetic */ String f98876c;

            /* renamed from: d */
            final /* synthetic */ Boolean f98877d;

            /* renamed from: e */
            final /* synthetic */ String f98878e;

            /* renamed from: f */
            final /* synthetic */ Integer f98879f;

            /* renamed from: g */
            final /* synthetic */ boolean f98880g;

            C37976a(String str, Long l, String str2, Boolean bool, String str3, Integer num, boolean z) {
                this.f98874a = str;
                this.f98875b = l;
                this.f98876c = str2;
                this.f98877d = bool;
                this.f98878e = str3;
                this.f98879f = num;
                this.f98880g = z;
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public Void call() {
                if (this.f98874a != null) {
                    String d = C42973bg.m136432d(this.f98874a);
                    long length = new File(this.f98874a).length();
                    CharSequence charSequence = d;
                    boolean equals = TextUtils.equals(charSequence, "20");
                    C6869c cVar = new C6869c();
                    String str = "download_rate";
                    long j = 0;
                    if (this.f98875b != null) {
                        Long l = this.f98875b;
                        if (l == null || l.longValue() != 0) {
                            j = length / this.f98875b.longValue();
                        }
                    }
                    C6869c a = cVar.mo16886a(str, Long.valueOf(j)).mo16886a("download_duration", this.f98875b).mo16886a("file_size", Long.valueOf(length)).mo16887a("errorDesc", TEVideoRecorder.FACE_BEAUTY_NULL).mo16887a("errorCode", TEVideoRecorder.FACE_BEAUTY_NULL).mo16887a("url", this.f98876c).mo16882a("needWaterMark", Boolean.valueOf(false)).mo16882a("muteAudio", this.f98877d).mo16887a("fileMagic", C42973bg.m136432d(this.f98874a)).mo16882a("isMp4", Boolean.valueOf(equals));
                    if (C6399b.m19944t() && length < 1500 && !TextUtils.equals(charSequence, "20")) {
                        String a2 = C37975a.m121284a(this.f98874a);
                        if (!TextUtils.isEmpty(a2)) {
                            a.mo16887a("errorFileContent", a2);
                        } else {
                            a.mo16887a("errorFileContent", "file is null");
                        }
                    }
                    C12919b a3 = C12919b.m37599a(C6399b.m19921a());
                    if (a3 != null) {
                        a.mo16882a("has_remove_sd", Boolean.valueOf(true));
                        a.mo16882a("sd_state", Boolean.valueOf(a3.mo31403a()));
                        a.mo16886a("sd_available_size", Long.valueOf(a3.f34125b));
                        a.mo16887a("share_dir", C41564p.m132360a(C6399b.m19921a()));
                    } else {
                        a.mo16882a("has_remove_sd", Boolean.valueOf(false));
                    }
                    C6877n.m21444a("save_video_success_rate", 0, a.mo16888b());
                } else {
                    C6869c a4 = new C6869c().mo16885a("download_rate", Integer.valueOf(0)).mo16886a("download_duration", this.f98875b).mo16885a("file_size", Integer.valueOf(-1)).mo16887a("errorDesc", this.f98878e).mo16885a("errorCode", this.f98879f).mo16887a("url", this.f98876c).mo16882a("needWaterMark", Boolean.valueOf(this.f98880g)).mo16887a("fileMagic", "download_error").mo16882a("muteAudio", this.f98877d).mo16882a("strategy_enabled", Boolean.valueOf(C12920c.m37608a())).mo16887a("isMp4", "notSure");
                    C12919b a5 = C12919b.m37599a(C6399b.m19921a());
                    if (a5 != null) {
                        a4.mo16882a("has_remove_sd", Boolean.valueOf(true));
                        a4.mo16882a("sd_state", Boolean.valueOf(a5.mo31403a()));
                        a4.mo16886a("sd_available_size", Long.valueOf(a5.f34125b));
                        a4.mo16887a("share_dir", C41564p.m132360a(C6399b.m19921a()));
                    } else {
                        a4.mo16882a("has_remove_sd", Boolean.valueOf(false));
                    }
                    C6877n.m21444a("save_video_success_rate", 1, a4.mo16888b());
                }
                return null;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.share.ak$a$b */
        static final class C37977b<V> implements Callable<TResult> {

            /* renamed from: a */
            final /* synthetic */ String f98881a;

            /* renamed from: b */
            final /* synthetic */ Long f98882b;

            /* renamed from: c */
            final /* synthetic */ Integer f98883c;

            /* renamed from: d */
            final /* synthetic */ String f98884d;

            /* renamed from: e */
            final /* synthetic */ boolean f98885e;

            C37977b(String str, Long l, Integer num, String str2, boolean z) {
                this.f98881a = str;
                this.f98882b = l;
                this.f98883c = num;
                this.f98884d = str2;
                this.f98885e = z;
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public Void call() {
                String d = C42973bg.m136432d(this.f98881a);
                long length = new File(this.f98881a).length();
                boolean equals = TextUtils.equals(d, "20");
                C6869c cVar = new C6869c();
                String str = "download_rate";
                long j = 0;
                if (this.f98882b != null) {
                    Long l = this.f98882b;
                    if (l == null || l.longValue() != 0) {
                        j = length / this.f98882b.longValue();
                    }
                }
                C6869c a = cVar.mo16886a(str, Long.valueOf(j)).mo16886a("download_duration", this.f98882b).mo16886a("file_size", Long.valueOf(length)).mo16887a("errorDesc", TEVideoRecorder.FACE_BEAUTY_NULL).mo16885a("errorCode", this.f98883c).mo16887a("url", this.f98884d).mo16882a("muteAudio", Boolean.valueOf(true)).mo16882a("needWaterMark", Boolean.valueOf(this.f98885e)).mo16887a("fileMagic", C42973bg.m136432d(this.f98881a)).mo16882a("isMp4", Boolean.valueOf(equals));
                C12919b a2 = C12919b.m37599a(C6399b.m19921a());
                if (a2 != null) {
                    a.mo16882a("has_remove_sd", Boolean.valueOf(true));
                    a.mo16882a("sd_state", Boolean.valueOf(a2.mo31403a()));
                    a.mo16886a("sd_available_size", Long.valueOf(a2.f34125b));
                    a.mo16887a("share_dir", C41564p.m132360a(C6399b.m19921a()));
                } else {
                    a.mo16882a("has_remove_sd", Boolean.valueOf(false));
                }
                C6877n.m21444a("save_video_success_rate", 3, a.mo16888b());
                return null;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.share.ak$a$c */
        static final class C37978c<V> implements Callable<TResult> {

            /* renamed from: a */
            final /* synthetic */ Integer f98886a;

            C37978c(Integer num) {
                this.f98886a = num;
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public Void call() {
                C6869c a = new C6869c().mo16887a("form", "publish").mo16885a("errorCode", this.f98886a).mo16882a("muteAudio", Boolean.valueOf(true));
                C12919b a2 = C12919b.m37599a(C6399b.m19921a());
                if (a2 != null) {
                    a.mo16882a("has_remove_sd", Boolean.valueOf(true));
                    a.mo16882a("sd_state", Boolean.valueOf(a2.mo31403a()));
                    a.mo16886a("sd_available_size", Long.valueOf(a2.f34125b));
                    a.mo16887a("share_dir", C41564p.m132360a(C6399b.m19921a()));
                } else {
                    a.mo16882a("has_remove_sd", Boolean.valueOf(false));
                }
                C6877n.m21444a("save_video_success_rate", 3, a.mo16888b());
                return null;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.share.ak$a$d */
        static final class C37979d<V> implements Callable<TResult> {

            /* renamed from: a */
            final /* synthetic */ String f98887a;

            /* renamed from: b */
            final /* synthetic */ String f98888b;

            /* renamed from: c */
            final /* synthetic */ ObjectRef f98889c;

            /* renamed from: d */
            final /* synthetic */ ObjectRef f98890d;

            /* renamed from: e */
            final /* synthetic */ String f98891e;

            /* renamed from: f */
            final /* synthetic */ String f98892f;

            /* renamed from: g */
            final /* synthetic */ int f98893g;

            C37979d(String str, String str2, ObjectRef objectRef, ObjectRef objectRef2, String str3, String str4, int i) {
                this.f98887a = str;
                this.f98888b = str2;
                this.f98889c = objectRef;
                this.f98890d = objectRef2;
                this.f98891e = str3;
                this.f98892f = str4;
                this.f98893g = i;
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public Void call() {
                C6907h.m21524a("watermark_share_download", (Map) new C22984d().mo59973a("group_id", this.f98887a).mo59973a("enter_from", this.f98888b).mo59973a("action_type", (String) this.f98889c.element).mo59973a("platform", (String) this.f98890d.element).mo59973a("is_long", this.f98891e).mo59973a("logo_name", this.f98892f).mo59970a("watermark_type", this.f98893g).f60753a);
                return null;
            }
        }

        private C37975a() {
        }

        public /* synthetic */ C37975a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static void m121285a(Integer num) {
            C1592h.m7853a((Callable<TResult>) new C37978c<TResult>(num));
        }

        /* renamed from: a */
        public static String m121283a(UrlModel urlModel) {
            String str = null;
            if (!(urlModel == null || urlModel.getUrlList() == null)) {
                for (String parse : urlModel.getUrlList()) {
                    Uri parse2 = Uri.parse(parse);
                    C7573i.m23582a((Object) parse2, "Uri.parse(url)");
                    if (!parse2.isOpaque()) {
                        str = parse2.getQueryParameter("logo_name");
                        if (!TextUtils.isEmpty(str)) {
                            return str;
                        }
                    }
                }
            }
            return str;
        }

        /* renamed from: b */
        public static void m121289b(String str) {
            C7573i.m23587b(str, "url");
            C6877n.m21444a("save_video_success_rate", 4, new C6869c().mo16887a("errorDesc", "url is illegal").mo16887a("url", str).mo16888b());
        }

        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0044, code lost:
            if (r4 != null) goto L_0x0033;
         */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x003f A[SYNTHETIC, Splitter:B:14:0x003f] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static java.lang.String m121284a(java.lang.String r4) {
            /*
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r1 = 0
                java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ Throwable -> 0x0043, all -> 0x003b }
                r2.<init>(r4)     // Catch:{ Throwable -> 0x0043, all -> 0x003b }
                java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch:{ Throwable -> 0x0043, all -> 0x003b }
                java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ Throwable -> 0x0043, all -> 0x003b }
                java.io.InputStream r2 = (java.io.InputStream) r2     // Catch:{ Throwable -> 0x0043, all -> 0x003b }
                r3.<init>(r2)     // Catch:{ Throwable -> 0x0043, all -> 0x003b }
                java.io.Reader r3 = (java.io.Reader) r3     // Catch:{ Throwable -> 0x0043, all -> 0x003b }
                r4.<init>(r3)     // Catch:{ Throwable -> 0x0043, all -> 0x003b }
                java.lang.String r1 = r4.readLine()     // Catch:{ Throwable -> 0x0044, all -> 0x0039 }
                if (r1 == 0) goto L_0x0033
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0044, all -> 0x0039 }
                r2.<init>()     // Catch:{ Throwable -> 0x0044, all -> 0x0039 }
                r2.append(r1)     // Catch:{ Throwable -> 0x0044, all -> 0x0039 }
                java.lang.String r1 = "    "
                r2.append(r1)     // Catch:{ Throwable -> 0x0044, all -> 0x0039 }
                java.lang.String r1 = r2.toString()     // Catch:{ Throwable -> 0x0044, all -> 0x0039 }
                r0.append(r1)     // Catch:{ Throwable -> 0x0044, all -> 0x0039 }
            L_0x0033:
                r4.close()     // Catch:{ IOException -> 0x0037 }
                goto L_0x0047
            L_0x0037:
                goto L_0x0047
            L_0x0039:
                r0 = move-exception
                goto L_0x003d
            L_0x003b:
                r0 = move-exception
                r4 = r1
            L_0x003d:
                if (r4 == 0) goto L_0x0042
                r4.close()     // Catch:{ IOException -> 0x0042 }
            L_0x0042:
                throw r0
            L_0x0043:
                r4 = r1
            L_0x0044:
                if (r4 == 0) goto L_0x0047
                goto L_0x0033
            L_0x0047:
                int r4 = com.p280ss.android.ugc.aweme.share.C37974ak.f98872a
                java.lang.String r1 = r0.toString()
                int r1 = r1.length()
                if (r4 <= r1) goto L_0x005d
                java.lang.String r4 = r0.toString()
                int r4 = r4.length()
                com.p280ss.android.ugc.aweme.share.C37974ak.f98872a = r4
            L_0x005d:
                java.lang.String r4 = r0.toString()
                java.lang.String r0 = "sb.toString()"
                kotlin.jvm.internal.C7573i.m23582a(r4, r0)
                int r0 = com.p280ss.android.ugc.aweme.share.C37974ak.f98872a
                if (r4 == 0) goto L_0x0075
                r1 = 0
                java.lang.String r4 = r4.substring(r1, r0)
                java.lang.String r0 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
                kotlin.jvm.internal.C7573i.m23582a(r4, r0)
                return r4
            L_0x0075:
                kotlin.TypeCastException r4 = new kotlin.TypeCastException
                java.lang.String r0 = "null cannot be cast to non-null type java.lang.String"
                r4.<init>(r0)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.share.C37974ak.C37975a.m121284a(java.lang.String):java.lang.String");
        }

        /* renamed from: a */
        public static void m121286a(String str, Long l, String str2, boolean z, Integer num) {
            C37977b bVar = new C37977b(str, l, num, str2, z);
            C1592h.m7853a((Callable<TResult>) bVar);
        }

        /* renamed from: a */
        public static void m121288a(String str, String str2, String str3, String str4, String str5, int i) {
            C7573i.m23587b(str4, "isLong");
            ObjectRef objectRef = new ObjectRef();
            objectRef.element = null;
            ObjectRef objectRef2 = new ObjectRef();
            objectRef2.element = str3;
            if (C7573i.m23585a((Object) "download", (Object) str3)) {
                objectRef.element = "download";
                objectRef2.element = null;
            } else {
                objectRef.element = "share";
            }
            C37979d dVar = new C37979d(str, str2, objectRef, objectRef2, str4, str5, i);
            C1592h.m7853a((Callable<TResult>) dVar);
        }

        /* renamed from: a */
        public static void m121287a(String str, Long l, String str2, boolean z, Integer num, String str3, Boolean bool) {
            C37976a aVar = new C37976a(str, l, str2, bool, str3, num, z);
            C1592h.m7853a((Callable<TResult>) aVar);
        }
    }

    /* renamed from: a */
    public static final String m121278a(UrlModel urlModel) {
        return C37975a.m121283a(urlModel);
    }

    /* renamed from: a */
    public static final void m121279a(Integer num) {
        C37975a.m121285a(num);
    }

    /* renamed from: a */
    public static final void m121280a(String str, Long l, String str2, boolean z, Integer num) {
        C37975a.m121286a(str, l, str2, z, num);
    }

    /* renamed from: a */
    public static final void m121281a(String str, Long l, String str2, boolean z, Integer num, String str3, Boolean bool) {
        C37975a.m121287a(str, l, str2, z, num, str3, bool);
    }

    /* renamed from: a */
    public static final void m121282a(String str, String str2, String str3, String str4, String str5, int i) {
        C37975a.m121288a(str, str2, str3, str4, str5, i);
    }
}
