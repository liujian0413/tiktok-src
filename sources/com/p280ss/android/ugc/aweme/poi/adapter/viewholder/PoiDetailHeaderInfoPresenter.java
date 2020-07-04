package com.p280ss.android.ugc.aweme.poi.adapter.viewholder;

import android.content.Context;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.C1642a;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.bytedance.ies.uikit.p576a.C10994a;
import com.p280ss.android.ugc.aweme.i18n.C30537o;
import com.p280ss.android.ugc.aweme.music.p1410ui.CheckableImageView;
import com.p280ss.android.ugc.aweme.poi.event.C35083f;
import com.p280ss.android.ugc.aweme.poi.model.PoiBundle;
import com.p280ss.android.ugc.aweme.poi.model.PoiDetail;
import com.p280ss.android.ugc.aweme.poi.model.PoiStruct;
import com.p280ss.android.ugc.aweme.poi.p1462b.C35067b;
import com.p280ss.android.ugc.aweme.poi.p335ui.C35392m;
import com.p280ss.android.ugc.aweme.poi.utils.C35462r;
import com.p280ss.android.ugc.aweme.poi.widget.PoiLabelsLayout;
import com.p280ss.android.ugc.aweme.poi.widget.RatingBar;
import com.p280ss.android.ugc.aweme.poi.widget.TextAppendViewLayout;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.poi.adapter.viewholder.PoiDetailHeaderInfoPresenter */
public class PoiDetailHeaderInfoPresenter {

    /* renamed from: a */
    public Context f91513a;

    /* renamed from: b */
    private C35392m f91514b;

    /* renamed from: c */
    private C35067b f91515c;

    /* renamed from: d */
    private PoiDetail f91516d;

    /* renamed from: e */
    private C35026b f91517e;

    /* renamed from: f */
    private PoiBundle f91518f;
    protected View mLocalLayout;
    protected TextAppendViewLayout mNewLineLayout;
    protected DmtTextView mPoiCollectContent;
    protected CheckableImageView mPoiCollectImg;
    protected View mPoiCollectLayout;
    protected PoiLabelsLayout mPoiDetails;
    protected TextView mPoiName;
    protected View mPoiNameLayout;
    protected DmtTextView mPoiOpenTimeTxt;
    protected TextView mPoiPrice;
    protected View mPoiRating;
    protected RatingBar mPoiRatingBar;
    protected View mPoiRatingLayout;
    protected DmtTextView mPoiRatingTxt;
    protected TextView mPoiSubType;
    protected TextView mPoiVisitor;

    /* renamed from: com.ss.android.ugc.aweme.poi.adapter.viewholder.PoiDetailHeaderInfoPresenter$a */
    public interface C35025a {
        /* renamed from: a */
        void mo88804a(boolean z);

        /* renamed from: b */
        PoiBundle mo88805b();

        /* renamed from: c */
        CheckableImageView mo88806c();
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.adapter.viewholder.PoiDetailHeaderInfoPresenter$b */
    public interface C35026b {
        /* renamed from: a */
        void mo88807a(int i, float f);
    }

    /* renamed from: b */
    private void m113066b() {
        if (this.f91516d != null) {
            this.f91515c = new C35067b(this.f91516d, this.mNewLineLayout);
            this.f91515c.mo88881a();
        }
    }

    /* renamed from: d */
    private void m113068d() {
        String a = m113064a(this.f91513a, this.f91516d);
        if (!TextUtils.isEmpty(a)) {
            this.mPoiOpenTimeTxt.setVisibility(0);
            this.mPoiOpenTimeTxt.setText(a);
        }
    }

    /* renamed from: e */
    private boolean m113069e() {
        String subType = this.f91516d.getSubType();
        if (C6319n.m19593a(subType)) {
            this.mPoiSubType.setVisibility(8);
            return true;
        }
        this.mPoiSubType.setText(subType);
        return false;
    }

    /* renamed from: a */
    private void m113065a() {
        if (this.mPoiCollectLayout.getVisibility() == 0) {
            int b = (int) C9738o.m28708b(this.f91513a, 16.0f);
            this.mPoiCollectLayout.setBackgroundResource(R.drawable.q1);
            this.mPoiCollectImg.setLayoutParams(new LayoutParams(b, b));
            if (this.f91514b != null) {
                this.f91514b.mo90120a(this.mPoiCollectImg, this.f91516d, false);
            }
        }
    }

    /* renamed from: g */
    private boolean m113071g() {
        float rating = this.f91516d.getRating();
        if (rating <= 0.0f) {
            return false;
        }
        this.mPoiRating.setVisibility(0);
        this.mPoiRatingBar.setStar(rating);
        this.mPoiRatingTxt.setText(C1642a.m8034a(this.f91513a.getResources().getString(R.string.d0_), new Object[]{this.f91516d.getRatingStr()}));
        return true;
    }

    /* renamed from: c */
    private boolean m113067c() {
        if (C6319n.m19593a(this.f91516d.getI18nPrice())) {
            String price = this.f91516d.getPrice();
            if (C6319n.m19593a(price)) {
                this.mPoiPrice.setVisibility(8);
                return true;
            }
            this.mPoiPrice.setText(C1642a.m8034a(this.f91513a.getResources().getString(R.string.cxx), new Object[]{price}));
            return false;
        }
        this.mPoiPrice.setText(this.f91516d.getI18nPrice());
        return false;
    }

