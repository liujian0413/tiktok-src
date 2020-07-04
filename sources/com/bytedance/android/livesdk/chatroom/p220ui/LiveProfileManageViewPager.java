package com.bytedance.android.livesdk.chatroom.p220ui;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.support.p022v4.view.PagerAdapter;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.uikit.viewpager.AbsPagerAdapter;
import com.bytedance.android.live.uikit.viewpager.SSViewPager;
import com.bytedance.android.livesdk.chatroom.p220ui.C5247cn.C5249b;
import com.bytedance.android.livesdk.p424u.C8962c;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.LiveProfileManageViewPager */
public final class LiveProfileManageViewPager extends SSViewPager {

    /* renamed from: a */
    public static final C5130a f14977a = new C5130a(null);

    /* renamed from: b */
    private boolean f14978b;

    /* renamed from: c */
    private ProfileManageViewAdapter f14979c;

    /* renamed from: d */
    private boolean f14980d;

    /* renamed from: e */
    private ValueAnimator f14981e;

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.LiveProfileManageViewPager$ProfileManageViewAdapter */
    public static final class ProfileManageViewAdapter extends AbsPagerAdapter {

        /* renamed from: a */
        public LiveProfileSettingView f14982a;

        /* renamed from: e */
        public C8962c f14983e;

        /* renamed from: f */
        public final Context f14984f;

        /* renamed from: g */
        public final LayoutInflater f14985g;

        /* renamed from: h */
        public final C5249b f14986h;

        /* renamed from: i */
        public final Room f14987i;

        /* renamed from: j */
        public final User f14988j;

        /* renamed from: k */
        public final boolean f14989k;

        /* renamed from: l */
        public final boolean f14990l;

        public final int getCount() {
            return 2;
        }

        /* renamed from: a */
        public final void mo13343a(int i) {
            this.f14983e.mo22134a(i);
        }

        /* renamed from: a */
        public final void mo13344a(boolean z) {
            this.f14982a.mo13355b(z);
        }

        /* renamed from: a */
        public final View mo9423a(int i, View view, ViewGroup viewGroup) {
            View view2;
            if (i == 0) {
                view2 = this.f14982a;
            } else {
                view2 = this.f14983e;
            }
            return view2;
        }

        public ProfileManageViewAdapter(Context context, LayoutInflater layoutInflater, C5249b bVar, Room room, User user, boolean z, boolean z2) {
            Long l;
            C7573i.m23587b(context, "context");
            C7573i.m23587b(layoutInflater, "layoutInflater");
            C7573i.m23587b(bVar, "manageClickCallback");
            super(context, layoutInflater);
            this.f14984f = context;
            this.f14985g = layoutInflater;
            this.f14986h = bVar;
            this.f14987i = room;
            this.f14988j = user;
            this.f14989k = z;
            this.f14990l = z2;
            LiveProfileSettingView liveProfileSettingView = new LiveProfileSettingView(this.f14984f, this.f14987i, this.f14988j, this.f14989k, this.f14990l);
            this.f14982a = liveProfileSettingView;
            Context context2 = this.f14984f;
            Room room2 = this.f14987i;
            Long l2 = null;
            if (room2 != null) {
                l = Long.valueOf(room2.getId());
            } else {
                l = null;
            }
            Room room3 = this.f14987i;
            if (room3 != null) {
                User owner = room3.getOwner();
                if (owner != null) {
                    l2 = Long.valueOf(owner.getId());
                }
            }
            this.f14983e = new C8962c(context2, l, l2);
            this.f14982a.setClickCallback(this.f14986h);
            this.f14983e.setClickCallback(this.f14986h);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.LiveProfileManageViewPager$a */
    public static final class C5130a {
        private C5130a() {
        }

        public /* synthetic */ C5130a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.LiveProfileManageViewPager$b */
    static final class C5131b implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ LiveProfileManageViewPager f14991a;

        /* renamed from: b */
        final /* synthetic */ LayoutParams f14992b;

        C5131b(LiveProfileManageViewPager liveProfileManageViewPager, LayoutParams layoutParams) {
            this.f14991a = liveProfileManageViewPager;
            this.f14992b = layoutParams;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C7573i.m23587b(valueAnimator, "animation");
            LayoutParams layoutParams = this.f14992b;
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                layoutParams.height = ((Integer) animatedValue).intValue();
                this.f14991a.setLayoutParams(this.f14992b);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
        }
    }

    public LiveProfileManageViewPager(Context context) {
        this(context, null, 2, null);
    }

    public final ValueAnimator getHeightAnimator() {
        return this.f14981e;
    }

    public final ProfileManageViewAdapter getMAdapter() {
        return this.f14979c;
    }

    /* renamed from: a */
    public final void mo13336a() {
        ProfileManageViewAdapter profileManageViewAdapter = this.f14979c;
        if (profileManageViewAdapter != null) {
            setCurrentItem(0, true);
            m16620a((View) profileManageViewAdapter.f14982a);
        }
    }

    /* renamed from: b */
    public final void mo13338b() {
        ProfileManageViewAdapter profileManageViewAdapter = this.f14979c;
        if (profileManageViewAdapter != null) {
            profileManageViewAdapter.f14982a.measure(MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), MeasureSpec.makeMeasureSpec(0, 0));
            int measuredHeight = profileManageViewAdapter.f14982a.getMeasuredHeight();
            LayoutParams layoutParams = getLayoutParams();
            layoutParams.height = measuredHeight;
            setLayoutParams(layoutParams);
        }
    }

