package com.p280ss.android.ugc.aweme.p313im.sdk.relations.viewholder;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.os.Build.VERSION;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.common.C10774c;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.base.p308ui.AvatarImageView;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C48006q;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.viewholder.BaseSelectViewHolder */
public abstract class BaseSelectViewHolder<ITEM> extends C1293v {

    /* renamed from: a */
    private final int f83178a;

    /* renamed from: b */
    public C48006q<? super Integer, ? super Integer, ? super View, C7581n> f83179b;

    /* renamed from: c */
    public final View f83180c = this.itemView.findViewById(R.id.a1q);

    /* renamed from: d */
    public final AvatarImageView f83181d = ((AvatarImageView) this.itemView.findViewById(R.id.j2));

    /* renamed from: e */
    public final ImageView f83182e = ((ImageView) this.itemView.findViewById(R.id.e_q));

    /* renamed from: f */
    public final DmtTextView f83183f = ((DmtTextView) this.itemView.findViewById(R.id.c37));

    /* renamed from: g */
    public final DmtTextView f83184g = ((DmtTextView) this.itemView.findViewById(R.id.a83));

    /* renamed from: h */
    public final DmtTextView f83185h = ((DmtTextView) this.itemView.findViewById(R.id.b0n));

    /* renamed from: i */
    public final ImageView f83186i = ((ImageView) this.itemView.findViewById(R.id.vi));

    /* renamed from: j */
    private final int f83187j;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.viewholder.BaseSelectViewHolder$a */
    static final class C31801a implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ BaseSelectViewHolder f83191a;

