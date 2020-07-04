package com.p280ss.android.ugc.aweme.p313im.sdk.providedservices;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.os.Looper;
import android.support.p022v4.app.Fragment;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import bolts.C1592h;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.ugc.appcontext.C6405d;
import com.bytedance.p255e.C6326a;
import com.bytedance.p263im.core.model.C11438g;
import com.bytedance.p263im.core.model.C6417a;
import com.bytedance.p263im.core.model.C6425b;
import com.bytedance.p263im.core.model.Conversation;
import com.bytedance.p263im.core.model.Message;
import com.p280ss.android.agilelogger.ALog;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ugc.aweme.base.C6892b;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.framework.services.IUserService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.login.C7159e;
import com.p280ss.android.ugc.aweme.p313im.sdk.abtest.C6937c;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.C6944i;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.ChatRoomActivity;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.BaseContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.CommandShareContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.net.C6946a;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.selectmsg.C6951b;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.selectmsg.SelectChatMsgActivity;
import com.p280ss.android.ugc.aweme.p313im.sdk.comment.C6952a;
import com.p280ss.android.ugc.aweme.p313im.sdk.feedupdate.C6990a;
import com.p280ss.android.ugc.aweme.p313im.sdk.group.view.GroupInviteDialog;
import com.p280ss.android.ugc.aweme.p313im.sdk.model.C7007f;
import com.p280ss.android.ugc.aweme.p313im.sdk.model.UserStruct;
import com.p280ss.android.ugc.aweme.p313im.sdk.module.session.SessionListActivity;
import com.p280ss.android.ugc.aweme.p313im.sdk.module.session.SessionListFragment;
import com.p280ss.android.ugc.aweme.p313im.sdk.module.session.session.C7018d;
import com.p280ss.android.ugc.aweme.p313im.sdk.module.session.session.C7020e;
import com.p280ss.android.ugc.aweme.p313im.sdk.module.stranger.C7023c;
import com.p280ss.android.ugc.aweme.p313im.sdk.module.stranger.C7023c.C7024b;
import com.p280ss.android.ugc.aweme.p313im.sdk.notification.C7027a;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C31085i;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6956a;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6959c;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6961d;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6967g;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6978j;
import com.p280ss.android.ugc.aweme.p313im.sdk.p315g.C6993a;
import com.p280ss.android.ugc.aweme.p313im.sdk.p316h.C7003c;
import com.p280ss.android.ugc.aweme.p313im.sdk.p317j.C7006b;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.RelationSelectActivity;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.RelationSelectFragment;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.p318a.p319c.C7042c;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.p320b.C7048a;
import com.p280ss.android.ugc.aweme.p313im.sdk.share.C7056c;
import com.p280ss.android.ugc.aweme.p313im.sdk.share.p321a.C31807a.C7049a;
import com.p280ss.android.ugc.aweme.p313im.sdk.share.p321a.C7052b;
import com.p280ss.android.ugc.aweme.p313im.sdk.share.p321a.C7052b.C7053a;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31858ad;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7058be;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7058be.C7059a;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7063bg;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7073c;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7074e;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7075h;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7076p;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7077s;
import com.p280ss.android.ugc.aweme.p313im.service.C7091a;
import com.p280ss.android.ugc.aweme.p313im.service.C7093b;
import com.p280ss.android.ugc.aweme.p313im.service.C7101f;
import com.p280ss.android.ugc.aweme.p313im.service.C7103h;
import com.p280ss.android.ugc.aweme.p313im.service.IIMService;
import com.p280ss.android.ugc.aweme.p313im.service.model.C7104a;
import com.p280ss.android.ugc.aweme.p313im.service.model.C7105b;
import com.p280ss.android.ugc.aweme.p313im.service.model.C7106f;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMAdLog;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMContact;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMUser;
import com.p280ss.android.ugc.aweme.p313im.service.p322a.C7092b;
import com.p280ss.android.ugc.aweme.p313im.service.p323b.C7094a;
import com.p280ss.android.ugc.aweme.p313im.service.p324d.C7095a;
import com.p280ss.android.ugc.aweme.p313im.service.p325e.C7096a;
import com.p280ss.android.ugc.aweme.p313im.service.p325e.C7097b;
import com.p280ss.android.ugc.aweme.p313im.service.p325e.C7099c;
import com.p280ss.android.ugc.aweme.p313im.service.p326f.C7102a;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.router.C7203u;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage;
import com.p280ss.android.websocket.p344ws.p345b.C7305b;
import java.io.File;
import java.io.Serializable;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import kotlin.C7581n;
import kotlin.jvm.p357a.C7561a;
import org.greenrobot.eventbus.C7705c;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.providedservices.IMService */
public class IMService implements IIMService {
    private static IIMService inst;
    private C7093b abInterface;
    private C7094a inputMenuCustomizer;
    private int xplanStyle;

