package android.support.p022v4.app;

import android.app.Notification;
import android.app.Notification.Action;
import android.app.Notification.Builder;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p022v4.app.NotificationCompat.C0574a;
import android.support.p022v4.app.NotificationCompat.C0575b;
import android.support.p022v4.app.NotificationCompat.C0576c;
import android.text.TextUtils;
import android.util.SparseArray;
import android.widget.RemoteViews;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: android.support.v4.app.y */
final class C0654y implements C0653x {

    /* renamed from: a */
    private final Builder f2527a;

    /* renamed from: b */
    private final C0575b f2528b;

    /* renamed from: c */
    private RemoteViews f2529c;

    /* renamed from: d */
    private RemoteViews f2530d;

    /* renamed from: e */
    private final List<Bundle> f2531e = new ArrayList();

    /* renamed from: f */
    private final Bundle f2532f = new Bundle();

    /* renamed from: g */
    private int f2533g;

    /* renamed from: h */
    private RemoteViews f2534h;

    /* renamed from: a */
    public final Builder mo2761a() {
        return this.f2527a;
    }

    /* renamed from: b */
    public final Notification mo2762b() {
        RemoteViews remoteViews;
        C0576c cVar = this.f2528b.f2294o;
        if (cVar != null) {
            cVar.mo2503a((C0653x) this);
        }
        if (cVar != null) {
            remoteViews = cVar.mo2509b(this);
        } else {
            remoteViews = null;
        }
        Notification c = m2828c();
        if (remoteViews != null) {
            c.contentView = remoteViews;
        } else if (this.f2528b.f2270F != null) {
            c.contentView = this.f2528b.f2270F;
        }
        if (VERSION.SDK_INT >= 16 && cVar != null) {
            RemoteViews c2 = cVar.mo2510c(this);
            if (c2 != null) {
                c.bigContentView = c2;
            }
        }
        if (VERSION.SDK_INT >= 21 && cVar != null) {
            RemoteViews d = this.f2528b.f2294o.mo2511d(this);
            if (d != null) {
                c.headsUpContentView = d;
            }
        }
        if (VERSION.SDK_INT >= 16 && cVar != null) {
            Bundle a = NotificationCompat.m2358a(c);
            if (a != null) {
                cVar.mo2517a(a);
            }
        }
        return c;
    }

    /* renamed from: c */
    private Notification m2828c() {
        if (VERSION.SDK_INT >= 26) {
            return this.f2527a.build();
        }
        if (VERSION.SDK_INT >= 24) {
            Notification build = this.f2527a.build();
            if (this.f2533g != 0) {
                if (!(build.getGroup() == null || (build.flags & 512) == 0 || this.f2533g != 2)) {
                    m2826a(build);
                }
                if (build.getGroup() != null && (build.flags & 512) == 0 && this.f2533g == 1) {
                    m2826a(build);
                }
            }
            return build;
        } else if (VERSION.SDK_INT >= 21) {
            this.f2527a.setExtras(this.f2532f);
            Notification build2 = this.f2527a.build();
            if (this.f2529c != null) {
                build2.contentView = this.f2529c;
            }
            if (this.f2530d != null) {
                build2.bigContentView = this.f2530d;
            }
            if (this.f2534h != null) {
                build2.headsUpContentView = this.f2534h;
            }
            if (this.f2533g != 0) {
                if (!(build2.getGroup() == null || (build2.flags & 512) == 0 || this.f2533g != 2)) {
                    m2826a(build2);
                }
                if (build2.getGroup() != null && (build2.flags & 512) == 0 && this.f2533g == 1) {
                    m2826a(build2);
                }
            }
            return build2;
        } else if (VERSION.SDK_INT >= 20) {
            this.f2527a.setExtras(this.f2532f);
            Notification build3 = this.f2527a.build();
            if (this.f2529c != null) {
                build3.contentView = this.f2529c;
            }
            if (this.f2530d != null) {
                build3.bigContentView = this.f2530d;
            }
            if (this.f2533g != 0) {
                if (!(build3.getGroup() == null || (build3.flags & 512) == 0 || this.f2533g != 2)) {
                    m2826a(build3);
                }
                if (build3.getGroup() != null && (build3.flags & 512) == 0 && this.f2533g == 1) {
                    m2826a(build3);
                }
            }
            return build3;
        } else if (VERSION.SDK_INT >= 19) {
            SparseArray a = C0655z.m2835a(this.f2531e);
            if (a != null) {
                this.f2532f.putSparseParcelableArray("android.support.actionExtras", a);
            }
            this.f2527a.setExtras(this.f2532f);
            Notification build4 = this.f2527a.build();
            if (this.f2529c != null) {
                build4.contentView = this.f2529c;
            }
            if (this.f2530d != null) {
                build4.bigContentView = this.f2530d;
            }
            return build4;
        } else if (VERSION.SDK_INT < 16) {
            return this.f2527a.getNotification();
        } else {
            Notification build5 = this.f2527a.build();
            Bundle a2 = NotificationCompat.m2358a(build5);
            Bundle bundle = new Bundle(this.f2532f);
            for (String str : this.f2532f.keySet()) {
                if (a2.containsKey(str)) {
                    bundle.remove(str);
                }
            }
            a2.putAll(bundle);
            SparseArray a3 = C0655z.m2835a(this.f2531e);
            if (a3 != null) {
                NotificationCompat.m2358a(build5).putSparseParcelableArray("android.support.actionExtras", a3);
            }
            if (this.f2529c != null) {
                build5.contentView = this.f2529c;
            }
            if (this.f2530d != null) {
                build5.bigContentView = this.f2530d;
            }
            return build5;
        }
    }

