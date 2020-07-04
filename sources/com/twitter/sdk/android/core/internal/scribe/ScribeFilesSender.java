package com.twitter.sdk.android.core.internal.scribe;

import android.content.Context;
import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.twitter.sdk.android.core.C46825e;
import com.twitter.sdk.android.core.C46938j;
import com.twitter.sdk.android.core.C46939k;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterAuthToken;
import com.twitter.sdk.android.core.internal.C46869g;
import com.twitter.sdk.android.core.internal.C46875m;
import com.twitter.sdk.android.core.internal.p1845a.C46853a;
import com.twitter.sdk.android.core.internal.p1845a.C46856d;
import com.twitter.sdk.android.core.internal.p1845a.C46857e;
import com.twitter.sdk.android.core.internal.scribe.C46923r.C46927c;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.Interceptor;
import okhttp3.Interceptor.Chain;
import okhttp3.OkHttpClient;
import okhttp3.Request.Builder;
import okhttp3.Response;
import okhttp3.ResponseBody;
import retrofit2.C48475b;
import retrofit2.C48516l;
import retrofit2.C48517m.C48519a;
import retrofit2.p363b.C7727c;
import retrofit2.p363b.C7729e;
import retrofit2.p363b.C7735k;
import retrofit2.p363b.C7739o;
import retrofit2.p363b.C7743s;

final class ScribeFilesSender implements C46922q {

    /* renamed from: a */
    private static final byte[] f120237a = {91};

    /* renamed from: b */
    private static final byte[] f120238b = {44};

    /* renamed from: c */
    private static final byte[] f120239c = {93};

    /* renamed from: d */
    private final Context f120240d;

    /* renamed from: e */
    private final C46930u f120241e;

    /* renamed from: f */
    private final long f120242f;

    /* renamed from: g */
    private final TwitterAuthConfig f120243g;

    /* renamed from: h */
    private final C46939k<? extends C46938j<TwitterAuthToken>> f120244h;

    /* renamed from: i */
    private final C46825e f120245i;

    /* renamed from: j */
    private final AtomicReference<ScribeService> f120246j = new AtomicReference<>();

    /* renamed from: k */
    private final ExecutorService f120247k;

    /* renamed from: l */
    private final C46875m f120248l;

    interface ScribeService {
        @C7739o(mo20429a = "/{version}/jot/{type}")
        @C7729e
        @C7735k(mo20426a = {"Content-Type: application/x-www-form-urlencoded;charset=UTF-8"})
        C48475b<ResponseBody> upload(@C7743s(mo20434a = "version") String str, @C7743s(mo20434a = "type") String str2, @C7727c(mo20417a = "log[]") String str3);

        @C7739o(mo20429a = "/scribe/{sequence}")
        @C7729e
        @C7735k(mo20426a = {"Content-Type: application/x-www-form-urlencoded;charset=UTF-8"})
        C48475b<ResponseBody> uploadSequence(@C7743s(mo20434a = "sequence") String str, @C7727c(mo20417a = "log[]") String str2);
    }

    /* renamed from: com.twitter.sdk.android.core.internal.scribe.ScribeFilesSender$a */
    static class C46895a implements Interceptor {

        /* renamed from: a */
        private final C46930u f120249a;

        /* renamed from: b */
        private final C46875m f120250b;

        public final Response intercept(Chain chain) throws IOException {
            Builder newBuilder = chain.request().newBuilder();
            if (!TextUtils.isEmpty(this.f120249a.f120345f)) {
                newBuilder.header("User-Agent", this.f120249a.f120345f);
            }
            if (!TextUtils.isEmpty(this.f120250b.mo117973a())) {
                newBuilder.header("X-Client-UUID", this.f120250b.mo117973a());
            }
            newBuilder.header("X-Twitter-Polling", "true");
            return chain.proceed(newBuilder.build());
        }

        C46895a(C46930u uVar, C46875m mVar) {
            this.f120249a = uVar;
            this.f120250b = mVar;
        }
    }

