package com.p280ss.sys.p1806ck.p1807a;

import android.content.Context;
import com.bytedance.retrofit2.C12466b;
import com.bytedance.retrofit2.C12474e;
import com.bytedance.retrofit2.C12534t;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.p637a.C12461b;
import com.bytedance.ttnet.utils.RetrofitUtils;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.p280ss.p811a.p812a.C18875a;
import com.p280ss.sys.p1806ck.C45987b;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.sys.ck.a.i */
public final class C45984i {

    /* renamed from: d */
    private static String f117516d = "";

    /* renamed from: a */
    public String f117517a = "";

    /* renamed from: b */
    public Context f117518b;

    /* renamed from: c */
    public String f117519c = "";

    public C45984i(Context context, String str, String str2) {
        if (str == null || str.length() <= 0) {
            str = "";
        }
        this.f117517a = str;
        this.f117518b = context;
        if (str2 == null || str2.length() <= 0) {
            str2 = "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(C18875a.m61613c(0));
        sb.append("/v.s");
        sb.append(str2);
        this.f117519c = sb.toString();
    }

    /* renamed from: a */
    public final void mo111334a() {
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder("sessionid=");
        sb.append(this.f117517a);
        arrayList.add(new C12461b("Cookie", sb.toString()));
        ((C45981g) RetrofitUtils.m37904b(this.f117519c).mo30492a(C45981g.class)).mo111332a(this.f117519c, (List<C12461b>) arrayList).enqueue(new C12474e<TypedInput>() {
            /* renamed from: a */
            public final void mo26463a(C12466b<TypedInput> bVar, C12534t<TypedInput> tVar) {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    byte[] bArr = new byte[PreloadTask.BYTE_UNIT_NUMBER];
                    InputStream in = ((TypedInput) tVar.f33302b).mo10444in();
                    while (true) {
                        int read = in.read(bArr, 0, PreloadTask.BYTE_UNIT_NUMBER);
                        if (read <= 0) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, read);
                    }
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    if (byteArray != null) {
                        C45987b.m144182a(new String(byteArray));
                    }
                } catch (Throwable unused) {
                }
            }

            /* renamed from: a */
            public final void mo26464a(C12466b<TypedInput> bVar, Throwable th) {
            }
        });
    }
}
