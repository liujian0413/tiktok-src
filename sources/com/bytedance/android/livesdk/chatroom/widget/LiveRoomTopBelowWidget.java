package com.bytedance.android.livesdk.chatroom.widget;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.os.Message;
import android.support.p022v4.view.animation.C0957c;
import android.support.p029v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.livesdk.chatroom.view.C5374d;
import com.bytedance.android.livesdk.chatroom.view.MaxWidthSupportRecyclerView;
import com.bytedance.android.livesdk.chatroom.widget.LiveRoomWatchUserWidget.C5774a;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;
import com.zhiliaoapp.musically.df_live_zego_link.R;

public class LiveRoomTopBelowWidget extends LiveRecyclableWidget implements C6310a {

    /* renamed from: a */
    public boolean f16916a = true;

    /* renamed from: b */
    public boolean f16917b;

    /* renamed from: c */
    public C6309f f16918c = new C6309f(this);

    /* renamed from: d */
    private ViewGroup f16919d;

    /* renamed from: e */
    private MaxWidthSupportRecyclerView f16920e;

    /* renamed from: f */
    private ViewGroup f16921f;

    /* renamed from: g */
    private FrameLayout f16922g;

    /* renamed from: h */
    private LiveRoomWatchUserWidget f16923h;

    /* renamed from: i */
    private LiveRoomTopContainerWidget f16924i;

    /* renamed from: j */
    private Animator f16925j;

    /* renamed from: k */
    private Animator f16926k;

    public int getLayoutId() {
        return R.layout.aui;
    }

    public void handleMsg(Message message) {
    }

    public void onPause() {
        super.onPause();
    }

    public void onResume() {
        super.onResume();
    }

    public void onUnload() {
        if (this.f16926k != null) {
            this.f16926k.cancel();
        }
        if (this.f16925j != null) {
            this.f16925j.cancel();
        }
        if (this.f16926k != null) {
            this.f16926k.cancel();
        }
        if (this.f16925j != null) {
            this.f16925j.cancel();
        }
        if (this.f16918c != null) {
            this.f16918c.removeCallbacksAndMessages(null);
        }
        this.f16916a = false;
        this.f16917b = false;
        if (this.f16920e != null) {
            this.f16920e.setEnable(false);
        }
    }

    /* renamed from: d */
    private boolean m18149d() {
        if (this.f16916a || getContext() == null || this.contentView == null) {
            return false;
        }
        RecyclerView recyclerView = (RecyclerView) this.contentView.findViewById(R.id.efx);
        if (recyclerView instanceof MaxWidthSupportRecyclerView) {
            this.f16920e = (MaxWidthSupportRecyclerView) recyclerView;
        }
        this.f16921f = (ViewGroup) this.f16919d.findViewById(R.id.eh5);
        if (this.f16920e == null || this.f16920e.getChildCount() == 0) {
            return false;
        }
        this.f16916a = true;
        if (this.f16920e.getChildCount() > 3 && ((Integer) LiveSettingKeys.LIVE_OPTIMIZE_STYLE_V1.mo10240a()).intValue() <= 1) {
            return true;
        }
        C9738o.m28701a((View) this.f16921f, -2, -3);
        mo14227b();
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void mo14228c() {
        float f;
        if (this.f16920e != null && this.f16921f != null && this.f16922g != null) {
            MaxWidthSupportRecyclerView maxWidthSupportRecyclerView = this.f16920e;
            final ViewGroup viewGroup = this.f16921f;
            int width = this.f16922g.getWidth();
            int a = C9738o.m28691a(getContext());
            int b = (int) C9738o.m28708b(getContext(), 14.0f);
            int b2 = (int) C9738o.m28708b(getContext(), 19.0f);
            int width2 = this.f16922g.getWidth() - maxWidthSupportRecyclerView.getWidth();
            C9738o.m28701a((View) this.f16922g, -2, -3);
            if (a - width <= b + b2 + 1) {
                C9738o.m28701a((View) this.f16922g, (a - b) - b2, -3);
                C9738o.m28701a((View) viewGroup, b, -3);
            } else {
                C9738o.m28701a((View) viewGroup, viewGroup.getWidth(), -3);
            }
            FrameLayout frameLayout = this.f16922g;
            int width3 = this.f16922g.getWidth();
            if (((Integer) LiveSettingKeys.LIVE_OPTIMIZE_STYLE_V1.mo10240a()).intValue() > 1) {
                f = 4.5f;
            } else {
                f = 3.0f;
            }
            this.f16925j = m18147a(frameLayout, width3, m18146a(maxWidthSupportRecyclerView, f) + width2, new AnimatorListenerAdapter() {
                public final void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    LiveRoomTopBelowWidget.this.mo14227b();
                }

                public final void onAnimationStart(Animator animator) {
                    super.onAnimationStart(animator);
                    C9738o.m28712b(LiveRoomTopBelowWidget.this.contentView, 0);
                }
            });
            this.f16925j.start();
            int width4 = viewGroup.getWidth();
            int a2 = m18146a(viewGroup, 2.14748365E9f);
            if (width4 < a2) {
                this.f16926k = m18147a(viewGroup, width4, a2, new AnimatorListenerAdapter() {
                    public final void onAnimationEnd(Animator animator) {
                        super.onAnimationEnd(animator);
                        C9738o.m28701a((View) viewGroup, -2, -3);
                    }
                });
                this.f16926k.start();
            }
        }
    }

