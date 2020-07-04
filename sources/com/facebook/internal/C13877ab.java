package com.facebook.internal;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.AsyncTask;
import android.os.AsyncTask.Status;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.C1642a;
import com.example.p266a.C6490c;
import com.facebook.AccessToken;
import com.facebook.C13499h;
import com.facebook.FacebookDialogException;
import com.facebook.FacebookException;
import com.facebook.FacebookGraphResponseException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest.C13090b;
import com.facebook.GraphResponse;
import com.facebook.share.internal.C14540n;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.facebook.internal.ab */
public class C13877ab extends Dialog {

    /* renamed from: k */
    private static final int f36749k = 2131886774;

    /* renamed from: m */
    private static volatile int f36750m;

    /* renamed from: a */
    public String f36751a;

    /* renamed from: b */
    public String f36752b;

    /* renamed from: c */
    public C13884c f36753c;

    /* renamed from: d */
    public WebView f36754d;

    /* renamed from: e */
    public ProgressDialog f36755e;

    /* renamed from: f */
    public ImageView f36756f;

    /* renamed from: g */
    public FrameLayout f36757g;

    /* renamed from: h */
    public boolean f36758h;

    /* renamed from: i */
    public boolean f36759i;

    /* renamed from: j */
    public boolean f36760j;

    /* renamed from: l */
    private C13885d f36761l;

    /* renamed from: n */
    private LayoutParams f36762n;

    /* renamed from: com.facebook.internal.ab$a */
    public static class C13882a {

        /* renamed from: a */
        public Context f36767a;

        /* renamed from: b */
        public String f36768b;

        /* renamed from: c */
        public int f36769c;

        /* renamed from: d */
        public C13884c f36770d;

        /* renamed from: e */
        public Bundle f36771e;

        /* renamed from: f */
        private String f36772f;

        /* renamed from: g */
        private AccessToken f36773g;

        /* renamed from: a */
        public C13877ab mo33533a() {
            if (this.f36773g != null) {
                this.f36771e.putString("app_id", this.f36773g.f34630h);
                this.f36771e.putString("access_token", this.f36773g.f34627e);
            } else {
                this.f36771e.putString("app_id", this.f36768b);
            }
            return C13877ab.m40990a(this.f36767a, this.f36772f, this.f36771e, this.f36769c, this.f36770d);
        }

        /* renamed from: a */
        public final C13882a mo33532a(C13884c cVar) {
            this.f36770d = cVar;
            return this;
        }

        /* renamed from: a */
        private void m41001a(Context context, String str, Bundle bundle) {
            this.f36767a = context;
            this.f36772f = str;
            if (bundle != null) {
                this.f36771e = bundle;
            } else {
                this.f36771e = new Bundle();
            }
        }

        public C13882a(Context context, String str, Bundle bundle) {
            this.f36773g = AccessToken.m38225a();
            if (!AccessToken.m38232b()) {
                String a = C13967z.m41219a(context);
                if (a != null) {
                    this.f36768b = a;
                } else {
                    throw new FacebookException("Attempted to create a builder without a valid access token or a valid default Application ID.");
                }
            }
            m41001a(context, str, bundle);
        }

        public C13882a(Context context, String str, String str2, Bundle bundle) {
            if (str == null) {
                str = C13967z.m41219a(context);
            }
            C13876aa.m40979a(str, "applicationId");
            this.f36768b = str;
            m41001a(context, str2, bundle);
        }
    }

    /* renamed from: com.facebook.internal.ab$b */
    class C13883b extends WebViewClient {
        public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            return C6490c.m20174a(webView, renderProcessGoneDetail);
        }

        private C13883b() {
        }

