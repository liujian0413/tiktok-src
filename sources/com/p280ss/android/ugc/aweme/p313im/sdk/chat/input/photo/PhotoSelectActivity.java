package com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.photo;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import bolts.C1591g;
import bolts.C1592h;
import com.C1642a;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.uikit.p576a.C10994a;
import com.p280ss.android.chooser.C19262f;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ugc.aweme.base.AmeActivity;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.p313im.sdk.BaseViewHolder;
import com.p280ss.android.ugc.aweme.p313im.sdk.abtest.C6928b;
import com.p280ss.android.ugc.aweme.p313im.sdk.abtest.C6943d;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.C30872j;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.emoji.EmojiAddActivity;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.net.C30963v;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.p1314a.C30731a;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C31088l;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6956a;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31878ax.C31882a;
import com.p280ss.android.ugc.aweme.p313im.sdk.widget.GridSpacingItemDecoration;
import com.p280ss.android.ugc.aweme.p313im.sdk.widget.WrapGridLayoutManager;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import org.greenrobot.eventbus.C7705c;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.photo.PhotoSelectActivity */
public class PhotoSelectActivity extends AmeActivity {

    /* renamed from: a */
    public int f80882a;

    /* renamed from: b */
    public int f80883b;

    /* renamed from: c */
    public String f80884c;

    /* renamed from: d */
    public WrapGridLayoutManager f80885d;

    /* renamed from: e */
    public RecyclerView f80886e;

    /* renamed from: f */
    public View f80887f;

    /* renamed from: g */
    public View f80888g;

    /* renamed from: h */
    public View f80889h;

    /* renamed from: i */
    public TextView f80890i;

    /* renamed from: j */
    public ImageView f80891j;

    /* renamed from: k */
    public TextView f80892k;

    /* renamed from: l */
    public C30872j f80893l;

    /* renamed from: m */
    public C31882a f80894m;

    /* renamed from: n */
    public C30887d f80895n;

    /* renamed from: o */
    public C30883a f80896o;

    /* renamed from: p */
    public C30913u f80897p;

    /* renamed from: q */
    public int f80898q;

    /* renamed from: r */
    private final int f80899r = 4;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.photo.PhotoSelectActivity$a */
    static final class C30883a extends C31088l {

        /* renamed from: a */
        public PopupWindow f80902a;

        /* renamed from: b */
        public View f80903b;

        /* renamed from: c */
        public PhotoSelectActivity f80904c;

        /* renamed from: d */
        public boolean f80905d;

        /* renamed from: e */
        private RecyclerView f80906e;

        /* renamed from: f */
        private C30885b f80907f;

        /* renamed from: g */
        private View f80908g;

        /* renamed from: h */
        private OnClickListener f80909h;

        /* renamed from: i */
        private final List<C30890a> f80910i = new ArrayList();

        /* renamed from: j */
        private boolean f80911j;

        /* renamed from: k */
        private int f80912k;

        /* renamed from: l */
        private Animator f80913l;

        /* renamed from: m */
        private float f80914m;

        public final void dismiss() {
            m100593a(false);
        }

        /* renamed from: i */
        private boolean m100596i() {
            if (this.f80913l == null || !this.f80913l.isRunning()) {
                return false;
            }
            return true;
        }

        public final void bb_() {
            if (this.f80904c != null) {
                this.f80904c.unregisterLifeCycleMonitor(this);
            }
            this.f80904c = null;
        }

