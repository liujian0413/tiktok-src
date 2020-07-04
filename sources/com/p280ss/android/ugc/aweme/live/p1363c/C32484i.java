package com.p280ss.android.ugc.aweme.live.p1363c;

import com.bytedance.android.live.base.model.NameValuePair;
import com.bytedance.android.live.base.model.exception.NetworkErrorException;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdkapi.host.IHostNetwork;
import com.bytedance.android.livesdkapi.p457i.C9477e;
import com.bytedance.android.livesdkapi.p457i.C9479g;
import com.bytedance.frameworks.baselib.network.http.cronet.impl.CronetIOException;
import com.bytedance.retrofit2.C12466b;
import com.bytedance.retrofit2.C12534t;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.p637a.C12461b;
import com.p280ss.android.common.applog.NetUtil;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.live.C32430a;
import com.p280ss.android.ugc.aweme.notice.repo.TutorialVideoApiManager;
import com.p280ss.android.ugc.aweme.ttlive.ILiveApi;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.live.c.i */
public final class C32484i implements IHostNetwork {

    /* renamed from: a */
    private ILiveApi f84729a = ((ILiveApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(TutorialVideoApiManager.f89507a).create(ILiveApi.class));

    /* renamed from: com.ss.android.ugc.aweme.live.c.i$a */
    static class C32486a implements C9479g<C9477e> {

        /* renamed from: a */
        private C12466b<TypedInput> f84735a;

        /* renamed from: b */
        public final void mo23513b() {
            this.f84735a.cancel();
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public C9477e mo23512a() throws IOException {
            TypedInput typedInput;
            String str;
            try {
                C12534t execute = this.f84735a.execute();
                byte[] bArr = null;
                if (execute.f33302b != null) {
                    typedInput = (TypedInput) execute.f33302b;
                } else if (execute.f33303c != null) {
                    typedInput = (TypedInput) execute.f33302b;
                } else {
                    typedInput = null;
                }
                if (typedInput != null) {
                    if (typedInput instanceof TypedByteArray) {
                        bArr = ((TypedByteArray) typedInput).getBytes();
                    } else {
                        bArr = C32484i.m105238a(typedInput.mo10444in());
                    }
                }
                String str2 = "";
                if (execute.f33301a != null) {
                    String str3 = execute.f33301a.f33120c;
                    str = str3;
                    str2 = execute.f33301a.f33118a;
                } else {
                    str = "no reason";
                }
                List<C12461b> b = execute.mo30511b();
                ArrayList arrayList = new ArrayList();
                for (C12461b bVar : b) {
                    arrayList.add(new NameValuePair(bVar.f33095a, bVar.f33096b));
                }
                C9477e a = new C9477e().mo23511c(str2).mo23506a(execute.mo30510a()).mo23507a(str).mo23508a((List<NameValuePair>) arrayList).mo23509a(bArr);
                if (typedInput != null) {
                    a.mo23510b(typedInput.mimeType());
                }
                return a;
            } catch (Exception e) {
                if (e instanceof CronetIOException) {
                    CronetIOException cronetIOException = (CronetIOException) e;
                    throw new NetworkErrorException(cronetIOException.getStatusCode(), cronetIOException.getMessage());
                } else if (e instanceof IOException) {
                    throw ((IOException) e);
                } else {
                    throw new IOException(e);
                }
            }
        }

        C32486a(C12466b<TypedInput> bVar) {
            this.f84735a = bVar;
        }
    }

    public final String getHostDomain() {
        return C32430a.m105063b();
    }

    public final Map<String, String> getCommonParams() {
        HashMap hashMap = new HashMap();
        NetUtil.putCommonParams(hashMap, false);
        return hashMap;
    }

    public C32484i() {
        C3596c.m13174a(IHostNetwork.class, this);
    }

    /* renamed from: a */
    public static byte[] m105238a(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (inputStream != null) {
            byte[] bArr = new byte[4096];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: a */
    private static Map<String, String> m105237a(List<NameValuePair> list) {
        HashMap hashMap = new HashMap();
        if (list != null) {
            for (NameValuePair nameValuePair : list) {
                hashMap.put(nameValuePair.getName(), nameValuePair.getValue());
            }
        }
        return hashMap;
    }

    public final C9479g<C9477e> get(String str, List<NameValuePair> list) throws IOException {
        return new C32486a(this.f84729a.get(str, m105237a(list)));
    }

    public final C9479g<C9477e> post(String str, List<NameValuePair> list, String str2, byte[] bArr) throws IOException {
        return new C32486a(this.f84729a.post(str, new TypedByteArray(str2, bArr, new String[0]), m105237a(list)));
    }

    public final C9479g<C9477e> downloadFile(boolean z, int i, String str, List<NameValuePair> list, Object obj) throws IOException {
        return new C32486a(this.f84729a.downloadFile(z, i, str, m105237a(list), obj));
    }

    public final C9479g<C9477e> uploadFile(int i, String str, List<NameValuePair> list, String str2, byte[] bArr, long j, String str3) throws IOException {
        Map a = m105237a(list);
        ILiveApi iLiveApi = this.f84729a;
        final String str4 = str2;
        final long j2 = j;
        final byte[] bArr2 = bArr;
        final String str5 = str3;
        C324851 r1 = new TypedOutput() {
            public final String fileName() {
                return null;
            }

            public final long length() {
                return j2;
            }

            public final String md5Stub() {
                return str5;
            }

            public final String mimeType() {
                return str4;
            }

            public final void writeTo(OutputStream outputStream) throws IOException {
                outputStream.write(bArr2);
            }
        };
        int i2 = i;
        String str6 = str;
        return new C32486a(iLiveApi.postMultiPart(i, str, a, r1));
    }
}
