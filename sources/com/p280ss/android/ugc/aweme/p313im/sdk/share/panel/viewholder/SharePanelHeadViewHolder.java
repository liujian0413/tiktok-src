package com.p280ss.android.ugc.aweme.p313im.sdk.share.panel.viewholder;

import android.os.Build.VERSION;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.p263im.core.model.C6417a;
import com.bytedance.p263im.core.model.Conversation;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.AvatarImageView;
import com.p280ss.android.ugc.aweme.p313im.sdk.share.panel.viewmodel.SharePanelViewModel;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31873as;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31875au;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31889bb;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMContact;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMConversation;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMUser;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.viewholder.SharePanelHeadViewHolder */
public final class SharePanelHeadViewHolder extends C1293v {

    /* renamed from: d */
    public static final C31839a f83290d = new C31839a(null);

    /* renamed from: j */
    private static final int f83291j = C6399b.m19921a().getResources().getDimensionPixelSize(R.dimen.i1);

    /* renamed from: a */
    public IMContact f83292a;

    /* renamed from: b */
    public boolean f83293b;

    /* renamed from: c */
    public final SharePanelViewModel f83294c;

    /* renamed from: e */
    private final DmtTextView f83295e;

    /* renamed from: f */
    private final AvatarImageView f83296f;

    /* renamed from: g */
    private final ImageView f83297g;

    /* renamed from: h */
    private final View f83298h;

    /* renamed from: i */
    private final View f83299i;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.viewholder.SharePanelHeadViewHolder$a */
    public static final class C31839a {
        private C31839a() {
        }

        public /* synthetic */ C31839a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static SharePanelHeadViewHolder m103328a(ViewGroup viewGroup, SharePanelViewModel sharePanelViewModel) {
            C7573i.m23587b(viewGroup, "parent");
            C7573i.m23587b(sharePanelViewModel, "viewModel");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a35, viewGroup, false);
            C7573i.m23582a((Object) inflate, "itemView");
            return new SharePanelHeadViewHolder(inflate, sharePanelViewModel);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.viewholder.SharePanelHeadViewHolder$b */
    public static final class C31840b extends ClickableSpan {
        C31840b() {
        }

        public final void onClick(View view) {
            C7573i.m23587b(view, "widget");
        }
    }

