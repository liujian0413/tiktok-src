package com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder;

import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.p263im.core.model.C11443k;
import com.bytedance.p263im.core.model.Message;
import com.p280ss.android.ugc.aweme.emoji.model.Emoji;
import com.p280ss.android.ugc.aweme.p313im.sdk.abtest.C6928b;
import com.p280ss.android.ugc.aweme.p313im.sdk.abtest.C6943d;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.GreetEmojiAdapter;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.BaseContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.EmojiContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.SayHelloContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31858ad;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31913m;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7058be;
import com.p280ss.android.ugc.aweme.p313im.sdk.widget.AutoRTLImageView;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7563m;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.GreetMessageViewHolder */
public final class GreetMessageViewHolder extends BaseViewHolder<SayHelloContent> {

    /* renamed from: m */
    private final DmtTextView f81232m;

    /* renamed from: n */
    private final AutoRTLImageView f81233n;

    /* renamed from: o */
    private final RecyclerView f81234o;

    /* renamed from: p */
    private final GreetEmojiAdapter f81235p = new GreetEmojiAdapter();

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.GreetMessageViewHolder$a */
    static final class C31010a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ GreetMessageViewHolder f81236a;

        C31010a(GreetMessageViewHolder greetMessageViewHolder) {
            this.f81236a = greetMessageViewHolder;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            SayHelloContent sayHelloContent = (SayHelloContent) this.f81236a.f81198f;
            if (sayHelloContent != null) {
                C31858ad.m103406a();
                String str = this.f81236a.f81196d;
                Message message = this.f81236a.f81201i;
                C7573i.m23582a((Object) message, "currentMessage");
                C31858ad.m103436a(str, message.getConversationId(), sayHelloContent.getEmoji(), true);
            }
            C11443k.m33752c(this.f81236a.f81201i);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.GreetMessageViewHolder$b */
    static final class C31011b extends Lambda implements C7563m<View, Integer, C7581n> {

        /* renamed from: a */
        final /* synthetic */ GreetMessageViewHolder f81237a;

        C31011b(GreetMessageViewHolder greetMessageViewHolder) {
            this.f81237a = greetMessageViewHolder;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m100954a((View) obj, ((Number) obj2).intValue());
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m100954a(View view, final int i) {
            C7573i.m23587b(view, "view");
            new C6928b(view.getContext(), new C6943d(this) {

                /* renamed from: a */
                final /* synthetic */ C31011b f81238a;

                {
                    this.f81238a = r1;
                }

                public final void sendMsg() {
                    C11443k.m33752c(this.f81238a.f81237a.f81201i);
                    Message message = this.f81238a.f81237a.f81201i;
                    C7573i.m23582a((Object) message, "currentMessage");
                    SayHelloContent sayHelloContent = (SayHelloContent) C31913m.m103667a(message.getContent(), SayHelloContent.class);
                    if (sayHelloContent != null && i >= 0 && i < sayHelloContent.getEmoji().size()) {
                        C31858ad.m103406a();
                        Message message2 = this.f81238a.f81237a.f81201i;
                        C7573i.m23582a((Object) message2, "currentMessage");
                        Object obj = sayHelloContent.getEmoji().get(i);
                        C7573i.m23582a(obj, "emoji[position]");
                        C31858ad.m103474f(message2.getConversationId(), "", String.valueOf(((Emoji) obj).getId()));
                        C7058be a = C7058be.m21980a();
                        Message message3 = this.f81238a.f81237a.f81201i;
                        C7573i.m23582a((Object) message3, "currentMessage");
                        a.mo18268b(message3.getConversationId(), (BaseContent) EmojiContent.obtain((Emoji) sayHelloContent.getEmoji().get(i)));
                    }
                }
            }).sendMsg();
        }
    }

    /* renamed from: a */
    public final void mo81424a(OnClickListener onClickListener) {
        super.mo81424a(onClickListener);
        this.f81233n.setOnClickListener(new C31010a(this));
        this.f81235p.f80376a = new C31011b(this);
    }

    public GreetMessageViewHolder(View view, int i) {
        C7573i.m23587b(view, "itemView");
        super(view, i);
        View findViewById = view.findViewById(R.id.asq);
        C7573i.m23582a((Object) findViewById, "itemView.findViewById(R.id.greet_tv)");
        this.f81232m = (DmtTextView) findViewById;
        View findViewById2 = view.findViewById(R.id.xl);
        C7573i.m23582a((Object) findViewById2, "itemView.findViewById(R.id.close_iv)");
        this.f81233n = (AutoRTLImageView) findViewById2;
        View findViewById3 = view.findViewById(R.id.asp);
        C7573i.m23582a((Object) findViewById3, "itemView.findViewById(R.id.greet_icon_list)");
        this.f81234o = (RecyclerView) findViewById3;
        RecyclerView recyclerView = this.f81234o;
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext(), 0, false));
        recyclerView.setAdapter(this.f81235p);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo81421a(Message message, Message message2, SayHelloContent sayHelloContent, int i) {
        CharSequence charSequence;
        C7573i.m23587b(message, "msg");
        super.mo81421a(message, message2, sayHelloContent, i);
        if (sayHelloContent != null) {
            C31858ad.m103406a();
            boolean z = false;
            C31858ad.m103436a(this.f81196d, message.getConversationId(), sayHelloContent.getEmoji(), false);
            DmtTextView dmtTextView = this.f81232m;
            CharSequence helloText = sayHelloContent.getHelloText();
            if (helloText == null || helloText.length() == 0) {
                z = true;
            }
            if (!z) {
                charSequence = sayHelloContent.getHelloText();
            } else {
                View view = this.itemView;
                C7573i.m23582a((Object) view, "itemView");
                charSequence = view.getContext().getString(R.string.bow);
            }
            dmtTextView.setText(charSequence);
            this.f81235p.mo80343a(sayHelloContent.getEmoji(), null);
        }
    }
}
