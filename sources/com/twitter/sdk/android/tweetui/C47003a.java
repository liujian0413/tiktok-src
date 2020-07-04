package com.twitter.sdk.android.tweetui;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.squareup.picasso.Picasso;
import com.twitter.sdk.android.core.C46827f;
import com.twitter.sdk.android.core.internal.C46937t;
import com.twitter.sdk.android.core.internal.UserUtils;
import com.twitter.sdk.android.core.internal.scribe.ScribeItem;
import com.twitter.sdk.android.core.models.C46947d;
import com.twitter.sdk.android.core.models.C46952i;
import com.twitter.sdk.android.core.models.C46959o;
import com.twitter.sdk.android.core.models.MediaEntity;
import com.twitter.sdk.android.tweetui.internal.AspectRatioFrameLayout;
import com.twitter.sdk.android.tweetui.internal.C47075h;
import com.twitter.sdk.android.tweetui.internal.C47081l;
import com.twitter.sdk.android.tweetui.internal.MediaBadgeView;
import com.twitter.sdk.android.tweetui.internal.TweetMediaView;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.text.DateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/* renamed from: com.twitter.sdk.android.tweetui.a */
abstract class C47003a extends RelativeLayout {

    /* renamed from: a */
    static final int f120604a = 2131887094;

    /* renamed from: b */
    final C47004a f120605b;

    /* renamed from: c */
    C47016ah f120606c;

    /* renamed from: d */
    C47017ai f120607d;

    /* renamed from: e */
    C46959o f120608e;

    /* renamed from: f */
    int f120609f;

    /* renamed from: g */
    boolean f120610g;

    /* renamed from: h */
    TextView f120611h;

    /* renamed from: i */
    TextView f120612i;

    /* renamed from: j */
    AspectRatioFrameLayout f120613j;

    /* renamed from: k */
    TweetMediaView f120614k;

    /* renamed from: l */
    TextView f120615l;

    /* renamed from: m */
    MediaBadgeView f120616m;

    /* renamed from: n */
    int f120617n;

    /* renamed from: o */
    int f120618o;

    /* renamed from: p */
    int f120619p;

    /* renamed from: q */
    int f120620q;

    /* renamed from: r */
    int f120621r;

    /* renamed from: s */
    int f120622s;

    /* renamed from: t */
    private C47091q f120623t;

    /* renamed from: u */
    private Uri f120624u;

    /* renamed from: com.twitter.sdk.android.tweetui.a$a */
    static class C47004a {

        /* renamed from: a */
        C47023al f120625a;

        /* renamed from: b */
        C47032at f120626b;

        C47004a() {
        }

        /* renamed from: a */
        static C47029aq m146963a() {
            return C47029aq.m147040a();
        }

