package com.p280ss.android.message.push.connection.p887a.p888a;

import com.p280ss.android.message.p885a.C19821g.C19822a;
import java.io.IOException;
import java.util.Map;
import org.msgpack.template.Template;

/* renamed from: com.ss.android.message.push.connection.a.a.a */
public final class C19863a extends C19866d {

    /* renamed from: a */
    public String f53854a;

    /* renamed from: b */
    public String f53855b;

    /* renamed from: a */
    public final void mo53234a(byte[] bArr) {
        if (bArr.length != 0 && this.f53869i != null) {
            try {
                C19822a aVar = (C19822a) this.f53869i.mo121873a(bArr, (Template<T>) this.f53870j);
                if (aVar != null) {
                    Map<String, Object> map = aVar.f53785a;
                    if (map != null) {
                        if (map.containsKey("en")) {
                            this.f53854a = new String((byte[]) map.get("en"));
                        }
                        if (map.containsKey("ct")) {
                            this.f53855b = new String((byte[]) map.get("em"));
                        }
                    }
                }
            } catch (IOException unused) {
            } catch (Exception unused2) {
            }
        }
    }
}
