package com.p280ss.android.ugc.aweme.commercialize.utils;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.text.TextUtils;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.bt */
public final class C25292bt {
    /* renamed from: a */
    public static boolean m83100a(Fragment fragment) {
        Bundle arguments = fragment.getArguments();
        if (arguments == null) {
            return false;
        }
        return TextUtils.equals(arguments.getString("trigger_by"), "splash");
    }

    /* renamed from: a */
    public static void m83099a(Uri uri, Intent intent) {
        if (uri != null && intent != null) {
            String queryParameter = uri.getQueryParameter("trigger_by");
            if (queryParameter != null) {
                intent.putExtra("trigger_by", queryParameter);
            }
        }
    }

    /* renamed from: a */
    public static void m83098a(Activity activity, Fragment fragment) {
        if (activity != null && fragment != null) {
            Intent intent = activity.getIntent();
            if (intent != null) {
                String stringExtra = intent.getStringExtra("trigger_by");
                if (stringExtra != null) {
                    Bundle arguments = fragment.getArguments();
                    if (arguments == null) {
                        arguments = new Bundle();
                        fragment.setArguments(arguments);
                    }
                    arguments.putString("trigger_by", stringExtra);
                }
            }
        }
    }
}
