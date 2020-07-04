package com.p280ss.android.ugc.aweme.commercialize.coupon.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.AvatarImageView;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.commercialize.coupon.C24575a;
import com.p280ss.android.ugc.aweme.commercialize.coupon.model.CouponCodeStatus;
import com.p280ss.android.ugc.aweme.commercialize.coupon.model.CouponInfo;
import com.p280ss.android.ugc.aweme.commercialize.coupon.views.C24605a;
import com.p280ss.android.ugc.aweme.commercialize.coupon.views.CouponDetailActivity;
import com.p280ss.android.ugc.aweme.commercialize.coupon.views.CouponListActivity;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.commercialize.coupon.adapter.CouponListAdapter */
public class CouponListAdapter extends C1262a<C1293v> {

    /* renamed from: b */
    public static int f64837b;

    /* renamed from: a */
    public List<CouponInfo> f64838a = new ArrayList();

    /* renamed from: c */
    public boolean f64839c;

    /* renamed from: d */
    public boolean f64840d;

    /* renamed from: e */
    private List<String> f64841e = new ArrayList();

    /* renamed from: f */
    private WeakReference<Activity> f64842f;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.coupon.adapter.CouponListAdapter$a */
    static class C24588a extends C1293v {

        /* renamed from: a */
        private TextView f64843a;

        /* renamed from: b */
        private Context f64844b;

        /* renamed from: c */
        private TextView f64845c;

        /* renamed from: d */
        private TextView f64846d;

        /* renamed from: e */
        private AvatarImageView f64847e;

        /* renamed from: f */
        private RemoteImageView f64848f;

        /* renamed from: g */
        private WeakReference<Activity> f64849g;

        /* renamed from: h */
        private ImageView f64850h;

        /* renamed from: a */
        public final void mo64383a() {
            C24605a.m80677a(this.itemView);
        }

        /* renamed from: a */
        private void m80634a(View view) {
            this.f64843a = (TextView) view.findViewById(R.id.dkn);
            this.f64845c = (TextView) view.findViewById(R.id.by4);
            this.f64846d = (TextView) view.findViewById(R.id.das);
            this.f64847e = (AvatarImageView) view.findViewById(R.id.j2);
            this.f64848f = (RemoteImageView) view.findViewById(R.id.aub);
            this.f64850h = (ImageView) view.findViewById(R.id.aza);
        }

