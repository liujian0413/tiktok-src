package com.p280ss.android.ugc.aweme.share;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.p280ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.share.as */
public final class C37991as {
    /* renamed from: a */
    public static final void m121305a(Context context, String str) {
        Intent intent;
        C7573i.m23587b(context, "context");
        C7573i.m23587b(str, "instagramId");
        StringBuilder sb = new StringBuilder("https://instagram.com/_u/");
        sb.append(str);
        String sb2 = sb.toString();
        try {
            context.getPackageManager().getPackageInfo("com.instagram.android", 0);
            intent = new Intent("android.intent.action.VIEW", Uri.parse(sb2));
            intent.setPackage("com.instagram.android");
        } catch (Exception unused) {
            intent = new Intent(context, CrossPlatformActivity.class);
            intent.putExtra("title", context.getString(R.string.buc));
            intent.setData(Uri.parse(sb2));
        }
        try {
            context.startActivity(intent);
        } catch (Exception unused2) {
        }
    }

    /* renamed from: b */
    public static final void m121306b(Context context, String str) {
        Intent intent;
        C7573i.m23587b(context, "context");
        C7573i.m23587b(str, "youtubeChannelId");
        StringBuilder sb = new StringBuilder("https://www.youtube.com/channel/");
        sb.append(str);
        String sb2 = sb.toString();
        try {
            context.getPackageManager().getPackageInfo("com.google.android.youtube", 0);
            intent = new Intent("android.intent.action.VIEW", Uri.parse(sb2));
            intent.setPackage("com.google.android.youtube");
        } catch (Exception unused) {
            intent = new Intent(context, CrossPlatformActivity.class);
            intent.putExtra("title", context.getString(R.string.ftd));
            intent.setData(Uri.parse(sb2));
        }
        try {
            context.startActivity(intent);
        } catch (Exception unused2) {
        }
    }

    /* renamed from: c */
    public static final void m121307c(Context context, String str) {
        Intent intent;
        C7573i.m23587b(context, "context");
        C7573i.m23587b(str, "twitterId");
        StringBuilder sb = new StringBuilder("https://twitter.com/intent/user?user_id=");
        sb.append(str);
        String sb2 = sb.toString();
        try {
            context.getPackageManager().getPackageInfo("com.twitter.android", 0);
            StringBuilder sb3 = new StringBuilder("twitter://user?id=");
            sb3.append(str);
            intent = new Intent("android.intent.action.VIEW", Uri.parse(sb3.toString()));
            intent.setPackage("com.twitter.android");
        } catch (Exception unused) {
            intent = new Intent(context, CrossPlatformActivity.class);
            intent.putExtra("title", context.getString(R.string.fh4));
            intent.setData(Uri.parse(sb2));
        }
        try {
            context.startActivity(intent);
        } catch (Exception unused2) {
        }
    }
}
