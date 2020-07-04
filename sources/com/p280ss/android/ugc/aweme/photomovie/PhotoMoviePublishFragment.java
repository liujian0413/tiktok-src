package com.p280ss.android.ugc.aweme.photomovie;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.arch.lifecycle.C0069x;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.content.C0683b;
import android.support.p022v4.util.C0902i;
import android.text.TextUtils;
import android.transition.AutoTransition;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.apm.agent.instrumentation.FragmentInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.NullValueException;
import com.bytedance.ies.dmt.p262ui.common.views.CommonItemView;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.account.C21164d.C21165a;
import com.p280ss.android.ugc.aweme.account.model.C22200c;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.base.utils.C23482j;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.C6909j;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.common.ShareContext;
import com.p280ss.android.ugc.aweme.draft.model.C27309a;
import com.p280ss.android.ugc.aweme.draft.model.C27311c;
import com.p280ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.i18n.C30538p;
import com.p280ss.android.ugc.aweme.p1001al.C22488a;
import com.p280ss.android.ugc.aweme.photo.publish.C34788e;
import com.p280ss.android.ugc.aweme.photomovie.edit.C34871c;
import com.p280ss.android.ugc.aweme.port.p1479in.C35541ai.C35542a;
import com.p280ss.android.ugc.aweme.port.p1479in.C35544ak.C35545a;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.property.AVAB.Property;
import com.p280ss.android.ugc.aweme.property.C36964i;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.services.publish.AVPublishContentType;
import com.p280ss.android.ugc.aweme.services.publish.AVPublishExtensionUtils;
import com.p280ss.android.ugc.aweme.services.publish.ExtensionDataRepo;
import com.p280ss.android.ugc.aweme.services.publish.ExtensionMisc;
import com.p280ss.android.ugc.aweme.services.publish.GoodsPublishModel;
import com.p280ss.android.ugc.aweme.services.publish.IAVPublishExtension;
import com.p280ss.android.ugc.aweme.services.publish.MobParam;
import com.p280ss.android.ugc.aweme.services.publish.PoiPublishModel;
import com.p280ss.android.ugc.aweme.services.publish.Publish;
import com.p280ss.android.ugc.aweme.services.publish.PublishOutput;
import com.p280ss.android.ugc.aweme.services.publish.SeedPublishModel;
import com.p280ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.p280ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.p280ss.android.ugc.aweme.shortvideo.C38458ar;
import com.p280ss.android.ugc.aweme.shortvideo.C38543br;
import com.p280ss.android.ugc.aweme.shortvideo.C38581cj;
import com.p280ss.android.ugc.aweme.shortvideo.C39319cy;
import com.p280ss.android.ugc.aweme.shortvideo.C39320cz;
import com.p280ss.android.ugc.aweme.shortvideo.C39360dw;
import com.p280ss.android.ugc.aweme.shortvideo.C39361dx;
import com.p280ss.android.ugc.aweme.shortvideo.C39799ej;
import com.p280ss.android.ugc.aweme.shortvideo.C39810eq;
import com.p280ss.android.ugc.aweme.shortvideo.C39955gf;
import com.p280ss.android.ugc.aweme.shortvideo.C40005j;
import com.p280ss.android.ugc.aweme.shortvideo.edit.C39513bb;
import com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.MainBusinessContext;
import com.p280ss.android.ugc.aweme.shortvideo.model.AVTextExtraStruct;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.C41388n;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.PermissionSettingItem;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.VideoPublishFragment;
import com.p280ss.android.ugc.aweme.shortvideo.publish.C40229a;
import com.p280ss.android.ugc.aweme.shortvideo.publish.C40230b;
import com.p280ss.android.ugc.aweme.shortvideo.publish.C40233e;
import com.p280ss.android.ugc.aweme.shortvideo.view.HashTagMentionEditText;
import com.p280ss.android.ugc.aweme.tools.extension.C42311e;
import com.p280ss.android.ugc.aweme.tools.extension.Scene;
import com.p280ss.android.ugc.aweme.utils.C42939as;
import com.p280ss.android.ugc.aweme.utils.KeyBoardMonitor.C42902a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.photomovie.PhotoMoviePublishFragment */
public class PhotoMoviePublishFragment extends Fragment implements OnClickListener, C35542a, C38581cj {

    /* renamed from: a */
    public PhotoMovieContext f90878a;

    /* renamed from: b */
    C40230b f90879b = new C40230b();

