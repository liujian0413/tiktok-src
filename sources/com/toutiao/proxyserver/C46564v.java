package com.toutiao.proxyserver;

import android.net.Uri;
import android.text.TextUtils;
import com.p280ss.android.vesdk.C45323k;
import com.toutiao.proxyserver.net.C46513c;
import com.toutiao.proxyserver.p1842d.C46476c;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.toutiao.proxyserver.v */
final class C46564v {

    /* renamed from: a */
    public final C46566b f119998a;

    /* renamed from: b */
    public final List<C46513c> f119999b;

    /* renamed from: c */
    public final C46565a f120000c;

    /* renamed from: com.toutiao.proxyserver.v$a */
    static final class C46565a {

        /* renamed from: a */
        final int f120001a;

        /* renamed from: b */
        final String f120002b;

        /* renamed from: c */
        final String f120003c;

        /* renamed from: d */
        final int f120004d;

        /* renamed from: e */
        final int f120005e;

        /* renamed from: f */
        final String f120006f;

        /* renamed from: g */
        final List<String> f120007g;

        public final String toString() {
            StringBuilder sb = new StringBuilder("Extra{flag=");
            sb.append(this.f120001a);
            sb.append(", rawKey='");
            sb.append(this.f120002b);
            sb.append('\'');
            sb.append(", key='");
            sb.append(this.f120003c);
            sb.append('\'');
            sb.append(", from=");
            sb.append(this.f120004d);
            sb.append(", to=");
            sb.append(this.f120005e);
            sb.append(", urls=");
            sb.append(this.f120007g);
            sb.append('}');
            return sb.toString();
        }

        /* renamed from: a */
        static C46565a m146343a(C46566b bVar, List<C46513c> list) throws C46567c {
            int indexOf = bVar.f120009b.indexOf("?");
            if (indexOf != -1) {
                ArrayList arrayList = new ArrayList();
                String str = null;
                String str2 = null;
                int i = 0;
                for (String split : bVar.f120009b.substring(indexOf + 1).split("&")) {
                    String[] split2 = split.split("=");
                    if (split2.length == 2) {
                        if ("rk".equals(split2[0])) {
                            str = Uri.decode(split2[1]);
                        } else if (C45323k.f116730a.equals(split2[0])) {
                            str2 = split2[1];
                        } else if (split2[0].startsWith("u")) {
                            arrayList.add(Uri.decode(split2[1]));
                        } else if ("f".equals(split2[0]) && C46476c.m146128b(split2[1]) == 1) {
                            i = 1;
                        }
                    }
                }
                if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                    throw new C46567c();
                }
                String str3 = null;
                int i2 = 0;
                int i3 = 0;
                for (C46513c cVar : list) {
                    if (cVar != null && "Range".equalsIgnoreCase(cVar.f119833a)) {
                        int indexOf2 = cVar.f119834b.indexOf("=");
                        if (indexOf2 != -1) {
                            if ("bytes".equalsIgnoreCase(cVar.f119834b.substring(0, indexOf2).trim())) {
                                String substring = cVar.f119834b.substring(indexOf2 + 1);
                                if (!substring.contains(",")) {
                                    int indexOf3 = substring.indexOf("-");
                                    if (indexOf3 != -1) {
                                        String trim = substring.substring(0, indexOf3).trim();
                                        String trim2 = substring.substring(indexOf3 + 1).trim();
                                        try {
                                            if (trim.length() > 0) {
                                                i2 = Integer.parseInt(trim);
                                            }
                                            if (trim2.length() > 0) {
                                                i3 = Integer.parseInt(trim2);
                                                if (i2 > i3) {
                                                    throw new C46567c();
                                                }
                                            }
                                            str3 = cVar.f119834b;
                                        } catch (NumberFormatException unused) {
                                            throw new C46567c();
                                        }
                                    } else {
                                        throw new C46567c();
                                    }
                                } else {
                                    throw new C46567c();
                                }
                            } else {
                                throw new C46567c();
                            }
                        } else {
                            throw new C46567c();
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    C46565a aVar = new C46565a(i, str, str2, i2, i3, str3, arrayList);
                    return aVar;
                }
                throw new C46567c();
            }
            throw new C46567c();
        }

        private C46565a(int i, String str, String str2, int i2, int i3, String str3, List<String> list) {
            this.f120001a = i;
            this.f120002b = str;
            this.f120003c = str2;
            this.f120004d = i2;
            this.f120005e = i3;
            this.f120006f = str3;
            this.f120007g = list;
        }
    }

