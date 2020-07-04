package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.IUser;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.setting.C3338l;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.event.C4414af;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.message.model.C8520bo;
import com.bytedance.android.livesdk.message.model.C8520bo.C8521a;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.android.livesdk.user.C8984e;
import com.bytedance.android.livesdk.utils.C9048ao;
import com.bytedance.android.livesdk.utils.p426b.C9057b;
import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.p458j.p459a.C9494e;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.p280ss.ugc.live.sdk.message.data.IMessage;
import com.p280ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.p280ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Ref.LongRef;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p348d.C7327h;

public final class PopularCardWidget extends LiveRecyclableWidget implements OnMessageListener {

    /* renamed from: d */
    public static final C5498a f16337d = new C5498a(null);

    /* renamed from: a */
    public final String f16338a;

    /* renamed from: b */
    public TextView f16339b;

    /* renamed from: c */
    public Room f16340c;

    /* renamed from: e */
    private IMessageManager f16341e;

    /* renamed from: f */
    private C7321c f16342f;

    /* renamed from: g */
    private ValueAnimator f16343g;

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.PopularCardWidget$a */
    public static final class C5498a {
        private C5498a() {
        }

        public /* synthetic */ C5498a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.PopularCardWidget$b */
    static final class C5499b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PopularCardWidget f16344a;

        C5499b(PopularCardWidget popularCardWidget) {
            this.f16344a = popularCardWidget;
        }

