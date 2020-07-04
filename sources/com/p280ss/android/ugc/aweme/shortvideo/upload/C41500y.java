package com.p280ss.android.ugc.aweme.shortvideo.upload;

import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.deviceregister.C6789d;
import com.p280ss.android.ugc.aweme.framework.services.IUserService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.port.p1479in.C35603z;
import com.p280ss.android.ugc.aweme.shortvideo.C39962gi;
import com.p280ss.android.ugc.aweme.shortvideo.C39966gm;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41530am;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.y */
public final class C41500y {

    /* renamed from: a */
    public final List<String> f107931a = new ArrayList();

    /* renamed from: b */
    public final void mo102160b() {
        m132204e();
        m132203d();
        m132202c();
        m132205f();
    }

    /* renamed from: c */
    private void m132202c() {
        Object service = ServiceManager.get().getService(IUserService.class);
        C7573i.m23582a(service, "ServiceManager.get().get…IUserService::class.java)");
        String currentUserID = ((IUserService) service).getCurrentUserID();
        C7573i.m23582a((Object) currentUserID, "ServiceManager.get().get…class.java).currentUserID");
        m132201a("uid", currentUserID);
    }

    /* renamed from: d */
    private void m132203d() {
        boolean z;
        String d = C6789d.m21080d();
        CharSequence charSequence = d;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            d = "0";
        }
        m132201a("did", d);
    }

    /* renamed from: e */
    private void m132204e() {
        m132201a("appid", String.valueOf(C35574k.m114859a().mo70102q().mo83135b()));
    }

    /* renamed from: f */
    private final void m132205f() {
        m132201a("version_code", String.valueOf(C6399b.m19939o()));
        m132201a("update_version_code", String.valueOf(C6399b.m19932h()));
    }

    /* renamed from: a */
    public final String mo102157a() {
        if (this.f107931a.isEmpty()) {
            return "";
        }
        Iterator it = this.f107931a.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            while (it.hasNext()) {
                String str = (String) it.next();
                String str2 = (String) next;
                StringBuilder sb = new StringBuilder();
                sb.append(str2);
                sb.append('&');
                sb.append(str);
                next = sb.toString();
            }
            String str3 = (String) next;
            StringBuilder sb2 = new StringBuilder("UploaderServerParam: ");
            sb2.append(str3);
            C41530am.m132280a(sb2.toString());
            return str3;
        }
        throw new UnsupportedOperationException("Empty collection can't be reduced.");
    }

    /* renamed from: a */
    public final void mo102158a(C39962gi giVar) {
        boolean z;
        C7573i.m23587b(giVar, "config");
        String str = giVar.f103792k;
        CharSequence charSequence = str;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            m132201a("store_region", str);
        }
    }

    /* renamed from: a */
    public final void mo102159a(C39966gm gmVar) {
        boolean z;
        C7573i.m23587b(gmVar, "videoConfig");
        String str = gmVar.f103830p;
        CharSequence charSequence = str;
        boolean z2 = false;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C35603z zVar = C35563c.f93245h;
            C7573i.m23582a((Object) zVar, "AVEnv.LOCATION_SERVICE");
            str = zVar.mo83209c();
        }
        C7573i.m23582a((Object) str, "region");
        m132201a("region", str);
        String str2 = gmVar.f103812C;
        CharSequence charSequence2 = str2;
        if (charSequence2 == null || charSequence2.length() == 0) {
            z2 = true;
        }
        if (!z2) {
            m132201a("store_region", str2);
        }
    }

    /* renamed from: a */
    private void m132201a(String str, String str2) {
        C7573i.m23587b(str, "key");
        C7573i.m23587b(str2, "value");
        List<String> list = this.f107931a;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('=');
        sb.append(str2);
        list.add(sb.toString());
    }
}
