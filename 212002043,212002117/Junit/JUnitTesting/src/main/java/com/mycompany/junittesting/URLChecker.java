package com.mycompany.junittesting;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class URLChecker {

    public static boolean isURLReachable(String urlStr) {
        try {
            URL url = new URL(urlStr);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("HEAD");
            conn.setConnectTimeout(5000);
            conn.setReadTimeout(5000);
            int responseCode = conn.getResponseCode();
            return (200 <= responseCode && responseCode < 400);
        } catch (IOException e) {
            return false;
        }
    }
}
