package com.p280ss.android.ugc.aweme.profile.adapter;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.ies.dmt.p262ui.widget.util.C10832b;
import com.bytedance.ies.dmt.p262ui.widget.util.C10834d;
import com.bytedance.lighten.core.C12128i;
import com.bytedance.lighten.core.C12133n;
import com.bytedance.lighten.loader.SmartImageView;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.common.adapter.AnimatedViewHolder;
import com.p280ss.android.ugc.aweme.draft.model.C27311c;
import com.p280ss.android.ugc.aweme.effect.EffectPointModel;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.login.C32656f;
import com.p280ss.android.ugc.aweme.profile.service.C36074j;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41530am;
import com.p280ss.android.ugc.aweme.video.C7276d;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.profile.adapter.DraftBoxViewHolder */
public class DraftBoxViewHolder extends AnimatedViewHolder<C27311c> {

    /* renamed from: a */
    public SmartImageView f93554a;

    /* renamed from: b */
    private Context f93555b;

    /* renamed from: c */
    private TextView f93556c;

    /* renamed from: d */
    private TextView f93557d;

    public final void bB_() {
    }

    /* renamed from: c */
    private static boolean m115322c() {
        return C36074j.f94315a.isEnableSettingDiskManager();
    }

    /* renamed from: d */
    private void m115323d() {
        if (m115322c() && this.f93556c != null) {
            C1592h.m7853a((Callable<TResult>) new C35710c<TResult>(this)).mo6876a((C1591g<TResult, TContinuationResult>) new C35711d<TResult,TContinuationResult>(this), C1592h.f5958b);
        }
    }

