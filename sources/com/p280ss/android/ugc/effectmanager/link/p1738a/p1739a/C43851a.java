package com.p280ss.android.ugc.effectmanager.link.p1738a.p1739a;

import com.p280ss.android.ugc.effectmanager.common.p1729d.C43725b;
import com.p280ss.android.ugc.effectmanager.common.p1729d.C43726c;
import com.p280ss.android.ugc.effectmanager.link.model.host.Host;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.effectmanager.link.a.a.a */
public final class C43851a extends C43725b {

    /* renamed from: b */
    public List<Host> f113618b = new ArrayList();

    /* renamed from: c */
    public C43726c f113619c;

    public final String toString() {
        String str = "HostListStatusUpdateTaskResult{ Hosts{";
        for (Host host : this.f113618b) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(host.toString());
            sb.append(", ");
            str = sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(" }, mExceptionResult=");
        sb2.append(this.f113619c);
        sb2.append('}');
        return sb2.toString();
    }

    public C43851a(List<Host> list, C43726c cVar) {
        this.f113618b.clear();
        this.f113618b.addAll(list);
        this.f113619c = null;
    }
}
