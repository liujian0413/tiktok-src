package com.p280ss.android.ugc.aweme.ttuploader;

import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.ttuploader.model.C42648a;
import com.p280ss.android.ugc.aweme.ttuploader.model.C42649b;
import com.p280ss.ttuploader.TTImageInfo;
import com.p280ss.ttuploader.TTImageUploader;
import com.p280ss.ttuploader.TTImageUploaderListener;
import kotlin.C7581n;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.p357a.C7562b;
import kotlin.reflect.C7585d;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.ss.android.ugc.aweme.ttuploader.e */
public final class C42636e {

    /* renamed from: b */
    public static final C42636e f110806b = C42639c.m135456a();

    /* renamed from: c */
    public static final C42637a f110807c = new C42637a(null);

    /* renamed from: a */
    public int f110808a;

    /* renamed from: com.ss.android.ugc.aweme.ttuploader.e$a */
    public static final class C42637a {
        private C42637a() {
        }

        public /* synthetic */ C42637a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ttuploader.e$b */
    public interface C42638b extends C42640d {
        /* renamed from: a */
        void mo91620a(UrlModel urlModel);
    }

    /* renamed from: com.ss.android.ugc.aweme.ttuploader.e$c */
    static final class C42639c {

        /* renamed from: a */
        public static final C42639c f110809a = new C42639c();

        /* renamed from: b */
        private static final C42636e f110810b = new C42636e();

        private C42639c() {
        }

