package Api;

import com.squareup.okhttp.HttpUrl;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import org.json.JSONObject;

public class FetchData {

    private static HttpUrl getUrlComPais(String pais) throws Exception {
        return new HttpUrl.Builder()
                .scheme("https")
                .host("covid19.mathdro.id")
                .addPathSegment("api")
                .addPathSegment("countries")
                .addPathSegment(pais).build();
    }

    public static JSONObject getPais(String pais) throws Exception {
        return new JSONObject(new OkHttpClient().newCall(new Request.Builder()
                .url(getUrlComPais(pais)).get()
                .build()).execute().body().string());
    }

}