    /* renamed from: c */
    C39955gf f90880c;

    /* renamed from: d */
    C39320cz f90881d;

    /* renamed from: e */
    LinearLayout f90882e;

    /* renamed from: f */
    C38543br f90883f;

    /* renamed from: g */
    ImageView f90884g;

    /* renamed from: h */
    FrameLayout f90885h;

    /* renamed from: i */
    C39361dx f90886i;

    /* renamed from: j */
    C40233e f90887j;

    /* renamed from: k */
    public boolean f90888k;

    /* renamed from: l */
    OnTouchListener f90889l = new C34928l(this);

    /* renamed from: m */
    private PermissionSettingItem f90890m;

    /* renamed from: n */
    private CommonItemView f90891n;

    /* renamed from: o */
    private CommonItemView f90892o;

    /* renamed from: p */
    private View f90893p;

    /* renamed from: q */
    private ShareContext f90894q;

    /* renamed from: r */
    private long f90895r;

    /* renamed from: s */
    private TextView f90896s;

    /* renamed from: t */
    private TextView f90897t;

    /* renamed from: u */
    private HashTagMentionEditText f90898u;

    /* renamed from: v */
    private Handler f90899v;

    /* renamed from: w */
    private CheckBox f90900w;

    /* renamed from: x */
    private FrameLayout f90901x;

    /* renamed from: y */
    private List<C0902i<Class<?>, IAVPublishExtension<?>>> f90902y = C35563c.f93257t.mo83275a(AVPublishContentType.PhotoMovie);

    /* renamed from: f */
    public final boolean mo88236f() {
        return false;
    }

