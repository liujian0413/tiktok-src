package com.p280ss.android.ugc.aweme.base.p308ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.lighten.core.C12128i;
import com.bytedance.lighten.core.C12133n;
import com.bytedance.lighten.core.C12139r;
import com.facebook.drawee.drawable.C13421p.C13423b;
import com.facebook.drawee.generic.C13438a;
import com.p280ss.android.ugc.aweme.base.C23400r;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.utils.C43127fh;
import com.p280ss.android.ugc.aweme.utils.UserVerify;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.base.ui.AvatarImageWithVerify */
public class AvatarImageWithVerify extends FrameLayout {

    /* renamed from: k */
    private static C23413e[] f61650k = {new C23412d(), new C23411c(), new C23410b(), new C23409a(), new C23414f()};

    /* renamed from: a */
    public ImageView f61651a;

    /* renamed from: b */
    public ImageView f61652b;

    /* renamed from: c */
    public ImageView f61653c;

    /* renamed from: d */
    public ImageView f61654d;

    /* renamed from: e */
    public ImageView f61655e;

    /* renamed from: f */
    private SmartAvatarImageView f61656f;

    /* renamed from: g */
    private UserVerify f61657g;

    /* renamed from: h */
    private int f61658h;

    /* renamed from: i */
    private int f61659i;

    /* renamed from: j */
    private int[] f61660j;

    /* renamed from: com.ss.android.ugc.aweme.base.ui.AvatarImageWithVerify$a */
    static class C23409a implements C23413e {
        private C23409a() {
        }

        /* renamed from: a */
        public final void mo60902a(AvatarImageWithVerify avatarImageWithVerify) {
            avatarImageWithVerify.f61651a.setVisibility(0);
        }

        /* renamed from: b */
        public final void mo60904b(AvatarImageWithVerify avatarImageWithVerify) {
            avatarImageWithVerify.f61651a.setVisibility(8);
        }

