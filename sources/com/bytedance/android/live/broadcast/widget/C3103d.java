package com.bytedance.android.live.broadcast.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.Spannable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.core.utils.C3385e;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.chatroom.p212e.C4343b;
import com.bytedance.android.livesdk.chatroom.p212e.C4374z;
import com.bytedance.android.livesdk.chatroom.p220ui.GameMsgLinearLayoutManager;
import com.bytedance.android.livesdk.chatroom.widget.LiveMessageRecyclerView;
import com.bytedance.android.livesdk.floatwindow.C7843g;
import com.bytedance.android.livesdk.floatwindow.C7849h;
import com.bytedance.android.livesdk.gift.model.C8149d;
import com.bytedance.android.livesdk.message.model.C8487am;
import com.bytedance.android.livesdk.message.model.C8489ao;
import com.bytedance.android.livesdk.message.model.C8514bj;
import com.bytedance.android.livesdk.message.model.C8538c;
import com.bytedance.android.livesdk.sharedpref.C8946b;
import com.bytedance.android.livesdk.utils.C9051ar;
import com.bytedance.android.livesdk.utils.p426b.C9056a;
import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.bytedance.android.livesdkapi.host.C9456c;
import com.bytedance.android.livesdkapi.host.C9456c.C9457a;
import com.bytedance.android.livesdkapi.host.C9456c.C9459c;
import com.bytedance.android.message.C9521a;
import com.bytedance.common.utility.collection.C6307b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.bytedance.android.live.broadcast.widget.d */
public final class C3103d extends LinearLayout {

    /* renamed from: l */
    private static int f9576l = -1;

    /* renamed from: a */
    public LiveMessageRecyclerView f9577a;

    /* renamed from: b */
    public boolean f9578b = true;

    /* renamed from: c */
    public C3108c f9579c;

    /* renamed from: d */
    public ArrayList<Integer> f9580d;

    /* renamed from: e */
    private TextView f9581e;

    /* renamed from: f */
    private TextView f9582f;

    /* renamed from: g */
    private ImageView f9583g;

    /* renamed from: h */
    private C3106a f9584h;

    /* renamed from: i */
    private List<C4343b> f9585i;

    /* renamed from: j */
    private C7321c f9586j;

    /* renamed from: k */
    private GameMsgLinearLayoutManager f9587k;

    /* renamed from: m */
    private C9521a f9588m;

    /* renamed from: n */
    private View f9589n;

    /* renamed from: com.bytedance.android.live.broadcast.widget.d$a */
    class C3106a extends C1262a<C3107b> {

        /* renamed from: a */
        public List<C4343b> f9594a;

        /* renamed from: c */
        private final LayoutInflater f9596c;

        public final int getItemCount() {
            if (this.f9594a == null) {
                return 0;
            }
            return this.f9594a.size();
        }

