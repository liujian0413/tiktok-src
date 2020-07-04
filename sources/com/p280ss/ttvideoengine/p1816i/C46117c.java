package com.p280ss.ttvideoengine.p1816i;

import com.C1642a;
import java.util.HashMap;

/* renamed from: com.ss.ttvideoengine.i.c */
public final class C46117c {

    /* renamed from: a */
    public int f118004a;

    /* renamed from: b */
    public int f118005b;

    /* renamed from: c */
    public String f118006c;

    /* renamed from: d */
    public String f118007d;

    /* renamed from: e */
    private boolean m144508e() {
        if (this.f118004a == -499999 || this.f118004a == -499997 || this.f118004a == -499996 || this.f118004a == -499992 || this.f118004a == -499991 || this.f118004a == -499990 || this.f118004a == -499989 || this.f118004a == -2139062143) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final HashMap mo112287a() {
        HashMap hashMap = new HashMap();
        hashMap.put("domain", this.f118006c);
        hashMap.put("code", Integer.valueOf(this.f118004a));
        if (this.f118005b != 0) {
            hashMap.put("internalCode", Integer.valueOf(this.f118005b));
        }
        if (this.f118007d != null) {
            hashMap.put("description", this.f118007d);
        }
        return hashMap;
    }

    /* renamed from: b */
    public final int mo112288b() {
        if (this.f118006c.equals("kTTVideoErrorDomainFetchingInfo")) {
            return 1000;
        }
        if (this.f118006c.equals("kTTVideoErrorDomainLocalDNS") || this.f118006c.equals("kTTVideoErrorDomainHTTPDNS")) {
            return 1001;
        }
        if (!this.f118006c.equals("kTTVideoErrorDomainVideoOwnPlayer") || !m144508e()) {
            return 1003;
        }
        return 1002;
    }

    /* renamed from: c */
    public final int mo112289c() {
        if (this.f118006c.equals("kTTVideoErrorDomainHTTPDNS") || this.f118006c.equals("kTTVideoErrorDomainLocalDNS")) {
            return 2;
        }
        if (this.f118006c.equals("kTTVideoErrorDomainFetchingInfo")) {
            return 1;
        }
        if (!this.f118006c.equals("kTTVideoErrorDomainVideoOwnPlayer") || m144507d() || !m144508e()) {
            return 2;
        }
        return 3;
    }

    public final String toString() {
        String str;
        String str2 = "domain:%s, code:%d, internalCode:%d, description:%s";
        Object[] objArr = new Object[4];
        objArr[0] = this.f118006c;
        objArr[1] = Integer.valueOf(this.f118004a);
        objArr[2] = Integer.valueOf(this.f118005b);
        if (this.f118007d != null) {
            str = this.f118007d;
        } else {
            str = "";
        }
        objArr[3] = str;
        return C1642a.m8034a(str2, objArr);
    }

    /* renamed from: d */
    private boolean m144507d() {
        if (this.f118004a == -499988 || this.f118004a == -499987 || this.f118004a == -499986 || this.f118004a == -499985 || this.f118004a == -499899 || this.f118004a == -499898 || this.f118004a == -499897 || this.f118004a == -499896 || this.f118004a == -499894 || this.f118004a == -499893 || this.f118004a == -499891 || this.f118004a == 251658241 || this.f118004a == -499799 || this.f118004a == -499795 || this.f118004a == -499794 || this.f118004a == -499793 || this.f118004a == -499792) {
            return true;
        }
        return false;
    }

    public C46117c(String str, int i) {
        this(str, i, 0);
    }

    private C46117c(String str, int i, int i2) {
        this(str, i, 0, null);
    }

    public C46117c(String str, int i, String str2) {
        this(str, i, 0, str2);
    }

    public C46117c(String str, int i, int i2, String str2) {
        this.f118006c = str;
        this.f118004a = i;
        this.f118005b = i2;
        this.f118007d = str2;
    }
}
