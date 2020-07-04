package com.linecorp.linesdk.auth.internal;

import android.net.Uri;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.linecorp.linesdk.C18565a;
import com.linecorp.linesdk.LineAccessToken;
import com.linecorp.linesdk.LineApiError;
import com.linecorp.linesdk.LineApiResponseCode;
import com.linecorp.linesdk.LineCredential;
import com.linecorp.linesdk.LineProfile;
import com.linecorp.linesdk.auth.LineAuthenticationConfig;
import com.linecorp.linesdk.auth.LineLoginResult;
import com.linecorp.linesdk.p801a.C18566a;
import com.linecorp.linesdk.p801a.C18586e;
import com.linecorp.linesdk.p801a.C18587f;
import com.linecorp.linesdk.p801a.C18588g;
import com.linecorp.linesdk.p801a.p802a.C18574b;
import com.linecorp.linesdk.p801a.p802a.C18580d;
import java.util.Collections;
import java.util.HashMap;

/* renamed from: com.linecorp.linesdk.auth.internal.c */
final class C18598c {

    /* renamed from: a */
    final LineAuthenticationActivity f50268a;

    /* renamed from: b */
    final LineAuthenticationConfig f50269b;

    /* renamed from: c */
    final C18574b f50270c;

    /* renamed from: d */
    final C18580d f50271d;

    /* renamed from: e */
    final C18593a f50272e;

    /* renamed from: f */
    final C18566a f50273f;

    /* renamed from: g */
    final String[] f50274g;

    /* renamed from: h */
    final C18602d f50275h;

