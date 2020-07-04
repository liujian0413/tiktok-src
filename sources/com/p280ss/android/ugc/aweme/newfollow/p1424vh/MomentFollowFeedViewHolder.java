package com.p280ss.android.ugc.aweme.newfollow.p1424vh;

import android.os.Build.VERSION;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.base.utils.C23472a;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.common.widget.DragView.IViewInfo;
import com.p280ss.android.ugc.aweme.discover.mob.C26780aa;
import com.p280ss.android.ugc.aweme.feed.model.ImageInfo;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28482e;
import com.p280ss.android.ugc.aweme.feed.p1238ui.C28826b;
import com.p280ss.android.ugc.aweme.flowfeed.expriment.FollowFeedDisplayTypeAB;
import com.p280ss.android.ugc.aweme.flowfeed.expriment.FollowFeedShowForwardAB;
import com.p280ss.android.ugc.aweme.flowfeed.p1254h.C29370e;
import com.p280ss.android.ugc.aweme.flowfeed.p1254h.C29376j;
import com.p280ss.android.ugc.aweme.flowfeed.p1256ui.FollowFeedLayout;
import com.p280ss.android.ugc.aweme.flowfeed.p1257vh.BaseFollowViewHolder;
import com.p280ss.android.ugc.aweme.flowfeed.p968a.C21740a;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21743a;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21744b;
import com.p280ss.android.ugc.aweme.hotsearch.p1295c.C30357c;
import com.p280ss.android.ugc.aweme.live.feedpage.C32517b;
import com.p280ss.android.ugc.aweme.newfollow.adapter.FollowFeedAdapter;
import com.p280ss.android.ugc.aweme.newfollow.p1422e.C34138b;
import com.p280ss.android.ugc.aweme.newfollow.p1423ui.AbsFollowFeedDetailActivity;
import com.p280ss.android.ugc.aweme.newfollow.userstate.UserStateFeedAdapter;
import com.p280ss.android.ugc.aweme.p1192e.p1193a.C27326a;
import com.p280ss.android.ugc.aweme.utils.C43070ds;
import com.p280ss.android.ugc.aweme.utils.C43168s;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import java.util.List;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.ss.android.ugc.aweme.newfollow.vh.MomentFollowFeedViewHolder */
public class MomentFollowFeedViewHolder extends BaseFollowViewHolder {

    /* renamed from: a */
    View f89339a;

    /* renamed from: az */
    private C7326g<C32517b> f89340az;

    /* renamed from: b */
    View f89341b;

    /* renamed from: c */
    ImageView f89342c;

    /* renamed from: d */
    DmtTextView f89343d;

    /* renamed from: e */
    View f89344e;

    /* renamed from: f */
    ViewStub f89345f;

    /* renamed from: g */
    private boolean f89346g;

    /* renamed from: q */
    public final boolean mo75289q() {
        return true;
    }

    /* renamed from: X */
    public final void mo75248X() {
        super.mo75248X();
        mo75239O();
    }

    /* renamed from: Z */
    public final void mo75250Z() {
        super.mo75250Z();
        mo75238N();
    }

    /* renamed from: R */
    public final void mo75242R() {
        super.mo75242R();
        if (C21740a.m72683a(this.f77546j)) {
            mo75238N();
        }
    }

    /* renamed from: S */
    public final void mo75243S() {
        super.mo75243S();
        if (C21740a.m72683a(this.f77546j)) {
            mo75239O();
        }
    }

