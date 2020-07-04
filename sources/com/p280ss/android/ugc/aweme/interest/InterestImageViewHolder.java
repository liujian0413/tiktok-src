package com.p280ss.android.ugc.aweme.interest;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.journey.C32246j;
import com.p280ss.android.ugc.aweme.views.WorkaroundRemoteImageView;
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
import kotlin.jvm.p357a.C7563m;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.interest.InterestImageViewHolder */
public final class InterestImageViewHolder extends C1293v {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f83961a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(InterestImageViewHolder.class), "mImageView", "getMImageView()Lcom/ss/android/ugc/aweme/views/WorkaroundRemoteImageView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(InterestImageViewHolder.class), "mCateName", "getMCateName()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(InterestImageViewHolder.class), "mForgroudView", "getMForgroudView()Landroid/view/View;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(InterestImageViewHolder.class), "mSelectView", "getMSelectView()Landroid/widget/ImageView;"))};

    /* renamed from: b */
    public C7563m<? super Boolean, ? super Integer, C7581n> f83962b = C32152e.f83972a;

    /* renamed from: c */
    private final C7541d f83963c;

    /* renamed from: d */
    private final C7541d f83964d;

    /* renamed from: e */
    private final C7541d f83965e;

    /* renamed from: f */
    private final C7541d f83966f;

    /* renamed from: com.ss.android.ugc.aweme.interest.InterestImageViewHolder$a */
    static final class C32148a extends Lambda implements C7561a<DmtTextView> {

        /* renamed from: a */
        final /* synthetic */ View f83968a;

        C32148a(View view) {
            this.f83968a = view;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public DmtTextView invoke() {
            return (DmtTextView) this.f83968a.findViewById(R.id.dw_);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.interest.InterestImageViewHolder$b */
    static final class C32149b extends Lambda implements C7561a<View> {

        /* renamed from: a */
        final /* synthetic */ View f83969a;

        C32149b(View view) {
            this.f83969a = view;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public View invoke() {
            return this.f83969a.findViewById(R.id.ecq);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.interest.InterestImageViewHolder$c */
    static final class C32150c extends Lambda implements C7561a<WorkaroundRemoteImageView> {

        /* renamed from: a */
        final /* synthetic */ View f83970a;

        C32150c(View view) {
            this.f83970a = view;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public WorkaroundRemoteImageView invoke() {
            return (WorkaroundRemoteImageView) this.f83970a.findViewById(R.id.b_i);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.interest.InterestImageViewHolder$d */
    static final class C32151d extends Lambda implements C7561a<ImageView> {

        /* renamed from: a */
        final /* synthetic */ View f83971a;

        C32151d(View view) {
            this.f83971a = view;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public ImageView invoke() {
            return (ImageView) this.f83971a.findViewById(R.id.bc0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.interest.InterestImageViewHolder$e */
    static final class C32152e extends Lambda implements C7563m<Boolean, Integer, C7581n> {

        /* renamed from: a */
        public static final C32152e f83972a = new C32152e();

        C32152e() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            ((Boolean) obj).booleanValue();
            ((Number) obj2).intValue();
            return C7581n.f20898a;
        }
    }

    /* renamed from: b */
    private final WorkaroundRemoteImageView m104394b() {
        return (WorkaroundRemoteImageView) this.f83963c.getValue();
    }

    /* renamed from: c */
    private final DmtTextView m104395c() {
        return (DmtTextView) this.f83964d.getValue();
    }

    /* renamed from: d */
    private final View m104396d() {
        return (View) this.f83965e.getValue();
    }

    /* renamed from: a */
    public final ImageView mo83292a() {
        return (ImageView) this.f83966f.getValue();
    }

    /* renamed from: a */
    public final void mo83294a(C7563m<? super Boolean, ? super Integer, C7581n> mVar) {
        C7573i.m23587b(mVar, "<set-?>");
        this.f83962b = mVar;
    }

    /* renamed from: a */
    private void m104393a(boolean z) {
        ImageView a = mo83292a();
        C7573i.m23582a((Object) a, "mSelectView");
        a.setSelected(z);
        View d = m104396d();
        C7573i.m23582a((Object) d, "mForgroudView");
        d.setSelected(z);
    }

    public InterestImageViewHolder(View view) {
        C7573i.m23587b(view, "v");
        super(view);
        this.f83963c = C7546e.m23569a(new C32150c(view));
        this.f83964d = C7546e.m23569a(new C32148a(view));
        this.f83965e = C7546e.m23569a(new C32149b(view));
        this.f83966f = C7546e.m23569a(new C32151d(view));
        view.setOnClickListener(new OnClickListener(this) {

            /* renamed from: a */
            final /* synthetic */ InterestImageViewHolder f83967a;

            {
                this.f83967a = r1;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                C7563m<? super Boolean, ? super Integer, C7581n> mVar = this.f83967a.f83962b;
                ImageView a = this.f83967a.mo83292a();
                C7573i.m23582a((Object) a, "mSelectView");
                mVar.invoke(Boolean.valueOf(a.isSelected()), Integer.valueOf(this.f83967a.getAdapterPosition()));
            }
        });
    }

    /* renamed from: a */
    public final void mo83293a(C32246j jVar, boolean z) {
        C7573i.m23587b(jVar, "data");
        m104393a(z);
        String str = jVar.f84279c;
        if (str == null) {
            str = "";
        }
        DmtTextView c = m104395c();
        C7573i.m23582a((Object) c, "mCateName");
        String str2 = jVar.f84278b;
        if (str2 == null) {
            str2 = "";
        }
        c.setText(str2);
        WorkaroundRemoteImageView b = m104394b();
        if (!C7573i.m23585a(b.getTag(), (Object) str)) {
            C23323e.m76514a((RemoteImageView) b, str);
            b.setTag(str);
        }
    }
}
