package com.p280ss.android.ugc.aweme.feed.p1238ui;

import com.p280ss.android.ugc.aweme.views.MentionTextView;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.ba */
final /* synthetic */ class C28832ba implements Runnable {

    /* renamed from: a */
    private final MentionTextView f76026a;

    C28832ba(MentionTextView mentionTextView) {
        this.f76026a = mentionTextView;
    }

    public final void run() {
        this.f76026a.setLines(this.f76026a.getLineCount());
    }
}
