package com.p280ss.android.ugc.aweme.p313im.sdk.chat;

import android.app.Activity;
import android.arch.lifecycle.C0052o;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.support.p029v7.widget.RecyclerView.LayoutParams;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.PopupWindow.OnDismissListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.DmtButton;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.ugc.appcontext.C6405d;
import com.bytedance.ies.uikit.p577b.C11002c;
import com.bytedance.p263im.core.model.C11438g;
import com.bytedance.p263im.core.model.C11443k;
import com.bytedance.p263im.core.model.C6417a;
import com.bytedance.p263im.core.model.C6425b;
import com.bytedance.p263im.core.model.Conversation;
import com.bytedance.p263im.core.model.Message;
import com.bytedance.p263im.core.p584a.p585a.C11195b;
import com.bytedance.router.SmartRouter;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.emoji.model.Emoji;
import com.p280ss.android.ugc.aweme.emoji.p1206d.C27536b;
import com.p280ss.android.ugc.aweme.emoji.p1207e.C27554a;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.framework.services.IFollowService;
import com.p280ss.android.ugc.aweme.framework.services.IFollowService.IFollowCallback;
import com.p280ss.android.ugc.aweme.framework.services.IUserService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.p313im.sdk.abtest.C6928b;
import com.p280ss.android.ugc.aweme.p313im.sdk.abtest.C6943d;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.audio.C30770c;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.audio.C30793j;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.photo.PhotoDetailActivity;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.BaseContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.CommentContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.EmojiContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.GroupInviteContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.OnlyPictureContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.SayHelloContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.SelfStoryReplyContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.ShareAwemeContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.ShareCompilationContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.ShareGoodContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.ShareGoodWindowContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.ShareLiveContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.ShareMiniAppContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.ShareMusicContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.ShareRankingListContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.ShareStickerContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.ShareUserContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.ShareWebContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.StoryPictureContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.StoryReplyContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.StoryVideoContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.SystemContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.TextContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.VideoUpdateTipsContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.net.C30927b;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.net.C30963v;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.net.C6946a;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.net.video.C30973g;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.p1315b.C30733a;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.selectmsg.C30997a;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder.BaseRedEnvelopeHolder;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder.BaseViewHolder;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder.C31024d;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder.LoadMoreViewHolder;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder.VoiceMessageViewHolder;
import com.p280ss.android.ugc.aweme.p313im.sdk.feedupdate.C6990a;
import com.p280ss.android.ugc.aweme.p313im.sdk.feedupdate.VideoTag;
import com.p280ss.android.ugc.aweme.p313im.sdk.group.view.GroupInviteDialog;
import com.p280ss.android.ugc.aweme.p313im.sdk.model.UserStruct;
import com.p280ss.android.ugc.aweme.p313im.sdk.msgdetail.C31544a.C31545a;
import com.p280ss.android.ugc.aweme.p313im.sdk.msgdetail.DragViewInfo;
import com.p280ss.android.ugc.aweme.p313im.sdk.msgdetail.MediaBrowserActivity;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C31085i;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6956a;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6961d;
import com.p280ss.android.ugc.aweme.p313im.sdk.p316h.C31328a;
import com.p280ss.android.ugc.aweme.p313im.sdk.p316h.C31330b;
import com.p280ss.android.ugc.aweme.p313im.sdk.p316h.C7003c;
import com.p280ss.android.ugc.aweme.p313im.sdk.providedservices.IMService;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.RelationSelectActivity;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31858ad;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31863ai;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31867am;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31876av;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31891bc;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31905f;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31907i;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31913m;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31915n;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7058be;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7063bg;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7074e;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7076p;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7077s;
import com.p280ss.android.ugc.aweme.p313im.sdk.videofileplay.VideoFilePlayerActivity;
import com.p280ss.android.ugc.aweme.p313im.sdk.widget.C31991f;
import com.p280ss.android.ugc.aweme.p313im.sdk.widget.DragView.IViewInfo;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMUser;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.router.C7203u;
import com.p280ss.android.ugc.aweme.story.api.C41974f;
import com.p280ss.android.ugc.aweme.story.api.model.DetailParams;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutionException;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.MessageAdapter */
public class MessageAdapter extends C30730a implements C31328a {

    /* renamed from: c */
    public C11443k f80391c;

    /* renamed from: d */
    public List<Message> f80392d;

    /* renamed from: e */
    public C31991f f80393e;

    /* renamed from: f */
    public C11002c f80394f;

    /* renamed from: g */
    public C30770c f80395g;

    /* renamed from: h */
    public Message f80396h;

    /* renamed from: i */
    public Message f80397i;

    /* renamed from: j */
    public boolean f80398j = true;

    /* renamed from: k */
    public SessionInfo f80399k;

    /* renamed from: l */
    public C30631c f80400l;

    /* renamed from: m */
    public C30630b f80401m;

    /* renamed from: n */
    private int f80402n;

    /* renamed from: o */
    private LoadMoreViewHolder f80403o;

    /* renamed from: p */
    private OnClickListener f80404p;

    /* renamed from: q */
    private C30997a f80405q;

    /* renamed from: r */
    private OnLongClickListener f80406r;

    /* renamed from: s */
    private C30793j f80407s;

    /* renamed from: t */
    private Handler f80408t;

    /* renamed from: u */
    private IMUser f80409u;

    /* renamed from: v */
    private boolean f80410v;

    /* renamed from: w */
    private Message f80411w;

    /* renamed from: x */
    private Message f80412x;

    /* renamed from: y */
    private int f80413y;

    /* renamed from: z */
    private C0052o<List<Message>> f80414z;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.MessageAdapter$a */
    class C30627a implements Runnable {

        /* renamed from: a */
        public Message f80442a;

        public final void run() {
            final String str;
            BaseContent content = MessageViewType.content(this.f80442a);
            if (content instanceof ShareUserContent) {
                str = ((ShareUserContent) content).getUid();
            } else if (content instanceof ShareAwemeContent) {
                str = ((ShareAwemeContent) content).getUser();
            } else if (content instanceof ShareLiveContent) {
                str = ((ShareLiveContent) content).getRoomOwnerId();
            } else {
                str = null;
            }
            if (content != null && !TextUtils.isEmpty(str)) {
                C31858ad.m103406a();
                C31858ad.m103424a(MessageAdapter.this.f80399k.getConversationId(), str);
                C31858ad.m103406a();
                C31858ad.m103420a(MessageAdapter.this.f80399k.getConversationId());
                ((IFollowService) ServiceManager.get().getService(IFollowService.class)).sendRequest(str, 1, new IFollowCallback() {
                    public final void onFollowSuccess() {
                        if (MessageAdapter.this.f80473b.indexOf(C30627a.this.f80442a) >= 0) {
                            BaseContent content = MessageViewType.content(C30627a.this.f80442a);
                            if (content instanceof ShareAwemeContent) {
                                IMUser a = C6961d.m21658a((ShareAwemeContent) content);
                                a.setFollowStatus(1);
                                C6961d.m21657a().mo18026a(a);
                            } else if (content instanceof ShareUserContent) {
                                IMUser a2 = C6961d.m21660a((ShareUserContent) content);
                                a2.setFollowStatus(1);
                                C6961d.m21657a().mo18026a(a2);
                            } else if (content instanceof ShareLiveContent) {
                                IMUser a3 = C6961d.m21659a((ShareLiveContent) content);
                                a3.setFollowStatus(1);
                                C6961d.m21657a().mo18026a(a3);
                            }
                            MessageAdapter.this.mo18065c();
                            C6726a.m20842a(new Runnable() {
                                public final void run() {
                                    UserStruct userStruct;
                                    try {
                                        userStruct = (UserStruct) C7077s.m22142a().queryUser(str, C31085i.f81578a.mo81568a(C6961d.m21657a().mo18029b(str), str)).get();
                                    } catch (InterruptedException | ExecutionException unused) {
                                        userStruct = null;
                                    }
                                    if (userStruct != null && userStruct.getUser() != null) {
                                        C6961d.m21657a().mo18026a(IMUser.fromUser(userStruct.getUser()));
                                    }
                                }
                            });
                            if (MessageAdapter.this.f80472a != null) {
                                C9738o.m28693a(MessageAdapter.this.f80472a.getContext(), (int) R.string.bjm);
                            }
                        }
                    }

                    public final void onFollowFailed(Exception exc) {
                        if (MessageAdapter.this.f80472a != null) {
                            C9738o.m28693a(MessageAdapter.this.f80472a.getContext(), (int) R.string.br0);
                        }
                    }
                });
            }
        }

