package android.support.design.p015a;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.support.p022v4.util.C0904k;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.design.a.h */
public final class C0241h {

    /* renamed from: a */
    private final C0904k<String, C0242i> f885a = new C0904k<>();

    public final int hashCode() {
        return this.f885a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(10);
        sb.append(getClass().getName());
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" timings: ");
        sb.append(this.f885a);
        sb.append("}\n");
        return sb.toString();
    }

    /* renamed from: a */
    public final long mo672a() {
        int size = this.f885a.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            C0242i iVar = (C0242i) this.f885a.mo3418c(i);
            j = Math.max(j, iVar.f886a + iVar.f887b);
        }
        return j;
    }

    /* renamed from: b */
    private boolean m846b(String str) {
        if (this.f885a.get(str) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static C0241h m843a(List<Animator> list) {
        C0241h hVar = new C0241h();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            m844a(hVar, (Animator) list.get(i));
        }
        return hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f885a.equals(((C0241h) obj).f885a);
    }

    /* renamed from: a */
    public final C0242i mo673a(String str) {
        if (m846b(str)) {
            return (C0242i) this.f885a.get(str);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    private void m845a(String str, C0242i iVar) {
        this.f885a.put(str, iVar);
    }

    /* renamed from: a */
    public static C0241h m842a(Context context, int i) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (loadAnimator instanceof AnimatorSet) {
                return m843a((List<Animator>) ((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return m843a((List<Animator>) arrayList);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static void m844a(C0241h hVar, Animator animator) {
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            hVar.m845a(objectAnimator.getPropertyName(), C0242i.m849a((ValueAnimator) objectAnimator));
            return;
        }
        StringBuilder sb = new StringBuilder("Animator must be an ObjectAnimator: ");
        sb.append(animator);
        throw new IllegalArgumentException(sb.toString());
    }
}
