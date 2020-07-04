package com.p280ss.android.ugc.aweme.p313im.sdk.chat;

import android.content.Context;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1273i;
import android.support.p029v7.widget.RecyclerView.C1281m;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.p263im.core.model.C6417a;
import com.bytedance.p263im.core.model.Conversation;
import com.bytedance.p263im.core.model.Message;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31887b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.y */
public final class C31056y {

    /* renamed from: l */
    public static final C31057a f81508l = new C31057a(null);

    /* renamed from: a */
    public boolean f81509a;

    /* renamed from: b */
    public boolean f81510b;

    /* renamed from: c */
    public boolean f81511c;

    /* renamed from: d */
    public long f81512d;

    /* renamed from: e */
    public long f81513e;

    /* renamed from: f */
    public int f81514f = -1;

    /* renamed from: g */
    public int f81515g;

    /* renamed from: h */
    public final LinearLayoutManager f81516h;

    /* renamed from: i */
    public final View f81517i;

    /* renamed from: j */
    public final RecyclerView f81518j;

    /* renamed from: k */
    public final MessageAdapter f81519k;

    /* renamed from: m */
    private boolean f81520m;

    /* renamed from: n */
    private int f81521n;

    /* renamed from: o */
    private final Context f81522o;

    /* renamed from: p */
    private final View f81523p;

    /* renamed from: q */
    private final DmtTextView f81524q;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.y$a */
    public static final class C31057a {
        private C31057a() {
        }

        public /* synthetic */ C31057a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.y$b */
    static final class C31058b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C31056y f81525a;

        C31058b(C31056y yVar) {
            this.f81525a = yVar;
        }

        public final void run() {
            LinearLayoutManager linearLayoutManager = this.f81525a.f81516h;
            if (linearLayoutManager != null) {
                int j = linearLayoutManager.mo5445j();
                if (this.f81525a.f81513e > ((long) ((linearLayoutManager.mo5447l() - j) + 1))) {
                    this.f81525a.mo81530a(this.f81525a.f81513e);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.y$c */
    static final class C31059c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C31056y f81526a;

        C31059c(C31056y yVar) {
            this.f81526a = yVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (this.f81526a.f81512d != -1 && !this.f81526a.f81509a) {
                this.f81526a.f81509a = true;
                this.f81526a.mo81532c();
                this.f81526a.mo81533d();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.y$d */
    static final class C31060d implements C30631c {

        /* renamed from: a */
        final /* synthetic */ C31056y f81527a;

        C31060d(C31056y yVar) {
            this.f81527a = yVar;
        }

        /* renamed from: a */
        public final void mo80460a() {
            if (this.f81527a.f81511c) {
                this.f81527a.mo81533d();
            } else {
                this.f81527a.mo81529a();
            }
        }
    }

    /* renamed from: e */
    public final void mo81534e() {
        this.f81519k.mo80439g();
    }

    /* renamed from: c */
    public final void mo81532c() {
        this.f81523p.startAnimation(C31887b.m103597a(240, 0.0f, (float) this.f81523p.getWidth(), 0.0f, 0.0f));
        C9738o.m28712b(this.f81523p, 8);
    }

    /* renamed from: a */
    public final void mo81529a() {
        if (this.f81519k.getItemCount() > 0 && this.f81513e > 0 && !this.f81520m) {
            this.f81520m = true;
            this.f81518j.post(new C31058b(this));
        }
    }

    /* renamed from: f */
    private final void m101322f() {
        View view = this.f81523p;
        view.setVisibility(8);
        view.setOnClickListener(new C31059c(this));
        Conversation a = C6417a.m20015a().mo15530a(this.f81519k.f80399k.getConversationId());
        if (a != null) {
            this.f81512d = a.getReadIndex();
            this.f81513e = a.getUnreadCount();
        }
        this.f81519k.f80400l = new C31060d(this);
        this.f81518j.mo5528a((C1281m) new UnreadMessageTipsDelegate$initUnreadTips$4(this));
    }

    /* renamed from: b */
    public final void mo81531b() {
        boolean z;
        if (this.f81523p.getVisibility() != 8) {
            LinearLayoutManager linearLayoutManager = this.f81516h;
            if (linearLayoutManager != null) {
                int l = linearLayoutManager.mo5447l();
                if (l >= 0 && l < this.f81519k.f80473b.size()) {
                    Message message = (Message) this.f81519k.f80473b.get(l);
                    if (message != null) {
                        if (message.getIndex() <= this.f81512d) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            mo81532c();
                        } else if (l == this.f81519k.getItemCount() - 1 && !this.f81519k.f80398j) {
                            mo81532c();
                        }
                    }
                }
            }
        }
    }

    /* renamed from: d */
    public final void mo81533d() {
        this.f81514f = this.f81519k.mo80421a(this.f81512d);
        if (this.f81514f == -1) {
            this.f81511c = true;
            this.f81521n++;
            if (this.f81521n > 10) {
                this.f81521n = 0;
                this.f81511c = false;
            } else if (this.f81513e > 50) {
                this.f81519k.mo80422a(((int) this.f81513e) + 1);
            } else {
                this.f81519k.mo80422a(51);
            }
        } else {
            this.f81511c = false;
            this.f81510b = true;
            this.f81518j.mo5561d(this.f81514f);
        }
    }

    /* renamed from: a */
    public final void mo81530a(long j) {
        String str;
        if (j > 99) {
            str = this.f81522o.getResources().getString(R.string.bra, new Object[]{this.f81522o.getResources().getString(R.string.br9)});
            C7573i.m23582a((Object) str, "mContext.resources.getSt…ng.im_unread_count_more))");
        } else {
            str = this.f81522o.getResources().getString(R.string.bra, new Object[]{String.valueOf(j)});
            C7573i.m23582a((Object) str, "mContext.resources.getSt…, unreadCount.toString())");
        }
        DmtTextView dmtTextView = this.f81524q;
        C7573i.m23582a((Object) dmtTextView, "mUnreadMessageCount");
        dmtTextView.setText(str);
        this.f81523p.setVisibility(0);
        this.f81523p.startAnimation(C31887b.m103597a(240, C9738o.m28708b(this.f81522o, 120.0f), 0.0f, 0.0f, 0.0f));
    }

    public C31056y(View view, RecyclerView recyclerView, MessageAdapter messageAdapter) {
        LinearLayoutManager linearLayoutManager;
        C7573i.m23587b(view, "rootView");
        C7573i.m23587b(recyclerView, "recyclerView");
        C7573i.m23587b(messageAdapter, "adapter");
        this.f81517i = view;
        this.f81518j = recyclerView;
        this.f81519k = messageAdapter;
        Context context = this.f81517i.getContext();
        C7573i.m23582a((Object) context, "rootView.context");
        this.f81522o = context;
        this.f81515g = (int) C9738o.m28708b(this.f81522o, 60.0f);
        View findViewById = this.f81517i.findViewById(R.id.e7v);
        C7573i.m23582a((Object) findViewById, "rootView.findViewById<Vi…R.id.unread_message_tips)");
        this.f81523p = findViewById;
        this.f81524q = (DmtTextView) this.f81517i.findViewById(R.id.e7u);
        if (this.f81518j.getLayoutManager() instanceof LinearLayoutManager) {
            C1273i layoutManager = this.f81518j.getLayoutManager();
            if (layoutManager != null) {
                linearLayoutManager = (LinearLayoutManager) layoutManager;
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.support.v7.widget.LinearLayoutManager");
            }
        } else {
            linearLayoutManager = null;
        }
        this.f81516h = linearLayoutManager;
        m101322f();
    }
}
