package com.p280ss.android.ugc.aweme.p313im.sdk.detail.adapter;

import android.content.Context;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.common.C10774c;
import com.p280ss.android.ugc.aweme.p313im.sdk.BaseViewHolder;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.group.model.C30753a;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.group.model.IMMember;
import com.p280ss.android.ugc.aweme.p313im.sdk.detail.model.C31189a;
import com.p280ss.android.ugc.aweme.p313im.sdk.detail.model.C31190b;
import com.p280ss.android.ugc.aweme.p313im.sdk.detail.p1322a.C31180a;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6959c;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMContact;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMUser;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.adapter.MemberListAdapter */
public final class MemberListAdapter extends C1262a<BaseViewHolder<C30753a>> {

    /* renamed from: c */
    public static final C31186a f81808c = new C31186a(null);

    /* renamed from: a */
    public String f81809a;

    /* renamed from: b */
    public String f81810b;

    /* renamed from: d */
    private final ArrayList<C30753a> f81811d = new ArrayList<>();

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.adapter.MemberListAdapter$HorizontalAvatarViewHolder */
    public final class HorizontalAvatarViewHolder extends AvatarViewHolder {

        /* renamed from: d */
        final /* synthetic */ MemberListAdapter f81812d;

        /* renamed from: e */
        private TextView f81813e;

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.adapter.MemberListAdapter$HorizontalAvatarViewHolder$a */
        static final class C31185a implements OnClickListener {

            /* renamed from: a */
            final /* synthetic */ HorizontalAvatarViewHolder f81814a;

            C31185a(HorizontalAvatarViewHolder horizontalAvatarViewHolder) {
                this.f81814a = horizontalAvatarViewHolder;
            }

            public final void onClick(View view) {
                IMUser iMUser;
                ClickInstrumentation.onClick(view);
                IMMember iMMember = this.f81814a.f81803c;
                IMUser iMUser2 = null;
                if (iMMember != null) {
                    iMUser = iMMember.getUser();
                } else {
                    iMUser = null;
                }
                if (iMUser != null) {
                    View view2 = this.f81814a.itemView;
                    C7573i.m23582a((Object) view2, "itemView");
                    Context context = view2.getContext();
                    C7573i.m23582a((Object) context, "itemView.context");
                    IMMember iMMember2 = this.f81814a.f81803c;
                    if (iMMember2 != null) {
                        iMUser2 = iMMember2.getUser();
                    }
                    if (iMUser2 == null) {
                        C7573i.m23580a();
                    }
                    C6959c.m21652a(context, (IMContact) iMUser2, "group_setting");
                }
            }
        }

        /* renamed from: h */
        private final void m101649h() {
            this.itemView.setOnClickListener(new C31185a(this));
        }

        /* renamed from: b */
        public final void mo80310b() {
            super.mo80310b();
            View findViewById = this.itemView.findViewById(R.id.dxp);
            C7573i.m23582a((Object) findViewById, "itemView.findViewById(R.id.tv_member_detail)");
            this.f81813e = (TextView) findViewById;
            View view = this.itemView;
            C7573i.m23582a((Object) view, "itemView");
            View view2 = this.itemView;
            C7573i.m23582a((Object) view2, "itemView");
            view.setBackground(C10774c.m31449e(view2.getContext()));
        }

        /* renamed from: a */
        public final void mo80309a(C30753a aVar, int i) {
            boolean z;
            super.mo80309a(aVar, i);
            if (aVar instanceof IMMember) {
                IMMember iMMember = (IMMember) aVar;
                if (iMMember.getUser() != null) {
                    CharSequence charSequence = this.f81812d.f81809a;
                    if (charSequence == null || charSequence.length() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        C31180a aVar2 = C31180a.f81795a;
                        TextView textView = this.f81813e;
                        if (textView == null) {
                            C7573i.m23583a("mDetailView");
                        }
                        String str = this.f81812d.f81809a;
                        if (str == null) {
                            C7573i.m23580a();
                        }
                        aVar2.mo81657b(textView, iMMember, str);
                        TextView e = mo81663e();
                        String str2 = this.f81812d.f81809a;
                        if (str2 == null) {
                            C7573i.m23580a();
                        }
                        C31180a.m101626a(e, iMMember, str2);
                        m101649h();
                    }
                }
            }
        }

        public HorizontalAvatarViewHolder(MemberListAdapter memberListAdapter, ViewGroup viewGroup, int i) {
            C7573i.m23587b(viewGroup, "parent");
            this.f81812d = memberListAdapter;
            super(viewGroup, R.layout.a2c);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.adapter.MemberListAdapter$a */
    public static final class C31186a {
        private C31186a() {
        }

        public /* synthetic */ C31186a(C7571f fVar) {
            this();
        }
    }

    public final int getItemCount() {
        return this.f81811d.size();
    }

    /* renamed from: a */
    public final void mo81668a(List<? extends C30753a> list) {
        mo81669a(list, (String) null);
    }

    public MemberListAdapter(List<? extends C30753a> list) {
        boolean z;
        Collection collection = list;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            this.f81811d.addAll(collection);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onViewAttachedToWindow(BaseViewHolder<C30753a> baseViewHolder) {
        C7573i.m23587b(baseViewHolder, "holder");
        super.onViewAttachedToWindow(baseViewHolder);
        if (baseViewHolder instanceof AvatarViewHolder) {
            ((AvatarViewHolder) baseViewHolder).mo81664f();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void onViewDetachedFromWindow(BaseViewHolder<C30753a> baseViewHolder) {
        C7573i.m23587b(baseViewHolder, "holder");
        super.onViewDetachedFromWindow(baseViewHolder);
        if (baseViewHolder instanceof AvatarViewHolder) {
            ((AvatarViewHolder) baseViewHolder).mo81665g();
        }
    }

    public final int getItemViewType(int i) {
        C30753a aVar = (C30753a) this.f81811d.get(i);
        if (aVar instanceof C31190b) {
            return 1;
        }
        boolean z = false;
        if (aVar instanceof C31189a) {
            return 0;
        }
        CharSequence charSequence = this.f81809a;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        }
        if (!z) {
            return 3;
        }
        return 2;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onBindViewHolder(BaseViewHolder<C30753a> baseViewHolder, int i) {
        C7573i.m23587b(baseViewHolder, "holder");
        baseViewHolder.mo80309a(this.f81811d.get(i), i);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public BaseViewHolder<C30753a> onCreateViewHolder(ViewGroup viewGroup, int i) {
        C7573i.m23587b(viewGroup, "parent");
        if (i == 3) {
            return new HorizontalAvatarViewHolder<>(this, viewGroup, R.layout.a2c);
        }
        switch (i) {
            case 0:
                return new AddViewHolder<>(viewGroup, R.layout.wn, this.f81810b);
            case 1:
                return new RemoveViewHolder<>(viewGroup, R.layout.wn);
            default:
                return new AvatarViewHolder<>(viewGroup, R.layout.wo);
        }
    }

    /* renamed from: a */
    public final void mo81669a(List<? extends C30753a> list, String str) {
        if (list != null) {
            this.f81809a = str;
            this.f81811d.clear();
            this.f81811d.addAll(list);
            notifyDataSetChanged();
        }
    }
}
