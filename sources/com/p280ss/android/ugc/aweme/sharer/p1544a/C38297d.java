package com.p280ss.android.ugc.aweme.sharer.p1544a;

import android.content.Context;
import android.net.Uri;
import com.facebook.C13499h;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareLinkContent.C14565a;
import com.facebook.share.model.SharePhoto.C14579a;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.model.SharePhotoContent.C14581a;
import com.facebook.share.model.ShareVideo.C14584a;
import com.facebook.share.model.ShareVideoContent;
import com.facebook.share.model.ShareVideoContent.C14586a;
import com.facebook.share.widget.ShareDialog;
import com.p280ss.android.ugc.aweme.sharer.C38290a;
import com.p280ss.android.ugc.aweme.sharer.C38354f;
import com.p280ss.android.ugc.aweme.sharer.C38356g;
import com.p280ss.android.ugc.aweme.sharer.C38357h;
import com.p280ss.android.ugc.aweme.sharer.C38358i;
import com.p280ss.android.ugc.aweme.sharer.C38359j;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38345a;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.sharer.a.d */
public final class C38297d extends C38290a {

    /* renamed from: a */
    public static final C38298a f99516a = new C38298a(null);

    /* renamed from: b */
    private final C38345a f99517b;

    /* renamed from: com.ss.android.ugc.aweme.sharer.a.d$a */
    public static final class C38298a {
        private C38298a() {
        }

        public /* synthetic */ C38298a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: a */
    public final int mo95736a() {
        return R.drawable.at4;
    }

    /* renamed from: a */
    public final boolean mo95743a(Context context) {
        C7573i.m23587b(context, "context");
        return true;
    }

    /* renamed from: a */
    public final boolean mo95737a(Context context, C38354f fVar) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(fVar, C38347c.f99553h);
        return true;
    }

    /* renamed from: a */
    public final boolean mo95745a(C38358i iVar, Context context) {
        C7573i.m23587b(iVar, C38347c.f99553h);
        C7573i.m23587b(context, "context");
        return false;
    }

    /* renamed from: b */
    public final String mo95739b() {
        return "facebook";
    }

    /* renamed from: c */
    public final String mo95740c() {
        return "Facebook";
    }

    /* renamed from: e */
    public final int mo95742e() {
        return R.drawable.azw;
    }

    public C38297d(C38345a aVar) {
        C7573i.m23587b(aVar, "activityProvider");
        this.f99517b = aVar;
        if (!C13499h.m39710a()) {
            C13499h.m39703a((Context) this.f99517b.mo63025a());
        }
    }

    /* renamed from: a */
    public final boolean mo71406a(C38354f fVar, Context context) {
        C7573i.m23587b(fVar, C38347c.f99553h);
        C7573i.m23587b(context, "context");
        if (this.f99517b.mo63025a() == null) {
            return false;
        }
        return super.mo71406a(fVar, context);
    }

    /* renamed from: a */
    public final boolean mo95738a(C38356g gVar, Context context) {
        C7573i.m23587b(gVar, C38347c.f99553h);
        C7573i.m23587b(context, "context");
        ShareLinkContent a = ((C14565a) new C14565a().mo36746a(Uri.parse(gVar.f99565b))).mo36756a(gVar.f99573d).mo36757a();
        ShareDialog shareDialog = new ShareDialog(this.f99517b.mo63025a());
        if (!shareDialog.mo33563a(a)) {
            return false;
        }
        shareDialog.mo33565b(a);
        return true;
    }

    /* renamed from: a */
    public final boolean mo95744a(C38357h hVar, Context context) {
        C7573i.m23587b(hVar, C38347c.f99553h);
        C7573i.m23587b(context, "context");
        SharePhotoContent a = new C14581a().mo36805a(new C14579a().mo36799a(hVar.f99567b).mo36801a()).mo36808a();
        ShareDialog shareDialog = new ShareDialog(this.f99517b.mo63025a());
        if (!shareDialog.mo33563a(a)) {
            return false;
        }
        shareDialog.mo33565b(a);
        return true;
    }

    /* renamed from: a */
    public final boolean mo95746a(C38359j jVar, Context context) {
        C7573i.m23587b(jVar, C38347c.f99553h);
        C7573i.m23587b(context, "context");
        ShareVideoContent a = new C14586a().mo36820a(new C14584a().mo36814a(jVar.f99575b).mo36816a()).mo36821a();
        ShareDialog shareDialog = new ShareDialog(this.f99517b.mo63025a());
        if (!shareDialog.mo33563a(a)) {
            return false;
        }
        shareDialog.mo33565b(a);
        return true;
    }
}
