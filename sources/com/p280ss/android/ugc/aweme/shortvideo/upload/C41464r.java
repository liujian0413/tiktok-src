package com.p280ss.android.ugc.aweme.shortvideo.upload;

import com.p280ss.android.ugc.aweme.app.C22689a.C22704b;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.r */
public final class C41464r {

    /* renamed from: a */
    public final String f107850a;

    /* renamed from: b */
    public final PublishType f107851b;

    /* renamed from: c */
    public float f107852c;

    /* renamed from: d */
    public float f107853d;

    /* renamed from: e */
    public float f107854e;

    /* renamed from: f */
    public float f107855f;

    /* renamed from: g */
    public String f107856g;

    /* renamed from: h */
    public String f107857h;

    /* renamed from: i */
    public boolean f107858i;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.r$a */
    public static final class C41465a {

        /* renamed from: a */
        public final float f107859a;

        /* renamed from: b */
        public final float f107860b;

        /* renamed from: c */
        public final String f107861c;

        public C41465a(float f, float f2, String str) {
            C7573i.m23587b(str, C22704b.f60415d);
            this.f107859a = f;
            this.f107860b = f2;
            this.f107861c = str;
        }
    }

    /* renamed from: a */
    public final C41465a mo102131a() {
        if (!this.f107858i) {
            return null;
        }
        return new C41465a(this.f107852c, this.f107852c - this.f107854e, toString());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Record(creationId='");
        sb.append(this.f107850a);
        sb.append("', type=");
        sb.append(this.f107851b);
        sb.append(", initMB=");
        sb.append(this.f107852c);
        sb.append(", beforeCompileMB=");
        sb.append(this.f107853d);
        sb.append(", afterCompileMB=");
        sb.append(this.f107854e);
        sb.append(", compileFileMB=");
        sb.append(this.f107855f);
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo102132a(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.f107856g = str;
    }

    /* renamed from: b */
    public final void mo102133b(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.f107857h = str;
    }

    private C41464r(String str, PublishType publishType, float f, float f2, float f3, float f4, String str2, String str3, boolean z) {
        C7573i.m23587b(str, "creationId");
        C7573i.m23587b(publishType, "type");
        C7573i.m23587b(str2, "contentType");
        C7573i.m23587b(str3, "errorInfo");
        this.f107850a = str;
        this.f107851b = publishType;
        this.f107852c = f;
        this.f107853d = f2;
        this.f107854e = f3;
        this.f107855f = f4;
        this.f107856g = str2;
        this.f107857h = str3;
        this.f107858i = z;
    }

    public /* synthetic */ C41464r(String str, PublishType publishType, float f, float f2, float f3, float f4, String str2, String str3, boolean z, int i, C7571f fVar) {
        this(str, publishType, 0.0f, 0.0f, 0.0f, 0.0f, "", "", true);
    }
}
