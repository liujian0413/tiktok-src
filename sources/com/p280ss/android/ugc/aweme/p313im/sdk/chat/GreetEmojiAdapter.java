package com.p280ss.android.ugc.aweme.p313im.sdk.chat;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.View;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.emoji.model.Emoji;
import com.p280ss.android.ugc.aweme.p313im.sdk.arch.adpater.BaseDiffableAdapter;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7563m;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.GreetEmojiAdapter */
public final class GreetEmojiAdapter extends BaseDiffableAdapter<GreetEmojiViewHolder, Emoji> {

    /* renamed from: a */
    public C7563m<? super View, ? super Integer, C7581n> f80376a;

    public GreetEmojiAdapter() {
        super(null, 1, null);
    }

    /* renamed from: a */
    public final C1293v mo58032a(ViewGroup viewGroup, int i) {
        C7573i.m23587b(viewGroup, "parent");
        return new GreetEmojiViewHolder(viewGroup);
    }

    /* renamed from: a */
    public final void mo58033a(C1293v vVar, int i) {
        if (vVar != null) {
            Emoji emoji = (Emoji) mo80344b(i);
            if (emoji != null) {
                GreetEmojiViewHolder greetEmojiViewHolder = (GreetEmojiViewHolder) vVar;
                greetEmojiViewHolder.mo80413a(emoji, i);
                greetEmojiViewHolder.f80377a = this.f80376a;
                return;
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.im.sdk.chat.GreetEmojiViewHolder");
    }
}
