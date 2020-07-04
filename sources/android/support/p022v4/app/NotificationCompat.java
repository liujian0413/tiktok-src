package android.support.p022v4.app;

import android.app.Notification;
import android.app.Notification.Builder;
import android.app.Notification.MessagingStyle.Message;
import android.app.PendingIntent;
import android.app.Person;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p022v4.app.C0588ac.C0589a;
import android.support.p022v4.p026d.C0705a;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.widget.RemoteViews;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: android.support.v4.app.NotificationCompat */
public final class NotificationCompat {

    /* renamed from: android.support.v4.app.NotificationCompat$BigPictureStyle */
    public static class BigPictureStyle extends C0576c {

        /* renamed from: a */
        private Bitmap f2241a;

        /* renamed from: b */
        private Bitmap f2242b;

        /* renamed from: c */
        private boolean f2243c;

        /* renamed from: a */
        public final BigPictureStyle mo2501a(Bitmap bitmap) {
            this.f2241a = bitmap;
            return this;
        }

        /* renamed from: a */
        public final BigPictureStyle mo2502a(CharSequence charSequence) {
            this.f2307e = C0575b.m2392e(charSequence);
            return this;
        }

        /* renamed from: b */
        public final BigPictureStyle mo2504b(Bitmap bitmap) {
            this.f2242b = bitmap;
            this.f2243c = true;
            return this;
        }

        /* renamed from: b */
        public final BigPictureStyle mo2505b(CharSequence charSequence) {
            this.f2308f = C0575b.m2392e(charSequence);
            this.f2309g = true;
            return this;
        }

        /* renamed from: a */
        public final void mo2503a(C0653x xVar) {
            if (VERSION.SDK_INT >= 16) {
                android.app.Notification.BigPictureStyle bigPicture = new android.app.Notification.BigPictureStyle(xVar.mo2761a()).setBigContentTitle(this.f2307e).bigPicture(this.f2241a);
                if (this.f2243c) {
                    bigPicture.bigLargeIcon(this.f2242b);
                }
                if (this.f2309g) {
                    bigPicture.setSummaryText(this.f2308f);
                }
            }
        }
    }

    /* renamed from: android.support.v4.app.NotificationCompat$BigTextStyle */
    public static class BigTextStyle extends C0576c {

        /* renamed from: a */
        private CharSequence f2244a;

        /* renamed from: a */
        public final BigTextStyle mo2506a(CharSequence charSequence) {
            this.f2307e = C0575b.m2392e(charSequence);
            return this;
        }

        /* renamed from: c */
        public final BigTextStyle mo2508c(CharSequence charSequence) {
            this.f2244a = C0575b.m2392e(charSequence);
            return this;
        }

        /* renamed from: b */
        public final BigTextStyle mo2507b(CharSequence charSequence) {
            this.f2308f = C0575b.m2392e(charSequence);
            this.f2309g = true;
            return this;
        }

        /* renamed from: a */
        public final void mo2503a(C0653x xVar) {
            if (VERSION.SDK_INT >= 16) {
                android.app.Notification.BigTextStyle bigText = new android.app.Notification.BigTextStyle(xVar.mo2761a()).setBigContentTitle(this.f2307e).bigText(this.f2244a);
                if (this.f2309g) {
                    bigText.setSummaryText(this.f2308f);
                }
            }
        }
    }

    /* renamed from: android.support.v4.app.NotificationCompat$DecoratedCustomViewStyle */
    public static class DecoratedCustomViewStyle extends C0576c {
        /* renamed from: a */
        public final void mo2503a(C0653x xVar) {
            if (VERSION.SDK_INT >= 24) {
                xVar.mo2761a().setStyle(new android.app.Notification.DecoratedCustomViewStyle());
            }
        }

        /* renamed from: b */
        public final RemoteViews mo2509b(C0653x xVar) {
            if (VERSION.SDK_INT < 24 && this.f2306d.f2270F != null) {
                return m2369a(this.f2306d.f2270F, false);
            }
            return null;
        }

        /* renamed from: c */
        public final RemoteViews mo2510c(C0653x xVar) {
            if (VERSION.SDK_INT >= 24) {
                return null;
            }
            RemoteViews remoteViews = this.f2306d.f2271G;
            if (remoteViews == null) {
                remoteViews = this.f2306d.f2270F;
            }
            if (remoteViews == null) {
                return null;
            }
            return m2369a(remoteViews, true);
        }

        /* renamed from: d */
        public final RemoteViews mo2511d(C0653x xVar) {
            RemoteViews remoteViews;
            if (VERSION.SDK_INT >= 24) {
                return null;
            }
            RemoteViews remoteViews2 = this.f2306d.f2272H;
            if (remoteViews2 != null) {
                remoteViews = remoteViews2;
            } else {
                remoteViews = this.f2306d.f2270F;
            }
            if (remoteViews2 == null) {
                return null;
            }
            return m2369a(remoteViews, true);
        }

