package com.p280ss.android.ugc.aweme.p313im.sdk.media.p1329b;

import android.graphics.Bitmap;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.model.MediaModel;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.services.video.IImVideoCompileService;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.media.b.b */
public final class C31345b {

    /* renamed from: a */
    public static final C31345b f82130a = new C31345b();

    private C31345b() {
    }

    /* renamed from: a */
    private static void m102055a(RemoteImageView remoteImageView) {
        Object tag = remoteImageView.getTag(50331648);
        if (!(tag instanceof Bitmap)) {
            tag = null;
        }
        Bitmap bitmap = (Bitmap) tag;
        if (bitmap != null) {
            if (!bitmap.isRecycled()) {
                bitmap.recycle();
            }
            remoteImageView.setTag(50331648, null);
        }
    }

    /* renamed from: a */
    private static Bitmap m102054a(MediaModel mediaModel) {
        IImVideoCompileService iImVideoCompileService;
        C7573i.m23587b(mediaModel, "mediaModel");
        if (mediaModel.isGif()) {
            return null;
        }
        IAVService iAVService = (IAVService) ServiceManager.get().getService(IAVService.class);
        if (iAVService != null) {
            iImVideoCompileService = iAVService.getImVideoCompileService();
        } else {
            iImVideoCompileService = null;
        }
        if (iImVideoCompileService != null) {
            return iImVideoCompileService.fetchThumbnailByVBoostOpt(mediaModel.getId(), mediaModel.getDateModify(), mediaModel.isVideo(), null);
        }
        return null;
    }

    /* renamed from: a */
    private final boolean m102056a(RemoteImageView remoteImageView, MediaModel mediaModel) {
        Bitmap a = m102054a(mediaModel);
        if (a == null) {
            return false;
        }
        remoteImageView.setTag(50331648, a);
        remoteImageView.setImageBitmap(a);
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x003a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo81919a(com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView r2, com.p280ss.android.ugc.aweme.p313im.sdk.media.model.MediaModel r3, int r4, int r5, boolean r6) {
        /*
            r1 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.C7573i.m23587b(r2, r0)
            java.lang.String r0 = "mediaModel"
            kotlin.jvm.internal.C7573i.m23587b(r3, r0)
            m102055a(r2)
            if (r6 == 0) goto L_0x0015
            boolean r6 = r1.m102056a(r2, r3)
            if (r6 != 0) goto L_0x004c
        L_0x0015:
            boolean r6 = r3.isVideo()
            if (r6 != 0) goto L_0x0034
            java.lang.String r6 = r3.getThumbnail()
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            if (r6 == 0) goto L_0x002c
            int r6 = r6.length()
            if (r6 != 0) goto L_0x002a
            goto L_0x002c
        L_0x002a:
            r6 = 0
            goto L_0x002d
        L_0x002c:
            r6 = 1
        L_0x002d:
            if (r6 == 0) goto L_0x0034
            java.lang.String r3 = r3.getFilePath()
            goto L_0x0038
        L_0x0034:
            java.lang.String r3 = r3.getThumbnail()
        L_0x0038:
            if (r3 == 0) goto L_0x004c
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "file://"
            r6.<init>(r0)
            r6.append(r3)
            java.lang.String r3 = r6.toString()
            com.p280ss.android.ugc.aweme.base.C23323e.m76525b(r2, r3, r4, r5)
            return
        L_0x004c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p313im.sdk.media.p1329b.C31345b.mo81919a(com.ss.android.ugc.aweme.base.ui.RemoteImageView, com.ss.android.ugc.aweme.im.sdk.media.model.MediaModel, int, int, boolean):void");
    }
}
