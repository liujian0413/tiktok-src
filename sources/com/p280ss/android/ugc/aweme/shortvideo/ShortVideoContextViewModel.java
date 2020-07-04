package com.p280ss.android.ugc.aweme.shortvideo;

import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.LiveData;
import android.support.p022v4.util.ArrayMap;
import com.p280ss.android.ugc.aweme.story.shootvideo.C42017d;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel */
public class ShortVideoContextViewModel extends C0063u {

    /* renamed from: a */
    public ShortVideoContext f99791a;

    /* renamed from: b */
    private ArrayMap<String, Object> f99792b = new ArrayMap<>();

    /* renamed from: c */
    private C0052o<Boolean> f99793c;

    /* renamed from: d */
    private C0052o<Boolean> f99794d;

    /* renamed from: e */
    private C0052o<Boolean> f99795e;

    /* renamed from: f */
    private C0052o<Boolean> f99796f;

    /* renamed from: g */
    private C0052o<Double> f99797g;

    /* renamed from: d */
    public final boolean mo96171d() {
        if (((Boolean) m122708a("native_inited")) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public final C0052o<Double> mo96178h() {
        if (this.f99797g == null) {
            this.f99797g = new C0052o<>();
        }
        return this.f99797g;
    }

    /* renamed from: j */
    public final LiveData<Boolean> mo96181j() {
        if (this.f99794d == null) {
            this.f99794d = new C0052o<>();
        }
        return this.f99794d;
    }

    /* renamed from: k */
    public final LiveData<Boolean> mo96182k() {
        if (this.f99795e == null) {
            this.f99795e = new C0052o<>();
        }
        return this.f99795e;
    }

    /* renamed from: l */
    public final LiveData<Boolean> mo96183l() {
        if (this.f99796f == null) {
            this.f99796f = new C0052o<>();
        }
        return this.f99796f;
    }

    /* renamed from: m */
    public final boolean mo96184m() {
        return C42017d.m133561a(m122710n());
    }

    /* renamed from: n */
    private int m122710n() {
        Integer num = (Integer) m122708a("shoot_mode");
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    /* renamed from: a */
    public final long mo96161a() {
        Long l = (Long) m122708a("auto_stop_time");
        if (l == null) {
            return 0;
        }
        return l.longValue();
    }

    /* renamed from: b */
    public final boolean mo96167b() {
        Boolean bool = (Boolean) m122708a("auto_count_down");
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* renamed from: c */
    public final boolean mo96169c() {
        Boolean bool = (Boolean) m122708a("photo_mode");
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* renamed from: e */
    public final boolean mo96173e() {
        Boolean bool = (Boolean) m122708a("has_stopped");
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    /* renamed from: g */
    public final double mo96176g() {
        Double d = (Double) m122708a("record_speed");
        if (d != null) {
            return d.doubleValue();
        }
        return 1.0d;
    }

    /* renamed from: i */
    public final C0052o<Boolean> mo96180i() {
        if (this.f99793c == null) {
            this.f99793c = new C0052o<>();
            this.f99793c.setValue(Boolean.valueOf(true));
        }
        return this.f99793c;
    }

    /* renamed from: f */
    public final boolean mo96175f() {
        Boolean bool = (Boolean) m122708a("has_go_next");
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* renamed from: a */
    private Object m122708a(String str) {
        return this.f99792b.get(str);
    }

    /* renamed from: b */
    public final void mo96166b(boolean z) {
        m122709a("photo_mode", Boolean.valueOf(z));
    }

    /* renamed from: c */
    public final void mo96168c(boolean z) {
        m122709a("native_inited", Boolean.valueOf(z));
    }

    /* renamed from: e */
    public final void mo96172e(boolean z) {
        m122709a("has_go_next", Boolean.valueOf(z));
    }

    /* renamed from: d */
    public final void mo96170d(boolean z) {
        mo96180i().setValue(Boolean.valueOf(z));
        m122709a("has_stopped", Boolean.valueOf(z));
    }

    /* renamed from: f */
    public final void mo96174f(boolean z) {
        if (this.f99794d == null) {
            this.f99794d = new C0052o<>();
        }
        this.f99794d.setValue(Boolean.valueOf(z));
    }

    /* renamed from: h */
    public final void mo96179h(boolean z) {
        if (this.f99796f == null) {
            this.f99796f = new C0052o<>();
        }
        this.f99796f.setValue(Boolean.valueOf(true));
    }

    /* renamed from: a */
    public final void mo96162a(double d) {
        m122709a("record_speed", Double.valueOf(d));
        if (this.f99797g == null) {
            this.f99797g = new C0052o<>();
        }
        this.f99797g.setValue(Double.valueOf(d));
    }

    /* renamed from: g */
    public final void mo96177g(boolean z) {
        if (this.f99795e == null) {
            this.f99795e = new C0052o<>();
        }
        this.f99795e.setValue(Boolean.valueOf(true));
    }

    /* renamed from: a */
    public final void mo96163a(int i) {
        m122709a("shoot_mode", Integer.valueOf(i));
    }

    /* renamed from: a */
    public final void mo96164a(long j) {
        m122709a("auto_stop_time", Long.valueOf(j));
    }

    /* renamed from: a */
    public final void mo96165a(boolean z) {
        m122709a("auto_count_down", Boolean.valueOf(z));
    }

    /* renamed from: a */
    private void m122709a(String str, Object obj) {
        this.f99792b.put(str, obj);
    }
}
