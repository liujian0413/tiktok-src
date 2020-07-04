package com.p280ss.android.ugc.aweme.net.corenet;

import android.text.TextUtils;
import com.bytedance.ies.net.cronet.C10929b;
import com.bytedance.retrofit2.C12534t;
import com.facebook.network.connectionclass.C14146c;

/* renamed from: com.ss.android.ugc.aweme.net.corenet.c */
public final class C34058c implements C10929b {

    /* renamed from: a */
    private boolean f88829a;

    /* renamed from: b */
    private String f88830b;

    /* renamed from: a */
    public final void mo26343a(String str) {
        if (!this.f88829a) {
            C14146c.m41761a().mo33903b();
            this.f88830b = str;
            this.f88829a = true;
        }
    }

    /* renamed from: a */
    public final void mo26344a(String str, C12534t<String> tVar) {
        if (this.f88829a && TextUtils.equals(this.f88830b, str)) {
            C14146c.m41761a().mo33904c();
            this.f88829a = false;
        }
    }
}
