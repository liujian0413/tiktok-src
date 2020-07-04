package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import android.app.Activity;
import android.content.Context;
import android.os.Build.VERSION;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewParent;
import android.webkit.WebView;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.rxutils.autodispose.C3245ad;
import com.bytedance.android.live.core.setting.C3338l;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.core.utils.C3404s.C3405a;
import com.bytedance.android.livesdk.banner.InRoomBannerManager;
import com.bytedance.android.livesdk.banner.InRoomBannerManager.C3924b;
import com.bytedance.android.livesdk.browser.p193c.C3972b;
import com.bytedance.android.livesdk.browser.p193c.C3972b.C3977d;
import com.bytedance.android.livesdk.browser.p193c.C3972b.C3978e;
import com.bytedance.android.livesdk.chatroom.model.C4899c.C4900a;
import com.bytedance.android.livesdk.chatroom.p210c.C4299b;
import com.bytedance.android.livesdk.chatroom.utils.C5343e;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.p404a.C8416g;
import com.bytedance.android.livesdk.log.p404a.C8420k;
import com.bytedance.android.livesdk.log.p405b.C8438j;
import com.bytedance.android.livesdk.log.p405b.C8439k;
import com.bytedance.android.livesdk.message.model.C8495au;
import com.bytedance.android.livesdk.p428w.C9178j;
import com.bytedance.android.livesdk.utils.C9072j;
import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.bytedance.android.livesdkapi.depend.model.live.C9357a;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.google.gson.C6709k;
import com.p280ss.ugc.live.sdk.message.data.IMessage;
import com.p280ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.p280ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7494t;
import p346io.reactivex.p348d.C7326g;

public final class TopRightBannerWidget extends LiveRecyclableWidget implements OnMessageListener {

    /* renamed from: c */
    public static final C5545a f16522c = new C5545a(null);

    /* renamed from: a */
    public LinearLayout f16523a;

    /* renamed from: b */
    public ImageView f16524b;

    /* renamed from: d */
    private C3978e f16525d;

    /* renamed from: e */
    private WebView f16526e;

    /* renamed from: f */
    private IMessageManager f16527f;

    /* renamed from: g */
    private Room f16528g;

    /* renamed from: h */
    private boolean f16529h;

    /* renamed from: i */
    private AnimatorSet f16530i;

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.TopRightBannerWidget$a */
    static final class C5545a {
        private C5545a() {
        }

        public /* synthetic */ C5545a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.TopRightBannerWidget$b */
    static final class C5546b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C9357a f16531a;

        /* renamed from: b */
        final /* synthetic */ TopRightBannerWidget f16532b;

        C5546b(C9357a aVar, TopRightBannerWidget topRightBannerWidget) {
            this.f16531a = aVar;
            this.f16532b = topRightBannerWidget;
        }

