package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.arch.lifecycle.C0053p;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.IUser;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.uikit.p176d.C3519c;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.presenter.C5000bz;
import com.bytedance.android.livesdk.chatroom.presenter.C5000bz.C5001a;
import com.bytedance.android.livesdk.chatroom.utils.C5358p;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.C8448g;
import com.bytedance.android.livesdk.message.model.C8545cg;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;
import p346io.reactivex.p347b.C7321c;

public class RoomPushWidget extends LiveRecyclableWidget implements C0053p<KVData>, C5001a {

    /* renamed from: a */
    public C5000bz f16458a;

    /* renamed from: b */
    public View f16459b;

    /* renamed from: c */
    private boolean f16460c;

    /* renamed from: d */
    private TextView f16461d;

    /* renamed from: e */
    private Room f16462e;

    /* renamed from: f */
    private ImageView f16463f;

    /* renamed from: g */
    private boolean f16464g;

    /* renamed from: h */
    private User f16465h;

    /* renamed from: i */
    private C7321c f16466i;

    /* renamed from: j */
    private Animation f16467j;

    /* renamed from: a */
    public final void mo9118a(Throwable th) {
        C5596au.m18013a(this, th);
    }

    /* renamed from: e */
    public final String mo9125e() {
        return C5596au.m18012a(this);
    }

    public int getLayoutId() {
        return R.layout.ayq;
    }

    /* renamed from: a */
    public final boolean mo13001a() {
        return this.f16460c;
    }

    /* renamed from: b */
    private void m17862b() {
        if (this.f16466i != null) {
            this.f16466i.dispose();
        }
        this.f16467j = AnimationUtils.loadAnimation(this.context, R.anim.cw);
        this.f16467j.setAnimationListener(new AnimationListener() {
            public final void onAnimationRepeat(Animation animation) {
            }

            public final void onAnimationStart(Animation animation) {
            }

            public final void onAnimationEnd(Animation animation) {
                C9738o.m28712b(RoomPushWidget.this.f16459b, 8);
                if (RoomPushWidget.this.f16458a != null) {
                    RoomPushWidget.this.f16458a.mo12999b();
                }
            }
        });
        this.f16459b.startAnimation(this.f16467j);
        this.f16460c = false;
    }

