package com.bytedance.ies.net.cronet;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.common.utility.C6319n;
import com.bytedance.frameworks.baselib.network.http.util.C10191k;
import com.bytedance.retrofit2.C12466b;
import com.bytedance.retrofit2.C12516p;
import com.bytedance.retrofit2.C12534t;
import com.bytedance.retrofit2.mime.MultipartTypedOutput;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedFile;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.mime.TypedString;
import com.bytedance.retrofit2.p637a.C12461b;
import com.bytedance.retrofit2.p638c.C12469a;
import com.bytedance.ttnet.p671c.C12960e;
import com.bytedance.ttnet.utils.RetrofitUtils;
import com.p280ss.android.common.p852c.C19279b;
import com.p280ss.android.common.p852c.C19281d;
import com.p280ss.android.common.p852c.p853a.C19274a;
import com.p280ss.android.common.p852c.p853a.C19274a.C19275a;
import com.p280ss.android.common.p852c.p853a.C19274a.C19276b;
import com.p280ss.android.common.p852c.p853a.C19274a.C19277c;
import com.p280ss.android.common.p852c.p853a.C19274a.C19278d;
import com.p280ss.android.common.util.C19288d;
import com.p280ss.android.common.util.C6773c;
import com.p280ss.android.common.util.C6775g;
import com.p280ss.android.common.util.NetworkUtils;
import com.p280ss.android.common.util.NetworkUtils.C6770g;
import com.p280ss.android.http.legacy.C6809a;
import com.p280ss.android.http.legacy.client.HttpResponseException;
import com.p280ss.android.http.legacy.p296a.C19561a;
import com.p280ss.android.http.legacy.p296a.C19565e;
import com.p280ss.android.http.legacy.p296a.C6810f;
import java.io.File;
import java.io.InputStream;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import org.apache.http.client.RedirectHandler;

/* renamed from: com.bytedance.ies.net.cronet.c */
public class C10930c implements C19279b {

    /* renamed from: e */
    private static Map<String, C12516p> f29592e = new HashMap();

    /* renamed from: a */
    private final String f29593a = " cronet/1.0.3.2";

    /* renamed from: b */
    private List<C12469a> f29594b = new ArrayList();

    /* renamed from: c */
    private C12960e f29595c;

    /* renamed from: d */
    private C10929b f29596d;

    /* renamed from: com.bytedance.ies.net.cronet.c$a */
    public static class C10932a implements C19281d {

        /* renamed from: a */
        C12466b f29600a;

        /* renamed from: a */
        public final void mo26330a() {
            if (this.f29600a != null) {
                this.f29600a.cancel();
            }
        }

        public C10932a(C12466b bVar) {
            this.f29600a = bVar;
        }
    }

