package com.p280ss.android.ugc.aweme.p313im.sdk.detail.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.bubbleview.C10751a;
import com.bytedance.ies.dmt.p262ui.bubbleview.C10751a.C10752a;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.p313im.sdk.BaseViewHolder;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.group.model.C30753a;
import com.p280ss.android.ugc.aweme.p313im.sdk.detail.model.C31189a;
import com.p280ss.android.ugc.aweme.p313im.sdk.group.GroupMemberFansFragment.C31227a;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31858ad;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31878ax.C31882a;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7076p;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.adapter.AddViewHolder */
public final class AddViewHolder extends BaseViewHolder<C30753a> {

    /* renamed from: b */
    public final String f81797b;

    /* renamed from: c */
    private ImageView f81798c;

    /* renamed from: d */
    private C31882a f81799d;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.adapter.AddViewHolder$a */
    static final class C31182a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C30753a f81800a;

        C31182a(C30753a aVar) {
            this.f81800a = aVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C31188a.m101657a(4, ((C31189a) this.f81800a).f81818a, 220);
            C31858ad.m103406a();
            C31858ad.m103478g(((C31189a) this.f81800a).f81818a, "group_add_click");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.adapter.AddViewHolder$b */
    static final class C31183b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AddViewHolder f81801a;

        C31183b(AddViewHolder addViewHolder) {
            this.f81801a = addViewHolder;
        }

        public final void run() {
            this.f81801a.mo81659e();
        }
    }

    /* renamed from: b */
    public final void mo80310b() {
        super.mo80310b();
        View findViewById = this.itemView.findViewById(R.id.ba8);
        C7573i.m23582a((Object) findViewById, "itemView.findViewById(R.id.iv_member_action)");
        this.f81798c = (ImageView) findViewById;
        ImageView imageView = this.f81798c;
        if (imageView == null) {
            C7573i.m23583a("mAddMemberView");
        }
        imageView.setImageResource(R.drawable.a9j);
        ImageView imageView2 = this.f81798c;
        if (imageView2 == null) {
            C7573i.m23583a("mAddMemberView");
        }
        imageView2.postDelayed(new C31183b(this), 500);
    }

    /* renamed from: c */
    public final void mo80311c() {
        C31882a n = C31882a.m103579n();
        C7573i.m23582a((Object) n, "TouchAnimationUtils.AlphaAnimTouchHandle.obtain()");
        this.f81799d = n;
        C31882a aVar = this.f81799d;
        if (aVar == null) {
            C7573i.m23583a("mAlphaAnimTouchHandle");
        }
        View[] viewArr = new View[1];
        ImageView imageView = this.f81798c;
        if (imageView == null) {
            C7573i.m23583a("mAddMemberView");
        }
        viewArr[0] = imageView;
        aVar.mo82725a(viewArr);
    }

    /* renamed from: e */
    public final void mo81659e() {
        int measuredWidth;
        int measuredWidth2;
        if (C7076p.m22077a().mo18287C() && C31227a.m101766a(this.f81797b)) {
            View view = this.itemView;
            C7573i.m23582a((Object) view, "itemView");
            Context context = view.getContext();
            if (context != null) {
                C10751a a = new C10752a((Activity) context).mo25738b((int) R.string.a1k).mo25739b(true).mo25731a(4000).mo25737a();
                a.mo25716a();
                int[] iArr = new int[2];
                ImageView imageView = this.f81798c;
                if (imageView == null) {
                    C7573i.m23583a("mAddMemberView");
                }
                imageView.getLocationOnScreen(iArr);
                int e = a.mo25726e();
                int i = iArr[1];
                ImageView imageView2 = this.f81798c;
                if (imageView2 == null) {
                    C7573i.m23583a("mAddMemberView");
                }
                int measuredHeight = i + imageView2.getMeasuredHeight();
                int i2 = iArr[0];
                ImageView imageView3 = this.f81798c;
                if (imageView3 == null) {
                    C7573i.m23583a("mAddMemberView");
                }
                if (i2 + imageView3.getMeasuredWidth() <= e) {
                    measuredWidth = iArr[0];
                    ImageView imageView4 = this.f81798c;
                    if (imageView4 == null) {
                        C7573i.m23583a("mAddMemberView");
                    }
                    measuredWidth2 = (imageView4.getMeasuredWidth() / 2) + C23486n.m77122a(3.5d);
                } else {
                    int i3 = iArr[0];
                    ImageView imageView5 = this.f81798c;
                    if (imageView5 == null) {
                        C7573i.m23583a("mAddMemberView");
                    }
                    measuredWidth = (i3 + imageView5.getMeasuredWidth()) - e;
                    ImageView imageView6 = this.f81798c;
                    if (imageView6 == null) {
                        C7573i.m23583a("mAddMemberView");
                    }
                    measuredWidth2 = (e - (imageView6.getMeasuredWidth() / 2)) + C23486n.m77122a(3.5d);
                }
                int i4 = measuredWidth;
                ImageView imageView7 = this.f81798c;
                if (imageView7 == null) {
                    C7573i.m23583a("mAddMemberView");
                }
                a.mo25718a(imageView7, 80, i4, measuredHeight, (float) measuredWidth2);
                C7076p.m22077a().mo18288D();
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo80309a(C30753a aVar, int i) {
        boolean z;
        super.mo80309a(aVar, i);
        if (aVar instanceof C31189a) {
            CharSequence charSequence = ((C31189a) aVar).f81818a;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                ImageView imageView = this.f81798c;
                if (imageView == null) {
                    C7573i.m23583a("mAddMemberView");
                }
                imageView.setOnClickListener(new C31182a(aVar));
            }
        }
    }

    public AddViewHolder(ViewGroup viewGroup, int i, String str) {
        C7573i.m23587b(viewGroup, "parent");
        super(viewGroup, (int) R.layout.wn);
        this.f81797b = str;
    }
}