    /* renamed from: a */
    public final void mo14225a() {
        this.f16917b = true;
        C9738o.m28712b(this.contentView, 0);
        if (m18149d()) {
            this.f16918c.postDelayed(new C5809h(this), 3000);
        }
    }

    /* renamed from: b */
    public final void mo14227b() {
        int i;
        int i2;
        if (this.f16922g != null && this.f16920e != null) {
            int width = this.f16922g.getWidth() - this.f16920e.getWidth();
            int a = m18146a(this.f16920e, 1.0f);
            if (this.context != null) {
                int b = (int) C9738o.m28708b(this.context, 28.0f);
                if (a < b) {
                    a = b;
                }
            }
            if (width > 0) {
                i = 1;
            } else {
                i = 3;
            }
            int i3 = i * a;
            if (((Integer) LiveSettingKeys.LIVE_OPTIMIZE_STYLE_V1.mo10240a()).intValue() > 1) {
                i2 = (int) (((float) a) * 4.5f);
            } else {
                i2 = a * 3;
            }
            int i4 = i2 + width + i3;
            if (this.f16920e != null) {
                this.f16920e.setEnable(true);
                if (((Integer) LiveSettingKeys.LIVE_OPTIMIZE_STYLE_V1.mo10240a()).intValue() > 1) {
                    this.f16920e.setMaxItem(4.5f);
                }
                this.f16920e.requestLayout();
            }
            C9738o.m28701a((View) this.f16922g, i4, -3);
            this.f16917b = false;
            this.dataCenter.lambda$put$1$DataCenter("cmd_vote_start_animation", Integer.valueOf((int) this.containerView.getY()));
        }
    }

    /* renamed from: a */
    public final void mo14226a(long j) {
        if (this.f16923h != null) {
            this.f16923h.mo14254a(j);
        }
    }

    public void onInit(Object... objArr) {
        this.f16919d = (ViewGroup) this.contentView.findViewById(R.id.blg);
        this.f16922g = (FrameLayout) this.contentView.findViewById(R.id.eft);
    }

