package com.p280ss.android.ugc.aweme.app;

import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.router.C37286v;
import com.p280ss.android.ugc.aweme.share.command.C38012e;
import com.taobao.android.dexposed.ClassUtils;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.app.bk */
public final class C22902bk extends C23019q {
    public C22902bk(Context context) {
        super(context);
    }

    /* renamed from: a */
    private static String m75366a(String str) {
        String b = C37286v.m119759b(str, "object_id");
        if (!TextUtils.isEmpty(b)) {
            return b;
        }
        return "";
    }

    /* renamed from: d */
    private static String m75369d(Uri uri) {
        List pathSegments = uri.getPathSegments();
        if (pathSegments == null || pathSegments.size() <= 1) {
            return "";
        }
        String str = (String) pathSegments.get(pathSegments.size() - 1);
        if (str.indexOf(ClassUtils.PACKAGE_SEPARATOR) > 0) {
            return str.substring(0, str.indexOf(ClassUtils.PACKAGE_SEPARATOR));
        }
        return str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m75368c(android.net.Uri r5) {
        /*
            java.lang.String r0 = r5.getHost()
            java.lang.String r1 = r5.toString()
            java.lang.String r2 = "schema_type"
            java.lang.String r1 = com.p280ss.android.ugc.aweme.router.C37286v.m119759b(r1, r2)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L_0x001d
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x001d }
            r2 = r1
            r1 = 1
            goto L_0x001f
        L_0x001d:
            r1 = 0
            r2 = 0
        L_0x001f:
            if (r1 != 0) goto L_0x0076
            java.lang.String r1 = "amemv.com"
            boolean r1 = r0.contains(r1)
            if (r1 != 0) goto L_0x0049
            java.lang.String r1 = "douyin.com"
            boolean r1 = r0.contains(r1)
            if (r1 != 0) goto L_0x0049
            java.lang.String r1 = "tiktok.com"
            boolean r1 = r0.contains(r1)
            if (r1 != 0) goto L_0x0049
            java.lang.String r1 = "tiktokv.com"
            boolean r1 = r0.contains(r1)
            if (r1 != 0) goto L_0x0049
            java.lang.String r1 = "musical.ly"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0076
        L_0x0049:
            java.util.List r5 = r5.getPathSegments()
            boolean r0 = com.bytedance.common.utility.collection.C6307b.m19566a(r5)
            if (r0 != 0) goto L_0x0076
            int r0 = r5.size()
            r1 = 3
            if (r0 < r1) goto L_0x0076
            java.lang.Object r0 = r5.get(r4)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = "share"
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 == 0) goto L_0x0076
            java.lang.Object r0 = r5.get(r3)
            java.lang.String r0 = (java.lang.String) r0
            r1 = 2
            r5.get(r1)
            int r2 = com.p280ss.android.ugc.aweme.qrcode.C37055c.m119143a(r0)
        L_0x0076:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.app.C22902bk.m75368c(android.net.Uri):int");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Uri mo59864a(Uri uri) {
        Uri b;
        if (uri.toString().contains("microapp") || uri.toString().contains("microgame")) {
            String c = C38012e.m121344c(uri.toString());
            if (TextUtils.isEmpty(c) || TextUtils.equals(uri.toString(), c)) {
                b = m75367b(uri);
            } else {
                Uri parse = Uri.parse(c);
                if (!uri.getBooleanQueryParameter("backurl", false)) {
                    return parse;
                }
                Builder buildUpon = parse.buildUpon();
                buildUpon.appendQueryParameter("backurl", uri.getQueryParameter("backurl"));
                return buildUpon.build();
            }
        } else {
            try {
                b = m75367b(uri);
            } catch (Exception unused) {
                return null;
            }
        }
        return b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0072, code lost:
        if (m75368c(r8) == 16) goto L_0x0103;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.net.Uri m75367b(android.net.Uri r8) {
        /*
            r7 = this;
            java.lang.String r0 = r8.getPath()
            r8.getQueryParameterNames()
            java.lang.String r1 = "/h5/share/"
            boolean r1 = r0.startsWith(r1)     // Catch:{ Exception -> 0x0047 }
            if (r1 == 0) goto L_0x0016
            java.lang.String r1 = "/h5/share/"
            java.lang.String r1 = m75365a(r8, r1)     // Catch:{ Exception -> 0x0047 }
            goto L_0x0048
        L_0x0016:
            java.lang.String r1 = "/share/"
            boolean r1 = r0.startsWith(r1)     // Catch:{ Exception -> 0x0047 }
            if (r1 == 0) goto L_0x0025
            java.lang.String r1 = "/share/"
            java.lang.String r1 = m75365a(r8, r1)     // Catch:{ Exception -> 0x0047 }
            goto L_0x0048
        L_0x0025:
            java.lang.String r1 = "/i18n/share/"
            boolean r1 = r0.startsWith(r1)     // Catch:{ Exception -> 0x0047 }
            if (r1 == 0) goto L_0x0034
            java.lang.String r1 = "/i18n/share/"
            java.lang.String r1 = m75365a(r8, r1)     // Catch:{ Exception -> 0x0047 }
            goto L_0x0048
        L_0x0034:
            java.lang.String r1 = "/redirect"
            boolean r1 = r0.startsWith(r1)     // Catch:{ Exception -> 0x0047 }
            if (r1 == 0) goto L_0x0047
            java.lang.String r1 = "redirect_url"
            java.lang.String r1 = r8.getQueryParameter(r1)     // Catch:{ Exception -> 0x0047 }
            android.net.Uri r1 = android.net.Uri.parse(r1)     // Catch:{ Exception -> 0x0047 }
            return r1
        L_0x0047:
            r1 = 0
        L_0x0048:
            r2 = -1
            java.lang.String r3 = m75369d(r8)
            r4 = 9
            r5 = 16
            r6 = 6
            if (r1 == 0) goto L_0x0105
            java.lang.String r0 = "usr"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0103
            java.lang.String r0 = "user"
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 == 0) goto L_0x0066
            goto L_0x0103
        L_0x0066:
            java.lang.String r0 = "invite"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0076
            int r0 = m75368c(r8)
            if (r0 != r5) goto L_0x0134
            goto L_0x0103
        L_0x0076:
            java.lang.String r0 = "video"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0081
            r2 = 0
            goto L_0x0134
        L_0x0081:
            java.lang.String r0 = "tag"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x008d
            r2 = 8
            goto L_0x0134
        L_0x008d:
            java.lang.String r0 = "poilist"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00a1
            r2 = 11
            java.lang.String r0 = r8.toString()
            java.lang.String r3 = m75366a(r0)
            goto L_0x0134
        L_0x00a1:
            java.lang.String r0 = "billboard"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00ad
            r2 = 12
            goto L_0x0134
        L_0x00ad:
            java.lang.String r0 = "challenge"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00b8
            r2 = 3
            goto L_0x0134
        L_0x00b8:
            java.lang.String r0 = "music"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00c3
            r2 = 4
            goto L_0x0134
        L_0x00c3:
            java.lang.String r0 = "stickers"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00ce
            r2 = 5
            goto L_0x0134
        L_0x00ce:
            java.lang.String r0 = "live"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00d8
            r2 = 1
            goto L_0x0134
        L_0x00d8:
            java.lang.String r0 = "game"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00e3
            r2 = 9
            goto L_0x0134
        L_0x00e3:
            java.lang.String r0 = "mix"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00ee
            r2 = 10
            goto L_0x0134
        L_0x00ee:
            java.lang.String r0 = "commerce"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0134
            int r0 = m75368c(r8)
            r1 = 23
            if (r0 != r1) goto L_0x0134
            r0 = 13
            r2 = 13
            goto L_0x0134
        L_0x0103:
            r2 = 6
            goto L_0x0134
        L_0x0105:
            java.lang.String r1 = "/v/"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L_0x010f
            r2 = 7
            goto L_0x0134
        L_0x010f:
            java.lang.String r0 = r8.toString()
            java.lang.String r1 = "/falcon/rn/guardian_child"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x011e
            r2 = 17
            goto L_0x0134
        L_0x011e:
            int r0 = m75368c(r8)
            r1 = 20
            if (r0 != r1) goto L_0x0129
            r2 = 14
            goto L_0x0134
        L_0x0129:
            r1 = 21
            if (r0 != r1) goto L_0x0130
            r2 = 15
            goto L_0x0134
        L_0x0130:
            if (r0 != r4) goto L_0x0134
            r2 = 16
        L_0x0134:
            android.net.Uri r8 = r7.mo59993a(r8, r2, r3)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.app.C22902bk.m75367b(android.net.Uri):android.net.Uri");
    }

    /* renamed from: a */
    private static String m75365a(Uri uri, String str) {
        String path = uri.getPath();
        int indexOf = path.indexOf(str) + str.length();
        return path.substring(indexOf, path.indexOf("/", indexOf));
    }
}
