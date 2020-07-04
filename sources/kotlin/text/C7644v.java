package kotlin.text;

import java.util.Iterator;
import kotlin.collections.C7506ac;
import kotlin.jvm.internal.C7573i;
import kotlin.sequences.C7605h;

/* renamed from: kotlin.text.v */
public class C7644v extends C7643u {
    /* renamed from: a */
    public static final boolean m23717a(String str, String str2, boolean z) {
        if (str == null) {
            return str2 == null;
        }
        if (!z) {
            return str.equals(str2);
        }
        return str.equalsIgnoreCase(str2);
    }

    /* renamed from: a */
    public static final boolean m23713a(CharSequence charSequence) {
        boolean z;
        C7573i.m23587b(charSequence, "$this$isBlank");
        if (charSequence.length() != 0) {
            Iterator it = C7634n.m23779e(charSequence).iterator();
            while (true) {
                if (it.hasNext()) {
                    if (!C7625a.m23677a(charSequence.charAt(((C7506ac) it).mo19392a()))) {
                        z = false;
                        break;
                    }
                } else {
                    z = true;
                    break;
                }
            }
            if (z) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static final String m23708a(CharSequence charSequence, int i) {
        boolean z;
        C7573i.m23587b(charSequence, "$this$repeat");
        int i2 = 1;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            switch (i) {
                case 0:
                    return "";
                case 1:
                    return charSequence.toString();
                default:
                    switch (charSequence.length()) {
                        case 0:
                            return "";
                        case 1:
                            char charAt = charSequence.charAt(0);
                            char[] cArr = new char[i];
                            for (int i3 = 0; i3 < i; i3++) {
                                cArr[i3] = charAt;
                            }
                            return new String(cArr);
                        default:
                            StringBuilder sb = new StringBuilder(charSequence.length() * i);
                            if (i > 0) {
                                while (true) {
                                    sb.append(charSequence);
                                    if (i2 != i) {
                                        i2++;
                                    }
                                }
                            }
                            String sb2 = sb.toString();
                            C7573i.m23582a((Object) sb2, "sb.toString()");
                            return sb2;
                    }
            }
        } else {
            StringBuilder sb3 = new StringBuilder("Count 'n' must be non-negative, but was ");
            sb3.append(i);
            sb3.append('.');
            throw new IllegalArgumentException(sb3.toString().toString());
        }
    }

    /* renamed from: b */
    public static final boolean m23721b(String str, String str2, boolean z) {
        C7573i.m23587b(str, "$this$startsWith");
        C7573i.m23587b(str2, "prefix");
        if (!z) {
            return str.startsWith(str2);
        }
        return C7634n.m23714a(str, 0, str2, 0, str2.length(), z);
    }

    /* renamed from: c */
    public static final boolean m23723c(String str, String str2, boolean z) {
        C7573i.m23587b(str, "$this$endsWith");
        C7573i.m23587b(str2, "suffix");
        if (!z) {
            return str.endsWith(str2);
        }
        return C7634n.m23714a(str, str.length() - str2.length(), str2, 0, str2.length(), true);
    }

    /* renamed from: a */
    public static final String m23709a(String str, char c, char c2, boolean z) {
        String str2 = str;
        C7573i.m23587b(str2, "$this$replace");
        if (!z) {
            String replace = str.replace(c, c2);
            C7573i.m23582a((Object) replace, "(this as java.lang.Strin…replace(oldChar, newChar)");
            return replace;
        }
        return C7605h.m23647a(C7634n.m23747a((CharSequence) str2, new char[]{c}, z, 0, 4, (Object) null), String.valueOf(c2), "", "", -1, "...", null);
    }

    /* renamed from: b */
    public static final String m23719b(String str, String str2, String str3, boolean z) {
        C7573i.m23587b(str, "$this$replaceFirst");
        C7573i.m23587b(str2, "oldValue");
        C7573i.m23587b(str3, "newValue");
        CharSequence charSequence = str;
        int a = C7634n.m23730a(charSequence, str2, 0, z, 2, (Object) null);
        if (a < 0) {
            return str;
        }
        return C7634n.m23734a(charSequence, a, str2.length() + a, (CharSequence) str3).toString();
    }

    /* renamed from: a */
    public static final String m23711a(String str, String str2, String str3, boolean z) {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        C7573i.m23587b(str4, "$this$replace");
        C7573i.m23587b(str5, "oldValue");
        C7573i.m23587b(str6, "newValue");
        return C7605h.m23647a(C7634n.m23751a((CharSequence) str4, new String[]{str5}, z, 0, 4, (Object) null), str6, "", "", -1, "...", null);
    }

    /* renamed from: a */
    public static final boolean m23715a(String str, String str2, int i, boolean z) {
        C7573i.m23587b(str, "$this$startsWith");
        C7573i.m23587b(str2, "prefix");
        if (!z) {
            return str.startsWith(str2, i);
        }
        return C7634n.m23714a(str, i, str2, 0, str2.length(), z);
    }

    /* renamed from: a */
    public static final boolean m23714a(String str, int i, String str2, int i2, int i3, boolean z) {
        C7573i.m23587b(str, "$this$regionMatches");
        C7573i.m23587b(str2, "other");
        if (!z) {
            return str.regionMatches(i, str2, i2, i3);
        }
        return str.regionMatches(z, i, str2, i2, i3);
    }
}