    /* renamed from: com.linecorp.linesdk.auth.internal.c$a */
    class C18599a extends AsyncTask<String, Void, LineLoginResult> {
        private C18599a() {
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ void onPostExecute(Object obj) {
            LineLoginResult lineLoginResult = (LineLoginResult) obj;
            C18598c.this.f50275h.f50282d = C18604a.f50286d;
            C18598c.this.f50268a.mo48766a(lineLoginResult);
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ Object doInBackground(Object[] objArr) {
            String str;
            String[] strArr = (String[]) objArr;
            if (strArr == null || strArr.length != 1) {
                str = null;
            } else {
                str = strArr[0];
            }
            C18588g gVar = C18598c.this.f50275h.f50279a;
            String str2 = C18598c.this.f50275h.f50280b;
            if (TextUtils.isEmpty(str) || gVar == null || TextUtils.isEmpty(str2)) {
                return new LineLoginResult(LineApiResponseCode.INTERNAL_ERROR, new LineApiError("Requested data is missing."));
            }
            C18574b bVar = C18598c.this.f50270c;
            String str3 = C18598c.this.f50269b.f50234a;
            Uri build = bVar.f50209f.buildUpon().appendPath("oauth").appendPath("accessToken").build();
            HashMap hashMap = new HashMap(5);
            hashMap.put("grant_type", "authorization_code");
            hashMap.put("code", str);
            hashMap.put("redirect_uri", str2);
            hashMap.put("client_id", str3);
            hashMap.put("otp", gVar.f50228b);
            C18565a a = bVar.f50210g.mo48731a(build, Collections.emptyMap(), hashMap, C18574b.f50205b);
            if (!a.mo48723a()) {
                return C18598c.m61030a(a);
            }
            C18587f fVar = (C18587f) a.mo48724b();
            C18586e eVar = fVar.f50225a;
            C18565a a2 = C18598c.this.f50271d.mo48736a(eVar);
            if (!a2.mo48723a()) {
                return C18598c.m61030a(a2);
            }
            C18598c.this.f50273f.mo48728a(eVar);
            LineProfile lineProfile = (LineProfile) a2.mo48724b();
            LineAccessToken lineAccessToken = new LineAccessToken(eVar.f50221a, eVar.f50222b, eVar.f50223c);
            return new LineLoginResult(lineProfile, new LineCredential(lineAccessToken, fVar.f50226b));
        }

        /* synthetic */ C18599a(C18598c cVar, byte b) {
            this();
        }
    }

    /* renamed from: com.linecorp.linesdk.auth.internal.c$b */
    class C18600b implements Runnable {
        public final void run() {
            if (C18598c.this.f50275h.f50282d != C18604a.f50285c && !C18598c.this.f50268a.isFinishing()) {
                C18598c.this.f50268a.mo48766a(LineLoginResult.f50244a);
            }
        }

        private C18600b() {
        }

        /* synthetic */ C18600b(C18598c cVar, byte b) {
            this();
        }
    }

    /* renamed from: com.linecorp.linesdk.auth.internal.c$c */
    class C18601c extends AsyncTask<Void, Void, C18565a<C18588g>> {
        private C18601c() {
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ Object doInBackground(Object[] objArr) {
            C18574b bVar = C18598c.this.f50270c;
            String str = C18598c.this.f50269b.f50234a;
            Uri build = bVar.f50209f.buildUpon().appendPath("oauth").appendPath("otp").build();
            HashMap hashMap = new HashMap(1);
            hashMap.put("client_id", str);
            return bVar.f50210g.mo48731a(build, Collections.emptyMap(), hashMap, C18574b.f50204a);
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x0106, code lost:
            if (r9.f50265a >= r2.f50265a) goto L_0x0108;
         */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x0121 A[Catch:{ ActivityNotFoundException -> 0x01e9 }] */
        /* JADX WARNING: Removed duplicated region for block: B:46:0x0126 A[Catch:{ ActivityNotFoundException -> 0x01e9 }] */
        /* JADX WARNING: Removed duplicated region for block: B:47:0x013b A[Catch:{ ActivityNotFoundException -> 0x01e9 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void onPostExecute(java.lang.Object r13) {
            /*
                r12 = this;
                com.linecorp.linesdk.a r13 = (com.linecorp.linesdk.C18565a) r13
                boolean r0 = r13.mo48723a()
                if (r0 != 0) goto L_0x001c
                com.linecorp.linesdk.auth.internal.c r0 = com.linecorp.linesdk.auth.internal.C18598c.this
                com.linecorp.linesdk.auth.internal.d r0 = r0.f50275h
                int r1 = com.linecorp.linesdk.auth.internal.C18602d.C18604a.f50286d
                r0.f50282d = r1
                com.linecorp.linesdk.auth.internal.c r0 = com.linecorp.linesdk.auth.internal.C18598c.this
                com.linecorp.linesdk.auth.internal.LineAuthenticationActivity r0 = r0.f50268a
                com.linecorp.linesdk.auth.LineLoginResult r13 = com.linecorp.linesdk.auth.internal.C18598c.m61030a(r13)
                r0.mo48766a(r13)
                return
            L_0x001c:
                java.lang.Object r13 = r13.mo48724b()
                com.linecorp.linesdk.a.g r13 = (com.linecorp.linesdk.p801a.C18588g) r13
                com.linecorp.linesdk.auth.internal.c r0 = com.linecorp.linesdk.auth.internal.C18598c.this
                com.linecorp.linesdk.auth.internal.d r0 = r0.f50275h
                r0.f50279a = r13
                com.linecorp.linesdk.auth.internal.c r0 = com.linecorp.linesdk.auth.internal.C18598c.this     // Catch:{ ActivityNotFoundException -> 0x01e9 }
                com.linecorp.linesdk.auth.internal.a r0 = r0.f50272e     // Catch:{ ActivityNotFoundException -> 0x01e9 }
                com.linecorp.linesdk.auth.internal.c r1 = com.linecorp.linesdk.auth.internal.C18598c.this     // Catch:{ ActivityNotFoundException -> 0x01e9 }
                com.linecorp.linesdk.auth.internal.LineAuthenticationActivity r1 = r1.f50268a     // Catch:{ ActivityNotFoundException -> 0x01e9 }
                com.linecorp.linesdk.auth.internal.c r2 = com.linecorp.linesdk.auth.internal.C18598c.this     // Catch:{ ActivityNotFoundException -> 0x01e9 }
                com.linecorp.linesdk.auth.LineAuthenticationConfig r2 = r2.f50269b     // Catch:{ ActivityNotFoundException -> 0x01e9 }
                com.linecorp.linesdk.auth.internal.c r3 = com.linecorp.linesdk.auth.internal.C18598c.this     // Catch:{ ActivityNotFoundException -> 0x01e9 }
                java.lang.String[] r3 = r3.f50274g     // Catch:{ ActivityNotFoundException -> 0x01e9 }
                r4 = 8
                byte[] r5 = new byte[r4]     // Catch:{ ActivityNotFoundException -> 0x01e9 }
                java.security.SecureRandom r6 = new java.security.SecureRandom     // Catch:{ ActivityNotFoundException -> 0x01e9 }
                r6.<init>()     // Catch:{ ActivityNotFoundException -> 0x01e9 }
                long r6 = r6.nextLong()     // Catch:{ ActivityNotFoundException -> 0x01e9 }
                r8 = 0
                r9 = r6
                r6 = 0
            L_0x0048:
                if (r6 >= r4) goto L_0x0052
                int r7 = (int) r9     // Catch:{ ActivityNotFoundException -> 0x01e9 }
                byte r7 = (byte) r7     // Catch:{ ActivityNotFoundException -> 0x01e9 }
                r5[r6] = r7     // Catch:{ ActivityNotFoundException -> 0x01e9 }
                long r9 = r9 >> r4
                int r6 = r6 + 1
                goto L_0x0048
            L_0x0052:
                r4 = 11
                java.lang.String r4 = android.util.Base64.encodeToString(r5, r4)     // Catch:{ ActivityNotFoundException -> 0x01e9 }
                com.linecorp.linesdk.auth.internal.d r0 = r0.f50253b     // Catch:{ ActivityNotFoundException -> 0x01e9 }
                r0.f50281c = r4     // Catch:{ ActivityNotFoundException -> 0x01e9 }
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ ActivityNotFoundException -> 0x01e9 }
                java.lang.String r5 = "intent://result#Intent;package="
                r0.<init>(r5)     // Catch:{ ActivityNotFoundException -> 0x01e9 }
                java.lang.String r5 = r1.getPackageName()     // Catch:{ ActivityNotFoundException -> 0x01e9 }
                r0.append(r5)     // Catch:{ ActivityNotFoundException -> 0x01e9 }
                java.lang.String r5 = ";scheme=lineauth;end"
                r0.append(r5)     // Catch:{ ActivityNotFoundException -> 0x01e9 }
                java.lang.String r0 = r0.toString()     // Catch:{ ActivityNotFoundException -> 0x01e9 }
                android.net.Uri r5 = r2.f50236c     // Catch:{ ActivityNotFoundException -> 0x01e9 }
                android.net.Uri$Builder r5 = r5.buildUpon()     // Catch:{ ActivityNotFoundException -> 0x01e9 }
                java.lang.String r6 = "response_type"
                java.lang.String r7 = "code"
                android.net.Uri$Builder r5 = r5.appendQueryParameter(r6, r7)     // Catch:{ ActivityNotFoundException -> 0x01e9 }
                java.lang.String r6 = "client_id"
                java.lang.String r7 = r2.f50234a     // Catch:{ ActivityNotFoundException -> 0x01e9 }
                android.net.Uri$Builder r5 = r5.appendQueryParameter(r6, r7)     // Catch:{ ActivityNotFoundException -> 0x01e9 }
                java.lang.String r6 = "state"
                android.net.Uri$Builder r4 = r5.appendQueryParameter(r6, r4)     // Catch:{ ActivityNotFoundException -> 0x01e9 }
                java.lang.String r5 = "otpId"
                java.lang.String r13 = r13.f50227a     // Catch:{ ActivityNotFoundException -> 0x01e9 }
                android.net.Uri$Builder r13 = r4.appendQueryParameter(r5, r13)     // Catch:{ ActivityNotFoundException -> 0x01e9 }
                java.lang.String r4 = "redirect_uri"
                android.net.Uri$Builder r13 = r13.appendQueryParameter(r4, r0)     // Catch:{ ActivityNotFoundException -> 0x01e9 }
                if (r3 == 0) goto L_0x00ad
                int r4 = r3.length     // Catch:{ ActivityNotFoundException -> 0x01e9 }
                if (r4 <= 0) goto L_0x00ad
                java.lang.String r4 = "scope"
                java.lang.String r5 = " "
                java.lang.String r3 = android.text.TextUtils.join(r5, r3)     // Catch:{ ActivityNotFoundException -> 0x01e9 }
                r13.appendQueryParameter(r4, r3)     // Catch:{ ActivityNotFoundException -> 0x01e9 }
            L_0x00ad:
                android.net.Uri r13 = r13.build()     // Catch:{ ActivityNotFoundException -> 0x01e9 }
                boolean r2 = r2.f50237d     // Catch:{ ActivityNotFoundException -> 0x01e9 }
                int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ ActivityNotFoundException -> 0x01e9 }
                r4 = 16
                r5 = 1
                if (r3 < r4) goto L_0x00bc
                r3 = 1
                goto L_0x00bd
            L_0x00bc:
                r3 = 0
            L_0x00bd:
                r6 = 0
                if (r3 == 0) goto L_0x00dd
                android.support.customtabs.c$a r3 = new android.support.customtabs.c$a     // Catch:{ ActivityNotFoundException -> 0x01e9 }
                r3.<init>()     // Catch:{ ActivityNotFoundException -> 0x01e9 }
                r7 = 17170443(0x106000b, float:2.4611944E-38)
                int r7 = android.support.p022v4.content.C0683b.m2912c(r1, r7)     // Catch:{ ActivityNotFoundException -> 0x01e9 }
                android.support.customtabs.c$a r3 = r3.mo647a(r7)     // Catch:{ ActivityNotFoundException -> 0x01e9 }
                android.support.customtabs.c r3 = r3.mo648a()     // Catch:{ ActivityNotFoundException -> 0x01e9 }
                android.content.Intent r7 = r3.f855a     // Catch:{ ActivityNotFoundException -> 0x01e9 }
                android.content.Intent r7 = r7.setData(r13)     // Catch:{ ActivityNotFoundException -> 0x01e9 }
                android.os.Bundle r3 = r3.f856b     // Catch:{ ActivityNotFoundException -> 0x01e9 }
                goto L_0x00e9
            L_0x00dd:
                android.content.Intent r3 = new android.content.Intent     // Catch:{ ActivityNotFoundException -> 0x01e9 }
                java.lang.String r7 = "android.intent.action.VIEW"
                r3.<init>(r7)     // Catch:{ ActivityNotFoundException -> 0x01e9 }
                android.content.Intent r7 = r3.setData(r13)     // Catch:{ ActivityNotFoundException -> 0x01e9 }
                r3 = r6
            L_0x00e9:
                com.linecorp.linesdk.auth.internal.b r9 = com.linecorp.linesdk.auth.internal.C18597b.m61029a(r1)     // Catch:{ ActivityNotFoundException -> 0x01e9 }
                if (r9 != 0) goto L_0x00f6
                com.linecorp.linesdk.auth.internal.a$a r13 = new com.linecorp.linesdk.auth.internal.a$a     // Catch:{ ActivityNotFoundException -> 0x01e9 }
                r13.<init>(r7, r3, r8)     // Catch:{ ActivityNotFoundException -> 0x01e9 }
                goto L_0x018d
            L_0x00f6:
                if (r2 != 0) goto L_0x0123
                com.linecorp.linesdk.auth.internal.b r2 = com.linecorp.linesdk.auth.internal.C18593a.f50252a     // Catch:{ ActivityNotFoundException -> 0x01e9 }
                if (r2 == 0) goto L_0x011e
                int r10 = r9.f50265a     // Catch:{ ActivityNotFoundException -> 0x01e9 }
                int r11 = r2.f50265a     // Catch:{ ActivityNotFoundException -> 0x01e9 }
                if (r10 == r11) goto L_0x010a
                int r9 = r9.f50265a     // Catch:{ ActivityNotFoundException -> 0x01e9 }
                int r2 = r2.f50265a     // Catch:{ ActivityNotFoundException -> 0x01e9 }
                if (r9 < r2) goto L_0x011e
            L_0x0108:
                r2 = 1
                goto L_0x011f
            L_0x010a:
                int r10 = r9.f50266b     // Catch:{ ActivityNotFoundException -> 0x01e9 }
                int r11 = r2.f50266b     // Catch:{ ActivityNotFoundException -> 0x01e9 }
                if (r10 == r11) goto L_0x0117
                int r9 = r9.f50266b     // Catch:{ ActivityNotFoundException -> 0x01e9 }
                int r2 = r2.f50266b     // Catch:{ ActivityNotFoundException -> 0x01e9 }
                if (r9 < r2) goto L_0x011e
                goto L_0x0108
            L_0x0117:
                int r9 = r9.f50267c     // Catch:{ ActivityNotFoundException -> 0x01e9 }
                int r2 = r2.f50267c     // Catch:{ ActivityNotFoundException -> 0x01e9 }
                if (r9 < r2) goto L_0x011e
                goto L_0x0108
            L_0x011e:
                r2 = 0
            L_0x011f:
                if (r2 == 0) goto L_0x0123
                r2 = 1
                goto L_0x0124
            L_0x0123:
                r2 = 0
            L_0x0124:
                if (r2 == 0) goto L_0x013b
                android.content.Intent r1 = new android.content.Intent     // Catch:{ ActivityNotFoundException -> 0x01e9 }
                java.lang.String r2 = "android.intent.action.VIEW"
                r1.<init>(r2)     // Catch:{ ActivityNotFoundException -> 0x01e9 }
                r1.setData(r13)     // Catch:{ ActivityNotFoundException -> 0x01e9 }
                java.lang.String r13 = "jp.naver.line.android"
                r1.setPackage(r13)     // Catch:{ ActivityNotFoundException -> 0x01e9 }
                com.linecorp.linesdk.auth.internal.a$a r13 = new com.linecorp.linesdk.auth.internal.a$a     // Catch:{ ActivityNotFoundException -> 0x01e9 }
                r13.<init>(r1, r3, r5)     // Catch:{ ActivityNotFoundException -> 0x01e9 }
                goto L_0x018d
            L_0x013b:
                android.content.Intent r2 = new android.content.Intent     // Catch:{ ActivityNotFoundException -> 0x01e9 }
                java.lang.String r9 = "android.intent.action.VIEW"
                java.lang.String r10 = "http://"
                android.net.Uri r10 = android.net.Uri.parse(r10)     // Catch:{ ActivityNotFoundException -> 0x01e9 }
                r2.<init>(r9, r10)     // Catch:{ ActivityNotFoundException -> 0x01e9 }
                android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch:{ ActivityNotFoundException -> 0x01e9 }
                java.util.List r1 = r1.queryIntentActivities(r2, r8)     // Catch:{ ActivityNotFoundException -> 0x01e9 }
                android.os.Bundle r2 = r7.getExtras()     // Catch:{ ActivityNotFoundException -> 0x01e9 }
                java.util.List r1 = com.linecorp.linesdk.auth.internal.C18593a.m61024a(r13, r1, r2)     // Catch:{ ActivityNotFoundException -> 0x01e9 }
                int r2 = r1.size()     // Catch:{ ActivityNotFoundException -> 0x01e9 }
                if (r2 == 0) goto L_0x01d9
                if (r2 != r5) goto L_0x016c
                com.linecorp.linesdk.auth.internal.a$a r13 = new com.linecorp.linesdk.auth.internal.a$a     // Catch:{ ActivityNotFoundException -> 0x01e9 }
                java.lang.Object r1 = r1.get(r8)     // Catch:{ ActivityNotFoundException -> 0x01e9 }
                android.content.Intent r1 = (android.content.Intent) r1     // Catch:{ ActivityNotFoundException -> 0x01e9 }
                r13.<init>(r1, r3, r8)     // Catch:{ ActivityNotFoundException -> 0x01e9 }
                goto L_0x018d
            L_0x016c:
                java.lang.Object r13 = r1.remove(r8)     // Catch:{ ActivityNotFoundException -> 0x01e9 }
                android.content.Intent r13 = (android.content.Intent) r13     // Catch:{ ActivityNotFoundException -> 0x01e9 }
                android.content.Intent r13 = android.content.Intent.createChooser(r13, r6)     // Catch:{ ActivityNotFoundException -> 0x01e9 }
                java.lang.String r2 = "android.intent.extra.INITIAL_INTENTS"
                int r5 = r1.size()     // Catch:{ ActivityNotFoundException -> 0x01e9 }
                android.os.Parcelable[] r5 = new android.os.Parcelable[r5]     // Catch:{ ActivityNotFoundException -> 0x01e9 }
                java.lang.Object[] r1 = r1.toArray(r5)     // Catch:{ ActivityNotFoundException -> 0x01e9 }
                android.os.Parcelable[] r1 = (android.os.Parcelable[]) r1     // Catch:{ ActivityNotFoundException -> 0x01e9 }
                r13.putExtra(r2, r1)     // Catch:{ ActivityNotFoundException -> 0x01e9 }
                com.linecorp.linesdk.auth.internal.a$a r1 = new com.linecorp.linesdk.auth.internal.a$a     // Catch:{ ActivityNotFoundException -> 0x01e9 }
                r1.<init>(r13, r3, r8)     // Catch:{ ActivityNotFoundException -> 0x01e9 }
                r13 = r1
            L_0x018d:
                com.linecorp.linesdk.auth.internal.a$b r1 = new com.linecorp.linesdk.auth.internal.a$b     // Catch:{ ActivityNotFoundException -> 0x01e9 }
                android.content.Intent r2 = r13.f50254a     // Catch:{ ActivityNotFoundException -> 0x01e9 }
                android.os.Bundle r3 = r13.f50255b     // Catch:{ ActivityNotFoundException -> 0x01e9 }
                boolean r13 = r13.f50256c     // Catch:{ ActivityNotFoundException -> 0x01e9 }
                r1.<init>(r2, r3, r0, r13)     // Catch:{ ActivityNotFoundException -> 0x01e9 }
                boolean r13 = r1.f50260d     // Catch:{ ActivityNotFoundException -> 0x01e9 }
                if (r13 == 0) goto L_0x01b6
                int r13 = android.os.Build.VERSION.SDK_INT     // Catch:{ ActivityNotFoundException -> 0x01e9 }
                if (r13 < r4) goto L_0x01ac
                com.linecorp.linesdk.auth.internal.c r13 = com.linecorp.linesdk.auth.internal.C18598c.this     // Catch:{ ActivityNotFoundException -> 0x01e9 }
                com.linecorp.linesdk.auth.internal.LineAuthenticationActivity r13 = r13.f50268a     // Catch:{ ActivityNotFoundException -> 0x01e9 }
                android.content.Intent r0 = r1.f50257a     // Catch:{ ActivityNotFoundException -> 0x01e9 }
                android.os.Bundle r2 = r1.f50258b     // Catch:{ ActivityNotFoundException -> 0x01e9 }
                r13.startActivity(r0, r2)     // Catch:{ ActivityNotFoundException -> 0x01e9 }
                goto L_0x01d0
            L_0x01ac:
                com.linecorp.linesdk.auth.internal.c r13 = com.linecorp.linesdk.auth.internal.C18598c.this     // Catch:{ ActivityNotFoundException -> 0x01e9 }
                com.linecorp.linesdk.auth.internal.LineAuthenticationActivity r13 = r13.f50268a     // Catch:{ ActivityNotFoundException -> 0x01e9 }
                android.content.Intent r0 = r1.f50257a     // Catch:{ ActivityNotFoundException -> 0x01e9 }
                r13.startActivity(r0)     // Catch:{ ActivityNotFoundException -> 0x01e9 }
                goto L_0x01d0
            L_0x01b6:
                int r13 = android.os.Build.VERSION.SDK_INT     // Catch:{ ActivityNotFoundException -> 0x01e9 }
                r0 = 3
                if (r13 < r4) goto L_0x01c7
                com.linecorp.linesdk.auth.internal.c r13 = com.linecorp.linesdk.auth.internal.C18598c.this     // Catch:{ ActivityNotFoundException -> 0x01e9 }
                com.linecorp.linesdk.auth.internal.LineAuthenticationActivity r13 = r13.f50268a     // Catch:{ ActivityNotFoundException -> 0x01e9 }
                android.content.Intent r2 = r1.f50257a     // Catch:{ ActivityNotFoundException -> 0x01e9 }
                android.os.Bundle r3 = r1.f50258b     // Catch:{ ActivityNotFoundException -> 0x01e9 }
                r13.startActivityForResult(r2, r0, r3)     // Catch:{ ActivityNotFoundException -> 0x01e9 }
                goto L_0x01d0
            L_0x01c7:
                com.linecorp.linesdk.auth.internal.c r13 = com.linecorp.linesdk.auth.internal.C18598c.this     // Catch:{ ActivityNotFoundException -> 0x01e9 }
                com.linecorp.linesdk.auth.internal.LineAuthenticationActivity r13 = r13.f50268a     // Catch:{ ActivityNotFoundException -> 0x01e9 }
                android.content.Intent r2 = r1.f50257a     // Catch:{ ActivityNotFoundException -> 0x01e9 }
                r13.startActivityForResult(r2, r0)     // Catch:{ ActivityNotFoundException -> 0x01e9 }
            L_0x01d0:
                com.linecorp.linesdk.auth.internal.c r13 = com.linecorp.linesdk.auth.internal.C18598c.this     // Catch:{ ActivityNotFoundException -> 0x01e9 }
                com.linecorp.linesdk.auth.internal.d r13 = r13.f50275h     // Catch:{ ActivityNotFoundException -> 0x01e9 }
                java.lang.String r0 = r1.f50259c     // Catch:{ ActivityNotFoundException -> 0x01e9 }
                r13.f50280b = r0     // Catch:{ ActivityNotFoundException -> 0x01e9 }
                return
            L_0x01d9:
                android.content.ActivityNotFoundException r0 = new android.content.ActivityNotFoundException     // Catch:{ ActivityNotFoundException -> 0x01e9 }
                java.lang.String r1 = "Activity for LINE log-in is not found. uri="
                java.lang.String r13 = java.lang.String.valueOf(r13)     // Catch:{ ActivityNotFoundException -> 0x01e9 }
                java.lang.String r13 = r1.concat(r13)     // Catch:{ ActivityNotFoundException -> 0x01e9 }
                r0.<init>(r13)     // Catch:{ ActivityNotFoundException -> 0x01e9 }
                throw r0     // Catch:{ ActivityNotFoundException -> 0x01e9 }
            L_0x01e9:
                r13 = move-exception
                com.linecorp.linesdk.auth.internal.c r0 = com.linecorp.linesdk.auth.internal.C18598c.this
                com.linecorp.linesdk.auth.internal.d r0 = r0.f50275h
                int r1 = com.linecorp.linesdk.auth.internal.C18602d.C18604a.f50286d
                r0.f50282d = r1
                com.linecorp.linesdk.auth.internal.c r0 = com.linecorp.linesdk.auth.internal.C18598c.this
                com.linecorp.linesdk.auth.internal.LineAuthenticationActivity r0 = r0.f50268a
                com.linecorp.linesdk.auth.LineLoginResult r1 = new com.linecorp.linesdk.auth.LineLoginResult
                com.linecorp.linesdk.LineApiResponseCode r2 = com.linecorp.linesdk.LineApiResponseCode.INTERNAL_ERROR
                com.linecorp.linesdk.LineApiError r3 = new com.linecorp.linesdk.LineApiError
                r3.<init>(r13)
                r1.<init>(r2, r3)
                r0.mo48766a(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.linecorp.linesdk.auth.internal.C18598c.C18601c.onPostExecute(java.lang.Object):void");
        }

        /* synthetic */ C18601c(C18598c cVar, byte b) {
            this();
        }
    }

    /* renamed from: a */
    static /* synthetic */ LineLoginResult m61030a(C18565a aVar) {
        return new LineLoginResult(aVar.f50187a, aVar.f50188b);
    }

    C18598c(LineAuthenticationActivity lineAuthenticationActivity, LineAuthenticationConfig lineAuthenticationConfig, C18602d dVar, String[] strArr) {
        this(lineAuthenticationActivity, lineAuthenticationConfig, new C18574b(lineAuthenticationActivity.getApplicationContext(), lineAuthenticationConfig.f50235b), new C18580d(lineAuthenticationActivity.getApplicationContext(), lineAuthenticationConfig.f50235b), new C18593a(dVar), new C18566a(lineAuthenticationActivity.getApplicationContext(), lineAuthenticationConfig.f50234a), dVar, strArr);
    }

    private C18598c(LineAuthenticationActivity lineAuthenticationActivity, LineAuthenticationConfig lineAuthenticationConfig, C18574b bVar, C18580d dVar, C18593a aVar, C18566a aVar2, C18602d dVar2, String[] strArr) {
        this.f50268a = lineAuthenticationActivity;
        this.f50269b = lineAuthenticationConfig;
        this.f50270c = bVar;
        this.f50271d = dVar;
        this.f50272e = aVar;
        this.f50273f = aVar2;
        this.f50275h = dVar2;
        this.f50274g = strArr;
    }
}