        /* renamed from: d */
        public final boolean mo80795d() {
            if (this.f80902a == null || !this.f80902a.isShowing()) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public final /* synthetic */ Object mo80798f() throws Exception {
            List a = C30891b.m100626a(this.f80904c.mo80784a());
            this.f80911j = true;
            this.f80910i.clear();
            this.f80910i.addAll(a);
            return null;
        }

        /* renamed from: g */
        private void m100594g() {
            this.f80903b = View.inflate(C6399b.m19921a(), R.layout.a9z, null);
            this.f80914m = this.f80903b.getContext().getResources().getDimension(R.dimen.i6) + ((float) C10994a.m32204a(this.f80903b.getContext()));
            this.f80902a = new PopupWindow(this.f80903b, -1, this.f80912k, true);
            this.f80902a.setTouchInterceptor(new C30905m(this));
            this.f80902a.setTouchable(true);
            this.f80906e = (RecyclerView) this.f80903b.findViewById(R.id.bnf);
            this.f80906e.setLayoutManager(new LinearLayoutManager(C6399b.m19921a(), 1, false));
            this.f80907f = new C30885b(this.f80909h);
            this.f80906e.setAdapter(this.f80907f);
        }

        /* renamed from: h */
        private void m100595h() {
            if (this.f80904c != null && !this.f80904c.isFinishing()) {
                if (this.f80910i.isEmpty()) {
                    C30911s.m100637a(this.f80902a);
                    C9738o.m28693a(this.f80908g.getContext(), (int) R.string.bgo);
                    return;
                }
                this.f80907f.mo80804a(this.f80910i);
                this.f80902a.showAtLocation(this.f80908g, 8388659, 0, (int) this.f80914m);
                m100593a(true);
            }
        }

        /* renamed from: e */
        public final void mo80797e() {
            if (this.f80904c != null && !this.f80904c.isFinishing()) {
                if (this.f80911j && this.f80910i.isEmpty()) {
                    C9738o.m28693a(this.f80908g.getContext(), (int) R.string.bgo);
                } else if (this.f80911j) {
                    m100595h();
                } else {
                    C1592h.m7853a((Callable<TResult>) new C30906n<TResult>(this)).mo6876a((C1591g<TResult, TContinuationResult>) new C30907o<TResult,TContinuationResult>(this), C1592h.f5958b);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ Object mo80792a(C1592h hVar) throws Exception {
            m100595h();
            return null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ void mo80793a(ValueAnimator valueAnimator) {
            this.f80903b.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue() * ((float) this.f80912k));
        }

        /* renamed from: a */
        private void m100593a(final boolean z) {
            float f;
            if (m100596i()) {
                this.f80913l.cancel();
            }
            float f2 = -1.0f;
            if (z) {
                f = 0.0f;
            } else {
                f2 = ((-this.f80903b.getY()) / ((float) this.f80912k)) * -1.0f;
                f = -1.0f;
            }
            ValueAnimator duration = ValueAnimator.ofFloat(new float[]{f2, f}).setDuration(500);
            duration.setInterpolator(new AccelerateDecelerateInterpolator());
            duration.addUpdateListener(new C30908p(this));
            duration.addListener(new AnimatorListener() {
                public final void onAnimationCancel(Animator animator) {
                }

                public final void onAnimationRepeat(Animator animator) {
                }

                /* access modifiers changed from: 0000 */
                /* renamed from: a */
                public final /* synthetic */ void mo80799a() {
                    C30910r.m100636a(C30883a.this.f80902a);
                }

                public final void onAnimationEnd(Animator animator) {
                    if (!z) {
                        C30883a.this.f80903b.postDelayed(new C30909q(this), 10);
                    }
                    C30883a.this.f80905d = false;
                }

                public final void onAnimationStart(Animator animator) {
                    if (z) {
                        C30883a.this.f80904c.mo80786c();
                        return;
                    }
                    C30883a.this.f80905d = true;
                    C30883a.this.f80904c.mo80787d();
                }
            });
            duration.start();
            this.f80913l = duration;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ boolean mo80794a(View view, MotionEvent motionEvent) {
            if (motionEvent.getY() >= 0.0f) {
                return false;
            }
            if (!this.f80905d) {
                m100593a(false);
            }
            return true;
        }

        public C30883a(PhotoSelectActivity photoSelectActivity, View view, OnClickListener onClickListener, int i) {
            this.f80904c = photoSelectActivity;
            this.f80908g = view;
            this.f80909h = onClickListener;
            this.f80912k = i;
            photoSelectActivity.registerLifeCycleMonitor(this);
            m100594g();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.photo.PhotoSelectActivity$b */
    static class C30885b extends C1262a<C30886c> {

        /* renamed from: a */
        private List<C30890a> f80917a;

        /* renamed from: b */
        private OnClickListener f80918b;

        public final int getItemCount() {
            return this.f80917a.size();
        }

        private C30885b(OnClickListener onClickListener) {
            this.f80917a = new ArrayList();
            this.f80918b = onClickListener;
        }

        /* renamed from: a */
        public final void mo80804a(List<C30890a> list) {
            this.f80917a.clear();
            this.f80917a.addAll(list);
            notifyDataSetChanged();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onBindViewHolder(C30886c cVar, int i) {
            cVar.mo80308a((C30890a) this.f80917a.get(i));
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C30886c onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new C30886c(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.su, viewGroup, false), this.f80918b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.photo.PhotoSelectActivity$c */
    static class C30886c extends BaseViewHolder<C30890a> {

        /* renamed from: b */
        private RemoteImageView f80919b;

        /* renamed from: c */
        private TextView f80920c;

        /* renamed from: d */
        private TextView f80921d;

        /* renamed from: c */
        public final void mo80311c() {
            super.mo80311c();
        }

        /* renamed from: b */
        public final void mo80310b() {
            super.mo80310b();
            this.f80919b = (RemoteImageView) this.itemView.findViewById(R.id.b3m);
            this.f80920c = (TextView) this.itemView.findViewById(R.id.b5c);
            this.f80921d = (TextView) this.itemView.findViewById(R.id.dsr);
        }

        /* renamed from: a */
        public final void mo80308a(C30890a aVar) {
            super.mo80308a(aVar);
            this.f80920c.setText(C1642a.m8035a(Locale.ENGLISH, "%1$s", new Object[]{aVar.f80936e}));
            this.f80921d.setText(C1642a.m8035a(Locale.ENGLISH, "%1$d", new Object[]{Integer.valueOf(aVar.f80932a)}));
            RemoteImageView remoteImageView = this.f80919b;
            StringBuilder sb = new StringBuilder("file://");
            sb.append(aVar.f80935d);
            C23323e.m76525b(remoteImageView, sb.toString(), NormalGiftView.MASK_TRANSLATE_VALUE, NormalGiftView.MASK_TRANSLATE_VALUE);
            this.itemView.setTag(aVar);
        }

        private C30886c(View view, OnClickListener onClickListener) {
            super(view);
            view.setOnClickListener(onClickListener);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.photo.PhotoSelectActivity$d */
    final class C30887d extends C1262a<C30889e> {

        /* renamed from: b */
        private List<C30897h> f80923b;

        /* renamed from: c */
        private C30872j f80924c;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ void mo80807a() {
            notifyDataSetChanged();
        }

        public final long getItemId(int i) {
            return (long) i;
        }

        /* renamed from: c */
        private void m100614c() {
            this.f80924c = new C30872j() {
                public final void onClick(View view) {
                    Object tag = view.getTag();
                    if (tag != null && (tag instanceof C30897h)) {
                        C30897h hVar = (C30897h) tag;
                        boolean z = true;
                        if (view.getId() != R.id.cb9) {
                            if (view.getId() == R.id.d2a) {
                                if (view.isSelected()) {
                                    PhotoSelectActivity.this.f80897p.mo80835b(hVar);
                                } else if (PhotoSelectActivity.this.f80897p.mo80836c() >= C30913u.f80961a) {
                                    C9738o.m28693a(C6399b.m19921a(), (int) R.string.bpb);
                                    return;
                                } else {
                                    PhotoSelectActivity.this.f80897p.mo80831a(hVar);
                                }
                                hVar.f80945b = true;
                                view.setSelected(!view.isSelected());
                                PhotoSelectActivity.this.f80895n.notifyDataSetChanged();
                                TextView textView = PhotoSelectActivity.this.f80890i;
                                if (PhotoSelectActivity.this.f80897p.mo80836c() <= 0) {
                                    z = false;
                                }
                                textView.setEnabled(z);
                                PhotoSelectActivity.this.f80890i.setText(PhotoSelectActivity.this.f80897p.mo80837d());
                            }
                        } else if (1 == PhotoSelectActivity.this.f80898q) {
                            EmojiAddActivity.m100440a((Activity) PhotoSelectActivity.this, PhotoParam.fromMediaModel(hVar.f80944a));
                        } else {
                            PhotoPreviewListActivity.m100575a(PhotoSelectActivity.this, PhotoSelectActivity.this.f80884c, C30887d.this.mo80806a(hVar, PhotoSelectActivity.this.f80885d.mo5445j(), PhotoSelectActivity.this.f80885d.mo5447l()), 48);
                        }
                    }
                }
            };
        }

        public final int getItemCount() {
            return this.f80923b.size();
        }

        /* renamed from: b */
        private void m100613b() {
            if (PhotoSelectActivity.this.f80882a == 0) {
                PhotoSelectActivity.this.f80882a = PhotoSelectActivity.this.f80886e.getMeasuredWidth() / 4;
                PhotoSelectActivity.this.f80883b = PhotoSelectActivity.this.f80882a;
            }
        }

        private C30887d() {
            this.f80923b = new ArrayList();
            m100614c();
        }

        /* renamed from: a */
        public final void mo80808a(List<C19262f> list) {
            if (list != null && !list.isEmpty()) {
                this.f80923b.clear();
                ArrayList arrayList = new ArrayList(list.size());
                for (C19262f a : list) {
                    arrayList.add(C30897h.m100629a(a));
                }
                this.f80923b.addAll(arrayList);
                PhotoSelectActivity.this.f80897p.f80965c = arrayList;
                C6726a.m20844b(new C30912t(this));
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onBindViewHolder(C30889e eVar, int i) {
            m100613b();
            eVar.mo80308a((C30897h) this.f80923b.get(i));
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C30889e onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new C30889e(View.inflate(viewGroup.getContext(), R.layout.a0b, null), this.f80924c);
        }

        /* renamed from: a */
        public final int mo80806a(C30897h hVar, int i, int i2) {
            while (hVar != null && i <= i2 && i < this.f80923b.size()) {
                if (((C30897h) this.f80923b.get(i)).equals(hVar)) {
                    return i;
                }
                i++;
            }
            return -1;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.photo.PhotoSelectActivity$e */
    class C30889e extends BaseViewHolder<C30897h> {

        /* renamed from: c */
        private ImageView f80927c;

        /* renamed from: d */
        private TextView f80928d;

        /* renamed from: e */
        private RemoteImageView f80929e;

        /* renamed from: f */
        private View f80930f;

        /* renamed from: g */
        private View f80931g;

        /* renamed from: b */
        public final void mo80310b() {
            this.f80927c = (ImageView) this.itemView.findViewById(R.id.d2a);
            this.f80928d = (TextView) this.itemView.findViewById(R.id.d2b);
            this.f80929e = (RemoteImageView) this.itemView.findViewById(R.id.cb9);
            this.f80930f = this.itemView.findViewById(R.id.cba);
            this.f80931g = this.itemView.findViewById(R.id.d2c);
        }

        /* renamed from: c */
        public final void mo80311c() {
            PhotoSelectActivity.this.f80894m.mo82725a(this.f80929e, this.f80927c);
            C30872j.m100536a((OnClickListener) this.f80274a, this.f80929e, this.f80927c);
        }

        /* renamed from: a */
        public final void mo80308a(C30897h hVar) {
            String str;
            LayoutParams layoutParams = (LayoutParams) this.f80929e.getLayoutParams();
            layoutParams.width = PhotoSelectActivity.this.f80882a;
            layoutParams.height = PhotoSelectActivity.this.f80883b;
            this.f80929e.setLayoutParams(layoutParams);
            this.f80930f.setLayoutParams(layoutParams);
            if (hVar.f80944a != null) {
                str = hVar.f80944a.f52149b;
            } else {
                str = "";
            }
            String str2 = str;
            StringBuilder sb = new StringBuilder("file://");
            sb.append(str2);
            C23323e.m76525b(this.f80929e, sb.toString(), PhotoSelectActivity.this.f80882a, PhotoSelectActivity.this.f80883b);
            if (hVar.f80945b) {
                PhotoSelectActivity.this.f80897p.mo80829a(this.f80929e, this.f80931g, this.f80928d, this.f80927c, this.f80930f, str2);
                hVar.f80945b = false;
            } else {
                PhotoSelectActivity.this.f80897p.mo80830a(this.f80928d, this.f80927c, this.f80930f, str2);
            }
            this.f80927c.setTag(hVar);
            this.f80929e.setTag(hVar);
            if (1 == PhotoSelectActivity.this.f80898q) {
                this.f80931g.setVisibility(8);
            }
        }

        public C30889e(View view, C30872j jVar) {
            super(view, jVar);
        }
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.input.photo.PhotoSelectActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void setStatusBarColor() {
    }

    /* renamed from: a */
    public final boolean mo80784a() {
        if (1 == this.f80898q) {
            return true;
        }
        return false;
    }

    public void onBackPressed() {
        super.onBackPressed();
        this.f80897p.mo80839f();
    }

    /* renamed from: c */
    public final void mo80786c() {
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 180.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setDuration(500);
        rotateAnimation.setFillAfter(true);
        this.f80891j.startAnimation(rotateAnimation);
    }

    /* renamed from: d */
    public final void mo80787d() {
        RotateAnimation rotateAnimation = new RotateAnimation(180.0f, 0.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setDuration(500);
        rotateAnimation.setFillAfter(true);
        this.f80891j.startAnimation(rotateAnimation);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final /* synthetic */ void mo80788e() {
        if (mo80784a()) {
            this.f80895n.mo80808a(C30891b.m100624a(this, 0, 0, Integer.MAX_VALUE, true));
            return;
        }
        this.f80895n.mo80808a(C30891b.m100623a((Context) this));
    }

    /* renamed from: b */
    public final void mo80785b() {
        C30963v.m100755a().mo81336a(this.f80884c, (List<PhotoParam>) PhotoParam.fromPhotoItems(this.f80897p.mo80834b()));
        this.f80897p.mo80838e();
        C7705c.m23799a().mo20394d(new C30731a(new PhotoParam()));
        finish();
    }

    public void onResume() {
        boolean z = true;
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.input.photo.PhotoSelectActivity", "onResume", true);
        super.onResume();
        if (this.f80895n != null) {
            this.f80895n.notifyDataSetChanged();
        }
        TextView textView = this.f80890i;
        if (this.f80897p.mo80836c() <= 0) {
            z = false;
        }
        textView.setEnabled(z);
        this.f80890i.setText(this.f80897p.mo80837d());
        this.f80887f.setSelected(this.f80897p.f80964b);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.input.photo.PhotoSelectActivity", "onResume", false);
    }

    /* renamed from: f */
    private void m100583f() {
        boolean z;
        this.f80886e = (RecyclerView) findViewById(R.id.cb_);
        this.f80887f = findViewById(R.id.cnn);
        this.f80889h = findViewById(R.id.ny);
        this.f80890i = (TextView) findViewById(R.id.d2x);
        this.f80890i.setText(this.f80897p.mo80837d());
        TextView textView = this.f80890i;
        if (this.f80897p.mo80836c() > 0) {
            z = true;
        } else {
            z = false;
        }
        textView.setEnabled(z);
        this.f80888g = findViewById(R.id.jx);
        this.f80892k = (TextView) findViewById(R.id.f3);
        this.f80891j = (ImageView) findViewById(R.id.ez);
        if (1 == this.f80898q) {
            this.f80889h.setVisibility(8);
        }
    }

    /* renamed from: g */
    private void m100584g() {
        if (this.f80893l == null) {
            this.f80893l = new C30872j() {
                /* access modifiers changed from: 0000 */
                /* renamed from: a */
                public final /* synthetic */ Object mo80790a(C1592h hVar) throws Exception {
                    if (PhotoSelectActivity.this.f80896o.mo80795d()) {
                        PhotoSelectActivity.this.f80896o.dismiss();
                    }
                    return null;
                }

                /* access modifiers changed from: 0000 */
                /* renamed from: a */
                public final /* synthetic */ Object mo80791a(C30890a aVar) throws Exception {
                    PhotoSelectActivity.this.f80895n.mo80808a(C30891b.m100625a(PhotoSelectActivity.this, aVar.f80934c, PhotoSelectActivity.this.mo80784a()));
                    return null;
                }

                public final void onClick(View view) {
                    if (view.equals(PhotoSelectActivity.this.f80890i)) {
                        new C6928b(PhotoSelectActivity.this, new C6943d() {
                            public final void sendMsg() {
                                PhotoSelectActivity.this.mo80785b();
                            }
                        }).sendMsg();
                    } else if (view.equals(PhotoSelectActivity.this.f80887f)) {
                        PhotoSelectActivity.this.f80887f.setSelected(!PhotoSelectActivity.this.f80887f.isSelected());
                        PhotoSelectActivity.this.f80897p.f80964b = PhotoSelectActivity.this.f80887f.isSelected();
                    } else if (view.equals(PhotoSelectActivity.this.f80888g)) {
                        PhotoSelectActivity.this.f80897p.mo80839f();
                        PhotoSelectActivity.this.finish();
                    } else if (view.equals(PhotoSelectActivity.this.f80891j) || view.equals(PhotoSelectActivity.this.f80892k)) {
                        if (PhotoSelectActivity.this.f80896o == null) {
                            PhotoSelectActivity.this.f80896o = new C30883a(PhotoSelectActivity.this, PhotoSelectActivity.this.findViewById(R.id.djz), PhotoSelectActivity.this.f80893l, PhotoSelectActivity.this.f80886e.getHeight() + PhotoSelectActivity.this.f80889h.getHeight());
                        }
                        if (PhotoSelectActivity.this.f80896o.mo80795d()) {
                            PhotoSelectActivity.this.f80896o.dismiss();
                        } else {
                            PhotoSelectActivity.this.f80896o.mo80797e();
                        }
                    } else {
                        if (view.getId() == R.id.b38) {
                            Object tag = view.getTag();
                            if (tag != null) {
                                C30890a aVar = (C30890a) tag;
                                PhotoSelectActivity.this.f80892k.setText(aVar.f80936e);
                                C1592h.m7853a((Callable<TResult>) new C30903k<TResult>(this, aVar)).mo6876a((C1591g<TResult, TContinuationResult>) new C30904l<TResult,TContinuationResult>(this), C1592h.f5958b);
                            }
                        }
                    }
                }
            };
        }
        if (this.f80894m == null) {
            this.f80894m = C31882a.m103579n();
        }
        this.f80894m.mo82725a(this.f80888g, this.f80887f, this.f80890i, this.f80891j, this.f80892k);
        C30872j.m100536a((OnClickListener) this.f80893l, this.f80890i, this.f80887f, this.f80888g, this.f80891j, this.f80892k);
    }

    /* renamed from: h */
    private void m100585h() {
        this.f80885d = new WrapGridLayoutManager(this, 4);
        this.f80886e.setLayoutManager(this.f80885d);
        if (this.f80895n == null) {
            this.f80895n = new C30887d();
            this.f80895n.setHasStableIds(true);
        }
        this.f80886e.mo5525a((C1272h) new GridSpacingItemDecoration(4, (int) C9738o.m28708b((Context) this, 1.0f), false));
        this.f80886e.setAdapter(this.f80895n);
        C6726a.m20842a(new C30902j(this));
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("session_id", this.f80884c);
        bundle.putInt("album_action", this.f80898q);
    }

    /* renamed from: a */
    private void m100582a(Bundle bundle) {
        if (bundle != null) {
            this.f80884c = bundle.getString("session_id");
            this.f80898q = bundle.getInt("album_action");
        } else {
            this.f80884c = getIntent().getStringExtra("session_id");
            this.f80898q = getIntent().getIntExtra("album_action", 0);
        }
        this.f80897p = C30913u.m100638a();
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.input.photo.PhotoSelectActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.a2);
        C6956a.m21633b().setupStatusBar(this);
        m100582a(bundle);
        m100583f();
        m100584g();
        m100585h();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.input.photo.PhotoSelectActivity", "onCreate", false);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == 49 && intent != null && intent.getBooleanExtra("send_photo", false)) {
            C7705c.m23799a().mo20394d(new C30731a(new PhotoParam()));
            finish();
        }
        if (i == 17 && i2 == -1) {
            finish();
        }
    }
}
