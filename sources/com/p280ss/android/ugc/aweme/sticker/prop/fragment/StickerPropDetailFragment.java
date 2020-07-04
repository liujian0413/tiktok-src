package com.p280ss.android.ugc.aweme.sticker.prop.fragment;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.os.Bundle;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.FragmentActivity;
import android.support.p022v4.app.FragmentPagerAdapter;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewStub;
import android.view.animation.LinearInterpolator;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.C1642a;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.NullValueException;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.C10805b.C10806a;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.dmt.p262ui.widget.MtEmptyView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.ugc.appcontext.C6405d;
import com.bytedance.lighten.core.C12128i;
import com.bytedance.lighten.core.C12133n;
import com.bytedance.lighten.core.CircleOptions;
import com.bytedance.lighten.core.CircleOptions.C12089a;
import com.bytedance.lighten.core.p613d.C12123c;
import com.bytedance.lighten.loader.SmartImageView;
import com.facebook.drawee.backends.pipeline.C13380c;
import com.facebook.drawee.backends.pipeline.C13382e;
import com.facebook.drawee.controller.C13401d;
import com.facebook.imagepipeline.p720g.C13648f;
import com.google.common.base.C17457s;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.component.C23305g;
import com.p280ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.p280ss.android.ugc.aweme.base.p308ui.AvatarImageWithVerify;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.challenge.p1086ui.DetailAwemeListFragment;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25371n;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p280ss.android.ugc.aweme.detail.AbstractDetailFragment;
import com.p280ss.android.ugc.aweme.detail.C26051c;
import com.p280ss.android.ugc.aweme.detail.C26060f;
import com.p280ss.android.ugc.aweme.detail.C26065h;
import com.p280ss.android.ugc.aweme.effectplatform.C27481e;
import com.p280ss.android.ugc.aweme.favorites.p1211b.C27742a;
import com.p280ss.android.ugc.aweme.feed.C28199ae;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.festival.christmas.C29132a;
import com.p280ss.android.ugc.aweme.festival.christmas.C29135b;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.i18n.C30537o;
import com.p280ss.android.ugc.aweme.language.C32326h;
import com.p280ss.android.ugc.aweme.login.C32656f;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.metrics.C33267i;
import com.p280ss.android.ugc.aweme.music.model.Music;
import com.p280ss.android.ugc.aweme.music.p1410ui.C33936al;
import com.p280ss.android.ugc.aweme.music.p1410ui.CheckableImageView;
import com.p280ss.android.ugc.aweme.music.p1410ui.CheckableImageView.C33833a;
import com.p280ss.android.ugc.aweme.net.C34098r;
import com.p280ss.android.ugc.aweme.p1288h.C30221c;
import com.p280ss.android.ugc.aweme.p313im.service.model.ShareCompleteEvent;
import com.p280ss.android.ugc.aweme.poi.widget.C35481c;
import com.p280ss.android.ugc.aweme.port.p1479in.IFestivalService;
import com.p280ss.android.ugc.aweme.profile.p1480a.C35670h;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.router.C7203u;
import com.p280ss.android.ugc.aweme.secapi.ISecApi;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.services.sticker.IStickerUtilsService;
import com.p280ss.android.ugc.aweme.share.C38275x;
import com.p280ss.android.ugc.aweme.share.improve.pkg.StickerSharePackage;
import com.p280ss.android.ugc.aweme.shortvideo.AVMusic;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.unlock.C40958e;
import com.p280ss.android.ugc.aweme.sticker.model.CommerceSticker;
import com.p280ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import com.p280ss.android.ugc.aweme.sticker.model.NewFaceStickerListBean;
import com.p280ss.android.ugc.aweme.sticker.prop.adapter.C41858a;
import com.p280ss.android.ugc.aweme.sticker.prop.adapter.StickerPropFragmentAdapter;
import com.p280ss.android.ugc.aweme.sticker.prop.p1637ab.StickerPropOwnerAb;
import com.p280ss.android.ugc.aweme.sticker.prop.p1638b.C41862a;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.utils.C43091ed;
import com.p280ss.android.ugc.aweme.utils.C43126fg;
import com.p280ss.android.ugc.aweme.views.C43361b;
import com.p280ss.android.ugc.effectmanager.common.p1729d.C43726c;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43760j;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.C7705c;
import org.greenrobot.eventbus.C7709l;

/* renamed from: com.ss.android.ugc.aweme.sticker.prop.fragment.StickerPropDetailFragment */
public class StickerPropDetailFragment extends AbstractDetailFragment implements C41889k {

    /* renamed from: J */
    private C38275x f108898J;

    /* renamed from: K */
    private String f108899K;

    /* renamed from: L */
    private String f108900L;

    /* renamed from: M */
    private String f108901M;

    /* renamed from: N */
    private AVMusic f108902N;

    /* renamed from: O */
    private Serializable f108903O;

    /* renamed from: P */
    private C35481c f108904P;

    /* renamed from: Q */
    private boolean f108905Q;

    /* renamed from: R */
    private boolean f108906R;

    /* renamed from: S */
    private List<String> f108907S;

    /* renamed from: T */
    private C17457s<C27481e> f108908T = new C17457s<C27481e>() {

        /* renamed from: a */
        C27481e f108924a;

        /* access modifiers changed from: private */
        /* renamed from: b */
        public C27481e mo44946a() {
            if (this.f108924a == null) {
                this.f108924a = ((IAVService) ServiceManager.get().getService(IAVService.class)).effectService().createEffectPlatform(StickerPropDetailFragment.this.getContext(), C32326h.m104885g(), C34098r.m109769a().mo86751b());
            }
            return this.f108924a;
        }
    };

    /* renamed from: U */
    private long f108909U = -1;

