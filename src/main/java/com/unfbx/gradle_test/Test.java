package com.unfbx.gradle_test;

import org.jasypt.encryption.pbe.PooledPBEStringEncryptor;
import org.jasypt.encryption.pbe.StandardPBEByteEncryptor;
import org.jasypt.encryption.pbe.config.SimpleStringPBEConfig;

/**
 * 描述：
 *
 * @author
 * @date 2022-04-06
 */
public class Test {

    public static void main(String[] args) {
        // jasypt.encryptor.password=123
        String salt = "123";
        //待加密文本
        String password = "123456";
        PooledPBEStringEncryptor stringEncryptor = new PooledPBEStringEncryptor();
        stringEncryptor.setConfig(cryptOr(salt));
        String encryptStr = stringEncryptor.encrypt(password);
        System.out.println(encryptStr);
    }

    public static SimpleStringPBEConfig cryptOr(String password) {
        //jasypt 默认的加密方式
        SimpleStringPBEConfig config = new SimpleStringPBEConfig();
        config.setPassword(password);
        config.setAlgorithm(StandardPBEByteEncryptor.DEFAULT_ALGORITHM);
        config.setKeyObtentionIterations("1000");
        config.setPoolSize("1");
        config.setProviderName(null);
        config.setSaltGeneratorClassName("org.jasypt.salt.RandomSaltGenerator");
        config.setStringOutputType("base64");
        return config;
    }
}
