package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.C3916b;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.p209bl.PlatformMessageHelper;
import com.bytedance.android.livesdk.chatroom.utils.C5343e;
import com.bytedance.android.livesdk.common.C5857c;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.C8445e.C8446a;
import com.bytedance.android.livesdk.log.p404a.C8420k;
import com.bytedance.android.livesdk.log.p405b.C8438j;
import com.bytedance.android.livesdk.message.model.C8481ah;
import com.bytedance.android.livesdk.user.C8976b.C8977a;
import com.bytedance.android.livesdk.user.C8976b.C8978b;
import com.bytedance.android.livesdk.user.C8985f;
import com.bytedance.android.livesdk.utils.C9051ar;
import com.bytedance.android.livesdk.utils.C9074l;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.p437d.C9295a;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class FollowGuideWidget extends LiveWidget implements OnClickListener {

    /* renamed from: a */
    private boolean f15879a = true;

    /* renamed from: b */
    private Room f15880b;

    /* renamed from: c */
    private C5418a f15881c;

    /* renamed from: d */
    private View f15882d;

    /* renamed from: e */
    private TextView f15883e;

    /* renamed from: f */
    private TextView f15884f;

    /* renamed from: g */
    private TextView f15885g;

    /* renamed from: h */
    private TextView f15886h;

    /* renamed from: i */
    private HSImageView f15887i;

    /* renamed from: j */
    private OnAttachStateChangeListener f15888j = new OnAttachStateChangeListener() {
        public final void onViewAttachedToWindow(View view) {
        }

        public final void onViewDetachedFromWindow(View view) {
            PlatformMessageHelper.INSTANCE.onMessageFinish();
        }
    };

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.FollowGuideWidget$a */
    static final class C5418a extends C5857c {

        /* renamed from: a */
        private View f15891a;

        /* renamed from: b */
        private boolean f15892b;

        public final void onAttachedToWindow() {
            super.onAttachedToWindow();
            this.f15892b = true;
        }

        public final void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            this.f15892b = false;
        }

        public final void dismiss() {
            if (this.f15892b) {
                super.dismiss();
            }
        }

        public final void onStart() {
            super.onStart();
            if (getWindow() != null) {
                getWindow().setLayout(-1, -1);
            }
        }

        public final void show() {
            if ((!(getContext() instanceof Activity) || !((Activity) getContext()).isFinishing()) && !isShowing()) {
                super.show();
            }
        }

        /* access modifiers changed from: protected */
        public final void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            setContentView(this.f15891a);
            setCanceledOnTouchOutside(true);
        }

        public C5418a(Context context, boolean z, View view) {
            super(context, z);
            this.f15891a = view;
        }
    }

    public void onDestroy() {
        super.onDestroy();
    }

    /* renamed from: c */
    private void m17287c() {
        this.f15885g.setOnClickListener(this);
    }

    public void onCreate() {
        super.onCreate();
        m17285b();
        m17287c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo13753a() {
        if (this.f15881c == null || !isViewValid()) {
            PlatformMessageHelper.INSTANCE.onMessageFinish();
        } else {
            this.f15881c.dismiss();
        }
    }

    /* renamed from: b */
    private void m17285b() {
        if (this.f15882d == null) {
            FrameLayout frameLayout = new FrameLayout(this.context);
            frameLayout.setOnClickListener(new C5584ai(this));
            this.f15882d = View.inflate(this.context, R.layout.and, frameLayout);
            this.f15882d.removeOnAttachStateChangeListener(this.f15888j);
            this.f15882d.addOnAttachStateChangeListener(this.f15888j);
            this.f15887i = (HSImageView) this.f15882d.findViewById(R.id.b64);
            this.f15883e = (TextView) this.f15882d.findViewById(R.id.dyh);
            this.f15886h = (TextView) this.f15882d.findViewById(R.id.dup);
            this.f15884f = (TextView) this.f15882d.findViewById(R.id.dvz);
            this.f15885g = (TextView) this.f15882d.findViewById(R.id.q5);
            this.f15881c = new C5418a(this.context, this.f15879a, frameLayout);
        }
    }

    /* renamed from: d */
    private void m17288d() {
        HashMap hashMap = new HashMap();
        hashMap.put("room_id", String.valueOf(this.f15880b.getId()));
        hashMap.put("anchor_id", String.valueOf(this.f15880b.author().getId()));
        hashMap.put("request_id", this.f15880b.getRequestId());
        m17284a((Map<String, String>) hashMap, "enter_from_merge", "enter_method");
        C8443c.m25663a().mo21606a("livesdk_follow_card_show", hashMap, new Object[0]);
    }

    /* renamed from: e */
    private void m17289e() {
        HashMap hashMap = new HashMap();
        hashMap.put("scene_id", "1003");
        hashMap.put("request_page", "follow_card");
        hashMap.put("request_id", this.f15880b.getRequestId());
        hashMap.put("to_user_id", String.valueOf(this.f15880b.author().getId()));
        hashMap.put("anchor_id", String.valueOf(this.f15880b.author().getId()));
        hashMap.put("room_id", String.valueOf(this.f15880b.getId()));
        m17284a((Map<String, String>) hashMap, "enter_from_merge", "enter_method", "action_type");
        C8443c.m25663a().mo21606a("livesdk_follow", hashMap, new Object[0]);
        if (C9074l.m27086b(this.dataCenter)) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("anchor_id", String.valueOf(this.f15880b.author().getId()));
                jSONObject.put("room_id", String.valueOf(this.f15880b.getId()));
            } catch (JSONException unused) {
            }
            C3596c.m13172a(C9295a.class);
            C8446a.m25675a().mo21611a(jSONObject).mo21610a(C9074l.m27087c(this.dataCenter));
        }
        if (C9074l.m27089d(this.dataCenter)) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("anchor_id", String.valueOf(this.f15880b.author().getId()));
                jSONObject2.put("room_id", String.valueOf(this.f15880b.getId()));
            } catch (JSONException unused2) {
            }
            C3596c.m13172a(C9295a.class);
            C8446a.m25675a().mo21611a(jSONObject2).mo21610a(C9074l.m27090e(this.dataCenter));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo13754a(View view) {
        this.f15881c.dismiss();
    }

    public FollowGuideWidget(boolean z) {
        this.f15879a = z;
    }

    public void onClick(View view) {
        if (this.f15880b == null) {
            this.f15881c.dismiss();
            return;
        }
        if (view.equals(this.f15885g)) {
            TTLiveSDKContext.getHostService().mo22367h().mo22168a(((C8978b) ((C8978b) ((C8978b) ((C8978b) ((C8978b) ((C8977a) C8985f.m26861a().mo22153a(this.f15880b.author().getId())).mo22154a(this.f15880b.getRequestId())).mo22157b("live_detail")).mo22158c("live")).mo22156b(this.f15880b.getId())).mo22159d(this.f15880b.getLabels())).mo22160c()).mo19333l();
            m17289e();
            this.f15881c.dismiss();
        }
    }

    /* renamed from: a */
    private static void m17284a(Map<String, String> map, String... strArr) {
        C8420k kVar = (C8420k) C8443c.m25663a().mo21605a(C8438j.class);
        if (kVar != null && strArr.length > 0) {
            for (String str : strArr) {
                if (kVar.mo21568a().containsKey(str)) {
                    map.put(str, kVar.mo21568a().get(str));
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo13755a(Room room, C8481ah ahVar) {
        if (room != null && isViewValid()) {
            this.f15880b = room;
            String str = ahVar.f23219b;
            long followStatus = room.getOwner().getFollowInfo().getFollowStatus();
            if (TextUtils.isEmpty(str) || followStatus == 1 || followStatus == 2) {
                PlatformMessageHelper.INSTANCE.onMessageFinish();
            } else if (room.isOfficial()) {
                PlatformMessageHelper.INSTANCE.onMessageFinish();
            } else {
                m17286b(room, ahVar);
                this.f15881c.show();
                C3916b.m13813a().mo11465b();
                this.f15881c.setOnDismissListener(new OnDismissListener() {
                    public final void onDismiss(DialogInterface dialogInterface) {
                        C3916b.m13813a().mo11466c();
                    }
                });
                if (ahVar.f23218a > 0) {
                    this.f15882d.postDelayed(new C5583ah(this), ahVar.f23218a);
                }
                m17288d();
            }
        }
    }

    /* renamed from: b */
    private void m17286b(Room room, C8481ah ahVar) {
        ImageModel imageModel;
        HSImageView hSImageView = this.f15887i;
        if (ahVar.f23220c == null) {
            imageModel = room.getOwner().getAvatarThumb();
        } else {
            imageModel = ahVar.f23220c;
        }
        C5343e.m17033a(hSImageView, imageModel, R.drawable.cce, C3358ac.m12521b((int) R.color.kx), C9051ar.m27035b(this.context, 2.0f), null);
        this.f15883e.setText(room.author().getNickName());
        if (TextUtils.isEmpty(ahVar.f23222e)) {
            this.f15884f.setVisibility(8);
        } else {
            this.f15884f.setText(ahVar.f23222e);
            this.f15884f.setVisibility(0);
        }
        this.f15886h.setText(ahVar.f23219b);
    }
}
