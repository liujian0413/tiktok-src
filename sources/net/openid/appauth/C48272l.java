package net.openid.appauth;

import android.net.Uri;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: net.openid.appauth.l */
final class C48272l {

    /* renamed from: net.openid.appauth.l$a */
    static final class C48273a extends C48274b<Boolean> {
        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ Object mo120656a(String str) {
            return m149780b(str);
        }

        /* renamed from: b */
        private static Boolean m149780b(String str) {
            return Boolean.valueOf(Boolean.parseBoolean(str));
        }

        C48273a(String str, boolean z) {
            super(str, Boolean.valueOf(z));
        }
    }

    /* renamed from: net.openid.appauth.l$b */
    static abstract class C48274b<T> {

        /* renamed from: a */
        public final String f123306a;

        /* renamed from: b */
        public final T f123307b;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract T mo120656a(String str);

        C48274b(String str, T t) {
            this.f123306a = str;
            this.f123307b = t;
        }
    }

    /* renamed from: net.openid.appauth.l$c */
    static abstract class C48275c<T> {

        /* renamed from: a */
        public final String f123308a;

        /* renamed from: b */
        public final List<T> f123309b;

        C48275c(String str, List<T> list) {
            this.f123308a = str;
            this.f123309b = list;
        }
    }

    /* renamed from: net.openid.appauth.l$d */
    static final class C48276d extends C48274b<String> {
        /* renamed from: b */
        private static String m149783b(String str) {
            return str;
        }

        C48276d(String str) {
            this(str, null);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ Object mo120656a(String str) {
            return m149783b(str);
        }

        private C48276d(String str, String str2) {
            super(str, null);
        }
    }

    /* renamed from: net.openid.appauth.l$e */
    static final class C48277e extends C48275c<String> {
        C48277e(String str) {
            super(str, null);
        }

        C48277e(String str, List<String> list) {
            super(str, list);
        }
    }

    /* renamed from: net.openid.appauth.l$f */
    static final class C48278f extends C48274b<Uri> {
        C48278f(String str) {
            this(str, null);
        }

        /* renamed from: b */
        private static Uri m149785b(String str) {
            return Uri.parse(str);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ Object mo120656a(String str) {
            return m149785b(str);
        }

        private C48278f(String str, Uri uri) {
            super(str, null);
        }
    }

    /* renamed from: a */
    public static void m149773a(JSONObject jSONObject, String str, JSONObject jSONObject2) {
        C48280n.m149789a(jSONObject, (Object) "json must not be null");
        C48280n.m149789a(str, (Object) "field must not be null");
        C48280n.m149789a(jSONObject2, (Object) "value must not be null");
        try {
            jSONObject.put(str, jSONObject2);
        } catch (JSONException e) {
            throw new IllegalStateException("JSONException thrown in violation of contract", e);
        }
    }

