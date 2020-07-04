package com.p280ss.android.ugc.aweme.comment;

import android.content.Context;
import android.text.style.ClickableSpan;
import android.view.View;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.router.SmartRouter;
import com.p280ss.android.ugc.aweme.emoji.model.Emoji;
import java.io.Serializable;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.comment.r */
final class C24209r extends ClickableSpan {

    /* renamed from: a */
    private final Emoji f63926a;

    public C24209r(Emoji emoji) {
        C7573i.m23587b(emoji, "emoji");
        this.f63926a = emoji;
    }

    public final void onClick(View view) {
        C7573i.m23587b(view, "widget");
        Context a = C6399b.m19921a();
        if (a != null) {
            SmartRouter.buildRoute(a, "//gif_emoji").withParam("gif_emoji", (Serializable) this.f63926a).open();
        }
    }
}
