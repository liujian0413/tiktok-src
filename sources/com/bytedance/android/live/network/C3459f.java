package com.bytedance.android.live.network;

import android.text.TextUtils;
import com.bytedance.android.live.base.model.Extra;
import com.bytedance.android.live.network.api.INetworkService;
import com.bytedance.android.live.network.response.C3474a;
import com.bytedance.android.live.network.response.C3477b;
import com.bytedance.android.live.network.response.C3478c;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.live.network.response.RequestError;
import com.bytedance.android.live.network.response.p167a.C3475a;
import com.bytedance.android.live.network.response.p167a.C3476b;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdkapi.p457i.C9477e;
import com.bytedance.android.p109c.p110a.p111a.C2267d;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;
import com.bytedance.frameworks.baselib.network.http.retrofit.p514a.p515a.C10176a;
import com.bytedance.retrofit2.C12475f;
import com.bytedance.retrofit2.C12475f.C12476a;
import com.bytedance.retrofit2.C12516p;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.p264b.C6457h;
import com.bytedance.retrofit2.p264b.C6468s;
import com.google.gson.C6709k;
import com.google.gson.C6711m;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* renamed from: com.bytedance.android.live.network.f */
public final class C3459f extends C12476a {

    /* renamed from: a */
    private ThreadLocal<C2272g> f10268a = new ThreadLocal<>();

    /* renamed from: b */
    private C10176a f10269b;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Object mo10443a(Class cls, Class[] clsArr, String str, Type type, Annotation[] annotationArr, C12516p pVar, TypedInput typedInput) throws IOException {
        C3477b bVar;
        C3474a b;
        Class cls2 = cls;
        if (TextUtils.equals(typedInput.mimeType(), "application/x-protobuf")) {
            C2272g a = m12800a(typedInput.mo10444in());
            C3476b a2 = C3476b.m12840a(a);
            a.mo8057a(C2267d.m9756a(a2.f10305b));
            C3474a aVar = null;
            if (cls2 == C3479d.class) {
                try {
                    bVar = m12804a(clsArr[0], a, a2.f10304a);
                } catch (IOException e) {
                    throw e;
                } catch (Exception e2) {
                    throw new IOException(e2);
                }
            } else {
                if (cls2 == C3478c.class) {
                    b = m12808b(clsArr[0], a, a2.f10304a);
                } else if (cls2 == C3477b.class) {
                    bVar = m12803a(clsArr[0], clsArr[1], a, a2.f10304a);
                } else {
                    b = m12807b(clsArr[0], clsArr[1], a, a2.f10304a);
                }
                aVar = b;
                bVar = null;
            }
            if (bVar != null) {
                if (!((Boolean) C3464i.f10285b.mo10240a()).booleanValue()) {
                    return bVar;
                }
                return m12805a(bVar.statusCode, bVar.data, (S) bVar.extra, str, type, annotationArr, pVar);
            } else if (!((Boolean) C3464i.f10285b.mo10240a()).booleanValue()) {
                return aVar;
            } else {
                return m12805a(aVar.f10295a, (T) aVar.f10296b, (S) aVar.f10297c, str, type, annotationArr, pVar);
            }
        } else {
            Type type2 = type;
            return m12809e(type, annotationArr, pVar).mo10447a(typedInput);
        }
    }

    /* renamed from: a */
    static C3459f m12801a(C10176a aVar) {
        return new C3459f(aVar);
    }

    private C3459f(C10176a aVar) {
        this.f10269b = aVar;
    }

    /* renamed from: a */
    private C2272g m12800a(InputStream inputStream) {
        C2272g gVar = (C2272g) this.f10268a.get();
        if (gVar == null) {
            gVar = new C2272g();
            this.f10268a.set(gVar);
        }
        gVar.mo8057a(C2267d.m9755a(inputStream));
        return gVar;
    }

    /* renamed from: a */
    private static RequestError m12802a(C3475a aVar) {
        RequestError requestError = new RequestError();
        requestError.message = aVar.f10300b;
        requestError.prompts = aVar.f10301c;
        requestError.alert = aVar.f10302d;
        return requestError;
    }

    /* renamed from: a */
    private static void m12806a(Extra extra, C3475a aVar) {
        extra.now = aVar.f10303e;
    }

    /* renamed from: e */
    private C12475f<TypedInput, ?> m12809e(Type type, Annotation[] annotationArr, C12516p pVar) {
        return this.f10269b.mo10441a(type, annotationArr, pVar);
    }

    /* renamed from: a */
    private static C3479d m12804a(Class cls, C2272g gVar, C3475a aVar) throws Exception {
        C3479d dVar = new C3479d();
        dVar.statusCode = aVar.f10299a;
        Extra extra = new Extra();
        m12806a(extra, aVar);
        dVar.extra = extra;
        if (aVar.f10299a == 0) {
            long a = gVar.mo8056a();
            while (true) {
                int b = gVar.mo8059b();
                if (b == -1) {
                    break;
                } else if (b == 1) {
                    dVar.data = ((INetworkService) C3596c.m13172a(INetworkService.class)).getProtoDecoder(cls).decode(gVar);
                } else {
                    C2273h.m9789g(gVar);
                }
            }
            gVar.mo8058a(a);
        } else {
            dVar.error = m12802a(aVar);
        }
        return dVar;
    }

