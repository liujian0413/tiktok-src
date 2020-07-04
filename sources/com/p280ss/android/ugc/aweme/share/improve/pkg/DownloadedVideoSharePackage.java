package com.p280ss.android.ugc.aweme.share.improve.pkg;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.share.C37984ap;
import com.p280ss.android.ugc.aweme.sharer.C38343b;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage.C7219a;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.DownloadedVideoSharePackage */
public final class DownloadedVideoSharePackage extends SharePackage {
    public static final Creator<DownloadedVideoSharePackage> CREATOR = new C38195c();

    /* renamed from: c */
    public static final C38194b f99332c = new C38194b(null);

    /* renamed from: a */
    public String f99333a;

    /* renamed from: b */
    public Aweme f99334b;

    /* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.DownloadedVideoSharePackage$a */
    public static final class C38193a extends C7219a<DownloadedVideoSharePackage> {
        /* access modifiers changed from: private */
        /* renamed from: b */
        public DownloadedVideoSharePackage mo18866a() {
            return new DownloadedVideoSharePackage(this);
        }

        /* renamed from: a */
        public final C38193a mo18867b(Parcel parcel) {
            C7573i.m23587b(parcel, "source");
            super.mo18867b(parcel);
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.DownloadedVideoSharePackage$b */
    public static final class C38194b {
        private C38194b() {
        }

        public /* synthetic */ C38194b(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static DownloadedVideoSharePackage m122003a(String str, Aweme aweme) {
            C7573i.m23587b(str, "path");
            C7573i.m23587b(aweme, "aweme");
            DownloadedVideoSharePackage downloadedVideoSharePackage = (DownloadedVideoSharePackage) new C38193a().mo18868d("aweme").mo18866a();
            downloadedVideoSharePackage.f99333a = str;
            downloadedVideoSharePackage.f99334b = aweme;
            return downloadedVideoSharePackage;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.DownloadedVideoSharePackage$c */
    public static final class C38195c implements Creator<DownloadedVideoSharePackage> {
        C38195c() {
        }

        /* renamed from: a */
        private static DownloadedVideoSharePackage[] m122005a(int i) {
            return new DownloadedVideoSharePackage[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m122004a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m122005a(i);
        }

        /* renamed from: a */
        private static DownloadedVideoSharePackage m122004a(Parcel parcel) {
            C7573i.m23587b(parcel, "parcel");
            return new DownloadedVideoSharePackage(parcel);
        }
    }

    public final int describeContents() {
        return 0;
    }

    public DownloadedVideoSharePackage(C38193a aVar) {
        C7573i.m23587b(aVar, "builder");
        super(aVar);
    }

    public DownloadedVideoSharePackage(Parcel parcel) {
        C7573i.m23587b(parcel, "parcel");
        this(new C38193a().mo18867b(parcel));
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001d  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0049  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.p280ss.android.ugc.aweme.sharer.C38354f mo18860a(com.p280ss.android.ugc.aweme.sharer.C38343b r11) {
        /*
            r10 = this;
            java.lang.String r0 = "channel"
            kotlin.jvm.internal.C7573i.m23587b(r11, r0)
            boolean r0 = r11 instanceof com.p280ss.android.ugc.aweme.sharer.p1544a.C38337x
            if (r0 == 0) goto L_0x001a
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r10.f99334b
            if (r0 != 0) goto L_0x0012
            java.lang.String r1 = "aweme"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x0012:
            boolean r0 = com.p280ss.android.ugc.trill.share.base.C45083a.m142202b(r0)
            if (r0 == 0) goto L_0x001a
            r0 = 1
            goto L_0x001b
        L_0x001a:
            r0 = 0
        L_0x001b:
            if (r0 == 0) goto L_0x0049
            com.ss.android.ugc.aweme.sharer.g r0 = new com.ss.android.ugc.aweme.sharer.g
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r10.f99334b
            if (r1 != 0) goto L_0x0028
            java.lang.String r2 = "aweme"
            kotlin.jvm.internal.C7573i.m23583a(r2)
        L_0x0028:
            com.ss.android.ugc.aweme.base.share.ShareInfo r1 = r1.getShareInfo()
            java.lang.String r2 = "aweme.shareInfo"
            kotlin.jvm.internal.C7573i.m23582a(r1, r2)
            java.lang.String r1 = r1.getShareUrl()
            java.lang.String r2 = "aweme.shareInfo.shareUrl"
            kotlin.jvm.internal.C7573i.m23582a(r1, r2)
            java.lang.String r2 = com.p280ss.android.ugc.aweme.share.improve.p1540c.C38159c.m121914a(r1, r11)
            r3 = 0
            r4 = 0
            r5 = 6
            r6 = 0
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            com.ss.android.ugc.aweme.sharer.f r0 = (com.p280ss.android.ugc.aweme.sharer.C38354f) r0
            return r0
        L_0x0049:
            com.ss.android.ugc.aweme.sharer.j r11 = new com.ss.android.ugc.aweme.sharer.j
            java.lang.String r0 = r10.f99333a
            if (r0 != 0) goto L_0x0054
            java.lang.String r1 = "path"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x0054:
            android.content.Context r1 = com.p280ss.android.ugc.aweme.share.improve.p1540c.C38159c.m121910a()
            android.net.Uri r2 = com.p280ss.android.ugc.aweme.share.improve.p1540c.C38159c.m121911a(r0, r1)
            java.lang.String r3 = r10.f99333a
            if (r3 != 0) goto L_0x0065
            java.lang.String r0 = "path"
            kotlin.jvm.internal.C7573i.m23583a(r0)
        L_0x0065:
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 60
            r9 = 0
            r1 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            java.lang.String r0 = "content_url"
            java.lang.String r1 = r11.f99580g
            if (r1 != 0) goto L_0x0078
            java.lang.String r1 = ""
        L_0x0078:
            r11.mo95938a(r0, r1)
            java.lang.String r0 = "fb_app_id"
            java.lang.String r1 = "597615686992125"
            r11.mo95938a(r0, r1)
            java.lang.String r0 = "media_type"
            java.lang.String r1 = "video/mp4"
            r11.mo95938a(r0, r1)
            com.ss.android.ugc.aweme.sharer.f r11 = (com.p280ss.android.ugc.aweme.sharer.C38354f) r11
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.share.improve.pkg.DownloadedVideoSharePackage.mo18860a(com.ss.android.ugc.aweme.sharer.b):com.ss.android.ugc.aweme.sharer.f");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    /* renamed from: a */
    public final boolean mo18861a(C38343b bVar, Context context) {
        C7573i.m23587b(bVar, "channel");
        C7573i.m23587b(context, "context");
        C37984ap.m121302b().addShareRecord(bVar.mo95739b(), 0);
        return false;
    }
}
