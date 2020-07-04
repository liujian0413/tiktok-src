package com.bytedance.android.livesdk.chatroom.p220ui;

import android.content.Context;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.Editable;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.bytedance.android.live.api.exceptions.server.ApiServerException;
import com.bytedance.android.live.base.model.user.C2378j;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.widget.FitTextView;
import com.bytedance.android.live.core.widget.LiveEditText;
import com.bytedance.android.livesdk.admin.p184b.C3890c;
import com.bytedance.android.livesdk.admin.p185c.C3892a;
import com.bytedance.android.livesdk.admin.p186d.C3897a;
import com.bytedance.android.livesdk.blockword.C3935a;
import com.bytedance.android.livesdk.blockword.C3935a.C3936a;
import com.bytedance.android.livesdk.blockword.p190a.C3944a;
import com.bytedance.android.livesdk.chatroom.p220ui.C5247cn.C5249b;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.C8448g;
import com.bytedance.android.livesdk.log.p405b.C8438j;
import com.bytedance.android.livesdk.p188b.C3917a;
import com.bytedance.android.livesdk.p188b.C3922f;
import com.bytedance.android.livesdk.p418r.C8793a;
import com.bytedance.android.livesdk.utils.C9049ap;
import com.bytedance.android.livesdk.utils.C9076n;
import com.bytedance.android.livesdk.utils.C9083u;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.p280ss.android.ugc.aweme.shortvideo.p1551c.C38566l;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;
import kotlin.text.C7634n;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.LiveProfileSettingView */
public final class LiveProfileSettingView extends FrameLayout implements OnClickListener, C3897a, C3922f, C3936a {

    /* renamed from: d */
    public static final C5137a f15019d = new C5137a(null);

    /* renamed from: a */
    public boolean f15020a;

    /* renamed from: b */
    public boolean f15021b;

    /* renamed from: c */
    public final C3935a f15022c = new C3935a();

    /* renamed from: e */
    private LengthFilter f15023e;

    /* renamed from: f */
    private final C3917a f15024f = new C3917a();

    /* renamed from: g */
    private final C3892a f15025g = new C3892a(this);

    /* renamed from: h */
    private C5249b f15026h;

    /* renamed from: i */
    private final TextWatcher f15027i = new C5142e(this);

    /* renamed from: j */
    private final OnEditorActionListener f15028j = new C5141d(this);

    /* renamed from: k */
    private final Room f15029k;

    /* renamed from: l */
    private final User f15030l;

    /* renamed from: m */
    private final boolean f15031m;

    /* renamed from: n */
    private final boolean f15032n;

    /* renamed from: o */
    private HashMap f15033o;

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.LiveProfileSettingView$BlockWordViewAdapter */
    public static final class BlockWordViewAdapter extends C1262a<ViewHolder> {

        /* renamed from: a */
        public final LayoutInflater f15034a = LayoutInflater.from(this.f15036c);

        /* renamed from: b */
        public C5135a f15035b;

        /* renamed from: c */
        public final Context f15036c;

        /* renamed from: d */
        public final List<C3944a> f15037d;

        /* renamed from: com.bytedance.android.livesdk.chatroom.ui.LiveProfileSettingView$BlockWordViewAdapter$ViewHolder */
        public static final class ViewHolder extends C1293v {

            /* renamed from: a */
            private final View f15038a;

            /* renamed from: com.bytedance.android.livesdk.chatroom.ui.LiveProfileSettingView$BlockWordViewAdapter$ViewHolder$a */
            static final class C5134a implements OnClickListener {

                /* renamed from: a */
                final /* synthetic */ C7562b f15039a;

                C5134a(C7562b bVar) {
                    this.f15039a = bVar;
                }

                public final void onClick(View view) {
                    C7562b bVar = this.f15039a;
                    C7573i.m23582a((Object) view, "v");
                    bVar.invoke(view);
                }
            }

            public ViewHolder(View view) {
                C7573i.m23587b(view, "blockView");
                super(view);
                this.f15038a = view;
            }

            /* renamed from: a */
            public final void mo13362a(C3944a aVar) {
                C7573i.m23587b(aVar, "word");
                TextView textView = (TextView) this.f15038a.findViewById(R.id.mz);
                C7573i.m23582a((Object) textView, "blockView.block_word_content");
                textView.setText(aVar.f11785b);
            }

            /* renamed from: a */
            public final void mo13363a(C7562b<? super View, C7581n> bVar) {
                C7573i.m23587b(bVar, C38566l.f100205a);
                ((LinearLayout) this.f15038a.findViewById(R.id.n0)).setOnClickListener(new C5134a(bVar));
            }
        }

