package com.twitter.sdk.android.core.models;

import com.google.gson.C6610i;
import com.google.gson.C6708j;
import com.google.gson.C6709k;
import com.google.gson.C6711m;
import com.google.gson.C6713p;
import com.google.gson.C6714q;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class BindingValuesAdapter implements C6708j<C46946c>, C6714q<C46946c> {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C6709k mo10404a(Object obj, Type type, C6713p pVar) {
        return null;
    }

    /* renamed from: a */
    private static Object m146825a(C6711m mVar, C6610i iVar) {
        C6709k b = mVar.mo16149b("type");
        if (b == null || !b.mo16134k()) {
            return null;
        }
        String c = b.mo15998c();
        char c2 = 65535;
        int hashCode = c.hashCode();
        if (hashCode != -1838656495) {
            if (hashCode != 2614219) {
                if (hashCode != 69775675) {
                    if (hashCode == 782694408 && c.equals("BOOLEAN")) {
                        c2 = 3;
                    }
                } else if (c.equals("IMAGE")) {
                    c2 = 1;
                }
            } else if (c.equals("USER")) {
                c2 = 2;
            }
        } else if (c.equals("STRING")) {
            c2 = 0;
        }
        switch (c2) {
            case 0:
                return iVar.mo16007a(mVar.mo16149b("string_value"), String.class);
            case 1:
                return iVar.mo16007a(mVar.mo16149b("image_value"), C46952i.class);
            case 2:
                return iVar.mo16007a(mVar.mo16149b("user_value"), C46964s.class);
            case 3:
                return iVar.mo16007a(mVar.mo16149b("boolean_value"), Boolean.class);
            default:
                return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public C46946c mo10405a(C6709k kVar, Type type, C6610i iVar) throws JsonParseException {
        if (!kVar.mo16133j()) {
            return new C46946c();
        }
        Set<Entry> a = kVar.mo16136m().mo16143a();
        HashMap hashMap = new HashMap(32);
        for (Entry entry : a) {
            hashMap.put((String) entry.getKey(), m146825a(((C6709k) entry.getValue()).mo16136m(), iVar));
        }
        return new C46946c(hashMap);
    }
}
