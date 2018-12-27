package wendu.jsbdemo;


import org.json.JSONException;
import org.xwalk.core.JavascriptInterface;

import wendu.dsbridge.CompletionHandler;

/**
 * Created by du on 16/12/31.
 */

public class JsEchoApi {

    @JavascriptInterface
    public Object syn(Object args) throws JSONException {
        return  args;
    }

    @JavascriptInterface
    public void asyn(Object args,CompletionHandler handler){
        handler.complete(args);
    }
}