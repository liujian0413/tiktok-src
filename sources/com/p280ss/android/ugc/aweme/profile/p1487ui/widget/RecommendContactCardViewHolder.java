package com.p280ss.android.ugc.aweme.profile.p1487ui.widget;

import android.app.Activity;
import android.content.Context;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.base.p308ui.AvatarImageWithVerify;
import com.p280ss.android.ugc.aweme.friends.model.RecommendContact;
import com.p280ss.android.ugc.aweme.friends.p1284d.C30050a;
import com.p280ss.android.ugc.aweme.setting.C7213d;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.RecommendContactCardViewHolder */
public final class RecommendContactCardViewHolder extends C1293v {

    /* renamed from: a */
    public final Context f96144a;

    /* renamed from: b */
    public C7563m<? super RecommendContact, ? super Integer, C7581n> f96145b;

    /* renamed from: c */
    public final int f96146c;

    /* renamed from: d */
    private final AvatarImageWithVerify f96147d;

    /* renamed from: e */
    private final DmtTextView f96148e;

    /* renamed from: f */
    private final DmtTextView f96149f;

    /* renamed from: g */
    private final TextView f96150g;

    /* renamed from: h */
    private final ImageView f96151h;

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.RecommendContactCardViewHolder$a */
    static final class C36623a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ RecommendContactCardViewHolder f96152a;

        /* renamed from: b */
        final /* synthetic */ RecommendContact f96153b;

        /* renamed from: c */
        final /* synthetic */ int f96154c;

        C36623a(RecommendContactCardViewHolder recommendContactCardViewHolder, RecommendContact recommendContact, int i) {
            this.f96152a = recommendContactCardViewHolder;
            this.f96153b = recommendContact;
            this.f96154c = i;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C7563m<? super RecommendContact, ? super Integer, C7581n> mVar = this.f96152a.f96145b;
            if (mVar != null) {
                mVar.invoke(this.f96153b, Integer.valueOf(this.f96154c));
            }
            this.f96152a.mo92940a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.RecommendContactCardViewHolder$b */
    static final class C36624b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ RecommendContactCardViewHolder f96155a;

        /* renamed from: b */
        final /* synthetic */ RecommendContact f96156b;

        /* renamed from: c */
        final /* synthetic */ int f96157c;

        C36624b(RecommendContactCardViewHolder recommendContactCardViewHolder, RecommendContact recommendContact, int i) {
            this.f96155a = recommendContactCardViewHolder;
            this.f96156b = recommendContact;
            this.f96157c = i;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            Context context = this.f96155a.f96144a;
            if (context != null) {
                C30050a.m98519a((Activity) context, (C7562b<? super Boolean, C7581n>) new C7562b<Boolean, C7581n>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C36624b f96158a;

                    {
                        this.f96158a = r1;
                    }

                    public final /* synthetic */ Object invoke(Object obj) {
                        m118177a(((Boolean) obj).booleanValue());
                        return C7581n.f20898a;
                    }

                    /* renamed from: a */
                    private void m118177a(boolean z) {
                        if (z) {
                            C7563m<? super RecommendContact, ? super Integer, C7581n> mVar = this.f96158a.f96155a.f96145b;
                            if (mVar != null) {
                                mVar.invoke(this.f96158a.f96156b, Integer.valueOf(this.f96158a.f96157c));
                            }
                        }
                    }
                });
                C30050a.m98520a("click", this.f96155a.mo92940a());
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
        }
    }

    /* renamed from: a */
    public final String mo92940a() {
        String str = "";
        switch (this.f96146c) {
            case 0:
                return "others_homepage";
            case 1:
                return "homepage_follow";
            case 2:
                return "homepage_friends";
            default:
                return str;
        }
    }

    public RecommendContactCardViewHolder(View view, int i) {
        C7573i.m23587b(view, "itemView");
        super(view);
        this.f96146c = i;
        this.f96144a = view.getContext();
        View findViewById = view.findViewById(R.id.ic);
        C7573i.m23582a((Object) findViewById, "itemView.findViewById(R.id.avatar)");
        this.f96147d = (AvatarImageWithVerify) findViewById;
        View findViewById2 = view.findViewById(R.id.e9m);
        C7573i.m23582a((Object) findViewById2, "itemView.findViewById(R.id.user_name)");
        this.f96148e = (DmtTextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.cpb);
        C7573i.m23582a((Object) findViewById3, "itemView.findViewById(R.id.recommend_reason)");
        this.f96149f = (DmtTextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.anj);
        C7573i.m23582a((Object) findViewById4, "itemView.findViewById(R.id.follow)");
        this.f96150g = (TextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.x_);
        C7573i.m23582a((Object) findViewById5, "itemView.findViewById(R.id.close)");
        this.f96151h = (ImageView) findViewById5;
    }

    /* renamed from: a */
    public final void mo92941a(RecommendContact recommendContact, int i) {
        C7573i.m23587b(recommendContact, "contact");
        this.f96147d.setPlaceHolder(R.drawable.bg5);
        this.f96148e.setText(R.string.b6y);
        this.f96149f.setText(R.string.en);
        C7213d a = C7213d.m22500a();
        C7573i.m23582a((Object) a, "AbTestManager.getInstance()");
        if (a.mo18809i()) {
            this.f96151h.setImageResource(R.drawable.a1e);
            LayoutParams layoutParams = this.f96151h.getLayoutParams();
            layoutParams.width = (int) C9738o.m28708b(this.f96144a, -2.0f);
            layoutParams.height = (int) C9738o.m28708b(this.f96144a, -2.0f);
            this.f96151h.setLayoutParams(layoutParams);
        }
        this.f96151h.setOnClickListener(new C36623a(this, recommendContact, i));
        this.f96150g.setText(R.string.a_s);
        this.f96150g.setBackgroundResource(R.drawable.lv);
        TextView textView = this.f96150g;
        Context context = this.f96144a;
        C7573i.m23582a((Object) context, "mContext");
        textView.setTextColor(context.getResources().getColor(R.color.lt));
        this.f96150g.setOnClickListener(new C36624b(this, recommendContact, i));
    }
}
