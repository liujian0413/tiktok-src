package com.p280ss.android.agilelogger.formatter.p842b.p843a;

import com.p280ss.android.agilelogger.formatter.FormatException;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.android.agilelogger.formatter.b.a.a */
public final class C19184a implements C19185b {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ String mo50910a(Object obj) {
        return m62892a((String) obj);
    }

    /* renamed from: a */
    private static String m62892a(String str) {
        if (str == null || str.trim().length() == 0) {
            throw new FormatException("JSON empty.");
        }
        try {
            if (str.startsWith("{")) {
                return new JSONObject(str).toString(4);
            }
            if (str.startsWith("[")) {
                return new JSONArray(str).toString(4);
            }
            StringBuilder sb = new StringBuilder("JSON should start with { or [, but found ");
            sb.append(str);
            throw new FormatException(sb.toString());
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder("Parse JSON error. JSON string:");
            sb2.append(str);
            throw new FormatException(sb2.toString(), e);
        }
    }
}
