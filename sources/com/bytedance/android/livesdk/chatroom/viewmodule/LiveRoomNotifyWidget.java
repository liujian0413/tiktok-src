package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.core.utils.C3404s.C3405a;
import com.bytedance.android.live.core.utils.p158a.C3353i;
import com.bytedance.android.live.room.C3495l;
import com.bytedance.android.live.room.p168a.C3482a;
import com.bytedance.android.live.uikit.p176d.C3519c;
import com.bytedance.android.live.uikit.rtl.AutoRTLImageView;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.chatroom.event.C4445o;
import com.bytedance.android.livesdk.chatroom.event.C4446p;
import com.bytedance.android.livesdk.chatroom.p209bl.PlatformMessageHelper;
import com.bytedance.android.livesdk.chatroom.p212e.C4374z;
import com.bytedance.android.livesdk.chatroom.utils.C5343e;
import com.bytedance.android.livesdk.i18n.C8317b;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.C8448g;
import com.bytedance.android.livesdk.log.p405b.C8438j;
import com.bytedance.android.livesdk.message.model.C8544cf;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.android.livesdk.p428w.C9178j;
import com.bytedance.android.livesdk.rank.C8804a;
import com.bytedance.android.livesdk.widget.LiveVerticalViewPager;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.message.C9505f;
import com.bytedance.common.utility.C6311g;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;
import p346io.reactivex.p347b.C47562b;
import p346io.reactivex.p348d.C7326g;

public class LiveRoomNotifyWidget extends LiveRecyclableWidget implements C6310a {

    /* renamed from: a */
    public View f16175a;

    /* renamed from: b */
    public AutoRTLImageView f16176b;

    /* renamed from: c */
    public TextView f16177c;

    /* renamed from: d */
    public C6309f f16178d;

    /* renamed from: e */
    public AnimatorSet f16179e;

    /* renamed from: f */
    public AnimatorSet f16180f;

    /* renamed from: g */
    public boolean f16181g;

    /* renamed from: h */
    public long f16182h = 2000;

    /* renamed from: i */
    public int f16183i;

    /* renamed from: j */
    public LiveVerticalViewPager f16184j;

    /* renamed from: k */
    private Room f16185k;

    /* renamed from: l */
    private int f16186l;

    /* renamed from: m */
    private C47562b f16187m;

    /* renamed from: n */
    private C5455a f16188n;

    /* renamed from: o */
    private View f16189o;

    /* renamed from: p */
    private int f16190p = 4;

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.LiveRoomNotifyWidget$a */
    class C5455a implements OnTouchListener {

        /* renamed from: a */
        int[] f16196a;

        /* renamed from: b */
        final /* synthetic */ LiveRoomNotifyWidget f16197b;

        /* renamed from: c */
        private int f16198c;

        /* renamed from: d */
        private int f16199d;

        /* renamed from: e */
        private int f16200e;

        /* renamed from: f */
        private int f16201f;

        /* renamed from: g */
        private float f16202g;

        /* renamed from: h */
        private boolean f16203h;

        /* renamed from: i */
        private VelocityTracker f16204i;

        /* renamed from: j */
        private boolean f16205j;

        /* renamed from: k */
        private int f16206k;

        /* renamed from: l */
        private int f16207l;

        /* renamed from: m */
        private ValueAnimator f16208m;

        /* renamed from: n */
        private ValueAnimator f16209n;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo13912a() {
            if (this.f16209n != null) {
                this.f16209n.cancel();
            }
            if (this.f16208m != null) {
                this.f16208m.cancel();
            }
        }

        /* renamed from: b */
        private void m17661b() {
            if (this.f16206k <= 0) {
                int[] iArr = new int[2];
                this.f16197b.containerView.getLocationOnScreen(iArr);
                this.f16206k = iArr[1] >> 1;
                this.f16207l = ((this.f16197b.f16183i - iArr[1]) - this.f16197b.containerView.getHeight()) - 5;
            }
        }

