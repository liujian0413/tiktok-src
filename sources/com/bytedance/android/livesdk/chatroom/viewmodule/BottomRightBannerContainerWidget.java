package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.arch.lifecycle.C0053p;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.RelativeLayout;
import com.bytedance.android.live.core.rxutils.autodispose.C3245ad;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.livesdk.banner.InRoomBannerManager;
import com.bytedance.android.livesdk.banner.InRoomBannerManager.C3924b;
import com.bytedance.android.livesdk.chatroom.event.C4441k;
import com.bytedance.android.livesdk.chatroom.model.C4899c;
import com.bytedance.android.livesdk.chatroom.model.C4899c.C4900a;
import com.bytedance.android.livesdk.chatroom.viewmodule.C5559a.C5565f;
import com.bytedance.android.livesdk.message.model.C8503b;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.Widget;
import com.bytedance.ies.sdk.widgets.WidgetManager;
import com.p280ss.ugc.live.sdk.message.data.IMessage;
import com.p280ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.p280ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import p346io.reactivex.C7494t;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p348d.C7326g;

public final class BottomRightBannerContainerWidget extends LiveRecyclableWidget implements C0053p<KVData>, C5565f, OnMessageListener {

    /* renamed from: a */
    public C5713f f15704a;

    /* renamed from: b */
    public C5691eh f15705b;

    /* renamed from: c */
    private InRoomBannerManager f15706c;

    /* renamed from: d */
    private IMessageManager f15707d;

    /* renamed from: e */
    private boolean f15708e;

    /* renamed from: f */
    private int f15709f;

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.BottomRightBannerContainerWidget$a */
    static final class C5381a<T> implements C7326g<C3924b> {

        /* renamed from: a */
        final /* synthetic */ InRoomBannerManager f15710a;

        /* renamed from: b */
        final /* synthetic */ BottomRightBannerContainerWidget f15711b;

