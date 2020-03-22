/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.aws2.s3;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class AWS2S3EndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        AWS2S3Endpoint target = (AWS2S3Endpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesskey":
        case "accessKey": target.getConfiguration().setAccessKey(property(camelContext, java.lang.String.class, value)); return true;
        case "amazons3client":
        case "amazonS3Client": target.getConfiguration().setAmazonS3Client(property(camelContext, software.amazon.awssdk.services.s3.S3Client.class, value)); return true;
        case "autocreatebucket":
        case "autoCreateBucket": target.getConfiguration().setAutoCreateBucket(property(camelContext, boolean.class, value)); return true;
        case "autoclosebody":
        case "autocloseBody": target.getConfiguration().setAutocloseBody(property(camelContext, boolean.class, value)); return true;
        case "awskmskeyid":
        case "awsKMSKeyId": target.getConfiguration().setAwsKMSKeyId(property(camelContext, java.lang.String.class, value)); return true;
        case "backofferrorthreshold":
        case "backoffErrorThreshold": target.setBackoffErrorThreshold(property(camelContext, int.class, value)); return true;
        case "backoffidlethreshold":
        case "backoffIdleThreshold": target.setBackoffIdleThreshold(property(camelContext, int.class, value)); return true;
        case "backoffmultiplier":
        case "backoffMultiplier": target.setBackoffMultiplier(property(camelContext, int.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "delay": target.setDelay(property(camelContext, long.class, value)); return true;
        case "deleteafterread":
        case "deleteAfterRead": target.getConfiguration().setDeleteAfterRead(property(camelContext, boolean.class, value)); return true;
        case "deleteafterwrite":
        case "deleteAfterWrite": target.getConfiguration().setDeleteAfterWrite(property(camelContext, boolean.class, value)); return true;
        case "delimiter": target.getConfiguration().setDelimiter(property(camelContext, java.lang.String.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "filename":
        case "fileName": target.getConfiguration().setFileName(property(camelContext, java.lang.String.class, value)); return true;
        case "greedy": target.setGreedy(property(camelContext, boolean.class, value)); return true;
        case "includebody":
        case "includeBody": target.getConfiguration().setIncludeBody(property(camelContext, boolean.class, value)); return true;
        case "initialdelay":
        case "initialDelay": target.setInitialDelay(property(camelContext, long.class, value)); return true;
        case "keyname":
        case "keyName": target.getConfiguration().setKeyName(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "maxconnections":
        case "maxConnections": target.setMaxConnections(property(camelContext, int.class, value)); return true;
        case "maxmessagesperpoll":
        case "maxMessagesPerPoll": target.setMaxMessagesPerPoll(property(camelContext, int.class, value)); return true;
        case "multipartupload":
        case "multiPartUpload": target.getConfiguration().setMultiPartUpload(property(camelContext, boolean.class, value)); return true;
        case "operation": target.getConfiguration().setOperation(property(camelContext, org.apache.camel.component.aws2.s3.AWS2S3Operations.class, value)); return true;
        case "overrideendpoint":
        case "overrideEndpoint": target.getConfiguration().setOverrideEndpoint(property(camelContext, boolean.class, value)); return true;
        case "partsize":
        case "partSize": target.getConfiguration().setPartSize(property(camelContext, long.class, value)); return true;
        case "policy": target.getConfiguration().setPolicy(property(camelContext, java.lang.String.class, value)); return true;
        case "pollstrategy":
        case "pollStrategy": target.setPollStrategy(property(camelContext, org.apache.camel.spi.PollingConsumerPollStrategy.class, value)); return true;
        case "prefix": target.getConfiguration().setPrefix(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyhost":
        case "proxyHost": target.getConfiguration().setProxyHost(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyport":
        case "proxyPort": target.getConfiguration().setProxyPort(property(camelContext, java.lang.Integer.class, value)); return true;
        case "proxyprotocol":
        case "proxyProtocol": target.getConfiguration().setProxyProtocol(property(camelContext, software.amazon.awssdk.core.Protocol.class, value)); return true;
        case "region": target.getConfiguration().setRegion(property(camelContext, java.lang.String.class, value)); return true;
        case "repeatcount":
        case "repeatCount": target.setRepeatCount(property(camelContext, long.class, value)); return true;
        case "runlogginglevel":
        case "runLoggingLevel": target.setRunLoggingLevel(property(camelContext, org.apache.camel.LoggingLevel.class, value)); return true;
        case "scheduledexecutorservice":
        case "scheduledExecutorService": target.setScheduledExecutorService(property(camelContext, java.util.concurrent.ScheduledExecutorService.class, value)); return true;
        case "scheduler": target.setScheduler(property(camelContext, java.lang.String.class, value)); return true;
        case "schedulerproperties":
        case "schedulerProperties": target.setSchedulerProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "secretkey":
        case "secretKey": target.getConfiguration().setSecretKey(property(camelContext, java.lang.String.class, value)); return true;
        case "sendemptymessagewhenidle":
        case "sendEmptyMessageWhenIdle": target.setSendEmptyMessageWhenIdle(property(camelContext, boolean.class, value)); return true;
        case "startscheduler":
        case "startScheduler": target.setStartScheduler(property(camelContext, boolean.class, value)); return true;
        case "storageclass":
        case "storageClass": target.getConfiguration().setStorageClass(property(camelContext, java.lang.String.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "timeunit":
        case "timeUnit": target.setTimeUnit(property(camelContext, java.util.concurrent.TimeUnit.class, value)); return true;
        case "uriendpointoverride":
        case "uriEndpointOverride": target.getConfiguration().setUriEndpointOverride(property(camelContext, java.lang.String.class, value)); return true;
        case "useawskms":
        case "useAwsKMS": target.getConfiguration().setUseAwsKMS(property(camelContext, boolean.class, value)); return true;
        case "usefixeddelay":
        case "useFixedDelay": target.setUseFixedDelay(property(camelContext, boolean.class, value)); return true;
        case "useiamcredentials":
        case "useIAMCredentials": target.getConfiguration().setUseIAMCredentials(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        Map<String, Object> answer = new CaseInsensitiveMap();
        answer.put("accessKey", java.lang.String.class);
        answer.put("amazonS3Client", software.amazon.awssdk.services.s3.S3Client.class);
        answer.put("autoCreateBucket", boolean.class);
        answer.put("autocloseBody", boolean.class);
        answer.put("awsKMSKeyId", java.lang.String.class);
        answer.put("backoffErrorThreshold", int.class);
        answer.put("backoffIdleThreshold", int.class);
        answer.put("backoffMultiplier", int.class);
        answer.put("basicPropertyBinding", boolean.class);
        answer.put("bridgeErrorHandler", boolean.class);
        answer.put("delay", long.class);
        answer.put("deleteAfterRead", boolean.class);
        answer.put("deleteAfterWrite", boolean.class);
        answer.put("delimiter", java.lang.String.class);
        answer.put("exceptionHandler", org.apache.camel.spi.ExceptionHandler.class);
        answer.put("exchangePattern", org.apache.camel.ExchangePattern.class);
        answer.put("fileName", java.lang.String.class);
        answer.put("greedy", boolean.class);
        answer.put("includeBody", boolean.class);
        answer.put("initialDelay", long.class);
        answer.put("keyName", java.lang.String.class);
        answer.put("lazyStartProducer", boolean.class);
        answer.put("maxConnections", int.class);
        answer.put("maxMessagesPerPoll", int.class);
        answer.put("multiPartUpload", boolean.class);
        answer.put("operation", org.apache.camel.component.aws2.s3.AWS2S3Operations.class);
        answer.put("overrideEndpoint", boolean.class);
        answer.put("partSize", long.class);
        answer.put("policy", java.lang.String.class);
        answer.put("pollStrategy", org.apache.camel.spi.PollingConsumerPollStrategy.class);
        answer.put("prefix", java.lang.String.class);
        answer.put("proxyHost", java.lang.String.class);
        answer.put("proxyPort", java.lang.Integer.class);
        answer.put("proxyProtocol", software.amazon.awssdk.core.Protocol.class);
        answer.put("region", java.lang.String.class);
        answer.put("repeatCount", long.class);
        answer.put("runLoggingLevel", org.apache.camel.LoggingLevel.class);
        answer.put("scheduledExecutorService", java.util.concurrent.ScheduledExecutorService.class);
        answer.put("scheduler", java.lang.String.class);
        answer.put("schedulerProperties", java.util.Map.class);
        answer.put("secretKey", java.lang.String.class);
        answer.put("sendEmptyMessageWhenIdle", boolean.class);
        answer.put("startScheduler", boolean.class);
        answer.put("storageClass", java.lang.String.class);
        answer.put("synchronous", boolean.class);
        answer.put("timeUnit", java.util.concurrent.TimeUnit.class);
        answer.put("uriEndpointOverride", java.lang.String.class);
        answer.put("useAwsKMS", boolean.class);
        answer.put("useFixedDelay", boolean.class);
        answer.put("useIAMCredentials", boolean.class);
        return answer;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        AWS2S3Endpoint target = (AWS2S3Endpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesskey":
        case "accessKey": target.getConfiguration().getAccessKey(); return true;
        case "amazons3client":
        case "amazonS3Client": target.getConfiguration().getAmazonS3Client(); return true;
        case "autocreatebucket":
        case "autoCreateBucket": target.getConfiguration().isAutoCreateBucket(); return true;
        case "autoclosebody":
        case "autocloseBody": target.getConfiguration().isAutocloseBody(); return true;
        case "awskmskeyid":
        case "awsKMSKeyId": target.getConfiguration().getAwsKMSKeyId(); return true;
        case "backofferrorthreshold":
        case "backoffErrorThreshold": target.getBackoffErrorThreshold(); return true;
        case "backoffidlethreshold":
        case "backoffIdleThreshold": target.getBackoffIdleThreshold(); return true;
        case "backoffmultiplier":
        case "backoffMultiplier": target.getBackoffMultiplier(); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.isBasicPropertyBinding(); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.isBridgeErrorHandler(); return true;
        case "delay": target.getDelay(); return true;
        case "deleteafterread":
        case "deleteAfterRead": target.getConfiguration().isDeleteAfterRead(); return true;
        case "deleteafterwrite":
        case "deleteAfterWrite": target.getConfiguration().isDeleteAfterWrite(); return true;
        case "delimiter": target.getConfiguration().getDelimiter(); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.getExceptionHandler(); return true;
        case "exchangepattern":
        case "exchangePattern": target.getExchangePattern(); return true;
        case "filename":
        case "fileName": target.getConfiguration().getFileName(); return true;
        case "greedy": target.isGreedy(); return true;
        case "includebody":
        case "includeBody": target.getConfiguration().isIncludeBody(); return true;
        case "initialdelay":
        case "initialDelay": target.getInitialDelay(); return true;
        case "keyname":
        case "keyName": target.getConfiguration().getKeyName(); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.isLazyStartProducer(); return true;
        case "maxconnections":
        case "maxConnections": target.getMaxConnections(); return true;
        case "maxmessagesperpoll":
        case "maxMessagesPerPoll": target.getMaxMessagesPerPoll(); return true;
        case "multipartupload":
        case "multiPartUpload": target.getConfiguration().isMultiPartUpload(); return true;
        case "operation": target.getConfiguration().getOperation(); return true;
        case "overrideendpoint":
        case "overrideEndpoint": target.getConfiguration().isOverrideEndpoint(); return true;
        case "partsize":
        case "partSize": target.getConfiguration().getPartSize(); return true;
        case "policy": target.getConfiguration().getPolicy(); return true;
        case "pollstrategy":
        case "pollStrategy": target.getPollStrategy(); return true;
        case "prefix": target.getConfiguration().getPrefix(); return true;
        case "proxyhost":
        case "proxyHost": target.getConfiguration().getProxyHost(); return true;
        case "proxyport":
        case "proxyPort": target.getConfiguration().getProxyPort(); return true;
        case "proxyprotocol":
        case "proxyProtocol": target.getConfiguration().getProxyProtocol(); return true;
        case "region": target.getConfiguration().getRegion(); return true;
        case "repeatcount":
        case "repeatCount": target.getRepeatCount(); return true;
        case "runlogginglevel":
        case "runLoggingLevel": target.getRunLoggingLevel(); return true;
        case "scheduledexecutorservice":
        case "scheduledExecutorService": target.getScheduledExecutorService(); return true;
        case "scheduler": target.getScheduler(); return true;
        case "schedulerproperties":
        case "schedulerProperties": target.getSchedulerProperties(); return true;
        case "secretkey":
        case "secretKey": target.getConfiguration().getSecretKey(); return true;
        case "sendemptymessagewhenidle":
        case "sendEmptyMessageWhenIdle": target.isSendEmptyMessageWhenIdle(); return true;
        case "startscheduler":
        case "startScheduler": target.isStartScheduler(); return true;
        case "storageclass":
        case "storageClass": target.getConfiguration().getStorageClass(); return true;
        case "synchronous": target.isSynchronous(); return true;
        case "timeunit":
        case "timeUnit": target.getTimeUnit(); return true;
        case "uriendpointoverride":
        case "uriEndpointOverride": target.getConfiguration().getUriEndpointOverride(); return true;
        case "useawskms":
        case "useAwsKMS": target.getConfiguration().isUseAwsKMS(); return true;
        case "usefixeddelay":
        case "useFixedDelay": target.isUseFixedDelay(); return true;
        case "useiamcredentials":
        case "useIAMCredentials": target.getConfiguration().isUseIAMCredentials(); return true;
        default: return null;
        }
    }
}
