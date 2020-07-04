package com.p280ss.ttvideoengine;

import android.os.SystemClock;
import android.text.TextUtils;
import com.C1642a;
import com.p280ss.ttvideoengine.p1812e.C46083h;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.ttvideoengine.ad */
public class C46036ad {

    /* renamed from: a */
    private static C46036ad f117595a = null;

    /* renamed from: b */
    private static int f117596b = -1;

    /* renamed from: c */
    private static int f117597c = 100;

    /* renamed from: d */
    private ConcurrentHashMap<String, C46037a> f117598d = new ConcurrentHashMap<>();

    /* renamed from: com.ss.ttvideoengine.ad$a */
    public static class C46037a {

        /* renamed from: a */
        public C46083h f117599a;

        /* renamed from: b */
        public long f117600b;

        /* renamed from: c */
        public boolean f117601c;
    }

    /* renamed from: a */
    public static C46036ad m144236a() {
        if (f117595a == null) {
            synchronized (C46036ad.class) {
                if (f117595a == null) {
                    f117595a = new C46036ad();
                }
            }
        }
        return f117595a;
    }

    /* renamed from: a */
    public static void m144237a(int i) {
        f117596b = i;
    }

    /* renamed from: b */
    public static void m144239b(int i) {
        f117597c = i;
    }

    /* renamed from: a */
    public final C46037a mo112121a(String str, String str2) {
        if (this.f117598d != null) {
            String b = m144238b(str, str2);
            if (TextUtils.isEmpty(b)) {
                return null;
            }
            C46037a aVar = (C46037a) this.f117598d.get(b);
            if (aVar != null) {
                int i = 3600;
                if (f117596b > 0) {
                    i = f117596b;
                } else if (aVar.f117599a != null) {
                    i = (aVar.f117599a.mo112223a(3) + 3600) - 300;
                }
                if (SystemClock.elapsedRealtime() - aVar.f117600b > ((long) (i * 1000))) {
                    aVar.f117601c = true;
                } else {
                    aVar.f117601c = false;
                }
                return aVar;
            }
        }
        return null;
    }

    /* renamed from: b */
    private static String m144238b(String str, String str2) {
        CharSequence charSequence;
        CharSequence charSequence2;
        CharSequence charSequence3;
        String[] split;
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        CharSequence charSequence4 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        String[] split2 = str2.split("[?]");
        if (split2.length >= 2) {
            CharSequence charSequence5 = null;
            charSequence3 = null;
            charSequence2 = null;
            charSequence = null;
            for (String str3 : split2[1].split("&")) {
                int indexOf = str3.indexOf("codec_type");
                if (indexOf >= 0) {
                    charSequence5 = str3.substring(indexOf + 11);
                } else {
                    int indexOf2 = str3.indexOf("CodecType");
                    if (indexOf2 >= 0) {
                        charSequence5 = str3.substring(indexOf2 + 10);
                    } else {
                        int indexOf3 = str3.indexOf("format_type");
                        if (indexOf3 >= 0) {
                            charSequence3 = str3.substring(indexOf3 + 12);
                        } else {
                            int indexOf4 = str3.indexOf("FormatType");
                            if (indexOf4 >= 0) {
                                charSequence3 = str3.substring(indexOf4 + 11);
                            } else {
                                int indexOf5 = str3.indexOf("ptoken");
                                if (indexOf5 >= 0) {
                                    charSequence2 = str3.substring(indexOf5 + 7);
                                } else {
                                    int indexOf6 = str3.indexOf("PToken");
                                    if (indexOf6 >= 0) {
                                        charSequence2 = str3.substring(indexOf6 + 7);
                                    } else {
                                        int indexOf7 = str3.indexOf("ssl");
                                        if (indexOf7 >= 0) {
                                            charSequence = str3.substring(indexOf7 + 4);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            charSequence4 = charSequence5;
        } else {
            charSequence3 = null;
            charSequence2 = null;
            charSequence = null;
        }
        sb.append(str);
        if (!TextUtils.isEmpty(charSequence4)) {
            sb.append(C1642a.m8034a("/%s", new Object[]{charSequence4}));
        }
        if (!TextUtils.isEmpty(charSequence3)) {
            sb.append(C1642a.m8034a("/%s", new Object[]{charSequence3}));
        }
        if (!TextUtils.isEmpty(charSequence2)) {
            sb.append(C1642a.m8034a("/%s", new Object[]{charSequence2}));
        }
        if (!TextUtils.isEmpty(charSequence)) {
            sb.append(C1642a.m8034a("/%s", new Object[]{charSequence}));
        }
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo112123a(String str, String str2, C46083h hVar) {
        if (this.f117598d != null && str != null && str2 != null) {
            C46037a aVar = new C46037a();
            aVar.f117599a = hVar;
            aVar.f117600b = SystemClock.elapsedRealtime();
            mo112122a(str, str2, aVar);
        }
    }

    /* renamed from: a */
    public final void mo112122a(String str, String str2, C46037a aVar) {
        String b = m144238b(str, str2);
        if (!TextUtils.isEmpty(b)) {
            this.f117598d.put(b, aVar);
            if (this.f117598d.size() > f117597c) {
                long j = Long.MAX_VALUE;
                String str3 = null;
                for (Entry entry : this.f117598d.entrySet()) {
                    C46037a aVar2 = (C46037a) entry.getValue();
                    if (aVar2.f117600b < j) {
                        j = aVar2.f117600b;
                        str3 = (String) entry.getKey();
                    }
                }
                if (str3 != null) {
                    this.f117598d.remove(str3);
                }
            }
        }
    }
}