    public void onLoad(Object... objArr) {
        enableSubWidgetManager();
        C9738o.m28701a((View) this.f16922g, -2, -3);
        this.f16923h = (LiveRoomWatchUserWidget) ((RecyclableWidgetManager) this.subWidgetManager).load((ViewGroup) this.f16922g, LiveRoomWatchUserWidget.class, false, (Object[]) null);
        this.f16924i = (LiveRoomTopContainerWidget) ((RecyclableWidgetManager) this.subWidgetManager).load(this.f16919d, LiveRoomTopContainerWidget.class, false, (Object[]) null);
        if (!(this.f16924i == null || this.containerView == null)) {
            this.f16924i.mo14235a((ViewGroup) this.containerView.getParent());
        }
        this.f16916a = false;
        this.f16917b = false;
        if (this.f16920e != null) {
            this.f16920e.setEnable(false);
        }
        C9738o.m28712b(this.contentView, 4);
        this.f16923h.f16998b = new C5774a() {
            /* renamed from: a */
            public final boolean mo14230a() {
                return LiveRoomTopBelowWidget.this.f16917b;
            }

            /* renamed from: a */
            public final void mo14229a(int i) {
                if (!LiveRoomTopBelowWidget.this.f16916a) {
                    LiveRoomTopBelowWidget.this.f16918c.postDelayed(new Runnable() {
                        public final void run() {
                            LiveRoomTopBelowWidget.this.mo14225a();
                        }
                    }, 400);
                }
            }
        };
        if (((Integer) LiveSettingKeys.LIVE_OPTIMIZE_STYLE_V1.mo10240a()).intValue() > 1) {
            C9738o.m28702a((View) this.containerView, -3, (int) C9738o.m28708b(C3358ac.m12528e(), -8.0f), -3, -3);
        }
    }

    /* renamed from: a */
    private static int m18146a(ViewGroup viewGroup, float f) {
        int i;
        int i2;
        int i3;
        int i4 = (int) f;
        float f2 = f % ((float) i4);
        if (viewGroup == null) {
            return 0;
        }
        int childCount = viewGroup.getChildCount();
        if (childCount > i4) {
            i = i4;
        } else {
            i = childCount;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < i; i6++) {
            View childAt = viewGroup.getChildAt(i6);
            if (childAt != null) {
                if (childAt instanceof C5374d) {
                    i3 = ((C5374d) childAt).getLayoutWidth();
                } else {
                    i3 = childAt.getWidth();
                }
                i5 += i3;
                LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof MarginLayoutParams) {
                    MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                    i5 += marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                }
            }
        }
        if (childCount <= i4 || f2 <= 0.0f) {
            return i5;
        }
        View childAt2 = viewGroup.getChildAt(i4);
        if (childAt2 instanceof C5374d) {
            i2 = ((C5374d) childAt2).getLayoutWidth();
        } else {
            i2 = childAt2.getWidth();
        }
        LayoutParams layoutParams2 = childAt2.getLayoutParams();
        int i7 = i5 + (i2 / 2);
        if (!(layoutParams2 instanceof MarginLayoutParams)) {
            return i7;
        }
        MarginLayoutParams marginLayoutParams2 = (MarginLayoutParams) layoutParams2;
        return i7 + ((marginLayoutParams2.leftMargin + marginLayoutParams2.rightMargin) / 2);
    }

    /* renamed from: a */
    static final /* synthetic */ void m18148a(LayoutParams layoutParams, ViewGroup viewGroup, ValueAnimator valueAnimator) {
        Object obj;
        if (valueAnimator != null) {
            obj = valueAnimator.getAnimatedValue();
        } else {
            obj = Integer.valueOf(0);
        }
        layoutParams.width = ((Integer) obj).intValue();
        viewGroup.setLayoutParams(layoutParams);
    }

    /* renamed from: a */
    private static Animator m18147a(ViewGroup viewGroup, int i, int i2, AnimatorListener animatorListener) {
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{i, i2});
        ofInt.addUpdateListener(new C5810i(viewGroup.getLayoutParams(), viewGroup));
        ofInt.addListener(animatorListener);
        ofInt.setDuration(520);
        ofInt.setInterpolator(C0957c.m4073a(0.0f, 0.0f, 0.0f, 1.0f));
        return ofInt;
    }
}