        /* renamed from: a */
        private RemoteViews m2368a(C0574a aVar) {
            boolean z;
            int i;
            if (aVar.f2264i == null) {
                z = true;
            } else {
                z = false;
            }
            String packageName = this.f2306d.f2280a.getPackageName();
            if (z) {
                i = R.layout.afr;
            } else {
                i = R.layout.afq;
            }
            RemoteViews remoteViews = new RemoteViews(packageName, i);
            remoteViews.setImageViewBitmap(R.id.af, mo2548a(aVar.f2262g, this.f2306d.f2280a.getResources().getColor(R.color.a1h)));
            remoteViews.setTextViewText(R.id.ao, aVar.f2263h);
            if (!z) {
                remoteViews.setOnClickPendingIntent(R.id.ac, aVar.f2264i);
            }
            if (VERSION.SDK_INT >= 15) {
                remoteViews.setContentDescription(R.id.ac, aVar.f2263h);
            }
            return remoteViews;
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x0041  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private android.widget.RemoteViews m2369a(android.widget.RemoteViews r7, boolean r8) {
            /*
                r6 = this;
                r0 = 1
                r1 = 0
                r2 = 2131494507(0x7f0c066b, float:1.8612524E38)
                android.widget.RemoteViews r2 = r6.mo2549a(r0, r2, r1)
                r3 = 2131296308(0x7f090034, float:1.821053E38)
                r2.removeAllViews(r3)
                if (r8 == 0) goto L_0x003d
                android.support.v4.app.NotificationCompat$b r8 = r6.f2306d
                java.util.ArrayList<android.support.v4.app.NotificationCompat$a> r8 = r8.f2281b
                if (r8 == 0) goto L_0x003d
                android.support.v4.app.NotificationCompat$b r8 = r6.f2306d
                java.util.ArrayList<android.support.v4.app.NotificationCompat$a> r8 = r8.f2281b
                int r8 = r8.size()
                r4 = 3
                int r8 = java.lang.Math.min(r8, r4)
                if (r8 <= 0) goto L_0x003d
                r4 = 0
            L_0x0027:
                if (r4 >= r8) goto L_0x003e
                android.support.v4.app.NotificationCompat$b r5 = r6.f2306d
                java.util.ArrayList<android.support.v4.app.NotificationCompat$a> r5 = r5.f2281b
                java.lang.Object r5 = r5.get(r4)
                android.support.v4.app.NotificationCompat$a r5 = (android.support.p022v4.app.NotificationCompat.C0574a) r5
                android.widget.RemoteViews r5 = r6.m2368a(r5)
                r2.addView(r3, r5)
                int r4 = r4 + 1
                goto L_0x0027
            L_0x003d:
                r0 = 0
            L_0x003e:
                if (r0 == 0) goto L_0x0041
                goto L_0x0043
            L_0x0041:
                r1 = 8
            L_0x0043:
                r2.setViewVisibility(r3, r1)
                r8 = 2131296297(0x7f090029, float:1.8210507E38)
                r2.setViewVisibility(r8, r1)
                r6.mo2551a(r2, r7)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p022v4.app.NotificationCompat.DecoratedCustomViewStyle.m2369a(android.widget.RemoteViews, boolean):android.widget.RemoteViews");
        }
    }

    /* renamed from: android.support.v4.app.NotificationCompat$InboxStyle */
    public static class InboxStyle extends C0576c {

        /* renamed from: a */
        private ArrayList<CharSequence> f2245a = new ArrayList<>();

        /* renamed from: a */
        public final InboxStyle mo2512a(CharSequence charSequence) {
            this.f2307e = C0575b.m2392e(charSequence);
            return this;
        }

        /* renamed from: b */
        public final InboxStyle mo2513b(CharSequence charSequence) {
            this.f2308f = C0575b.m2392e(charSequence);
            this.f2309g = true;
            return this;
        }

        /* renamed from: c */
        public final InboxStyle mo2514c(CharSequence charSequence) {
            this.f2245a.add(C0575b.m2392e(charSequence));
            return this;
        }

        /* renamed from: a */
        public final void mo2503a(C0653x xVar) {
            if (VERSION.SDK_INT >= 16) {
                android.app.Notification.InboxStyle bigContentTitle = new android.app.Notification.InboxStyle(xVar.mo2761a()).setBigContentTitle(this.f2307e);
                if (this.f2309g) {
                    bigContentTitle.setSummaryText(this.f2308f);
                }
                Iterator it = this.f2245a.iterator();
                while (it.hasNext()) {
                    bigContentTitle.addLine((CharSequence) it.next());
                }
            }
        }
    }

    /* renamed from: android.support.v4.app.NotificationCompat$MessagingStyle */
    public static class MessagingStyle extends C0576c {

        /* renamed from: a */
        public final List<C0573a> f2246a = new ArrayList();

        /* renamed from: b */
        public C0588ac f2247b;

        /* renamed from: c */
        public CharSequence f2248c;

        /* renamed from: h */
        private Boolean f2249h;

        /* renamed from: android.support.v4.app.NotificationCompat$MessagingStyle$a */
        public static final class C0573a {

            /* renamed from: a */
            public final CharSequence f2250a;

            /* renamed from: b */
            public final long f2251b;

            /* renamed from: c */
            public final C0588ac f2252c;

            /* renamed from: d */
            public Bundle f2253d = new Bundle();

            /* renamed from: e */
            public String f2254e;

            /* renamed from: f */
            public Uri f2255f;

            /* renamed from: a */
            private Bundle m2388a() {
                Bundle bundle = new Bundle();
                if (this.f2250a != null) {
                    bundle.putCharSequence("text", this.f2250a);
                }
                bundle.putLong("time", this.f2251b);
                if (this.f2252c != null) {
                    bundle.putCharSequence("sender", this.f2252c.f2337a);
                    if (VERSION.SDK_INT >= 28) {
                        bundle.putParcelable("sender_person", this.f2252c.mo2572b());
                    } else {
                        bundle.putBundle("person", this.f2252c.mo2571a());
                    }
                }
                if (this.f2254e != null) {
                    bundle.putString("type", this.f2254e);
                }
                if (this.f2255f != null) {
                    bundle.putParcelable("uri", this.f2255f);
                }
                if (this.f2253d != null) {
                    bundle.putBundle("extras", this.f2253d);
                }
                return bundle;
            }

            /* renamed from: a */
            static Bundle[] m2389a(List<C0573a> list) {
                Bundle[] bundleArr = new Bundle[list.size()];
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    bundleArr[i] = ((C0573a) list.get(i)).m2388a();
                }
                return bundleArr;
            }

            public C0573a(CharSequence charSequence, long j, C0588ac acVar) {
                this.f2250a = charSequence;
                this.f2251b = j;
                this.f2252c = acVar;
            }
        }

        private MessagingStyle() {
        }

        /* renamed from: a */
        private boolean m2381a() {
            if (this.f2306d == null || this.f2306d.f2280a.getApplicationInfo().targetSdkVersion >= 28 || this.f2249h != null) {
                if (this.f2249h != null) {
                    return this.f2249h.booleanValue();
                }
                return false;
            } else if (this.f2248c != null) {
                return true;
            } else {
                return false;
            }
        }

        /* renamed from: b */
        private C0573a m2382b() {
            for (int size = this.f2246a.size() - 1; size >= 0; size--) {
                C0573a aVar = (C0573a) this.f2246a.get(size);
                if (aVar.f2252c != null && !TextUtils.isEmpty(aVar.f2252c.f2337a)) {
                    return aVar;
                }
            }
            if (!this.f2246a.isEmpty()) {
                return (C0573a) this.f2246a.get(this.f2246a.size() - 1);
            }
            return null;
        }

        /* renamed from: c */
        private boolean m2383c() {
            for (int size = this.f2246a.size() - 1; size >= 0; size--) {
                C0573a aVar = (C0573a) this.f2246a.get(size);
                if (aVar.f2252c != null && aVar.f2252c.f2337a == null) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: a */
        public final MessagingStyle mo2515a(CharSequence charSequence) {
            this.f2248c = charSequence;
            return this;
        }

        /* renamed from: a */
        private MessagingStyle m2378a(boolean z) {
            this.f2249h = Boolean.valueOf(z);
            return this;
        }

        /* renamed from: a */
        private static TextAppearanceSpan m2379a(int i) {
            TextAppearanceSpan textAppearanceSpan = new TextAppearanceSpan(null, 0, 0, ColorStateList.valueOf(i), null);
            return textAppearanceSpan;
        }

        public MessagingStyle(CharSequence charSequence) {
            this.f2247b = new C0589a().mo2573a(charSequence).mo2574a();
        }

        /* renamed from: a */
        private CharSequence m2380a(C0573a aVar) {
            boolean z;
            int i;
            CharSequence charSequence;
            CharSequence charSequence2;
            C0705a a = C0705a.m2998a();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (VERSION.SDK_INT >= 21) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                i = -16777216;
            } else {
                i = -1;
            }
            if (aVar.f2252c == null) {
                charSequence = "";
            } else {
                charSequence = aVar.f2252c.f2337a;
            }
            if (TextUtils.isEmpty(charSequence)) {
                charSequence = this.f2247b.f2337a;
                if (z && this.f2306d.f2267C != 0) {
                    i = this.f2306d.f2267C;
                }
            }
            CharSequence a2 = a.mo2850a(charSequence);
            spannableStringBuilder.append(a2);
            spannableStringBuilder.setSpan(m2379a(i), spannableStringBuilder.length() - a2.length(), spannableStringBuilder.length(), 33);
            if (aVar.f2250a == null) {
                charSequence2 = "";
            } else {
                charSequence2 = aVar.f2250a;
            }
            spannableStringBuilder.append("  ").append(a.mo2850a(charSequence2));
            return spannableStringBuilder;
        }

        /* renamed from: a */
        public final void mo2517a(Bundle bundle) {
            super.mo2517a(bundle);
            bundle.putCharSequence("android.selfDisplayName", this.f2247b.f2337a);
            bundle.putBundle("android.messagingStyleUser", this.f2247b.mo2571a());
            bundle.putCharSequence("android.hiddenConversationTitle", this.f2248c);
            if (this.f2248c != null && this.f2249h.booleanValue()) {
                bundle.putCharSequence("android.conversationTitle", this.f2248c);
            }
            if (!this.f2246a.isEmpty()) {
                bundle.putParcelableArray("android.messages", C0573a.m2389a(this.f2246a));
            }
            if (this.f2249h != null) {
                bundle.putBoolean("android.isGroupConversation", this.f2249h.booleanValue());
            }
        }

        /* renamed from: a */
        public final void mo2503a(C0653x xVar) {
            boolean z;
            CharSequence charSequence;
            CharSequence charSequence2;
            android.app.Notification.MessagingStyle messagingStyle;
            Message message;
            CharSequence charSequence3;
            Person person;
            m2378a(m2381a());
            if (VERSION.SDK_INT >= 24) {
                if (VERSION.SDK_INT >= 28) {
                    messagingStyle = new android.app.Notification.MessagingStyle(this.f2247b.mo2572b());
                } else {
                    messagingStyle = new android.app.Notification.MessagingStyle(this.f2247b.f2337a);
                }
                if (this.f2249h.booleanValue() || VERSION.SDK_INT >= 28) {
                    messagingStyle.setConversationTitle(this.f2248c);
                }
                if (VERSION.SDK_INT >= 28) {
                    messagingStyle.setGroupConversation(this.f2249h.booleanValue());
                }
                for (C0573a aVar : this.f2246a) {
                    if (VERSION.SDK_INT >= 28) {
                        C0588ac acVar = aVar.f2252c;
                        CharSequence charSequence4 = aVar.f2250a;
                        long j = aVar.f2251b;
                        if (acVar == null) {
                            person = null;
                        } else {
                            person = acVar.mo2572b();
                        }
                        message = new Message(charSequence4, j, person);
                    } else {
                        if (aVar.f2252c != null) {
                            charSequence3 = aVar.f2252c.f2337a;
                        } else {
                            charSequence3 = null;
                        }
                        message = new Message(aVar.f2250a, aVar.f2251b, charSequence3);
                    }
                    if (aVar.f2254e != null) {
                        message.setData(aVar.f2254e, aVar.f2255f);
                    }
                    messagingStyle.addMessage(message);
                }
                messagingStyle.setBuilder(xVar.mo2761a());
                return;
            }
            C0573a b = m2382b();
            if (this.f2248c != null && this.f2249h.booleanValue()) {
                xVar.mo2761a().setContentTitle(this.f2248c);
            } else if (b != null) {
                xVar.mo2761a().setContentTitle("");
                if (b.f2252c != null) {
                    xVar.mo2761a().setContentTitle(b.f2252c.f2337a);
                }
            }
            if (b != null) {
                Builder a = xVar.mo2761a();
                if (this.f2248c != null) {
                    charSequence2 = m2380a(b);
                } else {
                    charSequence2 = b.f2250a;
                }
                a.setContentText(charSequence2);
            }
            if (VERSION.SDK_INT >= 16) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                if (this.f2248c != null || m2383c()) {
                    z = true;
                } else {
                    z = false;
                }
                for (int size = this.f2246a.size() - 1; size >= 0; size--) {
                    C0573a aVar2 = (C0573a) this.f2246a.get(size);
                    if (z) {
                        charSequence = m2380a(aVar2);
                    } else {
                        charSequence = aVar2.f2250a;
                    }
                    if (size != this.f2246a.size() - 1) {
                        spannableStringBuilder.insert(0, "\n");
                    }
                    spannableStringBuilder.insert(0, charSequence);
                }
                new android.app.Notification.BigTextStyle(xVar.mo2761a()).setBigContentTitle(null).bigText(spannableStringBuilder);
            }
        }

        /* renamed from: a */
        public final MessagingStyle mo2516a(CharSequence charSequence, long j, CharSequence charSequence2) {
            this.f2246a.add(new C0573a(charSequence, j, new C0589a().mo2573a(null).mo2574a()));
            if (this.f2246a.size() > 25) {
                this.f2246a.remove(0);
            }
            return this;
        }
    }

    /* renamed from: android.support.v4.app.NotificationCompat$a */
    public static class C0574a {

        /* renamed from: a */
        public final Bundle f2256a;

        /* renamed from: b */
        public final C0590ad[] f2257b;

        /* renamed from: c */
        public final C0590ad[] f2258c;

        /* renamed from: d */
        public boolean f2259d;

        /* renamed from: e */
        public boolean f2260e;

        /* renamed from: f */
        public final int f2261f;

        /* renamed from: g */
        public int f2262g;

        /* renamed from: h */
        public CharSequence f2263h;

        /* renamed from: i */
        public PendingIntent f2264i;

        public C0574a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i, charSequence, pendingIntent, new Bundle(), null, null, true, 0, true);
        }