        /* renamed from: d */
        static Picasso m146964d() {
            return C47029aq.m147040a().f120677g;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final C47023al mo118208b() {
            if (this.f120625a == null) {
                this.f120625a = new C47024am(m146963a());
            }
            return this.f120625a;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final C47032at mo118209c() {
            if (this.f120626b == null) {
                this.f120626b = new C47033au(m146963a());
            }
            return this.f120626b;
        }
    }

    /* renamed from: com.twitter.sdk.android.tweetui.a$b */
    class C47005b implements OnClickListener {
        C47005b() {
        }

        public final void onClick(View view) {
            if (C47003a.this.getPermalinkUri() != null) {
                C47003a.this.mo118195e();
                C47003a.this.mo118194d();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public abstract int getLayout();

    /* access modifiers changed from: 0000 */
    public Uri getPermalinkUri() {
        return this.f120624u;
    }

    public C46959o getTweet() {
        return this.f120608e;
    }

    /* access modifiers changed from: 0000 */
    public abstract String getViewTypeName();

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo118191a() {
        if (isInEditMode()) {
            return false;
        }
        try {
            C47004a.m146963a();
            return true;
        } catch (IllegalStateException e) {
            e.getMessage();
            setEnabled(false);
            return false;
        }
    }

    /* renamed from: h */
    private void m146954h() {
        this.f120613j.setVisibility(8);
    }

    /* renamed from: f */
    private void mo118241f() {
        setOnClickListener(new C47005b());
    }

    /* access modifiers changed from: protected */
    public C47091q getLinkClickListener() {
        if (this.f120623t == null) {
            this.f120623t = new C47034b(this);
        }
        return this.f120623t;
    }

    public long getTweetId() {
        if (this.f120608e == null) {
            return -1;
        }
        return this.f120608e.f120435i;
    }

    /* renamed from: g */
    private void m146953g() {
        if (this.f120608e != null) {
            this.f120605b.mo118208b().mo118229a(this.f120608e, getViewTypeName(), this.f120610g);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final void mo118194d() {
        C46827f.m146486b(getContext(), new Intent("android.intent.action.VIEW", getPermalinkUri()));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final void mo118195e() {
        if (this.f120608e != null) {
            this.f120605b.mo118208b().mo118228a(this.f120608e, getViewTypeName());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo118193c() {
        C46959o b = C47030ar.m147049b(this.f120608e);
        setName(b);
        setScreenName(b);
        setTweetMedia(b);
        setText(b);
        setContentDescription(b);
        if (C47030ar.m147048a(this.f120608e)) {
            mo118190a(this.f120608e.f120422D.screenName, Long.valueOf(getTweetId()));
        } else {
            this.f120624u = null;
        }
        mo118241f();
        m146953g();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo118192b() {
        this.f120611h = (TextView) findViewById(R.id.e5w);
        this.f120612i = (TextView) findViewById(R.id.e5x);
        this.f120613j = (AspectRatioFrameLayout) findViewById(R.id.e5_);
        this.f120614k = (TweetMediaView) findViewById(R.id.e68);
        this.f120615l = (TextView) findViewById(R.id.e62);
        this.f120616m = (MediaBadgeView) findViewById(R.id.e5z);
    }

    public void setTweetLinkClickListener(C47016ah ahVar) {
        this.f120606c = ahVar;
    }

    public void setTweet(C46959o oVar) {
        this.f120608e = oVar;
        mo118193c();
    }

    public void setTweetMediaClickListener(C47017ai aiVar) {
        this.f120607d = aiVar;
        this.f120614k.setTweetMediaClickListener(aiVar);
    }

    /* renamed from: a */
    private static double m146947a(C46952i iVar) {
        if (iVar == null || iVar.f120390b == 0 || iVar.f120389a == 0) {
            return 1.7777777777777777d;
        }
        double d = (double) iVar.f120390b;
        double d2 = (double) iVar.f120389a;
        Double.isNaN(d);
        Double.isNaN(d2);
        return d / d2;
    }

    private void setName(C46959o oVar) {
        if (oVar == null || oVar.f120422D == null) {
            this.f120611h.setText("");
        } else {
            this.f120611h.setText(C47031as.m147056a(oVar.f120422D.name));
        }
    }

    private void setScreenName(C46959o oVar) {
        if (oVar == null || oVar.f120422D == null) {
            this.f120612i.setText("");
        } else {
            this.f120612i.setText(UserUtils.m146549a(C47031as.m147056a(oVar.f120422D.screenName)));
        }
    }

    /* access modifiers changed from: 0000 */
    public void setViewsForMedia(double d) {
        this.f120613j.setVisibility(0);
        this.f120613j.setAspectRatio(d);
        this.f120614k.setVisibility(0);
    }

    /* renamed from: a */
    private CharSequence m146948a(C46959o oVar) {
        boolean z;
        C47084k a = C47004a.m146963a().f120676f.mo118221a(oVar);
        if (a == null) {
            return null;
        }
        if (oVar.f120426H == null || !C46937t.m146806a(oVar.f120426H)) {
            z = false;
        } else {
            z = true;
        }
        return C47025an.m147026a(a, getLinkClickListener(), this.f120619p, this.f120620q, C47030ar.m147052c(oVar), z);
    }

    private void setText(C46959o oVar) {
        if (VERSION.SDK_INT >= 16) {
            this.f120615l.setImportantForAccessibility(2);
        }
        CharSequence a = C47031as.m147053a(m146948a(oVar));
        C47075h.m147175a(this.f120615l);
        if (!TextUtils.isEmpty(a)) {
            this.f120615l.setText(a);
            this.f120615l.setVisibility(0);
            return;
        }
        this.f120615l.setText("");
        this.f120615l.setVisibility(8);
    }

    /* renamed from: a */
    private void m146950a(Context context) {
        LayoutInflater.from(context).inflate(getLayout(), this, true);
    }

    /* access modifiers changed from: 0000 */
    public void setContentDescription(C46959o oVar) {
        String str;
        if (!C47030ar.m147048a(oVar)) {
            setContentDescription(getResources().getString(R.string.fgp));
            return;
        }
        C47084k a = C47004a.m146963a().f120676f.mo118221a(oVar);
        String str2 = null;
        if (a != null) {
            str = a.f120822a;
        } else {
            str = null;
        }
        long a2 = C47014ag.m146989a(oVar.f120428b);
        if (a2 != -1) {
            str2 = DateFormat.getDateInstance().format(new Date(a2));
        }
        setContentDescription(getResources().getString(R.string.fh2, new Object[]{C47031as.m147056a(oVar.f120422D.name), C47031as.m147056a(str), C47031as.m147056a(str2)}));
    }

    /* access modifiers changed from: 0000 */
    public final void setTweetMedia(C46959o oVar) {
        m146954h();
        if (oVar != null) {
            if (oVar.f120426H != null && C46937t.m146806a(oVar.f120426H)) {
                C46947d dVar = oVar.f120426H;
                C46952i d = C46937t.m146809d(dVar);
                String c = C46937t.m146808c(dVar);
                if (d != null && !TextUtils.isEmpty(c)) {
                    setViewsForMedia(m146947a(d));
                    this.f120614k.setVineCard(oVar);
                    this.f120616m.setVisibility(0);
                    this.f120616m.setCard(dVar);
                    m146951a(Long.valueOf(oVar.f120435i), dVar);
                }
            } else if (C47081l.m147201d(oVar)) {
                MediaEntity c2 = C47081l.m147198c(oVar);
                setViewsForMedia(mo118188a(c2));
                this.f120614k.mo118273a(this.f120608e, Collections.singletonList(c2));
                this.f120616m.setVisibility(0);
                this.f120616m.setMediaEntity(c2);
                m146949a(oVar.f120435i, c2);
            } else {
                if (C47081l.m147197b(oVar)) {
                    List a = C47081l.m147193a(oVar);
                    a.size();
                    setViewsForMedia(1.6d);
                    this.f120614k.mo118273a(oVar, a);
                    this.f120616m.setVisibility(8);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public double mo118188a(MediaEntity mediaEntity) {
        if (mediaEntity == null || mediaEntity.sizes == null || mediaEntity.sizes.medium == null || mediaEntity.sizes.medium.f120369w == 0 || mediaEntity.sizes.medium.f120368h == 0) {
            return 1.7777777777777777d;
        }
        double d = (double) mediaEntity.sizes.medium.f120369w;
        double d2 = (double) mediaEntity.sizes.medium.f120368h;
        Double.isNaN(d);
        Double.isNaN(d2);
        return d / d2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo118189a(String str) {
        if (!TextUtils.isEmpty(str) && this.f120606c == null) {
            C46827f.m146486b(getContext(), new Intent("android.intent.action.VIEW", Uri.parse(str)));
        }
    }

    /* renamed from: a */
    private void m146949a(long j, MediaEntity mediaEntity) {
        this.f120605b.mo118209c().mo118236a(ScribeItem.fromMediaEntity(j, mediaEntity));
    }

    /* renamed from: a */
    private void m146951a(Long l, C46947d dVar) {
        this.f120605b.mo118209c().mo118236a(ScribeItem.fromTweetCard(l.longValue(), dVar));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo118190a(String str, Long l) {
        if (l.longValue() > 0) {
            this.f120624u = C47030ar.m147046a(str, l.longValue());
        }
    }

    C47003a(Context context, AttributeSet attributeSet, int i, C47004a aVar) {
        super(context, null, i);
        this.f120605b = aVar;
        m146950a(context);
        mo118192b();
    }
}
