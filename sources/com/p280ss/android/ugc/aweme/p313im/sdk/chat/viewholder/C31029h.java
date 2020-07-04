package com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.p263im.core.model.C11443k;
import com.bytedance.p263im.core.model.C6425b;
import com.bytedance.p263im.core.model.Message;
import com.p280ss.android.ugc.aweme.emoji.model.Emoji;
import com.p280ss.android.ugc.aweme.p313im.sdk.abtest.C6928b;
import com.p280ss.android.ugc.aweme.p313im.sdk.abtest.C6943d;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.BaseContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.EmojiContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.SayHelloContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31858ad;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31863ai;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31915n;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7058be;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.h */
public abstract class C31029h {

    /* renamed from: f */
    public static final C31030a f81447f = new C31030a(null);

    /* renamed from: a */
    public final View f81448a;

    /* renamed from: b */
    public final Context f81449b;

    /* renamed from: c */
    protected Message f81450c;

    /* renamed from: d */
    protected SayHelloContent f81451d;

    /* renamed from: e */
    public final SayHelloViewHolder f81452e;

    /* renamed from: g */
    private View f81453g;

    /* renamed from: h */
    private DmtTextView f81454h;

    /* renamed from: i */
    private View f81455i;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.h$a */
    public static final class C31030a {
        private C31030a() {
        }

        public /* synthetic */ C31030a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.h$b */
    static final class C31031b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C31029h f81456a;

        C31031b(C31029h hVar) {
            this.f81456a = hVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f81456a.mo81498f();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.h$c */
    static final class C31032c implements C6943d {

        /* renamed from: a */
        final /* synthetic */ C31029h f81457a;

        /* renamed from: b */
        final /* synthetic */ Emoji f81458b;

        C31032c(C31029h hVar, Emoji emoji) {
            this.f81457a = hVar;
            this.f81458b = emoji;
        }

        public final void sendMsg() {
            C11443k.m33752c(this.f81457a.mo81489a());
            C7058be.m21980a().mo18263a(this.f81457a.mo81495c(), (BaseContent) EmojiContent.obtain(this.f81458b));
            C31858ad.m103406a();
            C31858ad.m103474f(this.f81457a.mo81489a().getConversationId(), this.f81457a.mo81495c(), String.valueOf(this.f81458b.getId()));
        }
    }

    /* renamed from: a */
    public abstract void mo81492a(boolean z);

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract List<Emoji> mo81496d();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Message mo81489a() {
        Message message = this.f81450c;
        if (message == null) {
            C7573i.m23583a("message");
        }
        return message;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final SayHelloContent mo81494b() {
        SayHelloContent sayHelloContent = this.f81451d;
        if (sayHelloContent == null) {
            C7573i.m23583a(C38347c.f99553h);
        }
        return sayHelloContent;
    }

    /* renamed from: c */
    public final String mo81495c() {
        Message message = this.f81450c;
        if (message == null) {
            C7573i.m23583a("message");
        }
        String valueOf = String.valueOf(C6425b.m20074a(message.getConversationId()));
        C7573i.m23582a((Object) valueOf, "java.lang.String.valueOf…(message.conversationId))");
        return valueOf;
    }

    /* renamed from: f */
    public final void mo81498f() {
        C31858ad.m103406a();
        String c = mo81495c();
        Message message = this.f81450c;
        if (message == null) {
            C7573i.m23583a("message");
        }
        C31858ad.m103436a(c, message.getConversationId(), mo81496d(), true);
        Message message2 = this.f81450c;
        if (message2 == null) {
            C7573i.m23583a("message");
        }
        C11443k.m33752c(message2);
    }

    /* renamed from: e */
    public void mo81497e() {
        int i;
        this.f81454h = (DmtTextView) mo81493b(R.id.cye);
        this.f81453g = mo81493b(R.id.xl);
        this.f81455i = mo81493b(R.id.a9t);
        View view = this.f81455i;
        if (view == null) {
            C7573i.m23583a("dividerTop");
        }
        if (C31915n.m103671a()) {
            i = 8;
        } else {
            i = 0;
        }
        view.setVisibility(i);
        View view2 = this.f81453g;
        if (view2 == null) {
            C7573i.m23583a("closeIv");
        }
        view2.setOnClickListener(new C31031b(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final <T extends View> T mo81493b(int i) {
        T findViewById = this.f81448a.findViewById(i);
        C7573i.m23582a((Object) findViewById, "itemView.findViewById(id)");
        return findViewById;
    }

    public C31029h(SayHelloViewHolder sayHelloViewHolder) {
        C7573i.m23587b(sayHelloViewHolder, "parent");
        this.f81452e = sayHelloViewHolder;
        View view = this.f81452e.itemView;
        C7573i.m23582a((Object) view, "parent.itemView");
        this.f81448a = view;
        Context context = this.f81448a.getContext();
        if (context == null) {
            C7573i.m23580a();
        }
        this.f81449b = context;
        mo81497e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo81490a(int i) {
        if (i < mo81496d().size()) {
            new C6928b(this.f81449b, new C31032c(this, (Emoji) mo81496d().get(i))).sendMsg();
        }
    }

    /* renamed from: a */
    public void mo81491a(Message message, Message message2, SayHelloContent sayHelloContent, int i) {
        boolean z;
        CharSequence charSequence;
        C7573i.m23587b(message, "msg");
        C7573i.m23587b(sayHelloContent, C38347c.f99553h);
        this.f81450c = message;
        this.f81451d = sayHelloContent;
        if (message.getLocalExt().get("is_logger") == null) {
            message.addLocalExt("is_logger", "true");
            C31858ad.m103406a();
            String c = mo81495c();
            Message message3 = this.f81450c;
            if (message3 == null) {
                C7573i.m23583a("message");
            }
            C31858ad.m103436a(c, message3.getConversationId(), mo81496d(), false);
            C31863ai.m103529a(message);
        }
        DmtTextView dmtTextView = this.f81454h;
        if (dmtTextView == null) {
            C7573i.m23583a("sayHelloTv");
        }
        CharSequence helloText = sayHelloContent.getHelloText();
        if (helloText == null || helloText.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            charSequence = sayHelloContent.getHelloText();
        } else {
            charSequence = this.f81449b.getString(R.string.box, new Object[]{sayHelloContent.getNickname()});
        }
        dmtTextView.setText(charSequence);
    }
}
