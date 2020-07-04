package com.p280ss.android.ugc.aweme.friends.p1285ui;

import android.view.KeyEvent;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;

/* renamed from: com.ss.android.ugc.aweme.friends.ui.k */
final /* synthetic */ class C30164k implements OnEditorActionListener {

    /* renamed from: a */
    private final IAddFriendsActivity f79389a;

    C30164k(IAddFriendsActivity iAddFriendsActivity) {
        this.f79389a = iAddFriendsActivity;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        return this.f79389a.mo76506a(textView, i, keyEvent);
    }
}
