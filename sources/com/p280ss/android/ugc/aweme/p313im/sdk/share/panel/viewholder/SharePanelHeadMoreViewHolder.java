package com.p280ss.android.ugc.aweme.p313im.sdk.share.panel.viewholder;

import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.base.p308ui.AvatarImageView;
import com.p280ss.android.ugc.aweme.p313im.sdk.share.panel.viewmodel.SharePanelViewModel;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMContact;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.viewholder.SharePanelHeadMoreViewHolder */
public final class SharePanelHeadMoreViewHolder extends C1293v {

    /* renamed from: b */
    public static final C31837a f83284b = new C31837a(null);

    /* renamed from: a */
    public IMContact f83285a;

    /* renamed from: c */
    private final AvatarImageView f83286c;

    /* renamed from: d */
    private final int f83287d;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.viewholder.SharePanelHeadMoreViewHolder$a */
    public static final class C31837a {
        private C31837a() {
        }

        public /* synthetic */ C31837a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static SharePanelHeadMoreViewHolder m103321a(ViewGroup viewGroup, SharePanelViewModel sharePanelViewModel) {
            C7573i.m23587b(viewGroup, "parent");
            C7573i.m23587b(sharePanelViewModel, "viewModel");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.xy, viewGroup, false);
            C7573i.m23582a((Object) inflate, "itemView");
            return new SharePanelHeadMoreViewHolder(inflate, sharePanelViewModel);
        }
    }

    /* renamed from: a */
    public final void mo82661a(IMContact iMContact) {
        C7573i.m23587b(iMContact, "contact");
        this.f83285a = iMContact;
        Drawable drawable = C6399b.m19921a().getResources().getDrawable(this.f83287d);
        if (VERSION.SDK_INT >= 19) {
            C7573i.m23582a((Object) drawable, "drawable");
            drawable.setAutoMirrored(true);
        }
        this.f83286c.setImageDrawable(drawable);
    }

    public SharePanelHeadMoreViewHolder(View view, final SharePanelViewModel sharePanelViewModel) {
        int i;
        C7573i.m23587b(view, "itemView");
        C7573i.m23587b(sharePanelViewModel, "viewModel");
        super(view);
        View findViewById = view.findViewById(R.id.w7);
        C7573i.m23582a((Object) findViewById, "itemView.findViewById(R.id.civ)");
        this.f83286c = (AvatarImageView) findViewById;
        if (C6399b.m19944t()) {
            i = R.drawable.a_1;
        } else {
            i = R.drawable.a_0;
        }
        this.f83287d = i;
        this.f83286c.setOnClickListener(new OnClickListener(this) {

            /* renamed from: a */
            final /* synthetic */ SharePanelHeadMoreViewHolder f83288a;

            {
                this.f83288a = r1;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                SharePanelViewModel sharePanelViewModel = sharePanelViewModel;
                IMContact iMContact = this.f83288a.f83285a;
                if (iMContact == null) {
                    C7573i.m23580a();
                }
                sharePanelViewModel.mo82668a(iMContact, true);
            }
        });
    }
}
