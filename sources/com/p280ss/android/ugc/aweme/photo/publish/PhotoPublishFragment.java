package com.p280ss.android.ugc.aweme.photo.publish;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.arch.lifecycle.C0069x;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.util.C0902i;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.bytedance.apm.agent.instrumentation.FragmentInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.facebook.drawee.backends.pipeline.C13380c;
import com.p280ss.android.ugc.aweme.account.C21164d.C21165a;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.utils.C23482j;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.C6909j;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.photo.C34759k;
import com.p280ss.android.ugc.aweme.photo.PhotoContext;
import com.p280ss.android.ugc.aweme.port.p1479in.C35541ai.C35542a;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.port.p1479in.C35578o.C35579a;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.services.publish.AVPublishContentType;
import com.p280ss.android.ugc.aweme.services.publish.AVPublishExtensionUtils;
import com.p280ss.android.ugc.aweme.services.publish.ExtensionDataRepo;
import com.p280ss.android.ugc.aweme.services.publish.ExtensionMisc;
import com.p280ss.android.ugc.aweme.services.publish.GoodsPublishModel;
import com.p280ss.android.ugc.aweme.services.publish.IAVPublishExtension;
import com.p280ss.android.ugc.aweme.services.publish.MobParam;
import com.p280ss.android.ugc.aweme.services.publish.PoiPublishModel;
import com.p280ss.android.ugc.aweme.services.publish.PublishOutput;
import com.p280ss.android.ugc.aweme.services.publish.SeedPublishModel;
import com.p280ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.p280ss.android.ugc.aweme.shortvideo.C38543br;
import com.p280ss.android.ugc.aweme.shortvideo.C39361dx;
import com.p280ss.android.ugc.aweme.shortvideo.C39955gf;
import com.p280ss.android.ugc.aweme.shortvideo.C40005j;
import com.p280ss.android.ugc.aweme.shortvideo.PublishPermissionActivity;
import com.p280ss.android.ugc.aweme.shortvideo.edit.C39513bb;
import com.p280ss.android.ugc.aweme.shortvideo.model.AVTextExtraStruct;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.PermissionSettingItem;
import com.p280ss.android.ugc.aweme.shortvideo.publish.C40229a;
import com.p280ss.android.ugc.aweme.shortvideo.publish.C40230b;
import com.p280ss.android.ugc.aweme.shortvideo.view.HashTagMentionEditText;
import com.p280ss.android.ugc.aweme.tools.extension.C42311e;
import com.p280ss.android.ugc.aweme.tools.extension.Scene;
import com.p280ss.android.ugc.aweme.utils.C42939as;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.photo.publish.PhotoPublishFragment */
public class PhotoPublishFragment extends Fragment implements C35542a {

    /* renamed from: a */
    C40230b f90662a = new C40230b();

    /* renamed from: b */
    C39955gf f90663b;

    /* renamed from: c */
    public boolean f90664c;