        /* renamed from: com.bytedance.android.livesdk.chatroom.ui.LiveProfileSettingView$BlockWordViewAdapter$a */
        public interface C5135a {
            /* renamed from: a */
            void mo13365a(C3944a aVar, int i);
        }

        /* renamed from: com.bytedance.android.livesdk.chatroom.ui.LiveProfileSettingView$BlockWordViewAdapter$b */
        static final class C5136b extends Lambda implements C7562b<View, C7581n> {

            /* renamed from: a */
            final /* synthetic */ BlockWordViewAdapter f15040a;

            /* renamed from: b */
            final /* synthetic */ C3944a f15041b;

            C5136b(BlockWordViewAdapter blockWordViewAdapter, C3944a aVar) {
                this.f15040a = blockWordViewAdapter;
                this.f15041b = aVar;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                m16666a((View) obj);
                return C7581n.f20898a;
            }

            /* renamed from: a */
            private void m16666a(View view) {
                C7573i.m23587b(view, "it");
                int indexOf = this.f15040a.f15037d.indexOf(this.f15041b);
                if (indexOf != -1 && indexOf < this.f15040a.f15037d.size()) {
                    C5135a aVar = this.f15040a.f15035b;
                    if (aVar != null) {
                        aVar.mo13365a(this.f15041b, indexOf);
                    }
                }
            }
        }

        public final int getItemCount() {
            return this.f15037d.size();
        }

