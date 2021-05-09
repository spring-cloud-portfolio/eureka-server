package com.doroshenko.serhey.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SuppressWarnings("java:S1191")
@SpringBootApplication(proxyBeanMethods = false)
//@NativeHint(
//        options = {"--enable-url-protocols=http"},
//        proxies = {
//                @ProxyHint(types = UriInfo.class),
//                @ProxyHint(types = Request.class),
//                @ProxyHint(types = HttpHeaders.class),
//                @ProxyHint(types = com.sun.jersey.api.core.ExtendedUriInfo.class),
//                @ProxyHint(types = com.sun.jersey.api.core.HttpRequestContext.class),
//        },
//        types = {
//                @TypeHint(types = Thread.class, access = AccessBits.ALL, fields = {
//                        @FieldHint(name = "threadLocalRandomProbe", allowUnsafeAccess = true)
//                }),
//                @TypeHint(types = EurekaJacksonCodec.class, access = AccessBits.ALL, fields = {
//                        @FieldHint(name = "mapper", allowWrite = true),
//                        @FieldHint(name = "objectReaderByClass", allowWrite = true),
//                        @FieldHint(name = "objectWriterByClass", allowWrite = true),
//                }),
//                @TypeHint(typeNames = "com.github.benmanes.caffeine.cache.SI", access = AccessBits.ALL),
//                @TypeHint(typeNames = "com.github.benmanes.caffeine.cache.SIW", access = AccessBits.ALL),
//                @TypeHint(typeNames = "com.github.benmanes.caffeine.cache.PSW", access = AccessBits.ALL),
//                @TypeHint(typeNames = "com.github.benmanes.caffeine.cache.BLCHeader", access = AccessBits.ALL),
//                @TypeHint(typeNames = "com.github.benmanes.caffeine.cache.BoundedBuffer", access = AccessBits.ALL),
//                @TypeHint(typeNames = "com.github.benmanes.caffeine.cache.PD", access = AccessBits.ALL, fields = {
//                        @FieldHint(name = "key", allowUnsafeAccess = true),
//                        @FieldHint(name = "value", allowUnsafeAccess = true)
//                }),
//                @TypeHint(typeNames = "com.github.benmanes.caffeine.cache.PDW", access = AccessBits.ALL, fields = {
//                        @FieldHint(name = "writeTime", allowUnsafeAccess = true),
//                        @FieldHint(name = "nextInWriteOrder", allowUnsafeAccess = true),
//                        @FieldHint(name = "previousInWriteOrder", allowUnsafeAccess = true)
//                }),
//                @TypeHint(typeNames = "com.github.benmanes.caffeine.cache.StripedBuffer", access = AccessBits.ALL, fields = {
//                        @FieldHint(name = "tableBusy", allowUnsafeAccess = true)
//                }),
//                @TypeHint(typeNames = "com.github.benmanes.caffeine.cache.BLCHeader$DrainStatusRef", access = AccessBits.ALL, fields = {
//                        @FieldHint(name = "drainStatus", allowUnsafeAccess = true)
//                }),
//                @TypeHint(typeNames = "com.github.benmanes.caffeine.cache.BoundedLocalCache$BoundedLocalManualCache", access = AccessBits.ALL),
//                @TypeHint(typeNames = "org.springframework.boot.autoconfigure.freemarker.FreeMarkerTemplateAvailabilityProvider$FreeMarkerTemplateAvailabilityProperties", access = AccessBits.ALL),
//        }
//)
public class EurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);
    }

}