    /* renamed from: V */
    private boolean f108910V = false;
    SmartImageView activityBannerBg;
    FrameLayout activityBannerContainer;
    AvatarImageWithVerify avarMini;
    RemoteImageView coverImgView;
    DmtTextView detailPageInfo;

    /* renamed from: e */
    public NewFaceStickerBean f108911e;

    /* renamed from: f */
    public C17457s<IStickerUtilsService> f108912f = new C17457s<IStickerUtilsService>() {

        /* renamed from: a */
        IStickerUtilsService f108926a;

        /* access modifiers changed from: private */
        /* renamed from: b */
        public IStickerUtilsService mo44946a() {
            if (this.f108926a == null) {
                this.f108926a = ((IAVService) ServiceManager.get().getService(IAVService.class)).getStickerUtilsService();
            }
            return this.f108926a;
        }
    };

    /* renamed from: g */
    public boolean f108913g = false;
    GridView gridView;

    /* renamed from: h */
    private StickerPropFragmentAdapter f108914h;

    /* renamed from: i */
    private String f108915i;
    ImageView imgToRecord;
    CheckableImageView ivCollect;
    ImageView ivDisclaimer;

    /* renamed from: j */
    private String f108916j;

    /* renamed from: k */
    private C41862a f108917k;

    /* renamed from: l */
    private String f108918l;
    RemoteImageView lockImageView;

    /* renamed from: m */
    private NewFaceStickerListBean f108919m;
    TextView mAdNickNameTv;
    View mAdOwnerLL;
    ImageView mArrowImg;
    RemoteImageView mBgCover;
    View mBottomLineView;
    View mCollectView;
    View mHeadLayout;
    View mInfoView;
    LinearLayout mLayoutStickerUrl;
    ImageView mLinkIconIv;
    ImageView mShareBtn;
    View mStartRecodeLayout;
    View mStartRecordOutRing;
    DmtStatusView mStatusView;
    ViewGroup mStickerOwnerProfileView;
    RemoteImageView mStickerPropActImgView;
    RemoteImageView mStickerPropActImgView_i18n;
    TextView mTextStickerInfo;
    TextView mTextStickerUrl;
    View mTopLineView;
    LinearLayout mVpExpandContainer;
    ViewStub mVsOriginalMusic;

    /* renamed from: n */
    private ViewGroup f108920n;
    TextView nickNamePrefix;
    TextView nickNameTextView;

    /* renamed from: o */
    private C41858a f108921o;
    View ownerCellBottomLine;

    /* renamed from: p */
    private float f108922p;

    /* renamed from: q */
    private float f108923q;
    TextView titleTextView;
    DmtTextView tvCollect;
    TextView txtDisclaimer;
    TextView usedCountTextView;

    /* renamed from: Y_ */
    public final boolean mo16933Y_() {
        return true;
    }

    /* renamed from: a */
    public final String mo61693a(int i) {
        return "prop_page";
    }

    /* renamed from: m */
    public final int mo61706m() {
        return R.layout.r5;
    }

    /* renamed from: p */
    public final void mo61712p() {
    }

    /* renamed from: t */
    public final boolean mo67559t() {
        return false;
    }

    /* renamed from: a */
    public final void mo102907a(boolean z) {
        if (C6399b.m19944t()) {
            if (this.mCollectView != null) {
                this.mCollectView.setEnabled(!z);
                if (C6399b.m19946v()) {
                    if (z) {
                        this.mCollectView.setAlpha(0.34f);
                    } else {
                        this.mCollectView.setAlpha(1.0f);
                    }
                } else if (C6399b.m19947w()) {
                    if (z) {
                        this.mCollectView.setAlpha(0.2f);
                    } else {
                        this.mCollectView.setAlpha(1.0f);
                    }
                }
            }
            if (this.lockImageView != null) {
                this.lockImageView.setVisibility(z ? 0 : 8);
            }
            if (this.imgToRecord != null) {
                this.imgToRecord.setImageResource(z ? R.drawable.bke : R.drawable.w7);
            }
        }
    }

    /* renamed from: a */
    public final void mo61696a(Bundle bundle) {
        if (bundle != null) {
            this.f108901M = bundle.getString("aweme_id");
            this.f108900L = bundle.getString("extra_log_pb");
            this.f108915i = bundle.getString("extra_music_from");
            this.f108916j = bundle.getString("extra_sticker_from");
            this.f108902N = (AVMusic) bundle.getSerializable("sticker_music");
            this.f108903O = bundle.getSerializable("music_model");
            this.f108907S = bundle.getStringArrayList("extra_stickers");
            StringBuilder sb = new StringBuilder();
            if (this.f108907S != null && this.f108907S.size() > 0) {
                this.f108899K = (String) this.f108907S.get(0);
                for (String str : this.f108907S) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str);
                    sb2.append(",");
                    sb.append(sb2.toString());
                }
            }
            if (sb.toString().endsWith(",")) {
                this.f108918l = sb.toString().substring(0, sb.toString().length() - 1);
            }
            this.f68824F = bundle.getString("sticker_id");
            this.f68821C = false;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo102901a(AdapterView adapterView, View view, int i, long j) {
        if (i != this.f108921o.f108886b) {
            this.f108921o.mo102891a(i);
            m133159c((NewFaceStickerBean) this.f108921o.f108885a.get(i));
            if (((IStickerUtilsService) this.f108912f.mo44946a()).isLockCommerceFaceSticker((NewFaceStickerBean) this.f108921o.f108885a.get(i))) {
                mo102907a(true);
            }
        }
    }

