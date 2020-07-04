package android.support.p022v4.media.app;

import android.app.PendingIntent;
import android.media.session.MediaSession;
import android.os.Build.VERSION;
import android.support.p022v4.app.C0653x;
import android.support.p022v4.app.NotificationCompat.C0574a;
import android.support.p022v4.app.NotificationCompat.C0576c;
import android.support.p022v4.media.session.MediaSessionCompat.Token;
import android.widget.RemoteViews;
import com.C1642a;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: android.support.v4.media.app.NotificationCompat */
public final class NotificationCompat {

    /* renamed from: android.support.v4.media.app.NotificationCompat$DecoratedMediaCustomViewStyle */
    public static class DecoratedMediaCustomViewStyle extends MediaStyle {
        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final int mo3091a(int i) {
            return i <= 3 ? R.layout.afy : R.layout.afw;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final int mo3090a() {
            if (this.f2306d.f2270F != null) {
                return R.layout.ag3;
            }
            return super.mo3090a();
        }

        /* renamed from: a */
        private void m3320a(RemoteViews remoteViews) {
            int i;
            if (this.f2306d.f2267C != 0) {
                i = this.f2306d.f2267C;
            } else {
                i = this.f2306d.f2280a.getResources().getColor(R.color.a1l);
            }
            remoteViews.setInt(R.id.dam, "setBackgroundColor", i);
        }

        /* renamed from: c */
        public final RemoteViews mo2510c(C0653x xVar) {
            RemoteViews remoteViews;
            if (VERSION.SDK_INT >= 24) {
                return null;
            }
            if (this.f2306d.f2271G != null) {
                remoteViews = this.f2306d.f2271G;
            } else {
                remoteViews = this.f2306d.f2270F;
            }
            if (remoteViews == null) {
                return null;
            }
            RemoteViews c = mo3095c();
            mo2551a(c, remoteViews);
            if (VERSION.SDK_INT >= 21) {
                m3320a(c);
            }
            return c;
        }

        /* renamed from: d */
        public final RemoteViews mo2511d(C0653x xVar) {
            RemoteViews remoteViews;
            if (VERSION.SDK_INT >= 24) {
                return null;
            }
            if (this.f2306d.f2272H != null) {
                remoteViews = this.f2306d.f2272H;
            } else {
                remoteViews = this.f2306d.f2270F;
            }
            if (remoteViews == null) {
                return null;
            }
            RemoteViews c = mo3095c();
            mo2551a(c, remoteViews);
            if (VERSION.SDK_INT >= 21) {
                m3320a(c);
            }
            return c;
        }

        /* renamed from: a */
        public final void mo2503a(C0653x xVar) {
            if (VERSION.SDK_INT >= 24) {
                xVar.mo2761a().setStyle(mo3092a((android.app.Notification.MediaStyle) new android.app.Notification.DecoratedMediaCustomViewStyle()));
            } else {
                super.mo2503a(xVar);
            }
        }

        /* renamed from: b */
        public final RemoteViews mo2509b(C0653x xVar) {
            boolean z;
            if (VERSION.SDK_INT >= 24) {
                return null;
            }
            boolean z2 = false;
            if (this.f2306d.f2270F != null) {
                z = true;
            } else {
                z = false;
            }
            if (VERSION.SDK_INT >= 21) {
                if (z || this.f2306d.f2271G != null) {
                    z2 = true;
                }
                if (z2) {
                    RemoteViews b = mo3094b();
                    if (z) {
                        mo2551a(b, this.f2306d.f2270F);
                    }
                    m3320a(b);
                    return b;
                }
            } else {
                RemoteViews b2 = mo3094b();
                if (z) {
                    mo2551a(b2, this.f2306d.f2270F);
                    return b2;
                }
            }
            return null;
        }
    }

    /* renamed from: android.support.v4.media.app.NotificationCompat$MediaStyle */
    public static class MediaStyle extends C0576c {

        /* renamed from: a */
        int[] f2940a;

        /* renamed from: b */
        Token f2941b;

        /* renamed from: c */
        boolean f2942c;

