package kotlin.text;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.C7579l;
import kotlin.Pair;
import kotlin.collections.C7519g;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;
import kotlin.p356e.C7547a;
import kotlin.p356e.C7549c;
import kotlin.p356e.C7551d;
import kotlin.sequences.C7604g;
import kotlin.sequences.C7605h;

/* renamed from: kotlin.text.w */
public class C7645w extends C7644v {

    /* renamed from: kotlin.text.w$a */
    static final class C7646a extends Lambda implements C7563m<CharSequence, Integer, Pair<? extends Integer, ? extends Integer>> {

        /* renamed from: a */
        final /* synthetic */ char[] f20930a;

        /* renamed from: b */
        final /* synthetic */ boolean f20931b;

        C7646a(char[] cArr, boolean z) {
            this.f20930a = cArr;
            this.f20931b = z;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m23783a((CharSequence) obj, ((Number) obj2).intValue());
        }

        /* renamed from: a */
        private Pair<Integer, Integer> m23783a(CharSequence charSequence, int i) {
            C7573i.m23587b(charSequence, "$receiver");
            int a = C7634n.m23731a(charSequence, this.f20930a, i, this.f20931b);
            if (a < 0) {
                return null;
            }
            return C7579l.m23633a(Integer.valueOf(a), Integer.valueOf(1));
        }
    }

    /* renamed from: kotlin.text.w$b */
    static final class C7647b extends Lambda implements C7563m<CharSequence, Integer, Pair<? extends Integer, ? extends Integer>> {

        /* renamed from: a */
        final /* synthetic */ List f20932a;

        /* renamed from: b */
        final /* synthetic */ boolean f20933b;

        C7647b(List list, boolean z) {
            this.f20932a = list;
            this.f20933b = z;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m23784a((CharSequence) obj, ((Number) obj2).intValue());
        }

        /* renamed from: a */
        private Pair<Integer, Integer> m23784a(CharSequence charSequence, int i) {
            C7573i.m23587b(charSequence, "$receiver");
            Pair a = C7645w.m23743a(charSequence, (Collection<String>) this.f20932a, i, this.f20933b, false);
            if (a != null) {
                return C7579l.m23633a(a.getFirst(), Integer.valueOf(((String) a.getSecond()).length()));
            }
            return null;
        }
    }

    /* renamed from: kotlin.text.w$c */
    static final class C7648c extends Lambda implements C7562b<C7549c, String> {

        /* renamed from: a */
        final /* synthetic */ CharSequence f20934a;

        C7648c(CharSequence charSequence) {
            this.f20934a = charSequence;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public String invoke(C7549c cVar) {
            C7573i.m23587b(cVar, "it");
            return C7634n.m23736a(this.f20934a, cVar);
        }
    }

    /* renamed from: kotlin.text.w$d */
    static final class C7649d extends Lambda implements C7562b<C7549c, String> {

        /* renamed from: a */
        final /* synthetic */ CharSequence f20935a;

        C7649d(CharSequence charSequence) {
            this.f20935a = charSequence;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public String invoke(C7549c cVar) {
            C7573i.m23587b(cVar, "it");
            return C7634n.m23736a(this.f20935a, cVar);
        }
    }

    /* renamed from: a */
    public static final String m23737a(String str, int i, char c) {
        C7573i.m23587b(str, "$this$padStart");
        return C7634n.m23732a((CharSequence) str, 2, '0').toString();
    }