    /* renamed from: a */
    private static void m2826a(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults &= -2;
        notification.defaults &= -3;
    }

    /* renamed from: a */
    private void m2827a(C0574a aVar) {
        Bundle bundle;
        if (VERSION.SDK_INT >= 20) {
            Action.Builder builder = new Action.Builder(aVar.f2262g, aVar.f2263h, aVar.f2264i);
            if (aVar.f2257b != null) {
                for (RemoteInput addRemoteInput : C0590ad.m2468a(aVar.f2257b)) {
                    builder.addRemoteInput(addRemoteInput);
                }
            }
            if (aVar.f2256a != null) {
                bundle = new Bundle(aVar.f2256a);
            } else {
                bundle = new Bundle();
            }
            bundle.putBoolean("android.support.allowGeneratedReplies", aVar.f2259d);
            if (VERSION.SDK_INT >= 24) {
                builder.setAllowGeneratedReplies(aVar.f2259d);
            }
            bundle.putInt("android.support.action.semanticAction", aVar.f2261f);
            if (VERSION.SDK_INT >= 28) {
                builder.setSemanticAction(aVar.f2261f);
            }
            bundle.putBoolean("android.support.action.showsUserInterface", aVar.f2260e);
            builder.addExtras(bundle);
            this.f2527a.addAction(builder.build());
            return;
        }
        if (VERSION.SDK_INT >= 16) {
            this.f2531e.add(C0655z.m2831a(this.f2527a, aVar));
        }
    }

