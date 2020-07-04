package com.p280ss.sys.p1806ck.p1807a;

import android.content.Context;
import com.bytedance.retrofit2.C12466b;
import com.bytedance.retrofit2.C12474e;
import com.bytedance.retrofit2.C12534t;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.ttnet.utils.RetrofitUtils;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.p280ss.p811a.p812a.C18875a;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import org.json.JSONObject;

/* renamed from: com.ss.sys.ck.a.h */
public final class C45982h {

    /* renamed from: c */
    private static String f117512c = "";

    /* renamed from: a */
    public Context f117513a;

    /* renamed from: b */
    public String f117514b = "";

    public C45982h(Context context) {
        this.f117513a = context;
        StringBuilder sb = new StringBuilder();
        sb.append(C18875a.m61612c());
        sb.append("/report");
        this.f117514b = sb.toString();
    }

    /* renamed from: a */
    public final void mo111333a(byte[] bArr) {
        ((C45981g) RetrofitUtils.m37904b(this.f117514b).mo30492a(C45981g.class)).mo111331a(this.f117514b, new TypedByteArray("application/json; charset=utf-8", bArr, new String[0])).enqueue(new C12474e<TypedInput>() {
            /* renamed from: a */
            public final void mo26463a(C12466b<TypedInput> bVar, C12534t<TypedInput> tVar) {
                boolean z;
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    byte[] bArr = new byte[PreloadTask.BYTE_UNIT_NUMBER];
                    InputStream in = ((TypedInput) tVar.f33302b).mo10444in();
                    while (true) {
                        z = false;
                        int read = in.read(bArr, 0, PreloadTask.BYTE_UNIT_NUMBER);
                        if (read <= 0) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, read);
                    }
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    if (byteArray != null && new JSONObject(new String(byteArray)).getInt("code") == 200) {
                        z = true;
                    }
                    C45978e.m144163a(C45977d.f117505b, "<?");
                    if (z) {
                        C45978e.m144163a(C45977d.f117506c, "<?");
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