    /* renamed from: a */
    public static final String m23741a(String str, C7549c cVar) {
        C7573i.m23587b(str, "$this$substring");
        C7573i.m23587b(cVar, "range");
        String substring = str.substring(cVar.mo19435b().intValue(), cVar.mo19436c().intValue() + 1);
        C7573i.m23582a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: a */
    public static final String m23736a(CharSequence charSequence, C7549c cVar) {
        C7573i.m23587b(charSequence, "$this$substring");
        C7573i.m23587b(cVar, "range");
        return charSequence.subSequence(cVar.mo19435b().intValue(), cVar.mo19436c().intValue() + 1).toString();
    }

    /* renamed from: a */
    public static final CharSequence m23734a(CharSequence charSequence, int i, int i2, CharSequence charSequence2) {
        C7573i.m23587b(charSequence, "$this$replaceRange");
        C7573i.m23587b(charSequence2, "replacement");
        if (i2 >= i) {
            StringBuilder sb = new StringBuilder();
            sb.append(charSequence, 0, i);
            sb.append(charSequence2);
            sb.append(charSequence, i2, charSequence.length());
            return sb;
        }
        StringBuilder sb2 = new StringBuilder("End index (");
        sb2.append(i2);
        sb2.append(") is less than start index (");
        sb2.append(i);
        sb2.append(").");
        throw new IndexOutOfBoundsException(sb2.toString());
    }

    /* renamed from: a */
    public static final CharSequence m23733a(CharSequence charSequence, int i, int i2) {
        C7573i.m23587b(charSequence, "$this$removeRange");
        if (i2 < i) {
            StringBuilder sb = new StringBuilder("End index (");
            sb.append(i2);
            sb.append(") is less than start index (");
            sb.append(i);
            sb.append(").");
            throw new IndexOutOfBoundsException(sb.toString());
        } else if (i2 == i) {
            return charSequence.subSequence(0, charSequence.length());
        } else {
            StringBuilder sb2 = new StringBuilder(charSequence.length() - (i2 - i));
            sb2.append(charSequence, 0, i);
            sb2.append(charSequence, i2, charSequence.length());
            return sb2;
        }
    }

    /* renamed from: a */
    public static final CharSequence m23735a(CharSequence charSequence, CharSequence charSequence2) {
        C7573i.m23587b(charSequence, "$this$removeSuffix");
        C7573i.m23587b(charSequence2, "suffix");
        if (C7634n.m23772b(charSequence, charSequence2, false)) {
            return charSequence.subSequence(0, charSequence.length() - charSequence2.length());
        }
        return charSequence.subSequence(0, charSequence.length());
    }

    /* renamed from: a */
    public static final String m23738a(String str, CharSequence charSequence) {
        C7573i.m23587b(str, "$this$removeSuffix");
        C7573i.m23587b(charSequence, "suffix");
        if (!C7634n.m23772b((CharSequence) str, charSequence, false)) {
            return str;
        }
        String substring = str.substring(0, str.length() - charSequence.length());
        C7573i.m23582a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: a */
    public static final String m23739a(String str, CharSequence charSequence, CharSequence charSequence2) {
        C7573i.m23587b(str, "$this$removeSurrounding");
        C7573i.m23587b(charSequence, "prefix");
        C7573i.m23587b(charSequence2, "suffix");
        if (str.length() >= charSequence.length() + charSequence2.length()) {
            CharSequence charSequence3 = str;
            if (C7634n.m23755a(charSequence3, charSequence, false) && C7634n.m23772b(charSequence3, charSequence2, false)) {
                String substring = str.substring(charSequence.length(), str.length() - charSequence2.length());
                C7573i.m23582a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                return substring;
            }
        }
        return str;
    }

    /* renamed from: a */
    public static final boolean m23754a(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        C7573i.m23587b(charSequence, "$this$regionMatchesImpl");
        C7573i.m23587b(charSequence2, "other");
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!C7625a.m23678a(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static final boolean m23752a(CharSequence charSequence, char c, boolean z) {
        C7573i.m23587b(charSequence, "$this$endsWith");
        return charSequence.length() > 0 && C7625a.m23678a(charSequence.charAt(C7634n.m23780f(charSequence)), c, z);
    }

    /* renamed from: a */
    public static final boolean m23755a(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        C7573i.m23587b(charSequence, "$this$startsWith");
        C7573i.m23587b(charSequence2, "prefix");
        if (!z && (charSequence instanceof String) && (charSequence2 instanceof String)) {
            return C7634n.m23721b((String) charSequence, (String) charSequence2, false);
        }
        return C7634n.m23754a(charSequence, 0, charSequence2, 0, charSequence2.length(), z);
    }

    /* renamed from: b */
    public static final boolean m23772b(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        C7573i.m23587b(charSequence, "$this$endsWith");
        C7573i.m23587b(charSequence2, "suffix");
        if (!z && (charSequence instanceof String) && (charSequence2 instanceof String)) {
            return C7634n.m23723c((String) charSequence, (String) charSequence2, false);
        }
        return C7634n.m23754a(charSequence, charSequence.length() - charSequence2.length(), charSequence2, 0, charSequence2.length(), z);
    }

    /* renamed from: a */
    public static final Pair<Integer, String> m23743a(CharSequence charSequence, Collection<String> collection, int i, boolean z, boolean z2) {
        Object obj;
        Object obj2;
        if (z || collection.size() != 1) {
            C7547a cVar = new C7549c(C7551d.m23566c(i, 0), charSequence.length());
            if (charSequence instanceof String) {
                int i2 = cVar.f20877a;
                int i3 = cVar.f20878b;
                int i4 = cVar.f20879c;
                if (i4 < 0 ? i2 >= i3 : i2 <= i3) {
                    while (true) {
                        Iterator it = collection.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj2 = null;
                                break;
                            }
                            obj2 = it.next();
                            String str = (String) obj2;
                            if (C7634n.m23714a(str, 0, (String) charSequence, i2, str.length(), z)) {
                                break;
                            }
                        }
                        String str2 = (String) obj2;
                        if (str2 == null) {
                            if (i2 == i3) {
                                break;
                            }
                            i2 += i4;
                        } else {
                            return C7579l.m23633a(Integer.valueOf(i2), str2);
                        }
                    }
                }
            } else {
                int i5 = cVar.f20877a;
                int i6 = cVar.f20878b;
                int i7 = cVar.f20879c;
                if (i7 < 0 ? i5 >= i6 : i5 <= i6) {
                    while (true) {
                        Iterator it2 = collection.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it2.next();
                            String str3 = (String) obj;
                            if (C7634n.m23754a((CharSequence) str3, 0, charSequence, i5, str3.length(), z)) {
                                break;
                            }
                        }
                        String str4 = (String) obj;
                        if (str4 == null) {
                            if (i5 == i6) {
                                break;
                            }
                            i5 += i7;
                        } else {
                            return C7579l.m23633a(Integer.valueOf(i5), str4);
                        }
                    }
                }
            }
            return null;
        }
        String str5 = (String) C7525m.m23508d((Iterable<? extends T>) collection);
        int a = C7634n.m23730a(charSequence, str5, i, false, 4, (Object) null);
        if (a < 0) {
            return null;
        }
        return C7579l.m23633a(Integer.valueOf(a), str5);
    }

    /* renamed from: b */
    public static final boolean m23770b(CharSequence charSequence, char c, boolean z) {
        C7573i.m23587b(charSequence, "$this$contains");
        return C7634n.m23726a(charSequence, c, 0, z, 2, (Object) null) >= 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final C7604g<C7549c> m23744a(CharSequence charSequence, char[] cArr, int i, boolean z, int i2) {
        if (i2 >= 0) {
            return new C7628e<>(charSequence, i, i2, new C7646a(cArr, z));
        }
        StringBuilder sb = new StringBuilder("Limit must be non-negative, but was ");
        sb.append(i2);
        sb.append('.');
        throw new IllegalArgumentException(sb.toString().toString());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final C7604g<C7549c> m23748a(CharSequence charSequence, String[] strArr, int i, boolean z, int i2) {
        if (i2 >= 0) {
            return new C7628e<>(charSequence, i, i2, new C7647b(C7519g.m23418a(strArr), z));
        }
        StringBuilder sb = new StringBuilder("Limit must be non-negative, but was ");
        sb.append(i2);
        sb.append('.');
        throw new IllegalArgumentException(sb.toString().toString());
    }

    /* renamed from: a */
    public static /* synthetic */ C7604g m23751a(CharSequence charSequence, String[] strArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return C7634n.m23750a(charSequence, strArr, z, 0);
    }

    /* renamed from: a */
    public static final C7604g<String> m23750a(CharSequence charSequence, String[] strArr, boolean z, int i) {
        C7573i.m23587b(charSequence, "$this$splitToSequence");
        C7573i.m23587b(strArr, "delimiters");
        return C7605h.m23659d(m23748a(charSequence, strArr, 0, z, i), new C7648c(charSequence));
    }

    /* renamed from: b */
    public static final List<String> m23768b(CharSequence charSequence, String[] strArr, boolean z, int i) {
        C7573i.m23587b(charSequence, "$this$split");
        C7573i.m23587b(strArr, "delimiters");
        if (strArr.length == 1) {
            boolean z2 = false;
            String str = strArr[0];
            if (str.length() == 0) {
                z2 = true;
            }
            if (!z2) {
                return m23742a(charSequence, str, z, i);
            }
        }
        Iterable<C7549c> l = C7605h.m23668l(m23748a(charSequence, strArr, 0, z, i));
        Collection arrayList = new ArrayList(C7525m.m23469a(l, 10));
        for (C7549c a : l) {
            arrayList.add(C7634n.m23736a(charSequence, a));
        }
        return (List) arrayList;
    }

    /* renamed from: a */
    public static final C7604g<String> m23746a(CharSequence charSequence, char[] cArr, boolean z, int i) {
        C7573i.m23587b(charSequence, "$this$splitToSequence");
        C7573i.m23587b(cArr, "delimiters");
        return C7605h.m23659d(m23744a(charSequence, cArr, 0, z, i), new C7649d(charSequence));
    }

    /* renamed from: b */
    public static final List<String> m23766b(CharSequence charSequence, char[] cArr, boolean z, int i) {
        C7573i.m23587b(charSequence, "$this$split");
        C7573i.m23587b(cArr, "delimiters");
        if (cArr.length == 1) {
            return m23742a(charSequence, String.valueOf(cArr[0]), z, i);
        }
        Iterable<C7549c> l = C7605h.m23668l(m23744a(charSequence, cArr, 0, z, i));
        Collection arrayList = new ArrayList(C7525m.m23469a(l, 10));
        for (C7549c a : l) {
            arrayList.add(C7634n.m23736a(charSequence, a));
        }
        return (List) arrayList;
    }

    /* renamed from: a */
    private static final List<String> m23742a(CharSequence charSequence, String str, boolean z, int i) {
        int i2 = 0;
        if (i >= 0) {
            int a = C7634n.m23729a(charSequence, str, 0, z);
            if (a == -1 || i == 1) {
                return C7525m.m23457a(charSequence.toString());
            }
            boolean z2 = i > 0;
            int i3 = 10;
            if (z2) {
                i3 = C7551d.m23567d(i, 10);
            }
            ArrayList arrayList = new ArrayList(i3);
            do {
                arrayList.add(charSequence.subSequence(i2, a).toString());
                i2 = str.length() + a;
                if (z2 && arrayList.size() == i - 1) {
                    break;
                }
                a = C7634n.m23729a(charSequence, str, i2, z);
            } while (a != -1);
            arrayList.add(charSequence.subSequence(i2, charSequence.length()).toString());
            return arrayList;
        }
        StringBuilder sb = new StringBuilder("Limit must be non-negative, but was ");
        sb.append(i);
        sb.append('.');
        throw new IllegalArgumentException(sb.toString().toString());
    }

    /* renamed from: f */
    public static final int m23780f(CharSequence charSequence) {
        C7573i.m23587b(charSequence, "$this$lastIndex");
        return charSequence.length() - 1;
    }

    /* renamed from: h */
    public static final List<String> m23782h(CharSequence charSequence) {
        C7573i.m23587b(charSequence, "$this$lines");
        return C7605h.m23664h(C7634n.m23781g(charSequence));
    }

    /* renamed from: e */
    public static final C7549c m23779e(CharSequence charSequence) {
        C7573i.m23587b(charSequence, "$this$indices");
        return new C7549c(0, charSequence.length() - 1);
    }

    /* renamed from: c */
    public static final CharSequence m23774c(CharSequence charSequence) {
        C7573i.m23587b(charSequence, "$this$trimStart");
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!C7625a.m23677a(charSequence.charAt(i))) {
                return charSequence.subSequence(i, charSequence.length());
            }
        }
        return "";
    }

    /* renamed from: d */
    public static final CharSequence m23778d(CharSequence charSequence) {
        C7573i.m23587b(charSequence, "$this$trimEnd");
        int length = charSequence.length();
        do {
            length--;
            if (length < 0) {
                return "";
            }
        } while (C7625a.m23677a(charSequence.charAt(length)));
        return charSequence.subSequence(0, length + 1);
    }

    /* renamed from: g */
    public static final C7604g<String> m23781g(CharSequence charSequence) {
        C7573i.m23587b(charSequence, "$this$lineSequence");
        return C7634n.m23751a(charSequence, new String[]{"\r\n", "\n", "\r"}, false, 0, 6, (Object) null);
    }

    /* renamed from: b */
    public static final CharSequence m23762b(CharSequence charSequence) {
        int i;
        C7573i.m23587b(charSequence, "$this$trim");
        int length = charSequence.length() - 1;
        int i2 = 0;
        boolean z = false;
        while (i2 <= length) {
            if (!z) {
                i = i2;
            } else {
                i = length;
            }
            boolean a = C7625a.m23677a(charSequence.charAt(i));
            if (z) {
                if (!a) {
                    break;
                }
                length--;
            } else if (!a) {
                z = true;
            } else {
                i2++;
            }
        }
        return charSequence.subSequence(i2, length + 1);
    }

    /* renamed from: b */
    public static final String m23763b(String str, CharSequence charSequence) {
        C7573i.m23587b(str, "$this$removeSurrounding");
        C7573i.m23587b(charSequence, "delimiter");
        return C7634n.m23739a(str, charSequence, charSequence);
    }

    /* renamed from: c */
    public static final String m23775c(String str, String str2, String str3) {
        C7573i.m23587b(str, "$this$substringAfterLast");
        C7573i.m23587b(str2, "delimiter");
        C7573i.m23587b(str3, "missingDelimiterValue");
        int b = C7634n.m23760b((CharSequence) str, str2, 0, false, 6, (Object) null);
        if (b == -1) {
            return str3;
        }
        String substring = str.substring(b + str2.length(), str.length());
        C7573i.m23582a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: c */
    public static final boolean m23776c(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        C7573i.m23587b(charSequence, "$this$contains");
        C7573i.m23587b(charSequence2, "other");
        if (charSequence2 instanceof String) {
            if (C7634n.m23730a(charSequence, (String) charSequence2, 0, z, 2, (Object) null) >= 0) {
                return true;
            }
            return false;
        }
        if (m23727a(charSequence, charSequence2, 0, charSequence.length(), z, false) >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static final CharSequence m23732a(CharSequence charSequence, int i, char c) {
        C7573i.m23587b(charSequence, "$this$padStart");
        if (i < 0) {
            StringBuilder sb = new StringBuilder("Desired length ");
            sb.append(i);
            sb.append(" is less than zero.");
            throw new IllegalArgumentException(sb.toString());
        } else if (i <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        } else {
            StringBuilder sb2 = new StringBuilder(i);
            int length = i - charSequence.length();
            if (length > 0) {
                int i2 = 1;
                while (true) {
                    sb2.append(c);
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            sb2.append(charSequence);
            return sb2;
        }
    }

    /* renamed from: b */
    public static final String m23764b(String str, String str2, String str3) {
        C7573i.m23587b(str, "$this$substringBeforeLast");
        C7573i.m23587b(str2, "delimiter");
        C7573i.m23587b(str3, "missingDelimiterValue");
        int b = C7634n.m23760b((CharSequence) str, str2, 0, false, 6, (Object) null);
        if (b == -1) {
            return str3;
        }
        String substring = str.substring(0, b);
        C7573i.m23582a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: a */
    public static final int m23725a(CharSequence charSequence, char c, int i, boolean z) {
        C7573i.m23587b(charSequence, "$this$indexOf");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(c, i);
        }
        return C7634n.m23731a(charSequence, new char[]{c}, i, z);
    }

    /* renamed from: b */
    public static final int m23757b(CharSequence charSequence, char c, int i, boolean z) {
        C7573i.m23587b(charSequence, "$this$lastIndexOf");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(c, i);
        }
        return C7634n.m23761b(charSequence, new char[]{c}, i, z);
    }

    /* renamed from: b */
    public static final int m23759b(CharSequence charSequence, String str, int i, boolean z) {
        C7573i.m23587b(charSequence, "$this$lastIndexOf");
        C7573i.m23587b(str, "string");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(str, i);
        }
        return m23727a(charSequence, (CharSequence) str, i, 0, z, true);
    }

    /* renamed from: a */
    public static final int m23729a(CharSequence charSequence, String str, int i, boolean z) {
        C7573i.m23587b(charSequence, "$this$indexOf");
        C7573i.m23587b(str, "string");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i);
        }
        return m23727a(charSequence, (CharSequence) str, i, charSequence.length(), z, false);
    }

    /* renamed from: b */
    public static final int m23761b(CharSequence charSequence, char[] cArr, int i, boolean z) {
        C7573i.m23587b(charSequence, "$this$lastIndexOfAny");
        C7573i.m23587b(cArr, "chars");
        if (z || !(charSequence instanceof String)) {
            for (int d = C7551d.m23567d(i, C7634n.m23780f(charSequence)); d >= 0; d--) {
                char charAt = charSequence.charAt(d);
                boolean z2 = false;
                int i2 = 0;
                while (true) {
                    if (i2 > 0) {
                        break;
                    } else if (C7625a.m23678a(cArr[i2], charAt, z)) {
                        z2 = true;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (z2) {
                    return d;
                }
            }
            return -1;
        }
        return ((String) charSequence).lastIndexOf(C7519g.m23423a(cArr), i);
    }

    /* renamed from: a */
    public static final int m23731a(CharSequence charSequence, char[] cArr, int i, boolean z) {
        boolean z2;
        C7573i.m23587b(charSequence, "$this$indexOfAny");
        C7573i.m23587b(cArr, "chars");
        if (z || cArr.length != 1 || !(charSequence instanceof String)) {
            int c = C7551d.m23566c(i, 0);
            int f = C7634n.m23780f(charSequence);
            if (c <= f) {
                while (true) {
                    char charAt = charSequence.charAt(c);
                    int length = cArr.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            z2 = false;
                            break;
                        } else if (C7625a.m23678a(cArr[i2], charAt, z)) {
                            z2 = true;
                            break;
                        } else {
                            i2++;
                        }
                    }
                    if (!z2) {
                        if (c == f) {
                            break;
                        }
                        c++;
                    } else {
                        return c;
                    }
                }
            }
            return -1;
        }
        return ((String) charSequence).indexOf(C7519g.m23423a(cArr), i);
    }

    /* renamed from: a */
    public static /* synthetic */ int m23726a(CharSequence charSequence, char c, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return C7634n.m23725a(charSequence, c, i, z);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final int m23727a(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        C7547a aVar;
        if (!z2) {
            aVar = new C7549c(C7551d.m23566c(i, 0), C7551d.m23567d(i2, charSequence.length()));
        } else {
            aVar = C7551d.m23563a(C7551d.m23567d(i, C7634n.m23780f(charSequence)), C7551d.m23566c(i2, 0));
        }
        if (!(charSequence instanceof String) || !(charSequence2 instanceof String)) {
            int i3 = aVar.f20877a;
            int i4 = aVar.f20878b;
            int i5 = aVar.f20879c;
            if (i5 < 0 ? i3 >= i4 : i3 <= i4) {
                while (true) {
                    if (!C7634n.m23754a(charSequence2, 0, charSequence, i3, charSequence2.length(), z)) {
                        if (i3 == i4) {
                            break;
                        }
                        i3 += i5;
                    } else {
                        return i3;
                    }
                }
            }
        } else {
            int i6 = aVar.f20877a;
            int i7 = aVar.f20878b;
            int i8 = aVar.f20879c;
            if (i8 < 0 ? i6 >= i7 : i6 <= i7) {
                while (true) {
                    if (!C7634n.m23714a((String) charSequence2, 0, (String) charSequence, i6, charSequence2.length(), z)) {
                        if (i6 == i7) {
                            break;
                        }
                        i6 += i8;
                    } else {
                        return i6;
                    }
                }
            }
        }
        return -1;
    }

    /* renamed from: b */
    public static /* synthetic */ int m23760b(CharSequence charSequence, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = C7634n.m23780f(charSequence);
        }
        return C7634n.m23759b(charSequence, str, i, false);
    }

    /* renamed from: a */
    public static /* synthetic */ int m23730a(CharSequence charSequence, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return C7634n.m23729a(charSequence, str, i, z);
    }
}