        public final void onClick(View view) {
            if (!TextUtils.isEmpty(this.f16344a.f16338a)) {
                C9494e eVar = new C9494e(this.f16344a.f16338a);
                User owner = PopularCardWidget.m17767a(this.f16344a).getOwner();
                C7573i.m23582a((Object) owner, "room.owner");
                eVar.mo23524a("anchor_id", owner.getId());
                eVar.mo23524a("room_id", PopularCardWidget.m17767a(this.f16344a).getId());
                C8984e h = TTLiveSDKContext.getHostService().mo22367h();
                C7573i.m23582a((Object) h, "TTLiveSDKContext.getHostService().user()");
                IUser a = h.mo22165a();
                C7573i.m23582a((Object) a, "TTLiveSDKContext.getHost…vice().user().currentUser");
                if (a != null) {
                    eVar.mo23524a("user_id", a.getId());
                }
                C4414af afVar = new C4414af(eVar.mo23522a(), "", 17, 280, 208, 2);
                afVar.f12832h = false;
                C9097a.m27146a().mo22267a((Object) afVar);
                this.f16344a.mo13978a("popular_card_icon_click");
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.PopularCardWidget$c */
    static final class C5500c<T, R> implements C7327h<T, R> {

        /* renamed from: a */
        final /* synthetic */ LongRef f16345a;

        C5500c(LongRef longRef) {
            this.f16345a = longRef;
        }

        /* renamed from: a */
        private long m17771a(Long l) {
            C7573i.m23587b(l, "increase");
            return this.f16345a.element - l.longValue();
        }

        public final /* synthetic */ Object apply(Object obj) {
            return Long.valueOf(m17771a((Long) obj));
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.PopularCardWidget$d */
    static final class C5501d<T> implements C7326g<Long> {

        /* renamed from: a */
        final /* synthetic */ PopularCardWidget f16346a;

        C5501d(PopularCardWidget popularCardWidget) {
            this.f16346a = popularCardWidget;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(Long l) {
            TextView b = PopularCardWidget.m17769b(this.f16346a);
            C7573i.m23582a((Object) l, "left");
            b.setText(C9048ao.m27017a(l.longValue()));
            if (l.longValue() <= 0) {
                ViewGroup viewGroup = this.f16346a.containerView;
                C7573i.m23582a((Object) viewGroup, "containerView");
                viewGroup.setVisibility(8);
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.PopularCardWidget$e */
    static final class C5502e implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ PopularCardWidget f16347a;

        C5502e(PopularCardWidget popularCardWidget) {
            this.f16347a = popularCardWidget;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C7573i.m23582a((Object) valueAnimator, "it");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                float floatValue = ((Float) animatedValue).floatValue();
                View view = this.f16347a.contentView;
                C7573i.m23582a((Object) view, "contentView");
                LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams != null) {
                    ((FrameLayout.LayoutParams) layoutParams).topMargin = (int) (((float) C3358ac.m12510a(80.0f)) * (1.0f - floatValue));
                    View view2 = this.f16347a.contentView;
                    C7573i.m23582a((Object) view2, "contentView");
                    view2.setAlpha(floatValue);
                    this.f16347a.contentView.requestLayout();
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    public final int getLayoutId() {
        return R.layout.ay7;
    }

    public PopularCardWidget() {
        C3338l<String> lVar = LiveConfigSettingKeys.LIVE_POPULARITY_CARD_URL;
        C7573i.m23582a((Object) lVar, "LiveConfigSettingKeys.LIVE_POPULARITY_CARD_URL");
        this.f16338a = (String) lVar.mo10240a();
    }

    public final void onUnload() {
        IMessageManager iMessageManager = this.f16341e;
        if (iMessageManager == null) {
            C7573i.m23583a("messageManager");
        }
        if (iMessageManager != null) {
            IMessageManager iMessageManager2 = this.f16341e;
            if (iMessageManager2 == null) {
                C7573i.m23583a("messageManager");
            }
            iMessageManager2.removeMessageListener(this);
        }
        ViewGroup viewGroup = this.containerView;
        C7573i.m23582a((Object) viewGroup, "containerView");
        if (viewGroup.getVisibility() == 0) {
            ViewGroup viewGroup2 = this.containerView;
            C7573i.m23582a((Object) viewGroup2, "containerView");
            viewGroup2.setVisibility(8);
        }
        if (this.f16342f != null) {
            C7321c cVar = this.f16342f;
            if (cVar == null) {
                C7573i.m23580a();
            }
            if (!cVar.isDisposed()) {
                C7321c cVar2 = this.f16342f;
                if (cVar2 != null) {
                    cVar2.dispose();
                }
            }
        }
        ValueAnimator valueAnimator = this.f16343g;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ Room m17767a(PopularCardWidget popularCardWidget) {
        Room room = popularCardWidget.f16340c;
        if (room == null) {
            C7573i.m23583a("room");
        }
        return room;
    }

    /* renamed from: b */
    public static final /* synthetic */ TextView m17769b(PopularCardWidget popularCardWidget) {
        TextView textView = popularCardWidget.f16339b;
        if (textView == null) {
            C7573i.m23583a("timeCountTv");
        }
        return textView;
    }

    public final void onInit(Object[] objArr) {
        View findViewById = findViewById(R.id.dj8);
        C7573i.m23582a((Object) findViewById, "findViewById(R.id.time_count_tv)");
        this.f16339b = (TextView) findViewById;
        this.containerView.setOnClickListener(new C5499b(this));
    }

    public final void onMessage(IMessage iMessage) {
        if (iMessage instanceof C8520bo) {
            C8520bo boVar = (C8520bo) iMessage;
            if (boVar.f23421a != null) {
                C8521a aVar = boVar.f23421a;
                C7573i.m23582a((Object) aVar, "message.popularCardInfo");
                if (aVar.f23422a == 0) {
                    C8521a aVar2 = boVar.f23421a;
                    C7573i.m23582a((Object) aVar2, "message.popularCardInfo");
                    m17768a(aVar2);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo13978a(String str) {
        Map linkedHashMap = new LinkedHashMap();
        String str2 = "room_id";
        Room room = this.f16340c;
        if (room == null) {
            C7573i.m23583a("room");
        }
        String idStr = room.getIdStr();
        C7573i.m23582a((Object) idStr, "room.idStr");
        linkedHashMap.put(str2, idStr);
        C8443c.m25663a().mo21606a(str, linkedHashMap, new Object[0]);
    }

    public final void onLoad(Object[] objArr) {
        Object obj = this.dataCenter.get("data_message_manager");
        C7573i.m23582a(obj, "dataCenter.get(WidgetCon…ant.DATA_MESSAGE_MANAGER)");
        this.f16341e = (IMessageManager) obj;
        IMessageManager iMessageManager = this.f16341e;
        if (iMessageManager == null) {
            C7573i.m23583a("messageManager");
        }
        if (iMessageManager != null) {
            IMessageManager iMessageManager2 = this.f16341e;
            if (iMessageManager2 == null) {
                C7573i.m23583a("messageManager");
            }
            iMessageManager2.addMessageListener(MessageType.POPULAR_CARD_MESSAGE.getIntType(), this);
        }
        Object obj2 = this.dataCenter.get("data_room");
        C7573i.m23582a(obj2, "dataCenter.get(WidgetConstant.DATA_ROOM)");
        this.f16340c = (Room) obj2;
        ViewGroup viewGroup = this.containerView;
        C7573i.m23582a((Object) viewGroup, "containerView");
        viewGroup.setVisibility(8);
    }

    /* renamed from: a */
    private final void m17768a(C8521a aVar) {
        if ((aVar.f23424c * 1000) - System.currentTimeMillis() > 0) {
            ViewGroup viewGroup = this.containerView;
            C7573i.m23582a((Object) viewGroup, "containerView");
            viewGroup.setVisibility(0);
            LongRef longRef = new LongRef();
            longRef.element = ((aVar.f23424c * 1000) - System.currentTimeMillis()) / 1000;
            if (this.f16342f != null) {
                C7321c cVar = this.f16342f;
                if (cVar == null) {
                    C7573i.m23580a();
                }
                if (!cVar.isDisposed()) {
                    C7321c cVar2 = this.f16342f;
                    if (cVar2 != null) {
                        cVar2.dispose();
                    }
                }
            }
            TextView textView = this.f16339b;
            if (textView == null) {
                C7573i.m23583a("timeCountTv");
            }
            textView.setText(C9048ao.m27017a(longRef.element));
            this.f16342f = C9057b.m27053a(1, TimeUnit.SECONDS).mo19305c(longRef.element + 1).mo19317d((C7327h<? super T, ? extends R>) new C5500c<Object,Object>(longRef)).mo19294a(C47549a.m148327a()).mo19325f((C7326g<? super T>) new C5501d<Object>(this));
            ValueAnimator valueAnimator = this.f16343g;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f16343g = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f}).setDuration(500);
            ValueAnimator valueAnimator2 = this.f16343g;
            if (valueAnimator2 != null) {
                valueAnimator2.setInterpolator(new AccelerateDecelerateInterpolator());
            }
            View view = this.contentView;
            C7573i.m23582a((Object) view, "contentView");
            view.setAlpha(0.0f);
            ValueAnimator valueAnimator3 = this.f16343g;
            if (valueAnimator3 != null) {
                valueAnimator3.addUpdateListener(new C5502e(this));
            }
            ValueAnimator valueAnimator4 = this.f16343g;
            if (valueAnimator4 != null) {
                valueAnimator4.start();
            }
            mo13978a("popular_card_icon_show");
            return;
        }
        ViewGroup viewGroup2 = this.containerView;
        C7573i.m23582a((Object) viewGroup2, "containerView");
        if (viewGroup2.getVisibility() == 0) {
            ViewGroup viewGroup3 = this.containerView;
            C7573i.m23582a((Object) viewGroup3, "containerView");
            viewGroup3.setVisibility(8);
        }
    }
}