    /* renamed from: g */
    public final void mo88237g() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public final /* synthetic */ void mo88373h() {
        this.f90888k = true;
    }

    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        FragmentInstrumentation.onHiddenChanged(this, z);
    }

    public void onPause() {
        super.onPause();
        FragmentInstrumentation.onPause(this);
    }

    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        FragmentInstrumentation.setUserVisibleHint(this, z);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ boolean mo88368a(View view, MotionEvent motionEvent) {
        C39513bb.m126207a(getActivity());
        return false;
    }

    /* renamed from: j */
    private void m112350j() {
        this.f90893p.setOnClickListener(this);
    }

    /* renamed from: e */
    public final String mo88235e() {
        return this.f90880c.mo99390d();
    }

    /* renamed from: l */
    private void m112352l() {
        this.f90878a.getPhotoMovieCover(new C34933q(this));
    }

    /* renamed from: c */
    public final boolean mo88372c() {
        if (this.f90878a == null || !this.f90878a.isPoiOrderRate()) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    private void m112349i() {
        this.f90878a = (PhotoMovieContext) getActivity().getIntent().getParcelableExtra("photo_movie_context");
    }

    /* renamed from: k */
    private void m112351k() {
        C22200c e = C35563c.f93260w.mo57092e();
        if (e != null && e.mo58561d()) {
            this.f90886i.f102257a.mo83253d().setVisibility(8);
        }
    }

    /* renamed from: o */
    private void m112355o() {
        if (this.f90887j != null) {
            this.f90878a.commentSetting = this.f90887j.mo100023a(this.f90892o);
            this.f90878a.allowDownloadSetting = this.f90887j.mo100030c();
        }
    }

    /* renamed from: d */
    public final String mo88234d() {
        if (this.f90878a == null) {
            return null;
        }
        return this.f90878a.commerceData;
    }

    /* renamed from: m */
    private void m112353m() {
        this.f90878a.setMainBusinessData(MainBusinessContext.updateSDKShareContextWhenSaveOrPost(this.f90878a.mIsFromDraft, this.f90878a.getMainBusinessData()));
        this.f90894q = (ShareContext) C35563c.f93220B.getRetrofitFactoryGson().mo15974a(MainBusinessContext.getShareContext(this.f90878a.getMainBusinessData()), ShareContext.class);
    }

    /* renamed from: n */
    private HashMap<String, String> m112354n() {
        if (this.f90878a == null) {
            return null;
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("creation_id", this.f90878a.creationId);
        hashMap.put("enter_from", "video_post_page");
        hashMap.put("content_type", "photo");
        hashMap.put("shoot_way", this.f90878a.mShootWay);
        return hashMap;
    }

    public void onDestroyView() {
        m112343a(getView(), (OnTouchListener) null);
        super.onDestroyView();
        this.f90886i.mo97947c();
        for (C0902i iVar : this.f90902y) {
            ((IAVPublishExtension) iVar.f3155b).onDestroy();
        }
    }

    public void onResume() {
        FragmentInstrumentation.onResume(this);
        super.onResume();
        for (C0902i iVar : this.f90902y) {
            ((IAVPublishExtension) iVar.f3155b).onResume();
        }
    }

    /* renamed from: b */
    public final PhotoMovieContext mo88369b() {
        this.f90880c.mo99388c();
        this.f90878a.title = this.f90880c.mo99390d();
        if (this.f90880c.mo99391e() != null) {
            this.f90878a.structList = this.f90880c.mo99391e();
        }
        this.f90878a.isPrivate = this.f90881d.mo97880a();
        if (this.f90879b.mo100022a() != null) {
            this.f90878a.challenges = Collections.singletonList(this.f90879b.f104548a);
        }
        PoiPublishModel poiPublishModel = (PoiPublishModel) AVPublishExtensionUtils.findModel(this.f90902y, PoiPublishModel.class);
        if (poiPublishModel != null) {
            this.f90878a.poiId = poiPublishModel.getPoiContext();
        }
        if (TextUtils.isEmpty(this.f90878a.mFinalVideoTmpPath)) {
            this.f90878a.mFinalVideoTmpPath = C39810eq.m127462b("-concat-v");
        }
        for (C0902i iVar : this.f90902y) {
            ((IAVPublishExtension) iVar.f3155b).onBackPressed(C34862b.m112408a(this.f90878a));
        }
        return this.f90878a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo88363a() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        if (getActivity() != null) {
            getActivity().finish();
            C42311e.m134571a(C40005j.m127910a((BaseShortVideoContext) this.f90878a), C40005j.m127911b((BaseShortVideoContext) this.f90878a), Scene.PUBLISH, Scene.SEND_REQUEST);
            this.f90878a.mOutputVideoPath = C39810eq.m127462b(".mp4");
            PhotoMovieContext photoMovieContext = this.f90878a;
            if (this.f90878a.mMusicPath == null) {
                str = "";
            } else {
                str = C39810eq.m127462b(".wav");
            }
            photoMovieContext.mInputAudioPath = str;
            this.f90878a.mSyncPlatforms = this.f90886i.mo97941a();
            this.f90878a.userClickPublishTime = this.f90895r;
            Bundle bundle = new Bundle();
            bundle.putInt("video_type", 0);
            bundle.putParcelable("photo_movie_publish_args", this.f90878a);
            bundle.putString("shoot_way", this.f90878a.mShootWay);
            IAVService iAVService = (IAVService) ServiceManager.get().getService(IAVService.class);
            Publish.PublishBundle = bundle;
            iAVService.getPublishService().startPublish(getActivity(), bundle);
            C6907h.onEvent(MobClick.obtain().setEventName("publish").setLabelName("submit"));
            for (C0902i iVar : this.f90902y) {
                ((IAVPublishExtension) iVar.f3155b).onPublish(C34862b.m112408a(this.f90878a));
            }
            PoiPublishModel poiPublishModel = (PoiPublishModel) AVPublishExtensionUtils.findModel(this.f90902y, PoiPublishModel.class);
            SeedPublishModel seedPublishModel = (SeedPublishModel) AVPublishExtensionUtils.findModel(this.f90902y, SeedPublishModel.class);
            C22984d a = C22984d.m75611a().mo59973a("creation_id", this.f90878a.creationId).mo59973a("shoot_way", this.f90878a.mShootWay).mo59973a("filter_list", this.f90878a.mFilterName).mo59970a("filter_id_list", this.f90878a.mFilterId).mo59973a("prop_selected_from", this.f90878a.getPropSource()).mo59970a("draft_id", this.f90878a.draftId);
            String str8 = "music_selected_from";
            if (this.f90878a.musicOrigin == null) {
                str2 = "original";
            } else {
                str2 = this.f90878a.musicOrigin;
            }
            C22984d a2 = a.mo59973a(str8, str2).mo59973a("content_type", "slideshow").mo59973a("content_source", "upload").mo59973a("enter_from", "video_post_page").mo59973a("from_group_id", C38458ar.m122943a());
            String str9 = "seed_id";
            if (seedPublishModel != null) {
                str3 = seedPublishModel.getSeedId();
            } else {
                str3 = "0";
            }
            C22984d a3 = a2.mo59973a(str9, str3);
            String str10 = "seed_name";
            if (seedPublishModel != null) {
                str4 = seedPublishModel.getSeedName();
            } else {
                str4 = "";
            }
            C22984d a4 = a3.mo59973a(str10, str4);
            String str11 = "refer_seed_id";
            if (seedPublishModel != null) {
                str5 = seedPublishModel.getReferSeedId();
            } else {
                str5 = "";
            }
            C22984d a5 = a4.mo59973a(str11, str5);
            String str12 = "refer_seed_name";
            if (seedPublishModel != null) {
                str6 = seedPublishModel.getReferSeedName();
            } else {
                str6 = "";
            }
            C22984d a6 = a5.mo59973a(str12, str6);
            String str13 = "data_type";
            if (seedPublishModel != null) {
                str7 = seedPublishModel.getDataType();
            } else {
                str7 = "";
            }
            Map<String, String> map = a6.mo59973a(str13, str7).f60753a;
            if (poiPublishModel != null) {
                map.putAll(poiPublishModel.getMobParams());
                this.f90878a.poiServerMobParam = poiPublishModel.getServerMobParams();
            }
            C6907h.m21524a("publish", (Map) map);
            C6907h.m21524a("performance_publish", (Map) new C22984d().mo59973a("creation_id", this.f90878a.creationId).mo59973a("content_type", "slideshow").mo59970a("video_type", 6).mo59970a("video_upload_type", 0).f60753a);
            if (this.f90878a.isSaveLocal()) {
                C6907h.m21524a("download", (Map) new C22984d().mo59970a("scene_id", (int) LiveRoomStruct.ROOM_LONGTIME_NO_NET).mo59973a("group_id", "").mo59973a("enter_from", "video_post_page").mo59973a("download_type", "self").mo59973a("download_method", "download_with_publish").f60753a);
            }
        }
    }

    /* renamed from: a */
    public final void mo88367a(Object obj) {
        this.f90888k = true;
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo88364a(Bitmap bitmap) {
        this.f90884g.setImageBitmap(bitmap);
    }

    /* renamed from: d */
    private void m112346d(View view) {
        this.f90893p = view.findViewById(R.id.ab8);
    }

    /* renamed from: a */
    public static PhotoMoviePublishFragment m112342a(PhotoMovieContext photoMovieContext) {
        PhotoMoviePublishFragment photoMoviePublishFragment = new PhotoMoviePublishFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("photo_movie_context", photoMovieContext);
        photoMoviePublishFragment.setArguments(bundle);
        return photoMoviePublishFragment;
    }

    /* renamed from: e */
    private void m112347e(View view) {
        view.findViewById(R.id.vs).setOnClickListener(new C42939as(800) {
            /* renamed from: a */
            private void m112374a() {
                C6907h.m21524a("click_cover_entrance", (Map) C22984d.m75611a().mo59973a("creation_id", PhotoMoviePublishFragment.this.f90878a.creationId).mo59973a("enter_from", "video_post_page").mo59973a("content_type", "photo").mo59973a("shoot_way", PhotoMoviePublishFragment.this.f90878a.mShootWay).mo59973a("content_source", "upload").f60753a);
            }

            /* renamed from: a */
            public final void mo70606a(View view) {
                m112374a();
                PhotoMovieChooseCoverActivity.m112298a(PhotoMoviePublishFragment.this.getActivity(), PhotoMoviePublishFragment.this.f90878a, 4);
            }
        });
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo88371c(View view) {
        PhotoMoviePreViewActivity.m112329a(getActivity(), this.f90884g, this.f90878a);
        C6907h.onEvent(MobClick.obtain().setEventName("preview_cover").setLabelName("edit_page"));
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f90881d.mo97883a(bundle);
        for (C0902i iVar : this.f90902y) {
            ((IAVPublishExtension) iVar.f3155b).onSaveInstanceState(bundle);
        }
        bundle.putSerializable("challenge", this.f90879b.f104548a);
        bundle.putBoolean("contentModified", this.f90888k);
    }

    /* renamed from: f */
    private void m112348f(View view) {
        if (C35563c.f93260w.mo57088a()) {
            this.f90890m.setVisibility(8);
            this.f90897t.setVisibility(8);
            this.f90896s.setVisibility(8);
            this.f90892o.setVisibility(8);
            C23487o.m77146a(false, this.f90891n);
            view.findViewById(R.id.abb).setVisibility(8);
            View findViewById = view.findViewById(R.id.vm);
            findViewById.setVisibility(0);
            findViewById.setOnClickListener(new C34934r(this));
            if (!(this.f90886i == null || this.f90886i.f102257a == null)) {
                this.f90886i.f102257a.mo83253d().setVisibility(8);
            }
            this.f90898u.setHint(R.string.a3d);
            this.f90898u.setMentionTextColor(C0683b.m2912c(getContext(), R.color.a4z));
        }
    }

    /* renamed from: a */
    private void m112345a(boolean z) {
        if (this.f90878a != null) {
            m112355o();
            C35545a b = C35563c.f93252o.mo83224b();
            boolean z2 = true;
            if (this.f90878a.isPrivate != 1) {
                z2 = false;
            }
            b.mo83239a(Boolean.valueOf(z2));
            C27311c a = C34871c.m112429a(this.f90878a);
            C39360dw.m125725a().f102251f = a.mo70221aj();
            C27309a aVar = new C27309a();
            this.f90880c.mo99388c();
            aVar.f71933a = this.f90880c.mo99390d();
            List<AVTextExtraStruct> e = this.f90880c.mo99391e();
            if (e != null) {
                aVar.f71934b = e;
            }
            if (this.f90879b.mo100022a() != null) {
                aVar.f71935c = Collections.singletonList(this.f90879b.f104548a);
            }
            a.f72013A = this.f90881d.mo97880a();
            a.f72033b = aVar;
            C6907h.onEvent(MobClick.obtain().setEventName("publish").setLabelName("save").setJsonObject(new C6909j().mo16966a("shoot_way", getActivity().getIntent().getStringExtra("shoot_way")).mo16967a()));
            C35563c.f93224F.mo70090e().mo90400a(a);
            ((IAVService) ServiceManager.get().getService(IAVService.class)).draftService().notifyDraftUpdate(a);
            for (C0902i iVar : this.f90902y) {
                ((IAVPublishExtension) iVar.f3155b).onSaveDraft(C34862b.m112408a(this.f90878a));
            }
            C35574k.m114859a().mo70090e().mo90402a(a, z);
        }
    }

    public void onClick(View view) {
        ClickInstrumentation.onClick(view);
        if (view.getId() == R.id.ab8) {
            if (!C35563c.f93260w.mo57090c()) {
                C35563c.f93260w.mo57086a((Fragment) this, "photo_movie_post_page", "click_save_draft", (Bundle) null, (C21165a) new C21165a() {
                    /* renamed from: b */
                    public final void mo57094b() {
                    }

                    /* renamed from: a */
                    public final void mo57093a() {
                        if (PhotoMoviePublishFragment.this.f90887j != null) {
                            PhotoMoviePublishFragment.this.f90887j.mo100031d();
                        }
                    }
                });
                return;
            }
            C6907h.m21524a("save_draft", (Map) C22984d.m75611a().mo59973a("creation_id", this.f90878a.creationId).mo59973a("shoot_way", this.f90878a.mShootWay).mo59970a("draft_id", this.f90878a.draftId).mo59973a("content_type", "slideshow").mo59973a("content_source", "upload").mo59973a("enter_from", "video_post_page").f60753a);
            PoiPublishModel poiPublishModel = (PoiPublishModel) AVPublishExtensionUtils.findModel(this.f90902y, PoiPublishModel.class);
            if (poiPublishModel != null) {
                this.f90878a.poiId = poiPublishModel.getPoiContext();
            }
            m112353m();
            m112345a(false);
            C10761a.m31389a((Context) C35563c.f93238a, getString(R.string.dib), 1, 1).mo25750a();
            Intent intent = new Intent();
            if (C35563c.f93231M.mo93305a(Property.EnableOptimizePublishContainerActivityNotInStack) && !C35563c.f93240c.mo83139f()) {
                intent.putExtra("enable_optimize_main_not_in_stack", true);
            }
            intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_DRAFT", true);
            if (this.f90894q != null && !this.f90878a.mIsFromDraft) {
                intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_SHOW_OPEN_SHARE_DIALOG", this.f90894q);
            }
            if (!C35574k.m114859a().mo70110y().mo83122g() || !this.f90878a.mIsFromDraft) {
                intent.addFlags(872415232);
                intent.setClass(getActivity(), C35563c.f93240c.mo83137d());
                startActivity(intent);
            } else {
                intent.setFlags(536870912);
                C22488a.m74376a().mo59046a((Activity) getActivity(), intent);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo88366a(View view) {
        if (!((Boolean) C35563c.f93252o.mo83228d().mo83238a()).booleanValue()) {
            C35563c.f93252o.mo83228d().mo83239a(Boolean.valueOf(true));
            new C10741a(getContext()).mo25649a((int) R.string.b_x).mo25657b((int) R.string.a3b).mo25650a((int) R.string.bxu, (DialogInterface.OnClickListener) null).mo25656a().mo25637a();
            return;
        }
        m112345a(false);
        Intent intent = new Intent(getActivity(), C35563c.f93240c.mo83137d());
        intent.setFlags(872415232);
        intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_DRAFT", true);
        startActivity(intent);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo88370b(View view) {
        if (!C35563c.f93260w.mo57090c()) {
            C35563c.f93260w.mo57086a((Fragment) this, "photo_movie_post_page", "click_post", (Bundle) null, (C21165a) null);
        } else if (C35563c.f93260w.mo57089b()) {
            C10761a.m31409e(getContext(), (int) R.string.e5p).mo25750a();
        } else {
            this.f90895r = SystemClock.uptimeMillis();
            this.f90880c.mo99389c("publish");
            m112353m();
            this.f90880c.mo99388c();
            this.f90878a.title = this.f90880c.mo99390d();
            if (this.f90880c.mo99391e() != null) {
                this.f90878a.structList = this.f90880c.mo99391e();
            }
            GoodsPublishModel goodsPublishModel = (GoodsPublishModel) AVPublishExtensionUtils.findModel(this.f90902y, GoodsPublishModel.class);
            if (goodsPublishModel != null && !TextUtils.isEmpty(goodsPublishModel.getGoodsDraftId())) {
                this.f90878a.shopDraftId = goodsPublishModel.getGoodsDraftId();
            }
            PoiPublishModel poiPublishModel = (PoiPublishModel) AVPublishExtensionUtils.findModel(this.f90902y, PoiPublishModel.class);
            if (poiPublishModel != null) {
                this.f90878a.poiId = poiPublishModel.getPoiContext();
                this.f90878a.latitude = poiPublishModel.getLatitude();
                this.f90878a.longitude = poiPublishModel.getLongitude();
            }
            this.f90878a.isPrivate = this.f90881d.mo97880a();
            this.f90878a.reactDuetSetting = this.f90887j.mo100029b(this.f90891n);
            this.f90878a.commentSetting = this.f90887j.mo100023a(this.f90892o);
            this.f90887j.mo100027a((BaseShortVideoContext) this.f90878a);
            this.f90878a.city = C35563c.f93260w.mo57092e().mo58565h();
            if (this.f90879b.mo100022a() != null) {
                this.f90878a.challenges = Collections.singletonList(this.f90879b.f104548a);
            } else {
                this.f90878a.challenges = null;
            }
            this.f90878a.mSaveModel = C39799ej.m127418a(this.f90878a.mSaveModel, this.f90886i.mo97946b());
            if (this.f90878a.mSaveModel != null) {
                this.f90878a.mSaveModel.setSaveToAlbum(this.f90887j.mo100028a());
                this.f90878a.mSaveModel.setSaveToAppPathInsteadOfAlbum(this.f90887j.f104554e);
                this.f90878a.mSaveModel.setEnableSilentEnhancement(C40233e.m128568f());
            }
            m112345a(true);
            if (VERSION.SDK_INT < 18 || C35563c.f93247j.mo83116a() || C35563c.f93247j.mo83117b()) {
                mo88363a();
                return;
            }
            ((ViewGroup) getActivity().getWindow().getDecorView()).getOverlay().add(this.f90884g);
            float b = C9738o.m28708b((Context) getActivity(), 96.0f) / ((float) this.f90884g.getMeasuredHeight());
            this.f90884g.animate().translationY((-this.f90884g.getY()) + ((float) C23482j.m77101d())).translationX(-C9738o.m28708b((Context) getActivity(), 5.0f)).scaleX(C9738o.m28708b((Context) getActivity(), 76.0f) / ((float) this.f90884g.getMeasuredWidth())).scaleY(b).alpha(0.0f).setDuration(1000).setListener(new AnimatorListenerAdapter() {
                public final void onAnimationEnd(Animator animator) {
                    PhotoMoviePublishFragment.this.mo88363a();
                }

                public final void onAnimationStart(Animator animator) {
                    PhotoMoviePublishFragment.this.getActivity().findViewById(16908290).setVisibility(4);
                }
            }).start();
        }
    }

    /* renamed from: a */
    public final void mo88231a(String str) {
        if (this.f90878a != null) {
            this.f90878a.commerceData = str;
        }
    }

    /* renamed from: a */
    private void m112343a(View view, OnTouchListener onTouchListener) {
        if (view.getId() != R.id.h_) {
            if (!(view instanceof EditText)) {
                view.setOnTouchListener(onTouchListener);
            }
            if (view instanceof ViewGroup) {
                int i = 0;
                while (true) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    if (i >= viewGroup.getChildCount()) {
                        break;
                    }
                    m112343a(viewGroup.getChildAt(i), onTouchListener);
                    i++;
                }
            }
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        boolean z;
        View view2 = view;
        Bundle bundle2 = bundle;
        super.onViewCreated(view, bundle);
        ExtensionDataRepo extensionDataRepo = (ExtensionDataRepo) C0069x.m157a((Fragment) this).mo147a(ExtensionDataRepo.class);
        if (VERSION.SDK_INT >= 21) {
            getActivity().getWindow().setSharedElementReenterTransition(new AutoTransition());
            getActivity().getWindow().setSharedElementExitTransition(new AutoTransition());
        }
        m112349i();
        m112346d(view);
        m112350j();
        this.f90899v = new Handler();
        m112343a(view2, this.f90889l);
        this.f90890m = (PermissionSettingItem) view2.findViewById(R.id.cag);
        boolean z2 = false;
        this.f90881d = C39320cz.m125645a(this, this.f90890m, 0);
        VideoPublishFragment.m131453a(this.f90890m, (Activity) getActivity());
        this.f90881d.mo97884a((C39319cy) new C39319cy() {
        });
        this.f90882e = (LinearLayout) view2.findViewById(R.id.bjq);
        this.f90891n = (CommonItemView) view2.findViewById(R.id.coa);
        this.f90892o = (CommonItemView) view2.findViewById(R.id.zp);
        this.f90896s = (TextView) view2.findViewById(R.id.h9);
        this.f90898u = (HashTagMentionEditText) view2.findViewById(R.id.acs);
        this.f90897t = (TextView) view2.findViewById(R.id.h_);
        this.f90880c = C39955gf.m127822a(this, this.f90898u, this.f90897t, this.f90896s, 0);
        this.f90883f = C38543br.m123188a(this.f90880c, view2);
        this.f90887j = new C40233e(this, this.f90878a.mIsFromDraft, 5);
        this.f90887j.mo100025a(this.f90882e);
        this.f90887j.mo100026a(this.f90882e, this.f90878a, m112354n(), this.f90878a.creationId, this.f90891n, this.f90892o);
        this.f90886i = C39361dx.m125744a((Fragment) this, view2, 3);
        this.f90886i.mo97945a(this.f90878a.mShootWay);
        try {
            z = C30199h.m98861a().getSilentShareConfigurable().booleanValue();
        } catch (NullValueException unused) {
            z = true;
        }
        if (C6399b.m19944t() && z) {
            this.f90886i.f102257a.mo83250a(getString(R.string.ds1));
        }
        this.f90880c.mo99377a();
        this.f90880c.mo99384a(this.f90878a.challenges);
        this.f90884g = (ImageView) view2.findViewById(R.id.ay5);
        this.f90884g.setScaleType(ScaleType.CENTER_CROP);
        m112352l();
        this.f90884g.setOnClickListener(new C34929m(this));
        m112347e(view);
        this.f90885h = (FrameLayout) view2.findViewById(R.id.clr);
        this.f90885h.setOnClickListener(new C34930n(this));
        List list = this.f90878a.challenges;
        if (list != null && !list.isEmpty()) {
            this.f90879b.f104548a = (AVChallenge) list.get(0);
        }
        if (this.f90878a.mIsFromDraft) {
            this.f90878a.mShootWay = "edit_draft";
        }
        this.f90881d.mo97881a(this.f90878a.isPrivate);
        this.f90880c.mo99386b(this.f90878a.title);
        if (this.f90878a.structList != null) {
            this.f90880c.mo99387b(this.f90878a.structList);
        }
        this.f90880c.mo99384a(this.f90878a.challenges);
        if (bundle2 != null) {
            this.f90879b.f104548a = (AVChallenge) bundle2.getSerializable("challenge");
            this.f90881d.mo97886b(bundle2);
            this.f90888k = bundle2.getBoolean("contentModified");
        }
        for (C0902i iVar : this.f90902y) {
            IAVPublishExtension iAVPublishExtension = (IAVPublishExtension) iVar.f3155b;
            LinearLayout linearLayout = (LinearLayout) view2.findViewById(R.id.ahj);
            AVPublishContentType aVPublishContentType = AVPublishContentType.PhotoMovie;
            PublishOutput a = C34862b.m112408a(this.f90878a);
            ExtensionMisc extensionMisc = new ExtensionMisc(this.f90878a.poiData, null, this.f90878a.poiId, null, this, extensionDataRepo, new MobParam("video_post_page", this.f90878a.mShootWay, this.f90878a.creationId));
            iAVPublishExtension.onCreate(this, linearLayout, bundle, aVPublishContentType, a, extensionMisc, new C34931o(this));
        }
        for (C0902i iVar2 : this.f90902y) {
            ((IAVPublishExtension) iVar2.f3155b).onCreateFinish();
        }
        C35545a b = C35563c.f93252o.mo83224b();
        if (this.f90878a.isPrivate == 1) {
            z2 = true;
        }
        b.mo83239a(Boolean.valueOf(z2));
        if (this.f90886i.f102257a.mo83253d().getVisibility() == 0 && !C30538p.m99745a() && this.f90886i.f102257a.mo83253d().getVisibility() == 0) {
            C6907h.onEvent(MobClick.obtain().setEventName("fans_power_show").setLabelName("edit_page").setJsonObject(new C6869c().mo16887a("shoot_way", this.f90878a.mShootWay).mo16888b()));
        }
        this.f90880c.mo99382a((C42902a) new C41388n(this.f90882e));
        this.f90880c.mo99380a((C38581cj) this);
        this.f90900w = (CheckBox) view2.findViewById(R.id.vj);
        this.f90901x = (FrameLayout) view2.findViewById(R.id.amw);
        if (C30538p.m99745a() || !C36964i.m118940p()) {
            this.f90901x.setVisibility(8);
        } else {
            this.f90900w.setChecked(((Boolean) C35563c.f93252o.mo83227c().mo83238a()).booleanValue());
            this.f90900w.setOnCheckedChangeListener(C34932p.f91110a);
        }
        m112351k();
        m112348f(view);
        this.f90883f.mo96526a(this, true, C38543br.f100166a, C40229a.m128550a(this.f90878a));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.pt, viewGroup, false);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        for (C0902i iVar : this.f90902y) {
            ((IAVPublishExtension) iVar.f3155b).onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo88365a(Bitmap bitmap, int i, int i2) {
        if (bitmap != null) {
            this.f90899v.post(new C34935s(this, bitmap));
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        for (C0902i iVar : this.f90902y) {
            ((IAVPublishExtension) iVar.f3155b).onActivityResult(i, i2, intent);
        }
        this.f90886i.mo97943a(i, i2, intent);
        if (i == 1) {
            if (i2 == -1) {
                this.f90879b.f104548a = C35563c.f93241d.mo83164a(intent);
            } else {
                this.f90879b.f104548a = null;
            }
            this.f90888k = true;
        }
        if (i == 2 && i2 == -1 && intent != null) {
            int intExtra = intent.getIntExtra("extra.PERMISSION", 0);
            this.f90881d.mo97882a(intent);
            this.f90888k = true;
            C6907h.onEvent(MobClick.obtain().setEventName("scope_control").setLabelName("edit_page").setJsonObject(new C6909j().mo16966a("to_status", C34788e.m112188a(intExtra)).mo16967a()));
        }
        if (i == 3 && i2 == -1) {
            this.f90880c.mo99379a(intent);
            this.f90888k = true;
        }
        if (i == 4 && i2 == -1 && intent != null && intent.getParcelableExtra("KEY_VIDEO_COVER_CHOOSE_RESULT") != null) {
            this.f90878a = (PhotoMovieContext) intent.getParcelableExtra("KEY_VIDEO_COVER_CHOOSE_RESULT");
            m112352l();
        }
        if (this.f90887j != null) {
            this.f90887j.mo100024a(i, i2, intent);
        }
    }
}
