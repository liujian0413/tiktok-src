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
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.ShareAwemeContent;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.ShareAwemeReceiveNotPlayViewHolder */
public class ShareAwemeReceiveNotPlayViewHolder extends BaseViewHolder<ShareAwemeContent> {

    /* renamed from: m */
    private RemoteImageView f81291m;

    /* renamed from: n */
    private TextView f81292n;

    /* renamed from: o */
    private View f81293o;

    /* renamed from: p */
    private TextView f81294p;

    /* renamed from: q */
    private ImageView f81295q;

    /* renamed from: r */
    private TextView f81296r;

    /* renamed from: s */
    private RemoteImageView f81297s;

    /* renamed from: t */
    private View f81298t;

    /* renamed from: u */
    private C21098ab f81299u;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo81423b() {
        super.mo81423b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo81420a() {
        super.mo81420a();
        this.f81298t = this.itemView.findViewById(R.id.s2);
        this.f81291m = (RemoteImageView) this.itemView.findViewById(R.id.a1y);
        this.f81292n = (TextView) this.itemView.findViewById(R.id.a2_);
        this.f81297s = (RemoteImageView) this.itemView.findViewById(R.id.a21);
        this.f81197e = this.itemView.findViewById(R.id.a24);
        this.f81294p = (TextView) this.itemView.findViewById(R.id.a28);
        this.f81295q = (ImageView) this.itemView.findViewById(R.id.a2a);
        this.f81296r = (TextView) this.itemView.findViewById(R.id.a2c);
        this.f81293o = this.itemView.findViewById(R.id.bb5);
        m101029b(this.f81298t);
    }

    /* renamed from: b */
    private static void m101029b(View view) {
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
        this.f81291m.setOnClickListener(onClickListener);
        this.f81292n.setOnClickListener(onClickListener);
        this.f81197e.setOnClickListener(onClickListener);
        this.f81202j.mo82725a(this.f81291m, this.f81292n, this.f81197e);
    }

    public ShareAwemeReceiveNotPlayViewHolder(View view, int i) {
        super(view, i);
    }

    /* renamed from: a */
    public void mo81421a(Message message, Message message2, ShareAwemeContent shareAwemeContent, int i) {
        super.mo81421a(message, message2, shareAwemeContent, i);
        int awemeType = shareAwemeContent.getAwemeType();
        if (awemeType == 0 || awemeType == 23) {
            this.f81295q.setVisibility(8);
            if (awemeType == 23) {
                this.f81294p.setVisibility(0);
            }
        } else {
            this.f81295q.setVisibility(0);
        }
        C23323e.m76524b(this.f81297s, shareAwemeContent.getCoverUrl());
        C23323e.m76524b(this.f81291m, shareAwemeContent.getContentThumb());
        this.f81292n.setText(shareAwemeContent.getContentName());
        String title = shareAwemeContent.getTitle();
        if (!TextUtils.isEmpty(title)) {
            this.f81296r.setText(title);
            this.f81296r.setVisibility(0);
        } else {
            this.f81296r.setVisibility(8);
        }
        if (awemeType == 0) {
            this.f81197e.setTag(50331648, Integer.valueOf(2));
            this.f81197e.setTag(67108864, shareAwemeContent.getItemId());
        } else if (awemeType == 2) {
            this.f81197e.setTag(50331648, Integer.valueOf(8));
            this.f81197e.setTag(67108864, shareAwemeContent.getItemId());
        }
        this.f81197e.setTag(50331648, Integer.valueOf(2));
        this.f81197e.setTag(67108864, shareAwemeContent.getItemId());
        this.f81197e.setTag(134217728, message);
        this.f81291m.setTag(50331648, Integer.valueOf(4));
        this.f81291m.setTag(100663296, shareAwemeContent);
        this.f81292n.setTag(50331648, Integer.valueOf(4));
        this.f81292n.setTag(100663296, shareAwemeContent);
        this.f81203k.f81142a = this.f81201i.getConversationId();
        FrameLayout frameLayout = (FrameLayout) this.itemView.findViewById(R.id.amr);
        if (this.f81299u == null) {
            this.f81299u = C21780t.m72807a().mo57889a(this.itemView.getContext());
            if (this.f81299u != null) {
                frameLayout.addView(this.f81299u.mo56936a());
            }
        }
        if (this.f81299u == null) {
            frameLayout.setVisibility(8);
        } else if (TextUtils.isEmpty(shareAwemeContent.getDiamondGameId())) {
            frameLayout.setVisibility(8);
        } else {
            frameLayout.setVisibility(0);
            shareAwemeContent.getItemId();
        }
    }
}