    /* renamed from: a */
    private final void m103323a(IMUser iMUser) {
        m103325b(iMUser);
        C23323e.m76524b(this.f83296f, iMUser.getDisplayAvatar());
        C31889bb.m103601a(this.f83297g, iMUser);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001d, code lost:
        if (r2 == false) goto L_0x0021;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m103322a(com.p280ss.android.ugc.aweme.p313im.service.model.IMConversation r4) {
        /*
            r3 = this;
            r3.m103324b(r4)
            com.ss.android.ugc.aweme.base.model.UrlModel r4 = r4.getDisplayAvatar()
            r0 = 1
            r1 = 0
            if (r4 == 0) goto L_0x0020
            java.util.List r2 = r4.getUrlList()
            java.util.Collection r2 = (java.util.Collection) r2
            if (r2 == 0) goto L_0x001c
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x001a
            goto L_0x001c
        L_0x001a:
            r2 = 0
            goto L_0x001d
        L_0x001c:
            r2 = 1
        L_0x001d:
            if (r2 != 0) goto L_0x0020
            goto L_0x0021
        L_0x0020:
            r0 = 0
        L_0x0021:
            if (r0 == 0) goto L_0x0024
            goto L_0x0025
        L_0x0024:
            r4 = 0
        L_0x0025:
            if (r4 == 0) goto L_0x002f
            com.ss.android.ugc.aweme.base.ui.AvatarImageView r0 = r3.f83296f
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = (com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView) r0
            com.p280ss.android.ugc.aweme.base.C23323e.m76524b(r0, r4)
            return
        L_0x002f:
            com.ss.android.ugc.aweme.base.ui.AvatarImageView r4 = r3.f83296f
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r4 = (com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView) r4
            r0 = 2131233293(0x7f080a0d, float:1.808272E38)
            com.p280ss.android.ugc.aweme.base.C23323e.m76503a(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p313im.sdk.share.panel.viewholder.SharePanelHeadViewHolder.m103322a(com.ss.android.ugc.aweme.im.service.model.IMConversation):void");
    }

    /* renamed from: b */
    private final void m103325b(IMUser iMUser) {
        boolean z;
        CharSequence a;
        DmtTextView dmtTextView = this.f83295e;
        CharSequence displayName = iMUser.getDisplayName();
        if (displayName == null || displayName.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            a = "";
        } else {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C31873as.m103564a(iMUser.getDisplayName()));
            TextPaint paint = this.f83295e.getPaint();
            C7573i.m23582a((Object) paint, "nameTv.paint");
            a = C31875au.m103567a(spannableStringBuilder, paint, f83291j, this.f83295e.getMaxLines(), 0, 0);
        }
        dmtTextView.setText(a);
    }

    /* renamed from: a */
    public final void mo82663a(IMContact iMContact) {
        C7573i.m23587b(iMContact, "contact");
        this.f83292a = iMContact;
        this.f83297g.setVisibility(8);
        if (iMContact instanceof IMUser) {
            m103323a((IMUser) iMContact);
        } else if (iMContact instanceof IMConversation) {
            m103322a((IMConversation) iMContact);
        }
        mo82664a(this.f83294c.mo82667a().contains(iMContact));
    }

    /* renamed from: b */
    private final void m103324b(IMConversation iMConversation) {
        boolean z;
        SharePanelHeadViewHolder sharePanelHeadViewHolder;
        int i;
        String displayName = iMConversation.getDisplayName();
        CharSequence charSequence = displayName;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            sharePanelHeadViewHolder = this;
        } else {
            sharePanelHeadViewHolder = null;
        }
        if (sharePanelHeadViewHolder != null) {
            this.f83295e.setText("");
            return;
        }
        Conversation a = C6417a.m20015a().mo15530a(iMConversation.getConversationId());
        if (a != null) {
            i = a.getMemberCount();
        } else {
            i = 0;
        }
        String string = this.f83295e.getContext().getString(R.string.bkr, new Object[]{Integer.valueOf(i)});
        StringBuilder sb = new StringBuilder();
        sb.append(displayName);
        sb.append(string);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb.toString());
        spannableStringBuilder.setSpan(new C31840b(), displayName.length(), spannableStringBuilder.length(), 34);
        int measureText = (int) (this.f83295e.getPaint().measureText(string) + 0.5f);
        TextPaint paint = this.f83295e.getPaint();
        C7573i.m23582a((Object) paint, "nameTv.paint");
        SpannableStringBuilder a2 = C31875au.m103567a(spannableStringBuilder, paint, f83291j, this.f83295e.getMaxLines(), string.length(), measureText);
        if (VERSION.SDK_INT >= 23) {
            this.f83295e.setBreakStrategy(0);
        }
        this.f83295e.setText(a2.toString());
    }

    /* renamed from: a */
    public final void mo82664a(boolean z) {
        int i;
        this.f83293b = z;
        View view = this.f83299i;
        int i2 = 8;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
        View view2 = this.f83298h;
        if (z) {
            i2 = this.f83297g.getVisibility();
        }
        view2.setVisibility(i2);
    }

    public SharePanelHeadViewHolder(View view, SharePanelViewModel sharePanelViewModel) {
        C7573i.m23587b(view, "itemView");
        C7573i.m23587b(sharePanelViewModel, "viewModel");
        super(view);
        this.f83294c = sharePanelViewModel;
        View findViewById = view.findViewById(R.id.c37);
        C7573i.m23582a((Object) findViewById, "findViewById(R.id.name_tv)");
        this.f83295e = (DmtTextView) findViewById;
        View findViewById2 = view.findViewById(R.id.j2);
        C7573i.m23582a((Object) findViewById2, "findViewById(R.id.avatar_iv)");
        this.f83296f = (AvatarImageView) findViewById2;
        View findViewById3 = view.findViewById(R.id.e_q);
        C7573i.m23582a((Object) findViewById3, "findViewById(R.id.verify_iv)");
        this.f83297g = (ImageView) findViewById3;
        View findViewById4 = view.findViewById(R.id.e_r);
        C7573i.m23582a((Object) findViewById4, "findViewById(R.id.verify_layer)");
        this.f83298h = findViewById4;
        View findViewById5 = view.findViewById(R.id.au1);
        C7573i.m23582a((Object) findViewById5, "findViewById(R.id.has_selected_fl)");
        this.f83299i = findViewById5;
        this.f83296f.setOnClickListener(new OnClickListener(this) {

            /* renamed from: a */
            final /* synthetic */ SharePanelHeadViewHolder f83300a;

            {
                this.f83300a = r1;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                boolean z = !this.f83300a.f83293b;
                SharePanelViewModel sharePanelViewModel = this.f83300a.f83294c;
                IMContact iMContact = this.f83300a.f83292a;
                if (iMContact == null) {
                    C7573i.m23580a();
                }
                if (sharePanelViewModel.mo82668a(iMContact, z)) {
                    this.f83300a.mo82664a(z);
                }
            }
        });
    }
}
