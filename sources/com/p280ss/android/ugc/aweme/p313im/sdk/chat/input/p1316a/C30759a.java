package com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.p1316a;

import android.support.p022v4.app.FragmentActivity;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.net.C30954u;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.choose.model.MediaChooseResult;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.choose.viewmodel.MediaPanelChooseViewModel.C31426a;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.model.MediaModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.a.a */
public final class C30759a {

    /* renamed from: a */
    public static final C30759a f80530a = new C30759a();

    private C30759a() {
    }

    /* renamed from: a */
    public static final void m100198a(FragmentActivity fragmentActivity, MediaChooseResult mediaChooseResult) {
        C7573i.m23587b(fragmentActivity, "activity");
        C7573i.m23587b(mediaChooseResult, "chooseResult");
        C31426a.m102239a(fragmentActivity).mo82007p().setValue(mediaChooseResult);
    }

    /* renamed from: a */
    public static final void m100199a(FragmentActivity fragmentActivity, String str, MediaChooseResult mediaChooseResult) {
        C7573i.m23587b(fragmentActivity, "activity");
        C7573i.m23587b(mediaChooseResult, "chooseResult");
        m100198a(fragmentActivity, new MediaChooseResult(false, new ArrayList()));
        C30954u.m100739a(str, (List<MediaModel>) mediaChooseResult.getSelectedList(), mediaChooseResult.getSendRaw());
    }
}