        /* renamed from: a */
        public static C42636e m135456a() {
            return f110810b;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ttuploader.e$d */
    public interface C42640d {
        /* renamed from: a */
        void mo91621a(String str);
    }

    /* renamed from: com.ss.android.ugc.aweme.ttuploader.e$e */
    static final class C42641e<T> implements C7326g<C42648a> {

        /* renamed from: a */
        final /* synthetic */ C42636e f110811a;

        /* renamed from: b */
        final /* synthetic */ String f110812b;

        /* renamed from: c */
        final /* synthetic */ int f110813c;

        /* renamed from: d */
        final /* synthetic */ C42638b f110814d;

        C42641e(C42636e eVar, String str, int i, C42638b bVar) {
            this.f110811a = eVar;
            this.f110812b = str;
            this.f110813c = i;
            this.f110814d = bVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(C42648a aVar) {
            C42649b bVar;
            C42636e eVar = this.f110811a;
            String str = this.f110812b;
            int i = this.f110813c;
            C42638b bVar2 = this.f110814d;
            if (aVar != null) {
                bVar = aVar.f110827b;
            } else {
                bVar = null;
            }
            eVar.mo104250a(str, i, bVar2, bVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ttuploader.e$f */
    static final /* synthetic */ class C42642f extends FunctionReference implements C7562b<Throwable, C7581n> {

        /* renamed from: a */
        public static final C42642f f110815a = new C42642f();

        C42642f() {
            super(1);
        }

        public final String getName() {
            return "logException";
        }

        public final C7585d getOwner() {
            return C7575l.m23595a(C6921a.class);
        }

        public final String getSignature() {
            return "logException(Ljava/lang/Throwable;)V";
        }

        /* renamed from: a */
        private static void m135459a(Throwable th) {
            C6921a.m21559a(th);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m135459a((Throwable) obj);
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ttuploader.e$g */
    static final class C42643g implements TTImageUploaderListener {

        /* renamed from: a */
        final /* synthetic */ C42636e f110816a;

        /* renamed from: b */
        final /* synthetic */ TTImageUploader f110817b;

        /* renamed from: c */
        final /* synthetic */ C42638b f110818c;

        /* renamed from: d */
        final /* synthetic */ String f110819d;

        /* renamed from: e */
        final /* synthetic */ int f110820e;

        C42643g(C42636e eVar, TTImageUploader tTImageUploader, C42638b bVar, String str, int i) {
            this.f110816a = eVar;
            this.f110817b = tTImageUploader;
            this.f110818c = bVar;
            this.f110819d = str;
            this.f110820e = i;
        }

        public final void onNotify(int i, long j, TTImageInfo tTImageInfo) {
            String str;
            switch (i) {
                case 3:
                    this.f110817b.close();
                    UrlModel urlModel = new UrlModel();
                    C42632b bVar = C42632b.f110799a;
                    if (tTImageInfo != null) {
                        str = tTImageInfo.mImageToskey;
                    } else {
                        str = null;
                    }
                    C42633c a = bVar.mo104246a(str);
                    urlModel.setUri(a.mo104247a());
                    urlModel.setUrlList(a.mo104249c());
                    C42638b bVar2 = this.f110818c;
                    if (bVar2 != null) {
                        bVar2.mo91620a(urlModel);
                        break;
                    } else {
                        return;
                    }
                case 4:
                    this.f110817b.close();
                    long j2 = tTImageInfo.mErrcode;
                    if ((j2 == 10401 || j2 == 10402 || j2 == 10403 || j2 == 10408) && this.f110816a.f110808a < 2) {
                        this.f110816a.f110808a++;
                        this.f110816a.mo104251a(this.f110819d, this.f110820e, true, this.f110818c);
                        return;
                    }
                    C42638b bVar3 = this.f110818c;
                    if (bVar3 != null) {
                        bVar3.mo91621a(String.valueOf(j2));
                        return;
                    }
                    break;
            }
        }
    }

    /* renamed from: a */
    public static final C42636e m135451a() {
        return f110806b;
    }

    /* renamed from: a */
    private final TTImageUploader m135452a(C42649b bVar) {
        if (bVar == null) {
            return null;
        }
        try {
            this.f110808a = 0;
            TTImageUploader tTImageUploader = new TTImageUploader();
            tTImageUploader.setImageUploadDomain(bVar.f110830c);
            tTImageUploader.setFileUploadDomain(bVar.f110829b);
            tTImageUploader.setFileRetryCount(bVar.f110831d);
            tTImageUploader.setSliceSize(bVar.f110833f);
            tTImageUploader.setSliceReTryCount(bVar.f110835h);
            tTImageUploader.setUserKey(bVar.f110828a);
            tTImageUploader.setSliceTimeout(bVar.f110834g);
            tTImageUploader.setAuthorization(bVar.f110836i);
            return tTImageUploader;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x005d, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0063, code lost:
        throw r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x006e, code lost:
        if (r10 != null) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0070, code lost:
        r10.mo91621a("100");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0075, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0076, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:3:0x0006, B:27:0x0059] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo104250a(java.lang.String r8, int r9, com.p280ss.android.ugc.aweme.ttuploader.C42636e.C42638b r10, com.p280ss.android.ugc.aweme.ttuploader.model.C42649b r11) {
        /*
            r7 = this;
            if (r11 != 0) goto L_0x000b
            if (r10 == 0) goto L_0x000a
            java.lang.String r8 = "97"
            r10.mo91621a(r8)     // Catch:{ Exception -> 0x006d }
            return
        L_0x000a:
            return
        L_0x000b:
            r0 = r8
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0     // Catch:{ Exception -> 0x006d }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x006d }
            if (r0 == 0) goto L_0x001d
            if (r10 == 0) goto L_0x001c
            java.lang.String r8 = "96"
            r10.mo91621a(r8)     // Catch:{ Exception -> 0x006d }
            return
        L_0x001c:
            return
        L_0x001d:
            java.io.File r0 = new java.io.File     // Catch:{ Exception -> 0x006d }
            r0.<init>(r8)     // Catch:{ Exception -> 0x006d }
            boolean r1 = r0.exists()     // Catch:{ Exception -> 0x006d }
            if (r1 == 0) goto L_0x0064
            boolean r0 = r0.isFile()     // Catch:{ Exception -> 0x006d }
            if (r0 != 0) goto L_0x002f
            goto L_0x0064
        L_0x002f:
            com.ss.ttuploader.TTImageUploader r11 = r7.m135452a(r11)     // Catch:{ Exception -> 0x006d }
            if (r11 != 0) goto L_0x003e
            if (r10 == 0) goto L_0x003d
            java.lang.String r8 = "98"
            r10.mo91621a(r8)     // Catch:{ Exception -> 0x006d }
            return
        L_0x003d:
            return
        L_0x003e:
            com.ss.android.ugc.aweme.ttuploader.e$g r0 = new com.ss.android.ugc.aweme.ttuploader.e$g     // Catch:{ Exception -> 0x006d }
            r1 = r0
            r2 = r7
            r3 = r11
            r4 = r10
            r5 = r8
            r6 = r9
            r1.<init>(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x006d }
            com.ss.ttuploader.TTImageUploaderListener r0 = (com.p280ss.ttuploader.TTImageUploaderListener) r0     // Catch:{ Exception -> 0x006d }
            r11.setListener(r0)     // Catch:{ Exception -> 0x006d }
            if (r8 == 0) goto L_0x0059
            r9 = 1
            java.lang.String[] r0 = new java.lang.String[r9]     // Catch:{ Exception -> 0x006d }
            r1 = 0
            r0[r1] = r8     // Catch:{ Exception -> 0x006d }
            r11.setFilePath(r9, r0)     // Catch:{ Exception -> 0x006d }
        L_0x0059:
            r11.start()     // Catch:{ Exception -> 0x005d }
            return
        L_0x005d:
            r8 = move-exception
            r11.close()     // Catch:{ Exception -> 0x006d }
            java.lang.Throwable r8 = (java.lang.Throwable) r8     // Catch:{ Exception -> 0x006d }
            throw r8     // Catch:{ Exception -> 0x006d }
        L_0x0064:
            if (r10 == 0) goto L_0x006c
            java.lang.String r8 = "95"
            r10.mo91621a(r8)     // Catch:{ Exception -> 0x006d }
            return
        L_0x006c:
            return
        L_0x006d:
            if (r10 == 0) goto L_0x0076
            java.lang.String r8 = "100"
            r10.mo91621a(r8)
            return
        L_0x0076:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.ttuploader.C42636e.mo104250a(java.lang.String, int, com.ss.android.ugc.aweme.ttuploader.e$b, com.ss.android.ugc.aweme.ttuploader.model.b):void");
    }

    /* JADX WARNING: type inference failed for: r3v3 */
    /* JADX WARNING: type inference failed for: r4v1, types: [com.ss.android.ugc.aweme.ttuploader.f] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo104251a(java.lang.String r3, int r4, boolean r5, com.p280ss.android.ugc.aweme.ttuploader.C42636e.C42638b r6) {
        /*
            r2 = this;
            com.ss.android.ugc.aweme.ttuploader.g r0 = new com.ss.android.ugc.aweme.ttuploader.g
            com.ss.android.ugc.aweme.ttuploader.a r1 = new com.ss.android.ugc.aweme.ttuploader.a
            r1.<init>(r4)
            r0.<init>(r1)
            io.reactivex.s r5 = r0.mo104252a(r5)
            com.ss.android.ugc.aweme.ttuploader.e$e r0 = new com.ss.android.ugc.aweme.ttuploader.e$e
            r0.<init>(r2, r3, r4, r6)
            io.reactivex.d.g r0 = (p346io.reactivex.p348d.C7326g) r0
            com.ss.android.ugc.aweme.ttuploader.e$f r3 = com.p280ss.android.ugc.aweme.ttuploader.C42636e.C42642f.f110815a
            kotlin.jvm.a.b r3 = (kotlin.jvm.p357a.C7562b) r3
            if (r3 == 0) goto L_0x0021
            com.ss.android.ugc.aweme.ttuploader.f r4 = new com.ss.android.ugc.aweme.ttuploader.f
            r4.<init>(r3)
            r3 = r4
        L_0x0021:
            io.reactivex.d.g r3 = (p346io.reactivex.p348d.C7326g) r3
            r5.mo19280a(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.ttuploader.C42636e.mo104251a(java.lang.String, int, boolean, com.ss.android.ugc.aweme.ttuploader.e$b):void");
    }
}
