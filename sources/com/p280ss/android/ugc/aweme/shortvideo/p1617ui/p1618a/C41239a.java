package com.p280ss.android.ugc.aweme.shortvideo.p1617ui.p1618a;

import android.content.Context;
import com.p280ss.android.ugc.asve.p756d.C15448c.C15449a;
import com.p280ss.android.ugc.asve.sandbox.C20896b;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVAB.Property;
import dmt.p1861av.video.p1863b.C47450e;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.a.a */
public final class C41239a {

    /* renamed from: a */
    public static final C41239a f107468a = new C41239a();

    private C41239a() {
    }

    /* renamed from: a */
    public static boolean m131841a(Context context) {
        C7573i.m23587b(context, "context");
        if (C15449a.m45247a(context).mo39007e()) {
            return true;
        }
        if (!C35563c.f93231M.mo93305a(Property.EnableASVESandBox) || !C47450e.m148163a() || !C20896b.f56326b.mo56407a(context)) {
            return false;
        }
        return true;
    }
}
