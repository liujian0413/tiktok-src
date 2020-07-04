package com.p280ss.android.ugc.aweme.feed.adapter;

import android.content.Context;
import android.net.Uri;
import com.bytedance.lighten.loader.SmartImageView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.bo */
final class C28170bo {
    /* renamed from: a */
    static void m92472a(SimpleDraweeView simpleDraweeView, int i) {
        try {
            simpleDraweeView.setBackgroundResource(i);
        } catch (Exception e) {
            C6921a.m21559a((Throwable) e);
        }
    }

    /* renamed from: a */
    public static void m92471a(SmartImageView smartImageView, Context context, int i) {
        StringBuilder sb = new StringBuilder("res://");
        sb.append(context.getPackageName());
        sb.append("/2131233922");
        smartImageView.setImageURI(Uri.parse(sb.toString()));
    }
}