        public final void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (!C13877ab.this.f36759i) {
                C13877ab.this.f36755e.dismiss();
            }
            C13877ab.this.f36757g.setBackgroundColor(0);
            C13877ab.this.f36754d.setVisibility(0);
            C13877ab.this.f36756f.setVisibility(0);
            C13877ab.this.f36760j = true;
        }

        /* JADX WARNING: Removed duplicated region for block: B:30:0x0082  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x0088  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean shouldOverrideUrlLoading(android.webkit.WebView r6, java.lang.String r7) {
            /*
                r5 = this;
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                java.lang.String r0 = "Redirect URL: "
                r6.<init>(r0)
                r6.append(r7)
                com.facebook.internal.ab r6 = com.facebook.internal.C13877ab.this
                java.lang.String r6 = r6.f36752b
                boolean r6 = r7.startsWith(r6)
                r0 = 1
                if (r6 == 0) goto L_0x0098
                com.facebook.internal.ab r6 = com.facebook.internal.C13877ab.this
                android.os.Bundle r6 = r6.mo33514a(r7)
                java.lang.String r7 = "error"
                java.lang.String r7 = r6.getString(r7)
                if (r7 != 0) goto L_0x0029
                java.lang.String r7 = "error_type"
                java.lang.String r7 = r6.getString(r7)
            L_0x0029:
                java.lang.String r1 = "error_msg"
                java.lang.String r1 = r6.getString(r1)
                if (r1 != 0) goto L_0x0037
                java.lang.String r1 = "error_message"
                java.lang.String r1 = r6.getString(r1)
            L_0x0037:
                if (r1 != 0) goto L_0x003f
                java.lang.String r1 = "error_description"
                java.lang.String r1 = r6.getString(r1)
            L_0x003f:
                java.lang.String r2 = "error_code"
                java.lang.String r2 = r6.getString(r2)
                boolean r3 = com.facebook.internal.C13967z.m41249a(r2)
                r4 = -1
                if (r3 != 0) goto L_0x0051
                int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ NumberFormatException -> 0x0051 }
                goto L_0x0052
            L_0x0051:
                r2 = -1
            L_0x0052:
                boolean r3 = com.facebook.internal.C13967z.m41249a(r7)
                if (r3 == 0) goto L_0x0066
                boolean r3 = com.facebook.internal.C13967z.m41249a(r1)
                if (r3 == 0) goto L_0x0066
                if (r2 != r4) goto L_0x0066
                com.facebook.internal.ab r7 = com.facebook.internal.C13877ab.this
                r7.mo33517a(r6)
                goto L_0x0097
            L_0x0066:
                if (r7 == 0) goto L_0x007e
                java.lang.String r6 = "access_denied"
                boolean r6 = r7.equals(r6)
                if (r6 != 0) goto L_0x0078
                java.lang.String r6 = "OAuthAccessDeniedException"
                boolean r6 = r7.equals(r6)
                if (r6 == 0) goto L_0x007e
            L_0x0078:
                com.facebook.internal.ab r6 = com.facebook.internal.C13877ab.this
                r6.cancel()
                goto L_0x0097
            L_0x007e:
                r6 = 4201(0x1069, float:5.887E-42)
                if (r2 != r6) goto L_0x0088
                com.facebook.internal.ab r6 = com.facebook.internal.C13877ab.this
                r6.cancel()
                goto L_0x0097
            L_0x0088:
                com.facebook.FacebookRequestError r6 = new com.facebook.FacebookRequestError
                r6.<init>(r2, r7, r1)
                com.facebook.internal.ab r7 = com.facebook.internal.C13877ab.this
                com.facebook.FacebookServiceException r2 = new com.facebook.FacebookServiceException
                r2.<init>(r6, r1)
                r7.mo33518a(r2)
            L_0x0097:
                return r0
            L_0x0098:
                java.lang.String r6 = "fbconnect://cancel"
                boolean r6 = r7.startsWith(r6)
                if (r6 == 0) goto L_0x00a6
                com.facebook.internal.ab r6 = com.facebook.internal.C13877ab.this
                r6.cancel()
                return r0
            L_0x00a6:
                java.lang.String r6 = "touch"
                boolean r6 = r7.contains(r6)
                r1 = 0
                if (r6 == 0) goto L_0x00b0
                return r1
            L_0x00b0:
                com.facebook.internal.ab r6 = com.facebook.internal.C13877ab.this     // Catch:{ ActivityNotFoundException -> 0x00c5 }
                android.content.Context r6 = r6.getContext()     // Catch:{ ActivityNotFoundException -> 0x00c5 }
                android.content.Intent r2 = new android.content.Intent     // Catch:{ ActivityNotFoundException -> 0x00c5 }
                java.lang.String r3 = "android.intent.action.VIEW"
                android.net.Uri r7 = android.net.Uri.parse(r7)     // Catch:{ ActivityNotFoundException -> 0x00c5 }
                r2.<init>(r3, r7)     // Catch:{ ActivityNotFoundException -> 0x00c5 }
                r6.startActivity(r2)     // Catch:{ ActivityNotFoundException -> 0x00c5 }
                return r0
            L_0x00c5:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.C13877ab.C13883b.shouldOverrideUrlLoading(android.webkit.WebView, java.lang.String):boolean");
        }

        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            new StringBuilder("Webview loading URL: ").append(str);
            super.onPageStarted(webView, str, bitmap);
            if (!C13877ab.this.f36759i) {
                C13877ab.this.f36755e.show();
            }
        }

        public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            sslErrorHandler.cancel();
            C13877ab.this.mo33518a((Throwable) new FacebookDialogException(null, -11, null));
        }

        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            C13877ab.this.mo33518a((Throwable) new FacebookDialogException(str, i, str2));
        }
    }

    /* renamed from: com.facebook.internal.ab$c */
    public interface C13884c {
        /* renamed from: a */
        void mo33486a(Bundle bundle, FacebookException facebookException);
    }

    /* renamed from: com.facebook.internal.ab$d */
    class C13885d extends AsyncTask<Void, Void, String[]> {

        /* renamed from: a */
        public Exception[] f36775a;

        /* renamed from: c */
        private String f36777c;

        /* renamed from: d */
        private Bundle f36778d;

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onPostExecute(String[] strArr) {
            Exception[] excArr;
            C13877ab.this.f36755e.dismiss();
            for (Exception exc : this.f36775a) {
                if (exc != null) {
                    C13877ab.this.mo33518a((Throwable) exc);
                    return;
                }
            }
            if (strArr == null) {
                C13877ab.this.mo33518a((Throwable) new FacebookException("Failed to stage photos for web dialog"));
                return;
            }
            List asList = Arrays.asList(strArr);
            if (asList.contains(null)) {
                C13877ab.this.mo33518a((Throwable) new FacebookException("Failed to stage photos for web dialog"));
                return;
            }
            C13967z.m41246a(this.f36778d, "media", (Object) new JSONArray(asList));
            String a = C13966y.m41208a();
            StringBuilder sb = new StringBuilder();
            sb.append(C13499h.m39722h());
            sb.append("/dialog/");
            sb.append(this.f36777c);
            C13877ab.this.f36751a = C13967z.m41214a(a, sb.toString(), this.f36778d).toString();
            C13877ab.this.mo33516a((C13877ab.this.f36756f.getDrawable().getIntrinsicWidth() / 2) + 1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public String[] doInBackground(Void... voidArr) {
            String[] stringArray = this.f36778d.getStringArray("media");
            final String[] strArr = new String[stringArray.length];
            this.f36775a = new Exception[stringArray.length];
            final CountDownLatch countDownLatch = new CountDownLatch(stringArray.length);
            ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
            AccessToken a = AccessToken.m38225a();
            final int i = 0;
            while (i < stringArray.length) {
                try {
                    if (isCancelled()) {
                        Iterator it = concurrentLinkedQueue.iterator();
                        while (it.hasNext()) {
                            ((AsyncTask) it.next()).cancel(true);
                        }
                        return null;
                    }
                    Uri parse = Uri.parse(stringArray[i]);
                    if (C13967z.m41259b(parse)) {
                        strArr[i] = parse.toString();
                        countDownLatch.countDown();
                    } else {
                        concurrentLinkedQueue.add(C14540n.m42019a(a, parse, (C13090b) new C13090b() {
                            /* renamed from: a */
                            public final void mo31792a(GraphResponse graphResponse) {
                                try {
                                    FacebookRequestError facebookRequestError = graphResponse.f34704d;
                                    if (facebookRequestError != null) {
                                        String a = facebookRequestError.mo31780a();
                                        if (a == null) {
                                            a = "Error staging photo.";
                                        }
                                        throw new FacebookGraphResponseException(graphResponse, a);
                                    }
                                    JSONObject jSONObject = graphResponse.f34702b;
                                    if (jSONObject != null) {
                                        String optString = jSONObject.optString("uri");
                                        if (optString != null) {
                                            strArr[i] = optString;
                                            countDownLatch.countDown();
                                            return;
                                        }
                                        throw new FacebookException("Error staging photo.");
                                    }
                                    throw new FacebookException("Error staging photo.");
                                } catch (Exception e) {
                                    C13885d.this.f36775a[i] = e;
                                }
                            }
                        }).mo31790b());
                    }
                    i++;
                } catch (Exception unused) {
                    Iterator it2 = concurrentLinkedQueue.iterator();
                    while (it2.hasNext()) {
                        ((AsyncTask) it2.next()).cancel(true);
                    }
                    return null;
                }
            }
            countDownLatch.await();
            return strArr;
        }

        C13885d(String str, Bundle bundle) {
            this.f36777c = str;
            this.f36778d = bundle;
        }
    }

    /* renamed from: b */
    private static int m40993b() {
        C13876aa.m40975a();
        return f36750m;
    }

    public void onDetachedFromWindow() {
        this.f36759i = true;
        super.onDetachedFromWindow();
    }

    public void cancel() {
        if (this.f36753c != null && !this.f36758h) {
            mo33518a((Throwable) new FacebookOperationCanceledException());
        }
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        if (this.f36761l != null) {
            this.f36761l.cancel(true);
            this.f36755e.dismiss();
        }
        super.onStop();
    }

    /* renamed from: c */
    private void m40995c() {
        this.f36756f = new ImageView(getContext());
        this.f36756f.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                C13877ab.this.cancel();
            }
        });
        this.f36756f.setImageDrawable(getContext().getResources().getDrawable(R.drawable.x4));
        this.f36756f.setVisibility(4);
    }

    public void dismiss() {
        if (this.f36754d != null) {
            this.f36754d.stopLoading();
        }
        if (!this.f36759i && this.f36755e != null && this.f36755e.isShowing()) {
            this.f36755e.dismiss();
        }
        C13887ac.m41009a(this);
    }

    public void onAttachedToWindow() {
        this.f36759i = false;
        if (C13967z.m41267d(getContext()) && this.f36762n != null && this.f36762n.token == null) {
            this.f36762n.token = getOwnerActivity().getWindow().getAttributes().token;
            new StringBuilder("Set token on onAttachedToWindow(): ").append(this.f36762n.token);
        }
        super.onAttachedToWindow();
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        if (this.f36761l == null || this.f36761l.getStatus() != Status.PENDING) {
            mo33515a();
            return;
        }
        this.f36761l.execute(new Void[0]);
        this.f36755e.show();
    }

    /* renamed from: a */
    public final void mo33515a() {
        int i;
        int i2;
        Display defaultDisplay = ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        if (displayMetrics.widthPixels < displayMetrics.heightPixels) {
            i = displayMetrics.widthPixels;
        } else {
            i = displayMetrics.heightPixels;
        }
        if (displayMetrics.widthPixels < displayMetrics.heightPixels) {
            i2 = displayMetrics.heightPixels;
        } else {
            i2 = displayMetrics.widthPixels;
        }
        getWindow().setLayout(Math.min(m40989a(i, displayMetrics.density, 480, 800), displayMetrics.widthPixels), Math.min(m40989a(i2, displayMetrics.density, 800, 1280), displayMetrics.heightPixels));
    }

    /* renamed from: b */
    private static void m40994b(int i) {
        if (i == 0) {
            i = f36749k;
        }
        f36750m = i;
    }

    public void onWindowAttributesChanged(LayoutParams layoutParams) {
        if (layoutParams.token == null) {
            this.f36762n = layoutParams;
        }
        super.onWindowAttributesChanged(layoutParams);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Bundle mo33514a(String str) {
        Uri parse = Uri.parse(str);
        Bundle d = C13967z.m41265d(parse.getQuery());
        d.putAll(C13967z.m41265d(parse.getFragment()));
        return d;
    }

    /* renamed from: a */
    protected static void m40992a(Context context) {
        if (context != null) {
            try {
                ApplicationInfo a = C13887ac.m41008a(context.getPackageManager(), context.getPackageName(), PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
                if (!(a == null || a.metaData == null || f36750m != 0)) {
                    m40994b(a.metaData.getInt("com.facebook.sdk.WebDialogTheme"));
                }
            } catch (NameNotFoundException unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f36755e = new ProgressDialog(getContext());
        this.f36755e.requestWindowFeature(1);
        this.f36755e.setMessage(getContext().getString(R.string.a6g));
        this.f36755e.setCanceledOnTouchOutside(false);
        this.f36755e.setOnCancelListener(new OnCancelListener() {
            public final void onCancel(DialogInterface dialogInterface) {
                C13877ab.this.cancel();
            }
        });
        requestWindowFeature(1);
        this.f36757g = new FrameLayout(getContext());
        mo33515a();
        getWindow().setGravity(17);
        getWindow().setSoftInputMode(16);
        m40995c();
        if (this.f36751a != null) {
            mo33516a((this.f36756f.getDrawable().getIntrinsicWidth() / 2) + 1);
        }
        this.f36757g.addView(this.f36756f, new ViewGroup.LayoutParams(-2, -2));
        setContentView(this.f36757g);
    }

    /* renamed from: a */
    public final void mo33516a(int i) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f36754d = new WebView(getContext()) {
            public final void onWindowFocusChanged(boolean z) {
                try {
                    super.onWindowFocusChanged(z);
                } catch (NullPointerException unused) {
                }
            }
        };
        this.f36754d.setVerticalScrollBarEnabled(false);
        this.f36754d.setHorizontalScrollBarEnabled(false);
        this.f36754d.setWebViewClient(C6490c.m20171a((WebViewClient) new C13883b()));
        this.f36754d.getSettings().setJavaScriptEnabled(true);
        C13887ac.m41010a(this.f36754d, this.f36751a);
        this.f36754d.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f36754d.setVisibility(4);
        this.f36754d.getSettings().setSavePassword(false);
        this.f36754d.getSettings().setSaveFormData(false);
        this.f36754d.setFocusable(true);
        this.f36754d.setFocusableInTouchMode(true);
        this.f36754d.setOnTouchListener(new OnTouchListener() {
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (!view.hasFocus()) {
                    view.requestFocus();
                }
                return false;
            }
        });
        linearLayout.setPadding(i, i, i, i);
        linearLayout.addView(this.f36754d);
        linearLayout.setBackgroundColor(-872415232);
        this.f36757g.addView(linearLayout);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo33517a(Bundle bundle) {
        if (this.f36753c != null && !this.f36758h) {
            this.f36758h = true;
            this.f36753c.mo33486a(bundle, null);
            dismiss();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo33518a(Throwable th) {
        FacebookException facebookException;
        if (this.f36753c != null && !this.f36758h) {
            this.f36758h = true;
            if (th instanceof FacebookException) {
                facebookException = (FacebookException) th;
            } else {
                facebookException = new FacebookException(th);
            }
            this.f36753c.mo33486a(null, facebookException);
            dismiss();
        }
    }

    protected C13877ab(Context context, String str) {
        this(context, str, m40993b());
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            cancel();
        }
        return super.onKeyDown(i, keyEvent);
    }

    private C13877ab(Context context, String str, int i) {
        if (i == 0) {
            i = m40993b();
        }
        super(context, i);
        this.f36752b = "fbconnect://success";
        this.f36758h = false;
        this.f36759i = false;
        this.f36760j = false;
        this.f36751a = str;
    }

    /* renamed from: a */
    private static int m40989a(int i, float f, int i2, int i3) {
        int i4 = (int) (((float) i) / f);
        double d = 0.5d;
        if (i4 <= i2) {
            d = 1.0d;
        } else if (i4 < i3) {
            double d2 = (double) (i3 - i4);
            double d3 = (double) (i3 - i2);
            Double.isNaN(d2);
            Double.isNaN(d3);
            d = 0.5d + ((d2 / d3) * 0.5d);
        }
        double d4 = (double) i;
        Double.isNaN(d4);
        return (int) (d4 * d);
    }

    /* renamed from: a */
    public static C13877ab m40990a(Context context, String str, Bundle bundle, int i, C13884c cVar) {
        m40992a(context);
        C13877ab abVar = new C13877ab(context, str, bundle, i, cVar);
        return abVar;
    }

    private C13877ab(Context context, String str, Bundle bundle, int i, C13884c cVar) {
        String str2;
        if (i == 0) {
            i = m40993b();
        }
        super(context, i);
        this.f36752b = "fbconnect://success";
        this.f36758h = false;
        this.f36759i = false;
        this.f36760j = false;
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (C13967z.m41272e(context)) {
            str2 = "fbconnect://chrome_os_success";
        } else {
            str2 = "fbconnect://success";
        }
        this.f36752b = str2;
        bundle.putString("redirect_uri", this.f36752b);
        bundle.putString("display", "touch");
        bundle.putString("client_id", C13499h.m39725k());
        bundle.putString("sdk", C1642a.m8035a(Locale.ROOT, "android-%s", new Object[]{C13499h.m39723i()}));
        this.f36753c = cVar;
        if (!str.equals("share") || !bundle.containsKey("media")) {
            String a = C13966y.m41208a();
            StringBuilder sb = new StringBuilder();
            sb.append(C13499h.m39722h());
            sb.append("/dialog/");
            sb.append(str);
            this.f36751a = C13967z.m41214a(a, sb.toString(), bundle).toString();
            return;
        }
        this.f36761l = new C13885d(str, bundle);
    }
}
