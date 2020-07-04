package com.facebook.react.modules.location;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import com.facebook.common.p686c.C13286a;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.SystemClock;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.core.DeviceEventManagerModule.RCTDeviceEventEmitter;

@ReactModule(name = "LocationObserver")
public class LocationModule extends ReactContextBaseJavaModule {
    private final LocationListener mLocationListener = new LocationListener() {
        public void onProviderDisabled(String str) {
        }

        public void onProviderEnabled(String str) {
        }

        public void onLocationChanged(Location location) {
            ((RCTDeviceEventEmitter) LocationModule.this.getReactApplicationContext().getJSModule(RCTDeviceEventEmitter.class)).emit("geolocationDidChange", LocationModule.locationToMap(location));
        }

        public void onStatusChanged(String str, int i, Bundle bundle) {
            if (i == 0) {
                LocationModule locationModule = LocationModule.this;
                int i2 = PositionError.POSITION_UNAVAILABLE;
                StringBuilder sb = new StringBuilder("Provider ");
                sb.append(str);
                sb.append(" is out of service.");
                locationModule.emitError(i2, sb.toString());
                return;
            }
            if (i == 1) {
                LocationModule locationModule2 = LocationModule.this;
                int i3 = PositionError.TIMEOUT;
                StringBuilder sb2 = new StringBuilder("Provider ");
                sb2.append(str);
                sb2.append(" is temporarily unavailable.");
                locationModule2.emitError(i3, sb2.toString());
            }
        }
    };
    private String mWatchedProvider;

    static class LocationOptions {
        public final float distanceFilter;
        public final boolean highAccuracy;
        public final double maximumAge;
        public final long timeout;

        public static LocationOptions fromReactMap(ReadableMap readableMap) {
            long j;
            double d;
            boolean z;
            float f;
            if (readableMap.hasKey("timeout")) {
                j = (long) readableMap.getDouble("timeout");
            } else {
                j = Long.MAX_VALUE;
            }
            long j2 = j;
            if (readableMap.hasKey("maximumAge")) {
                d = readableMap.getDouble("maximumAge");
            } else {
                d = Double.POSITIVE_INFINITY;
            }
            double d2 = d;
            if (!readableMap.hasKey("enableHighAccuracy") || !readableMap.getBoolean("enableHighAccuracy")) {
                z = false;
            } else {
                z = true;
            }
            if (readableMap.hasKey("distanceFilter")) {
                f = (float) readableMap.getDouble("distanceFilter");
            } else {
                f = 100.0f;
            }
            LocationOptions locationOptions = new LocationOptions(j2, d2, z, f);
            return locationOptions;
        }

        private LocationOptions(long j, double d, boolean z, float f) {
            this.timeout = j;
            this.maximumAge = d;
            this.highAccuracy = z;
            this.distanceFilter = f;
        }
    }

    static class SingleUpdateRequest {
        public final Callback mError;
        public final Handler mHandler;
        public final LocationListener mLocationListener;
        public final LocationManager mLocationManager;
        public Location mOldLocation;
        private final String mProvider;
        public final Callback mSuccess;
        private final long mTimeout;
        public final Runnable mTimeoutRunnable;
        public boolean mTriggered;

        public void invoke(Location location) {
            this.mOldLocation = location;
            this.mLocationManager.requestLocationUpdates(this.mProvider, 100, 1.0f, this.mLocationListener);
            this.mHandler.postDelayed(this.mTimeoutRunnable, this.mTimeout);
        }

        private boolean isSameProvider(String str, String str2) {
            if (str != null) {
                return str.equals(str2);
            }
            if (str2 == null) {
                return true;
            }
            return false;
        }

        public boolean isBetterLocation(Location location, Location location2) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            boolean z6;
            if (location2 == null) {
                return true;
            }
            long time = location.getTime() - location2.getTime();
            if (time > 120000) {
                z = true;
            } else {
                z = false;
            }
            if (time < -120000) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (time > 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z) {
                return true;
            }
            if (z2) {
                return false;
            }
            int accuracy = (int) (location.getAccuracy() - location2.getAccuracy());
            if (accuracy > 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (accuracy < 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (accuracy > 200) {
                z6 = true;
            } else {
                z6 = false;
            }
            boolean isSameProvider = isSameProvider(location.getProvider(), location2.getProvider());
            if (z5) {
                return true;
            }
            if (z3 && !z4) {
                return true;
            }
            if (!z3 || z6 || !isSameProvider) {
                return false;
            }
            return true;
        }

        private SingleUpdateRequest(LocationManager locationManager, String str, long j, Callback callback, Callback callback2) {
            this.mHandler = new Handler();
            this.mTimeoutRunnable = new Runnable() {
                public void run() {
                    synchronized (SingleUpdateRequest.this) {
                        if (!SingleUpdateRequest.this.mTriggered) {
                            SingleUpdateRequest.this.mError.invoke(PositionError.buildError(PositionError.TIMEOUT, "Location request timed out"));
                            SingleUpdateRequest.this.mLocationManager.removeUpdates(SingleUpdateRequest.this.mLocationListener);
                            C13286a.m38853b("ReactNative", "LocationModule: Location request timed out");
                            SingleUpdateRequest.this.mTriggered = true;
                        }
                    }
                }
            };
            this.mLocationListener = new LocationListener() {
                public void onProviderDisabled(String str) {
                }

                public void onProviderEnabled(String str) {
                }

                public void onStatusChanged(String str, int i, Bundle bundle) {
                }

                public void onLocationChanged(Location location) {
                    synchronized (SingleUpdateRequest.this) {
                        if (!SingleUpdateRequest.this.mTriggered && SingleUpdateRequest.this.isBetterLocation(location, SingleUpdateRequest.this.mOldLocation)) {
                            SingleUpdateRequest.this.mSuccess.invoke(LocationModule.locationToMap(location));
                            SingleUpdateRequest.this.mHandler.removeCallbacks(SingleUpdateRequest.this.mTimeoutRunnable);
                            SingleUpdateRequest.this.mTriggered = true;
                            SingleUpdateRequest.this.mLocationManager.removeUpdates(SingleUpdateRequest.this.mLocationListener);
                        }
                        SingleUpdateRequest.this.mOldLocation = location;
                    }
                }
            };
            this.mLocationManager = locationManager;
            this.mProvider = str;
            this.mTimeout = j;
            this.mSuccess = callback;
            this.mError = callback2;
        }
    }

