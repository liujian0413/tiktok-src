package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.IUser;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.event.C4421am;
import com.bytedance.android.livesdk.chatroom.event.C4438h;
import com.bytedance.android.livesdk.chatroom.event.C4453w;
import com.bytedance.android.livesdk.chatroom.model.ChatGuidanceResult;
import com.bytedance.android.livesdk.chatroom.presenter.C5022h;
import com.bytedance.android.livesdk.message.model.C8541cc;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.android.livesdk.user.C8986g;
import com.bytedance.android.livesdk.user.C8987h;
import com.bytedance.android.livesdk.user.LiveInteractFunction;
import com.bytedance.android.livesdkapi.depend.model.follow.FollowPair;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.p439b.C9298a;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.p280ss.android.ugc.aweme.feed.experiment.DouPlusShareGuideExperiment;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import p346io.reactivex.C7497x;
import p346io.reactivex.C7498y;
import p346io.reactivex.p348d.C7326g;

public class CommentPromotionWidget extends LiveRecyclableWidget implements C6310a {

    /* renamed from: a */
    public C8541cc f15724a;

    /* renamed from: b */
    private Room f15725b;

    /* renamed from: c */
    private String f15726c;

    /* renamed from: d */
    private C5022h f15727d;

    /* renamed from: e */
    private Handler f15728e;

    public int getLayoutId() {
        return R.layout.att;
    }

    public void onUnload() {
        mo13687a();
    }

    /* renamed from: b */
    private void m17154b() {
        this.f15727d.mo13035a();
        this.f15728e.removeCallbacksAndMessages(null);
    }

    /* access modifiers changed from: private */
    /* renamed from: dismiss */
    public void mo13687a() {
        m17154b();
        if (this.contentView != null) {
            this.contentView.setVisibility(8);
        }
    }

    /* renamed from: c */
    private C8541cc m17155c() {
        C8541cc ccVar = new C8541cc();
        ccVar.baseMessage = this.f15724a.baseMessage;
        ccVar.f23506e = this.f15724a.f23506e;
        ccVar.f23509h = this.f15724a.f23509h;
        ccVar.f23507f = this.f15724a.f23507f;
        ccVar.f23510i = this.f15724a.f23510i;
        ccVar.f23503b = this.f15724a.f23503b;
        ccVar.f23502a = this.f15724a.f23502a;
        ccVar.f23505d = this.f15724a.f23505d;
        ccVar.f23512k = this.f15724a.f23512k;
        ccVar.f23511j = this.f15724a.f23511j;
        ccVar.f23508g = this.f15724a.f23508g;
        ccVar.f23504c = this.f15724a.f23504c;
        return ccVar;
    }

    public void onEvent(C4421am amVar) {
        mo13687a();
    }

    public void onEvent(C4453w wVar) {
        if (wVar.f12916b) {
            mo13687a();
        }
    }

    public void onInit(Object... objArr) {
        this.f15727d = new C5022h();
        this.f15728e = new C6309f(this);
    }

    /* renamed from: a */
    private <T> void m17153a(Class<T> cls) {
        C9097a.m27146a().mo22266a(cls).mo19293a((C7497x<? super T, ? extends R>) getAutoUnbindTransformer()).mo19325f((C7326g<? super T>) new C7326g<T>() {
            public final void accept(T t) throws Exception {
                if (t instanceof C9298a) {
                    CommentPromotionWidget.this.onEvent((C9298a) t);
                } else if (t instanceof C4453w) {
                    CommentPromotionWidget.this.onEvent((C4453w) t);
                } else {
                    if (t instanceof C4421am) {
                        CommentPromotionWidget.this.onEvent((C4421am) t);
                    }
                }
            }
        });
    }

    public void handleMsg(Message message) {
        if (isViewValid() && 30 == message.what && (message.obj instanceof ChatGuidanceResult)) {
            this.f15724a = ((ChatGuidanceResult) message.obj).getMessage();
            if (this.f15724a != null) {
                this.f15724a.baseMessage.f25993c = this.f15725b.getId();
                m17152a(this.f15724a);
            }
        }
    }

    public void onEvent(C9298a aVar) {
        FollowPair followPair = aVar.f25478a;
        if (this.f15725b.getOwner() != null && followPair.f25593a == this.f15725b.getOwner().getId() && followPair.mo22844a() != 0) {
            m17154b();
        }
    }

    public void onLoad(Object... objArr) {
        this.f15725b = (Room) this.dataCenter.get("data_room");
        this.f15726c = (String) this.dataCenter.get("data_enter_source");
        this.f15727d = new C5022h();
        this.f15728e = new C6309f(this);
        this.f15727d.mo13036a(this.f15725b, this.f15728e);
        m17153a(C9298a.class);
        m17153a(C4453w.class);
        m17153a(C4421am.class);
    }

    /* renamed from: a */
    private void m17152a(C8541cc ccVar) {
        m17154b();
        this.contentView.setVisibility(0);
        TextView textView = (TextView) this.contentView.findViewById(R.id.zm);
        View findViewById = this.contentView.findViewById(R.id.zl);
        try {
            findViewById.setBackgroundDrawable(getContext().getResources().getDrawable(R.drawable.bo6));
        } catch (Exception unused) {
        }
        textView.setText(ccVar.f23506e);
        findViewById.setOnClickListener(new C5731q(this, ccVar));
        this.f15728e.postDelayed(new C5732r(this), DouPlusShareGuideExperiment.MIN_VALID_DURATION);
        C5022h.m16106a(this.f15725b, this.f15726c, ccVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo13688a(C8541cc ccVar, View view) {
        mo13687a();
        if (!TTLiveSDKContext.getHostService().mo22367h().mo22182c()) {
            TTLiveSDKContext.getHostService().mo22367h().mo22167a(this.context, C8987h.m26865a().mo22189a(C3358ac.m12515a((int) R.string.efb)).mo22193d("live_detail").mo22194e("comment_live").mo22192c("input").mo22188a(18).mo22190a()).mo19293a((C7497x<? super T, ? extends R>) getAutoUnbindTransformer()).mo19189a((C7498y<? super T>) new C8986g<IUser>() {
                public final void onError(Throwable th) {
                    super.onError(th);
                    if (CommentPromotionWidget.this.f15724a != null) {
                        CommentPromotionWidget.this.f15724a = null;
                    }
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public void onNext(IUser iUser) {
                    super.onNext(iUser);
                    if (CommentPromotionWidget.this.f15724a != null) {
                        CommentPromotionWidget.this.dataCenter.lambda$put$1$DataCenter("cmd_do_send_message", new C4438h(CommentPromotionWidget.this.f15724a.f23506e));
                        CommentPromotionWidget.this.f15724a = null;
                    }
                }
            });
        } else if (!TTLiveSDKContext.getHostService().mo22367h().mo22178a(LiveInteractFunction.COMMENT_GUIDE)) {
            C4438h hVar = new C4438h(ccVar.f23506e);
            hVar.f12885b = true;
            m17155c();
            hVar.f12886c = m17155c();
            this.dataCenter.lambda$put$1$DataCenter("cmd_do_send_message", hVar);
            this.f15724a = null;
        }
    }
}
