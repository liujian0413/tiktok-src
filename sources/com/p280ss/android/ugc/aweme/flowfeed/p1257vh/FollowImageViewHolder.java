package com.p280ss.android.ugc.aweme.flowfeed.p1257vh;

import android.os.Build.VERSION;
import android.support.p022v4.app.FragmentActivity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.abmock.C6384b;
import com.facebook.drawee.p694b.C13364a.C13365a;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.common.widget.DragView.IViewInfo;
import com.p280ss.android.ugc.aweme.feed.model.ImageInfo;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28503s;
import com.p280ss.android.ugc.aweme.flowfeed.expriment.FollowFeedDisplayTypeAB;
import com.p280ss.android.ugc.aweme.flowfeed.p1252f.C29361b;
import com.p280ss.android.ugc.aweme.flowfeed.p1252f.C29363d;
import com.p280ss.android.ugc.aweme.flowfeed.p1254h.C29370e;
import com.p280ss.android.ugc.aweme.flowfeed.p1254h.C29376j;
import com.p280ss.android.ugc.aweme.flowfeed.p1256ui.FollowFeedLayout;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21743a;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21744b;
import com.p280ss.android.ugc.aweme.flowfeed.viewmodel.FollowEnterDetailViewModel;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.p1192e.p1193a.C27326a;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.backgroundvideo.C40413c;
import com.p280ss.android.ugc.aweme.utils.C43070ds;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.flowfeed.vh.FollowImageViewHolder */
public class FollowImageViewHolder extends BaseFollowViewHolder {

    /* renamed from: a */
    protected ViewGroup f77571a;

    /* renamed from: b */
    ViewStub f77572b;

    /* renamed from: c */
    boolean f77573c;

