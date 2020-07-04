package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.bytedance.android.live.base.C2324b;
import com.bytedance.android.live.core.rxutils.autodispose.C3245ad;
import com.bytedance.android.live.livepullstream.api.C3450b;
import com.bytedance.android.live.room.C3491h;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.utils.p426b.C9057b;
import com.bytedance.android.livesdk.widget.C9245h.C9249a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.p480a.C9700a;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;
import p346io.reactivex.C7494t;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p348d.C7327h;
import p346io.reactivex.p351i.C7333a;

public final class PrivateDebugInfoWidget extends LiveRecyclableWidget {

    /* renamed from: a */
    public TextView f16410a;

    /* renamed from: b */
    public TextView f16411b;

    /* renamed from: c */
    public TextView f16412c;

    /* renamed from: d */
    public Room f16413d;

    /* renamed from: e */
    public String f16414e;

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.PrivateDebugInfoWidget$a */
    static final class C5527a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PrivateDebugInfoWidget f16415a;

        C5527a(PrivateDebugInfoWidget privateDebugInfoWidget) {
            this.f16415a = privateDebugInfoWidget;
        }

        public final void onClick(View view) {
            final String privateInfo = PrivateDebugInfoWidget.m17810a(this.f16415a).getPrivateInfo();
            new C9249a(this.f16415a.context, 1).mo22727c((CharSequence) privateInfo).mo22723b(2, (CharSequence) "Copy", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener(this) {

                /* renamed from: a */
                final /* synthetic */ C5527a f16416a;

                {
                    this.f16416a = r1;
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                    C9700a.m28636a(this.f16416a.f16415a.context, "", privateInfo);
                }
            }).mo22723b(3, (CharSequence) "Send", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener(this) {

                /* renamed from: a */
                final /* synthetic */ C5527a f16418a;

                {
                    this.f16418a = r1;
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                    try {
                        Intent intent = new Intent("android.intent.action.SEND");
                        StringBuilder sb = new StringBuilder();
                        sb.append(privateInfo);
                        sb.append(10);
                        sb.append(PrivateDebugInfoWidget.m17811b(this.f16418a.f16415a));
                        intent.putExtra("android.intent.extra.TEXT", sb.toString());
                        intent.setType("text/plain");
                        this.f16418a.f16415a.context.startActivity(intent);
                    } catch (ActivityNotFoundException unused) {
                    }
                }
            }).mo22720b().show();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.PrivateDebugInfoWidget$b */
    static final class C5530b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PrivateDebugInfoWidget f16420a;

        C5530b(PrivateDebugInfoWidget privateDebugInfoWidget) {
            this.f16420a = privateDebugInfoWidget;
        }

        public final void onClick(View view) {
            if (PrivateDebugInfoWidget.m17812c(this.f16420a).getVisibility() == 0) {
                PrivateDebugInfoWidget.m17812c(this.f16420a).setVisibility(8);
                PrivateDebugInfoWidget.m17813d(this.f16420a).setVisibility(8);
                PrivateDebugInfoWidget.m17814e(this.f16420a).setText(R.string.fa5);
                return;
            }
            PrivateDebugInfoWidget.m17812c(this.f16420a).setVisibility(0);
            PrivateDebugInfoWidget.m17813d(this.f16420a).setVisibility(0);
            PrivateDebugInfoWidget.m17814e(this.f16420a).setText(R.string.fa4);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.PrivateDebugInfoWidget$c */
    static final class C5531c<T, R> implements C7327h<T, R> {

        /* renamed from: a */
        public static final C5531c f16421a = new C5531c();

        C5531c() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            return m17815a((Long) obj);
        }

        /* renamed from: a */
        private static String m17815a(Long l) {
            C7573i.m23587b(l, "it");
            C2324b a = C3596c.m13172a(C3450b.class);
            C7573i.m23582a((Object) a, "ServiceManager.getServic…treamService::class.java)");
            C3491h livePlayController = ((C3450b) a).getLivePlayController();
            C7573i.m23582a((Object) livePlayController, "ServiceManager.getServic….java).livePlayController");
            JSONObject d = livePlayController.mo10511d();
            StringBuilder sb = new StringBuilder("推流SDK版本:");
            sb.append(d.optString("推流SDK版本:"));
            sb.append("\n推流设备机型:");
            sb.append(d.optString("推流设备机型:"));
            sb.append("\n推流系统版本号:");
            sb.append(d.optString("推流系统版本号:"));
            sb.append("\n宽:");
            sb.append(d.optString("width:"));
            sb.append(" 高:");
            sb.append(d.optString("height:"));
            sb.append("\n推流码率:");
            sb.append(d.optString("推流码率:"));
            sb.append("\n推流帧频:");
            sb.append(d.optString("推流帧频:"));
            sb.append("\n渲染帧频:");
            sb.append(d.optString("渲染帧频:"));
            sb.append("\n下载码率:");
            sb.append(d.optString("下载码率:"));
            sb.append("\n卡顿次数:");
            sb.append(d.optString("卡顿次数:"));
            sb.append("\n卡顿时长:");
            sb.append(d.optString("卡顿时长:"));
            sb.append("\n卡顿原因:");
            sb.append(d.optString("卡顿原因:"));
            return sb.toString();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.PrivateDebugInfoWidget$d */
    static final class C5532d<T> implements C7326g<String> {

        /* renamed from: a */
        final /* synthetic */ PrivateDebugInfoWidget f16422a;

        C5532d(PrivateDebugInfoWidget privateDebugInfoWidget) {
            this.f16422a = privateDebugInfoWidget;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(String str) {
            PrivateDebugInfoWidget.m17813d(this.f16422a).setText(str);
        }
    }

    public final int getLayoutId() {
        return R.layout.b08;
    }

    public final void onUnload() {
    }

    /* renamed from: a */
    public static final /* synthetic */ Room m17810a(PrivateDebugInfoWidget privateDebugInfoWidget) {
        Room room = privateDebugInfoWidget.f16413d;
        if (room == null) {
            C7573i.m23583a("room");
        }
        return room;
    }

    /* renamed from: b */
    public static final /* synthetic */ String m17811b(PrivateDebugInfoWidget privateDebugInfoWidget) {
        String str = privateDebugInfoWidget.f16414e;
        if (str == null) {
            C7573i.m23583a("streamInfoText");
        }
        return str;
    }

    /* renamed from: c */
    public static final /* synthetic */ TextView m17812c(PrivateDebugInfoWidget privateDebugInfoWidget) {
        TextView textView = privateDebugInfoWidget.f16411b;
        if (textView == null) {
            C7573i.m23583a("remoteInfoView");
        }
        return textView;
    }

    /* renamed from: d */
    public static final /* synthetic */ TextView m17813d(PrivateDebugInfoWidget privateDebugInfoWidget) {
        TextView textView = privateDebugInfoWidget.f16412c;
        if (textView == null) {
            C7573i.m23583a("streamInfoView");
        }
        return textView;
    }

    /* renamed from: e */
    public static final /* synthetic */ TextView m17814e(PrivateDebugInfoWidget privateDebugInfoWidget) {
        TextView textView = privateDebugInfoWidget.f16410a;
        if (textView == null) {
            C7573i.m23583a("buttonView");
        }
        return textView;
    }

    public final void onInit(Object[] objArr) {
        this.f16414e = "";
        View findViewById = this.contentView.findViewById(R.id.crm);
        C7573i.m23582a((Object) findViewById, "contentView.findViewById(R.id.remote_info)");
        this.f16411b = (TextView) findViewById;
        View findViewById2 = this.contentView.findViewById(R.id.dbp);
        C7573i.m23582a((Object) findViewById2, "contentView.findViewById(R.id.stream_info)");
        this.f16412c = (TextView) findViewById2;
        View findViewById3 = this.contentView.findViewById(R.id.s7);
        C7573i.m23582a((Object) findViewById3, "contentView.findViewById(R.id.button)");
        this.f16410a = (TextView) findViewById3;
        TextView textView = this.f16411b;
        if (textView == null) {
            C7573i.m23583a("remoteInfoView");
        }
        textView.setOnClickListener(new C5527a(this));
        this.contentView.findViewById(R.id.s7).setOnClickListener(new C5530b(this));
    }

    public final void onLoad(Object[] objArr) {
        Object obj = this.dataCenter.get("data_room", new Room());
        C7573i.m23582a(obj, "dataCenter.get(WidgetConstant.DATA_ROOM, Room())");
        this.f16413d = (Room) obj;
        TextView textView = this.f16411b;
        if (textView == null) {
            C7573i.m23583a("remoteInfoView");
        }
        Room room = this.f16413d;
        if (room == null) {
            C7573i.m23583a("room");
        }
        textView.setText(room.getPrivateInfo());
        ((C3245ad) C9057b.m27050a(0, 3, TimeUnit.SECONDS).mo19305c(Long.MAX_VALUE).mo19294a(C7333a.m23044b()).mo19317d((C7327h<? super T, ? extends R>) C5531c.f16421a).mo19294a(C47549a.m148327a()).mo19297a((C7494t<T, ? extends R>) autoDispose())).mo10182a((C7326g<? super T>) new C5532d<Object>(this));
    }
}
