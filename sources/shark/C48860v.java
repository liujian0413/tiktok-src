package shark;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.C7573i;

/* renamed from: shark.v */
public final class C48860v {

    /* renamed from: a */
    private final LinkedHashMap<String, String> f124218a;

    /* renamed from: a */
    public final String mo123611a(String str) {
        C7573i.m23587b(str, "obfuscatedClassName");
        String str2 = (String) this.f124218a.get(str);
        if (str2 == null) {
            return str;
        }
        return str2;
    }

    /* renamed from: a */
    public final String mo123612a(String str, String str2) {
        C7573i.m23587b(str, "obfuscatedClass");
        C7573i.m23587b(str2, "obfuscatedField");
        LinkedHashMap<String, String> linkedHashMap = this.f124218a;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('.');
        sb.append(str2);
        String str3 = (String) linkedHashMap.get(sb.toString());
        if (str3 == null) {
            return str2;
        }
        return str3;
    }
}
