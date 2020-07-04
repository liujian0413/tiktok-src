package com.p280ss.android.ugc.aweme.net.corenet;

import android.util.Pair;
import com.bytedance.frameworks.baselib.network.http.util.C10191k;
import com.bytedance.ies.net.cronet.C10930c.C10932a;
import com.bytedance.ies.net.cronet.IIESNetworkApi;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.C12466b;
import com.bytedance.retrofit2.mime.MultipartTypedOutput;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedFile;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.mime.TypedString;
import com.bytedance.retrofit2.p637a.C12461b;
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
import com.p280ss.android.http.legacy.C6809a;
import com.p280ss.android.http.legacy.p296a.C19565e;
import com.p280ss.android.http.legacy.p296a.C6810f;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import org.apache.http.client.RedirectHandler;

/* renamed from: com.ss.android.ugc.aweme.net.corenet.h */
public final class C34063h implements C19279b {

    /* renamed from: a */
    public final String f88834a;

    /* renamed from: b */
    public final C19279b f88835b;

    /* renamed from: a */
    public final boolean mo26327a(int i, String str, String str2, String str3, String str4, C6773c<String> cVar, String str5, C6775g gVar, List<C19565e> list, String[] strArr, int[] iArr) {
        return this.f88835b.mo26327a(i, str, str2, str3, str4, cVar, str5, gVar, list, strArr, iArr);
    }

    /* renamed from: a */
    public final boolean mo26328a(int i, String str, StringBuffer stringBuffer, StringBuffer stringBuffer2, StringBuffer stringBuffer3, C6773c<String> cVar, String str2, C6775g gVar, List<C19565e> list, String[] strArr, int[] iArr, RedirectHandler redirectHandler) {
        return this.f88835b.mo26328a(i, str, stringBuffer, stringBuffer2, stringBuffer3, cVar, str2, gVar, list, strArr, iArr, redirectHandler);
    }

    /* renamed from: a */
    public final String mo26326a(int i, String str, C19274a aVar, C19288d<Long> dVar, long j, C19281d[] dVarArr) {
        String a = this.f88835b.mo26326a(i, str, aVar, dVar, j, dVarArr);
        C7573i.m23582a((Object) a, "abOriginClient.uploadFil…sher, id, requestHolders)");
        return a;
    }

    /* renamed from: a */
    public final String mo26324a(int i, int i2, String str, byte[] bArr, String str2, String str3) {
        C7573i.m23587b(str, "url");
        return mo26325a(i, i2, str, bArr, str2, str3, null);
    }

    /* renamed from: a */
    public final String mo26325a(int i, int i2, String str, byte[] bArr, String str2, String str3, List<C6809a> list) {
        C7573i.m23587b(str, "url");
        ArrayList b = m109680b(list);
        m109679a(str2, b, str3);
        return m109677a(i2, str, (Map<String, String>) new HashMap<String,String>(), (TypedOutput) new TypedByteArray(str3, bArr, new String[0]), (List<C12461b>) b, (C19281d[]) null);
    }

    public C34063h(C19279b bVar) {
        C7573i.m23587b(bVar, "abOriginClient");
        this.f88835b = bVar;
        StringBuilder sb = new StringBuilder("https://");
        sb.append(C6399b.m19926b().f18690a);
        this.f88834a = sb.toString();
    }

    /* renamed from: a */
    private static HashMap<String, String> m109678a(List<C19565e> list) {
        HashMap<String, String> hashMap = new HashMap<>();
        if (list != null) {
            for (C19565e eVar : list) {
                Map map = hashMap;
                String a = eVar.mo51722a();
                C7573i.m23582a((Object) a, "basicNameValuePair.getName()");
                String b = eVar.mo51723b();
                C7573i.m23582a((Object) b, "basicNameValuePair.getValue()");
                map.put(a, b);
            }
        }
        return hashMap;
    }

