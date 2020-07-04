package com.p280ss.android.ugc.aweme.music.adapter;

import android.graphics.drawable.Animatable;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import com.bytedance.common.utility.collection.C6307b;
import com.facebook.drawee.controller.C13400c;
import com.facebook.imagepipeline.p720g.C13648f;
import com.p280ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.music.model.ExternalMusicInfo;
import com.p280ss.android.ugc.aweme.music.service.IMusicService;
import com.p280ss.android.ugc.aweme.views.WrapContentRemoteImageView;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.music.adapter.ThirdMusicCoverAdapter */
public class ThirdMusicCoverAdapter extends BaseAdapter<ExternalMusicInfo> {

    /* renamed from: a */
    public C33724a f88069a;

    /* renamed from: com.ss.android.ugc.aweme.music.adapter.ThirdMusicCoverAdapter$a */
    public interface C33724a {
        /* renamed from: a */
        void mo86160a(int i);
    }

    /* renamed from: com.ss.android.ugc.aweme.music.adapter.ThirdMusicCoverAdapter$b */
    class C33725b extends C1293v {

        /* renamed from: a */
        public WrapContentRemoteImageView f88070a;

        /* renamed from: c */
        private View f88072c;

        /* renamed from: d */
        private ImageView f88073d;

        /* renamed from: e */
        private Animation f88074e;

        /* renamed from: b */
        private void m108801b() {
            if (this.f88072c != null && this.f88073d != null) {
                this.f88072c.setVisibility(0);
                this.f88073d.startAnimation(this.f88074e);
            }
        }

