package com.p280ss.android.ugc.aweme.newfollow.p1423ui;

import android.app.Activity;
import android.content.Context;
import android.support.p022v4.content.C0683b;
import android.widget.ImageView;
import android.widget.TextView;
import com.p280ss.android.download.api.model.C19400e;
import com.p280ss.android.download.api.p858b.C19384a;
import com.p280ss.android.download.api.p858b.C19387c;
import com.p280ss.android.download.api.p858b.C19388d;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25352e;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.newfollow.ui.k */
public final class C34177k implements C19388d {

    /* renamed from: f */
    public static final C34178a f89094f = new C34178a(null);

    /* renamed from: a */
    public final WeakReference<VideoFollowFeedDetailActivity> f89095a;

    /* renamed from: b */
    public final WeakReference<TextView> f89096b;

    /* renamed from: c */
    public final WeakReference<TextView> f89097c;

    /* renamed from: d */
    public final WeakReference<ImageView> f89098d;

    /* renamed from: e */
    public final Aweme f89099e;

    /* renamed from: com.ss.android.ugc.aweme.newfollow.ui.k$a */
    public static final class C34178a {
        private C34178a() {
        }

        public /* synthetic */ C34178a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static long m110208a(long j) {
            return Math.max(j >> 20, 0);
        }

        /* renamed from: a */
        public static <T> WeakReference<T> m110209a(T t) {
            if (t == null) {
                return null;
            }
            return new WeakReference<>(t);
        }
    }

    /* renamed from: a */
    public final void mo51374a(C19387c cVar, C19384a aVar) {
        C7573i.m23587b(cVar, "downloadModel");
    }

