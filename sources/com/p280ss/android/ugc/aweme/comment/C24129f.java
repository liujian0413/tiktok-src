package com.p280ss.android.ugc.aweme.comment;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.views.mention.MentionEditText;

/* renamed from: com.ss.android.ugc.aweme.comment.f */
final /* synthetic */ class C24129f implements OnClickListener {

    /* renamed from: a */
    private final C24093d f63779a;

    /* renamed from: b */
    private final String f63780b;

    /* renamed from: c */
    private final String f63781c;

    /* renamed from: d */
    private final MentionEditText f63782d;

    C24129f(C24093d dVar, String str, String str2, MentionEditText mentionEditText) {
        this.f63779a = dVar;
        this.f63780b = str;
        this.f63781c = str2;
        this.f63782d = mentionEditText;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f63779a.mo62492b(this.f63780b, this.f63781c, this.f63782d, view);
    }
}
