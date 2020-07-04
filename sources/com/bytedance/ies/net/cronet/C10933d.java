package com.bytedance.ies.net.cronet;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import com.bytedance.common.utility.C6319n;
import com.bytedance.frameworks.baselib.network.http.exception.ClientProtocolException;
import com.bytedance.frameworks.baselib.network.http.exception.HttpResponseException;
import com.bytedance.frameworks.baselib.network.http.exception.NoHttpResponseException;
import com.bytedance.frameworks.baselib.network.http.util.DownloadFileTooLargeException;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.toutiao.proxyserver.RequestException;
import com.ttnet.org.chromium.net.impl.NetworkExceptionImpl;
import com.ttnet.org.chromium.net.impl.QuicExceptionImpl;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.BindException;
import java.net.ConnectException;
import java.net.NoRouteToHostException;
import java.net.PortUnreachableException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLProtocolException;
import org.apache.http.conn.ConnectTimeoutException;

/* renamed from: com.bytedance.ies.net.cronet.d */
public final class C10933d {

    /* renamed from: a */
    private static Map<String, Map<String, Integer>> f29601a = new HashMap();

    /* renamed from: a */
    private static void m32090a() {
        if (f29601a.isEmpty()) {
            HashMap hashMap = new HashMap();
            hashMap.put(" Bad Request", Integer.valueOf(BaseNotice.HASHTAG));
            hashMap.put(" Connection timed out", Integer.valueOf(102));
            hashMap.put(" Forbidden", Integer.valueOf(103));
            hashMap.put(" Gateway Time-out", Integer.valueOf(104));
            hashMap.put(" Internal Server Error", Integer.valueOf(105));
            hashMap.put(" Not Found", Integer.valueOf(106));
            hashMap.put(" Request Time-out", Integer.valueOf(107));
            hashMap.put(" Request-URI Too Large", Integer.valueOf(108));
            f29601a.put(HttpResponseException.class.getSimpleName(), hashMap);
            HashMap hashMap2 = new HashMap();
            hashMap2.put("Content-Type: text/html", Integer.valueOf(201));
            hashMap2.put("http/1.0 do not support range request", Integer.valueOf(202));
            hashMap2.put("response code: 403 Error extra", Integer.valueOf(203));
            hashMap2.put("response code: 504 Error extra", Integer.valueOf(204));
            f29601a.put(RequestException.class.getSimpleName(), hashMap2);
            HashMap hashMap3 = new HashMap();
            hashMap3.put("ERR_ABORTED", Integer.valueOf(301));
            hashMap3.put("ERR_ADDRESS_UNREACHABLE", Integer.valueOf(302));
            hashMap3.put("ERR_CERT_AUTHORITY_INVALID", Integer.valueOf(303));
            hashMap3.put("ERR_CERT_COMMON_NAME_INVALID", Integer.valueOf(304));
            hashMap3.put("ERR_CERT_DATE_INVALID", Integer.valueOf(305));
            hashMap3.put("ERR_CONNECTION_ABORTED", Integer.valueOf(306));
            hashMap3.put("ERR_CONNECTION_CLOSED", Integer.valueOf(307));
            hashMap3.put("ERR_CONNECTION_REFUSED", Integer.valueOf(308));
            hashMap3.put("ERR_CONNECTION_RESET", Integer.valueOf(309));
            hashMap3.put("ERR_CONNECTION_TIMED_OUT", Integer.valueOf(310));
            hashMap3.put("ERR_EMPTY_RESPONSE", Integer.valueOf(311));
            hashMap3.put("ERR_HTTP2_PING_FAILED", Integer.valueOf(312));
            hashMap3.put("ERR_INCOMPLETE_CHUNKED_ENCODING", Integer.valueOf(313));
            hashMap3.put("ERR_INTERNET_DISCONNECTED", Integer.valueOf(314));
            hashMap3.put("ERR_NAME_NOT_RESOLVED", Integer.valueOf(315));
            hashMap3.put("ERR_NETWORK_ACCESS_DENIED", Integer.valueOf(316));
            hashMap3.put("ERR_PROXY_CONNECTION_FAILED", Integer.valueOf(317));
            hashMap3.put("ERR_SOCKET_NOT_CONNECTED", Integer.valueOf(318));
            hashMap3.put("ERR_SSL_BAD_RECORD_MAC_ALERT", Integer.valueOf(319));
            hashMap3.put("ERR_SSL_PROTOCOL_ERROR", Integer.valueOf(320));
            hashMap3.put("ERR_TIMED_OUT", Integer.valueOf(321));
            hashMap3.put("ERR_TTNET_APP_TIMED_OUT", Integer.valueOf(322));
            hashMap3.put("ERR_TTNET_APP_UPLOAD_EXCEPTION", Integer.valueOf(323));
            hashMap3.put("ERR_TUNNEL_CONNECTION_FAILED", Integer.valueOf(324));
            f29601a.put(NetworkExceptionImpl.class.getSimpleName(), hashMap3);
            HashMap hashMap4 = new HashMap();
            hashMap4.put("ERR_NETWORK_CHANGED", Integer.valueOf(401));
            f29601a.put(QuicExceptionImpl.class.getSimpleName(), hashMap4);
            HashMap hashMap5 = new HashMap();
            hashMap5.put(" Unexpected end of ZLIB input stream", Integer.valueOf(501));
            f29601a.put(EOFException.class.getSimpleName(), hashMap5);
            HashMap hashMap6 = new HashMap();
            hashMap6.put(" unexpected end of stream on Connection", Integer.valueOf(601));
            hashMap6.put(" Unexpected request usage", Integer.valueOf(602));
            f29601a.put(IOException.class.getSimpleName(), hashMap6);
            HashMap hashMap7 = new HashMap();
            hashMap7.put("Cronet internal request fail", Integer.valueOf(701));
            f29601a.put(Exception.class.getSimpleName(), hashMap7);
            HashMap hashMap8 = new HashMap();
            hashMap8.put(" Content received is less than Content-Length", Integer.valueOf(801));
            hashMap8.put(" expected bytes but received", Integer.valueOf(802));
            hashMap8.put(" unexpected end of stream", Integer.valueOf(803));
            f29601a.put(ProtocolException.class.getSimpleName(), hashMap8);
            HashMap hashMap9 = new HashMap();
            hashMap9.put(" Connection closed by peer", Integer.valueOf(901));
            hashMap9.put(" Read error", Integer.valueOf(902));
            hashMap9.put(" SSL handshake aborted", Integer.valueOf(903));
            f29601a.put(SSLException.class.getSimpleName(), hashMap9);
            HashMap hashMap10 = new HashMap();
            hashMap10.put(" Connection closed by peer", Integer.valueOf(1001));
            hashMap10.put(" Handshake failed", Integer.valueOf(1002));
            hashMap10.put(" SSL handshake aborted", Integer.valueOf(1003));
            f29601a.put(SSLHandshakeException.class.getSimpleName(), hashMap10);
            HashMap hashMap11 = new HashMap();
            hashMap11.put(" Hostname not verified", Integer.valueOf(1101));
            f29601a.put(SSLPeerUnverifiedException.class.getSimpleName(), hashMap11);
            HashMap hashMap12 = new HashMap();
            hashMap12.put(" Read error", Integer.valueOf(1201));
            f29601a.put(SSLProtocolException.class.getSimpleName(), hashMap12);
        }
    }

    /* renamed from: a */
    public static boolean m32091a(Context context) {
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
    public static int m32088a(Throwable th) {
        int i = -1;
        if (th == null) {
            return -1;
        }
        m32090a();
        String message = th.getMessage();
        if (TextUtils.isEmpty(message)) {
            return -1;
        }
        int indexOf = message.indexOf(44);
        if (indexOf > 0) {
            message = message.substring(0, indexOf);
        }
        Map map = (Map) f29601a.get(th.getClass().getSimpleName());
        if (map != null && !map.isEmpty()) {
            Iterator it = map.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Entry entry = (Entry) it.next();
                if (message.contains((CharSequence) entry.getKey())) {
                    Integer num = (Integer) entry.getValue();
                    if (num != null) {
                        i = num.intValue();
                    }
                }
            }
        }
        if (i < 0) {
            if (th instanceof HttpResponseException) {
                i = 199;
            } else if (th instanceof EOFException) {
                i = 599;
            } else if (th instanceof IOException) {
                i = 699;
            }
        }
        return i;
    }

    /* renamed from: a */
    public static int m32089a(Throwable th, String[] strArr) {
        int i = 1;
        if (th == null) {
            return 1;
        }
        if (strArr == null) {
            strArr = new String[1];
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
