package com.bytedance.android.livesdk.gift.effect.entry.p381c;

import android.animation.Animator;
import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;
import android.text.Spannable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.core.utils.C3393m;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.gift.C3436f;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.livesdk.chatroom.p212e.C4374z;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.gift.assets.C7874h;
import com.bytedance.android.livesdk.gift.assets.C7877j;
import com.bytedance.android.livesdk.gift.effect.entry.p379a.C8003b;
import com.bytedance.android.livesdk.gift.effect.entry.p383e.C8026a;
import com.bytedance.android.livesdk.gift.effect.entry.p383e.C8027b;
import com.bytedance.android.livesdk.gift.effect.entry.p383e.C8028c;
import com.bytedance.android.livesdk.gift.effect.entry.p384f.C8029a;
import com.bytedance.android.livesdk.gift.effect.entry.view.C8036a;
import com.bytedance.android.livesdk.gift.effect.entry.view.EcomEnterTrayView;
import com.bytedance.android.livesdk.gift.effect.entry.view.EnterAnimationView;
import com.bytedance.android.livesdk.gift.effect.entry.view.LandscapeNobleEnterTrayView;
import com.bytedance.android.livesdk.gift.effect.entry.view.PortraitNobleEnterTrayView;
import com.bytedance.android.livesdk.gift.effect.entry.view.UserEnterLevelView;
import com.bytedance.android.livesdk.gift.effect.entry.view.UserEnterRankView;
import com.bytedance.android.livesdk.gift.effect.entry.view.UserSpecialEntryView;
import com.bytedance.android.livesdk.i18n.C8317b;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.C8444d;
import com.bytedance.android.livesdk.message.model.C8514bj.C8515a;
import com.bytedance.android.livesdk.utils.C9066h;
import com.bytedance.android.livesdk.utils.C9066h.C9068b;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.message.C9505f;
import com.bytedance.common.utility.C6311g;
import com.facebook.drawee.backends.pipeline.C13380c;
import com.facebook.drawee.backends.pipeline.C13382e;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.gift.effect.entry.c.a */
public final class C8010a implements OnClickListener {

    /* renamed from: a */
    public EnterAnimationView f21734a;

    /* renamed from: b */
    public C3436f f21735b;

    /* renamed from: c */
    public int f21736c;

    /* renamed from: d */
    public int f21737d;

    /* renamed from: e */
    private Context f21738e;

    /* renamed from: f */
    private LinkedList<C8026a> f21739f;

    /* renamed from: g */
    private C8026a f21740g;

    /* renamed from: h */
    private Animator f21741h;

    /* renamed from: i */
    private int f21742i = ((Integer) LiveSettingKeys.LIVE_MESSAGE_QUEUE_MAX_LENGTH.mo10240a()).intValue();

    /* renamed from: j */
    private boolean f21743j = false;

    /* renamed from: a */
    public final void mo20921a() {
        this.f21743j = true;
        m24558f();
    }

    /* renamed from: c */
    public final void mo20925c() {
        if (this.f21737d < 0) {
            this.f21737d = 0;
        }
        m24558f();
    }

    /* renamed from: e */
    private ViewGroup m24556e() {
        UserSpecialEntryView userSpecialEntryView = (UserSpecialEntryView) LayoutInflater.from(this.f21738e).inflate(R.layout.azj, this.f21734a, false);
        userSpecialEntryView.setupUi(this.f21740g);
        return userSpecialEntryView;
    }

    /* renamed from: d */
    private void m24554d() {
        ListIterator listIterator = this.f21739f.listIterator();
        while (listIterator.hasNext()) {
            if (!((C8026a) listIterator.next()).mo20937b()) {
                listIterator.previous();
                listIterator.remove();
                return;
            }
        }
        this.f21739f.remove();
    }

    /* renamed from: b */
    public final void mo20923b() {
        this.f21739f.clear();
        while (this.f21734a.getChildCount() > 0) {
            View childAt = this.f21734a.getChildAt(0);
            UserEnterLevelView userEnterLevelView = (UserEnterLevelView) childAt.findViewById(R.id.edn);
            if (userEnterLevelView != null) {
                userEnterLevelView.mo20969b();
            }
            this.f21734a.removeView(childAt);
        }
        if (this.f21741h != null) {
            this.f21741h.cancel();
            this.f21741h = null;
        }
        this.f21737d = 0;
        this.f21743j = false;
    }