    /* renamed from: u */
    public final void mo75293u() {
        if (this.f77546j.isImage()) {
            m110778h();
        } else {
            m110777g();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final /* synthetic */ boolean mo68520e() {
        this.f77550n.mo58087b(this.f77559w, this.itemView, this.f77546j, this.f77546j.getAuthor());
        return false;
    }

    /* renamed from: f */
    private void m110776f() {
        C34285n nVar = new C34285n(this);
        if (this.f77546j.getAuthor() != null) {
            C30357c.m99190a(this.f77559w, this.f77546j.getAuthor().getStarBillboardRank(), 4, mo75290r(), nVar);
        }
    }

    /* renamed from: g */
    private void m110777g() {
        if (this.f77546j.getVideo() != null) {
            C23323e.m76506a(this.f77551o, this.f77546j.getVideo().getOriginCover(), this.f77551o.getWidth(), this.f77551o.getHeight());
        }
        this.f89342c.setVisibility(0);
    }

    /* renamed from: a */
    public final void mo68499a() {
        mo75293u();
        mo75228D();
        mo75296x();
        mo75294v();
        mo68525j();
        mo75229E();
        mo75226B();
        mo68532m();
        mo75225A();
        mo68536c();
        mo68502b();
        mo75233I();
        m110776f();
        this.f89346g = false;
    }

    /* renamed from: aa */
    public final void mo75260aa() {
        super.mo75260aa();
        if (C27326a.m89578a(this.f89339a) || this.f77546j == null) {
            return;
        }
        if (this.f77546j.isImage()) {
            m110779i();
        } else {
            m110775ae();
        }
    }

    /* renamed from: d */
    public final void mo68504d() {
        if (VERSION.SDK_INT >= 21) {
            this.f89339a.setOutlineProvider(new C43070ds((int) C9738o.m28708b(mo75261ab(), 2.0f)));
            this.f89339a.setClipToOutline(true);
        }
    }

    /* renamed from: m */
    public final void mo68532m() {
        if (!C28482e.m93615h(this.f77546j) || !C6384b.m19835a().mo15292a(FollowFeedShowForwardAB.class, true, "aweme_follow_show_forward", C6384b.m19835a().mo15295d().aweme_follow_show_forward, false)) {
            C23487o.m77140a((View) this.f77507W, 8);
        } else {
            C23487o.m77140a((View) this.f77507W, 0);
        }
    }

    /* renamed from: h */
    private void m110778h() {
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
        this.f89342c.setVisibility(8);
    }

    /* renamed from: i */
    private void m110779i() {
        C29370e Q = mo75241Q();
        if (Q != null) {
            Q.f77398c.mo104682a(16777216);
            int[] iArr = new int[2];
            this.f77551o.getLocationOnScreen(iArr);
            IViewInfo iViewInfo = new IViewInfo(iArr[0], iArr[1], this.f77551o.getHeight(), this.f77551o.getWidth(), (float) this.f77551o.getResources().getDimensionPixelOffset(R.dimen.hf));
            C26780aa.m87959a(this.itemView, mo75290r(), this.f77546j);
            AbsFollowFeedDetailActivity.m110065a(mo75261ab(), iViewInfo, this.f77546j, mo75290r(), Q.f77403h);
        }
    }

    /* renamed from: D */
    public final void mo75228D() {
        if (C43168s.m136911c(this.f77546j)) {
            this.f89344e.setVisibility(0);
            this.f89343d.setVisibility(0);
            this.f89343d.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ase, 0, 0, 0);
            this.f89343d.setText(mo75261ab().getString(R.string.b_h));
        } else if (!C21740a.m72687c(this.f77546j) || !C43168s.m136912d(this.f77546j)) {
            this.f89344e.setVisibility(8);
            this.f89343d.setVisibility(8);
        } else {
            this.f89344e.setVisibility(0);
            this.f89343d.setVisibility(0);
            this.f89343d.setCompoundDrawablesWithIntrinsicBounds(R.drawable.aym, 0, 0, 0);
            this.f89343d.setText(mo75261ab().getString(R.string.e6w));
        }
    }

    /* renamed from: t */
    public final void mo75292t() {
        int i;
        int i2 = 0;
        if (this.f77546j.getVideo() != null) {
            i2 = this.f77546j.getVideo().getWidth();
            i = this.f77546j.getVideo().getHeight();
        } else {
            if (this.f77546j.isImage() && this.f77546j.getImageInfos() != null) {
                List imageInfos = this.f77546j.getImageInfos();
                if (imageInfos != null && !imageInfos.isEmpty()) {
                    ImageInfo imageInfo = (ImageInfo) imageInfos.get(0);
                    if (imageInfo != null) {
                        i2 = imageInfo.getWidth();
                        i = imageInfo.getHeight();
                    }
                }
            }
            i = 0;
        }
        m110774a(i2, i);
    }

    /* renamed from: ae */
    private void m110775ae() {
        float f;
        this.f89346g = true;
        C29370e Q = mo75241Q();
        if (Q != null) {
            Q.f77404i = true;
            Q.f77398c.mo104682a(16777216);
            C26780aa.m87959a(this.itemView, mo75290r(), this.f77546j);
            int[] iArr = new int[2];
            this.f89339a.getLocationOnScreen(iArr);
            if (this.f77546j == null || this.f77546j.getVideo() == null) {
                f = ((float) this.f89339a.getHeight()) / ((float) this.f89339a.getWidth());
            } else {
                f = ((float) this.f77546j.getVideo().getHeight()) / ((float) this.f77546j.getVideo().getWidth());
            }
            IViewInfo iViewInfo = new IViewInfo(iArr[0], iArr[1], this.f89339a.getHeight(), this.f89339a.getWidth(), (float) this.f77551o.getResources().getDimensionPixelOffset(R.dimen.hf), f);
            AbsFollowFeedDetailActivity.m110062a(mo75261ab(), iViewInfo, this.f77546j, 2, mo75290r(), Q.f77403h);
        }
    }

    /* renamed from: x */
    public final void mo75296x() {
        if (this.f77509Y != null) {
            if (this.f77526ao || (!(this.f77520ai.mo58076e() instanceof FollowFeedAdapter) && !(this.f77520ai.mo58076e() instanceof UserStateFeedAdapter))) {
                this.f77509Y.setVisibility(8);
            } else {
                this.f77509Y.setVisibility(0);
            }
        }
        if (this.f77546j.getAuthor() != null) {
            this.f77552p.setVisibility(0);
            if (this.f77549m == null) {
                this.f77549m = new C28826b(this.f77546j.getAuthor().isLive(), this.f77556t, this.f77554r, this.f77557u);
            }
            if (C21740a.m72683a(this.f77546j)) {
                C23323e.m76506a((RemoteImageView) this.f77556t, this.f77546j.getAuthor().getAvatarThumb(), this.f77501Q, this.f77501Q);
                C34138b.m110002c(this.f77546j);
            } else {
                C23323e.m76506a((RemoteImageView) this.f77554r, this.f77546j.getAuthor().getAvatarThumb(), this.f77501Q, this.f77501Q);
            }
            if (this.f89340az == null) {
                this.f89340az = new C7326g<C32517b>() {
                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public void accept(C32517b bVar) throws Exception {
                        if (TextUtils.equals(MomentFollowFeedViewHolder.this.f77546j.getAuthor().getUid(), String.valueOf(bVar.f84785a))) {
                            MomentFollowFeedViewHolder.this.f77546j.getAuthor().roomId = bVar.f84786b;
                            if (!MomentFollowFeedViewHolder.this.f77546j.getAuthor().isLive()) {
                                MomentFollowFeedViewHolder.this.mo75296x();
                            }
                        }
                    }
                };
            }
            this.f77549m.mo74071a(this.f77546j.getAuthor(), getClass(), this.f89340az);
            if (!TextUtils.isEmpty(this.f77546j.getAuthor().getRemarkName())) {
                this.f77559w.setText(this.f77546j.getAuthor().getRemarkName());
            } else {
                this.f77559w.setText(C23472a.m77059a(this.itemView.getContext(), this.f77546j.getAuthor().getNickname(), this.f77546j.getNicknamePosition()));
            }
        }
    }

    /* renamed from: c */
    public final void mo75267c(View view) {
        View findViewById = view.findViewById(R.id.bqy);
        LayoutParams layoutParams = (LayoutParams) findViewById.getLayoutParams();
        layoutParams.leftMargin = (int) (((float) layoutParams.leftMargin) + C9738o.m28708b(mo75261ab(), 50.0f));
        layoutParams.topMargin = -((int) C9738o.m28708b(mo75261ab(), 20.0f));
        findViewById.setLayoutParams(layoutParams);
    }

    /* renamed from: a */
    public final void mo68500a(View view) {
        ViewStub viewStub = (ViewStub) view.findViewById(R.id.dc_);
        viewStub.setLayoutResource(R.layout.a8q);
        mo75254a(viewStub.inflate(), 4.0f, 3.0f);
        ViewStub viewStub2 = (ViewStub) view.findViewById(R.id.dc2);
        viewStub2.setLayoutResource(R.layout.a6s);
        mo75254a(viewStub2.inflate(), 0.0f, 8.0f);
        ViewStub viewStub3 = (ViewStub) view.findViewById(R.id.dc7);
        viewStub3.setLayoutResource(R.layout.a8m);
        mo75253a(viewStub3.inflate(), 4.0f);
        ViewStub viewStub4 = (ViewStub) view.findViewById(R.id.dcl);
        viewStub4.setLayoutResource(R.layout.a6m);
        viewStub4.inflate();
        ViewStub viewStub5 = (ViewStub) view.findViewById(R.id.dc6);
        viewStub5.setLayoutResource(R.layout.a6q);
        mo75253a(viewStub5.inflate(), 16.0f);
        ViewStub viewStub6 = (ViewStub) view.findViewById(R.id.dc0);
        viewStub6.setLayoutResource(R.layout.a6f);
        mo75253a(viewStub6.inflate(), 16.0f);
    }

    /* renamed from: a */
    public final void mo75259a(FollowFeedLayout followFeedLayout) {
        super.mo75259a(followFeedLayout);
        this.f89339a = followFeedLayout.findViewById(R.id.bkm);
        this.f89341b = followFeedLayout.findViewById(R.id.amd);
        this.f89342c = (ImageView) followFeedLayout.findViewById(R.id.bb4);
        this.f89343d = (DmtTextView) followFeedLayout.findViewById(R.id.dv2);
        this.f89344e = followFeedLayout.findViewById(R.id.a4i);
        this.f89345f = (ViewStub) followFeedLayout.findViewById(R.id.dc3);
    }

    /* renamed from: a */
    private void m110774a(int i, int i2) {
        int i3;
        int i4;
        float b = C9738o.m28708b(mo75261ab(), 220.0f);
        float b2 = C9738o.m28708b(mo75261ab(), 250.0f);
        float f = (float) i2;
        float f2 = b / f;
        float f3 = (float) i;
        float f4 = b2 / f3;
        if (f2 <= f4) {
            float f5 = f3 * f2;
            float f6 = f * f2;
            float f7 = b * 0.75f;
            if (f5 < f7) {
                f5 = f7;
            }
            if (f5 > b2) {
                f5 = b2;
            }
            i4 = (int) f5;
            i3 = (int) f6;
        } else {
            float f8 = f3 * f4;
            float f9 = f * f4;
            if (f9 > b) {
                f9 = b;
            }
            i4 = (int) f8;
            i3 = (int) f9;
        }
        ViewGroup.LayoutParams layoutParams = this.f89339a.getLayoutParams();
        layoutParams.width = i4;
        layoutParams.height = i3;
    }

    public MomentFollowFeedViewHolder(FollowFeedLayout followFeedLayout, C21744b bVar, C29376j jVar, C21743a aVar) {
        super(followFeedLayout, bVar, jVar, aVar);
        this.f89339a.setOnTouchListener(this.f77536ay);
        ((LinearLayout) this.f77552p).setGravity(48);
        this.f77502R.setDisplayType(C6384b.m19835a().mo15287a(FollowFeedDisplayTypeAB.class, true, "second_tab_display_type", C6384b.m19835a().mo15295d().second_tab_display_type, 8));
    }
}
