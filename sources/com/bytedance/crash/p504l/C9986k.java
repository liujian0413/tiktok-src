package com.bytedance.crash.p504l;

import com.C1642a;
import com.p280ss.android.ttve.nativePort.TEVideoRecorder;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.l.k */
public final class C9986k {

    /* renamed from: a */
    final Writer f27220a;

    /* renamed from: b */
    private final List<C9987a> f27221b = new ArrayList();

    /* renamed from: com.bytedance.crash.l.k$a */
    enum C9987a {
        EMPTY_ARRAY,
        NONEMPTY_ARRAY,
        EMPTY_OBJECT,
        DANGLING_KEY,
        NONEMPTY_OBJECT,
        NULL
    }

    public final String toString() {
        return "";
    }

    /* renamed from: a */
    public static void m29579a(JSONObject jSONObject, Writer writer) throws Throwable {
        new C9986k(writer).m29578a(jSONObject);
        writer.flush();
    }

    /* renamed from: a */
    private C9986k m29571a() throws JSONException, IOException {
        return m29573a(C9987a.EMPTY_ARRAY, "[");
    }

    /* renamed from: b */
    private C9986k m29580b() throws JSONException, IOException {
        return m29572a(C9987a.EMPTY_ARRAY, C9987a.NONEMPTY_ARRAY, "]");
    }

    /* renamed from: c */
    private C9986k m29582c() throws JSONException, IOException {
        return m29573a(C9987a.EMPTY_OBJECT, "{");
    }

    /* renamed from: d */
    private C9986k m29583d() throws JSONException, IOException {
        return m29572a(C9987a.EMPTY_OBJECT, C9987a.NONEMPTY_OBJECT, "}");
    }

    /* renamed from: e */
    private C9987a m29584e() throws JSONException {
        return (C9987a) this.f27221b.get(this.f27221b.size() - 1);
    }

    /* renamed from: f */
    private void m29585f() throws JSONException, IOException {
        C9987a e = m29584e();
        if (e == C9987a.NONEMPTY_OBJECT) {
            this.f27220a.write(44);
        } else if (e != C9987a.EMPTY_OBJECT) {
            throw new JSONException("Nesting problem");
        }
        m29575a(C9987a.DANGLING_KEY);
    }

    /* renamed from: g */
    private void m29586g() throws JSONException, IOException {
        if (!this.f27221b.isEmpty()) {
            C9987a e = m29584e();
            if (e == C9987a.EMPTY_ARRAY) {
                m29575a(C9987a.NONEMPTY_ARRAY);
            } else if (e == C9987a.NONEMPTY_ARRAY) {
                this.f27220a.write(44);
            } else if (e == C9987a.DANGLING_KEY) {
                this.f27220a.write(":");
                m29575a(C9987a.NONEMPTY_OBJECT);
            } else if (e != C9987a.NULL) {
                throw new JSONException("Nesting problem");
            }
        }
    }

    /* renamed from: b */
    private C9986k m29581b(String str) throws JSONException, IOException {
        m29585f();
        m29576a(str);
        return this;
    }

    private C9986k(Writer writer) {
        this.f27220a = writer;
    }

    /* renamed from: a */
    private C9986k m29574a(Object obj) throws JSONException, IOException {
        if (obj instanceof JSONArray) {
            m29577a((JSONArray) obj);
            return this;
        } else if (obj instanceof JSONObject) {
            m29578a((JSONObject) obj);
            return this;
        } else {
            m29586g();
            if (obj == null || obj == JSONObject.NULL) {
                this.f27220a.write(TEVideoRecorder.FACE_BEAUTY_NULL);
            } else if (obj instanceof Boolean) {
                this.f27220a.write(String.valueOf(obj));
            } else if (obj instanceof Number) {
                this.f27220a.write(JSONObject.numberToString((Number) obj));
            } else {
                m29576a(obj.toString());
            }
            return this;
        }
    }

    /* renamed from: a */
    private void m29575a(C9987a aVar) {
        this.f27221b.set(this.f27221b.size() - 1, aVar);
    }

    /* renamed from: a */
    private void m29576a(String str) throws IOException {
        this.f27220a.write("\"");
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt != '\"' && charAt != '/' && charAt != '\\') {
                switch (charAt) {
                    case 8:
                        this.f27220a.write("\\b");
                        continue;
                    case 9:
                        this.f27220a.write("\\t");
                        continue;
                    case 10:
                        this.f27220a.write("\\n");
                        continue;
                    default:
                        switch (charAt) {
                            case 12:
                                this.f27220a.write("\\f");
                                continue;
                            case 13:
                                this.f27220a.write("\\r");
                                continue;
                            default:
                                if (charAt <= 31) {
                                    this.f27220a.write(C1642a.m8034a("\\u%04x", new Object[]{Integer.valueOf(charAt)}));
                                    continue;
                                    continue;
                                }
                                break;
                        }
                }
            } else {
                this.f27220a.write(92);
            }
            this.f27220a.write(charAt);
        }
        this.f27220a.write("\"");
    }

    /* renamed from: a */
    private void m29577a(JSONArray jSONArray) throws JSONException, IOException {
        m29571a();
        for (int i = 0; i < jSONArray.length(); i++) {
            m29574a(jSONArray.get(i));
        }
        m29580b();
    }

    /* renamed from: a */
    private void m29578a(JSONObject jSONObject) throws JSONException, IOException {
        m29582c();
        Iterator keys = jSONObject.keys();
        while (keys.hasNext()) {
            String str = (String) keys.next();
            m29581b(str).m29574a(jSONObject.get(str));
        }
        m29583d();
    }

    /* renamed from: a */
    private C9986k m29573a(C9987a aVar, String str) throws JSONException, IOException {
        m29586g();
        this.f27221b.add(aVar);
        this.f27220a.write(str);
        return this;
    }

    /* renamed from: a */
    private C9986k m29572a(C9987a aVar, C9987a aVar2, String str) throws JSONException, IOException {
        m29584e();
        this.f27221b.remove(this.f27221b.size() - 1);
        this.f27220a.write(str);
        return this;
    }
}