    /* renamed from: b */
    private static C3478c m12808b(Class cls, C2272g gVar, C3475a aVar) throws Exception {
        C3478c cVar = new C3478c();
        cVar.f10295a = aVar.f10299a;
        Extra extra = new Extra();
        m12806a(extra, aVar);
        cVar.f10297c = extra;
        cVar.f10296b = new ArrayList();
        if (aVar.f10299a == 0) {
            long a = gVar.mo8056a();
            while (true) {
                int b = gVar.mo8059b();
                if (b == -1) {
                    break;
                } else if (b == 1) {
                    cVar.f10296b.add(((INetworkService) C3596c.m13172a(INetworkService.class)).getProtoDecoder(cls).decode(gVar));
                } else {
                    C2273h.m9789g(gVar);
                }
            }
            gVar.mo8058a(a);
        } else {
            cVar.f10298d = m12802a(aVar);
        }
        return cVar;
    }

    /* renamed from: a */
    public final C12475f<TypedInput, ?> mo10441a(Type type, Annotation[] annotationArr, C12516p pVar) {
        if (!(type instanceof ParameterizedType)) {
            return m12809e(type, annotationArr, pVar);
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        Type rawType = parameterizedType.getRawType();
        if (!(rawType instanceof Class)) {
            return m12809e(type, annotationArr, pVar);
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        Class[] clsArr = new Class[2];
        int i = 0;
        if (actualTypeArguments.length > 0) {
            if (!(actualTypeArguments[0] instanceof Class)) {
                return m12809e(type, annotationArr, pVar);
            }
            clsArr[0] = (Class) actualTypeArguments[0];
        }
        if (actualTypeArguments.length == 2) {
            if (!(actualTypeArguments[1] instanceof Class)) {
                return m12809e(type, annotationArr, pVar);
            }
            clsArr[1] = (Class) actualTypeArguments[1];
        } else if (actualTypeArguments.length > 2) {
            return m12809e(type, annotationArr, pVar);
        }
        Class<C3474a> cls = (Class) rawType;
        if (cls != C3479d.class && cls != C3478c.class && cls != C3477b.class && cls != C3474a.class) {
            return m12809e(type, annotationArr, pVar);
        }
        String str = null;
        int length = annotationArr.length;
        while (true) {
            if (i >= length) {
                break;
            }
            C6468s sVar = annotationArr[i];
            if (sVar instanceof C6457h) {
                str = ((C6457h) sVar).mo15740a();
                break;
            } else if (sVar instanceof C6468s) {
                str = sVar.mo15750a();
                break;
            } else {
                i++;
            }
        }
        C3461g gVar = new C3461g(this, cls, clsArr, str, type, annotationArr, pVar);
        return gVar;
    }

    /* renamed from: a */
    private static C3477b m12803a(Class cls, Class cls2, C2272g gVar, C3475a aVar) throws Exception {
        C3477b bVar = new C3477b();
        bVar.statusCode = aVar.f10299a;
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        bVar.data = ((INetworkService) C3596c.m13172a(INetworkService.class)).getProtoDecoder(cls).decode(gVar);
                        break;
                    case 2:
                        bVar.extra = (Extra) ((INetworkService) C3596c.m13172a(INetworkService.class)).getProtoDecoder(cls2).decode(gVar);
                        m12806a(bVar.extra, aVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                if (aVar.f10299a != 0) {
                    bVar.error = m12802a(aVar);
                }
                return bVar;
            }
        }
    }

    /* renamed from: b */
    private static C3474a m12807b(Class cls, Class cls2, C2272g gVar, C3475a aVar) throws Exception {
        C3474a aVar2 = new C3474a();
        aVar2.f10295a = aVar.f10299a;
        aVar2.f10296b = new ArrayList();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        aVar2.f10296b.add(((INetworkService) C3596c.m13172a(INetworkService.class)).getProtoDecoder(cls).decode(gVar));
                        break;
                    case 2:
                        aVar2.f10297c = (Extra) ((INetworkService) C3596c.m13172a(INetworkService.class)).getProtoDecoder(cls2).decode(gVar);
                        m12806a(aVar2.f10297c, aVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                if (aVar.f10299a != 0) {
                    aVar2.f10298d = m12802a(aVar);
                }
                return aVar2;
            }
        }
    }

    /* renamed from: a */
    public final C12475f<?, TypedOutput> mo10442a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, C12516p pVar) {
        return this.f10269b.mo10442a(type, annotationArr, annotationArr2, pVar);
    }

    /* renamed from: a */
    private <T, S> Object m12805a(int i, T t, S s, String str, Type type, Annotation[] annotationArr, C12516p pVar) throws Exception {
        C6711m mVar = new C6711m();
        mVar.mo16146a("status_code", (Number) Integer.valueOf(i));
        mVar.mo16144a("data", C3462h.f10281b.mo10448a().mo15963a((Object) t));
        mVar.mo16144a("extra", C3462h.f10281b.mo10448a().mo15963a((Object) s));
        INetworkService iNetworkService = (INetworkService) C3596c.m13172a(INetworkService.class);
        StringBuilder sb = new StringBuilder("https://board.bytedance.net/api/json/");
        sb.append(str);
        final ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(new String(((C9477e) iNetworkService.post(sb.toString(), new ArrayList(), "application/json", C3462h.f10281b.mo10448a().mo15976a((C6709k) mVar).getBytes()).mo23512a()).f25947e).getBytes(Charset.forName("UTF-8")));
        return m12809e(type, annotationArr, pVar).mo10447a(new TypedInput() {
            /* renamed from: in */
            public final InputStream mo10444in() {
                return byteArrayInputStream;
            }

            public final String mimeType() {
                return "application/json";
            }

            public final long length() throws IOException {
                return (long) byteArrayInputStream.available();
            }
        });
    }
}
