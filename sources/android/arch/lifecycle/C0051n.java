package android.arch.lifecycle;

import java.util.HashMap;
import java.util.Map;

/* renamed from: android.arch.lifecycle.n */
public final class C0051n {

    /* renamed from: a */
    private Map<String, Integer> f93a = new HashMap();

    /* renamed from: a */
    public final boolean mo124a(String str, int i) {
        int i2;
        boolean z;
        Integer num = (Integer) this.f93a.get(str);
        if (num != null) {
            i2 = num.intValue();
        } else {
            i2 = 0;
        }
        if ((i2 & i) != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f93a.put(str, Integer.valueOf(i | i2));
        if (!z) {
            return true;
        }
        return false;
    }
}
