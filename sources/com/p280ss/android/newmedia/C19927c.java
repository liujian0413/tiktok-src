package com.p280ss.android.newmedia;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import android.support.p029v7.app.AlertDialog.C1081a;

/* renamed from: com.ss.android.newmedia.c */
public final class C19927c {
    /* renamed from: a */
    public final boolean mo53433a(final Context context, String str) {
        if (context == null) {
            return false;
        }
        if (!str.startsWith("alipays:") && !str.startsWith("alipay")) {
            return false;
        }
        try {
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        } catch (Exception unused) {
            new C1081a(context).mo4240b((CharSequence) "未检测到支付宝客户端，请安装后重试。").mo4234a((CharSequence) "立即安装", (OnClickListener) new OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://d.alipay.com")));
                }
            }).mo4241b((CharSequence) "取消", (OnClickListener) null).mo4245c();
        }
        return true;
    }
}
