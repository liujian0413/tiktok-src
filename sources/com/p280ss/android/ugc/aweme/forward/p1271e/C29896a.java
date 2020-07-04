package com.p280ss.android.ugc.aweme.forward.p1271e;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.support.p022v4.content.C0683b;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.TextView;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.ugc.appcontext.C6405d;
import com.facebook.keyframes.C14005b;
import com.facebook.keyframes.C14005b.C14008c;
import com.facebook.keyframes.C14027d;
import com.facebook.keyframes.model.C14052j;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.anim.C22544a;
import com.p280ss.android.ugc.aweme.anim.C22549b;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.flowfeed.p1256ui.CommentLikeListView;
import com.p280ss.android.ugc.aweme.flowfeed.p968a.C21740a;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21743a;
import com.p280ss.android.ugc.aweme.i18n.C30537o;
import com.p280ss.android.ugc.aweme.login.C32656f;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.utils.C42914ab;
import com.p280ss.android.ugc.aweme.utils.C43013ch;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.forward.e.a */
public final class C29896a {

    /* renamed from: a */
    public ImageView f78520a;

    /* renamed from: b */
    public CommentLikeListView f78521b;

    /* renamed from: c */
    public C14005b f78522c;

    /* renamed from: d */
    public boolean f78523d;

    /* renamed from: e */
    public Context f78524e;

    /* renamed from: f */
    public C14008c f78525f = new C14008c() {
        /* renamed from: a */
        public final void mo33668a() {
            ImageView imageView = C29896a.this.f78520a;
            imageView.setImageAlpha(254);
            imageView.setImageDrawable(C0683b.m2903a(C29896a.this.f78524e, (int) R.drawable.m2));
        }
    };

    /* renamed from: g */
    private TextView f78526g;

    /* renamed from: h */
    private int f78527h;

    /* renamed from: i */
    private int f78528i;

    /* renamed from: j */
    private int f78529j;

    /* renamed from: k */
    private int f78530k;

    /* renamed from: l */
    private int f78531l;

    /* renamed from: m */
    private int f78532m;

    /* renamed from: n */
    private int f78533n;

    /* renamed from: o */
    private C21743a f78534o;

    /* renamed from: p */
    private Aweme f78535p;

    /* renamed from: q */
    private boolean f78536q;

    /* renamed from: a */
    public final void mo75957a(String str, long j) {
        if (!C6861a.m21337f().isLogin()) {
            String aid = this.f78535p != null ? this.f78535p.getAid() : "";
            C32656f.m105743a(C6405d.m19984g(), str, "click_like", C42914ab.m136242a().mo104633a("group_id", aid).mo104633a("log_pb", C33230ac.m107234j(aid)).f111445a);
            return;
        }
        m97917a(this.f78535p, (View) this.f78520a);
        if (!C29901b.m97928a(this.f78524e)) {
            C10761a.m31399c(this.f78524e, (int) R.string.cjs).mo25750a();
        } else {
            m97920c(this.f78535p, j);
        }
    }

    /* renamed from: b */
    private void m97919b() {
        this.f78520a.animate().scaleY(0.0f).scaleX(0.0f).setDuration(200).setInterpolator(new AccelerateDecelerateInterpolator()).withEndAction(new Runnable() {
            public final void run() {
                C22544a.m74540a().mo59153a(C6399b.m19921a(), "new_follow_anim_likes_explode", new C22549b() {
                    /* renamed from: a */
                    public final void mo59157a(C14052j jVar, String str) {
                        Drawable a = C0683b.m2903a(C29896a.this.f78524e, (int) R.drawable.ic_home_like_after);
                        if (a != null) {
                            a.setBounds(0, 0, 120, 114);
                            C29896a.this.f78522c = new C14027d().mo33683a(jVar).f37043c.mo33685a(Pair.create("keyframes", Pair.create(a, new Matrix()))).mo33684a();
                        }
                        ImageView imageView = C29896a.this.f78520a;
                        imageView.animate().scaleX(1.0f).scaleY(1.0f).setDuration(1).start();
                        imageView.setVisibility(0);
                        imageView.setLayerType(1, null);
                        imageView.setImageDrawable(C29896a.this.f78522c);
                        imageView.setImageAlpha(0);
                        C29896a.this.f78522c.mo33650a();
                        C29896a.this.f78522c.mo33654c();
                        C29896a.this.f78522c.mo33652a(C29896a.this.f78525f);
                    }
                });
            }
        }).start();
    }

    /* renamed from: a */
    private void m97915a() {
        LayoutParams layoutParams = this.f78520a.getLayoutParams();
        if (layoutParams.width != this.f78530k || layoutParams.height != this.f78531l) {
            layoutParams.width = this.f78530k;
            layoutParams.height = this.f78531l;
            this.f78520a.setScaleType(ScaleType.CENTER_INSIDE);
            this.f78520a.setLayoutParams(layoutParams);
        } else if (!(layoutParams.width == this.f78532m && layoutParams.height == this.f78533n)) {
            layoutParams.width = this.f78532m;
            layoutParams.height = this.f78533n;
            this.f78520a.setLayoutParams(layoutParams);
        }
        this.f78520a.setImageResource(R.drawable.m2);
    }

    /* renamed from: a */
    private static String m97914a(int i) {
        if (i > 0) {
            return C30537o.m99738a((long) i);
        }
        if (!C43013ch.m136514a()) {
            return "0";
        }
        return C6399b.m19921a().getString(R.string.apc);
    }

    /* renamed from: a */
    private void m97916a(final View view) {
        if (view != null) {
            view.animate().scaleX(0.8f).scaleY(0.8f).setDuration(80).withEndAction(new Runnable() {
                public final void run() {
                    view.animate().scaleX(1.0f).scaleY(1.0f).setDuration(80).start();
                }
            }).start();
        }
    }

