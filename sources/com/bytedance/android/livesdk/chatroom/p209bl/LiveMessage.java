package com.bytedance.android.livesdk.chatroom.p209bl;

import com.bytedance.android.livesdk.chatroom.model.p219a.C4851c;
import com.bytedance.android.livesdk.message.model.C8472a;
import com.bytedance.android.livesdk.message.model.C8475ac;
import com.bytedance.android.livesdk.message.model.C8476ad;
import com.bytedance.android.livesdk.message.model.C8477ae;
import com.bytedance.android.livesdk.message.model.C8478af;
import com.bytedance.android.livesdk.message.model.C8480ag;
import com.bytedance.android.livesdk.message.model.C8481ah;
import com.bytedance.android.livesdk.message.model.C8482ai;
import com.bytedance.android.livesdk.message.model.C8483aj;
import com.bytedance.android.livesdk.message.model.C8484ak;
import com.bytedance.android.livesdk.message.model.C8486al;
import com.bytedance.android.livesdk.message.model.C8489ao;
import com.bytedance.android.livesdk.message.model.C8490ap;
import com.bytedance.android.livesdk.message.model.C8491aq;
import com.bytedance.android.livesdk.message.model.C8493as;
import com.bytedance.android.livesdk.message.model.C8494at;
import com.bytedance.android.livesdk.message.model.C8495au;
import com.bytedance.android.livesdk.message.model.C8496av;
import com.bytedance.android.livesdk.message.model.C8498ax;
import com.bytedance.android.livesdk.message.model.C8499ay;
import com.bytedance.android.livesdk.message.model.C8502az;
import com.bytedance.android.livesdk.message.model.C8503b;
import com.bytedance.android.livesdk.message.model.C8504ba;
import com.bytedance.android.livesdk.message.model.C8505bb;
import com.bytedance.android.livesdk.message.model.C8506bc;
import com.bytedance.android.livesdk.message.model.C8508bd;
import com.bytedance.android.livesdk.message.model.C8509be;
import com.bytedance.android.livesdk.message.model.C8510bf;
import com.bytedance.android.livesdk.message.model.C8511bg;
import com.bytedance.android.livesdk.message.model.C8512bh;
import com.bytedance.android.livesdk.message.model.C8513bi;
import com.bytedance.android.livesdk.message.model.C8514bj;
import com.bytedance.android.livesdk.message.model.C8516bk;
import com.bytedance.android.livesdk.message.model.C8517bl;
import com.bytedance.android.livesdk.message.model.C8518bm;
import com.bytedance.android.livesdk.message.model.C8519bn;
import com.bytedance.android.livesdk.message.model.C8520bo;
import com.bytedance.android.livesdk.message.model.C8522bp;
import com.bytedance.android.livesdk.message.model.C8527bq;
import com.bytedance.android.livesdk.message.model.C8528br;
import com.bytedance.android.livesdk.message.model.C8529bs;
import com.bytedance.android.livesdk.message.model.C8531bu;
import com.bytedance.android.livesdk.message.model.C8533bw;
import com.bytedance.android.livesdk.message.model.C8534bx;
import com.bytedance.android.livesdk.message.model.C8538c;
import com.bytedance.android.livesdk.message.model.C8540cb;
import com.bytedance.android.livesdk.message.model.C8541cc;
import com.bytedance.android.livesdk.message.model.C8542cd;
import com.bytedance.android.livesdk.message.model.C8543ce;
import com.bytedance.android.livesdk.message.model.C8544cf;
import com.bytedance.android.livesdk.message.model.C8545cg;
import com.bytedance.android.livesdk.message.model.C8546ch;
import com.bytedance.android.livesdk.message.model.C8547ci;
import com.bytedance.android.livesdk.message.model.C8548cj;
import com.bytedance.android.livesdk.message.model.C8550cl;
import com.bytedance.android.livesdk.message.model.C8553cn;
import com.bytedance.android.livesdk.message.model.C8554co;
import com.bytedance.android.livesdk.message.model.C8556cq;
import com.bytedance.android.livesdk.message.model.C8557cr;
import com.bytedance.android.livesdk.message.model.C8559cs;
import com.bytedance.android.livesdk.message.model.C8560ct;
import com.bytedance.android.livesdk.message.model.C8567d;
import com.bytedance.android.livesdk.message.model.C8623f;
import com.bytedance.android.livesdk.message.model.C8650g;
import com.bytedance.android.livesdk.message.model.C8675h;
import com.bytedance.android.livesdk.message.model.C8676i;
import com.bytedance.android.livesdk.message.model.C8677j;
import com.bytedance.android.livesdk.message.model.C8679l;
import com.bytedance.android.livesdk.message.model.C8680m;
import com.bytedance.android.livesdk.message.model.C8681n;
import com.bytedance.android.livesdk.message.model.C8682o;
import com.bytedance.android.livesdk.message.model.C8683p;
import com.bytedance.android.livesdk.message.model.C8685q;
import com.bytedance.android.livesdk.message.model.C8686r;
import com.bytedance.android.livesdk.message.model.C8688t;
import com.bytedance.android.livesdk.message.model.C8690u;
import com.bytedance.android.livesdk.message.model.C8691v;
import com.bytedance.android.livesdk.message.model.C8693x;
import com.bytedance.android.livesdk.message.model.C8695y;
import com.bytedance.android.livesdk.message.model.C8696z;
import com.bytedance.android.livesdk.message.model.FansclubStatisticMessage;
import com.bytedance.android.livesdk.message.model.LotteryEventMessage;
import com.bytedance.android.livesdkapi.depend.message.MessageType;
import java.util.HashMap;