    /* renamed from: f */
    private boolean m113070f() {
        long j;
        PoiStruct poiStruct = this.f91516d.getPoiStruct();
        if (poiStruct == null) {
            return true;
        }
        String str = poiStruct.viewCount;
        if (TextUtils.isEmpty(str)) {
            this.mPoiVisitor.setVisibility(8);
            return true;
        }
        try {
            j = Long.parseLong(str);
        } catch (Exception unused) {
            j = 0;
        }
        if (j <= 0) {
            this.mPoiVisitor.setVisibility(8);
            return true;
        }
        if (C6399b.m19944t()) {
            this.mPoiVisitor.setText(C1642a.m8034a(this.f91513a.getResources().getString(R.string.pj), new Object[]{C30537o.m99738a(j)}));
        } else {
            this.mPoiVisitor.setText(C1642a.m8034a(this.f91513a.getResources().getString(R.string.pm), new Object[]{C30537o.m99738a(j)}));
        }
        return false;
    }

    /* renamed from: a */
    public final void mo88801a(View view) {
        float f;
        int measuredHeight = this.mLocalLayout.getMeasuredHeight();
        int height = view.getHeight();
        float measuredHeight2 = ((float) this.mPoiNameLayout.getMeasuredHeight()) + C9738o.m28708b(this.f91513a, 16.0f);
        float b = C9738o.m28708b(this.f91513a, 52.0f);
        if (VERSION.SDK_INT >= 19) {
            b += (float) C10994a.m32204a(this.f91513a);
        }
        if (this.f91517e != null) {
            C35026b bVar = this.f91517e;
            int i = measuredHeight + height + 0;
            if (measuredHeight2 > b) {
                f = 0.0f;
            } else {
                f = b - measuredHeight2;
            }
            bVar.mo88807a(i, f);
        }
        this.mLocalLayout.setVisibility(8);
        view.setVisibility(8);
    }

    /* renamed from: a */
    public final void mo88802a(PoiDetail poiDetail) {
        boolean z;
        this.f91516d = poiDetail;
        this.mPoiName.setText(poiDetail.getTitle());
        this.mPoiDetails.setChildsToHideInSequence(2, 1, 3);
        this.mPoiCollectContent.setText(R.string.cxq);
        m113068d();
        boolean c = m113067c();
        boolean e = m113069e();
        boolean f = m113070f();
        if (!c || !e || !f) {
            z = false;
        } else {
            z = true;
        }
        if (!m113071g() && z) {
            this.mPoiRatingLayout.setVisibility(8);
        }
        m113065a();
        m113066b();
        String str = "";
        if (this.f91518f != null) {
            str = this.f91518f.from;
        }
        C35462r.m114563a((View) this.mPoiName, this.mPoiName.getText(), this.f91513a, (int) R.string.cy4, "poi_name", poiDetail, str);
    }

    /* renamed from: a */
    private static String m113064a(Context context, PoiDetail poiDetail) {
        String str;
        if (poiDetail == null) {
            return null;
        }
        if (poiDetail.isPoiOwnerValid()) {
            str = poiDetail.getEnterpriseBusinessTime(context.getResources().getStringArray(R.array.az), context.getResources().getString(R.string.d0x));
        } else {
            str = null;
        }
        if (C6319n.m19593a(str) && poiDetail.poiExtension != null) {
            str = poiDetail.poiExtension.open_time;
        }
        if (C6319n.m19593a(str)) {
            return null;
        }
        return C1642a.m8034a(context.getResources().getString(R.string.d0y), new Object[]{str});
    }

    public PoiDetailHeaderInfoPresenter(AbsFragment absFragment, C35025a aVar, View view, C35392m mVar, C35026b bVar) {
        this.f91513a = view.getContext();
        this.f91517e = bVar;
        ButterKnife.bind((Object) this, view);
        if (!(mVar == null || aVar == null)) {
            this.f91514b = mVar;
            this.f91514b.mo90122a(absFragment, this.mPoiCollectImg, aVar.mo88806c());
            this.f91518f = aVar.mo88805b();
            this.f91514b.f92845a = this.f91518f;
        }
        this.mPoiCollectImg.getViewTreeObserver().addOnGlobalLayoutListener(new OnGlobalLayoutListener() {
            public final void onGlobalLayout() {
                PoiDetailHeaderInfoPresenter.this.mPoiCollectImg.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                int[] iArr = new int[2];
                PoiDetailHeaderInfoPresenter.this.mPoiCollectImg.getLocationOnScreen(iArr);
                C42961az.m136380a(new C35083f(iArr[0] + (PoiDetailHeaderInfoPresenter.this.mPoiCollectImg.getWidth() / 4), (int) (((float) (iArr[1] + PoiDetailHeaderInfoPresenter.this.mPoiCollectImg.getHeight())) + C9738o.m28708b(PoiDetailHeaderInfoPresenter.this.f91513a, 8.0f))));
            }
        });
        if (!C35462r.m114565a()) {
            this.mPoiCollectLayout.setVisibility(8);
        }
    }
}