        private C0574a(int i, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, C0590ad[] adVarArr, C0590ad[] adVarArr2, boolean z, int i2, boolean z2) {
            this.f2260e = true;
            this.f2262g = i;
            this.f2263h = C0575b.m2392e(charSequence);
            this.f2264i = pendingIntent;
            this.f2256a = bundle;
            this.f2257b = null;
            this.f2258c = null;
            this.f2259d = true;
            this.f2261f = 0;
            this.f2260e = true;
        }
    }

    /* renamed from: android.support.v4.app.NotificationCompat$b */
    public static class C0575b {

        /* renamed from: A */
        String f2265A;

        /* renamed from: B */
        Bundle f2266B;

        /* renamed from: C */
        public int f2267C;

        /* renamed from: D */
        int f2268D;

        /* renamed from: E */
        Notification f2269E;

        /* renamed from: F */
        public RemoteViews f2270F;

        /* renamed from: G */
        public RemoteViews f2271G;

        /* renamed from: H */
        public RemoteViews f2272H;

        /* renamed from: I */
        String f2273I;

        /* renamed from: J */
        int f2274J;

        /* renamed from: K */
        String f2275K;

        /* renamed from: L */
        long f2276L;

        /* renamed from: M */
        int f2277M;

        /* renamed from: N */
        Notification f2278N;

