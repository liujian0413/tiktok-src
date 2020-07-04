package com.twitter.sdk.android.core.models;

import com.google.gson.p276a.C6593c;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.twitter.sdk.android.core.models.f */
class C46949f implements Serializable {
    @C6593c(mo15949a = "indices")
    public final List<Integer> indices;

    public int getEnd() {
        return ((Integer) this.indices.get(1)).intValue();
    }

    public int getStart() {
        return ((Integer) this.indices.get(0)).intValue();
    }

    C46949f(int i, int i2) {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(0, Integer.valueOf(i));
        arrayList.add(1, Integer.valueOf(i2));
        this.indices = Collections.unmodifiableList(arrayList);
    }
}
