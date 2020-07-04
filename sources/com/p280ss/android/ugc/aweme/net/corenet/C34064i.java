package com.p280ss.android.ugc.aweme.net.corenet;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.bytedance.common.utility.C6319n;
import com.bytedance.frameworks.baselib.network.http.exception.ClientProtocolException;
import com.bytedance.frameworks.baselib.network.http.exception.HttpResponseException;
import com.bytedance.frameworks.baselib.network.http.exception.NoHttpResponseException;
import com.bytedance.frameworks.baselib.network.http.util.DownloadFileTooLargeException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.BindException;
import java.net.ConnectException;
import java.net.NoRouteToHostException;
import java.net.PortUnreachableException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.net.ssl.SSLPeerUnverifiedException;
import org.apache.http.conn.ConnectTimeoutException;

/* renamed from: com.ss.android.ugc.aweme.net.corenet.i */
public final class C34064i {
    /* renamed from: a */
    private static boolean m109695a(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isAvailable()) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static int m109693a(Context context, Throwable th) {
        int i;
        if (th instanceof ConnectTimeoutException) {
            i = 13;
        } else if (th instanceof SocketTimeoutException) {
            i = 14;
        } else {
            if (!(th instanceof SocketException)) {
                if (th instanceof SSLPeerUnverifiedException) {
                    i = 21;
                } else if (th instanceof HttpResponseException) {
                    if (((HttpResponseException) th).getStatusCode() == 503) {
                        i = 19;
                    } else {
                        i = 16;
                    }
                } else if (!(th instanceof IOException)) {
                    i = 18;
                }
            }
            i = 15;
        }
        if (context == null) {
            return i;
        }
        if ((i == 15 || i == 14) && !m109695a(context)) {
            return 12;
        }
        return i;
    }

    /* renamed from: a */
    public static int m109694a(Throwable th, String[] strArr) {
        int i = 1;
        if (th == null) {
            return 1;
        }
        if (th instanceof HttpResponseException) {
            i = ((HttpResponseException) th).getStatusCode();
        } else if (th instanceof DownloadFileTooLargeException) {
            i = 20;
        } else {
            if (!(th instanceof ConnectTimeoutException)) {
                if (th instanceof SocketTimeoutException) {
                    if (C6319n.m19593a(th.getMessage()) || !th.getMessage().contains("connect timed out")) {
                        i = 3;
                    }
                } else if (th instanceof BindException) {
                    i = 7;
                } else if (th instanceof ConnectException) {
                    i = 8;
                } else if (th instanceof NoRouteToHostException) {
                    i = 9;
                } else if (th instanceof PortUnreachableException) {
                    i = 10;
                } else if (th instanceof SocketException) {
                    i = 5;
                    String message = th.getMessage();
                    if (message != null && message.indexOf("reset by peer") >= 0) {
                        i = 6;
                    }
                } else if (th instanceof UnknownHostException) {
                    i = 11;
                } else if (th instanceof NoHttpResponseException) {
                    i = 18;
                } else if (th instanceof ClientProtocolException) {
                    i = 19;
                } else if (th instanceof IOException) {
                    i = 4;
                }
            }
            i = 2;
        }
        if (i == 2) {
            try {
                Matcher matcher = Pattern.compile("Connect to +([\\w\\.\\-]+)?/(\\[([a-zA-Z0-9:]+)\\]|(\\d{1,3}(\\.\\d{1,3}){3,3})):(\\d+) +timed out").matcher(th.getMessage());
                if (matcher.matches()) {
                    if (matcher.group(3) != null) {
                        strArr[0] = matcher.group(3);
                    } else if (matcher.group(4) != null) {
                        strArr[0] = matcher.group(4);
                    }
                }
            } catch (Exception unused) {
            }
        } else if (i == 8) {
            Throwable cause = th.getCause();
            if (cause != null && (cause instanceof ConnectException)) {
                Matcher matcher2 = Pattern.compile("failed to connect to +([\\w\\.\\-]+)?/(\\[([a-zA-Z0-9:]+)\\]|(\\d{1,3}(\\.\\d{1,3}){3,3})) \\(port \\d+\\)( +after \\d+ms)?: +\\w+ failed: (E[A-Z]+) .*").matcher(cause.getMessage());
                if (matcher2.matches()) {
                    if (matcher2.group(3) != null) {
                        strArr[0] = matcher2.group(3);
                    } else if (matcher2.group(4) != null) {
                        strArr[0] = matcher2.group(4);
                    }
                    String group = matcher2.group(7);
                    if (group != null) {
                        if ("ECONNRESET".equals(group)) {
                            i = 12;
                        } else if ("ECONNREFUSED".equals(group)) {
                            i = 13;
                        } else if ("EHOSTUNREACH".equals(group)) {
                            i = 14;
                        } else if ("ENETUNREACH".equals(group)) {
                            i = 15;
                        } else if ("EADDRNOTAVAIL".equals(group)) {
                            i = 16;
                        } else if ("EADDRINUSE".equals(group)) {
                            i = 17;
                        }
                    }
                }
            }
        } else if (i == 4) {
            String message2 = th.getMessage();
            if (message2.indexOf(" EIO (I/O error)") > 0) {
                i = 37;
            } else {
                if (!(th instanceof FileNotFoundException) && message2.indexOf(" ENOENT ") <= 0) {
                    if (message2.indexOf("No such file or directory") <= 0) {
                        if (message2.indexOf(" ENOSPC ") <= 0) {
                            if (message2.indexOf("No space left on device") <= 0) {
                                if (message2.indexOf(" EDQUOT ") > 0) {
                                    i = 34;
                                } else if (message2.indexOf(" EROFS ") > 0) {
                                    i = 35;
                                } else if (message2.indexOf(" EACCES ") > 0) {
                                    i = 36;
                                }
                            }
                        }
                        i = 32;
                    }
                }
                i = 33;
            }
        }
        return i;
    }
}
