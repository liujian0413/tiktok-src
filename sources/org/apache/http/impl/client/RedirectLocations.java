package org.apache.http.impl.client;

import java.net.URI;
import java.util.HashSet;
import java.util.Set;

public class RedirectLocations {
    private final Set<URI> uris = new HashSet();

    public void add(URI uri) {
        this.uris.add(uri);
    }

    public boolean contains(URI uri) {
        return this.uris.contains(uri);
    }
}
