package android.support.design.p015a;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

/* renamed from: android.support.design.a.i */
public final class C0242i {

    /* renamed from: a */
    public long f886a;

    /* renamed from: b */
    public long f887b = 300;

    /* renamed from: c */
    public int f888c;

    /* renamed from: d */
    public int f889d = 1;

    /* renamed from: e */
    private TimeInterpolator f890e;

    /* renamed from: a */
    public final TimeInterpolator mo677a() {
        if (this.f890e != null) {
            return this.f890e;
        }
        return C0234a.f873b;
    }

    public final int hashCode() {
        return (((((((((int) (this.f886a ^ (this.f886a >>> 32))) * 31) + ((int) (this.f887b ^ (this.f887b >>> 32)))) * 31) + mo677a().getClass().hashCode()) * 31) + this.f888c) * 31) + this.f889d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(10);
        sb.append(getClass().getName());
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" delay: ");
        sb.append(this.f886a);
        sb.append(" duration: ");
        sb.append(this.f887b);
        sb.append(" interpolator: ");
        sb.append(mo677a().getClass());
        sb.append(" repeatCount: ");
        sb.append(this.f888c);
        sb.append(" repeatMode: ");
        sb.append(this.f889d);
        sb.append("}\n");
        return sb.toString();
    }

    /* renamed from: a */
    static C0242i m849a(ValueAnimator valueAnimator) {
        C0242i iVar = new C0242i(valueAnimator.getStartDelay(), valueAnimator.getDuration(), m850b(valueAnimator));
        iVar.f888c = valueAnimator.getRepeatCount();
        iVar.f889d = valueAnimator.getRepeatMode();
        return iVar;
    }

    /* renamed from: b */
    private static TimeInterpolator m850b(ValueAnimator valueAnimator) {
        TimeInterpolator interpolator = valueAnimator.getInterpolator();
        if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
            return C0234a.f873b;
        }
        if (interpolator instanceof AccelerateInterpolator) {
            return C0234a.f874c;
        }
        if (interpolator instanceof DecelerateInterpolator) {
            return C0234a.f875d;
        }
        return interpolator;
    }

    /* renamed from: a */
    public final void mo678a(Animator animator) {
        animator.setStartDelay(this.f886a);
        animator.setDuration(this.f887b);
        animator.setInterpolator(mo677a());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(this.f888c);
            valueAnimator.setRepeatMode(this.f889d);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0242i iVar = (C0242i) obj;
        if (this.f886a == iVar.f886a && this.f887b == iVar.f887b && this.f888c == iVar.f888c && this.f889d == iVar.f889d) {
            return mo677a().getClass().equals(iVar.mo677a().getClass());
        }
        return false;
    }

    public C0242i(long j, long j2) {
        this.f886a = j;
        this.f887b = 150;
    }

    private C0242i(long j, long j2, TimeInterpolator timeInterpolator) {
        this.f886a = j;
        this.f887b = j2;
        this.f890e = timeInterpolator;
    }
}
