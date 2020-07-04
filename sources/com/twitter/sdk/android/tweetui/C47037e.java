package com.twitter.sdk.android.tweetui;

import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.C1642a;
import com.squareup.picasso.Picasso;
import com.twitter.sdk.android.core.C46821b;
import com.twitter.sdk.android.core.C46827f;
import com.twitter.sdk.android.core.C46830i;
import com.twitter.sdk.android.core.TwitterException;
import com.twitter.sdk.android.core.internal.UserUtils;
import com.twitter.sdk.android.core.internal.UserUtils.AvatarSize;
import com.twitter.sdk.android.core.models.C46959o;
import com.twitter.sdk.android.core.models.C46960p;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Locale;

/* renamed from: com.twitter.sdk.android.tweetui.e */
public abstract class C47037e extends C47003a {

    /* renamed from: A */
    View f120681A;

    /* renamed from: B */
    int f120682B;

    /* renamed from: C */
    int f120683C;

    /* renamed from: D */
    int f120684D;

    /* renamed from: E */
    ColorDrawable f120685E;

    /* renamed from: t */
    TextView f120686t;

    /* renamed from: u */
    TweetActionBarView f120687u;

    /* renamed from: v */
    ImageView f120688v;

    /* renamed from: w */
    TextView f120689w;

    /* renamed from: x */
    ImageView f120690x;

    /* renamed from: y */
    ViewGroup f120691y;

    /* renamed from: z */
    C47099y f120692z;

    public /* bridge */ /* synthetic */ C46959o getTweet() {
        return super.getTweet();
    }

    public /* bridge */ /* synthetic */ long getTweetId() {
        return super.getTweetId();
    }

    /* renamed from: g */
    private void m147069g() {
        final long tweetId = getTweetId();
        C47004a.m146963a().f120676f.mo118225c(getTweetId(), new C46821b<C46959o>() {
            /* renamed from: a */
            public final void mo29990a(C46830i<C46959o> iVar) {
                C47037e.this.setTweet((C46959o) iVar.f120123a);
            }

            /* renamed from: a */
            public final void mo29989a(TwitterException twitterException) {
                C1642a.m8035a(Locale.ENGLISH, "loadTweet failure for Tweet Id %d.", new Object[]{Long.valueOf(tweetId)});
            }
        });
    }