    /* renamed from: k */
    private void m115325k() {
        if (m115322c() && this.f93557d != null) {
            this.f93557d.setTypeface(C10832b.m31784a().mo26161a(C10834d.f29337g));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Integer mo61580a() throws Exception {
        return Integer.valueOf(m115324e());
    }

    /* renamed from: e */
    private static int m115324e() {
        return ((IAVService) ServiceManager.get().getService(IAVService.class)).draftService().queryMyDraftCount(new C35712e(((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().getPublishingDraftKey()));
    }

    /* renamed from: l */
    private void m115326l() {
        if (!C6861a.m21332a().userService().isLogin()) {
            C32656f.m105742a((Activity) this.f93555b, "", "click_draft");
            return;
        }
        ((IAVService) ServiceManager.get().getService(IAVService.class)).draftService().enterDraftBox((Activity) this.f93555b);
        C6907h.onEvent(MobClick.obtain().setEventName("click_draft").setLabelName("personal_homepage"));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo90530a(View view) {
        m115326l();
    }

    public DraftBoxViewHolder(View view) {
        super(view);
        this.f93555b = view.getContext();
        this.f93554a = (SmartImageView) view.findViewById(R.id.a4g);
        this.f93554a.setOnClickListener(new C35708a(this));
        if (m115322c()) {
            this.f93556c = (TextView) view.findViewById(R.id.dtm);
            this.f93557d = (TextView) view.findViewById(R.id.dtl);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Void mo90527a(C1592h hVar) throws Exception {
        if (hVar.mo6882b()) {
            Integer num = (Integer) hVar.mo6890e();
            this.f93556c.setText(this.f93556c.getContext().getResources().getQuantityString(R.plurals.n, num.intValue(), new Object[]{num}));
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo90528a(Bitmap bitmap) {
        if (this.f93554a != null && bitmap != null) {
            this.f93554a.setImageBitmap(bitmap);
        }
    }

    /* renamed from: a */
    private void m115319a(C27311c cVar) {
        boolean z;
        if (cVar != null) {
            ArrayList arrayList = new ArrayList();
            if (cVar.f72014B != null) {
                arrayList.addAll(cVar.f72014B.getEffectPointModels());
            }
            int i = cVar.f72044m;
            EffectPointModel effectPointModel = null;
            if (i != 0) {
                effectPointModel = new EffectPointModel();
                effectPointModel.setKey(String.valueOf(i));
                effectPointModel.setEndPoint(cVar.f72021I);
            }
            if (effectPointModel != null) {
                arrayList.add(effectPointModel);
                if (TextUtils.equals(effectPointModel.getKey(), "1")) {
                    z = true;
                    StringBuilder sb = new StringBuilder("DraftBoxViewHolder SetCoverImage EffectPointModelList:");
                    sb.append(arrayList);
                    sb.append("\n filterId:");
                    sb.append(cVar.mo70233b());
                    C41530am.m132285d(sb.toString());
                    ((IAVService) ServiceManager.get().getService(IAVService.class)).effectService().getVideoCoverByCallback(arrayList, ((IAVService) ServiceManager.get().getService(IAVService.class)).getFilterService().mo74857a(cVar.f72042k).mo74978b(), cVar.mo70228aq(), (int) (cVar.f72027O * 1000.0f), z, cVar.mo70214ac(), new OnVideoCoverCallback() {
                        public final void onGetVideoCoverFailed(int i) {
                        }

                        public final void onGetVideoCoverSuccess(Bitmap bitmap) {
                            if (DraftBoxViewHolder.this.f93554a != null) {
                                DraftBoxViewHolder.this.f93554a.setImageBitmap(bitmap);
                            }
                        }
                    });
                }
            }
            z = false;
            StringBuilder sb2 = new StringBuilder("DraftBoxViewHolder SetCoverImage EffectPointModelList:");
            sb2.append(arrayList);
            sb2.append("\n filterId:");
            sb2.append(cVar.mo70233b());
            C41530am.m132285d(sb2.toString());
            ((IAVService) ServiceManager.get().getService(IAVService.class)).effectService().getVideoCoverByCallback(arrayList, ((IAVService) ServiceManager.get().getService(IAVService.class)).getFilterService().mo74857a(cVar.f72042k).mo74978b(), cVar.mo70228aq(), (int) (cVar.f72027O * 1000.0f), z, cVar.mo70214ac(), new OnVideoCoverCallback() {
                public final void onGetVideoCoverFailed(int i) {
                }

                public final void onGetVideoCoverSuccess(Bitmap bitmap) {
                    if (DraftBoxViewHolder.this.f93554a != null) {
                        DraftBoxViewHolder.this.f93554a.setImageBitmap(bitmap);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    static final /* synthetic */ boolean m115320a(String str, C27311c cVar) {
        if (!TextUtils.equals(cVar.mo70221aj(), str)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo90532b(C27311c cVar, int i) {
        m115321c(cVar, i);
        m115323d();
        m115325k();
    }

    /* renamed from: c */
    private void m115321c(C27311c cVar, int i) {
        if (cVar.f72026N == 2) {
            if (cVar.f72034c == null) {
                this.f93554a.setImageURI("");
            } else {
                cVar.f72034c.getPhotoMovieCover(new C35713f(this));
            }
        } else if (cVar.mo70177S()) {
            String V = cVar.mo70180V();
            if (C7276d.m22812b(V)) {
                C12133n.m35300a(new File(V)).mo29844a((C12128i) this.f93554a).mo29845a("DraftBoxViewHolder").mo29848a();
            }
        } else if (cVar.mo70178T()) {
            String W = cVar.mo70181W();
            if (C7276d.m22812b(W)) {
                C12133n.m35300a(new File(W)).mo29844a((C12128i) this.f93554a).mo29845a("DraftBoxViewHolder").mo29848a();
            }
        } else if (cVar.mo70179U()) {
            String X = cVar.mo70182X();
            if (C7276d.m22812b(X)) {
                C12133n.m35300a(new File(X)).mo29844a((C12128i) this.f93554a).mo29845a("DraftBoxViewHolder").mo29848a();
            }
        } else {
            m115319a(cVar);
        }
        this.f93554a.setContentDescription(this.f93555b.getString(R.string.d6j, new Object[]{Integer.valueOf(i + 1)}));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo66491a(C27311c cVar, int i) {
        if (cVar != null) {
            C6726a.m20844b(new C35709b(this, cVar, i));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo90529a(Bitmap bitmap, int i, int i2) {
        C6726a.m20844b(new C35714g(this, bitmap));
    }
}