        C31801a(BaseSelectViewHolder baseSelectViewHolder) {
            this.f83191a = baseSelectViewHolder;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (this.f83191a.f83186i != null) {
                C7573i.m23582a((Object) valueAnimator, "animation");
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (animatedValue != null) {
                    int intValue = ((Integer) animatedValue).intValue();
                    LayoutParams layoutParams = this.f83191a.f83186i.getLayoutParams();
                    if (layoutParams != null) {
                        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                        marginLayoutParams.setMargins(intValue, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                        if (VERSION.SDK_INT >= 17) {
                            marginLayoutParams.setMarginStart(intValue);
                        }
                        this.f83191a.f83186i.setLayoutParams(marginLayoutParams);
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.viewholder.BaseSelectViewHolder$b */
    static final class C31802b implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ BaseSelectViewHolder f83192a;

        C31802b(BaseSelectViewHolder baseSelectViewHolder) {
            this.f83192a = baseSelectViewHolder;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (this.f83192a.f83186i != null) {
                C7573i.m23582a((Object) valueAnimator, "animation");
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (animatedValue != null) {
                    int intValue = ((Integer) animatedValue).intValue();
                    LayoutParams layoutParams = this.f83192a.f83186i.getLayoutParams();
                    if (layoutParams != null) {
                        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                        marginLayoutParams.setMargins(intValue, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                        if (VERSION.SDK_INT >= 17) {
                            marginLayoutParams.setMarginStart(intValue);
                        }
                        this.f83192a.f83186i.setLayoutParams(marginLayoutParams);
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
            }
        }
    }

    /* renamed from: a */
    public abstract void mo81879a(ITEM item, ITEM item2, int i);

    /* renamed from: c */
    public final Animator mo82608c() {
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{this.f83187j, this.f83178a});
        ofInt.addUpdateListener(new C31802b(this));
        C7573i.m23582a((Object) ofInt, "showValueAnimator");
        return ofInt;
    }

    /* renamed from: d */
    public final Animator mo82609d() {
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{this.f83178a, this.f83187j});
        ofInt.addUpdateListener(new C31801a(this));
        C7573i.m23582a((Object) ofInt, "hideValueAnimator");
        return ofInt;
    }

    /* renamed from: e */
    public final void mo82610e() {
        ImageView imageView = this.f83186i;
        C7573i.m23582a((Object) imageView, "mCheckBox");
        LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams != null) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
            if (VERSION.SDK_INT >= 17) {
                marginLayoutParams.setMarginStart(this.f83178a);
            }
            marginLayoutParams.leftMargin = this.f83178a;
            ImageView imageView2 = this.f83186i;
            C7573i.m23582a((Object) imageView2, "mCheckBox");
            imageView2.setLayoutParams(marginLayoutParams);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    /* renamed from: f */
    public final void mo82611f() {
        ImageView imageView = this.f83186i;
        C7573i.m23582a((Object) imageView, "mCheckBox");
        LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams != null) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
            if (VERSION.SDK_INT >= 17) {
                marginLayoutParams.setMarginStart(this.f83187j);
            }
            marginLayoutParams.leftMargin = this.f83187j;
            ImageView imageView2 = this.f83186i;
            C7573i.m23582a((Object) imageView2, "mCheckBox");
            imageView2.setLayoutParams(marginLayoutParams);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    public BaseSelectViewHolder(View view) {
        C7573i.m23587b(view, "view");
        super(view);
        View view2 = this.itemView;
        C7573i.m23582a((Object) view2, "itemView");
        this.f83178a = (int) C9738o.m28708b(view2.getContext(), 16.0f);
        View view3 = this.itemView;
        C7573i.m23582a((Object) view3, "itemView");
        this.f83187j = (int) C9738o.m28708b(view3.getContext(), -24.0f);
        View view4 = this.f83180c;
        if (view4 != null) {
            View view5 = this.itemView;
            C7573i.m23582a((Object) view5, "itemView");
            view4.setBackground(C10774c.m31449e(view5.getContext()));
        }
        View view6 = this.f83180c;
        if (view6 != null) {
            view6.setOnClickListener(new OnClickListener(this) {

                /* renamed from: a */
                final /* synthetic */ BaseSelectViewHolder f83188a;

                {
                    this.f83188a = r1;
                }

                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    C48006q<? super Integer, ? super Integer, ? super View, C7581n> qVar = this.f83188a.f83179b;
                    if (qVar != null) {
                        Integer valueOf = Integer.valueOf(2);
                        Integer valueOf2 = Integer.valueOf(this.f83188a.getAdapterPosition());
                        C7573i.m23582a((Object) view, "it");
                        qVar.invoke(valueOf, valueOf2, view);
                    }
                }
            });
        }
        AvatarImageView avatarImageView = this.f83181d;
        if (avatarImageView != null) {
            avatarImageView.setOnClickListener(new OnClickListener(this) {

                /* renamed from: a */
                final /* synthetic */ BaseSelectViewHolder f83189a;

                {
                    this.f83189a = r1;
                }

                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    C48006q<? super Integer, ? super Integer, ? super View, C7581n> qVar = this.f83189a.f83179b;
                    if (qVar != null) {
                        Integer valueOf = Integer.valueOf(1);
                        Integer valueOf2 = Integer.valueOf(this.f83189a.getAdapterPosition());
                        C7573i.m23582a((Object) view, "it");
                        qVar.invoke(valueOf, valueOf2, view);
                    }
                }
            });
        }
        ImageView imageView = this.f83186i;
        if (imageView != null) {
            imageView.setOnClickListener(new OnClickListener(this) {

                /* renamed from: a */
                final /* synthetic */ BaseSelectViewHolder f83190a;

                {
                    this.f83190a = r1;
                }

                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    C48006q<? super Integer, ? super Integer, ? super View, C7581n> qVar = this.f83190a.f83179b;
                    if (qVar != null) {
                        Integer valueOf = Integer.valueOf(0);
                        Integer valueOf2 = Integer.valueOf(this.f83190a.getAdapterPosition());
                        C7573i.m23582a((Object) view, "it");
                        qVar.invoke(valueOf, valueOf2, view);
                    }
                }
            });
        }
    }
}