    /* renamed from: a */
    private boolean m146683a() {
        if (m146685b() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private synchronized ScribeService m146685b() {
        OkHttpClient okHttpClient;
        if (this.f120246j.get() == null) {
            C46938j a = m146680a(this.f120242f);
            if (m146684a(a)) {
                okHttpClient = new OkHttpClient.Builder().certificatePinner(C46857e.m146562a()).addInterceptor(new C46895a(this.f120241e, this.f120248l)).addInterceptor(new C46856d(a, this.f120243g)).build();
            } else {
                okHttpClient = new OkHttpClient.Builder().certificatePinner(C46857e.m146562a()).addInterceptor(new C46895a(this.f120241e, this.f120248l)).addInterceptor(new C46853a(this.f120245i)).build();
            }
            this.f120246j.compareAndSet(null, new C48519a().mo123319a(this.f120241e.f120341b).mo123320a(okHttpClient).mo123323a().mo123312a(ScribeService.class));
        }
        return (ScribeService) this.f120246j.get();
    }

    /* renamed from: a */
    private C46938j m146680a(long j) {
        return this.f120244h.mo117914a(j);
    }

    /* renamed from: a */
    private C48516l<ResponseBody> m146681a(String str) throws IOException {
        ScribeService b = m146685b();
        if (!TextUtils.isEmpty(this.f120241e.f120344e)) {
            return b.uploadSequence(this.f120241e.f120344e, str).mo123282a();
        }
        return b.upload(this.f120241e.f120342c, this.f120241e.f120343d, str).mo123282a();
    }

    /* renamed from: a */
    private static boolean m146684a(C46938j jVar) {
        if (jVar == null || jVar.f120356a == null) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private static String m146686b(List<File> list) throws IOException {
        C46923r rVar;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(PreloadTask.BYTE_UNIT_NUMBER);
        boolean[] zArr = new boolean[1];
        byteArrayOutputStream.write(f120237a);
        for (File rVar2 : list) {
            try {
                rVar = new C46923r(rVar2);
                try {
                    rVar.mo118067a((C46927c) new C46935y(zArr, byteArrayOutputStream));
                    C46869g.m146604a((Closeable) rVar);
                } catch (Throwable th) {
                    th = th;
                    C46869g.m146604a((Closeable) rVar);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                rVar = null;
                C46869g.m146604a((Closeable) rVar);
                throw th;
            }
        }
        byteArrayOutputStream.write(f120239c);
        return byteArrayOutputStream.toString("UTF-8");
    }

    /* renamed from: a */
    public final boolean mo118008a(List<File> list) {
        if (m146683a()) {
            try {
                String b = m146686b(list);
                C46869g.m146602a(this.f120240d, b);
                C48516l a = m146681a(b);
                if (a.mo123307a() == 200) {
                    return true;
                }
                C46869g.m146603a(this.f120240d, "Failed sending files", (Throwable) null);
                if (a.mo123307a() == 500 || a.mo123307a() == 400) {
                    return true;
                }
            } catch (Exception e) {
                C46869g.m146603a(this.f120240d, "Failed sending files", (Throwable) e);
            }
        } else {
            C46869g.m146602a(this.f120240d, "Cannot attempt upload at this time");
        }
        return false;
    }

    /* renamed from: a */
    static final /* synthetic */ void m146682a(boolean[] zArr, ByteArrayOutputStream byteArrayOutputStream, InputStream inputStream, int i) throws IOException {
        byte[] bArr = new byte[i];
        inputStream.read(bArr);
        if (zArr[0]) {
            byteArrayOutputStream.write(f120238b);
        } else {
            zArr[0] = true;
        }
        byteArrayOutputStream.write(bArr);
    }

    ScribeFilesSender(Context context, C46930u uVar, long j, TwitterAuthConfig twitterAuthConfig, C46939k<? extends C46938j<TwitterAuthToken>> kVar, C46825e eVar, ExecutorService executorService, C46875m mVar) {
        this.f120240d = context;
        this.f120241e = uVar;
        this.f120242f = j;
        this.f120243g = twitterAuthConfig;
        this.f120244h = kVar;
        this.f120245i = eVar;
        this.f120247k = executorService;
        this.f120248l = mVar;
    }
}
