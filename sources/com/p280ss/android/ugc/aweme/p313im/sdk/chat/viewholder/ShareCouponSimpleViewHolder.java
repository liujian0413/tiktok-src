package com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder;

import android.view.View;
import com.bytedance.p263im.core.model.Message;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.BaseContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.ShareCouponContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7074e;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.ShareCouponSimpleViewHolder */
public class ShareCouponSimpleViewHolder extends ShareSimpleBaseViewHolder {
    public ShareCouponSimpleViewHolder(View view, int i) {
        super(view, i);
    }

    /* renamed from: a */
    private void m101088a(ShareCouponContent shareCouponContent, boolean z) {
        String str;
        String str2;
        if (z) {
            str = this.f81196d;
        } else {
            str = C7074e.m22069b().toString();
        }
        if (z) {
            str2 = C7074e.m22069b().toString();
        } else {
            str2 = this.f81196d;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("enter_from", "chat");
        hashMap.put("from_user_id", str2);
        hashMap.put("conversation_id", this.f81201i.getConversationId());
        hashMap.put("to_user_id", str);
        hashMap.put("poi_id", shareCouponContent.getPoiId());
        hashMap.put("coupon_id", shareCouponContent.getCouponId());
        hashMap.put("activity_id", shareCouponContent.getActivityId());
        C6907h.m21524a("show_receive_coupon_inner", (Map) hashMap);
    }

    /* renamed from: a */
    public void mo81421a(Message message, Message message2, BaseContent baseContent, int i) {
        String str;
        super.mo81421a(message, message2, baseContent, i);
        ShareCouponContent shareCouponContent = (ShareCouponContent) baseContent;
        this.f81372o.setText(shareCouponContent.getCouponDesc());
        this.f81373p.setVisibility(0);
        this.f81373p.setText(shareCouponContent.getPoiName());
        this.f81374q.setText(R.string.bif);
        C23323e.m76524b(this.f81371n, shareCouponContent.getMerchantIconUrl());
        this.f81197e.setTag(50331648, Integer.valueOf(33));
        HashMap hashMap = new HashMap();
        hashMap.put("poi_id", shareCouponContent.getPoiId());
        hashMap.put("activity_id", shareCouponContent.getActivityId());
        hashMap.put("coupon_id", shareCouponContent.getCouponId());
        String str2 = "is_self";
        if (message.isSelf()) {
            str = "1";
        } else {
            str = "0";
        }
        hashMap.put(str2, str);
        hashMap.put("uid", this.f81196d);
        this.f81197e.setTag(67108864, hashMap);
        m101088a(shareCouponContent, message.isSelf());
    }
}