    /* renamed from: a */
    public final C26065h mo67554a(ViewGroup viewGroup) {
        return new C41878a(this.mStartRecodeLayout, this.mStartRecordOutRing, C6384b.m19835a().mo15287a(StickerPropOwnerAb.class, true, "sticker_owner_ab", C6384b.m19835a().mo15295d().sticker_owner_ab, 0) != 0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo102906a(String str, Effect effect) {
        C6907h.m21524a("shoot", (Map) C22984d.m75611a().mo59973a("creation_id", str).mo59973a("shoot_way", "prop_page").mo59973a("prop_id", effect.getEffectId()).mo59973a("group_id", this.f108901M).mo59973a("log_pb", this.f108900L).mo59973a("enter_from", "prop_page").mo59973a("enter_method", "click_prop_publish").f60753a);
    }

    /* renamed from: a */
    public final void mo102902a(NewFaceStickerBean newFaceStickerBean) {
        if (newFaceStickerBean != null && this.tvCollect != null && this.ivCollect != null) {
            this.ivCollect.setImageResource(newFaceStickerBean.isFavorite ? R.drawable.alg : R.drawable.ali);
            this.tvCollect.setText(newFaceStickerBean.isFavorite ? R.string.cgu : R.string.e1e);
            if (!newFaceStickerBean.isFavorite && this.f108904P != null && this.f108904P.isShowing()) {
                this.f108904P.dismiss();
            }
            if (newFaceStickerBean.isFavorite) {
                this.f108906R = true;
                m133161c(newFaceStickerBean.f108868id);
            }
        }
    }

    /* renamed from: a */
    public final void mo102904a(NewFaceStickerListBean newFaceStickerListBean) {
        if (isViewValid()) {
            if (newFaceStickerListBean == null || newFaceStickerListBean.mStickers == null || newFaceStickerListBean.mStickers.size() == 0) {
                this.mStatusView.mo25938c(false);
                this.mStatusView.mo25943g();
                return;
            }
            m133160c(newFaceStickerListBean);
            this.mStatusView.mo25938c(true);
            if (this.mShareBtn != null) {
                this.mShareBtn.setVisibility(0);
            }
            mo102907a(this.f108913g);
            m133164e((NewFaceStickerBean) newFaceStickerListBean.mStickers.get(0));
        }
    }

    /* renamed from: a */
    public final void mo102905a(Exception exc) {
        C6921a.m21559a((Throwable) exc);
        if (isViewValid()) {
            this.mStatusView.mo25934a(true);
        }
        if (this.mShareBtn != null) {
            this.mShareBtn.setVisibility(8);
        }
        mo102907a(this.f108913g);
    }

    /* renamed from: a */
    public final void mo102903a(NewFaceStickerBean newFaceStickerBean, C43726c cVar) {
        if (getActivity() != null) {
            C7705c.m23799a().mo20394d(new C27742a(newFaceStickerBean));
            mo102902a(newFaceStickerBean);
            int i = cVar.f113220a;
            if (i == 2004 || i == 2002) {
                C10761a.m31403c((Context) getActivity(), getResources().getString(R.string.b2u)).mo25750a();
            }
        }
    }

    /* renamed from: a */
    public final RemoteImageView mo29060a() {
        if (C6399b.m19944t()) {
            return this.mStickerPropActImgView_i18n;
        }
        return this.mStickerPropActImgView;
    }

    /* renamed from: n */
    public final String mo61707n() {
        if (this.f108911e != null) {
            return this.f108911e.f108868id;
        }
        return "";
    }

    /* renamed from: f */
    private List<Aweme> m133165f() {
        C26060f fVar = (C26060f) this.f68822D.get(this.f68820B);
        if (fVar instanceof DetailAwemeListFragment) {
            return ((DetailAwemeListFragment) fVar).mo61754n();
        }
        return null;
    }

    /* renamed from: g */
    private void m133166g() {
        if (this.mStatusView.mo25940d(true)) {
            this.f108917k.mo56976a(this.f108918l, Integer.valueOf(0));
        }
    }

    /* renamed from: j */
    private void m133168j() {
        if (C6384b.m19835a().mo15287a(StickerPropOwnerAb.class, true, "sticker_owner_ab", C6384b.m19835a().mo15295d().sticker_owner_ab, 0) != 0) {
            this.imgToRecord.setImageResource(R.drawable.bkd);
            ((MarginLayoutParams) this.mStartRecodeLayout.getLayoutParams()).bottomMargin = C23486n.m77122a(18.0d);
            return;
        }
        this.imgToRecord.setImageResource(R.drawable.w7);
    }

    /* renamed from: o */
    private void m133171o() {
        ((ISecApi) ServiceManager.get().getService(ISecApi.class)).reportData("share");
        StickerSharePackage.m122101a(getActivity(), this.f108911e, this.f108901M, m133165f(), this.f108900L);
    }

    public void onResume() {
        super.onResume();
        this.f108909U = System.currentTimeMillis();
        if (C6399b.m19944t()) {
            if (this.f108910V) {
                this.f108898J.mo95912a();
                this.f108910V = false;
                this.f108913g = false;
            }
            mo102907a(this.f108913g);
        }
    }

    /* renamed from: q */
    public final FragmentPagerAdapter mo61713q() {
        m133157b(this.f108919m);
        ArrayList arrayList = new ArrayList();
        for (AmeBaseFragment add : this.f68822D) {
            arrayList.add(add);
        }
        this.f108914h = new StickerPropFragmentAdapter(getChildFragmentManager(), arrayList);
        return this.f108914h;
    }

    /* renamed from: i */
    private void m133167i() {
        super.mo61712p();
        String str = (String) SharePrefCache.inst().getStickerArtlistUrl().mo59877d();
        boolean booleanValue = ((Boolean) SharePrefCache.inst().getStickerArtEntry().mo59877d()).booleanValue();
        String str2 = "";
        try {
            str2 = C30199h.m98861a().getStickerArtistIconUrl();
        } catch (NullValueException unused) {
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && booleanValue) {
            mo29060a().setVisibility(0);
            m133155a(str2);
        }
        mo29060a().setOnClickListener(new C41883e(this));
    }

    /* renamed from: k */
    private void m133169k() {
        IAVService iAVService = (IAVService) ServiceManager.get().getService(IAVService.class);
        if (iAVService == null || !iAVService.needLoginBeforeRecord()) {
            if (this.f108898J == null) {
                this.f108898J = new C38275x(getActivity(), "prop_page");
            }
            this.f108898J.f99480j = new C41886h(this);
            ArrayList l = m133170l();
            if (!(l == null || l.size() == 0)) {
                if (this.f108903O instanceof Music) {
                    this.f108898J.f99478h = (Music) this.f108903O;
                }
                this.f108898J.mo95917a(l, false, "prop_page", this.f108916j);
            }
            return;
        }
        C32656f.m105744a((Activity) getActivity(), "prop_page", "prop_reuse_icon", (Bundle) null, (C23305g) null);
    }

    /* renamed from: l */
    private ArrayList<String> m133170l() {
        if (this.f108919m == null || this.f108919m.mStickers == null || this.f108919m.mStickers.size() == 0) {
            return null;
        }
        ArrayList<String> arrayList = new ArrayList<>(this.f108919m.mStickers.size());
        for (NewFaceStickerBean newFaceStickerBean : this.f108919m.mStickers) {
            if (!newFaceStickerBean.mIsSelect) {
                arrayList.add(newFaceStickerBean.f108868id);
            } else {
                arrayList.add(0, newFaceStickerBean.f108868id);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public void mo29191e() {
        String str;
        if (this.f108911e != null) {
            this.f108905Q = false;
            this.f108906R = false;
            if (!C6861a.m21337f().isLogin()) {
                C32656f.m105744a((Activity) getActivity(), "prop_page", "click_favorite_prop", (Bundle) null, (C23305g) new C41887i(this));
                return;
            }
            if (this.f108911e.isFavorite) {
                str = "cancel_favorite_prop";
            } else {
                str = "favourite_prop";
            }
            C6907h.m21524a(str, (Map) C22984d.m75611a().mo59973a("enter_from", "prop_page").mo59973a("prop_id", this.f108911e.f108868id).f60753a);
            this.f108917k.mo102899a(getActivity(), this.f108911e);
            this.ivCollect.mo86446b();
        }
    }

    /* renamed from: d */
    public final void mo29173d() {
        if (this.f108911e != null && !TextUtils.isEmpty(this.f108911e.ownerId) && !TextUtils.isEmpty(this.f108911e.ownerName)) {
            C6907h.m21524a("enter_personal_detail", (Map) C22984d.m75611a().mo59973a("prop_id", this.f108911e.f108868id).mo59973a("to_user_id", this.f108911e.ownerId).mo59973a("enter_from", "prop_page").mo59973a("enter_method", "click_name").f60753a);
            C7195s a = C7195s.m22438a();
            StringBuilder sb = new StringBuilder("aweme://user/profile/");
            sb.append(this.f108911e.ownerId);
            a.mo18682a(C7203u.m22460a(sb.toString()).mo18694a("sec_user_id", this.f108911e.mSecUid).mo18694a("enter_from", "prop_page").mo18695a());
        }
    }

    public void onStop() {
        String str;
        if (this.f108911e == null) {
            str = "";
        } else {
            str = this.f108911e.f108868id;
        }
        this.f68826H = -1;
        super.onStop();
        mo67560u();
        if (this.f108909U != -1) {
            long currentTimeMillis = System.currentTimeMillis() - this.f108909U;
            StringBuilder sb = new StringBuilder();
            sb.append(currentTimeMillis);
            C6907h.m21524a("stay_time", (Map) C22984d.m75611a().mo59973a("prop_id", str).mo59973a("enter_from", "prop_page").mo59973a("duration", sb.toString()).mo59973a("group_id", this.f108901M).mo59973a("log_pb", this.f108900L).f60753a);
            this.f108909U = -1;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final /* synthetic */ void mo102912d(View view) {
        m133166g();
    }

    @C7709l
    public void receiveJumpMessage(C40958e eVar) {
        this.f108910V = true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo102910c(View view) {
        this.f68829t.scrollTo(0, -this.f68829t.getCurScrollY());
    }

    /* renamed from: a */
    private static CircleOptions m133150a(Context context) {
        return new C12089a().mo29783b(C12123c.m35292a(context, 2.0f)).mo29780a(C12123c.m35292a(context, 0.0f)).mo29782a();
    }

    @C7709l
    public void onEvent(ShareCompleteEvent shareCompleteEvent) {
        if (isViewValid() && TextUtils.equals("sticker", shareCompleteEvent.itemType)) {
            C43091ed.m136696a(getActivity(), this.mHeadLayout, shareCompleteEvent);
        }
    }

    /* renamed from: b */
    private void m133158b(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.mTextStickerInfo.setVisibility(0);
            ((IFestivalService) ServiceManager.get().getService(IFestivalService.class)).setTextForChallengeDesc(str, this.mTextStickerInfo, this.mVpExpandContainer, this.txtDisclaimer, this.ivDisclaimer, true);
            return;
        }
        this.mTextStickerInfo.setVisibility(8);
    }

    /* renamed from: c */
    private void m133161c(String str) {
        if (!C6399b.m19944t() && this.f108905Q && this.f108906R) {
            if (getActivity() != null) {
                this.f108904P = C26051c.m85573a(this.mCollectView, getActivity(), "prop_page", "prop", str, false);
            }
            this.f108906R = false;
            this.f108905Q = false;
        }
    }

    /* renamed from: e */
    private static void m133163e(View view) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", new float[]{0.0f, 1.0f});
        ofFloat.setDuration(500);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.start();
    }

    /* renamed from: b */
    private List<C26060f> m133157b(NewFaceStickerListBean newFaceStickerListBean) {
        boolean z;
        this.f68822D = new ArrayList(newFaceStickerListBean.mStickers.size() - 1);
        for (NewFaceStickerBean newFaceStickerBean : newFaceStickerListBean.mStickers) {
            C0608j childFragmentManager = getChildFragmentManager();
            StringBuilder sb = new StringBuilder();
            sb.append(AbstractDetailFragment.f68818r);
            sb.append(newFaceStickerBean.f108868id);
            Object obj = (C26060f) childFragmentManager.mo2644a(sb.toString());
            if (obj == null) {
                obj = DetailAwemeListFragment.m77807a(15, "sticker_prop_detail", newFaceStickerBean.f108868id, this.f108915i, new StickerDetailAwemeListProvider());
            }
            if (obj instanceof DetailAwemeListFragment) {
                DetailAwemeListFragment detailAwemeListFragment = (DetailAwemeListFragment) obj;
                if (this.f68820B == 0) {
                    z = true;
                } else {
                    z = false;
                }
                detailAwemeListFragment.f62597p = z;
                detailAwemeListFragment.f62598q = true;
            }
            this.f68822D.add(obj);
        }
        return this.f68822D;
    }

    /* renamed from: c */
    private void m133160c(NewFaceStickerListBean newFaceStickerListBean) {
        this.f108919m = newFaceStickerListBean;
        m133167i();
        m133159c((NewFaceStickerBean) newFaceStickerListBean.mStickers.get(0));
        ((NewFaceStickerBean) newFaceStickerListBean.mStickers.get(0)).mIsSelect = true;
        if (newFaceStickerListBean.mStickers.size() == 1) {
            this.gridView.setVisibility(8);
            this.mTopLineView.setVisibility(8);
            return;
        }
        this.gridView.setVisibility(0);
        this.mTopLineView.setVisibility(0);
        this.f108921o.mo102892a(newFaceStickerListBean.mStickers);
        this.gridView.setNumColumns(newFaceStickerListBean.mStickers.size());
        int b = (int) C9738o.m28708b((Context) getActivity(), 42.0f);
        int b2 = (int) C9738o.m28708b((Context) getActivity(), 16.0f);
        int size = newFaceStickerListBean.mStickers.size();
        this.gridView.setLayoutParams(new LayoutParams((b * size) + ((size - 1) * b2) + (b2 * 2), -2));
    }

    /* renamed from: d */
    private void m133162d(final NewFaceStickerBean newFaceStickerBean) {
        if (this.f108920n == null) {
            this.f108920n = (ViewGroup) this.mVsOriginalMusic.inflate();
        }
        ViewGroup.LayoutParams layoutParams = this.f108920n.getLayoutParams();
        layoutParams.height = (int) C9738o.m28708b(getContext(), 64.0f);
        this.f108920n.setLayoutParams(layoutParams);
        m133156a(true, newFaceStickerBean);
        this.f108920n.setOnTouchListener(new C33936al() {
            /* renamed from: b */
            public final void mo86504b(View view, MotionEvent motionEvent) {
                StickerPropDetailFragment.m133156a(false, newFaceStickerBean);
                StickerPropDetailFragment.this.mo29173d();
            }
        });
        AvatarImageWithVerify avatarImageWithVerify = (AvatarImageWithVerify) this.f108920n.findViewById(R.id.b9u);
        avatarImageWithVerify.setPlaceHolder(R.color.ee);
        avatarImageWithVerify.mo60895a(newFaceStickerBean.avatarThumb, 3);
        TextView textView = (TextView) this.f108920n.findViewById(R.id.dqn);
        if (C6399b.m19944t()) {
            textView.getPaint().setFakeBoldText(true);
        }
        textView.setText(newFaceStickerBean.ownerName);
        if (C6399b.m19944t()) {
            avatarImageWithVerify.mo60896b();
            C43126fg.m136801a(getContext(), "3", "", textView);
        }
        this.f108920n.setVisibility(0);
    }

    /* renamed from: e */
    private void m133164e(final NewFaceStickerBean newFaceStickerBean) {
        if (!C6399b.m19944t() || !C29132a.m95560a()) {
            this.activityBannerContainer.setVisibility(8);
            return;
        }
        final C30221c g = C29132a.m95572g();
        if (!(g == null || g.f79529s == null || g.f79520j == null || !g.f79520j.contains(newFaceStickerBean.f108868id))) {
            if (!TextUtils.isEmpty(g.f79524n)) {
                this.detailPageInfo.setVisibility(0);
                this.activityBannerContainer.setVisibility(0);
                this.detailPageInfo.setText(g.f79524n);
            } else {
                this.detailPageInfo.setVisibility(8);
            }
            this.activityBannerBg.setVisibility(0);
            C12133n.m35301a(g.f79529s.f79532a).mo29845a("StickerPropDetailFragment").mo29842a(m133150a(getContext())).mo29844a((C12128i) this.activityBannerBg).mo29848a();
            C6907h.m21524a("xmas_banner_show", (Map) C22984d.m75611a().mo59973a("enter_from", "prop_page").mo59973a("gen", C29132a.m95567d()).mo59973a("prop_id", newFaceStickerBean.f108868id).f60753a);
            this.activityBannerContainer.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    C29135b.m95580a(StickerPropDetailFragment.this.getContext(), g.f79529s.f79533b);
                    C6907h.m21524a("xmas_banner_click", (Map) C22984d.m75611a().mo59973a("enter_from", "prop_page").mo59973a("gen", C29132a.m95567d()).mo59973a("prop_id", newFaceStickerBean.f108868id).f60753a);
                }
            });
            this.activityBannerContainer.setVisibility(0);
        }
    }

    public void click(View view) {
        int id = view.getId();
        if (id == R.id.jo) {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.finish();
            }
            return;
        }
        if (id == R.id.da5) {
            if (TimeLockRuler.isTeenModeON()) {
                C10761a.m31409e((Context) getActivity(), (int) R.string.e5p).mo25750a();
            } else if (!((IStickerUtilsService) this.f108912f.mo44946a()).showCommerceStickerDialog(view.getContext(), this.f108911e, "prop_collection")) {
                m133169k();
            }
        } else if (id == R.id.db8) {
            mo29191e();
        } else if (id == R.id.d4t) {
            new C33267i().mo85268d("prop_page").mo85269e("prop_page").mo85272g(this.f108911e.f108868id).mo85273i(C28199ae.m92689a().mo71791a(C33230ac.m107232i(this.f108901M))).mo85274j(this.f108901M).mo85265b(1009).mo85252e();
            m133171o();
        } else if (id == R.id.bk1) {
            mo29173d();
        }
    }

    /* renamed from: c */
    private void m133159c(NewFaceStickerBean newFaceStickerBean) {
        if (newFaceStickerBean != null) {
            C23323e.m76524b(this.coverImgView, newFaceStickerBean.iconUrl);
            CommerceSticker commerceSticker = newFaceStickerBean.commerceSticker;
            ServiceManager.get().getService(IFestivalService.class);
            if (commerceSticker != null) {
                m133154a(newFaceStickerBean, commerceSticker);
            } else {
                this.lockImageView.setVisibility(8);
                m133168j();
                this.mTextStickerInfo.setVisibility(8);
                this.mLayoutStickerUrl.setVisibility(8);
                this.mAdOwnerLL.setVisibility(8);
            }
            this.titleTextView.setText(newFaceStickerBean.name);
            if (!TextUtils.isEmpty(newFaceStickerBean.ownerName)) {
                this.nickNameTextView.setText(newFaceStickerBean.ownerName);
                this.mStickerOwnerProfileView.setVisibility(0);
                if (TextUtils.isEmpty(newFaceStickerBean.ownerId)) {
                    this.mArrowImg.setVisibility(8);
                } else {
                    this.mArrowImg.setVisibility(0);
                }
                int a = C6384b.m19835a().mo15287a(StickerPropOwnerAb.class, true, "sticker_owner_ab", C6384b.m19835a().mo15295d().sticker_owner_ab, 0);
                if (!TextUtils.equals(newFaceStickerBean.ownerId, "96972139640")) {
                    if (a == 2) {
                        m133162d(newFaceStickerBean);
                    } else if (a == 3) {
                        this.nickNamePrefix.setVisibility(0);
                        StringBuilder sb = new StringBuilder();
                        sb.append(getText(R.string.d8r));
                        sb.append("：");
                        this.nickNamePrefix.setText(sb.toString());
                        this.mArrowImg.setImageResource(R.drawable.aio);
                        this.avarMini.setVisibility(0);
                        this.ownerCellBottomLine.setVisibility(0);
                        this.usedCountTextView.setTextSize(11.0f);
                        this.nickNameTextView.setTextColor(getContext().getResources().getColor(R.color.a4z));
                        this.avarMini.mo60895a(newFaceStickerBean.avatarThumb, 3);
                        ((MarginLayoutParams) this.mCollectView.getLayoutParams()).topMargin = C23486n.m77122a(8.0d);
                    }
                }
            } else {
                this.mStickerOwnerProfileView.setVisibility(8);
            }
            this.usedCountTextView.setText(C1642a.m8034a(getActivity().getString(R.string.ci4), new Object[]{C30537o.m99741b(newFaceStickerBean.userCount)}));
            this.f68830u.setText(newFaceStickerBean.name);
            this.f108911e = newFaceStickerBean;
            this.f68832w.setCurrentItem(this.f108921o.f108886b);
            ((C26060f) this.f68822D.get(this.f108921o.f108886b)).mo61748d();
            mo102902a(newFaceStickerBean);
            C6907h.m21524a("prop_select", (Map) C22984d.m75611a().mo59973a("prop_id", newFaceStickerBean.f108868id).mo59973a("enter_from", "prop_page").f60753a);
            m133163e(this.mInfoView);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo86485b(View view) {
        if (((double) view.getAlpha()) >= 1.0E-6d) {
            C6907h.m21524a("click_prop_maker_entrance", (Map) C22984d.m75611a().mo59973a("prop_id", this.f108911e.f108868id).mo59973a("enter_from", "prop_page").f60753a);
            m133152a(getContext(), (String) SharePrefCache.inst().getStickerArtlistUrl().mo59877d());
        }
    }

    /* renamed from: a */
    private void m133155a(String str) {
        mo29060a().setController(((C13382e) ((C13382e) C13380c.m39166a().mo32729b(mo29060a().getController())).mo32743a((C13401d<? super INFO>) new C13401d<C13648f>() {
            public final void onFailure(String str, Throwable th) {
            }

            public final void onIntermediateImageFailed(String str, Throwable th) {
            }

            public final /* bridge */ /* synthetic */ void onIntermediateImageSet(String str, Object obj) {
            }

            public final void onRelease(String str) {
            }

            public final void onSubmit(String str, Object obj) {
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onFinalImageSet(String str, C13648f fVar, Animatable animatable) {
                if (StickerPropDetailFragment.this.getContext() != null && fVar != null && fVar.getWidth() != 0 && fVar.getHeight() != 0) {
                    StickerPropDetailFragment.this.mo29060a().setLayoutParams(new FrameLayout.LayoutParams((int) ((C9738o.m28708b(StickerPropDetailFragment.this.getContext(), 25.0f) * ((float) fVar.getWidth())) / ((float) fVar.getHeight())), (int) C9738o.m28708b(StickerPropDetailFragment.this.getContext(), 25.0f)));
                }
            }
        })).mo32713b(Uri.parse(str)).mo32730f());
    }

    /* renamed from: b */
    public final void mo102909b(NewFaceStickerBean newFaceStickerBean) {
        C42961az.m136380a(new C35670h());
        C7705c.m23799a().mo20394d(new C27742a(newFaceStickerBean));
        if (newFaceStickerBean.isFavorite) {
            this.f108905Q = true;
            m133161c(newFaceStickerBean.f108868id);
            return;
        }
        C10761a.m31383a((Context) C6405d.m19984g(), (int) R.string.wf).mo25750a();
    }

    /* renamed from: a */
    private static void m133152a(Context context, String str) {
        Intent intent = new Intent(context, CrossPlatformActivity.class);
        intent.setData(Uri.parse(str));
        intent.putExtra("use_webview_title", true);
        context.startActivity(intent);
    }

    /* renamed from: a */
    static final /* synthetic */ void m133153a(CommerceSticker commerceSticker, View view) {
        C6907h.m21524a("click_aduser_head", (Map) new C22984d().mo59973a("enter_from", "prop_page").mo59973a("to_user_id", commerceSticker.getAdOwnerId()).mo59973a("prop_id", commerceSticker.getId()).f60753a);
        C6907h.m21524a("enter_personal_detail", (Map) new C22984d().mo59973a("enter_from", "prop_page").mo59973a("to_user_id", commerceSticker.getAdOwnerId()).mo59973a("prop_id", commerceSticker.getId()).f60753a);
        C7195s a = C7195s.m22438a();
        StringBuilder sb = new StringBuilder("aweme://user/profile/");
        sb.append(commerceSticker.getAdOwnerId());
        a.mo18682a(sb.toString());
    }

    /* renamed from: b */
    public final void mo61702b(int i, int i2) {
        super.mo61702b(i, i2);
        if (this.f108904P != null && this.f108904P.isShowing()) {
            this.f108904P.dismiss();
        }
        if (this.f108923q == 0.0f) {
            if (this.mStickerOwnerProfileView.getVisibility() == 0) {
                this.f108923q = (float) (this.mStickerOwnerProfileView.getBottom() - this.f68831v.getBottom());
            } else if (this.titleTextView.getVisibility() == 0) {
                this.f108923q = (float) (this.titleTextView.getBottom() - this.f68831v.getBottom());
            }
        }
        if (this.f108922p == 0.0f) {
            this.f108922p = (float) (this.mHeadLayout.getBottom() - this.f68831v.getBottom());
        }
        float f = (float) i;
        float f2 = (f - this.f108923q) / (this.f108922p - this.f108923q);
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        this.f68831v.setAlpha(f2);
        if (C6399b.m19944t()) {
            this.f68830u.setAlpha(f2);
            this.mHeadLayout.setAlpha(1.0f - (f / this.f108922p));
            this.f68830u.setTypeface(Typeface.DEFAULT_BOLD);
        } else {
            this.f68830u.setAlpha(f2 * f2 * f2);
            this.mHeadLayout.setAlpha((float) Math.pow((double) (1.0f - (f / this.f108922p)), 3.0d));
        }
        mo29060a().setAlpha(1.0f - f2);
    }

    /* renamed from: a */
    private void m133154a(NewFaceStickerBean newFaceStickerBean, CommerceSticker commerceSticker) {
        C23323e.m76524b(this.coverImgView, newFaceStickerBean.iconUrl);
        this.coverImgView.setVisibility(0);
        this.lockImageView.setVisibility(8);
        m133168j();
        this.mTextStickerInfo.setVisibility(0);
        this.mTextStickerInfo.setTextColor(getResources().getColor(R.color.a53));
        this.txtDisclaimer.setTextColor(getResources().getColor(R.color.a51));
        m133158b(commerceSticker.getDetailDesc());
        this.mBottomLineView.setVisibility(0);
        String detailLetters = commerceSticker.getDetailLetters();
        if (TextUtils.isEmpty(detailLetters)) {
            this.mLayoutStickerUrl.setVisibility(8);
        } else {
            C6907h.m21524a("show_link", (Map) new C22984d().mo59973a("enter_from", "prop_page").mo59973a("type", "web_link").mo59973a("prop_id", commerceSticker.getId()).f60753a);
            this.mLayoutStickerUrl.setVisibility(0);
            this.mTextStickerUrl.setText(detailLetters);
            if (C6399b.m19946v()) {
                this.mTextStickerUrl.setTextColor(getResources().getColor(R.color.lj));
            } else {
                this.mTextStickerUrl.setTextColor(getResources().getColor(R.color.a4v));
            }
            this.mTextStickerUrl.setOnClickListener(new C41884f(this, commerceSticker));
        }
        String adOwnerName = commerceSticker.getAdOwnerName();
        if (TextUtils.isEmpty(adOwnerName)) {
            this.mAdOwnerLL.setVisibility(8);
            return;
        }
        C6907h.m21524a("show_aduser_head", (Map) new C22984d().mo59973a("enter_from", "prop_page").mo59973a("to_user_id", commerceSticker.getAdOwnerId()).mo59973a("prop_id", commerceSticker.getId()).f60753a);
        this.mAdOwnerLL.setVisibility(0);
        this.mAdNickNameTv.setText(adOwnerName);
        this.mAdOwnerLL.setOnClickListener(new C41885g(commerceSticker));
    }

    public void onViewCreated(View view, Bundle bundle) {
        int i;
        super.onViewCreated(view, bundle);
        if (!C41888j.m133224a(getActivity())) {
            C10761a.m31399c((Context) getActivity(), (int) R.string.cjs).mo25750a();
        }
        ((IAVService) ServiceManager.get().getService(IAVService.class)).unLockStickerManagerService().updateUnlockedIdsFromNet(null);
        this.f108917k = new C41862a(this.f108908T);
        this.f108917k.mo66537a(this);
        MtEmptyView a = MtEmptyView.m31657a(getContext());
        if (C6399b.m19944t()) {
            a.setStatus(new C10806a(getContext()).mo25985a((int) R.drawable.a0i).mo25990b((int) R.string.azg).mo25993c(R.string.azf).f29135a);
        } else {
            a.setStatus(new C10806a(getContext()).mo25990b((int) R.string.azg).mo25993c(R.string.azf).f29135a);
        }
        this.mStatusView.setBuilder(C10803a.m31631a(getContext()).mo25963b((View) a).mo25964b(C43361b.m137644a(getContext(), new C41880b(this))));
        this.mCollectView.setVisibility(0);
        this.ivCollect.setOnStateChangeListener(new C33833a() {
            /* renamed from: a */
            public final void mo61810a() {
            }

            /* renamed from: a */
            public final void mo61811a(int i) {
                if (i == 1) {
                    StickerPropDetailFragment.this.mo102902a(StickerPropDetailFragment.this.f108911e);
                }
            }
        });
        View view2 = this.mBottomLineView;
        if (C6399b.m19946v()) {
            i = 0;
        } else {
            i = 8;
        }
        view2.setVisibility(i);
        this.f68830u.setAlpha(0.0f);
        this.f68830u.setOnClickListener(new C41881c(this));
        this.f108921o = new C41858a(getActivity());
        this.gridView.setAdapter(this.f108921o);
        this.gridView.setOnItemClickListener(new C41882d(this));
        if (C6399b.m19944t()) {
            this.mStartRecodeLayout.setVisibility(8);
        }
        m133166g();
        if (C6399b.m19944t()) {
            ((C27481e) this.f108908T.mo44946a()).mo70630a((String) this.f108907S.get(0), null, new C43760j() {
                /* renamed from: b */
                public final void mo9282b(Effect effect) {
                }

                /* renamed from: a */
                public final void mo9280a(Effect effect) {
                    if (StickerPropDetailFragment.this.mStartRecodeLayout != null) {
                        StickerPropDetailFragment.this.mStartRecodeLayout.setVisibility(0);
                    }
                    if (!((IStickerUtilsService) StickerPropDetailFragment.this.f108912f.mo44946a()).isLockSticker(effect)) {
                        return;
                    }
                    if ((!C6861a.m21337f().isLogin() && !((IStickerUtilsService) StickerPropDetailFragment.this.f108912f.mo44946a()).isCommerceLockSticker(effect)) || !((IStickerUtilsService) StickerPropDetailFragment.this.f108912f.mo44946a()).hasUnlocked(effect)) {
                        StickerPropDetailFragment.this.f108913g = true;
                        StickerPropDetailFragment.this.mo102907a(StickerPropDetailFragment.this.f108913g);
                    }
                }

                /* renamed from: a */
                public final void mo9281a(Effect effect, C43726c cVar) {
                    if (StickerPropDetailFragment.this.mStartRecodeLayout != null) {
                        StickerPropDetailFragment.this.mStartRecodeLayout.setVisibility(0);
                    }
                }
            });
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo102908b(CommerceSticker commerceSticker, View view) {
        C6907h.m21524a("click_link", (Map) new C22984d().mo59973a("enter_from", "prop_page").mo59973a("type", "web_link").mo59973a("prop_id", commerceSticker.getId()).f60753a);
        if (!C25371n.m83463a(getContext(), commerceSticker.getDetailOpenUrl(), false)) {
            C25371n.m83459a(getContext(), commerceSticker.getDetailWebUrl(), commerceSticker.getDetailWebUrlTitle());
        }
    }

    /* renamed from: a */
    public static void m133156a(boolean z, NewFaceStickerBean newFaceStickerBean) {
        Map<String, String> map = C22984d.m75611a().mo59973a("prop_id", newFaceStickerBean.f108868id).mo59973a("author_id", newFaceStickerBean.ownerId).mo59973a("enter_from", "prop_page").f60753a;
        if (z) {
            C6907h.m21524a("prop_creator_show", (Map) map);
        } else {
            C6907h.m21524a("click_creator_prop", (Map) map);
        }
    }

    /* renamed from: a */
    public static StickerPropDetailFragment m133151a(ArrayList<String> arrayList, String str, String str2, String str3, String str4, AVMusic aVMusic, Serializable serializable) {
        Bundle bundle = new Bundle(3);
        bundle.putStringArrayList("extra_stickers", arrayList);
        bundle.putString("aweme_id", str);
        bundle.putString("extra_music_from", str2);
        bundle.putString("extra_sticker_from", str3);
        bundle.putSerializable("sticker_music", aVMusic);
        bundle.putSerializable("music_model", serializable);
        bundle.putString("extra_log_pb", str4);
        StickerPropDetailFragment stickerPropDetailFragment = new StickerPropDetailFragment();
        stickerPropDetailFragment.setArguments(bundle);
        return stickerPropDetailFragment;
    }
}
