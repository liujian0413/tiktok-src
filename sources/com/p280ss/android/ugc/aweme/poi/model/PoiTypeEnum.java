package com.p280ss.android.ugc.aweme.poi.model;

/* renamed from: com.ss.android.ugc.aweme.poi.model.PoiTypeEnum */
public enum PoiTypeEnum {
    POI_TYPE_OTHER,
    POI_TYPE_SPORTS,
    POI_TYPE_ENTERTAINMENT,
    POI_TYPE_SHOP,
    POI_TYPE_LIFE,
    POI_TYPE_HOSPITAL,
    POI_TYPE_HOTEL,
    POI_TYPE_SCENERY,
    POI_TYPE_HOUSE,
    POI_TYPE_SCHOOL,
    POI_TYPE_TRAFFIC,
    POI_TYPE_RESTAURANT,
    POI_TYPE_CITY,
    POI_TYPE_CAR;

    public static PoiTypeEnum getPoiType(int i) {
        switch (i) {
            case 2:
                return POI_TYPE_SPORTS;
            case 3:
                return POI_TYPE_ENTERTAINMENT;
            case 4:
                return POI_TYPE_SHOP;
            case 5:
                return POI_TYPE_LIFE;
            case 6:
                return POI_TYPE_HOSPITAL;
            case 7:
                return POI_TYPE_HOTEL;
            case 8:
                return POI_TYPE_SCENERY;
            case 9:
                return POI_TYPE_HOUSE;
            case 10:
                return POI_TYPE_SCHOOL;
            case 11:
                return POI_TYPE_TRAFFIC;
            case 12:
                return POI_TYPE_RESTAURANT;
            case 13:
                return POI_TYPE_CITY;
            case 14:
                return POI_TYPE_CAR;
            default:
                return POI_TYPE_OTHER;
        }
    }
}