        /* renamed from: O */
        public ArrayList<String> f2279O;

        /* renamed from: a */
        public Context f2280a;

        /* renamed from: b */
        public ArrayList<C0574a> f2281b;

        /* renamed from: c */
        ArrayList<C0574a> f2282c;

        /* renamed from: d */
        CharSequence f2283d;

        /* renamed from: e */
        CharSequence f2284e;

        /* renamed from: f */
        PendingIntent f2285f;

        /* renamed from: g */
        PendingIntent f2286g;

        /* renamed from: h */
        RemoteViews f2287h;

        /* renamed from: i */
        Bitmap f2288i;

        /* renamed from: j */
        CharSequence f2289j;

        /* renamed from: k */
        int f2290k;

        /* renamed from: l */
        public int f2291l;

        /* renamed from: m */
        boolean f2292m;

        /* renamed from: n */
        boolean f2293n;

        /* renamed from: o */
        C0576c f2294o;

        /* renamed from: p */
        CharSequence f2295p;

        /* renamed from: q */
        CharSequence[] f2296q;

        /* renamed from: r */
        int f2297r;

        /* renamed from: s */
        int f2298s;

        /* renamed from: t */
        boolean f2299t;

        /* renamed from: u */
        String f2300u;

        /* renamed from: v */
        boolean f2301v;

        /* renamed from: w */
        String f2302w;

        /* renamed from: x */
        boolean f2303x;

        /* renamed from: y */
        boolean f2304y;

        /* renamed from: z */
        boolean f2305z;

        /* renamed from: a */
        public final C0575b mo2530a(CharSequence charSequence) {
            this.f2283d = m2392e(charSequence);
            return this;
        }

        /* renamed from: a */
        public final C0575b mo2527a(Uri uri) {
            this.f2278N.sound = uri;
            this.f2278N.audioStreamType = -1;
            if (VERSION.SDK_INT >= 21) {
                this.f2278N.audioAttributes = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
            }
            return this;
        }

        /* renamed from: a */
        public final C0575b mo2533a(long[] jArr) {
            this.f2278N.vibrate = jArr;
            return this;
        }

        /* renamed from: a */
        public final C0575b mo2532a(boolean z) {
            m2390a(2, z);
            return this;
        }

        /* renamed from: a */
        public final C0575b mo2531a(String str) {
            this.f2300u = str;
            return this;
        }

        /* renamed from: a */
        public final C0575b mo2528a(C0576c cVar) {
            if (this.f2294o != cVar) {
                this.f2294o = cVar;
                if (this.f2294o != null) {
                    this.f2294o.mo2550a(this);
                }
            }
            return this;
        }

        /* renamed from: a */
        public final C0575b mo2529a(RemoteViews remoteViews) {
            this.f2270F = remoteViews;
            return this;
        }

        /* renamed from: a */
        public final Bundle mo2518a() {
            if (this.f2266B == null) {
                this.f2266B = new Bundle();
            }
            return this.f2266B;
        }

        /* renamed from: b */
        public final Notification mo2534b() {
            return new C0654y(this).mo2762b();
        }

