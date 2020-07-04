package com.p280ss.android.ugc.aweme.shortvideo.videocategory.p1622a;

import com.p280ss.android.ugc.aweme.draft.model.VideoCategoryParam;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.videocategory.a.b */
public final class C41591b {

    /* renamed from: e */
    public static final C41592a f108087e = new C41592a(null);

    /* renamed from: a */
    public final int f108088a;

    /* renamed from: b */
    public final int f108089b;

    /* renamed from: c */
    public final VideoCategoryParam f108090c;

    /* renamed from: d */
    public final Object f108091d;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.videocategory.a.b$a */
    public static final class C41592a {
        private C41592a() {
        }

        public /* synthetic */ C41592a(C7571f fVar) {
            this();
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C41591b) {
                C41591b bVar = (C41591b) obj;
                if (this.f108088a == bVar.f108088a) {
                    if (!(this.f108089b == bVar.f108089b) || !C7573i.m23585a((Object) this.f108090c, (Object) bVar.f108090c) || !C7573i.m23585a(this.f108091d, bVar.f108091d)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = ((this.f108088a * 31) + this.f108089b) * 31;
        VideoCategoryParam videoCategoryParam = this.f108090c;
        int i2 = 0;
        int hashCode = (i + (videoCategoryParam != null ? videoCategoryParam.hashCode() : 0)) * 31;
        Object obj = this.f108091d;
        if (obj != null) {
            i2 = obj.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoCategoryModel(type=");
        sb.append(this.f108088a);
        sb.append(", positionInList=");
        sb.append(this.f108089b);
        sb.append(", category=");
        sb.append(this.f108090c);
        sb.append(", payload=");
        sb.append(this.f108091d);
        sb.append(")");
        return sb.toString();
    }

    public C41591b(int i, int i2, VideoCategoryParam videoCategoryParam, Object obj) {
        this.f108088a = i;
        this.f108089b = i2;
        this.f108090c = videoCategoryParam;
        this.f108091d = obj;
    }
}