    /* renamed from: d */
    OnTouchListener f90665d = new OnTouchListener() {
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            C39513bb.m126207a(PhotoPublishFragment.this.getActivity());
            return false;
        }
    };

    /* renamed from: e */
    private PhotoContext f90666e;

    /* renamed from: f */
    private C38543br f90667f;

    /* renamed from: g */
    private C39361dx f90668g;

    /* renamed from: h */
    private List<C0902i<Class<?>, IAVPublishExtension<?>>> f90669h = C35563c.f93257t.mo83275a(AVPublishContentType.Photo);
    @BindView(2131493417)
    LinearLayout mLayoutSettingContainer;
    @BindView(2131493558)
    PermissionSettingItem mPermissionSettingItem;
    @BindView(2131493272)
    ImageView mPhotoThumbView;

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public final /* synthetic */ void mo88239i() {
        this.f90664c = true;
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

    /* renamed from: e */
    public final String mo88235e() {
        return this.f90663b.mo99390d();
    }

    /* renamed from: d */
    public final String mo88234d() {
        if (this.f90666e == null) {
            return null;
        }
        return this.f90666e.commerceData;
    }

    /* renamed from: f */
    public final boolean mo88236f() {
        if (this.f90666e == null || this.f90666e.microAppModel == null) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public final void mo88237g() {
        if (this.f90666e != null) {
            this.f90666e.microAppModel = null;
        }
    }

    /* renamed from: h */
    public final boolean mo88238h() {
        if (this.f90666e == null || !this.f90666e.isPoiOrderRate()) {
            return false;
        }
        return true;
    }

    public void onDestroyView() {
        m112174a(getView(), null);
        super.onDestroyView();
        this.f90668g.mo97947c();
        for (C0902i iVar : this.f90669h) {
            ((IAVPublishExtension) iVar.f3155b).onDestroy();
        }
    }

    public void onResume() {
        FragmentInstrumentation.onResume(this);
        super.onResume();
        for (C0902i iVar : this.f90669h) {
            ((IAVPublishExtension) iVar.f3155b).onResume();
        }
    }

    /* renamed from: c */
    public final PhotoContext mo88233c() {
        this.f90663b.mo99388c();
        this.f90666e.mText = this.f90663b.mo99390d();
        if (this.f90663b.mo99391e() != null) {
            this.f90666e.mExtras = this.f90663b.mo99391e();
        }
        PoiPublishModel poiPublishModel = (PoiPublishModel) AVPublishExtensionUtils.findModel(this.f90669h, PoiPublishModel.class);
        this.f90666e.mIsPrivate = this.mPermissionSettingItem.getPermission();
        if (poiPublishModel != null) {
            this.f90666e.mPoiId = poiPublishModel.getPoiContext();
        }
        for (C0902i iVar : this.f90669h) {
            ((IAVPublishExtension) iVar.f3155b).onBackPressed(C34759k.m112137a(this.f90666e));
        }
        return this.f90666e;
    }

    /* renamed from: a */
    public final void mo88230a() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        if (!C35563c.f93260w.mo57090c()) {
            C35563c.f93260w.mo57086a((Fragment) this, "photo_post_page", "click_post", (Bundle) null, (C21165a) null);
            return;
        }
        PoiPublishModel poiPublishModel = (PoiPublishModel) AVPublishExtensionUtils.findModel(this.f90669h, PoiPublishModel.class);
        SeedPublishModel seedPublishModel = (SeedPublishModel) AVPublishExtensionUtils.findModel(this.f90669h, SeedPublishModel.class);
        C22984d a = C22984d.m75611a().mo59973a("creation_id", this.f90666e.creationId).mo59973a("shoot_way", this.f90666e.mShootWay).mo59973a("filter_list", this.f90666e.mFilterName).mo59970a("filter_id_list", this.f90666e.mFilterId).mo59973a("prop_selected_from", this.f90666e.mPropSource).mo59973a("content_type", "photo");
        String str7 = "content_source";
        if (this.f90666e.mPhotoFrom == 0) {
            str = "upload";
        } else {
            str = "shoot";
        }
        C22984d a2 = a.mo59973a(str7, str).mo59973a("enter_from", "video_post_page");
        String str8 = "seed_id";
        if (seedPublishModel != null) {
            str2 = seedPublishModel.getSeedId();
        } else {
            str2 = "0";
        }
        C22984d a3 = a2.mo59973a(str8, str2);
        String str9 = "seed_name";
        if (seedPublishModel != null) {
            str3 = seedPublishModel.getSeedName();
        } else {
            str3 = "";
        }
        C22984d a4 = a3.mo59973a(str9, str3);
        String str10 = "refer_seed_id";
        if (seedPublishModel != null) {
            str4 = seedPublishModel.getReferSeedId();
        } else {
            str4 = "";
        }
        C22984d a5 = a4.mo59973a(str10, str4);
        String str11 = "refer_seed_name";
        if (seedPublishModel != null) {
            str5 = seedPublishModel.getReferSeedName();
        } else {
            str5 = "";
        }
        C22984d a6 = a5.mo59973a(str11, str5);
        String str12 = "data_type";
        if (seedPublishModel != null) {
            str6 = seedPublishModel.getDataType();
        } else {
            str6 = "";
        }
        a6.mo59973a(str12, str6);
        Map<String, String> map = a2.f60753a;
        if (poiPublishModel != null) {
            map.putAll(poiPublishModel.getMobParams());
            this.f90666e.poiServerMobParam = poiPublishModel.getServerMobParams();
        }
        C6907h.m21524a("publish", (Map) map);
        C6907h.m21524a("performance_publish", (Map) new C22984d().mo59973a("creation_id", this.f90666e.creationId).mo59973a("content_type", "photo").mo59970a("video_type", 5).mo59970a("video_upload_type", 0).f60753a);
        this.f90663b.mo99389c("publish");
        if (VERSION.SDK_INT < 18 || C35563c.f93247j.mo83116a() || C35563c.f93247j.mo83117b()) {
            mo88232b();
            return;
        }
        ((ViewGroup) getActivity().getWindow().getDecorView()).getOverlay().add(this.mPhotoThumbView);
        float b = C9738o.m28708b((Context) getActivity(), 96.0f) / ((float) this.mPhotoThumbView.getMeasuredHeight());
        this.mPhotoThumbView.animate().translationY((-this.mPhotoThumbView.getY()) + ((float) C23482j.m77101d())).translationX(-C9738o.m28708b((Context) getActivity(), 5.0f)).scaleX(C9738o.m28708b((Context) getActivity(), 76.0f) / ((float) this.mPhotoThumbView.getMeasuredWidth())).scaleY(b).alpha(0.0f).setDuration(1000).setListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                PhotoPublishFragment.this.mo88232b();
            }

            public final void onAnimationStart(Animator animator) {
                PhotoPublishFragment.this.getActivity().findViewById(16908290).setVisibility(4);
            }
        }).start();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo88232b() {
        this.f90666e.updatePhotoPath();
        if (getActivity() != null) {
            getActivity().finish();
            this.f90663b.mo99388c();
            this.f90666e.mText = this.f90663b.mo99390d();
            if (this.f90663b.mo99391e() != null) {
                this.f90666e.mExtras = this.f90663b.mo99391e();
            }
            PoiPublishModel poiPublishModel = (PoiPublishModel) AVPublishExtensionUtils.findModel(this.f90669h, PoiPublishModel.class);
            this.f90666e.mIsPrivate = this.mPermissionSettingItem.getPermission();
            if (poiPublishModel != null) {
                this.f90666e.mPoiId = poiPublishModel.getPoiContext();
                this.f90666e.mLatitude = poiPublishModel.getLatitude();
                this.f90666e.mLongitude = poiPublishModel.getLongitude();
            }
            this.f90666e.mSyncPlatforms = this.f90668g.mo97941a();
            C39361dx.m125745a(this.f90666e.mSyncPlatforms, 1);
            GoodsPublishModel goodsPublishModel = (GoodsPublishModel) AVPublishExtensionUtils.findModel(this.f90669h, GoodsPublishModel.class);
            if (goodsPublishModel != null && !TextUtils.isEmpty(goodsPublishModel.getGoodsDraftId())) {
                this.f90666e.shopDraftId = goodsPublishModel.getGoodsDraftId();
            }
            C42311e.m134571a(C40005j.m127913b(this.f90666e), C40005j.m127908a(this.f90666e), Scene.PUBLISH, Scene.SEND_REQUEST);
            Bundle bundle = new Bundle();
            bundle.putSerializable("extra_photo_publish_args", this.f90666e);
            bundle.putString("shoot_way", this.f90666e.mShootWay);
            bundle.putInt("video_type", 5);
            bundle.putBoolean("enter_record_from_other_platform", this.f90666e.mFromOtherPlatform);
            ((IAVService) ServiceManager.get().getService(IAVService.class)).getPublishService().startPublish(getActivity(), bundle);
            C6907h.onEvent(MobClick.obtain().setEventName("publish").setLabelName("submit").setJsonObject(new C6909j().mo16966a("is_photo", "1").mo16967a()));
            for (C0902i iVar : this.f90669h) {
                ((IAVPublishExtension) iVar.f3155b).onPublish(C34759k.m112137a(this.f90666e));
            }
        }
    }

    /* renamed from: a */
    public final void mo88231a(String str) {
        if (this.f90666e != null) {
            this.f90666e.commerceData = str;
        }
    }

    /* renamed from: a */
    public static PhotoPublishFragment m112172a(PhotoContext photoContext) {
        PhotoPublishFragment photoPublishFragment = new PhotoPublishFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("photo_model", photoContext);
        photoPublishFragment.setArguments(bundle);
        return photoPublishFragment;
    }

    /* renamed from: a */
    private void m112173a(View view) {
        view.findViewById(R.id.clr).setOnClickListener(new C42939as(1000) {
            /* renamed from: a */
            public final void mo70606a(View view) {
                if (C35563c.f93260w.mo57089b()) {
                    C10761a.m31409e(PhotoPublishFragment.this.getContext(), (int) R.string.e5p).mo25750a();
                } else if (PhotoPublishFragment.this.mPermissionSettingItem.getPermission() == 1) {
                    PhotoPublishFragment.this.mo88230a();
                } else {
                    C35563c.f93240c.mo83127a(PhotoPublishFragment.this.getContext(), (C35579a) new C35579a() {
                        /* renamed from: a */
                        public final void mo88243a() {
                            C10761a.m31403c(PhotoPublishFragment.this.getContext(), PhotoPublishFragment.this.getString(R.string.sp)).mo25750a();
                        }

                        /* renamed from: a */
                        public final void mo88244a(boolean z) {
                            if (z) {
                                PhotoPublishFragment.this.mPermissionSettingItem.setPermission(1);
                                PhotoPublishFragment.this.f90664c = true;
                            }
                            PhotoPublishFragment.this.mo88230a();
                        }
                    });
                }
            }
        });
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        for (C0902i iVar : this.f90669h) {
            ((IAVPublishExtension) iVar.f3155b).onSaveInstanceState(bundle);
        }
        bundle.putInt("permission", this.mPermissionSettingItem.getPermission());
        bundle.putSerializable("challenge", this.f90662a.f104548a);
        bundle.putBoolean("contentModified", this.f90664c);
    }

    /* access modifiers changed from: 0000 */
    @OnClick({2131493558, 2131492912, 2131493593, 2131493272})
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.cag) {
            PublishPermissionActivity.m122669a((Fragment) this, 5, this.mPermissionSettingItem.getPermission(), (int) R.string.b7k, (int) R.string.b7j, 2);
            C6907h.onEvent(MobClick.obtain().setEventName("scope_click").setLabelName("edit_page").setJsonObject(new C6909j().mo16966a("is_photo", "1").mo16967a()));
            return;
        }
        if (id == R.id.ay5) {
            PhotoPreviewActivity.m112164a(getActivity(), this.f90666e, this.mPhotoThumbView);
        }
    }

    /* renamed from: a */
    private void m112174a(View view, OnTouchListener onTouchListener) {
        if (!(view instanceof EditText)) {
            view.setOnTouchListener(onTouchListener);
        }
        if (view instanceof ViewGroup) {
            int i = 0;
            while (true) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (i < viewGroup.getChildCount()) {
                    m112174a(viewGroup.getChildAt(i), onTouchListener);
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        List<AVTextExtraStruct> list;
        View view2 = view;
        Bundle bundle2 = bundle;
        super.onViewCreated(view, bundle);
        ButterKnife.bind((Object) this, view);
        m112174a(view2, this.f90665d);
        m112173a(view);
        this.f90666e = (PhotoContext) getArguments().getSerializable("photo_model");
        this.f90663b = C39955gf.m127823b(this, (HashTagMentionEditText) view2.findViewById(R.id.acs), view2.findViewById(R.id.h_), view2.findViewById(R.id.h9), 0);
        this.f90667f = C38543br.m123188a(this.f90663b, view2);
        this.f90668g = C39361dx.m125744a((Fragment) this, view2, 2);
        this.f90668g.mo97945a(this.f90666e.mShootWay);
        this.f90663b.mo99377a();
        this.f90663b.mo99386b(this.f90666e.mText);
        C39955gf gfVar = this.f90663b;
        if (this.f90666e.mExtras == null) {
            list = null;
        } else {
            list = this.f90666e.mExtras;
        }
        gfVar.mo99387b(list);
        this.f90663b.mo99384a(this.f90666e.challenges);
        if (this.f90666e.microAppModel != null) {
            this.f90663b.mo99381a(this.f90666e.microAppModel);
        }
        this.mPermissionSettingItem.setPermission(this.f90666e.mIsPrivate);
        if (!C6399b.m19944t()) {
            this.f90668g.f102257a.mo83250a(getString(R.string.d9i));
        }
        if (bundle2 != null) {
            this.f90662a.f104548a = (AVChallenge) bundle2.getSerializable("challenge");
            this.mPermissionSettingItem.setPermission(bundle2.getInt("permission"));
            this.f90664c = bundle2.getBoolean("contentModified");
        }
        C13380c.m39172c().mo33176a(this.f90666e.getTmpPhotoUri(C35563c.f93238a));
        this.mPhotoThumbView.setImageURI(this.f90666e.getTmpPhotoUri(C35563c.f93238a));
        ExtensionDataRepo extensionDataRepo = (ExtensionDataRepo) C0069x.m157a((Fragment) this).mo147a(ExtensionDataRepo.class);
        for (C0902i iVar : this.f90669h) {
            IAVPublishExtension iAVPublishExtension = (IAVPublishExtension) iVar.f3155b;
            LinearLayout linearLayout = (LinearLayout) view2.findViewById(R.id.ahj);
            AVPublishContentType aVPublishContentType = AVPublishContentType.Photo;
            PublishOutput a = C34759k.m112137a(this.f90666e);
            ExtensionMisc extensionMisc = new ExtensionMisc(this.f90666e.poiData, this.f90666e.defaultSelectStickerPoi, this.f90666e.mPoiId, this.f90666e.microAppModel, this, extensionDataRepo, new MobParam("photo_post_page", this.f90666e.mShootWay, this.f90666e.creationId));
            iAVPublishExtension.onCreate(this, linearLayout, bundle, aVPublishContentType, a, extensionMisc, new C34787d(this));
        }
        for (C0902i iVar2 : this.f90669h) {
            ((IAVPublishExtension) iVar2.f3155b).onCreateFinish();
        }
        this.f90667f.mo96526a(this, true, C38543br.f100167b, C40229a.m128549a(this.f90666e));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.pu, viewGroup, false);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        for (C0902i iVar : this.f90669h) {
            ((IAVPublishExtension) iVar.f3155b).onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        for (C0902i iVar : this.f90669h) {
            ((IAVPublishExtension) iVar.f3155b).onActivityResult(i, i2, intent);
        }
        this.f90668g.mo97943a(i, i2, intent);
        this.f90662a.f104548a = C35563c.f93241d.mo83163a(i, i2, intent, 1);
        if (i == 1) {
            this.f90664c = true;
        }
        if (i == 2 && i2 == -1 && intent != null) {
            int intExtra = intent.getIntExtra("extra.PERMISSION", 0);
            this.mPermissionSettingItem.setPermission(intExtra);
            this.f90664c = true;
            C6907h.onEvent(MobClick.obtain().setEventName("scope_control").setLabelName("edit_page").setJsonObject(new C6909j().mo16966a("to_status", C34788e.m112188a(intExtra)).mo16966a("is_photo", "1").mo16967a()));
        }
        if (i == 3 && i2 == -1) {
            this.f90663b.mo99379a(intent);
            this.f90664c = true;
        }
    }
}
