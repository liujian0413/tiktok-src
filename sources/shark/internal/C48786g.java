package shark.internal;

import com.taobao.android.dexposed.ClassUtils;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;
import shark.LeakTrace;
import shark.LeakTraceElement;
import shark.LeakTraceElement.Holder;
import shark.LeakTraceElement.Type;

/* renamed from: shark.internal.g */
public final class C48786g {
    /* renamed from: a */
    public static final String m150663a(LeakTrace leakTrace) {
        boolean z;
        String str;
        String str2;
        String str3;
        C7573i.m23587b(leakTrace, "$this$renderToString");
        String str4 = "┬";
        int i = 0;
        for (Object next : leakTrace.getElements()) {
            int i2 = i + 1;
            if (i < 0) {
                C7525m.m23465b();
            }
            LeakTraceElement leakTraceElement = (LeakTraceElement) next;
            if (i == C7525m.m23459a(leakTrace.getElements())) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                str = "├─ ";
            } else {
                str = "╰→ ";
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str4);
            sb.append("\n");
            sb.append(str);
            sb.append(leakTraceElement.getClassName());
            String sb2 = sb.toString();
            if (!z) {
                str2 = "│    ";
            } else {
                str2 = "​     ";
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append(sb2);
            sb3.append("\n");
            sb3.append(str2);
            sb3.append("Leaking: ");
            switch (C48787h.f124017a[((LeakTraceElement) leakTrace.getElements().get(i)).getLeakStatus().ordinal()]) {
                case 1:
                    str3 = "UNKNOWN";
                    break;
                case 2:
                    StringBuilder sb4 = new StringBuilder("NO (");
                    sb4.append(((LeakTraceElement) leakTrace.getElements().get(i)).getLeakStatusReason());
                    sb4.append(')');
                    str3 = sb4.toString();
                    break;
                case 3:
                    StringBuilder sb5 = new StringBuilder("YES (");
                    sb5.append(((LeakTraceElement) leakTrace.getElements().get(i)).getLeakStatusReason());
                    sb5.append(')');
                    str3 = sb5.toString();
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            sb3.append(str3);
            str4 = sb3.toString();
            for (String str5 : leakTraceElement.getLabels()) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(str4);
                sb6.append("\n");
                sb6.append(str2);
                sb6.append(str5);
                str4 = sb6.toString();
            }
            if (!z) {
                StringBuilder sb7 = new StringBuilder();
                sb7.append(str4);
                sb7.append("\n");
                sb7.append(str2);
                sb7.append("↓ ");
                sb7.append(m150664a(leakTrace, leakTraceElement, i));
                str4 = sb7.toString();
            }
            i = i2;
        }
        return str4;
    }

    /* renamed from: a */
    private static final String m150664a(LeakTrace leakTrace, LeakTraceElement leakTraceElement, int i) {
        String str;
        String str2;
        String str3;
        String str4;
        boolean elementMayBeLeakCause = leakTrace.elementMayBeLeakCause(i);
        if (leakTraceElement.getReference() == null || leakTraceElement.getReference().getType() != Type.STATIC_FIELD) {
            str = "";
        } else {
            str = "static ";
        }
        if (leakTraceElement.getHolder() == Holder.ARRAY || leakTraceElement.getHolder() == Holder.THREAD) {
            StringBuilder sb = new StringBuilder();
            String name = leakTraceElement.getHolder().name();
            Locale locale = Locale.US;
            C7573i.m23582a((Object) locale, "Locale.US");
            if (name != null) {
                String lowerCase = name.toLowerCase(locale);
                C7573i.m23582a((Object) lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                sb.append(lowerCase);
                sb.append(' ');
                str2 = sb.toString();
            } else {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
        } else {
            str2 = "";
        }
        String classSimpleName = leakTraceElement.getClassSimpleName();
        if (leakTraceElement.getReference() != null) {
            StringBuilder sb2 = new StringBuilder(ClassUtils.PACKAGE_SEPARATOR);
            sb2.append(leakTraceElement.getReference().getDisplayName());
            str3 = sb2.toString();
        } else {
            str3 = "";
        }
        int length = str.length() + str2.length() + classSimpleName.length() + 2;
        if (elementMayBeLeakCause) {
            StringBuilder sb3 = new StringBuilder("\n│     ");
            sb3.append(C7634n.m23708a(" ", length));
            sb3.append(C7634n.m23708a("~", str3.length() - 1));
            str4 = sb3.toString();
        } else {
            str4 = "";
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append(str);
        sb4.append(str2);
        sb4.append(classSimpleName);
        sb4.append(str3);
        sb4.append(str4);
        return sb4.toString();
    }
}
