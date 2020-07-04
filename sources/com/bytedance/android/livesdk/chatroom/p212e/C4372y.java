package com.bytedance.android.livesdk.chatroom.p212e;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.livesdk.C3847a;
import com.bytedance.android.livesdk.chatroom.p220ui.C5283dp;
import com.bytedance.android.livesdk.message.C8471f;
import com.bytedance.android.livesdk.message.model.C8472a;
import com.bytedance.android.livesdk.message.model.C8478af;
import com.bytedance.android.livesdk.message.model.C8483aj;
import com.bytedance.android.livesdk.message.model.C8484ak;
import com.bytedance.android.livesdk.message.model.C8487am;
import com.bytedance.android.livesdk.message.model.C8489ao;
import com.bytedance.android.livesdk.message.model.C8512bh;
import com.bytedance.android.livesdk.message.model.C8514bj;
import com.bytedance.android.livesdk.message.model.C8522bp;
import com.bytedance.android.livesdk.message.model.C8529bs;
import com.bytedance.android.livesdk.message.model.C8535by;
import com.bytedance.android.livesdk.message.model.C8538c;
import com.bytedance.android.livesdk.message.model.C8541cc;
import com.bytedance.android.livesdk.message.model.C8543ce;
import com.bytedance.android.livesdk.message.model.C8548cj;
import com.bytedance.android.livesdk.message.model.C8550cl;
import com.bytedance.android.livesdk.message.model.C8557cr;
import com.bytedance.android.livesdk.message.model.C8680m;
import com.bytedance.android.livesdk.message.model.C8682o;
import com.bytedance.android.livesdk.message.model.C8688t;
import com.bytedance.android.livesdk.message.model.C8695y;
import com.bytedance.android.livesdk.message.model.C8696z;
import com.bytedance.android.livesdk.message.model.LotteryEventMessage;
import com.bytedance.android.livesdk.widget.C9238b;
import com.bytedance.common.utility.C9738o;

/* renamed from: com.bytedance.android.livesdk.chatroom.e.y */
public final class C4372y {
    /* renamed from: a */
    public static int m14740a(int i) {
        return C3358ac.m12528e().getResources().getColor(i);
    }

    /* renamed from: a */
    public static C4343b m14744a(C8538c cVar) {
        switch (cVar.getMessageType()) {
            case CHAT:
                return new C4347d((C8680m) cVar);
            case GIFT:
                return new C4358l((C8489ao) cVar);
            case FREE_CELL_GIFT_MESSAGE:
                return new C4358l(C8483aj.m25748a((C8483aj) cVar));
            case GAME_GIFT_MESSAGE:
                return new C4358l(C8484ak.m25749a((C8484ak) cVar));
            case DOODLE_GIFT:
                return new C4354i((C8696z) cVar);
            case GIFT_GROUP:
                return new C4356k((C8487am) cVar);
            case DIGG:
                return new C4353h((C8695y) cVar);
            case MEMBER:
                return new C4363p((C8514bj) cVar);
            case ROOM:
                return new C4369v((C8543ce) cVar);
            case SOCIAL:
                return new C4371x((C8550cl) cVar);
            case CONTROL:
                return new C4351f((C8688t) cVar);
            case SCREEN:
                return new C4370w((C8548cj) cVar);
            case ROOM_RICH_CHAT_MESSAGE:
                return new C4368u((C8541cc) cVar);
            case LUCKY_BOX:
                if (C3847a.f11538a.booleanValue() && (cVar instanceof C8535by)) {
                    return new C4361n((C8535by) cVar);
                }
                if (C3847a.f11538a.booleanValue() && (cVar instanceof C8512bh)) {
                    return new C4361n(C8535by.m25768a((C8512bh) cVar));
                }
                if (cVar instanceof C8512bh) {
                    return new C4362o((C8512bh) cVar);
                }
                return null;
            case LOTTERY_EVENT:
                return new C4360m((LotteryEventMessage) cVar);
            case COMMENT_IMAGE:
                return new C4348e((C8682o) cVar);
            case FANS_CLUB:
                return new C4355j((C8478af) cVar);
            case GOODS_ORDER:
                return new C4341aa((C8557cr) cVar);
            case ASSET_MESSAGE:
                return new C4346c((C8472a) cVar);
            case PORTAL_MESSAGE:
                return new C4365r((C8522bp) cVar);
            case PROMOTION_CARD_MESSAGE:
                C8529bs bsVar = (C8529bs) cVar;
                if ("buy_card".equals(bsVar.f23446a)) {
                    return new C4366s(bsVar);
                }
                if ("enter_by_card".equals(bsVar.f23446a)) {
                    return new C4367t(bsVar);
                }
                break;
        }
        return new C4352g(cVar);
    }

    /* renamed from: a */
    public static Spannable m14743a(String str, int i) {
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new ForegroundColorSpan(m14740a(i)), 0, spannableString.length(), 18);
        return spannableString;
    }

    /* renamed from: a */
    public static Spannable m14741a(Spannable spannable, Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled() || spannable == null || spannable.length() == 0) {
            return spannable;
        }
        int b = (int) C9738o.m28708b(C3358ac.m12528e(), 16.0f);
        BitmapDrawable bitmapDrawable = new BitmapDrawable(C3358ac.m12528e().getResources(), bitmap);
        bitmapDrawable.setBounds(0, 0, b, b);
        spannable.setSpan(new C9238b(bitmapDrawable), spannable.length() - 1, spannable.length(), 33);
        return spannable;
    }

    /* renamed from: b */
    public static Spannable m14745b(User user, String str, String str2, int i, int i2, boolean z) {
        if (user == null || TextUtils.isEmpty(C8471f.m25743a(user)) || TextUtils.isEmpty(C8471f.m25743a(user)) || TextUtils.isEmpty(str2)) {
            return C4374z.f12668a;
        }
        String a = C8471f.m25743a(user);
        C5283dp dpVar = new C5283dp(user, m14740a(i), false);
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(m14740a(i2));
        StringBuilder sb = new StringBuilder();
        sb.append(a);
        sb.append(str);
        sb.append(str2);
        SpannableString spannableString = new SpannableString(sb.toString());
        spannableString.setSpan(dpVar, 0, a.length() + 1, 33);
        spannableString.setSpan(foregroundColorSpan, a.length() + 1, spannableString.length(), 18);
        return spannableString;
    }

    /* renamed from: a */
    public static Spannable m14742a(User user, String str, String str2, int i, int i2, boolean z) {
        if (user == null || TextUtils.isEmpty(C8471f.m25743a(user)) || TextUtils.isEmpty(C8471f.m25743a(user)) || TextUtils.isEmpty(str2)) {
            return C4374z.f12668a;
        }
        String a = C8471f.m25743a(user);
        C5283dp dpVar = new C5283dp(user, m14740a(i), false);
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(m14740a(i2));
        StringBuilder sb = new StringBuilder();
        sb.append(a);
        sb.append(str);
        sb.append(str2);
        SpannableString spannableString = new SpannableString(sb.toString());
        spannableString.setSpan(dpVar, 0, a.length(), 33);
        spannableString.setSpan(foregroundColorSpan, a.length(), spannableString.length(), 18);
        return spannableString;
    }
}
