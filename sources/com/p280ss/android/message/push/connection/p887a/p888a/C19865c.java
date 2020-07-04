package com.p280ss.android.message.push.connection.p887a.p888a;

import com.facebook.appevents.C13192m;
import com.p280ss.android.message.p885a.C19821g.C19822a;
import java.io.IOException;
import java.util.Map;
import org.msgpack.template.Template;

/* renamed from: com.ss.android.message.push.connection.a.a.c */
public final class C19865c extends C19866d {

    /* renamed from: a */
    public long f53864a;

    /* renamed from: b */
    public int f53865b;

    /* renamed from: c */
    public long f53866c;

    /* renamed from: d */
    public byte[] f53867d;

    /* renamed from: e */
    public long f53868e;

    /* renamed from: a */
    public final byte[] mo53236a() {
        C19822a aVar = new C19822a();
        try {
            aVar.f53785a.put("rt", Long.valueOf(this.f53868e));
            return this.f53869i.mo121875a(aVar, (Template<T>) this.f53870j);
        } catch (IOException | Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final void mo53234a(byte[] bArr) {
        try {
            Map<String, Object> map = ((C19822a) this.f53869i.mo121873a(bArr, (Template<T>) this.f53870j)).f53785a;
            if (map.containsKey("a")) {
                this.f53865b = ((Integer) map.get("a")).intValue();
            }
            if (map.containsKey(C13192m.f34940a)) {
                this.f53866c = ((Long) map.get(C13192m.f34940a)).longValue();
            }
            if (map.containsKey("ct")) {
                this.f53864a = ((Long) map.get("ct")).longValue();
            }
            if (map.containsKey("c")) {
                this.f53867d = (byte[]) map.get("c");
            }
        } catch (IOException unused) {
        } catch (Exception unused2) {
        }
    }
}
