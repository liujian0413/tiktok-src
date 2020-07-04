package com.p280ss.android.ugc.aweme.live.p1363c;

import com.bytedance.android.live.base.model.ImageModel;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;

/* renamed from: com.ss.android.ugc.aweme.live.c.e */
final class C32478e {
    /* renamed from: a */
    private static ImageModel m105217a(UrlModel urlModel) {
        if (urlModel == null) {
            return null;
        }
        ImageModel imageModel = new ImageModel();
        imageModel.width = urlModel.getWidth();
        imageModel.height = urlModel.getHeight();
        imageModel.setUri(urlModel.getUri());
        imageModel.setUrls(urlModel.getUrlList());
        return imageModel;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0084  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.bytedance.android.live.base.model.user.User m105218a(com.p280ss.android.ugc.aweme.profile.model.User r4) {
        /*
            r0 = 0
            if (r4 != 0) goto L_0x0004
            return r0
        L_0x0004:
            com.bytedance.android.live.base.model.user.User r1 = new com.bytedance.android.live.base.model.user.User
            r1.<init>()
            java.lang.String r2 = r4.getNickname()
            r1.setNickName(r2)
            com.ss.android.ugc.aweme.base.model.UrlModel r2 = r4.getAvatarMedium()
            if (r2 != 0) goto L_0x002d
            com.ss.android.ugc.aweme.base.model.UrlModel r2 = r4.getAvatarLarger()
            if (r2 != 0) goto L_0x0028
            com.ss.android.ugc.aweme.base.model.UrlModel r2 = r4.getAvatarThumb()
            if (r2 != 0) goto L_0x0023
            goto L_0x0035
        L_0x0023:
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r4.getAvatarThumb()
            goto L_0x0031
        L_0x0028:
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r4.getAvatarLarger()
            goto L_0x0031
        L_0x002d:
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r4.getAvatarMedium()
        L_0x0031:
            java.lang.String r0 = r0.getUri()
        L_0x0035:
            r1.setAvatarUrl(r0)
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r4.getAvatarThumb()
            com.bytedance.android.live.base.model.ImageModel r0 = m105217a(r0)
            r1.setAvatarThumb(r0)
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r4.getAvatarMedium()
            com.bytedance.android.live.base.model.ImageModel r0 = m105217a(r0)
            r1.setAvatarMedium(r0)
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r4.getAvatarLarger()
            com.bytedance.android.live.base.model.ImageModel r0 = m105217a(r0)
            r1.setAvatarLarge(r0)
            java.lang.String r0 = r4.getCity()
            r1.setCity(r0)
            java.lang.String r0 = r4.getUid()
            r1.setIdStr(r0)
            java.lang.String r0 = r4.getUid()
            if (r0 != 0) goto L_0x0070
            java.lang.String r0 = "0"
            goto L_0x0074
        L_0x0070:
            java.lang.String r0 = r4.getUid()
        L_0x0074:
            long r2 = java.lang.Long.parseLong(r0)
            r1.setId(r2)
            java.lang.String r0 = r4.getShortId()
            if (r0 != 0) goto L_0x0084
            java.lang.String r0 = "0"
            goto L_0x0088
        L_0x0084:
            java.lang.String r0 = r4.getShortId()
        L_0x0088:
            long r2 = java.lang.Long.parseLong(r0)
            r1.setShortId(r2)
            int r4 = r4.getFollowStatus()
            r1.setFollowStatus(r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.live.p1363c.C32478e.m105218a(com.ss.android.ugc.aweme.profile.model.User):com.bytedance.android.live.base.model.user.User");
    }
}
