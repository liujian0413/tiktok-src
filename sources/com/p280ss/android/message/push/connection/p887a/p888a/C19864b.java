package com.p280ss.android.message.push.connection.p887a.p888a;

import com.p280ss.android.message.p885a.C19821g.C19822a;
import com.p280ss.android.socialbase.downloader.impls.C20318n;
import com.p280ss.android.ugc.aweme.tools.extract.C42323i;
import java.io.IOException;
import java.util.Map;
import org.msgpack.template.Template;

/* renamed from: com.ss.android.message.push.connection.a.a.b */
public final class C19864b extends C19866d {

    /* renamed from: a */
    public byte f53856a;

    /* renamed from: b */
    public byte f53857b;

    /* renamed from: c */
    public long f53858c;

    /* renamed from: d */
    public long f53859d;

    /* renamed from: e */
    public double f53860e;

    /* renamed from: f */
    public double f53861f;

    /* renamed from: g */
    public String f53862g;

    /* renamed from: h */
    public int f53863h = -1;

    /* renamed from: a */
    public final byte[] mo53235a() {
        C19822a aVar = new C19822a();
        try {
            aVar.f53785a.put("v", Byte.valueOf(this.f53856a));
            aVar.f53785a.put(C20318n.f54884f, Byte.valueOf(this.f53857b));
            aVar.f53785a.put("d", Long.valueOf(this.f53858c));
            aVar.f53785a.put(C42323i.f110089f, Long.valueOf(this.f53859d));
            aVar.f53785a.put("lo", Double.valueOf(this.f53860e));
            aVar.f53785a.put("la", Double.valueOf(this.f53861f));
            aVar.f53785a.put("c", this.f53862g);
            return this.f53869i.mo121875a(aVar, (Template<T>) this.f53870j);
        } catch (IOException | Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final void mo53234a(byte[] bArr) {
        try {
            Map<String, Object> map = ((C19822a) this.f53869i.mo121873a(bArr, (Template<T>) this.f53870j)).f53785a;
            if (map.containsKey("h")) {
                this.f53863h = ((Integer) map.get("h")).intValue();
            }
        } catch (IOException unused) {
        } catch (Exception unused2) {
        }
    }
}
