package com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker;

import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.Lifecycle.Event;
import android.support.p022v4.app.FragmentActivity;
import android.support.p022v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.ViewPagerBottomSheetBehavior;
import com.p280ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.ViewPagerBottomSheetBehavior.C23369a;
import com.p280ss.android.ugc.aweme.base.utils.C6900g;
import com.p280ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.net.C25706a;
import com.p280ss.android.ugc.aweme.photomovie.p1454a.C34856c;
import com.p280ss.android.ugc.aweme.photomovie.p1454a.C34860g;
import com.p280ss.android.ugc.aweme.photomovie.p1454a.C34860g.C34861a;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.property.AVAB.Property;
import com.p280ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.C40698f.C40699a;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1605g.C40575a;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1605g.C40582c;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.C41006c;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.C41011f;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.TabLayoutOnPageChangeListener;
import com.p280ss.android.ugc.aweme.themechange.base.AVDmtTabLayout;
import com.p280ss.android.ugc.aweme.utils.C42939as;
import com.p280ss.android.ugc.aweme.utils.C42962b;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;
import org.greenrobot.eventbus.C7705c;
import org.greenrobot.eventbus.C7709l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.InfoStickerViewImpl */
public class InfoStickerViewImpl implements C0042h, C40698f {

    /* renamed from: a */
    public FragmentActivity f105724a;

    /* renamed from: b */
    public C40699a f105725b;

    /* renamed from: c */
    public C40575a f105726c;

    /* renamed from: d */
    public VideoPublishEditModel f105727d;

    /* renamed from: e */
    public boolean f105728e;

    /* renamed from: f */
    public LinearLayout f105729f;

    /* renamed from: g */
    public SearchInfoStickerPresenter f105730g;

    /* renamed from: h */
    public EditText f105731h;

    /* renamed from: i */
    private FrameLayout f105732i;

    /* renamed from: j */
    private View f105733j;

    /* renamed from: k */
    private InfoStickerPagerAdapter f105734k;

    /* renamed from: l */
    private AVDmtTabLayout f105735l;

    /* renamed from: m */
    private C40813s f105736m;

    /* renamed from: n */
    private ViewPagerBottomSheetBehavior f105737n;

    /* renamed from: a */
    public final void mo100801a() {
        this.f105732i.removeAllViews();
        m130033c();
        this.f105726c.mo74845a((C34856c) new C40582c());
        this.f105737n.mo60683b(3);
    }

    /* renamed from: b */
    public final void mo100803b() {
        if (this.f105726c != null) {
            this.f105726c.mo74849b(new C40582c());
        }
        this.f105737n.mo60683b(5);
        KeyboardUtils.m77057c(this.f105731h);
    }

    /* access modifiers changed from: 0000 */
    @C0054q(mo125a = Event.ON_DESTROY)
    public void onDestroy() {
        C40805n.m130407a(this.f105724a).mo100815a();
        if (C7705c.m23799a().mo20392b((Object) this)) {
            C7705c.m23799a().mo20393c((Object) this);
        }
        this.f105733j = null;
        this.f105724a = null;
    }

