package kotlin.text;

import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7562b;

/* renamed from: kotlin.text.s */
public class C7641s extends C7640r {
    /* renamed from: a */
    public static final <T> void m23701a(Appendable appendable, T t, C7562b<? super T, ? extends CharSequence> bVar) {
        boolean z;
        C7573i.m23587b(appendable, "$this$appendElement");
        if (bVar != null) {
            appendable.append((CharSequence) bVar.invoke(t));
            return;
        }
        if (t != null) {
            z = t instanceof CharSequence;
        } else {
            z = true;
        }
        if (z) {
            appendable.append((CharSequence) t);
        } else if (t instanceof Character) {
            appendable.append(((Character) t).charValue());
        } else {
            appendable.append(String.valueOf(t));
        }
    }
}
