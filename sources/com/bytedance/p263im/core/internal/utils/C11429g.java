package com.bytedance.p263im.core.internal.utils;

import android.text.TextUtils;
import com.bytedance.p263im.core.p584a.C11198c;
import com.bytedance.p263im.core.p586b.C11209d;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;

/* renamed from: com.bytedance.im.core.internal.utils.g */
public final class C11429g {
    /* renamed from: a */
    private static String m33681a(int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("\t");
        }
        return sb.toString();
    }

    /* renamed from: b */
    private static String m33684b(String str) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (i > 0 && 10 == sb.charAt(sb.length() - 1)) {
                sb.append(m33681a(i));
            }
            if (charAt != ',') {
                if (charAt != '[') {
                    if (charAt != ']') {
                        if (charAt != '{') {
                            if (charAt != '}') {
                                sb.append(charAt);
                            }
                        }
                    }
                    sb.append("\n");
                    i--;
                    sb.append(m33681a(i));
                    sb.append(charAt);
                }
                sb.append(charAt);
                sb.append("\n");
                i++;
            } else {
                sb.append(charAt);
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    private static String m33682a(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(length);
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            char charAt = str.charAt(i);
            if (charAt == '\\') {
                i = i2 + 1;
                char charAt2 = str.charAt(i2);
                if (charAt2 == 'u') {
                    i2 = i;
                    int i3 = 0;
                    int i4 = 0;
                    while (i3 < 4) {
                        int i5 = i2 + 1;
                        char charAt3 = str.charAt(i2);
                        switch (charAt3) {
                            case '0':
                            case '1':
                            case '2':
                            case '3':
                            case '4':
                            case '5':
                            case '6':
                            case '7':
                            case '8':
                            case '9':
                                i4 = ((i4 << 4) + charAt3) - 48;
                                break;
                            default:
                                switch (charAt3) {
                                    case 'A':
                                    case 'B':
                                    case 'C':
                                    case 'D':
                                    case 'E':
                                    case 'F':
                                        i4 = (((i4 << 4) + 10) + charAt3) - 65;
                                        break;
                                    default:
                                        switch (charAt3) {
                                            case 'a':
                                            case 'b':
                                            case 'c':
                                            case 'd':
                                            case BaseNotice.HASHTAG /*101*/:
                                            case 'f':
                                                i4 = (((i4 << 4) + 10) + charAt3) - 97;
                                                break;
                                            default:
                                                throw new IllegalArgumentException("Malformed   \\uxxxx   encoding.");
                                        }
                                }
                        }
                        i3++;
                        i2 = i5;
                    }
                    sb.append((char) i4);
                } else {
                    if (charAt2 == 't') {
                        charAt2 = 9;
                    } else if (charAt2 == 'r') {
                        charAt2 = 13;
                    } else if (charAt2 == 'n') {
                        charAt2 = 10;
                    } else if (charAt2 == 'f') {
                        charAt2 = 12;
                    }
                    sb.append(charAt2);
                }
            } else {
                sb.append(charAt);
            }
            i = i2;
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static void m33683a(String str, Object obj) {
        try {
            C11209d.m32825a(obj);
            if (C11404d.m33586a()) {
                if (!TextUtils.isEmpty(str)) {
                    C11404d.m33587b(str);
                }
                if (C11198c.m32777a().mo27248b().f30402b == 0) {
                    C11404d.m33587b(obj.toString());
                    return;
                }
                String b = C11403c.f30887a.mo15979b(obj);
                if (C11198c.m32777a().mo27248b().f30402b == 2) {
                    b = m33684b(m33682a(b));
                }
                while (b.length() > 1996) {
                    C11404d.m33587b(b.substring(0, 1996));
                    b = b.substring(1996);
                }
                C11404d.m33587b(b);
            }
        } catch (Exception unused) {
        }
    }
}