        C3106a() {
            this.f9596c = LayoutInflater.from(C3103d.this.getContext());
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo9923a(List<C4343b> list) {
            this.f9594a = list;
            try {
                notifyDataSetChanged();
            } catch (Exception unused) {
                C3103d.this.f9577a.getRecycledViewPool().mo5820a();
                notifyDataSetChanged();
            } catch (Throwable unused2) {
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onBindViewHolder(C3107b bVar, int i) {
            bVar.mo9924a((C4343b) this.f9594a.get(i));
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C3107b onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new C3107b(this.f9596c.inflate(R.layout.as2, viewGroup, false));
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.d$b */
    class C3107b extends C1293v {

        /* renamed from: a */
        TextView f9597a;

        /* renamed from: a */
        public final void mo9924a(C4343b bVar) {
            boolean z;
            boolean z2;
            boolean z3;
            if ((bVar.f12647a.getIntType() == MessageType.GIFT.getIntType() || bVar.f12647a.getIntType() == MessageType.DOODLE_GIFT.getIntType()) && !((Boolean) C8946b.f24409ah.mo22117a()).booleanValue()) {
                z = true;
            } else {
                z = false;
            }
            if (bVar.f12647a.getIntType() != MessageType.CHAT.getIntType() || ((Boolean) C8946b.f24408ag.mo22117a()).booleanValue()) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (bVar.f12647a.getIntType() != MessageType.MEMBER.getIntType() || ((Boolean) C8946b.f24410ai.mo22117a()).booleanValue()) {
                z3 = false;
            } else {
                z3 = true;
            }
            int intType = bVar.f12647a.getIntType();
            if (z || z2 || z3 || !C3103d.this.f9580d.contains(Integer.valueOf(intType)) || bVar.f12653g) {
                bVar.f12653g = true;
            } else {
                bVar.f12653g = false;
                Spannable o = bVar.mo12076o();
                if (o != null) {
                    this.f9597a.setVisibility(0);
                    C3103d.this.mo9915a(this.f9597a, o, bVar.f12647a);
                    return;
                }
            }
            this.f9597a.setVisibility(8);
        }

        C3107b(View view) {
            super(view);
            this.f9597a = (TextView) view.findViewById(R.id.text);
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.d$c */
    public interface C3108c {
        /* renamed from: a */
        void mo9060a(boolean z);
    }

    private int getLayoutId() {
        return R.layout.awk;
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        if (this.f9586j != null) {
            this.f9586j.dispose();
        }
        this.f9588m = null;
        super.onDetachedFromWindow();
    }

    /* renamed from: c */
    private void m11790c() {
        try {
            this.f9584h.notifyDataSetChanged();
            int size = this.f9584h.f9594a.size();
            if (size > 0) {
                this.f9577a.mo5561d(size);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public final void mo9914a() {
        m11787a(this.f9578b);
        if (this.f9578b) {
            this.f9583g.setImageResource(R.drawable.c59);
            this.f9577a.setVisibility(8);
            this.f9581e.setVisibility(0);
            m11791d();
            return;
        }
        this.f9583g.setImageResource(R.drawable.c58);
        this.f9577a.setVisibility(0);
        this.f9584h.mo9923a(this.f9585i);
        this.f9581e.setVisibility(4);
    }

    /* renamed from: b */
    private void m11789b() {
        inflate(getContext(), getLayoutId(), this);
        this.f9581e = (TextView) findViewById(R.id.dy4);
        this.f9582f = (TextView) findViewById(R.id.dyv);
        this.f9583g = (ImageView) findViewById(R.id.b61);
        this.f9589n = findViewById(R.id.a1a);
        this.f9577a = (LiveMessageRecyclerView) findViewById(R.id.bye);
        this.f9589n.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                C3103d.this.f9578b = !C3103d.this.f9578b;
                C3103d.this.mo9914a();
                if (C3103d.this.f9579c != null) {
                    C3103d.this.f9579c.mo9060a(C3103d.this.f9578b);
                }
            }
        });
        mo9914a();
        this.f9584h = new C3106a();
        this.f9587k = new GameMsgLinearLayoutManager(getContext(), 1, false);
        this.f9577a.setLayoutManager(this.f9587k);
        this.f9577a.setAdapter(this.f9584h);
        this.f9577a.setItemAnimator(null);
        this.f9580d = new ArrayList<>();
        this.f9580d.add(Integer.valueOf(MessageType.GIFT.getIntType()));
        this.f9580d.add(Integer.valueOf(MessageType.DOODLE_GIFT.getIntType()));
        this.f9580d.add(Integer.valueOf(MessageType.CHAT.getIntType()));
        this.f9580d.add(Integer.valueOf(MessageType.MEMBER.getIntType()));
        this.f9580d.add(Integer.valueOf(MessageType.SCREEN.getIntType()));
        m11786a(0);
        this.f9586j = C9056a.m27045a(1, TimeUnit.SECONDS).mo19144a(100).mo19152a(C47549a.m148327a()).mo19142a((C7326g<? super T>) new C3109e<Object>(this), C3110f.f9600a);
    }

    /* renamed from: d */
    private void m11791d() {
        if (this.f9588m != null) {
            List d = this.f9588m.mo13006d();
            this.f9585i.clear();
            this.f9585i.addAll(d);
            if (!C6307b.m19566a((Collection<T>) this.f9585i)) {
                boolean z = true;
                C4343b bVar = (C4343b) this.f9585i.get(d.size() - 1);
                if (bVar != null) {
                    boolean z2 = !((Boolean) C8946b.f24409ah.mo22117a()).booleanValue();
                    boolean z3 = !((Boolean) C8946b.f24408ag.mo22117a()).booleanValue();
                    boolean z4 = !((Boolean) C8946b.f24410ai.mo22117a()).booleanValue();
                    T t = bVar.f12647a;
                    if ((bVar.f12648b != 1 || (t instanceof C8514bj)) && this.f9580d.contains(Integer.valueOf(bVar.f12647a.getIntType()))) {
                        if (!(bVar.f12647a.getIntType() == MessageType.GIFT.getIntType() || bVar.f12647a.getIntType() == MessageType.DOODLE_GIFT.getIntType()) || !z2) {
                            z = false;
                        }
                        if (!z) {
                            if (bVar.f12647a.getIntType() == MessageType.CHAT.getIntType() && z3) {
                                return;
                            }
                            if (!(t instanceof C8514bj) || (((C8514bj) t).mo21658a() == 1 && !z4)) {
                                mo9915a(this.f9581e, bVar.mo12076o(), t);
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static void m11786a(int i) {
        f9576l = i;
    }

    public final void setOnViewClickListener(C3108c cVar) {
        this.f9579c = cVar;
    }

    public C3103d(Context context) {
        super(context);
        m11789b();
    }

    private void setMsgList(List<C4343b> list) {
        this.f9585i = new ArrayList(list);
        this.f9584h.mo9923a(this.f9585i);
    }

    public final void setPresenter(C9521a aVar) {
        this.f9588m = aVar;
        if (aVar != null) {
            setMsgList(aVar.mo13006d());
        }
    }

    /* renamed from: b */
    private static String m11788b(int i) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(C3385e.m12593c((long) i));
        stringBuffer.append("在线");
        return stringBuffer.toString();
    }

    /* renamed from: a */
    private void m11787a(boolean z) {
        C7843g gVar = (C7843g) C7849h.m24059b(IBroadcastService.TAG_MSG_VIEW);
        if (gVar != null && gVar.mo20554c()) {
            if (z) {
                gVar.f21170a.mo20559c((int) C9051ar.m27035b(getContext(), 280.0f), (int) C9051ar.m27035b(getContext(), 24.0f));
            } else {
                gVar.f21170a.mo20559c((int) C9051ar.m27035b(getContext(), 280.0f), (int) C9051ar.m27035b(getContext(), 220.0f));
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo9916a(Long l) throws Exception {
        if (f9576l >= 0) {
            this.f9582f.setText(m11788b(f9576l));
        }
        if (this.f9581e.getVisibility() == 0) {
            m11791d();
        }
        if (this.f9577a.getVisibility() == 0) {
            m11790c();
        }
    }

    /* renamed from: a */
    public final void mo9915a(final TextView textView, final Spannable spannable, C8538c cVar) {
        long j;
        if (cVar instanceof C8489ao) {
            j = ((C8489ao) cVar).f23254c;
        } else if (cVar instanceof C8487am) {
            j = ((C8487am) cVar).f23246b;
        } else {
            textView.setText(spannable);
            j = -1;
        }
        if (j > 0) {
            C8149d findGiftById = ((IGiftService) C3596c.m13172a(IGiftService.class)).findGiftById(j);
            if (findGiftById != null) {
                ((C9456c) C3596c.m13172a(C9456c.class)).mo23192a(findGiftById.f22231b, (C9459c) new C9459c() {
                    /* renamed from: a */
                    public final void mo9922a(C9457a aVar) {
                    }

                    /* renamed from: a */
                    public final void mo9921a(Bitmap bitmap) {
                        C4374z.m14747a(spannable, bitmap.copy(Config.ARGB_8888, true));
                        textView.setText(spannable);
                    }
                });
            }
        }
    }
}
