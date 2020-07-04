package kotlin.text;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;

/* renamed from: kotlin.text.o */
public class C7635o {

    /* renamed from: kotlin.text.o$a */
    static final class C7636a extends Lambda implements C7562b<String, String> {

        /* renamed from: a */
        public static final C7636a f20928a = new C7636a();

        C7636a() {
            super(1);
        }

        /* renamed from: a */
        private static String m23699a(String str) {
            C7573i.m23587b(str, "line");
            return str;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return m23699a((String) obj);
        }
    }

    /* renamed from: kotlin.text.o$b */
    static final class C7637b extends Lambda implements C7562b<String, String> {

        /* renamed from: a */
        final /* synthetic */ String f20929a;

        C7637b(String str) {
            this.f20929a = str;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public String invoke(String str) {
            C7573i.m23587b(str, "line");
            StringBuilder sb = new StringBuilder();
            sb.append(this.f20929a);
            sb.append(str);
            return sb.toString();
        }
    }

    /* renamed from: a */
    public static final String m23692a(String str) {
        C7573i.m23587b(str, "$this$trimIndent");
        return C7634n.m23697b(str, "");
    }

    /* renamed from: c */
    private static final C7562b<String, String> m23698c(String str) {
        boolean z;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return C7636a.f20928a;
        }
        return new C7637b<>(str);
    }

    /* renamed from: b */
    private static final int m23696b(String str) {
        CharSequence charSequence = str;
        int length = charSequence.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (!C7625a.m23677a(charSequence.charAt(i))) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return str.length();
        }
        return i;
    }

    /* renamed from: a */
    public static final String m23693a(String str, String str2) {
        C7573i.m23587b(str, "$this$trimMargin");
        C7573i.m23587b(str2, "marginPrefix");
        return C7634n.m23695a(str, "", str2);
    }

    /* renamed from: b */
    public static final String m23697b(String str, String str2) {
        int i;
        String str3 = str;
        C7573i.m23587b(str3, "$this$replaceIndent");
        C7573i.m23587b(str2, "newIndent");
        List h = C7634n.m23782h(str3);
        Iterable iterable = h;
        Collection arrayList = new ArrayList();
        for (Object next : iterable) {
            if (!C7634n.m23713a((String) next)) {
                arrayList.add(next);
            }
        }
        Iterable<String> iterable2 = (List) arrayList;
        Collection arrayList2 = new ArrayList(C7525m.m23469a(iterable2, 10));
        for (String b : iterable2) {
            arrayList2.add(Integer.valueOf(m23696b(b)));
        }
        Integer num = (Integer) C7525m.m23525o((List) arrayList2);
        int i2 = 0;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        int length = str.length() + (str2.length() * h.size());
        C7562b c = m23698c(str2);
        int a = C7525m.m23459a(h);
        Collection arrayList3 = new ArrayList();
        for (Object next2 : iterable) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                C7525m.m23465b();
            }
            String str4 = (String) next2;
            if ((i2 == 0 || i2 == a) && C7634n.m23713a(str4)) {
                str4 = null;
            } else {
                String c2 = C7634n.m23787c(str4, i);
                if (c2 != null) {
                    String str5 = (String) c.invoke(c2);
                    if (str5 != null) {
                        str4 = str5;
                    }
                }
            }
            if (str4 != null) {
                arrayList3.add(str4);
            }
            i2 = i3;
        }
        String sb = ((StringBuilder) C7525m.m23488a((List) arrayList3, new StringBuilder(length), "\n", "", "", -1, "...", null)).toString();
        C7573i.m23582a((Object) sb, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
        return sb;
    }

    /* renamed from: a */
    public static final String m23695a(String str, String str2, String str3) {
        int i;
        String str4 = str;
        String str5 = str3;
        C7573i.m23587b(str4, "$this$replaceIndentByMargin");
        C7573i.m23587b(str2, "newIndent");
        C7573i.m23587b(str5, "marginPrefix");
        if (!C7634n.m23713a(str5)) {
            List h = C7634n.m23782h(str4);
            int length = str.length() + (str2.length() * h.size());
            C7562b c = m23698c(str2);
            int a = C7525m.m23459a(h);
            Iterable iterable = h;
            Collection arrayList = new ArrayList();
            int i2 = 0;
            for (Object next : iterable) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    C7525m.m23465b();
                }
                String str6 = (String) next;
                String str7 = null;
                if ((i2 == 0 || i2 == a) && C7634n.m23713a(str6)) {
                    str6 = null;
                } else {
                    CharSequence charSequence = str6;
                    int length2 = charSequence.length();
                    int i4 = 0;
                    while (true) {
                        if (i4 >= length2) {
                            i = -1;
                            break;
                        } else if (!C7625a.m23677a(charSequence.charAt(i4))) {
                            i = i4;
                            break;
                        } else {
                            i4++;
                        }
                    }
                    if (i != -1) {
                        int i5 = i;
                        if (C7634n.m23716a(str6, str3, i, false, 4, (Object) null)) {
                            int length3 = i5 + str3.length();
                            if (str6 != null) {
                                str7 = str6.substring(length3);
                                C7573i.m23582a((Object) str7, "(this as java.lang.String).substring(startIndex)");
                            } else {
                                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                            }
                        }
                    }
                    if (str7 != null) {
                        String str8 = (String) c.invoke(str7);
                        if (str8 != null) {
                            str6 = str8;
                        }
                    }
                }
                if (str6 != null) {
                    arrayList.add(str6);
                }
                i2 = i3;
            }
            String sb = ((StringBuilder) C7525m.m23488a((List) arrayList, new StringBuilder(length), "\n", "", "", -1, "...", null)).toString();
            C7573i.m23582a((Object) sb, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
            return sb;
        }
        throw new IllegalArgumentException("marginPrefix must be non-blank string.".toString());
    }
}
