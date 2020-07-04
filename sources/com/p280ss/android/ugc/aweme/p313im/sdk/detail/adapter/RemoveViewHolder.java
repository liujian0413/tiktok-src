package com.p280ss.android.ugc.aweme.p313im.sdk.detail.adapter;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.p313im.sdk.BaseViewHolder;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.group.model.C30753a;
import com.p280ss.android.ugc.aweme.p313im.sdk.detail.model.C31190b;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31878ax.C31882a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.adapter.RemoveViewHolder */
public final class RemoveViewHolder extends BaseViewHolder<C30753a> {

    /* renamed from: b */
    private ImageView f81815b;

    /* renamed from: c */
    private C31882a f81816c;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.adapter.RemoveViewHolder$a */
    static final class C31187a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C30753a f81817a;

        C31187a(C30753a aVar) {
            this.f81817a = aVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C31188a.m101657a(5, ((C31190b) this.f81817a).f81819a, 221);
        }
    }

    /* renamed from: b */
    public final void mo80310b() {
        super.mo80310b();
        View findViewById = this.itemView.findViewById(R.id.ba8);
        C7573i.m23582a((Object) findViewById, "itemView.findViewById(R.id.iv_member_action)");
        this.f81815b = (ImageView) findViewById;
        ImageView imageView = this.f81815b;
        if (imageView == null) {
            C7573i.m23583a("mRemoveMemberView");
        }
        imageView.setImageResource(R.drawable.a_4);
    }

    /* renamed from: c */
    public final void mo80311c() {
        C31882a n = C31882a.m103579n();
        C7573i.m23582a((Object) n, "TouchAnimationUtils.AlphaAnimTouchHandle.obtain()");
        this.f81816c = n;
        C31882a aVar = this.f81816c;
        if (aVar == null) {
            C7573i.m23583a("mAlphaAnimTouchHandle");
        }
        View[] viewArr = new View[1];
        ImageView imageView = this.f81815b;
        if (imageView == null) {
            C7573i.m23583a("mRemoveMemberView");
        }
        viewArr[0] = imageView;
        aVar.mo82725a(viewArr);
    }

    public RemoveViewHolder(ViewGroup viewGroup, int i) {
        C7573i.m23587b(viewGroup, "parent");
        super(viewGroup, (int) R.layout.wn);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo80309a(C30753a aVar, int i) {
        boolean z;
        super.mo80309a(aVar, i);
        if (aVar instanceof C31190b) {
            CharSequence charSequence = ((C31190b) aVar).f81819a;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                ImageView imageView = this.f81815b;
                if (imageView == null) {
                    C7573i.m23583a("mRemoveMemberView");
                }
                imageView.setOnClickListener(new C31187a(aVar));
            }
        }
    }
}