    /* renamed from: b */
    public final void mo75958b(Aweme aweme) {
        if (this.f78524e != null && aweme != null) {
            if (!this.f78523d) {
                this.f78527h++;
                m97918a(true);
                return;
            }
            if (this.f78523d) {
                this.f78527h--;
                m97918a(false);
            }
        }
    }

    /* renamed from: a */
    private void m97918a(boolean z) {
        if (this.f78535p != null) {
            this.f78523d = z;
            this.f78520a.setSelected(z);
            if (!this.f78536q) {
                if (z) {
                    if (this.f78529j == 1) {
                        this.f78526g.setText(m97914a(this.f78528i));
                    } else {
                        this.f78526g.setText(m97914a(this.f78528i + 1));
                    }
                } else if (this.f78529j == 1) {
                    this.f78526g.setText(m97914a(this.f78528i - 1));
                } else {
                    this.f78526g.setText(m97914a(this.f78528i));
                }
            } else if (this.f78521b != null) {
                if (z) {
                    if (this.f78529j != 1) {
                        this.f78521b.mo75175a(this.f78528i + 1);
                        return;
                    }
                } else if (this.f78529j == 1) {
                    this.f78521b.mo75175a(this.f78528i - 1);
                    return;
                }
                this.f78521b.mo75175a(this.f78528i);
            }
        }
    }

    /* renamed from: a */
    public final void mo75955a(Aweme aweme) {
        int i;
        this.f78535p = aweme;
        if (!this.f78536q) {
            String e = C21740a.m72689e(this.f78535p);
            if (!TextUtils.isEmpty(e)) {
                this.f78526g.setText(e);
            }
        }
        boolean z = false;
        if (this.f78535p.getStatistics() == null) {
            i = 0;
        } else {
            i = this.f78535p.getStatistics().getDiggCount();
        }
        this.f78527h = i;
        this.f78528i = this.f78527h;
        this.f78529j = this.f78535p.getUserDigg();
        if (this.f78535p.getUserDigg() == 1) {
            z = true;
        }
        m97918a(z);
    }

    /* renamed from: c */
    private void m97920c(Aweme aweme, long j) {
        if (this.f78524e != null && aweme != null) {
            if (this.f78523d || aweme.getUserDigg() != 0) {
                boolean z = false;
                if (!this.f78523d || aweme.getUserDigg() == 0) {
                    if (aweme.getUserDigg() == 1) {
                        z = true;
                    }
                    this.f78523d = z;
                    m97918a(this.f78523d);
                    if (this.f78523d) {
                        this.f78527h++;
                        return;
                    }
                    this.f78527h--;
                } else {
                    this.f78527h--;
                    m97918a(false);
                    if (this.f78534o != null) {
                        this.f78534o.mo58070a(this.f78535p, 0, "click_like", j);
                    }
                }
            } else {
                this.f78527h++;
                m97918a(true);
                if (this.f78534o != null) {
                    this.f78534o.mo58070a(this.f78535p, 1, "click_like", j);
                }
            }
        }
    }

    /* renamed from: a */
    private void m97917a(Aweme aweme, View view) {
        if (aweme != null) {
            if (this.f78523d || aweme.getUserDigg() != 0) {
                m97916a(view);
            } else {
                m97919b();
            }
        }
    }

    /* renamed from: b */
    public final void mo75959b(Aweme aweme, long j) {
        if (!(aweme == null || aweme.getForwardItem() == null || aweme.getStatus() == null || !C29901b.m97928a(this.f78524e) || ((aweme.getUserDigg() != 0 && aweme.getForwardItem().getUserDigg() != 0) || !aweme.isCanPlay() || aweme.getStatus().isDelete() || aweme.getStatus().getPrivateStatus() == 1 || this.f78523d))) {
            if (this.f78534o != null) {
                this.f78534o.mo58071b(this.f78535p, 1, "click_double_like", j);
            }
            m97918a(true);
            m97919b();
        }
    }

    /* renamed from: a */
    public final void mo75956a(Aweme aweme, long j) {
        if (aweme != null && aweme.getStatus() != null && C29901b.m97928a(this.f78524e) && aweme.getUserDigg() == 0 && aweme.isCanPlay() && !aweme.getStatus().isDelete() && aweme.getStatus().getPrivateStatus() != 1 && !this.f78523d) {
            this.f78527h++;
            m97918a(true);
            if (this.f78534o != null) {
                this.f78534o.mo58070a(this.f78535p, 1, "click_double_like", j);
            }
            m97919b();
        }
    }

    public C29896a(Context context, ImageView imageView, TextView textView, C21743a aVar) {
        this.f78524e = context;
        this.f78534o = aVar;
        this.f78536q = false;
        this.f78520a = imageView;
        this.f78526g = textView;
        this.f78530k = (int) C9738o.m28708b(this.f78524e, 20.0f);
        this.f78531l = (int) C9738o.m28708b(this.f78524e, 20.0f);
        this.f78532m = (int) C9738o.m28708b(this.f78524e, 20.0f);
        this.f78533n = (int) C9738o.m28708b(this.f78524e, 20.0f);
        m97915a();
    }

    public C29896a(Context context, ImageView imageView, TextView textView, C21743a aVar, boolean z) {
        this.f78524e = context;
        this.f78534o = aVar;
        this.f78536q = z;
        this.f78520a = imageView;
        this.f78526g = textView;
        this.f78530k = (int) C9738o.m28708b(this.f78524e, 25.0f);
        this.f78531l = (int) C9738o.m28708b(this.f78524e, 25.0f);
        this.f78532m = (int) C9738o.m28708b(this.f78524e, 25.0f);
        this.f78533n = this.f78532m;
        m97915a();
    }
}