    public void onUnload() {
        this.f16458a.mo8963a();
        this.dataCenter.removeObserver(this);
        this.f16459b.setVisibility(8);
        this.f16460c = false;
        this.f16465h = null;
        if (this.f16466i != null) {
            this.f16466i.dispose();
        }
        if (this.f16467j != null) {
            this.f16467j.cancel();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo14006a(Long l) throws Exception {
        m17862b();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onChanged(KVData kVData) {
        if (kVData != null) {
            String key = kVData.getKey();
            char c = 65535;
            if (key.hashCode() == -1741164106 && key.equals("data_user_in_room")) {
                c = 0;
            }
            if (c == 0) {
                Object data = kVData.getData();
                if (data instanceof User) {
                    this.f16465h = (User) data;
                }
            }
        }
    }

    public void onInit(Object... objArr) {
        this.f16458a = new C5000bz();
        this.f16461d = (TextView) this.contentView.findViewById(R.id.cma);
        this.f16463f = (ImageView) this.contentView.findViewById(R.id.ct_);
        this.f16459b = this.contentView.findViewById(R.id.cmc);
    }

    public void onLoad(Object... objArr) {
        this.f16462e = (Room) this.dataCenter.get("data_room");
        this.f16464g = ((Boolean) this.dataCenter.get("data_is_anchor")).booleanValue();
        this.dataCenter.observeForever("data_user_in_room", this);
        this.f16458a.mo9142a((C5001a) this);
    }

    /* renamed from: a */
    private void m17861a(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("anchor_id", String.valueOf(this.f16462e.getOwnerUserId()));
        hashMap.put("room_id", String.valueOf(this.f16462e.getId()));
        hashMap.put("message_type", str);
        C8443c.m25663a().mo21606a("livesdk_bottom_message_show", hashMap, new Object[0]);
    }

    /* renamed from: b */
    private void m17863b(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("anchor_id", String.valueOf(this.f16462e.getOwnerUserId()));
        hashMap.put("room_id", String.valueOf(this.f16462e.getId()));
        hashMap.put("message_type", str);
        C8443c.m25663a().mo21606a("livesdk_bottom_message_click", hashMap, new Object[0]);
    }

    /* JADX WARNING: Removed duplicated region for block: B:61:0x01a4  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01fe  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo13000a(com.bytedance.android.livesdk.message.model.C8545cg r15) {
        /*
            r14 = this;
            boolean r0 = r14.isViewValid()
            if (r0 == 0) goto L_0x0227
            boolean r0 = r14.f16460c
            if (r0 == 0) goto L_0x000c
            goto L_0x0227
        L_0x000c:
            android.widget.ImageView r0 = r14.f16463f
            r1 = 0
            r0.setVisibility(r1)
            if (r15 == 0) goto L_0x0226
            java.lang.String r0 = r15.f23533k
            r14.m17861a(r0)
            com.bytedance.android.live.base.model.FlexImageModel r0 = r15.f23531i
            if (r0 == 0) goto L_0x0026
            android.view.View r0 = r14.f16459b
            com.bytedance.android.live.base.model.FlexImageModel r2 = r15.f23531i
            m17859a(r0, r2)
            goto L_0x00bf
        L_0x0026:
            java.lang.String r0 = r15.f23524b
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00b7
            android.view.View r0 = r14.f16459b
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            boolean r0 = r0 instanceof android.graphics.drawable.GradientDrawable
            if (r0 == 0) goto L_0x0070
            android.view.View r0 = r14.f16459b
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            android.graphics.drawable.GradientDrawable r0 = (android.graphics.drawable.GradientDrawable) r0
            java.lang.String r2 = r15.f23524b     // Catch:{ Exception -> 0x004a }
            int r2 = android.graphics.Color.parseColor(r2)     // Catch:{ Exception -> 0x004a }
            r0.setColor(r2)     // Catch:{ Exception -> 0x004a }
            goto L_0x00bf
        L_0x004a:
            r0 = move-exception
            com.bytedance.android.livesdk.log.C8444d.m25673b()
            java.lang.String r2 = "ttlive_msg"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "RoomPushWidget load bg color error, color is "
            r3.<init>(r4)
            java.lang.String r4 = r15.f23524b
            r3.append(r4)
            java.lang.String r4 = "/n error is "
            r3.append(r4)
            java.lang.String r0 = r0.getMessage()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.bytedance.android.livesdk.log.C8444d.m11972c(r2, r0)
            goto L_0x00bf
        L_0x0070:
            android.graphics.drawable.GradientDrawable r0 = new android.graphics.drawable.GradientDrawable
            r0.<init>()
            r0.setShape(r1)     // Catch:{ Exception -> 0x0091 }
            r2 = 1094713344(0x41400000, float:12.0)
            int r2 = com.bytedance.android.live.core.utils.C3358ac.m12510a(r2)     // Catch:{ Exception -> 0x0091 }
            float r2 = (float) r2     // Catch:{ Exception -> 0x0091 }
            r0.setCornerRadius(r2)     // Catch:{ Exception -> 0x0091 }
            java.lang.String r2 = r15.f23524b     // Catch:{ Exception -> 0x0091 }
            int r2 = android.graphics.Color.parseColor(r2)     // Catch:{ Exception -> 0x0091 }
            r0.setColor(r2)     // Catch:{ Exception -> 0x0091 }
            android.view.View r2 = r14.f16459b     // Catch:{ Exception -> 0x0091 }
            r2.setBackground(r0)     // Catch:{ Exception -> 0x0091 }
            goto L_0x00bf
        L_0x0091:
            r0 = move-exception
            com.bytedance.android.livesdk.log.C8444d.m25673b()
            java.lang.String r2 = "ttlive_msg"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "RoomPushWidget load bg color error, color is "
            r3.<init>(r4)
            java.lang.String r4 = r15.f23524b
            r3.append(r4)
            java.lang.String r4 = "/n error is "
            r3.append(r4)
            java.lang.String r0 = r0.getMessage()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.bytedance.android.livesdk.log.C8444d.m11972c(r2, r0)
            goto L_0x00bf
        L_0x00b7:
            android.view.View r0 = r14.f16459b
            r2 = 2131234350(0x7f080e2e, float:1.8084863E38)
            r0.setBackgroundResource(r2)
        L_0x00bf:
            com.bytedance.android.live.base.model.ImageModel r0 = r15.f23532j
            if (r0 == 0) goto L_0x00ca
            android.widget.ImageView r0 = r14.f16463f
            com.bytedance.android.live.base.model.ImageModel r2 = r15.f23532j
            com.bytedance.android.livesdk.chatroom.utils.C5343e.m17030a(r0, r2)
        L_0x00ca:
            java.lang.String r0 = r15.f23528f
            java.lang.String r2 = "0"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x00db
            android.widget.ImageView r2 = r14.f16463f
            r3 = 8
            r2.setVisibility(r3)
        L_0x00db:
            java.lang.String r2 = "7"
            boolean r2 = r2.equals(r0)
            r3 = 1
            if (r2 == 0) goto L_0x014c
            java.lang.String r2 = r15.f23527e
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x014c
            java.lang.String r2 = r15.f23527e     // Catch:{ Exception -> 0x0197 }
            com.google.gson.n r4 = new com.google.gson.n     // Catch:{ Exception -> 0x0197 }
            r4.<init>()     // Catch:{ Exception -> 0x0197 }
            com.google.gson.k r2 = r4.mo47346a(r2)     // Catch:{ Exception -> 0x0197 }
            com.google.gson.m r2 = r2.mo16136m()     // Catch:{ Exception -> 0x0197 }
            r4 = 0
            java.util.Set r5 = r2.mo16143a()     // Catch:{ Exception -> 0x0197 }
            int r5 = r5.size()     // Catch:{ Exception -> 0x0197 }
            if (r5 <= 0) goto L_0x013c
            java.lang.String r5 = "gift_id"
            com.google.gson.k r5 = r2.mo16149b(r5)     // Catch:{ Exception -> 0x0197 }
            long r5 = r5.mo16002f()     // Catch:{ Exception -> 0x0197 }
            java.lang.String r7 = "count"
            com.google.gson.k r2 = r2.mo16149b(r7)     // Catch:{ Exception -> 0x0197 }
            int r2 = r2.mo16003g()     // Catch:{ Exception -> 0x0197 }
            java.lang.Class<com.bytedance.android.live.gift.IGiftService> r7 = com.bytedance.android.live.gift.IGiftService.class
            com.bytedance.android.live.base.b r7 = com.bytedance.android.live.utility.C3596c.m13172a(r7)     // Catch:{ Exception -> 0x0197 }
            com.bytedance.android.live.gift.IGiftService r7 = (com.bytedance.android.live.gift.IGiftService) r7     // Catch:{ Exception -> 0x0197 }
            com.bytedance.android.livesdk.gift.model.d r5 = r7.findGiftById(r5)     // Catch:{ Exception -> 0x0197 }
            if (r5 == 0) goto L_0x013c
            r4 = 2131828090(0x7f111d7a, float:1.9289111E38)
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x0197 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x0197 }
            r6[r1] = r2     // Catch:{ Exception -> 0x0197 }
            java.lang.String r2 = r5.f22230a     // Catch:{ Exception -> 0x0197 }
            r6[r3] = r2     // Catch:{ Exception -> 0x0197 }
            java.lang.String r4 = com.bytedance.android.live.core.utils.C3358ac.m12517a(r4, r6)     // Catch:{ Exception -> 0x0197 }
        L_0x013c:
            if (r4 == 0) goto L_0x0144
            android.widget.TextView r2 = r14.f16461d     // Catch:{ Exception -> 0x0197 }
            r2.setText(r4)     // Catch:{ Exception -> 0x0197 }
            goto L_0x019e
        L_0x0144:
            android.widget.TextView r2 = r14.f16461d     // Catch:{ Exception -> 0x0197 }
            java.lang.String r4 = r15.f23523a     // Catch:{ Exception -> 0x0197 }
            r2.setText(r4)     // Catch:{ Exception -> 0x0197 }
            goto L_0x019e
        L_0x014c:
            boolean r2 = r15.supportDisplayText()
            if (r2 == 0) goto L_0x0197
            com.bytedance.android.livesdkapi.message.b r2 = r15.baseMessage
            com.bytedance.android.livesdkapi.message.f r2 = r2.f26000j
            java.lang.String r4 = r2.f26013a
            if (r4 == 0) goto L_0x0175
            com.bytedance.android.livesdk.i18n.b r4 = com.bytedance.android.livesdk.i18n.C8317b.m25387a()
            java.lang.String r5 = r2.f26013a
            java.lang.String r4 = r4.mo21482a(r5)
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x0175
            com.bytedance.android.livesdk.i18n.b r4 = com.bytedance.android.livesdk.i18n.C8317b.m25387a()
            java.lang.String r5 = r2.f26013a
            java.lang.String r4 = r4.mo21482a(r5)
            goto L_0x0177
        L_0x0175:
            java.lang.String r4 = r2.f26014b
        L_0x0177:
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 != 0) goto L_0x018f
            android.text.Spannable r5 = com.bytedance.android.livesdk.chatroom.p212e.C4374z.m14751a(r4, r2)
            android.text.Spannable r6 = com.bytedance.android.livesdk.chatroom.p212e.C4374z.f12668a
            if (r5 == r6) goto L_0x018f
            android.widget.TextView r5 = r14.f16461d
            android.text.Spannable r2 = com.bytedance.android.livesdk.chatroom.p212e.C4374z.m14751a(r4, r2)
            r5.setText(r2)
            goto L_0x019e
        L_0x018f:
            android.widget.TextView r2 = r14.f16461d
            java.lang.String r4 = r15.f23523a
            r2.setText(r4)
            goto L_0x019e
        L_0x0197:
            android.widget.TextView r2 = r14.f16461d
            java.lang.String r4 = r15.f23523a
            r2.setText(r4)
        L_0x019e:
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L_0x01ae
            android.view.View r2 = r14.f16459b
            com.bytedance.android.livesdk.chatroom.viewmodule.es r4 = new com.bytedance.android.livesdk.chatroom.viewmodule.es
            r4.<init>(r14, r15, r0)
            r2.setOnClickListener(r4)
        L_0x01ae:
            android.view.animation.TranslateAnimation r0 = new android.view.animation.TranslateAnimation
            r6 = 1
            r7 = 0
            r8 = 1
            r9 = 0
            r10 = 1
            r11 = 1065353216(0x3f800000, float:1.0)
            r12 = 1
            r13 = 0
            r5 = r0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            r4 = 200(0xc8, double:9.9E-322)
            r0.setDuration(r4)
            android.view.View r2 = r14.f16459b
            r2.startAnimation(r0)
            android.view.View r0 = r14.f16459b
            r0.setVisibility(r1)
            long r0 = r15.f23529g
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS
            io.reactivex.s r0 = p346io.reactivex.C7492s.m23295b(r0, r2)
            com.bytedance.android.live.core.rxutils.a r1 = r14.getAutoUnbindTransformer()
            io.reactivex.s r0 = r0.mo19293a(r1)
            io.reactivex.z r1 = p346io.reactivex.p1865a.p1867b.C47549a.m148327a()
            io.reactivex.s r0 = r0.mo19294a(r1)
            com.bytedance.android.livesdk.chatroom.viewmodule.et r1 = new com.bytedance.android.livesdk.chatroom.viewmodule.et
            r1.<init>(r14)
            com.bytedance.android.livesdk.chatroom.viewmodule.eu r2 = new com.bytedance.android.livesdk.chatroom.viewmodule.eu
            r2.<init>(r14)
            io.reactivex.b.c r0 = r0.mo19280a(r1, r2)
            r14.f16466i = r0
            r14.f16460c = r3
            java.lang.String r0 = r15.f23525c
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0226
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "trace_id"
            java.lang.String r15 = r15.f23525c     // Catch:{ JSONException -> 0x0226 }
            r0.put(r1, r15)     // Catch:{ JSONException -> 0x0226 }
            com.bytedance.android.livesdk.w.e r15 = com.bytedance.android.livesdk.TTLiveSDKContext.getHostService()     // Catch:{ JSONException -> 0x0226 }
            com.bytedance.android.livesdk.user.e r15 = r15.mo22367h()     // Catch:{ JSONException -> 0x0226 }
            com.bytedance.android.live.base.model.user.IUser r15 = r15.mo22165a()     // Catch:{ JSONException -> 0x0226 }
            android.content.Context r0 = r14.context     // Catch:{ JSONException -> 0x0226 }
            com.bytedance.android.livesdk.log.C8448g.m25682a(r0)     // Catch:{ JSONException -> 0x0226 }
            if (r15 == 0) goto L_0x0220
            r15.getId()     // Catch:{ JSONException -> 0x0226 }
        L_0x0220:
            com.bytedance.android.livesdkapi.depend.model.live.Room r15 = r14.f16462e     // Catch:{ JSONException -> 0x0226 }
            r15.getId()     // Catch:{ JSONException -> 0x0226 }
            return
        L_0x0226:
            return
        L_0x0227:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.viewmodule.RoomPushWidget.mo13000a(com.bytedance.android.livesdk.message.model.cg):void");
    }

    /* renamed from: a */
    private static void m17859a(View view, ImageModel imageModel) {
        C5358p.m17090a(imageModel, view, C3519c.m12965a(C3358ac.m12528e()), null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:111:0x03c8  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x03d7  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x0562  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x0570  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x058d  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x059a  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x05b3  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x05c7 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0196  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0298  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x02b2  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x02c1  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x02d0  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo14007a(java.lang.String r20, java.lang.String r21) {
        /*
            r19 = this;
            r1 = r19
            r0 = r20
            r2 = r21
            r19.m17862b()
            int r3 = r20.hashCode()
            r4 = -2082923311(0xffffffff83d91cd1, float:-1.276073E-36)
            r5 = 7
            r6 = 6
            r7 = 5
            r8 = 4
            r9 = 3
            r10 = 2
            r11 = 8
            r12 = 1
            r13 = 0
            if (r3 == r4) goto L_0x00d9
            r4 = 1507424(0x170060, float:2.112351E-39)
            if (r3 == r4) goto L_0x00ce
            r4 = 855900630(0x330401d6, float:3.0735315E-8)
            if (r3 == r4) goto L_0x00c3
            r4 = 1619041129(0x60809b69, float:7.413693E19)
            if (r3 == r4) goto L_0x00b9
            switch(r3) {
                case 48: goto L_0x00af;
                case 49: goto L_0x00a5;
                case 50: goto L_0x009b;
                case 51: goto L_0x0091;
                case 52: goto L_0x0087;
                case 53: goto L_0x007d;
                default: goto L_0x002e;
            }
        L_0x002e:
            switch(r3) {
                case 55: goto L_0x0072;
                case 56: goto L_0x0066;
                case 57: goto L_0x005a;
                default: goto L_0x0031;
            }
        L_0x0031:
            switch(r3) {
                case 1567: goto L_0x004e;
                case 1568: goto L_0x0042;
                case 1569: goto L_0x0036;
                default: goto L_0x0034;
            }
        L_0x0034:
            goto L_0x00e4
        L_0x0036:
            java.lang.String r3 = "12"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x00e4
            r0 = 14
            goto L_0x00e5
        L_0x0042:
            java.lang.String r3 = "11"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x00e4
            r0 = 13
            goto L_0x00e5
        L_0x004e:
            java.lang.String r3 = "10"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x00e4
            r0 = 12
            goto L_0x00e5
        L_0x005a:
            java.lang.String r3 = "9"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x00e4
            r0 = 11
            goto L_0x00e5
        L_0x0066:
            java.lang.String r3 = "8"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x00e4
            r0 = 8
            goto L_0x00e5
        L_0x0072:
            java.lang.String r3 = "7"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x00e4
            r0 = 6
            goto L_0x00e5
        L_0x007d:
            java.lang.String r3 = "5"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x00e4
            r0 = 5
            goto L_0x00e5
        L_0x0087:
            java.lang.String r3 = "4"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x00e4
            r0 = 4
            goto L_0x00e5
        L_0x0091:
            java.lang.String r3 = "3"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x00e4
            r0 = 3
            goto L_0x00e5
        L_0x009b:
            java.lang.String r3 = "2"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x00e4
            r0 = 2
            goto L_0x00e5
        L_0x00a5:
            java.lang.String r3 = "1"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x00e4
            r0 = 1
            goto L_0x00e5
        L_0x00af:
            java.lang.String r3 = "0"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x00e4
            r0 = 0
            goto L_0x00e5
        L_0x00b9:
            java.lang.String r3 = "cmd_pk_mvp_show_list"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x00e4
            r0 = 7
            goto L_0x00e5
        L_0x00c3:
            java.lang.String r3 = "cmd_show_gift_task_info"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x00e4
            r0 = 9
            goto L_0x00e5
        L_0x00ce:
            java.lang.String r3 = "1001"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x00e4
            r0 = 15
            goto L_0x00e5
        L_0x00d9:
            java.lang.String r3 = "cmd_show_steal_tower_info"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x00e4
            r0 = 10
            goto L_0x00e5
        L_0x00e4:
            r0 = -1
        L_0x00e5:
            r3 = 4607722850755301868(0x3ff1eb851eb851ec, double:1.12)
            r14 = 2131828652(0x7f111fac, float:1.929025E38)
            switch(r0) {
                case 0: goto L_0x05c7;
                case 1: goto L_0x05b3;
                case 2: goto L_0x059a;
                case 3: goto L_0x058d;
                case 4: goto L_0x0570;
                case 5: goto L_0x0562;
                case 6: goto L_0x03d7;
                case 7: goto L_0x03c8;
                case 8: goto L_0x02d0;
                case 9: goto L_0x02c1;
                case 10: goto L_0x02b2;
                case 11: goto L_0x0298;
                case 12: goto L_0x0196;
                case 13: goto L_0x011f;
                case 14: goto L_0x0101;
                case 15: goto L_0x00f2;
                default: goto L_0x00f0;
            }
        L_0x00f0:
            goto L_0x05c8
        L_0x00f2:
            java.lang.Class<com.bytedance.android.live.gift.IGiftService> r0 = com.bytedance.android.live.gift.IGiftService.class
            com.bytedance.android.live.base.b r0 = com.bytedance.android.live.utility.C3596c.m13172a(r0)
            com.bytedance.android.live.gift.IGiftService r0 = (com.bytedance.android.live.gift.IGiftService) r0
            java.lang.String r2 = "prop"
            r0.openGiftDialog(r2, r13)
            goto L_0x05c8
        L_0x0101:
            com.bytedance.android.livesdk.chatroom.event.ah r0 = new com.bytedance.android.livesdk.chatroom.event.ah
            r0.<init>(r12)
            com.bytedance.android.livesdk.message.model.bh r3 = new com.bytedance.android.livesdk.message.model.bh
            r3.<init>()
            java.lang.Long r2 = java.lang.Long.valueOf(r21)
            long r4 = r2.longValue()
            r3.f23363b = r4
            r0.f12837b = r3
            com.bytedance.android.livesdk.v.a r2 = com.bytedance.android.livesdk.p427v.C9097a.m27146a()
            r2.mo22267a(r0)
            return
        L_0x011f:
            java.lang.Class<com.bytedance.android.live.b.a> r0 = com.bytedance.android.live.p116b.C2321a.class
            com.bytedance.android.live.base.b r0 = com.bytedance.android.live.utility.C3596c.m13172a(r0)
            if (r0 == 0) goto L_0x05c8
            com.bytedance.ies.sdk.widgets.DataCenter r0 = r1.dataCenter
            java.lang.String r2 = "log_action_type"
            java.lang.Object r0 = r0.get(r2)
            r5 = r0
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Class<com.bytedance.android.live.b.a> r0 = com.bytedance.android.live.p116b.C2321a.class
            com.bytedance.android.live.base.b r0 = com.bytedance.android.live.utility.C3596c.m13172a(r0)
            r2 = r0
            com.bytedance.android.live.b.a r2 = (com.bytedance.android.live.p116b.C2321a) r2
            android.content.Context r3 = r19.getContext()
            com.bytedance.android.livesdkapi.depend.model.live.Room r4 = r1.f16462e
            java.lang.String r6 = "metoo"
            com.bytedance.ies.sdk.widgets.DataCenter r0 = r1.dataCenter
            java.lang.String r7 = "data_is_portrait"
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r12)
            java.lang.Object r0 = r0.get(r7, r8)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r7 = r0.booleanValue()
            r8 = 0
            r2.showJoinFansDialog(r3, r4, r5, r6, r7, r8)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r2 = "anchor_id"
            com.bytedance.android.livesdkapi.depend.model.live.Room r3 = r1.f16462e
            if (r3 == 0) goto L_0x016f
            com.bytedance.android.livesdkapi.depend.model.live.Room r3 = r1.f16462e
            long r3 = r3.getOwnerUserId()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            goto L_0x0171
        L_0x016f:
            java.lang.String r3 = "0"
        L_0x0171:
            r0.put(r2, r3)
            java.lang.String r2 = "room_id"
            com.bytedance.android.livesdkapi.depend.model.live.Room r3 = r1.f16462e
            if (r3 == 0) goto L_0x0185
            com.bytedance.android.livesdkapi.depend.model.live.Room r3 = r1.f16462e
            long r3 = r3.getId()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            goto L_0x0187
        L_0x0185:
            java.lang.String r3 = "0"
        L_0x0187:
            r0.put(r2, r3)
            com.bytedance.android.livesdk.log.c r2 = com.bytedance.android.livesdk.log.C8443c.m25663a()
            java.lang.String r3 = "livesdk_fans_club_metoo_show"
            java.lang.Object[] r4 = new java.lang.Object[r13]
            r2.mo21606a(r3, r0, r4)
            return
        L_0x0196:
            com.bytedance.android.livesdk.w.e r0 = com.bytedance.android.livesdk.TTLiveSDKContext.getHostService()
            com.bytedance.android.livesdk.user.e r0 = r0.mo22367h()
            boolean r0 = r0.mo22182c()
            if (r0 == 0) goto L_0x025f
            com.bytedance.android.livesdk.w.e r0 = com.bytedance.android.livesdk.TTLiveSDKContext.getHostService()
            com.bytedance.android.livesdk.user.e r0 = r0.mo22367h()
            com.bytedance.android.livesdk.user.LiveInteractFunction r2 = com.bytedance.android.livesdk.user.LiveInteractFunction.TURNTABLE
            boolean r0 = r0.mo22178a(r2)
            if (r0 == 0) goto L_0x01b5
            return
        L_0x01b5:
            android.content.Context r0 = r1.context
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            boolean r2 = com.bytedance.android.livesdkapi.p435b.C9290a.f25466a
            if (r2 == 0) goto L_0x01fb
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            com.bytedance.android.live.core.setting.l<java.lang.String> r5 = com.bytedance.android.livesdk.config.LiveConfigSettingKeys.LIVE_TURNTABLE_URL
            r2.append(r5)
            java.lang.String r5 = "&room_id="
            r2.append(r5)
            com.bytedance.android.livesdkapi.depend.model.live.Room r5 = r1.f16462e
            long r5 = r5.getId()
            r2.append(r5)
            java.lang.String r5 = "&language="
            r2.append(r5)
            android.content.Context r5 = r1.context
            android.content.res.Resources r5 = r5.getResources()
            android.content.res.Configuration r5 = r5.getConfiguration()
            java.util.Locale r5 = r5.locale
            java.lang.String r5 = r5.getLanguage()
            r2.append(r5)
            java.lang.String r2 = r2.toString()
        L_0x01f9:
            r13 = r2
            goto L_0x021e
        L_0x01fb:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            com.bytedance.android.live.core.setting.l<java.lang.String> r5 = com.bytedance.android.livesdk.config.LiveConfigSettingKeys.LIVE_TURNTABLE_URL
            java.lang.Object r5 = r5.mo10240a()
            java.lang.String r5 = (java.lang.String) r5
            r2.append(r5)
            java.lang.String r5 = "&room_id="
            r2.append(r5)
            com.bytedance.android.livesdkapi.depend.model.live.Room r5 = r1.f16462e
            long r5 = r5.getId()
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            goto L_0x01f9
        L_0x021e:
            com.bytedance.android.livesdk.v.a r2 = com.bytedance.android.livesdk.p427v.C9097a.m27146a()
            com.bytedance.android.livesdk.chatroom.event.af r5 = new com.bytedance.android.livesdk.chatroom.event.af
            java.lang.String r14 = "banner"
            r15 = 80
            android.content.Context r6 = r1.context
            android.content.res.Resources r6 = r6.getResources()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            int r6 = r6.widthPixels
            float r6 = (float) r6
            float r6 = r6 / r0
            int r6 = (int) r6
            android.content.Context r7 = r1.context
            android.content.res.Resources r7 = r7.getResources()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            int r7 = r7.widthPixels
            float r7 = (float) r7
            float r7 = r7 / r0
            double r7 = (double) r7
            java.lang.Double.isNaN(r7)
            double r7 = r7 * r3
            int r0 = (int) r7
            r18 = 0
            r12 = r5
            r16 = r6
            r17 = r0
            r12.<init>(r13, r14, r15, r16, r17, r18)
            r2.mo22267a(r5)
            android.view.View r0 = r1.f16459b
            r0.setVisibility(r11)
            return
        L_0x025f:
            com.bytedance.android.livesdk.w.e r0 = com.bytedance.android.livesdk.TTLiveSDKContext.getHostService()
            com.bytedance.android.livesdk.user.e r0 = r0.mo22367h()
            android.content.Context r2 = r1.context
            com.bytedance.android.livesdk.user.h$a r3 = com.bytedance.android.livesdk.user.C8987h.m26865a()
            java.lang.String r4 = com.bytedance.android.live.core.utils.C3358ac.m12515a(r14)
            com.bytedance.android.livesdk.user.h$a r3 = r3.mo22189a(r4)
            java.lang.String r4 = "turntable"
            com.bytedance.android.livesdk.user.h$a r3 = r3.mo22192c(r4)
            com.bytedance.android.livesdk.user.h$a r3 = r3.mo22188a(r13)
            com.bytedance.android.livesdk.user.h r3 = r3.mo22190a()
            io.reactivex.s r0 = r0.mo22167a(r2, r3)
            com.bytedance.android.live.core.rxutils.a r2 = r19.getAutoUnbindTransformer()
            io.reactivex.s r0 = r0.mo19293a(r2)
            com.bytedance.android.livesdk.user.g r2 = new com.bytedance.android.livesdk.user.g
            r2.<init>()
            r0.mo19189a(r2)
            return
        L_0x0298:
            com.bytedance.android.livesdk.v.a r0 = com.bytedance.android.livesdk.p427v.C9097a.m27146a()
            com.bytedance.android.livesdk.chatroom.event.af r9 = new com.bytedance.android.livesdk.chatroom.event.af
            java.lang.String r3 = "https://hotsoon.snssdk.com/falcon/live_inroom/page/fans_intro/index.html?show_rule=true"
            java.lang.String r4 = ""
            r5 = 17
            r6 = 300(0x12c, float:4.2E-43)
            r7 = 360(0x168, float:5.04E-43)
            r8 = 12
            r2 = r9
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r0.mo22267a(r9)
            return
        L_0x02b2:
            com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder r0 = com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder.m13782a()
            java.lang.String r2 = "cmd_show_steal_tower_info"
            com.bytedance.android.livesdk.chatroom.model.d r3 = new com.bytedance.android.livesdk.chatroom.model.d
            r3.<init>()
            r0.lambda$put$1$DataCenter(r2, r3)
            return
        L_0x02c1:
            com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder r0 = com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder.m13782a()
            java.lang.String r2 = "cmd_show_gift_task_info"
            com.bytedance.android.livesdk.chatroom.model.d r3 = new com.bytedance.android.livesdk.chatroom.model.d
            r3.<init>()
            r0.lambda$put$1$DataCenter(r2, r3)
            return
        L_0x02d0:
            com.bytedance.android.livesdk.w.e r0 = com.bytedance.android.livesdk.TTLiveSDKContext.getHostService()
            com.bytedance.android.livesdk.user.e r0 = r0.mo22367h()
            boolean r0 = r0.mo22182c()
            if (r0 == 0) goto L_0x038f
            com.bytedance.android.livesdk.w.e r0 = com.bytedance.android.livesdk.TTLiveSDKContext.getHostService()
            com.bytedance.android.livesdk.user.e r0 = r0.mo22367h()
            com.bytedance.android.livesdk.user.LiveInteractFunction r2 = com.bytedance.android.livesdk.user.LiveInteractFunction.TURNTABLE
            boolean r0 = r0.mo22178a(r2)
            if (r0 == 0) goto L_0x02ef
            return
        L_0x02ef:
            android.content.Context r0 = r1.context
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            boolean r2 = com.bytedance.android.livesdkapi.p435b.C9290a.f25466a
            if (r2 == 0) goto L_0x0335
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            com.bytedance.android.live.core.setting.l<java.lang.String> r5 = com.bytedance.android.livesdk.config.LiveConfigSettingKeys.LIVE_TURNTABLE_URL
            r2.append(r5)
            java.lang.String r5 = "&room_id="
            r2.append(r5)
            com.bytedance.android.livesdkapi.depend.model.live.Room r5 = r1.f16462e
            long r5 = r5.getId()
            r2.append(r5)
            java.lang.String r5 = "&language="
            r2.append(r5)
            android.content.Context r5 = r1.context
            android.content.res.Resources r5 = r5.getResources()
            android.content.res.Configuration r5 = r5.getConfiguration()
            java.util.Locale r5 = r5.locale
            java.lang.String r5 = r5.getLanguage()
            r2.append(r5)
            java.lang.String r2 = r2.toString()
        L_0x0333:
            r6 = r2
            goto L_0x0358
        L_0x0335:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            com.bytedance.android.live.core.setting.l<java.lang.String> r5 = com.bytedance.android.livesdk.config.LiveConfigSettingKeys.LIVE_TURNTABLE_URL
            java.lang.Object r5 = r5.mo10240a()
            java.lang.String r5 = (java.lang.String) r5
            r2.append(r5)
            java.lang.String r5 = "&room_id="
            r2.append(r5)
            com.bytedance.android.livesdkapi.depend.model.live.Room r5 = r1.f16462e
            long r5 = r5.getId()
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            goto L_0x0333
        L_0x0358:
            com.bytedance.android.livesdk.v.a r2 = com.bytedance.android.livesdk.p427v.C9097a.m27146a()
            com.bytedance.android.livesdk.chatroom.event.af r12 = new com.bytedance.android.livesdk.chatroom.event.af
            java.lang.String r7 = "banner"
            r8 = 80
            android.content.Context r5 = r1.context
            android.content.res.Resources r5 = r5.getResources()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            int r5 = r5.widthPixels
            float r5 = (float) r5
            float r5 = r5 / r0
            int r9 = (int) r5
            android.content.Context r5 = r1.context
            android.content.res.Resources r5 = r5.getResources()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            int r5 = r5.widthPixels
            float r5 = (float) r5
            float r5 = r5 / r0
            double r10 = (double) r5
            java.lang.Double.isNaN(r10)
            double r10 = r10 * r3
            int r10 = (int) r10
            r11 = 0
            r5 = r12
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r2.mo22267a(r12)
            return
        L_0x038f:
            com.bytedance.android.livesdk.w.e r0 = com.bytedance.android.livesdk.TTLiveSDKContext.getHostService()
            com.bytedance.android.livesdk.user.e r0 = r0.mo22367h()
            android.content.Context r2 = r1.context
            com.bytedance.android.livesdk.user.h$a r3 = com.bytedance.android.livesdk.user.C8987h.m26865a()
            java.lang.String r4 = com.bytedance.android.live.core.utils.C3358ac.m12515a(r14)
            com.bytedance.android.livesdk.user.h$a r3 = r3.mo22189a(r4)
            java.lang.String r4 = "turntable"
            com.bytedance.android.livesdk.user.h$a r3 = r3.mo22192c(r4)
            com.bytedance.android.livesdk.user.h$a r3 = r3.mo22188a(r13)
            com.bytedance.android.livesdk.user.h r3 = r3.mo22190a()
            io.reactivex.s r0 = r0.mo22167a(r2, r3)
            com.bytedance.android.live.core.rxutils.a r2 = r19.getAutoUnbindTransformer()
            io.reactivex.s r0 = r0.mo19293a(r2)
            com.bytedance.android.livesdk.user.g r2 = new com.bytedance.android.livesdk.user.g
            r2.<init>()
            r0.mo19189a(r2)
            return
        L_0x03c8:
            com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder r0 = com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder.m13782a()
            java.lang.String r2 = "cmd_pk_mvp_show_list"
            com.bytedance.android.livesdk.chatroom.model.d r3 = new com.bytedance.android.livesdk.chatroom.model.d
            r3.<init>()
            r0.lambda$put$1$DataCenter(r2, r3)
            return
        L_0x03d7:
            boolean r0 = r1.f16464g
            if (r0 != 0) goto L_0x0435
            boolean r0 = android.text.TextUtils.isEmpty(r21)
            if (r0 != 0) goto L_0x0435
            java.lang.String r0 = "gift_id"
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L_0x0435
            java.lang.String r0 = "count"
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L_0x0435
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x041c }
            r0.<init>(r2)     // Catch:{ JSONException -> 0x041c }
            java.lang.String r2 = "gift_id"
            long r2 = r0.getLong(r2)     // Catch:{ JSONException -> 0x041c }
            java.lang.String r4 = "count"
            int r0 = r0.getInt(r4)     // Catch:{ JSONException -> 0x041c }
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x041b
            if (r0 <= 0) goto L_0x041b
            com.bytedance.android.livesdk.chatroom.event.g r4 = new com.bytedance.android.livesdk.chatroom.event.g     // Catch:{ JSONException -> 0x041c }
            r4.<init>(r2, r0)     // Catch:{ JSONException -> 0x041c }
            java.lang.String r0 = "fans_club_msg"
            r4.mo12142a(r0)     // Catch:{ JSONException -> 0x041c }
            com.bytedance.ies.sdk.widgets.DataCenter r0 = r1.dataCenter     // Catch:{ JSONException -> 0x041c }
            java.lang.String r2 = "cmd_do_send_gift"
            r0.lambda$put$1$DataCenter(r2, r4)     // Catch:{ JSONException -> 0x041c }
        L_0x041b:
            return
        L_0x041c:
            r0 = move-exception
            java.lang.String r2 = "RoomPushWidget"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "fans club send enableGift error:"
            r3.<init>(r4)
            java.lang.String r0 = r0.getMessage()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.bytedance.android.live.core.p147c.C3166a.m11966e(r2, r0)
            return
        L_0x0435:
            com.bytedance.ies.sdk.widgets.DataCenter r0 = r1.dataCenter
            java.lang.String r2 = "log_enter_live_source"
            java.lang.Object r0 = r0.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            com.bytedance.ies.sdk.widgets.DataCenter r2 = r1.dataCenter
            java.lang.String r3 = "data_is_portrait"
            java.lang.Object r2 = r2.get(r3)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            com.bytedance.android.live.base.model.user.User r3 = r1.f16465h
            if (r3 == 0) goto L_0x047e
            com.bytedance.android.live.base.model.user.User r3 = r1.f16465h
            com.bytedance.android.live.base.model.FansClubMember r3 = r3.getFansClub()
            if (r3 == 0) goto L_0x047e
            com.bytedance.android.live.base.model.user.User r3 = r1.f16465h
            com.bytedance.android.live.base.model.FansClubMember r3 = r3.getFansClub()
            com.bytedance.android.live.base.model.user.FansClubData r3 = r3.getData()
            if (r3 == 0) goto L_0x047e
            com.bytedance.android.live.base.model.user.User r3 = r1.f16465h
            com.bytedance.android.live.base.model.FansClubMember r3 = r3.getFansClub()
            com.bytedance.android.live.base.model.user.FansClubData r3 = r3.getData()
            long r3 = r3.anchorId
            com.bytedance.android.livesdkapi.depend.model.live.Room r14 = r1.f16462e
            long r14 = r14.getOwnerUserId()
            int r16 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r16 != 0) goto L_0x047e
            java.lang.String r3 = "1"
            goto L_0x0480
        L_0x047e:
            java.lang.String r3 = "0"
        L_0x0480:
            java.lang.String r4 = com.bytedance.android.livesdk.chatroom.widget.LiveRoomUserInfoWidget.f16946a
            boolean r14 = r1.f16464g
            boolean r14 = com.bytedance.android.livesdk.fansclub.C5900c.m18433a(r14)
            if (r14 == 0) goto L_0x048c
            java.lang.String r4 = com.bytedance.android.livesdk.chatroom.widget.LiveRoomUserInfoWidget.f16947b
        L_0x048c:
            java.util.Locale r14 = java.util.Locale.US
            java.lang.Object[] r11 = new java.lang.Object[r11]
            com.bytedance.android.livesdkapi.depend.model.live.Room r15 = r1.f16462e
            long r15 = r15.getId()
            java.lang.Long r15 = java.lang.Long.valueOf(r15)
            r11[r13] = r15
            com.bytedance.android.livesdkapi.depend.model.live.Room r15 = r1.f16462e
            com.bytedance.android.live.base.model.user.User r15 = r15.getOwner()
            long r15 = r15.getId()
            java.lang.Long r15 = java.lang.Long.valueOf(r15)
            r11[r12] = r15
            com.bytedance.android.livesdk.w.e r12 = com.bytedance.android.livesdk.TTLiveSDKContext.getHostService()
            com.bytedance.android.livesdk.user.e r12 = r12.mo22367h()
            long r15 = r12.mo22179b()
            java.lang.Long r12 = java.lang.Long.valueOf(r15)
            r11[r10] = r12
            r11[r9] = r0
            java.lang.String r0 = ""
            r11[r8] = r0
            java.lang.String r0 = "bottom"
            r11[r7] = r0
            r11[r6] = r3
            com.bytedance.android.livesdk.w.e r0 = com.bytedance.android.livesdk.TTLiveSDKContext.getHostService()
            com.bytedance.android.livesdk.user.e r0 = r0.mo22367h()
            com.bytedance.android.live.base.model.user.IUser r0 = r0.mo22165a()
            int r0 = com.bytedance.android.livesdk.p431y.p433b.C9281a.m27615a(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r11[r5] = r0
            java.lang.String r0 = com.C1642a.m8035a(r14, r4, r11)
            boolean r3 = r1.f16464g
            boolean r3 = com.bytedance.android.livesdk.fansclub.C5900c.m18433a(r3)
            if (r3 == 0) goto L_0x04fd
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            java.lang.String r0 = "&web_bg_color=%2300000000"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
        L_0x04fd:
            r4 = r0
            android.content.Context r0 = r1.context
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r3 = r0.widthPixels
            float r3 = (float) r3
            float r5 = r0.density
            float r3 = r3 / r5
            int r3 = (int) r3
            int r5 = r0.heightPixels
            float r5 = (float) r5
            float r0 = r0.density
            float r5 = r5 / r0
            int r0 = (int) r5
            if (r2 == 0) goto L_0x0530
            r5 = 440(0x1b8, float:6.17E-43)
            boolean r6 = r1.f16464g
            boolean r6 = com.bytedance.android.livesdk.fansclub.C5900c.m18433a(r6)
            if (r6 == 0) goto L_0x052c
            float r0 = (float) r0
            r5 = 1062836634(0x3f59999a, float:0.85)
            float r0 = r0 * r5
            int r0 = (int) r0
            r8 = r0
            r7 = r3
            goto L_0x0532
        L_0x052c:
            r7 = r3
            r8 = 440(0x1b8, float:6.17E-43)
            goto L_0x0532
        L_0x0530:
            r7 = r0
            r8 = r7
        L_0x0532:
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L_0x0561
            com.bytedance.android.livesdk.chatroom.event.af r0 = new com.bytedance.android.livesdk.chatroom.event.af
            java.lang.String r5 = ""
            if (r2 == 0) goto L_0x0543
            r2 = 80
            r6 = 80
            goto L_0x0549
        L_0x0543:
            r2 = 8388613(0x800005, float:1.175495E-38)
            r6 = 8388613(0x800005, float:1.175495E-38)
        L_0x0549:
            r9 = 0
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            boolean r2 = r1.f16464g
            boolean r2 = com.bytedance.android.livesdk.fansclub.C5900c.m18433a(r2)
            if (r2 == 0) goto L_0x055a
            r0.f12833i = r13
            r0.f12834j = r13
        L_0x055a:
            com.bytedance.android.livesdk.v.a r2 = com.bytedance.android.livesdk.p427v.C9097a.m27146a()
            r2.mo22267a(r0)
        L_0x0561:
            return
        L_0x0562:
            com.bytedance.ies.sdk.widgets.DataCenter r0 = r1.dataCenter
            java.lang.String r2 = "cmd_send_gift"
            com.bytedance.android.livesdkapi.depend.model.live.Room r3 = r1.f16462e
            com.bytedance.android.live.base.model.user.User r3 = r3.getOwner()
            r0.lambda$put$1$DataCenter(r2, r3)
            return
        L_0x0570:
            boolean r0 = r1.f16464g
            if (r0 != 0) goto L_0x05c8
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r1.f16462e
            com.bytedance.android.live.base.model.user.User r0 = r0.getOwner()
            boolean r0 = r0.isFollowing()
            if (r0 != 0) goto L_0x05c8
            com.bytedance.ies.sdk.widgets.DataCenter r0 = r1.dataCenter
            java.lang.String r2 = "cmd_wanna_follow_anchor"
            com.bytedance.android.livesdk.chatroom.event.au r3 = new com.bytedance.android.livesdk.chatroom.event.au
            r3.<init>()
            r0.lambda$put$1$DataCenter(r2, r3)
            return
        L_0x058d:
            com.bytedance.ies.sdk.widgets.DataCenter r0 = r1.dataCenter
            java.lang.String r2 = "cmd_wanna_share_live"
            java.lang.Object r3 = new java.lang.Object
            r3.<init>()
            r0.lambda$put$1$DataCenter(r2, r3)
            return
        L_0x059a:
            com.bytedance.android.livesdk.v.a r0 = com.bytedance.android.livesdk.p427v.C9097a.m27146a()
            com.bytedance.android.livesdk.chatroom.event.aw r2 = new com.bytedance.android.livesdk.chatroom.event.aw
            r2.<init>()
            r0.mo22267a(r2)
            com.bytedance.ies.sdk.widgets.DataCenter r0 = r1.dataCenter
            java.lang.String r2 = "cmd_wanna_send_message"
            com.bytedance.android.livesdk.chatroom.event.aw r3 = new com.bytedance.android.livesdk.chatroom.event.aw
            r3.<init>()
            r0.lambda$put$1$DataCenter(r2, r3)
            return
        L_0x05b3:
            boolean r0 = android.text.TextUtils.isEmpty(r21)
            if (r0 != 0) goto L_0x05c8
            com.bytedance.android.livesdk.w.f r0 = com.bytedance.android.livesdk.p428w.C9178j.m27302j()
            com.bytedance.android.livesdk.schema.interfaces.a r0 = r0.mo22380i()
            android.content.Context r3 = r1.context
            r0.handle(r3, r2)
            return
        L_0x05c7:
            return
        L_0x05c8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.viewmodule.RoomPushWidget.mo14007a(java.lang.String, java.lang.String):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo14005a(C8545cg cgVar, String str, View view) {
        if (isViewValid()) {
            if (!TextUtils.isEmpty(cgVar.f23525c)) {
                try {
                    new JSONObject().put("trace_id", cgVar.f23525c);
                    IUser a = TTLiveSDKContext.getHostService().mo22367h().mo22165a();
                    C8448g.m25682a(this.context);
                    if (a != null) {
                        a.getId();
                    }
                    this.f16462e.getId();
                } catch (JSONException unused) {
                }
            }
            m17863b(cgVar.f23533k);
            mo14007a(str, cgVar.f23527e);
        }
    }
}