        public C30627a(Message message) {
            this.f80442a = message;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.MessageAdapter$b */
    interface C30630b {
        /* renamed from: a */
        void mo80404a(String str);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.MessageAdapter$c */
    interface C30631c {
        /* renamed from: a */
        void mo80460a();
    }

    /* renamed from: c */
    public final void mo18065c() {
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public final void mo80425a(C30770c cVar) {
        this.f80395g = cVar;
        m99996p();
        cVar.mo80574a(this.f80407s);
    }

    /* renamed from: a */
    public final void mo80431a(List<Message> list, int i) {
        if (list != null && !list.isEmpty()) {
            boolean z = true;
            android.os.Message obtainMessage = this.f80408t.obtainMessage(1);
            Message message = (Message) list.get(0);
            switch (i) {
                case 0:
                    if (this.f80473b.contains(message)) {
                        obtainMessage = this.f80408t.obtainMessage(2);
                        break;
                    } else {
                        obtainMessage = this.f80408t.obtainMessage(5);
                        break;
                    }
                case 1:
                    if (this.f80473b.contains(message)) {
                        obtainMessage = this.f80408t.obtainMessage(2);
                        break;
                    } else {
                        obtainMessage = this.f80408t.obtainMessage(5);
                        break;
                    }
                case 2:
                    if (!this.f80399k.isStrangerChat()) {
                        if (list.size() == 1 && !this.f80473b.contains(message)) {
                            obtainMessage = this.f80408t.obtainMessage(5);
                            break;
                        } else {
                            obtainMessage = this.f80408t.obtainMessage(2);
                            break;
                        }
                    } else {
                        obtainMessage = this.f80408t.obtainMessage(2);
                        this.f80399k.setChatType(0);
                        break;
                    }
                    break;
                case 3:
                    if (this.f80473b.contains(message)) {
                        obtainMessage = this.f80408t.obtainMessage(7);
                        break;
                    }
                    break;
                case 4:
                    if (list.size() != this.f80391c.f30972c) {
                        z = false;
                    }
                    this.f80398j = z;
                    break;
                case 5:
                    if (list.size() != this.f80391c.f30972c) {
                        z = false;
                    }
                    this.f80398j = z;
                    m99992l();
                    break;
                case 6:
                    if (message.isRecalled()) {
                        obtainMessage = this.f80408t.obtainMessage(4);
                        break;
                    } else if (message.getMsgType() == 2 || message.getMsgType() == 17) {
                        obtainMessage = this.f80408t.obtainMessage(2);
                        break;
                    } else if (message.getMsgType() == 32) {
                        obtainMessage = this.f80408t.obtainMessage(1);
                        break;
                    } else {
                        return;
                    }
                    break;
                case 7:
                    obtainMessage = this.f80408t.obtainMessage(2);
                    break;
            }
            obtainMessage.obj = list;
            this.f80408t.sendMessage(obtainMessage);
        }
    }

    /* renamed from: a */
    public final void mo18063a() {
        if (this.f80399k.isGroupChat()) {
            this.f80473b.clear();
            List g = this.f80391c.mo27673g();
            for (int i = 0; i < g.size(); i++) {
                if (!C31863ai.m103539f((Message) g.get(i))) {
                    this.f80473b.add(g.get(i));
                }
            }
        } else {
            if (this.f80412x != null && !this.f80391c.f30970a.contains(this.f80412x)) {
                this.f80391c.f30970a.add(0, this.f80412x);
                this.f80412x = null;
            }
            this.f80473b = this.f80391c.mo27673g();
        }
        if (this.f80392d != null && !this.f80392d.isEmpty()) {
            this.f80473b.addAll(this.f80392d);
        }
        if (m100000t()) {
            m100001u();
        }
        this.f80395g.mo80577a(this.f80473b);
        notifyDataSetChanged();
        if (this.f80400l != null) {
            this.f80400l.mo80460a();
        }
        super.mo18063a();
    }

    /* renamed from: a */
    public final void mo18064a(Object obj, int i) {
        if (obj != null) {
            try {
                List list = (List) obj;
                int size = list.size();
                int i2 = 0;
                Message message = (Message) list.get(0);
                switch (i) {
                    case 0:
                        int indexOf = this.f80473b.indexOf(message);
                        if (indexOf != -1) {
                            while (i2 < list.size()) {
                                int i3 = i2 + indexOf;
                                if (i3 >= getItemCount()) {
                                    notifyItemRangeChanged(indexOf, size);
                                    break;
                                } else {
                                    this.f80473b.set(i3, message);
                                    i2++;
                                }
                            }
                            notifyItemRangeChanged(indexOf, size);
                        }
                        break;
                    case 1:
                        this.f80473b.addAll(0, list);
                        notifyItemRangeInserted(0, size);
                        C31024d.m101255a(this.f80472a, true);
                        if (m99991k()) {
                            m99990j();
                            break;
                        }
                        break;
                    case 2:
                        break;
                    case 3:
                        int indexOf2 = this.f80473b.indexOf(message);
                        if (indexOf2 != -1) {
                            this.f80473b.removeAll(list);
                            notifyItemRangeRemoved(indexOf2, size);
                            break;
                        }
                        break;
                }
                this.f80395g.mo80577a(this.f80473b);
                super.mo18064a(obj, i);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo80423a(C0052o<List<Message>> oVar) {
        this.f80414z = oVar;
        if (!(this.f80399k == null || this.f80399k.getSelectMsgList() == null || this.f80399k.getSelectMsgList().isEmpty() || this.f80414z == null)) {
            List list = (List) this.f80414z.getValue();
            if (list == null) {
                list = new ArrayList();
            }
            list.addAll(this.f80399k.getSelectMsgList());
            this.f80414z.setValue(list);
        }
    }

    /* renamed from: a */
    public final void mo80430a(List<Message> list) {
        if (list != null && !list.isEmpty()) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f80392d.add(list.get(size));
            }
        }
        mo80434b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo80432a(boolean z, int i) {
        if (this.f80414z != null && i < this.f80473b.size()) {
            Message message = (Message) this.f80473b.get(i);
            if (message != null) {
                List list = (List) this.f80414z.getValue();
                if (list == null) {
                    list = new ArrayList();
                }
                boolean contains = list.contains(message);
                if (!z || contains) {
                    if (!z && contains) {
                        list.remove(message);
                        this.f80414z.setValue(list);
                    }
                    return;
                }
                list.add(message);
                this.f80414z.setValue(list);
            }
        }
    }

    /* renamed from: a */
    public final void mo80429a(String str, Message message, View view) {
        DetailParams detailParams = new DetailParams();
        detailParams.storyId = str;
        detailParams.detailType = 1;
        ServiceManager.get().getService(C41974f.class);
        C6405d.m19984g();
        if (message != null) {
            C31330b.m102011a(this, message.getUuid());
        }
    }

    /* renamed from: a */
    public final void mo80424a(Context context, Message message, IViewInfo iViewInfo) {
        if (context != null && message != null) {
            ArrayList arrayList = new ArrayList();
            m99987a(arrayList, message.getIndex());
            arrayList.add(new DragViewInfo(message.getIndex(), iViewInfo));
            MediaBrowserActivity.m102518a(context, new C31545a().mo82260a(this.f80399k.getConversationId()).mo82259a(message).mo82261a(new ArrayList<>(this.f80473b)).mo82262b(arrayList).f82580a);
        }
    }

    /* renamed from: a */
    public final void mo80427a(StoryVideoContent storyVideoContent, Message message, View view) {
        float f;
        if (storyVideoContent != null) {
            Context context = view.getContext();
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            if (storyVideoContent.getHeight() == 0 || storyVideoContent.getWidth() == 0) {
                f = ((float) view.getHeight()) / ((float) view.getWidth());
            } else {
                f = ((float) storyVideoContent.getHeight()) / ((float) storyVideoContent.getWidth());
            }
            IViewInfo iViewInfo = new IViewInfo(iArr[0], iArr[1], view.getHeight(), view.getWidth(), (float) view.getResources().getDimensionPixelSize(R.dimen.i5), f);
            if (!C31915n.m103671a()) {
                mo80424a(context, message, iViewInfo);
                return;
            }
            Intent intent = new Intent(context, VideoFilePlayerActivity.class);
            intent.putExtra("videoContent", storyVideoContent);
            intent.putExtra("dragViewInfo", iViewInfo);
            intent.putExtra("localVideo", storyVideoContent.getLocalVideo());
            intent.putExtra("localPoster", storyVideoContent.getLocalPoster());
            context.startActivity(intent);
        }
    }

    /* renamed from: a */
    public final void mo80433a(boolean z, String str) {
        if (!z) {
            int size = this.f80473b.size();
            for (int i = 0; i < size; i++) {
                Message message = (Message) this.f80473b.get(i);
                if (TextUtils.equals(message.getUuid(), str)) {
                    C7003c.m21797a(message);
                    return;
                }
            }
        }
    }

    /* renamed from: m */
    private void m99993m() {
        if (this.f80404p == null) {
            this.f80404p = new OnClickListener() {
                public final void onClick(View view) {
                    float height;
                    String str;
                    View view2 = view;
                    ClickInstrumentation.onClick(view);
                    if (view2.getTag(50331648) != null) {
                        int intValue = ((Integer) view2.getTag(50331648)).intValue();
                        int i = 0;
                        if (intValue == 2 || intValue == 8) {
                            String str2 = (String) view2.getTag(67108864);
                            Message message = (Message) view2.getTag(134217728);
                            if (!TextUtils.isEmpty(str2) && message != null) {
                                Bundle bundle = (Bundle) view2.getTag(50331652);
                                long j = 0;
                                Aweme aweme = null;
                                View view3 = (View) view2.getTag(50331653);
                                if (bundle != null) {
                                    j = bundle.getLong("position", -1);
                                    aweme = (Aweme) bundle.getSerializable("currentAweme");
                                }
                                if (!C6956a.m21632a().mo18009f().getIMSetting().f83749l) {
                                    str2 = String.valueOf(message.getIndex());
                                    C6956a.m21632a().mo18009f().setIMAwemeProvider(new C30754h(MessageAdapter.this.f80399k.getConversationId(), message, MessageAdapter.this.f80473b));
                                }
                                String str3 = str2;
                                if (C6956a.m21632a().mo18009f() == null || aweme == null) {
                                    StringBuilder sb = new StringBuilder("aweme://aweme/detail/");
                                    sb.append(str3);
                                    C7203u a = C7203u.m22460a(sb.toString());
                                    a.mo18694a("refer", "chat");
                                    a.mo18694a("video_from", "from_chat");
                                    C7195s.m22438a().mo18682a(a.mo18695a());
                                    return;
                                }
                                C6956a.m21632a().mo18009f().setSharePlayer(C6956a.m21632a().mo18009f().getPlayerProxy(), Long.valueOf(j));
                                C6956a.m21632a().mo18009f().setNeedToContinueToPlay(true);
                                C6956a.m21632a().mo18009f().enterDetailActivity(view.getContext(), str3, "chat", "from_chat", aweme.getEnterpriseType(), 9, "", view3);
                                C31024d.m101260c();
                            }
                        } else if (intValue == 3) {
                            String str4 = (String) view2.getTag(67108864);
                            if (!TextUtils.isEmpty(str4)) {
                                if (MessageAdapter.this.f80399k == null || !MessageAdapter.this.f80399k.isAuthorSupporterChat() || C30733a.m100122f()) {
                                    C31085i.f81578a.mo81571c(str4);
                                    C31891bc.m103605a(str4);
                                    C31858ad.m103406a();
                                    C31858ad.m103431a(str4, "", "pair", "click_head");
                                    C31858ad.m103406a();
                                    C31858ad.m103469e(str4, "chat", "click_head");
                                }
                            }
                        } else if (intValue == 4) {
                            ShareAwemeContent shareAwemeContent = (ShareAwemeContent) view2.getTag(100663296);
                            if (shareAwemeContent != null && !TextUtils.isEmpty(shareAwemeContent.getUser())) {
                                C31858ad.m103406a();
                                C31858ad.m103431a(shareAwemeContent.getUser(), shareAwemeContent.getItemId(), "others", "click_head");
                                C31858ad.m103406a();
                                C31858ad.m103469e(shareAwemeContent.getUser(), "chat", "click_head");
                                C31891bc.f83361a.mo82730a(shareAwemeContent.getUser(), shareAwemeContent.getSecUid());
                            }
                        } else if (intValue == 5) {
                            Message message2 = (Message) view2.getTag(67108864);
                            if (message2 != null) {
                                C6726a.m20842a(new C30627a(message2));
                            }
                        } else if (intValue == 6) {
                            Message message3 = (Message) view2.getTag(67108864);
                            if (message3 != null && message3.isSelf()) {
                                if (MessageAdapter.this.f80399k.getChatType() != 3) {
                                    IMUser singleChatFromUser = MessageAdapter.this.f80399k.getSingleChatFromUser();
                                    if (message3.getMsgType() == 2 && (singleChatFromUser == null || singleChatFromUser.getFollowStatus() != 2)) {
                                        C9738o.m28693a(view.getContext(), (int) R.string.bnq);
                                        return;
                                    } else if (message3.getMsgType() == 30 && (singleChatFromUser == null || singleChatFromUser.getFollowStatus() != 2)) {
                                        C9738o.m28693a(view.getContext(), (int) R.string.bnr);
                                        return;
                                    }
                                }
                                C31907i.m103654a(view.getContext(), R.string.blq, R.string.bhe, R.string.bop, m100026b(message3));
                            }
                        } else if (intValue == 9 || intValue == 26 || intValue == 27) {
                            Message message4 = (Message) view2.getTag(67108864);
                            if (message4 != null) {
                                int[] iArr = new int[2];
                                view2.getLocationOnScreen(iArr);
                                BaseContent baseContent = (BaseContent) view2.getTag(100663296);
                                if (baseContent instanceof OnlyPictureContent) {
                                    OnlyPictureContent onlyPictureContent = (OnlyPictureContent) baseContent;
                                    if (onlyPictureContent.getWidth() == 0 || onlyPictureContent.getHeight() == 0) {
                                        height = ((float) view.getHeight()) / ((float) view.getWidth());
                                    } else {
                                        height = ((float) onlyPictureContent.getHeight()) / ((float) onlyPictureContent.getWidth());
                                    }
                                } else if (baseContent instanceof StoryPictureContent) {
                                    StoryPictureContent storyPictureContent = (StoryPictureContent) baseContent;
                                    if (storyPictureContent.getWidth() == 0 || storyPictureContent.getHeight() == 0) {
                                        height = ((float) view.getHeight()) / ((float) view.getWidth());
                                    } else {
                                        height = ((float) storyPictureContent.getHeight()) / ((float) storyPictureContent.getWidth());
                                    }
                                } else {
                                    height = ((float) view.getHeight()) / ((float) view.getWidth());
                                }
                                IViewInfo iViewInfo = new IViewInfo(iArr[0], iArr[1], view.getHeight(), view.getWidth(), (float) view.getResources().getDimensionPixelSize(R.dimen.hz), height);
                                if (!C31915n.m103671a()) {
                                    MessageAdapter.this.mo80424a(view.getContext(), message4, iViewInfo);
                                } else if (intValue == 26) {
                                    PhotoDetailActivity.m100546a(view.getContext(), message4, 1, iViewInfo);
                                } else if (intValue == 27) {
                                    PhotoDetailActivity.m100546a(view.getContext(), message4, 2, iViewInfo);
                                } else {
                                    PhotoDetailActivity.m100546a(view.getContext(), message4, 0, iViewInfo);
                                }
                            }
                        } else if (intValue == 11) {
                            Object tag = view2.getTag(100663296);
                            if (tag instanceof VideoUpdateTipsContent) {
                                VideoUpdateTipsContent videoUpdateTipsContent = (VideoUpdateTipsContent) tag;
                                MessageAdapter.m99986a(videoUpdateTipsContent.getUid(), videoUpdateTipsContent.getAid());
                            }
                        } else if (intValue == 12) {
                            String str5 = (String) view2.getTag(67108864);
                            if (!TextUtils.isEmpty(str5)) {
                                C7195s a2 = C7195s.m22438a();
                                StringBuilder sb2 = new StringBuilder("aweme://aweme/detail/");
                                sb2.append(str5);
                                a2.mo18682a(C7203u.m22460a(sb2.toString()).mo18694a("refer", "chat").mo18694a("enter_method", "click_token").mo18694a("previous_page", "token").mo18694a("video_from", "from_chat").mo18695a());
                            }
                        } else if (intValue == 14) {
                            CommentContent commentContent = (CommentContent) view2.getTag(100663296);
                            if (commentContent != null) {
                                C7195s a3 = C7195s.m22438a();
                                Activity activity = (Activity) view.getContext();
                                StringBuilder sb3 = new StringBuilder("aweme://aweme/detail/");
                                sb3.append(commentContent.getAwemeId());
                                a3.mo18679a(activity, C7203u.m22460a(sb3.toString()).mo18694a("refer", "chat").mo18694a("video_from", "from_chat").mo18694a("cid", commentContent.getCommentId()).mo18695a());
                            }
                        } else if (intValue == 13) {
                            final Message message5 = (Message) view2.getTag(67108864);
                            if (message5 != null) {
                                SayHelloContent sayHelloContent = (SayHelloContent) C31913m.m103667a(message5.getContent(), SayHelloContent.class);
                                if (sayHelloContent != null) {
                                    Object tag2 = view2.getTag(83886080);
                                    final IMUser singleChatFromUser2 = MessageAdapter.this.f80399k.getSingleChatFromUser();
                                    if (singleChatFromUser2 != null) {
                                        if (tag2 == null) {
                                            C31858ad.m103406a();
                                            C31858ad.m103436a(singleChatFromUser2.getUid(), MessageAdapter.this.f80399k.getConversationId(), sayHelloContent.getEmoji(), true);
                                            C11443k.m33752c(message5);
                                            MessageAdapter.this.mo80434b();
                                        } else {
                                            final int intValue2 = ((Integer) tag2).intValue();
                                            final List emoji = sayHelloContent.getEmoji();
                                            if (emoji != null && intValue2 < emoji.size()) {
                                                Context context = view.getContext();
                                                C306191 r0 = new C6943d() {
                                                    public final void sendMsg() {
                                                        Emoji emoji = (Emoji) emoji.get(intValue2);
                                                        String uid = singleChatFromUser2.getUid();
                                                        C11443k.m33752c(message5);
                                                        C7058be.m21980a().mo18263a(uid, (BaseContent) EmojiContent.obtain(emoji));
                                                        C31858ad.m103406a();
                                                        C31858ad.m103474f(MessageAdapter.this.f80399k.getConversationId(), uid, String.valueOf(emoji.getId()));
                                                    }
                                                };
                                                new C6928b(context, r0).sendMsg();
                                            }
                                        }
                                    }
                                }
                            }
                        } else if (intValue == 19) {
                            Message message6 = (Message) view2.getTag(67108864);
                            if (message6 != null) {
                                MessageAdapter.this.f80397i = message6;
                                MessageAdapter.this.f80395g.mo80573a(message6);
                            }
                        } else if (intValue == 15) {
                            ShareRankingListContent shareRankingListContent = (ShareRankingListContent) view2.getTag(100663296);
                            int type = shareRankingListContent.getType();
                            if (type != 1801) {
                                if (type == 1802) {
                                    i = 1;
                                } else if (type == 1803) {
                                    i = 2;
                                } else if (type == 2301) {
                                    i = 3;
                                }
                            }
                            if (!C6956a.m21632a().mo18009f().getIsHotSearchBillboardEnable()) {
                                C10761a.m31392b(view.getContext(), (int) R.string.e_g, 1).mo25750a();
                                return;
                            }
                            C7195s.m22438a().mo18679a((Activity) view.getContext(), C7203u.m22460a("aweme://search/trending").mo18694a("type", String.valueOf(i)).mo18695a());
                            C31858ad.m103406a();
                            C31858ad.m103414a(shareRankingListContent, MessageAdapter.this.f80399k.getSingleChatFromUserId(), MessageAdapter.this.f80399k.getConversationId(), true);
                        } else if (intValue == 16) {
                            String str6 = (String) view2.getTag(67108864);
                            String str7 = (String) view2.getTag(50331649);
                            StringBuilder sb4 = new StringBuilder("snssdk1128://poi/?id=");
                            sb4.append(str6);
                            sb4.append("&enter_from");
                            sb4.append("=chat");
                            sb4.append("&to_user_id");
                            sb4.append("=");
                            sb4.append(str7);
                            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(sb4.toString()));
                            C31858ad.m103406a();
                            C31858ad.m103457c(str6, str7, MessageAdapter.this.f80399k.getConversationId());
                            view.getContext().startActivity(intent);
                        } else if (intValue == 33) {
                            try {
                                Map map = (Map) view2.getTag(67108864);
                                String str8 = (String) map.get("poi_id");
                                String str9 = (String) map.get("activity_id");
                                String str10 = (String) map.get("coupon_id");
                                String str11 = (String) map.get("uid");
                                boolean equals = "1".equals(map.get("is_self"));
                                if (equals) {
                                    str = str11;
                                } else {
                                    str = C7074e.m22069b().toString();
                                }
                                if (equals) {
                                    str11 = C7074e.m22069b().toString();
                                }
                                HashMap hashMap = new HashMap();
                                hashMap.put("enter_from", "chat");
                                hashMap.put("from_user_id", str11);
                                hashMap.put("to_user_id", str);
                                hashMap.put("conversation_id", MessageAdapter.this.f80399k.getConversationId());
                                hashMap.put("poi_id", str8);
                                hashMap.put("coupon_id", str10);
                                hashMap.put("activity_id", str9);
                                C6907h.m21524a("click_receive_coupon_inner", (Map) hashMap);
                                StringBuilder sb5 = new StringBuilder("snssdk1128://poi/?id=");
                                sb5.append(str8);
                                sb5.append("&enter_from=chat&to_user_id=");
                                sb5.append(str);
                                sb5.append("&from_user_id=");
                                sb5.append(str11);
                                sb5.append("&attached_activity_id=");
                                sb5.append(str9);
                                sb5.append("&coupon_id=");
                                sb5.append(str10);
                                sb5.append("&enter_method=click_poi_coupon");
                                view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(sb5.toString())));
                            } catch (Exception unused) {
                            }
                        } else if (intValue == 17) {
                            Object tag3 = view2.getTag(100663296);
                            if (tag3 instanceof ShareMusicContent) {
                                ShareMusicContent shareMusicContent = (ShareMusicContent) tag3;
                                MessageAdapter.m99985a(shareMusicContent.getMusicId());
                                C31858ad.m103406a();
                                C31858ad.m103450b(shareMusicContent.getMusicId(), MessageAdapter.this.f80399k.getSingleChatFromUserId(), MessageAdapter.this.f80399k.getConversationId());
                            }
                        } else if (intValue == 18) {
                            Object tag4 = view2.getTag(67108864);
                            Object tag5 = view2.getTag(50331649);
                            if (tag4 != null && tag5 != null) {
                                String str12 = (String) tag4;
                                boolean booleanValue = ((Boolean) tag5).booleanValue();
                                String uuid = UUID.randomUUID().toString();
                                C7195s a4 = C7195s.m22438a();
                                StringBuilder sb6 = new StringBuilder("aweme://challenge/detail/");
                                sb6.append(str12);
                                a4.mo18682a(C7203u.m22460a(sb6.toString()).mo18694a("is_commerce", booleanValue ? "1" : "0").mo18694a("enter_from", "chat").mo18694a("process_id", uuid).mo18695a());
                                C31858ad.m103406a();
                                C31858ad.m103451b(str12, MessageAdapter.this.f80399k.getSingleChatFromUserId(), MessageAdapter.this.f80399k.getConversationId(), uuid);
                            }
                        } else if (intValue == 20) {
                            Object tag6 = view2.getTag(100663296);
                            if (tag6 instanceof ShareMiniAppContent) {
                                ShareMiniAppContent shareMiniAppContent = (ShareMiniAppContent) tag6;
                                C6956a.m21632a().mo18009f().jumpToMiniApp(view.getContext(), shareMiniAppContent.getQuery(), shareMiniAppContent.getAppId(), shareMiniAppContent.isGame(), shareMiniAppContent.getToken(), shareMiniAppContent.getExtraStr());
                            }
                        } else if (intValue == 21) {
                            Object tag7 = view2.getTag(100663296);
                            if (tag7 instanceof ShareUserContent) {
                                ShareUserContent shareUserContent = (ShareUserContent) tag7;
                                C31891bc.f83361a.mo82730a(shareUserContent.getUid(), shareUserContent.getSecUid());
                            }
                        } else if (intValue == 22) {
                            Object tag8 = view2.getTag(100663296);
                            if (tag8 instanceof ShareWebContent) {
                                ShareWebContent shareWebContent = (ShareWebContent) tag8;
                                if (!TextUtils.isEmpty(shareWebContent.getUrl())) {
                                    C6956a.m21632a().mo18009f().openUrl(view.getContext(), Uri.parse(shareWebContent.getUrl()), false);
                                    Object tag9 = view2.getTag(50331649);
                                    if ((tag9 instanceof Boolean) && ((Boolean) tag9).booleanValue()) {
                                        C31858ad.m103479g(view2.getTag(50331650).toString(), view2.getTag(50331650).toString(), "picture");
                                    }
                                }
                            }
                        } else if (intValue == 23) {
                            ShareLiveContent shareLiveContent = (ShareLiveContent) view2.getTag(100663296);
                            if (shareLiveContent != null) {
                                C6956a.m21632a().mo18009f().jumpToLivePage(view.getContext(), shareLiveContent.getRoomOwnerId(), shareLiveContent.getRoomSecOwnerId(), shareLiveContent.getRoomId());
                            }
                        } else if (intValue == 24) {
                            ShareLiveContent shareLiveContent2 = (ShareLiveContent) view2.getTag(100663296);
                            if (shareLiveContent2 != null) {
                                C31891bc.f83361a.mo82730a(shareLiveContent2.getRoomOwnerId(), shareLiveContent2.getRoomSecOwnerId());
                            }
                        } else if (intValue == 25) {
                            StoryReplyContent storyReplyContent = (StoryReplyContent) view2.getTag(100663296);
                            if (storyReplyContent != null) {
                                if (storyReplyContent.getStoryState()) {
                                    MessageAdapter.this.mo80429a(storyReplyContent.getStoryContent().getStoryId(), (Message) view2.getTag(67108864), (View) view2.getTag(117440512));
                                } else {
                                    C10761a.m31392b(view.getContext(), (int) R.string.bqg, 0).mo25750a();
                                }
                            }
                        } else if (intValue == 28 || intValue == 29) {
                            StoryVideoContent storyVideoContent = (StoryVideoContent) view2.getTag(100663296);
                            View view4 = (View) view2.getTag(67108864);
                            Message message7 = (Message) view2.getTag(134217728);
                            if (!(storyVideoContent == null || message7 == null || view4 == null)) {
                                MessageAdapter.this.mo80427a(storyVideoContent, message7, view4);
                            }
                        } else if (intValue == 30) {
                            Message message8 = (Message) view2.getTag(67108864);
                            if (message8 != null) {
                                C7063bg.m22035a((Activity) view.getContext(), (Object) C6961d.m21657a().mo18029b(String.valueOf(C6425b.m20074a(message8.getConversationId()))), 12);
                            }
                        } else if (intValue == 32) {
                            SelfStoryReplyContent selfStoryReplyContent = (SelfStoryReplyContent) view2.getTag(100663296);
                            if (selfStoryReplyContent != null) {
                                if (selfStoryReplyContent.getStoryState()) {
                                    MessageAdapter.this.mo80429a(selfStoryReplyContent.getStoryContent().getStoryId(), (Message) view2.getTag(67108864), (View) view2.getTag(117440512));
                                } else {
                                    C10761a.m31392b(view.getContext(), (int) R.string.bqg, 0).mo25750a();
                                }
                            }
                        } else if (intValue == 34) {
                            ShareGoodContent shareGoodContent = (ShareGoodContent) view2.getTag(67108864);
                            StringBuilder sb7 = new StringBuilder("snssdk1128://goods/seeding/?promotion_id=");
                            sb7.append(shareGoodContent.getPromotionId());
                            sb7.append("&product_id=");
                            sb7.append(shareGoodContent.getProductId());
                            sb7.append("&target_uid=");
                            sb7.append(shareGoodContent.getUserId());
                            sb7.append("&sec_target_uid=");
                            sb7.append(shareGoodContent.getSecUserId());
                            sb7.append("&enter_method=");
                            sb7.append(shareGoodContent.getEnterMethod());
                            view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(sb7.toString())));
                        } else if (intValue == 35) {
                            ShareGoodWindowContent shareGoodWindowContent = (ShareGoodWindowContent) view2.getTag(67108864);
                            StringBuilder sb8 = new StringBuilder("snssdk1128://goods/shop/?uid=");
                            sb8.append(shareGoodWindowContent.getUserId());
                            sb8.append("&sec_uid=");
                            sb8.append(shareGoodWindowContent.getSecUserId());
                            sb8.append("&entrance_location=");
                            sb8.append(shareGoodWindowContent.getEntranceLocation());
                            view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(sb8.toString())));
                        } else if (intValue != 36) {
                            if (intValue == 37) {
                                Message message9 = (Message) view2.getTag(67108864);
                                if (message9 != null && message9.getMsgStatus() != 3) {
                                    GroupInviteContent groupInviteContent = (GroupInviteContent) C31913m.m103667a(message9.getContent(), GroupInviteContent.class);
                                    if (groupInviteContent != null && groupInviteContent.getGroupInviteCardInfo() != null) {
                                        HashMap hashMap2 = new HashMap();
                                        hashMap2.put("conversation_id", MessageAdapter.this.f80399k.getConversationId());
                                        hashMap2.put("from_user_id", String.valueOf(message9.getSender()));
                                        C31858ad.m103437a("group_chat_click_invite", (Map<String, String>) hashMap2);
                                        GroupInviteDialog groupInviteDialog = new GroupInviteDialog(view.getContext(), groupInviteContent.getGroupInviteCardInfo().getTicket(), 4);
                                        groupInviteDialog.mo18084a(groupInviteContent.getGroupInviteCardInfo());
                                        groupInviteDialog.show();
                                    }
                                }
                            } else if (intValue == 38) {
                                Object tag10 = view2.getTag(100663296);
                                if (tag10 instanceof ShareCompilationContent) {
                                    ShareCompilationContent shareCompilationContent = (ShareCompilationContent) tag10;
                                    SmartRouter.buildRoute(view.getContext(), "aweme://mix/detail").withParam("mix_id", shareCompilationContent.getCompilationId()).withParam("event_type", "chat").open();
                                    C31858ad.m103406a();
                                    C31858ad.m103462d(shareCompilationContent.getCompilationId(), shareCompilationContent.getAuthorId());
                                }
                            } else if (intValue == 39) {
                                Object tag11 = view2.getTag(100663296);
                                if (tag11 instanceof ShareStickerContent) {
                                    ShareStickerContent shareStickerContent = (ShareStickerContent) tag11;
                                    SmartRouter.buildRoute(view.getContext(), "aweme://stickers/detail/").withParam("id", shareStickerContent.getStickerId()).open();
                                    C31858ad.m103406a();
                                    C31858ad.m103486i(shareStickerContent.getStickerId());
                                }
                            }
                        }
                    }
                }

                /* renamed from: b */
                private Runnable m100026b(Message message) {
                    return new C30983o(this, message);
                }

                /* access modifiers changed from: 0000 */
                /* renamed from: a */
                public final /* synthetic */ void mo80442a(final Message message) {
                    if (MessageAdapter.this.f80473b.indexOf(message) >= 0 && MessageAdapter.this.f80472a != null) {
                        new C6928b(MessageAdapter.this.f80472a.getContext(), new C6943d() {
                            public final void sendMsg() {
                                message.addLocalExt("key_resend", "1");
                                if (message.getMsgType() == 2 || message.getMsgType() == 27) {
                                    C30963v.m100755a().mo81338c(message);
                                } else if (message.getMsgType() == 30) {
                                    C30973g.f81089f.mo81362a(message);
                                } else if (message.getMsgType() == 17) {
                                    C30927b.m100665a().mo81280a(message);
                                } else {
                                    C31863ai.m103535c(message);
                                }
                            }
                        }).sendMsg();
                    }
                }
            };
        }
    }

    /* renamed from: o */
    private void m99995o() {
        if (this.f80406r == null) {
            this.f80406r = new OnLongClickListener() {

                /* renamed from: a */
                public DmtButton f80423a;

                /* renamed from: b */
                public DmtButton f80424b;

                /* renamed from: c */
                public DmtButton f80425c;

                /* renamed from: d */
                public DmtButton f80426d;

                /* renamed from: e */
                public DmtButton f80427e;

                /* renamed from: f */
                public PopupWindow f80428f;

                /* renamed from: g */
                public BaseContent f80429g;

                /* renamed from: h */
                public Message f80430h;

                /* renamed from: j */
                private OnClickListener f80432j;

                /* renamed from: k */
                private int f80433k;

                /* renamed from: b */
                private void m100032b() {
                    if (this.f80432j == null) {
                        this.f80432j = new OnClickListener() {
                            public final void onClick(final View view) {
                                ClickInstrumentation.onClick(view);
                                if (view.equals(C306212.this.f80423a)) {
                                    if (C306212.this.f80429g instanceof TextContent) {
                                        C31867am.m103552a(view.getContext(), ((TextContent) C306212.this.f80429g).getText());
                                    } else if (C306212.this.f80429g instanceof StoryReplyContent) {
                                        C31867am.m103552a(view.getContext(), ((StoryReplyContent) C306212.this.f80429g).getStoryReplyText());
                                    } else if (C306212.this.f80429g instanceof SelfStoryReplyContent) {
                                        C31867am.m103552a(view.getContext(), ((SelfStoryReplyContent) C306212.this.f80429g).getStoryReplyText());
                                    }
                                } else if (view.equals(C306212.this.f80426d)) {
                                    int indexOf = MessageAdapter.this.f80473b.indexOf(C306212.this.f80430h);
                                    if (indexOf != -1) {
                                        C306212.this.mo80445a(view.getContext(), C306212.this.f80430h, indexOf);
                                    }
                                } else if (view.equals(C306212.this.f80427e)) {
                                    if (C27536b.m90251a().mo70772e() >= 79) {
                                        C10761a.m31392b(view.getContext(), (int) R.string.bmb, 1).mo25750a();
                                    } else {
                                        C306212.this.mo80447a((EmojiContent) C306212.this.f80429g);
                                        C31858ad.m103406a();
                                        C31858ad.m103480h();
                                    }
                                } else if (view.equals(C306212.this.f80424b)) {
                                    C306212.this.mo80444a(view.getContext());
                                } else if (view.equals(C306212.this.f80425c)) {
                                    if (MessageAdapter.this.f80393e == null) {
                                        MessageAdapter.this.f80393e = new C31991f(view.getContext());
                                        MessageAdapter.this.f80393e.mo82918a(C6399b.m19921a().getString(R.string.boe));
                                    }
                                    MessageAdapter.this.f80393e.show();
                                    C11443k.m33749b(C306212.this.f80430h, (C11195b<Message>) new C11195b<Message>() {
                                        /* access modifiers changed from: private */
                                        /* renamed from: a */
                                        public void mo18089a(Message message) {
                                            if (MessageAdapter.this.f80393e != null) {
                                                MessageAdapter.this.f80393e.dismiss();
                                            }
                                            MessageAdapter.this.mo80434b();
                                        }

                                        /* renamed from: a */
                                        public final void mo18088a(C11438g gVar) {
                                            if (MessageAdapter.this.f80393e != null) {
                                                MessageAdapter.this.f80393e.dismiss();
                                            }
                                            if (MessageAdapter.this.f80394f == null) {
                                                MessageAdapter.this.f80394f = new C11002c(view.getContext(), -2, -2, 17);
                                            }
                                            MessageAdapter.this.f80394f.mo26583a(C6399b.m19921a().getString(R.string.bod), 17);
                                        }
                                    });
                                    C31858ad.m103504r(String.valueOf(C6425b.m20074a(C306212.this.f80430h.getConversationId())));
                                }
                                C30984p.m100815a(C306212.this.f80428f);
                            }
                        };
                    }
                }

                /* renamed from: a */
                private void m100028a() {
                    m100032b();
                    this.f80423a.setOnClickListener(this.f80432j);
                    this.f80426d.setOnClickListener(this.f80432j);
                    this.f80427e.setOnClickListener(this.f80432j);
                    this.f80424b.setOnClickListener(this.f80432j);
                    this.f80425c.setOnClickListener(this.f80432j);
                }

                /* renamed from: a */
                private void m100029a(View view) {
                    int[] a = C31867am.m103553a(view, this.f80428f.getContentView());
                    a[0] = a[0] - 20;
                    this.f80428f.setOnDismissListener(new OnDismissListener() {
                        public final void onDismiss() {
                            C306212.this.f80423a.setOnClickListener(null);
                            C306212.this.f80426d.setOnClickListener(null);
                            C306212.this.f80424b.setOnClickListener(null);
                            C306212.this.f80427e.setOnClickListener(null);
                        }
                    });
                    this.f80428f.showAtLocation(view, 8388659, a[0], a[1]);
                }

                /* renamed from: a */
                private static boolean m100031a(int i) {
                    if (i == 9) {
                        return C6956a.m21632a().mo18009f().enableSendPic();
                    }
                    if (i == 10) {
                        return C6956a.m21633b().enableSendEmoji();
                    }
                    if (i == 19) {
                        return false;
                    }
                    if (i == 1 || i == 2 || i == 8 || i == 16 || i == 17 || i == 18 || i == 15 || i == 21 || i == 22 || i == 23 || i == 28 || i == 26 || i == 33 || i == 34 || i == 35 || i == 38 || i == 39) {
                        return true;
                    }
                    return false;
                }

                /* renamed from: b */
                private void m100033b(View view) {
                    if (this.f80428f == null) {
                        this.f80428f = C31867am.m103551a(view.getContext(), R.layout.sb, view);
                        View contentView = this.f80428f.getContentView();
                        this.f80423a = (DmtButton) contentView.findViewById(R.id.a31);
                        this.f80424b = (DmtButton) contentView.findViewById(R.id.d64);
                        this.f80425c = (DmtButton) contentView.findViewById(R.id.f124315com);
                        this.f80426d = (DmtButton) contentView.findViewById(R.id.a79);
                        this.f80427e = (DmtButton) contentView.findViewById(R.id.y6);
                    }
                    Context context = view.getContext();
                    m100030a(this.f80423a, context.getString(R.string.bib));
                    m100030a(this.f80424b, context.getString(R.string.bq0));
                    m100030a(this.f80425c, context.getString(R.string.boc));
                    m100030a(this.f80426d, context.getString(R.string.bii));
                    m100030a(this.f80427e, context.getString(R.string.bgk));
                }

                /* renamed from: a */
                public final void mo80444a(Context context) {
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("share_package", this.f80429g.generateSharePackage());
                    bundle.putSerializable("share_content", this.f80429g);
                    bundle.putLong("forward_origin_msgid", this.f80430h.getMsgId());
                    RelationSelectActivity.m21881a(context, bundle, null);
                }

                public final boolean onLongClick(View view) {
                    boolean z;
                    boolean z2;
                    if (view.getTag(50331648) == null) {
                        return false;
                    }
                    this.f80433k = ((Integer) view.getTag(50331648)).intValue();
                    this.f80429g = (BaseContent) view.getTag(100663296);
                    this.f80430h = (Message) view.getTag(134217728);
                    if (this.f80430h == null) {
                        return false;
                    }
                    boolean isSelf = this.f80430h.isSelf();
                    boolean isRecalled = this.f80430h.isRecalled();
                    if (this.f80430h.getMsgStatus() == 2 || this.f80430h.getMsgStatus() == 5) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!(this.f80429g instanceof TextContent) || !((TextContent) this.f80429g).isDefault()) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (isRecalled) {
                        return false;
                    }
                    if (this.f80433k == 1 || this.f80433k == 25 || this.f80433k == 32) {
                        m100033b(view);
                        if ((this.f80429g instanceof StoryReplyContent) || (this.f80429g instanceof SelfStoryReplyContent)) {
                            this.f80423a.setText(R.string.bic);
                            this.f80424b.setVisibility(8);
                        }
                        if (C31915n.m103671a() || !isSelf || !z || z2) {
                            this.f80425c.setVisibility(8);
                        }
                        if (MessageAdapter.this.f80399k != null && MessageAdapter.this.f80399k.isAuthorSupporterChat() && C30733a.m100115a(this.f80423a, this.f80426d, this.f80425c, this.f80424b)) {
                            return false;
                        }
                        m100028a();
                        m100029a(view);
                    } else if (this.f80433k == 2 || this.f80433k == 8 || this.f80433k == 9 || this.f80433k == 10 || this.f80433k == 14 || this.f80433k == 11 || this.f80433k == 19 || this.f80433k == 15 || this.f80433k == 16 || this.f80433k == 17 || this.f80433k == 18 || this.f80433k == 20 || this.f80433k == 21 || this.f80433k == 22 || this.f80433k == 23 || this.f80433k == 26 || this.f80433k == 27 || this.f80433k == 28 || this.f80433k == 29 || this.f80433k == 30 || this.f80433k == 31 || this.f80433k == 33 || this.f80433k == 34 || this.f80433k == 35 || this.f80433k == 36 || this.f80433k == 37 || this.f80433k == 38 || this.f80433k == 39) {
                        m100033b(view);
                        if (this.f80433k != 31) {
                            this.f80423a.setVisibility(8);
                        }
                        if (m100031a(this.f80433k)) {
                            this.f80424b.setVisibility(0);
                        } else {
                            this.f80424b.setVisibility(8);
                        }
                        Object tag = view.getTag(50331649);
                        if ((tag instanceof Boolean) && ((Boolean) tag).booleanValue()) {
                            this.f80424b.setVisibility(8);
                        }
                        if (C31915n.m103671a() || !isSelf || !z || this.f80433k == 30 || this.f80433k == 11 || this.f80433k == 31) {
                            this.f80425c.setVisibility(8);
                        }
                        if (MessageAdapter.this.f80399k != null && MessageAdapter.this.f80399k.isAuthorSupporterChat()) {
                            C30733a.m100115a(this.f80423a, this.f80426d, this.f80425c, this.f80424b);
                        }
                        m100028a();
                        m100029a(view);
                    } else if (this.f80433k == 3 && MessageAdapter.this.f80401m != null && !this.f80430h.isSelf() && MessageAdapter.this.f80399k.isGroupChat()) {
                        MessageAdapter.this.f80401m.mo80404a(String.valueOf(this.f80430h.getSender()));
                        return true;
                    }
                    if (this.f80433k == 10 && this.f80430h.getMsgType() == 5) {
                        if (this.f80429g == null || C31915n.m103671a()) {
                            this.f80427e.setVisibility(8);
                        } else {
                            EmojiContent emojiContent = (EmojiContent) this.f80429g;
                            Emoji emoji = new Emoji();
                            emoji.setId(emojiContent.getImageId());
                            emoji.setAnimateUrl(emojiContent.getUrl());
                            if (C27536b.m90251a().mo70762a(emoji)) {
                                this.f80427e.setVisibility(8);
                            } else {
                                this.f80427e.setVisibility(0);
                            }
                        }
                    } else if (this.f80427e != null) {
                        this.f80427e.setVisibility(8);
                    }
                    if (this.f80424b != null && IMService.inst().isImReduction()) {
                        this.f80424b.setVisibility(8);
                    }
                    return false;
                }

                /* renamed from: a */
                public final void mo80447a(EmojiContent emojiContent) {
                    int i;
                    long imageId = emojiContent.getImageId();
                    UrlModel url = emojiContent.getUrl();
                    String str = "";
                    String str2 = "";
                    if (url != null) {
                        str = url.getUri();
                        str2 = (String) url.getUrlList().get(0);
                    }
                    long packageId = emojiContent.getPackageId();
                    if (this.f80429g.getType() == 501) {
                        i = 2;
                    } else if (this.f80429g.getType() != 500 || C27554a.m90296a().mo70784a(packageId)) {
                        i = 1;
                    } else {
                        i = 10;
                    }
                    C27536b.m90251a().mo70756a(imageId, str, str2, packageId, i);
                }

                /* renamed from: a */
                private static void m100030a(DmtButton dmtButton, String str) {
                    dmtButton.setVisibility(0);
                    dmtButton.setText(str);
                }

                /* renamed from: a */
                public final void mo80446a(Message message, int i) {
                    if (this.f80433k == 1 || this.f80433k == 2 || this.f80433k == 9 || this.f80433k == 8 || this.f80433k == 10 || this.f80433k == 14 || this.f80433k == 11 || this.f80433k == 19 || this.f80433k == 16 || this.f80433k == 17 || this.f80433k == 18 || this.f80433k == 15 || this.f80433k == 20 || this.f80433k == 21 || this.f80433k == 22 || this.f80433k == 23 || this.f80433k == 26 || this.f80433k == 27 || this.f80433k == 25 || this.f80433k == 28 || this.f80433k == 29 || this.f80433k == 30 || this.f80433k == 31 || this.f80433k == 32 || this.f80433k == 33 || this.f80433k == 34 || this.f80433k == 35 || this.f80433k == 36 || this.f80433k == 37 || this.f80433k == 38 || this.f80433k == 39) {
                        if (this.f80433k == 19) {
                            C6946a.m21606a().mo18001a(message);
                        }
                        if (TextUtils.isEmpty(message.getConversationId())) {
                            C7077s.m22153a(message, null);
                            String uuid = message.getUuid();
                            int i2 = 0;
                            int size = MessageAdapter.this.f80392d.size();
                            while (true) {
                                if (i2 >= size) {
                                    break;
                                } else if (TextUtils.equals(((Message) MessageAdapter.this.f80392d.get(i2)).getUuid(), uuid)) {
                                    MessageAdapter.this.f80392d.remove(i2);
                                    break;
                                } else {
                                    i2++;
                                }
                            }
                            MessageAdapter.this.mo80434b();
                            return;
                        }
                        C11443k.m33752c(message);
                    }
                }

                /* renamed from: a */
                public final void mo80445a(Context context, final Message message, final int i) {
                    C7063bg.m22041a(context, 1, true, (Runnable) new Runnable() {
                        public final void run() {
                            C306212.this.mo80446a(message, i);
                        }
                    });
                }
            };
        }
    }

    /* renamed from: p */
    private void m99996p() {
        if (this.f80407s == null) {
            this.f80407s = new C30793j() {
                /* renamed from: c */
                public final void mo80457c() {
                    C30927b.m100665a().mo81282b();
                }

                /* renamed from: a */
                public final void mo80452a() {
                    C30927b.m100665a().mo81278a(MessageAdapter.this.f80399k);
                }

                /* renamed from: b */
                public final void mo80455b() {
                    MessageAdapter.this.f80396h = null;
                    MessageAdapter.this.mo80434b();
                }

                /* renamed from: b */
                public final void mo80456b(Message message) {
                    MessageAdapter.this.f80397i = message;
                }

                /* renamed from: a */
                public final void mo80453a(Message message) {
                    MessageAdapter.this.f80396h = message;
                    MessageAdapter.this.mo80434b();
                }

                /* renamed from: a */
                public final void mo80454a(File file, long j) {
                    if (file == null || !file.exists() || !file.isFile() || file.length() <= 0) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("tag", "MessageAdapter");
                        hashMap.put("error", String.valueOf(C31905f.m103636a(file)));
                        C7074e.m22065a("audio_message_send", hashMap);
                        C30927b.m100665a().mo81282b();
                        return;
                    }
                    C30927b.m100665a().mo81281a(file.getAbsolutePath(), j, null);
                }
            };
        }
    }

    /* renamed from: b */
    public final void mo80434b() {
        this.f80408t.sendMessage(this.f80408t.obtainMessage(1));
    }

    /* renamed from: g */
    public final void mo80439g() {
        if (this.f80411w != null) {
            this.f80411w.getLocalExt().remove("show_unread_message_tips");
        }
    }

    public int getItemCount() {
        if (this.f80473b != null) {
            return this.f80473b.size();
        }
        return 0;
    }

    /* renamed from: h */
    public final void mo80440h() {
        if (this.f80394f != null) {
            this.f80394f.mo26582a();
        }
        C31330b.m102013b(this);
    }

    /* renamed from: i */
    public final boolean mo80441i() {
        if (this.f80399k.getChatType() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    private void m99990j() {
        if (this.f80472a != null && (this.f80472a.getLayoutManager() instanceof LinearLayoutManager)) {
            ((LinearLayoutManager) this.f80472a.getLayoutManager()).mo5417a(0, 0);
        }
    }

    /* renamed from: n */
    private void m99994n() {
        if (this.f80399k.getSelectMsgType() == 1 && this.f80405q == null) {
            this.f80405q = new C30923n(this);
        }
    }

    /* renamed from: s */
    private boolean m99999s() {
        Conversation a = C6417a.m20015a().mo15530a(this.f80399k.getConversationId());
        if (a != null && a.getUnreadCount() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: u */
    private void m100001u() {
        m99989b(C6399b.m19921a().getString(R.string.bq8));
        C7076p.m22077a().mo18337u();
    }

    /* renamed from: e */
    public final void mo80437e() {
        if (this.f80402n == 1) {
            if (this.f80403o != null) {
                this.f80403o.mo81444f();
            }
            return;
        }
        this.f80402n = 1;
        this.f80391c.mo27671e();
    }

    /* renamed from: f */
    public final void mo80438f() {
        if (this.f80402n == 1) {
            this.f80402n = 0;
        }
        if (this.f80392d != null) {
            this.f80392d.clear();
        }
    }

    /* renamed from: k */
    private boolean m99991k() {
        if (this.f80472a == null || !(this.f80472a.getLayoutManager() instanceof LinearLayoutManager) || ((LinearLayoutManager) this.f80472a.getLayoutManager()).mo5445j() > 10) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    private void m99992l() {
        if (this.f80403o != null) {
            this.f80403o.mo81445g();
        }
        if (this.f80413y > 0 && this.f80413y != this.f80391c.f30972c) {
            this.f80391c.f30972c = this.f80413y;
            this.f80413y = 0;
        }
        this.f80402n = 0;
        if (this.f80473b.size() <= 1 && this.f80472a != null && this.f80472a.getLayoutManager() != null) {
            this.f80472a.getLayoutManager().mo5437e(0);
        }
    }

    /* renamed from: q */
    private boolean m99997q() {
        if (this.f80399k.getChatType() != 3 && C6956a.m21632a().mo18009f().showNewStyle() && (this.f80399k.getEnterFrom() == 3 || this.f80399k.getEnterFrom() == 4)) {
            return true;
        }
        return false;
    }

    /* renamed from: t */
    private boolean m100000t() {
        if (C31915n.m103671a() || this.f80399k.isGroupChat() || this.f80399k.isStrangerChat()) {
            return false;
        }
        IMUser singleChatFromUser = this.f80399k.getSingleChatFromUser();
        if (singleChatFromUser != null && singleChatFromUser.getFollowStatus() != 2 && this.f80410v && C7076p.m22077a().mo18338v()) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final void mo80436d() {
        C31876av.m103569a("djjQueryMsg");
        if (this.f80473b != null) {
            this.f80473b.clear();
        }
        if (m99997q()) {
            m99998r();
        }
        this.f80410v = m99999s();
        this.f80391c.mo27670d();
    }

    /* renamed from: r */
    private void m99998r() {
        long j;
        IMUser singleChatFromUser = this.f80399k.getSingleChatFromUser();
        if (singleChatFromUser != null) {
            VideoTag b = C6990a.m21758a().mo18070b(singleChatFromUser.getUid());
            if (b != null && b.getTagCount() != 0) {
                Conversation a = C6417a.m20015a().mo15530a(this.f80391c.f30971b);
                if (a != null) {
                    Message message = new Message();
                    message.setMsgType(14);
                    message.setUuid(UUID.randomUUID().toString());
                    Message lastMessage = a.getLastMessage();
                    long j2 = 1;
                    if (lastMessage != null) {
                        j2 = 1 + lastMessage.getOrderIndex();
                    }
                    message.setOrderIndex(j2);
                    if (lastMessage != null) {
                        j = lastMessage.getIndex();
                    } else {
                        j = a.getLastMessageIndex();
                    }
                    message.setIndex(j);
                    message.setConversationId(a.getConversationId());
                    VideoUpdateTipsContent videoUpdateTipsContent = new VideoUpdateTipsContent();
                    videoUpdateTipsContent.setUid(b.getUid());
                    videoUpdateTipsContent.setCover(b.getCoverUrl());
                    videoUpdateTipsContent.setAid(b.getLastAid());
                    videoUpdateTipsContent.setPhoto(b.isPhoto());
                    int tagCount = b.getTagCount();
                    if (tagCount > 1) {
                        videoUpdateTipsContent.setTitle(C6399b.m19921a().getResources().getString(R.string.brd, new Object[]{C6990a.m21759a(b.getTagCount())}));
                    } else if (tagCount == 1) {
                        videoUpdateTipsContent.setTitle(C6399b.m19921a().getResources().getString(R.string.bre));
                    }
                    if (!TextUtils.isEmpty(b.getTitle()) || TextUtils.isEmpty(singleChatFromUser.getNickName())) {
                        videoUpdateTipsContent.setContent(b.getTitle());
                    } else {
                        videoUpdateTipsContent.setContent(C6399b.m19921a().getResources().getString(R.string.brj, new Object[]{singleChatFromUser.getNickName()}));
                    }
                    message.setContent(C31913m.m103668a(videoUpdateTipsContent));
                    this.f80412x = message;
                    C6990a.m21758a().mo18073c(singleChatFromUser.getUid());
                }
            }
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo80426a(C30915j jVar) {
        super.mo80426a(jVar);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo80435b(BaseViewHolder baseViewHolder) {
        super.onViewDetachedFromWindow(baseViewHolder);
    }

    public /* bridge */ /* synthetic */ void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    public /* bridge */ /* synthetic */ void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo80428a(BaseViewHolder baseViewHolder) {
        super.onViewAttachedToWindow(baseViewHolder);
    }

    /* renamed from: a */
    public final void mo80422a(int i) {
        this.f80413y = this.f80391c.f30972c;
        this.f80391c.f30972c = i;
        mo80437e();
    }

    /* renamed from: a */
    private static boolean m99988a(Message message) {
        if (message.isSelf()) {
            return false;
        }
        int msgType = message.getMsgType();
        if (msgType != 14) {
            switch (msgType) {
                case 1001:
                case 1002:
                    break;
                default:
                    return true;
            }
        }
        return false;
    }

    public int getItemViewType(int i) {
        return MessageViewType.valueOf((Message) this.f80473b.get(i)).getItemViewType();
    }

    public MessageAdapter(SessionInfo sessionInfo) {
        this.f80399k = sessionInfo;
        this.f80473b = new ArrayList();
        this.f80392d = new ArrayList();
        this.f80408t = new C31001v(this);
        C31330b.m102010a((C31328a) this);
        this.f80409u = IMUser.fromUser(((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUser());
        m99993m();
        m99995o();
        m99994n();
    }

    /* renamed from: a */
    public static void m99985a(String str) {
        if (!TextUtils.isEmpty(str)) {
            C7195s a = C7195s.m22438a();
            Activity g = C6405d.m19984g();
            StringBuilder sb = new StringBuilder("aweme://music/detail/");
            sb.append(str);
            a.mo18679a(g, C7203u.m22460a(sb.toString()).mo18695a());
        }
    }

    public long getItemId(int i) {
        Message message = (Message) this.f80473b.get(i);
        long rowId = message.getRowId();
        if (rowId > 0) {
            return rowId;
        }
        long msgId = message.getMsgId();
        if (msgId == 0) {
            if (!TextUtils.isEmpty(message.getUuid())) {
                msgId = (long) message.getUuid().hashCode();
            } else {
                msgId = message.getCreatedAt();
            }
        }
        return msgId;
    }

    /* renamed from: b */
    private void m99989b(String str) {
        long j;
        Message message = new Message();
        message.setMsgType(1);
        message.setUuid(UUID.randomUUID().toString());
        Conversation a = C6417a.m20015a().mo15530a(this.f80399k.getConversationId());
        long j2 = 1;
        if (a != null) {
            Message lastMessage = a.getLastMessage();
            if (lastMessage != null) {
                j2 = 1 + lastMessage.getOrderIndex();
            }
            message.setOrderIndex(j2);
            if (lastMessage != null) {
                j = lastMessage.getIndex();
            } else {
                j = a.getLastMessageIndex();
            }
            message.setIndex(j);
        } else {
            message.setOrderIndex(1);
            message.setIndex(1);
        }
        message.setConversationId(this.f80399k.getConversationId());
        SystemContent systemContent = new SystemContent();
        systemContent.setTips(str);
        message.setContent(C31913m.m103668a(systemContent));
        message.setSender(C7074e.m22072d());
        message.setCreatedAt(System.currentTimeMillis());
        message.setMsgStatus(2);
        C11443k.m33753d(message);
    }

    /* renamed from: a */
    public final int mo80421a(long j) {
        Message message = (Message) this.f80473b.get(getItemCount() - 1);
        if (message != null) {
            if (message.getIndex() <= j) {
                int itemCount = getItemCount() - 1;
                while (itemCount >= 0) {
                    Message message2 = (Message) this.f80473b.get(itemCount);
                    if (!m99988a(message2) || message2.getIndex() <= j) {
                        itemCount--;
                    } else {
                        this.f80411w = (Message) this.f80473b.get(itemCount);
                        this.f80411w.addLocalExt("show_unread_message_tips", "1");
                        notifyItemChanged(itemCount);
                        return itemCount;
                    }
                }
            } else if (!this.f80398j) {
                for (int itemCount2 = getItemCount() - 1; itemCount2 >= 0; itemCount2--) {
                    if (m99988a((Message) this.f80473b.get(itemCount2))) {
                        this.f80411w = (Message) this.f80473b.get(itemCount2);
                        this.f80411w.addLocalExt("show_unread_message_tips", "1");
                        notifyItemChanged(itemCount2);
                        return itemCount2;
                    }
                }
            }
        }
        return -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public BaseViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        BaseViewHolder baseViewHolder;
        String str;
        Context context = viewGroup.getContext();
        MessageViewType valueOf = MessageViewType.valueOf(i);
        View inflate = LayoutInflater.from(context).inflate(valueOf.getItemLayoutId(), viewGroup, false);
        if (this.f80399k == null || this.f80399k.getSelectMsgType() != 1) {
            baseViewHolder = valueOf.getViewHolder(inflate);
            baseViewHolder.f81199g = 0;
        } else {
            LayoutParams layoutParams = new LayoutParams(-1, -2);
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setLayoutParams(layoutParams);
            frameLayout.addView(inflate);
            frameLayout.addView(LayoutInflater.from(context).inflate(R.layout.y6, viewGroup, false));
            baseViewHolder = valueOf.getViewHolder(frameLayout);
            baseViewHolder.f81199g = this.f80399k.getSelectMsgType();
        }
        baseViewHolder.mo81431a(this.f80405q);
        baseViewHolder.mo81426a(this.f80406r);
        baseViewHolder.mo81424a(this.f80404p);
        if (baseViewHolder instanceof BaseRedEnvelopeHolder) {
            if (C7063bg.m22049a(context)) {
                str = "open";
            } else {
                str = "install";
            }
            C31858ad.m103409a(12, str, "duoshan_banner_show");
        }
        return baseViewHolder;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onBindViewHolder(BaseViewHolder baseViewHolder, int i) {
        String str;
        C31876av.m103569a("onBindViewHolder");
        if (baseViewHolder.f81193a == 9) {
            this.f80403o = (LoadMoreViewHolder) baseViewHolder;
            this.f80403o.mo81444f();
        } else {
            Message message = (Message) this.f80473b.get(i);
            if (baseViewHolder instanceof VoiceMessageViewHolder) {
                VoiceMessageViewHolder voiceMessageViewHolder = (VoiceMessageViewHolder) baseViewHolder;
                if (this.f80396h == null) {
                    str = null;
                } else {
                    str = this.f80396h.getUuid();
                }
                voiceMessageViewHolder.f81427q = str;
            }
            boolean z = true;
            if (i < this.f80473b.size() - 1) {
                baseViewHolder.mo81421a(message, (Message) this.f80473b.get(i + 1), MessageViewType.content(message), i);
            } else {
                baseViewHolder.mo81421a(message, null, MessageViewType.content(message), i);
            }
            if (message.isSelf()) {
                baseViewHolder.mo81433a(this.f80409u, message, i);
            } else if (this.f80399k.isGroupChat()) {
                baseViewHolder.mo81433a(C6961d.m21657a().mo18019a(String.valueOf(message.getSender())), message, i);
            } else {
                baseViewHolder.mo81433a(this.f80399k.getSingleChatFromUser(), message, i);
            }
            if (this.f80414z == null || this.f80414z.getValue() == null || !((List) this.f80414z.getValue()).contains(message)) {
                z = false;
            }
            baseViewHolder.mo81430a(message, z);
        }
        C31876av.m103570b("onBindViewHolder");
    }

    /* renamed from: a */
    public static void m99986a(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            C7195s a = C7195s.m22438a();
            Activity g = C6405d.m19984g();
            StringBuilder sb = new StringBuilder("aweme://aweme/detail/");
            sb.append(str2);
            a.mo18679a(g, C7203u.m22460a(sb.toString()).mo18694a("video_from", "from_profile_other").mo18693a("video_type", 0).mo18694a("userid", str).mo18694a("refer", "update_tips").mo18695a());
        }
    }

    /* renamed from: a */
    private void m99987a(ArrayList<DragViewInfo> arrayList, long j) {
        if (this.f80472a != null) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.f80472a.getLayoutManager();
            if (linearLayoutManager != null) {
                int j2 = linearLayoutManager.mo5445j();
                int l = linearLayoutManager.mo5447l();
                if (j2 >= 0 && l < this.f80473b.size()) {
                    while (j2 <= l) {
                        C1293v f = this.f80472a.mo5575f(j2);
                        if (f != null) {
                            View c = ((BaseViewHolder) f).mo81434c();
                            Message message = (Message) this.f80473b.get(j2);
                            if (message.getIndex() != j) {
                                DragViewInfo dragViewInfo = new DragViewInfo();
                                dragViewInfo.f82549a = message.getIndex();
                                int[] iArr = new int[2];
                                c.getLocationOnScreen(iArr);
                                IViewInfo iViewInfo = new IViewInfo(iArr[0], iArr[1], c.getHeight(), c.getWidth(), (((float) c.getHeight()) * 1.0f) / ((float) c.getWidth()));
                                dragViewInfo.f82550b = iViewInfo;
                                ArrayList<DragViewInfo> arrayList2 = arrayList;
                                arrayList.add(dragViewInfo);
                                j2++;
                            }
                        }
                        ArrayList<DragViewInfo> arrayList3 = arrayList;
                        j2++;
                    }
                }
            }
        }
    }
}
