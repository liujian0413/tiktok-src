package com.bytedance.frameworks.core.encrypt;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import com.bytedance.frameworks.encryptor.EncryptorUtil;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.bytedance.frameworks.core.encrypt.a */
public final class C6367a {

    /* renamed from: a */
    private static C6368a f18652a;

    /* renamed from: b */
    private static boolean f18653b;

    /* renamed from: com.bytedance.frameworks.core.encrypt.a$a */
    public interface C6368a {
        /* renamed from: c */
        boolean mo15275c();

        /* renamed from: d */
        boolean mo15276d();

        /* renamed from: e */
        boolean mo15277e();
    }

    /* renamed from: a */
    public static void m19795a(C6368a aVar) {
        f18652a = aVar;
    }

    /* renamed from: a */
    private static String m19791a(String str, String str2) {
        if (str2 == null) {
            str2 = "ISO-8859-1";
        }
        try {
            return URLEncoder.encode(str, str2);
        } catch (UnsupportedEncodingException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: a */
    public static String m19792a(String str, List<Pair<String, String>> list) {
        byte[] bArr;
        if (TextUtils.isEmpty(str) || f18652a == null || f18653b) {
            return str;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            Uri parse = Uri.parse(str);
            m19794a(parse, (Map<String, List<String>>) linkedHashMap);
            LinkedList linkedList = new LinkedList();
            m19796a((Map<String, List<String>>) linkedHashMap, (List<Pair<String, List<String>>>) linkedList, "device_id");
            m19796a((Map<String, List<String>>) linkedHashMap, (List<Pair<String, List<String>>>) linkedList, "device_type");
            m19796a((Map<String, List<String>>) linkedHashMap, (List<Pair<String, List<String>>>) linkedList, "device_brand");
            m19796a((Map<String, List<String>>) linkedHashMap, (List<Pair<String, List<String>>>) linkedList, "uuid");
            m19796a((Map<String, List<String>>) linkedHashMap, (List<Pair<String, List<String>>>) linkedList, "openudid");
            String a = m19793a((List<Pair<String, List<String>>>) linkedList, false, "UTF-8");
            if (TextUtils.isEmpty(a)) {
                return str;
            }
            byte[] bytes = a.getBytes();
            if (TTEncryptUtils.f18651a) {
                bArr = EncryptorUtil.m19810a(bytes, bytes.length);
            } else {
                bArr = TTEncryptUtils.m19789a(bytes, bytes.length);
            }
            if (bArr == null) {
                return str;
            }
            String encodeToString = Base64.encodeToString(bArr, 2);
            LinkedList linkedList2 = new LinkedList();
            if (f18652a.mo15275c()) {
                LinkedList linkedList3 = new LinkedList();
                linkedList3.add(encodeToString);
                linkedList2.add(new Pair("ss_queries", linkedList3));
            }
            if (f18652a.mo15276d()) {
                list.add(new Pair("X-SS-QUERIES", m19791a(encodeToString, "UTF-8")));
            }
            if (!linkedHashMap.isEmpty()) {
                for (Entry entry : linkedHashMap.entrySet()) {
                    if (entry != null) {
                        linkedList2.add(new Pair(entry.getKey(), entry.getValue()));
                    }
                }
            }
            return m19790a(parse.getScheme(), parse.getHost(), parse.getPort(), parse.getPath(), m19793a((List<Pair<String, List<String>>>) linkedList2, true, "UTF-8"), parse.getFragment()).toString();
        } catch (Throwable unused) {
            return str;
        }
    }

    /* renamed from: a */
    private static void m19794a(Uri uri, Map<String, List<String>> map) throws IOException {
        String[] split;
        if (uri != null) {
            try {
                String encodedQuery = uri.getEncodedQuery();
                if (encodedQuery != null) {
                    for (String str : encodedQuery.split("&")) {
                        int indexOf = str.indexOf("=");
                        if (indexOf >= 0) {
                            String decode = URLDecoder.decode(str.substring(0, indexOf), "UTF-8");
                            List list = (List) map.get(decode);
                            if (list == null) {
                                list = new LinkedList();
                            }
                            list.add(URLDecoder.decode(str.substring(indexOf + 1), "UTF-8"));
                            map.put(decode, list);
                        } else {
                            String decode2 = URLDecoder.decode(str, "UTF-8");
                            List list2 = (List) map.get(decode2);
                            if (list2 == null) {
                                list2 = new LinkedList();
                            }
                            list2.add("");
                            map.put(decode2, list2);
                        }
                    }
                }
            } catch (Throwable unused) {
                throw new IOException("parseUrl url is null !!!");
            }
        } else {
            throw new IOException("parseUrl url is null !!!");
        }
    }

    /* renamed from: a */
    private static boolean m19796a(Map<String, List<String>> map, List<Pair<String, List<String>>> list, String str) throws UnsupportedEncodingException {
        if (TextUtils.isEmpty(str) || !map.containsKey(str)) {
            return false;
        }
        list.add(new Pair(str, map.get(str)));
        if (!f18652a.mo15277e()) {
            map.remove(str);
        }
        return true;
    }

    /* renamed from: a */
    private static String m19793a(List<Pair<String, List<String>>> list, boolean z, String str) {
        StringBuilder sb = new StringBuilder();
        for (Pair pair : list) {
            String str2 = (String) pair.first;
            if (z) {
                str2 = m19791a((String) pair.first, str);
            }
            List<String> list2 = (List) pair.second;
            if (list2 != null && list2.size() > 0) {
                for (String str3 : list2) {
                    if (z) {
                        if (str3 != null) {
                            str3 = m19791a(str3, str);
                        } else {
                            str3 = "";
                        }
                    }
                    if (sb.length() > 0) {
                        sb.append("&");
                    }
                    sb.append(str2);
                    sb.append("=");
                    sb.append(str3);
                }
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    private static Uri m19790a(String str, String str2, int i, String str3, String str4, String str5) {
        StringBuilder sb = new StringBuilder();
        if (str2 != null) {
            if (str != null) {
                sb.append(str);
                sb.append("://");
            }
            sb.append(str2);
            if (i > 0) {
                sb.append(':');
                sb.append(i);
            }
        }
        if (str3 == null || !str3.startsWith("/")) {
            sb.append('/');
        }
        if (str3 != null) {
            sb.append(str3);
        }
        if (str4 != null) {
            sb.append('?');
            sb.append(str4);
        }
        if (str5 != null) {
            sb.append('#');
            sb.append(str5);
        }
        return Uri.parse(sb.toString());
    }
}
