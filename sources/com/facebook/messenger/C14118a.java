package com.facebook.messenger;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import com.facebook.C13499h;
import com.facebook.internal.C13916j;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.facebook.messenger.a */
public final class C14118a {
    /* renamed from: a */
    public static boolean m41689a(Context context) {
        return C13916j.m41080a(context, "com.facebook.orca");
    }

    /* renamed from: b */
    public static void m41691b(Context context) {
        try {
            m41688a(context, "market://details?id=com.facebook.orca");
        } catch (ActivityNotFoundException unused) {
            m41688a(context, "http://play.google.com/store/apps/details?id=com.facebook.orca");
        }
    }

    /* renamed from: c */
    private static Set<Integer> m41692c(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        HashSet hashSet = new HashSet();
        Cursor query = contentResolver.query(Uri.parse("content://com.facebook.orca.provider.MessengerPlatformProvider/versions"), new String[]{C38347c.f99551f}, null, null, null);
        if (query != null) {
            try {
                int columnIndex = query.getColumnIndex(C38347c.f99551f);
                while (query.moveToNext()) {
                    hashSet.add(Integer.valueOf(query.getInt(columnIndex)));
                }
            } finally {
                query.close();
            }
        }
        return hashSet;
    }

    /* renamed from: a */
    private static void m41688a(Context context, String str) {
        context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
    }

    /* renamed from: a */
    public static void m41687a(Activity activity, int i, C14119b bVar) {
        if (!m41689a(activity)) {
            m41691b(activity);
        } else if (m41692c(activity).contains(Integer.valueOf(20150314))) {
            m41690b(activity, 12306, bVar);
        } else {
            m41691b(activity);
        }
    }

    /* renamed from: b */
    private static void m41690b(Activity activity, int i, C14119b bVar) {
        try {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setFlags(1);
            intent.setPackage("com.facebook.orca");
            intent.putExtra("android.intent.extra.STREAM", bVar.f37300d);
            intent.setType(bVar.f37301e);
            String k = C13499h.m39725k();
            if (k != null) {
                intent.putExtra("com.facebook.orca.extra.PROTOCOL_VERSION", 20150314);
                intent.putExtra("com.facebook.orca.extra.APPLICATION_ID", k);
                intent.putExtra("com.facebook.orca.extra.METADATA", bVar.f37302f);
                intent.putExtra("com.facebook.orca.extra.EXTERNAL_URI", bVar.f37303g);
            }
            activity.startActivityForResult(intent, i);
        } catch (ActivityNotFoundException unused) {
            activity.startActivity(activity.getPackageManager().getLaunchIntentForPackage("com.facebook.orca"));
        }
    }
}
