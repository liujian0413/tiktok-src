package com.p280ss.android.ugc.aweme.p313im.sdk.utils;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.p263im.core.internal.p590db.C11377s;
import com.bytedance.p263im.core.model.C11443k;
import com.bytedance.p263im.core.model.C6425b;
import com.bytedance.p263im.core.model.Message;
import com.bytedance.p263im.core.p584a.C11198c;
import com.bytedance.p263im.core.p584a.C11202d.C11203a;
import com.bytedance.p263im.core.p584a.p585a.C11195b;
import com.bytedance.p263im.core.proto.GroupRole;
import com.p280ss.android.ugc.aweme.app.C22912d;
import com.p280ss.android.ugc.aweme.feed.experiment.DouPlusShareGuideExperiment;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.MessageViewType;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.AudioContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.BaseContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.CommandShareContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.CommentContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.CommonRedEnvelopeContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.EPlatformCardContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.EmojiContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.GroupInviteContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.GroupNoticeContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.OnlyPictureContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.SayHelloContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.SelfStoryReplyContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.ShareAwemeContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.ShareChallengeContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.ShareCompilationContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.ShareCouponContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.ShareGoodContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.ShareGoodWindowContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.ShareLiveContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.ShareMiniAppContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.ShareMusicContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.SharePictureContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.SharePoiContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.ShareRankingListContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.ShareStickerContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.ShareUserContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.ShareWebContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.StickerEmojiContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.StoryPictureContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.StoryReplyContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.StoryVideoContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.SystemContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.TextContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.VideoRedEnvelopeContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.VideoRedEnvelopeNewYearContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.VideoUpdateTipsContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6956a;
import com.p280ss.android.vesdk.filterparam.VETransitionFilterParam;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.utils.ai */
public final class C31863ai {

    /* renamed from: a */
    private static long f83330a;

    /* renamed from: a */
    public static int m103525a() {
        if (C31915n.m103671a()) {
            return 6000;
        }
        return VETransitionFilterParam.TransitionDuration_DEFAULT;
    }

    /* renamed from: b */
    public static void m103532b() {
        C11198c.m32777a();
        if (C11198c.m32780a(C31915n.m103671a() ^ true ? 1 : 0) && SystemClock.uptimeMillis() - f83330a > 10000) {
            f83330a = SystemClock.uptimeMillis();
            C11198c.m32777a().mo27249b(4);
        }
    }

    /* renamed from: c */
    public static void m103534c() {
        C11198c.m32777a();
        if (C11198c.m32780a(C31915n.m103671a() ^ true ? 1 : 0) && SystemClock.uptimeMillis() - f83330a > 2000) {
            f83330a = SystemClock.uptimeMillis();
            C11198c.m32777a().mo27249b(3);
        }
    }

    /* renamed from: d */
    public static void m103537d() {
        C11198c.m32777a();
        if (C11198c.m32780a(C31915n.m103671a() ^ true ? 1 : 0) && SystemClock.uptimeMillis() - f83330a > DouPlusShareGuideExperiment.MIN_VALID_DURATION) {
            f83330a = SystemClock.uptimeMillis();
            C11198c.m32777a().mo27252e();
        }
    }

    /* renamed from: a */
    public static void m103529a(Message message) {
        if (message != null) {
            C11443k.m33755e(message);
        }
    }

    /* renamed from: b */
    public static void m103533b(Message message) {
        if (message != null) {
            C11443k.m33753d(message);
        }
    }

    /* renamed from: c */
    public static void m103535c(Message message) {
        m103530a(message, null);
    }

    /* renamed from: d */
    public static long m103536d(Message message) {
        if (message == null) {
            return -1;
        }
        try {
            return Long.valueOf((String) message.getExt().get("old_client_message_id")).longValue();
        } catch (Exception unused) {
            return -1;
        }
    }

    /* renamed from: e */
    public static boolean m103538e(Message message) {
        Map ext = message.getExt();
        if (ext == null || !ext.containsKey("source_aid")) {
            return false;
        }
        return TextUtils.equals((CharSequence) ext.get("source_aid"), "1349");
    }

    /* renamed from: f */
    public static boolean m103539f(Message message) {
        if (message.getMsgType() != 1002) {
            return false;
        }
        boolean j = m103543j(message);
        if (j) {
            C11443k.m33746a(message, true);
        }
        return j;
    }

