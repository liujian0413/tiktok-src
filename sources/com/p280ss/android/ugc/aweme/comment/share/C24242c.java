package com.p280ss.android.ugc.aweme.comment.share;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.comment.services.C24219a.C24220a;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.AwemeRiskModel;
import com.p280ss.android.ugc.aweme.video.C7276d;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.comment.share.c */
public final class C24242c {

    /* renamed from: a */
    public static final C24243a f63971a = new C24243a(null);

    /* renamed from: com.ss.android.ugc.aweme.comment.share.c$a */
    public static final class C24243a {
        private C24243a() {
        }

        /* renamed from: a */
        private static boolean m79622a() {
            if (!C7276d.m22826g()) {
                C10761a.m31399c(C6399b.m19921a(), (int) R.string.djg).mo25750a();
                return false;
            } else if (C7276d.m22827h() >= 20971520) {
                return true;
            } else {
                C10761a.m31399c(C6399b.m19921a(), (int) R.string.djh).mo25750a();
                return false;
            }
        }

        public /* synthetic */ C24243a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static boolean m79623a(int i, int i2) {
            double d = (double) i;
            double d2 = (double) i2;
            Double.isNaN(d2);
            double d3 = d2 * 1.0d;
            Double.isNaN(d);
            if (d / d3 <= 1.0d) {
                return true;
            }
            return false;
        }