        /* renamed from: c */
        public final long mo2540c() {
            if (this.f2292m) {
                return this.f2278N.when;
            }
            return 0;
        }

        /* renamed from: a */
        public final C0575b mo2524a(PendingIntent pendingIntent) {
            this.f2285f = pendingIntent;
            return this;
        }

        /* renamed from: b */
        public final C0575b mo2538b(String str) {
            this.f2273I = str;
            return this;
        }

        /* renamed from: c */
        public final C0575b mo2541c(int i) {
            this.f2291l = i;
            return this;
        }

        /* renamed from: d */
        public final C0575b mo2544d(int i) {
            this.f2267C = i;
            return this;
        }

        /* renamed from: e */
        public final C0575b mo2547e(int i) {
            this.f2268D = i;
            return this;
        }

        public C0575b(Context context) {
            this(context, null);
        }

        /* renamed from: a */
        public final C0575b mo2519a(int i) {
            this.f2278N.icon = i;
            return this;
        }

        /* renamed from: b */
        public final C0575b mo2536b(PendingIntent pendingIntent) {
            this.f2278N.deleteIntent = pendingIntent;
            return this;
        }

        /* renamed from: c */
        public final C0575b mo2542c(CharSequence charSequence) {
            this.f2289j = m2392e(charSequence);
            return this;
        }

        /* renamed from: d */
        public final C0575b mo2546d(boolean z) {
            this.f2301v = z;
            return this;
        }

        /* renamed from: d */
        public final C0575b mo2545d(CharSequence charSequence) {
            this.f2278N.tickerText = m2392e(charSequence);
            return this;
        }

        /* renamed from: e */
        protected static CharSequence m2392e(CharSequence charSequence) {
            if (charSequence == null) {
                return charSequence;
            }
            if (charSequence.length() > 5120) {
                charSequence = charSequence.subSequence(0, 5120);
            }
            return charSequence;
        }

        /* renamed from: b */
        public final C0575b mo2535b(int i) {
            this.f2278N.defaults = i;
            if ((i & 4) != 0) {
                this.f2278N.flags |= 1;
            }
            return this;
        }

        /* renamed from: c */
        public final C0575b mo2543c(boolean z) {
            this.f2303x = true;
            return this;
        }

        /* renamed from: b */
        public final C0575b mo2537b(CharSequence charSequence) {
            this.f2284e = m2392e(charSequence);
            return this;
        }