    /* renamed from: a */
    public final byte[] mo26329a(int i, String str) throws Exception {
        if (C6319n.m19593a(str)) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Pair a = C10191k.m30270a(str, (Map<String, String>) linkedHashMap);
        String str2 = (String) a.first;
        String str3 = (String) a.second;
        IIESNetworkApi a2 = mo26345a(str2);
        if (a2 != null) {
            C12534t execute = a2.downloadFile(true, i, str3, linkedHashMap).execute();
            if (execute.mo30512c()) {
                TypedInput typedInput = (TypedInput) execute.f33302b;
                if (typedInput != null) {
                    InputStream in = typedInput.mo10444in();
                    String a3 = m32064a(execute.mo30511b(), "Content-Length");
                    long j = -1;
                    if (a3 != null) {
                        j = Long.parseLong(a3);
                    }
                    return NetworkUtils.stream2ByteArray(i, in, j);
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public final boolean mo26327a(int i, String str, String str2, String str3, String str4, C6773c<String> cVar, String str5, C6775g gVar, List<C19565e> list, String[] strArr, int[] iArr) throws Exception {
        final String str6 = str;
        C6775g gVar2 = gVar;
        String[] strArr2 = strArr;
        int[] iArr2 = iArr;
        if (C6319n.m19593a(str)) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        String str7 = null;
        try {
            String userAgent = NetworkUtils.getUserAgent();
            if (TextUtils.isEmpty(userAgent)) {
                StringBuilder sb = new StringBuilder();
                sb.append(userAgent);
                sb.append(" cronet/1.0.3.2");
                userAgent = sb.toString();
            }
            arrayList.add(new C12461b("User-Agent", userAgent));
            if (list != null) {
                for (C19565e eVar : list) {
                    arrayList.add(new C12461b(eVar.mo51722a(), eVar.mo51723b()));
                }
            }
            if (gVar2 == null || !gVar2.f19289a) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Pair a = C10191k.m30270a(str6, (Map<String, String>) linkedHashMap);
                String str8 = (String) a.second;
                IIESNetworkApi a2 = mo26345a((String) a.first);
                if (a2 != null) {
                    final C12466b downloadFile = a2.downloadFile(true, i, str8, linkedHashMap, arrayList, this.f29595c);
                    C12534t execute = downloadFile.execute();
                    if (execute.mo30512c()) {
                        TypedInput typedInput = (TypedInput) execute.f33302b;
                        if (typedInput != null) {
                            InputStream in = typedInput.mo10444in();
                            List<C12461b> b = execute.mo30511b();
                            long j = -1;
                            if (b != null && !b.isEmpty()) {
                                for (C12461b bVar : b) {
                                    if ("Content-Length".equals(bVar.f33095a)) {
                                        String str9 = bVar.f33096b;
                                        if (!TextUtils.isEmpty(str9)) {
                                            j = Long.parseLong(str9);
                                        }
                                    } else if ("Content-Encoding".equals(bVar.f33095a)) {
                                        String str10 = bVar.f33096b;
                                        if (!TextUtils.isEmpty(str10) && "gzip".equalsIgnoreCase(str10)) {
                                            in = new GZIPInputStream(in);
                                        }
                                    } else if ("x-snssdk.remoteaddr".equals(bVar.f33095a)) {
                                        str7 = bVar.f33096b;
                                    }
                                }
                            }
                            String str11 = str7;
                            if (iArr2 != null) {
                                try {
                                    if (iArr2.length > 0) {
                                        iArr2[0] = 0;
                                        if (j <= 2147483647L) {
                                            iArr2[0] = (int) j;
                                        }
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    str7 = str11;
                                    m32065a(strArr2, str7);
                                    throw th;
                                }
                            }
                            boolean stream2File = NetworkUtils.stream2File(in, j, new C6770g() {
                                /* renamed from: a */
                                public final URI mo16560a() {
                                    try {
                                        return new URI(str6);
                                    } catch (Exception unused) {
                                        return null;
                                    }
                                }

                                /* renamed from: b */
                                public final void mo16561b() {
                                    if (downloadFile != null) {
                                        downloadFile.cancel();
                                    }
                                }
                            }, i, str2, str3, str4, cVar, str5, gVar);
                            m32065a(strArr2, str11);
                            return stream2File;
                        }
                    } else {
                        throw new HttpResponseException(execute.mo30510a(), m32064a(execute.mo30511b(), "Reason-Phrase"));
                    }
                }
                m32065a(strArr2, (String) null);
                return false;
            }
            m32065a(strArr2, (String) null);
            return false;
        } catch (Throwable th2) {
            th = th2;
            m32065a(strArr2, str7);
            throw th;
        }
    }

    /* renamed from: a */
    public final boolean mo26328a(int i, String str, StringBuffer stringBuffer, StringBuffer stringBuffer2, StringBuffer stringBuffer3, C6773c<String> cVar, String str2, C6775g gVar, List<C19565e> list, String[] strArr, int[] iArr, RedirectHandler redirectHandler) throws Exception {
        return mo26327a(i, str, stringBuffer.toString(), stringBuffer2.toString(), stringBuffer3.toString(), cVar, str2, gVar, list, strArr, iArr);
    }

    /* renamed from: a */
    public final String mo26326a(int i, String str, C19274a aVar, C19288d<Long> dVar, long j, C19281d[] dVarArr) throws Exception {
        MultipartTypedOutput multipartTypedOutput = new MultipartTypedOutput();
        for (C19277c cVar : aVar.f52170a) {
            if (cVar instanceof C19278d) {
                multipartTypedOutput.addPart(cVar.mo51163a(), new TypedString((String) cVar.mo51164b()));
            } else if (cVar instanceof C19275a) {
                C19275a aVar2 = (C19275a) cVar;
                multipartTypedOutput.addPart(aVar2.mo51163a(), new TypedByteArray(null, (byte[]) aVar2.mo51164b(), aVar2.f52173c));
            } else if (cVar instanceof C19276b) {
                multipartTypedOutput.addPart(cVar.mo51163a(), new TypedFile(null, (File) cVar.mo51164b()));
            }
        }
        return m32062a(0, i, str, null, (TypedOutput) multipartTypedOutput, null, (Object) this.f29595c, dVarArr);
    }

    /* renamed from: a */
    public final String mo26322a(int i, int i2, String str, List<C6809a> list, boolean z, boolean z2, C6810f fVar, boolean z3) throws Exception {
        long j;
        String str2 = str;
        C6810f fVar2 = fVar;
        if (C6319n.m19593a(str)) {
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            try {
                for (C6809a aVar : list) {
                    String a = aVar.mo16635a();
                    String b = aVar.mo16636b();
                    if (a != null && a.length() > 0) {
                        arrayList.add(new C12461b(a, b));
                    }
                }
            } catch (Exception e) {
                e = e;
                j = currentTimeMillis;
                NetworkUtils.handleApiError(str2, e, System.currentTimeMillis() - j, null);
                throw e;
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Pair a2 = C10191k.m30270a(str2, (Map<String, String>) linkedHashMap);
        String str3 = (String) a2.second;
        IIESNetworkApi a3 = mo26345a((String) a2.first);
        if (a3 == null) {
            return null;
        }
        if (this.f29596d != null) {
            this.f29596d.mo26343a(str2);
        }
        C12466b doGet = a3.doGet(true, i2, str3, linkedHashMap, arrayList, this.f29595c);
        j = System.currentTimeMillis();
        try {
            C12534t execute = doGet.execute();
            if (this.f29596d != null) {
                this.f29596d.mo26344a(str2, execute);
            }
            long currentTimeMillis2 = System.currentTimeMillis() - j;
            m32064a(execute.mo30511b(), "X-TT-LOGID");
            if (NetworkUtils.getCommandListener() != null) {
                String a4 = NetworkUtils.getCommandListener().mo16556a();
                if (!C6319n.m19593a(a4)) {
                    ArrayList arrayList2 = new ArrayList();
                    for (C12461b bVar : execute.mo30511b()) {
                        if (a4.equalsIgnoreCase(bVar.f33095a)) {
                            arrayList2.add(bVar.f33096b);
                        }
                    }
                    NetworkUtils.getCommandListener().mo16557a(arrayList2);
                }
            }
            if (fVar2 != null) {
                for (C12461b bVar2 : execute.mo30511b()) {
                    String str4 = bVar2.f33095a;
                    if ("ETag".equalsIgnoreCase(str4) || "Last-Modified".equalsIgnoreCase(str4) || "Cache-Control".equalsIgnoreCase(str4) || "X-SS-SIGN".equalsIgnoreCase(str4) || "X-TT-LOGID".equalsIgnoreCase(str4)) {
                        fVar2.mo16638a((C6809a) new C19561a(str4, bVar2.f33096b));
                    }
                }
            }
            if (execute.mo30512c()) {
                String str5 = (String) execute.f33302b;
                NetworkUtils.handleTimeStampFromResponse(str5);
                NetworkUtils.handleApiOk(str2, currentTimeMillis2, null);
                return str5;
            }
            throw new HttpResponseException(execute.mo30510a(), m32064a(execute.mo30511b(), "Reason-Phrase"));
        } catch (Exception e2) {
            e = e2;
            NetworkUtils.handleApiError(str2, e, System.currentTimeMillis() - j, null);
            throw e;
        }
    }

    /* renamed from: a */
    public final String mo26323a(int i, int i2, String str, List<C19565e> list, boolean z, C19281d[] dVarArr, List<C6809a> list2) throws Exception {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (C19565e eVar : list) {
            hashMap.put(eVar.mo51722a(), eVar.mo51723b());
        }
        if (list2 != null) {
            for (C6809a aVar : list2) {
                arrayList.add(new C12461b(aVar.mo16635a(), aVar.mo16636b()));
            }
        }
        return m32062a(i, i2, str, (Map<String, String>) hashMap, (TypedOutput) null, (List<C12461b>) arrayList, (Object) this.f29595c, dVarArr);
    }

    /* renamed from: a */
    public final String mo26321a(int i, int i2, String str, List<C19565e> list, C19274a aVar, C19281d[] dVarArr) throws Exception {
        ArrayList arrayList = new ArrayList();
        MultipartTypedOutput multipartTypedOutput = new MultipartTypedOutput();
        for (C19565e eVar : list) {
            multipartTypedOutput.addPart(eVar.mo51722a(), new TypedString(eVar.mo51723b()));
        }
        for (C19277c cVar : aVar.f52170a) {
            if (cVar instanceof C19278d) {
                multipartTypedOutput.addPart(cVar.mo51163a(), new TypedString((String) cVar.mo51164b()));
            } else if (cVar instanceof C19275a) {
                C19275a aVar2 = (C19275a) cVar;
                multipartTypedOutput.addPart(aVar2.mo51163a(), new TypedByteArray(null, (byte[]) aVar2.mo51164b(), aVar2.f52173c));
            } else if (cVar instanceof C19276b) {
                multipartTypedOutput.addPart(cVar.mo51163a(), new TypedFile(null, (File) cVar.mo51164b()));
            }
        }
        return m32062a(i, i2, str, null, (TypedOutput) multipartTypedOutput, (List<C12461b>) arrayList, (Object) this.f29595c, dVarArr);
    }

    /* renamed from: a */
    public final String mo26325a(int i, int i2, String str, byte[] bArr, String str2, String str3, List<C6809a> list) throws Exception {
        String str4 = str2;
        String str5 = str3;
        ArrayList arrayList = new ArrayList();
        if (str4 != null) {
            arrayList.add(new C12461b("Content-Encoding", str2));
        }
        if (str5 != null && str3.length() > 0) {
            arrayList.add(new C12461b("Content-Type", str5));
        }
        if (list != null) {
            for (C6809a aVar : list) {
                arrayList.add(new C12461b(aVar.mo16635a(), aVar.mo16636b()));
            }
        }
        byte[] bArr2 = bArr;
        return m32062a(i, i2, str, null, (TypedOutput) new TypedByteArray(str5, bArr, new String[0]), (List<C12461b>) arrayList, (Object) this.f29595c, (C19281d[]) null);
    }

    /* renamed from: a */
    public final C10930c mo26347a(C10929b bVar) {
        this.f29596d = bVar;
        return this;
    }

    /* renamed from: a */
    public final C10930c mo26348a(C12469a aVar) {
        if (aVar != null) {
            this.f29594b.add(aVar);
        }
        return this;
    }

    /* renamed from: c */
    public final C10930c mo26353c(long j) {
        if (this.f29595c == null) {
            this.f29595c = new C12960e();
        }
        this.f29595c.f27556e = 60000;
        return this;
    }

    /* renamed from: b */
    public final C10930c mo26350b(long j) {
        if (this.f29595c == null) {
            this.f29595c = new C12960e();
        }
        this.f29595c.f27555d = 60000;
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final IIESNetworkApi mo26345a(String str) {
        if (C6319n.m19593a(str)) {
            return null;
        }
        C12516p pVar = (C12516p) f29592e.get(str);
        if (pVar == null) {
            pVar = RetrofitUtils.m37894a(str, this.f29594b, null);
            f29592e.put(str, pVar);
        }
        return (IIESNetworkApi) RetrofitUtils.m37897a(pVar, IIESNetworkApi.class);
    }

    /* renamed from: a */
    public final C10930c mo26346a(long j) {
        if (this.f29595c == null) {
            this.f29595c = new C12960e();
        }
        this.f29595c.f27554c = 60000;
        return this;
    }

    /* renamed from: a */
    public static String m32064a(List<C12461b> list, String str) {
        if (list != null && !TextUtils.isEmpty(str)) {
            for (C12461b bVar : list) {
                if (str.equalsIgnoreCase(bVar.f33095a)) {
                    return bVar.f33096b;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    private static void m32065a(String[] strArr, String str) {
        if (strArr != null && strArr.length != 0 && !TextUtils.isEmpty(str)) {
            try {
                strArr[0] = str;
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public final String mo26349a(int i, int i2, String str, List<C6809a> list) throws Exception {
        long j;
        if (C6319n.m19593a(str)) {
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            try {
                for (C6809a aVar : list) {
                    String a = aVar.mo16635a();
                    String b = aVar.mo16636b();
                    if (a != null && a.length() > 0) {
                        arrayList.add(new C12461b(a, b));
                    }
                }
            } catch (Exception e) {
                e = e;
                j = currentTimeMillis;
                NetworkUtils.handleApiError(str, e, System.currentTimeMillis() - j, null);
                throw e;
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Pair a2 = C10191k.m30270a(str, (Map<String, String>) linkedHashMap);
        String str2 = (String) a2.second;
        IIESNetworkApi a3 = mo26345a((String) a2.first);
        if (a3 == null) {
            return null;
        }
        if (this.f29596d != null) {
            this.f29596d.mo26343a(str);
        }
        C12466b doDetete = a3.doDetete(i2, str2, linkedHashMap, arrayList, this.f29595c);
        j = System.currentTimeMillis();
        try {
            C12534t execute = doDetete.execute();
            if (this.f29596d != null) {
                this.f29596d.mo26344a(str, execute);
            }
            long currentTimeMillis2 = System.currentTimeMillis() - j;
            if (NetworkUtils.getCommandListener() != null) {
                String a4 = NetworkUtils.getCommandListener().mo16556a();
                if (!C6319n.m19593a(a4)) {
                    ArrayList arrayList2 = new ArrayList();
                    for (C12461b bVar : execute.mo30511b()) {
                        if (a4.equalsIgnoreCase(bVar.f33095a)) {
                            arrayList2.add(bVar.f33096b);
                        }
                    }
                    NetworkUtils.getCommandListener().mo16557a(arrayList2);
                }
            }
            if (execute.mo30512c()) {
                String str3 = (String) execute.f33302b;
                NetworkUtils.handleTimeStampFromResponse(str3);
                NetworkUtils.handleApiOk(str, currentTimeMillis2, null);
                return str3;
            }
            throw new HttpResponseException(execute.mo30510a(), m32064a(execute.mo30511b(), "Reason-Phrase"));
        } catch (Exception e2) {
            e = e2;
            NetworkUtils.handleApiError(str, e, System.currentTimeMillis() - j, null);
            throw e;
        }
    }

    /* renamed from: a */
    public final String mo26324a(int i, int i2, String str, byte[] bArr, String str2, String str3) throws Exception {
        return mo26325a(i, i2, str, bArr, str2, str3, null);
    }

    /* renamed from: b */
    public final String mo26351b(int i, int i2, String str, List<C19565e> list, boolean z, C19281d[] dVarArr, List<C6809a> list2) throws Exception {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (C19565e eVar : list) {
            hashMap.put(eVar.mo51722a(), eVar.mo51723b());
        }
        if (list2 != null) {
            for (C6809a aVar : list2) {
                arrayList.add(new C12461b(aVar.mo16635a(), aVar.mo16636b()));
            }
        }
        return m32066b(i, i2, str, hashMap, null, arrayList, this.f29595c, dVarArr);
    }

    /* renamed from: b */
    public final String mo26352b(int i, int i2, String str, byte[] bArr, String str2, String str3, List<C6809a> list) throws Exception {
        String str4 = str2;
        String str5 = str3;
        ArrayList arrayList = new ArrayList();
        if (str4 != null) {
            arrayList.add(new C12461b("Content-Encoding", str2));
        }
        if (str5 != null && str3.length() > 0) {
            arrayList.add(new C12461b("Content-Type", str5));
        }
        if (list != null) {
            for (C6809a aVar : list) {
                arrayList.add(new C12461b(aVar.mo16635a(), aVar.mo16636b()));
            }
        }
        byte[] bArr2 = bArr;
        return m32066b(i, i2, str, null, new TypedByteArray(str5, bArr, new String[0]), arrayList, this.f29595c, null);
    }

    /* renamed from: a */
    private String m32062a(int i, int i2, String str, Map<String, String> map, TypedOutput typedOutput, List<C12461b> list, Object obj, C19281d[] dVarArr) throws Exception {
        return m32063a("post", i, i2, str, map, typedOutput, list, obj, dVarArr);
    }

    /* renamed from: b */
    private String m32066b(int i, int i2, String str, Map<String, String> map, TypedOutput typedOutput, List<C12461b> list, Object obj, C19281d[] dVarArr) throws Exception {
        return m32063a("put", i, i2, str, map, typedOutput, list, obj, dVarArr);
    }

    /* renamed from: a */
    private String m32063a(String str, int i, int i2, String str2, Map<String, String> map, TypedOutput typedOutput, List<C12461b> list, Object obj, C19281d[] dVarArr) throws Exception {
        long j;
        C12466b bVar;
        Map<String, String> map2;
        String str3 = str;
        String str4 = str2;
        C19281d[] dVarArr2 = dVarArr;
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            return null;
        }
        if ("get".equals(str3)) {
            throw new RuntimeException("doInternal不支持get");
        } else if (!"delete".equals(str3)) {
            try {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Pair a = C10191k.m30270a(str4, (Map<String, String>) linkedHashMap);
                String str5 = (String) a.second;
                IIESNetworkApi a2 = mo26345a((String) a.first);
                if (a2 == null) {
                    return null;
                }
                if (typedOutput == null) {
                    if (map == null) {
                        map2 = new HashMap<>();
                    } else {
                        map2 = map;
                    }
                    if ("put".equals(str3)) {
                        bVar = a2.doPut(i2, str5, linkedHashMap, map2, list, obj);
                    } else {
                        bVar = a2.doPost(i2, str5, linkedHashMap, map2, list, obj);
                    }
                } else if ("put".equals(str3)) {
                    bVar = a2.putBody(i2, str5, linkedHashMap, typedOutput, list, obj);
                } else {
                    bVar = a2.postBody(i2, str5, linkedHashMap, typedOutput, list, obj);
                }
                if (dVarArr2 != null && dVarArr2.length > 0) {
                    dVarArr2[0] = new C10932a(bVar);
                }
                j = System.currentTimeMillis();
                try {
                    if (this.f29596d != null) {
                        this.f29596d.mo26343a(str4);
                    }
                    C12534t execute = bVar.execute();
                    if (this.f29596d != null) {
                        this.f29596d.mo26344a(str4, execute);
                    }
                    long currentTimeMillis = System.currentTimeMillis() - j;
                    m32064a(execute.mo30511b(), "X-TT-LOGID");
                    if (NetworkUtils.getCommandListener() != null) {
                        String a3 = NetworkUtils.getCommandListener().mo16556a();
                        if (!C6319n.m19593a(a3)) {
                            ArrayList arrayList = new ArrayList();
                            for (C12461b bVar2 : execute.mo30511b()) {
                                if (a3.equalsIgnoreCase(bVar2.f33095a)) {
                                    arrayList.add(bVar2.f33096b);
                                }
                            }
                            NetworkUtils.getCommandListener().mo16557a(arrayList);
                        }
                    }
                    if (execute.mo30512c()) {
                        String str6 = (String) execute.f33302b;
                        NetworkUtils.handleTimeStampFromResponse(str6);
                        NetworkUtils.handleApiOk(str4, currentTimeMillis, null);
                        return str6;
                    }
                    throw new HttpResponseException(execute.mo30510a(), m32064a(execute.mo30511b(), "Reason-Phrase"));
                } catch (Exception e) {
                    e = e;
                    NetworkUtils.handleApiError(str4, e, System.currentTimeMillis() - j, null);
                    throw e;
                }
            } catch (Exception e2) {
                e = e2;
                j = System.currentTimeMillis();
                NetworkUtils.handleApiError(str4, e, System.currentTimeMillis() - j, null);
                throw e;
            }
        } else {
            throw new RuntimeException("doInternal暂时不支持delete");
        }
    }
}