    public C7093b getAbInterface() {
        return this.abInterface;
    }

    public C7101f getIMErrorMonitor() {
        return C6944i.f19642b;
    }

    public C7094a getInputMenuCustomizer() {
        return this.inputMenuCustomizer;
    }

    public Class getSessionListActivityClass() {
        return SessionListActivity.class;
    }

    public boolean canShowLiveNotification() {
        return C7027a.m21856l();
    }

    public void clearIMNotification() {
        C7027a.f19815b.mo18135h();
    }

    public void ensureIMState() {
        C6967g.m21701d().mo18040b();
    }

    public void forceRefreshSessionList() {
        C6978j.m21717a().mo18057h();
    }

    public List<IMUser> getAllFollowIMUsers() {
        C6961d.m21657a();
        return C6961d.m21672c();
    }

    public List<IMUser> getAllFriends() {
        C6961d.m21657a();
        return C6961d.m21673d();
    }

    public File getAudioDownloadCachePath() {
        C6946a.m21606a();
        return C6946a.m21609c();
    }

    public C7096a getExperimentService() {
        return ImServiceProvider.INSTANCE.getExperimentService();
    }

    public C7305b getImParser() {
        return new C7006b();
    }

    public C7097b getRelationService() {
        return ImServiceProvider.INSTANCE.getRelationService();
    }

    public C7099c getShareService() {
        return ImServiceProvider.INSTANCE.getShareService();
    }

    public void hideIMNotification() {
        C7027a.f19815b.mo18133e();
    }

    public void hideLiveNotification() {
        C7027a.f19815b.mo18134f();
    }

    public boolean isInMainFeed() {
        return C7027a.m21854g();
    }

    public boolean isXPlanOpen() {
        return isXPlanB();
    }

    public void loadWcdbLibrary() {
        C6326a.m19641a("wcdb");
    }

    public void showLiveNotification() {
        C7027a.f19815b.mo18132d();
    }

    public static IIMService get() {
        return (IIMService) C6993a.m21773a(IIMService.class);
    }

    public boolean canFetchFollowListIdle() {
        return C7076p.m22077a().mo18335s();
    }

    public boolean clearAudioDownloadCache() {
        return C6946a.m21606a().mo18002b();
    }

    public void fetchFollowList() {
        if (C7074e.m22066a()) {
            C7042c.m21910b(1);
        }
    }

    public List<IMUser> getRecentIMUsers() {
        return C6961d.m21657a().mo18032e();
    }

    public boolean isAssociativeEmojiEnabled() {
        return C7076p.m22077a().mo18342z();
    }

    public boolean isNeedToContinuePlayInAct() {
        return C6956a.m21632a().mo18009f().isNeedToContinuePlayInAct();
    }

    public boolean isXPlanB() {
        if (this.xplanStyle <= 0 || this.xplanStyle >= 1001) {
            return false;
        }
        return true;
    }