    /* renamed from: g */
    private void m24560g() {
        final ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(this.f21738e).inflate(R.layout.aze, this.f21734a, false);
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) viewGroup.getLayoutParams();
        marginLayoutParams.bottomMargin = this.f21736c;
        viewGroup.setLayoutParams(marginLayoutParams);
        UserEnterLevelView userEnterLevelView = (UserEnterLevelView) viewGroup.findViewById(R.id.edn);
        userEnterLevelView.setUI(this.f21740g);
        userEnterLevelView.setOnClickListener(this);
        UserEnterRankView userEnterRankView = (UserEnterRankView) viewGroup.findViewById(R.id.bj5);
        userEnterRankView.setupUI(this.f21740g);
        userEnterRankView.setOnClickListener(this);
        viewGroup.setX((float) this.f21734a.getWidth());
        viewGroup.setY(0.0f);
        this.f21734a.addView(viewGroup);
        this.f21741h = C8029a.m24605a(viewGroup, new C8003b() {
            /* renamed from: a */
            public final void mo20915a(Animator animator) {
                UserEnterLevelView userEnterLevelView = (UserEnterLevelView) viewGroup.findViewById(R.id.edn);
                if (userEnterLevelView != null) {
                    userEnterLevelView.mo20966a();
                }
            }

            public final void onAnimationEnd(Animator animator) {
                C8010a.this.f21734a.removeView(viewGroup);
                C8010a.this.f21737d--;
                C8010a.this.mo20925c();
            }
        });
        this.f21741h.start();
    }

    /* renamed from: f */
    private void m24558f() {
        if ((!LinkCrossRoomDataHolder.m13782a().f11664b || this.f21743j) && !this.f21739f.isEmpty() && this.f21737d <= 0) {
            this.f21737d++;
            this.f21740g = (C8026a) this.f21739f.poll();
            if (this.f21740g != null) {
                C8515a aVar = this.f21740g.f21789m;
                if (this.f21740g.mo20944d()) {
                    m24563i(this.f21740g);
                } else if (this.f21740g instanceof C8028c) {
                    C8028c cVar = (C8028c) this.f21740g;
                    if (cVar.f21797s != null && cVar.f21797s.getNobleLevel() > 0) {
                        m24548a(cVar);
                    }
                } else {
                    if (aVar == null) {
                        m24560g();
                    } else if (aVar.f23403a == 4) {
                        m24562h(this.f21740g);
                    } else if (aVar.f23403a == 5) {
                        m24561g(this.f21740g);
                    } else if (aVar.f23403a == 3) {
                        m24549a(aVar);
                    } else if (aVar.f23403a == 2) {
                        m24551b(aVar);
                    } else if (aVar.f23403a == 1) {
                        m24553c(aVar);
                    } else if (aVar.f23403a == 6) {
                        m24564j(this.f21740g);
                    } else if (aVar.f23403a == 7) {
                        m24565k(this.f21740g);
                    } else if (aVar.f23403a == 8) {
                        m24566l(this.f21740g);
                    }
                }
            }
        }
    }

    public final void onClick(View view) {
        if (this.f21740g != null && this.f21735b != null) {
            this.f21735b.mo10403a(this.f21740g.f21777a);
        }
    }

    /* renamed from: e */
    private void m24557e(C8026a aVar) {
        if (this.f21739f.isEmpty()) {
            this.f21739f.add(aVar);
            return;
        }
        C8026a aVar2 = (C8026a) this.f21739f.getLast();
        if (!aVar2.mo20944d()) {
            this.f21739f.add(aVar);
            return;
        }
        if ((aVar instanceof C8027b) && (aVar2 instanceof C8027b)) {
            aVar2.mo20936b(aVar.f21778b);
            C8027b bVar = (C8027b) aVar2;
            bVar.f21795s += ((C8027b) aVar).f21795s;
        }
    }

    /* renamed from: f */
    private void m24559f(C8026a aVar) {
        if (this.f21739f.isEmpty()) {
            this.f21739f.add(aVar);
        } else if (!((C8026a) this.f21739f.getLast()).mo20944d()) {
            this.f21739f.add(aVar);
        } else {
            if (this.f21739f.size() > 0) {
                this.f21739f.add(this.f21739f.size() - 1, aVar);
            }
        }
    }

    /* renamed from: a */
    private void m24549a(C8515a aVar) {
        final ViewGroup e = m24556e();
        View findViewById = e.findViewById(R.id.x6);
        if (findViewById != null) {
            findViewById.setOnClickListener(this);
        }
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) e.getLayoutParams();
        marginLayoutParams.bottomMargin = this.f21736c;
        e.setLayoutParams(marginLayoutParams);
        e.setX((float) this.f21734a.getWidth());
        e.setY(0.0f);
        this.f21734a.addView(e);
        C8029a.m24608a(e, new C8003b() {
            /* renamed from: a */
            public final void mo20915a(Animator animator) {
                UserSpecialEntryView userSpecialEntryView = (UserSpecialEntryView) e.findViewById(R.id.edo);
                if (userSpecialEntryView != null) {
                    userSpecialEntryView.mo20982a();
                }
            }

            public final void onAnimationEnd(Animator animator) {
                C8010a.this.f21734a.removeView(e);
                C8010a.this.f21737d--;
                C8010a.this.mo20925c();
            }
        }, aVar.f23408f).start();
    }

    /* renamed from: c */
    private void m24552c(final C8026a aVar) {
        final long j = aVar.f21789m.f23409g;
        C80111 r2 = new C7877j() {
            /* renamed from: a */
            public final void mo9346a(Throwable th) {
                C8010a.m24550a("下载进场特效资源失败", String.valueOf(aVar.f21777a), String.valueOf(j));
            }

            /* renamed from: a */
            public final void mo9345a(long j, String str) {
                aVar.f21790n = C9066h.m27071a(str);
                C8010a.this.mo20924b(aVar);
            }
        };
        C7874h assetsManager = ((IGiftService) C3596c.m13172a(IGiftService.class)).getAssetsManager();
        if (assetsManager != null) {
            AssetsModel c = assetsManager.mo20662c(j);
            if (c == null) {
                m24550a("资源列表中找不到这个进场特效", String.valueOf(aVar.f21777a), String.valueOf(j));
            } else if (c.getResourceType() != 6) {
                m24550a("获取到的特效资源不是进场webp特效", String.valueOf(aVar.f21777a), String.valueOf(j));
            } else {
                assetsManager.mo20656a(j, r2, 4);
            }
        }
    }

    /* renamed from: d */
    private void m24555d(C8026a aVar) {
        ListIterator listIterator = this.f21739f.listIterator();
        while (listIterator.hasNext()) {
            if (!((C8026a) listIterator.next()).mo20937b()) {
                listIterator.previous();
                listIterator.add(aVar);
                return;
            }
        }
        listIterator.add(aVar);
    }

    /* renamed from: h */
    private void m24562h(C8026a aVar) {
        if (aVar.f21789m != null) {
            final C8036a aVar2 = new C8036a(this.f21738e);
            aVar2.setUI(aVar);
            aVar2.setOnClickListener(this);
            aVar2.setX(750.0f);
            aVar2.setY(0.0f);
            LayoutParams layoutParams = new LayoutParams(-2, -2);
            layoutParams.gravity = 80;
            this.f21734a.addView(aVar2, layoutParams);
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) aVar2.getLayoutParams();
            marginLayoutParams.bottomMargin = C3358ac.m12510a(175.0f);
            aVar2.setLayoutParams(marginLayoutParams);
            C8029a.m24611c(aVar2, new C8003b(aVar2) {

                /* renamed from: a */
                final /* synthetic */ C8036a f21774a;

                /* renamed from: a */
                public final void mo20915a(Animator animator) {
                    this.f21774a.mo20987d();
                    this.f21774a.mo20984b();
                    this.f21774a.mo20986c();
                }

                public final void onAnimationEnd(Animator animator) {
                    C8010a.this.f21734a.removeView(aVar2);
                    C8010a.this.f21737d--;
                    C8010a.this.mo20925c();
                }

                {
                    this.f21774a = r2;
                }
            }).start();
        }
    }

    /* renamed from: i */
    private void m24563i(C8026a aVar) {
        if (this.f21734a != null && this.f21734a.getContext() != null) {
            if (!(aVar instanceof C8027b)) {
                if (this.f21737d == 1) {
                    this.f21737d--;
                }
                return;
            }
            final EcomEnterTrayView ecomEnterTrayView = new EcomEnterTrayView(this.f21734a.getContext());
            ecomEnterTrayView.mo20952a((C8027b) aVar);
            ecomEnterTrayView.setX((float) this.f21734a.getWidth());
            ecomEnterTrayView.setY(0.0f);
            LayoutParams layoutParams = new LayoutParams(-2, -2);
            layoutParams.gravity = 80;
            this.f21734a.addView(ecomEnterTrayView, layoutParams);
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) ecomEnterTrayView.getLayoutParams();
            marginLayoutParams.bottomMargin = this.f21736c;
            ecomEnterTrayView.setLayoutParams(marginLayoutParams);
            this.f21741h = C8029a.m24605a(ecomEnterTrayView, new C8003b() {
                /* renamed from: a */
                public final void mo20915a(Animator animator) {
                }

                public final void onAnimationEnd(Animator animator) {
                    C8010a.this.f21734a.removeView(ecomEnterTrayView);
                    C8010a.this.f21737d--;
                    C8010a.this.mo20925c();
                }
            });
            this.f21741h.start();
            C8443c.m25663a().mo21607a("buying_comment_show", Room.class);
        }
    }

    /* renamed from: b */
    public final void mo20924b(C8026a aVar) {
        if (!(aVar instanceof C8028c)) {
            if (aVar.mo20937b()) {
                m24555d(aVar);
            } else if (aVar.mo20944d()) {
                m24557e(aVar);
            } else {
                m24559f(aVar);
            }
        }
        if (this.f21739f.size() > this.f21742i) {
            m24554d();
        }
        m24558f();
    }

    /* renamed from: a */
    private void m24548a(C8028c cVar) {
        if (this.f21734a != null && this.f21734a.getContext() != null && cVar != null) {
            if (cVar.f21799u) {
                final PortraitNobleEnterTrayView portraitNobleEnterTrayView = new PortraitNobleEnterTrayView(this.f21734a.getContext());
                portraitNobleEnterTrayView.mo20963a(cVar);
                portraitNobleEnterTrayView.setX((float) this.f21734a.getWidth());
                portraitNobleEnterTrayView.setY(0.0f);
                LayoutParams layoutParams = new LayoutParams(-2, -2);
                layoutParams.gravity = 80;
                this.f21734a.addView(portraitNobleEnterTrayView, layoutParams);
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) portraitNobleEnterTrayView.getLayoutParams();
                marginLayoutParams.bottomMargin = this.f21736c;
                portraitNobleEnterTrayView.setLayoutParams(marginLayoutParams);
                this.f21741h = C8029a.m24605a(portraitNobleEnterTrayView, new C8003b() {
                    public final void onAnimationEnd(Animator animator) {
                        C8010a.this.f21734a.removeView(portraitNobleEnterTrayView);
                        C8010a.this.f21737d--;
                        C8010a.this.mo20925c();
                    }
                });
                this.f21741h.start();
                return;
            }
            final LandscapeNobleEnterTrayView landscapeNobleEnterTrayView = new LandscapeNobleEnterTrayView(this.f21734a.getContext());
            landscapeNobleEnterTrayView.mo20962a(cVar);
            landscapeNobleEnterTrayView.setX((float) this.f21734a.getWidth());
            landscapeNobleEnterTrayView.setY(0.0f);
            LayoutParams layoutParams2 = new LayoutParams(-2, -2);
            layoutParams2.gravity = 80;
            this.f21734a.addView(landscapeNobleEnterTrayView, layoutParams2);
            this.f21741h = C8029a.m24609b(landscapeNobleEnterTrayView, new C8003b() {
                public final void onAnimationEnd(Animator animator) {
                    C8010a.this.f21734a.removeView(landscapeNobleEnterTrayView);
                    C8010a.this.f21737d--;
                    C8010a.this.mo20925c();
                }
            });
            this.f21741h.start();
        }
    }

    /* renamed from: b */
    private void m24551b(C8515a aVar) {
        if (aVar != null) {
            final ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(this.f21738e).inflate(R.layout.azh, this.f21734a, false);
            ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.bsv);
            ViewGroup viewGroup3 = (ViewGroup) viewGroup.findViewById(R.id.aov);
            viewGroup.setX((float) this.f21734a.getWidth());
            viewGroup.setY(0.0f);
            LayoutParams layoutParams = new LayoutParams(-1, -2);
            layoutParams.gravity = 80;
            this.f21734a.addView(viewGroup, layoutParams);
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) viewGroup.getLayoutParams();
            marginLayoutParams.bottomMargin = this.f21736c;
            viewGroup.setLayoutParams(marginLayoutParams);
            viewGroup2.setVisibility(0);
            viewGroup3.setVisibility(8);
            HSImageView hSImageView = (HSImageView) viewGroup.findViewById(R.id.b6y);
            HSImageView hSImageView2 = (HSImageView) viewGroup.findViewById(R.id.b6z);
            final TextView textView = (TextView) viewGroup.findViewById(R.id.dra);
            if (aVar.f23406d == 1) {
                hSImageView.setVisibility(0);
                C3393m.m12624a(hSImageView, this.f21740g.f21780d);
            } else {
                hSImageView.setVisibility(8);
            }
            if (aVar.f23404b != null && !C6311g.m19573a(aVar.f23404b.getUrls())) {
                hSImageView2.setController(((C13382e) C13380c.m39166a().mo32713b(Uri.parse((String) aVar.f23404b.getUrls().get(0))).mo32751c(true)).mo32730f());
            }
            m24547a(textView, aVar);
            textView.post(new Runnable() {
                public final void run() {
                    textView.setSelected(true);
                }
            });
            C8029a.m24606a(viewGroup, new C8003b() {
                public final void onAnimationEnd(Animator animator) {
                    C8010a.this.f21734a.removeView(viewGroup);
                    C8010a.this.f21737d--;
                    C8010a.this.mo20925c();
                }
            }, 40.0f, -40.0f).start();
        }
    }

    /* renamed from: c */
    private void m24553c(C8515a aVar) {
        if (aVar != null) {
            final ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(this.f21738e).inflate(R.layout.azh, this.f21734a, false);
            ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.bsv);
            ViewGroup viewGroup3 = (ViewGroup) viewGroup.findViewById(R.id.aov);
            viewGroup.setX((float) this.f21734a.getWidth());
            viewGroup.setY(0.0f);
            LayoutParams layoutParams = new LayoutParams(-1, -2);
            layoutParams.gravity = 80;
            this.f21734a.addView(viewGroup, layoutParams);
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) viewGroup.getLayoutParams();
            marginLayoutParams.bottomMargin = this.f21736c;
            viewGroup.setLayoutParams(marginLayoutParams);
            viewGroup2.setVisibility(8);
            viewGroup3.setVisibility(0);
            HSImageView hSImageView = (HSImageView) viewGroup.findViewById(R.id.bca);
            TextView textView = (TextView) viewGroup.findViewById(R.id.e25);
            if (aVar.f23407e != null && !C6311g.m19573a(aVar.f23407e.getUrls())) {
                hSImageView.setController(((C13382e) C13380c.m39166a().mo32713b(Uri.parse((String) aVar.f23407e.getUrls().get(0))).mo32751c(true)).mo32730f());
            }
            m24547a(textView, aVar);
            textView.setSelected(true);
            C8029a.m24605a(viewGroup, new C8003b() {
                public final void onAnimationEnd(Animator animator) {
                    C8010a.this.f21734a.removeView(viewGroup);
                    C8010a.this.f21737d--;
                    C8010a.this.mo20925c();
                }
            }).start();
        }
    }

    /* renamed from: g */
    private void m24561g(C8026a aVar) {
        if (aVar.f21789m != null) {
            final C8036a aVar2 = new C8036a(this.f21738e);
            aVar2.setUI(aVar);
            aVar2.setOnClickListener(this);
            aVar2.setX(750.0f);
            aVar2.setY(0.0f);
            LayoutParams layoutParams = new LayoutParams(-2, -2);
            layoutParams.gravity = 80;
            this.f21734a.addView(aVar2, layoutParams);
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) aVar2.getLayoutParams();
            marginLayoutParams.bottomMargin = C3358ac.m12510a(175.0f);
            aVar2.setLayoutParams(marginLayoutParams);
            final View inflate = LayoutInflater.from(this.f21738e).inflate(R.layout.azi, this.f21734a, false);
            LayoutParams layoutParams2 = new LayoutParams(-1, -2);
            layoutParams2.gravity = 80;
            this.f21734a.addView(inflate, layoutParams2);
            MarginLayoutParams marginLayoutParams2 = (MarginLayoutParams) inflate.getLayoutParams();
            marginLayoutParams2.bottomMargin = C3358ac.m12510a(79.0f);
            inflate.setLayoutParams(marginLayoutParams2);
            HSImageView hSImageView = (HSImageView) inflate.findViewById(R.id.ege);
            C9068b bVar = aVar.f21790n;
            String str = null;
            if (bVar != null) {
                str = bVar.mo22256a(this.f21738e);
            }
            if (!TextUtils.isEmpty(str)) {
                hSImageView.setController(((C13382e) C13380c.m39166a().mo32713b(new Builder().scheme("file").path(str).build()).mo32751c(true)).mo32730f());
            }
            C8029a.m24611c(aVar2, new C8003b() {
                /* renamed from: a */
                public final void mo20915a(Animator animator) {
                    aVar2.mo20984b();
                    aVar2.mo20986c();
                }

                public final void onAnimationEnd(Animator animator) {
                    C8010a.this.f21734a.removeView(aVar2);
                    C8010a.this.f21734a.removeView(inflate);
                    C8010a.this.f21737d--;
                    C8010a.this.mo20925c();
                }
            }).start();
        }
    }

    /* renamed from: j */
    private void m24564j(C8026a aVar) {
        final ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(this.f21738e).inflate(R.layout.azd, this.f21734a, false);
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) viewGroup.getLayoutParams();
        marginLayoutParams.bottomMargin = this.f21736c;
        viewGroup.setLayoutParams(marginLayoutParams);
        UserEnterLevelView userEnterLevelView = (UserEnterLevelView) viewGroup.findViewById(R.id.edn);
        userEnterLevelView.mo20967a(this.f21740g, C3358ac.m12510a(22.0f), R.drawable.bpd, C3358ac.m12515a((int) R.string.ejf), R.color.aih, R.color.aih);
        userEnterLevelView.setOnClickListener(this);
        HSImageView hSImageView = (HSImageView) viewGroup.findViewById(R.id.gb);
        if (aVar.f21789m.f23404b != null) {
            hSImageView.setVisibility(0);
            C3393m.m12633b(hSImageView, aVar.f21789m.f23404b);
        }
        viewGroup.setX((float) this.f21734a.getWidth());
        viewGroup.setY(0.0f);
        this.f21734a.addView(viewGroup);
        this.f21741h = C8029a.m24605a(viewGroup, new C8003b() {
            /* renamed from: a */
            public final void mo20915a(Animator animator) {
                UserEnterLevelView userEnterLevelView = (UserEnterLevelView) viewGroup.findViewById(R.id.edn);
                if (userEnterLevelView != null) {
                    userEnterLevelView.mo20966a();
                }
            }

            public final void onAnimationEnd(Animator animator) {
                C8010a.this.f21734a.removeView(viewGroup);
                C8010a.this.f21737d--;
                C8010a.this.mo20925c();
            }
        });
        this.f21741h.start();
    }

    /* renamed from: k */
    private void m24565k(C8026a aVar) {
        if (aVar.f21789m != null) {
            final ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(this.f21738e).inflate(R.layout.azd, this.f21734a, false);
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) viewGroup.getLayoutParams();
            marginLayoutParams.bottomMargin = this.f21736c;
            viewGroup.setLayoutParams(marginLayoutParams);
            UserEnterLevelView userEnterLevelView = (UserEnterLevelView) viewGroup.findViewById(R.id.edn);
            userEnterLevelView.mo20967a(this.f21740g, C3358ac.m12510a(22.0f), R.drawable.bpd, C3358ac.m12515a((int) R.string.ejf), R.color.aih, R.color.aih);
            userEnterLevelView.setOnClickListener(this);
            viewGroup.setX((float) this.f21734a.getWidth());
            viewGroup.setY(0.0f);
            this.f21734a.addView(viewGroup);
            final View inflate = LayoutInflater.from(this.f21738e).inflate(R.layout.azi, this.f21734a, false);
            LayoutParams layoutParams = new LayoutParams(-1, -2);
            layoutParams.gravity = 80;
            this.f21734a.addView(inflate, layoutParams);
            MarginLayoutParams marginLayoutParams2 = (MarginLayoutParams) inflate.getLayoutParams();
            marginLayoutParams2.bottomMargin = this.f21736c - (C3358ac.m12526d(R.dimen.rp) - C3358ac.m12510a(78.0f));
            inflate.setLayoutParams(marginLayoutParams2);
            HSImageView hSImageView = (HSImageView) inflate.findViewById(R.id.ege);
            LayoutParams layoutParams2 = (LayoutParams) hSImageView.getLayoutParams();
            layoutParams2.height = C3358ac.m12510a(255.0f);
            hSImageView.setLayoutParams(layoutParams2);
            C9068b bVar = aVar.f21790n;
            String str = null;
            if (bVar != null) {
                str = bVar.mo22256a(this.f21738e);
            }
            if (!TextUtils.isEmpty(str)) {
                hSImageView.setController(((C13382e) C13380c.m39166a().mo32713b(new Builder().scheme("file").path(str).build()).mo32751c(true)).mo32730f());
            }
            this.f21741h = C8029a.m24611c(viewGroup, new C8003b() {
                /* renamed from: a */
                public final void mo20915a(Animator animator) {
                    UserEnterLevelView userEnterLevelView = (UserEnterLevelView) viewGroup.findViewById(R.id.edn);
                    if (userEnterLevelView != null) {
                        userEnterLevelView.mo20966a();
                    }
                }

                public final void onAnimationEnd(Animator animator) {
                    C8010a.this.f21734a.removeView(viewGroup);
                    C8010a.this.f21734a.removeView(inflate);
                    C8010a.this.f21737d--;
                    C8010a.this.mo20925c();
                }
            });
            this.f21741h.start();
        }
    }

    /* renamed from: l */
    private void m24566l(C8026a aVar) {
        String str;
        if (aVar != null && aVar.f21789m != null) {
            final ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(this.f21738e).inflate(R.layout.azg, this.f21734a, false);
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) viewGroup.getLayoutParams();
            marginLayoutParams.bottomMargin = this.f21736c;
            viewGroup.setLayoutParams(marginLayoutParams);
            C8515a aVar2 = aVar.f21789m;
            Spannable a = C4374z.m14749a(aVar2.f23405c, "");
            UserEnterLevelView userEnterLevelView = (UserEnterLevelView) viewGroup.findViewById(R.id.edn);
            HSImageView hSImageView = (HSImageView) viewGroup.findViewById(R.id.gb);
            if (aVar2.f23404b != null) {
                hSImageView.setVisibility(0);
                C3393m.m12619a(hSImageView, aVar2.f23404b);
            }
            userEnterLevelView.mo20968a(a, aVar2.f23410h, aVar2.f23407e);
            userEnterLevelView.setOnClickListener(this);
            viewGroup.setX((float) this.f21734a.getWidth());
            viewGroup.setY(0.0f);
            this.f21734a.addView(viewGroup);
            final View inflate = LayoutInflater.from(this.f21738e).inflate(R.layout.azi, this.f21734a, false);
            LayoutParams layoutParams = new LayoutParams(-1, -2);
            layoutParams.gravity = 80;
            this.f21734a.addView(inflate, layoutParams);
            MarginLayoutParams marginLayoutParams2 = (MarginLayoutParams) inflate.getLayoutParams();
            marginLayoutParams2.bottomMargin = this.f21736c - (C3358ac.m12526d(R.dimen.rp) - C3358ac.m12510a(78.0f));
            inflate.setLayoutParams(marginLayoutParams2);
            HSImageView hSImageView2 = (HSImageView) inflate.findViewById(R.id.ege);
            LayoutParams layoutParams2 = (LayoutParams) hSImageView2.getLayoutParams();
            layoutParams2.height = C3358ac.m12510a(255.0f);
            hSImageView2.setLayoutParams(layoutParams2);
            C9068b bVar = aVar.f21790n;
            String str2 = null;
            if (bVar != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(bVar.f24724a);
                if (this.f21738e.getResources().getConfiguration().orientation == 1) {
                    str = bVar.f24725b;
                } else {
                    str = bVar.f24726c;
                }
                sb.append(str);
                str2 = sb.toString();
            }
            if (!TextUtils.isEmpty(str2)) {
                hSImageView2.setController(((C13382e) C13380c.m39166a().mo32713b(new Builder().scheme("file").path(str2).build()).mo32751c(true)).mo32730f());
            }
            this.f21741h = C8029a.m24610b(viewGroup, new C8003b() {
                /* renamed from: a */
                public final void mo20915a(Animator animator) {
                    UserEnterLevelView userEnterLevelView = (UserEnterLevelView) viewGroup.findViewById(R.id.edn);
                    if (userEnterLevelView != null) {
                        userEnterLevelView.mo20966a();
                    }
                }

                public final void onAnimationEnd(Animator animator) {
                    C8010a.this.f21734a.removeView(viewGroup);
                    C8010a.this.f21734a.removeView(inflate);
                    C8010a.this.f21737d--;
                    C8010a.this.mo20925c();
                }
            }, aVar2.f23408f);
            this.f21741h.start();
        }
    }

    /* renamed from: a */
    public final void mo20922a(C8026a aVar) {
        if (aVar.f21789m == null || !(aVar.f21789m.f23403a == 5 || aVar.f21789m.f23403a == 7)) {
            if (aVar.f21789m != null && aVar.f21789m.f23403a == 8) {
                long j = aVar.f21789m.f23409g;
                C7874h assetsManager = ((IGiftService) C3596c.m13172a(IGiftService.class)).getAssetsManager();
                if (!(assetsManager == null || assetsManager.mo20662c(j) == null || assetsManager.mo20662c(j).getResourceType() != 6)) {
                    m24552c(aVar);
                    return;
                }
            }
            mo20924b(aVar);
            return;
        }
        m24552c(aVar);
    }

    public C8010a(Context context, EnterAnimationView enterAnimationView) {
        this.f21738e = context;
        this.f21734a = enterAnimationView;
        this.f21739f = new LinkedList<>();
    }

    /* renamed from: a */
    private static void m24547a(TextView textView, C8515a aVar) {
        if (aVar != null && textView != null) {
            C9505f fVar = aVar.f23405c;
            String str = null;
            String str2 = fVar.f26014b;
            if (fVar.f26013a != null) {
                str = C8317b.m25387a().mo21482a(fVar.f26013a);
            }
            if (!(str == null && str2 == null)) {
                if (TextUtils.isEmpty(str)) {
                    str = str2;
                }
                textView.setText(C4374z.m14751a(str, fVar));
            }
        }
    }

    /* renamed from: a */
    public static void m24550a(String str, String str2, String str3) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("desc", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put("msg_id", str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            hashMap.put("asset_id", str3);
        }
        C8444d.m25673b().mo10003c("ttlive_msg", (Map<String, ?>) hashMap);
    }
}