        /* renamed from: a */
        public final void mo86161a() {
            if (this.f88073d != null) {
                this.f88073d.clearAnimation();
            }
            if (this.f88072c != null) {
                this.f88072c.setVisibility(8);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ void mo86162a(View view) {
            if (ThirdMusicCoverAdapter.this.f88069a != null) {
                ThirdMusicCoverAdapter.this.f88069a.mo86160a(getLayoutPosition());
            }
        }

        C33725b(View view) {
            super(view);
            this.f88070a = (WrapContentRemoteImageView) view.findViewById(R.id.bd0);
            this.f88072c = view.findViewById(R.id.dio);
            this.f88073d = (ImageView) view.findViewById(R.id.din);
            this.f88074e = AnimationUtils.loadAnimation(view.getContext(), R.anim.av);
            this.f88070a.setOnClickListener(new C33748h(this));
        }

        /* renamed from: a */
        public final void mo86163a(List<ExternalMusicInfo> list, int i) {
            if (!C6307b.m19566a((Collection<T>) list) && i >= 0 && i < list.size()) {
                ExternalMusicInfo externalMusicInfo = (ExternalMusicInfo) list.get(i);
                if (externalMusicInfo != null) {
                    m108801b();
                    if (!TextUtils.isEmpty(externalMusicInfo.getPartnerName())) {
                        List musicCoverUrl = ((IMusicService) ServiceManager.get().getService(IMusicService.class)).getMusicCoverUrl(externalMusicInfo.getPartnerName());
                        if (!C6307b.m19566a((Collection<T>) musicCoverUrl) && this.f88070a != null) {
                            this.f88070a.mo105229a((String) musicCoverUrl.get(0), null, new C13400c<C13648f>() {
                                /* access modifiers changed from: private */
                                /* renamed from: a */
                                public void onIntermediateImageSet(String str, C13648f fVar) {
                                    C33725b.this.mo86161a();
                                    C33725b.this.f88070a.mo105228a(fVar);
                                }

                                public final void onFailure(String str, Throwable th) {
                                    super.onFailure(str, th);
                                    C33725b.this.mo86161a();
                                }

                                public final void onIntermediateImageFailed(String str, Throwable th) {
                                    super.onIntermediateImageFailed(str, th);
                                    C33725b.this.mo86161a();
                                }

                                /* access modifiers changed from: private */
                                /* renamed from: a */
                                public void onFinalImageSet(String str, C13648f fVar, Animatable animatable) {
                                    C33725b.this.mo86161a();
                                    C33725b.this.f88070a.mo105228a(fVar);
                                }
                            });
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.adapter.ThirdMusicCoverAdapter$c */
    class C33727c extends C1293v {

        /* renamed from: a */
        public View f88076a;

        /* renamed from: b */
        public WrapContentRemoteImageView f88077b;

        /* renamed from: d */
        private View f88079d;

        /* renamed from: e */
        private ImageView f88080e;

        /* renamed from: f */
        private Animation f88081f;

        /* renamed from: b */
        private void m108807b() {
            if (this.f88079d != null && this.f88080e != null) {
                this.f88079d.setVisibility(0);
                this.f88080e.startAnimation(this.f88081f);
            }
        }

        /* renamed from: a */
        public final void mo86164a() {
            if (this.f88080e != null) {
                this.f88080e.clearAnimation();
            }
            if (this.f88079d != null) {
                this.f88079d.setVisibility(8);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ void mo86165a(View view) {
            if (ThirdMusicCoverAdapter.this.f88069a != null) {
                ThirdMusicCoverAdapter.this.f88069a.mo86160a(getLayoutPosition());
            }
        }

        C33727c(View view) {
            super(view);
            this.f88077b = (WrapContentRemoteImageView) view.findViewById(R.id.bd0);
            this.f88076a = view.findViewById(R.id.ef7);
            this.f88079d = view.findViewById(R.id.dio);
            this.f88080e = (ImageView) view.findViewById(R.id.din);
            this.f88081f = AnimationUtils.loadAnimation(view.getContext(), R.anim.av);
            this.f88077b.setOnClickListener(new C33749i(this));
        }

        /* renamed from: a */
        public final void mo86166a(List<ExternalMusicInfo> list, int i) {
            if (!C6307b.m19566a((Collection<T>) list) && i >= 0 && i < list.size()) {
                ExternalMusicInfo externalMusicInfo = (ExternalMusicInfo) list.get(i);
                if (externalMusicInfo != null) {
                    m108807b();
                    if (!TextUtils.isEmpty(externalMusicInfo.getPartnerName())) {
                        List musicCoverUrl = ((IMusicService) ServiceManager.get().getService(IMusicService.class)).getMusicCoverUrl(externalMusicInfo.getPartnerName());
                        if (!C6307b.m19566a((Collection<T>) musicCoverUrl) && this.f88077b != null) {
                            if (i == list.size() - 1) {
                                this.f88076a.setVisibility(8);
                            }
                            this.f88077b.mo105229a((String) musicCoverUrl.get(0), null, new C13400c<C13648f>() {
                                /* access modifiers changed from: private */
                                /* renamed from: a */
                                public void onIntermediateImageSet(String str, C13648f fVar) {
                                    C33727c.this.mo86164a();
                                    C33727c.this.f88077b.mo105228a(fVar);
                                }

                                public final void onFailure(String str, Throwable th) {
                                    super.onFailure(str, th);
                                    C33727c.this.mo86164a();
                                }

                                public final void onIntermediateImageFailed(String str, Throwable th) {
                                    super.onIntermediateImageFailed(str, th);
                                    C33727c.this.mo86164a();
                                    C33727c.this.f88076a.setVisibility(8);
                                    C33727c.this.f88077b.setVisibility(8);
                                }

                                /* access modifiers changed from: private */
                                /* renamed from: a */
                                public void onFinalImageSet(String str, C13648f fVar, Animatable animatable) {
                                    C33727c.this.mo86164a();
                                    C33727c.this.f88077b.mo105228a(fVar);
                                }
                            });
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final C1293v mo58032a(ViewGroup viewGroup, int i) {
        if (((IMusicService) ServiceManager.get().getService(IMusicService.class)).getIsUseMusicPartnersNewStyle()) {
            return new C33727c(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a3q, viewGroup, false));
        }
        return new C33725b(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a3p, viewGroup, false));
    }

    /* renamed from: a */
    public final void mo58033a(C1293v vVar, int i) {
        if (((IMusicService) ServiceManager.get().getService(IMusicService.class)).getIsUseMusicPartnersNewStyle()) {
            ((C33727c) vVar).mo86166a(this.f67539l, i);
        } else {
            ((C33725b) vVar).mo86163a(this.f67539l, i);
        }
    }
}