        C24588a(View view, WeakReference<Activity> weakReference) {
            super(view);
            this.f64844b = view.getContext();
            this.f64849g = weakReference;
            m80634a(view);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo64384a(CouponInfo couponInfo, int i, boolean z) {
            if (couponInfo != null) {
                this.f64845c.setText(couponInfo.getMerchantName());
                this.f64843a.setText(couponInfo.getTitle());
                if (couponInfo.getStatus() != CouponCodeStatus.StatusValid.value) {
                    this.f64846d.setVisibility(0);
                    this.f64846d.setBackground(this.f64844b.getResources().getDrawable(R.drawable.jz));
                    this.f64846d.setText(C24575a.m80615a(this.f64846d.getContext(), couponInfo.getStatus(), false));
                } else if (TextUtils.isEmpty(couponInfo.hintText)) {
                    this.f64846d.setVisibility(8);
                } else {
                    this.f64846d.setVisibility(0);
                    this.f64846d.setBackground(this.f64844b.getResources().getDrawable(R.drawable.jw));
                    this.f64846d.setText(couponInfo.hintText);
                }
                C23323e.m76524b(this.f64847e, couponInfo.getLogoImageUrl());
                C23323e.m76524b(this.f64848f, couponInfo.getHeadImageUrl());
                if (couponInfo.isDefaultHeadImage()) {
                    this.f64850h.setVisibility(8);
                    this.f64845c.setShadowLayer(C9738o.m28708b(this.f64844b, 1.5f), 0.0f, C9738o.m28708b(this.f64844b, 0.5f), this.f64844b.getResources().getColor(R.color.a1v));
                    this.f64843a.setShadowLayer(C9738o.m28708b(this.f64844b, 1.5f), 0.0f, C9738o.m28708b(this.f64844b, 0.5f), this.f64844b.getResources().getColor(R.color.a1v));
                } else {
                    this.f64850h.setVisibility(0);
                    this.f64850h.setImageResource(R.drawable.jv);
                    this.f64850h.setAlpha(1.0f);
                    this.f64845c.setShadowLayer(0.0f, 0.0f, 0.0f, this.f64844b.getResources().getColor(R.color.a1v));
                    this.f64843a.setShadowLayer(0.0f, 0.0f, 0.0f, this.f64844b.getResources().getColor(R.color.a1v));
                }
                this.itemView.setOnClickListener(new C24590a(this, couponInfo, i, z));
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ void mo64385a(CouponInfo couponInfo, int i, boolean z, View view) {
            String str;
            String str2;
            if (this.f64849g.get() != null) {
                CouponDetailActivity.m80646a((Activity) this.f64849g.get(), couponInfo.getCouponId(), couponInfo.getCodeId(), i, CouponListAdapter.f64837b, "card_bag");
            }
            String str3 = "click_coupon";
            C22984d a = C22984d.m75611a();
            String str4 = "enter_from";
            if (z) {
                str = "card_bag";
            } else {
                str = "invalid_card_bag";
            }
            C22984d a2 = a.mo59973a(str4, str);
            String str5 = "previous_page";
            if (z) {
                str2 = "card_bag";
            } else {
                str2 = "invalid_card_bag";
            }
            C6907h.m21524a(str3, (Map) a2.mo59973a(str5, str2).mo59973a("enter_method", "click_card_bag").mo59970a("coupon_id", couponInfo.getCouponId()).mo59973a("coupon_type", C24575a.m80615a(view.getContext(), couponInfo.getStatus(), true)).mo59973a("source_type", C24575a.m80616a(couponInfo)).f60753a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.coupon.adapter.CouponListAdapter$b */
    static class C24589b extends C1293v {

        /* renamed from: a */
        private View f64851a;

        /* renamed from: b */
        private WeakReference<Activity> f64852b;

        /* renamed from: a */
        public final void mo64386a() {
            this.f64851a.setOnClickListener(new C24591b(this));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ void mo64387a(View view) {
            if (this.f64852b.get() != null) {
                C6907h.m21524a("enter_invalid_card_bag", (Map) C22984d.m75611a().mo59973a("enter_from", "card_bag").f60753a);
                Intent intent = new Intent((Context) this.f64852b.get(), CouponListActivity.class);
                intent.putExtra("is_coupon_valid", false);
                ((Activity) this.f64852b.get()).startActivity(intent);
            }
        }

        C24589b(View view, WeakReference<Activity> weakReference) {
            super(view);
            this.f64851a = view;
            this.f64852b = weakReference;
        }
    }

    public int getItemCount() {
        if (!this.f64840d || this.f64839c) {
            return this.f64838a.size();
        }
        return this.f64838a.size() + 1;
    }

    /* renamed from: a */
    public final void mo64382a(List<CouponInfo> list) {
        this.f64838a = list;
        notifyDataSetChanged();
    }

    public CouponListAdapter(Activity activity) {
        this.f64842f = new WeakReference<>(activity);
    }

    public int getItemViewType(int i) {
        if (!this.f64840d || this.f64839c || i != getItemCount() - 1) {
            return 0;
        }
        return 1;
    }

    public void onBindViewHolder(C1293v vVar, int i) {
        if (i < getItemCount()) {
            if (!this.f64840d || this.f64839c || i != getItemCount() - 1) {
                CouponInfo couponInfo = (CouponInfo) this.f64838a.get(i);
                if (vVar instanceof C24588a) {
                    ((C24588a) vVar).mo64384a(couponInfo, i, this.f64840d);
                }
                m80632a(vVar.itemView.getContext(), couponInfo);
            } else if (vVar instanceof C24589b) {
                ((C24589b) vVar).mo64386a();
            }
        }
    }

    public C1293v onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return new C24589b(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.iu, viewGroup, false), this.f64842f);
        }
        return new C24588a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.u_, viewGroup, false), this.f64842f);
    }

    /* renamed from: a */
    private void m80632a(Context context, CouponInfo couponInfo) {
        String str;
        String str2;
        String str3;
        if (context != null && couponInfo != null) {
            String codeId = couponInfo.getCodeId();
            if (!this.f64841e.contains(codeId)) {
                this.f64841e.add(codeId);
                String str4 = "show_coupon";
                C22984d a = C22984d.m75611a();
                String str5 = "enter_from";
                if (this.f64840d) {
                    str = "card_bag";
                } else {
                    str = "invalid_card_bag";
                }
                C22984d a2 = a.mo59973a(str5, str);
                String str6 = "previous_page";
                if (this.f64840d) {
                    str2 = "card_bag";
                } else {
                    str2 = "invalid_card_bag";
                }
                C22984d a3 = a2.mo59973a(str6, str2).mo59970a("coupon_id", couponInfo.getCouponId());
                String str7 = "enter_method";
                if (this.f64840d) {
                    str3 = "click_card_bag";
                } else {
                    str3 = "click_invalid_card_bag";
                }
                C6907h.m21524a(str4, (Map) a3.mo59973a(str7, str3).mo59973a("coupon_type", C24575a.m80615a(context, couponInfo.getStatus(), true)).mo59973a("source_type", C24575a.m80616a(couponInfo)).f60753a);
            }
        }
    }

    public void onBindViewHolder(C1293v vVar, int i, List list) {
        if (list.isEmpty()) {
            onBindViewHolder(vVar, i);
            return;
        }
        onBindViewHolder(vVar, i);
        if (vVar instanceof C24588a) {
            ((C24588a) vVar).mo64383a();
        }
    }
}
