package com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker;

import android.arch.lifecycle.C0053p;
import android.content.Context;
import android.support.p022v4.app.FragmentActivity;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.View;
import com.bytedance.common.utility.C6311g;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.mvp.model.LiveDataWrapper;
import com.p280ss.android.ugc.aweme.mvp.model.LiveDataWrapper.STATUS;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.port.p1479in.C35603z.C35605b;
import com.p280ss.android.ugc.aweme.port.p1479in.C35603z.C35607d;
import com.p280ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.StickerImageView;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.StickerWrapper;
import com.p280ss.android.ugc.aweme.utils.C42939as;
import com.p280ss.android.ugc.aweme.utils.C42962b;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.InfoStickerHolder */
public class InfoStickerHolder extends C1293v {

    /* renamed from: a */
    public FragmentActivity f105670a;

    /* renamed from: b */
    public StickerImageView f105671b;

    /* renamed from: c */
    public boolean f105672c;

    /* renamed from: d */
    public StickerWrapper f105673d;

    /* renamed from: e */
    public InfoStickerAdapterV2 f105674e;

    /* renamed from: f */
    public int f105675f;

    /* renamed from: g */
    public String f105676g;

    /* renamed from: h */
    public FragmentActivity f105677h;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.InfoStickerHolder$6 */
    static /* synthetic */ class C406506 {

        /* renamed from: a */
        static final /* synthetic */ int[] f105693a = new int[STATUS.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        static {
            /*
                com.ss.android.ugc.aweme.mvp.model.LiveDataWrapper$STATUS[] r0 = com.p280ss.android.ugc.aweme.mvp.model.LiveDataWrapper.STATUS.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f105693a = r0
                int[] r0 = f105693a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.ss.android.ugc.aweme.mvp.model.LiveDataWrapper$STATUS r1 = com.p280ss.android.ugc.aweme.mvp.model.LiveDataWrapper.STATUS.SUCCESS     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f105693a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.ss.android.ugc.aweme.mvp.model.LiveDataWrapper$STATUS r1 = com.p280ss.android.ugc.aweme.mvp.model.LiveDataWrapper.STATUS.ERROR     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f105693a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.ss.android.ugc.aweme.mvp.model.LiveDataWrapper$STATUS r1 = com.p280ss.android.ugc.aweme.mvp.model.LiveDataWrapper.STATUS.LOADING     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f105693a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.ss.android.ugc.aweme.mvp.model.LiveDataWrapper$STATUS r1 = com.p280ss.android.ugc.aweme.mvp.model.LiveDataWrapper.STATUS.PROGRESS     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.InfoStickerHolder.C406506.<clinit>():void");
        }
    }

    /* renamed from: a */
    public final void mo100773a(final FragmentActivity fragmentActivity, final StickerWrapper stickerWrapper) {
        C35574k.m114859a().mo70107v().mo83206a((Context) this.f105670a, (C35607d) new C35607d() {
            /* renamed from: a */
            public final void mo90413a() {
                InfoStickerHolder.this.mo100776b(fragmentActivity, stickerWrapper);
            }

            /* renamed from: b */
            public final void mo90414b() {
                C10761a.m31399c((Context) InfoStickerHolder.this.f105670a, (int) R.string.os).mo25750a();
            }
        });
    }

    /* renamed from: b */
    public final void mo100776b(final FragmentActivity fragmentActivity, final StickerWrapper stickerWrapper) {
        C35574k.m114859a().mo70107v().mo83205a((Context) this.f105670a, (C35605b) new C35605b() {
            /* renamed from: a */
            public final void mo90410a() {
                C10761a.m31399c((Context) InfoStickerHolder.this.f105670a, (int) R.string.os).mo25750a();
            }

            /* renamed from: a */
            public final void mo90411a(double d, double d2) {
                InfoStickerHolder.this.mo100774a(fragmentActivity, stickerWrapper, d2, d);
            }
        });
    }

    /* renamed from: c */
    public final void mo100777c(FragmentActivity fragmentActivity, StickerWrapper stickerWrapper) {
        C40805n.m130407a(fragmentActivity).mo100809a(stickerWrapper).observe(fragmentActivity, new C0053p<LiveDataWrapper<Effect>>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onChanged(LiveDataWrapper<Effect> liveDataWrapper) {
                InfoStickerHolder infoStickerHolder;
                if (liveDataWrapper.f88767a != null) {
                    infoStickerHolder = (InfoStickerHolder) InfoStickerHolder.this.f105674e.f105643g.get(((Effect) liveDataWrapper.f88767a).getEffectId());
                } else {
                    infoStickerHolder = null;
                }
                if (infoStickerHolder != null) {
                    switch (C406506.f105693a[liveDataWrapper.f88768b.ordinal()]) {
                        case 1:
                            infoStickerHolder.f105673d.f104910c = 1;
                            infoStickerHolder.mo100775a(InfoStickerHolder.this.f105677h, infoStickerHolder.f105673d, InfoStickerHolder.this.f105676g);
                            C40805n.m130407a(InfoStickerHolder.this.f105670a).mo100823d().setValue(liveDataWrapper.f88767a);
                            return;
                        case 2:
                            infoStickerHolder.f105673d.f104910c = 3;
                            infoStickerHolder.mo100775a(InfoStickerHolder.this.f105677h, infoStickerHolder.f105673d, InfoStickerHolder.this.f105676g);
                            C10761a.m31399c((Context) InfoStickerHolder.this.f105670a, (int) R.string.b23).mo25750a();
                            return;
                        case 3:
                            infoStickerHolder.f105673d.f104910c = 2;
                            infoStickerHolder.mo100775a(InfoStickerHolder.this.f105677h, infoStickerHolder.f105673d, InfoStickerHolder.this.f105676g);
                            return;
                        case 4:
                            if (((Effect) liveDataWrapper.f88767a).getEffectId().equals(infoStickerHolder.f105673d.f104908a.getEffectId())) {
                                infoStickerHolder.f105673d.f104910c = 5;
                                infoStickerHolder.f105671b.mo100251a(5, liveDataWrapper.f88769c);
                                break;
                            }
                            break;
                    }
                }
            }
        });
    }

    public InfoStickerHolder(View view, FragmentActivity fragmentActivity, InfoStickerAdapterV2 infoStickerAdapterV2) {
        super(view);
        this.f105670a = fragmentActivity;
        this.f105671b = (StickerImageView) view.findViewById(R.id.db2);
        this.f105674e = infoStickerAdapterV2;
    }

    /* renamed from: a */
    public final void mo100775a(FragmentActivity fragmentActivity, StickerWrapper stickerWrapper, String str) {
        if (stickerWrapper != null) {
            this.f105676g = str;
            this.f105673d = stickerWrapper;
            this.f105677h = fragmentActivity;
            this.f105671b.mo100251a(stickerWrapper.f104910c, stickerWrapper.f104912e);
            if (stickerWrapper.f104908a.getIconUrl() != null && !C6311g.m19573a(stickerWrapper.f104908a.getIconUrl().getUrlList())) {
                this.f105671b.mo100254a((String) stickerWrapper.f104908a.getIconUrl().getUrlList().get(0));
            }
            final VideoPublishEditModel videoPublishEditModel = C40805n.m130407a(fragmentActivity).f105747b;
            View view = this.itemView;
            final StickerWrapper stickerWrapper2 = stickerWrapper;
            final FragmentActivity fragmentActivity2 = fragmentActivity;
            final String str2 = str;
            C406451 r1 = new C42939as() {
                /* renamed from: a */
                public final void mo70606a(View view) {
                    String str;
                    if (C40814t.m130426b(stickerWrapper2.f104908a)) {
                        InfoStickerHolder.this.mo100773a(fragmentActivity2, stickerWrapper2);
                    } else {
                        InfoStickerHolder.this.mo100777c(fragmentActivity2, stickerWrapper2);
                    }
                    C42962b bVar = C42962b.f111525a;
                    String str2 = "prop_click";
                    C22984d a = C22984d.m75611a().mo59970a("scene_id", 1002).mo59973a("tab_name", str2).mo59973a("prop_id", stickerWrapper2.f104908a.getEffectId()).mo59973a("prop_index", stickerWrapper2.f104908a.getGradeKey()).mo59973a("enter_method", "click_main_panel").mo59973a("creation_id", videoPublishEditModel.creationId).mo59973a("shoot_way", videoPublishEditModel.mShootWay).mo59970a("draft_id", videoPublishEditModel.draftId);
                    String str3 = "enter_from";
                    if (InfoStickerHolder.this.f105672c) {
                        str = "edit_post_page";
                    } else {
                        str = "video_edit_page";
                    }
                    bVar.mo104671a(str2, a.mo59973a(str3, str).f60753a);
                }
            };
            view.setOnClickListener(r1);
        }
    }

    /* renamed from: a */
    public final void mo100774a(final FragmentActivity fragmentActivity, final StickerWrapper stickerWrapper, double d, double d2) {
        stickerWrapper.f104910c = 2;
        this.f105671b.mo100258b();
        C40805n.m130407a(fragmentActivity).mo100808a(d, d2).observe(fragmentActivity, new C0053p<LiveDataWrapper<C40691ai>>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onChanged(LiveDataWrapper<C40691ai> liveDataWrapper) {
                switch (C406506.f105693a[liveDataWrapper.f88768b.ordinal()]) {
                    case 1:
                        C40805n.m130407a(fragmentActivity).f105746a = ((C40691ai) liveDataWrapper.f88767a).f105823a;
                        InfoStickerHolder.this.mo100777c(fragmentActivity, stickerWrapper);
                        return;
                    case 2:
                        stickerWrapper.f104910c = 3;
                        InfoStickerHolder.this.f105671b.mo100260c();
                        C10761a.m31399c((Context) InfoStickerHolder.this.f105670a, (int) R.string.ot).mo25750a();
                        break;
                }
            }
        });
    }
}