    /* renamed from: h */
    private void m147070h() {
        setTweetActionsEnabled(this.f120610g);
        this.f120687u.setOnActionCallback(new C47100z(this, C47004a.m146963a().f120676f, null));
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        if (mo118191a()) {
            m147070h();
            m147069g();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo118193c() {
        super.mo118193c();
        C46959o b = C47030ar.m147049b(this.f120608e);
        setProfilePhotoView(b);
        m147068b(b);
        setTimestamp(b);
        setTweetActions(this.f120608e);
        m147067a(this.f120608e);
        setQuoteTweet(this.f120608e);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo118192b() {
        super.mo118192b();
        this.f120690x = (ImageView) findViewById(R.id.e5v);
        this.f120689w = (TextView) findViewById(R.id.e63);
        this.f120688v = (ImageView) findViewById(R.id.e64);
        this.f120686t = (TextView) findViewById(R.id.e60);
        this.f120687u = (TweetActionBarView) findViewById(R.id.e5u);
        this.f120691y = (ViewGroup) findViewById(R.id.cmp);
        this.f120681A = findViewById(R.id.o8);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo118241f() {
        setBackgroundColor(this.f120682B);
        this.f120611h.setTextColor(this.f120617n);
        this.f120612i.setTextColor(this.f120618o);
        this.f120615l.setTextColor(this.f120617n);
        this.f120614k.setMediaBgColor(this.f120621r);
        this.f120614k.setPhotoErrorResId(this.f120622s);
        this.f120690x.setImageDrawable(this.f120685E);
        this.f120689w.setTextColor(this.f120618o);
        this.f120688v.setImageResource(this.f120683C);
        this.f120686t.setTextColor(this.f120618o);
    }

    public /* bridge */ /* synthetic */ void setTweet(C46959o oVar) {
        super.setTweet(oVar);
    }

    /* access modifiers changed from: 0000 */
    public void setTweetActions(C46959o oVar) {
        this.f120687u.setTweet(oVar);
    }

    public void setTweetLinkClickListener(C47016ah ahVar) {
        super.setTweetLinkClickListener(ahVar);
        if (this.f120692z != null) {
            this.f120692z.setTweetLinkClickListener(ahVar);
        }
    }

    public void setTweetMediaClickListener(C47017ai aiVar) {
        super.setTweetMediaClickListener(aiVar);
        if (this.f120692z != null) {
            this.f120692z.setTweetMediaClickListener(aiVar);
        }
    }

    /* renamed from: a */
    private void m147066a(int i) {
        this.f120609f = i;
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(i, R$styleable.tw__TweetView);
        try {
            setStyleAttributes(obtainStyledAttributes);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: b */
    private void m147068b(C46959o oVar) {
        if (oVar != null && oVar.f120422D != null) {
            this.f120690x.setOnClickListener(new C47039f(this, oVar));
            this.f120690x.setOnTouchListener(new C47040g(this));
        }
    }

    public void setOnActionCallback(C46821b<C46959o> bVar) {
        this.f120687u.setOnActionCallback(new C47100z(this, C47004a.m146963a().f120676f, bVar));
        this.f120687u.setTweet(this.f120608e);
    }

    public void setTweetActionsEnabled(boolean z) {
        this.f120610g = z;
        if (this.f120610g) {
            this.f120687u.setVisibility(0);
            this.f120681A.setVisibility(8);
            return;
        }
        this.f120687u.setVisibility(8);
        this.f120681A.setVisibility(0);
    }

    /* renamed from: a */
    private void m147067a(C46959o oVar) {
        if (oVar == null || oVar.f120451y == null) {
            this.f120686t.setVisibility(8);
            return;
        }
        this.f120686t.setText(getResources().getString(R.string.fgy, new Object[]{oVar.f120422D.name}));
        this.f120686t.setVisibility(0);
    }

    private void setTimestamp(C46959o oVar) {
        String str;
        if (oVar == null || oVar.f120428b == null || !C47014ag.m146991b(oVar.f120428b)) {
            str = "";
        } else {
            str = C47014ag.m146992c(C47014ag.m146990a(getResources(), System.currentTimeMillis(), Long.valueOf(C47014ag.m146989a(oVar.f120428b)).longValue()));
        }
        this.f120689w.setText(str);
    }

    private void setXmlDataAttributes(TypedArray typedArray) {
        long longValue = C47031as.m147055a(typedArray.getString(5), -1).longValue();
        if (longValue > 0) {
            mo118190a((String) null, Long.valueOf(longValue));
            this.f120608e = new C46960p().mo118092a(longValue).mo118091a();
            return;
        }
        throw new IllegalArgumentException("Invalid tw__tweet_id");
    }

    /* access modifiers changed from: 0000 */
    public void setProfilePhotoView(C46959o oVar) {
        String str;
        Picasso d = C47004a.m146964d();
        if (d != null) {
            if (oVar == null || oVar.f120422D == null) {
                str = null;
            } else {
                str = UserUtils.m146550a(oVar.f120422D, AvatarSize.REASONABLY_SMALL);
            }
            d.mo49979a(str).mo50089a((Drawable) this.f120685E).mo50093a(this.f120690x);
        }
    }

    /* access modifiers changed from: 0000 */
    public void setQuoteTweet(C46959o oVar) {
        this.f120692z = null;
        this.f120691y.removeAllViews();
        if (oVar == null || !C47030ar.m147052c(oVar)) {
            this.f120691y.setVisibility(8);
            return;
        }
        this.f120692z = new C47099y(getContext());
        this.f120692z.mo118374a(this.f120617n, this.f120618o, this.f120619p, this.f120620q, this.f120621r, this.f120622s);
        this.f120692z.setTweet(oVar.f120448v);
        this.f120692z.setTweetLinkClickListener(this.f120606c);
        this.f120692z.setTweetMediaClickListener(this.f120607d);
        this.f120691y.setVisibility(0);
        this.f120691y.addView(this.f120692z);
    }

    private void setStyleAttributes(TypedArray typedArray) {
        double d;
        int i;
        double d2;
        this.f120682B = typedArray.getColor(2, getResources().getColor(R.color.asz));
        this.f120617n = typedArray.getColor(3, getResources().getColor(R.color.at0));
        this.f120619p = typedArray.getColor(0, getResources().getColor(R.color.asu));
        this.f120620q = typedArray.getColor(1, getResources().getColor(R.color.asw));
        this.f120610g = typedArray.getBoolean(4, false);
        boolean a = C47041h.m147079a(this.f120682B);
        if (a) {
            this.f120622s = R.drawable.cl2;
            this.f120683C = R.drawable.ckr;
            this.f120684D = R.drawable.ckx;
        } else {
            this.f120622s = R.drawable.cl1;
            this.f120683C = R.drawable.ckt;
            this.f120684D = R.drawable.ckw;
        }
        if (a) {
            d = 0.4d;
        } else {
            d = 0.35d;
        }
        int i2 = -16777216;
        if (a) {
            i = -1;
        } else {
            i = -16777216;
        }
        this.f120618o = C47041h.m147078a(d, i, this.f120617n);
        if (a) {
            d2 = 0.08d;
        } else {
            d2 = 0.12d;
        }
        if (!a) {
            i2 = -1;
        }
        this.f120621r = C47041h.m147078a(d2, i2, this.f120682B);
        this.f120685E = new ColorDrawable(this.f120621r);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo118239a(C46959o oVar, View view) {
        if (this.f120606c != null) {
            C47030ar.m147047a(oVar.f120422D.screenName);
            return;
        }
        C46827f.m146486b(getContext(), new Intent("android.intent.action.VIEW", Uri.parse(C47030ar.m147047a(oVar.f120422D.screenName))));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ boolean mo118240a(View view, MotionEvent motionEvent) {
        ImageView imageView = (ImageView) view;
        int action = motionEvent.getAction();
        if (action != 3) {
            switch (action) {
                case 0:
                    imageView.getDrawable().setColorFilter(getResources().getColor(R.color.ase), Mode.SRC_ATOP);
                    imageView.invalidate();
                    break;
                case 1:
                    view.performClick();
                    break;
            }
        }
        imageView.getDrawable().clearColorFilter();
        imageView.invalidate();
        return false;
    }

    C47037e(Context context, C46959o oVar, int i) {
        this(context, oVar, i, new C47004a());
    }

    private C47037e(Context context, C46959o oVar, int i, C47004a aVar) {
        super(context, null, i, aVar);
        m147066a(i);
        mo118241f();
        if (mo118191a()) {
            m147070h();
            setTweet(oVar);
        }
    }
}