    public String getName() {
        return "LocationObserver";
    }

    @ReactMethod
    public void stopObserving() {
        ((LocationManager) getReactApplicationContext().getSystemService("location")).removeUpdates(this.mLocationListener);
        this.mWatchedProvider = null;
    }

    private static void throwLocationPermissionMissing(SecurityException securityException) {
        throw new SecurityException("Looks like the app doesn't have the permission to access location.\nAdd the following line to your app's AndroidManifest.xml:\n<uses-permission android:name=\"android.permission.ACCESS_FINE_LOCATION\" />", securityException);
    }

    public LocationModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    public static WritableMap locationToMap(Location location) {
        WritableMap createMap = Arguments.createMap();
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putDouble("latitude", location.getLatitude());
        createMap2.putDouble("longitude", location.getLongitude());
        createMap2.putDouble("altitude", location.getAltitude());
        createMap2.putDouble("accuracy", (double) location.getAccuracy());
        createMap2.putDouble("heading", (double) location.getBearing());
        createMap2.putDouble("speed", (double) location.getSpeed());
        createMap.putMap("coords", createMap2);
        createMap.putDouble("timestamp", (double) location.getTime());
        if (VERSION.SDK_INT >= 18) {
            createMap.putBoolean("mocked", location.isFromMockProvider());
        }
        return createMap;
    }

    @ReactMethod
    public void startObserving(ReadableMap readableMap) {
        if (!"gps".equals(this.mWatchedProvider)) {
            LocationOptions fromReactMap = LocationOptions.fromReactMap(readableMap);
            try {
                LocationManager locationManager = (LocationManager) getReactApplicationContext().getSystemService("location");
                String validProvider = getValidProvider(locationManager, fromReactMap.highAccuracy);
                if (validProvider == null) {
                    emitError(PositionError.POSITION_UNAVAILABLE, "No location provider available.");
                    return;
                }
                if (!validProvider.equals(this.mWatchedProvider)) {
                    locationManager.removeUpdates(this.mLocationListener);
                    locationManager.requestLocationUpdates(validProvider, 1000, fromReactMap.distanceFilter, this.mLocationListener);
                }
                this.mWatchedProvider = validProvider;
            } catch (SecurityException e) {
                throwLocationPermissionMissing(e);
            }
        }
    }

    public void emitError(int i, String str) {
        ((RCTDeviceEventEmitter) getReactApplicationContext().getJSModule(RCTDeviceEventEmitter.class)).emit("geolocationError", PositionError.buildError(i, str));
    }

    private static String getValidProvider(LocationManager locationManager, boolean z) {
        String str;
        String str2;
        if (z) {
            str = "gps";
        } else {
            str = "network";
        }
        if (!locationManager.isProviderEnabled(str)) {
            if (str.equals("gps")) {
                str2 = "network";
            } else {
                str2 = "gps";
            }
            if (!locationManager.isProviderEnabled(str)) {
                return null;
            }
        }
        return str;
    }

    @ReactMethod
    public void getCurrentPosition(ReadableMap readableMap, Callback callback, Callback callback2) {
        LocationOptions fromReactMap = LocationOptions.fromReactMap(readableMap);
        try {
            LocationManager locationManager = (LocationManager) getReactApplicationContext().getSystemService("location");
            String validProvider = getValidProvider(locationManager, fromReactMap.highAccuracy);
            if (validProvider == null) {
                callback2.invoke(PositionError.buildError(PositionError.POSITION_UNAVAILABLE, "No location provider available."));
                return;
            }
            Location lastKnownLocation = locationManager.getLastKnownLocation(validProvider);
            if (lastKnownLocation == null || ((double) (SystemClock.currentTimeMillis() - lastKnownLocation.getTime())) >= fromReactMap.maximumAge) {
                SingleUpdateRequest singleUpdateRequest = new SingleUpdateRequest(locationManager, validProvider, fromReactMap.timeout, callback, callback2);
                singleUpdateRequest.invoke(lastKnownLocation);
                return;
            }
            callback.invoke(locationToMap(lastKnownLocation));
        } catch (SecurityException e) {
            throwLocationPermissionMissing(e);
        }
    }
}