        public BlockWordViewAdapter(Context context, List<C3944a> list) {
            C7573i.m23587b(context, "context");
            C7573i.m23587b(list, "blockwords");
            this.f15036c = context;
            this.f15037d = list;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            C7573i.m23587b(viewGroup, "parent");
            View inflate = this.f15034a.inflate(R.layout.ari, viewGroup, false);
            C7573i.m23582a((Object) inflate, "view");
            return new ViewHolder(inflate);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onBindViewHolder(ViewHolder viewHolder, int i) {
            C7573i.m23587b(viewHolder, "holder");
            C3944a aVar = (C3944a) this.f15037d.get(i);
            viewHolder.mo13362a(aVar);
            viewHolder.mo13363a((C7562b<? super View, C7581n>) new C5136b<Object,C7581n>(this, aVar));
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.LiveProfileSettingView$a */
    public static final class C5137a {
        private C5137a() {
        }

        public /* synthetic */ C5137a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.LiveProfileSettingView$b */
    static final class C5138b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ LiveProfileSettingView f15042a;

        C5138b(LiveProfileSettingView liveProfileSettingView) {
            this.f15042a = liveProfileSettingView;
        }

        public final void onClick(View view) {
            ((LiveEditText) this.f15042a.mo13351a((int) R.id.n2)).postDelayed(new Runnable(this) {

                /* renamed from: a */
                final /* synthetic */ C5138b f15043a;

                {
                    this.f15043a = r1;
                }

                public final void run() {
                    this.f15043a.f15042a.mo13354a((LiveEditText) this.f15043a.f15042a.mo13351a((int) R.id.n2), 200, 1, 5);
                    ((LiveEditText) this.f15043a.f15042a.mo13351a((int) R.id.n2)).requestFocus();
                    C9083u.m27120a(this.f15043a.f15042a.getContext(), (LiveEditText) this.f15043a.f15042a.mo13351a((int) R.id.n2));
                }
            }, 100);
            C8443c.m25663a().mo21606a("livesdk_stopword_set", this.f15042a.getCommonLogPara(), new Object[0]);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.LiveProfileSettingView$c */
    public static final class C5140c implements C5135a {

        /* renamed from: a */
        final /* synthetic */ LiveProfileSettingView f15044a;

        C5140c(LiveProfileSettingView liveProfileSettingView) {
            this.f15044a = liveProfileSettingView;
        }

        /* renamed from: a */
        public final void mo13365a(C3944a aVar, int i) {
            C7573i.m23587b(aVar, "blockword");
            this.f15044a.f15022c.mo11492a(aVar, Integer.valueOf(i));
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.LiveProfileSettingView$d */
    static final class C5141d implements OnEditorActionListener {

        /* renamed from: a */
        final /* synthetic */ LiveProfileSettingView f15045a;

        C5141d(LiveProfileSettingView liveProfileSettingView) {
            this.f15045a = liveProfileSettingView;
        }

        public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            boolean z;
            if (i == 4) {
                C7573i.m23582a((Object) textView, "v");
                if (!C5256cr.m16900a(textView.getContext())) {
                    C9049ap.m27022a((int) R.string.efp);
                }
                CharSequence obj = textView.getText().toString();
                if (obj.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z || C7634n.m23713a(obj)) {
                    C9049ap.m27022a((int) R.string.cwf);
                } else {
                    String obj2 = textView.getText().toString();
                    if (obj2 != null) {
                        this.f15045a.f15022c.mo11491a(new C3944a(-1, C7634n.m23762b(obj2).toString()));
                        textView.setText("");
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
                    }
                }
            }
            return false;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.LiveProfileSettingView$e */
    public static final class C5142e implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ LiveProfileSettingView f15046a;

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C7573i.m23587b(charSequence, "s");
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C7573i.m23587b(charSequence, "s");
        }

        C5142e(LiveProfileSettingView liveProfileSettingView) {
            this.f15046a = liveProfileSettingView;
        }

        public final void afterTextChanged(Editable editable) {
            C7573i.m23587b(editable, "s");
            LiveEditText liveEditText = (LiveEditText) this.f15046a.mo13351a((int) R.id.n2);
            C7573i.m23582a((Object) liveEditText, "block_word_edit_text");
            String valueOf = String.valueOf(liveEditText.getText());
            if (TextUtils.isEmpty(valueOf)) {
                FitTextView fitTextView = (FitTextView) this.f15046a.mo13351a((int) R.id.n3);
                C7573i.m23582a((Object) fitTextView, "block_word_edit_text_hint");
                fitTextView.setVisibility(0);
            } else {
                FitTextView fitTextView2 = (FitTextView) this.f15046a.mo13351a((int) R.id.n3);
                C7573i.m23582a((Object) fitTextView2, "block_word_edit_text_hint");
                fitTextView2.setVisibility(8);
            }
            int length = valueOf.length();
            if (length > 10) {
                LiveProfileSettingView liveProfileSettingView = this.f15046a;
                LiveEditText liveEditText2 = (LiveEditText) this.f15046a.mo13351a((int) R.id.n2);
                C7573i.m23582a((Object) liveEditText2, "block_word_edit_text");
                liveProfileSettingView.mo13353a((EditText) liveEditText2, length);
                if (valueOf != null) {
                    String substring = valueOf.substring(0, 10);
                    C7573i.m23582a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    ((LiveEditText) this.f15046a.mo13351a((int) R.id.n2)).setText(substring);
                    ((LiveEditText) this.f15046a.mo13351a((int) R.id.n2)).setSelection(substring.length());
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            LiveProfileSettingView liveProfileSettingView2 = this.f15046a;
            LiveEditText liveEditText3 = (LiveEditText) this.f15046a.mo13351a((int) R.id.n2);
            C7573i.m23582a((Object) liveEditText3, "block_word_edit_text");
            liveProfileSettingView2.mo13352a((EditText) liveEditText3);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.LiveProfileSettingView$f */
    static final class C5143f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ LiveProfileSettingView f15047a;

        /* renamed from: b */
        final /* synthetic */ EditText f15048b;

        /* renamed from: c */
        final /* synthetic */ long f15049c;

        /* renamed from: d */
        final /* synthetic */ int f15050d;

        /* renamed from: e */
        final /* synthetic */ int f15051e;

        C5143f(LiveProfileSettingView liveProfileSettingView, EditText editText, long j, int i, int i2) {
            this.f15047a = liveProfileSettingView;
            this.f15048b = editText;
            this.f15049c = j;
            this.f15050d = i;
            this.f15051e = i2;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void run() {
            if (this.f15047a.f15021b && !this.f15047a.f15020a) {
                C9083u.m27120a(this.f15047a.getContext(), this.f15048b);
                this.f15047a.mo13354a(this.f15048b, this.f15049c, this.f15050d + 1, this.f15051e);
            }
        }
    }

    /* renamed from: a */
    public final View mo13351a(int i) {
        if (this.f15033o == null) {
            this.f15033o = new HashMap();
        }
        View view = (View) this.f15033o.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f15033o.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final void mo11433a(C3890c cVar, Exception exc) {
        C7573i.m23587b(cVar, "userBean");
        C7573i.m23587b(exc, "exception");
    }

    /* renamed from: b */
    public final void mo11497b(Throwable th) {
        C7573i.m23587b(th, "throwable");
    }

    /* renamed from: c */
    public final void mo11498c(Throwable th) {
        C7573i.m23587b(th, "throwable");
    }

    public final C5249b getClickCallback() {
        return this.f15026h;
    }

    /* renamed from: a */
    public final void mo11472a(boolean z) {
        if (this.f15021b) {
            User user = this.f15030l;
            if (user == null) {
                C7573i.m23580a();
            }
            if (user.getUserAttr() == null) {
                this.f15030l.setUserAttr(new C2378j());
            }
            C2378j userAttr = this.f15030l.getUserAttr();
            C7573i.m23582a((Object) userAttr, "mUser.userAttr");
            userAttr.f7829a = z;
            ((TextView) mo13351a((int) R.id.c2b)).setText(z ? R.string.ezy : R.string.f01);
        }
    }

    /* renamed from: a */
    public final void mo11434a(boolean z, User user) {
        C7573i.m23587b(user, "user");
        if (this.f15021b) {
            User user2 = this.f15030l;
            if (user2 == null) {
                C7573i.m23580a();
            }
            if (user2.getUserAttr() == null) {
                this.f15030l.setUserAttr(new C2378j());
            }
            C2378j userAttr = this.f15030l.getUserAttr();
            C7573i.m23582a((Object) userAttr, "mUser.userAttr");
            userAttr.f7830b = z;
            ((TextView) mo13351a((int) R.id.bws)).setText(z ? R.string.ezw : R.string.f03);
            C9049ap.m27022a(z ? R.string.f04 : R.string.ezx);
        }
    }

    /* renamed from: a */
    public final void mo11435a(boolean z, Exception exc) {
        C7573i.m23587b(exc, "exception");
        if (this.f15021b) {
            C9076n.m27096a(getContext(), (Throwable) exc, (int) R.string.ezj);
        }
    }

    /* renamed from: a */
    public final void mo11495a(List<C3944a> list) {
        C7573i.m23587b(list, "words");
        RecyclerView recyclerView = (RecyclerView) mo13351a((int) R.id.n6);
        C7573i.m23582a((Object) recyclerView, "block_word_rv_view");
        C1262a adapter = recyclerView.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f15021b = true;
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        this.f15021b = false;
        this.f15024f.f11735a = null;
        super.onDetachedFromWindow();
    }

    public final Map<String, String> getCommonLogPara() {
        Map<String, String> hashMap = new HashMap<>();
        String str = "anchor_id";
        Room room = this.f15029k;
        if (room == null) {
            C7573i.m23580a();
        }
        hashMap.put(str, String.valueOf(room.getOwnerUserId()));
        String idStr = this.f15029k.getIdStr();
        C7573i.m23582a((Object) idStr, "mRoom.idStr");
        hashMap.put("room_id", idStr);
        return hashMap;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0144, code lost:
        if (r0.getId() == r10.f15030l.getId()) goto L_0x01c5;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m16644a() {
        /*
            r10 = this;
            android.content.Context r0 = r10.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            r1 = r10
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r2 = 1
            r3 = 2131494819(0x7f0c07a3, float:1.8613157E38)
            r0.inflate(r3, r1, r2)
            r0 = 2131296768(0x7f090200, float:1.8211462E38)
            android.view.View r0 = r10.mo13351a(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            java.lang.String r1 = "block_word_red_dot"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            com.bytedance.android.livesdk.sharedpref.c<java.lang.Boolean> r1 = com.bytedance.android.livesdk.sharedpref.C8946b.f24442bN
            java.lang.String r3 = "BLOCK_WORD_PANNEL_TIPS_SHOW"
            kotlin.jvm.internal.C7573i.m23582a(r1, r3)
            java.lang.Object r1 = r1.mo22117a()
            java.lang.String r3 = "BLOCK_WORD_PANNEL_TIPS_SHOW.value"
            kotlin.jvm.internal.C7573i.m23582a(r1, r3)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r3 = 8
            r4 = 0
            if (r1 == 0) goto L_0x003d
            r1 = 0
            goto L_0x003f
        L_0x003d:
            r1 = 8
        L_0x003f:
            r0.setVisibility(r1)
            com.bytedance.android.livesdk.sharedpref.c<java.lang.Boolean> r0 = com.bytedance.android.livesdk.sharedpref.C8946b.f24442bN
            java.lang.String r1 = "BLOCK_WORD_PANNEL_TIPS_SHOW"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)
            r0.mo22118a(r1)
            android.support.v7.widget.LinearLayoutManager r0 = new android.support.v7.widget.LinearLayoutManager
            android.content.Context r1 = r10.getContext()
            r0.<init>(r1, r4, r4)
            r1 = 2131296760(0x7f0901f8, float:1.8211446E38)
            android.view.View r1 = r10.mo13351a(r1)
            com.bytedance.android.livesdk.chatroom.ui.LiveProfileSettingView$b r5 = new com.bytedance.android.livesdk.chatroom.ui.LiveProfileSettingView$b
            r5.<init>(r10)
            android.view.View$OnClickListener r5 = (android.view.View.OnClickListener) r5
            r1.setOnClickListener(r5)
            r1 = 2131296765(0x7f0901fd, float:1.8211456E38)
            android.view.View r5 = r10.mo13351a(r1)
            com.bytedance.android.live.core.widget.LiveEditText r5 = (com.bytedance.android.live.core.widget.LiveEditText) r5
            android.text.TextWatcher r6 = r10.f15027i
            r5.addTextChangedListener(r6)
            android.view.View r1 = r10.mo13351a(r1)
            com.bytedance.android.live.core.widget.LiveEditText r1 = (com.bytedance.android.live.core.widget.LiveEditText) r1
            android.widget.TextView$OnEditorActionListener r5 = r10.f15028j
            r1.setOnEditorActionListener(r5)
            r1 = 2131296766(0x7f0901fe, float:1.8211458E38)
            android.view.View r1 = r10.mo13351a(r1)
            com.bytedance.android.live.core.widget.FitTextView r1 = (com.bytedance.android.live.core.widget.FitTextView) r1
            java.lang.String r5 = "block_word_edit_text_hint"
            kotlin.jvm.internal.C7573i.m23582a(r1, r5)
            android.content.Context r5 = r10.getContext()
            r6 = 2131825512(0x7f111368, float:1.9283882E38)
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r7 = 10
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r2[r4] = r7
            java.lang.String r2 = r5.getString(r6, r2)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r1.setText(r2)
            r1 = 2131296769(0x7f090201, float:1.8211464E38)
            android.view.View r2 = r10.mo13351a(r1)
            android.support.v7.widget.RecyclerView r2 = (android.support.p029v7.widget.RecyclerView) r2
            java.lang.String r5 = "block_word_rv_view"
            kotlin.jvm.internal.C7573i.m23582a(r2, r5)
            android.support.v7.widget.RecyclerView$i r0 = (android.support.p029v7.widget.RecyclerView.C1273i) r0
            r2.setLayoutManager(r0)
            com.bytedance.android.livesdk.chatroom.ui.LiveProfileSettingView$BlockWordViewAdapter r0 = new com.bytedance.android.livesdk.chatroom.ui.LiveProfileSettingView$BlockWordViewAdapter
            android.content.Context r2 = r10.getContext()
            java.lang.String r5 = "context"
            kotlin.jvm.internal.C7573i.m23582a(r2, r5)
            com.bytedance.android.livesdk.blockword.a r5 = r10.f15022c
            java.util.List<com.bytedance.android.livesdk.blockword.a.a> r5 = r5.f11773b
            r0.<init>(r2, r5)
            com.bytedance.android.livesdk.chatroom.ui.LiveProfileSettingView$c r2 = new com.bytedance.android.livesdk.chatroom.ui.LiveProfileSettingView$c
            r2.<init>(r10)
            com.bytedance.android.livesdk.chatroom.ui.LiveProfileSettingView$BlockWordViewAdapter$a r2 = (com.bytedance.android.livesdk.chatroom.p220ui.LiveProfileSettingView.BlockWordViewAdapter.C5135a) r2
            r0.f15035b = r2
            android.view.View r1 = r10.mo13351a(r1)
            android.support.v7.widget.RecyclerView r1 = (android.support.p029v7.widget.RecyclerView) r1
            java.lang.String r2 = "block_word_rv_view"
            kotlin.jvm.internal.C7573i.m23582a(r1, r2)
            android.support.v7.widget.RecyclerView$a r0 = (android.support.p029v7.widget.RecyclerView.C1262a) r0
            r1.setAdapter(r0)
            android.content.Context r0 = r10.getContext()
            boolean r0 = com.bytedance.android.live.uikit.p176d.C3519c.m12965a(r0)
            if (r0 == 0) goto L_0x0113
            r0 = 2131296771(0x7f090203, float:1.8211468E38)
            android.view.View r0 = r10.mo13351a(r0)
            java.lang.String r1 = "block_word_rv_view_slider_start"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            r1 = 1127481344(0x43340000, float:180.0)
            r0.setRotationY(r1)
            r0 = 2131296770(0x7f090202, float:1.8211466E38)
            android.view.View r0 = r10.mo13351a(r0)
            java.lang.String r2 = "block_word_rv_view_slider_end"
            kotlin.jvm.internal.C7573i.m23582a(r0, r2)
            r0.setRotationY(r1)
        L_0x0113:
            r0 = 2131296974(0x7f0902ce, float:1.821188E38)
            android.view.View r0 = r10.mo13351a(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = r10
            android.view.View$OnClickListener r1 = (android.view.View.OnClickListener) r1
            r0.setOnClickListener(r1)
            boolean r0 = r10.f15031m
            r2 = 3
            r5 = 2131296295(0x7f090027, float:1.8210503E38)
            if (r0 != 0) goto L_0x01c5
            com.bytedance.android.live.base.model.user.User r0 = r10.f15030l
            if (r0 == 0) goto L_0x01c5
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r10.f15029k
            if (r0 == 0) goto L_0x0148
            com.bytedance.android.live.base.model.user.User r0 = r0.getOwner()
            if (r0 == 0) goto L_0x0148
            long r6 = r0.getId()
            com.bytedance.android.live.base.model.user.User r0 = r10.f15030l
            long r8 = r0.getId()
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x0148
            goto L_0x01c5
        L_0x0148:
            r0 = 2131296761(0x7f0901f9, float:1.8211448E38)
            android.view.View r0 = r10.mo13351a(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            java.lang.String r6 = "block_word_container"
            kotlin.jvm.internal.C7573i.m23582a(r0, r6)
            r0.setVisibility(r3)
            android.view.View r0 = r10.mo13351a(r5)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r0.removeViews(r4, r2)
            r0 = 2131299862(0x7f090e16, float:1.8217737E38)
            android.view.View r2 = r10.mo13351a(r0)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r2.setOnClickListener(r1)
            r2 = 2131299230(0x7f090b9e, float:1.8216456E38)
            android.view.View r2 = r10.mo13351a(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r2.setOnClickListener(r1)
            r2 = 2131300067(0x7f090ee3, float:1.8218153E38)
            android.view.View r4 = r10.mo13351a(r2)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r4.setOnClickListener(r1)
            com.bytedance.android.live.base.model.user.User r1 = r10.f15030l
            com.bytedance.android.live.base.model.user.j r1 = r1.getUserAttr()
            if (r1 == 0) goto L_0x01b6
            android.view.View r4 = r10.mo13351a(r0)
            android.widget.TextView r4 = (android.widget.TextView) r4
            boolean r5 = r1.f7830b
            if (r5 == 0) goto L_0x019c
            r5 = 2131828415(0x7f111ebf, float:1.928977E38)
            goto L_0x019f
        L_0x019c:
            r5 = 2131828422(0x7f111ec6, float:1.9289784E38)
        L_0x019f:
            r4.setText(r5)
            android.view.View r2 = r10.mo13351a(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            boolean r1 = r1.f7829a
            if (r1 == 0) goto L_0x01b0
            r1 = 2131828417(0x7f111ec1, float:1.9289774E38)
            goto L_0x01b3
        L_0x01b0:
            r1 = 2131828420(0x7f111ec4, float:1.928978E38)
        L_0x01b3:
            r2.setText(r1)
        L_0x01b6:
            android.view.View r0 = r10.mo13351a(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.String r1 = "manager"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            r0.setVisibility(r3)
            return
        L_0x01c5:
            android.view.View r0 = r10.mo13351a(r5)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r0.removeViews(r2, r3)
            r0 = 2131299864(0x7f090e18, float:1.8217741E38)
            android.view.View r2 = r10.mo13351a(r0)
            android.widget.RelativeLayout r2 = (android.widget.RelativeLayout) r2
            r2.setOnClickListener(r1)
            r2 = 2131300068(0x7f090ee4, float:1.8218155E38)
            android.view.View r2 = r10.mo13351a(r2)
            android.widget.RelativeLayout r2 = (android.widget.RelativeLayout) r2
            r2.setOnClickListener(r1)
            r2 = 2131299231(0x7f090b9f, float:1.8216458E38)
            android.view.View r2 = r10.mo13351a(r2)
            android.widget.RelativeLayout r2 = (android.widget.RelativeLayout) r2
            r2.setOnClickListener(r1)
            android.view.View r0 = r10.mo13351a(r0)
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            java.lang.String r1 = "manager_list"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            r0.setVisibility(r3)
            com.bytedance.android.livesdk.blockword.a r0 = r10.f15022c
            r0.mo11489a()
            com.bytedance.android.livesdk.log.c r0 = com.bytedance.android.livesdk.log.C8443c.m25663a()
            java.lang.String r1 = "livesdk_anchor_set_page_show"
            java.util.Map r2 = r10.getCommonLogPara()
            java.lang.Object[] r3 = new java.lang.Object[r4]
            r0.mo21606a(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.p220ui.LiveProfileSettingView.m16644a():void");
    }

    public final void setClickCallback(C5249b bVar) {
        this.f15026h = bVar;
    }

    /* renamed from: a */
    public final void mo13352a(EditText editText) {
        if (this.f15023e != null) {
            editText.setFilters(new InputFilter[0]);
            this.f15023e = null;
        }
    }

    /* renamed from: b */
    public final void mo13355b(boolean z) {
        this.f15020a = z;
        if (this.f15020a) {
            LinearLayout linearLayout = (LinearLayout) mo13351a((int) R.id.ac);
            C7573i.m23582a((Object) linearLayout, "action_container");
            linearLayout.setVisibility(8);
            RelativeLayout relativeLayout = (RelativeLayout) mo13351a((int) R.id.n4);
            C7573i.m23582a((Object) relativeLayout, "block_word_input_area");
            relativeLayout.setVisibility(0);
            return;
        }
        LinearLayout linearLayout2 = (LinearLayout) mo13351a((int) R.id.ac);
        C7573i.m23582a((Object) linearLayout2, "action_container");
        linearLayout2.setVisibility(0);
        RelativeLayout relativeLayout2 = (RelativeLayout) mo13351a((int) R.id.n4);
        C7573i.m23582a((Object) relativeLayout2, "block_word_input_area");
        relativeLayout2.setVisibility(8);
    }

    public final void onClick(View view) {
        String str;
        long j;
        String str2;
        C7573i.m23587b(view, "v");
        int id = view.getId();
        boolean z = true;
        if (id == R.id.bws) {
            User user = this.f15030l;
            if (user == null) {
                C7573i.m23580a();
            }
            if (user.getUserAttr() != null) {
                C2378j userAttr = this.f15030l.getUserAttr();
                C7573i.m23582a((Object) userAttr, "mUser.userAttr");
                if (userAttr.f7830b) {
                    z = false;
                }
            }
            C3892a aVar = this.f15025g;
            long id2 = this.f15030l.getId();
            long j2 = 0;
            if (this.f15029k == null || this.f15029k.getOwner() == null) {
                j = 0;
            } else {
                User owner = this.f15029k.getOwner();
                C7573i.m23582a((Object) owner, "mRoom.owner");
                j = owner.getId();
            }
            Room room = this.f15029k;
            if (room != null) {
                j2 = room.getId();
            }
            aVar.mo11431a(z, id2, j, j2);
            Map commonLogPara = getCommonLogPara();
            commonLogPara.put("user_id", String.valueOf(this.f15030l.getId()));
            String str3 = "action_type";
            if (z) {
                str2 = "set";
            } else {
                str2 = "cancel";
            }
            commonLogPara.put(str3, str2);
            C8443c.m25663a().mo21606a("livesdk_admin_click", commonLogPara, new Object[0]);
        } else if (id == R.id.bfp) {
            C5249b bVar = this.f15026h;
            if (bVar != null) {
                bVar.mo13514a();
            }
            Context context = getContext();
            Room room2 = this.f15029k;
            if (room2 == null) {
                C7573i.m23580a();
            }
            long id3 = room2.getId();
            Room room3 = this.f15029k;
            if (room3 == null) {
                C7573i.m23580a();
            }
            long ownerUserId = room3.getOwnerUserId();
            User user2 = this.f15030l;
            if (user2 == null) {
                C7573i.m23580a();
            }
            C8793a aVar2 = new C8793a(context, id3, ownerUserId, user2.getId());
            aVar2.show();
            Map commonLogPara2 = getCommonLogPara();
            commonLogPara2.put("user_id", String.valueOf(this.f15030l.getId()));
            C8443c.m25663a().mo21606a("blacklist_click", commonLogPara2, new C8438j().mo21599b("relation").mo21603f("click").mo21598a("live_detail"));
        } else if (id == R.id.c2b) {
            User user3 = this.f15030l;
            if (user3 == null) {
                C7573i.m23580a();
            }
            if (user3.getUserAttr() != null) {
                C2378j userAttr2 = this.f15030l.getUserAttr();
                C7573i.m23582a((Object) userAttr2, "mUser.userAttr");
                if (userAttr2.f7829a) {
                    z = false;
                }
            }
            C3917a aVar3 = this.f15024f;
            Room room4 = this.f15029k;
            if (room4 == null) {
                C7573i.m23580a();
            }
            aVar3.mo11467a(z, room4.getId(), this.f15030l.getId());
            Map commonLogPara3 = getCommonLogPara();
            commonLogPara3.put("user_id", String.valueOf(this.f15030l.getId()));
            String str4 = "action_type";
            if (z) {
                str = "set";
            } else {
                str = "cancel";
            }
            commonLogPara3.put(str4, str);
            C8443c.m25663a().mo21606a("livesdk_mute_click", commonLogPara3, new Object[0]);
        } else if (id == R.id.bwu) {
            C5249b bVar2 = this.f15026h;
            if (bVar2 != null) {
                bVar2.mo13515a(0);
            }
            C8443c.m25663a().mo21606a("livesdk_anchor_admin_list_click", getCommonLogPara(), new Object[0]);
            C8448g.m25682a(getContext());
        } else if (id == R.id.c2c) {
            C5249b bVar3 = this.f15026h;
            if (bVar3 != null) {
                bVar3.mo13515a(1);
            }
            C8443c.m25663a().mo21606a("livesdk_anchor_mute_list_click", getCommonLogPara(), new Object[0]);
        } else if (id == R.id.bfq) {
            C5249b bVar4 = this.f15026h;
            if (bVar4 != null) {
                bVar4.mo13515a(2);
            }
            C8443c.m25663a().mo21606a("livesdk_anchor_blacklist_click", getCommonLogPara(), new Object[0]);
        } else {
            if (id == R.id.sp) {
                C5249b bVar5 = this.f15026h;
                if (bVar5 != null) {
                    bVar5.mo13514a();
                }
                C8448g.m25682a(getContext());
            }
        }
    }

    /* renamed from: a */
    public final void mo11494a(Throwable th) {
        String str;
        C7573i.m23587b(th, "throwable");
        if (th instanceof ApiServerException) {
            ApiServerException apiServerException = (ApiServerException) th;
            switch (apiServerException.getErrorCode()) {
                case 80070:
                    str = "limited";
                    break;
                case 80071:
                    str = "illegal";
                    break;
                case 80072:
                    str = "lengthy";
                    break;
                case 80073:
                    str = "existed";
                    break;
                default:
                    C9049ap.m27022a((int) R.string.f7z);
                    return;
            }
            C9049ap.m27028a(apiServerException.getPrompt());
            Map commonLogPara = getCommonLogPara();
            commonLogPara.put("toast_type", str);
            C8443c.m25663a().mo21606a("livesdk_stopword_set_toast", commonLogPara, new Object[0]);
        }
    }

    /* renamed from: a */
    public final void mo13353a(EditText editText, int i) {
        this.f15023e = new LengthFilter(i);
        editText.setFilters((InputFilter[]) new LengthFilter[]{this.f15023e});
    }

    /* renamed from: b */
    public final void mo11473b(boolean z, Exception exc) {
        C7573i.m23587b(exc, "e");
        if (this.f15021b) {
            C9076n.m27096a(getContext(), (Throwable) exc, (int) R.string.ezj);
        }
    }

    /* renamed from: b */
    public final void mo11496b(C3944a aVar, int i) {
        C7573i.m23587b(aVar, "word");
        if (i != -1) {
            RecyclerView recyclerView = (RecyclerView) mo13351a((int) R.id.n6);
            C7573i.m23582a((Object) recyclerView, "block_word_rv_view");
            C1262a adapter = recyclerView.getAdapter();
            if (adapter != null) {
                adapter.notifyItemRemoved(i);
            }
        } else {
            RecyclerView recyclerView2 = (RecyclerView) mo13351a((int) R.id.n6);
            C7573i.m23582a((Object) recyclerView2, "block_word_rv_view");
            C1262a adapter2 = recyclerView2.getAdapter();
            if (adapter2 != null) {
                adapter2.notifyDataSetChanged();
            }
        }
        Map commonLogPara = getCommonLogPara();
        commonLogPara.put("context", aVar.f11785b);
        C8443c.m25663a().mo21606a("livesdk_stopword_cancel", commonLogPara, new Object[0]);
    }

    /* renamed from: a */
    public final void mo11493a(C3944a aVar, int i) {
        C7573i.m23587b(aVar, "word");
        RecyclerView recyclerView = (RecyclerView) mo13351a((int) R.id.n6);
        C7573i.m23582a((Object) recyclerView, "block_word_rv_view");
        C1262a adapter = recyclerView.getAdapter();
        if (adapter != null) {
            adapter.notifyItemInserted(0);
            ((RecyclerView) mo13351a((int) R.id.n6)).mo5561d(0);
        }
        Map commonLogPara = getCommonLogPara();
        commonLogPara.put("context", aVar.f11785b);
        C8443c.m25663a().mo21606a("livesdk_stopword_set_success", commonLogPara, new Object[0]);
    }

    /* renamed from: a */
    public final void mo13354a(EditText editText, long j, int i, int i2) {
        if (editText != null && i <= i2) {
            C5143f fVar = new C5143f(this, editText, j, i, i2);
            editText.postDelayed(fVar, j);
        }
    }

    public LiveProfileSettingView(Context context, Room room, User user, boolean z, boolean z2) {
        C7573i.m23587b(context, "context");
        super(context);
        this.f15029k = room;
        this.f15030l = user;
        this.f15031m = z;
        this.f15032n = z2;
        this.f15022c.mo11490a((C3936a) this);
        m16644a();
    }
}
