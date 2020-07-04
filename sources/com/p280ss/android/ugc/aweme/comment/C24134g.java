package com.p280ss.android.ugc.aweme.comment;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.views.mention.MentionEditText;

/* renamed from: com.ss.android.ugc.aweme.comment.g */
final /* synthetic */ class C24134g implements OnClickListener {

    /* renamed from: a */
    private final C24093d f63789a;

    /* renamed from: b */
    private final String f63790b;

    /* renamed from: c */
    private final String f63791c;

    /* renamed from: d */
    private final MentionEditText f63792d;

    C24134g(C24093d dVar, String str, String str2, MentionEditText mentionEditText) {
        this.f63789a = dVar;
        this.f63790b = str;
        this.f63791c = str2;
        this.f63792d = mentionEditText;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f63789a.mo62483a(this.f63790b, this.f63791c, this.f63792d, view);
    }
}