    /* renamed from: T */
    public final void mo75244T() {
        super.mo75244T();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public String mo68522g() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public int mo68523h() {
        return 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public String mo68524i() {
        return "from_follow_page";
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public boolean mo75289q() {
        return this.f77573c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final void mo75293u() {
        mo75236L();
    }

    /* renamed from: Z */
    public final void mo75250Z() {
        super.mo75250Z();
        mo75305a(false);
    }

    /* renamed from: X */
    public final void mo75248X() {
        if (!mo68520e()) {
            super.mo75248X();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: aa */
    public final void mo75260aa() {
        super.mo75260aa();
        if (!C27326a.m89578a(this.f77571a)) {
            mo68527a((long) C40413c.f105051b);
            mo75306ae();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: af */
    public final /* synthetic */ boolean mo75307af() {
        this.f77550n.mo58087b(this.f77559w, this.itemView, this.f77546j, this.f77546j.getAuthor());
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public boolean mo68520e() {
        if (!(mo75261ab() instanceof FragmentActivity)) {
            return false;
        }
        return FollowEnterDetailViewModel.m96850a(mo75290r(), (FragmentActivity) mo75261ab()).f77626a;
    }

    /* renamed from: ag */
    private void mo75309ag() {
        C29363d.m96451a().mo75038a(mo75261ab(), this.f77546j.getAid(), mo75290r(), mo68524i(), this.f77546j.getEnterpriseType(), mo68523h(), mo68522g(), (View) this.f77571a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo68499a() {
        super.mo68499a();
        C29425n nVar = new C29425n(this);
        if (this.f77546j.getAuthor() != null) {
            C29363d.m96451a().mo75041a(this.f77559w, this.f77546j.getAuthor().getStarBillboardRank(), 4, mo75290r(), (C13365a) nVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo68504d() {
        if (VERSION.SDK_INT >= 21) {
            this.f77571a.setOutlineProvider(new C43070ds(this.f77571a.getResources().getDimensionPixelOffset(R.dimen.hf)));
            this.f77571a.setClipToOutline(true);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo68521f() {
        if (this.f77546j != null) {
            C6903bc.m21486e().mo75372b(this.f77546j, mo75290r());
            mo75305a(true);
            C28503s.m93679a(this.f77550n.mo58090c(this.f77546j));
            mo75309ag();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final void mo75292t() {
        List imageInfos = this.f77546j.getImageInfos();
        if (imageInfos != null && !imageInfos.isEmpty()) {
            ImageInfo imageInfo = (ImageInfo) imageInfos.get(0);
            if (imageInfo != null) {
                mo68503a((View) this.f77571a, imageInfo.getWidth(), imageInfo.getHeight());
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: L */
    public final void mo75236L() {
        super.mo75236L();
        List imageInfos = this.f77546j.getImageInfos();
        if (imageInfos != null && !imageInfos.isEmpty()) {
            ImageInfo imageInfo = (ImageInfo) imageInfos.get(0);
            if (imageInfo != null) {
                if (imageInfo.getLabelLarge() != null) {
                    C6307b.m19566a((Collection<T>) imageInfo.getLabelLarge().getUrlList());
                }
                C23323e.m76506a(this.f77551o, imageInfo.getLabelLarge(), this.f77551o.getWidth(), this.f77551o.getHeight());
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: ae */
    public void mo75306ae() {
        C29370e Q = mo75241Q();
        if (Q != null) {
            Q.f77398c.mo104682a(16777216);
            int[] iArr = new int[2];
            this.f77551o.getLocationOnScreen(iArr);
            IViewInfo iViewInfo = new IViewInfo(iArr[0], iArr[1], this.f77551o.getHeight(), this.f77551o.getWidth(), (float) this.f77551o.getResources().getDimensionPixelOffset(R.dimen.hf));
            ((C29361b) ServiceManager.get().getService(C29361b.class)).mo75035a(mo75261ab(), iViewInfo, this.f77546j, mo75290r(), Q.f77403h);
        }
    }

    public void onViewDetachedFromWindow(View view) {
        super.onViewDetachedFromWindow(view);
        mo75291s();
    }

    /* renamed from: b */
    public final void mo75264b(int i) {
        super.mo75264b(i);
        mo68527a((long) C40413c.f105051b);
    }

    public void onViewAttachedToWindow(View view) {
        super.onViewAttachedToWindow(view);
        this.f77517af.mo75120e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo75259a(FollowFeedLayout followFeedLayout) {
        super.mo75259a(followFeedLayout);
        this.f77571a = (ViewGroup) followFeedLayout.findViewById(R.id.bhv);
        this.f77572b = (ViewStub) followFeedLayout.findViewById(R.id.dc3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo75305a(boolean z) {
        if (mo75261ab() instanceof FragmentActivity) {
            FollowEnterDetailViewModel.m96850a(mo75290r(), (FragmentActivity) mo75261ab()).f77626a = z;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo68500a(View view) {
        ViewStub viewStub = (ViewStub) view.findViewById(R.id.dc_);
        viewStub.setLayoutResource(R.layout.a6t);
        mo75253a(viewStub.inflate(), 4.0f);
        ViewStub viewStub2 = (ViewStub) view.findViewById(R.id.dc2);
        viewStub2.setLayoutResource(R.layout.a6s);
        mo75253a(viewStub2.inflate(), 12.0f);
        ViewStub viewStub3 = (ViewStub) view.findViewById(R.id.dc7);
        viewStub3.setLayoutResource(R.layout.a6e);
        mo75253a(viewStub3.inflate(), 12.0f);
        ViewStub viewStub4 = (ViewStub) view.findViewById(R.id.dcl);
        viewStub4.setLayoutResource(R.layout.a6m);
        viewStub4.inflate();
        ViewStub viewStub5 = (ViewStub) view.findViewById(R.id.dc6);
        viewStub5.setLayoutResource(R.layout.a6d);
        viewStub5.inflate();
        ViewStub viewStub6 = (ViewStub) view.findViewById(R.id.dc0);
        viewStub6.setLayoutResource(R.layout.a6f);
        viewStub6.inflate();
        ViewStub viewStub7 = (ViewStub) view.findViewById(R.id.dc8);
        viewStub7.setLayoutResource(R.layout.a6p);
        mo75253a(viewStub7.inflate(), 12.0f);
    }

    public FollowImageViewHolder(FollowFeedLayout followFeedLayout, C21744b bVar, C29376j jVar, C21743a aVar) {
        this(followFeedLayout, bVar, jVar, aVar, false);
    }

    public FollowImageViewHolder(FollowFeedLayout followFeedLayout, C21744b bVar, C29376j jVar, C21743a aVar, boolean z) {
        super(followFeedLayout, bVar, jVar, aVar);
        this.f77571a.setOnTouchListener(this.f77536ay);
        this.f77573c = z;
        if (this.f77573c) {
            this.f77502R.setDisplayType(C6384b.m19835a().mo15287a(FollowFeedDisplayTypeAB.class, true, "second_tab_display_type", C6384b.m19835a().mo15295d().second_tab_display_type, 8));
        }
    }
}
