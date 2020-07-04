package com.p280ss.android.ugc.aweme.friends.p1285ui;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.common.C10774c;
import com.p280ss.android.ugc.aweme.base.p308ui.AvatarImageWithVerify;
import com.p280ss.android.ugc.aweme.friends.model.RecommendContact;
import com.p280ss.android.ugc.aweme.friends.p1284d.C30050a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;

/* renamed from: com.ss.android.ugc.aweme.friends.ui.RecommendContactItemView */
public final class RecommendContactItemView extends RelativeLayout {

    /* renamed from: a */
    public final Context f79274a;

    /* renamed from: b */
    public C7563m<? super RecommendContact, ? super Integer, C7581n> f79275b;

    /* renamed from: c */
    private final View f79276c;

    /* renamed from: d */
    private final AvatarImageWithVerify f79277d;

    /* renamed from: e */
    private final FansFollowUserBtn f79278e;

    /* renamed from: f */
    private final ImageView f79279f;

    /* renamed from: g */
    private String f79280g;

    /* renamed from: com.ss.android.ugc.aweme.friends.ui.RecommendContactItemView$a */
    static final class C30128a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ RecommendContactItemView f79281a;

        /* renamed from: b */
        final /* synthetic */ RecommendContact f79282b;

        /* renamed from: c */
        final /* synthetic */ int f79283c;

        C30128a(RecommendContactItemView recommendContactItemView, RecommendContact recommendContact, int i) {
            this.f79281a = recommendContactItemView;
            this.f79282b = recommendContact;
            this.f79283c = i;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            Context context = this.f79281a.f79274a;
            if (context != null) {
                C30050a.m98519a((Activity) context, (C7562b<? super Boolean, C7581n>) new C7562b<Boolean, C7581n>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C30128a f79284a;

                    {
                        this.f79284a = r1;
                    }

                    public final /* synthetic */ Object invoke(Object obj) {
                        m98716a(((Boolean) obj).booleanValue());
                        return C7581n.f20898a;
                    }

                    /* renamed from: a */
                    private void m98716a(boolean z) {
                        if (z) {
                            C7563m<? super RecommendContact, ? super Integer, C7581n> mVar = this.f79284a.f79281a.f79275b;
                            if (mVar != null) {
                                mVar.invoke(this.f79284a.f79282b, Integer.valueOf(this.f79284a.f79283c));
                            }
                        }
                    }
                });
                C30050a.m98520a("click", this.f79281a.getEnterFrom());
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.ui.RecommendContactItemView$b */
    static final class C30130b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ RecommendContactItemView f79285a;

        /* renamed from: b */
        final /* synthetic */ RecommendContact f79286b;

        /* renamed from: c */
        final /* synthetic */ int f79287c;

        C30130b(RecommendContactItemView recommendContactItemView, RecommendContact recommendContact, int i) {
            this.f79285a = recommendContactItemView;
            this.f79286b = recommendContact;
            this.f79287c = i;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C7563m<? super RecommendContact, ? super Integer, C7581n> mVar = this.f79285a.f79275b;
            if (mVar != null) {
                mVar.invoke(this.f79286b, Integer.valueOf(this.f79287c));
            }
            this.f79285a.getEnterFrom();
        }
    }

    public RecommendContactItemView(Context context) {
        this(context, null, 0, 6, null);
    }

    public final String getEnterFrom() {
        return this.f79280g;
    }

    public final void setDislikeListener(C7563m<? super RecommendContact, ? super Integer, C7581n> mVar) {
        this.f79275b = mVar;
    }

    public final void setEnterFrom(String str) {
        this.f79280g = str;
    }

    /* renamed from: a */
    public final void mo76565a(RecommendContact recommendContact, int i) {
        C7573i.m23587b(recommendContact, "contact");
        this.f79277d.setPlaceHolder(R.drawable.bg6);
        FansFollowUserBtn fansFollowUserBtn = this.f79278e;
        String string = this.f79274a.getResources().getString(R.string.a_s);
        C7573i.m23582a((Object) string, "mContext.resources.getSt….string.common_check_btn)");
        fansFollowUserBtn.setText(string);
        this.f79278e.setOnClickListener(new C30128a(this, recommendContact, i));
        this.f79279f.setOnClickListener(new C30130b(this, recommendContact, i));
    }

    public RecommendContactItemView(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
        this.f79274a = context;
        this.f79276c = LayoutInflater.from(context).inflate(R.layout.a1c, this);
        this.f79277d = (AvatarImageWithVerify) this.f79276c.findViewById(R.id.b64);
        this.f79278e = (FansFollowUserBtn) this.f79276c.findViewById(R.id.vd);
        this.f79279f = (ImageView) this.f79276c.findViewById(R.id.a9i);
        this.f79280g = "";
        setBackground(C10774c.m31449e(context));
    }

    public /* synthetic */ RecommendContactItemView(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        this(context, null, 0);
    }
}