    /* renamed from: j */
    private static boolean m103543j(Message message) {
        boolean z = false;
        if (message == null) {
            return false;
        }
        if (message.getMsgType() == 1002) {
            try {
                if (((SayHelloContent) MessageViewType.content(message)).getType() == 100200) {
                    z = true;
                }
            } catch (Exception unused) {
                return false;
            }
        }
        return z;
    }

    /* renamed from: i */
    public static boolean m103542i(Message message) {
        if (message == null) {
            return false;
        }
        Map localExt = message.getLocalExt();
        if (localExt == null || !localExt.containsKey("s:send_response_check_code")) {
            return true;
        }
        return TextUtils.equals("0", (String) localExt.get("s:send_response_check_code"));
    }

    /* renamed from: g */
    public static boolean m103540g(Message message) {
        if (message.getConversationType() == C11203a.f30381b && message.isRecalled() && message.getExt() != null && message.getExt().containsKey("s:recall_role")) {
            String str = (String) message.getExt().get("s:recall_role");
            if (!TextUtils.isEmpty(str)) {
                int intValue = Integer.valueOf(str).intValue();
                if (intValue == GroupRole.OWNER.getValue() || intValue == GroupRole.MANAGER.getValue()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: h */
    public static String m103541h(Message message) {
        String str = "";
        int msgType = message.getMsgType();
        if (msgType != 2) {
            if (msgType == 5) {
                BaseContent content = MessageViewType.content(message);
                if (content.getType() == 501) {
                    return "favoriate_emoji";
                }
                if (content.getType() == 502) {
                    return "giphy";
                }
                return "emoji";
            } else if (msgType == 17) {
                return "audio";
            } else {
                if (msgType != 27) {
                    if (msgType == 30) {
                        return "video";
                    }
                    switch (msgType) {
                        case 7:
                            return "text";
                        case 8:
                            break;
                        default:
                            switch (msgType) {
                                case 71:
                                case 72:
                                    break;
                                default:
                                    return str;
                            }
                    }
                    return "share";
                }
            }
        }
        return "pic";
    }

    /* renamed from: a */
    public static String m103528a(String str) {
        String str2 = "";
        if (TextUtils.equals(str, "aweme")) {
            return "video";
        }
        if (TextUtils.equals(str, "pic")) {
            return "pic";
        }
        if (TextUtils.equals(str, "gif")) {
            return "gif";
        }
        if (TextUtils.equals(str, "text")) {
            return "text";
        }
        if (TextUtils.equals(str, "music")) {
            return "music_card";
        }
        if (TextUtils.equals(str, "poi")) {
            return "poi_card";
        }
        if (TextUtils.equals(str, "challenge")) {
            return "tag_card";
        }
        if (TextUtils.equals(str, "ranking")) {
            return "hot_search_card";
        }
        if (TextUtils.equals(str, "game")) {
            return "game";
        }
        if (TextUtils.equals(str, "user")) {
            return "profile";
        }
        if (TextUtils.equals(str, "live")) {
            return "live";
        }
        if (TextUtils.equals(str, "web")) {
            return C22912d.f60641a;
        }
        if (TextUtils.equals(str, "coupon")) {
            return "poi_coupon";
        }
        return str2;
    }

    /* renamed from: a */
    public static int m103526a(BaseContent baseContent) {
        String str;
        if (baseContent instanceof TextContent) {
            return 7;
        }
        if (baseContent instanceof SystemContent) {
            return 1;
        }
        if (baseContent instanceof SharePictureContent) {
            return 12;
        }
        if (baseContent instanceof ShareMusicContent) {
            return 22;
        }
        if (baseContent instanceof ShareAwemeContent) {
            return 8;
        }
        if (baseContent instanceof CommandShareContent) {
            return 13;
        }
        if (baseContent instanceof StoryPictureContent) {
            return 27;
        }
        if (baseContent instanceof OnlyPictureContent) {
            return 2;
        }
        if (baseContent instanceof EmojiContent) {
            if (baseContent instanceof StickerEmojiContent) {
                return 51;
            }
            return 5;
        } else if (baseContent instanceof VideoUpdateTipsContent) {
            return 14;
        } else {
            if (baseContent instanceof CommentContent) {
                return 16;
            }
            if (baseContent instanceof AudioContent) {
                return 17;
            }
            if (baseContent instanceof SharePoiContent) {
                return 20;
            }
            if (baseContent instanceof ShareCouponContent) {
                return 28;
            }
            if (baseContent instanceof ShareRankingListContent) {
                if (baseContent.getType() == 2301) {
                    return 23;
                }
                return 18;
            } else if (baseContent instanceof ShareChallengeContent) {
                return 19;
            } else {
                if (baseContent instanceof ShareMiniAppContent) {
                    return 24;
                }
                if (baseContent instanceof ShareLiveContent) {
                    return 21;
                }
                if (baseContent instanceof ShareUserContent) {
                    return 25;
                }
                if (baseContent instanceof ShareWebContent) {
                    return 26;
                }
                if (baseContent instanceof StoryVideoContent) {
                    return 30;
                }
                if (baseContent instanceof StoryReplyContent) {
                    return 32;
                }
                if (baseContent instanceof CommonRedEnvelopeContent) {
                    return 35;
                }
                if (baseContent instanceof VideoRedEnvelopeContent) {
                    return 36;
                }
                if (baseContent instanceof VideoRedEnvelopeNewYearContent) {
                    return 38;
                }
                if (baseContent instanceof SelfStoryReplyContent) {
                    return 53;
                }
                if (baseContent instanceof ShareGoodContent) {
                    return 61;
                }
                if (baseContent instanceof ShareGoodWindowContent) {
                    return 62;
                }
                if (baseContent instanceof EPlatformCardContent) {
                    return 70;
                }
                if (baseContent instanceof GroupInviteContent) {
                    return 58;
                }
                if (baseContent instanceof GroupNoticeContent) {
                    return 1001;
                }
                if (baseContent instanceof ShareCompilationContent) {
                    return 71;
                }
                if (baseContent instanceof ShareStickerContent) {
                    return 72;
                }
                if (!C6956a.m21632a().f19661a.f19931a) {
                    HashMap hashMap = new HashMap();
                    String str2 = "error";
                    if (baseContent != null) {
                        try {
                            str = C31913m.m103668a(baseContent);
                        } catch (Exception e) {
                            hashMap.put("error", e.getMessage());
                        }
                    } else {
                        str = "";
                    }
                    hashMap.put(str2, str);
                    C7074e.m22065a("error_msg_content", hashMap);
                    return -1;
                }
                throw new IllegalArgumentException("Message Type is NONE!!!");
            }
        }
    }

    /* renamed from: a */
    public static Message m103527a(Message message, List<String> list) {
        if (list == null || list.isEmpty()) {
            return message;
        }
        message.getExt().put("s:mentioned_users", C11377s.m33466a(list, ","));
        return message;
    }

    /* renamed from: a */
    public static boolean m103531a(Message message, BaseContent baseContent) {
        if (baseContent == null || message == null || message.getExt() == null || !TextUtils.equals((CharSequence) message.getExt().get("awe:from:commerce"), "1")) {
            return false;
        }
        int msgType = message.getMsgType();
        if (msgType == 70 || (msgType == 26 && baseContent.isCard)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m103530a(Message message, C11195b<Message> bVar) {
        String str;
        long currentTimeMillis = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        sb.append(currentTimeMillis);
        message.getLocalExt().put("send_sdk_time", sb.toString());
        if (message != null) {
            Map ext = message.getExt();
            if (!ext.containsKey("old_client_message_id")) {
                ext.put("old_client_message_id", String.valueOf(C31906g.m103644a()));
            }
            if (C7074e.m22068a(String.valueOf(C6425b.m20074a(message.getConversationId())))) {
                if (7 == message.getMsgType()) {
                    str = "message";
                } else if (5 == message.getMsgType() || 2 == message.getMsgType()) {
                    str = "chat_pic";
                } else {
                    str = "insite_share";
                }
                C31858ad.m103406a();
                C31858ad.m103455c(str);
                message.setMsgStatus(2);
            }
            if (message.getLocalExt().get("send_time") != null) {
                try {
                    long currentTimeMillis2 = System.currentTimeMillis() - Long.parseLong((String) message.getLocalExt().get("send_time"));
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(currentTimeMillis2);
                    message.getLocalExt().put("send_app_consume_time", sb2.toString());
                } catch (NumberFormatException unused) {
                }
            }
            C11443k.m33745a(message, bVar);
        }
    }
}