/* renamed from: com.bytedance.android.livesdk.chatroom.bl.LiveMessage */
public enum LiveMessage {
    CHAT(MessageType.CHAT.getWsMethod(), C8680m.class),
    CONTROL(MessageType.CONTROL.getWsMethod(), C8688t.class),
    DIGG(MessageType.DIGG.getWsMethod(), C8695y.class),
    GIFT(MessageType.GIFT.getWsMethod(), C8489ao.class),
    MEMBER(MessageType.MEMBER.getWsMethod(), C8514bj.class),
    ROOM(MessageType.ROOM.getWsMethod(), C8543ce.class),
    SOCIAL(MessageType.SOCIAL.getWsMethod(), C8550cl.class),
    SCREEN(MessageType.SCREEN.getWsMethod(), C8548cj.class),
    ROOM_NOTIFY(MessageType.ROOM_NOTIFY.getWsMethod(), C8544cf.class),
    REMIND(MessageType.REMIND.getWsMethod(), C8540cb.class),
    DAILY_RANK(MessageType.DAILY_RANK.getWsMethod(), C8691v.class),
    DAILY_REGION_RANK(MessageType.DAILY_REGION_RANK.getWsMethod(), C8691v.class),
    DOODLE_GIFT(MessageType.DOODLE_GIFT.getWsMethod(), C8696z.class),
    MODIFY_DECORATION(MessageType.MODIFY_DECORATION.getWsMethod(), C8693x.class),
    ROOM_PUSH(MessageType.ROOM_PUSH.getWsMethod(), C8545cg.class),
    USER_STATS(MessageType.USER_STATS.getWsMethod(), C8556cq.class),
    IN_ROOM_BANNER(MessageType.IN_ROOM_BANNER_MESSAGE.getWsMethod(), C8495au.class),
    ROOM_RICH_CHAT(MessageType.ROOM_RICH_CHAT_MESSAGE.getWsMethod(), C8541cc.class),
    PROMOTION_CARD(MessageType.PROMOTION_CARD_MESSAGE.getWsMethod(), C8529bs.class),
    LINK_MIC(MessageType.LINK_MIC.getWsMethod(), C8508bd.class),
    LINK_MIC_SIGNAL(MessageType.LINK_MIC_SIGNAL.getWsMethod(), C8509be.class),
    ROOM_IMG(MessageType.ROOM_IMG_MESSAGE.getWsMethod(), C8542cd.class),
    BATTLE_MODE(MessageType.BATTLE_MODE.getWsMethod(), C4851c.class),
    BANNER_UPDATE(MessageType.BANNER_UPDATE.getWsMethod(), C8503b.class),
    GAME_GUIZ(MessageType.GAME_QUIZ.getWsMethod(), C8486al.class),
    LINK_MIC_ARMIES(MessageType.LINK_MIC_ARMIES.getWsMethod(), C8499ay.class),
    LINK_MIC_BATTLE(MessageType.LINK_MIC_BATTLE.getWsMethod(), C8504ba.class),
    LINK_MIC_BATTLE_FINISH(MessageType.LINK_MIC_BATTLE_FINISH.getWsMethod(), C8502az.class),
    LINK_MIC_BATTLE_TASK(MessageType.LINK_MIC_BATTLE_TASK.getWsMethod(), C8506bc.class),
    LINK_MIC_BATTLE_PUNISH(MessageType.LINK_MIC_BATTLE_PUNISH.getWsMethod(), C8505bb.class),
    TURN_TABLE_BURST(MessageType.TURN_TABLE_BURST.getWsMethod(), C8553cn.class),
    GIFT_UPDATE(MessageType.GIFT_UPDATE.getWsMethod(), C8490ap.class),
    COMMON_TOAST(MessageType.COMMON_TOAST.getWsMethod(), C8686r.class),
    COMMON_GUIDE(MessageType.COMMON_GUIDE.getWsMethod(), C8683p.class),
    LUCKY_BOX(MessageType.LUCKY_BOX.getWsMethod(), C8512bh.class),
    COMMENT_IMAGE(MessageType.COMMENT_IMAGE.getWsMethod(), C8682o.class),
    FANS_CLUB_STATISTICS(MessageType.FANS_CLUB_STATISTICS.getWsMethod(), FansclubStatisticMessage.class),
    USER_SEQ(MessageType.USER_SEQ.getWsMethod(), C8546ch.class),
    ROOM_VERIFY(MessageType.ROOM_VERIFY.getWsMethod(), C8547ci.class),
    LIVE_SHOPPING(MessageType.LIVE_SHOPPING.getWsMethod(), C8511bg.class),
    FANS_CLUB(MessageType.FANS_CLUB.getWsMethod(), C8478af.class),
    CREATE_RED_PACKET(MessageType.CREATE_RED_PACKET.getWsMethod(), C8690u.class),
    RECOMMEND_GOODS(MessageType.RECOMMEND_GOODS.getWsMethod(), C8560ct.class),
    RECOMMEND_COUPON(MessageType.RECOMMEND_COUPON.getWsMethod(), C8559cs.class),
    GOODS_ORDER(MessageType.GOODS_ORDER.getWsMethod(), C8557cr.class),
    FANS_CLUB_REVIEW(MessageType.FANS_CLUB_REVIEW.getWsMethod(), C8480ag.class),
    MEDIA_REPLAY(MessageType.MEDIA_REPLAY.getWsMethod(), C8513bi.class),
    FOLLOW_GUIDE(MessageType.FOLLOW_GUIDE.getWsMethod(), C8481ah.class),
    HONOR_LEVEL_UP(MessageType.HONOR_LEVEL_UP.getWsMethod(), C8498ax.class),
    FREE_CELL_GIFT_MESSAGE(MessageType.FREE_CELL_GIFT_MESSAGE.getWsMethod(), C8483aj.class),
    DUTY_GIFT_MESSAGE(MessageType.DUTY_GIFT_MESSAGE.getWsMethod(), C8477ae.class),
    GUIDE_MESSAGE(MessageType.GUIDE_MESSAGE.getWsMethod(), C8493as.class),
    ASSET_MESSAGE(MessageType.ASSET_MESSAGE.getWsMethod(), C8472a.class),
    DOU_PLUS_MESSAGE(MessageType.DOU_PLUS_MESSAGE.getWsMethod(), C8475ac.class),
    IM_DELETE(MessageType.IM_DELETE.getWsMethod(), C8494at.class),
    LIVE_ECOM_MESSAGE(MessageType.LIVE_ECOM_MESSAGE.getWsMethod(), C8510bf.class),
    DOUYIN_OFFICIAL_TASK_INFO(MessageType.DOUYIN_OFFICIAL_TASK_INFO.getWsMethod(), C8528br.class),
    CEREMONY_MESSAGE(MessageType.CEREMONY_MESSAGE.getWsMethod(), C8679l.class),
    D_H5_Message(MessageType.D_H5_MESSAGE.getWsMethod(), C8527bq.class),
    GAME_GIFT_MESSAGE(MessageType.GAME_GIFT_MESSAGE.getWsMethod(), C8484ak.class),
    FRATERNITY_MESSAGE(MessageType.FRATERNITY_MESSAGE.getWsMethod(), C8482ai.class),
    DRIVE_GIFT_MESSAGE(MessageType.DRIVE_GIFT_MESSAGE.getWsMethod(), C8476ad.class),
    PORTAL_MESSAGE(MessageType.PORTAL_MESSAGE.getWsMethod(), C8522bp.class),
    LOTTERY_EVENT_MESSAGE(MessageType.LOTTERY_EVENT.getWsMethod(), LotteryEventMessage.class),
    QUIZ_START_MESSAGE(MessageType.QUIZ_START_MESSAGE.getWsMethod(), C8534bx.class),
    QUIZ_CHANGE_MESSAGE(MessageType.QUIZ_CHANGE_MESSAGE.getWsMethod(), C8531bu.class),
    QUIZ_RESULT_MESSAGE(MessageType.QUIZ_RESULT_MESSAGE.getWsMethod(), C8533bw.class),
    NOBLE_UPGRADE_MESSAGE(MessageType.NOBLE_UPGRADE_MESSAGE.getWsMethod(), C8518bm.class),
    NOBLE_TOAST_MESSAGE(MessageType.NOBLE_TOAST_MESSAGE.getWsMethod(), C8517bl.class),
    NOBLE_ENTER_LEAVE_MESSAGE(MessageType.NOBLE_ENTER_LEAVE_MESSAGE.getWsMethod(), C8516bk.class),
    BINDING_GIFT_MESSAGE(MessageType.BINDING_GIFT_MESSAGE.getWsMethod(), C8623f.class),
    BEGINNER_GUIDE_MESSAGE(MessageType.BEGINNER_GUIDE_MESSAGE.getWsMethod(), C8567d.class),
    GIFT_VOTE_MESSAGE(MessageType.GIFT_VOTE_MESSAGE.getWsMethod(), C8491aq.class),
    CHIJI_NOTICE_MESSAGE(MessageType.CHIJI_NOTICE_MESSAGE.getWsMethod(), C8681n.class),
    POPULAR_CARD_MESSAGE(MessageType.POPULAR_CARD_MESSAGE.getWsMethod(), C8520bo.class),
    OFFICIAL_ROOM_MESSAGE(MessageType.OFFICIAL_ROOM_MESSAGE.getWsMethod(), C8519bn.class),
    UPDATE_KOI_ROOM_STATUS_MESSAGE(MessageType.UPDATE_KOI_ROOM_STATUS_MESSAGE.getWsMethod(), C8554co.class),
    COMMON_POPUP_MESSAGE(MessageType.COMMON_POPUP_MESSAGE.getWsMethod(), C8685q.class),
    IN_ROOM_BANNER_REFRESH(MessageType.IN_ROOM_BANNER_REFRESH_MESSAGE.getWsMethod(), C8496av.class),
    CAR_SHOW_MESSAGE(MessageType.CAR_SHOW_MESSAGE.getWsMethod(), C8676i.class),
    CAR_SERIES_INFO_MESSAGE(MessageType.CAR_SERIES_INFO_MESSAGE.getWsMethod(), C8677j.class),
    CNY_A_TASK_MESSAGE(MessageType.CNY_A_TASK_MESSAGE.getWsMethod(), C8650g.class),
    CNY_REWARD_MESSAGE(MessageType.CNY_REWARD_MESSAGE.getWsMethod(), C8675h.class);
    
    private static final HashMap<String, LiveMessage> MESSAGE_MAP = null;
    private Class<? extends C8538c> messageClass;
    private C8538c messageObject;
    private String method;

    static {
        int i;
        LiveMessage[] values;
        MESSAGE_MAP = new HashMap<>();
        for (LiveMessage liveMessage : values()) {
            MESSAGE_MAP.put(liveMessage.method, liveMessage);
        }
    }

    public static Class<? extends C8538c> getMessageClass(String str) {
        if (MESSAGE_MAP.containsKey(str)) {
            return ((LiveMessage) MESSAGE_MAP.get(str)).messageClass;
        }
        return null;
    }

    public static C8538c getMessageObject(String str) {
        LiveMessage liveMessage = (LiveMessage) MESSAGE_MAP.get(str);
        if (liveMessage == null) {
            return null;
        }
        if (liveMessage.messageObject == null) {
            try {
                liveMessage.messageObject = (C8538c) liveMessage.messageClass.newInstance();
            } catch (IllegalAccessException | InstantiationException unused) {
            }
        }
        return liveMessage.messageObject;
    }

    private LiveMessage(String str, Class<? extends C8538c> cls) {
        this.method = str;
        this.messageClass = cls;
    }
}
