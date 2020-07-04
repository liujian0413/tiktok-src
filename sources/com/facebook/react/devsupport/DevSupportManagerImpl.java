package com.facebook.react.devsupport;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager.NameNotFoundException;
import android.hardware.SensorManager;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import com.C1642a;
import com.facebook.common.p686c.C13286a;
import com.facebook.infer.p728a.C13854a;
import com.facebook.react.bridge.DefaultNativeModuleCallExceptionHandler;
import com.facebook.react.bridge.JavaJSExecutor;
import com.facebook.react.bridge.JavaJSExecutor.Factory;
import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.DebugServerException;
import com.facebook.react.common.ShakeDetector;
import com.facebook.react.common.ShakeDetector.ShakeListener;
import com.facebook.react.common.futures.SimpleSettableFuture;
import com.facebook.react.devsupport.BundleDownloader.BundleInfo;
import com.facebook.react.devsupport.DevInternalSettings.Listener;
import com.facebook.react.devsupport.DevServerHelper.OnServerContentChangeListener;
import com.facebook.react.devsupport.DevServerHelper.PackagerCommandListener;
import com.facebook.react.devsupport.InspectorPackagerConnection.BundleStatus;
import com.facebook.react.devsupport.InspectorPackagerConnection.BundleStatusProvider;
import com.facebook.react.devsupport.JSCHeapCapture.CaptureCallback;
import com.facebook.react.devsupport.JSCHeapCapture.CaptureException;
import com.facebook.react.devsupport.JSCSamplingProfiler.ProfilerException;
import com.facebook.react.devsupport.JSDevSupport.DevSupportCallback;
import com.facebook.react.devsupport.WebsocketJavaScriptExecutor.JSExecutorConnectCallback;
import com.facebook.react.devsupport.interfaces.DevBundleDownloadListener;
import com.facebook.react.devsupport.interfaces.DevOptionHandler;
import com.facebook.react.devsupport.interfaces.DevSupportManager;
import com.facebook.react.devsupport.interfaces.ErrorCustomizer;
import com.facebook.react.devsupport.interfaces.PackagerStatusCallback;
import com.facebook.react.devsupport.interfaces.StackFrame;
import com.facebook.react.modules.debug.interfaces.DeveloperSettings;
import com.facebook.react.packagerconnection.RequestHandler;
import com.facebook.react.packagerconnection.Responder;
import com.facebook.react.uimanager.IllegalViewOperationException;
import com.p280ss.android.ugc.aweme.utils.C43112ex;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request.Builder;
import okhttp3.RequestBody;

public class DevSupportManagerImpl implements Listener, PackagerCommandListener, DevSupportManager {
    public final Context mApplicationContext;
    public DevBundleDownloadListener mBundleDownloadListener;
    public BundleStatus mBundleStatus;
    public ReactContext mCurrentContext;
    private final LinkedHashMap<String, DevOptionHandler> mCustomDevOptions;
    private DebugOverlayController mDebugOverlayController;
    private final DefaultNativeModuleCallExceptionHandler mDefaultNativeModuleCallExceptionHandler;
    public final DevLoadingViewController mDevLoadingViewController;
    public boolean mDevLoadingViewVisible;
    public AlertDialog mDevOptionsDialog;
    public final DevServerHelper mDevServerHelper;
    public DevInternalSettings mDevSettings;
    private List<ErrorCustomizer> mErrorCustomizers;
    private final List<ExceptionLogger> mExceptionLoggers;
    private boolean mIsDevSupportEnabled;
    private boolean mIsReceiverRegistered;
    private boolean mIsShakeDetectorStarted;
    private final String mJSAppBundleName;
    private final File mJSBundleTempFile;
    public int mLastErrorCookie;
    private StackFrame[] mLastErrorStack;
    private String mLastErrorTitle;
    private ErrorType mLastErrorType;
    public final ReactInstanceManagerDevHelper mReactInstanceManagerHelper;
    public RedBoxDialog mRedBoxDialog;
    public RedBoxHandler mRedBoxHandler;
    private final BroadcastReceiver mReloadAppBroadcastReceiver;
    private final ShakeDetector mShakeDetector;

    enum ErrorType {
        JS,
        NATIVE
    }

    interface ExceptionLogger {
        void log(Exception exc);
    }

    class JSExceptionLogger implements ExceptionLogger {
        private JSExceptionLogger() {
        }

        public void log(Exception exc) {
            StringBuilder sb = new StringBuilder(exc.getMessage());
            for (Throwable cause = exc.getCause(); cause != null; cause = cause.getCause()) {
                sb.append("\n\n");
                sb.append(cause.getMessage());
            }
            if (exc instanceof JSException) {
                C13286a.m38861c("ReactNative", "Exception in native call from JS", (Throwable) exc);
                String stack = ((JSException) exc).getStack();
                sb.append("\n\n");
                sb.append(stack);
                DevSupportManagerImpl.this.showNewError(sb.toString(), new StackFrame[0], -1, ErrorType.JS);
                return;
            }
            DevSupportManagerImpl.this.showNewJavaError(sb.toString(), exc);
        }
    }