        C5381a(InRoomBannerManager inRoomBannerManager, BottomRightBannerContainerWidget bottomRightBannerContainerWidget) {
            this.f15710a = inRoomBannerManager;
            this.f15711b = bottomRightBannerContainerWidget;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(C3924b bVar) {
            C4900a aVar = bVar.f11750b.f14009a;
            if (aVar != null) {
                BottomRightBannerContainerWidget.m17127a(this.f15711b).mo14059a(aVar);
            } else {
                BottomRightBannerContainerWidget.m17127a(this.f15711b).mo14067h();
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.BottomRightBannerContainerWidget$b */
    static final class C5382b<T> implements C7326g<C5679dw> {

        /* renamed from: a */
        final /* synthetic */ BottomRightBannerContainerWidget f15712a;

        C5382b(BottomRightBannerContainerWidget bottomRightBannerContainerWidget) {
            this.f15712a = bottomRightBannerContainerWidget;
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0020, code lost:
            if (r5 == null) goto L_0x0022;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void accept(com.bytedance.android.livesdk.chatroom.viewmodule.C5679dw r5) {
            /*
                r4 = this;
                com.bytedance.android.livesdk.chatroom.viewmodule.BottomRightBannerContainerWidget r0 = r4.f15712a
                com.bytedance.ies.sdk.widgets.WidgetManager r0 = r0.subWidgetManager
                if (r0 != 0) goto L_0x0007
                return
            L_0x0007:
                com.bytedance.android.livesdk.chatroom.viewmodule.LinkPkTaskWidget r5 = r5.f16768a
                if (r5 == 0) goto L_0x0022
                com.bytedance.android.livesdk.chatroom.viewmodule.BottomRightBannerContainerWidget r0 = r4.f15712a
                com.bytedance.android.livesdk.chatroom.viewmodule.eh r0 = com.bytedance.android.livesdk.chatroom.viewmodule.BottomRightBannerContainerWidget.m17129b(r0)
                r1 = r5
                com.bytedance.ies.sdk.widgets.Widget r1 = (com.bytedance.ies.sdk.widgets.Widget) r1
                com.bytedance.android.livesdk.chatroom.viewmodule.BottomRightBannerContainerWidget r2 = r4.f15712a
                com.bytedance.ies.sdk.widgets.WidgetManager r2 = r2.subWidgetManager
                java.lang.String r3 = "this@BottomRightBannerCo…erWidget.subWidgetManager"
                kotlin.jvm.internal.C7573i.m23582a(r2, r3)
                r0.mo14060a(r1, r2)
                if (r5 != 0) goto L_0x002b
            L_0x0022:
                com.bytedance.android.livesdk.chatroom.viewmodule.BottomRightBannerContainerWidget r5 = r4.f15712a
                com.bytedance.android.livesdk.chatroom.viewmodule.eh r5 = com.bytedance.android.livesdk.chatroom.viewmodule.BottomRightBannerContainerWidget.m17129b(r5)
                r5.mo14065f()
            L_0x002b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.viewmodule.BottomRightBannerContainerWidget.C5382b.accept(com.bytedance.android.livesdk.chatroom.viewmodule.dw):void");
        }
    }

    public final int getLayoutId() {
        return R.layout.azz;
    }

    /* renamed from: a */
    public final boolean mo13680a() {
        boolean z;
        boolean z2;
        C5713f fVar = this.f15704a;
        if (fVar == null) {
            C7573i.m23583a("bottomRightBannerHolder");
        }
        BottomRightBannerWidget bottomRightBannerWidget = (BottomRightBannerWidget) fVar.f16604b;
        if (bottomRightBannerWidget != null) {
            z = bottomRightBannerWidget.f15713a;
        } else {
            z = false;
        }
        if (!z) {
            C5691eh ehVar = this.f15705b;
            if (ehVar == null) {
                C7573i.m23583a("pkTaskBannerHolder");
            }
            LinkPkTaskWidget linkPkTaskWidget = (LinkPkTaskWidget) ehVar.f16604b;
            if (linkPkTaskWidget != null) {
                z2 = linkPkTaskWidget.f16148d;
            } else {
                z2 = false;
            }
            if (!z2) {
                return false;
            }
        }
        return true;
    }

    public final void onUnload() {
        C5713f fVar = this.f15704a;
        if (fVar == null) {
            C7573i.m23583a("bottomRightBannerHolder");
        }
        fVar.mo14065f();
        C5691eh ehVar = this.f15705b;
        if (ehVar == null) {
            C7573i.m23583a("pkTaskBannerHolder");
        }
        ehVar.mo14065f();
        IMessageManager iMessageManager = this.f15707d;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(this);
        }
        this.dataCenter.removeObserver(this);
        this.f15706c = null;
    }

    /* renamed from: a */
    public static final /* synthetic */ C5713f m17127a(BottomRightBannerContainerWidget bottomRightBannerContainerWidget) {
        C5713f fVar = bottomRightBannerContainerWidget.f15704a;
        if (fVar == null) {
            C7573i.m23583a("bottomRightBannerHolder");
        }
        return fVar;
    }

    /* renamed from: b */
    public static final /* synthetic */ C5691eh m17129b(BottomRightBannerContainerWidget bottomRightBannerContainerWidget) {
        C5691eh ehVar = bottomRightBannerContainerWidget.f15705b;
        if (ehVar == null) {
            C7573i.m23583a("pkTaskBannerHolder");
        }
        return ehVar;
    }

    public final void onMessage(IMessage iMessage) {
        if (iMessage instanceof C8503b) {
            C4899c cVar = ((C8503b) iMessage).f23298a;
            if (cVar != null) {
                C4900a aVar = cVar.f14009a;
                if (aVar != null) {
                    C5713f fVar = this.f15704a;
                    if (fVar == null) {
                        C7573i.m23583a("bottomRightBannerHolder");
                    }
                    fVar.mo14059a(aVar);
                }
            }
        }
    }

    public final void onInit(Object[] objArr) {
        View findViewById = this.contentView.findViewById(R.id.cra);
        C7573i.m23582a((Object) findViewById, "contentView.findViewById…regular_banner_container)");
        C5565f fVar = this;
        this.f15704a = new C5713f((ViewGroup) findViewById, fVar);
        View findViewById2 = this.contentView.findViewById(R.id.cbv);
        C7573i.m23582a((Object) findViewById2, "contentView.findViewById(R.id.pk_banner_container)");
        this.f15705b = new C5691eh((ViewGroup) findViewById2, fVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onChanged(KVData kVData) {
        if (kVData != null && kVData.getData() != null) {
            String key = kVData.getKey();
            if (key.hashCode() == 333436001 && key.equals("cmd_gift_dialog_switch")) {
                C4441k kVar = (C4441k) kVData.getData();
                if (kVar != null) {
                    if (kVar.f12892a) {
                        ViewGroup viewGroup = this.containerView;
                        C7573i.m23582a((Object) viewGroup, "containerView");
                        LayoutParams layoutParams = viewGroup.getLayoutParams();
                        if (layoutParams != null) {
                            ((RelativeLayout.LayoutParams) layoutParams).bottomMargin = (this.f15709f + kVar.f12893b) - C3358ac.m12510a(42.0f);
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                        }
                    } else {
                        ViewGroup viewGroup2 = this.containerView;
                        C7573i.m23582a((Object) viewGroup2, "containerView");
                        LayoutParams layoutParams2 = viewGroup2.getLayoutParams();
                        if (layoutParams2 != null) {
                            ((RelativeLayout.LayoutParams) layoutParams2).bottomMargin = this.f15709f;
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                        }
                    }
                    this.containerView.requestLayout();
                }
            }
        }
    }

    public final void onLoad(Object[] objArr) {
        long j;
        InRoomBannerManager inRoomBannerManager = (InRoomBannerManager) this.dataCenter.get("data_in_room_banner_manager", null);
        if (inRoomBannerManager != null) {
            Room room = (Room) this.dataCenter.get("data_room", null);
            if (room != null) {
                j = room.getId();
            } else {
                j = 0;
            }
            ((C3245ad) inRoomBannerManager.mo11475a(Long.valueOf(j)).mo19294a(C47549a.m148327a()).mo19297a((C7494t<T, ? extends R>) autoDispose())).mo10182a((C7326g<? super T>) new C5381a<Object>(inRoomBannerManager, this));
        } else {
            inRoomBannerManager = null;
        }
        if (inRoomBannerManager != null) {
            this.f15706c = inRoomBannerManager;
            Object obj = this.dataCenter.get("data_is_portrait", Boolean.valueOf(true));
            C7573i.m23582a(obj, "dataCenter.get(WidgetCon…t.DATA_IS_PORTRAIT, true)");
            this.f15708e = ((Boolean) obj).booleanValue();
            ViewGroup viewGroup = this.containerView;
            C7573i.m23582a((Object) viewGroup, "containerView");
            LayoutParams layoutParams = viewGroup.getLayoutParams();
            if (layoutParams != null) {
                this.f15709f = ((RelativeLayout.LayoutParams) layoutParams).bottomMargin;
                if (this.f15708e) {
                    C0053p pVar = this;
                    this.dataCenter.observeForever("cmd_gift_dialog_switch", pVar).observe("data_pre_show_keyboard", pVar).observe("data_keyboard_status", pVar);
                }
                enableSubWidgetManager();
                C5713f fVar = this.f15704a;
                if (fVar == null) {
                    C7573i.m23583a("bottomRightBannerHolder");
                }
                BottomRightBannerWidget bottomRightBannerWidget = new BottomRightBannerWidget();
                bottomRightBannerWidget.f15715c = true;
                Widget widget = bottomRightBannerWidget;
                WidgetManager widgetManager = this.subWidgetManager;
                C7573i.m23582a((Object) widgetManager, "subWidgetManager");
                fVar.mo14060a(widget, widgetManager);
                ((C3245ad) C9097a.m27146a().mo22266a(C5679dw.class).mo19294a(C47549a.m148327a()).mo19297a((C7494t<T, ? extends R>) autoDispose())).mo10182a((C7326g<? super T>) new C5382b<Object>(this));
                IMessageManager iMessageManager = (IMessageManager) this.dataCenter.get("data_message_manager", null);
                if (iMessageManager != null) {
                    iMessageManager.addMessageListener(MessageType.BANNER_UPDATE.getIntType(), this);
                } else {
                    iMessageManager = null;
                }
                this.f15707d = iMessageManager;
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    /* renamed from: a */
    public final void mo13679a(C5559a<? extends Widget> aVar, boolean z) {
        C7573i.m23587b(aVar, "holder");
        if (!(aVar instanceof C5713f) && (aVar instanceof C5691eh) && !z) {
            C5713f fVar = this.f15704a;
            if (fVar == null) {
                C7573i.m23583a("bottomRightBannerHolder");
            }
            fVar.mo14070k();
        }
    }
}
