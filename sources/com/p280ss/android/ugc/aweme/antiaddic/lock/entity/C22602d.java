package com.p280ss.android.ugc.aweme.antiaddic.lock.entity;

import com.bytedance.ies.ugc.appcontext.C6399b;

/* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.entity.d */
public final class C22602d {

    /* renamed from: a */
    public String f60176a;

    /* renamed from: b */
    public long f60177b;

    /* renamed from: c */
    public String f60178c;

    /* renamed from: d */
    public boolean f60179d = true;

    /* renamed from: e */
    public boolean f60180e;

    public final int hashCode() {
        if (this.f60176a != null) {
            return this.f60176a.hashCode();
        }
        return 0;
    }

    /* renamed from: a */
    public final TimeLockUserSetting mo59298a() {
        TimeLockUserSetting timeLockUserSetting = new TimeLockUserSetting();
        timeLockUserSetting.setUserId(this.f60176a);
        timeLockUserSetting.setLastSetTime(this.f60177b);
        timeLockUserSetting.setPassword(this.f60178c);
        timeLockUserSetting.setTimeLockOn(this.f60179d);
        if (C6399b.m19944t()) {
            timeLockUserSetting.setContentFilterOn(this.f60180e);
        }
        return timeLockUserSetting;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TimeLockUserSettingOld{userId='");
        sb.append(this.f60176a);
        sb.append('\'');
        sb.append(", lastSetTime=");
        sb.append(this.f60177b);
        sb.append(", password='");
        sb.append(this.f60178c);
        sb.append('\'');
        sb.append(", isTimeLockOn=");
        sb.append(this.f60179d);
        sb.append(", isContentFilterOn=");
        sb.append(this.f60180e);
        sb.append('}');
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C22602d dVar = (C22602d) obj;
        if (this.f60176a != null) {
            return this.f60176a.equals(dVar.f60176a);
        }
        if (dVar.f60176a == null) {
            return true;
        }
        return false;
    }
}
