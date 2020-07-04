package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.RelativeLayout.LayoutParams;
import com.bytedance.android.livesdk.chatroom.p212e.C4340a;
import com.bytedance.android.livesdk.chatroom.p212e.C4343b;
import com.bytedance.android.livesdk.chatroom.p212e.C4372y;
import com.bytedance.android.livesdk.config.C5864b;
import com.bytedance.android.livesdk.message.model.C8529bs;
import com.bytedance.android.livesdk.message.model.C8538c;
import com.bytedance.android.livesdk.widget.C9224a;
import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.message.C9499a;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.p280ss.ugc.live.sdk.message.data.IMessage;
import com.p280ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.p280ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayDeque;
import java.util.Queue;

public class ActionMessageWidget extends LiveWidget implements OnMessageListener {

    /* renamed from: a */
    public Room f15671a;

    /* renamed from: b */
    public boolean f15672b;

    /* renamed from: c */
    private long f15673c;

    /* renamed from: d */
    private Queue<C4343b> f15674d;

    /* renamed from: e */
    private AnimatorSet f15675e;

    /* renamed from: f */
    private ViewGroup f15676f;

    /* renamed from: g */
    private IMessageManager f15677g;

    /* renamed from: h */
    private OnClickListener f15678h = new OnClickListener() {
        public final void onClick(View view) {
            if (view.getTag() instanceof C4340a) {
                ((C4340a) view.getTag()).mo12061a(view.getContext(), ActionMessageWidget.this.f15671a);
            }
        }
    };

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.ActionMessageWidget$a */
    class C5377a implements AnimatorListener {

        /* renamed from: b */
        private ViewGroup f15682b;

        /* renamed from: c */
        private View f15683c;

        public final void onAnimationCancel(Animator animator) {
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationStart(Animator animator) {
        }

        public final void onAnimationEnd(Animator animator) {
            if (this.f15682b != null && this.f15683c != null) {
                this.f15682b.removeView(this.f15683c);
                this.f15683c = null;
                ActionMessageWidget.this.f15672b = false;
                ActionMessageWidget.this.mo13666a();
            }
        }

        C5377a(ViewGroup viewGroup, View view) {
            this.f15682b = viewGroup;
            this.f15683c = view;
        }
    }

    public int getLayoutId() {
        return R.layout.avt;
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f15677g != null) {
            this.f15677g.removeMessageListener(this);
        }
        m17116b();
    }

    /* renamed from: b */
    private void m17116b() {
        if (!this.f15674d.isEmpty()) {
            this.f15674d.clear();
        }
        if (this.f15675e != null && this.f15675e.isRunning()) {
            this.f15675e.removeAllListeners();
            this.f15675e.cancel();
            this.f15675e = null;
        }
    }

    public void onCreate() {
        super.onCreate();
        this.f15673c = ((Long) this.dataCenter.get("data_room_id")).longValue();
        this.f15671a = (Room) this.dataCenter.get("data_room");
        this.f15674d = new ArrayDeque();
        this.f15676f = (ViewGroup) this.contentView.getParent();
        this.f15677g = (IMessageManager) this.dataCenter.get("data_message_manager");
        if (this.f15677g != null) {
            this.f15677g.addMessageListener(MessageType.PROMOTION_CARD_MESSAGE.getIntType(), this);
            this.f15677g.addMessageListener(MessageType.LUCKY_BOX.getIntType(), this);
            this.f15677g.addMessageListener(MessageType.ROOM_PUSH.getIntType(), this);
        }
    }

    /* renamed from: a */
    public final void mo13666a() {
        while (!this.f15674d.isEmpty() && !this.f15672b) {
            C4343b bVar = (C4343b) this.f15674d.poll();
            if (bVar instanceof C4340a) {
                C4340a aVar = (C4340a) bVar;
                C9224a aVar2 = new C9224a(this.context);
                aVar2.setY((float) this.f15676f.getHeight());
                aVar2.setAbsActionMessage(aVar);
                if (aVar.mo12064d()) {
                    aVar2.setTag(aVar);
                    aVar2.setOnClickListener(this.f15678h);
                } else {
                    aVar2.setOnClickListener(null);
                }
                if (aVar2.f25313a) {
                    this.f15672b = true;
                    this.f15676f.addView(aVar2);
                    LayoutParams layoutParams = (LayoutParams) aVar2.getLayoutParams();
                    layoutParams.addRule(14);
                    aVar2.setLayoutParams(layoutParams);
                    this.f15675e = m17113a(aVar2, new C5377a(this.f15676f, aVar2));
                    this.f15675e.start();
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    private void m17114a(C4343b bVar) {
        if (bVar != null) {
            this.f15674d.add(bVar);
            mo13666a();
        }
    }

    public void onMessage(IMessage iMessage) {
        C8538c cVar = (C8538c) iMessage;
        if (!m17115a((C9499a) cVar)) {
            C4343b a = C4372y.m14744a(cVar);
            if (a != null) {
                m17114a(a);
            }
        }
    }

    /* renamed from: a */
    private boolean m17115a(C9499a aVar) {
        boolean z = true;
        if (aVar == null || !aVar.isCurrentRoom(this.f15673c) || !aVar.canText()) {
            return true;
        }
        switch (aVar.getMessageType()) {
            case PROMOTION_CARD_MESSAGE:
                String str = ((C8529bs) aVar).f23446a;
                char c = 65535;
                int hashCode = str.hashCode();
                if (hashCode != -984622807) {
                    if (hashCode == -407856239 && str.equals("enter_by_card")) {
                        c = 1;
                    }
                } else if (str.equals("buy_card")) {
                    c = 0;
                }
                switch (c) {
                    case 0:
                    case 1:
                        z = ((Boolean) C5864b.f17270Y.mo10240a()).booleanValue();
                        break;
                }
            case LUCKY_BOX:
                if (this.f15671a.isOfficial()) {
                    return true;
                }
                break;
        }
        z = false;
        return z;
    }

    /* renamed from: a */
    private AnimatorSet m17113a(View view, AnimatorListener animatorListener) {
        float y = view.getY();
        float dimension = this.context.getResources().getDimension(R.dimen.rk) + this.context.getResources().getDimension(R.dimen.rl);
        ObjectAnimator duration = ObjectAnimator.ofFloat(view, "alpha", new float[]{0.0f, 1.0f}).setDuration(300);
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(view, "translationY", new float[]{y, y - dimension}).setDuration(500);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{duration, duration2});
        ObjectAnimator duration3 = ObjectAnimator.ofFloat(view, "alpha", new float[]{1.0f, 0.0f}).setDuration(300);
        duration3.setStartDelay(3000);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playSequentially(new Animator[]{animatorSet, duration3});
        animatorSet2.addListener(animatorListener);
        return animatorSet2;
    }
}
