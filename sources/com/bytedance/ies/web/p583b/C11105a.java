package com.bytedance.ies.web.p583b;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7561a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ies.web.b.a */
public final class C11105a {

    /* renamed from: a */
    public boolean f30175a;

    /* renamed from: b */
    public final LinkedHashMap<String, List<C11141q>> f30176b = new LinkedHashMap<>();

    /* renamed from: c */
    public final C11108c f30177c;

    /* renamed from: d */
    private final Executor f30178d;

    /* renamed from: com.bytedance.ies.web.b.a$a */
    static final class C11106a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C11105a f30179a;

        /* renamed from: b */
        final /* synthetic */ C7561a f30180b;

        C11106a(C11105a aVar, C7561a aVar2) {
            this.f30179a = aVar;
            this.f30180b = aVar2;
        }

        public final void run() {
            this.f30179a.f30176b.clear();
            for (String str : this.f30179a.f30177c.mo11521a()) {
                try {
                    this.f30179a.mo27078a(new JSONObject(str));
                } catch (JSONException e) {
                    StringBuilder sb = new StringBuilder("Failed to parse JSONObject: ");
                    sb.append(str);
                    C11115h.m32557b(sb.toString(), e);
                }
            }
            this.f30179a.f30175a = true;
            C11115h.m32554a("ConfigManager initialized successfully.");
            this.f30180b.invoke();
        }
    }

    /* renamed from: a */
    public final void mo27077a(C7561a<C7581n> aVar) {
        C7573i.m23587b(aVar, "onSucceed");
        if (this.f30175a) {
            aVar.invoke();
        } else {
            this.f30178d.execute(new C11106a(this, aVar));
        }
    }

    /* renamed from: a */
    public final List<C11141q> mo27076a(String str) {
        C7573i.m23587b(str, "baseUrl");
        Set<Entry> entrySet = this.f30176b.entrySet();
        C7573i.m23582a((Object) entrySet, "configMap.entries");
        for (Entry entry : entrySet) {
            if (C7573i.m23585a((Object) str, (Object) (String) entry.getKey())) {
                return (List) entry.getValue();
            }
        }
        return null;
    }

    /* renamed from: a */
    public final void mo27078a(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject.getJSONObject("configs");
        Iterator keys = jSONObject2.keys();
        C7573i.m23582a((Object) keys, "configListMap.keys()");
        while (keys.hasNext()) {
            String str = (String) keys.next();
            LinkedList linkedList = new LinkedList();
            Map map = this.f30176b;
            C7573i.m23582a((Object) str, "it");
            map.put(str, linkedList);
            JSONArray jSONArray = jSONObject2.getJSONArray(str);
            int i = 0;
            int length = jSONArray.length();
            while (true) {
                if (i < length) {
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                    try {
                        C11141q qVar = new C11141q();
                        String string = jSONObject3.getString("url");
                        C7573i.m23582a((Object) string, "configObject.getString(\"url\")");
                        qVar.mo27121a(string);
                        String string2 = jSONObject3.getString("method");
                        C7573i.m23582a((Object) string2, "configObject.getString(\"method\")");
                        Locale locale = Locale.ROOT;
                        C7573i.m23582a((Object) locale, "Locale.ROOT");
                        if (string2 != null) {
                            String lowerCase = string2.toLowerCase(locale);
                            C7573i.m23582a((Object) lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                            qVar.mo27125b(lowerCase);
                            qVar.f30245c = jSONObject3.getLong("expires");
                            C7573i.m23582a((Object) jSONObject3, "configObject");
                            qVar.mo27122a(m32518a(jSONObject3, "conditions"));
                            qVar.mo27123a(m32519b(jSONObject3, "headers"));
                            qVar.mo27126b(m32520c(jSONObject3, "params"));
                            qVar.mo27128c(m32520c(jSONObject3, "data"));
                            linkedList.add(qVar);
                            i++;
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                        }
                    } catch (JSONException e) {
                        StringBuilder sb = new StringBuilder("Failed to parse config at ");
                        sb.append(i);
                        sb.append(": ");
                        sb.append(jSONObject3);
                        C11115h.m32555a(sb.toString(), e);
                    }
                }
            }
        }
    }

    public C11105a(Executor executor, C11108c cVar) {
        C7573i.m23587b(executor, "workerExecutor");
        C7573i.m23587b(cVar, "configProvider");
        this.f30178d = executor;
        this.f30177c = cVar;
    }

    /* renamed from: a */
    private static List<String> m32518a(JSONObject jSONObject, String str) {
        LinkedList linkedList = new LinkedList();
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            return linkedList;
        }
        int length = optJSONArray.length();
        for (int i = 0; i < length; i++) {
            linkedList.add(optJSONArray.getString(i));
        }
        return linkedList;
    }

    /* renamed from: b */
    private static SortedMap<String, String> m32519b(JSONObject jSONObject, String str) {
        TreeMap treeMap = new TreeMap();
        JSONObject optJSONObject = jSONObject.optJSONObject(str);
        if (optJSONObject == null) {
            return treeMap;
        }
        Iterator keys = optJSONObject.keys();
        C7573i.m23582a((Object) keys, "objectMap.keys()");
        while (keys.hasNext()) {
            String str2 = (String) keys.next();
            Map map = treeMap;
            C7573i.m23582a((Object) str2, "it");
            String string = optJSONObject.getString(str2);
            C7573i.m23582a((Object) string, "objectMap.getString(it)");
            map.put(str2, string);
        }
        return treeMap;
    }

    /* renamed from: c */
    private static SortedMap<String, C11144t> m32520c(JSONObject jSONObject, String str) {
        TreeMap treeMap = new TreeMap();
        JSONObject optJSONObject = jSONObject.optJSONObject(str);
        if (optJSONObject == null) {
            return treeMap;
        }
        Iterator keys = optJSONObject.keys();
        C7573i.m23582a((Object) keys, "objectMap.keys()");
        while (keys.hasNext()) {
            String str2 = (String) keys.next();
            JSONObject jSONObject2 = optJSONObject.getJSONObject(str2);
            String string = jSONObject2.getString("type");
            C7573i.m23582a((Object) string, "getString(\"type\")");
            Locale locale = Locale.ROOT;
            C7573i.m23582a((Object) locale, "Locale.ROOT");
            if (string != null) {
                String lowerCase = string.toLowerCase(locale);
                C7573i.m23582a((Object) lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                String string2 = jSONObject2.getString("value");
                int hashCode = lowerCase.hashCode();
                if (hashCode != -892481938) {
                    if (hashCode == 107944136 && lowerCase.equals("query")) {
                        Map map = treeMap;
                        C7573i.m23582a((Object) str2, "it");
                        C7573i.m23582a((Object) string2, "value");
                        map.put(str2, new C11117i(string2));
                    }
                } else if (lowerCase.equals("static")) {
                    Map map2 = treeMap;
                    C7573i.m23582a((Object) str2, "it");
                    C7573i.m23582a((Object) string2, "value");
                    map2.put(str2, new C11142r(string2));
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
        }
        return treeMap;
    }
}
