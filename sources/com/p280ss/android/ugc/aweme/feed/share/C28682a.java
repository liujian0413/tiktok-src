package com.p280ss.android.ugc.aweme.feed.share;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.C1642a;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.feed.event.C28314aj;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.p313im.service.IIMService;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMContact;
import com.p280ss.android.ugc.aweme.p313im.service.model.ShareCompleteEvent;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Arrays;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.feed.share.a */
public final class C28682a {

    /* renamed from: a */
    public static final C28682a f75549a = new C28682a();

    /* renamed from: com.ss.android.ugc.aweme.feed.share.a$a */
    static final class C28683a implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ View f75550a;

        C28683a(View view) {
            this.f75550a = view;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            LayoutParams layoutParams = this.f75550a.getLayoutParams();
            C7573i.m23582a((Object) valueAnimator, "animation");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                layoutParams.height = (int) ((Float) animatedValue).floatValue();
                this.f75550a.requestLayout();
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.share.a$b */
    public static final class C28684b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f75551a;

        /* renamed from: b */
        final /* synthetic */ SparseArray f75552b;

        public final void onAnimationEnd(Animator animator) {
            C7573i.m23587b(animator, "animation");
            super.onAnimationEnd(animator);
            C28682a.m94359a(this.f75551a, this.f75552b);
        }

        C28684b(ViewGroup viewGroup, SparseArray sparseArray) {
            this.f75551a = viewGroup;
            this.f75552b = sparseArray;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.share.a$c */
    static final class C28685c implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ View f75553a;

        C28685c(View view) {
            this.f75553a = view;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            LayoutParams layoutParams = this.f75553a.getLayoutParams();
            C7573i.m23582a((Object) valueAnimator, "animation");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                layoutParams.height = (int) ((Float) animatedValue).floatValue();
                this.f75553a.requestLayout();
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.share.a$d */
    static final class C28686d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ View f75554a;

        /* renamed from: b */
        final /* synthetic */ ShareCompleteEvent f75555b;

        /* renamed from: c */
        final /* synthetic */ ViewGroup f75556c;

        /* renamed from: d */
        final /* synthetic */ SparseArray f75557d;

        C28686d(View view, ShareCompleteEvent shareCompleteEvent, ViewGroup viewGroup, SparseArray sparseArray) {
            this.f75554a = view;
            this.f75555b = shareCompleteEvent;
            this.f75556c = viewGroup;
            this.f75557d = sparseArray;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            IIMService iIMService = (IIMService) ServiceManager.get().getService(IIMService.class);
            if (iIMService != null) {
                iIMService.startChat(this.f75554a.getContext(), this.f75555b.contact);
            }
            C28682a.m94359a(this.f75556c, this.f75557d);
        }
    }

    private C28682a() {
    }

    /* renamed from: a */
    public static void m94359a(ViewGroup viewGroup, SparseArray<Integer> sparseArray) {
        C7573i.m23587b(viewGroup, "viewGroup");
        C7573i.m23587b(sparseArray, "viewStaus");
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            C7573i.m23582a((Object) childAt, "view");
            Object obj = sparseArray.get(childAt.getId());
            C7573i.m23582a(obj, "viewStaus.get(view.id)");
            childAt.setVisibility(((Number) obj).intValue());
        }
        C42961az.m136380a(new C28314aj());
    }

    /* renamed from: a */
    public static void m94358a(View view, ViewGroup viewGroup, SparseArray<Integer> sparseArray) {
        C7573i.m23587b(view, "shareTipsRl");
        C7573i.m23587b(viewGroup, "mBottomView");
        C7573i.m23587b(sparseArray, "viewStaus");
        if (view.getVisibility() != 8) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{(float) view.getHeight(), 0.0f});
            ofFloat.addUpdateListener(new C28683a(view));
            ofFloat.addListener(new C28684b(viewGroup, sparseArray));
            C7573i.m23582a((Object) ofFloat, "animator");
            ofFloat.setDuration(300);
            ofFloat.start();
        }
    }

    /* renamed from: a */
    public static void m94360a(ShareCompleteEvent shareCompleteEvent, View view, DmtTextView dmtTextView, ViewGroup viewGroup, SparseArray<Integer> sparseArray) {
        String str;
        C7573i.m23587b(shareCompleteEvent, "shareCompleteEvent");
        C7573i.m23587b(view, "shareTipsRl");
        C7573i.m23587b(dmtTextView, "shareTipsTv");
        C7573i.m23587b(viewGroup, "mBottomView");
        C7573i.m23587b(sparseArray, "viewStaus");
        if (TextUtils.equals("aweme", shareCompleteEvent.itemType)) {
            ((IIMService) ServiceManager.get().getService(IIMService.class)).cacheRecentShareContact(shareCompleteEvent.contact);
        }
        float b = C9738o.m28708b(C6399b.m19921a(), 32.0f);
        view.getLayoutParams().height = 0;
        view.requestLayout();
        view.setVisibility(0);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, b});
        ofFloat.addUpdateListener(new C28685c(view));
        C7573i.m23582a((Object) ofFloat, "animator");
        ofFloat.setDuration(300);
        ofFloat.start();
        if (shareCompleteEvent.isMulti) {
            Context context = view.getContext();
            C7573i.m23582a((Object) context, "shareTipsRl.context");
            str = context.getResources().getString(R.string.bdn);
            C7573i.m23582a((Object) str, "shareTipsRl.context.reso…tring.have_sent_to_users)");
        } else {
            Context context2 = view.getContext();
            C7573i.m23582a((Object) context2, "shareTipsRl.context");
            str = context2.getResources().getString(R.string.bdm);
            C7573i.m23582a((Object) str, "shareTipsRl.context.reso…string.have_sent_to_user)");
        }
        IMContact iMContact = shareCompleteEvent.contact;
        C7573i.m23582a((Object) iMContact, "shareCompleteEvent.contact");
        String a = C1642a.m8034a(str, Arrays.copyOf(new Object[]{iMContact.getDisplayName()}, 1));
        C7573i.m23582a((Object) a, "java.lang.String.format(format, *args)");
        dmtTextView.setText(a);
        view.setOnClickListener(new C28686d(view, shareCompleteEvent, viewGroup, sparseArray));
    }
}
