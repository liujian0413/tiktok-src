package com.bytedance.android.live.network;

import android.text.TextUtils;
import com.bytedance.android.live.base.model.NameValuePair;
import com.bytedance.android.live.core.p147c.C3166a;
import com.bytedance.android.live.network.api.INetworkService;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdkapi.host.IHostNetwork;
import com.bytedance.android.livesdkapi.p457i.C9477e;
import com.bytedance.android.livesdkapi.p457i.C9479g;
import com.bytedance.frameworks.baselib.network.http.retrofit.C10180c;
import com.bytedance.frameworks.baselib.network.http.retrofit.p514a.p515a.C10176a;
import com.bytedance.retrofit2.C12467c.C12468a;
import com.bytedance.retrofit2.C12475f.C12476a;
import com.bytedance.retrofit2.C12516p;
import com.bytedance.retrofit2.C12516p.C12518a;
import com.bytedance.retrofit2.mime.MultipartTypedOutput;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.p637a.C12459a;
import com.bytedance.retrofit2.p637a.C12459a.C12460a;
import com.bytedance.retrofit2.p637a.C12461b;
import com.bytedance.retrofit2.p637a.C12462c;
import com.bytedance.retrofit2.p637a.C12464d;
import com.bytedance.retrofit2.p637a.C12465e;
import com.bytedance.retrofit2.p638c.C12469a;
import com.bytedance.retrofit2.rxjava2.adapter.C12531g;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: com.bytedance.android.live.network.n */
final class C3469n {
    /* renamed from: a */
    static final /* synthetic */ C12459a m12831a(C12459a aVar) {
        return aVar;
    }

    /* renamed from: a */
    static C12516p m12833a() {
        IHostNetwork iHostNetwork = (IHostNetwork) C3596c.m13172a(INetworkService.class);
        C3472o oVar = new C3472o(iHostNetwork);
        C12518a aVar = new C12518a();
        StringBuilder sb = new StringBuilder("https://");
        sb.append(iHostNetwork.getHostDomain());
        return aVar.mo30502a(sb.toString()).mo30498a((C12460a) new C3473p(oVar)).mo30499a((C12468a) C12531g.m36396b()).mo30501a((C12476a) C3465j.m12825a()).mo30501a((C12476a) C3459f.m12801a(C10176a.m30238a(C3462h.f10281b.mo10448a()))).mo30500a((C12469a) ResponseInterceptor.m12775a()).mo30503a((Executor) new C10180c()).mo30504a();
    }

    /* renamed from: a */
    static final /* synthetic */ C12465e m12832a(final IHostNetwork iHostNetwork, final C12462c cVar) throws IOException {
        return new C12465e() {

            /* renamed from: c */
            private C9479g f10290c;

            /* renamed from: b */
            public final void mo10451b() {
                if (this.f10290c != null) {
                    try {
                        this.f10290c.mo23513b();
                    } catch (IOException unused) {
                    }
                }
            }

            /* renamed from: a */
            public final C12464d mo10450a() throws IOException {
                TypedInput typedByteArray;
                String str = cVar.f33097a;
                if ("GET".equals(str) || "POST".equals(str)) {
                    ArrayList arrayList = new ArrayList();
                    List<C12461b> list = cVar.f33099c;
                    if (list != null) {
                        for (C12461b bVar : list) {
                            if (((Boolean) C3464i.f10284a.mo10240a()).booleanValue() || !TextUtils.equals(bVar.f33095a, "response-format")) {
                                arrayList.add(new NameValuePair(bVar.f33095a, bVar.f33096b));
                            }
                        }
                    }
                    if (C3467l.m12829a(cVar.mo30444b()) && ((Boolean) C3464i.f10284a.mo10240a()).booleanValue()) {
                        arrayList.add(new NameValuePair("response-format", "protobuf"));
                    }
                    if (TextUtils.equals("GET", str)) {
                        this.f10290c = iHostNetwork.get(cVar.f33098b, arrayList);
                    } else {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        if (cVar.f33100d != null) {
                            cVar.f33100d.writeTo(byteArrayOutputStream);
                        }
                        if (cVar.f33100d instanceof MultipartTypedOutput) {
                            this.f10290c = iHostNetwork.uploadFile(cVar.f33103g, cVar.f33098b, arrayList, cVar.f33100d.mimeType(), byteArrayOutputStream.toByteArray(), cVar.f33100d.length(), cVar.f33100d.md5Stub());
                        } else {
                            this.f10290c = iHostNetwork.post(cVar.f33098b, arrayList, cVar.f33100d.mimeType(), byteArrayOutputStream.toByteArray());
                        }
                    }
                    final C9477e eVar = (C9477e) this.f10290c.mo23512a();
                    ArrayList arrayList2 = new ArrayList();
                    if (eVar.f25945c != null) {
                        for (NameValuePair nameValuePair : eVar.f25945c) {
                            arrayList2.add(new C12461b(nameValuePair.getName(), nameValuePair.getValue()));
                        }
                    }
                    if (cVar.f33102f) {
                        typedByteArray = new TypedInput() {
                            public final long length() throws IOException {
                                return (long) eVar.f25947e.length;
                            }

                            public final String mimeType() {
                                return eVar.f25946d;
                            }

                            /* renamed from: in */
                            public final InputStream mo10444in() throws IOException {
                                return new ByteArrayInputStream(eVar.f25947e);
                            }
                        };
                    } else {
                        typedByteArray = new TypedByteArray(eVar.f25946d, eVar.f25947e, new String[0]);
                    }
                    C12464d dVar = new C12464d(eVar.f25943a, eVar.f25944b, eVar.f25948f, arrayList2, typedByteArray);
                    return dVar;
                }
                C3166a.m11966e("RetrofitProvider", "REQUEST NOT GET OR POST");
                return null;
            }
        };
    }
}
