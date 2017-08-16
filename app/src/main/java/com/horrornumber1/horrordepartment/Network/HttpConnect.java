package com.horrornumber1.horrordepartment.Network;

import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

/**
 * Created by KIMTAEHO on 2017-08-16.
 */

public class HttpConnect {
    Context ctx;
    String url;

    public HttpConnect(Context ctx){
        this.ctx = ctx;
    }
    public void connect(final String uid, final String board, final int no){
        url = "http://13.124.22.112:8080/horrormagazine/likeproc?uid="+uid+"&board="+board+"&no="+no;
        RequestQueue postReqeustQueue = Volley.newRequestQueue(ctx);
        StringRequest postStringRequest = new StringRequest(Request.Method.GET, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        }) {
//            @Override
//            protected Map<String, String> getParams() {
//                Map<String, String> params = new HashMap<String, String>();
//                params.put("uid",uid);
//                params.put("board", board);
//                params.put("no", String.valueOf(no));
//
//                return params;
//            }
        };
        postReqeustQueue.add(postStringRequest);
    }

}