    /* renamed from: a */
    public final void mo51373a() {
        WeakReference<VideoFollowFeedDetailActivity> weakReference = this.f89095a;
        if (weakReference != null) {
            VideoFollowFeedDetailActivity videoFollowFeedDetailActivity = (VideoFollowFeedDetailActivity) weakReference.get();
            if (videoFollowFeedDetailActivity != null) {
                C7573i.m23582a((Object) videoFollowFeedDetailActivity, "wpActivity?.get() ?: return");
                WeakReference<TextView> weakReference2 = this.f89096b;
                if (weakReference2 != null) {
                    TextView textView = (TextView) weakReference2.get();
                    if (textView != null) {
                        C7573i.m23582a((Object) textView, "wpDownloadPercent?.get() ?: return");
                        WeakReference<TextView> weakReference3 = this.f89097c;
                        if (weakReference3 != null) {
                            TextView textView2 = (TextView) weakReference3.get();
                            if (textView2 != null) {
                                C7573i.m23582a((Object) textView2, "wpDownloadSize?.get() ?: return");
                                WeakReference<ImageView> weakReference4 = this.f89098d;
                                if (weakReference4 != null) {
                                    ImageView imageView = (ImageView) weakReference4.get();
                                    if (imageView != null) {
                                        C7573i.m23582a((Object) imageView, "wpDownloadDetail?.get() ?: return");
                                        textView.setTextColor(C0683b.m2912c(videoFollowFeedDetailActivity, R.color.az3));
                                        textView.setText(C25352e.m83243z(this.f89099e));
                                        textView2.setVisibility(8);
                                        imageView.setVisibility(0);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo51377b(C19400e eVar) {
        WeakReference<VideoFollowFeedDetailActivity> weakReference = this.f89095a;
        if (weakReference != null) {
            VideoFollowFeedDetailActivity videoFollowFeedDetailActivity = (VideoFollowFeedDetailActivity) weakReference.get();
            if (videoFollowFeedDetailActivity != null) {
                C7573i.m23582a((Object) videoFollowFeedDetailActivity, "wpActivity?.get() ?: return");
                WeakReference<TextView> weakReference2 = this.f89096b;
                if (weakReference2 != null) {
                    TextView textView = (TextView) weakReference2.get();
                    if (textView != null) {
                        C7573i.m23582a((Object) textView, "wpDownloadPercent?.get() ?: return");
                        WeakReference<TextView> weakReference3 = this.f89097c;
                        if (weakReference3 != null) {
                            TextView textView2 = (TextView) weakReference3.get();
                            if (textView2 != null) {
                                C7573i.m23582a((Object) textView2, "wpDownloadSize?.get() ?: return");
                                WeakReference<ImageView> weakReference4 = this.f89098d;
                                if (weakReference4 != null) {
                                    ImageView imageView = (ImageView) weakReference4.get();
                                    if (imageView != null) {
                                        C7573i.m23582a((Object) imageView, "wpDownloadDetail?.get() ?: return");
                                        Activity activity = videoFollowFeedDetailActivity;
                                        textView.setVisibility(0);
                                        textView.setText(R.string.cqz);
                                        textView.setTextColor(C0683b.m2912c(activity, R.color.az3));
                                        textView2.setVisibility(8);
                                        imageView.setVisibility(8);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo51379c(C19400e eVar) {
        WeakReference<VideoFollowFeedDetailActivity> weakReference = this.f89095a;
        if (weakReference != null) {
            VideoFollowFeedDetailActivity videoFollowFeedDetailActivity = (VideoFollowFeedDetailActivity) weakReference.get();
            if (videoFollowFeedDetailActivity != null) {
                C7573i.m23582a((Object) videoFollowFeedDetailActivity, "wpActivity?.get() ?: return");
                WeakReference<TextView> weakReference2 = this.f89096b;
                if (weakReference2 != null) {
                    TextView textView = (TextView) weakReference2.get();
                    if (textView != null) {
                        C7573i.m23582a((Object) textView, "wpDownloadPercent?.get() ?: return");
                        WeakReference<TextView> weakReference3 = this.f89097c;
                        if (weakReference3 != null) {
                            TextView textView2 = (TextView) weakReference3.get();
                            if (textView2 != null) {
                                C7573i.m23582a((Object) textView2, "wpDownloadSize?.get() ?: return");
                                WeakReference<ImageView> weakReference4 = this.f89098d;
                                if (weakReference4 != null) {
                                    ImageView imageView = (ImageView) weakReference4.get();
                                    if (imageView != null) {
                                        C7573i.m23582a((Object) imageView, "wpDownloadDetail?.get() ?: return");
                                        Activity activity = videoFollowFeedDetailActivity;
                                        textView.setVisibility(0);
                                        textView.setText(R.string.a5i);
                                        textView.setTextColor(C0683b.m2912c(activity, R.color.az3));
                                        textView2.setVisibility(8);
                                        imageView.setVisibility(8);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo51375a(C19400e eVar) {
        WeakReference<VideoFollowFeedDetailActivity> weakReference = this.f89095a;
        if (weakReference != null) {
            VideoFollowFeedDetailActivity videoFollowFeedDetailActivity = (VideoFollowFeedDetailActivity) weakReference.get();
            if (videoFollowFeedDetailActivity != null) {
                C7573i.m23582a((Object) videoFollowFeedDetailActivity, "wpActivity?.get() ?: return");
                WeakReference<TextView> weakReference2 = this.f89096b;
                if (weakReference2 != null) {
                    TextView textView = (TextView) weakReference2.get();
                    if (textView != null) {
                        C7573i.m23582a((Object) textView, "wpDownloadPercent?.get() ?: return");
                        WeakReference<TextView> weakReference3 = this.f89097c;
                        if (weakReference3 != null) {
                            TextView textView2 = (TextView) weakReference3.get();
                            if (textView2 != null) {
                                C7573i.m23582a((Object) textView2, "wpDownloadSize?.get() ?: return");
                                WeakReference<ImageView> weakReference4 = this.f89098d;
                                if (weakReference4 != null) {
                                    ImageView imageView = (ImageView) weakReference4.get();
                                    if (imageView != null) {
                                        C7573i.m23582a((Object) imageView, "wpDownloadDetail?.get() ?: return");
                                        String string = videoFollowFeedDetailActivity.getString(R.string.db6);
                                        textView.setVisibility(0);
                                        textView.setText("0%");
                                        textView2.setVisibility(0);
                                        textView2.setText(string);
                                        imageView.setVisibility(8);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo51378b(C19400e eVar, int i) {
        WeakReference<VideoFollowFeedDetailActivity> weakReference = this.f89095a;
        if (weakReference != null) {
            VideoFollowFeedDetailActivity videoFollowFeedDetailActivity = (VideoFollowFeedDetailActivity) weakReference.get();
            if (videoFollowFeedDetailActivity != null) {
                C7573i.m23582a((Object) videoFollowFeedDetailActivity, "wpActivity?.get() ?: return");
                WeakReference<TextView> weakReference2 = this.f89096b;
                if (weakReference2 != null) {
                    TextView textView = (TextView) weakReference2.get();
                    if (textView != null) {
                        C7573i.m23582a((Object) textView, "wpDownloadPercent?.get() ?: return");
                        WeakReference<TextView> weakReference3 = this.f89097c;
                        if (weakReference3 != null) {
                            TextView textView2 = (TextView) weakReference3.get();
                            if (textView2 != null) {
                                C7573i.m23582a((Object) textView2, "wpDownloadSize?.get() ?: return");
                                WeakReference<ImageView> weakReference4 = this.f89098d;
                                if (weakReference4 != null) {
                                    ImageView imageView = (ImageView) weakReference4.get();
                                    if (imageView != null) {
                                        C7573i.m23582a((Object) imageView, "wpDownloadDetail?.get() ?: return");
                                        Activity activity = videoFollowFeedDetailActivity;
                                        textView.setVisibility(0);
                                        textView.setText(activity.getString(R.string.agw));
                                        textView.setTextColor(C0683b.m2912c(activity, R.color.a5h));
                                        textView2.setVisibility(8);
                                        imageView.setVisibility(8);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo51376a(C19400e eVar, int i) {
        if (eVar != null) {
            WeakReference<VideoFollowFeedDetailActivity> weakReference = this.f89095a;
            if (weakReference != null) {
                VideoFollowFeedDetailActivity videoFollowFeedDetailActivity = (VideoFollowFeedDetailActivity) weakReference.get();
                if (videoFollowFeedDetailActivity != null) {
                    C7573i.m23582a((Object) videoFollowFeedDetailActivity, "wpActivity?.get() ?: return");
                    WeakReference<TextView> weakReference2 = this.f89096b;
                    if (weakReference2 != null) {
                        TextView textView = (TextView) weakReference2.get();
                        if (textView != null) {
                            C7573i.m23582a((Object) textView, "wpDownloadPercent?.get() ?: return");
                            WeakReference<TextView> weakReference3 = this.f89097c;
                            if (weakReference3 != null) {
                                TextView textView2 = (TextView) weakReference3.get();
                                if (textView2 != null) {
                                    C7573i.m23582a((Object) textView2, "wpDownloadSize?.get() ?: return");
                                    WeakReference<ImageView> weakReference4 = this.f89098d;
                                    if (weakReference4 != null) {
                                        ImageView imageView = (ImageView) weakReference4.get();
                                        if (imageView != null) {
                                            C7573i.m23582a((Object) imageView, "wpDownloadDetail?.get() ?: return");
                                            Activity activity = videoFollowFeedDetailActivity;
                                            StringBuilder sb = new StringBuilder();
                                            sb.append(activity.getString(R.string.avy));
                                            sb.append(i);
                                            sb.append('%');
                                            String sb2 = sb.toString();
                                            StringBuilder sb3 = new StringBuilder();
                                            sb3.append(C34178a.m110208a(eVar.f52502d));
                                            sb3.append("M/");
                                            sb3.append(C34178a.m110208a(eVar.f52501c));
                                            sb3.append('M');
                                            String sb4 = sb3.toString();
                                            textView.setVisibility(0);
                                            textView.setText(sb2);
                                            Context context = activity;
                                            textView.setTextColor(C0683b.m2912c(context, R.color.a5h));
                                            textView2.setVisibility(0);
                                            textView2.setText(sb4);
                                            textView2.setTextColor(C0683b.m2912c(context, R.color.a5h));
                                            imageView.setVisibility(8);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public C34177k(Aweme aweme, VideoFollowFeedDetailActivity videoFollowFeedDetailActivity, TextView textView, TextView textView2, ImageView imageView) {
        WeakReference<TextView> weakReference;
        WeakReference<TextView> weakReference2;
        C7573i.m23587b(aweme, "aweme");
        this.f89099e = aweme;
        this.f89095a = C34178a.m110209a(videoFollowFeedDetailActivity);
        WeakReference<ImageView> weakReference3 = null;
        if (textView != null) {
            weakReference = C34178a.m110209a(textView);
        } else {
            weakReference = null;
        }
        this.f89096b = weakReference;
        if (textView2 != null) {
            weakReference2 = C34178a.m110209a(textView2);
        } else {
            weakReference2 = null;
        }
        this.f89097c = weakReference2;
        if (imageView != null) {
            weakReference3 = C34178a.m110209a(imageView);
        }
        this.f89098d = weakReference3;
    }
}
