package com.p280ss.android.ugc.aweme.filter;

import android.net.Uri;
import com.facebook.common.internal.C13315l;
import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41530am;
import com.p280ss.android.ugc.aweme.tools.ToolsUrlModel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.filter.g */
public class C29296g {
    @C6593c(mo15949a = "id")

    /* renamed from: a */
    public int f77266a;
    @C6593c(mo15949a = "name")

    /* renamed from: b */
    public String f77267b;
    @C6593c(mo15949a = "en_name")

    /* renamed from: c */
    public String f77268c;
    @C6593c(mo15949a = "resource")

    /* renamed from: d */
    public ToolsUrlModel f77269d;

    /* renamed from: e */
    public int f77270e;

    /* renamed from: f */
    public Uri f77271f;

    /* renamed from: g */
    public String f77272g;

    /* renamed from: h */
    public String f77273h;

    /* renamed from: i */
    public List<String> f77274i;

    /* renamed from: j */
    public float f77275j = -1.0f;

    /* renamed from: k */
    public boolean f77276k = true;

    /* renamed from: l */
    private String f77277l;

    /* renamed from: m */
    private boolean f77278m;

    public int hashCode() {
        return this.f77266a;
    }

    /* renamed from: a */
    public final List<String> mo74976a() {
        if (this.f77274i == null || this.f77274i.isEmpty()) {
            return new ArrayList();
        }
        return this.f77274i;
    }

    /* renamed from: b */
    public final String mo74978b() {
        if (!this.f77278m) {
            C41530am.m132283b(C13315l.m38963c(new Exception("getFilterFolderWhenNotSetValue")));
        }
        return this.f77277l;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29296g)) {
            return false;
        }
        if (this.f77266a == ((C29296g) obj).f77266a) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo74977a(String str) {
        if (str == null) {
            C41530am.m132283b(C13315l.m38963c(new Exception("setFilterFolderNull")));
        }
        this.f77278m = true;
        this.f77277l = str;
    }
}