        /* JADX WARNING: type inference failed for: r0v1 */
        /* JADX WARNING: type inference failed for: r0v2, types: [java.io.File] */
        /* JADX WARNING: type inference failed for: r0v3 */
        /* JADX WARNING: type inference failed for: r0v5 */
        /* JADX WARNING: type inference failed for: r0v6 */
        /* JADX WARNING: type inference failed for: r0v7 */
        /* JADX WARNING: type inference failed for: r0v8 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 3 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static java.io.File m79621a(android.graphics.Bitmap r5, java.lang.String r6) {
            /*
                java.lang.String r0 = "fileName"
                kotlin.jvm.internal.C7573i.m23587b(r6, r0)
                r0 = 0
                if (r5 != 0) goto L_0x0009
                return r0
            L_0x0009:
                java.io.File r1 = new java.io.File     // Catch:{ Exception -> 0x0065, all -> 0x005e }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0065, all -> 0x005e }
                r2.<init>()     // Catch:{ Exception -> 0x0065, all -> 0x005e }
                java.io.File r3 = com.p280ss.android.ugc.aweme.video.C7276d.m22813c()     // Catch:{ Exception -> 0x0065, all -> 0x005e }
                java.lang.String r4 = "FileHelper.getExternalPictureCacheDir()"
                kotlin.jvm.internal.C7573i.m23582a(r3, r4)     // Catch:{ Exception -> 0x0065, all -> 0x005e }
                java.lang.String r3 = r3.getPath()     // Catch:{ Exception -> 0x0065, all -> 0x005e }
                r2.append(r3)     // Catch:{ Exception -> 0x0065, all -> 0x005e }
                java.lang.String r3 = "/share/comment_watermark"
                r2.append(r3)     // Catch:{ Exception -> 0x0065, all -> 0x005e }
                r2.append(r6)     // Catch:{ Exception -> 0x0065, all -> 0x005e }
                java.lang.String r6 = ".png"
                r2.append(r6)     // Catch:{ Exception -> 0x0065, all -> 0x005e }
                java.lang.String r6 = r2.toString()     // Catch:{ Exception -> 0x0065, all -> 0x005e }
                r1.<init>(r6)     // Catch:{ Exception -> 0x0065, all -> 0x005e }
                java.io.File r6 = r1.getParentFile()     // Catch:{ Exception -> 0x0065, all -> 0x005e }
                boolean r6 = r6.exists()     // Catch:{ Exception -> 0x0065, all -> 0x005e }
                if (r6 != 0) goto L_0x0045
                java.io.File r6 = r1.getParentFile()     // Catch:{ Exception -> 0x0065, all -> 0x005e }
                r6.mkdir()     // Catch:{ Exception -> 0x0065, all -> 0x005e }
            L_0x0045:
                java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0065, all -> 0x005e }
                r6.<init>(r1)     // Catch:{ Exception -> 0x0065, all -> 0x005e }
                android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ Exception -> 0x0066, all -> 0x005b }
                r3 = 100
                r4 = r6
                java.io.OutputStream r4 = (java.io.OutputStream) r4     // Catch:{ Exception -> 0x0066, all -> 0x005b }
                r5.compress(r2, r3, r4)     // Catch:{ Exception -> 0x0066, all -> 0x005b }
                java.io.Closeable r6 = (java.io.Closeable) r6
                com.bytedance.common.utility.p482io.C9734a.m28682a(r6)
                r0 = r1
                goto L_0x006b
            L_0x005b:
                r5 = move-exception
                r0 = r6
                goto L_0x005f
            L_0x005e:
                r5 = move-exception
            L_0x005f:
                java.io.Closeable r0 = (java.io.Closeable) r0
                com.bytedance.common.utility.p482io.C9734a.m28682a(r0)
                throw r5
            L_0x0065:
                r6 = r0
            L_0x0066:
                java.io.Closeable r6 = (java.io.Closeable) r6
                com.bytedance.common.utility.p482io.C9734a.m28682a(r6)
            L_0x006b:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.comment.share.C24242c.C24243a.m79621a(android.graphics.Bitmap, java.lang.String):java.io.File");
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x002e  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0042 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0043  */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static boolean m79624b(android.app.Activity r5, com.p280ss.android.ugc.aweme.feed.model.Aweme r6) {
            /*
                boolean r5 = r6.isProhibited()
                r0 = 0
                if (r5 != 0) goto L_0x0056
                boolean r5 = r6.isDelete()
                if (r5 == 0) goto L_0x000e
                goto L_0x0056
            L_0x000e:
                com.ss.android.ugc.aweme.feed.model.AwemeStatus r5 = r6.getStatus()
                r1 = 1
                if (r5 == 0) goto L_0x0026
                com.ss.android.ugc.aweme.feed.model.AwemeStatus r5 = r6.getStatus()
                java.lang.String r2 = "aweme.status"
                kotlin.jvm.internal.C7573i.m23582a(r5, r2)
                int r5 = r5.getPrivateStatus()
                if (r5 != r1) goto L_0x0026
                r5 = 1
                goto L_0x0027
            L_0x0026:
                r5 = 0
            L_0x0027:
                com.ss.android.ugc.aweme.feed.model.AwemeStatus r2 = r6.getStatus()
                r3 = 2
                if (r2 == 0) goto L_0x003f
                com.ss.android.ugc.aweme.feed.model.AwemeStatus r2 = r6.getStatus()
                java.lang.String r4 = "aweme.status"
                kotlin.jvm.internal.C7573i.m23582a(r2, r4)
                int r2 = r2.getPrivateStatus()
                if (r2 != r3) goto L_0x003f
                r2 = 1
                goto L_0x0040
            L_0x003f:
                r2 = 0
            L_0x0040:
                if (r5 == 0) goto L_0x0043
                return r0
            L_0x0043:
                if (r2 == 0) goto L_0x0055
                com.ss.android.ugc.aweme.profile.model.User r5 = r6.getAuthor()
                java.lang.String r6 = "aweme.author"
                kotlin.jvm.internal.C7573i.m23582a(r5, r6)
                int r5 = r5.getFollowStatus()
                if (r5 == r3) goto L_0x0055
                return r0
            L_0x0055:
                return r1
            L_0x0056:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.comment.share.C24242c.C24243a.m79624b(android.app.Activity, com.ss.android.ugc.aweme.feed.model.Aweme):boolean");
        }

        /* renamed from: a */
        public final boolean mo63026a(Activity activity, Aweme aweme) {
            C7573i.m23587b(activity, "activity");
            C7573i.m23587b(aweme, "currentAweme");
            if (aweme.getDistributeType() != 1 || !aweme.isPublic()) {
                return false;
            }
            AwemeRiskModel awemeRiskModel = aweme.getAwemeRiskModel();
            C7573i.m23582a((Object) awemeRiskModel, "currentAweme.awemeRiskModel");
            if (!awemeRiskModel.isWarn() && m79624b(activity, aweme) && C24220a.m79551a().checkDownloadByAwemeStatus(aweme) && C24220a.m79551a().checkDownloadAndDonotShowForbiddenToast(activity, aweme) && aweme.getVideo() != null && aweme.getAuthor() != null && !aweme.isImage() && m79622a() && !C24220a.m79551a().shouldSelfSeeAwemeWithOutWaterMark(aweme) && !C24220a.m79551a().disableWaterMarkForUnReviewed(aweme) && !C24220a.m79551a().isForbiddenWaterClientMark()) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public static Bitmap m79620a(Bitmap bitmap, int i, int i2) {
            if (bitmap == null) {
                return null;
            }
            int height = bitmap.getHeight();
            int width = bitmap.getWidth();
            float f = ((float) i) / ((float) width);
            float f2 = ((float) i2) / ((float) height);
            Matrix matrix = new Matrix();
            matrix.postScale(f, f2);
            Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
            if (!bitmap.isRecycled()) {
                bitmap.recycle();
            }
            return createBitmap;
        }
    }

    /* renamed from: a */
    public static final boolean m79619a(Activity activity, Aweme aweme) {
        return f63971a.mo63026a(activity, aweme);
    }
}
