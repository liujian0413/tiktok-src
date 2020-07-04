package org.apache.http.conn.routing;

public class BasicRouteDirector implements HttpRouteDirector {
    /* access modifiers changed from: protected */
    public int firstStep(RouteInfo routeInfo) {
        if (routeInfo.getHopCount() > 1) {
            return 2;
        }
        return 1;
    }

    /* access modifiers changed from: protected */
    public int directStep(RouteInfo routeInfo, RouteInfo routeInfo2) {
        if (routeInfo2.getHopCount() > 1 || !routeInfo.getTargetHost().equals(routeInfo2.getTargetHost()) || routeInfo.isSecure() != routeInfo2.isSecure()) {
            return -1;
        }
        if (routeInfo.getLocalAddress() == null || routeInfo.getLocalAddress().equals(routeInfo2.getLocalAddress())) {
            return 0;
        }
        return -1;
    }

    public int nextStep(RouteInfo routeInfo, RouteInfo routeInfo2) {
        if (routeInfo == null) {
            throw new IllegalArgumentException("Planned route may not be null.");
        } else if (routeInfo2 == null || routeInfo2.getHopCount() <= 0) {
            return firstStep(routeInfo);
        } else {
            if (routeInfo.getHopCount() > 1) {
                return proxiedStep(routeInfo, routeInfo2);
            }
            return directStep(routeInfo, routeInfo2);
        }
    }

    /* access modifiers changed from: protected */
    public int proxiedStep(RouteInfo routeInfo, RouteInfo routeInfo2) {
        if (routeInfo2.getHopCount() <= 1 || !routeInfo.getTargetHost().equals(routeInfo2.getTargetHost())) {
            return -1;
        }
        int hopCount = routeInfo.getHopCount();
        int hopCount2 = routeInfo2.getHopCount();
        if (hopCount < hopCount2) {
            return -1;
        }
        for (int i = 0; i < hopCount2 - 1; i++) {
            if (!routeInfo.getHopTarget(i).equals(routeInfo2.getHopTarget(i))) {
                return -1;
            }
        }
        if (hopCount > hopCount2) {
            return 4;
        }
        if ((routeInfo2.isTunnelled() && !routeInfo.isTunnelled()) || (routeInfo2.isLayered() && !routeInfo.isLayered())) {
            return -1;
        }
        if (routeInfo.isTunnelled() && !routeInfo2.isTunnelled()) {
            return 3;
        }
        if (routeInfo.isLayered() && !routeInfo2.isLayered()) {
            return 5;
        }
        if (routeInfo.isSecure() != routeInfo2.isSecure()) {
            return -1;
        }
        return 0;
    }
}