        /* renamed from: h */
        PendingIntent f2943h;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo3090a() {
            return R.layout.ag2;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo3091a(int i) {
            return i <= 3 ? R.layout.afx : R.layout.afv;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final RemoteViews mo3095c() {
            int min = Math.min(this.f2306d.f2281b.size(), 5);
            RemoteViews a = mo2549a(false, mo3091a(min), false);
            a.removeAllViews(R.id.bxh);
            if (min > 0) {
                for (int i = 0; i < min; i++) {
                    a.addView(R.id.bxh, m3327a((C0574a) this.f2306d.f2281b.get(i)));
                }
            }
            if (this.f2942c) {
                a.setViewVisibility(R.id.sr, 0);
                a.setInt(R.id.sr, "setAlpha", this.f2306d.f2280a.getResources().getInteger(R.integer.f));
                a.setOnClickPendingIntent(R.id.sr, this.f2943h);
            } else {
                a.setViewVisibility(R.id.sr, 8);
            }
            return a;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final RemoteViews mo3094b() {
            int i;
            RemoteViews a = mo2549a(false, mo3090a(), true);
            int size = this.f2306d.f2281b.size();
            if (this.f2940a == null) {
                i = 0;
            } else {
                i = Math.min(this.f2940a.length, 3);
            }
            a.removeAllViews(R.id.bxh);
            if (i > 0) {
                int i2 = 0;
                while (i2 < i) {
                    if (i2 < size) {
                        a.addView(R.id.bxh, m3327a((C0574a) this.f2306d.f2281b.get(this.f2940a[i2])));
                        i2++;
                    } else {
                        throw new IllegalArgumentException(C1642a.m8034a("setShowActionsInCompactView: action %d out of bounds (max %d)", new Object[]{Integer.valueOf(i2), Integer.valueOf(size - 1)}));
                    }
                }
            }
            if (this.f2942c) {
                a.setViewVisibility(R.id.aer, 8);
                a.setViewVisibility(R.id.sr, 0);
                a.setOnClickPendingIntent(R.id.sr, this.f2943h);
                a.setInt(R.id.sr, "setAlpha", this.f2306d.f2280a.getResources().getInteger(R.integer.f));
            } else {
                a.setViewVisibility(R.id.aer, 0);
                a.setViewVisibility(R.id.sr, 8);
            }
            return a;
        }

        /* renamed from: a */
        public final MediaStyle mo3093a(Token token) {
            this.f2941b = token;
            return this;
        }

        /* renamed from: b */
        public RemoteViews mo2509b(C0653x xVar) {
            if (VERSION.SDK_INT >= 21) {
                return null;
            }
            return mo3094b();
        }

        /* renamed from: c */
        public RemoteViews mo2510c(C0653x xVar) {
            if (VERSION.SDK_INT >= 21) {
                return null;
            }
            return mo3095c();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final android.app.Notification.MediaStyle mo3092a(android.app.Notification.MediaStyle mediaStyle) {
            if (this.f2940a != null) {
                mediaStyle.setShowActionsInCompactView(this.f2940a);
            }
            if (this.f2941b != null) {
                mediaStyle.setMediaSession((MediaSession.Token) this.f2941b.f2993a);
            }
            return mediaStyle;
        }

        /* renamed from: a */
        private RemoteViews m3327a(C0574a aVar) {
            boolean z;
            if (aVar.f2264i == null) {
                z = true;
            } else {
                z = false;
            }
            RemoteViews remoteViews = new RemoteViews(this.f2306d.f2280a.getPackageName(), R.layout.afs);
            remoteViews.setImageViewResource(R.id.a3, aVar.f2262g);
            if (!z) {
                remoteViews.setOnClickPendingIntent(R.id.a3, aVar.f2264i);
            }
            if (VERSION.SDK_INT >= 15) {
                remoteViews.setContentDescription(R.id.a3, aVar.f2263h);
            }
            return remoteViews;
        }

        /* renamed from: a */
        public void mo2503a(C0653x xVar) {
            if (VERSION.SDK_INT >= 21) {
                xVar.mo2761a().setStyle(mo3092a(new android.app.Notification.MediaStyle()));
                return;
            }
            if (this.f2942c) {
                xVar.mo2761a().setOngoing(true);
            }
        }
    }
}
