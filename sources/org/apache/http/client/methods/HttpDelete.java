package org.apache.http.client.methods;

import com.p280ss.android.ugc.aweme.policy.Policy;
import java.net.URI;

public class HttpDelete extends HttpRequestBase {
    public HttpDelete() {
    }

    public String getMethod() {
        return Policy.ACTION_DELETE;
    }

    public HttpDelete(String str) {
        setURI(URI.create(str));
    }
}