    static class JscProfileTask extends AsyncTask<String, Void, Void> {
        private static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");
        private final String mSourceUrl;

        private JscProfileTask(String str) {
            this.mSourceUrl = str;
        }

        /* access modifiers changed from: protected */
        public Void doInBackground(String... strArr) {
            try {
                String uri = Uri.parse(this.mSourceUrl).buildUpon().path("/jsc-profile").query(null).build().toString();
                OkHttpClient okHttpClient = new OkHttpClient();
                for (String create : strArr) {
                    okHttpClient.newCall(new Builder().url(uri).post(RequestBody.create(JSON, create)).build()).execute();
                }
            } catch (IOException e) {
                C13286a.m38861c("ReactNative", "Failed not talk to server", (Throwable) e);
            }
            return null;
        }
    }

    class StackOverflowExceptionLogger implements ExceptionLogger {
        private StackOverflowExceptionLogger() {
        }

        public void log(Exception exc) {
            if ((exc instanceof IllegalViewOperationException) && (exc.getCause() instanceof StackOverflowError)) {
                View view = ((IllegalViewOperationException) exc).getView();
                if (view != null) {
                    logDeepestJSHierarchy(view);
                }
            }
        }

        private void logDeepestJSHierarchy(View view) {
            if (DevSupportManagerImpl.this.mCurrentContext != null && view != null) {
                Pair deepestNativeView = getDeepestNativeView(view);
                Integer valueOf = Integer.valueOf(((View) deepestNativeView.first).getId());
                final int intValue = ((Integer) deepestNativeView.second).intValue();
                ((JSDevSupport) DevSupportManagerImpl.this.mCurrentContext.getNativeModule(JSDevSupport.class)).getJSHierarchy(valueOf.toString(), new DevSupportCallback() {
                    public void onFailure(Exception exc) {
                        StringBuilder sb = new StringBuilder("Error retrieving JS Hierarchy (depth of native hierarchy = ");
                        sb.append(intValue);
                        sb.append(").");
                        C13286a.m38856b("ReactNative", (Throwable) exc, sb.toString(), new Object[0]);
                    }

                    public void onSuccess(String str) {
                        StringBuilder sb = new StringBuilder("StackOverflowError when rendering JS Hierarchy (depth of native hierarchy = ");
                        sb.append(intValue);
                        sb.append("): \n");
                        sb.append(str);
                        C13286a.m38863d("ReactNative", sb.toString());
                    }
                });
            }
        }

