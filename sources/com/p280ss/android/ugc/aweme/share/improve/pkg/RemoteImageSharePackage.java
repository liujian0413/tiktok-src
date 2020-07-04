package com.p280ss.android.ugc.aweme.share.improve.pkg;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.p022v4.util.C0902i;
import com.p280ss.android.ugc.aweme.share.C37984ap;
import com.p280ss.android.ugc.aweme.share.improve.p1540c.C38157b;
import com.p280ss.android.ugc.aweme.share.improve.p1540c.C38159c;
import com.p280ss.android.ugc.aweme.sharer.C38343b;
import com.p280ss.android.ugc.aweme.sharer.C38354f;
import com.p280ss.android.ugc.aweme.sharer.C38356g;
import com.p280ss.android.ugc.aweme.sharer.C38357h;
import com.p280ss.android.ugc.aweme.sharer.p1544a.C38329t;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38389f;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage.C7219a;
import com.p280ss.android.ugc.aweme.util.C42889p;
import com.p280ss.android.ugc.aweme.util.C42895s;
import com.p280ss.android.ugc.aweme.web.p1704b.p1705a.C43439a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.RemoteImageSharePackage */
public final class RemoteImageSharePackage extends SharePackage {
    public static final Creator<RemoteImageSharePackage> CREATOR = new C38222c();

    /* renamed from: a */
    public static final C38221b f99372a = new C38221b(null);

    /* renamed from: b */
    private final String f99373b;

    /* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.RemoteImageSharePackage$a */
    public static final class C38220a extends C7219a<RemoteImageSharePackage> {

        /* renamed from: a */
        public String f99374a;

        /* access modifiers changed from: private */
        /* renamed from: b */
        public RemoteImageSharePackage mo18866a() {
            return new RemoteImageSharePackage(this);
        }

        /* renamed from: a */
        public final C38220a mo18867b(Parcel parcel) {
            C7573i.m23587b(parcel, "source");
            super.mo18867b(parcel);
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.RemoteImageSharePackage$b */
    public static final class C38221b {
        private C38221b() {
        }

        public /* synthetic */ C38221b(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static RemoteImageSharePackage m122098a(Context context, C43439a aVar, String str) {
            C7573i.m23587b(context, "context");
            C7573i.m23587b(aVar, "shareInfo");
            C7219a e = new C38220a().mo18868d("pic").mo18869e("web");
            String str2 = aVar.f112509a;
            C7573i.m23582a((Object) str2, "shareInfo.title");
            C7219a f = e.mo18870f(str2);
            String str3 = aVar.f112510b;
            C7573i.m23582a((Object) str3, "shareInfo.desc");
            C7219a g = f.mo18871g(str3);
            String b = C38157b.m121908b(aVar.f112512d);
            if (b == null) {
                b = "";
            }
            RemoteImageSharePackage remoteImageSharePackage = (RemoteImageSharePackage) g.mo18872h(b).mo18866a();
            Bundle bundle = remoteImageSharePackage.f20186l;
            bundle.putString("app_name", context.getString(R.string.jf));
            StringBuilder sb = new StringBuilder("file://");
            sb.append(aVar.f112513e);
            bundle.putString("thumb_url", sb.toString());
            bundle.putString("thumb_path", aVar.f112513e);
            bundle.putString("url_for_im_share", str);
            return remoteImageSharePackage;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.RemoteImageSharePackage$c */
    public static final class C38222c implements Creator<RemoteImageSharePackage> {
        C38222c() {
        }

        /* renamed from: a */
        private static RemoteImageSharePackage[] m122100a(int i) {
            return new RemoteImageSharePackage[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m122099a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m122100a(i);
        }

        /* renamed from: a */
        private static RemoteImageSharePackage m122099a(Parcel parcel) {
            C7573i.m23587b(parcel, "parcel");
            return new RemoteImageSharePackage(parcel);
        }
    }

    /* renamed from: a */
    public final boolean mo18862a(C38389f fVar, Context context) {
        C7573i.m23587b(fVar, "action");
        C7573i.m23587b(context, "context");
        return false;
    }

    public final int describeContents() {
        return 0;
    }

    public RemoteImageSharePackage(Parcel parcel) {
        C7573i.m23587b(parcel, "parcel");
        this(new C38220a().mo18867b(parcel));
    }

    /* renamed from: a */
    public final C38354f mo18860a(C38343b bVar) {
        C7573i.m23587b(bVar, "channel");
        return new C38356g(C38159c.m121914a(this.f20185k, bVar), this.f20183i, this.f20184j);
    }

    public RemoteImageSharePackage(C38220a aVar) {
        C7573i.m23587b(aVar, "builder");
        super(aVar);
        String str = aVar.f99374a;
        if (str == null) {
            str = "";
        }
        this.f99373b = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    /* renamed from: a */
    public final boolean mo18861a(C38343b bVar, Context context) {
        C7573i.m23587b(bVar, "channel");
        C7573i.m23587b(context, "context");
        C37984ap.m121302b().addShareRecord(bVar.mo95739b(), 1);
        C0902i a = new C42889p(new WeakReference(context)).mo104590a(this.f99373b, new C42895s(C38157b.m121903a(context)));
        if (C7573i.m23585a((Object) (Boolean) a.f3154a, (Object) Boolean.valueOf(true)) && a.f3155b != null) {
            S s = a.f3155b;
            if (s == null) {
                C7573i.m23580a();
            }
            C7573i.m23582a((Object) s, "downloadResult.second!!");
            Uri a2 = C38159c.m121911a((String) s, context);
            S s2 = a.f3155b;
            if (s2 == null) {
                C7573i.m23580a();
            }
            C7573i.m23582a((Object) s2, "downloadResult.second!!");
            C38357h hVar = new C38357h(a2, (String) s2, null, null, null, null, 60, null);
            C38354f fVar = hVar;
            if (bVar.mo95737a(context, fVar)) {
                bVar.mo71406a(fVar, context);
            } else {
                String string = C38159c.m121910a().getString(R.string.bfc);
                C7573i.m23582a((Object) string, "chaosContext().getString…string.i18n_share_system)");
                new C38329t(string).mo95744a(hVar, context);
            }
        }
        return false;
    }
}