    /* renamed from: a */
    public static JSONObject m149768a(Map<String, String> map) {
        C48280n.m149788a(map);
        JSONObject jSONObject = new JSONObject();
        for (Entry entry : map.entrySet()) {
            C48280n.m149789a(entry.getKey(), (Object) "map entries must not have null keys");
            C48280n.m149789a(entry.getValue(), (Object) "map entries must not have null values");
            m149772a(jSONObject, (String) entry.getKey(), (String) entry.getValue());
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static <T> T m149766a(JSONObject jSONObject, C48274b<T> bVar) {
        try {
            if (!jSONObject.has(bVar.f123306a)) {
                return bVar.f123307b;
            }
            return bVar.mo120656a(jSONObject.getString(bVar.f123306a));
        } catch (JSONException e) {
            throw new IllegalStateException("unexpected JSONException", e);
        }
    }

    /* renamed from: b */
    public static String m149774b(JSONObject jSONObject, String str) throws JSONException {
        C48280n.m149789a(jSONObject, (Object) "json must not be null");
        C48280n.m149789a(str, (Object) "field must not be null");
        if (!jSONObject.has(str)) {
            return null;
        }
        String string = jSONObject.getString(str);
        if (string != null) {
            return string;
        }
        StringBuilder sb = new StringBuilder("field \"");
        sb.append(str);
        sb.append("\" is mapped to a null value");
        throw new JSONException(sb.toString());
    }

    /* renamed from: c */
    public static Uri m149776c(JSONObject jSONObject, String str) throws JSONException {
        C48280n.m149789a(jSONObject, (Object) "json must not be null");
        C48280n.m149789a(str, (Object) "field must not be null");
        String string = jSONObject.getString(str);
        if (string != null) {
            return Uri.parse(string);
        }
        StringBuilder sb = new StringBuilder("field \"");
        sb.append(str);
        sb.append("\" is mapped to a null value");
        throw new JSONException(sb.toString());
    }

    /* renamed from: d */
    public static Uri m149777d(JSONObject jSONObject, String str) throws JSONException {
        C48280n.m149789a(jSONObject, (Object) "json must not be null");
        C48280n.m149789a(str, (Object) "field must not be null");
        if (!jSONObject.has(str)) {
            return null;
        }
        String string = jSONObject.getString(str);
        if (string != null) {
            return Uri.parse(string);
        }
        StringBuilder sb = new StringBuilder("field \"");
        sb.append(str);
        sb.append("\" is mapped to a null value");
        throw new JSONException(sb.toString());
    }

    /* renamed from: e */
    public static Long m149778e(JSONObject jSONObject, String str) throws JSONException {
        C48280n.m149789a(jSONObject, (Object) "json must not be null");
        C48280n.m149789a(str, (Object) "field must not be null");
        if (!jSONObject.has(str) || jSONObject.isNull(str)) {
            return null;
        }
        try {
            return Long.valueOf(jSONObject.getLong(str));
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: f */
    public static Map<String, String> m149779f(JSONObject jSONObject, String str) throws JSONException {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C48280n.m149789a(jSONObject, (Object) "json must not be null");
        C48280n.m149789a(str, (Object) "field must not be null");
        if (!jSONObject.has(str)) {
            return linkedHashMap;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject(str);
        Iterator keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String str2 = (String) keys.next();
            linkedHashMap.put(str2, (String) C48280n.m149789a(jSONObject2.getString(str2), (Object) "additional parameter values must not be null"));
        }
        return linkedHashMap;
    }

    /* renamed from: a */
    public static String m149767a(JSONObject jSONObject, String str) throws JSONException {
        C48280n.m149789a(jSONObject, (Object) "json must not be null");
        C48280n.m149789a(str, (Object) "field must not be null");
        if (jSONObject.has(str)) {
            String string = jSONObject.getString(str);
            if (string != null) {
                return string;
            }
            StringBuilder sb = new StringBuilder("field \"");
            sb.append(str);
            sb.append("\" is mapped to a null value");
            throw new JSONException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder("field \"");
        sb2.append(str);
        sb2.append("\" not found in json object");
        throw new JSONException(sb2.toString());
    }

    /* renamed from: b */
    public static void m149775b(JSONObject jSONObject, String str, String str2) {
        C48280n.m149789a(jSONObject, (Object) "json must not be null");
        C48280n.m149789a(str, (Object) "field must not be null");
        if (str2 != null) {
            try {
                jSONObject.put(str, str2);
            } catch (JSONException e) {
                throw new IllegalStateException("JSONException thrown in violation of contract", e);
            }
        }
    }

    /* renamed from: a */
    public static void m149769a(JSONObject jSONObject, String str, int i) {
        C48280n.m149789a(jSONObject, (Object) "json must not be null");
        C48280n.m149789a(str, (Object) "field must not be null");
        C48280n.m149789a(Integer.valueOf(i), (Object) "value must not be null");
        try {
            jSONObject.put(str, i);
        } catch (JSONException unused) {
            throw new IllegalStateException("JSONException thrown in violation of contract, ex");
        }
    }

    /* renamed from: a */
    public static void m149770a(JSONObject jSONObject, String str, Uri uri) {
        C48280n.m149789a(jSONObject, (Object) "json must not be null");
        C48280n.m149789a(str, (Object) "field must not be null");
        if (uri != null) {
            try {
                jSONObject.put(str, uri.toString());
            } catch (JSONException e) {
                throw new IllegalStateException("JSONException thrown in violation of contract", e);
            }
        }
    }

    /* renamed from: a */
    public static void m149771a(JSONObject jSONObject, String str, Long l) {
        C48280n.m149789a(jSONObject, (Object) "json must not be null");
        C48280n.m149789a(str, (Object) "field must not be null");
        if (l != null) {
            try {
                jSONObject.put(str, l);
            } catch (JSONException e) {
                throw new IllegalStateException("JSONException thrown in violation of contract", e);
            }
        }
    }

    /* renamed from: a */
    public static void m149772a(JSONObject jSONObject, String str, String str2) {
        C48280n.m149789a(jSONObject, (Object) "json must not be null");
        C48280n.m149789a(str, (Object) "field must not be null");
        C48280n.m149789a(str2, (Object) "value must not be null");
        try {
            jSONObject.put(str, str2);
        } catch (JSONException e) {
            throw new IllegalStateException("JSONException thrown in violation of contract", e);
        }
    }
}