        public final void onClick(View view) {
            C4299b.m14478a(this.f16532b.context, this.f16531a);
            this.f16532b.mo14024a(String.valueOf(this.f16531a.f25623a), "live_banner_click");
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.TopRightBannerWidget$c */
    static final class C5547c<T> implements C7326g<C3924b> {

        /* renamed from: a */
        final /* synthetic */ TopRightBannerWidget f16533a;

        C5547c(TopRightBannerWidget topRightBannerWidget) {
            this.f16533a = topRightBannerWidget;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(C3924b bVar) {
            this.f16533a.mo14023a(bVar.f11750b.f14010b);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.TopRightBannerWidget$d */
    public static final class C5548d implements C3405a {

        /* renamed from: a */
        final /* synthetic */ TopRightBannerWidget f16534a;

        /* renamed from: a */
        public final void mo10308a(ImageModel imageModel) {
            C7573i.m23587b(imageModel, "imageModel");
        }

        C5548d(TopRightBannerWidget topRightBannerWidget) {
            this.f16534a = topRightBannerWidget;
        }

        /* renamed from: a */
        public final void mo10310a(ImageModel imageModel, Exception exc) {
            C7573i.m23587b(imageModel, "imageModel");
            C7573i.m23587b(exc, "e");
            TopRightBannerWidget.m17904a(this.f16534a).setVisibility(0);
            TopRightBannerWidget.m17908b(this.f16534a).setVisibility(8);
        }

        /* renamed from: a */
        public final void mo10309a(ImageModel imageModel, int i, int i2, boolean z) {
            C7573i.m23587b(imageModel, "imageModel");
            this.f16534a.mo14022a();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.TopRightBannerWidget$e */
    public static final class C5549e implements AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ TopRightBannerWidget f16535a;

        public final void onAnimationCancel(Animator animator) {
            C7573i.m23587b(animator, "animation");
        }

        public final void onAnimationRepeat(Animator animator) {
            C7573i.m23587b(animator, "animation");
        }

        public final void onAnimationStart(Animator animator) {
            C7573i.m23587b(animator, "animation");
        }

        C5549e(TopRightBannerWidget topRightBannerWidget) {
            this.f16535a = topRightBannerWidget;
        }

        public final void onAnimationEnd(Animator animator) {
            C7573i.m23587b(animator, "animation");
            TopRightBannerWidget.m17908b(this.f16535a).setVisibility(8);
            TopRightBannerWidget.m17904a(this.f16535a).setVisibility(0);
        }
    }

    public final int getLayoutId() {
        return R.layout.b0b;
    }

    public final void onUnload() {
        IMessageManager iMessageManager = this.f16527f;
        if (iMessageManager == null) {
            C7573i.m23583a("messageManager");
        }
        iMessageManager.removeMessageListener(this);
        LinearLayout linearLayout = this.f16523a;
        if (linearLayout == null) {
            C7573i.m23583a("staticContainer");
        }
        linearLayout.removeView(this.f16526e);
        C9178j.m27302j().mo22374c().mo11539a(this.f16525d);
        m17905a((Animator) this.f16530i);
    }

    /* renamed from: a */
    public final void mo14022a() {
        ImageView imageView = this.f16524b;
        if (imageView == null) {
            C7573i.m23583a("mAnimateView");
        }
        ViewParent parent = imageView.getParent();
        if (parent != null) {
            int width = ((View) parent).getWidth();
            ImageView imageView2 = this.f16524b;
            if (imageView2 == null) {
                C7573i.m23583a("mAnimateView");
            }
            float width2 = (((float) (width - imageView2.getWidth())) * 0.5f) + ((float) C3358ac.m12510a(10.0f));
            ImageView imageView3 = this.f16524b;
            if (imageView3 == null) {
                C7573i.m23583a("mAnimateView");
            }
            float height = (((float) imageView3.getHeight()) * 0.8f) + ((float) C3358ac.m12510a(10.0f));
            ImageView imageView4 = this.f16524b;
            if (imageView4 == null) {
                C7573i.m23583a("mAnimateView");
            }
            ViewParent parent2 = imageView4.getParent();
            if (parent2 != null) {
                float height2 = height - ((float) ((View) parent2).getHeight());
                m17905a((Animator) this.f16530i);
                ImageView imageView5 = this.f16524b;
                if (imageView5 == null) {
                    C7573i.m23583a("mAnimateView");
                }
                this.f16530i = C9072j.m27079a(imageView5, width2, height2, new C5549e(this));
                AnimatorSet animatorSet = this.f16530i;
                if (animatorSet != null) {
                    animatorSet.start();
                    return;
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.View");
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.View");
    }

    /* renamed from: a */
    public static final /* synthetic */ LinearLayout m17904a(TopRightBannerWidget topRightBannerWidget) {
        LinearLayout linearLayout = topRightBannerWidget.f16523a;
        if (linearLayout == null) {
            C7573i.m23583a("staticContainer");
        }
        return linearLayout;
    }

    /* renamed from: b */
    public static final /* synthetic */ ImageView m17908b(TopRightBannerWidget topRightBannerWidget) {
        ImageView imageView = topRightBannerWidget.f16524b;
        if (imageView == null) {
            C7573i.m23583a("mAnimateView");
        }
        return imageView;
    }

    /* renamed from: a */
    private static void m17905a(Animator animator) {
        if (animator != null) {
            animator.removeAllListeners();
            animator.end();
        }
    }

    /* renamed from: b */
    private final void m17909b(C4900a aVar) {
        boolean z;
        if (aVar != null) {
            CharSequence charSequence = aVar.f14013a;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                m17907a(aVar.f14014b);
                return;
            }
            String str = aVar.f14013a;
            C7573i.m23582a((Object) str, "bannerInfo.url");
            m17906a(str);
        }
    }

    public final void onInit(Object[] objArr) {
        View findViewById = this.contentView.findViewById(R.id.dae);
        C7573i.m23582a((Object) findViewById, "contentView.findViewById(R.id.static_container)");
        this.f16523a = (LinearLayout) findViewById;
        View findViewById2 = this.contentView.findViewById(R.id.b5z);
        C7573i.m23582a((Object) findViewById2, "contentView.findViewById(R.id.iv_animation)");
        this.f16524b = (ImageView) findViewById2;
    }

    /* renamed from: a */
    private final void m17907a(List<C9357a> list) {
        if (list != null) {
            LinearLayout linearLayout = this.f16523a;
            if (linearLayout == null) {
                C7573i.m23583a("staticContainer");
            }
            linearLayout.removeAllViews();
            for (C9357a aVar : list) {
                LayoutInflater from = LayoutInflater.from(this.context);
                LinearLayout linearLayout2 = this.f16523a;
                if (linearLayout2 == null) {
                    C7573i.m23583a("staticContainer");
                }
                View inflate = from.inflate(R.layout.atf, linearLayout2, false);
                C5343e.m17030a((ImageView) inflate.findViewById(R.id.ax9), aVar.f25625c);
                LinearLayout linearLayout3 = this.f16523a;
                if (linearLayout3 == null) {
                    C7573i.m23583a("staticContainer");
                }
                linearLayout3.setVisibility(0);
                LinearLayout linearLayout4 = this.f16523a;
                if (linearLayout4 == null) {
                    C7573i.m23583a("staticContainer");
                }
                linearLayout4.addView(inflate);
                inflate.setOnClickListener(new C5546b(aVar, this));
                mo14024a(String.valueOf(aVar.f25623a), "live_banner_show");
            }
        }
    }

    /* renamed from: a */
    private final void m17906a(String str) {
        C3972b c = C9178j.m27302j().mo22374c();
        Context context = this.context;
        if (context != null) {
            C3978e a = c.mo11534a((Activity) context, (C3977d) null);
            this.f16526e = a.f11853a;
            this.f16525d = a;
            if (VERSION.SDK_INT <= 19) {
                WebView webView = this.f16526e;
                if (webView != null) {
                    webView.setLayerType(1, null);
                }
            }
            WebView webView2 = this.f16526e;
            if (webView2 != null) {
                webView2.setBackgroundColor(0);
            }
            WebView webView3 = this.f16526e;
            if (webView3 != null) {
                webView3.setLayoutParams(new LayoutParams(C3358ac.m12510a(64.0f), C3358ac.m12510a(64.0f)));
            }
            LinearLayout linearLayout = this.f16523a;
            if (linearLayout == null) {
                C7573i.m23583a("staticContainer");
            }
            linearLayout.removeAllViews();
            LinearLayout linearLayout2 = this.f16523a;
            if (linearLayout2 == null) {
                C7573i.m23583a("staticContainer");
            }
            linearLayout2.addView(this.f16526e);
            LinearLayout linearLayout3 = this.f16523a;
            if (linearLayout3 == null) {
                C7573i.m23583a("staticContainer");
            }
            linearLayout3.setVisibility(0);
            C9178j.m27302j().mo22374c().mo11540a(this.f16525d, str);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
    }

    public final void onLoad(Object[] objArr) {
        Object obj = this.dataCenter.get("data_room", new Room());
        C7573i.m23582a(obj, "dataCenter.get(WidgetConstant.DATA_ROOM, Room())");
        this.f16528g = (Room) obj;
        Object obj2 = this.dataCenter.get("data_is_anchor", Boolean.valueOf(false));
        C7573i.m23582a(obj2, "dataCenter.get(WidgetCon…nt.DATA_IS_ANCHOR, false)");
        this.f16529h = ((Boolean) obj2).booleanValue();
        Object obj3 = this.dataCenter.get("data_message_manager");
        C7573i.m23582a(obj3, "dataCenter.get(WidgetCon…ant.DATA_MESSAGE_MANAGER)");
        this.f16527f = (IMessageManager) obj3;
        IMessageManager iMessageManager = this.f16527f;
        if (iMessageManager == null) {
            C7573i.m23583a("messageManager");
        }
        iMessageManager.addMessageListener(MessageType.IN_ROOM_BANNER_MESSAGE.getIntType(), this);
        Long l = null;
        InRoomBannerManager inRoomBannerManager = (InRoomBannerManager) this.dataCenter.get("data_in_room_banner_manager", null);
        if (inRoomBannerManager != null) {
            Room room = (Room) this.dataCenter.get("data_room", null);
            if (room != null) {
                l = Long.valueOf(room.getId());
            }
            C7492s a = inRoomBannerManager.mo11475a(l);
            if (a != null) {
                C3245ad adVar = (C3245ad) a.mo19297a((C7494t<T, ? extends R>) autoDispose());
                if (adVar != null) {
                    adVar.mo10182a((C7326g<? super T>) new C5547c<Object>(this));
                }
            }
        }
    }

    public final void onMessage(IMessage iMessage) {
        String str;
        if (iMessage instanceof C8495au) {
            C8495au auVar = (C8495au) iMessage;
            if (auVar.f23282b == 2) {
                String a = C9178j.m27302j().mo22372a().mo15976a((C6709k) auVar.f23281a);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("type", "refresh");
                jSONObject.put("data", a);
                JSONObject jSONObject2 = new JSONObject();
                C8416g a2 = C8443c.m25663a().mo21605a(C8438j.class);
                String str2 = "";
                String str3 = "";
                if (a2 instanceof C8420k) {
                    C8420k kVar = (C8420k) a2;
                    if (kVar.mo21568a().containsKey("enter_from")) {
                        kVar.mo21568a().get("enter_from");
                    }
                    if (kVar.mo21568a().containsKey("source")) {
                        kVar.mo21568a().get("source");
                    }
                    HashMap hashMap = new HashMap();
                    str2 = (String) hashMap.get("enter_from_merge");
                    str3 = (String) hashMap.get("enter_method");
                }
                JSONObject put = jSONObject2.put("enter_from_merge", str2).put("enter_method", str3);
                String str4 = "event_page";
                if (this.f16529h) {
                    str = "live_take_detail";
                } else {
                    str = "live_detail";
                }
                JSONObject put2 = put.put(str4, str);
                String str5 = "room_id";
                Room room = this.f16528g;
                if (room == null) {
                    C7573i.m23583a("room");
                }
                JSONObject put3 = put2.put(str5, String.valueOf(room.getId()));
                String str6 = "anchor_id";
                Room room2 = this.f16528g;
                if (room2 == null) {
                    C7573i.m23583a("room");
                }
                JSONObject put4 = put3.put(str6, String.valueOf(room2.getOwnerUserId()));
                String str7 = "request_id";
                Room room3 = this.f16528g;
                if (room3 == null) {
                    C7573i.m23583a("room");
                }
                JSONObject put5 = put4.put(str7, room3.getRequestId());
                String str8 = "log_pb";
                Room room4 = this.f16528g;
                if (room4 == null) {
                    C7573i.m23583a("room");
                }
                put5.put(str8, room4.getLog_pb());
                jSONObject.put("log", jSONObject2);
                C3978e eVar = this.f16525d;
                if (eVar != null) {
                    eVar.mo11573a("H5_roomStatusChange", jSONObject);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo14023a(C4900a aVar) {
        if (aVar == null) {
            ImageView imageView = this.f16524b;
            if (imageView == null) {
                C7573i.m23583a("mAnimateView");
            }
            imageView.setVisibility(8);
            LinearLayout linearLayout = this.f16523a;
            if (linearLayout == null) {
                C7573i.m23583a("staticContainer");
            }
            linearLayout.setVisibility(8);
            LinearLayout linearLayout2 = this.f16523a;
            if (linearLayout2 == null) {
                C7573i.m23583a("staticContainer");
            }
            linearLayout2.removeAllViews();
            return;
        }
        if (aVar.f14015c != null) {
            C3338l<Integer> lVar = LiveConfigSettingKeys.LIVE_USE_BANNER_ANIMATION;
            C7573i.m23582a((Object) lVar, "LiveConfigSettingKeys.LIVE_USE_BANNER_ANIMATION");
            Integer num = (Integer) lVar.mo10240a();
            if (num != null && num.intValue() == 1) {
                Room room = this.f16528g;
                if (room == null) {
                    C7573i.m23583a("room");
                }
                if (room.getStreamType() == LiveMode.VIDEO) {
                    ImageView imageView2 = this.f16524b;
                    if (imageView2 == null) {
                        C7573i.m23583a("mAnimateView");
                    }
                    imageView2.setVisibility(0);
                    LinearLayout linearLayout3 = this.f16523a;
                    if (linearLayout3 == null) {
                        C7573i.m23583a("staticContainer");
                    }
                    linearLayout3.setVisibility(8);
                    m17909b(aVar);
                    ImageView imageView3 = this.f16524b;
                    if (imageView3 == null) {
                        C7573i.m23583a("mAnimateView");
                    }
                    C5343e.m17035a(imageView3, aVar.f14015c, (C3405a) new C5548d(this));
                    return;
                }
            }
        }
        m17909b(aVar);
    }

    /* renamed from: a */
    public final void mo14024a(String str, String str2) {
        String str3;
        Map hashMap = new HashMap();
        hashMap.put("banner_id", str);
        hashMap.put("request_page", "topright");
        C8443c a = C8443c.m25663a();
        Object[] objArr = new Object[3];
        objArr[0] = Room.class;
        C8438j b = new C8438j().mo21599b("live_function");
        if (this.f16529h) {
            str3 = "live_take_detail";
        } else {
            str3 = "live_detail";
        }
        objArr[1] = b.mo21598a(str3);
        objArr[2] = new C8439k();
        a.mo21606a(str2, hashMap, objArr);
    }
}