    public void refreshLoginState() {
        C6944i.f19642b.mo17978c("refresh login");
        C6956a.m21632a().mo18007d();
    }

    public void resetLoginState() {
        C6944i.f19642b.mo17978c("switch account");
        C6956a.m21632a().mo18008e();
    }

    public static IIMService inst() {
        if (inst == null) {
            inst = get();
            StringBuilder sb = new StringBuilder("IMService.inst: IMService not initialized: ");
            sb.append(inst);
            C6921a.m21555a(sb.toString());
        }
        return inst;
    }

    public C7095a getRelationSelectFragment() {
        RelationSelectFragment relationSelectFragment = new RelationSelectFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("extra_no_title", Boolean.valueOf(true));
        relationSelectFragment.setArguments(bundle);
        return relationSelectFragment;
    }

    public C7095a getSessionListFragment() {
        int i;
        if (C6956a.m21632a().mo18009f() != null) {
            i = C6956a.m21632a().mo18009f().getXPlanStyle();
        } else {
            i = 0;
        }
        this.xplanStyle = i;
        return new SessionListFragment();
    }

    public boolean isImReduction() {
        if (!C6399b.m19945u() || C6937c.f19628b.mo17966a() != 1) {
            return false;
        }
        return true;
    }

    public void cacheRecentShareContact(IMContact iMContact) {
        C7049a.m21939b(iMContact);
    }

    public void openSessionListActivity(Context context) {
        SessionListActivity.m21803a(context);
    }

    public void setAbInterface(C7093b bVar) {
        this.abInterface = bVar;
    }

    public void setInputMenuCustomizer(C7094a aVar) {
        this.inputMenuCustomizer = aVar;
    }

    public void cleanUpdateTagCount(String str) {
        C6990a.m21758a().mo18073c(str);
    }

    public void deleteIMUser(String str) {
        C6961d.m21657a().mo18031c(str);
    }

    public void deleteNoticeSession(C7102a aVar) {
        C6978j.m21717a().mo18051b(aVar);
    }

    public void enableAssociativeEmoji(boolean z) {
        C7076p.m22077a().mo18310d(z);
    }

    public String getIMContactConversationId(IMContact iMContact) {
        return C6959c.m21649a(iMContact);
    }

    public String getIMContactUserId(IMContact iMContact) {
        return C6959c.m21654b(iMContact);
    }

    public boolean isXInstalled(Context context) {
        return C7063bg.m22049a(context);
    }

    public void updateNoticeSession(C7102a aVar) {
        C6978j.m21717a().mo18045a(aVar);
    }

    public void addGroupByPassword(String str) {
        C1592h.m7855a((Callable<TResult>) new IMService$$Lambda$4<TResult>(str), C1592h.f5958b);
    }

    public boolean checkGroupChatGuide(int i) {
        return C7076p.m22077a().mo18321g(i);
    }

    public void cleanFeedUpdateCount(String str) {
        if (!TextUtils.isEmpty(str)) {
            C6990a.m21758a().mo18073c(str);
        }
    }

    public boolean exitUser(String str) {
        if (C6961d.m21657a().mo18029b(str) != null) {
            return true;
        }
        return false;
    }

    public IMUser getIMUserByUid(String str) {
        return C6961d.m21657a().mo18029b(str);
    }

    public C7102a getNoticeSession(String str) {
        return C6978j.m21717a().mo18048b(str);
    }

    public int getUpdateTagCount(String str) {
        return C6990a.m21758a().mo18069a(str);
    }

    public void onFlipChatMsgBind(Bundle bundle) {
        if (bundle != null) {
            C7076p.m22077a().mo18303b(false);
            onFlipChatLastMsgUpdate(bundle);
        }
    }

    public void onFlipChatUnreadCountUpdate(Bundle bundle) {
        if (bundle != null) {
            onFlipChatUnreadConfigUpdate(bundle);
            C6978j.m21717a().mo18042a(bundle);
        }
    }

