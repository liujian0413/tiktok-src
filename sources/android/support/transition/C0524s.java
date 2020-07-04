package android.support.transition;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: android.support.transition.s */
public final class C0524s {

    /* renamed from: a */
    public final Map<String, Object> f2072a = new HashMap();

    /* renamed from: b */
    public View f2073b;

    /* renamed from: c */
    final ArrayList<C0508m> f2074c = new ArrayList<>();

    public final int hashCode() {
        return (this.f2073b.hashCode() * 31) + this.f2072a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransitionValues@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(":\n");
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(sb2);
        sb3.append("    view = ");
        sb3.append(this.f2073b);
        sb3.append("\n");
        String sb4 = sb3.toString();
        StringBuilder sb5 = new StringBuilder();
        sb5.append(sb4);
        sb5.append("    values:");
        String sb6 = sb5.toString();
        for (String str : this.f2072a.keySet()) {
            StringBuilder sb7 = new StringBuilder();
            sb7.append(sb6);
            sb7.append("    ");
            sb7.append(str);
            sb7.append(": ");
            sb7.append(this.f2072a.get(str));
            sb7.append("\n");
            sb6 = sb7.toString();
        }
        return sb6;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0524s) {
            C0524s sVar = (C0524s) obj;
            if (this.f2073b == sVar.f2073b && this.f2072a.equals(sVar.f2072a)) {
                return true;
            }
        }
        return false;
    }
}
