package com.bytedance.frameworks.baselib.network.http.parser;

import java.util.regex.Pattern;

public final class CacheControlParser {

    /* renamed from: a */
    private static final Pattern f27704a = Pattern.compile("\\s*([\\w\\-]+)\\s*(=)?\\s*(\\d+|\\\"([^\"\\\\]*(\\\\.[^\"\\\\]*)*)+\\\")?\\s*");

    public enum Directive {
        MAXAGE,
        MAXSTALE,
        MINFRESH,
        NOCACHE,
        NOSTORE,
        NOTRANSFORM,
        ONLYIFCACHED,
        MUSTREVALIDATE,
        PRIVATE,
        PROXYREVALIDATE,
        PUBLIC,
        SMAXAGE,
        UNKNOWN;

        public static Directive select(String str) {
            try {
                return valueOf(str.toUpperCase().replaceAll("-", ""));
            } catch (Exception unused) {
                return UNKNOWN;
            }
        }
    }
}