        /* renamed from: d */
        private void m17663d() {
            final MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f16197b.containerView.getLayoutParams();
            this.f16209n = ValueAnimator.ofInt(new int[]{marginLayoutParams.topMargin, this.f16197b.f16183i});
            this.f16209n.addUpdateListener(new AnimatorUpdateListener() {
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    Object animatedValue = valueAnimator.getAnimatedValue();
                    if ((animatedValue instanceof Integer) && C5455a.this.f16197b.containerView != null) {
                        marginLayoutParams.topMargin = ((Integer) animatedValue).intValue();
                        C5455a.this.f16197b.containerView.setLayoutParams(marginLayoutParams);
                    }
                }
            });
            this.f16209n.setInterpolator(new DecelerateInterpolator());
            this.f16209n.setDuration(400);
            this.f16209n.start();
        }

        /* renamed from: c */
        private void m17662c() {
            final MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f16197b.containerView.getLayoutParams();
            this.f16208m = ValueAnimator.ofInt(new int[]{marginLayoutParams.topMargin, this.f16207l});
            this.f16208m.setDuration(400);
            this.f16208m.setInterpolator(new DecelerateInterpolator());
            this.f16208m.addListener(new AnimatorListenerAdapter() {
                public final void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    C9738o.m28712b(C5455a.this.f16197b.f16175a, 8);
                    C9738o.m28702a((View) C5455a.this.f16197b.containerView, -3, C5455a.this.f16197b.f16183i, -3, -3);
                    PlatformMessageHelper.INSTANCE.onMessageFinish();
                }

                public final void onAnimationStart(Animator animator) {
                    super.onAnimationStart(animator);
                    if (C5455a.this.f16197b.f16179e != null) {
                        C5455a.this.f16197b.f16179e.cancel();
                    }
                    if (C5455a.this.f16197b.f16180f != null) {
                        C5455a.this.f16197b.f16180f.cancel();
                    }
                }
            });
            this.f16208m.addUpdateListener(new AnimatorUpdateListener() {
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    Object animatedValue = valueAnimator.getAnimatedValue();
                    if ((animatedValue instanceof Integer) && C5455a.this.f16197b.containerView != null) {
                        marginLayoutParams.topMargin = ((Integer) animatedValue).intValue();
                        C5455a.this.f16197b.containerView.setLayoutParams(marginLayoutParams);
                    }
                }
            });
            this.f16208m.start();
        }

        /* renamed from: a */
        private boolean m17660a(MotionEvent motionEvent) {
            if (this.f16204i == null) {
                this.f16204i = VelocityTracker.obtain();
            }
            this.f16204i.addMovement(motionEvent);
            VelocityTracker velocityTracker = this.f16204i;
            velocityTracker.computeCurrentVelocity(1000);
            float yVelocity = velocityTracker.getYVelocity();
            this.f16197b.containerView.getLocationOnScreen(this.f16196a);
            if (yVelocity > 1000.0f || this.f16206k > this.f16196a[1]) {
                return true;
            }
            return false;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            int rawX = (int) motionEvent.getRawX();
            int rawY = (int) motionEvent.getRawY();
            switch (motionEvent.getAction()) {
                case 0:
                    if (this.f16197b.f16184j != null) {
                        this.f16197b.f16184j.setEnabled(false);
                    }
                    this.f16205j = false;
                    this.f16198c = rawX;
                    this.f16199d = rawY;
                    this.f16200e = this.f16198c;
                    this.f16201f = this.f16199d;
                    this.f16202g = (float) ViewConfiguration.get(this.f16197b.getContext()).getScaledTouchSlop();
                    this.f16203h = true;
                    m17661b();
                    break;
                case 1:
                case 3:
                    this.f16205j = m17660a(motionEvent);
                    if (!this.f16205j && this.f16203h && ((float) Math.abs(rawX - this.f16198c)) < this.f16202g && ((float) Math.abs(rawY - this.f16199d)) < this.f16202g) {
                        this.f16197b.f16175a.performClick();
                    }
                    if (this.f16197b.f16184j != null) {
                        this.f16197b.f16184j.setEnabled(true);
                    }
                    if (!this.f16205j) {
                        m17663d();
                        break;
                    } else {
                        m17662c();
                        break;
                    }
                case 2:
                    int i = rawX - this.f16200e;
                    int i2 = rawY - this.f16201f;
                    LayoutParams layoutParams = this.f16197b.containerView.getLayoutParams();
                    if (layoutParams instanceof RelativeLayout.LayoutParams) {
                        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                        int i3 = layoutParams2.topMargin + i2;
                        if (i3 > this.f16197b.f16183i) {
                            i3 = this.f16197b.f16183i;
                        }
                        layoutParams2.topMargin = i3;
                        this.f16197b.containerView.setLayoutParams(layoutParams2);
                    }
                    int abs = Math.abs(i);
                    int abs2 = Math.abs(i2);
                    if (((float) abs) > this.f16202g || ((float) abs2) > this.f16202g) {
                        this.f16203h = false;
                    }
                    this.f16200e = rawX;
                    this.f16201f = rawY;
                    break;
                default:
                    if (this.f16197b.f16184j != null) {
                        this.f16197b.f16184j.setEnabled(true);
                        break;
                    }
                    break;
            }
            return true;
        }
    }

    public int getLayoutId() {
        return R.layout.aul;
    }

    public void handleMsg(Message message) {
    }

    /* renamed from: a */
    private void m17639a() {
        C9738o.m28712b(this.f16189o, 8);
    }

    /* renamed from: d */
    private void m17647d() {
        this.f16187m = new C47562b();
        this.f16187m.mo119661a(C9097a.m27146a().mo22266a(C4446p.class).mo19325f((C7326g<? super T>) new C7326g<C4446p>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void accept(C4446p pVar) throws Exception {
                if (pVar != null && pVar.f12902a != null) {
                    C4445o oVar = pVar.f12902a;
                    if (oVar.f12900c == null) {
                        oVar.f12900c = new Bundle();
                    }
                    oVar.f12900c.putInt("back_source", 1);
                    C8804a.m26400c(LiveRoomNotifyWidget.this.dataCenter, oVar.f12900c);
                    C9097a.m27146a().mo22267a((Object) new C4445o(oVar.f12898a, "live_detail", oVar.f12900c));
                }
            }
        }));
    }

    public void onUnload() {
        this.contentView.setVisibility(8);
        this.f16178d.removeCallbacksAndMessages(null);
        this.f16179e.cancel();
        this.f16180f.cancel();
        if (this.f16187m != null) {
            this.f16187m.dispose();
        }
        if (this.f16188n != null) {
            this.f16188n.mo13912a();
        }
    }

    /* renamed from: b */
    private void m17644b() {
        if (this.dataCenter != null) {
            Room room = (Room) this.dataCenter.get("data_room");
            if (room != null && room.isKoiRoom()) {
                this.f16190p = 25;
                C9738o.m28702a((View) this.containerView, -3, (int) C9738o.m28708b(this.context, (float) this.f16190p), -3, -3);
                if (this.containerView != null && (this.containerView.getLayoutParams() instanceof MarginLayoutParams)) {
                    this.f16183i = ((MarginLayoutParams) this.containerView.getLayoutParams()).topMargin;
                }
            }
        }
    }

    /* renamed from: c */
    private void m17646c() {
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2;
        if (!C3519c.m12965a(this.context) || this.f16181g) {
            objectAnimator = ObjectAnimator.ofFloat(this.f16175a, "translationX", new float[]{(float) this.f16186l, 0.0f});
        } else {
            objectAnimator = ObjectAnimator.ofFloat(this.f16175a, "translationX", new float[]{(float) (-this.f16186l), 0.0f});
        }
        objectAnimator.setDuration(1000);
        if (!C3519c.m12965a(this.context) || this.f16181g) {
            objectAnimator2 = ObjectAnimator.ofFloat(this.f16175a, "translationX", new float[]{0.0f, (float) (-this.f16186l)});
        } else {
            objectAnimator2 = ObjectAnimator.ofFloat(this.f16175a, "translationX", new float[]{0.0f, (float) this.f16186l});
        }
        this.f16179e = new AnimatorSet();
        this.f16180f = new AnimatorSet();
        this.f16179e.playSequentially(new Animator[]{objectAnimator});
        this.f16180f.playSequentially(new Animator[]{objectAnimator2});
        this.f16179e.addListener(new AnimatorListenerAdapter() {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final /* synthetic */ void mo13904a() {
                if (LiveRoomNotifyWidget.this.isViewValid()) {
                    LiveRoomNotifyWidget.this.f16180f.start();
                }
            }

            public final void onAnimationStart(Animator animator) {
                LiveRoomNotifyWidget.this.f16175a.setVisibility(0);
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final /* synthetic */ void mo13905a(int i) {
                if (LiveRoomNotifyWidget.this.isViewValid()) {
                    if (LiveRoomNotifyWidget.this.f16177c.getScrollX() != 0 && C3519c.m12965a(LiveRoomNotifyWidget.this.context)) {
                        i = LiveRoomNotifyWidget.this.f16177c.getScrollX() - i;
                    }
                    ObjectAnimator duration = ObjectAnimator.ofInt(LiveRoomNotifyWidget.this.f16177c, "scrollX", new int[]{i}).setDuration(2000);
                    duration.setInterpolator(new LinearInterpolator());
                    duration.addListener(new AnimatorListenerAdapter() {
                        /* access modifiers changed from: 0000 */
                        /* renamed from: a */
                        public final /* synthetic */ void mo13908a() {
                            if (LiveRoomNotifyWidget.this.isViewValid()) {
                                LiveRoomNotifyWidget.this.f16180f.start();
                            }
                        }

                        public final void onAnimationEnd(Animator animator) {
                            View view = LiveRoomNotifyWidget.this.contentView;
                            C5668dl dlVar = new C5668dl(this);
                            long j = 500;
                            if (LiveRoomNotifyWidget.this.f16182h > 2000) {
                                j = 500 + (LiveRoomNotifyWidget.this.f16182h - 2000);
                            }
                            view.postDelayed(dlVar, j);
                        }
                    });
                    duration.start();
                }
            }

            public final void onAnimationEnd(Animator animator) {
                int i;
                long j;
                if (LiveRoomNotifyWidget.this.isViewValid() && LiveRoomNotifyWidget.this.f16178d != null) {
                    boolean z = false;
                    if (LiveRoomNotifyWidget.this.f16177c.getLayout() != null) {
                        i = ((int) LiveRoomNotifyWidget.this.f16177c.getLayout().getLineWidth(0)) - ((LiveRoomNotifyWidget.this.f16177c.getWidth() - LiveRoomNotifyWidget.this.f16177c.getCompoundPaddingRight()) - LiveRoomNotifyWidget.this.f16177c.getCompoundPaddingLeft());
                        if (i > 0) {
                            z = true;
                        }
                    } else {
                        i = 0;
                    }
                    if (!z) {
                        View view = LiveRoomNotifyWidget.this.contentView;
                        C5666dj djVar = new C5666dj(this);
                        if (LiveRoomNotifyWidget.this.f16182h > 0) {
                            j = LiveRoomNotifyWidget.this.f16182h;
                        } else {
                            j = 2000;
                        }
                        view.postDelayed(djVar, j);
                        return;
                    }
                    LiveRoomNotifyWidget.this.contentView.postDelayed(new C5667dk(this, i), 500);
                }
            }
        });
        this.f16180f.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                LiveRoomNotifyWidget.this.f16175a.setVisibility(8);
                PlatformMessageHelper.INSTANCE.onMessageFinish();
            }
        });
    }

    /* renamed from: b */
    private static boolean m17645b(String str) {
        return str.contains(Build.BRAND.toLowerCase());
    }

    /* renamed from: a */
    private void m17641a(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("reason", "unrecognised schema");
            jSONObject.put("schema", str);
            C8448g.m25682a(this.context);
        } catch (JSONException unused) {
        }
    }

    /* renamed from: a */
    private static boolean m17643a(Uri uri) {
        if (uri == null || TextUtils.isEmpty(uri.getQueryParameter("gift_id"))) {
            return false;
        }
        return true;
    }

    public void onLoad(Object... objArr) {
        this.f16185k = (Room) this.dataCenter.get("data_room");
        if (!((Boolean) this.dataCenter.get("data_is_portrait")).booleanValue()) {
            LayoutParams layoutParams = this.f16175a.getLayoutParams();
            layoutParams.width = C3358ac.m12510a(400.0f);
            this.f16175a.setLayoutParams(layoutParams);
        }
        m17647d();
        m17639a();
        m17644b();
    }

    /* renamed from: a */
    public final void mo13900a(C8544cf cfVar) {
        if (!isViewValid() || cfVar == null) {
            PlatformMessageHelper.INSTANCE.onMessageFinish();
            return;
        }
        this.f16175a.setVisibility(0);
        this.f16175a.setTranslationX((float) this.f16186l);
        this.f16177c.setScrollX(0);
        if (cfVar.f23521e == null || cfVar.f23521e.f23183b == null || C6311g.m19573a(cfVar.f23521e.f23183b.getUrls())) {
            mo13902b(cfVar);
            return;
        }
        this.f16176b.setBackgroundResource(0);
        C3353i.m12504a(this.f16176b, "2131296657", cfVar);
        C5343e.m17035a((ImageView) this.f16176b, (ImageModel) cfVar.f23521e.f23183b, (C3405a) new C3405a() {
            /* renamed from: a */
            public final void mo10308a(ImageModel imageModel) {
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final /* synthetic */ void mo13911a() {
                LiveRoomNotifyWidget.this.mo13902b((C8544cf) C3353i.m12502a((View) LiveRoomNotifyWidget.this.f16176b, "2131296657"));
            }

            /* renamed from: a */
            public final void mo10310a(ImageModel imageModel, Exception exc) {
                AutoRTLImageView autoRTLImageView = LiveRoomNotifyWidget.this.f16176b;
                PlatformMessageHelper platformMessageHelper = PlatformMessageHelper.INSTANCE;
                platformMessageHelper.getClass();
                autoRTLImageView.post(C5670dn.m18036a(platformMessageHelper));
            }

            /* renamed from: a */
            public final void mo10309a(ImageModel imageModel, int i, int i2, boolean z) {
                if (LiveRoomNotifyWidget.this.isViewValid()) {
                    if (!LiveRoomNotifyWidget.this.f16181g && C3519c.m12965a(LiveRoomNotifyWidget.this.context)) {
                        LiveRoomNotifyWidget.this.f16176b.setRotationY(180.0f);
                    }
                    LiveRoomNotifyWidget.this.f16176b.post(new C5669dm(this));
                }
            }
        });
    }

    public void onInit(Object... objArr) {
        this.f16181g = m17645b("huawei&honor");
        this.f16175a = this.contentView;
        this.f16176b = (AutoRTLImageView) this.contentView.findViewById(R.id.k5);
        this.f16177c = (TextView) this.contentView.findViewById(R.id.c7t);
        this.f16189o = this.contentView.findViewById(R.id.ct4);
        if (C3519c.m12965a(this.context) && this.f16181g) {
            this.f16177c = (TextView) this.contentView.findViewById(R.id.c7u);
            this.f16177c.setGravity(8388613);
        } else if (!C3519c.m12965a(this.context) && VERSION.SDK_INT >= 17) {
            this.f16177c.setTextDirection(3);
        }
        this.f16186l = C9738o.m28691a(this.context);
        this.f16178d = new C6309f(this);
        m17646c();
    }

    /* renamed from: b */
    public final void mo13902b(C8544cf cfVar) {
        long j;
        C8544cf cfVar2 = cfVar;
        if (cfVar2 != null && cfVar2.f23520d != null) {
            String str = cfVar2.f23520d;
            User user = cfVar2.f23522f;
            long j2 = cfVar2.baseMessage.f25994d;
            if (cfVar.supportDisplayText()) {
                C9505f fVar = cfVar2.baseMessage.f26000j;
                String str2 = null;
                String str3 = fVar.f26014b;
                if (!TextUtils.isEmpty(fVar.f26013a)) {
                    str2 = C8317b.m25387a().mo21482a(fVar.f26013a);
                }
                if (TextUtils.isEmpty(str2)) {
                    str2 = str3;
                }
                this.f16177c.setText(C4374z.m14751a(str2, fVar));
            } else if (!(cfVar2.f23521e == null || cfVar2.f23521e.f23184c == null)) {
                this.f16177c.setText(cfVar2.f23521e.f23184c.mo12881a());
            }
            try {
                j = Long.parseLong(Uri.parse(str).getQueryParameter("room_id"));
            } catch (NumberFormatException unused) {
                j = 0;
            }
            long j3 = j;
            int i = cfVar2.f23519c;
            String str4 = str;
            User user2 = user;
            long j4 = j3;
            C5664dh dhVar = r0;
            long j5 = j2;
            View view = this.f16175a;
            int i2 = i;
            int i3 = i;
            C8544cf cfVar3 = cfVar;
            C5664dh dhVar2 = new C5664dh(this, str4, user2, j5, i2, cfVar3);
            view.setOnClickListener(dhVar);
            TextView textView = this.f16177c;
            C5665di diVar = new C5665di(this, str4, user2, j5, i3, cfVar3);
            textView.setOnClickListener(diVar);
            if (cfVar2.f23521e != null) {
                this.f16182h = cfVar2.f23521e.f23185d * 1000;
            }
            this.f16179e.start();
            HashMap hashMap = new HashMap();
            hashMap.put("room_id", String.valueOf(j4));
            hashMap.put("message_type", String.valueOf(i3));
            hashMap.put("enter_from_merge", "live_detail");
            hashMap.put("enter_method", "top_message");
            hashMap.put("top_message_type", "gift");
            Uri parse = Uri.parse(str);
            String queryParameter = parse.getQueryParameter("gift_id");
            if (!C6319n.m19593a(queryParameter)) {
                hashMap.put("gift_id", queryParameter);
            }
            String queryParameter2 = parse.getQueryParameter("anchor_id");
            if (!C6319n.m19593a(queryParameter2)) {
                hashMap.put("anchor_id", queryParameter2);
            }
            C8443c.m25663a().mo21606a("live_show", hashMap, new C8438j().mo21599b("live_view").mo21598a("live_detail").mo21600c("top_message").mo21604g("click").mo21603f("core"), Room.class);
            m17640a(cfVar2, "show");
        }
    }

    /* renamed from: a */
    private void m17640a(C8544cf cfVar, String str) {
        HashMap hashMap = new HashMap(7);
        if (this.f16185k != null) {
            hashMap.put("room_id", this.f16185k.getIdStr());
            hashMap.put("anchor_id", String.valueOf(this.f16185k.getOwnerUserId()));
        }
        if (cfVar != null) {
            String str2 = "";
            int i = (int) cfVar.f23518b;
            if (i != 10) {
                switch (i) {
                    case 1:
                        str2 = "gift";
                        break;
                    case 2:
                        str2 = "notice";
                        break;
                    case 3:
                        str2 = "activity";
                        break;
                    case 4:
                        str2 = "fans_club";
                        break;
                    case 5:
                        str2 = "prop";
                        break;
                    case 6:
                        str2 = "warden_buy";
                        break;
                }
            } else {
                str2 = "vehicle";
            }
            hashMap.put("message_type", str2);
            try {
                Uri parse = Uri.parse(cfVar.f23520d);
                hashMap.put("to_room_id", parse.getQueryParameter("room_id"));
                hashMap.put("to_anchor_id", parse.getQueryParameter("user_id"));
                hashMap.put("present_id", parse.getQueryParameter("gift_id"));
            } catch (Exception unused) {
            }
        }
        hashMap.put("action_type", str);
        C8443c.m25663a().mo21606a("livesdk_top_message", hashMap, new Object[0]);
    }

    /* renamed from: a */
    private void m17642a(String str, User user, long j, int i) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            m17641a(str);
            return;
        }
        Uri parse = Uri.parse(str);
        if (parse.getQuery() == null) {
            StringBuilder sb = new StringBuilder("enter_from_widget=notify&msg_type=");
            sb.append(i);
            str2 = sb.toString();
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append("&enter_from_widget=notify&msg_type=");
            sb2.append(i);
            str2 = sb2.toString();
        }
        if (m17643a(parse)) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str2);
            sb3.append("&enter_live_source=top_message&enter_from_v3=live_detail&enter_from_module=top_message&top_message_type=gift");
            str2 = sb3.toString();
            ((C3495l) C3596c.m13172a(C3495l.class)).setCrossRoomGift(new C3482a(str2, user, j));
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append(str2);
        sb4.append("&back_room=false");
        String sb5 = sb4.toString();
        if (!C9178j.m27302j().mo22380i().handle(this.context, sb5)) {
            m17641a(sb5);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo13901a(String str, User user, long j, int i, C8544cf cfVar, View view) {
        m17642a(str, user, j, i);
        m17640a(cfVar, "click");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo13903b(String str, User user, long j, int i, C8544cf cfVar, View view) {
        m17642a(str, user, j, i);
        m17640a(cfVar, "click");
    }
}
