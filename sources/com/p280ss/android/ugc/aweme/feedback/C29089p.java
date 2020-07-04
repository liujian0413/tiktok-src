package com.p280ss.android.ugc.aweme.feedback;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.style.ClickableSpan;
import android.view.View;
import com.bytedance.common.utility.C6319n;
import com.p280ss.android.newmedia.p892b.C19926a;
import com.p280ss.android.ugc.aweme.app.C22909c;

/* renamed from: com.ss.android.ugc.aweme.feedback.p */
public final class C29089p extends ClickableSpan {

    /* renamed from: a */
    private String f76818a;

    public C29089p(String str) {
        this.f76818a = str;
    }

    public final void onClick(View view) {
        if (!C6319n.m19593a(this.f76818a)) {
            Uri parse = Uri.parse(this.f76818a);
            Context context = view.getContext();
            if (context != null && parse != null) {
                String scheme = parse.getScheme();
                if (C22909c.f60637a.equals(scheme)) {
                    String a = C19926a.m65746a();
                    if (C22909c.f60637a.equals(scheme) || C22909c.f60639c.equals(scheme)) {
                        this.f76818a = this.f76818a.replaceFirst(C22909c.f60637a, a);
                    }
                    parse = Uri.parse(this.f76818a);
                }
                try {
                    Intent intent = new Intent("android.intent.action.VIEW", parse);
                    intent.putExtra("com.android.browser.application_id", context.getPackageName());
                    context.startActivity(intent);
                } catch (Exception unused) {
                }
            }
        }
    }
}
