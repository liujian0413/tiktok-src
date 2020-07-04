package com.bytedance.frameworks.baselib.network.http.parser;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.bytedance.frameworks.baselib.network.http.parser.a */
public final class C10172a {
    /* renamed from: a */
    public static String m30211a(String str, String str2) {
        StringBuilder sb = new StringBuilder(".*(((");
        sb.append(str2);
        sb.append("=[^;]*)|(");
        sb.append(str2);
        sb.append("=\"[\";]*))|(");
        sb.append(str2);
        sb.append("=.*$)).*");
        Matcher matcher = Pattern.compile(sb.toString()).matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return null;
    }
}
