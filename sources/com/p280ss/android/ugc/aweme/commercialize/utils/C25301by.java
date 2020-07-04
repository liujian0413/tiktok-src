package com.p280ss.android.ugc.aweme.commercialize.utils;

import android.util.Base64;
import com.bytedance.ies.NullValueException;
import com.bytedance.vast.C13016b;
import com.bytedance.vast.C13017c;
import com.bytedance.vast.exception.FetchException;
import com.bytedance.vast.exception.ParseException;
import com.bytedance.vast.model.AdVerification;
import com.bytedance.vast.model.Creative;
import com.bytedance.vast.model.Icon;
import com.bytedance.vast.model.MediaFile;
import com.bytedance.vast.model.TrackingEvent;
import com.bytedance.vast.model.Vast;
import com.bytedance.vast.model.VideoClick;
import com.p280ss.android.http.legacy.client.HttpResponseException;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.commercialize.log.C24939aj;
import com.p280ss.android.ugc.aweme.commercialize.log.C24958f;
import com.p280ss.android.ugc.aweme.commercialize.log.C24958f.C24961b;
import com.p280ss.android.ugc.aweme.commercialize.log.C24962g;
import com.p280ss.android.ugc.aweme.commercialize.log.RawURLGetter;
import com.p280ss.android.ugc.aweme.commercialize.log.RawURLGetter.C24924a;
import com.p280ss.android.ugc.aweme.commercialize.model.OmVast;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p280ss.android.ugc.aweme.feed.model.BitRate;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import javax.xml.parsers.DocumentBuilderFactory;
import kotlin.C7579l;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.collections.C7507ae;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;
import kotlin.p1884io.C47973b;
import kotlin.sequences.C7604g;
import kotlin.sequences.C7605h;
import kotlin.text.C48038d;
import kotlin.text.C48039g;
import kotlin.text.C7631j;
import kotlin.text.C7634n;
import kotlin.text.Regex;
import org.w3c.dom.Document;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.by */
public final class C25301by {

    /* renamed from: a */
    public static final C25301by f66662a = new C25301by();

    /* renamed from: b */
    private static final Regex f66663b = new Regex("(\\d+)%");

    /* renamed from: c */
    private static final Regex f66664c = new Regex("(\\d{2}):(\\d{2}):(\\d{2})");

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.by$a */
    static final class C25302a implements C13016b {

        /* renamed from: a */
        public static final C25302a f66665a = new C25302a();

        private C25302a() {
        }

