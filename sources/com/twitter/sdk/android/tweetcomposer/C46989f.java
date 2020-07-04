package com.twitter.sdk.android.tweetcomposer;

import android.view.KeyEvent;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;

/* renamed from: com.twitter.sdk.android.tweetcomposer.f */
final /* synthetic */ class C46989f implements OnEditorActionListener {

    /* renamed from: a */
    private final ComposerView f120559a;

    C46989f(ComposerView composerView) {
        this.f120559a = composerView;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        return this.f120559a.mo118134a(textView, i, keyEvent);
    }
}
