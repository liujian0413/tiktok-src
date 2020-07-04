package com.p280ss.android.ugc.aweme.filter;

import android.util.Pair;
import com.bytedance.frameworks.baselib.network.http.util.C10191k;
import com.bytedance.retrofit2.C12534t;
import com.bytedance.retrofit2.mime.TypedInput;
import com.p280ss.android.ugc.aweme.common.p1141b.C25653a.C25655a;
import com.p280ss.android.ugc.aweme.effectplatform.EffectNetworkAPI;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.IntRef;
import kotlin.jvm.p357a.C7561a;
import kotlin.p1884io.C47973b;

/* renamed from: com.ss.android.ugc.aweme.filter.bt */
public final class C29264bt {

    /* renamed from: a */
    public static final C29264bt f77203a = new C29264bt();

    /* renamed from: com.ss.android.ugc.aweme.filter.bt$a */
    static final class C29265a extends Lambda implements C7561a<Integer> {

        /* renamed from: a */
        final /* synthetic */ InputStream f77204a;

        /* renamed from: b */
        final /* synthetic */ FileOutputStream f77205b;

        /* renamed from: c */
        final /* synthetic */ IntRef f77206c;

        /* renamed from: d */
        final /* synthetic */ byte[] f77207d;

        /* renamed from: e */
        final /* synthetic */ IntRef f77208e;

        /* renamed from: f */
        final /* synthetic */ C25655a f77209f;

        /* renamed from: g */
        final /* synthetic */ String f77210g;

        /* renamed from: h */
        final /* synthetic */ long f77211h;

        C29265a(InputStream inputStream, FileOutputStream fileOutputStream, IntRef intRef, byte[] bArr, IntRef intRef2, C25655a aVar, String str, long j) {
            this.f77204a = inputStream;
            this.f77205b = fileOutputStream;
            this.f77206c = intRef;
            this.f77207d = bArr;
            this.f77208e = intRef2;
            this.f77209f = aVar;
            this.f77210g = str;
            this.f77211h = j;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Integer.valueOf(m96003a());
        }

        /* renamed from: a */
        private int m96003a() {
            this.f77206c.element = this.f77204a.read(this.f77207d);
            return this.f77206c.element;
        }
    }

    private C29264bt() {
    }

    /* renamed from: a */
    public static void m96002a(String str, String str2, C25655a aVar) {
        Closeable closeable;
        Throwable th;
        Throwable th2;
        Closeable closeable2;
        String str3 = str;
        String str4 = str2;
        C25655a aVar2 = aVar;
        C7573i.m23587b(str3, "url");
        C7573i.m23587b(str4, "filePath");
        C7573i.m23587b(aVar2, "listener");
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Pair a = C10191k.m30270a(str3, (Map<String, String>) linkedHashMap);
            C7573i.m23582a((Object) a, "UrlUtils.parseUrl(url, queryMap)");
            String str5 = (String) a.first;
            C12534t execute = ((EffectNetworkAPI) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(str5).create(EffectNetworkAPI.class)).doGet(true, Integer.MAX_VALUE, (String) a.second, linkedHashMap).execute();
            InputStream in = ((TypedInput) execute.f33302b).mo10444in();
            long length = ((TypedInput) execute.f33302b).length();
            FileOutputStream fileOutputStream = new FileOutputStream(new File(str4));
            IntRef intRef = new IntRef();
            intRef.element = 0;
            IntRef intRef2 = new IntRef();
            intRef2.element = 0;
            byte[] bArr = new byte[4096];
            Closeable closeable3 = in;
            Throwable th3 = null;
            try {
                InputStream inputStream = (InputStream) closeable3;
                Closeable closeable4 = fileOutputStream;
                try {
                    FileOutputStream fileOutputStream2 = (FileOutputStream) closeable4;
                    while (true) {
                        r1 = r1;
                        FileOutputStream fileOutputStream3 = fileOutputStream;
                        FileOutputStream fileOutputStream4 = fileOutputStream;
                        Closeable closeable5 = closeable4;
                        Closeable closeable6 = closeable3;
                        FileOutputStream fileOutputStream5 = fileOutputStream2;
                        byte[] bArr2 = bArr;
                        IntRef intRef3 = intRef2;
                        try {
                            C29265a aVar3 = new C29265a(inputStream, fileOutputStream3, intRef, bArr, intRef2, aVar, str, length);
                            if (((Number) aVar3.invoke()).intValue() != -1) {
                                try {
                                    intRef3.element += intRef.element;
                                    aVar2.mo66542a(str3, (int) (((((float) intRef3.element) * 1.0f) / ((float) length)) * 100.0f));
                                    FileOutputStream fileOutputStream6 = fileOutputStream5;
                                    byte[] bArr3 = bArr2;
                                    fileOutputStream6.write(bArr3, 0, intRef.element);
                                    bArr = bArr3;
                                    fileOutputStream2 = fileOutputStream6;
                                    intRef2 = intRef3;
                                    fileOutputStream = fileOutputStream4;
                                    closeable4 = closeable5;
                                    closeable3 = closeable6;
                                } catch (Throwable th4) {
                                    th = th4;
                                    closeable2 = closeable5;
                                    closeable = closeable6;
                                    th = null;
                                    th3 = null;
                                    try {
                                        C47973b.m148917a(closeable2, th3);
                                        throw th;
                                    } catch (Throwable th5) {
                                        th = th5;
                                        C47973b.m148917a(closeable, th);
                                        throw th;
                                    }
                                }
                            } else {
                                th = null;
                                try {
                                    C47973b.m148917a(closeable5, null);
                                    C47973b.m148917a(closeable6, null);
                                    aVar2.mo66541a(str3);
                                    return;
                                } catch (Throwable th6) {
                                    th = th6;
                                    closeable = closeable6;
                                    C47973b.m148917a(closeable, th);
                                    throw th;
                                }
                            }
                        } catch (Throwable th7) {
                            th = th7;
                            closeable2 = closeable5;
                            closeable = closeable6;
                            th = null;
                            th3 = null;
                            C47973b.m148917a(closeable2, th3);
                            throw th;
                        }
                    }
                } catch (Throwable th8) {
                    th = th8;
                    closeable2 = closeable4;
                    th = null;
                    closeable = closeable3;
                    C47973b.m148917a(closeable2, th3);
                    throw th;
                }
            } catch (Throwable th9) {
                th = th9;
                th = null;
                closeable = closeable3;
                C47973b.m148917a(closeable, th);
                throw th;
            }
        } catch (Exception e) {
            aVar2.mo66543a(str3, e);
        }
    }
}