    /* renamed from: b */
    private static ArrayList<C12461b> m109680b(List<C6809a> list) {
        boolean z;
        ArrayList<C12461b> arrayList = new ArrayList<>();
        if (list != null) {
            for (C6809a aVar : list) {
                String a = aVar.mo16635a();
                String b = aVar.mo16636b();
                if (a != null) {
                    if (a.length() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        arrayList.add(new C12461b(a, b));
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final byte[] mo26329a(int i, String str) {
        byte[] a = this.f88835b.mo26329a(i, str);
        C7573i.m23582a((Object) a, "abOriginClient.downloadFile(maxBytes, url)");
        return a;
    }

    /* renamed from: a */
    private static void m109679a(String str, ArrayList<C12461b> arrayList, String str2) {
        boolean z;
        if (str != null) {
            arrayList.add(new C12461b("Content-Encoding", str));
        }
        if (str2 != null) {
            if (str2.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                arrayList.add(new C12461b("Content-Type", str2));
            }
        }
    }

    /* renamed from: a */
    public final String mo26349a(int i, int i2, String str, List<C6809a> list) {
        C7573i.m23587b(str, "url");
        return m109677a(i2, str, (Map<String, String>) new HashMap<String,String>(), (TypedOutput) null, (List<C12461b>) m109680b(list), (C19281d[]) null);
    }

    /* renamed from: a */
    private static String m109677a(int i, String str, Map<String, String> map, TypedOutput typedOutput, List<C12461b> list, C19281d[] dVarArr) throws Exception {
        C12466b bVar;
        boolean z;
        Map linkedHashMap = new LinkedHashMap();
        Pair a = C10191k.m30270a(str, linkedHashMap);
        String str2 = (String) a.second;
        IIESNetworkApi iIESNetworkApi = (IIESNetworkApi) new RetrofitFactory().createBuilder((String) a.first).mo26430a().mo26435a(IIESNetworkApi.class);
        if (typedOutput != null) {
            bVar = iIESNetworkApi.postBody(i, str2, linkedHashMap, typedOutput, list, null);
            C7573i.m23582a((Object) bVar, "api.postBody(maxLength, …Map, body, headers, null)");
        } else {
            bVar = iIESNetworkApi.doPost(i, str2, linkedHashMap, map, list, null);
            C7573i.m23582a((Object) bVar, "api.doPost(maxLength, re… fieldMap, headers, null)");
        }
        if (dVarArr != null) {
            if (dVarArr.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                dVarArr[0] = new C10932a(bVar);
            }
        }
        T t = bVar.execute().f33302b;
        C7573i.m23582a((Object) t, "call.execute().body()");
        return (String) t;
    }

    /* renamed from: a */
    public final String mo26321a(int i, int i2, String str, List<C19565e> list, C19274a aVar, C19281d[] dVarArr) {
        C7573i.m23587b(str, "url");
        MultipartTypedOutput multipartTypedOutput = new MultipartTypedOutput();
        if (list != null) {
            for (C19565e eVar : list) {
                multipartTypedOutput.addPart(eVar.mo51722a(), new TypedString(eVar.mo51723b()));
            }
        }
        if (aVar != null) {
            for (C19277c cVar : aVar.f52170a) {
                if (cVar instanceof C19278d) {
                    Object b = cVar.mo51164b();
                    if (b != null) {
                        multipartTypedOutput.addPart(cVar.mo51163a(), new TypedString((String) b));
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
                    }
                } else if (cVar instanceof C19275a) {
                    C19275a aVar2 = (C19275a) cVar;
                    Object b2 = aVar2.mo51164b();
                    if (b2 != null) {
                        multipartTypedOutput.addPart(aVar2.mo51163a(), new TypedByteArray(null, (byte[]) b2, aVar2.f52173c));
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type kotlin.ByteArray");
                    }
                } else if (cVar instanceof C19276b) {
                    Object b3 = cVar.mo51164b();
                    if (b3 != null) {
                        multipartTypedOutput.addPart(cVar.mo51163a(), new TypedFile(null, (File) b3));
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type java.io.File");
                    }
                } else {
                    continue;
                }
            }
        }
        return m109677a(i2, str, (Map<String, String>) new HashMap<String,String>(), (TypedOutput) multipartTypedOutput, null, dVarArr);
    }

    /* renamed from: b */
    public final String mo26351b(int i, int i2, String str, List<C19565e> list, boolean z, C19281d[] dVarArr, List<C6809a> list2) {
        C7573i.m23587b(str, "url");
        return m109677a(i2, str, (Map<String, String>) m109678a(list), (TypedOutput) null, (List<C12461b>) m109680b(list2), (C19281d[]) null);
    }

    /* renamed from: b */
    public final String mo26352b(int i, int i2, String str, byte[] bArr, String str2, String str3, List<C6809a> list) {
        C7573i.m23587b(str, "url");
        ArrayList b = m109680b(list);
        m109679a(str2, b, str3);
        return m109677a(i2, str, (Map<String, String>) new HashMap<String,String>(), (TypedOutput) new TypedByteArray(str3, bArr, new String[0]), (List<C12461b>) b, (C19281d[]) null);
    }

    /* renamed from: a */
    public final String mo26323a(int i, int i2, String str, List<C19565e> list, boolean z, C19281d[] dVarArr, List<C6809a> list2) {
        C7573i.m23587b(str, "url");
        return m109677a(i2, str, (Map<String, String>) m109678a(list), (TypedOutput) null, (List<C12461b>) m109680b(list2), dVarArr);
    }

    /* renamed from: a */
    public final String mo26322a(int i, int i2, String str, List<C6809a> list, boolean z, boolean z2, C6810f fVar, boolean z3) {
        int i3 = i2;
        String str2 = str;
        T t = ((IIESNetworkApi) new RetrofitFactory().createBuilder(this.f88834a).mo26430a().mo26435a(IIESNetworkApi.class)).doGet(true, i3, str2, new HashMap(), m109680b(list), null).execute().f33302b;
        C7573i.m23582a((Object) t, "RetrofitFactory()\n      …)\n                .body()");
        return (String) t;
    }
}
