package com.bytedance.android.live.base.model.user;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.p122a.C2368a;
import com.google.gson.p276a.C6593c;

/* renamed from: com.bytedance.android.live.base.model.user.c */
public class C2371c implements C2368a {
    @C6593c(mo15949a = "level")

    /* renamed from: a */
    public int f7796a;
    @C6593c(mo15949a = "experience")

    /* renamed from: b */
    public long f7797b;
    @C6593c(mo15949a = "lowest_experience_this_level")

    /* renamed from: c */
    public long f7798c;
    @C6593c(mo15949a = "highest_experience_this_level")

    /* renamed from: d */
    public long f7799d;
    @C6593c(mo15949a = "task_start_experience")

    /* renamed from: e */
    public long f7800e;
    @C6593c(mo15949a = "task_start_time")

    /* renamed from: f */
    public long f7801f;
    @C6593c(mo15949a = "task_decrease_experience")

    /* renamed from: g */
    public long f7802g;
    @C6593c(mo15949a = "task_target_experience")

    /* renamed from: h */
    public long f7803h;
    @C6593c(mo15949a = "task_end_time")

    /* renamed from: i */
    public long f7804i;
    @C6593c(mo15949a = "profile_dialog_bg")

    /* renamed from: j */
    public ImageModel f7805j;
    @C6593c(mo15949a = "profile_dialog_bg_back")

    /* renamed from: k */
    public ImageModel f7806k;
    @C6593c(mo15949a = "stage_level")

    /* renamed from: l */
    public ImageModel f7807l;
    @C6593c(mo15949a = "small_icon")

    /* renamed from: m */
    public ImageModel f7808m;

    /* renamed from: a */
    public final int mo8685a() {
        return this.f7796a;
    }

    /* renamed from: b */
    public final long mo8686b() {
        return this.f7797b;
    }

    /* renamed from: c */
    public final long mo8687c() {
        return this.f7798c;
    }

    /* renamed from: d */
    public final long mo8688d() {
        return this.f7799d;
    }

    /* renamed from: e */
    public final long mo8689e() {
        return this.f7800e;
    }

    /* renamed from: f */
    public final long mo8690f() {
        return this.f7801f;
    }

    /* renamed from: g */
    public final long mo8691g() {
        return this.f7802g;
    }

    /* renamed from: h */
    public final long mo8692h() {
        return this.f7803h;
    }

    /* renamed from: i */
    public final long mo8693i() {
        return this.f7804i;
    }

    /* renamed from: j */
    public final ImageModel mo8694j() {
        return this.f7805j;
    }

    /* renamed from: k */
    public final ImageModel mo8695k() {
        return this.f7806k;
    }

    /* renamed from: l */
    public final ImageModel mo8696l() {
        return this.f7807l;
    }

    /* renamed from: m */
    public final ImageModel mo8697m() {
        return this.f7808m;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = 0;
        if (this.f7808m != null) {
            i = this.f7808m.hashCode();
        } else {
            i = 0;
        }
        int i6 = ((((((((((((((((((i * 31) + this.f7796a) * 31) + ((int) (this.f7797b ^ (this.f7797b >>> 32)))) * 31) + ((int) (this.f7798c ^ (this.f7798c >>> 32)))) * 31) + ((int) (this.f7799d ^ (this.f7799d >>> 32)))) * 31) + ((int) (this.f7800e ^ (this.f7800e >>> 32)))) * 31) + ((int) (this.f7801f ^ (this.f7801f >>> 32)))) * 31) + ((int) (this.f7802g ^ (this.f7802g >>> 32)))) * 31) + ((int) (this.f7803h ^ (this.f7803h >>> 32)))) * 31) + ((int) (this.f7804i ^ (this.f7804i >>> 32)))) * 31;
        if (this.f7805j != null) {
            i2 = this.f7805j.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (i6 + i2) * 31;
        if (this.f7806k != null) {
            i3 = this.f7806k.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 31;
        if (this.f7807l != null) {
            i4 = this.f7807l.hashCode();
        } else {
            i4 = 0;
        }
        int i9 = (i8 + i4) * 31;
        if (this.f7808m != null) {
            i5 = this.f7808m.hashCode();
        }
        return i9 + i5;
    }

    /* renamed from: a */
    public static C2371c m10003a(C2368a aVar) {
        if (aVar == null) {
            return null;
        }
        if (aVar instanceof C2371c) {
            return (C2371c) aVar;
        }
        C2371c cVar = new C2371c();
        cVar.m10004b(aVar);
        return cVar;
    }

    /* renamed from: b */
    private void m10004b(C2368a aVar) {
        this.f7796a = aVar.mo8685a();
        this.f7797b = aVar.mo8686b();
        this.f7798c = aVar.mo8687c();
        this.f7799d = aVar.mo8688d();
        this.f7800e = aVar.mo8689e();
        this.f7801f = aVar.mo8690f();
        this.f7802g = aVar.mo8691g();
        this.f7803h = aVar.mo8692h();
        this.f7804i = aVar.mo8693i();
        this.f7805j = aVar.mo8694j();
        this.f7806k = aVar.mo8695k();
        this.f7807l = aVar.mo8696l();
        this.f7808m = aVar.mo8697m();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C2371c cVar = (C2371c) obj;
        if (this.f7796a != cVar.f7796a || this.f7797b != cVar.f7797b || this.f7798c != cVar.f7798c || this.f7799d != cVar.f7799d || this.f7800e != cVar.f7800e || this.f7801f != cVar.f7801f || this.f7802g != cVar.f7802g || this.f7803h != cVar.f7803h || this.f7804i != cVar.f7804i) {
            return false;
        }
        if (this.f7805j == null ? cVar.f7805j != null : !this.f7805j.equals(cVar.f7805j)) {
            return false;
        }
        if (this.f7806k == null ? cVar.f7806k != null : !this.f7806k.equals(cVar.f7806k)) {
            return false;
        }
        if (this.f7807l == null ? cVar.f7807l != null : !this.f7807l.equals(cVar.f7807l)) {
            return false;
        }
        if (this.f7808m != null) {
            return this.f7808m.equals(cVar.f7808m);
        }
        if (cVar.f7808m == null) {
            return true;
        }
        return false;
    }
}