    public void setNeedToContinuePlayInAct(boolean z) {
        C6956a.m21632a().mo18009f().setNeedToContinueToPlay(z);
    }

    static final /* synthetic */ Void lambda$addGroupByPassword$5$IMService(String str) throws Exception {
        Activity g = C6405d.m19984g();
        if (g == null || TextUtils.isEmpty(str)) {
            return null;
        }
        new GroupInviteDialog(g, str, 1).show();
        return null;
    }

    public String getConversationId(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        C6956a.m21632a().mo18010g();
        return C6425b.m20076a(Long.valueOf(str).longValue());
    }

    public void showIMNotification(Boolean bool) {
        if (bool.booleanValue()) {
            C7027a.f19815b.mo18131c();
        } else {
            C7027a.f19815b.mo18130b();
        }
    }

    public void updateContactName(IMUser iMUser) {
        if (iMUser != null) {
            IMUser b = C6961d.m21657a().mo18029b(iMUser.getUid());
            if (b != null) {
                iMUser.setContactName(b.getContactName());
            }
        }
    }

    public void updateIMUser(final IMUser iMUser) {
        if (iMUser == null) {
            C6921a.m21555a("IMService.updateSimpleUser user = null");
            return;
        }
        if (iMUser.isBlock()) {
            iMUser.setFollowStatus(0);
        }
        C6726a.m20842a(new Runnable() {
            public void run() {
                if (iMUser.getAvatarThumb() == null) {
                    UserStruct userStruct = null;
                    try {
                        userStruct = (UserStruct) C7077s.m22142a().queryUser(iMUser.getUid(), C31085i.f81578a.mo81570b(iMUser)).get();
                    } catch (InterruptedException | ExecutionException unused) {
                    }
                    if (!(userStruct == null || userStruct.getUser() == null)) {
                        if (iMUser != null) {
                            userStruct.getUser().setFollowStatus(iMUser.getFollowStatus());
                        }
                        IMUser fromUser = IMUser.fromUser(userStruct.getUser());
                        IMService.this.updateContactName(fromUser);
                        C6961d.m21657a().mo18026a(fromUser);
                    }
                    return;
                }
                IMService.this.updateContactName(iMUser);
                C6961d.m21657a().mo18026a(iMUser);
            }
        });
    }

    private static boolean isExistHistoryMsg(IMUser iMUser) {
        Conversation a = C6417a.m20015a().mo15530a(C6425b.m20076a(Long.parseLong(iMUser.getUid())));
        if (a == null) {
            return false;
        }
        if (a.getLastMessage() == null && iMUser.getFollowStatus() == 0 && (iMUser.getType() == 4 || iMUser.getType() == -1)) {
            return false;
        }
        return true;
    }

    private void onFlipChatUnreadConfigUpdate(Bundle bundle) {
        long j = bundle.getLong("flip_chat_msg_last_unread_time");
        long j2 = bundle.getLong("flip_chat_msg_last_unread_dot_time");
        if (j <= C7076p.m22077a().mo18322h()) {
            bundle.putLong("flip_chat_msg_unread_count", 0);
        }
        if (j2 <= C7076p.m22077a().mo18324i()) {
            bundle.putLong("flip_chat_msg_unread_dot_count", 0);
        }
    }

