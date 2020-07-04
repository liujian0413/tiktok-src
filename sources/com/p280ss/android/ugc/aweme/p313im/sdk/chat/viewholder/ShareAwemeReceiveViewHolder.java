package com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder;

import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.p263im.core.model.Message;
import com.p280ss.android.ugc.aweme.C21098ab;
import com.p280ss.android.ugc.aweme.C21780t;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.framework.services.IUserService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.ShareAwemeContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6956a;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6961d;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMUser;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.ShareAwemeReceiveViewHolder */
public class ShareAwemeReceiveViewHolder extends BaseViewHolder<ShareAwemeContent> {

    /* renamed from: m */
    private RemoteImageView f81300m;

    /* renamed from: n */
    private TextView f81301n;

    /* renamed from: o */
    private TextView f81302o;

    /* renamed from: p */
    private RemoteImageView f81303p;

    /* renamed from: q */
    private TextView f81304q;

    /* renamed from: r */
    private ImageView f81305r;

    /* renamed from: s */
    private ImageView f81306s;

    /* renamed from: t */
    private TextView f81307t;

    /* renamed from: u */
    private View f81308u;

    /* renamed from: v */
    private C21098ab f81309v;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo81423b() {
        super.mo81423b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo81420a() {
        super.mo81420a();
        this.f81308u = this.itemView.findViewById(R.id.s2);
        this.f81300m = (RemoteImageView) this.itemView.findViewById(R.id.a1y);
        this.f81301n = (TextView) this.itemView.findViewById(R.id.a2_);
        this.f81302o = (TextView) this.itemView.findViewById(R.id.a22);
        this.f81303p = (RemoteImageView) this.itemView.findViewById(R.id.a21);
        this.f81304q = (TextView) this.itemView.findViewById(R.id.a28);
        this.f81305r = (ImageView) this.itemView.findViewById(R.id.a2a);
        this.f81306s = (ImageView) this.itemView.findViewById(R.id.a2g);
        this.f81307t = (TextView) this.itemView.findViewById(R.id.a2c);
        this.f81197e = (View) mo81425a((int) R.id.a1q);
        m101035b(this.f81308u);
    }

    /* renamed from: b */
    private static void m101035b(View view) {
        if (view != null) {
            Drawable background = view.getBackground();
            if (background != null && VERSION.SDK_INT >= 19) {
                background.setAutoMirrored(true);
            }
        }
    }

    /* renamed from: a */
    public void mo81424a(OnClickListener onClickListener) {
        super.mo81424a(onClickListener);
        this.f81302o.setOnClickListener(onClickListener);
        this.f81300m.setOnClickListener(onClickListener);
        this.f81301n.setOnClickListener(onClickListener);
        this.f81197e.setOnClickListener(onClickListener);
        this.f81202j.mo82725a(this.f81302o, this.f81300m, this.f81301n, this.f81197e);
    }

    public ShareAwemeReceiveViewHolder(View view, int i) {
        super(view, i);
    }

    /* renamed from: a */
    public void mo81421a(Message message, Message message2, ShareAwemeContent shareAwemeContent, int i) {
        int i2;
        boolean z;
        super.mo81421a(message, message2, shareAwemeContent, i);
        int awemeType = shareAwemeContent.getAwemeType();
        if (awemeType == 0 || awemeType == 23) {
            this.f81306s.setVisibility(0);
            this.f81305r.setVisibility(8);
            this.f81302o.setVisibility(8);
            if (awemeType == 23) {
                this.f81304q.setVisibility(0);
            }
        } else {
            this.f81306s.setVisibility(8);
            this.f81305r.setVisibility(0);
            this.f81302o.setVisibility(0);
        }
        C23323e.m76524b(this.f81303p, shareAwemeContent.getCoverUrl());
        C23323e.m76524b(this.f81300m, shareAwemeContent.getContentThumb());
        this.f81301n.setText(shareAwemeContent.getContentName());
        String title = shareAwemeContent.getTitle();
        if (!TextUtils.isEmpty(title)) {
            this.f81307t.setText(title);
            this.f81307t.setVisibility(0);
        } else {
            this.f81307t.setVisibility(8);
        }
        if (awemeType == 0 || awemeType == 2) {
            IMUser b = C6961d.m21657a().mo18029b(shareAwemeContent.getUser());
            if (b == null) {
                i2 = 0;
            } else {
                i2 = b.getFollowStatus();
            }
            IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
            if (iUserService != null) {
                z = TextUtils.equals(shareAwemeContent.getUser(), iUserService.getCurrentUserID());
            } else {
                z = false;
            }
            if (i2 != 0 || z || !C6956a.m21633b().needAwemeMsgShowFollow()) {
                this.f81302o.setVisibility(8);
            } else {
                this.f81302o.setVisibility(0);
            }
        } else {
            this.f81302o.setVisibility(8);
        }
        if (awemeType == 0) {
            this.f81197e.setTag(50331648, Integer.valueOf(2));
            this.f81197e.setTag(67108864, shareAwemeContent.getItemId());
            this.f81302o.setTag(50331648, Integer.valueOf(5));
            this.f81302o.setTag(67108864, message);
        } else if (awemeType == 2) {
            this.f81197e.setTag(50331648, Integer.valueOf(8));
            this.f81197e.setTag(67108864, shareAwemeContent.getItemId());
            this.f81302o.setTag(50331648, Integer.valueOf(5));
            this.f81302o.setTag(67108864, message);
        }
        this.f81300m.setTag(50331648, Integer.valueOf(4));
        this.f81300m.setTag(100663296, shareAwemeContent);
        this.f81301n.setTag(50331648, Integer.valueOf(4));
        this.f81301n.setTag(100663296, shareAwemeContent);
        this.f81203k.f81142a = this.f81201i.getConversationId();
        FrameLayout frameLayout = (FrameLayout) this.itemView.findViewById(R.id.amr);
        if (this.f81309v == null) {
            this.f81309v = C21780t.m72807a().mo57889a(this.itemView.getContext());
            if (this.f81309v != null) {
                frameLayout.addView(this.f81309v.mo56936a());
            }
        }
        if (this.f81309v != null) {
            shareAwemeContent.getDiamondGameId();
            shareAwemeContent.getItemId();
        }
    }
}
