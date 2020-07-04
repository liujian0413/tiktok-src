package com.p280ss.android.downloadlib.addownload.p863a;

import android.text.TextUtils;
import com.p280ss.android.downloadlib.addownload.p864b.C19461a;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ss.android.downloadlib.addownload.a.a */
public class C19457a {

    /* renamed from: a */
    private static final String f52673a = "a";

    /* renamed from: b */
    private static C19457a f52674b;

    /* renamed from: c */
    private CopyOnWriteArrayList<C19461a> f52675c = C19458b.m64014a("sp_ad_install_back_dialog", "key_uninstalled_list");

    /* renamed from: d */
    private String f52676d;

    /* renamed from: e */
    private CopyOnWriteArrayList<C19461a> f52677e = C19458b.m64014a("sp_name_installed_app", "key_installed_list");

    /* renamed from: f */
    private C19458b f52678f = new C19458b();

    /* renamed from: a */
    public static C19457a m64009a() {
        if (f52674b == null) {
            f52674b = new C19457a();
        }
        return f52674b;
    }

    private C19457a() {
    }

    /* renamed from: a */
    public final boolean mo51517a(String str) {
        return TextUtils.equals(this.f52676d, str);
    }

    /* renamed from: b */
    public final void mo51518b(String str) {
        if (TextUtils.isEmpty(str)) {
            this.f52676d = "";
            return;
        }
        if (TextUtils.equals(this.f52676d, str)) {
            this.f52676d = "";
        }
    }

    /* renamed from: a */
    public final void mo51516a(C19461a aVar) {
        if (aVar != null) {
            int i = 0;
            while (i < this.f52677e.size()) {
                C19461a aVar2 = (C19461a) this.f52677e.get(i);
                if (aVar2 == null || aVar2.f52689b != aVar.f52689b) {
                    i++;
                } else {
                    return;
                }
            }
            this.f52677e.add(aVar);
            C19458b.m64015a("sp_name_installed_app", "key_installed_list", this.f52677e);
        }
    }

    /* renamed from: a */
    public final void mo51515a(long j, long j2, long j3, String str, String str2, String str3, String str4) {
        int i = 0;
        while (i < this.f52675c.size()) {
            C19461a aVar = (C19461a) this.f52675c.get(i);
            if (aVar == null || aVar.f52689b != j2) {
                i++;
            } else {
                CopyOnWriteArrayList<C19461a> copyOnWriteArrayList = this.f52675c;
                C19461a aVar2 = new C19461a(j, j2, j3, str, str2, str3, str4);
                copyOnWriteArrayList.set(i, aVar2);
                C19458b.m64015a("sp_ad_install_back_dialog", "key_uninstalled_list", this.f52675c);
                return;
            }
        }
        CopyOnWriteArrayList<C19461a> copyOnWriteArrayList2 = this.f52675c;
        C19461a aVar3 = new C19461a(j, j2, j3, str, str2, str3, str4);
        copyOnWriteArrayList2.add(aVar3);
        C19458b.m64015a("sp_ad_install_back_dialog", "key_uninstalled_list", this.f52675c);
    }
}
