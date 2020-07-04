package com.p280ss.android.message.push.connection.p887a.p888a;

import com.p280ss.android.message.p885a.C19821g.C19822a;
import com.p280ss.android.ugc.aweme.tools.extract.C42323i;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.msgpack.template.Template;

/* renamed from: com.ss.android.message.push.connection.a.a.e */
public final class C19867e extends C19866d {

    /* renamed from: a */
    public List<C19868a> f53871a = new ArrayList();

    /* renamed from: com.ss.android.message.push.connection.a.a.e$a */
    public class C19868a {

        /* renamed from: a */
        public Long f53872a;

        /* renamed from: b */
        public long f53873b;

        /* renamed from: c */
        public boolean f53874c;

        public final int hashCode() {
            return this.f53872a.hashCode();
        }

        public C19868a() {
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C19868a) || obj == null) {
                return super.equals(obj);
            }
            return this.f53872a.equals(((C19868a) obj).f53872a);
        }
    }

    /* renamed from: a */
    public final void mo53234a(byte[] bArr) {
    }

    /* renamed from: a */
    public final byte[] mo53237a() {
        C19822a aVar = new C19822a();
        try {
            ArrayList arrayList = new ArrayList();
            if (this.f53871a != null && !this.f53871a.isEmpty()) {
                for (C19868a aVar2 : this.f53871a) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("a", aVar2.f53872a);
                    hashMap.put(C42323i.f110089f, Long.valueOf(aVar2.f53873b));
                    hashMap.put("e", Boolean.valueOf(aVar2.f53874c));
                    arrayList.add(hashMap);
                }
            }
            aVar.f53785a.put("as", arrayList);
            return this.f53869i.mo121875a(aVar, (Template<T>) this.f53870j);
        } catch (IOException | Exception unused) {
            return null;
        }
    }
}