    public final void setHeightAnimator(ValueAnimator valueAnimator) {
        this.f14981e = valueAnimator;
    }

    public final void setMAdapter(ProfileManageViewAdapter profileManageViewAdapter) {
        this.f14979c = profileManageViewAdapter;
    }

    public final boolean canScrollHorizontally(int i) {
        if (this.f14978b) {
            return super.canScrollHorizontally(i);
        }
        return this.f14978b;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f14978b) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return this.f14978b;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f14978b) {
            return super.onTouchEvent(motionEvent);
        }
        return this.f14978b;
    }

    public final void setAdapter(PagerAdapter pagerAdapter) {
        super.setAdapter(pagerAdapter);
        if (pagerAdapter != null && (pagerAdapter instanceof ProfileManageViewAdapter)) {
            this.f14979c = (ProfileManageViewAdapter) pagerAdapter;
        }
    }

    /* renamed from: a */
    public final void mo13337a(int i) {
        ProfileManageViewAdapter profileManageViewAdapter = this.f14979c;
        if (profileManageViewAdapter != null) {
            profileManageViewAdapter.mo13343a(i);
            setCurrentItem(1, true);
            m16620a((View) profileManageViewAdapter.f14983e);
        }
    }

    /* renamed from: a */
    private final void m16620a(View view) {
        if (view != null) {
            this.f14980d = false;
            view.measure(MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), MeasureSpec.makeMeasureSpec(0, 0));
            int measuredHeight = view.getMeasuredHeight();
            LayoutParams layoutParams = getLayoutParams();
            int measuredHeight2 = getMeasuredHeight();
            ValueAnimator valueAnimator = this.f14981e;
            if (valueAnimator != null) {
                valueAnimator.removeAllUpdateListeners();
                valueAnimator.removeAllListeners();
                valueAnimator.cancel();
            }
            this.f14981e = ValueAnimator.ofInt(new int[]{measuredHeight2, measuredHeight});
            ValueAnimator valueAnimator2 = this.f14981e;
            if (valueAnimator2 != null) {
                valueAnimator2.addUpdateListener(new C5131b(this, layoutParams));
                valueAnimator2.setDuration(300).start();
            }
        }
    }

    public LiveProfileManageViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f14980d = true;
    }

    public final void onMeasure(int i, int i2) {
        if (this.f14980d) {
            int childCount = getChildCount();
            int i3 = 9999;
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                childAt.measure(i, MeasureSpec.makeMeasureSpec(0, 0));
                if (childAt != null && (childAt instanceof LiveProfileSettingView)) {
                    i3 = ((LiveProfileSettingView) childAt).getMeasuredHeight();
                }
            }
            i2 = MeasureSpec.makeMeasureSpec(i3, 1073741824);
        }
        super.onMeasure(i, i2);
    }

    public /* synthetic */ LiveProfileManageViewPager(Context context, AttributeSet attributeSet, int i, C7571f fVar) {
        if ((i & 2) != 0) {
            attributeSet = null;
        }
        this(context, attributeSet);
    }

    public final boolean canScroll(View view, boolean z, int i, int i2, int i3) {
        if (this.f14978b) {
            return super.canScroll(view, z, i, i2, i3);
        }
        return this.f14978b;
    }
}