    C0654y(C0575b bVar) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        this.f2528b = bVar;
        if (VERSION.SDK_INT >= 26) {
            this.f2527a = new Builder(bVar.f2280a, bVar.f2273I);
        } else {
            this.f2527a = new Builder(bVar.f2280a);
        }
        Notification notification = bVar.f2278N;
        Builder lights = this.f2527a.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, bVar.f2287h).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS);
        if ((notification.flags & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        Builder ongoing = lights.setOngoing(z);
        if ((notification.flags & 8) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        Builder onlyAlertOnce = ongoing.setOnlyAlertOnce(z2);
        if ((notification.flags & 16) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        Builder deleteIntent = onlyAlertOnce.setAutoCancel(z3).setDefaults(notification.defaults).setContentTitle(bVar.f2283d).setContentText(bVar.f2284e).setContentInfo(bVar.f2289j).setContentIntent(bVar.f2285f).setDeleteIntent(notification.deleteIntent);
        PendingIntent pendingIntent = bVar.f2286g;
        if ((notification.flags & PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH) != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        deleteIntent.setFullScreenIntent(pendingIntent, z4).setLargeIcon(bVar.f2288i).setNumber(bVar.f2290k).setProgress(bVar.f2297r, bVar.f2298s, bVar.f2299t);
        if (VERSION.SDK_INT < 21) {
            this.f2527a.setSound(notification.sound, notification.audioStreamType);
        }
        if (VERSION.SDK_INT >= 16) {
            this.f2527a.setSubText(bVar.f2295p).setUsesChronometer(bVar.f2293n).setPriority(bVar.f2291l);
            Iterator it = bVar.f2281b.iterator();
            while (it.hasNext()) {
                m2827a((C0574a) it.next());
            }
            if (bVar.f2266B != null) {
                this.f2532f.putAll(bVar.f2266B);
            }
            if (VERSION.SDK_INT < 20) {
                if (bVar.f2303x) {
                    this.f2532f.putBoolean("android.support.localOnly", true);
                }
                if (bVar.f2300u != null) {
                    this.f2532f.putString("android.support.groupKey", bVar.f2300u);
                    if (bVar.f2301v) {
                        this.f2532f.putBoolean("android.support.isGroupSummary", true);
                    } else {
                        this.f2532f.putBoolean("android.support.useSideChannel", true);
                    }
                }
                if (bVar.f2302w != null) {
                    this.f2532f.putString("android.support.sortKey", bVar.f2302w);
                }
            }
            this.f2529c = bVar.f2270F;
            this.f2530d = bVar.f2271G;
        }
        if (VERSION.SDK_INT >= 19) {
            this.f2527a.setShowWhen(bVar.f2292m);
            if (VERSION.SDK_INT < 21 && bVar.f2279O != null && !bVar.f2279O.isEmpty()) {
                this.f2532f.putStringArray("android.people", (String[]) bVar.f2279O.toArray(new String[bVar.f2279O.size()]));
            }
        }
        if (VERSION.SDK_INT >= 20) {
            this.f2527a.setLocalOnly(bVar.f2303x).setGroup(bVar.f2300u).setGroupSummary(bVar.f2301v).setSortKey(bVar.f2302w);
            this.f2533g = bVar.f2277M;
        }
        if (VERSION.SDK_INT >= 21) {
            this.f2527a.setCategory(bVar.f2265A).setColor(bVar.f2267C).setVisibility(bVar.f2268D).setPublicVersion(bVar.f2269E).setSound(notification.sound, notification.audioAttributes);
            Iterator it2 = bVar.f2279O.iterator();
            while (it2.hasNext()) {
                this.f2527a.addPerson((String) it2.next());
            }
            this.f2534h = bVar.f2272H;
            if (bVar.f2282c.size() > 0) {
                Bundle bundle = bVar.mo2518a().getBundle("android.car.EXTENSIONS");
                if (bundle == null) {
                    bundle = new Bundle();
                }
                Bundle bundle2 = new Bundle();
                for (int i = 0; i < bVar.f2282c.size(); i++) {
                    bundle2.putBundle(Integer.toString(i), C0655z.m2833a((C0574a) bVar.f2282c.get(i)));
                }
                bundle.putBundle("invisible_actions", bundle2);
                bVar.mo2518a().putBundle("android.car.EXTENSIONS", bundle);
                this.f2532f.putBundle("android.car.EXTENSIONS", bundle);
            }
        }
        if (VERSION.SDK_INT >= 24) {
            this.f2527a.setExtras(bVar.f2266B).setRemoteInputHistory(bVar.f2296q);
            if (bVar.f2270F != null) {
                this.f2527a.setCustomContentView(bVar.f2270F);
            }
            if (bVar.f2271G != null) {
                this.f2527a.setCustomBigContentView(bVar.f2271G);
            }
            if (bVar.f2272H != null) {
                this.f2527a.setCustomHeadsUpContentView(bVar.f2272H);
            }
        }
        if (VERSION.SDK_INT >= 26) {
            this.f2527a.setBadgeIconType(bVar.f2274J).setShortcutId(bVar.f2275K).setTimeoutAfter(bVar.f2276L).setGroupAlertBehavior(bVar.f2277M);
            if (bVar.f2305z) {
                this.f2527a.setColorized(bVar.f2304y);
            }
            if (!TextUtils.isEmpty(bVar.f2273I)) {
                this.f2527a.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
    }
}
