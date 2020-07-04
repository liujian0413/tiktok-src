package com.p280ss.android.ugc.asve.recorder.effect.composer;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.asve.recorder.effect.composer.ComposerInfo */
public final class ComposerInfo implements Parcelable {
    public static final C20755a CREATOR = new C20755a(null);

    /* renamed from: a */
    public final String f56036a;

    /* renamed from: b */
    public final String f56037b;

    /* renamed from: com.ss.android.ugc.asve.recorder.effect.composer.ComposerInfo$a */
    public static final class C20755a implements Creator<ComposerInfo> {
        private C20755a() {
        }

        /* renamed from: a */
        private static ComposerInfo[] m69266a(int i) {
            return new ComposerInfo[i];
        }

        public /* synthetic */ C20755a(C7571f fVar) {
            this();
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m69265a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m69266a(i);
        }

        /* renamed from: a */
        private static ComposerInfo m69265a(Parcel parcel) {
            C7573i.m23587b(parcel, "parcel");
            return new ComposerInfo(parcel);
        }
    }

    public final int describeContents() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.f56037b, (java.lang.Object) r3.f56037b) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.p280ss.android.ugc.asve.recorder.effect.composer.ComposerInfo
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.asve.recorder.effect.composer.ComposerInfo r3 = (com.p280ss.android.ugc.asve.recorder.effect.composer.ComposerInfo) r3
            java.lang.String r0 = r2.f56036a
            java.lang.String r1 = r3.f56036a
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x001d
            java.lang.String r0 = r2.f56037b
            java.lang.String r3 = r3.f56037b
            boolean r3 = kotlin.jvm.internal.C7573i.m23585a(r0, r3)
            if (r3 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r3 = 0
            return r3
        L_0x001f:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.asve.recorder.effect.composer.ComposerInfo.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f56036a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f56037b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ComposerInfo(nodePath=");
        sb.append(this.f56036a);
        sb.append(", extra=");
        sb.append(this.f56037b);
        sb.append(")");
        return sb.toString();
    }

    public ComposerInfo(Parcel parcel) {
        C7573i.m23587b(parcel, "parcel");
        String readString = parcel.readString();
        C7573i.m23582a((Object) readString, "parcel.readString()");
        String readString2 = parcel.readString();
        C7573i.m23582a((Object) readString2, "parcel.readString()");
        this(readString, readString2);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C7573i.m23587b(parcel, "parcel");
        parcel.writeString(this.f56036a);
        parcel.writeString(this.f56037b);
    }

    public ComposerInfo(String str, String str2) {
        C7573i.m23587b(str, "nodePath");
        C7573i.m23587b(str2, "extra");
        this.f56036a = str;
        this.f56037b = str2;
    }
}
