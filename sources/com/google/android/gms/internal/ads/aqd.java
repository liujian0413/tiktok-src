package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.atq.C15529b;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public final class aqd<P> {

    /* renamed from: c */
    private static final Charset f40905c = Charset.forName("UTF-8");

    /* renamed from: a */
    public aqe<P> f40906a;

    /* renamed from: b */
    public final Class<P> f40907b;

    /* renamed from: d */
    private ConcurrentMap<String, List<aqe<P>>> f40908d = new ConcurrentHashMap();

    private aqd(Class<P> cls) {
        this.f40907b = cls;
    }

    /* renamed from: a */
    public static <P> aqd<P> m46895a(Class<P> cls) {
        return new aqd<>(cls);
    }

    /* renamed from: a */
    public final aqe<P> mo39948a(P p, C15529b bVar) throws GeneralSecurityException {
        byte[] bArr;
        switch (bVar.mo40032d()) {
            case LEGACY:
            case CRUNCHY:
                bArr = ByteBuffer.allocate(5).put(0).putInt(bVar.zzfmz).array();
                break;
            case TINK:
                bArr = ByteBuffer.allocate(5).put(1).putInt(bVar.zzfmz).array();
                break;
            case RAW:
                bArr = apr.f40896a;
                break;
            default:
                throw new GeneralSecurityException("unknown output prefix type");
        }
        aqe<P> aqe = new aqe<>(p, bArr, bVar.mo40031c(), bVar.mo40032d());
        ArrayList arrayList = new ArrayList();
        arrayList.add(aqe);
        String str = new String(aqe.mo39949a(), f40905c);
        List list = (List) this.f40908d.put(str, Collections.unmodifiableList(arrayList));
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(list);
            arrayList2.add(aqe);
            this.f40908d.put(str, Collections.unmodifiableList(arrayList2));
        }
        return aqe;
    }
}
