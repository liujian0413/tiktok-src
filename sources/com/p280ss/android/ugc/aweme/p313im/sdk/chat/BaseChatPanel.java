package com.p280ss.android.ugc.aweme.p313im.sdk.chat;

import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.C0053p;
import android.content.Context;
import android.content.Intent;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.support.p022v4.content.C0683b;
import android.support.p029v7.widget.DefaultItemAnimator;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1273i;
import android.support.p029v7.widget.RecyclerView.C1281m;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.bytedance.p263im.core.model.C11443k;
import com.bytedance.p263im.core.model.C6417a;
import com.bytedance.p263im.core.model.Conversation;
import com.bytedance.p263im.core.model.Message;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.ReadStateViewModel.C30723a;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.C30803b;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.C30804c;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.C30804c.C30818a;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.C30804c.C30819b;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.audio.C30768a;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.audio.C30769b;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.audio.C30770c;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.audio.widget.AudioRecordStateView;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.p1316a.C30759a;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.photo.PhotoParam;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.net.C30963v;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.net.C6946a;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.net.video.C30973g;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.net.video.VideoParam;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.selectmsg.C6951b;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.view.MentionEditText.C31007e;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder.C31024d;
import com.p280ss.android.ugc.aweme.p313im.sdk.group.GroupMemberSelectActivity.C31242a;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.choose.model.MediaChooseResult;
import com.p280ss.android.ugc.aweme.p313im.sdk.model.StrangerMessageList;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6961d;
import com.p280ss.android.ugc.aweme.p313im.sdk.p316h.C31330b;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31858ad;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31878ax;
import com.p280ss.android.ugc.aweme.p313im.sdk.widget.ImTextTitleBar;
import com.p280ss.android.ugc.aweme.p313im.sdk.widget.ImTextTitleBar.C31980a;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMUser;
import com.p280ss.android.ugc.aweme.p313im.service.p1350c.C32006a;
import com.p280ss.android.ugc.aweme.story.api.model.DetailParams;
import com.p280ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.TypeCastException;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;
import org.greenrobot.eventbus.C7705c;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.BaseChatPanel */
public class BaseChatPanel extends BasePanel {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f80334a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(BaseChatPanel.class), "mRecyclerViewGestureDetector", "getMRecyclerViewGestureDetector()Landroid/view/GestureDetector;"))};

    /* renamed from: b */
    public final View f80335b;

    /* renamed from: c */
    public final Context f80336c;

    /* renamed from: d */
    public final FragmentActivity f80337d;

    /* renamed from: e */
    public final ImTextTitleBar f80338e;

    /* renamed from: f */
    public final WrapLinearLayoutManager f80339f;

    /* renamed from: g */
    public final C30803b f80340g;

    /* renamed from: h */
    public C0052o<List<Message>> f80341h;

    /* renamed from: i */
    public final MessageAdapter f80342i;

    /* renamed from: j */
    public boolean f80343j;

    /* renamed from: k */
    public final SessionInfo f80344k;

    /* renamed from: o */
    private final Fragment f80345o;

    /* renamed from: p */
    private final RecyclerView f80346p;

    /* renamed from: q */
    private final AudioRecordStateView f80347q;

    /* renamed from: r */
    private final C30770c f80348r;

    /* renamed from: s */
    private final C30603d f80349s;

    /* renamed from: t */
    private final C30985q f80350t;

    /* renamed from: u */
    private C31056y f80351u;

    /* renamed from: v */
    private final C7541d f80352v;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.BaseChatPanel$a */
    static final class C30600a<T> implements C0053p<List<? extends Message>> {

        /* renamed from: a */
        final /* synthetic */ BaseChatPanel f80355a;

        /* renamed from: b */
        final /* synthetic */ C0043i f80356b;

        C30600a(BaseChatPanel baseChatPanel, C0043i iVar) {
            this.f80355a = baseChatPanel;
            this.f80356b = iVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(List<Message> list) {
            this.f80355a.mo80388a(list);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.BaseChatPanel$b */
    static final class C30601b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ BaseChatPanel f80357a;

        C30601b(BaseChatPanel baseChatPanel) {
            this.f80357a = baseChatPanel;
        }

        public final void run() {
            this.f80357a.mo80391b(this.f80357a.f80338e);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.BaseChatPanel$c */
    static final class C30602c implements OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ RecyclerView f80358a;

        /* renamed from: b */
        final /* synthetic */ BaseChatPanel f80359b;

        C30602c(RecyclerView recyclerView, BaseChatPanel baseChatPanel) {
            this.f80358a = recyclerView;
            this.f80359b = baseChatPanel;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (!C7573i.m23585a((Object) view, (Object) this.f80358a) || !this.f80359b.mo80380a().onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.BaseChatPanel$d */
    public final class C30603d implements C30630b {
        public C30603d() {
        }

        /* renamed from: a */
        public final void mo80404a(String str) {
            IMUser b = C6961d.m21657a().mo18029b(str);
            if (b != null) {
                String uid = b.getUid();
                if (uid != null) {
                    BaseChatPanel baseChatPanel = BaseChatPanel.this;
                    String nickName = b.getNickName();
                    C7573i.m23582a((Object) nickName, "nickName");
                    baseChatPanel.mo80387a(nickName, uid);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.BaseChatPanel$e */
    public static final class C30604e implements C31980a {

        /* renamed from: a */
        final /* synthetic */ BaseChatPanel f80361a;

        /* renamed from: a */
        public final void mo18096a() {
            this.f80361a.f80337d.onBackPressed();
        }

        /* renamed from: b */
        public final void mo18097b() {
            boolean z;
            List list = (List) this.f80361a.f80341h.getValue();
            Collection collection = list;
            boolean z2 = false;
            if (collection == null || collection.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                C10761a.m31383a(this.f80361a.f80336c, (int) R.string.bgi).mo25750a();
                return;
            }
            String b = BaseChatPanel.m99932b(list);
            CharSequence charSequence = b;
            if (charSequence == null || charSequence.length() == 0) {
                z2 = true;
            }
            if (!z2) {
                C6951b.m21624a(this.f80361a.f80344k.getConversationId(), list);
                C32006a aVar = new C32006a();
                aVar.f83726b = this.f80361a.f80344k.getConversationId();
                aVar.f83725a = b;
                C7705c.m23799a().mo20394d(aVar);
                this.f80361a.f80337d.finish();
            }
        }

        C30604e(BaseChatPanel baseChatPanel) {
            this.f80361a = baseChatPanel;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.BaseChatPanel$f */
    static final class C30605f extends Lambda implements C7561a<GestureDetector> {

        /* renamed from: a */
        final /* synthetic */ BaseChatPanel f80362a;

        C30605f(BaseChatPanel baseChatPanel) {
            this.f80362a = baseChatPanel;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public GestureDetector invoke() {
            return new GestureDetector(this.f80362a.f80336c, new SimpleOnGestureListener(this) {

                /* renamed from: a */
                final /* synthetic */ C30605f f80363a;

                {
                    this.f80363a = r1;
                }

                public final boolean onSingleTapUp(MotionEvent motionEvent) {
                    C7573i.m23587b(motionEvent, "e");
                    this.f80363a.f80362a.f80340g.mo80335d();
                    return super.onSingleTapConfirmed(motionEvent);
                }

                public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                    if (motionEvent == null || motionEvent2 == null) {
                        return super.onFling(motionEvent, motionEvent2, f, f2);
                    }
                    float x = motionEvent.getX() - motionEvent2.getX();
                    if (motionEvent.getY() < motionEvent2.getY()) {
                        float y = motionEvent2.getY() - motionEvent.getY();
                        if (x == 0.0f) {
                            x = 1.0f;
                        }
                        if (y / Math.abs(x) > 0.65f && this.f80363a.f80362a.f80339f.mo5448m() == this.f80363a.f80362a.f80342i.getItemCount() - 1) {
                            this.f80363a.f80362a.mo80393d();
                        }
                    }
                    return super.onFling(motionEvent, motionEvent2, f, f2);
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.BaseChatPanel$g */
    static final class C30607g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ BaseChatPanel f80364a;

        /* renamed from: b */
        final /* synthetic */ Intent f80365b;

        C30607g(BaseChatPanel baseChatPanel, Intent intent) {
            this.f80364a = baseChatPanel;
            this.f80365b = intent;
        }

        public final void run() {
            this.f80364a.mo80383a(this.f80365b);
        }
    }

    /* renamed from: a */
    public final GestureDetector mo80380a() {
        return (GestureDetector) this.f80352v.getValue();
    }

    /* renamed from: a */
    public void mo80384a(C30985q qVar) {
        C7573i.m23587b(qVar, "messageObserver");
    }

    /* renamed from: a */
    public void mo80386a(ImTextTitleBar imTextTitleBar) {
        C7573i.m23587b(imTextTitleBar, "titleBar");
    }

    /* renamed from: b */
    public void mo80390b() {
    }

    /* renamed from: a */
    public final void mo80389a(boolean z) {
        this.f80343j = z;
        if (z) {
            if (this.f80344k.getSelectMsgType() == 1) {
                this.f80340g.mo80332b(8);
                return;
            }
            this.f80340g.mo80332b(0);
        }
    }

    /* renamed from: c */
    public void mo80392c() {
        this.f80342i.mo80436d();
    }

    /* renamed from: d */
    public final void mo80393d() {
        this.f80342i.mo80437e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo80394e() {
        this.f80340g.mo80334c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo80395f() {
        this.f80340g.mo80335d();
    }

    public void onResume() {
        super.onResume();
        mo80391b(this.f80338e);
    }

    public void onStop() {
        super.onStop();
        this.f80348r.mo80572a();
        this.f80351u.mo81534e();
    }

    public void onCreate() {
        super.onCreate();
        C31858ad.m103413a(this.f80344k);
        mo80390b();
        mo80391b(this.f80338e);
        mo80384a(this.f80350t);
        mo80392c();
    }

    public void onDestroy() {
        super.onDestroy();
        this.f80348r.mo80578b();
        this.f80342i.mo80440h();
        this.f80350t.bb_();
        C6946a.m21606a().mo18003d();
        if (this.f80345o instanceof AbsFragment) {
            ((AbsFragment) this.f80345o).mo15379b(this.f80350t);
        }
        C31858ad.m103413a((SessionInfo) null);
        C31024d.m101257b();
    }

    /* renamed from: b */
    public final void mo80391b(ImTextTitleBar imTextTitleBar) {
        mo80386a(imTextTitleBar);
        m99933c(imTextTitleBar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo80385a(StrangerMessageList strangerMessageList) {
        C7573i.m23587b(strangerMessageList, "data");
        this.f80342i.mo80430a(strangerMessageList.toChatMessages());
    }

    /* renamed from: c */
    private final void m99933c(ImTextTitleBar imTextTitleBar) {
        if (this.f80344k.getSelectMsgType() == 1) {
            imTextTitleBar.setOnTitlebarClickListener(new C30604e(this));
            imTextTitleBar.setRightTextColor(C0683b.m2912c(this.f80336c, R.color.aw3));
            imTextTitleBar.setLeftIcon((int) R.drawable.b61);
            imTextTitleBar.setRightText((int) R.string.bi8);
            mo80388a((List) this.f80341h.getValue());
        }
    }

    /* renamed from: a */
    public final void mo80381a(int i) {
        if (this.f80346p.getLayoutManager() instanceof LinearLayoutManager) {
            C1273i layoutManager = this.f80346p.getLayoutManager();
            if (layoutManager != null) {
                if (layoutManager != null) {
                    ((LinearLayoutManager) layoutManager).mo5417a(0, 0);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.support.v7.widget.LinearLayoutManager");
            }
        }
    }

    /* renamed from: b */
    public static String m99932b(List<Message> list) {
        boolean z;
        boolean z2;
        Collection collection = list;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "";
        }
        String str = "";
        String str2 = ",";
        StringBuilder sb = new StringBuilder();
        for (Message message : list) {
            if (message != null) {
                sb.append(message.getMsgId());
                sb.append(str2);
            }
        }
        if (sb.length() > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            str = sb.substring(0, sb.length() - 1);
            C7573i.m23582a((Object) str, "msgIdBuilder.substring(0, msgIdBuilder.length - 1)");
        }
        return str;
    }

    /* renamed from: a */
    public final void mo80383a(Intent intent) {
        if (intent != null) {
            ArrayList stringArrayListExtra = intent.getStringArrayListExtra("im_edit_texts");
            int intExtra = intent.getIntExtra("im_is_from_gallery", 0);
            int intExtra2 = intent.getIntExtra("im_height", 0);
            int intExtra3 = intent.getIntExtra("im_width", 0);
            String stringExtra = intent.getStringExtra("im_local_path");
            CharSequence stringExtra2 = intent.getStringExtra("im_type");
            if (TextUtils.equals(stringExtra2, "im_photo")) {
                PhotoParam photoParam = new PhotoParam();
                photoParam.setFromGallery(intExtra);
                photoParam.setCheckTexts(stringArrayListExtra);
                photoParam.setPath(stringExtra);
                photoParam.setHeight(intExtra2);
                photoParam.setWith(intExtra3);
                C30963v.m100755a().mo81336a(this.f80344k.getConversationId(), C7525m.m23457a(photoParam));
            } else {
                if (TextUtils.equals(stringExtra2, "im_video")) {
                    String stringExtra3 = intent.getStringExtra("im_src_frame_path");
                    String stringExtra4 = intent.getStringExtra("im_video_cover");
                    String stringExtra5 = intent.getStringExtra("im_src_video_md5");
                    VideoParam videoParam = new VideoParam();
                    videoParam.setThumbnailPath(stringExtra4);
                    videoParam.setFromGallery(intExtra);
                    videoParam.setSrcVideoMD5(stringExtra5);
                    videoParam.setCheckTexts(stringArrayListExtra);
                    videoParam.setCheckPic(stringExtra3);
                    videoParam.setVideoPath(stringExtra);
                    videoParam.setHeight(intExtra2);
                    videoParam.setWidth(intExtra3);
                    C30973g.m100789a(this.f80344k.getConversationId(), videoParam);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo80388a(List<Message> list) {
        boolean z;
        Collection collection = list;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            View rightView = this.f80338e.getRightView();
            C7573i.m23582a((Object) rightView, "mTitleBar.rightView");
            rightView.setAlpha(0.34f);
            C31878ax.m103578b(this.f80338e.getRightView());
            return;
        }
        View rightView2 = this.f80338e.getRightView();
        C7573i.m23582a((Object) rightView2, "mTitleBar.rightView");
        rightView2.setAlpha(1.0f);
        C31878ax.m103576a(this.f80338e.getRightView());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo80387a(String str, String str2) {
        C7573i.m23587b(str, "nickname");
        C7573i.m23587b(str2, "uid");
        this.f80340g.mo80329a(str, str2);
    }

    /* renamed from: a */
    public void mo80382a(int i, int i2, Intent intent) {
        Serializable serializable;
        Serializable serializable2;
        if (i2 == -1 && i == 220) {
            if (intent != null) {
                Serializable serializableExtra = intent.getSerializableExtra("extra_story_detail_params");
                if (serializableExtra != null) {
                    if (serializableExtra != null) {
                        C31330b.m102012a(((DetailParams) serializableExtra).storyState);
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.story.api.model.DetailParams");
                    }
                }
            }
        } else if (i2 == 7 && i == 6) {
            this.f80346p.postDelayed(new C30607g(this, intent), 300);
        } else if (i == 2001) {
            if (intent != null) {
                serializable2 = intent.getSerializableExtra("extra_choose_result");
            } else {
                serializable2 = null;
            }
            if (!(serializable2 instanceof MediaChooseResult)) {
                serializable2 = null;
            }
            MediaChooseResult mediaChooseResult = (MediaChooseResult) serializable2;
            if (i2 == 2012 && mediaChooseResult != null) {
                C30759a.m100199a(this.f80337d, this.f80344k.getConversationId(), mediaChooseResult);
            }
        } else if (i == 2002) {
            if (intent != null) {
                serializable = intent.getSerializableExtra("extra_choose_result");
            } else {
                serializable = null;
            }
            if (!(serializable instanceof MediaChooseResult)) {
                serializable = null;
            }
            MediaChooseResult mediaChooseResult2 = (MediaChooseResult) serializable;
            if (i2 == 2012) {
                if (mediaChooseResult2 != null) {
                    C30759a.m100199a(this.f80337d, this.f80344k.getConversationId(), mediaChooseResult2);
                }
            } else if (mediaChooseResult2 != null) {
                C30759a.m100198a(this.f80337d, mediaChooseResult2);
            }
        }
    }

    public BaseChatPanel(C0043i iVar, View view, SessionInfo sessionInfo) {
        C7573i.m23587b(iVar, "parent");
        C7573i.m23587b(view, "rootView");
        C7573i.m23587b(sessionInfo, "sessionInfo");
        super(iVar);
        this.f80344k = sessionInfo;
        this.f80335b = view;
        this.f80336c = view.getContext();
        Context context = this.f80336c;
        if (context != null) {
            this.f80337d = (FragmentActivity) context;
            this.f80345o = (Fragment) iVar;
            View findViewById = view.findViewById(R.id.va);
            C7573i.m23582a((Object) findViewById, "rootView.findViewById(R.id.chat_title_layout)");
            this.f80338e = (ImTextTitleBar) findViewById;
            View findViewById2 = view.findViewById(R.id.cqb);
            C7573i.m23582a((Object) findViewById2, "rootView.findViewById(R.id.recycle_view)");
            this.f80346p = (RecyclerView) findViewById2;
            this.f80339f = new WrapLinearLayoutManager(this.f80336c);
            View findViewById3 = view.findViewById(R.id.h6);
            C7573i.m23582a((Object) findViewById3, "rootView.findViewById(R.id.arsv_state)");
            this.f80347q = (AudioRecordStateView) findViewById3;
            C30804c a = C30804c.m100357a((ViewGroup) view, this.f80344k);
            C7573i.m23582a((Object) a, "InputView.inject(rootVie…s ViewGroup, sessionInfo)");
            this.f80340g = a;
            C0052o<List<Message>> oVar = new C0052o<>();
            oVar.observe(iVar, new C30600a(this, iVar));
            this.f80341h = oVar;
            C30770c cVar = new C30770c();
            C30769b a2 = C30769b.m100229a();
            C7573i.m23582a((Object) a2, "AudioCenter.inst()");
            a2.f80549a = new C30768a();
            cVar.mo80575a(this.f80340g.mo80336e(), this.f80347q);
            this.f80348r = cVar;
            this.f80349s = new C30603d();
            MessageAdapter messageAdapter = new MessageAdapter(this.f80344k);
            messageAdapter.setHasStableIds(true);
            messageAdapter.mo80425a(this.f80348r);
            messageAdapter.f80401m = this.f80349s;
            messageAdapter.mo80423a(this.f80341h);
            this.f80342i = messageAdapter;
            C30985q qVar = new C30985q(this.f80344k.getConversationId(), this.f80342i);
            qVar.f81114d = new C30601b(this);
            this.f80350t = qVar;
            this.f80343j = true;
            this.f80352v = C7546e.m23569a(new C30605f(this));
            RecyclerView recyclerView = this.f80346p;
            recyclerView.setClickable(true);
            C305981 r4 = new DefaultItemAnimator() {
                /* renamed from: a */
                public final boolean mo5328a(C1293v vVar, C1293v vVar2, int i, int i2, int i3, int i4) {
                    C7573i.m23587b(vVar, "oldHolder");
                    C7573i.m23587b(vVar2, "newHolder");
                    if (vVar == vVar2) {
                        return super.mo5328a(vVar, vVar2, i, i2, i3, i4);
                    }
                    vVar.itemView.animate().cancel();
                    vVar2.itemView.animate().cancel();
                    vVar.itemView.animate().alpha(0.0f).setDuration(125).start();
                    return true;
                }
            };
            r4.f5112m = false;
            recyclerView.setItemAnimator(r4);
            WrapLinearLayoutManager wrapLinearLayoutManager = this.f80339f;
            wrapLinearLayoutManager.mo5428b(true);
            recyclerView.setLayoutManager(wrapLinearLayoutManager);
            recyclerView.setVerticalScrollBarEnabled(true);
            recyclerView.setScrollBarStyle(33554432);
            recyclerView.setAdapter(this.f80342i);
            recyclerView.requestDisallowInterceptTouchEvent(true);
            recyclerView.setOnTouchListener(new C30602c(recyclerView, this));
            recyclerView.mo5528a((C1281m) new BaseChatPanel$$special$$inlined$apply$lambda$2(this.f80336c, this));
            C31024d.m101253a(recyclerView);
            this.f80340g.mo80326a((C30819b) new C30819b(this) {

                /* renamed from: a */
                final /* synthetic */ BaseChatPanel f80353a;

                {
                    this.f80353a = r1;
                }

                /* renamed from: a */
                public final void mo80400a(int i) {
                    if (i == 0) {
                        if (this.f80353a.f80370m && !this.f80353a.f80343j && this.f80353a.f80344k.isGroupChat()) {
                            this.f80353a.f80340g.mo80332b(4);
                        }
                        this.f80353a.mo80381a(0);
                        C31024d.m101250a();
                    }
                }
            });
            this.f80340g.mo80327a((C31007e) new C31007e(this) {

                /* renamed from: a */
                final /* synthetic */ BaseChatPanel f80354a;

                /* renamed from: a */
                public final void mo80401a() {
                    Conversation a = C6417a.m20015a().mo15530a(this.f80354a.f80344k.getConversationId());
                    if (this.f80354a.f80344k.isGroupChat()) {
                        C7573i.m23582a((Object) a, "conversation");
                        if (a.getMemberCount() > 1) {
                            this.f80354a.f80340g.mo80335d();
                            C31242a.m101792a(this.f80354a.f80337d, 6, this.f80354a.f80344k.getConversationId(), 223);
                        }
                    }
                }

                {
                    this.f80354a = r1;
                }
            });
            ReadStateViewModel a3 = C30723a.m100092a(this.f80337d);
            SessionInfo sessionInfo2 = this.f80344k;
            C11443k kVar = this.f80350t.f81112b;
            C7573i.m23582a((Object) kVar, "mMessageObserver.messageModel");
            a3.mo80473a(sessionInfo2, kVar);
            a3.mo80471a((C0043i) this.f80345o);
            this.f80342i.mo80426a((C30915j) a3);
            this.f80340g.mo80325a((C30818a) a3);
            this.f80351u = new C31056y(this.f80335b, this.f80346p, this.f80342i);
            if (this.f80345o instanceof AbsFragment) {
                ((AbsFragment) this.f80345o).mo15377a(this.f80350t);
                return;
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }
}
