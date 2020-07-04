package com.bytedance.ies.abmock;

import android.app.Application;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.ies.abmock.e */
public abstract class C6387e implements C6388f {

    /* renamed from: a */
    private C6388f f18681a;

    /* renamed from: b */
    private List<Object> f18682b = new ArrayList();

    /* renamed from: a */
    public abstract String mo15296a();

    /* renamed from: b */
    public final boolean mo15320b() {
        C6388f fVar = this.f18681a;
        if (fVar != null) {
            return fVar.mo15320b();
        }
        return false;
    }

    /* renamed from: a */
    public final Object mo15317a(String str) {
        C7573i.m23587b(str, "key");
        C6388f fVar = this.f18681a;
        if (fVar != null) {
            return fVar.mo15317a(str);
        }
        return null;
    }

    /* renamed from: a */
    public final void mo15318a(Application application) {
        C7573i.m23587b(application, "application");
        mo15319a(application, mo15296a());
    }

    /* renamed from: a */
    public final void mo15319a(Application application, String str) {
        C7573i.m23587b(application, "application");
        C7573i.m23587b(str, "mockPrefix");
        try {
            C6380a.m19832a("正在实例化 HawkStorage");
            this.f18681a = (C6388f) Class.forName("com.bytedance.ies.abmock.debugtool.HawkStorage").newInstance();
            if (this.f18681a != null) {
                C6388f fVar = this.f18681a;
                if (fVar == null) {
                    C7573i.m23580a();
                }
                fVar.mo15319a(application, str);
                C6380a.m19832a("实例化成功");
            }
        } catch (Exception unused) {
            this.f18681a = null;
            C6380a.m19832a("实例化失败");
        }
    }
}