    /* renamed from: com.toutiao.proxyserver.v$b */
    static final class C46566b {

        /* renamed from: a */
        final String f120008a;

        /* renamed from: b */
        final String f120009b;

        /* renamed from: c */
        final String f120010c;

        public final String toString() {
            StringBuilder sb = new StringBuilder("RequestLine{method='");
            sb.append(this.f120008a);
            sb.append('\'');
            sb.append(", path='");
            sb.append(this.f120009b);
            sb.append('\'');
            sb.append(", version='");
            sb.append(this.f120010c);
            sb.append('\'');
            sb.append('}');
            return sb.toString();
        }

        /* renamed from: a */
        static C46566b m146344a(String str) throws C46567c {
            int indexOf = str.indexOf(32);
            if (indexOf != -1) {
                int lastIndexOf = str.lastIndexOf(32);
                if (lastIndexOf > indexOf) {
                    String trim = str.substring(0, indexOf).trim();
                    String trim2 = str.substring(indexOf + 1, lastIndexOf).trim();
                    String trim3 = str.substring(lastIndexOf + 1).trim();
                    if (trim.length() != 0 && trim2.length() != 0 && trim3.length() != 0) {
                        return new C46566b(trim, trim2, trim3);
                    }
                    throw new C46567c();
                }
                throw new C46567c();
            }
            throw new C46567c();
        }

        private C46566b(String str, String str2, String str3) {
            this.f120008a = str;
            this.f120009b = str2;
            this.f120010c = str3;
        }
    }

    /* renamed from: com.toutiao.proxyserver.v$c */
    static final class C46567c extends Exception {
        C46567c() {
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Request{requestLine=");
        sb.append(this.f119998a);
        sb.append(", headers=");
        sb.append(this.f119999b);
        sb.append(", extra=");
        sb.append(this.f120000c);
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: a */
    public static C46564v m146340a(InputStream inputStream) throws IOException, C46567c {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, C46476c.f119755a));
        ArrayList arrayList = new ArrayList();
        C46566b bVar = null;
        while (true) {
            String readLine = bufferedReader.readLine();
            if (TextUtils.isEmpty(readLine)) {
                break;
            }
            String trim = readLine.trim();
            if (bVar == null) {
                bVar = C46566b.m146344a(trim);
            } else {
                try {
                    arrayList.add(C46513c.m146208a(trim));
                } catch (IllegalArgumentException unused) {
                    throw new C46567c();
                }
            }
        }
        if (bVar != null) {
            return new C46564v(bVar, arrayList, C46565a.m146343a(bVar, arrayList));
        }
        throw new C46567c();
    }

    private C46564v(C46566b bVar, List<C46513c> list, C46565a aVar) {
        this.f119998a = bVar;
        this.f119999b = list;
        this.f120000c = aVar;
    }

    /* renamed from: a */
    static String m146341a(String str, String str2, List<String> list) {
        StringBuilder sb = new StringBuilder(512);
        String str3 = null;
        do {
            if (str3 != null) {
                if (list.size() == 1) {
                    return null;
                }
                list.remove(list.size() - 1);
            }
            str3 = m146342a(sb, str, str2, list);
        } while (str3.length() > 3072);
        return str3;
    }

    /* renamed from: a */
    private static String m146342a(StringBuilder sb, String str, String str2, List<String> list) {
        sb.delete(0, sb.length());
        sb.append("rk=");
        sb.append(Uri.encode(str));
        sb.append("&k");
        sb.append("=");
        sb.append(str2);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append("&u");
            sb.append(i);
            sb.append("=");
            sb.append(Uri.encode((String) list.get(i)));
        }
        return sb.toString();
    }
}
