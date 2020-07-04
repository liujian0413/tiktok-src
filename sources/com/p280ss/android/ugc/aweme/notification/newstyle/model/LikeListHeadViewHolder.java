package com.p280ss.android.ugc.aweme.notification.newstyle.model;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.emoji.smallemoji.p1208a.C27608b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.notification.newstyle.model.LikeListHeadViewHolder */
public final class LikeListHeadViewHolder extends C1293v {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f90137a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(LikeListHeadViewHolder.class), "mAiHead", "getMAiHead()Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(LikeListHeadViewHolder.class), "mTitle", "getMTitle()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;"))};

    /* renamed from: b */
    public final View f90138b;

    /* renamed from: c */
    private final C7541d f90139c = C7546e.m23569a(new C34552a(this));

    /* renamed from: d */
    private final C7541d f90140d = C7546e.m23569a(new C34553b(this));

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.model.LikeListHeadViewHolder$a */
    static final class C34552a extends Lambda implements C7561a<RemoteImageView> {

        /* renamed from: a */
        final /* synthetic */ LikeListHeadViewHolder f90142a;

        C34552a(LikeListHeadViewHolder likeListHeadViewHolder) {
            this.f90142a = likeListHeadViewHolder;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public RemoteImageView invoke() {
            return (RemoteImageView) this.f90142a.f90138b.findViewById(R.id.b7x);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.model.LikeListHeadViewHolder$b */
    static final class C34553b extends Lambda implements C7561a<DmtTextView> {

        /* renamed from: a */
        final /* synthetic */ LikeListHeadViewHolder f90143a;

        C34553b(LikeListHeadViewHolder likeListHeadViewHolder) {
            this.f90143a = likeListHeadViewHolder;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public DmtTextView invoke() {
            return (DmtTextView) this.f90143a.f90138b.findViewById(R.id.e3f);
        }
    }

    /* renamed from: a */
    private final RemoteImageView m111723a() {
        return (RemoteImageView) this.f90139c.getValue();
    }

    /* renamed from: b */
    private final DmtTextView m111724b() {
        return (DmtTextView) this.f90140d.getValue();
    }

    public LikeListHeadViewHolder(View view, UrlModel urlModel, String str, final C7561a<C7581n> aVar) {
        C7573i.m23587b(view, "view");
        C7573i.m23587b(aVar, "listner");
        super(view);
        this.f90138b = view;
        if (urlModel != null) {
            C23323e.m76524b(m111723a(), urlModel);
        }
        m111723a().setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                aVar.invoke();
            }
        });
        CharSequence charSequence = str;
        if (!TextUtils.isEmpty(charSequence)) {
            DmtTextView b = m111724b();
            C7573i.m23582a((Object) b, "mTitle");
            b.setVisibility(0);
            DmtTextView b2 = m111724b();
            C7573i.m23582a((Object) b2, "mTitle");
            b2.setText(charSequence);
            C27608b.m90502a((TextView) m111724b());
        }
    }
}
