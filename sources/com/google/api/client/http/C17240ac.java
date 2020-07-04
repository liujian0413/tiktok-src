package com.google.api.client.http;

import com.google.api.client.util.C17349ad;
import com.google.api.client.util.C17350ae;
import com.google.api.client.util.C17353b;
import com.google.api.client.util.C17361f;
import com.google.api.client.util.C17362g;
import com.google.api.client.util.C17366i;
import com.google.api.client.util.C17371k;
import com.google.api.client.util.C17379u;
import com.google.api.client.util.C17384w;
import com.google.api.client.util.GenericData;
import com.google.api.client.util.p782a.C17340a;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.api.client.http.ac */
public final class C17240ac implements C17379u {

    /* renamed from: a */
    public static final String f48050a = new C17265n("application/x-www-form-urlencoded").mo44635a(C17361f.f48275a).mo44636a();

    /* renamed from: a */
    private <T> T m57312a(Reader reader, Class<T> cls) throws IOException {
        return m57313a(reader, (Type) cls);
    }

    /* renamed from: a */
    private static Object m57313a(Reader reader, Type type) throws IOException {
        C17384w.m57851a(type instanceof Class, (Object) "dataType has to be of type Class<?>");
        Object a = C17350ae.m57778a((Class) type);
        m57315a((Reader) new BufferedReader(reader), a);
        return a;
    }

    /* renamed from: a */
    public static void m57316a(String str, Object obj) {
        if (str != null) {
            try {
                m57315a((Reader) new StringReader(str), obj);
            } catch (IOException e) {
                throw C17349ad.m57773a(e);
            }
        }
    }

    /* renamed from: a */
    private static void m57315a(Reader reader, Object obj) throws IOException {
        GenericData genericData;
        Map map;
        int read;
        Type type;
        Object obj2 = obj;
        Class cls = obj.getClass();
        C17362g a = C17362g.m57798a(cls);
        List asList = Arrays.asList(new Type[]{cls});
        if (GenericData.class.isAssignableFrom(cls)) {
            genericData = (GenericData) obj2;
        } else {
            genericData = null;
        }
        if (Map.class.isAssignableFrom(cls)) {
            map = (Map) obj2;
        } else {
            map = null;
        }
        C17353b bVar = new C17353b(obj2);
        StringWriter stringWriter = new StringWriter();
        StringWriter stringWriter2 = new StringWriter();
        do {
            StringWriter stringWriter3 = stringWriter2;
            StringWriter stringWriter4 = stringWriter;
            boolean z = true;
            while (true) {
                read = reader.read();
                if (read == -1 || read == 38) {
                    String b = C17340a.m57753b(stringWriter4.toString());
                } else if (read == 61) {
                    z = false;
                } else if (z) {
                    stringWriter4.write(read);
                } else {
                    stringWriter3.write(read);
                }
            }
            String b2 = C17340a.m57753b(stringWriter4.toString());
            if (b2.length() != 0) {
                String b3 = C17340a.m57753b(stringWriter3.toString());
                C17371k a2 = a.mo44831a(b2);
                if (a2 != null) {
                    Type a3 = C17366i.m57809a(asList, a2.mo44856a());
                    if (C17350ae.m57785a(a3)) {
                        Class a4 = C17350ae.m57775a(asList, C17350ae.m57786b(a3));
                        bVar.mo44819a(a2.f48313b, a4, m57314a((Type) a4, asList, b3));
                    } else if (C17350ae.m57784a(C17350ae.m57775a(asList, a3), Iterable.class)) {
                        Collection collection = (Collection) a2.mo44855a(obj2);
                        if (collection == null) {
                            collection = C17366i.m57813b(a3);
                            a2.mo44857a(obj2, (Object) collection);
                        }
                        if (a3 == Object.class) {
                            type = null;
                        } else {
                            type = C17350ae.m57787c(a3);
                        }
                        collection.add(m57314a(type, asList, b3));
                    } else {
                        a2.mo44857a(obj2, m57314a(a3, asList, b3));
                    }
                } else if (map != null) {
                    ArrayList arrayList = (ArrayList) map.get(b2);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        if (genericData != null) {
                            genericData.mo44448c(b2, arrayList);
                        } else {
                            map.put(b2, arrayList);
                        }
                    }
                    arrayList.add(b3);
                }
            }
            stringWriter = new StringWriter();
            stringWriter2 = new StringWriter();
        } while (read != -1);
        bVar.mo44818a();
    }

    /* renamed from: a */
    private static Object m57314a(Type type, List<Type> list, String str) {
        return C17366i.m57808a(C17366i.m57809a(list, type), str);
    }

    /* renamed from: a */
    public final <T> T mo44592a(InputStream inputStream, Charset charset, Class<T> cls) throws IOException {
        return m57312a((Reader) new InputStreamReader(inputStream, charset), cls);
    }
}