        /* renamed from: b */
        private Bitmap m2391b(Bitmap bitmap) {
            if (bitmap == null || VERSION.SDK_INT >= 27) {
                return bitmap;
            }
            Resources resources = this.f2280a.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.dz);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.dy);
            if (bitmap.getWidth() <= dimensionPixelSize && bitmap.getHeight() <= dimensionPixelSize2) {
                return bitmap;
            }
            double d = (double) dimensionPixelSize;
            double max = (double) Math.max(1, bitmap.getWidth());
            Double.isNaN(d);
            Double.isNaN(max);
            double d2 = d / max;
            double d3 = (double) dimensionPixelSize2;
            double max2 = (double) Math.max(1, bitmap.getHeight());
            Double.isNaN(d3);
            Double.isNaN(max2);
            double min = Math.min(d2, d3 / max2);
            double width = (double) bitmap.getWidth();
            Double.isNaN(width);
            int ceil = (int) Math.ceil(width * min);
            double height = (double) bitmap.getHeight();
            Double.isNaN(height);
            return Bitmap.createScaledBitmap(bitmap, ceil, (int) Math.ceil(height * min), true);
        }

        /* renamed from: b */
        public final C0575b mo2539b(boolean z) {
            m2390a(16, z);
            return this;
        }

        /* renamed from: a */
        public final C0575b mo2523a(long j) {
            this.f2278N.when = j;
            return this;
        }

        /* renamed from: a */
        public final C0575b mo2526a(Bitmap bitmap) {
            this.f2288i = m2391b(bitmap);
            return this;
        }

        /* renamed from: a */
        private void m2390a(int i, boolean z) {
            if (z) {
                Notification notification = this.f2278N;
                notification.flags = i | notification.flags;
                return;
            }
            Notification notification2 = this.f2278N;
            notification2.flags = (i ^ -1) & notification2.flags;
        }

        public C0575b(Context context, String str) {
            this.f2281b = new ArrayList<>();
            this.f2282c = new ArrayList<>();
            this.f2292m = true;
            this.f2303x = false;
            this.f2267C = 0;
            this.f2268D = 0;
            this.f2274J = 0;
            this.f2277M = 0;
            this.f2278N = new Notification();
            this.f2280a = context;
            this.f2273I = str;
            this.f2278N.when = System.currentTimeMillis();
            this.f2278N.audioStreamType = -1;
            this.f2291l = 0;
            this.f2279O = new ArrayList<>();
        }

        /* renamed from: a */
        public final C0575b mo2525a(PendingIntent pendingIntent, boolean z) {
            this.f2286g = pendingIntent;
            m2390a((int) PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH, true);
            return this;
        }

        /* renamed from: a */
        public final C0575b mo2520a(int i, int i2, int i3) {
            int i4;
            this.f2278N.ledARGB = -16711936;
            this.f2278N.ledOnMS = 1000;
            this.f2278N.ledOffMS = 2500;
            if (this.f2278N.ledOnMS == 0 || this.f2278N.ledOffMS == 0) {
                i4 = 0;
            } else {
                i4 = 1;
            }
            this.f2278N.flags = i4 | (this.f2278N.flags & -2);
            return this;
        }

        /* renamed from: a */
        public final C0575b mo2521a(int i, int i2, boolean z) {
            this.f2297r = 100;
            this.f2298s = i2;
            this.f2299t = false;
            return this;
        }

        /* renamed from: a */
        public final C0575b mo2522a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this.f2281b.add(new C0574a(R.drawable.xu, charSequence, pendingIntent));
            return this;
        }
    }

    /* renamed from: android.support.v4.app.NotificationCompat$c */
    public static abstract class C0576c {

        /* renamed from: d */
        protected C0575b f2306d;

        /* renamed from: e */
        CharSequence f2307e;

        /* renamed from: f */
        CharSequence f2308f;

        /* renamed from: g */
        boolean f2309g;

        /* renamed from: a */
        private static float m2423a(float f, float f2, float f3) {
            if (f < 1.0f) {
                return 1.0f;
            }
            if (f > 1.3f) {
                return 1.3f;
            }
            return f;
        }

        /* renamed from: a */
        public void mo2517a(Bundle bundle) {
        }

        /* renamed from: a */
        public void mo2503a(C0653x xVar) {
        }

        /* renamed from: b */
        public RemoteViews mo2509b(C0653x xVar) {
            return null;
        }

        /* renamed from: c */
        public RemoteViews mo2510c(C0653x xVar) {
            return null;
        }

        /* renamed from: d */
        public RemoteViews mo2511d(C0653x xVar) {
            return null;
        }

        /* renamed from: a */
        public final void mo2551a(RemoteViews remoteViews, RemoteViews remoteViews2) {
            m2427a(remoteViews);
            remoteViews.removeAllViews(R.id.c7a);
            remoteViews.addView(R.id.c7a, remoteViews2.clone());
            remoteViews.setViewVisibility(R.id.c7a, 0);
            if (VERSION.SDK_INT >= 21) {
                remoteViews.setViewPadding(R.id.c7b, 0, mo3090a(), 0, 0);
            }
        }

        /* renamed from: a */
        private int mo3090a() {
            Resources resources = this.f2306d.f2280a.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.ku);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.kv);
            float a = (m2423a(resources.getConfiguration().fontScale, 1.0f, 1.3f) - 1.0f) / 0.29999995f;
            return Math.round(((1.0f - a) * ((float) dimensionPixelSize)) + (a * ((float) dimensionPixelSize2)));
        }

        /* renamed from: a */
        private static void m2427a(RemoteViews remoteViews) {
            remoteViews.setViewVisibility(R.id.title, 8);
            remoteViews.setViewVisibility(R.id.dha, 8);
            remoteViews.setViewVisibility(R.id.text, 8);
        }

        /* renamed from: a */
        public final void mo2550a(C0575b bVar) {
            if (this.f2306d != bVar) {
                this.f2306d = bVar;
                if (this.f2306d != null) {
                    this.f2306d.mo2528a(this);
                }
            }
        }

        /* renamed from: a */
        public final Bitmap mo2548a(int i, int i2) {
            return m2425a(i, i2, 0);
        }

        /* renamed from: a */
        private Bitmap m2425a(int i, int i2, int i3) {
            int i4;
            Drawable drawable = this.f2306d.f2280a.getResources().getDrawable(i);
            if (i3 == 0) {
                i4 = drawable.getIntrinsicWidth();
            } else {
                i4 = i3;
            }
            if (i3 == 0) {
                i3 = drawable.getIntrinsicHeight();
            }
            Bitmap createBitmap = Bitmap.createBitmap(i4, i3, Config.ARGB_8888);
            drawable.setBounds(0, 0, i4, i3);
            if (i2 != 0) {
                drawable.mutate().setColorFilter(new PorterDuffColorFilter(i2, Mode.SRC_IN));
            }
            drawable.draw(new Canvas(createBitmap));
            return createBitmap;
        }

        /* JADX WARNING: Removed duplicated region for block: B:64:0x0196  */
        /* JADX WARNING: Removed duplicated region for block: B:65:0x01a2  */
        /* JADX WARNING: Removed duplicated region for block: B:71:0x01ae  */
        /* JADX WARNING: Removed duplicated region for block: B:75:0x01d0  */
        /* JADX WARNING: Removed duplicated region for block: B:84:0x0212  */
        /* JADX WARNING: Removed duplicated region for block: B:85:0x0214  */
        /* JADX WARNING: Removed duplicated region for block: B:88:0x021e  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final android.widget.RemoteViews mo2549a(boolean r16, int r17, boolean r18) {
            /*
                r15 = this;
                r0 = r15
                android.support.v4.app.NotificationCompat$b r2 = r0.f2306d
                android.content.Context r2 = r2.f2280a
                android.content.res.Resources r2 = r2.getResources()
                android.widget.RemoteViews r9 = new android.widget.RemoteViews
                android.support.v4.app.NotificationCompat$b r3 = r0.f2306d
                android.content.Context r3 = r3.f2280a
                java.lang.String r3 = r3.getPackageName()
                r4 = r17
                r9.<init>(r3, r4)
                android.support.v4.app.NotificationCompat$b r3 = r0.f2306d
                int r3 = r3.f2291l
                r4 = -1
                r10 = 1
                r11 = 0
                if (r3 >= r4) goto L_0x0023
                r3 = 1
                goto L_0x0024
            L_0x0023:
                r3 = 0
            L_0x0024:
                int r5 = android.os.Build.VERSION.SDK_INT
                r6 = 21
                r12 = 16
                r7 = 2131298510(0x7f0908ce, float:1.8214995E38)
                if (r5 < r12) goto L_0x0059
                int r5 = android.os.Build.VERSION.SDK_INT
                if (r5 >= r6) goto L_0x0059
                r5 = 2131300192(0x7f090f60, float:1.8218407E38)
                if (r3 == 0) goto L_0x0049
                java.lang.String r3 = "setBackgroundResource"
                r8 = 2131233561(0x7f080b19, float:1.8083263E38)
                r9.setInt(r5, r3, r8)
                java.lang.String r3 = "setBackgroundResource"
                r5 = 2131233570(0x7f080b22, float:1.8083281E38)
                r9.setInt(r7, r3, r5)
                goto L_0x0059
            L_0x0049:
                java.lang.String r3 = "setBackgroundResource"
                r8 = 2131233560(0x7f080b18, float:1.808326E38)
                r9.setInt(r5, r3, r8)
                java.lang.String r3 = "setBackgroundResource"
                r5 = 2131233569(0x7f080b21, float:1.808328E38)
                r9.setInt(r7, r3, r5)
            L_0x0059:
                android.support.v4.app.NotificationCompat$b r3 = r0.f2306d
                android.graphics.Bitmap r3 = r3.f2288i
                r13 = 8
                if (r3 == 0) goto L_0x00b9
                int r3 = android.os.Build.VERSION.SDK_INT
                if (r3 < r12) goto L_0x0070
                r9.setViewVisibility(r7, r11)
                android.support.v4.app.NotificationCompat$b r3 = r0.f2306d
                android.graphics.Bitmap r3 = r3.f2288i
                r9.setImageViewBitmap(r7, r3)
                goto L_0x0073
            L_0x0070:
                r9.setViewVisibility(r7, r13)
            L_0x0073:
                if (r16 == 0) goto L_0x00ff
                android.support.v4.app.NotificationCompat$b r1 = r0.f2306d
                android.app.Notification r1 = r1.f2278N
                int r1 = r1.icon
                if (r1 == 0) goto L_0x00ff
                r1 = 2131165606(0x7f0701a6, float:1.7945434E38)
                int r1 = r2.getDimensionPixelSize(r1)
                r3 = 2131165608(0x7f0701a8, float:1.7945438E38)
                int r3 = r2.getDimensionPixelSize(r3)
                int r3 = r3 * 2
                int r3 = r1 - r3
                int r5 = android.os.Build.VERSION.SDK_INT
                r7 = 2131301100(0x7f0912ec, float:1.8220248E38)
                if (r5 < r6) goto L_0x00a8
                android.support.v4.app.NotificationCompat$b r4 = r0.f2306d
                android.app.Notification r4 = r4.f2278N
                int r4 = r4.icon
                android.support.v4.app.NotificationCompat$b r5 = r0.f2306d
                int r5 = r5.f2267C
                android.graphics.Bitmap r1 = r15.m2426a(r4, r1, r3, r5)
                r9.setImageViewBitmap(r7, r1)
                goto L_0x00b5
            L_0x00a8:
                android.support.v4.app.NotificationCompat$b r1 = r0.f2306d
                android.app.Notification r1 = r1.f2278N
                int r1 = r1.icon
                android.graphics.Bitmap r1 = r15.mo2548a(r1, r4)
                r9.setImageViewBitmap(r7, r1)
            L_0x00b5:
                r9.setViewVisibility(r7, r11)
                goto L_0x00ff
            L_0x00b9:
                if (r16 == 0) goto L_0x00ff
                android.support.v4.app.NotificationCompat$b r1 = r0.f2306d
                android.app.Notification r1 = r1.f2278N
                int r1 = r1.icon
                if (r1 == 0) goto L_0x00ff
                r9.setViewVisibility(r7, r11)
                int r1 = android.os.Build.VERSION.SDK_INT
                if (r1 < r6) goto L_0x00f2
                r1 = 2131165603(0x7f0701a3, float:1.7945428E38)
                int r1 = r2.getDimensionPixelSize(r1)
                r3 = 2131165600(0x7f0701a0, float:1.7945422E38)
                int r3 = r2.getDimensionPixelSize(r3)
                int r1 = r1 - r3
                r3 = 2131165609(0x7f0701a9, float:1.794544E38)
                int r3 = r2.getDimensionPixelSize(r3)
                android.support.v4.app.NotificationCompat$b r4 = r0.f2306d
                android.app.Notification r4 = r4.f2278N
                int r4 = r4.icon
                android.support.v4.app.NotificationCompat$b r5 = r0.f2306d
                int r5 = r5.f2267C
                android.graphics.Bitmap r1 = r15.m2426a(r4, r1, r3, r5)
                r9.setImageViewBitmap(r7, r1)
                goto L_0x00ff
            L_0x00f2:
                android.support.v4.app.NotificationCompat$b r1 = r0.f2306d
                android.app.Notification r1 = r1.f2278N
                int r1 = r1.icon
                android.graphics.Bitmap r1 = r15.mo2548a(r1, r4)
                r9.setImageViewBitmap(r7, r1)
            L_0x00ff:
                android.support.v4.app.NotificationCompat$b r1 = r0.f2306d
                java.lang.CharSequence r1 = r1.f2283d
                if (r1 == 0) goto L_0x010f
                r1 = 2131302118(0x7f0916e6, float:1.8222313E38)
                android.support.v4.app.NotificationCompat$b r3 = r0.f2306d
                java.lang.CharSequence r3 = r3.f2283d
                r9.setTextViewText(r1, r3)
            L_0x010f:
                android.support.v4.app.NotificationCompat$b r1 = r0.f2306d
                java.lang.CharSequence r1 = r1.f2284e
                r3 = 2131302025(0x7f091689, float:1.8222124E38)
                if (r1 == 0) goto L_0x0121
                android.support.v4.app.NotificationCompat$b r1 = r0.f2306d
                java.lang.CharSequence r1 = r1.f2284e
                r9.setTextViewText(r3, r1)
                r1 = 1
                goto L_0x0122
            L_0x0121:
                r1 = 0
            L_0x0122:
                int r4 = android.os.Build.VERSION.SDK_INT
                if (r4 >= r6) goto L_0x012e
                android.support.v4.app.NotificationCompat$b r4 = r0.f2306d
                android.graphics.Bitmap r4 = r4.f2288i
                if (r4 == 0) goto L_0x012e
                r4 = 1
                goto L_0x012f
            L_0x012e:
                r4 = 0
            L_0x012f:
                android.support.v4.app.NotificationCompat$b r5 = r0.f2306d
                java.lang.CharSequence r5 = r5.f2289j
                r6 = 2131298644(0x7f090954, float:1.8215267E38)
                if (r5 == 0) goto L_0x0145
                android.support.v4.app.NotificationCompat$b r1 = r0.f2306d
                java.lang.CharSequence r1 = r1.f2289j
                r9.setTextViewText(r6, r1)
                r9.setViewVisibility(r6, r11)
            L_0x0142:
                r1 = 1
                r14 = 1
                goto L_0x017c
            L_0x0145:
                android.support.v4.app.NotificationCompat$b r5 = r0.f2306d
                int r5 = r5.f2290k
                if (r5 <= 0) goto L_0x0177
                r1 = 2131361822(0x7f0a001e, float:1.8343407E38)
                int r1 = r2.getInteger(r1)
                android.support.v4.app.NotificationCompat$b r4 = r0.f2306d
                int r4 = r4.f2290k
                if (r4 <= r1) goto L_0x0163
                r1 = 2131827061(0x7f111975, float:1.9287024E38)
                java.lang.String r1 = r2.getString(r1)
                r9.setTextViewText(r6, r1)
                goto L_0x0173
            L_0x0163:
                java.text.NumberFormat r1 = java.text.NumberFormat.getIntegerInstance()
                android.support.v4.app.NotificationCompat$b r4 = r0.f2306d
                int r4 = r4.f2290k
                long r4 = (long) r4
                java.lang.String r1 = r1.format(r4)
                r9.setTextViewText(r6, r1)
            L_0x0173:
                r9.setViewVisibility(r6, r11)
                goto L_0x0142
            L_0x0177:
                r9.setViewVisibility(r6, r13)
                r14 = r1
                r1 = r4
            L_0x017c:
                android.support.v4.app.NotificationCompat$b r4 = r0.f2306d
                java.lang.CharSequence r4 = r4.f2295p
                if (r4 == 0) goto L_0x01a5
                int r4 = android.os.Build.VERSION.SDK_INT
                if (r4 < r12) goto L_0x01a5
                android.support.v4.app.NotificationCompat$b r4 = r0.f2306d
                java.lang.CharSequence r4 = r4.f2295p
                r9.setTextViewText(r3, r4)
                android.support.v4.app.NotificationCompat$b r4 = r0.f2306d
                java.lang.CharSequence r4 = r4.f2284e
                r5 = 2131302027(0x7f09168b, float:1.8222129E38)
                if (r4 == 0) goto L_0x01a2
                android.support.v4.app.NotificationCompat$b r4 = r0.f2306d
                java.lang.CharSequence r4 = r4.f2284e
                r9.setTextViewText(r5, r4)
                r9.setViewVisibility(r5, r11)
                r4 = 1
                goto L_0x01a6
            L_0x01a2:
                r9.setViewVisibility(r5, r13)
            L_0x01a5:
                r4 = 0
            L_0x01a6:
                if (r4 == 0) goto L_0x01c4
                int r4 = android.os.Build.VERSION.SDK_INT
                if (r4 < r12) goto L_0x01c4
                if (r18 == 0) goto L_0x01b9
                r4 = 2131165610(0x7f0701aa, float:1.7945442E38)
                int r2 = r2.getDimensionPixelSize(r4)
                float r2 = (float) r2
                r9.setTextViewTextSize(r3, r11, r2)
            L_0x01b9:
                r4 = 2131299467(0x7f090c8b, float:1.8216936E38)
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r3 = r9
                r3.setViewPadding(r4, r5, r6, r7, r8)
            L_0x01c4:
                android.support.v4.app.NotificationCompat$b r2 = r0.f2306d
                long r2 = r2.mo2540c()
                r4 = 0
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 == 0) goto L_0x020d
                android.support.v4.app.NotificationCompat$b r1 = r0.f2306d
                boolean r1 = r1.f2293n
                if (r1 == 0) goto L_0x01fb
                int r1 = android.os.Build.VERSION.SDK_INT
                if (r1 < r12) goto L_0x01fb
                r1 = 2131297094(0x7f090346, float:1.8212123E38)
                r9.setViewVisibility(r1, r11)
                java.lang.String r2 = "setBase"
                android.support.v4.app.NotificationCompat$b r3 = r0.f2306d
                long r3 = r3.mo2540c()
                long r5 = android.os.SystemClock.elapsedRealtime()
                long r7 = java.lang.System.currentTimeMillis()
                long r5 = r5 - r7
                long r3 = r3 + r5
                r9.setLong(r1, r2, r3)
                java.lang.String r2 = "setStarted"
                r9.setBoolean(r1, r2, r10)
                goto L_0x020c
            L_0x01fb:
                r1 = 2131302098(0x7f0916d2, float:1.8222273E38)
                r9.setViewVisibility(r1, r11)
                java.lang.String r2 = "setTime"
                android.support.v4.app.NotificationCompat$b r3 = r0.f2306d
                long r3 = r3.mo2540c()
                r9.setLong(r1, r2, r3)
            L_0x020c:
                r1 = 1
            L_0x020d:
                r2 = 2131301110(0x7f0912f6, float:1.8220269E38)
                if (r1 == 0) goto L_0x0214
                r1 = 0
                goto L_0x0216
            L_0x0214:
                r1 = 8
            L_0x0216:
                r9.setViewVisibility(r2, r1)
                r1 = 2131299468(0x7f090c8c, float:1.8216938E38)
                if (r14 == 0) goto L_0x021f
                r13 = 0
            L_0x021f:
                r9.setViewVisibility(r1, r13)
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p022v4.app.NotificationCompat.C0576c.mo2549a(boolean, int, boolean):android.widget.RemoteViews");
        }

        /* renamed from: a */
        private Bitmap m2426a(int i, int i2, int i3, int i4) {
            if (i4 == 0) {
                i4 = 0;
            }
            Bitmap a = m2425a((int) R.drawable.bc5, i4, i2);
            Canvas canvas = new Canvas(a);
            Drawable mutate = this.f2306d.f2280a.getResources().getDrawable(i).mutate();
            mutate.setFilterBitmap(true);
            int i5 = (i2 - i3) / 2;
            int i6 = i3 + i5;
            mutate.setBounds(i5, i5, i6, i6);
            mutate.setColorFilter(new PorterDuffColorFilter(-1, Mode.SRC_ATOP));
            mutate.draw(canvas);
            return a;
        }
    }

    /* renamed from: a */
    public static Bundle m2358a(Notification notification) {
        if (VERSION.SDK_INT >= 19) {
            return notification.extras;
        }
        if (VERSION.SDK_INT >= 16) {
            return C0655z.m2832a(notification);
        }
        return null;
    }
}