    public void onFlipChatMsgUnbind(boolean z) {
        updateFlipChatConfig(false, "", 0);
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            C1592h.m7855a((Callable<TResult>) new Callable<Void>() {
                public Void call() {
                    C6978j.m21717a().mo18059j();
                    return null;
                }
            }, C1592h.f5958b);
        } else {
            C6978j.m21717a().mo18059j();
        }
        if (z) {
            C7077s.m22146a(2);
        }
    }

    public void updateIMUserFollowStatus(IMUser iMUser) {
        IMUser b = C6961d.m21657a().mo18029b(iMUser.getUid());
        if (b != null) {
            b.setFollowStatus(iMUser.getFollowStatus());
            b.setBlock(iMUser.isBlock());
            iMUser = b;
        }
        updateIMUser(iMUser);
    }

    public void onFlipChatConversationListFinish(Bundle bundle) {
        if (bundle != null) {
            long j = bundle.getLong("flip_chat_msg_last_unread_time");
            long j2 = bundle.getLong("flip_chat_msg_last_unread_dot_time");
            if (j > C7076p.m22077a().mo18322h()) {
                C7076p.m22077a().mo18300b(j);
            }
            if (j2 > C7076p.m22077a().mo18324i()) {
                C7076p.m22077a().mo18306c(j2);
            }
            bundle.putLong("flip_chat_msg_unread_count", 0);
            bundle.putLong("flip_chat_msg_unread_dot_count", 0);
            C6978j.m21717a().mo18042a(bundle);
        }
    }

    public void onFlipChatLastMsgUpdate(Bundle bundle) {
        if (bundle != null) {
            long j = bundle.getLong("flip_chat_msg_update_time");
            StringBuilder sb = new StringBuilder("onFlipChatLastMsgUpdate-updateTime=");
            sb.append(j);
            ALog.m20871e("im_flip_chat", sb.toString());
            StringBuilder sb2 = new StringBuilder("onFlipChatLastMsgUpdate-spTime=");
            sb2.append(C7076p.m22077a().mo18320g());
            ALog.m20871e("im_flip_chat", sb2.toString());
            String string = bundle.getString("flip_chat_msg_src_content");
            if (j > C7076p.m22077a().mo18320g() && !TextUtils.isEmpty(string)) {
                C7076p.m22077a().mo18292a(j);
                C7076p.m22077a().mo18303b(false);
            }
            onFlipChatUnreadConfigUpdate(bundle);
            C6978j.m21717a().mo18042a(bundle);
        }
    }

    public void commentReply(Context context, C7105b bVar) {
        C6952a.m21628a(context, bVar);
    }

    public void openX(Context context, int i) {
        C7063bg.m22039a(context, i);
    }

    public void wrapperIMShareText(Context context, TextView textView) {
        C7063bg.m22043a(context, textView);
    }

    public void wrapperSendMessageSyncXIcon(RemoteImageView remoteImageView, int i) {
        C7063bg.m22047a(remoteImageView, i);
    }

    public boolean startChat(Context context, IMUser iMUser) {
        return startChat(context, iMUser, 0);
    }

    static final /* synthetic */ void lambda$showShareDialog$2$IMService(C6892b bVar, String str) {
        if (bVar != null) {
            bVar.run(Boolean.valueOf(false));
        }
    }

    public void addSessionListFragmentHeader(Fragment fragment, View view) {
        if (fragment instanceof SessionListFragment) {
            ((SessionListFragment) fragment).mo18101a(view);
        }
    }

    public List<IMUser> searchFollowIMUser(List<IMUser> list, String str) {
        return C6961d.m21657a().mo18023a(list, str);
    }

    public void markSessionInMsgHelperRead(int i, int i2) {
        C7076p.m22077a().mo18291a(Math.max(0, C7076p.m22077a().mo18298b() - i2));
        C6978j.m21717a().mo18057h();
    }

    public void onFlipChatPushMsgUpdate(String str, long j) {
        if (!TextUtils.isEmpty(str) && j > 0) {
            updateFlipChatConfig(true, str, j);
            Bundle bundle = new Bundle();
            bundle.putLong("flip_chat_msg_unread_count", 0);
            bundle.putLong("flip_chat_msg_unread_dot_count", 0);
            bundle.putString("flip_chat_msg_content", str);
            bundle.putLong("flip_chat_msg_update_time", j);
            C6978j.m21717a().mo18042a(bundle);
        }
    }

    public void onNewNoticeArrived(int i, final Bundle bundle) {
        if (i == 1) {
            C7023c.m21847a().mo18122a((C7024b) new C7024b() {
                public void onFetch(C7020e eVar) {
                    if (eVar != null) {
                        C7018d a = C7018d.m21837a(eVar);
                        a.f19946j = bundle.getInt("unread_count");
                        C6978j.m21717a().mo18045a((C7102a) a);
                        return;
                    }
                    C6978j.m21717a().mo18046a("stranger_1");
                }
            });
        } else if (i == 3) {
            C6978j.m21717a().mo18045a((C7102a) C7018d.m21836a(bundle));
        } else {
            if (i == 4) {
                C7705c.m23799a().mo20394d(new C7007f());
            }
        }
    }

    public boolean startChat(final Context context, final IMContact iMContact) {
        if (iMContact == null) {
            C6921a.m21555a("IMService.startChat contact = null");
            return false;
        } else if (!((IUserService) ServiceManager.get().getService(IUserService.class)).isLogin()) {
            C7159e.m22356a((Activity) context);
            return false;
        } else {
            C6959c.m21655b(context, iMContact, new C7561a<C7581n>() {
                public C7581n invoke() {
                    IMUser a = C6961d.m21661a(iMContact);
                    if (a != null) {
                        ChatRoomActivity.m21589a(context, a, 6);
                        String a2 = C6425b.m20076a(Long.valueOf(a.getUid()).longValue());
                        C31858ad.m103406a();
                        C31858ad.m103432a(a2, a.getUid(), "private", "share_toast", "");
                    }
                    return null;
                }
            });
            return true;
        }
    }

    public void commandShareVideo(final Context context, final C7104a aVar) {
        final IMUser iMUser;
        CommandShareContent obtain = CommandShareContent.obtain(aVar);
        if (aVar.f19958f != null) {
            iMUser = aVar.f19958f;
        } else {
            iMUser = C6961d.m21657a().mo18029b(aVar.f19956d);
        }
        if (iMUser == null || isExistHistoryMsg(iMUser)) {
            if (iMUser != null) {
                C7058be.m21980a().mo18263a(iMUser.getUid(), (BaseContent) obtain);
            }
            C7195s a = C7195s.m22438a();
            StringBuilder sb = new StringBuilder("aweme://aweme/detail/");
            sb.append(aVar.f19953a);
            a.mo18682a(C7203u.m22460a(sb.toString()).mo18694a("from_uid", aVar.f19956d).mo18695a());
            return;
        }
        C7058be.m21980a().mo18264a(iMUser.getUid(), (BaseContent) obtain, (C7059a) new C7059a() {
            public void onSendFailure(C11438g gVar) {
            }

            public void onSendSuccess(Message message) {
            }

            public void onSend(Conversation conversation, List<Message> list) {
                C31858ad.m103406a();
                C31858ad.m103432a(conversation.getConversationId(), iMUser.getUid(), "private", "token", "");
                ChatRoomActivity.m21592a(context, iMUser, 1, aVar.f19956d);
            }
        });
    }

    public void wrapperSyncXBlockWithDialog(Context context, boolean z, OnClickListener onClickListener) {
        C7063bg.m22045a(context, z, onClickListener);
    }

    public void wrapperChatWithSyncXAlert(final Activity activity, final IMUser iMUser, final int i) {
        C7063bg.m22034a(activity, iMUser, i, (Runnable) new Runnable() {
            public void run() {
                if (i == 2) {
                    IMService.this.startChat(activity, iMUser, 5);
                } else if (i == 3) {
                    IMService.this.startChat(activity, iMUser, 10);
                } else {
                    IMService.this.startChat((Context) activity, iMUser);
                }
            }
        });
    }

    public void wrapperIMShareIcon(Context context, RemoteImageView remoteImageView, int i) {
        C7056c.m21974a((Runnable) new IMService$$Lambda$2(context, remoteImageView, i));
    }

    public void wrapperShareToX(Activity activity, Bundle bundle, int i) {
        if (bundle != null) {
            C7063bg.m22035a(activity, bundle.get("share_package"), i);
        }
    }

    private void updateFlipChatConfig(boolean z, String str, long j) {
        C7076p.m22077a().mo18292a(0);
        C7076p.m22077a().mo18303b(false);
        C7076p.m22077a().mo18300b(0);
        C7076p.m22077a().mo18306c(0);
        C7076p.m22077a().mo18308c(z);
        C7076p.m22077a().mo18301b(str);
        C7076p.m22077a().mo18309d(j);
    }

    public void enterChooseContact(Context context, Bundle bundle, C6892b<Boolean> bVar) {
        if (!((IUserService) ServiceManager.get().getService(IUserService.class)).isLogin()) {
            C7159e.m22356a((Activity) context);
            return;
        }
        if (bundle != null) {
            int i = bundle.getInt("key_share_type", -1);
            if (i == 8) {
                wrapperShareToX(C6405d.m19984g(), bundle, i);
                return;
            }
        }
        RelationSelectActivity.m21881a(context, bundle, bVar);
    }

    public void initialize(Application application, C7091a aVar, C7103h hVar) {
        int i;
        inst = this;
        if (aVar != null) {
            C7075h.f19903b = aVar.f19935e;
            C7075h.f19902a = aVar.f19932b;
            C7075h.f19906e = aVar.f19934d;
            C7075h.f19905d = aVar.f19933c;
        }
        C7073c.m22060a(aVar);
        if (hVar != null) {
            i = hVar.getXPlanStyle();
        } else {
            i = 0;
        }
        this.xplanStyle = i;
        C6956a.m21632a().mo18006a(application, aVar, hVar);
    }

    public boolean startChatWithAdLog(Context context, IMUser iMUser, IMAdLog iMAdLog) {
        if (iMUser == null) {
            C6921a.m21555a("IMService.startChat user = null");
            return false;
        } else if (!((IUserService) ServiceManager.get().getService(IUserService.class)).isLogin()) {
            C7159e.m22356a((Activity) context);
            return false;
        } else {
            ChatRoomActivity.m21594a(context, iMUser, iMAdLog);
            return true;
        }
    }

    public boolean startChatWithExt(Context context, IMUser iMUser, Serializable serializable) {
        if (iMUser == null) {
            C6921a.m21555a("IMService.startChat user = null");
            return false;
        } else if (!((IUserService) ServiceManager.get().getService(IUserService.class)).isLogin()) {
            C7159e.m22356a((Activity) context);
            return false;
        } else {
            ChatRoomActivity.m21595a(context, iMUser, serializable);
            return true;
        }
    }

    public boolean startChat(Context context, IMUser iMUser, int i) {
        if (iMUser == null) {
            C6921a.m21555a("IMService.startChat user = null");
            return false;
        } else if (((IUserService) ServiceManager.get().getService(IUserService.class)).isLogin()) {
            return ChatRoomActivity.m21589a(context, iMUser, i);
        } else {
            C7159e.m22356a((Activity) context);
            return false;
        }
    }

    public void shareSingleMsg(Context context, IMContact iMContact, SharePackage sharePackage, C6892b<Boolean> bVar) {
        C7052b.m21946a(context, iMContact, sharePackage, bVar);
    }

    public void wrapperSyncXAlert(Context context, int i, boolean z, Runnable runnable) {
        C7063bg.m22041a(context, i, z, runnable);
    }

    public void wrapperSyncXStory(Activity activity, C7106f fVar, int i, C7092b bVar) {
        C7063bg.m22036a(activity, (Object) fVar, i, bVar);
    }

    public String convertSearchKeyword(String str, String str2, String str3, String str4) {
        return C7048a.m21924a(str, str2, str3, str4);
    }

    static final /* synthetic */ void lambda$null$0$IMService(SharePackage sharePackage, IMUser iMUser, String str, C6892b bVar) {
        C7052b.m21956a(sharePackage, iMUser, str);
        if (bVar != null) {
            bVar.run(Boolean.valueOf(true));
        }
    }

    public void storyMessageReply(Context context, Bundle bundle, Runnable runnable, Runnable runnable2) {
        if (bundle != null) {
            SharePackage sharePackage = (SharePackage) bundle.get("share_package");
            if (sharePackage != null) {
                C7003c.m21796a(context, sharePackage, runnable, runnable2);
            }
        }
    }

    public void showShareDialog(Activity activity, SharePackage sharePackage, IMUser iMUser, C6892b<Boolean> bVar) {
        Activity activity2 = activity;
        SharePackage sharePackage2 = sharePackage;
        C7052b.m21949a((Context) activity2, sharePackage2, new IMUser[]{iMUser}, "", (C7053a) new IMService$$Lambda$0(activity, sharePackage, iMUser, bVar), (C7053a) new IMService$$Lambda$1(bVar));
    }

    public void wrapperChatWithSyncXAlert(final Activity activity, final IMUser iMUser, int i, final IMAdLog iMAdLog) {
        C7063bg.m22034a(activity, iMUser, i, (Runnable) new Runnable() {
            public void run() {
                ChatRoomActivity.m21591a(activity, iMUser, 5, iMAdLog, null);
            }
        });
    }

    public boolean startChatWithAdLog(Context context, IMUser iMUser, IMAdLog iMAdLog, Serializable serializable) {
        if (iMUser == null) {
            C6921a.m21555a("IMService.startChat user = null");
            return false;
        } else if (!((IUserService) ServiceManager.get().getService(IUserService.class)).isLogin()) {
            C7159e.m22356a((Activity) context);
            return false;
        } else {
            ChatRoomActivity.m21591a(context, iMUser, 5, iMAdLog, serializable);
            return true;
        }
    }

    public void wrapperSyncXAlert(Context context, int i, boolean z, Runnable runnable, C7092b bVar) {
        C7063bg.m22042a(context, i, z, runnable, bVar);
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void lambda$wrapperVideoShareBtnImIconAndText$4$IMService(RemoteImageView remoteImageView, C6892b bVar, Context context, int i, Boolean bool) {
        if (bool.booleanValue()) {
            C7049a.m21937a(remoteImageView);
            if (bVar != null) {
                bVar.run("");
            }
        } else {
            wrapperIMShareIcon(context, remoteImageView, i);
        }
    }

    public void startSelectChatMsg(Context context, String str, IMUser iMUser, int i, String str2) {
        int i2;
        if (i == 1) {
            Bundle bundle = new Bundle();
            bundle.putInt("select_msg_type", i);
            if (TextUtils.isEmpty(str2)) {
                C6951b.m21627d(str);
            }
            if (!TextUtils.isEmpty(str)) {
                if (iMUser != null) {
                    bundle.putSerializable("simple_uesr", iMUser);
                }
                Integer a = C6951b.m21621a(str);
                if (a == null) {
                    i2 = 0;
                } else {
                    i2 = a.intValue();
                }
                SelectChatMsgActivity.m21618a(context, str, i2, bundle);
            }
        }
    }

    public void wrapperVideoShareBtnImIconAndText(boolean z, Context context, RemoteImageView remoteImageView, TextView textView, int i, C6892b<String> bVar) {
        if (C7049a.m21940b()) {
            IMService$$Lambda$3 iMService$$Lambda$3 = new IMService$$Lambda$3(this, remoteImageView, bVar, context, i);
            C7049a.m21938a(z, iMService$$Lambda$3);
            return;
        }
        wrapperIMShareIcon(context, remoteImageView, i);
    }
}