        /* renamed from: a */
        public final Document mo31542a(String str) throws FetchException, ParseException {
            Closeable byteArrayInputStream;
            try {
                String b = RawURLGetter.m81771b(str);
                if (b == null) {
                    C7573i.m23580a();
                }
                try {
                    Charset charset = C48038d.f122880a;
                    if (b != null) {
                        byte[] bytes = b.getBytes(charset);
                        C7573i.m23582a((Object) bytes, "(this as java.lang.String).getBytes(charset)");
                        byteArrayInputStream = new ByteArrayInputStream(bytes);
                        Document parse = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse((ByteArrayInputStream) byteArrayInputStream);
                        C7573i.m23582a((Object) parse, "DocumentBuilderFactory.n…cumentBuilder().parse(it)");
                        C47973b.m148917a(byteArrayInputStream, null);
                        C7573i.m23582a((Object) parse, "content.byteInputStream(…rse(it)\n                }");
                        return parse;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                } catch (Throwable th) {
                    throw new ParseException(th);
                }
            } catch (Exception e) {
                throw new FetchException(str, e);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.by$b */
    static final class C25303b implements C13017c {

        /* renamed from: a */
        public final Aweme f66666a;

        /* renamed from: b */
        private final long f66667b = C25301by.m83132a();

        /* renamed from: c */
        private long f66668c;

        /* renamed from: d */
        private int f66669d;

        /* renamed from: e */
        private final C25265bd f66670e = new C25265bd();

        /* renamed from: f */
        private final C25265bd f66671f = new C25265bd();

        /* renamed from: a */
        public final void mo31543a() {
            C24958f.m81905a().mo65273b(this.f66666a).mo65266a("draw_ad").mo65276b("get_inline").mo65265a((Object) C7507ae.m23393a((Pair<? extends K, ? extends V>[]) new Pair[]{C7579l.m23633a("duration", Long.valueOf(C25301by.m83132a() - this.f66668c)), C7579l.m23633a("wrapper_count", Integer.valueOf(this.f66669d - 1))})).mo65278b();
        }

        /* renamed from: a */
        public final void mo31544a(int i) {
            this.f66669d--;
        }

        public C25303b(Aweme aweme) {
            C7573i.m23587b(aweme, "aweme");
            this.f66666a = aweme;
        }

        /* renamed from: a */
        public final void mo31547a(String str) {
            if (this.f66670e.mo65869a()) {
                C24958f.m81905a().mo65273b(this.f66666a).mo65266a("draw_ad").mo65276b("show_fail").mo65265a((Object) C7507ae.m23385a(C7579l.m23633a("error_message", "vast_wrapper_count_unmatch"))).mo65278b();
            }
        }

        /* renamed from: a */
        public final void mo31545a(FetchException fetchException) {
            String str = null;
            if (fetchException.getCause() instanceof HttpResponseException) {
                C24961b b = C24958f.m81905a().mo65273b(this.f66666a).mo65266a("draw_ad").mo65276b("show_fail");
                Pair[] pairArr = new Pair[2];
                pairArr[0] = C7579l.m23633a("error_message", "vast_mediafile_bad_response");
                String str2 = "error_detail";
                Throwable cause = fetchException.getCause();
                if (cause != null) {
                    str = cause.getMessage();
                }
                pairArr[1] = C7579l.m23633a(str2, str);
                b.mo65265a((Object) C7507ae.m23393a((Pair<? extends K, ? extends V>[]) pairArr)).mo65278b();
                return;
            }
            C24961b b2 = C24958f.m81905a().mo65273b(this.f66666a).mo65266a("draw_ad").mo65276b("show_fail");
            Pair[] pairArr2 = new Pair[2];
            pairArr2[0] = C7579l.m23633a("error_message", "vast_filtered_others");
            String str3 = "error_detail";
            Throwable cause2 = fetchException.getCause();
            if (cause2 != null) {
                str = cause2.getMessage();
            }
            pairArr2[1] = C7579l.m23633a(str3, str);
            b2.mo65265a((Object) C7507ae.m23393a((Pair<? extends K, ? extends V>[]) pairArr2)).mo65278b();
        }

        /* renamed from: a */
        public final void mo31546a(ParseException parseException) {
            String str;
            C24961b b = C24958f.m81905a().mo65273b(this.f66666a).mo65266a("draw_ad").mo65276b("show_fail");
            Pair[] pairArr = new Pair[2];
            pairArr[0] = C7579l.m23633a("error_message", "vast_xml_format_error");
            String str2 = "error_detail";
            Throwable cause = parseException.getCause();
            if (cause != null) {
                str = cause.getMessage();
            } else {
                str = null;
            }
            pairArr[1] = C7579l.m23633a(str2, str);
            b.mo65265a((Object) C7507ae.m23393a((Pair<? extends K, ? extends V>[]) pairArr)).mo65278b();
        }

        /* renamed from: b */
        public final void mo31549b(String str, int i) {
            this.f66669d++;
            this.f66668c = C25301by.m83132a();
        }

        /* renamed from: a */
        public final void mo31548a(String str, int i) {
            this.f66669d++;
            this.f66668c = C25301by.m83132a();
            if (this.f66671f.mo65869a()) {
                C24958f.m81905a().mo65273b(this.f66666a).mo65266a("draw_ad").mo65276b("query_wrapper").mo65265a((Object) C7507ae.m23385a(C7579l.m23633a("duration", Long.valueOf(C25301by.m83132a() - this.f66667b)))).mo65278b();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.by$c */
    public static final class C25304c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Runnable f66672a;

        /* renamed from: b */
        final /* synthetic */ Aweme f66673b;

        /* renamed from: c */
        final /* synthetic */ long f66674c;

        /* renamed from: d */
        final /* synthetic */ OmVast f66675d;

        /* renamed from: e */
        final /* synthetic */ int f66676e;

        public C25304c(Runnable runnable, Aweme aweme, long j, OmVast omVast, int i) {
            this.f66672a = runnable;
            this.f66673b = aweme;
            this.f66674c = j;
            this.f66675d = omVast;
            this.f66676e = i;
        }

        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x006e */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x0074 A[Catch:{ all -> 0x0094 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r7 = this;
                com.ss.android.ugc.aweme.commercialize.log.f$b r0 = com.p280ss.android.ugc.aweme.commercialize.log.C24958f.m81905a()     // Catch:{ all -> 0x0094 }
                com.ss.android.ugc.aweme.feed.model.Aweme r1 = r7.f66673b     // Catch:{ all -> 0x0094 }
                com.ss.android.ugc.aweme.commercialize.log.f$b r0 = r0.mo65273b(r1)     // Catch:{ all -> 0x0094 }
                java.lang.String r1 = "draw_ad"
                com.ss.android.ugc.aweme.commercialize.log.f$b r0 = r0.mo65266a(r1)     // Catch:{ all -> 0x0094 }
                java.lang.String r1 = "parse_vast"
                com.ss.android.ugc.aweme.commercialize.log.f$b r0 = r0.mo65276b(r1)     // Catch:{ all -> 0x0094 }
                java.lang.String r1 = "duration"
                long r2 = com.p280ss.android.ugc.aweme.commercialize.utils.C25301by.m83132a()     // Catch:{ all -> 0x0094 }
                long r4 = r7.f66674c     // Catch:{ all -> 0x0094 }
                r6 = 0
                long r2 = r2 - r4
                java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0094 }
                kotlin.Pair r1 = kotlin.C7579l.m23633a(r1, r2)     // Catch:{ all -> 0x0094 }
                java.util.Map r1 = kotlin.collections.C7507ae.m23385a(r1)     // Catch:{ all -> 0x0094 }
                com.ss.android.ugc.aweme.commercialize.log.f$b r0 = r0.mo65265a(r1)     // Catch:{ all -> 0x0094 }
                r0.mo65278b()     // Catch:{ all -> 0x0094 }
                com.ss.android.ugc.aweme.commercialize.model.OmVast r0 = r7.f66675d     // Catch:{ all -> 0x0094 }
                r1 = 1
                r0.loaded = r1     // Catch:{ all -> 0x0094 }
                com.ss.android.ugc.aweme.commercialize.model.OmVast r0 = r7.f66675d     // Catch:{ all -> 0x0094 }
                com.bytedance.vast.model.Vast r2 = new com.bytedance.vast.model.Vast     // Catch:{ all -> 0x0094 }
                r2.<init>()     // Catch:{ all -> 0x0094 }
                r0.vast = r2     // Catch:{ all -> 0x0094 }
                com.ss.android.ugc.aweme.commercialize.model.OmVast r0 = r7.f66675d     // Catch:{ all -> 0x0094 }
                java.lang.String r0 = r0.vastUrl     // Catch:{ all -> 0x0094 }
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0     // Catch:{ all -> 0x0094 }
                if (r0 == 0) goto L_0x0051
                int r0 = r0.length()     // Catch:{ all -> 0x0094 }
                if (r0 != 0) goto L_0x0050
                goto L_0x0051
            L_0x0050:
                r1 = 0
            L_0x0051:
                if (r1 != 0) goto L_0x0084
                com.ss.android.ugc.aweme.commercialize.model.OmVast r0 = r7.f66675d     // Catch:{ Exception -> 0x006e }
                com.bytedance.vast.model.Vast r0 = r0.vast     // Catch:{ Exception -> 0x006e }
                com.ss.android.ugc.aweme.commercialize.model.OmVast r1 = r7.f66675d     // Catch:{ Exception -> 0x006e }
                java.lang.String r1 = r1.vastUrl     // Catch:{ Exception -> 0x006e }
                int r2 = r7.f66676e     // Catch:{ Exception -> 0x006e }
                com.ss.android.ugc.aweme.commercialize.utils.by$a r3 = com.p280ss.android.ugc.aweme.commercialize.utils.C25301by.C25302a.f66665a     // Catch:{ Exception -> 0x006e }
                com.bytedance.vast.b r3 = (com.bytedance.vast.C13016b) r3     // Catch:{ Exception -> 0x006e }
                com.ss.android.ugc.aweme.commercialize.utils.by$b r4 = new com.ss.android.ugc.aweme.commercialize.utils.by$b     // Catch:{ Exception -> 0x006e }
                com.ss.android.ugc.aweme.feed.model.Aweme r5 = r7.f66673b     // Catch:{ Exception -> 0x006e }
                r4.<init>(r5)     // Catch:{ Exception -> 0x006e }
                com.bytedance.vast.c r4 = (com.bytedance.vast.C13017c) r4     // Catch:{ Exception -> 0x006e }
                r0.parseUri(r1, r2, r3, r4)     // Catch:{ Exception -> 0x006e }
                goto L_0x0084
            L_0x006e:
                boolean r0 = com.p280ss.android.ugc.aweme.p331m.C7163a.m22363a()     // Catch:{ all -> 0x0094 }
                if (r0 == 0) goto L_0x0084
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0094 }
                java.lang.String r1 = "parse uri failed: "
                r0.<init>(r1)     // Catch:{ all -> 0x0094 }
                com.ss.android.ugc.aweme.feed.model.Aweme r1 = r7.f66673b     // Catch:{ all -> 0x0094 }
                java.lang.String r1 = r1.getDesc()     // Catch:{ all -> 0x0094 }
                r0.append(r1)     // Catch:{ all -> 0x0094 }
            L_0x0084:
                com.ss.android.ugc.aweme.commercialize.utils.by r0 = com.p280ss.android.ugc.aweme.commercialize.utils.C25301by.f66662a     // Catch:{ all -> 0x0094 }
                com.ss.android.ugc.aweme.feed.model.Aweme r1 = r7.f66673b     // Catch:{ all -> 0x0094 }
                r0.mo65894b(r1)     // Catch:{ all -> 0x0094 }
                java.lang.Runnable r0 = r7.f66672a
                if (r0 == 0) goto L_0x0093
                r0.run()
                return
            L_0x0093:
                return
            L_0x0094:
                r0 = move-exception
                java.lang.Runnable r1 = r7.f66672a
                if (r1 == 0) goto L_0x009c
                r1.run()
            L_0x009c:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.commercialize.utils.C25301by.C25304c.run():void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.by$d */
    public static final class C25305d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Runnable f66677a;

        /* renamed from: b */
        final /* synthetic */ Aweme f66678b;

        /* renamed from: c */
        final /* synthetic */ long f66679c;

        /* renamed from: d */
        final /* synthetic */ Vast f66680d;

        /* renamed from: e */
        final /* synthetic */ OmVast f66681e;

        /* renamed from: f */
        final /* synthetic */ int f66682f;

        /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.by$d$a */
        static final class C25306a extends Lambda implements C7562b<MediaFile, BitRate> {

            /* renamed from: a */
            final /* synthetic */ double f66683a;

            C25306a(double d) {
                this.f66683a = d;
                super(1);
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public BitRate invoke(MediaFile mediaFile) {
                return C25301by.m83134a(mediaFile, this.f66683a);
            }
        }

        public C25305d(Runnable runnable, Aweme aweme, long j, Vast vast, OmVast omVast, int i) {
            this.f66677a = runnable;
            this.f66678b = aweme;
            this.f66679c = j;
            this.f66680d = vast;
            this.f66681e = omVast;
            this.f66682f = i;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:94:?, code lost:
            r5 = java.lang.Boolean.valueOf(false);
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:93:0x016f */
        /* JADX WARNING: Removed duplicated region for block: B:100:0x018b A[Catch:{ Exception -> 0x02aa, all -> 0x02c9 }] */
        /* JADX WARNING: Removed duplicated region for block: B:108:0x019c A[Catch:{ Exception -> 0x02aa, all -> 0x02c9 }] */
        /* JADX WARNING: Removed duplicated region for block: B:109:0x019d A[Catch:{ Exception -> 0x02aa, all -> 0x02c9 }] */
        /* JADX WARNING: Removed duplicated region for block: B:111:0x01a0 A[Catch:{ Exception -> 0x02aa, all -> 0x02c9 }] */
        /* JADX WARNING: Removed duplicated region for block: B:112:0x01a3 A[Catch:{ Exception -> 0x02aa, all -> 0x02c9 }] */
        /* JADX WARNING: Removed duplicated region for block: B:116:0x01af A[Catch:{ Exception -> 0x02aa, all -> 0x02c9 }] */
        /* JADX WARNING: Removed duplicated region for block: B:117:0x01b6 A[Catch:{ Exception -> 0x02aa, all -> 0x02c9 }] */
        /* JADX WARNING: Removed duplicated region for block: B:120:0x01c3 A[Catch:{ Exception -> 0x02aa, all -> 0x02c9 }] */
        /* JADX WARNING: Removed duplicated region for block: B:125:0x01e3 A[Catch:{ Exception -> 0x02aa, all -> 0x02c9 }] */
        /* JADX WARNING: Removed duplicated region for block: B:131:0x01ef A[Catch:{ Exception -> 0x02aa, all -> 0x02c9 }] */
        /* JADX WARNING: Removed duplicated region for block: B:13:0x0061 A[Catch:{ Exception -> 0x02aa, all -> 0x02c9 }] */
        /* JADX WARNING: Removed duplicated region for block: B:144:0x02c4  */
        /* JADX WARNING: Removed duplicated region for block: B:146:0x02c8 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x0079 A[Catch:{ Exception -> 0x02aa, all -> 0x02c9 }] */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x00a1 A[Catch:{ Exception -> 0x02aa, all -> 0x02c9 }] */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x00a2 A[Catch:{ Exception -> 0x02aa, all -> 0x02c9 }] */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x00a5 A[Catch:{ Exception -> 0x02aa, all -> 0x02c9 }] */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x00b8 A[Catch:{ Exception -> 0x02aa, all -> 0x02c9 }] */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x00c4 A[Catch:{ Exception -> 0x02aa, all -> 0x02c9 }] */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x00c5 A[Catch:{ Exception -> 0x02aa, all -> 0x02c9 }] */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x00c8 A[Catch:{ Exception -> 0x02aa, all -> 0x02c9 }] */
        /* JADX WARNING: Removed duplicated region for block: B:46:0x00d9 A[Catch:{ Exception -> 0x02aa, all -> 0x02c9 }] */
        /* JADX WARNING: Removed duplicated region for block: B:58:0x00f8 A[Catch:{ Exception -> 0x02aa, all -> 0x02c9 }] */
        /* JADX WARNING: Removed duplicated region for block: B:59:0x00f9 A[Catch:{ Exception -> 0x02aa, all -> 0x02c9 }] */
        /* JADX WARNING: Removed duplicated region for block: B:61:0x00fc A[Catch:{ Exception -> 0x02aa, all -> 0x02c9 }] */
        /* JADX WARNING: Removed duplicated region for block: B:68:0x0113 A[Catch:{ Exception -> 0x02aa, all -> 0x02c9 }] */
        /* JADX WARNING: Removed duplicated region for block: B:97:0x017e A[Catch:{ Exception -> 0x02aa, all -> 0x02c9 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r8 = this;
                com.ss.android.ugc.aweme.commercialize.log.f$b r0 = com.p280ss.android.ugc.aweme.commercialize.log.C24958f.m81905a()     // Catch:{ all -> 0x02c9 }
                com.ss.android.ugc.aweme.feed.model.Aweme r1 = r8.f66678b     // Catch:{ all -> 0x02c9 }
                com.ss.android.ugc.aweme.commercialize.log.f$b r0 = r0.mo65273b(r1)     // Catch:{ all -> 0x02c9 }
                java.lang.String r1 = "draw_ad"
                com.ss.android.ugc.aweme.commercialize.log.f$b r0 = r0.mo65266a(r1)     // Catch:{ all -> 0x02c9 }
                java.lang.String r1 = "parse_vast"
                com.ss.android.ugc.aweme.commercialize.log.f$b r0 = r0.mo65276b(r1)     // Catch:{ all -> 0x02c9 }
                java.lang.String r1 = "duration"
                long r2 = com.p280ss.android.ugc.aweme.commercialize.utils.C25301by.m83132a()     // Catch:{ all -> 0x02c9 }
                long r4 = r8.f66679c     // Catch:{ all -> 0x02c9 }
                r6 = 0
                long r2 = r2 - r4
                java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x02c9 }
                kotlin.Pair r1 = kotlin.C7579l.m23633a(r1, r2)     // Catch:{ all -> 0x02c9 }
                java.util.Map r1 = kotlin.collections.C7507ae.m23385a(r1)     // Catch:{ all -> 0x02c9 }
                com.ss.android.ugc.aweme.commercialize.log.f$b r0 = r0.mo65265a(r1)     // Catch:{ all -> 0x02c9 }
                r0.mo65278b()     // Catch:{ all -> 0x02c9 }
                com.bytedance.vast.model.Vast r0 = r8.f66680d     // Catch:{ Exception -> 0x02aa }
                com.ss.android.ugc.aweme.commercialize.model.OmVast r1 = r8.f66681e     // Catch:{ Exception -> 0x02aa }
                java.lang.String r1 = r1.vastContent     // Catch:{ Exception -> 0x02aa }
                int r2 = r8.f66682f     // Catch:{ Exception -> 0x02aa }
                com.ss.android.ugc.aweme.commercialize.utils.by$a r3 = com.p280ss.android.ugc.aweme.commercialize.utils.C25301by.C25302a.f66665a     // Catch:{ Exception -> 0x02aa }
                com.bytedance.vast.b r3 = (com.bytedance.vast.C13016b) r3     // Catch:{ Exception -> 0x02aa }
                com.ss.android.ugc.aweme.commercialize.utils.by$b r4 = new com.ss.android.ugc.aweme.commercialize.utils.by$b     // Catch:{ Exception -> 0x02aa }
                com.ss.android.ugc.aweme.feed.model.Aweme r5 = r8.f66678b     // Catch:{ Exception -> 0x02aa }
                r4.<init>(r5)     // Catch:{ Exception -> 0x02aa }
                com.bytedance.vast.c r4 = (com.bytedance.vast.C13017c) r4     // Catch:{ Exception -> 0x02aa }
                r0.parseContent(r1, r2, r3, r4)     // Catch:{ Exception -> 0x02aa }
                com.bytedance.vast.model.Vast r0 = r8.f66680d     // Catch:{ all -> 0x02c9 }
                java.lang.String r0 = r0.adTitle     // Catch:{ all -> 0x02c9 }
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0     // Catch:{ all -> 0x02c9 }
                r1 = 1
                r2 = 0
                if (r0 == 0) goto L_0x005e
                int r0 = r0.length()     // Catch:{ all -> 0x02c9 }
                if (r0 != 0) goto L_0x005c
                goto L_0x005e
            L_0x005c:
                r0 = 0
                goto L_0x005f
            L_0x005e:
                r0 = 1
            L_0x005f:
                if (r0 == 0) goto L_0x0079
                boolean r0 = com.p280ss.android.ugc.aweme.p331m.C7163a.m22363a()     // Catch:{ all -> 0x02c9 }
                if (r0 == 0) goto L_0x02c0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x02c9 }
                java.lang.String r1 = "empty title: "
                r0.<init>(r1)     // Catch:{ all -> 0x02c9 }
                com.ss.android.ugc.aweme.feed.model.Aweme r1 = r8.f66678b     // Catch:{ all -> 0x02c9 }
                java.lang.String r1 = r1.getAid()     // Catch:{ all -> 0x02c9 }
                r0.append(r1)     // Catch:{ all -> 0x02c9 }
                goto L_0x02c0
            L_0x0079:
                com.ss.android.ugc.aweme.commercialize.model.OmVast r0 = r8.f66681e     // Catch:{ all -> 0x02c9 }
                com.bytedance.vast.model.Vast r3 = r8.f66680d     // Catch:{ all -> 0x02c9 }
                r0.vast = r3     // Catch:{ all -> 0x02c9 }
                com.bytedance.vast.model.Vast r0 = r8.f66680d     // Catch:{ all -> 0x02c9 }
                com.ss.android.ugc.aweme.feed.model.Aweme r3 = r8.f66678b     // Catch:{ all -> 0x02c9 }
                com.ss.android.ugc.aweme.profile.model.User r3 = r3.getAuthor()     // Catch:{ all -> 0x02c9 }
                r4 = 0
                if (r3 == 0) goto L_0x008f
                java.lang.String r3 = r3.getNickname()     // Catch:{ all -> 0x02c9 }
                goto L_0x0090
            L_0x008f:
                r3 = r4
            L_0x0090:
                r5 = r3
                java.lang.CharSequence r5 = (java.lang.CharSequence) r5     // Catch:{ all -> 0x02c9 }
                if (r5 == 0) goto L_0x009e
                boolean r5 = kotlin.text.C7634n.m23713a(r5)     // Catch:{ all -> 0x02c9 }
                if (r5 == 0) goto L_0x009c
                goto L_0x009e
            L_0x009c:
                r5 = 0
                goto L_0x009f
            L_0x009e:
                r5 = 1
            L_0x009f:
                if (r5 != 0) goto L_0x00a2
                goto L_0x00a3
            L_0x00a2:
                r3 = r4
            L_0x00a3:
                if (r3 != 0) goto L_0x00a9
                com.bytedance.vast.model.Vast r3 = r8.f66680d     // Catch:{ all -> 0x02c9 }
                java.lang.String r3 = r3.adTitle     // Catch:{ all -> 0x02c9 }
            L_0x00a9:
                r0.adTitle = r3     // Catch:{ all -> 0x02c9 }
                com.ss.android.ugc.aweme.feed.model.Aweme r0 = r8.f66678b     // Catch:{ all -> 0x02c9 }
                com.ss.android.ugc.aweme.feed.model.Aweme r3 = r8.f66678b     // Catch:{ all -> 0x02c9 }
                java.lang.String r3 = r3.getDesc()     // Catch:{ all -> 0x02c9 }
                r5 = r3
                java.lang.CharSequence r5 = (java.lang.CharSequence) r5     // Catch:{ all -> 0x02c9 }
                if (r5 == 0) goto L_0x00c1
                boolean r5 = kotlin.text.C7634n.m23713a(r5)     // Catch:{ all -> 0x02c9 }
                if (r5 == 0) goto L_0x00bf
                goto L_0x00c1
            L_0x00bf:
                r5 = 0
                goto L_0x00c2
            L_0x00c1:
                r5 = 1
            L_0x00c2:
                if (r5 != 0) goto L_0x00c5
                goto L_0x00c6
            L_0x00c5:
                r3 = r4
            L_0x00c6:
                if (r3 != 0) goto L_0x00ce
                com.ss.android.ugc.aweme.commercialize.model.OmVast r3 = r8.f66681e     // Catch:{ all -> 0x02c9 }
                com.bytedance.vast.model.Vast r3 = r3.vast     // Catch:{ all -> 0x02c9 }
                java.lang.String r3 = r3.description     // Catch:{ all -> 0x02c9 }
            L_0x00ce:
                r0.setDesc(r3)     // Catch:{ all -> 0x02c9 }
                com.ss.android.ugc.aweme.feed.model.Aweme r0 = r8.f66678b     // Catch:{ all -> 0x02c9 }
                com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()     // Catch:{ all -> 0x02c9 }
                if (r0 == 0) goto L_0x010d
                com.ss.android.ugc.aweme.feed.model.Aweme r3 = r8.f66678b     // Catch:{ all -> 0x02c9 }
                com.ss.android.ugc.aweme.feed.model.AwemeRawAd r3 = r3.getAwemeRawAd()     // Catch:{ all -> 0x02c9 }
                if (r3 == 0) goto L_0x00e6
                java.lang.String r3 = r3.getWebUrl()     // Catch:{ all -> 0x02c9 }
                goto L_0x00e7
            L_0x00e6:
                r3 = r4
            L_0x00e7:
                r5 = r3
                java.lang.CharSequence r5 = (java.lang.CharSequence) r5     // Catch:{ all -> 0x02c9 }
                if (r5 == 0) goto L_0x00f5
                boolean r5 = kotlin.text.C7634n.m23713a(r5)     // Catch:{ all -> 0x02c9 }
                if (r5 == 0) goto L_0x00f3
                goto L_0x00f5
            L_0x00f3:
                r5 = 0
                goto L_0x00f6
            L_0x00f5:
                r5 = 1
            L_0x00f6:
                if (r5 != 0) goto L_0x00f9
                goto L_0x00fa
            L_0x00f9:
                r3 = r4
            L_0x00fa:
                if (r3 != 0) goto L_0x010a
                com.ss.android.ugc.aweme.commercialize.utils.by r3 = com.p280ss.android.ugc.aweme.commercialize.utils.C25301by.f66662a     // Catch:{ all -> 0x02c9 }
                com.ss.android.ugc.aweme.feed.model.Aweme r5 = r8.f66678b     // Catch:{ all -> 0x02c9 }
                com.bytedance.vast.model.VideoClick r3 = r3.mo65895k(r5)     // Catch:{ all -> 0x02c9 }
                if (r3 == 0) goto L_0x0109
                java.lang.String r3 = r3.clickThrough     // Catch:{ all -> 0x02c9 }
                goto L_0x010a
            L_0x0109:
                r3 = r4
            L_0x010a:
                r0.setWebUrl(r3)     // Catch:{ all -> 0x02c9 }
            L_0x010d:
                com.bytedance.vast.model.Vast r0 = r8.f66680d     // Catch:{ all -> 0x02c9 }
                java.util.List<com.bytedance.vast.model.Creative> r0 = r0.creativeList     // Catch:{ all -> 0x02c9 }
                if (r0 == 0) goto L_0x02c0
                java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch:{ all -> 0x02c9 }
                java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x02c9 }
            L_0x0119:
                boolean r3 = r0.hasNext()     // Catch:{ all -> 0x02c9 }
                if (r3 == 0) goto L_0x0132
                java.lang.Object r3 = r0.next()     // Catch:{ all -> 0x02c9 }
                r5 = r3
                com.bytedance.vast.model.Creative r5 = (com.bytedance.vast.model.Creative) r5     // Catch:{ all -> 0x02c9 }
                if (r5 == 0) goto L_0x012e
                boolean r5 = r5.byWrapper     // Catch:{ all -> 0x02c9 }
                if (r5 != 0) goto L_0x012e
                r5 = 1
                goto L_0x012f
            L_0x012e:
                r5 = 0
            L_0x012f:
                if (r5 == 0) goto L_0x0119
                goto L_0x0133
            L_0x0132:
                r3 = r4
            L_0x0133:
                com.bytedance.vast.model.Creative r3 = (com.bytedance.vast.model.Creative) r3     // Catch:{ all -> 0x02c9 }
                if (r3 != 0) goto L_0x0139
                goto L_0x02c0
            L_0x0139:
                com.ss.android.ugc.aweme.feed.model.Aweme r0 = r8.f66678b     // Catch:{ all -> 0x02c9 }
                com.ss.android.ugc.aweme.profile.model.User r0 = r0.getAuthor()     // Catch:{ all -> 0x02c9 }
                if (r0 == 0) goto L_0x0160
                com.ss.android.ugc.aweme.base.model.UrlModel r0 = r0.getAvatarThumb()     // Catch:{ all -> 0x02c9 }
                if (r0 == 0) goto L_0x0160
                java.util.List r0 = r0.getUrlList()     // Catch:{ all -> 0x02c9 }
                if (r0 == 0) goto L_0x0160
                java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch:{ all -> 0x02c9 }
                kotlin.sequences.g r0 = kotlin.collections.C7525m.m23526p(r0)     // Catch:{ all -> 0x02c9 }
                com.ss.android.ugc.aweme.commercialize.utils.by$e r5 = com.p280ss.android.ugc.aweme.commercialize.utils.C25301by.C25307e.f66684a     // Catch:{ all -> 0x02c9 }
                kotlin.jvm.a.b r5 = (kotlin.jvm.p357a.C7562b) r5     // Catch:{ all -> 0x02c9 }
                kotlin.sequences.g r0 = kotlin.sequences.C7605h.m23655b(r0, r5)     // Catch:{ all -> 0x02c9 }
                java.util.HashSet r0 = kotlin.sequences.C7605h.m23663g(r0)     // Catch:{ all -> 0x02c9 }
                goto L_0x0161
            L_0x0160:
                r0 = r4
            L_0x0161:
                com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy r5 = com.p280ss.android.ugc.aweme.global.config.settings.C30199h.m98861a()     // Catch:{ Throwable -> 0x016f }
                java.lang.String r6 = "SettingsReader.get()"
                kotlin.jvm.internal.C7573i.m23582a(r5, r6)     // Catch:{ Throwable -> 0x016f }
                java.lang.Boolean r5 = r5.getDisallowVastHasAuthor()     // Catch:{ Throwable -> 0x016f }
                goto L_0x0173
            L_0x016f:
                java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x02c9 }
            L_0x0173:
                java.lang.String r6 = "disallowVastHasAuthor"
                kotlin.jvm.internal.C7573i.m23582a(r5, r6)     // Catch:{ all -> 0x02c9 }
                boolean r5 = r5.booleanValue()     // Catch:{ all -> 0x02c9 }
                if (r5 == 0) goto L_0x0183
                com.ss.android.ugc.aweme.feed.model.Aweme r5 = r8.f66678b     // Catch:{ all -> 0x02c9 }
                r5.setAuthor(r4)     // Catch:{ all -> 0x02c9 }
            L_0x0183:
                com.ss.android.ugc.aweme.feed.model.Aweme r5 = r8.f66678b     // Catch:{ all -> 0x02c9 }
                com.bytedance.vast.model.Icon r5 = com.p280ss.android.ugc.aweme.commercialize.utils.C25300bx.m83131d(r5)     // Catch:{ all -> 0x02c9 }
                if (r5 == 0) goto L_0x01a7
                r6 = r0
                java.util.Collection r6 = (java.util.Collection) r6     // Catch:{ all -> 0x02c9 }
                if (r6 == 0) goto L_0x0199
                boolean r6 = r6.isEmpty()     // Catch:{ all -> 0x02c9 }
                if (r6 == 0) goto L_0x0197
                goto L_0x0199
            L_0x0197:
                r6 = 0
                goto L_0x019a
            L_0x0199:
                r6 = 1
            L_0x019a:
                if (r6 != 0) goto L_0x019d
                goto L_0x019e
            L_0x019d:
                r0 = r4
            L_0x019e:
                if (r0 == 0) goto L_0x01a3
                java.util.Set r0 = (java.util.Set) r0     // Catch:{ all -> 0x02c9 }
                goto L_0x01a5
            L_0x01a3:
                java.util.Set<java.lang.String> r0 = r5.staticResource     // Catch:{ all -> 0x02c9 }
            L_0x01a5:
                r5.staticResource = r0     // Catch:{ all -> 0x02c9 }
            L_0x01a7:
                com.ss.android.ugc.aweme.feed.model.Aweme r0 = r8.f66678b     // Catch:{ all -> 0x02c9 }
                com.ss.android.ugc.aweme.commercialize.model.OmVast r5 = r8.f66681e     // Catch:{ all -> 0x02c9 }
                com.ss.android.ugc.aweme.commercialize.model.NativeIcon r5 = r5.adChoiceIcon     // Catch:{ all -> 0x02c9 }
                if (r5 == 0) goto L_0x01b6
                java.lang.String r6 = "AdChoices"
                com.bytedance.vast.model.Icon r5 = r5.toIcon(r6)     // Catch:{ all -> 0x02c9 }
                goto L_0x01b7
            L_0x01b6:
                r5 = r4
            L_0x01b7:
                com.p280ss.android.ugc.aweme.commercialize.utils.C25301by.m83136a(r3, r0, r5)     // Catch:{ all -> 0x02c9 }
                long r5 = r3.getDurationInMs()     // Catch:{ all -> 0x02c9 }
                double r5 = (double) r5     // Catch:{ all -> 0x02c9 }
                java.util.List<com.bytedance.vast.model.MediaFile> r0 = r3.mediaFileList     // Catch:{ all -> 0x02c9 }
                if (r0 == 0) goto L_0x01de
                java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch:{ all -> 0x02c9 }
                kotlin.sequences.g r0 = kotlin.collections.C7525m.m23526p(r0)     // Catch:{ all -> 0x02c9 }
                com.ss.android.ugc.aweme.commercialize.utils.by$d$a r7 = new com.ss.android.ugc.aweme.commercialize.utils.by$d$a     // Catch:{ all -> 0x02c9 }
                r7.<init>(r5)     // Catch:{ all -> 0x02c9 }
                kotlin.jvm.a.b r7 = (kotlin.jvm.p357a.C7562b) r7     // Catch:{ all -> 0x02c9 }
                kotlin.sequences.g r0 = kotlin.sequences.C7605h.m23659d(r0, r7)     // Catch:{ all -> 0x02c9 }
                kotlin.sequences.g r0 = kotlin.sequences.C7605h.m23662f(r0)     // Catch:{ all -> 0x02c9 }
                if (r0 == 0) goto L_0x01de
                java.util.List r4 = kotlin.sequences.C7605h.m23664h(r0)     // Catch:{ all -> 0x02c9 }
            L_0x01de:
                r0 = r4
                java.util.Collection r0 = (java.util.Collection) r0     // Catch:{ all -> 0x02c9 }
                if (r0 == 0) goto L_0x01ec
                boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x02c9 }
                if (r0 == 0) goto L_0x01ea
                goto L_0x01ec
            L_0x01ea:
                r0 = 0
                goto L_0x01ed
            L_0x01ec:
                r0 = 1
            L_0x01ed:
                if (r0 != 0) goto L_0x02c0
                com.ss.android.ugc.aweme.feed.model.Aweme r0 = r8.f66678b     // Catch:{ all -> 0x02c9 }
                com.ss.android.ugc.aweme.feed.model.Video r0 = r0.getVideo()     // Catch:{ all -> 0x02c9 }
                if (r0 != 0) goto L_0x0201
                com.ss.android.ugc.aweme.feed.model.Aweme r0 = r8.f66678b     // Catch:{ all -> 0x02c9 }
                com.ss.android.ugc.aweme.feed.model.Video r5 = new com.ss.android.ugc.aweme.feed.model.Video     // Catch:{ all -> 0x02c9 }
                r5.<init>()     // Catch:{ all -> 0x02c9 }
                r0.setVideo(r5)     // Catch:{ all -> 0x02c9 }
            L_0x0201:
                java.lang.Object r0 = r4.get(r2)     // Catch:{ all -> 0x02c9 }
                com.ss.android.ugc.aweme.feed.model.BitRate r0 = (com.p280ss.android.ugc.aweme.feed.model.BitRate) r0     // Catch:{ all -> 0x02c9 }
                com.ss.android.ugc.aweme.base.model.UrlModel r0 = r0.getPlayAddr()     // Catch:{ all -> 0x02c9 }
                com.ss.android.ugc.aweme.feed.model.Aweme r2 = r8.f66678b     // Catch:{ all -> 0x02c9 }
                com.ss.android.ugc.aweme.feed.model.Video r2 = r2.getVideo()     // Catch:{ all -> 0x02c9 }
                java.lang.String r5 = "aweme.video"
                kotlin.jvm.internal.C7573i.m23582a(r2, r5)     // Catch:{ all -> 0x02c9 }
                java.lang.String r5 = "url"
                kotlin.jvm.internal.C7573i.m23582a(r0, r5)     // Catch:{ all -> 0x02c9 }
                int r5 = r0.getWidth()     // Catch:{ all -> 0x02c9 }
                r2.setWidth(r5)     // Catch:{ all -> 0x02c9 }
                com.ss.android.ugc.aweme.feed.model.Aweme r2 = r8.f66678b     // Catch:{ all -> 0x02c9 }
                com.ss.android.ugc.aweme.feed.model.Video r2 = r2.getVideo()     // Catch:{ all -> 0x02c9 }
                java.lang.String r5 = "aweme.video"
                kotlin.jvm.internal.C7573i.m23582a(r2, r5)     // Catch:{ all -> 0x02c9 }
                int r5 = r0.getHeight()     // Catch:{ all -> 0x02c9 }
                r2.setHeight(r5)     // Catch:{ all -> 0x02c9 }
                com.ss.android.ugc.aweme.feed.model.Aweme r2 = r8.f66678b     // Catch:{ all -> 0x02c9 }
                com.ss.android.ugc.aweme.feed.model.Video r2 = r2.getVideo()     // Catch:{ all -> 0x02c9 }
                java.lang.String r5 = "aweme.video"
                kotlin.jvm.internal.C7573i.m23582a(r2, r5)     // Catch:{ all -> 0x02c9 }
                com.ss.android.ugc.aweme.feed.model.VideoUrlModel r5 = new com.ss.android.ugc.aweme.feed.model.VideoUrlModel     // Catch:{ all -> 0x02c9 }
                r5.<init>()     // Catch:{ all -> 0x02c9 }
                int r6 = r0.getWidth()     // Catch:{ all -> 0x02c9 }
                r5.setWidth(r6)     // Catch:{ all -> 0x02c9 }
                int r6 = r0.getHeight()     // Catch:{ all -> 0x02c9 }
                r5.setHeight(r6)     // Catch:{ all -> 0x02c9 }
                java.lang.String r6 = r0.getUri()     // Catch:{ all -> 0x02c9 }
                r5.setUri(r6)     // Catch:{ all -> 0x02c9 }
                java.lang.String r6 = r0.getUrlKey()     // Catch:{ all -> 0x02c9 }
                r5.setUrlKey(r6)     // Catch:{ all -> 0x02c9 }
                java.util.List r0 = r0.getUrlList()     // Catch:{ all -> 0x02c9 }
                r5.setUrlList(r0)     // Catch:{ all -> 0x02c9 }
                long r6 = r3.getDurationInMs()     // Catch:{ all -> 0x02c9 }
                double r6 = (double) r6     // Catch:{ all -> 0x02c9 }
                r5.setDuration(r6)     // Catch:{ all -> 0x02c9 }
                r2.setPlayAddr(r5)     // Catch:{ all -> 0x02c9 }
                com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy r0 = com.p280ss.android.ugc.aweme.global.config.settings.C30199h.m98861a()     // Catch:{ all -> 0x02c9 }
                java.lang.String r2 = "SettingsReader.get()"
                kotlin.jvm.internal.C7573i.m23582a(r0, r2)     // Catch:{ all -> 0x02c9 }
                java.lang.Boolean r0 = r0.getDisableVastBitrate()     // Catch:{ all -> 0x02c9 }
                boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x02c9 }
                if (r0 != 0) goto L_0x0293
                com.ss.android.ugc.aweme.feed.model.Aweme r0 = r8.f66678b     // Catch:{ all -> 0x02c9 }
                com.ss.android.ugc.aweme.feed.model.Video r0 = r0.getVideo()     // Catch:{ all -> 0x02c9 }
                java.lang.String r2 = "aweme.video"
                kotlin.jvm.internal.C7573i.m23582a(r0, r2)     // Catch:{ all -> 0x02c9 }
                r0.setBitRate(r4)     // Catch:{ all -> 0x02c9 }
            L_0x0293:
                com.ss.android.ugc.aweme.feed.model.Aweme r0 = r8.f66678b     // Catch:{ all -> 0x02c9 }
                com.ss.android.ugc.aweme.commercialize.model.OmVast r2 = r8.f66681e     // Catch:{ all -> 0x02c9 }
                com.bytedance.vast.model.Vast r2 = r2.vast     // Catch:{ all -> 0x02c9 }
                java.lang.String r2 = r2.adTitle     // Catch:{ all -> 0x02c9 }
                r0.setTitle(r2)     // Catch:{ all -> 0x02c9 }
                com.ss.android.ugc.aweme.commercialize.model.OmVast r0 = r8.f66681e     // Catch:{ all -> 0x02c9 }
                r0.loaded = r1     // Catch:{ all -> 0x02c9 }
                com.ss.android.ugc.aweme.commercialize.utils.by r0 = com.p280ss.android.ugc.aweme.commercialize.utils.C25301by.f66662a     // Catch:{ all -> 0x02c9 }
                com.ss.android.ugc.aweme.feed.model.Aweme r1 = r8.f66678b     // Catch:{ all -> 0x02c9 }
                r0.mo65894b(r1)     // Catch:{ all -> 0x02c9 }
                goto L_0x02c0
            L_0x02aa:
                boolean r0 = com.p280ss.android.ugc.aweme.p331m.C7163a.m22363a()     // Catch:{ all -> 0x02c9 }
                if (r0 == 0) goto L_0x02c0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x02c9 }
                java.lang.String r1 = "parse content failed: "
                r0.<init>(r1)     // Catch:{ all -> 0x02c9 }
                com.ss.android.ugc.aweme.feed.model.Aweme r1 = r8.f66678b     // Catch:{ all -> 0x02c9 }
                java.lang.String r1 = r1.getAid()     // Catch:{ all -> 0x02c9 }
                r0.append(r1)     // Catch:{ all -> 0x02c9 }
            L_0x02c0:
                java.lang.Runnable r0 = r8.f66677a
                if (r0 == 0) goto L_0x02c8
                r0.run()
                return
            L_0x02c8:
                return
            L_0x02c9:
                r0 = move-exception
                java.lang.Runnable r1 = r8.f66677a
                if (r1 == 0) goto L_0x02d1
                r1.run()
            L_0x02d1:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.commercialize.utils.C25301by.C25305d.run():void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.by$e */
    static final class C25307e extends Lambda implements C7562b<String, Boolean> {

        /* renamed from: a */
        public static final C25307e f66684a = new C25307e();

        C25307e() {
            super(1);
        }

        /* renamed from: a */
        private static boolean m83173a(String str) {
            CharSequence charSequence = str;
            if (charSequence == null || charSequence.length() == 0) {
                return true;
            }
            return false;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(m83173a((String) obj));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.by$f */
    static final class C25308f extends Lambda implements C7562b<MediaFile, BitRate> {

        /* renamed from: a */
        final /* synthetic */ double f66685a;

        C25308f(double d) {
            this.f66685a = d;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public BitRate invoke(MediaFile mediaFile) {
            return C25301by.m83134a(mediaFile, this.f66685a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.by$g */
    static final class C25309g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Aweme f66686a;

        /* renamed from: b */
        final /* synthetic */ Runnable f66687b;

        C25309g(Aweme aweme, Runnable runnable) {
            this.f66686a = aweme;
            this.f66687b = runnable;
        }

        public final void run() {
            String str;
            Aweme aweme = this.f66686a;
            if (aweme != null) {
                AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                if (awemeRawAd != null) {
                    OmVast omVast = awemeRawAd.getOmVast();
                    if (omVast != null) {
                        omVast.loading = false;
                    }
                }
            }
            if (C7163a.m22363a()) {
                StringBuilder sb = new StringBuilder("exit loading ");
                Aweme aweme2 = this.f66686a;
                if (aweme2 != null) {
                    str = aweme2.getAid();
                } else {
                    str = null;
                }
                sb.append(str);
            }
            Runnable runnable = this.f66687b;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.by$h */
    static final class C25310h extends Lambda implements C7562b<Creative, C7604g<? extends VideoClick>> {

        /* renamed from: a */
        public static final C25310h f66688a = new C25310h();

        C25310h() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return m83175a((Creative) obj);
        }

        /* renamed from: a */
        private static C7604g<VideoClick> m83175a(Creative creative) {
            C7573i.m23587b(creative, "it");
            List<VideoClick> list = creative.clickList;
            if (list != null) {
                return C7525m.m23526p(list);
            }
            return C7605h.m23635a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.by$i */
    static final class C25311i extends Lambda implements C7562b<VideoClick, String> {

        /* renamed from: a */
        public static final C25311i f66689a = new C25311i();

        C25311i() {
            super(1);
        }

        /* renamed from: a */
        private static String m83176a(VideoClick videoClick) {
            if (videoClick != null) {
                return videoClick.clickThrough;
            }
            return null;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return m83176a((VideoClick) obj);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.by$j */
    static final class C25312j extends Lambda implements C7562b<VideoClick, C7604g<? extends String>> {

        /* renamed from: a */
        public static final C25312j f66690a = new C25312j();

        C25312j() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return m83177a((VideoClick) obj);
        }

        /* renamed from: a */
        private static C7604g<String> m83177a(VideoClick videoClick) {
            C7573i.m23587b(videoClick, "it");
            Set<String> set = videoClick.clickTracking;
            if (set != null) {
                return C7525m.m23526p(set);
            }
            return C7605h.m23635a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.by$k */
    static final class C25313k extends Lambda implements C7562b<String, Boolean> {

        /* renamed from: a */
        public static final C25313k f66691a = new C25313k();

        C25313k() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(m83178a((String) obj));
        }

        /* renamed from: a */
        private static boolean m83178a(String str) {
            boolean z;
            CharSequence charSequence = str;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.by$l */
    static final class C25314l extends Lambda implements C7562b<String, Boolean> {

        /* renamed from: a */
        public static final C25314l f66692a = new C25314l();

        C25314l() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(m83179a((String) obj));
        }

        /* renamed from: a */
        private static boolean m83179a(String str) {
            boolean z;
            CharSequence charSequence = str;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.by$m */
    static final class C25315m extends Lambda implements C7562b<String, String> {

        /* renamed from: a */
        public static final C25315m f66693a = new C25315m();

        C25315m() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return m83180a((String) obj);
        }

        /* renamed from: a */
        private static String m83180a(String str) {
            C7573i.m23587b(str, "it");
            return C7634n.m23711a(str, "[ERRORCODE]", "0", false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.by$n */
    public static final class C25316n implements C24924a {

        /* renamed from: a */
        final /* synthetic */ String f66694a;

        /* renamed from: b */
        final /* synthetic */ long f66695b;

        /* renamed from: c */
        final /* synthetic */ AwemeRawAd f66696c;

        public C25316n(String str, long j, AwemeRawAd awemeRawAd) {
            this.f66694a = str;
            this.f66695b = j;
            this.f66696c = awemeRawAd;
        }

        /* renamed from: a */
        public final void mo65177a(int i, boolean z, Exception exc) {
            String str;
            if (!z) {
                C24961b b = C24958f.m81905a().mo65274b(this.f66696c).mo65266a("draw_ad").mo65276b("load_failed");
                Pair[] pairArr = new Pair[3];
                pairArr[0] = C7579l.m23633a("error_message", "vast_click_tracker_bad_response");
                pairArr[1] = C7579l.m23633a("error_code", Integer.valueOf(i));
                String str2 = "error_detail";
                if (exc != null) {
                    str = exc.getMessage();
                } else {
                    str = null;
                }
                pairArr[2] = C7579l.m23633a(str2, str);
                b.mo65265a((Object) C7507ae.m23393a((Pair<? extends K, ? extends V>[]) pairArr)).mo65278b();
            }
            C25301by.m83138a(C25301by.f66662a, this.f66694a, String.valueOf(i), this.f66695b, "click", null, this.f66696c, 16, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.by$o */
    public static final class C25317o implements C24924a {

        /* renamed from: a */
        final /* synthetic */ AwemeRawAd f66697a;

        public C25317o(AwemeRawAd awemeRawAd) {
            this.f66697a = awemeRawAd;
        }

        /* renamed from: a */
        public final void mo65177a(int i, boolean z, Exception exc) {
            String str;
            if (!z) {
                C24961b b = C24958f.m81905a().mo65274b(this.f66697a).mo65266a("draw_ad").mo65276b("load_failed");
                Pair[] pairArr = new Pair[3];
                pairArr[0] = C7579l.m23633a("error_message", "vast_clickthru_bad_response");
                pairArr[1] = C7579l.m23633a("error_code", Integer.valueOf(i));
                String str2 = "error_detail";
                if (exc != null) {
                    str = exc.getMessage();
                } else {
                    str = null;
                }
                pairArr[2] = C7579l.m23633a(str2, str);
                b.mo65265a((Object) C7507ae.m23393a((Pair<? extends K, ? extends V>[]) pairArr)).mo65278b();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.by$p */
    static final class C25318p extends Lambda implements C7562b<String, Boolean> {

        /* renamed from: a */
        public static final C25318p f66698a = new C25318p();

        C25318p() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(m83183a((String) obj));
        }

        /* renamed from: a */
        private static boolean m83183a(String str) {
            boolean z;
            CharSequence charSequence = str;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.by$q */
    static final class C25319q extends Lambda implements C7562b<TrackingEvent, Boolean> {

        /* renamed from: a */
        final /* synthetic */ String f66699a;

        C25319q(String str) {
            this.f66699a = str;
            super(1);
        }

        /* renamed from: a */
        private boolean m83184a(TrackingEvent trackingEvent) {
            String str;
            if (trackingEvent != null) {
                str = trackingEvent.name;
            } else {
                str = null;
            }
            return C7573i.m23585a((Object) str, (Object) this.f66699a);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(m83184a((TrackingEvent) obj));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.by$r */
    static final class C25320r extends Lambda implements C7562b<TrackingEvent, String> {

        /* renamed from: a */
        public static final C25320r f66700a = new C25320r();

        C25320r() {
            super(1);
        }

        /* renamed from: a */
        private static String m83185a(TrackingEvent trackingEvent) {
            return trackingEvent.url;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return m83185a((TrackingEvent) obj);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.by$s */
    static final class C25321s extends Lambda implements C7562b<VideoClick, C7604g<? extends String>> {

        /* renamed from: a */
        public static final C25321s f66701a = new C25321s();

        C25321s() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return m83186a((VideoClick) obj);
        }

        /* renamed from: a */
        private static C7604g<String> m83186a(VideoClick videoClick) {
            Set<String> set = videoClick.clickTracking;
            if (set != null) {
                return C7525m.m23526p(set);
            }
            return C7605h.m23635a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.by$t */
    static final class C25322t extends Lambda implements C7562b<String, Boolean> {

        /* renamed from: a */
        public static final C25322t f66702a = new C25322t();

        C25322t() {
            super(1);
        }

        /* renamed from: a */
        private static boolean m83187a(String str) {
            CharSequence charSequence = str;
            if (charSequence == null || charSequence.length() == 0) {
                return true;
            }
            return false;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(m83187a((String) obj));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.by$u */
    static final class C25323u extends Lambda implements C7562b<String, Boolean> {

        /* renamed from: a */
        public static final C25323u f66703a = new C25323u();

        C25323u() {
            super(1);
        }

        /* renamed from: a */
        private static boolean m83188a(String str) {
            CharSequence charSequence = str;
            if (charSequence == null || charSequence.length() == 0) {
                return true;
            }
            return false;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(m83188a((String) obj));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.by$v */
    public static final class C25324v implements C24924a {

        /* renamed from: a */
        final /* synthetic */ String f66704a;

        /* renamed from: b */
        final /* synthetic */ long f66705b;

        /* renamed from: c */
        final /* synthetic */ Aweme f66706c;

        public C25324v(String str, long j, Aweme aweme) {
            this.f66704a = str;
            this.f66705b = j;
            this.f66706c = aweme;
        }

        /* renamed from: a */
        public final void mo65177a(int i, boolean z, Exception exc) {
            String str;
            if (!z) {
                C24961b b = C24958f.m81905a().mo65273b(this.f66706c).mo65266a("draw_ad").mo65276b("load_failed");
                Pair[] pairArr = new Pair[3];
                pairArr[0] = C7579l.m23633a("error_message", "vast_imp_tracker_bad_response");
                pairArr[1] = C7579l.m23633a("error_code", Integer.valueOf(i));
                String str2 = "error_detail";
                if (exc != null) {
                    str = exc.getMessage();
                } else {
                    str = null;
                }
                pairArr[2] = C7579l.m23633a(str2, str);
                b.mo65265a((Object) C7507ae.m23393a((Pair<? extends K, ? extends V>[]) pairArr)).mo65278b();
            }
            C25301by.m83138a(C25301by.f66662a, this.f66704a, String.valueOf(i), this.f66705b, "show", this.f66706c, null, 32, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.by$w */
    static final class C25325w extends Lambda implements C7562b<String, Boolean> {

        /* renamed from: a */
        public static final C25325w f66707a = new C25325w();

        C25325w() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(m83190a((String) obj));
        }

        /* renamed from: a */
        private static boolean m83190a(String str) {
            boolean z;
            CharSequence charSequence = str;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.by$x */
    static final class C25326x extends Lambda implements C7562b<TrackingEvent, Boolean> {

        /* renamed from: a */
        final /* synthetic */ long f66708a;

        /* renamed from: b */
        final /* synthetic */ long f66709b;

        /* renamed from: c */
        final /* synthetic */ long f66710c;

        C25326x(long j, long j2, long j3) {
            this.f66708a = j;
            this.f66709b = j2;
            this.f66710c = j3;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(m83191a((TrackingEvent) obj));
        }

        /* renamed from: a */
        private boolean m83191a(TrackingEvent trackingEvent) {
            boolean z;
            CharSequence charSequence = trackingEvent.offset;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z || (!C7573i.m23585a((Object) trackingEvent.name, (Object) "progress"))) {
                return false;
            }
            long j = this.f66708a;
            String str = trackingEvent.offset;
            C7573i.m23582a((Object) str, "it.offset");
            long a = C25301by.m83133a(j, str);
            long j2 = this.f66709b;
            if (this.f66710c + 1 <= a && j2 >= a) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.by$y */
    static final class C25327y implements C24939aj {

        /* renamed from: a */
        final /* synthetic */ String f66711a;

        /* renamed from: b */
        final /* synthetic */ Aweme f66712b;

        C25327y(String str, Aweme aweme) {
            this.f66711a = str;
            this.f66712b = aweme;
        }

        /* renamed from: a */
        public final void mo63403a(String str, String str2, long j) {
            C25301by.m83138a(C25301by.f66662a, str, str2, j, this.f66711a, this.f66712b, null, 32, null);
        }
    }

    private C25301by() {
    }

    /* renamed from: a */
    public static final void m83139a(Aweme aweme) {
        m83141a(aweme, (Executor) null, (Runnable) null, false);
    }

    /* renamed from: a */
    public static final void m83144a(String str, Aweme aweme) {
        m83145a(str, aweme, (String) null);
    }

    /* renamed from: a */
    public static final void m83141a(Aweme aweme, Executor executor, Runnable runnable, boolean z) {
        if (aweme != null) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null) {
                OmVast omVast = awemeRawAd.getOmVast();
                if (omVast != null) {
                    omVast.loading = true;
                }
            }
        }
        if (C7163a.m22363a()) {
            new StringBuilder("enter loading ").append(aweme != null ? aweme.getAid() : null);
        }
        f66662a.m83152b(aweme, executor, new C25309g(aweme, runnable), z);
    }

    /* renamed from: a */
    private static final void m83148a(C7604g<String> gVar, C24939aj ajVar) {
        C24962g.m81954a(ajVar, (Collection<String>) C7605h.m23665i(C7605h.m23659d(C7605h.m23662f(gVar), C25315m.f66693a)), false);
    }

    /* renamed from: a */
    private static void m83149a(C7604g<String> gVar, String str, Aweme aweme) {
        C7573i.m23587b(gVar, "url");
        m83148a(gVar, (C24939aj) new C25327y(str, aweme));
    }

    /* renamed from: a */
    private static void m83147a(String str, String str2, long j, String str3, Aweme aweme, AwemeRawAd awemeRawAd) {
        if (str3 != null) {
            C24958f.m81906a(str, str2, j).mo65287i("track_url").mo65266a("track_ad").mo65285g(str3).mo65273b(aweme).mo65274b(awemeRawAd).mo65281c();
        }
    }

    /* renamed from: a */
    public static final void m83145a(String str, Aweme aweme, String str2) {
        C7604g gVar;
        if (str != null && C25300bx.m83125a(aweme, 3)) {
            Vast vast = null;
            if (C7163a.m22363a()) {
                StringBuilder sb = new StringBuilder("on ");
                sb.append(str);
                sb.append(" of ");
                sb.append(aweme != null ? aweme.getDesc() : null);
            }
            if (aweme != null) {
                AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                if (awemeRawAd != null) {
                    OmVast omVast = awemeRawAd.getOmVast();
                    if (omVast != null) {
                        vast = omVast.vast;
                    }
                }
            }
            if (vast != null) {
                List<Creative> list = vast.creativeList;
                if (list != null) {
                    gVar = C7605h.m23657c(C7525m.m23526p(list), new VastUtils$trackEvent$$inlined$flatMapCreative$1());
                    m83149a(C7605h.m23659d(C7605h.m23653a(gVar, (C7562b<? super T, Boolean>) new C25319q<Object,Boolean>(str)), C25320r.f66700a), str2, aweme);
                }
            }
            gVar = C7605h.m23635a();
            m83149a(C7605h.m23659d(C7605h.m23653a(gVar, (C7562b<? super T, Boolean>) new C25319q<Object,Boolean>(str)), C25320r.f66700a), str2, aweme);
        }
    }

    /* renamed from: a */
    public static final void m83143a(AwemeRawAd awemeRawAd) {
        if (awemeRawAd != null) {
            C7163a.m22363a();
            VideoClick b = f66662a.m83150b(awemeRawAd);
            if (b != null) {
                Collection collection = b.clickTracking;
                boolean z = false;
                if (!(collection == null || collection.isEmpty())) {
                    Set<String> set = b.clickTracking;
                    C7573i.m23582a((Object) set, "it.clickTracking");
                    Iterator a = C7605h.m23653a(C7525m.m23526p(set), (C7562b<? super T, Boolean>) C25318p.f66698a).mo19416a();
                    while (a.hasNext()) {
                        String str = (String) a.next();
                        if (C7163a.m22363a()) {
                            new StringBuilder("track click(tracking): ").append(str);
                        }
                        long currentTimeMillis = System.currentTimeMillis();
                        C7573i.m23582a((Object) str, "url");
                        RawURLGetter.m81769a(str, (C24924a) new C25316n(str, currentTimeMillis, awemeRawAd));
                    }
                } else {
                    OmVast omVast = awemeRawAd.getOmVast();
                    if (omVast != null && omVast.providerType == 2) {
                        CharSequence charSequence = b.clickThrough;
                        if (charSequence == null || charSequence.length() == 0) {
                            z = true;
                        }
                        if (!z) {
                            if (C7163a.m22363a()) {
                                new StringBuilder("track click(through): ").append(b.clickThrough);
                            }
                            String str2 = b.clickThrough;
                            C7573i.m23582a((Object) str2, "it.clickThrough");
                            RawURLGetter.m81769a(str2, (C24924a) new C25317o(awemeRawAd));
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static long m83132a() {
        return System.currentTimeMillis();
    }

    /* renamed from: b */
    public static final boolean m83153b() {
        Boolean bool;
        try {
            IESSettingsProxy a = C30199h.m98861a();
            C7573i.m23582a((Object) a, "SettingsReader.get()");
            bool = a.getDisableOmSdk();
            C7573i.m23582a((Object) bool, "SettingsReader.get().disableOmSdk");
        } catch (NullValueException unused) {
            bool = Boolean.valueOf(true);
        }
        return bool.booleanValue();
    }

    /* renamed from: k */
    public final VideoClick mo65895k(Aweme aweme) {
        if (aweme != null) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null) {
                return m83150b(awemeRawAd);
            }
        }
        return null;
    }

    /* renamed from: b */
    public static final void m83151b(Icon icon) {
        if (icon != null) {
            Set<String> set = icon.viewTracking;
            if (set != null) {
                m83148a(C7605h.m23655b(C7525m.m23526p(set), C25323u.f66703a), (C24939aj) null);
            }
        }
    }

    /* renamed from: a */
    public static final void m83137a(Icon icon) {
        if (icon != null) {
            List<VideoClick> list = icon.clickList;
            if (list != null) {
                m83148a(C7605h.m23655b(C7605h.m23657c(C7525m.m23526p(list), C25321s.f66701a), C25322t.f66702a), (C24939aj) null);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x000e  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.bytedance.vast.model.VideoClick m83150b(com.p280ss.android.ugc.aweme.feed.model.AwemeRawAd r2) {
        /*
            r1 = this;
            if (r2 == 0) goto L_0x000b
            com.ss.android.ugc.aweme.commercialize.model.OmVast r2 = r2.getOmVast()
            if (r2 == 0) goto L_0x000b
            com.bytedance.vast.model.Vast r2 = r2.vast
            goto L_0x000c
        L_0x000b:
            r2 = 0
        L_0x000c:
            if (r2 == 0) goto L_0x0024
            java.util.List<com.bytedance.vast.model.Creative> r2 = r2.creativeList
            if (r2 == 0) goto L_0x0024
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            kotlin.sequences.g r2 = kotlin.collections.C7525m.m23526p(r2)
            com.ss.android.ugc.aweme.commercialize.utils.VastUtils$click$$inlined$flatMapCreative$1 r0 = new com.ss.android.ugc.aweme.commercialize.utils.VastUtils$click$$inlined$flatMapCreative$1
            r0.<init>()
            kotlin.jvm.a.b r0 = (kotlin.jvm.p357a.C7562b) r0
            kotlin.sequences.g r2 = kotlin.sequences.C7605h.m23657c(r2, r0)
            goto L_0x0028
        L_0x0024:
            kotlin.sequences.g r2 = kotlin.sequences.C7605h.m23635a()
        L_0x0028:
            java.lang.Object r2 = kotlin.sequences.C7605h.m23658d(r2)
            com.bytedance.vast.model.VideoClick r2 = (com.bytedance.vast.model.VideoClick) r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.commercialize.utils.C25301by.m83150b(com.ss.android.ugc.aweme.feed.model.AwemeRawAd):com.bytedance.vast.model.VideoClick");
    }

    /* renamed from: e */
    public static final boolean m83156e(Aweme aweme) {
        OmVast omVast;
        if (aweme != null && aweme.isAd()) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null) {
                omVast = awemeRawAd.getOmVast();
            } else {
                omVast = null;
            }
            if (omVast != null && (m83160i(aweme) == null || m83153b())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public static final boolean m83157f(Aweme aweme) {
        OmVast omVast;
        if (aweme != null && aweme.isAd()) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null) {
                omVast = awemeRawAd.getOmVast();
            } else {
                omVast = null;
            }
            if (!(omVast == null || m83160i(aweme) == null || m83153b())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public static final void m83154c(Aweme aweme) {
        if (aweme != null) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null) {
                OmVast omVast = awemeRawAd.getOmVast();
                if (omVast != null) {
                    Vast vast = omVast.vast;
                    if (vast != null) {
                        Set<String> set = vast.impressionSet;
                        if (set != null) {
                            Iterator a = C7605h.m23653a(C7525m.m23526p(set), (C7562b<? super T, Boolean>) C25325w.f66707a).mo19416a();
                            while (a.hasNext()) {
                                String str = (String) a.next();
                                long currentTimeMillis = System.currentTimeMillis();
                                C7573i.m23582a((Object) str, "it");
                                RawURLGetter.m81769a(str, (C24924a) new C25324v(str, currentTimeMillis, aweme));
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: d */
    public static final void m83155d(Aweme aweme) {
        if (aweme != null && aweme.isAd() && C25300bx.m83125a(aweme, 3)) {
            if (C7163a.m22363a()) {
                new StringBuilder("on viewable of ").append(aweme.getDesc());
            }
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null) {
                OmVast omVast = awemeRawAd.getOmVast();
                if (omVast != null) {
                    Vast vast = omVast.vast;
                    if (vast != null) {
                        Set<String> set = vast.viewableSet;
                        if (set != null) {
                            m83149a(C7525m.m23526p(set), "viewable", aweme);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: i */
    public static final AdVerification m83160i(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (aweme != null && !aweme.isAd()) {
            return null;
        }
        if (aweme != null) {
            awemeRawAd = aweme.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        if (awemeRawAd != null) {
            OmVast omVast = awemeRawAd.getOmVast();
            if (omVast != null && omVast.providerType == 3) {
                OmVast omVast2 = awemeRawAd.getOmVast();
                if (omVast2 != null) {
                    Vast vast = omVast2.vast;
                    if (vast != null) {
                        List<AdVerification> list = vast.adVerificationList;
                        if (list != null) {
                            return (AdVerification) C7525m.m23513g(list);
                        }
                    }
                }
                return null;
            }
        }
        if (awemeRawAd != null) {
            OmVast omVast3 = awemeRawAd.getOmVast();
            if (omVast3 != null) {
                List<AdVerification> list2 = omVast3.adVerificationList;
                if (list2 != null) {
                    return (AdVerification) C7525m.m23513g(list2);
                }
            }
        }
        return null;
    }

    /* renamed from: j */
    public static final String m83161j(Aweme aweme) {
        boolean z;
        if (aweme != null) {
            VideoClick k = f66662a.mo65895k(aweme);
            if (k != null) {
                CharSequence charSequence = k.clickThrough;
                boolean z2 = false;
                if (charSequence == null || charSequence.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    return k.clickThrough;
                }
                Collection collection = k.clickTracking;
                if (collection == null || collection.isEmpty()) {
                    z2 = true;
                }
                if (z2) {
                    return null;
                }
                Set<String> set = k.clickTracking;
                C7573i.m23582a((Object) set, "click.clickTracking");
                return (String) C7605h.m23658d(C7605h.m23662f(C7525m.m23526p(set)));
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0099  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m83158g(com.p280ss.android.ugc.aweme.feed.model.Aweme r4) {
        /*
            boolean r0 = m83156e(r4)
            if (r0 != 0) goto L_0x000c
            boolean r0 = m83157f(r4)
            if (r0 == 0) goto L_0x00e0
        L_0x000c:
            r0 = 1
            if (r4 == 0) goto L_0x0049
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r1 = r4.getAwemeRawAd()
            if (r1 == 0) goto L_0x0049
            com.ss.android.ugc.aweme.commercialize.model.OmVast r1 = r1.getOmVast()
            if (r1 == 0) goto L_0x0049
            boolean r1 = r1.loading
            if (r1 != r0) goto L_0x0049
            com.ss.android.ugc.aweme.commercialize.log.f$b r0 = com.p280ss.android.ugc.aweme.commercialize.log.C24958f.m81905a()
            com.ss.android.ugc.aweme.commercialize.log.f$b r4 = r0.mo65273b(r4)
            java.lang.String r0 = "draw_ad"
            com.ss.android.ugc.aweme.commercialize.log.f$b r4 = r4.mo65266a(r0)
            java.lang.String r0 = "show_fail"
            com.ss.android.ugc.aweme.commercialize.log.f$b r4 = r4.mo65276b(r0)
            com.ss.android.ugc.aweme.app.g.d r0 = com.p280ss.android.ugc.aweme.app.p305g.C22984d.m75611a()
            java.lang.String r1 = "error_message"
            java.lang.String r2 = "vast_wrapper_late_response"
            com.ss.android.ugc.aweme.app.g.d r0 = r0.mo59973a(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.f60753a
            com.ss.android.ugc.aweme.commercialize.log.f$b r4 = r4.mo65265a(r0)
            r4.mo65278b()
            return
        L_0x0049:
            r1 = 0
            if (r4 == 0) goto L_0x005f
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r2 = r4.getAwemeRawAd()
            if (r2 == 0) goto L_0x005f
            com.ss.android.ugc.aweme.commercialize.model.OmVast r2 = r2.getOmVast()
            if (r2 == 0) goto L_0x005f
            com.bytedance.vast.model.Vast r2 = r2.vast
            if (r2 == 0) goto L_0x005f
            java.lang.String r2 = r2.adTitle
            goto L_0x0060
        L_0x005f:
            r2 = r1
        L_0x0060:
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r3 = 0
            if (r2 == 0) goto L_0x006e
            int r2 = r2.length()
            if (r2 != 0) goto L_0x006c
            goto L_0x006e
        L_0x006c:
            r2 = 0
            goto L_0x006f
        L_0x006e:
            r2 = 1
        L_0x006f:
            if (r2 == 0) goto L_0x0099
            com.ss.android.ugc.aweme.commercialize.log.f$b r0 = com.p280ss.android.ugc.aweme.commercialize.log.C24958f.m81905a()
            com.ss.android.ugc.aweme.commercialize.log.f$b r4 = r0.mo65273b(r4)
            java.lang.String r0 = "draw_ad"
            com.ss.android.ugc.aweme.commercialize.log.f$b r4 = r4.mo65266a(r0)
            java.lang.String r0 = "show_fail"
            com.ss.android.ugc.aweme.commercialize.log.f$b r4 = r4.mo65276b(r0)
            java.lang.String r0 = "error_message"
            java.lang.String r1 = "vast_title_missing"
            kotlin.Pair r0 = kotlin.C7579l.m23633a(r0, r1)
            java.util.Map r0 = kotlin.collections.C7507ae.m23385a(r0)
            com.ss.android.ugc.aweme.commercialize.log.f$b r4 = r4.mo65265a(r0)
            r4.mo65278b()
            return
        L_0x0099:
            if (r4 == 0) goto L_0x00ab
            com.ss.android.ugc.aweme.feed.model.Video r2 = r4.getVideo()
            if (r2 == 0) goto L_0x00ab
            com.ss.android.ugc.aweme.feed.model.VideoUrlModel r2 = r2.getPlayAddr()
            if (r2 == 0) goto L_0x00ab
            java.util.List r1 = r2.getUrlList()
        L_0x00ab:
            java.util.Collection r1 = (java.util.Collection) r1
            if (r1 == 0) goto L_0x00b7
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x00b6
            goto L_0x00b7
        L_0x00b6:
            r0 = 0
        L_0x00b7:
            if (r0 == 0) goto L_0x00e0
            com.ss.android.ugc.aweme.commercialize.log.f$b r0 = com.p280ss.android.ugc.aweme.commercialize.log.C24958f.m81905a()
            com.ss.android.ugc.aweme.commercialize.log.f$b r4 = r0.mo65273b(r4)
            java.lang.String r0 = "draw_ad"
            com.ss.android.ugc.aweme.commercialize.log.f$b r4 = r4.mo65266a(r0)
            java.lang.String r0 = "show_fail"
            com.ss.android.ugc.aweme.commercialize.log.f$b r4 = r4.mo65276b(r0)
            java.lang.String r0 = "error_message"
            java.lang.String r1 = "vast_mediafile_missing"
            kotlin.Pair r0 = kotlin.C7579l.m23633a(r0, r1)
            java.util.Map r0 = kotlin.collections.C7507ae.m23385a(r0)
            com.ss.android.ugc.aweme.commercialize.log.f$b r4 = r4.mo65265a(r0)
            r4.mo65278b()
        L_0x00e0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.commercialize.utils.C25301by.m83158g(com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    /* renamed from: b */
    public final void mo65894b(Aweme aweme) {
        String str;
        Integer num;
        String str2;
        if (C7163a.m22363a()) {
            if (m83156e(aweme)) {
                str = "vast";
            } else if (m83157f(aweme)) {
                str = "omsdk";
            } else {
                str = "none";
            }
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null) {
                OmVast omVast = awemeRawAd.getOmVast();
                if (omVast != null) {
                    num = Integer.valueOf(omVast.providerType);
                    if (num != null && num.intValue() == 2) {
                        str2 = "local";
                    } else if (num != null && num.intValue() == 3) {
                        str2 = "dsp";
                    } else {
                        str2 = "unknown";
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append('(');
                    sb.append(str2);
                    sb.append("): ");
                    sb.append(aweme.getDesc());
                }
            }
            num = null;
            if (num != null) {
                str2 = "local";
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append('(');
                sb2.append(str2);
                sb2.append("): ");
                sb2.append(aweme.getDesc());
            }
            if (num != null) {
                str2 = "dsp";
                StringBuilder sb22 = new StringBuilder();
                sb22.append(str);
                sb22.append('(');
                sb22.append(str2);
                sb22.append("): ");
                sb22.append(aweme.getDesc());
            }
            str2 = "unknown";
            StringBuilder sb222 = new StringBuilder();
            sb222.append(str);
            sb222.append('(');
            sb222.append(str2);
            sb222.append("): ");
            sb222.append(aweme.getDesc());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002c, code lost:
        if (r0 == null) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00aa, code lost:
        if (r0 == null) goto L_0x00ac;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x008f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m83159h(com.p280ss.android.ugc.aweme.feed.model.Aweme r5) {
        /*
            boolean r0 = m83156e(r5)
            if (r0 != 0) goto L_0x000c
            boolean r0 = m83157f(r5)
            if (r0 == 0) goto L_0x0137
        L_0x000c:
            if (r5 == 0) goto L_0x002e
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r5.getAwemeRawAd()
            if (r0 == 0) goto L_0x002e
            com.ss.android.ugc.aweme.commercialize.model.OmVast r0 = r0.getOmVast()
            if (r0 == 0) goto L_0x002e
            com.bytedance.vast.model.Vast r0 = r0.vast
            if (r0 == 0) goto L_0x002e
            java.util.List<com.bytedance.vast.model.Creative> r0 = r0.creativeList
            if (r0 == 0) goto L_0x002e
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            kotlin.sequences.g r0 = kotlin.collections.C7525m.m23526p(r0)
            kotlin.sequences.g r0 = kotlin.sequences.C7605h.m23662f(r0)
            if (r0 != 0) goto L_0x0032
        L_0x002e:
            kotlin.sequences.g r0 = kotlin.sequences.C7605h.m23635a()
        L_0x0032:
            if (r5 == 0) goto L_0x0057
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r1 = r5.getAwemeRawAd()
            if (r1 == 0) goto L_0x0057
            com.ss.android.ugc.aweme.commercialize.model.OmVast r1 = r1.getOmVast()
            if (r1 == 0) goto L_0x0057
            com.bytedance.vast.model.Vast r1 = r1.vast
            if (r1 == 0) goto L_0x0057
            java.util.Set<java.lang.String> r1 = r1.impressionSet
            if (r1 == 0) goto L_0x0057
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            kotlin.sequences.g r1 = kotlin.collections.C7525m.m23526p(r1)
            com.ss.android.ugc.aweme.commercialize.utils.by$l r2 = com.p280ss.android.ugc.aweme.commercialize.utils.C25301by.C25314l.f66692a
            kotlin.jvm.a.b r2 = (kotlin.jvm.p357a.C7562b) r2
            kotlin.sequences.g r1 = kotlin.sequences.C7605h.m23653a(r1, r2)
            goto L_0x005b
        L_0x0057:
            kotlin.sequences.g r1 = kotlin.sequences.C7605h.m23635a()
        L_0x005b:
            com.ss.android.ugc.aweme.commercialize.utils.by$h r2 = com.p280ss.android.ugc.aweme.commercialize.utils.C25301by.C25310h.f66688a
            kotlin.jvm.a.b r2 = (kotlin.jvm.p357a.C7562b) r2
            kotlin.sequences.g r2 = kotlin.sequences.C7605h.m23657c(r0, r2)
            kotlin.sequences.g r2 = kotlin.sequences.C7605h.m23662f(r2)
            com.ss.android.ugc.aweme.commercialize.utils.by$j r3 = com.p280ss.android.ugc.aweme.commercialize.utils.C25301by.C25312j.f66690a
            kotlin.jvm.a.b r3 = (kotlin.jvm.p357a.C7562b) r3
            kotlin.sequences.g r2 = kotlin.sequences.C7605h.m23657c(r2, r3)
            com.ss.android.ugc.aweme.commercialize.utils.by$k r3 = com.p280ss.android.ugc.aweme.commercialize.utils.C25301by.C25313k.f66691a
            kotlin.jvm.a.b r3 = (kotlin.jvm.p357a.C7562b) r3
            kotlin.sequences.g r2 = kotlin.sequences.C7605h.m23653a(r2, r3)
            java.util.Iterator r0 = r0.mo19416a()
        L_0x007b:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x008f
            java.lang.Object r3 = r0.next()
            r4 = r3
            com.bytedance.vast.model.Creative r4 = (com.bytedance.vast.model.Creative) r4
            boolean r4 = r4.byWrapper
            r4 = r4 ^ 1
            if (r4 == 0) goto L_0x007b
            goto L_0x0090
        L_0x008f:
            r3 = 0
        L_0x0090:
            com.bytedance.vast.model.Creative r3 = (com.bytedance.vast.model.Creative) r3
            if (r3 == 0) goto L_0x00ac
            java.util.List<com.bytedance.vast.model.VideoClick> r0 = r3.clickList
            if (r0 == 0) goto L_0x00ac
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            kotlin.sequences.g r0 = kotlin.collections.C7525m.m23526p(r0)
            com.ss.android.ugc.aweme.commercialize.utils.by$i r3 = com.p280ss.android.ugc.aweme.commercialize.utils.C25301by.C25311i.f66689a
            kotlin.jvm.a.b r3 = (kotlin.jvm.p357a.C7562b) r3
            kotlin.sequences.g r0 = kotlin.sequences.C7605h.m23659d(r0, r3)
            kotlin.sequences.g r0 = kotlin.sequences.C7605h.m23662f(r0)
            if (r0 != 0) goto L_0x00b0
        L_0x00ac:
            kotlin.sequences.g r0 = kotlin.sequences.C7605h.m23635a()
        L_0x00b0:
            boolean r1 = kotlin.sequences.C7605h.m23667k(r1)
            if (r1 != 0) goto L_0x00dd
            com.ss.android.ugc.aweme.commercialize.log.f$b r1 = com.p280ss.android.ugc.aweme.commercialize.log.C24958f.m81905a()
            com.ss.android.ugc.aweme.commercialize.log.f$b r1 = r1.mo65273b(r5)
            java.lang.String r3 = "draw_ad"
            com.ss.android.ugc.aweme.commercialize.log.f$b r1 = r1.mo65266a(r3)
            java.lang.String r3 = "load_failed"
            com.ss.android.ugc.aweme.commercialize.log.f$b r1 = r1.mo65276b(r3)
            java.lang.String r3 = "error_message"
            java.lang.String r4 = "vast_imp_tracker_missing"
            kotlin.Pair r3 = kotlin.C7579l.m23633a(r3, r4)
            java.util.Map r3 = kotlin.collections.C7507ae.m23385a(r3)
            com.ss.android.ugc.aweme.commercialize.log.f$b r1 = r1.mo65265a(r3)
            r1.mo65278b()
        L_0x00dd:
            boolean r0 = kotlin.sequences.C7605h.m23667k(r0)
            if (r0 != 0) goto L_0x010a
            com.ss.android.ugc.aweme.commercialize.log.f$b r0 = com.p280ss.android.ugc.aweme.commercialize.log.C24958f.m81905a()
            com.ss.android.ugc.aweme.commercialize.log.f$b r0 = r0.mo65273b(r5)
            java.lang.String r1 = "draw_ad"
            com.ss.android.ugc.aweme.commercialize.log.f$b r0 = r0.mo65266a(r1)
            java.lang.String r1 = "load_failed"
            com.ss.android.ugc.aweme.commercialize.log.f$b r0 = r0.mo65276b(r1)
            java.lang.String r1 = "error_message"
            java.lang.String r3 = "vast_clickthru_missing"
            kotlin.Pair r1 = kotlin.C7579l.m23633a(r1, r3)
            java.util.Map r1 = kotlin.collections.C7507ae.m23385a(r1)
            com.ss.android.ugc.aweme.commercialize.log.f$b r0 = r0.mo65265a(r1)
            r0.mo65278b()
        L_0x010a:
            boolean r0 = kotlin.sequences.C7605h.m23667k(r2)
            if (r0 != 0) goto L_0x0137
            com.ss.android.ugc.aweme.commercialize.log.f$b r0 = com.p280ss.android.ugc.aweme.commercialize.log.C24958f.m81905a()
            com.ss.android.ugc.aweme.commercialize.log.f$b r5 = r0.mo65273b(r5)
            java.lang.String r0 = "draw_ad"
            com.ss.android.ugc.aweme.commercialize.log.f$b r5 = r5.mo65266a(r0)
            java.lang.String r0 = "load_failed"
            com.ss.android.ugc.aweme.commercialize.log.f$b r5 = r5.mo65276b(r0)
            java.lang.String r0 = "error_message"
            java.lang.String r1 = "vast_click_tracker_missing"
            kotlin.Pair r0 = kotlin.C7579l.m23633a(r0, r1)
            java.util.Map r0 = kotlin.collections.C7507ae.m23385a(r0)
            com.ss.android.ugc.aweme.commercialize.log.f$b r5 = r5.mo65265a(r0)
            r5.mo65278b()
        L_0x0137:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.commercialize.utils.C25301by.m83159h(com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    /* renamed from: a */
    public static long m83133a(long j, String str) {
        CharSequence charSequence = str;
        C7631j matchEntire = f66663b.matchEntire(charSequence);
        if (matchEntire != null) {
            long j2 = j * 100;
            C48039g a = matchEntire.mo19512c().mo120238a(1);
            if (a == null) {
                C7573i.m23580a();
            }
            return j2 / ((long) Integer.parseInt(a.f122887a));
        }
        C7631j matchEntire2 = f66664c.matchEntire(charSequence);
        if (matchEntire2 == null) {
            return -1;
        }
        TimeUnit timeUnit = TimeUnit.HOURS;
        C48039g a2 = matchEntire2.mo19512c().mo120238a(1);
        if (a2 == null) {
            C7573i.m23580a();
        }
        long millis = timeUnit.toMillis(Long.parseLong(a2.f122887a));
        TimeUnit timeUnit2 = TimeUnit.MINUTES;
        C48039g a3 = matchEntire2.mo19512c().mo120238a(2);
        if (a3 == null) {
            C7573i.m23580a();
        }
        long millis2 = millis + timeUnit2.toMillis(Long.parseLong(a3.f122887a));
        TimeUnit timeUnit3 = TimeUnit.SECONDS;
        C48039g a4 = matchEntire2.mo19512c().mo120238a(3);
        if (a4 == null) {
            C7573i.m23580a();
        }
        return millis2 + timeUnit3.toMillis(Long.parseLong(a4.f122887a));
    }

    /* renamed from: a */
    public static BitRate m83134a(MediaFile mediaFile, double d) {
        boolean z;
        String str;
        int i;
        int i2;
        int i3;
        if (mediaFile != null && !(!C7573i.m23585a((Object) mediaFile.type, (Object) "video/mp4")) && mediaFile.width > 0 && mediaFile.height > 0) {
            CharSequence charSequence = mediaFile.url;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                BitRate bitRate = new BitRate();
                bitRate.setH265(0);
                int i4 = mediaFile.width;
                if (i4 >= 0 && 540 > i4) {
                    str = "480p";
                    bitRate.setGearName("noraml_480");
                    bitRate.setQualityType(301);
                    if (mediaFile.bitRate > 0) {
                        i3 = mediaFile.bitRate * PreloadTask.BYTE_UNIT_NUMBER;
                    } else {
                        i3 = 600000;
                    }
                    bitRate.setBitRate(i3);
                } else if (540 <= i4 && 720 > i4) {
                    str = "540p";
                    bitRate.setGearName("normal_540");
                    bitRate.setQualityType(201);
                    if (mediaFile.bitRate > 0) {
                        i2 = mediaFile.bitRate * PreloadTask.BYTE_UNIT_NUMBER;
                    } else {
                        i2 = 1350000;
                    }
                    bitRate.setBitRate(i2);
                } else {
                    str = "720p";
                    bitRate.setGearName("normal_720");
                    bitRate.setQualityType(BaseNotice.HASHTAG);
                    if (mediaFile.bitRate > 0) {
                        i = mediaFile.bitRate * PreloadTask.BYTE_UNIT_NUMBER;
                    } else {
                        i = 2000000;
                    }
                    bitRate.setBitRate(i);
                }
                UrlModel urlModel = new UrlModel();
                urlModel.setWidth(mediaFile.width);
                urlModel.setHeight(mediaFile.height);
                String str2 = mediaFile.url;
                C7573i.m23582a((Object) str2, "m.url");
                Charset charset = C48038d.f122880a;
                if (str2 != null) {
                    byte[] bytes = str2.getBytes(charset);
                    C7573i.m23582a((Object) bytes, "(this as java.lang.String).getBytes(charset)");
                    urlModel.setUri(Base64.encodeToString(bytes, 2));
                    StringBuilder sb = new StringBuilder();
                    sb.append(urlModel.getUri());
                    sb.append("_h264_");
                    sb.append(str);
                    sb.append('_');
                    sb.append(bitRate.getBitRate());
                    urlModel.setUrlKey(sb.toString());
                    urlModel.setUrlList(C7525m.m23466c(mediaFile.url));
                    bitRate.setPlayAddr(urlModel);
                    return bitRate;
                }
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0040, code lost:
        if (r4 == null) goto L_0x0042;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m83140a(com.p280ss.android.ugc.aweme.feed.model.Aweme r3, com.p280ss.android.ugc.playerkit.model.C44919c r4) {
        /*
            if (r3 != 0) goto L_0x0003
            return
        L_0x0003:
            if (r4 != 0) goto L_0x0006
            return
        L_0x0006:
            r0 = 3
            boolean r0 = com.p280ss.android.ugc.aweme.commercialize.utils.C25300bx.m83125a(r3, r0)
            if (r0 != 0) goto L_0x000e
            return
        L_0x000e:
            com.ss.android.ugc.aweme.commercialize.log.f$b r0 = com.p280ss.android.ugc.aweme.commercialize.log.C24958f.m81905a()
            com.ss.android.ugc.aweme.commercialize.log.f$b r3 = r0.mo65273b(r3)
            java.lang.String r0 = "draw_ad"
            com.ss.android.ugc.aweme.commercialize.log.f$b r3 = r3.mo65266a(r0)
            java.lang.String r0 = "show_fail"
            com.ss.android.ugc.aweme.commercialize.log.f$b r3 = r3.mo65276b(r0)
            com.ss.android.ugc.aweme.app.g.d r0 = com.p280ss.android.ugc.aweme.app.p305g.C22984d.m75611a()
            java.lang.String r1 = "error_message"
            java.lang.String r2 = "vast_mediafile_bad_response"
            com.ss.android.ugc.aweme.app.g.d r0 = r0.mo59973a(r1, r2)
            java.lang.String r1 = "error_code"
            int r2 = r4.f115525d
            com.ss.android.ugc.aweme.app.g.d r0 = r0.mo59970a(r1, r2)
            java.lang.String r1 = "error_detail"
            java.lang.Object r4 = r4.f115527f
            if (r4 == 0) goto L_0x0042
            java.lang.String r4 = r4.toString()
            if (r4 != 0) goto L_0x0044
        L_0x0042:
            java.lang.String r4 = ""
        L_0x0044:
            com.ss.android.ugc.aweme.app.g.d r4 = r0.mo59973a(r1, r4)
            java.util.Map<java.lang.String, java.lang.String> r4 = r4.f60753a
            com.ss.android.ugc.aweme.commercialize.log.f$b r3 = r3.mo65265a(r4)
            r3.mo65278b()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.commercialize.utils.C25301by.m83140a(com.ss.android.ugc.aweme.feed.model.Aweme, com.ss.android.ugc.playerkit.model.c):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003d, code lost:
        if (r5 == null) goto L_0x003f;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m83136a(com.bytedance.vast.model.Creative r5, com.p280ss.android.ugc.aweme.feed.model.Aweme r6, com.bytedance.vast.model.Icon r7) {
        /*
            if (r7 != 0) goto L_0x0003
            return
        L_0x0003:
            java.lang.String r0 = r7.program
            java.lang.String r1 = "nativeIcon.program"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            com.bytedance.vast.model.Icon r6 = com.p280ss.android.ugc.aweme.commercialize.utils.C25300bx.m83123a(r6, r0)
            if (r6 != 0) goto L_0x0023
            java.util.List<com.bytedance.vast.model.Icon> r6 = r5.iconList
            if (r6 != 0) goto L_0x001d
            java.util.LinkedList r6 = new java.util.LinkedList
            r6.<init>()
            java.util.List r6 = (java.util.List) r6
            r5.iconList = r6
        L_0x001d:
            java.util.List<com.bytedance.vast.model.Icon> r5 = r5.iconList
            r5.add(r7)
            return
        L_0x0023:
            java.util.Set<java.lang.String> r5 = r7.staticResource
            r0 = 0
            r1 = 1
            r2 = 0
            if (r5 == 0) goto L_0x003f
            r3 = r5
            java.util.Collection r3 = (java.util.Collection) r3
            if (r3 == 0) goto L_0x0038
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x0036
            goto L_0x0038
        L_0x0036:
            r3 = 0
            goto L_0x0039
        L_0x0038:
            r3 = 1
        L_0x0039:
            if (r3 != 0) goto L_0x003c
            goto L_0x003d
        L_0x003c:
            r5 = r0
        L_0x003d:
            if (r5 != 0) goto L_0x0041
        L_0x003f:
            java.util.Set<java.lang.String> r5 = r6.staticResource
        L_0x0041:
            r6.staticResource = r5
            java.util.Set<java.lang.String> r5 = r7.viewTracking
            if (r5 == 0) goto L_0x0077
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.Iterator r5 = r5.iterator()
        L_0x0054:
            boolean r3 = r5.hasNext()
            if (r3 == 0) goto L_0x0075
            java.lang.Object r3 = r5.next()
            r4 = r3
            java.lang.String r4 = (java.lang.String) r4
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            if (r4 == 0) goto L_0x006e
            int r4 = r4.length()
            if (r4 != 0) goto L_0x006c
            goto L_0x006e
        L_0x006c:
            r4 = 0
            goto L_0x006f
        L_0x006e:
            r4 = 1
        L_0x006f:
            if (r4 != 0) goto L_0x0054
            r0.add(r3)
            goto L_0x0054
        L_0x0075:
            java.util.List r0 = (java.util.List) r0
        L_0x0077:
            java.util.Collection r0 = (java.util.Collection) r0
            if (r0 == 0) goto L_0x0084
            boolean r5 = r0.isEmpty()
            if (r5 == 0) goto L_0x0082
            goto L_0x0084
        L_0x0082:
            r5 = 0
            goto L_0x0085
        L_0x0084:
            r5 = 1
        L_0x0085:
            if (r5 != 0) goto L_0x0099
            java.util.Set<java.lang.String> r5 = r6.viewTracking
            if (r5 != 0) goto L_0x0094
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            java.util.Set r5 = (java.util.Set) r5
            r6.viewTracking = r5
        L_0x0094:
            java.util.Set<java.lang.String> r5 = r6.viewTracking
            r5.addAll(r0)
        L_0x0099:
            java.util.List<com.bytedance.vast.model.VideoClick> r5 = r7.clickList
            java.util.Collection r5 = (java.util.Collection) r5
            if (r5 == 0) goto L_0x00a7
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L_0x00a6
            goto L_0x00a7
        L_0x00a6:
            r1 = 0
        L_0x00a7:
            if (r1 != 0) goto L_0x00c4
            java.util.List<com.bytedance.vast.model.VideoClick> r5 = r6.clickList
            if (r5 != 0) goto L_0x00b6
            java.util.LinkedList r5 = new java.util.LinkedList
            r5.<init>()
            java.util.List r5 = (java.util.List) r5
            r6.clickList = r5
        L_0x00b6:
            java.util.List<com.bytedance.vast.model.VideoClick> r5 = r6.clickList
            java.util.List<com.bytedance.vast.model.VideoClick> r6 = r7.clickList
            java.lang.String r7 = "nativeIcon.clickList"
            kotlin.jvm.internal.C7573i.m23582a(r6, r7)
            java.util.Collection r6 = (java.util.Collection) r6
            r5.addAll(r2, r6)
        L_0x00c4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.commercialize.utils.C25301by.m83136a(com.bytedance.vast.model.Creative, com.ss.android.ugc.aweme.feed.model.Aweme, com.bytedance.vast.model.Icon):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0083 A[LOOP:0: B:29:0x007d->B:31:0x0083, LOOP_END] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m83135a(long r7, long r9, long r11, com.p280ss.android.ugc.aweme.feed.model.Aweme r13) {
        /*
            r0 = 3
            boolean r0 = com.p280ss.android.ugc.aweme.commercialize.utils.C25300bx.m83125a(r13, r0)
            if (r0 != 0) goto L_0x0008
            return
        L_0x0008:
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 != 0) goto L_0x000d
            return
        L_0x000d:
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 >= 0) goto L_0x0013
        L_0x0011:
            r5 = r7
            goto L_0x0016
        L_0x0013:
            r7 = -1
            goto L_0x0011
        L_0x0016:
            boolean r7 = com.p280ss.android.ugc.aweme.p331m.C7163a.m22363a()
            r8 = 0
            if (r7 == 0) goto L_0x003f
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "progress "
            r7.<init>(r0)
            r7.append(r9)
            r0 = 47
            r7.append(r0)
            r7.append(r11)
            java.lang.String r0 = ": "
            r7.append(r0)
            if (r13 == 0) goto L_0x003b
            java.lang.String r0 = r13.getDesc()
            goto L_0x003c
        L_0x003b:
            r0 = r8
        L_0x003c:
            r7.append(r0)
        L_0x003f:
            if (r13 == 0) goto L_0x004f
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r7 = r13.getAwemeRawAd()
            if (r7 == 0) goto L_0x004f
            com.ss.android.ugc.aweme.commercialize.model.OmVast r7 = r7.getOmVast()
            if (r7 == 0) goto L_0x004f
            com.bytedance.vast.model.Vast r8 = r7.vast
        L_0x004f:
            if (r8 == 0) goto L_0x0067
            java.util.List<com.bytedance.vast.model.Creative> r7 = r8.creativeList
            if (r7 == 0) goto L_0x0067
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            kotlin.sequences.g r7 = kotlin.collections.C7525m.m23526p(r7)
            com.ss.android.ugc.aweme.commercialize.utils.VastUtils$trackOffset$$inlined$flatMapCreative$1 r8 = new com.ss.android.ugc.aweme.commercialize.utils.VastUtils$trackOffset$$inlined$flatMapCreative$1
            r8.<init>()
            kotlin.jvm.a.b r8 = (kotlin.jvm.p357a.C7562b) r8
            kotlin.sequences.g r7 = kotlin.sequences.C7605h.m23657c(r7, r8)
            goto L_0x006b
        L_0x0067:
            kotlin.sequences.g r7 = kotlin.sequences.C7605h.m23635a()
        L_0x006b:
            com.ss.android.ugc.aweme.commercialize.utils.by$x r8 = new com.ss.android.ugc.aweme.commercialize.utils.by$x
            r0 = r8
            r1 = r11
            r3 = r9
            r0.<init>(r1, r3, r5)
            kotlin.jvm.a.b r8 = (kotlin.jvm.p357a.C7562b) r8
            kotlin.sequences.g r7 = kotlin.sequences.C7605h.m23653a(r7, r8)
            java.util.Iterator r7 = r7.mo19416a()
        L_0x007d:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x00bd
            java.lang.Object r8 = r7.next()
            com.bytedance.vast.model.TrackingEvent r8 = (com.bytedance.vast.model.TrackingEvent) r8
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.lang.String r10 = r8.offset
            java.lang.String r0 = "it.offset"
            kotlin.jvm.internal.C7573i.m23582a(r10, r0)
            long r0 = m83133a(r11, r10)
            long r9 = r9.toSeconds(r0)
            r0 = 1
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = 0
            java.lang.String r8 = r8.url
            r0[r1] = r8
            kotlin.sequences.g r8 = kotlin.sequences.C7605h.m23642a((T[]) r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "cpv_"
            r0.<init>(r1)
            r0.append(r9)
            r9 = 115(0x73, float:1.61E-43)
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            m83149a(r8, r9, r13)
            goto L_0x007d
        L_0x00bd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.commercialize.utils.C25301by.m83135a(long, long, long, com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:164|165) */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:47|48|49|50|(1:52)) */
    /* JADX WARNING: Code restructure failed: missing block: B:165:?, code lost:
        r6 = java.lang.Boolean.valueOf(false);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:164:0x0268 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x00d3 */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x01ad A[Catch:{ Exception -> 0x0387, all -> 0x039f }] */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x01b0 A[Catch:{ Exception -> 0x0387, all -> 0x039f }] */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x01bd A[Catch:{ Exception -> 0x0387, all -> 0x039f }] */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x01c9 A[Catch:{ Exception -> 0x0387, all -> 0x039f }] */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x01ca A[Catch:{ Exception -> 0x0387, all -> 0x039f }] */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x01cd A[Catch:{ Exception -> 0x0387, all -> 0x039f }] */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x01da A[Catch:{ Exception -> 0x0387, all -> 0x039f }] */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x01f7 A[Catch:{ Exception -> 0x0387, all -> 0x039f }] */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x01f8 A[Catch:{ Exception -> 0x0387, all -> 0x039f }] */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x01fb A[Catch:{ Exception -> 0x0387, all -> 0x039f }] */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x020e A[Catch:{ Exception -> 0x0387, all -> 0x039f }] */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x0277 A[Catch:{ Exception -> 0x0387, all -> 0x039f }] */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0280 A[Catch:{ Exception -> 0x0387, all -> 0x039f }] */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x0291 A[Catch:{ Exception -> 0x0387, all -> 0x039f }] */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x0292 A[Catch:{ Exception -> 0x0387, all -> 0x039f }] */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0295 A[Catch:{ Exception -> 0x0387, all -> 0x039f }] */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x0298 A[Catch:{ Exception -> 0x0387, all -> 0x039f }] */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x02a0 A[Catch:{ Exception -> 0x0387, all -> 0x039f }] */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x02a7 A[Catch:{ Exception -> 0x0387, all -> 0x039f }] */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x02b4 A[Catch:{ Exception -> 0x0387, all -> 0x039f }] */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x02d4 A[Catch:{ Exception -> 0x0387, all -> 0x039f }] */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x02e0 A[Catch:{ Exception -> 0x0387, all -> 0x039f }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00d9 A[Catch:{ all -> 0x00f1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0177 A[Catch:{ Exception -> 0x0387, all -> 0x039f }] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x018d A[Catch:{ Exception -> 0x0387, all -> 0x039f }] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01ac A[Catch:{ Exception -> 0x0387, all -> 0x039f }] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0019  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m83152b(com.p280ss.android.ugc.aweme.feed.model.Aweme r15, java.util.concurrent.Executor r16, java.lang.Runnable r17, boolean r18) {
        /*
            r14 = this;
            r0 = r15
            r9 = r16
            r1 = 0
            if (r0 == 0) goto L_0x0012
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r2 = r15.getAwemeRawAd()
            if (r2 == 0) goto L_0x0012
            com.ss.android.ugc.aweme.commercialize.model.OmVast r2 = r2.getOmVast()
            r7 = r2
            goto L_0x0013
        L_0x0012:
            r7 = r1
        L_0x0013:
            if (r7 != 0) goto L_0x0019
            r17.run()
            return
        L_0x0019:
            java.util.List<com.bytedance.vast.model.AdVerification> r2 = r7.adVerificationList
            java.util.Collection r2 = (java.util.Collection) r2
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x002a
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x0028
            goto L_0x002a
        L_0x0028:
            r2 = 0
            goto L_0x002b
        L_0x002a:
            r2 = 1
        L_0x002b:
            r5 = 2
            if (r2 == 0) goto L_0x0065
            java.lang.String r2 = r7.vastContent
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            if (r2 == 0) goto L_0x003d
            int r2 = r2.length()
            if (r2 != 0) goto L_0x003b
            goto L_0x003d
        L_0x003b:
            r2 = 0
            goto L_0x003e
        L_0x003d:
            r2 = 1
        L_0x003e:
            if (r2 == 0) goto L_0x0065
            int r2 = r7.providerType
            if (r2 != r5) goto L_0x0065
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r2 = r15.getAwemeRawAd()
            if (r2 == 0) goto L_0x004d
            r2.setOmVast(r1)
        L_0x004d:
            boolean r1 = com.p280ss.android.ugc.aweme.p331m.C7163a.m22363a()
            if (r1 == 0) goto L_0x0061
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "remove empty vast structure: "
            r1.<init>(r2)
            java.lang.String r0 = r15.getDesc()
            r1.append(r0)
        L_0x0061:
            r17.run()
            return
        L_0x0065:
            if (r18 == 0) goto L_0x0069
            r8 = 0
            goto L_0x006c
        L_0x0069:
            int r2 = r7.vastWrapperCount
            r8 = r2
        L_0x006c:
            long r10 = m83132a()
            r7.loaded = r4
            int r2 = r7.providerType
            if (r2 != r5) goto L_0x0108
            if (r9 != 0) goto L_0x00f6
            com.ss.android.ugc.aweme.commercialize.log.f$b r1 = com.p280ss.android.ugc.aweme.commercialize.log.C24958f.m81905a()     // Catch:{ all -> 0x00f1 }
            com.ss.android.ugc.aweme.commercialize.log.f$b r1 = r1.mo65273b(r15)     // Catch:{ all -> 0x00f1 }
            java.lang.String r2 = "draw_ad"
            com.ss.android.ugc.aweme.commercialize.log.f$b r1 = r1.mo65266a(r2)     // Catch:{ all -> 0x00f1 }
            java.lang.String r2 = "parse_vast"
            com.ss.android.ugc.aweme.commercialize.log.f$b r1 = r1.mo65276b(r2)     // Catch:{ all -> 0x00f1 }
            java.lang.String r2 = "duration"
            long r5 = m83132a()     // Catch:{ all -> 0x00f1 }
            r9 = 0
            long r5 = r5 - r10
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x00f1 }
            kotlin.Pair r2 = kotlin.C7579l.m23633a(r2, r5)     // Catch:{ all -> 0x00f1 }
            java.util.Map r2 = kotlin.collections.C7507ae.m23385a(r2)     // Catch:{ all -> 0x00f1 }
            com.ss.android.ugc.aweme.commercialize.log.f$b r1 = r1.mo65265a(r2)     // Catch:{ all -> 0x00f1 }
            r1.mo65278b()     // Catch:{ all -> 0x00f1 }
            r7.loaded = r3     // Catch:{ all -> 0x00f1 }
            com.bytedance.vast.model.Vast r1 = new com.bytedance.vast.model.Vast     // Catch:{ all -> 0x00f1 }
            r1.<init>()     // Catch:{ all -> 0x00f1 }
            r7.vast = r1     // Catch:{ all -> 0x00f1 }
            java.lang.String r1 = r7.vastUrl     // Catch:{ all -> 0x00f1 }
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch:{ all -> 0x00f1 }
            if (r1 == 0) goto L_0x00be
            int r1 = r1.length()     // Catch:{ all -> 0x00f1 }
            if (r1 != 0) goto L_0x00bd
            goto L_0x00be
        L_0x00bd:
            r3 = 0
        L_0x00be:
            if (r3 != 0) goto L_0x00e7
            com.bytedance.vast.model.Vast r1 = r7.vast     // Catch:{ Exception -> 0x00d3 }
            java.lang.String r2 = r7.vastUrl     // Catch:{ Exception -> 0x00d3 }
            com.ss.android.ugc.aweme.commercialize.utils.by$a r3 = com.p280ss.android.ugc.aweme.commercialize.utils.C25301by.C25302a.f66665a     // Catch:{ Exception -> 0x00d3 }
            com.bytedance.vast.b r3 = (com.bytedance.vast.C13016b) r3     // Catch:{ Exception -> 0x00d3 }
            com.ss.android.ugc.aweme.commercialize.utils.by$b r4 = new com.ss.android.ugc.aweme.commercialize.utils.by$b     // Catch:{ Exception -> 0x00d3 }
            r4.<init>(r15)     // Catch:{ Exception -> 0x00d3 }
            com.bytedance.vast.c r4 = (com.bytedance.vast.C13017c) r4     // Catch:{ Exception -> 0x00d3 }
            r1.parseUri(r2, r8, r3, r4)     // Catch:{ Exception -> 0x00d3 }
            goto L_0x00e7
        L_0x00d3:
            boolean r1 = com.p280ss.android.ugc.aweme.p331m.C7163a.m22363a()     // Catch:{ all -> 0x00f1 }
            if (r1 == 0) goto L_0x00e7
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f1 }
            java.lang.String r2 = "parse uri failed: "
            r1.<init>(r2)     // Catch:{ all -> 0x00f1 }
            java.lang.String r2 = r15.getDesc()     // Catch:{ all -> 0x00f1 }
            r1.append(r2)     // Catch:{ all -> 0x00f1 }
        L_0x00e7:
            com.ss.android.ugc.aweme.commercialize.utils.by r1 = f66662a     // Catch:{ all -> 0x00f1 }
            r1.mo65894b(r15)     // Catch:{ all -> 0x00f1 }
            r17.run()
            goto L_0x03ba
        L_0x00f1:
            r0 = move-exception
            r17.run()
            throw r0
        L_0x00f6:
            com.ss.android.ugc.aweme.commercialize.utils.by$c r12 = new com.ss.android.ugc.aweme.commercialize.utils.by$c
            r1 = r12
            r2 = r17
            r3 = r15
            r4 = r10
            r6 = r7
            r7 = r8
            r1.<init>(r2, r3, r4, r6, r7)
            java.lang.Runnable r12 = (java.lang.Runnable) r12
            r9.execute(r12)
            return
        L_0x0108:
            int r2 = r7.providerType
            r5 = 3
            if (r2 != r5) goto L_0x03b4
            java.lang.String r2 = r7.vastContent
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            if (r2 == 0) goto L_0x011c
            int r2 = r2.length()
            if (r2 != 0) goto L_0x011a
            goto L_0x011c
        L_0x011a:
            r2 = 0
            goto L_0x011d
        L_0x011c:
            r2 = 1
        L_0x011d:
            if (r2 != 0) goto L_0x03b4
            com.bytedance.vast.model.Vast r6 = new com.bytedance.vast.model.Vast
            r6.<init>()
            if (r9 != 0) goto L_0x03a4
            com.ss.android.ugc.aweme.commercialize.log.f$b r2 = com.p280ss.android.ugc.aweme.commercialize.log.C24958f.m81905a()     // Catch:{ all -> 0x039f }
            com.ss.android.ugc.aweme.commercialize.log.f$b r2 = r2.mo65273b(r15)     // Catch:{ all -> 0x039f }
            java.lang.String r5 = "draw_ad"
            com.ss.android.ugc.aweme.commercialize.log.f$b r2 = r2.mo65266a(r5)     // Catch:{ all -> 0x039f }
            java.lang.String r5 = "parse_vast"
            com.ss.android.ugc.aweme.commercialize.log.f$b r2 = r2.mo65276b(r5)     // Catch:{ all -> 0x039f }
            java.lang.String r5 = "duration"
            long r12 = m83132a()     // Catch:{ all -> 0x039f }
            r9 = 0
            long r12 = r12 - r10
            java.lang.Long r9 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x039f }
            kotlin.Pair r5 = kotlin.C7579l.m23633a(r5, r9)     // Catch:{ all -> 0x039f }
            java.util.Map r5 = kotlin.collections.C7507ae.m23385a(r5)     // Catch:{ all -> 0x039f }
            com.ss.android.ugc.aweme.commercialize.log.f$b r2 = r2.mo65265a(r5)     // Catch:{ all -> 0x039f }
            r2.mo65278b()     // Catch:{ all -> 0x039f }
            java.lang.String r2 = r7.vastContent     // Catch:{ Exception -> 0x0387 }
            com.ss.android.ugc.aweme.commercialize.utils.by$a r5 = com.p280ss.android.ugc.aweme.commercialize.utils.C25301by.C25302a.f66665a     // Catch:{ Exception -> 0x0387 }
            com.bytedance.vast.b r5 = (com.bytedance.vast.C13016b) r5     // Catch:{ Exception -> 0x0387 }
            com.ss.android.ugc.aweme.commercialize.utils.by$b r9 = new com.ss.android.ugc.aweme.commercialize.utils.by$b     // Catch:{ Exception -> 0x0387 }
            r9.<init>(r15)     // Catch:{ Exception -> 0x0387 }
            com.bytedance.vast.c r9 = (com.bytedance.vast.C13017c) r9     // Catch:{ Exception -> 0x0387 }
            r6.parseContent(r2, r8, r5, r9)     // Catch:{ Exception -> 0x0387 }
            java.lang.String r2 = r6.adTitle     // Catch:{ all -> 0x039f }
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2     // Catch:{ all -> 0x039f }
            if (r2 == 0) goto L_0x0174
            int r2 = r2.length()     // Catch:{ all -> 0x039f }
            if (r2 != 0) goto L_0x0172
            goto L_0x0174
        L_0x0172:
            r2 = 0
            goto L_0x0175
        L_0x0174:
            r2 = 1
        L_0x0175:
            if (r2 == 0) goto L_0x018d
            boolean r1 = com.p280ss.android.ugc.aweme.p331m.C7163a.m22363a()     // Catch:{ all -> 0x039f }
            if (r1 == 0) goto L_0x039b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x039f }
            java.lang.String r2 = "empty title: "
            r1.<init>(r2)     // Catch:{ all -> 0x039f }
            java.lang.String r0 = r15.getAid()     // Catch:{ all -> 0x039f }
            r1.append(r0)     // Catch:{ all -> 0x039f }
            goto L_0x039b
        L_0x018d:
            r7.vast = r6     // Catch:{ all -> 0x039f }
            com.ss.android.ugc.aweme.profile.model.User r2 = r15.getAuthor()     // Catch:{ all -> 0x039f }
            if (r2 == 0) goto L_0x019a
            java.lang.String r2 = r2.getNickname()     // Catch:{ all -> 0x039f }
            goto L_0x019b
        L_0x019a:
            r2 = r1
        L_0x019b:
            r5 = r2
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5     // Catch:{ all -> 0x039f }
            if (r5 == 0) goto L_0x01a9
            boolean r5 = kotlin.text.C7634n.m23713a(r5)     // Catch:{ all -> 0x039f }
            if (r5 == 0) goto L_0x01a7
            goto L_0x01a9
        L_0x01a7:
            r5 = 0
            goto L_0x01aa
        L_0x01a9:
            r5 = 1
        L_0x01aa:
            if (r5 != 0) goto L_0x01ad
            goto L_0x01ae
        L_0x01ad:
            r2 = r1
        L_0x01ae:
            if (r2 != 0) goto L_0x01b2
            java.lang.String r2 = r6.adTitle     // Catch:{ all -> 0x039f }
        L_0x01b2:
            r6.adTitle = r2     // Catch:{ all -> 0x039f }
            java.lang.String r2 = r15.getDesc()     // Catch:{ all -> 0x039f }
            r5 = r2
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5     // Catch:{ all -> 0x039f }
            if (r5 == 0) goto L_0x01c6
            boolean r5 = kotlin.text.C7634n.m23713a(r5)     // Catch:{ all -> 0x039f }
            if (r5 == 0) goto L_0x01c4
            goto L_0x01c6
        L_0x01c4:
            r5 = 0
            goto L_0x01c7
        L_0x01c6:
            r5 = 1
        L_0x01c7:
            if (r5 != 0) goto L_0x01ca
            goto L_0x01cb
        L_0x01ca:
            r2 = r1
        L_0x01cb:
            if (r2 != 0) goto L_0x01d1
            com.bytedance.vast.model.Vast r2 = r7.vast     // Catch:{ all -> 0x039f }
            java.lang.String r2 = r2.description     // Catch:{ all -> 0x039f }
        L_0x01d1:
            r15.setDesc(r2)     // Catch:{ all -> 0x039f }
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r2 = r15.getAwemeRawAd()     // Catch:{ all -> 0x039f }
            if (r2 == 0) goto L_0x020a
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r5 = r15.getAwemeRawAd()     // Catch:{ all -> 0x039f }
            if (r5 == 0) goto L_0x01e5
            java.lang.String r5 = r5.getWebUrl()     // Catch:{ all -> 0x039f }
            goto L_0x01e6
        L_0x01e5:
            r5 = r1
        L_0x01e6:
            r8 = r5
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8     // Catch:{ all -> 0x039f }
            if (r8 == 0) goto L_0x01f4
            boolean r8 = kotlin.text.C7634n.m23713a(r8)     // Catch:{ all -> 0x039f }
            if (r8 == 0) goto L_0x01f2
            goto L_0x01f4
        L_0x01f2:
            r8 = 0
            goto L_0x01f5
        L_0x01f4:
            r8 = 1
        L_0x01f5:
            if (r8 != 0) goto L_0x01f8
            goto L_0x01f9
        L_0x01f8:
            r5 = r1
        L_0x01f9:
            if (r5 != 0) goto L_0x0207
            com.ss.android.ugc.aweme.commercialize.utils.by r5 = f66662a     // Catch:{ all -> 0x039f }
            com.bytedance.vast.model.VideoClick r5 = r5.mo65895k(r15)     // Catch:{ all -> 0x039f }
            if (r5 == 0) goto L_0x0206
            java.lang.String r5 = r5.clickThrough     // Catch:{ all -> 0x039f }
            goto L_0x0207
        L_0x0206:
            r5 = r1
        L_0x0207:
            r2.setWebUrl(r5)     // Catch:{ all -> 0x039f }
        L_0x020a:
            java.util.List<com.bytedance.vast.model.Creative> r2 = r6.creativeList     // Catch:{ all -> 0x039f }
            if (r2 == 0) goto L_0x039b
            java.lang.Iterable r2 = (java.lang.Iterable) r2     // Catch:{ all -> 0x039f }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x039f }
        L_0x0214:
            boolean r5 = r2.hasNext()     // Catch:{ all -> 0x039f }
            if (r5 == 0) goto L_0x022d
            java.lang.Object r5 = r2.next()     // Catch:{ all -> 0x039f }
            r6 = r5
            com.bytedance.vast.model.Creative r6 = (com.bytedance.vast.model.Creative) r6     // Catch:{ all -> 0x039f }
            if (r6 == 0) goto L_0x0229
            boolean r6 = r6.byWrapper     // Catch:{ all -> 0x039f }
            if (r6 != 0) goto L_0x0229
            r6 = 1
            goto L_0x022a
        L_0x0229:
            r6 = 0
        L_0x022a:
            if (r6 == 0) goto L_0x0214
            goto L_0x022e
        L_0x022d:
            r5 = r1
        L_0x022e:
            com.bytedance.vast.model.Creative r5 = (com.bytedance.vast.model.Creative) r5     // Catch:{ all -> 0x039f }
            if (r5 != 0) goto L_0x0234
            goto L_0x039b
        L_0x0234:
            com.ss.android.ugc.aweme.profile.model.User r2 = r15.getAuthor()     // Catch:{ all -> 0x039f }
            if (r2 == 0) goto L_0x0259
            com.ss.android.ugc.aweme.base.model.UrlModel r2 = r2.getAvatarThumb()     // Catch:{ all -> 0x039f }
            if (r2 == 0) goto L_0x0259
            java.util.List r2 = r2.getUrlList()     // Catch:{ all -> 0x039f }
            if (r2 == 0) goto L_0x0259
            java.lang.Iterable r2 = (java.lang.Iterable) r2     // Catch:{ all -> 0x039f }
            kotlin.sequences.g r2 = kotlin.collections.C7525m.m23526p(r2)     // Catch:{ all -> 0x039f }
            com.ss.android.ugc.aweme.commercialize.utils.by$e r6 = com.p280ss.android.ugc.aweme.commercialize.utils.C25301by.C25307e.f66684a     // Catch:{ all -> 0x039f }
            kotlin.jvm.a.b r6 = (kotlin.jvm.p357a.C7562b) r6     // Catch:{ all -> 0x039f }
            kotlin.sequences.g r2 = kotlin.sequences.C7605h.m23655b(r2, r6)     // Catch:{ all -> 0x039f }
            java.util.HashSet r2 = kotlin.sequences.C7605h.m23663g(r2)     // Catch:{ all -> 0x039f }
            goto L_0x025a
        L_0x0259:
            r2 = r1
        L_0x025a:
            com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy r6 = com.p280ss.android.ugc.aweme.global.config.settings.C30199h.m98861a()     // Catch:{ Throwable -> 0x0268 }
            java.lang.String r8 = "SettingsReader.get()"
            kotlin.jvm.internal.C7573i.m23582a(r6, r8)     // Catch:{ Throwable -> 0x0268 }
            java.lang.Boolean r6 = r6.getDisallowVastHasAuthor()     // Catch:{ Throwable -> 0x0268 }
            goto L_0x026c
        L_0x0268:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r4)     // Catch:{ all -> 0x039f }
        L_0x026c:
            java.lang.String r8 = "disallowVastHasAuthor"
            kotlin.jvm.internal.C7573i.m23582a(r6, r8)     // Catch:{ all -> 0x039f }
            boolean r6 = r6.booleanValue()     // Catch:{ all -> 0x039f }
            if (r6 == 0) goto L_0x027a
            r15.setAuthor(r1)     // Catch:{ all -> 0x039f }
        L_0x027a:
            com.bytedance.vast.model.Icon r6 = com.p280ss.android.ugc.aweme.commercialize.utils.C25300bx.m83131d(r15)     // Catch:{ all -> 0x039f }
            if (r6 == 0) goto L_0x029c
            r8 = r2
            java.util.Collection r8 = (java.util.Collection) r8     // Catch:{ all -> 0x039f }
            if (r8 == 0) goto L_0x028e
            boolean r8 = r8.isEmpty()     // Catch:{ all -> 0x039f }
            if (r8 == 0) goto L_0x028c
            goto L_0x028e
        L_0x028c:
            r8 = 0
            goto L_0x028f
        L_0x028e:
            r8 = 1
        L_0x028f:
            if (r8 != 0) goto L_0x0292
            goto L_0x0293
        L_0x0292:
            r2 = r1
        L_0x0293:
            if (r2 == 0) goto L_0x0298
            java.util.Set r2 = (java.util.Set) r2     // Catch:{ all -> 0x039f }
            goto L_0x029a
        L_0x0298:
            java.util.Set<java.lang.String> r2 = r6.staticResource     // Catch:{ all -> 0x039f }
        L_0x029a:
            r6.staticResource = r2     // Catch:{ all -> 0x039f }
        L_0x029c:
            com.ss.android.ugc.aweme.commercialize.model.NativeIcon r2 = r7.adChoiceIcon     // Catch:{ all -> 0x039f }
            if (r2 == 0) goto L_0x02a7
            java.lang.String r6 = "AdChoices"
            com.bytedance.vast.model.Icon r2 = r2.toIcon(r6)     // Catch:{ all -> 0x039f }
            goto L_0x02a8
        L_0x02a7:
            r2 = r1
        L_0x02a8:
            m83136a(r5, r15, r2)     // Catch:{ all -> 0x039f }
            long r8 = r5.getDurationInMs()     // Catch:{ all -> 0x039f }
            double r8 = (double) r8     // Catch:{ all -> 0x039f }
            java.util.List<com.bytedance.vast.model.MediaFile> r2 = r5.mediaFileList     // Catch:{ all -> 0x039f }
            if (r2 == 0) goto L_0x02cf
            java.lang.Iterable r2 = (java.lang.Iterable) r2     // Catch:{ all -> 0x039f }
            kotlin.sequences.g r2 = kotlin.collections.C7525m.m23526p(r2)     // Catch:{ all -> 0x039f }
            com.ss.android.ugc.aweme.commercialize.utils.by$f r6 = new com.ss.android.ugc.aweme.commercialize.utils.by$f     // Catch:{ all -> 0x039f }
            r6.<init>(r8)     // Catch:{ all -> 0x039f }
            kotlin.jvm.a.b r6 = (kotlin.jvm.p357a.C7562b) r6     // Catch:{ all -> 0x039f }
            kotlin.sequences.g r2 = kotlin.sequences.C7605h.m23659d(r2, r6)     // Catch:{ all -> 0x039f }
            kotlin.sequences.g r2 = kotlin.sequences.C7605h.m23662f(r2)     // Catch:{ all -> 0x039f }
            if (r2 == 0) goto L_0x02cf
            java.util.List r1 = kotlin.sequences.C7605h.m23664h(r2)     // Catch:{ all -> 0x039f }
        L_0x02cf:
            r2 = r1
            java.util.Collection r2 = (java.util.Collection) r2     // Catch:{ all -> 0x039f }
            if (r2 == 0) goto L_0x02dd
            boolean r2 = r2.isEmpty()     // Catch:{ all -> 0x039f }
            if (r2 == 0) goto L_0x02db
            goto L_0x02dd
        L_0x02db:
            r2 = 0
            goto L_0x02de
        L_0x02dd:
            r2 = 1
        L_0x02de:
            if (r2 != 0) goto L_0x039b
            com.ss.android.ugc.aweme.feed.model.Video r2 = r15.getVideo()     // Catch:{ all -> 0x039f }
            if (r2 != 0) goto L_0x02ee
            com.ss.android.ugc.aweme.feed.model.Video r2 = new com.ss.android.ugc.aweme.feed.model.Video     // Catch:{ all -> 0x039f }
            r2.<init>()     // Catch:{ all -> 0x039f }
            r15.setVideo(r2)     // Catch:{ all -> 0x039f }
        L_0x02ee:
            java.lang.Object r2 = r1.get(r4)     // Catch:{ all -> 0x039f }
            com.ss.android.ugc.aweme.feed.model.BitRate r2 = (com.p280ss.android.ugc.aweme.feed.model.BitRate) r2     // Catch:{ all -> 0x039f }
            com.ss.android.ugc.aweme.base.model.UrlModel r2 = r2.getPlayAddr()     // Catch:{ all -> 0x039f }
            com.ss.android.ugc.aweme.feed.model.Video r4 = r15.getVideo()     // Catch:{ all -> 0x039f }
            java.lang.String r6 = "aweme.video"
            kotlin.jvm.internal.C7573i.m23582a(r4, r6)     // Catch:{ all -> 0x039f }
            java.lang.String r6 = "url"
            kotlin.jvm.internal.C7573i.m23582a(r2, r6)     // Catch:{ all -> 0x039f }
            int r6 = r2.getWidth()     // Catch:{ all -> 0x039f }
            r4.setWidth(r6)     // Catch:{ all -> 0x039f }
            com.ss.android.ugc.aweme.feed.model.Video r4 = r15.getVideo()     // Catch:{ all -> 0x039f }
            java.lang.String r6 = "aweme.video"
            kotlin.jvm.internal.C7573i.m23582a(r4, r6)     // Catch:{ all -> 0x039f }
            int r6 = r2.getHeight()     // Catch:{ all -> 0x039f }
            r4.setHeight(r6)     // Catch:{ all -> 0x039f }
            com.ss.android.ugc.aweme.feed.model.Video r4 = r15.getVideo()     // Catch:{ all -> 0x039f }
            java.lang.String r6 = "aweme.video"
            kotlin.jvm.internal.C7573i.m23582a(r4, r6)     // Catch:{ all -> 0x039f }
            com.ss.android.ugc.aweme.feed.model.VideoUrlModel r6 = new com.ss.android.ugc.aweme.feed.model.VideoUrlModel     // Catch:{ all -> 0x039f }
            r6.<init>()     // Catch:{ all -> 0x039f }
            int r8 = r2.getWidth()     // Catch:{ all -> 0x039f }
            r6.setWidth(r8)     // Catch:{ all -> 0x039f }
            int r8 = r2.getHeight()     // Catch:{ all -> 0x039f }
            r6.setHeight(r8)     // Catch:{ all -> 0x039f }
            java.lang.String r8 = r2.getUri()     // Catch:{ all -> 0x039f }
            r6.setUri(r8)     // Catch:{ all -> 0x039f }
            java.lang.String r8 = r2.getUrlKey()     // Catch:{ all -> 0x039f }
            r6.setUrlKey(r8)     // Catch:{ all -> 0x039f }
            java.util.List r2 = r2.getUrlList()     // Catch:{ all -> 0x039f }
            r6.setUrlList(r2)     // Catch:{ all -> 0x039f }
            long r8 = r5.getDurationInMs()     // Catch:{ all -> 0x039f }
            double r8 = (double) r8     // Catch:{ all -> 0x039f }
            r6.setDuration(r8)     // Catch:{ all -> 0x039f }
            r4.setPlayAddr(r6)     // Catch:{ all -> 0x039f }
            com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy r2 = com.p280ss.android.ugc.aweme.global.config.settings.C30199h.m98861a()     // Catch:{ all -> 0x039f }
            java.lang.String r4 = "SettingsReader.get()"
            kotlin.jvm.internal.C7573i.m23582a(r2, r4)     // Catch:{ all -> 0x039f }
            java.lang.Boolean r2 = r2.getDisableVastBitrate()     // Catch:{ all -> 0x039f }
            boolean r2 = r2.booleanValue()     // Catch:{ all -> 0x039f }
            if (r2 != 0) goto L_0x0378
            com.ss.android.ugc.aweme.feed.model.Video r2 = r15.getVideo()     // Catch:{ all -> 0x039f }
            java.lang.String r4 = "aweme.video"
            kotlin.jvm.internal.C7573i.m23582a(r2, r4)     // Catch:{ all -> 0x039f }
            r2.setBitRate(r1)     // Catch:{ all -> 0x039f }
        L_0x0378:
            com.bytedance.vast.model.Vast r1 = r7.vast     // Catch:{ all -> 0x039f }
            java.lang.String r1 = r1.adTitle     // Catch:{ all -> 0x039f }
            r15.setTitle(r1)     // Catch:{ all -> 0x039f }
            r7.loaded = r3     // Catch:{ all -> 0x039f }
            com.ss.android.ugc.aweme.commercialize.utils.by r1 = f66662a     // Catch:{ all -> 0x039f }
            r1.mo65894b(r15)     // Catch:{ all -> 0x039f }
            goto L_0x039b
        L_0x0387:
            boolean r1 = com.p280ss.android.ugc.aweme.p331m.C7163a.m22363a()     // Catch:{ all -> 0x039f }
            if (r1 == 0) goto L_0x039b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x039f }
            java.lang.String r2 = "parse content failed: "
            r1.<init>(r2)     // Catch:{ all -> 0x039f }
            java.lang.String r0 = r15.getAid()     // Catch:{ all -> 0x039f }
            r1.append(r0)     // Catch:{ all -> 0x039f }
        L_0x039b:
            r17.run()
            goto L_0x03ba
        L_0x039f:
            r0 = move-exception
            r17.run()
            throw r0
        L_0x03a4:
            com.ss.android.ugc.aweme.commercialize.utils.by$d r12 = new com.ss.android.ugc.aweme.commercialize.utils.by$d
            r1 = r12
            r2 = r17
            r3 = r15
            r4 = r10
            r1.<init>(r2, r3, r4, r6, r7, r8)
            java.lang.Runnable r12 = (java.lang.Runnable) r12
            r9.execute(r12)
            return
        L_0x03b4:
            r14.mo65894b(r15)
            r17.run()
        L_0x03ba:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.commercialize.utils.C25301by.m83152b(com.ss.android.ugc.aweme.feed.model.Aweme, java.util.concurrent.Executor, java.lang.Runnable, boolean):void");
    }

    /* renamed from: a */
    static /* synthetic */ void m83138a(C25301by byVar, String str, String str2, long j, String str3, Aweme aweme, AwemeRawAd awemeRawAd, int i, Object obj) {
        Aweme aweme2;
        AwemeRawAd awemeRawAd2;
        if ((i & 16) != 0) {
            aweme2 = null;
        } else {
            aweme2 = aweme;
        }
        if ((i & 32) != 0) {
            awemeRawAd2 = null;
        } else {
            awemeRawAd2 = awemeRawAd;
        }
        m83147a(str, str2, j, str3, aweme2, awemeRawAd2);
    }
}
