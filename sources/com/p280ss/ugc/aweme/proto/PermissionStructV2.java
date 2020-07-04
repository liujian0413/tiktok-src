package com.p280ss.ugc.aweme.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

/* renamed from: com.ss.ugc.aweme.proto.PermissionStructV2 */
public final class PermissionStructV2 extends Message<PermissionStructV2, Builder> {
    public static final ProtoAdapter<PermissionStructV2> ADAPTER = new ProtoAdapter_PermissionStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public Integer follow_toast;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public Integer original_list;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 4)
    public Integer share_toast;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 3)
    public Integer shop_toast;

    /* renamed from: com.ss.ugc.aweme.proto.PermissionStructV2$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<PermissionStructV2, Builder> {
        public Integer follow_toast;
        public Integer original_list;
        public Integer share_toast;
        public Integer shop_toast;

        public final PermissionStructV2 build() {
            PermissionStructV2 permissionStructV2 = new PermissionStructV2(this.follow_toast, this.original_list, this.shop_toast, this.share_toast, super.buildUnknownFields());
            return permissionStructV2;
        }

        public final Builder follow_toast(Integer num) {
            this.follow_toast = num;
            return this;
        }

        public final Builder original_list(Integer num) {
            this.original_list = num;
            return this;
        }

        public final Builder share_toast(Integer num) {
            this.share_toast = num;
            return this;
        }

        public final Builder shop_toast(Integer num) {
            this.shop_toast = num;
            return this;
        }
    }

    /* renamed from: com.ss.ugc.aweme.proto.PermissionStructV2$ProtoAdapter_PermissionStructV2 */
    static final class ProtoAdapter_PermissionStructV2 extends ProtoAdapter<PermissionStructV2> {
        public ProtoAdapter_PermissionStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, PermissionStructV2.class);
        }

        public final int encodedSize(PermissionStructV2 permissionStructV2) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, permissionStructV2.follow_toast) + ProtoAdapter.INT32.encodedSizeWithTag(2, permissionStructV2.original_list) + ProtoAdapter.INT32.encodedSizeWithTag(3, permissionStructV2.shop_toast) + ProtoAdapter.INT32.encodedSizeWithTag(4, permissionStructV2.share_toast) + permissionStructV2.unknownFields().size();
        }

        public final PermissionStructV2 decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.follow_toast((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 2:
                            builder.original_list((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 3:
                            builder.shop_toast((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 4:
                            builder.share_toast((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, PermissionStructV2 permissionStructV2) throws IOException {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, permissionStructV2.follow_toast);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, permissionStructV2.original_list);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, permissionStructV2.shop_toast);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, permissionStructV2.share_toast);
            protoWriter.writeBytes(permissionStructV2.unknownFields());
        }
    }

    public PermissionStructV2() {
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.follow_toast = this.follow_toast;
        builder.original_list = this.original_list;
        builder.shop_toast = this.shop_toast;
        builder.share_toast = this.share_toast;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4 = this.hashCode;
        if (i4 != 0) {
            return i4;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i5 = 0;
        if (this.follow_toast != null) {
            i = this.follow_toast.hashCode();
        } else {
            i = 0;
        }
        int i6 = (hashCode + i) * 37;
        if (this.original_list != null) {
            i2 = this.original_list.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (i6 + i2) * 37;
        if (this.shop_toast != null) {
            i3 = this.shop_toast.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 37;
        if (this.share_toast != null) {
            i5 = this.share_toast.hashCode();
        }
        int i9 = i8 + i5;
        this.hashCode = i9;
        return i9;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.follow_toast != null) {
            sb.append(", follow_toast=");
            sb.append(this.follow_toast);
        }
        if (this.original_list != null) {
            sb.append(", original_list=");
            sb.append(this.original_list);
        }
        if (this.shop_toast != null) {
            sb.append(", shop_toast=");
            sb.append(this.shop_toast);
        }
        if (this.share_toast != null) {
            sb.append(", share_toast=");
            sb.append(this.share_toast);
        }
        StringBuilder replace = sb.replace(0, 2, "PermissionStructV2{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PermissionStructV2)) {
            return false;
        }
        PermissionStructV2 permissionStructV2 = (PermissionStructV2) obj;
        if (!unknownFields().equals(permissionStructV2.unknownFields()) || !Internal.equals(this.follow_toast, permissionStructV2.follow_toast) || !Internal.equals(this.original_list, permissionStructV2.original_list) || !Internal.equals(this.shop_toast, permissionStructV2.shop_toast) || !Internal.equals(this.share_toast, permissionStructV2.share_toast)) {
            return false;
        }
        return true;
    }

    public PermissionStructV2(Integer num, Integer num2, Integer num3, Integer num4) {
        this(num, num2, num3, num4, ByteString.EMPTY);
    }

    public PermissionStructV2(Integer num, Integer num2, Integer num3, Integer num4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.follow_toast = num;
        this.original_list = num2;
        this.shop_toast = num3;
        this.share_toast = num4;
    }
}
