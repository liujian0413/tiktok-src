package com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder;

import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.view.View;
import com.bytedance.p263im.core.model.Message;
import com.p280ss.android.ugc.aweme.emoji.model.Emoji;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.GreetEmojiAdapter;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.SayHelloContent;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7563m;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.k */
public final class C31040k extends C31029h {

    /* renamed from: g */
    private RecyclerView f81472g;

    /* renamed from: h */
    private GreetEmojiAdapter f81473h;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.k$a */
    static final class C31041a extends Lambda implements C7563m<View, Integer, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C31040k f81474a;

        C31041a(C31040k kVar) {
            this.f81474a = kVar;
            super(2);
        }

        /* renamed from: a */
        private void m101299a(View view, int i) {
            C7573i.m23587b(view, "<anonymous parameter 0>");
            this.f81474a.mo81490a(i);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m101299a((View) obj, ((Number) obj2).intValue());
            return C7581n.f20898a;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final List<Emoji> mo81496d() {
        List<Emoji> jokerEmojis = mo81494b().getJokerEmojis();
        C7573i.m23582a((Object) jokerEmojis, "content.jokerEmojis");
        return jokerEmojis;
    }

    /* renamed from: e */
    public final void mo81497e() {
        super.mo81497e();
        this.f81472g = (RecyclerView) mo81493b(R.id.cxa);
        this.f81473h = new GreetEmojiAdapter();
        GreetEmojiAdapter greetEmojiAdapter = this.f81473h;
        if (greetEmojiAdapter == null) {
            C7573i.m23583a("adapter");
        }
        greetEmojiAdapter.f80376a = new C31041a(this);
        RecyclerView recyclerView = this.f81472g;
        if (recyclerView == null) {
            C7573i.m23583a("recyclerView");
        }
        GreetEmojiAdapter greetEmojiAdapter2 = this.f81473h;
        if (greetEmojiAdapter2 == null) {
            C7573i.m23583a("adapter");
        }
        recyclerView.setAdapter(greetEmojiAdapter2);
        RecyclerView recyclerView2 = this.f81472g;
        if (recyclerView2 == null) {
            C7573i.m23583a("recyclerView");
        }
        recyclerView2.setLayoutManager(new LinearLayoutManager(this.f81449b, 0, false));
    }

    public C31040k(SayHelloViewHolder sayHelloViewHolder) {
        C7573i.m23587b(sayHelloViewHolder, "parent");
        super(sayHelloViewHolder);
    }

    /* renamed from: a */
    public final void mo81492a(boolean z) {
        int i;
        RecyclerView recyclerView = this.f81472g;
        if (recyclerView == null) {
            C7573i.m23583a("recyclerView");
        }
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        recyclerView.setVisibility(i);
    }

    /* renamed from: a */
    public final void mo81491a(Message message, Message message2, SayHelloContent sayHelloContent, int i) {
        C7573i.m23587b(message, "msg");
        C7573i.m23587b(sayHelloContent, C38347c.f99553h);
        super.mo81491a(message, message2, sayHelloContent, i);
        mo81492a(true);
        GreetEmojiAdapter greetEmojiAdapter = this.f81473h;
        if (greetEmojiAdapter == null) {
            C7573i.m23583a("adapter");
        }
        greetEmojiAdapter.mo80343a(mo81496d(), null);
    }
}