        private Pair<View, Integer> getDeepestNativeView(View view) {
            LinkedList linkedList = new LinkedList();
            Pair<View, Integer> pair = new Pair<>(view, Integer.valueOf(1));
            linkedList.add(pair);
            while (!linkedList.isEmpty()) {
                Pair<View, Integer> pair2 = (Pair) linkedList.poll();
                if (((Integer) pair2.second).intValue() > ((Integer) pair.second).intValue()) {
                    pair = pair2;
                }
                if (pair2.first instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) pair2.first;
                    Integer valueOf = Integer.valueOf(((Integer) pair2.second).intValue() + 1);
                    for (int i = 0; i < viewGroup.getChildCount(); i++) {
                        linkedList.add(new Pair(viewGroup.getChildAt(i), valueOf));
                    }
                }
            }
            return pair;
        }
    }

    class _lancet {
        private _lancet() {
        }

        static void com_ss_android_ugc_aweme_lancet_DesignBugFixLancet_show(Toast toast) {
            if (VERSION.SDK_INT == 25) {
                C43112ex.m136740a(toast);
            }
            toast.show();
        }
    }

    public DeveloperSettings getDevSettings() {
        return this.mDevSettings;
    }

    public boolean getDevSupportEnabled() {
        return this.mIsDevSupportEnabled;
    }

    public StackFrame[] getLastErrorStack() {
        return this.mLastErrorStack;
    }

    public String getLastErrorTitle() {
        return this.mLastErrorTitle;
    }

    public void onInternalSettingsChanged() {
        reloadSettings();
    }

    public void onPackagerConnected() {
    }

    public void onPackagerDisconnected() {
    }

    public String getDownloadedJSBundleFile() {
        return this.mJSBundleTempFile.getAbsolutePath();
    }

    public void stopInspector() {
        this.mDevServerHelper.closeInspectorConnection();
    }

    private void hideDevOptionsDialog() {
        if (this.mDevOptionsDialog != null) {
            this.mDevOptionsDialog.dismiss();
            this.mDevOptionsDialog = null;
        }
    }

    private void reloadJSInProxyMode() {
        this.mDevServerHelper.launchJSDevtools();
        this.mReactInstanceManagerHelper.onReloadWithJSDebugger(new Factory() {
            public JavaJSExecutor create() throws Exception {
                WebsocketJavaScriptExecutor websocketJavaScriptExecutor = new WebsocketJavaScriptExecutor();
                SimpleSettableFuture simpleSettableFuture = new SimpleSettableFuture();
                websocketJavaScriptExecutor.connect(DevSupportManagerImpl.this.mDevServerHelper.getWebsocketProxyURL(), DevSupportManagerImpl.this.getExecutorConnectCallback(simpleSettableFuture));
                try {
                    simpleSettableFuture.get(90, TimeUnit.SECONDS);
                    return websocketJavaScriptExecutor;
                } catch (ExecutionException e) {
                    throw ((Exception) e.getCause());
                } catch (InterruptedException | TimeoutException e2) {
                    throw new RuntimeException(e2);
                }
            }
        });
    }

    public void deleteJSBundleFile() {
        if (this.mJSBundleTempFile.exists()) {
            this.mJSBundleTempFile.delete();
        }
    }

    public String getJSBundleURLForRemoteDebugging() {
        return this.mDevServerHelper.getJSBundleURLForRemoteDebugging((String) C13854a.m40916b(this.mJSAppBundleName));
    }

    public void hideRedboxDialog() {
        if (this.mRedBoxDialog != null) {
            this.mRedBoxDialog.dismiss();
            this.mRedBoxDialog = null;
        }
    }

    public void onPackagerDevMenuCommand() {
        UiThreadUtil.runOnUiThread(new Runnable() {
            public void run() {
                DevSupportManagerImpl.this.showDevOptionsDialog();
            }
        });
    }

    public void onPackagerReloadCommand() {
        this.mDevServerHelper.disableDebugger();
        UiThreadUtil.runOnUiThread(new Runnable() {
            public void run() {
                DevSupportManagerImpl.this.handleReloadJS();
            }
        });
    }

    public void startInspector() {
        if (this.mIsDevSupportEnabled) {
            this.mDevServerHelper.openInspectorConnection();
        }
    }

    public String getSourceMapUrl() {
        if (this.mJSAppBundleName == null) {
            return "";
        }
        return this.mDevServerHelper.getSourceMapUrl((String) C13854a.m40916b(this.mJSAppBundleName));
    }

    public String getSourceUrl() {
        if (this.mJSAppBundleName == null) {
            return "";
        }
        return this.mDevServerHelper.getSourceUrl((String) C13854a.m40916b(this.mJSAppBundleName));
    }

    public void reloadSettings() {
        if (UiThreadUtil.isOnUiThread()) {
            reload();
        } else {
            UiThreadUtil.runOnUiThread(new Runnable() {
                public void run() {
                    DevSupportManagerImpl.this.reload();
                }
            });
        }
    }

    public void handleReloadJS() {
        UiThreadUtil.assertOnUiThread();
        ReactMarker.logMarker(ReactMarkerConstants.RELOAD, this.mDevSettings.getPackagerConnectionSettings().getDebugServerHost());
        hideRedboxDialog();
        if (this.mDevSettings.isRemoteJSDebugEnabled()) {
            this.mDevLoadingViewController.showForRemoteJSEnabled();
            this.mDevLoadingViewVisible = true;
            reloadJSInProxyMode();
            return;
        }
        reloadJSFromServer(this.mDevServerHelper.getDevServerBundleURL((String) C13854a.m40916b(this.mJSAppBundleName)));
    }

    public void handlePokeSamplingProfiler() {
        String str;
        try {
            for (String str2 : JSCSamplingProfiler.poke(60000)) {
                ReactContext reactContext = this.mCurrentContext;
                if (str2 == null) {
                    str = "Started JSC Sampling Profiler";
                } else {
                    str = "Stopped JSC Sampling Profiler";
                }
                _lancet.com_ss_android_ugc_aweme_lancet_DesignBugFixLancet_show(Toast.makeText(reactContext, str, 1));
                new JscProfileTask(getSourceUrl()).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[]{str2});
            }
        } catch (ProfilerException e) {
            showNewJavaError(e.getMessage(), e);
        }
    }

    public boolean hasUpToDateJSBundleInCache() {
        if (this.mIsDevSupportEnabled && this.mJSBundleTempFile.exists()) {
            try {
                String packageName = this.mApplicationContext.getPackageName();
                if (this.mJSBundleTempFile.lastModified() > this.mApplicationContext.getPackageManager().getPackageInfo(packageName, 0).lastUpdateTime) {
                    File file = new File(C1642a.m8035a(Locale.US, "/data/local/tmp/exopackage/%s//secondary-dex", new Object[]{packageName}));
                    if (!file.exists() || this.mJSBundleTempFile.lastModified() > file.lastModified()) {
                        return true;
                    }
                    return false;
                }
            } catch (NameNotFoundException unused) {
                C13286a.m38863d("ReactNative", "DevSupport is unable to get current app info");
            }
        }
        return false;
    }

    public void reload() {
        UiThreadUtil.assertOnUiThread();
        if (this.mIsDevSupportEnabled) {
            if (this.mDebugOverlayController != null) {
                this.mDebugOverlayController.setFpsDebugViewVisible(this.mDevSettings.isFpsDebugEnabled());
            }
            if (!this.mIsShakeDetectorStarted) {
                this.mShakeDetector.start((SensorManager) this.mApplicationContext.getSystemService("sensor"));
                this.mIsShakeDetectorStarted = true;
            }
            if (!this.mIsReceiverRegistered) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction(getReloadAppAction(this.mApplicationContext));
                this.mApplicationContext.registerReceiver(this.mReloadAppBroadcastReceiver, intentFilter);
                this.mIsReceiverRegistered = true;
            }
            if (this.mDevLoadingViewVisible) {
                this.mDevLoadingViewController.show();
            }
            this.mDevServerHelper.openPackagerConnection(getClass().getSimpleName(), this);
            if (this.mDevSettings.isReloadOnJSChangeEnabled()) {
                this.mDevServerHelper.startPollingOnChangeEndpoint(new OnServerContentChangeListener() {
                    public void onServerContentChanged() {
                        DevSupportManagerImpl.this.handleReloadJS();
                    }
                });
            } else {
                this.mDevServerHelper.stopPollingOnChangeEndpoint();
            }
        } else {
            if (this.mDebugOverlayController != null) {
                this.mDebugOverlayController.setFpsDebugViewVisible(false);
            }
            if (this.mIsShakeDetectorStarted) {
                this.mShakeDetector.stop();
                this.mIsShakeDetectorStarted = false;
            }
            if (this.mIsReceiverRegistered) {
                this.mApplicationContext.unregisterReceiver(this.mReloadAppBroadcastReceiver);
                this.mIsReceiverRegistered = false;
            }
            hideRedboxDialog();
            hideDevOptionsDialog();
            this.mDevLoadingViewController.hide();
            this.mDevServerHelper.closePackagerConnection();
            this.mDevServerHelper.stopPollingOnChangeEndpoint();
        }
    }

    public void showDevOptionsDialog() {
        String str;
        String str2;
        String str3;
        String str4;
        if (this.mDevOptionsDialog == null && this.mIsDevSupportEnabled && !ActivityManager.isUserAMonkey()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put(this.mApplicationContext.getString(R.string.xo), new DevOptionHandler() {
                public void onOptionSelected() {
                    DevSupportManagerImpl.this.handleReloadJS();
                }
            });
            if (this.mDevSettings.isNuclideJSDebugEnabled()) {
                StringBuilder sb = new StringBuilder();
                sb.append(this.mApplicationContext.getString(R.string.x9));
                sb.append(" 💯");
                linkedHashMap.put(sb.toString(), new DevOptionHandler() {
                    public void onOptionSelected() {
                        DevSupportManagerImpl.this.mDevServerHelper.attachDebugger(DevSupportManagerImpl.this.mApplicationContext, "ReactNative");
                    }
                });
            }
            if (this.mDevSettings.isRemoteJSDebugEnabled()) {
                str = this.mApplicationContext.getString(R.string.xa);
            } else {
                str = this.mApplicationContext.getString(R.string.x8);
            }
            if (this.mDevSettings.isNuclideJSDebugEnabled()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" 🙅");
                str = sb2.toString();
            }
            linkedHashMap.put(str, new DevOptionHandler() {
                public void onOptionSelected() {
                    DevSupportManagerImpl.this.mDevSettings.setRemoteJSDebugEnabled(!DevSupportManagerImpl.this.mDevSettings.isRemoteJSDebugEnabled());
                    DevSupportManagerImpl.this.handleReloadJS();
                }
            });
            if (this.mDevSettings.isReloadOnJSChangeEnabled()) {
                str2 = this.mApplicationContext.getString(R.string.xi);
            } else {
                str2 = this.mApplicationContext.getString(R.string.xh);
            }
            linkedHashMap.put(str2, new DevOptionHandler() {
                public void onOptionSelected() {
                    DevSupportManagerImpl.this.mDevSettings.setReloadOnJSChangeEnabled(!DevSupportManagerImpl.this.mDevSettings.isReloadOnJSChangeEnabled());
                }
            });
            if (this.mDevSettings.isHotModuleReplacementEnabled()) {
                str3 = this.mApplicationContext.getString(R.string.xf);
            } else {
                str3 = this.mApplicationContext.getString(R.string.xe);
            }
            linkedHashMap.put(str3, new DevOptionHandler() {
                public void onOptionSelected() {
                    DevSupportManagerImpl.this.mDevSettings.setHotModuleReplacementEnabled(!DevSupportManagerImpl.this.mDevSettings.isHotModuleReplacementEnabled());
                    DevSupportManagerImpl.this.handleReloadJS();
                }
            });
            linkedHashMap.put(this.mApplicationContext.getString(R.string.xc), new DevOptionHandler() {
                public void onOptionSelected() {
                    DevSupportManagerImpl.this.mDevSettings.setElementInspectorEnabled(!DevSupportManagerImpl.this.mDevSettings.isElementInspectorEnabled());
                    DevSupportManagerImpl.this.mReactInstanceManagerHelper.toggleElementInspector();
                }
            });
            if (this.mDevSettings.isFpsDebugEnabled()) {
                str4 = this.mApplicationContext.getString(R.string.xl);
            } else {
                str4 = this.mApplicationContext.getString(R.string.xk);
            }
            linkedHashMap.put(str4, new DevOptionHandler() {
                public void onOptionSelected() {
                    if (!DevSupportManagerImpl.this.mDevSettings.isFpsDebugEnabled()) {
                        Activity currentActivity = DevSupportManagerImpl.this.mReactInstanceManagerHelper.getCurrentActivity();
                        if (currentActivity == null) {
                            C13286a.m38863d("ReactNative", "Unable to get reference to react activity");
                        } else {
                            DebugOverlayController.requestPermission(currentActivity);
                        }
                    }
                    DevSupportManagerImpl.this.mDevSettings.setFpsDebugEnabled(!DevSupportManagerImpl.this.mDevSettings.isFpsDebugEnabled());
                }
            });
            linkedHashMap.put(this.mApplicationContext.getString(R.string.xm), new DevOptionHandler() {
                public void onOptionSelected() {
                    DevSupportManagerImpl.this.handlePokeSamplingProfiler();
                }
            });
            linkedHashMap.put(this.mApplicationContext.getString(R.string.xs), new DevOptionHandler() {
                public void onOptionSelected() {
                    Intent intent = new Intent(DevSupportManagerImpl.this.mApplicationContext, DevSettingsActivity.class);
                    intent.setFlags(268435456);
                    DevSupportManagerImpl.this.mApplicationContext.startActivity(intent);
                }
            });
            if (this.mCustomDevOptions.size() > 0) {
                linkedHashMap.putAll(this.mCustomDevOptions);
            }
            final DevOptionHandler[] devOptionHandlerArr = (DevOptionHandler[]) linkedHashMap.values().toArray(new DevOptionHandler[0]);
            Activity currentActivity = this.mReactInstanceManagerHelper.getCurrentActivity();
            if (currentActivity == null || currentActivity.isFinishing()) {
                C13286a.m38863d("ReactNative", "Unable to launch dev options menu because react activity isn't available");
                return;
            }
            this.mDevOptionsDialog = new AlertDialog.Builder(currentActivity).setItems((CharSequence[]) linkedHashMap.keySet().toArray(new String[0]), new OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    devOptionHandlerArr[i].onOptionSelected();
                    DevSupportManagerImpl.this.mDevOptionsDialog = null;
                }
            }).setOnCancelListener(new OnCancelListener() {
                public void onCancel(DialogInterface dialogInterface) {
                    DevSupportManagerImpl.this.mDevOptionsDialog = null;
                }
            }).create();
            this.mDevOptionsDialog.show();
        }
    }

    public void onNewReactContextCreated(ReactContext reactContext) {
        resetCurrentContext(reactContext);
    }

    public JSExecutorConnectCallback getExecutorConnectCallback(final SimpleSettableFuture<Boolean> simpleSettableFuture) {
        return new JSExecutorConnectCallback() {
            public void onSuccess() {
                simpleSettableFuture.set(Boolean.valueOf(true));
                DevSupportManagerImpl.this.mDevLoadingViewController.hide();
                DevSupportManagerImpl.this.mDevLoadingViewVisible = false;
            }

            public void onFailure(Throwable th) {
                DevSupportManagerImpl.this.mDevLoadingViewController.hide();
                DevSupportManagerImpl.this.mDevLoadingViewVisible = false;
                C13286a.m38861c("ReactNative", "Unable to connect to remote debugger", th);
                simpleSettableFuture.setException(new IOException(DevSupportManagerImpl.this.mApplicationContext.getString(R.string.xp), th));
            }
        };
    }

    public void isPackagerRunning(PackagerStatusCallback packagerStatusCallback) {
        this.mDevServerHelper.isPackagerRunning(packagerStatusCallback);
    }

    public void setDevSupportEnabled(boolean z) {
        this.mIsDevSupportEnabled = z;
        reloadSettings();
    }

    public void onCaptureHeapCommand(final Responder responder) {
        UiThreadUtil.runOnUiThread(new Runnable() {
            public void run() {
                DevSupportManagerImpl.this.handleCaptureHeap(responder);
            }
        });
    }

    public void onPokeSamplingProfilerCommand(final Responder responder) {
        UiThreadUtil.runOnUiThread(new Runnable() {
            public void run() {
                if (DevSupportManagerImpl.this.mCurrentContext == null) {
                    responder.error("JSCContext is missing, unable to profile");
                    return;
                }
                try {
                    JavaScriptContextHolder javaScriptContextHolder = DevSupportManagerImpl.this.mCurrentContext.getJavaScriptContextHolder();
                    synchronized (javaScriptContextHolder) {
                        ((RequestHandler) Class.forName("com.facebook.react.packagerconnection.SamplingProfilerPackagerMethod").getConstructor(new Class[]{Long.TYPE}).newInstance(new Object[]{Long.valueOf(javaScriptContextHolder.get())})).onRequest(null, responder);
                    }
                } catch (Exception unused) {
                }
            }
        });
    }

    public void onReactInstanceDestroyed(ReactContext reactContext) {
        if (reactContext == this.mCurrentContext) {
            resetCurrentContext(null);
        }
    }

    public static String getReloadAppAction(Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append(context.getPackageName());
        sb.append(".RELOAD_APP_ACTION");
        return sb.toString();
    }

    public Pair<String, StackFrame[]> processErrorCustomizers(Pair<String, StackFrame[]> pair) {
        if (this.mErrorCustomizers == null) {
            return pair;
        }
        for (ErrorCustomizer customizeErrorInfo : this.mErrorCustomizers) {
            Pair<String, StackFrame[]> customizeErrorInfo2 = customizeErrorInfo.customizeErrorInfo(pair);
            if (customizeErrorInfo2 != null) {
                pair = customizeErrorInfo2;
            }
        }
        return pair;
    }

    public void registerErrorCustomizer(ErrorCustomizer errorCustomizer) {
        if (this.mErrorCustomizers == null) {
            this.mErrorCustomizers = new ArrayList();
        }
        this.mErrorCustomizers.add(errorCustomizer);
    }

    public void reloadJSFromServer(String str) {
        ReactMarker.logMarker(ReactMarkerConstants.DOWNLOAD_START);
        this.mDevLoadingViewController.showForUrl(str);
        this.mDevLoadingViewVisible = true;
        final BundleInfo bundleInfo = new BundleInfo();
        this.mDevServerHelper.downloadBundleFromURL(new DevBundleDownloadListener() {
            public void onSuccess() {
                DevSupportManagerImpl.this.mDevLoadingViewController.hide();
                DevSupportManagerImpl.this.mDevLoadingViewVisible = false;
                synchronized (DevSupportManagerImpl.this) {
                    DevSupportManagerImpl.this.mBundleStatus.isLastDownloadSucess = Boolean.valueOf(true);
                    DevSupportManagerImpl.this.mBundleStatus.updateTimestamp = System.currentTimeMillis();
                }
                if (DevSupportManagerImpl.this.mBundleDownloadListener != null) {
                    DevSupportManagerImpl.this.mBundleDownloadListener.onSuccess();
                }
                UiThreadUtil.runOnUiThread(new Runnable() {
                    public void run() {
                        ReactMarker.logMarker(ReactMarkerConstants.DOWNLOAD_END, bundleInfo.toJSONString());
                        DevSupportManagerImpl.this.mReactInstanceManagerHelper.onJSBundleLoadedFromServer();
                    }
                });
            }

            public void onFailure(final Exception exc) {
                DevSupportManagerImpl.this.mDevLoadingViewController.hide();
                DevSupportManagerImpl.this.mDevLoadingViewVisible = false;
                synchronized (DevSupportManagerImpl.this) {
                    DevSupportManagerImpl.this.mBundleStatus.isLastDownloadSucess = Boolean.valueOf(false);
                }
                if (DevSupportManagerImpl.this.mBundleDownloadListener != null) {
                    DevSupportManagerImpl.this.mBundleDownloadListener.onFailure(exc);
                }
                C13286a.m38861c("ReactNative", "Unable to download JS bundle", (Throwable) exc);
                UiThreadUtil.runOnUiThread(new Runnable() {
                    public void run() {
                        if (exc instanceof DebugServerException) {
                            DevSupportManagerImpl.this.showNewJavaError(((DebugServerException) exc).getMessage(), exc);
                            return;
                        }
                        DevSupportManagerImpl.this.showNewJavaError(DevSupportManagerImpl.this.mApplicationContext.getString(R.string.xg), exc);
                    }
                });
            }

            public void onProgress(String str, Integer num, Integer num2) {
                DevSupportManagerImpl.this.mDevLoadingViewController.updateProgress(str, num, num2);
                if (DevSupportManagerImpl.this.mBundleDownloadListener != null) {
                    DevSupportManagerImpl.this.mBundleDownloadListener.onProgress(str, num, num2);
                }
            }
        }, this.mJSBundleTempFile, str, bundleInfo);
    }

    public void handleCaptureHeap(final Responder responder) {
        if (this.mCurrentContext != null) {
            ((JSCHeapCapture) this.mCurrentContext.getNativeModule(JSCHeapCapture.class)).captureHeap(this.mApplicationContext.getCacheDir().getPath(), new CaptureCallback() {
                public void onFailure(CaptureException captureException) {
                    responder.error(captureException.toString());
                }

                public void onSuccess(File file) {
                    responder.respond(file.toString());
                }
            });
        }
    }

    public void handleException(Exception exc) {
        if (this.mIsDevSupportEnabled) {
            for (ExceptionLogger log : this.mExceptionLoggers) {
                log.log(exc);
            }
            return;
        }
        this.mDefaultNativeModuleCallExceptionHandler.handleException(exc);
    }

    public boolean hasBundleInAssets(String str) {
        try {
            String[] list = this.mApplicationContext.getAssets().list("");
            for (String equals : list) {
                if (equals.equals(str)) {
                    return true;
                }
            }
        } catch (IOException unused) {
            C13286a.m38863d("ReactNative", "Error while loading assets list");
        }
        return false;
    }

    private void resetCurrentContext(ReactContext reactContext) {
        if (this.mCurrentContext != reactContext) {
            this.mCurrentContext = reactContext;
            if (this.mDebugOverlayController != null) {
                this.mDebugOverlayController.setFpsDebugViewVisible(false);
            }
            if (reactContext != null) {
                this.mDebugOverlayController = new DebugOverlayController(reactContext);
            }
            if (this.mDevSettings.isHotModuleReplacementEnabled() && this.mCurrentContext != null) {
                try {
                    URL url = new URL(getSourceUrl());
                    ((HMRClient) this.mCurrentContext.getJSModule(HMRClient.class)).enable("android", url.getPath().substring(1), url.getHost(), url.getPort());
                } catch (MalformedURLException e) {
                    showNewJavaError(e.getMessage(), e);
                }
            }
            reloadSettings();
        }
    }

    public void addCustomDevOption(String str, DevOptionHandler devOptionHandler) {
        this.mCustomDevOptions.put(str, devOptionHandler);
    }

    public File downloadBundleResourceFromUrlSync(String str, File file) {
        return this.mDevServerHelper.downloadBundleResourceFromUrlSync(str, file);
    }

    public void showNewJavaError(String str, Throwable th) {
        C13286a.m38861c("ReactNative", "Exception in native call", th);
        showNewError(str, StackTraceHelper.convertJavaStackTrace(th), -1, ErrorType.NATIVE);
    }

    public void showNewJSError(String str, ReadableArray readableArray, int i) {
        showNewError(str, StackTraceHelper.convertJsStackTrace(readableArray), i, ErrorType.JS);
    }

    public void updateJSError(final String str, final ReadableArray readableArray, final int i) {
        UiThreadUtil.runOnUiThread(new Runnable() {
            public void run() {
                if (DevSupportManagerImpl.this.mRedBoxDialog != null && DevSupportManagerImpl.this.mRedBoxDialog.isShowing() && i == DevSupportManagerImpl.this.mLastErrorCookie) {
                    StackFrame[] convertJsStackTrace = StackTraceHelper.convertJsStackTrace(readableArray);
                    Pair processErrorCustomizers = DevSupportManagerImpl.this.processErrorCustomizers(Pair.create(str, convertJsStackTrace));
                    DevSupportManagerImpl.this.mRedBoxDialog.setExceptionDetails((String) processErrorCustomizers.first, (StackFrame[]) processErrorCustomizers.second);
                    DevSupportManagerImpl.this.updateLastErrorInfo(str, convertJsStackTrace, i, ErrorType.JS);
                    if (DevSupportManagerImpl.this.mRedBoxHandler != null) {
                        DevSupportManagerImpl.this.mRedBoxHandler.handleRedbox(str, convertJsStackTrace, com.facebook.react.devsupport.RedBoxHandler.ErrorType.JS);
                        DevSupportManagerImpl.this.mRedBoxDialog.resetReporting();
                    }
                    DevSupportManagerImpl.this.mRedBoxDialog.show();
                }
            }
        });
    }

    public void showNewError(String str, StackFrame[] stackFrameArr, int i, ErrorType errorType) {
        final String str2 = str;
        final StackFrame[] stackFrameArr2 = stackFrameArr;
        final int i2 = i;
        final ErrorType errorType2 = errorType;
        C143005 r0 = new Runnable() {
            public void run() {
                if (DevSupportManagerImpl.this.mRedBoxDialog == null) {
                    Activity currentActivity = DevSupportManagerImpl.this.mReactInstanceManagerHelper.getCurrentActivity();
                    if (currentActivity == null || currentActivity.isFinishing()) {
                        StringBuilder sb = new StringBuilder("Unable to launch redbox because react activity is not available, here is the error that redbox would've displayed: ");
                        sb.append(str2);
                        C13286a.m38863d("ReactNative", sb.toString());
                        return;
                    }
                    DevSupportManagerImpl.this.mRedBoxDialog = new RedBoxDialog(currentActivity, DevSupportManagerImpl.this, DevSupportManagerImpl.this.mRedBoxHandler);
                }
                if (!DevSupportManagerImpl.this.mRedBoxDialog.isShowing()) {
                    Pair processErrorCustomizers = DevSupportManagerImpl.this.processErrorCustomizers(Pair.create(str2, stackFrameArr2));
                    DevSupportManagerImpl.this.mRedBoxDialog.setExceptionDetails((String) processErrorCustomizers.first, (StackFrame[]) processErrorCustomizers.second);
                    DevSupportManagerImpl.this.updateLastErrorInfo(str2, stackFrameArr2, i2, errorType2);
                    if (DevSupportManagerImpl.this.mRedBoxHandler != null && errorType2 == ErrorType.NATIVE) {
                        DevSupportManagerImpl.this.mRedBoxHandler.handleRedbox(str2, stackFrameArr2, com.facebook.react.devsupport.RedBoxHandler.ErrorType.NATIVE);
                    }
                    DevSupportManagerImpl.this.mRedBoxDialog.resetReporting();
                    DevSupportManagerImpl.this.mRedBoxDialog.show();
                }
            }
        };
        UiThreadUtil.runOnUiThread(r0);
    }

    public void updateLastErrorInfo(String str, StackFrame[] stackFrameArr, int i, ErrorType errorType) {
        this.mLastErrorTitle = str;
        this.mLastErrorStack = stackFrameArr;
        this.mLastErrorCookie = i;
        this.mLastErrorType = errorType;
    }

    public DevSupportManagerImpl(Context context, ReactInstanceManagerDevHelper reactInstanceManagerDevHelper, String str, boolean z, int i) {
        this(context, reactInstanceManagerDevHelper, str, z, null, null, i);
    }

    public DevSupportManagerImpl(Context context, ReactInstanceManagerDevHelper reactInstanceManagerDevHelper, String str, boolean z, RedBoxHandler redBoxHandler, DevBundleDownloadListener devBundleDownloadListener, int i) {
        this.mExceptionLoggers = new ArrayList();
        this.mCustomDevOptions = new LinkedHashMap<>();
        this.mDevLoadingViewVisible = false;
        this.mIsReceiverRegistered = false;
        this.mIsShakeDetectorStarted = false;
        this.mIsDevSupportEnabled = false;
        this.mLastErrorCookie = 0;
        this.mReactInstanceManagerHelper = reactInstanceManagerDevHelper;
        this.mApplicationContext = context;
        this.mJSAppBundleName = str;
        this.mDevSettings = new DevInternalSettings(context, this);
        this.mBundleStatus = new BundleStatus();
        this.mDevServerHelper = new DevServerHelper(this.mDevSettings, this.mApplicationContext.getPackageName(), new BundleStatusProvider() {
            public BundleStatus getBundleStatus() {
                return DevSupportManagerImpl.this.mBundleStatus;
            }
        });
        this.mBundleDownloadListener = devBundleDownloadListener;
        this.mShakeDetector = new ShakeDetector(new ShakeListener() {
            public void onShake() {
                DevSupportManagerImpl.this.showDevOptionsDialog();
            }
        }, i);
        this.mReloadAppBroadcastReceiver = new BroadcastReceiver() {
            public void onReceive(Context context, Intent intent) {
                if (DevSupportManagerImpl.getReloadAppAction(context).equals(intent.getAction())) {
                    if (intent.getBooleanExtra("jsproxy", false)) {
                        DevSupportManagerImpl.this.mDevSettings.setRemoteJSDebugEnabled(true);
                        DevSupportManagerImpl.this.mDevServerHelper.launchJSDevtools();
                    } else {
                        DevSupportManagerImpl.this.mDevSettings.setRemoteJSDebugEnabled(false);
                    }
                    DevSupportManagerImpl.this.handleReloadJS();
                }
            }
        };
        this.mJSBundleTempFile = new File(context.getFilesDir(), "ReactNativeDevBundle.js");
        this.mDefaultNativeModuleCallExceptionHandler = new DefaultNativeModuleCallExceptionHandler();
        setDevSupportEnabled(z);
        this.mRedBoxHandler = redBoxHandler;
        this.mDevLoadingViewController = new DevLoadingViewController(context, reactInstanceManagerDevHelper);
        this.mExceptionLoggers.add(new JSExceptionLogger());
        this.mExceptionLoggers.add(new StackOverflowExceptionLogger());
    }
}
