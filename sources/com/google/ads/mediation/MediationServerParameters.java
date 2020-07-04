package com.google.ads.mediation;

import com.google.android.gms.internal.ads.afm;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MediationServerParameters {

    @Target({ElementType.FIELD})
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: com.google.ads.mediation.MediationServerParameters$a */
    public @interface C6501a {
        /* renamed from: a */
        String mo15866a();

        /* renamed from: b */
        boolean mo15867b() default true;
    }

    public static final class MappingException extends Exception {
        public MappingException(String str) {
            super(str);
        }
    }

    /* renamed from: a */
    public final void mo37341a(Map<String, String> map) throws MappingException {
        Field[] fields;
        HashMap hashMap = new HashMap();
        for (Field field : getClass().getFields()) {
            C6501a aVar = (C6501a) field.getAnnotation(C6501a.class);
            if (aVar != null) {
                hashMap.put(aVar.mo15866a(), field);
            }
        }
        if (hashMap.isEmpty()) {
            afm.m45783e("No server options fields detected. To suppress this message either add a field with the @Parameter annotation, or override the load() method.");
        }
        for (Entry entry : map.entrySet()) {
            Field field2 = (Field) hashMap.remove(entry.getKey());
            if (field2 != null) {
                try {
                    field2.set(this, entry.getValue());
                } catch (IllegalAccessException unused) {
                    String str = (String) entry.getKey();
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 49);
                    sb.append("Server option \"");
                    sb.append(str);
                    sb.append("\" could not be set: Illegal Access");
                    afm.m45783e(sb.toString());
                } catch (IllegalArgumentException unused2) {
                    String str2 = (String) entry.getKey();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 43);
                    sb2.append("Server option \"");
                    sb2.append(str2);
                    sb2.append("\" could not be set: Bad Type");
                    afm.m45783e(sb2.toString());
                }
            } else {
                String str3 = (String) entry.getKey();
                String str4 = (String) entry.getValue();
                StringBuilder sb3 = new StringBuilder(String.valueOf(str3).length() + 31 + String.valueOf(str4).length());
                sb3.append("Unexpected server option: ");
                sb3.append(str3);
                sb3.append(" = \"");
                sb3.append(str4);
                sb3.append("\"");
                afm.m45777b(sb3.toString());
            }
        }
        StringBuilder sb4 = new StringBuilder();
        for (Field field3 : hashMap.values()) {
            if (((C6501a) field3.getAnnotation(C6501a.class)).mo15867b()) {
                String str5 = "Required server option missing: ";
                String valueOf = String.valueOf(((C6501a) field3.getAnnotation(C6501a.class)).mo15866a());
                afm.m45783e(valueOf.length() != 0 ? str5.concat(valueOf) : new String(str5));
                if (sb4.length() > 0) {
                    sb4.append(", ");
                }
                sb4.append(((C6501a) field3.getAnnotation(C6501a.class)).mo15866a());
            }
        }
        if (sb4.length() > 0) {
            String str6 = "Required server option(s) missing: ";
            String valueOf2 = String.valueOf(sb4.toString());
            throw new MappingException(valueOf2.length() != 0 ? str6.concat(valueOf2) : new String(str6));
        }
    }
}