    /* renamed from: d */
    private void m130034d() {
        if (C35574k.m114859a().mo70096k().mo93305a(Property.EnableSearchGIF)) {
            RelativeLayout relativeLayout = (RelativeLayout) this.f105733j.findViewById(R.id.b10);
            relativeLayout.setVisibility(0);
            this.f105729f = (LinearLayout) this.f105733j.findViewById(R.id.b0z);
            this.f105731h = (EditText) this.f105733j.findViewById(R.id.e19);
            TextView textView = (TextView) this.f105733j.findViewById(R.id.e1a);
            this.f105731h.setCursorVisible(false);
            this.f105731h.clearFocus();
            this.f105730g = new SearchInfoStickerPresenter(this.f105733j, this.f105724a);
            this.f105730g.mo100832a();
            this.f105730g.f105776b = new C40676a() {
                /* renamed from: a */
                public final void mo100806a() {
                    InfoStickerViewImpl.this.f105731h.setCursorVisible(false);
                    InfoStickerViewImpl.this.f105731h.clearFocus();
                    InfoStickerViewImpl.this.f105729f.setVisibility(0);
                    InfoStickerViewImpl.this.mo100802a(false);
                }
            };
            this.f105736m = new C40813s(this.f105724a, relativeLayout, textView);
            this.f105731h.setOnTouchListener(new OnTouchListener() {
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    String str;
                    if (motionEvent.getAction() == 1) {
                        InfoStickerViewImpl.this.f105729f.setVisibility(4);
                        InfoStickerViewImpl.this.f105730g.mo100837b();
                        InfoStickerViewImpl.this.f105731h.requestFocus();
                        InfoStickerViewImpl.this.f105731h.setCursorVisible(true);
                        InfoStickerViewImpl.this.mo100802a(true);
                        String str2 = "sticker_search_keyword";
                        C22984d a = new C22984d().mo59973a("creation_id", InfoStickerViewImpl.this.f105727d.creationId).mo59973a("shoot_way", InfoStickerViewImpl.this.f105727d.mShootWay).mo59973a("content_source", InfoStickerViewImpl.this.f105727d.getAvetParameter().getContentSource()).mo59973a("content_type", InfoStickerViewImpl.this.f105727d.getAvetParameter().getContentType());
                        String str3 = "enter_from";
                        if (InfoStickerViewImpl.this.f105728e) {
                            str = "edit_post_page";
                        } else {
                            str = "video_edit_page";
                        }
                        C6907h.m21524a(str2, (Map) a.mo59973a(str3, str).mo59973a("tab_name", "贴图").f60753a);
                    }
                    return false;
                }
            });
        }
    }

    /* renamed from: c */
    private void m130033c() {
        boolean z = false;
        if (this.f105733j == null) {
            this.f105724a.getLifecycle().mo55a(this);
            C7705c.m23799a().mo20389a((Object) this);
            this.f105733j = LayoutInflater.from(this.f105724a).inflate(R.layout.h3, this.f105732i, false);
            FrameLayout frameLayout = (FrameLayout) this.f105733j.findViewById(R.id.daz);
            this.f105735l = (AVDmtTabLayout) this.f105733j.findViewById(R.id.dbe);
            ViewPager viewPager = (ViewPager) this.f105733j.findViewById(R.id.edp);
            m130034d();
            this.f105734k = new InfoStickerPagerAdapter(this.f105724a.getSupportFragmentManager(), viewPager);
            this.f105734k.f105694a = this.f105728e;
            viewPager.setAdapter(this.f105734k);
            viewPager.setOffscreenPageLimit(3);
            viewPager.addOnPageChangeListener(new TabLayoutOnPageChangeListener(this.f105735l));
            m130031a(viewPager);
            m130032a(this.f105734k);
            viewPager.setCurrentItem(0);
            this.f105737n = ViewPagerBottomSheetBehavior.m76628a(frameLayout);
            this.f105737n.f61460k = new C23369a() {
                /* renamed from: a */
                public final void mo60691a(View view, float f) {
                }

                /* renamed from: a */
                public final void mo60692a(View view, int i) {
                    if (i == 4) {
                        if (InfoStickerViewImpl.this.f105726c != null) {
                            InfoStickerViewImpl.this.f105726c.mo100637e();
                        }
                    } else if (i == 1) {
                        KeyboardUtils.m77057c(InfoStickerViewImpl.this.f105731h);
                    }
                }
            };
            this.f105737n.mo60680a(viewPager);
            this.f105726c = new C40575a(this.f105732i, this.f105733j, frameLayout);
            this.f105726c.mo74846a((C34860g) new C34861a() {
                /* renamed from: a */
                public final void mo74767a() {
                    if (InfoStickerViewImpl.this.f105725b != null) {
                        InfoStickerViewImpl.this.f105725b.mo100878a();
                    }
                    if (InfoStickerViewImpl.this.f105730g != null) {
                        InfoStickerViewImpl.this.f105730g.mo100836a(true);
                    }
                    if (C6900g.m21454b().mo16942c() && InfoStickerViewImpl.this.f105724a != null) {
                        C40805n.m130407a(InfoStickerViewImpl.this.f105724a).mo100822c();
                    }
                }

                /* renamed from: d */
                public final void mo74768d() {
                    if (InfoStickerViewImpl.this.f105725b != null) {
                        InfoStickerViewImpl.this.f105725b.mo100880b();
                    }
                    if (InfoStickerViewImpl.this.f105730g != null) {
                        InfoStickerViewImpl.this.f105730g.mo100836a(false);
                    }
                    if (InfoStickerViewImpl.this.f105724a != null) {
                        C40805n.m130407a(InfoStickerViewImpl.this.f105724a).mo100821b();
                    }
                }
            });
            this.f105733j.findViewById(R.id.dbj).setOnClickListener(new C42939as() {
                /* renamed from: a */
                public final void mo70606a(View view) {
                    InfoStickerViewImpl.this.f105726c.mo74849b(new C40582c());
                }
            });
            C40805n.m130407a(this.f105724a).mo100823d().observe(this.f105724a, new C0053p<Effect>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public void onChanged(Effect effect) {
                    if (InfoStickerViewImpl.this.f105725b != null) {
                        switch (C40814t.m130425a(effect)) {
                            case 2:
                                InfoStickerViewImpl.this.f105725b.mo100879a(effect, String.valueOf(C40805n.m130407a(InfoStickerViewImpl.this.f105724a).f105746a));
                                return;
                            case 3:
                            case 4:
                                InfoStickerViewImpl.this.f105725b.mo100879a(effect, String.valueOf(System.currentTimeMillis() / 1000));
                                return;
                            default:
                                InfoStickerViewImpl.this.f105725b.mo100879a(effect, null);
                                break;
                        }
                    }
                }
            });
        }
        InfoStickerPagerAdapter infoStickerPagerAdapter = this.f105734k;
        if (!this.f105727d.isStickPointMode && !this.f105727d.isReaction() && !this.f105727d.isDuet() && !this.f105727d.isReviewVideo()) {
            z = true;
        }
        infoStickerPagerAdapter.f105695b = z;
    }

    /* renamed from: a */
    private void m130031a(final ViewPager viewPager) {
        this.f105735l.mo101335a(new C41006c() {
            /* renamed from: b */
            public final void mo74744b(C41011f fVar) {
            }

            /* renamed from: c */
            public final void mo74745c(C41011f fVar) {
            }

            /* renamed from: a */
            public final void mo74743a(C41011f fVar) {
                String str;
                String str2;
                C42962b bVar = C42962b.f111525a;
                String str3 = "click_prop_tab";
                C22984d a = C22984d.m75611a().mo59970a("scene_id", 1002).mo59973a("creation_id", InfoStickerViewImpl.this.f105727d.creationId).mo59973a("shoot_way", InfoStickerViewImpl.this.f105727d.mShootWay).mo59970a("draft_id", InfoStickerViewImpl.this.f105727d.draftId);
                String str4 = "tab_name";
                if (fVar.f106702e == 0) {
                    str = "表情";
                } else {
                    str = "emoji";
                }
                C22984d a2 = a.mo59973a(str4, str);
                String str5 = "enter_from";
                if (InfoStickerViewImpl.this.f105728e) {
                    str2 = "edit_post_page";
                } else {
                    str2 = "video_edit_page";
                }
                bVar.mo104671a(str3, a2.mo59973a(str5, str2).f60753a);
                viewPager.setCurrentItem(fVar.f106702e, true);
            }
        });
    }

    @C7709l
    public void onEvent(C25706a aVar) {
        if (C6900g.m21454b().mo16942c()) {
            C40805n.m130407a(this.f105724a).mo100822c();
        } else {
            C40805n.m130407a(this.f105724a).mo100821b();
        }
    }

    /* renamed from: a */
    private void m130032a(InfoStickerPagerAdapter infoStickerPagerAdapter) {
        this.f105735l.mo101344b();
        this.f105735l.setMaxTabModeForCount(infoStickerPagerAdapter.getCount());
        for (int i = 0; i < infoStickerPagerAdapter.getCount(); i++) {
            this.f105735l.mo101336a(this.f105735l.mo101329a().mo101401a(infoStickerPagerAdapter.mo100778a(i)));
        }
    }

    /* renamed from: a */
    public final void mo100802a(boolean z) {
        if (z) {
            this.f105736m.mo101084b();
        } else {
            this.f105736m.mo101083a();
        }
    }

    public InfoStickerViewImpl(FragmentActivity fragmentActivity, FrameLayout frameLayout, VideoPublishEditModel videoPublishEditModel, C40699a aVar) {
        this.f105724a = fragmentActivity;
        this.f105732i = frameLayout;
        this.f105725b = aVar;
        this.f105727d = videoPublishEditModel;
    }
}
