package com.p280ss.android.ugc.aweme.commercialize.utils.p1134a.p1135a;

import android.content.Intent;
import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import bolts.C1592h;
import com.p280ss.android.common.util.C6776h;
import com.p280ss.android.ugc.aweme.app.C22912d;
import com.p280ss.android.ugc.aweme.commercialize.C24558c;
import com.p280ss.android.ugc.aweme.commercialize.p1114a.C24504a.C24505a;
import com.p280ss.android.ugc.aweme.commercialize.utils.p1136b.C25258a;
import com.p280ss.android.ugc.aweme.commercialize.utils.p1136b.C25260b;
import com.p280ss.android.ugc.aweme.commercialize.utils.p1136b.C25260b.C25261a;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import java.util.concurrent.Callable;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7581n;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;
import kotlin.reflect.C7595j;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.a.a.e */
public class C25187e extends C25183a {

    /* renamed from: g */
    static final /* synthetic */ C7595j[] f66478g = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C25187e.class), "intent", "getIntent()Landroid/content/Intent;"))};

    /* renamed from: h */
    public static final C25188a f66479h = new C25188a(null);

    /* renamed from: a */
    private final C7541d f66480a = C7546e.m23569a(new C25191d(this));

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.a.a.e$a */
    public static final class C25188a {
        private C25188a() {
        }

        public /* synthetic */ C25188a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.a.a.e$b */
    static final class C25189b extends Lambda implements C7562b<C25260b, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C25187e f66481a;

        /* renamed from: b */
        final /* synthetic */ String f66482b;

        C25189b(C25187e eVar, String str) {
            this.f66481a = eVar;
            this.f66482b = str;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m82864a((C25260b) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m82864a(C25260b bVar) {
            C7573i.m23587b(bVar, "$receiver");
            bVar.f66609b = this.f66481a.mo65816d().f66430a.f66438b;
            bVar.f66610c = this.f66481a.mo65816d().f66430a.f66439c;
            bVar.f66611d = this.f66481a.mo65816d().f66430a.f66440d;
            bVar.f66608a = this.f66482b;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.a.a.e$c */
    static final class C25190c<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ C25187e f66483a;

        C25190c(C25187e eVar) {
            this.f66483a = eVar;
        }

        public final /* synthetic */ Object call() {
            m82865a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m82865a() {
            try {
                C24558c a = C24558c.m80613a();
                C7573i.m23582a((Object) a, "CommercializeManager.getInstance()");
                a.f64800a = this.f66483a.mo65816d().f66430a.f66437a;
            } catch (Exception e) {
                C6921a.m21559a((Throwable) e);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.a.a.e$d */
    static final class C25191d extends Lambda implements C7561a<Intent> {

        /* renamed from: a */
        final /* synthetic */ C25187e f66484a;

        C25191d(C25187e eVar) {
            this.f66484a = eVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Intent invoke() {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(this.f66484a.mo65816d().f66432c.f66459a));
            intent.putExtra(C22912d.f60642b, this.f66484a.mo65816d().f66432c.f66459a);
            return intent;
        }
    }

    /* renamed from: e */
    private final Intent m82861e() {
        return (Intent) this.f66480a.getValue();
    }

    /* renamed from: a */
    public final boolean mo65817a() {
        if (!mo65816d().f66432c.f66460b && !TextUtils.isEmpty(mo65816d().f66432c.f66459a)) {
            return C6776h.m20944a(mo65815c(), m82861e());
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo65818b() {
        String str;
        CharSequence charSequence;
        Intent e = m82861e();
        String str2 = mo65816d().f66432c.f66459a;
        if (TextUtils.isEmpty(mo65816d().f66432c.f66461c)) {
            str = mo65816d().f66434e.f66455a;
        } else {
            str = mo65816d().f66432c.f66461c;
        }
        String str3 = null;
        if (mo65816d().f66432c.f66462d) {
            String a = C25258a.m83019a(str2, str);
            if (a != null) {
                str2 = a;
            }
            C25258a.m83021a((C25260b) new C25261a().mo65870a(new C25189b(this, str)).f66613a);
        } else if (C7634n.m23776c((CharSequence) str2, (CharSequence) "__back_url__", false)) {
            String builder = Uri.parse(C24505a.f64678a).buildUpon().appendQueryParameter("tag", str).toString();
            C7573i.m23582a((Object) builder, "Uri.parse(CommercializeC…              .toString()");
            String encode = Uri.encode(builder);
            C7573i.m23582a((Object) encode, "Uri.encode(backUrl)");
            str2 = C7634n.m23711a(str2, "__back_url__", encode, false);
            C1592h.m7853a((Callable<TResult>) new C25190c<TResult>(this));
        }
        Uri parse = Uri.parse(str2);
        Aweme aweme = mo65816d().f66430a.f66437a;
        if (aweme != null) {
            charSequence = aweme.getAid();
        } else {
            charSequence = null;
        }
        if (!TextUtils.isEmpty(charSequence)) {
            Builder buildUpon = parse.buildUpon();
            String str4 = "source_aid";
            Aweme aweme2 = mo65816d().f66430a.f66437a;
            if (aweme2 != null) {
                str3 = aweme2.getAid();
            }
            parse = buildUpon.appendQueryParameter(str4, str3).build();
        }
        e.setData(parse);
        return m82844a(mo65815c(), e);
    }
}
