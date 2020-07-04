package com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder;

import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.p263im.core.model.Message;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.framework.services.IUserService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.ShareLiveContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6956a;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6961d;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31858ad;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMUser;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.ShareLiveReceiveViewHolder */
public class ShareLiveReceiveViewHolder extends BaseViewHolder<ShareLiveContent> {

    /* renamed from: m */
    private RemoteImageView f81340m;

    /* renamed from: n */
    private TextView f81341n;

    /* renamed from: o */
    private TextView f81342o;

    /* renamed from: p */
    private RemoteImageView f81343p;

    /* renamed from: q */
    private TextView f81344q;

    /* renamed from: r */
    private ImageView f81345r;

    /* renamed from: s */
    private ImageView f81346s;

    /* renamed from: t */
    private TextView f81347t;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo81420a() {
        super.mo81420a();
        m101098b(this.itemView.findViewById(R.id.s2));
        this.f81340m = (RemoteImageView) this.itemView.findViewById(R.id.a1y);
        this.f81341n = (TextView) this.itemView.findViewById(R.id.a2_);
        this.f81342o = (TextView) this.itemView.findViewById(R.id.a22);
        this.f81343p = (RemoteImageView) this.itemView.findViewById(R.id.a21);
        this.f81344q = (TextView) this.itemView.findViewById(R.id.a28);
        this.f81345r = (ImageView) this.itemView.findViewById(R.id.a2a);
        this.f81346s = (ImageView) this.itemView.findViewById(R.id.a2g);
        this.f81347t = (TextView) this.itemView.findViewById(R.id.a2c);
        this.f81197e = (View) mo81425a((int) R.id.a1q);
    }

    /* renamed from: b */
    private static void m101098b(View view) {
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
        this.f81342o.setOnClickListener(onClickListener);
        this.f81340m.setOnClickListener(onClickListener);
        this.f81341n.setOnClickListener(onClickListener);
        this.f81197e.setOnClickListener(onClickListener);
        this.f81202j.mo82725a(this.f81342o, this.f81340m, this.f81341n, this.f81197e);
    }

    public ShareLiveReceiveViewHolder(View view, int i) {
        super(view, i);
    }

    /* renamed from: a */
    public void mo81421a(Message message, Message message2, ShareLiveContent shareLiveContent, int i) {
        int i2;
        boolean z;
        super.mo81421a(message, message2, shareLiveContent, i);
        this.f81346s.setVisibility(0);
        this.f81344q.setVisibility(0);
        this.f81342o.setVisibility(8);
        this.f81345r.setVisibility(8);
        if (shareLiveContent.getRoomCover() != null) {
            C23323e.m76524b(this.f81343p, shareLiveContent.getRoomCover());
        } else {
            C23323e.m76503a(this.f81343p, (int) R.drawable.bj3);
        }
        C23323e.m76524b(this.f81340m, shareLiveContent.getRoomOwnerAvatar());
        this.f81341n.setText(shareLiveContent.getRoomOwnerName());
        if (!TextUtils.isEmpty(shareLiveContent.getRoomDesc())) {
            this.f81347t.setText(shareLiveContent.getRoomDesc());
            this.f81347t.setVisibility(0);
        } else {
            this.f81347t.setVisibility(8);
        }
        IMUser b = C6961d.m21657a().mo18029b(shareLiveContent.getRoomOwnerId());
        if (b == null) {
            i2 = 0;
        } else {
            i2 = b.getFollowStatus();
        }
        IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
        if (iUserService != null) {
            z = TextUtils.equals(shareLiveContent.getRoomOwnerId(), iUserService.getCurrentUserID());
        } else {
            z = false;
        }
        if (i2 != 0 || z || !C6956a.m21633b().needAwemeMsgShowFollow()) {
            this.f81342o.setVisibility(8);
        } else {
            this.f81342o.setVisibility(0);
        }
        this.f81203k.f81142a = this.f81201i.getConversationId();
        this.f81340m.setTag(50331648, Integer.valueOf(24));
        this.f81340m.setTag(100663296, shareLiveContent);
        this.f81341n.setTag(50331648, Integer.valueOf(24));
        this.f81341n.setTag(100663296, shareLiveContent);
        this.f81342o.setTag(50331648, Integer.valueOf(5));
        this.f81342o.setTag(67108864, message);
        this.f81197e.setTag(50331648, Integer.valueOf(23));
        C31858ad.m103406a();
        C31858ad.m103456c(shareLiveContent.getRoomOwnerId(), shareLiveContent.getRoomId());
    }
}
