package androidx.work;

import androidx.work.C1458e.C1459a;
import java.util.HashMap;
import java.util.List;

public final class OverwritingInputMerger extends C1460f {
    /* renamed from: a */
    public final C1458e mo6664a(List<C1458e> list) {
        C1459a aVar = new C1459a();
        HashMap hashMap = new HashMap();
        for (C1458e a : list) {
            hashMap.putAll(a.mo6692a());
        }
        aVar.mo6695a(hashMap);
        return aVar.mo6696a();
    }
}
