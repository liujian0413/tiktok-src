package com.p280ss.android.ugc.aweme.sharer.p1544a;

import android.content.Context;
import android.os.Build.VERSION;
import com.p280ss.android.ugc.aweme.sharer.C38290a;
import com.p280ss.android.ugc.aweme.sharer.C38354f;
import com.p280ss.android.ugc.aweme.sharer.C38357h;
import com.p280ss.android.ugc.aweme.sharer.C38358i;
import com.p280ss.android.ugc.aweme.sharer.C38359j;
import com.p280ss.android.ugc.aweme.sharer.ShareException;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38350d;
import com.snapchat.kit.sdk.SnapCreative;
import com.snapchat.kit.sdk.creative.api.SnapCreativeKitApi;
import com.snapchat.kit.sdk.creative.exceptions.SnapMediaSizeException;
import com.snapchat.kit.sdk.creative.exceptions.SnapVideoLengthException;
import com.snapchat.kit.sdk.creative.media.SnapPhotoFile;
import com.snapchat.kit.sdk.creative.media.SnapVideoFile;
import com.snapchat.kit.sdk.creative.models.SnapPhotoContent;
import com.snapchat.kit.sdk.creative.models.SnapVideoContent;
import com.snapchat.kit.sdk.util.SnapUtils;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.sharer.a.s */
public final class C38327s extends C38290a {

    /* renamed from: a */
    public static final C38328a f99533a = new C38328a(null);

    /* renamed from: com.ss.android.ugc.aweme.sharer.a.s$a */
    public static final class C38328a {
        private C38328a() {
        }

        public /* synthetic */ C38328a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: a */
    public final int mo95736a() {
        return R.drawable.au5;
    }

    /* renamed from: a */
    public final boolean mo95745a(C38358i iVar, Context context) {
        C7573i.m23587b(iVar, C38347c.f99553h);
        C7573i.m23587b(context, "context");
        return false;
    }

    /* renamed from: b */
    public final String mo95739b() {
        return "snapchat";
    }

    /* renamed from: c */
    public final String mo95740c() {
        return "Snapchat";
    }

    /* renamed from: e */
    public final int mo95742e() {
        return R.drawable.b0b;
    }

    /* renamed from: a */
    public final boolean mo95743a(Context context) {
        C7573i.m23587b(context, "context");
        return C38350d.m122525a(context, "com.snapchat.android");
    }

    /* renamed from: a */
    public final boolean mo95737a(Context context, C38354f fVar) {
        boolean z;
        C7573i.m23587b(context, "context");
        C7573i.m23587b(fVar, C38347c.f99553h);
        if (VERSION.SDK_INT >= 19) {
            z = true;
        } else {
            z = false;
        }
        if (!z || !SnapUtils.isSnapchatInstalled(context.getPackageManager(), "com.snapchat.android")) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo95744a(C38357h hVar, Context context) {
        C7573i.m23587b(hVar, C38347c.f99553h);
        C7573i.m23587b(context, "context");
        File file = new File(hVar.f99568c);
        if (file.exists()) {
            SnapCreativeKitApi api = SnapCreative.getApi(context);
            try {
                SnapPhotoFile snapPhotoFromFile = SnapCreative.getMediaFactory(context).getSnapPhotoFromFile(file);
                C7573i.m23582a((Object) snapPhotoFromFile, "snapMediaFactory.getSnapPhotoFromFile(file)");
                if (snapPhotoFromFile != null) {
                    SnapPhotoContent snapPhotoContent = new SnapPhotoContent(snapPhotoFromFile);
                    snapPhotoContent.setAttachmentUrl(hVar.f99572g);
                    api.send(snapPhotoContent);
                    return true;
                }
                throw new ShareException("file_not_found");
            } catch (SnapMediaSizeException unused) {
                throw new ShareException("file_too_large");
            }
        } else {
            throw new ShareException("file_not_found");
        }
    }

    /* renamed from: a */
    public final boolean mo95746a(C38359j jVar, Context context) {
        C7573i.m23587b(jVar, C38347c.f99553h);
        C7573i.m23587b(context, "context");
        File file = new File(jVar.f99576c);
        if (file.exists()) {
            SnapCreativeKitApi api = SnapCreative.getApi(context);
            try {
                SnapVideoFile snapVideoFromFile = SnapCreative.getMediaFactory(context).getSnapVideoFromFile(file);
                C7573i.m23582a((Object) snapVideoFromFile, "snapMediaFactory.getSnapVideoFromFile(file)");
                if (snapVideoFromFile != null) {
                    SnapVideoContent snapVideoContent = new SnapVideoContent(snapVideoFromFile);
                    snapVideoContent.setAttachmentUrl(jVar.f99580g);
                    api.send(snapVideoContent);
                    return true;
                }
                throw new ShareException("file_not_found");
            } catch (SnapMediaSizeException unused) {
                throw new ShareException("file_too_large");
            } catch (SnapVideoLengthException unused2) {
                throw new ShareException("video_too_long");
            }
        } else {
            throw new ShareException("file_not_found");
        }
    }
}
