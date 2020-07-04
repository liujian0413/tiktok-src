package com.p280ss.android.ugc.aweme.app;

import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.router.C37286v;
import java.util.Set;

/* renamed from: com.ss.android.ugc.aweme.app.q */
public abstract class C23019q {

    /* renamed from: a */
    protected Context f60796a;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract Uri mo59864a(Uri uri);

    public C23019q(Context context) {
        this.f60796a = context;
    }

    /* renamed from: a */
    private static boolean m75677a(String str) {
        if (TextUtils.equals(Uri.parse(str).getHost(), C22912d.f60641a)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final Uri mo59993a(Uri uri, int i, String str) {
        Uri uri2;
        if (TextUtils.isEmpty(str) && i != 9 && i != 14 && i != 15 && i != 16) {
            return null;
        }
        String str2 = "";
        switch (i) {
            case 0:
                StringBuilder sb = new StringBuilder("musically://detail?id=");
                sb.append(str);
                str2 = sb.toString();
                break;
            case 1:
                StringBuilder sb2 = new StringBuilder("musically://live?room_id=");
                sb2.append(str);
                str2 = sb2.toString();
                break;
            case 2:
                StringBuilder sb3 = new StringBuilder("musically://profile?unique_id=");
                sb3.append(str);
                str2 = sb3.toString();
                break;
            case 3:
                StringBuilder sb4 = new StringBuilder("musically://challenge/detail/");
                sb4.append(str);
                str2 = sb4.toString();
                break;
            case 4:
                StringBuilder sb5 = new StringBuilder("musically://music/detail/");
                sb5.append(str);
                str2 = sb5.toString();
                break;
            case 5:
                StringBuilder sb6 = new StringBuilder("musically://stickers/detail/");
                sb6.append(str);
                str2 = sb6.toString();
                break;
            case 6:
                StringBuilder sb7 = new StringBuilder("musically://profile?id=");
                sb7.append(str);
                str2 = sb7.toString();
                if (uri != null) {
                    String queryParameter = uri.getQueryParameter(C22689a.f60407a);
                    if (!TextUtils.isEmpty(queryParameter)) {
                        StringBuilder sb8 = new StringBuilder();
                        sb8.append(str2);
                        sb8.append("&sec_uid=");
                        sb8.append(queryParameter);
                        str2 = sb8.toString();
                        break;
                    }
                }
                break;
            case 7:
                StringBuilder sb9 = new StringBuilder("musically://item?id=");
                sb9.append(str);
                str2 = sb9.toString();
                break;
            case 8:
                StringBuilder sb10 = new StringBuilder("musically://tag?id=");
                sb10.append(str);
                str2 = sb10.toString();
                break;
            case 9:
                StringBuilder sb11 = new StringBuilder("musically://game?game_id=");
                sb11.append(str);
                str2 = sb11.toString();
                break;
            case 10:
                StringBuilder sb12 = new StringBuilder("musically://mix_video/detail/");
                sb12.append(str);
                str2 = sb12.toString();
                break;
            case 11:
                StringBuilder sb13 = new StringBuilder("musically://poi?id=");
                sb13.append(str);
                str2 = sb13.toString();
                break;
            case 12:
                String b = C37286v.m119759b(uri.toString(), "id");
                if (!TextUtils.isEmpty(b)) {
                    String b2 = C37286v.m119759b(uri.toString(), "edition_uid");
                    StringBuilder sb14 = new StringBuilder("musically://search/trending?type=");
                    sb14.append(b);
                    sb14.append("&trending=");
                    sb14.append(b2);
                    str2 = sb14.toString();
                    break;
                }
                break;
            case 13:
                StringBuilder sb15 = new StringBuilder("musically://challenge/detail?id=");
                sb15.append(str);
                sb15.append("&group=0&is_commerce=1");
                str2 = sb15.toString();
                break;
            case 14:
                C37286v.m119759b(uri.toString(), "object_id");
                break;
            case 15:
                String b3 = C37286v.m119759b(uri.toString(), "object_id");
                StringBuilder sb16 = new StringBuilder("musically://goods/shop/?uid=");
                sb16.append(b3);
                str2 = sb16.toString();
                break;
            case 16:
                String b4 = C37286v.m119759b(uri.toString(), "object_id");
                StringBuilder sb17 = new StringBuilder("musically://openRecord?recordParam=sticker&id=");
                sb17.append(b4);
                str2 = sb17.toString();
                break;
            case 17:
                str2 = Uri.parse("musically://webview").buildUpon().appendQueryParameter("url", uri.toString()).build().toString();
                break;
        }
        if (!TextUtils.isEmpty(str2)) {
            uri2 = Uri.parse(str2);
        } else {
            uri2 = null;
        }
        if (uri2 == null) {
            return null;
        }
        if (uri != null && !m75677a(str2)) {
            Set<String> queryParameterNames = uri.getQueryParameterNames();
            Builder buildUpon = uri2.buildUpon();
            if (!(queryParameterNames == null || buildUpon == null)) {
                for (String str3 : queryParameterNames) {
                    buildUpon.appendQueryParameter(str3, uri.getQueryParameter(str3));
                }
            }
            uri2 = buildUpon.build();
        }
        return uri2;
    }
}