        /* renamed from: a */
        public final boolean mo60903a(AvatarImageWithVerify avatarImageWithVerify, UserVerify userVerify) {
            if (!C6399b.m19946v() || !AvatarImageWithVerify.m76777a(userVerify)) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.base.ui.AvatarImageWithVerify$b */
    static class C23410b implements C23413e {
        private C23410b() {
        }

        /* renamed from: a */
        public final void mo60902a(AvatarImageWithVerify avatarImageWithVerify) {
            avatarImageWithVerify.f61655e.setVisibility(0);
        }

        /* renamed from: b */
        public final void mo60904b(AvatarImageWithVerify avatarImageWithVerify) {
            avatarImageWithVerify.f61655e.setVisibility(8);
        }

        /* renamed from: a */
        public final boolean mo60903a(AvatarImageWithVerify avatarImageWithVerify, UserVerify userVerify) {
            if (userVerify.getVerificationType().intValue() == 3) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.base.ui.AvatarImageWithVerify$c */
    static class C23411c implements C23413e {
        private C23411c() {
        }

        /* renamed from: a */
        public final void mo60902a(AvatarImageWithVerify avatarImageWithVerify) {
            avatarImageWithVerify.f61654d.setVisibility(0);
        }

        /* renamed from: b */
        public final void mo60904b(AvatarImageWithVerify avatarImageWithVerify) {
            avatarImageWithVerify.f61654d.setVisibility(8);
        }

        /* renamed from: a */
        public final boolean mo60903a(AvatarImageWithVerify avatarImageWithVerify, UserVerify userVerify) {
            if (!TextUtils.isEmpty(userVerify.getEnterpriseVerifyReason())) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.base.ui.AvatarImageWithVerify$d */
    static class C23412d implements C23413e {
        private C23412d() {
        }

        /* renamed from: a */
        public final void mo60902a(AvatarImageWithVerify avatarImageWithVerify) {
            avatarImageWithVerify.f61653c.setVisibility(0);
        }

        /* renamed from: b */
        public final void mo60904b(AvatarImageWithVerify avatarImageWithVerify) {
            avatarImageWithVerify.f61653c.setVisibility(8);
        }

        /* renamed from: a */
        public final boolean mo60903a(AvatarImageWithVerify avatarImageWithVerify, UserVerify userVerify) {
            if (userVerify.getVerificationType().intValue() == 2) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.base.ui.AvatarImageWithVerify$e */
    interface C23413e {
        /* renamed from: a */
        void mo60902a(AvatarImageWithVerify avatarImageWithVerify);

        /* renamed from: a */
        boolean mo60903a(AvatarImageWithVerify avatarImageWithVerify, UserVerify userVerify);

        /* renamed from: b */
        void mo60904b(AvatarImageWithVerify avatarImageWithVerify);
    }

    /* renamed from: com.ss.android.ugc.aweme.base.ui.AvatarImageWithVerify$f */
    static class C23414f implements C23413e {
        private C23414f() {
        }

        /* renamed from: a */
        public final void mo60902a(AvatarImageWithVerify avatarImageWithVerify) {
            avatarImageWithVerify.f61652b.setVisibility(0);
        }

        /* renamed from: b */
        public final void mo60904b(AvatarImageWithVerify avatarImageWithVerify) {
            avatarImageWithVerify.f61652b.setVisibility(8);
        }

        /* renamed from: a */
        public final boolean mo60903a(AvatarImageWithVerify avatarImageWithVerify, UserVerify userVerify) {
            String str;
            if (TextUtils.isEmpty(userVerify.getCustomVerify())) {
                str = userVerify.getWeiboVerify();
            } else {
                str = userVerify.getCustomVerify();
            }
            if (!TextUtils.isEmpty(str)) {
                return true;
            }
            return false;
        }
    }

    private int getVerifyIconMarginEnd() {
        return -this.f61659i;
    }

    public SmartAvatarImageView getAvatarImageView() {
        return this.f61656f;
    }

    public int getVerifyIconSize() {
        return this.f61658h;
    }

    private LayoutParams getAvatarLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    /* renamed from: b */
    public final void mo60896b() {
        for (C23413e b : f61650k) {
            b.mo60904b(this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo60894a() {
        int i;
        this.f61656f = new SmartAvatarImageView(getContext());
        if (C6399b.m19946v()) {
            ((C13438a) this.f61656f.getHierarchy()).mo32891a((int) R.color.a5q, C13423b.f35599g);
        }
        addView(this.f61656f, getAvatarLayoutParams());
        LayoutParams a = m76775a(getVerifyIconSize());
        this.f61651a = new ImageView(getContext());
        int i2 = R.drawable.amq;
        try {
            this.f61651a.setImageDrawable(getResources().getDrawable(R.drawable.amq));
        } catch (NotFoundException unused) {
        }
        this.f61651a.setVisibility(8);
        LayoutParams a2 = m76775a(getVerifyIconSize());
        this.f61652b = new ImageView(getContext());
        try {
            this.f61652b.setImageDrawable(getResources().getDrawable(R.drawable.amq));
        } catch (NotFoundException unused2) {
        }
        this.f61652b.setVisibility(8);
        this.f61653c = new ImageView(getContext());
        try {
            ImageView imageView = this.f61653c;
            Resources resources = getResources();
            if (C6399b.m19944t()) {
                i = R.drawable.amp;
            } else {
                i = R.drawable.amq;
            }
            imageView.setImageDrawable(resources.getDrawable(i));
        } catch (NotFoundException unused3) {
        }
        this.f61653c.setVisibility(8);
        this.f61654d = new ImageView(getContext());
        try {
            this.f61654d.setImageDrawable(getResources().getDrawable(R.drawable.amm));
        } catch (NotFoundException unused4) {
        }
        this.f61654d.setVisibility(8);
        this.f61655e = new ImageView(getContext());
        try {
            ImageView imageView2 = this.f61655e;
            Resources resources2 = getResources();
            if (C6399b.m19944t()) {
                i2 = R.drawable.amp;
            }
            imageView2.setImageDrawable(resources2.getDrawable(i2));
        } catch (NotFoundException unused5) {
        }
        this.f61655e.setVisibility(8);
        addView(this.f61651a, a);
        addView(this.f61652b, a2);
        addView(this.f61653c, a2);
        addView(this.f61654d, a2);
        addView(this.f61655e, a2);
    }

    public void setRequestImgSize(int[] iArr) {
        this.f61660j = iArr;
    }

    public AvatarImageWithVerify(Context context) {
        this(context, null);
    }

    public void setPlaceHolder(int i) {
        ((C13438a) this.f61656f.getHierarchy()).mo32891a(i, C13423b.f35599g);
    }

    /* renamed from: a */
    private LayoutParams m76775a(int i) {
        LayoutParams layoutParams = new LayoutParams(i, i);
        layoutParams.gravity = 8388693;
        m76776a(layoutParams, getVerifyIconMarginEnd());
        return layoutParams;
    }

    /* renamed from: a */
    public static boolean m76777a(UserVerify userVerify) {
        if (userVerify != null && !TextUtils.isEmpty(userVerify.getCustomVerify())) {
            return true;
        }
        return false;
    }

    public void setUserData(UserVerify userVerify) {
        if (this.f61657g == null || userVerify == null || this.f61657g.getAvatarThumb() != userVerify.getAvatarThumb()) {
            int i = 0;
            setClipChildren(false);
            if (getParent() instanceof ViewGroup) {
                ((ViewGroup) getParent()).setClipChildren(false);
            }
            this.f61657g = userVerify;
            if (userVerify == null) {
                this.f61656f.setController(null);
                C23413e[] eVarArr = f61650k;
                int length = eVarArr.length;
                while (i < length) {
                    eVarArr[i].mo60904b(this);
                    i++;
                }
                return;
            }
            C12139r a = C12133n.m35299a(C23400r.m76741a(userVerify.getAvatarThumb()));
            if (this.f61660j != null) {
                a.mo29853b(this.f61660j);
            }
            a.mo29844a((C12128i) this.f61656f).mo29845a("Avatar").mo29848a();
            C23413e[] eVarArr2 = f61650k;
            int length2 = eVarArr2.length;
            boolean z = false;
            while (i < length2) {
                C23413e eVar = eVarArr2[i];
                if (z || !eVar.mo60903a(this, userVerify)) {
                    eVar.mo60904b(this);
                } else {
                    eVar.mo60902a(this);
                    z = true;
                }
                i++;
            }
        }
    }

    public AvatarImageWithVerify(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m76776a(LayoutParams layoutParams, int i) {
        if (VERSION.SDK_INT >= 17) {
            layoutParams.setMarginEnd(i);
        } else if (C43127fh.m136806a(getContext())) {
            layoutParams.leftMargin = i;
        } else {
            layoutParams.rightMargin = i;
        }
    }

    /* renamed from: a */
    public final void mo60895a(UrlModel urlModel, int i) {
        UserVerify userVerify = new UserVerify(urlModel, null, null, Integer.valueOf(i), null);
        setUserData(userVerify);
    }

    public AvatarImageWithVerify(Context context, AttributeSet attributeSet, int i) {
        float f;
        super(context, attributeSet, i);
        Context a = C6399b.m19921a();
        if (C6399b.m19946v()) {
            f = 16.0f;
        } else {
            f = 20.0f;
        }
        this.f61658h = (int) C9738o.m28708b(a, f);
        this.f61659i = (int) C9738o.m28708b(C6399b.m19921a(), 2.0f);
        mo60894a();
    }
}
